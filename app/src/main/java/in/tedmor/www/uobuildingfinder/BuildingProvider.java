package in.tedmor.www.uobuildingfinder;

import android.app.SearchManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

import java.util.List;

public class BuildingProvider extends ContentProvider {
    //SQLiteDatabase db;
    public BuildingProvider() {
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        // Implement this to handle requests to delete one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public String getType(Uri uri) {
        // TODO: Implement this to handle requests for the MIME type of the data
        // at the given URI.
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        // TODO: Implement this to handle requests to insert a new row.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean onCreate() {
        // TODO: Implement this to initialize your content provider on startup.
        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        // TODO: Implement this to handle query requests from clients.
        //if (db == null) {
        //    db = Building.getDb();
        //}
        String query = uri.getLastPathSegment();
        if (SearchManager.SUGGEST_URI_PATH_QUERY.equals(query)) {
            return null;
        } else {
            query = query.toLowerCase();
            List<Building> buildings = Building.search(query, getContext().getResources());
            String[] cols = {"_ID", SearchManager.SUGGEST_COLUMN_TEXT_1,
                    SearchManager.SUGGEST_COLUMN_TEXT_2, SearchManager.SUGGEST_COLUMN_INTENT_DATA};
            MatrixCursor results = new MatrixCursor(cols, buildings.size());
            int id = 0;
            for (Building b: buildings) {
                results.addRow(b.toRows(id, getContext().getResources()));
                id += 1;
            }
            if (results.getCount() == 0) {
                Object[] noResults = {null,
                        getContext().getResources().getString(R.string.no_results),
                        getContext().getResources().getString(R.string.try_again),
                        null};
                results.addRow(noResults);
            }
            results.moveToFirst();
            return results;
        }
    }


    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        // TODO: Implement this to handle requests to update one or more rows.
        return 0;
    }
}
