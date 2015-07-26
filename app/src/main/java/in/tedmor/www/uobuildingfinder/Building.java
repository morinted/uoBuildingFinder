package in.tedmor.www.uobuildingfinder;

import android.graphics.Color;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.PolyUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ted on 2015-07-21.
 */
public class Building {
    static List<Building> buildings = new ArrayList<Building>();
    int name;
    int code;
    int URL;
    List<Integer> addresses;
    LatLng center;
    PolygonOptions path;



    public Building(int name, int code, List<Integer> addresses, int URL, LatLng center, PolygonOptions path) {
        this.name = name;
        this.code = code;
        this.addresses = addresses;
        this.URL = URL;
        this.center = center;
        this.path = path;
    }

    public static void attachBuildingsToMap(GoogleMap map) {
         for (Building b: buildings) {
             b.attachToMap(map);
         }
    }

    public void attachToMap(GoogleMap map) {
        map.addPolygon(this.path.strokeColor(Color.BLUE).fillColor(Color.WHITE));
    }

    public static List<Building> getBuildings() {
        return buildings;
    }

    public int getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public List<Integer> getAddresses() {
        return addresses;
    }

    public PolygonOptions getPath() {
        return path;
    }

    public int getURL() {
        return URL;
    }

    public LatLng getCenter() {
        return center;
    }

        public boolean containsPoint(LatLng point) {
                return PolyUtil.containsLocation(point, this.path.getPoints(), false);
        }

        public static void setupBuildings() {
        buildings.add(new Building(
                R.string.name_3,
                R.string.code_3,
                Arrays.asList(R.string.address_30),
                R.string.code_3,
                new LatLng(45.423927677869386, -75.68523220717907),
                new PolygonOptions().add(
                        new LatLng(45.42380201928474, -75.68525165319443),
                        new LatLng(45.42395450382323, -75.68538509309292),
                        new LatLng(45.423958739498964, -75.68537570536137),
                        new LatLng(45.42399450741482, -75.68536698818207),
                        new LatLng(45.42403874664772, -75.68521074950695),
                        new LatLng(45.42392861913121, -75.68511888384819),
                        new LatLng(45.423835434141665, -75.68516246974468))
        ));

        buildings.add(new Building(
                R.string.name_55,
                R.string.code_55,
                Arrays.asList(R.string.address_550),
                R.string.code_55,
                new LatLng(45.40323919064406, -75.64226791262632),
                new PolygonOptions().add(
                        new LatLng(45.40330397174287, -75.64248801965425),
                        new LatLng(45.4033576432342, -75.6420903821678),
                        new LatLng(45.40335105200117, -75.64206892449567),
                        new LatLng(45.40333975274277, -75.64205417234609),
                        new LatLng(45.40332562866655, -75.64204746682356),
                        new LatLng(45.403170734399275, -75.64202600915144),
                        new LatLng(45.403161318320706, -75.64215140242288),
                        new LatLng(45.40313259927135, -75.64217554230402),
                        new LatLng(45.40296593433617, -75.64214737910936),
                        new LatLng(45.40292968229364, -75.64240017730901))
        ));

        buildings.add(new Building(
                R.string.name_56,
                R.string.code_56,
                Arrays.asList(R.string.address_560),
                R.string.code_56,
                new LatLng(45.40267610706849, -75.64203992486006),
                new PolygonOptions().add(
                        new LatLng(45.402783732276674, -75.64226405520151),
                        new LatLng(45.40283128377522, -75.64191134471605),
                        new LatLng(45.402771962097574, -75.64189525146196),
                        new LatLng(45.402783261469544, -75.64182014960954),
                        new LatLng(45.4025610400726, -75.64176650542925),
                        new LatLng(45.402498422444864, -75.64219431776712),
                        new LatLng(45.40254173690151, -75.64220236439417),
                        new LatLng(45.40253702881, -75.64224863249967),
                        new LatLng(45.40271405278074, -75.64228216011236),
                        new LatLng(45.40271970247279, -75.64224595029066))
        ));

        buildings.add(new Building(
                R.string.name_164,
                R.string.code_164,
                Arrays.asList(R.string.address_1640),
                R.string.code_164,
                new LatLng(45.42408533899394, -75.68093463778496),
                new PolygonOptions().add(
                        new LatLng(45.42403733475789, -75.6809614598751),
                        new LatLng(45.42408816277128, -75.68100973963737),
                        new LatLng(45.424127695638944, -75.68091318011284),
                        new LatLng(45.42407545577225, -75.68086691200733))
        ));

        buildings.add(new Building(
                R.string.name_226,
                R.string.code_226,
                Arrays.asList(R.string.address_2260),
                R.string.code_226,
                new LatLng(45.42417946482856, -75.68159714341164),
                new PolygonOptions().add(
                        new LatLng(45.42417899419977, -75.68165615200996),
                        new LatLng(45.42421052631954, -75.68157836794853),
                        new LatLng(45.42417758231343, -75.68154484033585),
                        new LatLng(45.42414557954617, -75.68162597715855))
        ));

        buildings.add(new Building(
                R.string.name_227,
                R.string.code_227,
                Arrays.asList(R.string.address_2270),
                R.string.code_227,
                new LatLng(45.42332385522162, -75.68094536662102),
                new PolygonOptions().add(
                        new LatLng(45.42333708234605, -75.68103449409386),
                        new LatLng(45.42337755701061, -75.68092519407651),
                        new LatLng(45.42331684500288, -75.6808702087917),
                        new LatLng(45.42325377974742, -75.68101169531724),
                        new LatLng(45.42328437111148, -75.6810398585119),
                        new LatLng(45.42329943146923, -75.68100230758569))
        ));

        buildings.add(new Building(
                R.string.name_240,
                R.string.code_240,
                Arrays.asList(R.string.address_2400),
                R.string.code_240,
                new LatLng(45.42578805108272, -75.6873893737793),
                new PolygonOptions().add(
                        new LatLng(45.42582951453835, -75.68765485649487),
                        new LatLng(45.42596363966106, -75.68732829754731),
                        new LatLng(45.42588034093815, -75.68726057176968),
                        new LatLng(45.425887400156725, -75.68723978464982),
                        new LatLng(45.42573445022332, -75.68712512021443),
                        new LatLng(45.425600795172976, -75.6874704546251))
        ));

        buildings.add(new Building(
                R.string.name_242,
                R.string.code_242,
                Arrays.asList(R.string.address_2420,
                        R.string.address_2421),
                R.string.code_242,
                new LatLng(45.42575793169099, -75.68640232086182),
                new PolygonOptions().add(
                        new LatLng(45.425771788519036, -75.68648990825136),
                        new LatLng(45.42581979128023, -75.68637859657724),
                        new LatLng(45.42573884542399, -75.68631221190412),
                        new LatLng(45.425692725058674, -75.68642620578726))
        ));

        buildings.add(new Building(
                R.string.name_243,
                R.string.code_243,
                Arrays.asList(R.string.address_2430),
                R.string.code_243,
                new LatLng(45.42580546384874, -75.68628363311291),
                new PolygonOptions().add(
                        new LatLng(45.42583443133679, -75.68636608305167),
                        new LatLng(45.42587160990826, -75.6862815934677),
                        new LatLng(45.42574595565049, -75.68618369283865),
                        new LatLng(45.4257200717799, -75.68624136033247),
                        new LatLng(45.42574783811336, -75.68626550021361),
                        new LatLng(45.42573701395109, -75.68628695788573))
        ));

        buildings.add(new Building(
                R.string.name_244,
                R.string.code_244,
                Arrays.asList(R.string.address_2440),
                R.string.code_244,
                new LatLng(45.42583652444507, -75.6862011551857),
                new PolygonOptions().add(
                        new LatLng(45.425872340489356, -75.68627754216573),
                        new LatLng(45.425906224735265, -75.68620512252232),
                        new LatLng(45.4257979833229, -75.68612130349061),
                        new LatLng(45.42576362839645, -75.68619037037274))
        ));

        buildings.add(new Building(
                R.string.name_275,
                R.string.code_275,
                Arrays.asList(R.string.address_2750,
                        R.string.address_2751),
                R.string.code_275,
                new LatLng(45.42469433036674, -75.683284252882),
                new PolygonOptions().add(
                        new LatLng(45.424694119714104, -75.68340291264246),
                        new LatLng(45.42476330147178, -75.68323996844481),
                        new LatLng(45.424676235980634, -75.68316821935366),
                        new LatLng(45.42460940724232, -75.68333518686484),
                        new LatLng(45.424639056621906, -75.68335798564146),
                        new LatLng(45.42462587912179, -75.68338748994063),
                        new LatLng(45.424645645370795, -75.68340626540373),
                        new LatLng(45.424659293491075, -75.68337474944781))
        ));

        buildings.add(new Building(
                R.string.name_STT,
                R.string.code_STT,
                Arrays.asList(R.string.address_STT0,
                        R.string.address_STT1),
                R.string.code_STT,
                new LatLng(45.425650160610786, -75.68649083375931),
                new PolygonOptions().add(
                        new LatLng(45.42572786160147, -75.68662757044217),
                        new LatLng(45.42577209947615, -75.68652028208157),
                        new LatLng(45.42555043913887, -75.68633386855504),
                        new LatLng(45.425505730472764, -75.6864431685724))
        ));

        buildings.add(new Building(
                R.string.name_LRR,
                R.string.code_LRR,
                Arrays.asList(R.string.address_LRR0),
                R.string.code_LRR,
                new LatLng(45.42414087325534, -75.68505719304085),
                new PolygonOptions().add(
                        new LatLng(45.42399450741482, -75.68536698818207),
                        new LatLng(45.424108870467315, -75.68546488881111),
                        new LatLng(45.424283003065355, -75.6850478053093),
                        new LatLng(45.42429712190111, -75.68503975868225),
                        new LatLng(45.42436395100913, -75.68488150835037),
                        new LatLng(45.42430371068992, -75.68482384085655),
                        new LatLng(45.42427453176221, -75.68481378257275),
                        new LatLng(45.424144167658994, -75.68469308316708),
                        new LatLng(45.42406651380822, -75.68487279117107),
                        new LatLng(45.4240208627067, -75.68487413227558),
                        new LatLng(45.42400109623892, -75.68491838872433),
                        new LatLng(45.42405851310239, -75.68496733903885),
                        new LatLng(45.424047217986335, -75.68499282002449),
                        new LatLng(45.424020392076635, -75.68496733903885),
                        new LatLng(45.42396485769672, -75.68508334457874),
                        new LatLng(45.42404768861621, -75.68516179919243),
                        new LatLng(45.42410181102639, -75.68518996238708),
                        new LatLng(45.42408628025312, -75.68522214889526),
                        new LatLng(45.42403827601783, -75.68520940840244),
                        new LatLng(45.42392861913121, -75.68511888384819),
                        new LatLng(45.42403874664772, -75.68521074950695))
        ));

        buildings.add(new Building(
                R.string.name_MCE,
                R.string.code_MCE,
                Arrays.asList(R.string.address_MCE0),
                R.string.code_MCE,
                new LatLng(45.421772617939595, -75.68036064505577),
                new PolygonOptions().add(
                        new LatLng(45.421662956652256, -75.68037539720535),
                        new LatLng(45.42162812855931, -75.68046659231186),
                        new LatLng(45.42178203091575, -75.68059667944908),
                        new LatLng(45.42192040148356, -75.68026877939701),
                        new LatLng(45.421765087557624, -75.68013601005077),
                        new LatLng(45.4217349660195, -75.68020910024643))
        ));

        buildings.add(new Building(
                R.string.name_LPR,
                R.string.code_LPR,
                Arrays.asList(R.string.address_LPR0,
                        R.string.address_LPR1,
                        R.string.address_LPR2),
                R.string.code_LPR,
                new LatLng(45.421373506308335, -75.68018898367882),
                new PolygonOptions().add(
                        new LatLng(45.421662956652256, -75.68037539720535),
                        new LatLng(45.4216300111595, -75.6803646683693),
                        new LatLng(45.42157165052514, -75.68031504750252),
                        new LatLng(45.4214817562042, -75.68052627146244),
                        new LatLng(45.42145445842395, -75.68050548434258),
                        new LatLng(45.4214412801805, -75.68053565919399),
                        new LatLng(45.42140456934321, -75.6805095076561),
                        new LatLng(45.42141821824703, -75.68047262728214),
                        new LatLng(45.42111794160053, -75.68023256957531),
                        new LatLng(45.421106645896124, -75.68016685545444),
                        new LatLng(45.421095820843966, -75.68016149103642),
                        new LatLng(45.4210878197171, -75.68014539778233),
                        new LatLng(45.42087931936488, -75.67996703088284),
                        new LatLng(45.42091744251163, -75.67988522350788),
                        new LatLng(45.42089390970802, -75.67985840141773),
                        new LatLng(45.42092826759798, -75.67977860569954),
                        new LatLng(45.420955565632624, -75.67980609834194),
                        new LatLng(45.420968273333926, -75.6797792762518),
                        new LatLng(45.42099557134923, -75.67977659404278),
                        new LatLng(45.421185245125656, -75.67993618547916),
                        new LatLng(45.42122101479868, -75.67986644804478),
                        new LatLng(45.42140362803935, -75.68002335727215),
                        new LatLng(45.42144316278687, -75.67994356155396),
                        new LatLng(45.421638482859485, -75.68011321127415),
                        new LatLng(45.42162295140856, -75.68014942109585),
                        new LatLng(45.42168319458828, -75.68020440638065),
                        new LatLng(45.4217349660195, -75.68020910024643))
        ));

        buildings.add(new Building(
                R.string.name_LR3,
                R.string.code_LR3,
                Arrays.asList(R.string.address_LR30),
                R.string.code_LR3,
                new LatLng(45.42527131304096, -75.6824091821909),
                new PolygonOptions().add(
                        new LatLng(45.42525944222252, -75.68257479460334),
                        new LatLng(45.42537097899955, -75.68232803137397),
                        new LatLng(45.425276384531955, -75.68224085958099),
                        new LatLng(45.425157317638465, -75.6825057277212),
                        new LatLng(45.42520955650408, -75.68255266637897),
                        new LatLng(45.42521849828704, -75.68253389091586))
        ));

        buildings.add(new Building(
                R.string.name_JLR,
                R.string.code_JLR,
                Arrays.asList(R.string.address_JLR0),
                R.string.code_JLR,
                new LatLng(45.425682633141314, -75.6841841340065),
                new PolygonOptions().add(
                        new LatLng(45.42574454380331, -75.68445232691954),
                        new LatLng(45.42587208052293, -75.68415259006213),
                        new LatLng(45.425805253200245, -75.68409693422507),
                        new LatLng(45.42578548735726, -75.68414186122607),
                        new LatLng(45.42558829916369, -75.68397087040137),
                        new LatLng(45.42550029370943, -75.68417941215228),
                        new LatLng(45.425699364674855, -75.68435107352923),
                        new LatLng(45.42568101064361, -75.68439398887347))
        ));

        buildings.add(new Building(
                R.string.name_GSD,
                R.string.code_GSD,
                Arrays.asList(R.string.address_GSD0),
                R.string.code_GSD,
                new LatLng(45.42401662703562, -75.68399772047997),
                new PolygonOptions().add(
                        new LatLng(45.424011920734024, -75.68416133522987),
                        new LatLng(45.42411075298476, -75.68391993641853),
                        new LatLng(45.42398697732912, -75.68380661308765),
                        new LatLng(45.42388673296803, -75.68405203521252))
        ));

        buildings.add(new Building(
                R.string.name_ART,
                R.string.code_ART,
                Arrays.asList(R.string.address_ART0),
                R.string.code_ART,
                new LatLng(45.423783194004464, -75.68589940667152),
                new PolygonOptions().add(
                        new LatLng(45.42356696280767, -75.68612200203131),
                        new LatLng(45.4235791992874, -75.68613206031512),
                        new LatLng(45.42355519695927, -75.68619643333147),
                        new LatLng(45.42366720773655, -75.68628561678122),
                        new LatLng(45.423675208497855, -75.68631176831911),
                        new LatLng(45.42370862342987, -75.68631847384165),
                        new LatLng(45.423739685179896, -75.6863003689308),
                        new LatLng(45.423742979606935, -75.68626818242262),
                        new LatLng(45.42373733201761, -75.68623532536219),
                        new LatLng(45.42388416915621, -75.68589334371279),
                        new LatLng(45.423892640517934, -75.68589937868308),
                        new LatLng(45.4239128776547, -75.68587456824969),
                        new LatLng(45.42392181964304, -75.68584238174151),
                        new LatLng(45.42391099513066, -75.6858309823532),
                        new LatLng(45.42398441352185, -75.6856599915285),
                        new LatLng(45.42399523802016, -75.6856512743492),
                        new LatLng(45.42400135621392, -75.68562914612482),
                        new LatLng(45.42399570865047, -75.68560902955721),
                        new LatLng(45.42398064847847, -75.68560031237791),
                        new LatLng(45.4239707652384, -75.68560567679594),
                        new LatLng(45.423875227161886, -75.68552118721198),
                        new LatLng(45.42387475653058, -75.6855077761669),
                        new LatLng(45.423856401906065, -75.68549436512183),
                        new LatLng(45.423761804900565, -75.68569687190245),
                        new LatLng(45.42376227553284, -75.68574649276923),
                        new LatLng(45.42372321304186, -75.68579209032248),
                        new LatLng(45.42367662039679, -75.68579745474051),
                        new LatLng(45.4236549712759, -75.68577934982966),
                        new LatLng(45.4236559125422, -75.68584573450278),
                        new LatLng(45.42368320925804, -75.6858846265335),
                        new LatLng(45.42361214364271, -75.68604555907439),
                        new LatLng(45.42359425956651, -75.6860482412834))
        ));

        buildings.add(new Building(
                R.string.name_BSC,
                R.string.code_BSC,
                Arrays.asList(R.string.address_BSC0),
                R.string.code_BSC,
                new LatLng(45.421397980215986, -75.68111971020699),
                new PolygonOptions().add(
                        new LatLng(45.421369741090835, -75.68147242069244),
                        new LatLng(45.42139609760807, -75.68140804767609),
                        new LatLng(45.42140974651394, -75.68141877651215),
                        new LatLng(45.42152788000974, -75.68113178014755),
                        new LatLng(45.42145963559013, -75.68107143044472),
                        new LatLng(45.42146857796704, -75.6810499727726),
                        new LatLng(45.42140409869124, -75.68098694086075),
                        new LatLng(45.42142668997873, -75.68093329668045),
                        new LatLng(45.42124078223978, -75.6807790696621),
                        new LatLng(45.421245018119144, -75.68076968193054),
                        new LatLng(45.421194187546, -75.68073078989983),
                        new LatLng(45.42111229374857, -75.68093530833721),
                        new LatLng(45.42132832368175, -75.68112440407276),
                        new LatLng(45.42122995721335, -75.68136312067509))
        ));

        buildings.add(new Building(
                R.string.name_BRS1,
                R.string.code_BRS1,
                Arrays.asList(R.string.address_BRS10),
                R.string.code_BRS1,
                new LatLng(45.42338409658639, -75.68186268210411),
                new PolygonOptions().add(
                        new LatLng(45.42340035816591, -75.68212349894236),
                        new LatLng(45.42354719618097, -75.68177615287493),
                        new LatLng(45.42349166133557, -75.68172988476942),
                        new LatLng(45.423524605741974, -75.68165411236475),
                        new LatLng(45.423490720066546, -75.68161924364756),
                        new LatLng(45.42351848749651, -75.68155420007895),
                        new LatLng(45.42346295262286, -75.6815086025257),
                        new LatLng(45.42343659707051, -75.68157163443755),
                        new LatLng(45.423383415293436, -75.68153006019782),
                        new LatLng(45.42340412324799, -75.68147507491301),
                        new LatLng(45.42335047080465, -75.68143350067328),
                        new LatLng(45.42329587703803, -75.68156023504923),
                        new LatLng(45.42336694305146, -75.68162326696108),
                        new LatLng(45.42321210374178, -75.68200078787993),
                        new LatLng(45.42314103753345, -75.68194312038611),
                        new LatLng(45.423089267391575, -75.6820678431053),
                        new LatLng(45.4231386843462, -75.68210539403151),
                        new LatLng(45.423167863860996, -75.6820490676422),
                        new LatLng(45.42323139984913, -75.6821027118225),
                        new LatLng(45.423204573551736, -75.68216239097308),
                        new LatLng(45.423246460221, -75.68219725969027),
                        new LatLng(45.42327328649848, -75.68213556888293),
                        new LatLng(45.423311878664755, -75.68216708483885),
                        new LatLng(45.42333117473801, -75.68212953391264),
                        new LatLng(45.423324585835694, -75.68211880507658),
                        new LatLng(45.423344823176066, -75.68207521918009))
        ));

        buildings.add(new Building(
                R.string.name_BRS2,
                R.string.code_BRS2,
                Arrays.asList(R.string.address_BRS20),
                R.string.code_BRS2,
                new LatLng(45.42311300993867, -75.68163737654686),
                new PolygonOptions().add(
                        new LatLng(45.423061499750474, -75.68203967991064),
                        new LatLng(45.42310856354091, -75.6819230038185),
                        new LatLng(45.4230247899667, -75.68186131301115),
                        new LatLng(45.42306667676935, -75.68176609459113),
                        new LatLng(45.42309020866729, -75.68178554060648),
                        new LatLng(45.423182924249836, -75.68156157615374),
                        new LatLng(45.423161274939616, -75.68154280069064),
                        new LatLng(45.42320598546245, -75.68144825282286),
                        new LatLng(45.423253049132434, -75.68148379209231),
                        new LatLng(45.423248813403745, -75.6814998853464),
                        new LatLng(45.423279404770504, -75.68152603688429),
                        new LatLng(45.423322703292015, -75.68142478349398),
                        new LatLng(45.42329870085483, -75.68140533747862),
                        new LatLng(45.42329305322108, -75.68142411294173),
                        new LatLng(45.42322810539225, -75.6813664454479),
                        new LatLng(45.42324363640159, -75.6813288945217),
                        new LatLng(45.42318245361273, -75.68128128531168),
                        new LatLng(45.42309962142376, -75.68148043933104),
                        new LatLng(45.423133977971425, -75.68151128473471),
                        new LatLng(45.4231005626993, -75.68158772769164),
                        new LatLng(45.4230337320957, -75.68154011848162),
                        new LatLng(45.423043615499815, -75.68152335467528),
                        new LatLng(45.42299890484839, -75.68148714485358),
                        new LatLng(45.42295325288356, -75.68160918536375),
                        new LatLng(45.42299796357114, -75.68164673628996),
                        new LatLng(45.42301161208978, -75.68162192585658),
                        new LatLng(45.42306526485515, -75.68166819396208),
                        new LatLng(45.423039850393685, -75.68173793139647),
                        new LatLng(45.42300690570442, -75.6817158031721),
                        new LatLng(45.42297349035708, -75.68180498662184),
                        new LatLng(45.42294478138087, -75.68178487005423),
                        new LatLng(45.42293583923777, -75.68180163386057),
                        new LatLng(45.42291324855415, -75.68178084674071),
                        new LatLng(45.422880303791, -75.68185863080214),
                        new LatLng(45.42291136599677, -75.68188008847426),
                        new LatLng(45.4229000706512, -75.68190825166891),
                        new LatLng(45.42297490227357, -75.68197597744654),
                        new LatLng(45.42299184526863, -75.68193239155005),
                        new LatLng(45.42303326145738, -75.68196323695372),
                        new LatLng(45.42301914230553, -75.68200481119345))
        ));

        buildings.add(new Building(
                R.string.name_BRS3,
                R.string.code_BRS3,
                Arrays.asList(R.string.address_BRS30),
                R.string.code_BRS3,
                new LatLng(45.42286074758333, -75.68151399493217),
                new PolygonOptions().add(
                        new LatLng(45.42292736773247, -75.6815810221691),
                        new LatLng(45.42297301971824, -75.68146836939047),
                        new LatLng(45.422940074989945, -75.68143551233004),
                        new LatLng(45.4229316034853, -75.6814549583454),
                        new LatLng(45.42288265698901, -75.68140801968764),
                        new LatLng(45.42292925028933, -75.68130810740183),
                        new LatLng(45.42294854649334, -75.68132420065592),
                        new LatLng(45.42297301971824, -75.68125043990801),
                        new LatLng(45.42298290313296, -75.6812578159828),
                        new LatLng(45.423008788258606, -75.68118472578715),
                        new LatLng(45.42300549378872, -75.68117734971236),
                        new LatLng(45.42302196613619, -75.68113443436812),
                        new LatLng(45.422977255467615, -75.68110090675543),
                        new LatLng(45.42295795927342, -75.68114181044291),
                        new LatLng(45.42290195320895, -75.68109218957613),
                        new LatLng(45.42291136599677, -75.68107140245627),
                        new LatLng(45.42286477268169, -75.68102915766428),
                        new LatLng(45.42281017844539, -75.68115320983122),
                        new LatLng(45.42285583052592, -75.68119478407095),
                        new LatLng(45.42287089099799, -75.68116125645827),
                        new LatLng(45.422926426454026, -75.68120618345927),
                        new LatLng(45.422881715709806, -75.68131481292437),
                        new LatLng(45.422858654364724, -75.68129603746127),
                        new LatLng(45.422759819922, -75.68153408351134),
                        new LatLng(45.42276829145244, -75.68154280069064),
                        new LatLng(45.42273675852713, -75.68162326696108),
                        new LatLng(45.42269910724994, -75.6815910804529),
                        new LatLng(45.422706166866334, -75.68156425836276),
                        new LatLng(45.42265722017461, -75.68152201357077),
                        new LatLng(45.42260356702144, -75.68165277126025),
                        new LatLng(45.42265157247666, -75.68169166329096),
                        new LatLng(45.42266286787196, -75.68165746512602),
                        new LatLng(45.422725933787504, -75.68170976820181),
                        new LatLng(45.42271181455881, -75.68174798968028),
                        new LatLng(45.42275276031232, -75.68178285839747),
                        new LatLng(45.42276640889022, -75.68174731912802),
                        new LatLng(45.422774880419674, -75.68175670685957),
                        new LatLng(45.42282994533015, -75.681607173707),
                        new LatLng(45.42280923716499, -75.68158772769164),
                        new LatLng(45.42285300668696, -75.68148379209231),
                        new LatLng(45.422894422977556, -75.68151933136176),
                        new LatLng(45.422882186349405, -75.6815461534519))
        ));

        buildings.add(new Building(
                R.string.name_BRS4,
                R.string.code_BRS4,
                Arrays.asList(R.string.address_BRS40),
                R.string.code_BRS4,
                new LatLng(45.42261601437037, -75.68124577403069),
                new PolygonOptions().add(
                        new LatLng(45.42258144684694, -75.68162460806559),
                        new LatLng(45.42263368809614, -75.68150189700316),
                        new LatLng(45.422591330330235, -75.68146769883822),
                        new LatLng(45.422578622994266, -75.68149385037611),
                        new LatLng(45.42252873490687, -75.68145294668864),
                        new LatLng(45.42257626978358, -75.68134968164156),
                        new LatLng(45.42259650739222, -75.68136778655241),
                        new LatLng(45.42268969442673, -75.68115186872672),
                        new LatLng(45.422668515568766, -75.68113108160685),
                        new LatLng(45.42271181455881, -75.68102379324625),
                        new LatLng(45.4227494658275, -75.68105732085894),
                        new LatLng(45.422732052118846, -75.68109956565092),
                        new LatLng(45.42278146938616, -75.68113376381586),
                        new LatLng(45.422836063650216, -75.68100904109667),
                        new LatLng(45.422792764755464, -75.68097350182722),
                        new LatLng(45.422781940026574, -75.68099227729033),
                        new LatLng(45.42273440532304, -75.68095472636412),
                        new LatLng(45.422751348390285, -75.68091516378115),
                        new LatLng(45.42270804943055, -75.6808782834072),
                        new LatLng(45.42269345955622, -75.68091516378115),
                        new LatLng(45.42268734122068, -75.68090912881087),
                        new LatLng(45.42265580825015, -75.68098154845427),
                        new LatLng(45.42266098530623, -75.68098758342455),
                        new LatLng(45.42262945232099, -75.68106201472472),
                        new LatLng(45.42265251375968, -75.6810781079788),
                        new LatLng(45.422606390872865, -75.68118070247363),
                        new LatLng(45.42255462024075, -75.68113510492037),
                        new LatLng(45.42256450372873, -75.68111364724825),
                        new LatLng(45.42251461562884, -75.68106872024725),
                        new LatLng(45.42246284491256, -75.68119813683222),
                        new LatLng(45.422505673417604, -75.68123300554942),
                        new LatLng(45.42251743948472, -75.68120148959349),
                        new LatLng(45.42255509088308, -75.68123300554942),
                        new LatLng(45.42255744409462, -75.68122562947462),
                        new LatLng(45.42258097620485, -75.68124507548998),
                        new LatLng(45.422534853259585, -75.6813563871641),
                        new LatLng(45.42251273305819, -75.68133627059649),
                        new LatLng(45.422447313688416, -75.68147775712202),
                        new LatLng(45.42245719719517, -75.68148647430132),
                        new LatLng(45.42244072468295, -75.68152268412302),
                        new LatLng(45.42248119999011, -75.6815548706312),
                        new LatLng(45.42249767249055, -75.68151799025725),
                        new LatLng(45.422547089963025, -75.68155822339247),
                        new LatLng(45.422534853259585, -75.68158839824389))
        ));

        buildings.add(new Building(
                R.string.name_BRS5,
                R.string.code_BRS5,
                Arrays.asList(R.string.address_BRS50),
                R.string.code_BRS5,
                new LatLng(45.42238634069783, -75.68106338381767),
                new PolygonOptions().add(
                        new LatLng(45.422441195326215, -75.68117399695109),
                        new LatLng(45.42248967156238, -75.68104659202288),
                        new LatLng(45.42245202012042, -75.681023122694),
                        new LatLng(45.422442136612744, -75.68104122760485),
                        new LatLng(45.42239130711737, -75.68099831226061),
                        new LatLng(45.42243319439003, -75.68089772942255),
                        new LatLng(45.42245484397945, -75.68091382267664),
                        new LatLng(45.42248214127601, -75.68085548463057),
                        new LatLng(45.42248920091952, -75.6808507907648),
                        new LatLng(45.42252120462571, -75.68077635946463),
                        new LatLng(45.42251320370085, -75.68076764228533),
                        new LatLng(45.42253061747701, -75.68072740915011),
                        new LatLng(45.42248967156238, -75.68069052877615),
                        new LatLng(45.42247084584454, -75.68073143246363),
                        new LatLng(45.42241154479232, -75.68067577662657),
                        new LatLng(45.422421428305356, -75.68065566005896),
                        new LatLng(45.42237530522974, -75.68061676802824),
                        new LatLng(45.422321181164385, -75.68074551406096),
                        new LatLng(45.4223677749281, -75.68078507664393),
                        new LatLng(45.422380482311546, -75.68075087847899),
                        new LatLng(45.42243507696335, -75.68080049934576),
                        new LatLng(45.42239130711737, -75.68090242328833),
                        new LatLng(45.422369186859726, -75.68088633003424),
                        new LatLng(45.42231223892251, -75.68101909938048),
                        new LatLng(45.42231600407716, -75.68103452208231),
                        new LatLng(45.42228211767629, -75.68109956565092),
                        new LatLng(45.4223028260348, -75.68111834111403),
                        new LatLng(45.42225905608631, -75.68122227671336),
                        new LatLng(45.42220399061903, -75.6811753380556),
                        new LatLng(45.42221528610385, -75.68115388038348),
                        new LatLng(45.422166338986536, -75.68110828283022),
                        new LatLng(45.422113156012884, -75.68123702886294),
                        new LatLng(45.42215927930266, -75.68127860310267),
                        new LatLng(45.42217528125154, -75.68124574604224),
                        new LatLng(45.4222345825519, -75.68129603746127),
                        new LatLng(45.42221858061984, -75.68133224728297),
                        new LatLng(45.422264233178744, -75.68136711600016),
                        new LatLng(45.422276940585476, -75.68133828225325),
                        new LatLng(45.422284470899235, -75.68134297611903),
                        new LatLng(45.42231459214421, -75.68126854481886),
                        new LatLng(45.422309415056375, -75.68126318040083),
                        new LatLng(45.42234188950857, -75.68119679572771),
                        new LatLng(45.422342360152676, -75.68119076075743),
                        new LatLng(45.422323063741445, -75.68117198529433),
                        new LatLng(45.422359773981505, -75.68107341411303),
                        new LatLng(45.42240119063395, -75.68110493006895),
                        new LatLng(45.42238754196776, -75.68113644602488))
        ));

        buildings.add(new Building(
                R.string.name_BRS6,
                R.string.code_BRS6,
                Arrays.asList(R.string.address_BRS60),
                R.string.code_BRS6,
                new LatLng(45.422100188585475, -75.68077370524406),
                new PolygonOptions().add(
                        new LatLng(45.42209056500006, -75.68121691229533),
                        new LatLng(45.422144218640746, -75.68108950736712),
                        new LatLng(45.42209950727705, -75.68105195644091),
                        new LatLng(45.42208868241527, -75.68108146074007),
                        new LatLng(45.42203879389491, -75.68104323926161),
                        new LatLng(45.42208585853791, -75.68093662145327),
                        new LatLng(45.42210609632234, -75.68095472636412),
                        new LatLng(45.42213386443335, -75.68088968279551),
                        new LatLng(45.42213904153729, -75.68088498892973),
                        new LatLng(45.42216728027765, -75.68082061591338),
                        new LatLng(45.42216728027765, -75.68080653431605),
                        new LatLng(45.42219787223044, -75.68073813798617),
                        new LatLng(45.4221790464153, -75.68072003307532),
                        new LatLng(45.42222140449053, -75.68061408581923),
                        new LatLng(45.4222581147967, -75.68064694287966),
                        new LatLng(45.42224352480609, -75.68068047049235),
                        new LatLng(45.42229529572349, -75.68072271528433),
                        new LatLng(45.42235083174574, -75.68059933366965),
                        new LatLng(45.42230800312324, -75.68056111219119),
                        new LatLng(45.422294825079, -75.68058793428133),
                        new LatLng(45.42224305416117, -75.68054166617583),
                        new LatLng(45.42226329188924, -75.68050076248835),
                        new LatLng(45.42221999255521, -75.68046052935313),
                        new LatLng(45.42220399061903, -75.68050679745863),
                        new LatLng(45.422194107067924, -75.68050344469737),
                        new LatLng(45.42213527637083, -75.68064291956614),
                        new LatLng(45.42216163253072, -75.6806623655815),
                        new LatLng(45.42211645053482, -75.68077367725562),
                        new LatLng(45.422059972989125, -75.68072204473208),
                        new LatLng(45.422073621734526, -75.68069522264193),
                        new LatLng(45.42202702772805, -75.68065767171572),
                        new LatLng(45.42197525656463, -75.6807797122259),
                        new LatLng(45.42202043867352, -75.68081659259985),
                        new LatLng(45.422032204841756, -75.68079379382323),
                        new LatLng(45.42209056500006, -75.68084006192873),
                        new LatLng(45.42204350036098, -75.68094533863257),
                        new LatLng(45.42201949737994, -75.68092589261721),
                        new LatLng(45.421960195853636, -75.68106402638148),
                        new LatLng(45.421968667504075, -75.68107006135176),
                        new LatLng(45.421950782907224, -75.68110828283022),
                        new LatLng(45.42199031727161, -75.68114181044291),
                        new LatLng(45.42200584862149, -75.68110828283022),
                        new LatLng(45.42204726553357, -75.68113778712939),
                        new LatLng(45.42203361678179, -75.68117399695109))
        ));

        buildings.add(new Building(
                R.string.name_KE2,
                R.string.code_KE2,
                Arrays.asList(R.string.address_KE20),
                R.string.code_KE2,
                new LatLng(45.424860931189805, -75.68279474973679),
                new PolygonOptions().add(
                        new LatLng(45.42484471935009, -75.68290133955668),
                        new LatLng(45.42491766590434, -75.6827343720455),
                        new LatLng(45.424870603622075, -75.68269749167155),
                        new LatLng(45.4248009513723, -75.68286512973498))
        ));

        buildings.add(new Building(
                R.string.name_CRG,
                R.string.code_CRG,
                Arrays.asList(R.string.address_CRG0),
                R.string.code_CRG,
                new LatLng(45.42108311317139, -75.68200282752514),
                new PolygonOptions().add(
                        new LatLng(45.42110899916803, -75.68171113729477),
                        new LatLng(45.4210205160758, -75.68192034959793),
                        new LatLng(45.42080401430794, -75.6819874048233),
                        new LatLng(45.420809191533834, -75.6820323318243),
                        new LatLng(45.42078048145708, -75.68204641342163),
                        new LatLng(45.42080495562177, -75.6821121275425),
                        new LatLng(45.420821899268056, -75.68223886191845),
                        new LatLng(45.42100969100713, -75.6821671128273),
                        new LatLng(45.42117206681936, -75.68230055272579),
                        new LatLng(45.42120265931142, -75.68227507174015),
                        new LatLng(45.42121913218488, -75.68229049444199),
                        new LatLng(45.42127372795973, -75.68223349750042),
                        new LatLng(45.42113159057363, -75.68210743367672),
                        new LatLng(45.421220073491796, -75.6818962097168),
                        new LatLng(45.42120171800418, -75.68187676370144),
                        new LatLng(45.42122760394646, -75.68181306123734))
        ));

        buildings.add(new Building(
                R.string.name_KE6,
                R.string.code_KE6,
                Arrays.asList(R.string.address_KE60),
                R.string.code_KE6,
                new LatLng(45.424860931189805, -75.68218052387238),
                new PolygonOptions().add(
                        new LatLng(45.42480445638961, -75.68222679197788),
                        new LatLng(45.42486375492833, -75.68228110671043),
                        new LatLng(45.42492211215961, -75.68213626742363),
                        new LatLng(45.42486328430527, -75.68208530545235))
        ));

        buildings.add(new Building(
                R.string.name_CBY,
                R.string.code_CBY,
                Arrays.asList(R.string.address_CBY0),
                R.string.code_CBY,
                new LatLng(45.41972996500201, -75.67918583750725),
                new PolygonOptions().add(
                        new LatLng(45.41984114068566, -75.68009901772308),
                        new LatLng(45.41998045733778, -75.67977312932777),
                        new LatLng(45.419866556587024, -75.6796712053852),
                        new LatLng(45.41988538317323, -75.6796349955635),
                        new LatLng(45.41989479646401, -75.67964572439956),
                        new LatLng(45.41992209499833, -75.67957866917419),
                        new LatLng(45.4198835005149, -75.6795451415615),
                        new LatLng(45.41990985772595, -75.67948747406768),
                        new LatLng(45.4198750285516, -75.6794552875595),
                        new LatLng(45.41990138576659, -75.67939627896118),
                        new LatLng(45.41986938057534, -75.67936141024398),
                        new LatLng(45.41986090860993, -75.6793815268116),
                        new LatLng(45.419831727385954, -75.67935336361694),
                        new LatLng(45.41980254614689, -75.67942712436485),
                        new LatLng(45.41977985556251, -75.67940443754196),
                        new LatLng(45.41990975907917, -75.67907318472862),
                        new LatLng(45.42006790208735, -75.67920729517937),
                        new LatLng(45.420012363819446, -75.67933067679405),
                        new LatLng(45.42011826301185, -75.6794198602438),
                        new LatLng(45.42031217568492, -75.67898400127888),
                        new LatLng(45.42020486487051, -75.67888878285885),
                        new LatLng(45.42019874626529, -75.67890219390392),
                        new LatLng(45.42010602578205, -75.67882172763348),
                        new LatLng(45.420116380361335, -75.67880094051361),
                        new LatLng(45.419945058896246, -75.67865140736103),
                        new LatLng(45.41993564561387, -75.67867688834667),
                        new LatLng(45.41978126755892, -75.6785461306572),
                        new LatLng(45.419645715748025, -75.67885994911194),
                        new LatLng(45.419680074397554, -75.6788881123066),
                        new LatLng(45.419646285061795, -75.67898724208641),
                        new LatLng(45.41962839972926, -75.67903418074417),
                        new LatLng(45.41960015971905, -75.67901138196754),
                        new LatLng(45.41955121033454, -75.67911732922363),
                        new LatLng(45.419579450369255, -75.67914146910476),
                        new LatLng(45.41950885025599, -75.67931178937721),
                        new LatLng(45.41961239705856, -75.67941103111076),
                        new LatLng(45.419515439603636, -75.67964035998153),
                        new LatLng(45.419670759718144, -75.67977178822326),
                        new LatLng(45.419616162393254, -75.6799045575695),
                        new LatLng(45.41970841301489, -75.67998636494445),
                        new LatLng(45.4196933516992, -75.68003330360222),
                        new LatLng(45.41978089554043, -75.68009901772308),
                        new LatLng(45.419796898163405, -75.68005744348335))
        ));

        buildings.add(new Building(
                R.string.name_CBE,
                R.string.code_CBE,
                Arrays.asList(R.string.address_CBE0),
                R.string.code_CBE,
                new LatLng(45.420568, -75.680201),
                new PolygonOptions().add(
                        new LatLng(45.42053955382242, -75.6804021633186),
                        new LatLng(45.42065486519007, -75.6801312602081),
                        new LatLng(45.42055790952529, -75.68004744117638),
                        new LatLng(45.420441656639774, -75.68032437925717))
        ));

        buildings.add(new Building(
                R.string.name_DRO,
                R.string.code_DRO,
                Arrays.asList(R.string.address_DRO0),
                R.string.code_DRO,
                new LatLng(45.42089155642706, -75.68115457892418),
                new PolygonOptions().add(
                        new LatLng(45.42096544940052, -75.68063490092754),
                        new LatLng(45.42093109153317, -75.68072274327278),
                        new LatLng(45.42087225952002, -75.68067111074924),
                        new LatLng(45.420752242023056, -75.68096682429314),
                        new LatLng(45.42080777956315, -75.68101778626442),
                        new LatLng(45.42053573922645, -75.68170174956322),
                        new LatLng(45.42073953427316, -75.68186938762665),
                        new LatLng(45.421194187546, -75.68073078989983),
                        new LatLng(45.421201718004156, -75.68073749542236),
                        new LatLng(45.421077465315946, -75.68063758313656),
                        new LatLng(45.42104546079137, -75.68070329725742))
        ));

        buildings.add(new Building(
                R.string.name_KED,
                R.string.code_KED,
                Arrays.asList(R.string.address_KED0),
                R.string.code_KED,
                new LatLng(45.424502, -75.681843),
                new PolygonOptions().add(
                        new LatLng(45.42430276943443, -75.68183099851012),
                        new LatLng(45.42455220159231, -75.68203618749976),
                        new LatLng(45.42463361977509, -75.68183099851012),
                        new LatLng(45.42438748236635, -75.6816284917295))
        ));

        buildings.add(new Building(
                R.string.name_DMS,
                R.string.code_DMS,
                Arrays.asList(R.string.address_DMS0),
                R.string.code_DMS,
                new LatLng(45.42400533191114, -75.68716272711754),
                new PolygonOptions().add(
                        new LatLng(45.42446612634784, -75.68754890923879),
                        new LatLng(45.42445294880734, -75.68728471165082),
                        new LatLng(45.42424587276722, -75.68729544048688),
                        new LatLng(45.42424399025428, -75.687227044157),
                        new LatLng(45.424214811295705, -75.68722570305249),
                        new LatLng(45.42427834610556, -75.68701179688355),
                        new LatLng(45.42395219998972, -75.68679587905785),
                        new LatLng(45.42391454952314, -75.68689310913464),
                        new LatLng(45.423833130303294, -75.68682471280476),
                        new LatLng(45.42369711758743, -75.68717943494698),
                        new LatLng(45.423684410500364, -75.68717071776769),
                        new LatLng(45.42360299094862, -75.68736786013028),
                        new LatLng(45.42366182011627, -75.68742485707185),
                        new LatLng(45.42386466261626, -75.68743893866917),
                        new LatLng(45.424045384786496, -75.68755963807484))
        ));

        buildings.add(new Building(
                R.string.name_EMBA,
                R.string.code_EMBA,
                Arrays.asList(R.string.address_EMBA0),
                R.string.code_EMBA,
                new LatLng(45.421326441071535, -75.69806858897209),
                new PolygonOptions().add(
                        new LatLng(45.42139306303115, -75.69842529478262),
                        new LatLng(45.42150790200457, -75.69802296343039),
                        new LatLng(45.4215154324209, -75.69786068978499),
                        new LatLng(45.42168392522355, -75.69794383826445),
                        new LatLng(45.42173852054894, -75.69780704560469),
                        new LatLng(45.42170557510026, -75.69776949467848),
                        new LatLng(45.421719694580624, -75.69772121491621),
                        new LatLng(45.42172910756556, -75.69772792043875),
                        new LatLng(45.42184488715195, -75.69753144862835),
                        new LatLng(45.421884421590505, -75.69744025352185),
                        new LatLng(45.421960195853636, -75.69720690133755),
                        new LatLng(45.42174510963637, -75.69710162463372),
                        new LatLng(45.421723459774796, -75.69713112893288),
                        new LatLng(45.421669335084545, -75.69707815530484),
                        new LatLng(45.42142836192078, -75.69761325600331),
                        new LatLng(45.4213427032437, -75.69757369342034),
                        new LatLng(45.42124527810687, -75.69777552964871),
                        new LatLng(45.42121092040983, -75.6977567541856),
                        new LatLng(45.42100948034072, -75.69807258429711),
                        new LatLng(45.42107490137655, -75.69816243829911),
                        new LatLng(45.42104195554065, -75.6982683855552),
                        new LatLng(45.42126504553955, -75.69845614018624),
                        new LatLng(45.42130175646758, -75.69836628618424))
        ));

        buildings.add(new Building(
                R.string.name_FTX,
                R.string.code_FTX,
                Arrays.asList(R.string.address_FTX0),
                R.string.code_FTX,
                new LatLng(45.42383966982631, -75.68243935704231),
                new PolygonOptions().add(
                        new LatLng(45.42327914479214, -75.6826706975699),
                        new LatLng(45.423303147237654, -75.68269550800329),
                        new LatLng(45.42332667903705, -75.68263985216623),
                        new LatLng(45.423440102172584, -75.68273574113852),
                        new LatLng(45.42354317113131, -75.68248361349112),
                        new LatLng(45.423904616951596, -75.68278737366205),
                        new LatLng(45.42380578433998, -75.68300664424902),
                        new LatLng(45.42378554716485, -75.68298853933817),
                        new LatLng(45.42375166164603, -75.68307437002665),
                        new LatLng(45.42377001630459, -75.68309314548975),
                        new LatLng(45.423792606645364, -75.68304151296621),
                        new LatLng(45.423911676417255, -75.68314008414751),
                        new LatLng(45.42401992144647, -75.68287923932081),
                        new LatLng(45.42404862987593, -75.6829040497542),
                        new LatLng(45.42409192780751, -75.68280212581158),
                        new LatLng(45.424128636897386, -75.68283632397652),
                        new LatLng(45.424143697029926, -75.68280212581158),
                        new LatLng(45.42410604669102, -75.68276457488537),
                        new LatLng(45.42421758574694, -75.68249903619295),
                        new LatLng(45.42421476197609, -75.68248897790914),
                        new LatLng(45.42417005225216, -75.68244807422167),
                        new LatLng(45.42417946482856, -75.68238839507109),
                        new LatLng(45.424158286529455, -75.6823635846377),
                        new LatLng(45.424093810325516, -75.68236023187643),
                        new LatLng(45.424083927105265, -75.68238034844404),
                        new LatLng(45.423786017796914, -75.68213090300566),
                        new LatLng(45.423798724861115, -75.6820665299893),
                        new LatLng(45.42377425199416, -75.68204641342169),
                        new LatLng(45.42374507279279, -75.68203300237661),
                        new LatLng(45.42372907128883, -75.68207994103437),
                        new LatLng(45.423631179636615, -75.68199813365942),
                        new LatLng(45.42346081010633, -75.6824085116387),
                        new LatLng(45.423424100582196, -75.68241052329546),
                        new LatLng(45.42333656238986, -75.68260498344904),
                        new LatLng(45.42331491313857, -75.68258889019495))
        ));

        buildings.add(new Building(
                R.string.name_GNN,
                R.string.code_GNN,
                Arrays.asList(R.string.address_GNN0),
                R.string.code_GNN,
                new LatLng(45.42110617524169, -75.68156227469444),
                new PolygonOptions().add(
                        new LatLng(45.42130996822935, -75.68142749369144),
                        new LatLng(45.42122995721335, -75.68136312067509),
                        new LatLng(45.42117536139616, -75.68149521946907),
                        new LatLng(45.42096497874496, -75.68130679428577),
                        new LatLng(45.420881672646246, -75.68151332437992),
                        new LatLng(45.42122807459985, -75.68181239068508),
                        new LatLng(45.42126243228646, -75.68172723054886),
                        new LatLng(45.42120454192573, -75.68167693912983))
        ));

        buildings.add(new Building(
                R.string.name_RGN,
                R.string.code_RGN,
                Arrays.asList(R.string.address_RGN0),
                R.string.code_RGN,
                new LatLng(45.402458, -75.650214),
                new PolygonOptions().add(
                        new LatLng(45.40277853238734, -75.65113660874556),
                        new LatLng(45.40301393547584, -75.6507838982601),
                        new LatLng(45.40293295692406, -75.65066856327246),
                        new LatLng(45.40303182607045, -75.6505143362541),
                        new LatLng(45.40264858946234, -75.65002349200438),
                        new LatLng(45.40265800562638, -75.6500087398548),
                        new LatLng(45.4026358776384, -75.64997990610789),
                        new LatLng(45.4026250490454, -75.64999197604845),
                        new LatLng(45.402591150827774, -75.64993967297266),
                        new LatLng(45.402604333470386, -75.64992559137534),
                        new LatLng(45.4026024502359, -75.64983305516432),
                        new LatLng(45.4025916216365, -75.64981293859671),
                        new LatLng(45.402628344704354, -75.64975594165514),
                        new LatLng(45.40263776087175, -75.64976868214796),
                        new LatLng(45.40265800562638, -75.6497391778488),
                        new LatLng(45.40265000188703, -75.64972643735598),
                        new LatLng(45.402729568421684, -75.64959970298003),
                        new LatLng(45.40232938057336, -75.64907466056536),
                        new LatLng(45.40217872088421, -75.6492697912712),
                        new LatLng(45.40215000133538, -75.6492972839136),
                        new LatLng(45.40211892770872, -75.64935830416869),
                        new LatLng(45.40212175258457, -75.64965200605582),
                        new LatLng(45.40216130083174, -75.64971369686316),
                        new LatLng(45.402143880773885, -75.64973448398302),
                        new LatLng(45.40216271326862, -75.64976398828219),
                        new LatLng(45.40216177164403, -75.64994771959971),
                        new LatLng(45.40213681858676, -75.64998795273493),
                        new LatLng(45.40219896580331, -75.65008920612524),
                        new LatLng(45.40218248738133, -75.65011200490187),
                        new LatLng(45.40219896580331, -75.650136144783),
                        new LatLng(45.40218907875069, -75.6501535791416),
                        new LatLng(45.40217118788919, -75.65012675705145),
                        new LatLng(45.402152355397305, -75.65014955582808),
                        new LatLng(45.402087854064966, -75.65004562022875),
                        new LatLng(45.401797361750496, -75.65042783501337),
                        new LatLng(45.40182372740304, -75.6504767853279),
                        new LatLng(45.40179594930446, -75.65051232459734),
                        new LatLng(45.40182372740304, -75.6505592632551),
                        new LatLng(45.40185244711774, -75.65052573564242),
                        new LatLng(45.40188775822236, -75.65058809700201),
                        new LatLng(45.40171402737484, -75.65084827127646),
                        new LatLng(45.40175545917018, -75.65089789214323),
                        new LatLng(45.40193201477564, -75.6506477761526),
                        new LatLng(45.40221073610176, -75.65103669645976),
                        new LatLng(45.40228229946364, -75.65093477251719),
                        new LatLng(45.40241224323113, -75.65112520935725),
                        new LatLng(45.40243766697676, -75.65108899953555),
                        new LatLng(45.40243578373675, -75.65102864983271),
                        new LatLng(45.402327497329715, -75.65086771729182),
                        new LatLng(45.40244425831635, -75.65069471481036),
                        new LatLng(45.40258455950531, -75.65090258600901))
        ));

        buildings.add(new Building(
                R.string.name_HGN,
                R.string.code_HGN,
                Arrays.asList(R.string.address_HGN0),
                R.string.code_HGN,
                new LatLng(45.42515365799879, -75.68698033690453),
                new PolygonOptions().add(
                        new LatLng(45.425203909061494, -75.68717444778775),
                        new LatLng(45.42529191497783, -75.68696724714135),
                        new LatLng(45.42519967347917, -75.68688275755738),
                        new LatLng(45.42520532092219, -75.68686733485555),
                        new LatLng(45.42510837307188, -75.68678619803285),
                        new LatLng(45.425004836348855, -75.68702558518743),
                        new LatLng(45.425103666861304, -75.68711074532365),
                        new LatLng(45.42510978493496, -75.68709599317407))
        ));

        buildings.add(new Building(
                R.string.name_HSY,
                R.string.code_HSY,
                Arrays.asList(R.string.address_HSY0),
                R.string.code_HSY,
                new LatLng(45.42510283094472, -75.68420961499214),
                new PolygonOptions().add(
                        new LatLng(45.425348754584284, -75.68452273490618),
                        new LatLng(45.425441937075874, -75.68430815818499),
                        new LatLng(45.42534734272718, -75.68422299804877),
                        new LatLng(45.425337930345506, -75.68424110295956),
                        new LatLng(45.42533040043904, -75.6842303741235),
                        new LatLng(45.42533651848812, -75.68421428086941),
                        new LatLng(45.42523062908351, -75.68412107410614),
                        new LatLng(45.42521933420195, -75.68414119067376),
                        new LatLng(45.42519533257114, -75.6841217446584),
                        new LatLng(45.42520380373613, -75.68409827532952),
                        new LatLng(45.42511720954533, -75.68402116182034),
                        new LatLng(45.425038145168195, -75.68405737164204),
                        new LatLng(45.42502214403076, -75.6840955931205),
                        new LatLng(45.425033438951765, -75.68415191950982),
                        new LatLng(45.42499625982827, -75.68422970357125),
                        new LatLng(45.425008966620084, -75.68424244406407),
                        new LatLng(45.425001436669724, -75.68426054897492),
                        new LatLng(45.42499437734035, -75.68426390173619),
                        new LatLng(45.4249840236557, -75.68426256063168),
                        new LatLng(45.42490119411003, -75.68419014098828),
                        new LatLng(45.424828247534485, -75.68436180236523),
                        new LatLng(45.42484001311755, -75.68440471770947),
                        new LatLng(45.424933667071386, -75.68448652508442),
                        new LatLng(45.42494260889806, -75.68446305575554),
                        new LatLng(45.42496849312513, -75.68448652508442),
                        new LatLng(45.42496284565842, -75.68450194778626),
                        new LatLng(45.425009437241926, -75.68454083981698),
                        new LatLng(45.425048028221376, -75.68446909072583),
                        new LatLng(45.42507720674931, -75.68446842017357),
                        new LatLng(45.42510214967252, -75.68441276433651),
                        new LatLng(45.4251110914725, -75.68441946985905),
                        new LatLng(45.42514779989965, -75.68434839132016),
                        new LatLng(45.42513697562232, -75.68433363917057),
                        new LatLng(45.42513321065584, -75.68430011155789),
                        new LatLng(45.42514403493387, -75.68429877045338),
                        new LatLng(45.42514779989965, -75.68432291033452),
                        new LatLng(45.42516285976032, -75.68431620481198),
                        new LatLng(45.425180743339595, -75.68432961585705),
                        new LatLng(45.42517509589411, -75.6843477207679),
                        new LatLng(45.425278161685256, -75.68443690421765),
                        new LatLng(45.425272514249514, -75.68445433857624))
        ));

        buildings.add(new Building(
                R.string.name_KE3,
                R.string.code_KE3,
                Arrays.asList(R.string.address_KE30),
                R.string.code_KE3,
                new LatLng(45.42502470779088, -75.6823293864727),
                new PolygonOptions().add(
                        new LatLng(45.42506860558024, -75.68247622342199),
                        new LatLng(45.425117550181334, -75.68235015959829),
                        new LatLng(45.425101078445316, -75.68233674855321),
                        new LatLng(45.42512272701165, -75.68228377492517),
                        new LatLng(45.42505919315211, -75.6822354951629),
                        new LatLng(45.42504648637162, -75.68226701111882),
                        new LatLng(45.4249838936704, -75.68221403749078),
                        new LatLng(45.424929772105905, -75.6823515007028),
                        new LatLng(45.42502624964123, -75.68243196697324),
                        new LatLng(45.425018719693185, -75.68244604857057),
                        new LatLng(45.42504931010086, -75.68247354121297),
                        new LatLng(45.425052604451466, -75.68246214182466))
        ));

        buildings.add(new Building(
                R.string.name_SM3,
                R.string.code_SM3,
                Arrays.asList(R.string.address_SM30),
                R.string.code_SM3,
                new LatLng(45.4254115575309, -75.68618908524513),
                new PolygonOptions().add(
                        new LatLng(45.425457776763054, -75.68634320030975),
                        new LatLng(45.42552366326196, -75.68619098494815),
                        new LatLng(45.4254676597428, -75.68614270518589),
                        new LatLng(45.425472836541026, -75.68612862358856),
                        new LatLng(45.42538294843177, -75.68605151007938),
                        new LatLng(45.42530482566561, -75.68623054753112),
                        new LatLng(45.42539612575518, -75.68631101380157),
                        new LatLng(45.42540224379714, -75.68629626165199))
        ));

        buildings.add(new Building(
                R.string.name_KE1,
                R.string.code_KE1,
                Arrays.asList(R.string.address_KE10,
                        R.string.address_KE11),
                R.string.code_KE1,
                new LatLng(45.424948467018446, -75.68288862705231),
                new PolygonOptions().add(
                        new LatLng(45.42498449427775, -75.68299588742445),
                        new LatLng(45.425034380195065, -75.68287049415301),
                        new LatLng(45.424914371545846, -75.68277996959876),
                        new LatLng(45.424859779291594, -75.68292145612429),
                        new LatLng(45.42491860714957, -75.68297442975233),
                        new LatLng(45.424912489055195, -75.68298851134966),
                        new LatLng(45.42493460831634, -75.68300259294699),
                        new LatLng(45.424950138856225, -75.68297040643881))
        ));

        buildings.add(new Building(
                R.string.name_LMX,
                R.string.code_LMX,
                Arrays.asList(R.string.address_LMX0),
                R.string.code_LMX,
                new LatLng(45.421946, -75.681987),
                new PolygonOptions().add(
                        new LatLng(45.42148599206543, -75.68259090185165),
                        new LatLng(45.4216069493031, -75.6826888024807),
                        new LatLng(45.42180791659196, -75.68220131099224),
                        new LatLng(45.42208465726157, -75.68242125213146),
                        new LatLng(45.42209454083183, -75.68246349692345),
                        new LatLng(45.42211336667514, -75.6824641674757),
                        new LatLng(45.4221190144269, -75.68245075643063),
                        new LatLng(45.42211336667514, -75.6824105232954),
                        new LatLng(45.42217737449546, -75.68238370120525),
                        new LatLng(45.422289858650956, -75.68211413919926),
                        new LatLng(45.42227197415588, -75.68202160298824),
                        new LatLng(45.42230068347421, -75.6820135563612),
                        new LatLng(45.42230444862963, -75.68200953304768),
                        new LatLng(45.42230538991845, -75.68198136985302),
                        new LatLng(45.422292682518105, -75.68196795880795),
                        new LatLng(45.42226303190622, -75.68197600543499),
                        new LatLng(45.422258796103236, -75.68195790052414),
                        new LatLng(45.42222208579753, -75.6819250434637),
                        new LatLng(45.42217502126809, -75.68166419863701),
                        new LatLng(45.4221392521995, -75.68164274096489),
                        new LatLng(45.42213878155371, -75.68162530660629),
                        new LatLng(45.422127956699434, -75.68160384893417),
                        new LatLng(45.422104424400366, -75.68158976733685),
                        new LatLng(45.422092658247166, -75.6815904378891),
                        new LatLng(45.42208136273779, -75.68159781396389),
                        new LatLng(45.422043240376944, -75.68155288696289),
                        new LatLng(45.42186298244556, -75.68163335323334),
                        new LatLng(45.42185827596445, -75.68160720169544),
                        new LatLng(45.42184792170462, -75.68159312009811),
                        new LatLng(45.42183239031132, -75.68159312009811),
                        new LatLng(45.42182533058567, -75.68161122500896),
                        new LatLng(45.42183050771791, -75.68165481090546),
                        new LatLng(45.42165919145404, -75.68170510232449),
                        new LatLng(45.421622480758444, -75.68181239068508),
                        new LatLng(45.42167189899695, -75.68204239010811),
                        new LatLng(45.421641306759156, -75.68205580115318),
                        new LatLng(45.4216380122095, -75.68206384778023),
                        new LatLng(45.42163848285946, -75.6820846349001),
                        new LatLng(45.421645071958565, -75.68209066987038),
                        new LatLng(45.421678958741786, -75.6820859760046),
                        new LatLng(45.42170437381585, -75.68211883306503),
                        new LatLng(45.42151517243442, -75.68256877362728),
                        new LatLng(45.42150058225186, -75.68255603313446))
        ));

        buildings.add(new Building(
                R.string.name_LBC,
                R.string.code_LBC,
                Arrays.asList(R.string.address_LBC0),
                R.string.code_LBC,
                new LatLng(45.42438936487451, -75.68297579884529),
                new PolygonOptions().add(
                        new LatLng(45.42409475158446, -75.68291410803795),
                        new LatLng(45.424553142843656, -75.68329766392708),
                        new LatLng(45.424603029142155, -75.68317294120789),
                        new LatLng(45.42444866384925, -75.68304419517517),
                        new LatLng(45.42449855024008, -75.68291142582893),
                        new LatLng(45.424355479718116, -75.68279340863228),
                        new LatLng(45.424308416967165, -75.68291947245598),
                        new LatLng(45.42414934457854, -75.68278804421425))
        ));

        buildings.add(new Building(
                R.string.name_LEES1,
                R.string.code_LEES1,
                Arrays.asList(R.string.address_LEES10),
                R.string.code_LEES1,
                new LatLng(45.415902380397775, -75.66662505269056),
                new PolygonOptions().add(
                        new LatLng(45.41614316646137, -75.66734519782256),
                        new LatLng(45.41642934876497, -75.66654992284964),
                        new LatLng(45.41565364073766, -75.66598800006102),
                        new LatLng(45.41535615764799, -75.66683289590071),
                        new LatLng(45.415469126094436, -75.66691872658919),
                        new LatLng(45.4154841885369, -75.66687447014044),
                        new LatLng(45.41595300504965, -75.66721242847632),
                        new LatLng(45.4159078180854, -75.66734989168833),
                        new LatLng(45.415941708311976, -75.66737403156947),
                        new LatLng(45.415991602219684, -75.66723321559618))
        ));

        buildings.add(new Building(
                R.string.name_LEES2,
                R.string.code_LEES2,
                Arrays.asList(R.string.address_LEES20),
                R.string.code_LEES2,
                new LatLng(45.41584213105002, -75.6676764786244),
                new PolygonOptions().add(
                        new LatLng(45.41578779003597, -75.66807744088362),
                        new LatLng(45.41601796124746, -75.66743102851103),
                        new LatLng(45.41583627198467, -75.66730563523959),
                        new LatLng(45.41561551403684, -75.66795137705992),
                        new LatLng(45.41568706041723, -75.66800032737444),
                        new LatLng(45.41566870313089, -75.66804994824122),
                        new LatLng(45.41570541769758, -75.66807945254038),
                        new LatLng(45.41572283357344, -75.66803117277811))
        ));

        buildings.add(new Building(
                R.string.name_LEES3,
                R.string.code_LEES3,
                Arrays.asList(R.string.address_LEES30),
                R.string.code_LEES3,
                new LatLng(45.41571410097266, -75.66841676831251),
                new PolygonOptions().add(
                        new LatLng(45.415836061299004, -75.6688928044357),
                        new LatLng(45.41604316818481, -75.66832283502004),
                        new LatLng(45.41576263231166, -75.6681176460304),
                        new LatLng(45.41577675327816, -75.66807607179067),
                        new LatLng(45.415723093586585, -75.66804120307347),
                        new LatLng(45.415706148410244, -75.6680814362087),
                        new LatLng(45.41555081739007, -75.66797146563908),
                        new LatLng(45.41534653291308, -75.66853472953221))
        ));

        buildings.add(new Building(
                R.string.name_LEES4,
                R.string.code_LEES4,
                Arrays.asList(R.string.address_LEES40),
                R.string.code_LEES4,
                new LatLng(45.41527729028879, -75.66794469952589),
                new PolygonOptions().add(
                        new LatLng(45.415469126094436, -75.66813644948195),
                        new LatLng(45.41548465923815, -75.66809152248095),
                        new LatLng(45.4154121711976, -75.66803452553938),
                        new LatLng(45.41545877066293, -75.6678923684616),
                        new LatLng(45.41515893302687, -75.66767309787463),
                        new LatLng(45.41504313973031, -75.66799496295641),
                        new LatLng(45.415344860790924, -75.66821758630465),
                        new LatLng(45.415393343119895, -75.6680834758539))
        ));

        buildings.add(new Building(
                R.string.name_LEES5,
                R.string.code_LEES5,
                Arrays.asList(R.string.address_LEES50),
                R.string.code_LEES5,
                new LatLng(45.41636931066319, -75.66754773259169),
                new PolygonOptions().add(
                        new LatLng(45.41642348976056, -75.66795000796697),
                        new LatLng(45.416611766820495, -75.66742295389554),
                        new LatLng(45.416479031558524, -75.66732371216199),
                        new LatLng(45.41649409373161, -75.66727811460873),
                        new LatLng(45.41635853402928, -75.6671815550842),
                        new LatLng(45.416335940713914, -75.66722447042844),
                        new LatLng(45.41628698849959, -75.66718826060674),
                        new LatLng(45.41610247592584, -75.6677233613052),
                        new LatLng(45.416295461001276, -75.66786417727849),
                        new LatLng(45.41627945738594, -75.66790709262273),
                        new LatLng(45.41638865843567, -75.66798085337064),
                        new LatLng(45.416402779245665, -75.66793659692189))
        ));

        buildings.add(new Building(
                R.string.name_MCD,
                R.string.code_MCD,
                Arrays.asList(R.string.address_MCD0),
                R.string.code_MCD,
                new LatLng(45.420114027047966, -75.6804732978344),
                new PolygonOptions().add(
                        new LatLng(45.42000671585693, -75.68096682429314),
                        new LatLng(45.420360653749015, -75.68013802170753),
                        new LatLng(45.42020627685614, -75.68000391125679),
                        new LatLng(45.419854220655694, -75.68084076046944))
        ));

        buildings.add(new Building(
                R.string.name_MRD,
                R.string.code_MRD,
                Arrays.asList(R.string.address_MRD0),
                R.string.code_MRD,
                new LatLng(45.421912400473516, -75.6844013929367),
                new PolygonOptions().add(
                        new LatLng(45.42177920702308, -75.68447649478912),
                        new LatLng(45.421820624101436, -75.68451806902885),
                        new LatLng(45.42183568484963, -75.68448185920715),
                        new LatLng(45.421893103915416, -75.68453684449196),
                        new LatLng(45.421883690957806, -75.68456366658211),
                        new LatLng(45.4219251079595, -75.6845971941948),
                        new LatLng(45.42193922738496, -75.68457305431366),
                        new LatLng(45.42195805328007, -75.68458512425423),
                        new LatLng(45.422038063264225, -75.6844013929367),
                        new LatLng(45.42202111998294, -75.6843812763691),
                        new LatLng(45.422032415504376, -75.68435177206993),
                        new LatLng(45.42198911599325, -75.68431556224823),
                        new LatLng(45.42197499658029, -75.6843450665474),
                        new LatLng(45.42191616565486, -75.68429477512836),
                        new LatLng(45.42192604925461, -75.68426460027695),
                        new LatLng(45.42188133771812, -75.68421833217144),
                        new LatLng(45.42186627698209, -75.6842565536499),
                        new LatLng(45.42185074559386, -75.68424046039581),
                        new LatLng(45.42177450053495, -75.68442955613136),
                        new LatLng(45.421790502592934, -75.68444699048996))
        ));

        buildings.add(new Building(
                R.string.name_AWHC,
                R.string.code_AWHC,
                Arrays.asList(R.string.address_AWHC0),
                R.string.code_AWHC,
                new LatLng(45.42204371102349, -75.6840755045414),
                new PolygonOptions().add(
                        new LatLng(45.42195852392736, -75.68433098495007),
                        new LatLng(45.421999940874116, -75.68423375487328),
                        new LatLng(45.42207618562853, -75.68429946899414),
                        new LatLng(45.4221674909397, -75.6840768456459),
                        new LatLng(45.42215384221702, -75.68398095667362),
                        new LatLng(45.42203288615105, -75.68388037383556),
                        new LatLng(45.42198582146385, -75.68388909101486),
                        new LatLng(45.4218921626197, -75.68412445485592),
                        new LatLng(45.42196793687245, -75.68419821560383),
                        new LatLng(45.421925578607045, -75.68430483341217))
        ));

        buildings.add(new Building(
                R.string.name_MRN,
                R.string.code_MRN,
                Arrays.asList(R.string.address_MRN0),
                R.string.code_MRN,
                new LatLng(45.42039077602037, -75.68142279982567),
                new PolygonOptions().add(
                        new LatLng(45.42011073240928, -75.6813195347786),
                        new LatLng(45.42013661885177, -75.68134032189846),
                        new LatLng(45.4201281469263, -75.68136245012283),
                        new LatLng(45.42053573922645, -75.68170174956322),
                        new LatLng(45.42062375242, -75.68147778511047),
                        new LatLng(45.42045196183472, -75.68133160471916),
                        new LatLng(45.42046843492721, -75.68128399550915),
                        new LatLng(45.420496203843655, -75.68129539489746),
                        new LatLng(45.42051079428583, -75.68129003047943),
                        new LatLng(45.420591276979664, -75.68120017647743),
                        new LatLng(45.42064210809562, -75.68109959363937),
                        new LatLng(45.420668935610585, -75.68111702799797),
                        new LatLng(45.420701411006384, -75.6810412555933),
                        new LatLng(45.42060116081137, -75.68095676600933),
                        new LatLng(45.420607750031515, -75.68093866109848),
                        new LatLng(45.420555506907675, -75.68089306354523),
                        new LatLng(45.42054891768142, -75.68090848624706),
                        new LatLng(45.420485849334035, -75.68086087703705),
                        new LatLng(45.420486790653186, -75.68085350096226),
                        new LatLng(45.420453844474096, -75.68082667887211),
                        new LatLng(45.42041007309214, -75.68093061447144),
                        new LatLng(45.42043031147726, -75.6809514015913),
                        new LatLng(45.420400189227, -75.68104527890682),
                        new LatLng(45.420385128095866, -75.68110965192318),
                        new LatLng(45.420377597528784, -75.68115927278996),
                        new LatLng(45.420377597528784, -75.68122364580631),
                        new LatLng(45.42036347771281, -75.68125583231449),
                        new LatLng(45.420193098321505, -75.68112909793854))
        ));

        buildings.add(new Building(
                R.string.name_MNT,
                R.string.code_MNT,
                Arrays.asList(R.string.address_MNT0),
                R.string.code_MNT,
                new LatLng(45.422770384674386, -75.68262442946434),
                new PolygonOptions().add(
                        new LatLng(45.423205254846856, -75.68247824907303),
                        new LatLng(45.42268990508688, -75.68204842507839),
                        new LatLng(45.42251153179093, -75.6824903190136),
                        new LatLng(45.422260678682385, -75.68227775394917),
                        new LatLng(45.42225079514125, -75.68229854106903),
                        new LatLng(45.42222490966807, -75.68226970732212),
                        new LatLng(45.42217737449556, -75.68238236010075),
                        new LatLng(45.422198082892415, -75.68240314722061),
                        new LatLng(45.42218584611333, -75.68242728710175),
                        new LatLng(45.42221879128174, -75.68246483802795),
                        new LatLng(45.422177845140965, -75.68254798650742),
                        new LatLng(45.42219808289244, -75.6825727969408),
                        new LatLng(45.422201848054705, -75.68256340920925),
                        new LatLng(45.42250541343573, -75.68282291293144),
                        new LatLng(45.422317626671635, -75.68330906331539),
                        new LatLng(45.42237739846634, -75.68336874246597),
                        new LatLng(45.42235716077916, -75.6834176927805),
                        new LatLng(45.42243952341424, -75.6834914535284),
                        new LatLng(45.422510590505624, -75.6833278387785),
                        new LatLng(45.422712025218885, -75.68349950015545),
                        new LatLng(45.42273649854633, -75.68344317376614),
                        new LatLng(45.42274591136172, -75.68345122039318),
                        new LatLng(45.42276473698784, -75.68340629339218),
                        new LatLng(45.42275532417557, -75.68339422345161),
                        new LatLng(45.422809447824704, -75.68327017128468),
                        new LatLng(45.42281838998783, -75.68327620625496),
                        new LatLng(45.422837215589794, -75.68323396146297),
                        new LatLng(45.42282686150949, -75.68322323262691),
                        new LatLng(45.42285321734652, -75.68316221237183),
                        new LatLng(45.42289086852089, -75.68319439888),
                        new LatLng(45.422926637113314, -75.68311996757984),
                        new LatLng(45.422941226927335, -75.68313539028168))
        ));

        buildings.add(new Building(
                R.string.name_MRT,
                R.string.code_MRT,
                Arrays.asList(R.string.address_MRT0),
                R.string.code_MRT,
                new LatLng(45.4232, -75.684192),
                new PolygonOptions().add(
                        new LatLng(45.42277697364143, -75.68416737020016),
                        new LatLng(45.42297746612669, -75.68435177206993),
                        new LatLng(45.42295911121045, -75.6843899935484),
                        new LatLng(45.4229864082632, -75.68441480398178),
                        new LatLng(45.42301323466425, -75.68435914814472),
                        new LatLng(45.423031589562854, -75.68437457084656),
                        new LatLng(45.42300429253197, -75.68443089723587),
                        new LatLng(45.42302594190239, -75.684455037117),
                        new LatLng(45.42304147296735, -75.68442352116108),
                        new LatLng(45.423061710409215, -75.68444095551968),
                        new LatLng(45.42305135637011, -75.6844711303711),
                        new LatLng(45.423082889119705, -75.684499964118),
                        new LatLng(45.42309465506653, -75.68447716534138),
                        new LatLng(45.42311253930102, -75.68449325859547),
                        new LatLng(45.42306876998027, -75.68459115922451),
                        new LatLng(45.42310547973544, -75.68462066352367),
                        new LatLng(45.42311724567758, -75.68459518253803),
                        new LatLng(45.42313324735491, -75.68460792303085),
                        new LatLng(45.42312289332891, -75.68463407456875),
                        new LatLng(45.423156779225145, -75.6846608966589),
                        new LatLng(45.423169486430965, -75.68463541567326),
                        new LatLng(45.42319019446399, -75.68465285003185),
                        new LatLng(45.423174663439944, -75.68468704819679),
                        new LatLng(45.423207608031326, -75.68471655249596),
                        new LatLng(45.423254201063486, -75.6846085935831),
                        new LatLng(45.423270673338365, -75.68462267518044),
                        new LatLng(45.42326031933758, -75.68465083837509),
                        new LatLng(45.42329326387898, -75.68468302488327),
                        new LatLng(45.42331397186659, -75.684634745121),
                        new LatLng(45.42334691637668, -75.68466894328594),
                        new LatLng(45.42336527116681, -75.68463139235973),
                        new LatLng(45.42332997348818, -75.6845971941948),
                        new LatLng(45.423339386204646, -75.68457841873169),
                        new LatLng(45.423411864068875, -75.68464480340481),
                        new LatLng(45.423436337092916, -75.68459182977676),
                        new LatLng(45.42341562915017, -75.68457372486591),
                        new LatLng(45.423425983122485, -75.68454891443253),
                        new LatLng(45.423444808521836, -75.68456433713436),
                        new LatLng(45.42346739899276, -75.68451941013336),
                        new LatLng(45.42344857360094, -75.684499964118),
                        new LatLng(45.42345892756723, -75.68447716534138),
                        new LatLng(45.42347869422482, -75.68449459969997),
                        new LatLng(45.42350410848873, -75.6844362616539),
                        new LatLng(45.42342739502768, -75.68437457084656),
                        new LatLng(45.42343680772789, -75.68435579538345),
                        new LatLng(45.42345610375845, -75.68437121808529),
                        new LatLng(45.42347822359023, -75.68432360887527),
                        new LatLng(45.423457515662854, -75.68430617451668),
                        new LatLng(45.423468810896914, -75.6842840462923),
                        new LatLng(45.42348763628197, -75.68429879844189),
                        new LatLng(45.42351116800447, -75.68424850702286),
                        new LatLng(45.42348810691651, -75.6842290610075),
                        new LatLng(45.42350222595106, -75.68420089781284),
                        new LatLng(45.423536582253746, -75.68423174321651),
                        new LatLng(45.42355823142003, -75.6841841340065),
                        new LatLng(45.42352528703327, -75.68415127694607),
                        new LatLng(45.423545524301716, -75.68410433828831),
                        new LatLng(45.423503167219906, -75.68406544625759),
                        new LatLng(45.423484341840044, -75.68410500884056),
                        new LatLng(45.423471634705066, -75.68409495055676),
                        new LatLng(45.423483400570866, -75.68407148122787),
                        new LatLng(45.42345375058433, -75.68404465913773),
                        new LatLng(45.42344057280756, -75.68406946957111),
                        new LatLng(45.42341939423126, -75.68405203521252),
                        new LatLng(45.42343068947293, -75.68402454257011),
                        new LatLng(45.42340198072924, -75.68399906158447),
                        new LatLng(45.42338550849268, -75.68402722477913),
                        new LatLng(45.42336715370909, -75.68400911986828),
                        new LatLng(45.42341421724475, -75.6839058548212),
                        new LatLng(45.42353328781468, -75.68400174379349),
                        new LatLng(45.423573762338584, -75.68391524255276),
                        new LatLng(45.423514462444864, -75.68386495113373),
                        new LatLng(45.423555407616234, -75.68377912044525),
                        new LatLng(45.42337515451291, -75.68362355232239),
                        new LatLng(45.42333138539576, -75.68371944129467),
                        new LatLng(45.423382684680185, -75.6837697327137),
                        new LatLng(45.42335538781906, -75.68382874131203),
                        new LatLng(45.423388332304974, -75.6838609278202),
                        new LatLng(45.42333373857497, -75.68398363888264),
                        new LatLng(45.423316795682524, -75.6839668750763),
                        new LatLng(45.42332714967296, -75.68393804132938),
                        new LatLng(45.42329608769594, -75.68390853703022),
                        new LatLng(45.423281968609835, -75.68393602967262),
                        new LatLng(45.42326361379263, -75.68391859531403),
                        new LatLng(45.423276791610725, -75.68389110267162),
                        new LatLng(45.42325608360948, -75.68387299776077),
                        new LatLng(45.42323302241732, -75.68391993641853),
                        new LatLng(45.42321090248946, -75.68390183150768),
                        new LatLng(45.423238199420474, -75.68384349346161),
                        new LatLng(45.42321184376319, -75.68381935358047),
                        new LatLng(45.42318737064182, -75.68386763334274),
                        new LatLng(45.42314783711568, -75.68383544683456),
                        new LatLng(45.42313512990498, -75.683868303895),
                        new LatLng(45.42309277251527, -75.68383276462555),
                        new LatLng(45.42313654181739, -75.68373419344425),
                        new LatLng(45.423038178499446, -75.68364970386028),
                        new LatLng(45.422998644868834, -75.68373218178749),
                        new LatLng(45.422978407404365, -75.68371742963791))
        ));

        buildings.add(new Building(
                R.string.name_RCR,
                R.string.code_RCR,
                Arrays.asList(R.string.address_RCR0),
                R.string.code_RCR,
                new LatLng(45.42235621949115, -75.68506523966789),
                new PolygonOptions().add(
                        new LatLng(45.42219290579387, -75.68483725190163),
                        new LatLng(45.422199965473546, -75.68484462797642),
                        new LatLng(45.422149135760165, -75.68496331572533),
                        new LatLng(45.422240440953345, -75.68504177033901),
                        new LatLng(45.422220673862185, -75.68510077893734),
                        new LatLng(45.42220749579756, -75.68508803844452),
                        new LatLng(45.422182551595434, -75.6851664930582),
                        new LatLng(45.42231668538299, -75.68528652191162),
                        new LatLng(45.42230821378477, -75.68531200289726),
                        new LatLng(45.4223284514895, -75.68532809615135),
                        new LatLng(45.42238492876663, -75.68526573479176),
                        new LatLng(45.422489882223246, -75.68499483168125),
                        new LatLng(45.42250964922013, -75.68500690162182),
                        new LatLng(45.42253129878024, -75.68494521081448),
                        new LatLng(45.422510119862864, -75.68492643535137),
                        new LatLng(45.42255153640501, -75.68481244146824),
                        new LatLng(45.422468232647304, -75.68473599851131),
                        new LatLng(45.422464467502806, -75.68465083837509),
                        new LatLng(45.42255294833203, -75.68442150950432),
                        new LatLng(45.42221126095921, -75.68410366773605),
                        new LatLng(45.42220514257143, -75.68411909043789),
                        new LatLng(45.422166079003055, -75.6840768456459),
                        new LatLng(45.42212042636476, -75.68419151008129),
                        new LatLng(45.4221599606104, -75.68422503769398),
                        new LatLng(45.42215101834295, -75.68425118923187),
                        new LatLng(45.42216843223081, -75.68426996469498),
                        new LatLng(45.4221599606104, -75.68429008126259),
                        new LatLng(45.42234351210231, -75.68447381258011))
        ));

        buildings.add(new Building(
                R.string.name_ARC,
                R.string.code_ARC,
                Arrays.asList(R.string.address_ARC0),
                R.string.code_ARC,
                new LatLng(45.42093862202641, -75.67878887057304),
                new PolygonOptions().add(
                        new LatLng(45.42155423645318, -75.67958682775497),
                        new LatLng(45.421663427301986, -75.67931860685349),
                        new LatLng(45.421005455110155, -75.6787459552288),
                        new LatLng(45.42115135804608, -75.67839592695236),
                        new LatLng(45.42094238727272, -75.67821353673935),
                        new LatLng(45.420822840581565, -75.67849583923817),
                        new LatLng(45.4208934390518, -75.67856088280678),
                        new LatLng(45.420754124652426, -75.67890554666519))
        ));

        buildings.add(new Building(
                R.string.name_ODL,
                R.string.code_ODL,
                Arrays.asList(R.string.address_ODL0),
                R.string.code_ODL,
                new LatLng(45.42261601437037, -75.68608716130257),
                new PolygonOptions().add(
                        new LatLng(45.42270595620629, -75.68616757159612),
                        new LatLng(45.42274172491586, -75.68609716360947),
                        new LatLng(45.4227144277448, -75.68607101207158),
                        new LatLng(45.42270219107765, -75.68609314029595),
                        new LatLng(45.42267536452881, -75.68607034151933),
                        new LatLng(45.42267960030052, -75.68606162434003),
                        new LatLng(45.42265936272168, -75.68604150777242),
                        new LatLng(45.422649479250296, -75.686056259922),
                        new LatLng(45.42263488936083, -75.68604150777242),
                        new LatLng(45.42263724256904, -75.68603614335439),
                        new LatLng(45.42261982882578, -75.68601602678677),
                        new LatLng(45.42261371048228, -75.68602809672734),
                        new LatLng(45.42258829581754, -75.68600060408494),
                        new LatLng(45.42256241049913, -75.68604486053368),
                        new LatLng(45.42258076554432, -75.6860663182058),
                        new LatLng(45.42255440958012, -75.68612264459512),
                        new LatLng(45.422609945347475, -75.68617628877541),
                        new LatLng(45.422646184759465, -75.68611392741582))
        ));

        buildings.add(new Building(
                R.string.name_KEW,
                R.string.code_KEW,
                Arrays.asList(R.string.address_KEW0),
                R.string.code_KEW,
                new LatLng(45.42388673296806, -75.68202495574951),
                new PolygonOptions().add(
                        new LatLng(45.42379401854135, -75.68212285637856),
                        new LatLng(45.42387496718627, -75.68219058215618),
                        new LatLng(45.42397897661199, -75.68194516003132),
                        new LatLng(45.42387120213559, -75.68185865879059),
                        new LatLng(45.423835434141616, -75.68194784224033),
                        new LatLng(45.42385943635059, -75.68196661770344))
        ));

        buildings.add(new Building(
                R.string.name_KEB,
                R.string.code_KEB,
                Arrays.asList(R.string.address_KEB0),
                R.string.code_KEB,
                new LatLng(45.42320243102537, -75.6808152794838),
                new PolygonOptions().add(
                        new LatLng(45.423203972925485, -75.68091517777538),
                        new LatLng(45.42326327314535, -75.68077100904082),
                        new LatLng(45.42325809614451, -75.68076497407054),
                        new LatLng(45.423266567600194, -75.68074351639842),
                        new LatLng(45.42324538895861, -75.6807220587263),
                        new LatLng(45.423234564316544, -75.68074619860744),
                        new LatLng(45.42320209037779, -75.68071669430827),
                        new LatLng(45.4231470258303, -75.68086421580409),
                        new LatLng(45.42316773387157, -75.68088366181945),
                        new LatLng(45.42315879176379, -75.68090511949157),
                        new LatLng(45.42318561808289, -75.68092389495467),
                        new LatLng(45.42319220700144, -75.68090377838706))
        ));

        buildings.add(new Building(
                R.string.name_PRZ,
                R.string.code_PRZ,
                Arrays.asList(R.string.address_PRZ0),
                R.string.code_PRZ,
                new LatLng(45.42378884158921, -75.68472996354103),
                new PolygonOptions().add(
                        new LatLng(45.42357517424001, -75.68481177091604),
                        new LatLng(45.423758721130774, -75.68497270345694),
                        new LatLng(45.4237398958361, -75.68501561880117),
                        new LatLng(45.42381802076796, -75.68508133292204),
                        new LatLng(45.42401474451502, -75.68465083837515),
                        new LatLng(45.42374366089554, -75.68441614508635))
        ));

        buildings.add(new Building(
                R.string.name_STE,
                R.string.code_STE,
                Arrays.asList(R.string.address_STE0),
                R.string.code_STE,
                new LatLng(45.419387319207, -75.67864939570427),
                new PolygonOptions().add(
                        new LatLng(45.41957370371608, -75.67905306816101),
                        new LatLng(45.41954169833904, -75.67883044481277),
                        new LatLng(45.41958688239542, -75.67875668406487),
                        new LatLng(45.419599119737796, -75.67864000797272),
                        new LatLng(45.41955864236442, -75.6785474717617),
                        new LatLng(45.41949180756815, -75.67851528525352),
                        new LatLng(45.41943156205021, -75.67815586924553),
                        new LatLng(45.41939484990619, -75.67816592752934),
                        new LatLng(45.41938543653205, -75.67811295390129),
                        new LatLng(45.41935907907623, -75.67811764776707),
                        new LatLng(45.41937037513024, -75.67817397415638),
                        new LatLng(45.41932707357756, -75.67818939685822),
                        new LatLng(45.419313424168216, -75.67807473242283),
                        new LatLng(45.41920658212582, -75.67809820175171),
                        new LatLng(45.41920422877458, -75.6780780851841),
                        new LatLng(45.419142570937495, -75.67808881402016),
                        new LatLng(45.41933648696141, -75.67931056022644),
                        new LatLng(45.41939626191217, -75.67928105592728),
                        new LatLng(45.41939061388802, -75.67923881113529),
                        new LatLng(45.41949745558219, -75.67920058965683),
                        new LatLng(45.41948757155728, -75.67908592522144))
        ));

        buildings.add(new Building(
                R.string.name_SMD,
                R.string.code_SMD,
                Arrays.asList(R.string.address_SMD0),
                R.string.code_SMD,
                new LatLng(45.4233596235397, -75.68564996123314),
                new PolygonOptions().add(
                        new LatLng(45.423564609638184, -75.68611999037455),
                        new LatLng(45.42359237703184, -75.6860482412834),
                        new LatLng(45.423588141328594, -75.68604891183566),
                        new LatLng(45.42356413900428, -75.6860294658203),
                        new LatLng(45.42357637548462, -75.68600130262564),
                        new LatLng(45.42340788832982, -75.68586182775687),
                        new LatLng(45.42341306531692, -75.68584774615954),
                        new LatLng(45.42337635576175, -75.68581824186037),
                        new LatLng(45.423442244689916, -75.68567340257357),
                        new LatLng(45.42365450064276, -75.68584372284596),
                        new LatLng(45.423652618110104, -75.6857793498296),
                        new LatLng(45.42361026110868, -75.68574515166466),
                        new LatLng(45.42361873251149, -75.68571900012677),
                        new LatLng(45.42365732444165, -75.68570491852944),
                        new LatLng(45.423703446469865, -75.68559695961659),
                        new LatLng(45.42369732824381, -75.6855533737201),
                        new LatLng(45.423624850746094, -75.6854910123605),
                        new LatLng(45.4235796699212, -75.68549637677853),
                        new LatLng(45.4235359009626, -75.68560366513913),
                        new LatLng(45.423541548572075, -75.68565261545365),
                        new LatLng(45.423534018426, -75.68567407312577),
                        new LatLng(45.423461070083846, -75.6856170761842),
                        new LatLng(45.4235010740251, -75.68551917555516),
                        new LatLng(45.4235359009626, -75.68554331543629),
                        new LatLng(45.42357684611845, -75.685444744255),
                        new LatLng(45.42353966603565, -75.68541725161259),
                        new LatLng(45.423564139004306, -75.6853649485368),
                        new LatLng(45.42341824230356, -75.68524693134015),
                        new LatLng(45.423233282395834, -75.68570558908169),
                        new LatLng(45.423191866353804, -75.68567876699154),
                        new LatLng(45.42312597713346, -75.68584975781624),
                        new LatLng(45.42315374474283, -75.68587389769738),
                        new LatLng(45.42315798047866, -75.68586182775681),
                        new LatLng(45.42318198297567, -75.6858866381902),
                        new LatLng(45.423171158321416, -75.68592016580288),
                        new LatLng(45.42311091672942, -75.68594430568402),
                        new LatLng(45.42307891335753, -75.68601940753643),
                        new LatLng(45.423159392390524, -75.68607975723927),
                        new LatLng(45.423183865524, -75.68601806643193),
                        new LatLng(45.42329540640191, -75.68602410140221),
                        new LatLng(45.42330576039626, -75.68600130262558),
                        new LatLng(45.42350248592838, -75.68616290571873),
                        new LatLng(45.42353072398677, -75.6860938388366))
        ));

        buildings.add(new Building(
                R.string.name_SCS,
                R.string.code_SCS,
                Arrays.asList(R.string.address_SCS0),
                R.string.code_SCS,
                new LatLng(45.419777, -75.677422),
                new PolygonOptions().add(
                        new LatLng(45.420501851757045, -75.67857295274734),
                        new LatLng(45.420637401512586, -75.67815251648426),
                        new LatLng(45.42066517034596, -75.67817330360413),
                        new LatLng(45.42071223613404, -75.67805662751198),
                        new LatLng(45.420422780916056, -75.67781254649162),
                        new LatLng(45.420410543752226, -75.67784138023853),
                        new LatLng(45.41998930130232, -75.67747995257378),
                        new LatLng(45.42030182114145, -75.67673094570637),
                        new LatLng(45.42020015825109, -75.6766464561224),
                        new LatLng(45.42019309832135, -75.67666657269001),
                        new LatLng(45.41997424006155, -75.67647948861122),
                        new LatLng(45.41997847603592, -75.67645199596882),
                        new LatLng(45.419703607707, -75.6762246787548),
                        new LatLng(45.419364727103506, -75.67703001201153),
                        new LatLng(45.4195732330489, -75.67719295620918),
                        new LatLng(45.41952993165181, -75.6773391366005),
                        new LatLng(45.41952475430862, -75.67744709551334),
                        new LatLng(45.4195280489816, -75.67755237221718),
                        new LatLng(45.4195473463481, -75.67764893174171),
                        new LatLng(45.41957182104735, -75.67772135138512),
                        new LatLng(45.41958829439662, -75.6777099519968),
                        new LatLng(45.41960335574034, -75.67774750292301),
                        new LatLng(45.41967348506907, -75.67783065140247),
                        new LatLng(45.41964100908204, -75.6779084354639),
                        new LatLng(45.42018321441827, -75.67835032939911),
                        new LatLng(45.42024392979582, -75.67841067910194),
                        new LatLng(45.4202641682405, -75.67841805517673),
                        new LatLng(45.42026652154754, -75.67841202020645))
        ));

        buildings.add(new Building(
                R.string.name_TBT,
                R.string.code_TBT,
                Arrays.asList(R.string.address_TBT0),
                R.string.code_TBT,
                new LatLng(45.424528670303744, -75.68632051348686),
                new PolygonOptions().add(
                        new LatLng(45.42467529473135, -75.68701920094679),
                        new LatLng(45.424724239673445, -75.68687972607802),
                        new LatLng(45.42476612521517, -75.68688039663027),
                        new LatLng(45.4249604925471, -75.68642173888873),
                        new LatLng(45.42483201252133, -75.68631042721461),
                        new LatLng(45.424782126425164, -75.68642710330676),
                        new LatLng(45.42464140974659, -75.68630238058756),
                        new LatLng(45.424661175990174, -75.68626684131812),
                        new LatLng(45.42463623287213, -75.68624136033247),
                        new LatLng(45.424647998495224, -75.68621520879458),
                        new LatLng(45.42450775210837, -75.6861032265682),
                        new LatLng(45.424496457082185, -75.68612334313582),
                        new LatLng(45.42448186767, -75.68610993209074),
                        new LatLng(45.424460689484356, -75.686155529644),
                        new LatLng(45.42432185451496, -75.68604019465636),
                        new LatLng(45.42436374035524, -75.68593022408675),
                        new LatLng(45.424246554049766, -75.6858323234577),
                        new LatLng(45.42417831291643, -75.68599862041663),
                        new LatLng(45.42413454442194, -75.68596442225169),
                        new LatLng(45.42409030526405, -75.68606969895552),
                        new LatLng(45.424132191276115, -75.68610590877722),
                        new LatLng(45.42407477448761, -75.68625007751177),
                        new LatLng(45.424009356927876, -75.6862541008253),
                        new LatLng(45.42395711695166, -75.68637815299223),
                        new LatLng(45.424234317714685, -75.68661217572878),
                        new LatLng(45.42432844330089, -75.68662089290808),
                        new LatLng(45.42428279241116, -75.68674293341826))
        ));

        buildings.add(new Building(
                R.string.name_SMN,
                R.string.code_SMN,
                Arrays.asList(R.string.address_SMN0,
                        R.string.address_SMN1),
                R.string.code_SMN,
                new LatLng(45.42529484402002, -75.68658873438835),
                new PolygonOptions().add(
                        new LatLng(45.42511036088156, -75.68663701415062),
                        new LatLng(45.4253475533774, -75.68683817982674),
                        new LatLng(45.42546050183467, -75.68655788898468),
                        new LatLng(45.4252393108938, -75.68637013435364),
                        new LatLng(45.42516118792885, -75.68654850125313),
                        new LatLng(45.425151775516134, -75.68653911352158))
        ));

        buildings.add(new Building(
                R.string.name_THN,
                R.string.code_THN,
                Arrays.asList(R.string.address_THN0,
                        R.string.address_THN1,
                        R.string.address_THN2),
                R.string.code_THN,
                new LatLng(45.42369848016573, -75.68360611796379),
                new PolygonOptions().add(
                        new LatLng(45.423530934643814, -75.68375766277313),
                        new LatLng(45.42355493698228, -75.683778449893),
                        new LatLng(45.42359117578758, -75.68370200693607),
                        new LatLng(45.423695656368935, -75.68379923701286),
                        new LatLng(45.42371401104569, -75.68375363945961),
                        new LatLng(45.42373895457122, -75.68377643823624),
                        new LatLng(45.42382602150789, -75.68355716764927),
                        new LatLng(45.423803431180446, -75.68353772163391),
                        new LatLng(45.423816138240745, -75.68350151181221),
                        new LatLng(45.423861318876355, -75.68353101611137),
                        new LatLng(45.42394885625502, -75.68330705165863),
                        new LatLng(45.4239017931651, -75.6832654774189),
                        new LatLng(45.42393850237861, -75.68316355347633),
                        new LatLng(45.4238406110895, -75.68308174610138),
                        new LatLng(45.423803431180446, -75.68317025899887),
                        new LatLng(45.42376719251135, -75.68314008414745),
                        new LatLng(45.423682949281535, -75.68334527313709),
                        new LatLng(45.423690950040594, -75.68335130810738),
                        new LatLng(45.42368200801566, -75.683374106884),
                        new LatLng(45.42369095004062, -75.68338349461555),
                        new LatLng(45.42367683105324, -75.68341970443726),
                        new LatLng(45.42365518193243, -75.68339958786964),
                        new LatLng(45.42356482029507, -75.68361684679985),
                        new LatLng(45.42358458691559, -75.68363562226295))
        ));

        buildings.add(new Building(
                R.string.name_STN,
                R.string.code_STN,
                Arrays.asList(R.string.address_STN0),
                R.string.code_STN,
                new LatLng(45.42211289602915, -75.68477757275105),
                new PolygonOptions().add(
                        new LatLng(45.42192275472157, -75.68467028439045),
                        new LatLng(45.42202394386353, -75.684769526124),
                        new LatLng(45.42201358963402, -75.68479299545288),
                        new LatLng(45.422028650330766, -75.68481042981148),
                        new LatLng(45.42202064933613, -75.68483591079712),
                        new LatLng(45.42212042636481, -75.68491972982883),
                        new LatLng(45.42213407509553, -75.68488620221615),
                        new LatLng(45.42215101834303, -75.68490296602249),
                        new LatLng(45.42216325512965, -75.68487547338009),
                        new LatLng(45.42217266804059, -75.68488352000713),
                        new LatLng(45.422279504470275, -75.68462803959846),
                        new LatLng(45.4220385339109, -75.6844013929367))
        ));

        buildings.add(new Building(
                R.string.name_UCU,
                R.string.code_UCU,
                Arrays.asList(R.string.address_UCU0),
                R.string.code_UCU,
                new LatLng(45.422612, -75.683881),
                new PolygonOptions().add(
                        new LatLng(45.422778174903016, -75.68401646795462),
                        new LatLng(45.42290404642598, -75.68373017013073),
                        new LatLng(45.42295158098667, -75.68377509713173),
                        new LatLng(45.42296711207209, -75.68374022841454),
                        new LatLng(45.422919106885146, -75.68369597196579),
                        new LatLng(45.422960052488335, -75.68360276520252),
                        new LatLng(45.42300005678458, -75.68364098668098),
                        new LatLng(45.423055592113606, -75.68350955843925),
                        new LatLng(45.423183605545184, -75.68361684679985),
                        new LatLng(45.42320807866818, -75.68355314433575),
                        new LatLng(45.42318595873063, -75.68353034555912),
                        new LatLng(45.42327585033806, -75.6832916289568),
                        new LatLng(45.4231539554012, -75.68317964673042),
                        new LatLng(45.42313560054239, -75.68322323262691),
                        new LatLng(45.42303582530785, -75.68313471972942),
                        new LatLng(45.42305512147545, -75.68308308720589),
                        new LatLng(45.42298876145678, -75.68301804363728),
                        new LatLng(45.422941226927335, -75.68313539028168),
                        new LatLng(45.42292663711326, -75.68311996757984),
                        new LatLng(45.42288992724178, -75.68319506943226),
                        new LatLng(45.42285321734644, -75.68316221237183),
                        new LatLng(45.42282686150942, -75.68322256207466),
                        new LatLng(45.42283674494976, -75.68323329091072),
                        new LatLng(45.422817919347644, -75.68327620625496),
                        new LatLng(45.422809447824655, -75.68327084183693),
                        new LatLng(45.42275532417552, -75.68339355289936),
                        new LatLng(45.42276473698779, -75.68340696394444),
                        new LatLng(45.422745440720924, -75.68345122039318),
                        new LatLng(45.42273602790545, -75.68344317376614),
                        new LatLng(45.42271202521883, -75.6834988296032),
                        new LatLng(45.42280285886145, -75.68357191979885),
                        new LatLng(45.42276170248443, -75.68365772249888),
                        new LatLng(45.42247602291757, -75.68340559485148),
                        new LatLng(45.42250473213214, -75.68334055128287),
                        new LatLng(45.42235695011774, -75.68321784022044),
                        new LatLng(45.42231600407716, -75.68330903532694),
                        new LatLng(45.42237718780499, -75.68337005558203),
                        new LatLng(45.42235695011774, -75.68342034700106),
                        new LatLng(45.42249343670518, -75.68354104640673),
                        new LatLng(45.42245343204996, -75.68362754764746),
                        new LatLng(45.42239836677227, -75.68357591512392),
                        new LatLng(45.42236542170864, -75.68365571084212),
                        new LatLng(45.42242284023563, -75.68371270778368),
                        new LatLng(45.42241342736637, -75.68373081269453),
                        new LatLng(45.42235930333755, -75.68372745993327),
                        new LatLng(45.422323063741445, -75.68373550656031),
                        new LatLng(45.42226517446823, -75.68386492314528),
                        new LatLng(45.42227411671756, -75.68394337775896),
                        new LatLng(45.42236024462546, -75.68401646795462),
                        new LatLng(45.42241954573158, -75.68399635138701),
                        new LatLng(45.42243837146652, -75.68395410659502),
                        new LatLng(45.42246566877103, -75.68397824647616),
                        new LatLng(45.42243178246, -75.68406273606013),
                        new LatLng(45.42248967156238, -75.68411302747916),
                        new LatLng(45.422525440408975, -75.68402652623843),
                        new LatLng(45.4226468660613, -75.6841230857629),
                        new LatLng(45.42271746225073, -75.68396483543103))
        ));

        buildings.add(new Building(
                R.string.name_VNR,
                R.string.code_VNR,
                Arrays.asList(R.string.address_VNR0),
                R.string.code_VNR,
                new LatLng(45.42126054967401, -75.68309649825096),
                new PolygonOptions().add(
                        new LatLng(45.421080759898324, -75.68312466144562),
                        new LatLng(45.421204071272136, -75.6832292675972),
                        new LatLng(45.42119089297024, -75.68326145410538),
                        new LatLng(45.42122195610552, -75.68328894674778),
                        new LatLng(45.42122619198628, -75.68327754735947),
                        new LatLng(45.42169496082677, -75.68368121981621),
                        new LatLng(45.42177638313025, -75.68348407745361),
                        new LatLng(45.4216215394582, -75.68334929645061),
                        new LatLng(45.42162671660911, -75.68333990871906),
                        new LatLng(45.42159424174555, -75.6833104044199),
                        new LatLng(45.42158671133974, -75.68332582712173),
                        new LatLng(45.42130149648008, -75.68308040499687),
                        new LatLng(45.42145351712091, -75.68272031843662),
                        new LatLng(45.42143751496746, -75.68270489573479),
                        new LatLng(45.42151046592431, -75.68253323435783),
                        new LatLng(45.42149917029842, -75.68252317607403),
                        new LatLng(45.42152976261324, -75.6824541091919),
                        new LatLng(45.42135844543681, -75.68230725824833),
                        new LatLng(45.42124454746588, -75.68257682025433),
                        new LatLng(45.42131514540883, -75.68263918161392),
                        new LatLng(45.42117112551158, -75.68297781050205),
                        new LatLng(45.42115182870008, -75.68296104669571))
        ));

        buildings.add(new Building(
                R.string.name_NCL,
                R.string.code_NCL,
                Arrays.asList(R.string.address_NCL0),
                R.string.code_NCL,
                new LatLng(45.426543, -75.689943),
                new PolygonOptions().add(
                        new LatLng(45.42668012012779, -75.69028344931792),
                        new LatLng(45.426780359528614, -75.69004540326785),
                        new LatLng(45.42646034579509, -75.68977382960509),
                        new LatLng(45.426357752772965, -75.69000181737135))
        ));

        buildings.add(new Building(
                R.string.name_POR,
                R.string.code_POR,
                Arrays.asList(R.string.address_POR0),
                R.string.code_POR,
                new LatLng(45.42240610773098, -75.68185865879059),
                new PolygonOptions().add(
                        new LatLng(45.42243178246, -75.68198201241682),
                        new LatLng(45.42248590641931, -75.68184589030932),
                        new LatLng(45.42237295201059, -75.68175067188929),
                        new LatLng(45.422318357298685, -75.68188478234003))
        ));

        buildings.add(new Building(
                R.string.name_SCR,
                R.string.code_SCR,
                Arrays.asList(R.string.address_SCR0),
                R.string.code_SCR,
                new LatLng(45.42459, -75.68411),
                new PolygonOptions().add(
                        new LatLng(45.42453055280719, -75.68405270576477),
                        new LatLng(45.42457667412203, -75.68423509597778),
                        new LatLng(45.42466185726771, -75.68415999412537),
                        new LatLng(45.42466468101619, -75.68402588367462),
                        new LatLng(45.42459361663639, -75.68394541740417))
        ));

        buildings.add(new Building(
                R.string.name_FSS,
                R.string.code_FSS,
                Arrays.asList(R.string.address_FSS0),
                R.string.code_FSS,
                new LatLng(45.42172461173702, -75.6838783621788),
                new PolygonOptions().add(
                        new LatLng(45.42118430381811, -75.68334527313709),
                        new LatLng(45.421157947202, -75.68341434001923),
                        new LatLng(45.421299143216146, -75.68367652595043),
                        new LatLng(45.42143045519244, -75.68379655480385),
                        new LatLng(45.42175002679052, -75.68421967327595),
                        new LatLng(45.42192369601673, -75.68382270634174),
                        new LatLng(45.42184415651872, -75.6837435811758),
                        new LatLng(45.42192087213115, -75.68354643881321),
                        new LatLng(45.421794738430975, -75.68344116210938),
                        new LatLng(45.421695431476245, -75.68368189036846),
                        new LatLng(45.42141021716581, -75.6834364682436),
                        new LatLng(45.421381036742574, -75.68350151181221))
        ));

        buildings.add(new Building(
                R.string.name_CTE,
                R.string.code_CTE,
                Arrays.asList(R.string.address_CTE0),
                R.string.code_CTE,
                new LatLng(45.42074094624547, -75.67957207560539),
                new PolygonOptions().add(
                        new LatLng(45.42044207797676, -75.67946143448353),
                        new LatLng(45.42051314758246, -75.67951709032059),
                        new LatLng(45.42050514637305, -75.67953519523144),
                        new LatLng(45.420528679338695, -75.67955195903778),
                        new LatLng(45.42045337381411, -75.67973837256432),
                        new LatLng(45.42051267692312, -75.67974038422108),
                        new LatLng(45.420512206263766, -75.67976452410221),
                        new LatLng(45.42054091647693, -75.67976586520672),
                        new LatLng(45.420543269772466, -75.67974306643009),
                        new LatLng(45.420645402703265, -75.67974172532558),
                        new LatLng(45.42075459530974, -75.67983694374561),
                        new LatLng(45.42076212582654, -75.6798356026411),
                        new LatLng(45.42086849426906, -75.67991875112057),
                        new LatLng(45.42094568186293, -75.67974977195263),
                        new LatLng(45.42088355527127, -75.67968472838402),
                        new LatLng(45.421148534121826, -75.67960023880005),
                        new LatLng(45.420788011970394, -75.67929714918137),
                        new LatLng(45.420672230216674, -75.6793561577797),
                        new LatLng(45.42060916200704, -75.67929714918137),
                        new LatLng(45.42055880152041, -75.67939907312393),
                        new LatLng(45.420491967908006, -75.6793400645256))
        ));
    }

        public static void search(String query) {
                System.out.println(query);
        }
}
