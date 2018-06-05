import java.io.InputStream;
import java.net.URLConnection;
import java.io.OutputStreamWriter;
import java.net.URL;
import netscape.javascript.JSObject;
import java.util.Date;
import java.util.Iterator;
import java.net.Socket;
import java.io.IOException;
import java.applet.Applet;
import java.util.HashMap;
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

public final class Client extends Class47 implements Class288
{
    @ObfuscatedName("ny")
    @ObfuscatedGetter(intValue = -219746745)
    static int field603;
    @ObfuscatedName("nl")
    @ObfuscatedGetter(intValue = -1154390057)
    static int field830;
    @ObfuscatedName("ni")
    @ObfuscatedGetter(longValue = -91560525507386839L)
    static long field791;
    @ObfuscatedName("nd")
    static boolean[] field697;
    @ObfuscatedName("nj")
    static boolean[] field723;
    @ObfuscatedName("nm")
    static boolean[] field788;
    @ObfuscatedName("lz")
    static boolean field772;
    @ObfuscatedName("mc")
    @ObfuscatedGetter(intValue = -1835075419)
    static int field801;
    @ObfuscatedName("nc")
    static boolean field792;
    @ObfuscatedName("mh")
    @ObfuscatedGetter(intValue = 953361159)
    static int field647;
    @ObfuscatedName("ro")
    @ObfuscatedGetter(intValue = -1150401375)
    public static int field650;
    @ObfuscatedName("ls")
    static boolean field601;
    @ObfuscatedName("oq")
    static boolean field813;
    @ObfuscatedName("lf")
    @ObfuscatedGetter(intValue = -948387719)
    static int field753;
    @ObfuscatedName("lk")
    @ObfuscatedGetter(intValue = -1681068877)
    static int field749;
    @ObfuscatedName("lh")
    @ObfuscatedGetter(intValue = 1025348025)
    static int field757;
    @ObfuscatedName("mw")
    @ObfuscatedSignature(signature = "Lgx;")
    static Class202 field783;
    @ObfuscatedName("lq")
    @ObfuscatedSignature(signature = "Lhi;")
    static Class230 field752;
    @ObfuscatedName("nv")
    @ObfuscatedGetter(intValue = -1675720495)
    static int field790;
    @ObfuscatedName("np")
    static int[] field786;
    @ObfuscatedName("nt")
    static int[] field641;
    @ObfuscatedName("la")
    @ObfuscatedGetter(intValue = 333708905)
    static int field758;
    @ObfuscatedName("nx")
    static int[] field787;
    @ObfuscatedName("ne")
    static int[] field789;
    @ObfuscatedName("rl")
    @ObfuscatedSignature(signature = "Lbz;")
    static final Class59 field849;
    @ObfuscatedName("my")
    @ObfuscatedSignature(signature = "Lgn;")
    static Class205 field638;
    @ObfuscatedName("lu")
    @ObfuscatedGetter(intValue = 217795627)
    static int field696;
    @ObfuscatedName("le")
    @ObfuscatedGetter(intValue = -813390517)
    static int field760;
    @ObfuscatedName("py")
    @ObfuscatedGetter(intValue = 880343809)
    static int field815;
    @ObfuscatedName("ok")
    @ObfuscatedGetter(intValue = -1345621773)
    static int field812;
    @ObfuscatedName("ru")
    static int[] field850;
    @ObfuscatedName("rg")
    static int[] field596;
    @ObfuscatedName("mi")
    static int[] field766;
    @ObfuscatedName("ml")
    @ObfuscatedGetter(intValue = -490868275)
    static int field767;
    @ObfuscatedName("lp")
    static boolean field763;
    @ObfuscatedName("na")
    static long[] field797;
    @ObfuscatedName("me")
    @ObfuscatedGetter(intValue = -2132588897)
    static int field765;
    @ObfuscatedName("ox")
    @ObfuscatedGetter(intValue = 699093181)
    static int field651;
    @ObfuscatedName("os")
    @ObfuscatedGetter(intValue = -1771806997)
    static int field810;
    @ObfuscatedName("qw")
    @ObfuscatedGetter(intValue = -1805517847)
    static int field842;
    @ObfuscatedName("ot")
    @ObfuscatedGetter(longValue = -4301137644112550077L)
    static long field722;
    @ObfuscatedName("pb")
    static boolean field822;
    @ObfuscatedName("qy")
    @ObfuscatedSignature(signature = "Lhd;")
    static Class227 field841;
    @ObfuscatedName("mj")
    @ObfuscatedGetter(intValue = -1369280353)
    static int field695;
    @ObfuscatedName("pm")
    @ObfuscatedGetter(intValue = 2142255299)
    static int field656;
    @ObfuscatedName("px")
    static int[] field819;
    @ObfuscatedName("pa")
    @ObfuscatedGetter(intValue = -351528433)
    static int field814;
    @ObfuscatedName("or")
    @ObfuscatedGetter(intValue = -1068898215)
    static int field808;
    @ObfuscatedName("qk")
    @ObfuscatedGetter(intValue = -2039961607)
    static int field586;
    @ObfuscatedName("lb")
    @ObfuscatedSignature(signature = "Lhi;")
    static Class230 field755;
    @ObfuscatedName("ol")
    @ObfuscatedGetter(intValue = 996143867)
    static int field809;
    @ObfuscatedName("oh")
    @ObfuscatedGetter(intValue = 1357084131)
    static int field798;
    @ObfuscatedName("pc")
    static int[] field817;
    @ObfuscatedName("oi")
    @ObfuscatedGetter(intValue = -619539199)
    static int field811;
    @ObfuscatedName("pd")
    @ObfuscatedSignature(signature = "[Lcg;")
    static Class91[] field719;
    @ObfuscatedName("pu")
    static int[] field676;
    @ObfuscatedName("pf")
    static int[] field820;
    @ObfuscatedName("oy")
    @ObfuscatedGetter(intValue = -326408871)
    static int field724;
    @ObfuscatedName("rd")
    static ArrayList field781;
    @ObfuscatedName("pe")
    static boolean[] field823;
    @ObfuscatedName("rc")
    @ObfuscatedGetter(intValue = 1762427)
    static int field606;
    @ObfuscatedName("qd")
    static int[] field824;
    @ObfuscatedName("qr")
    static int[] field825;
    @ObfuscatedName("qe")
    static int[] field826;
    @ObfuscatedName("qv")
    static int[] field705;
    @ObfuscatedName("on")
    @ObfuscatedSignature(signature = "[Lll;")
    static Class318[] field816;
    @ObfuscatedName("od")
    static int[] field805;
    @ObfuscatedName("oc")
    static int[] field806;
    @ObfuscatedName("md")
    @ObfuscatedGetter(intValue = -59230609)
    static int field775;
    @ObfuscatedName("ob")
    @ObfuscatedGetter(intValue = -1015108907)
    static int field799;
    @ObfuscatedName("qm")
    @ObfuscatedGetter(intValue = -263632309)
    static int field762;
    @ObfuscatedName("qu")
    @ObfuscatedGetter(intValue = 623349101)
    static int field837;
    @ObfuscatedName("qq")
    @ObfuscatedGetter(intValue = -1734003973)
    static int field838;
    @ObfuscatedName("qb")
    @ObfuscatedGetter(intValue = 1052760379)
    static int field662;
    @ObfuscatedName("qx")
    static short field802;
    @ObfuscatedName("qc")
    static short field829;
    @ObfuscatedName("ou")
    static int[] field773;
    @ObfuscatedName("om")
    static int[] field800;
    @ObfuscatedName("mo")
    @ObfuscatedSignature(signature = "Lgn;")
    static Class205 field778;
    @ObfuscatedName("qh")
    static short field834;
    @ObfuscatedName("qj")
    static short field835;
    @ObfuscatedName("mz")
    @ObfuscatedGetter(intValue = -627411345)
    static int field770;
    @ObfuscatedName("qt")
    static short field833;
    @ObfuscatedName("mk")
    @ObfuscatedSignature(signature = "Lgn;")
    static Class205 field779;
    @ObfuscatedName("qo")
    static short field848;
    @ObfuscatedName("qz")
    static short field831;
    @ObfuscatedName("qs")
    static short field832;
    @ObfuscatedName("mv")
    @ObfuscatedGetter(intValue = 1778572125)
    static int field828;
    @ObfuscatedName("qg")
    @ObfuscatedGetter(intValue = 119023177)
    static int field840;
    @ObfuscatedName("mf")
    static int[] field764;
    @ObfuscatedName("mm")
    static int[] field690;
    @ObfuscatedName("mx")
    @ObfuscatedGetter(intValue = -103494083)
    static int field769;
    @ObfuscatedName("qp")
    @ObfuscatedSignature(signature = "[Lu;")
    static Class4[] field844;
    @ObfuscatedName("mr")
    @ObfuscatedGetter(intValue = 1283415023)
    static int field793;
    @ObfuscatedName("nq")
    @ObfuscatedGetter(intValue = 220873495)
    static int field795;
    @ObfuscatedName("nz")
    @ObfuscatedGetter(intValue = -352691883)
    static int field630;
    @ObfuscatedName("ms")
    @ObfuscatedGetter(intValue = -1120678843)
    static int field774;
    @ObfuscatedName("nb")
    static String field796;
    @ObfuscatedName("rr")
    @ObfuscatedSignature(signature = "Lbg;")
    static Class61 field665;
    @ObfuscatedName("nu")
    static int[] field731;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "[Lfk;")
    static Class164[] field642;
    @ObfuscatedName("ag")
    static boolean field580;
    @ObfuscatedName("bk")
    @ObfuscatedGetter(intValue = -33369237)
    public static int field581;
    @ObfuscatedName("bp")
    @ObfuscatedGetter(intValue = -295549115)
    static int field632;
    @ObfuscatedName("bj")
    @ObfuscatedGetter(intValue = 1999635431)
    static int field777;
    @ObfuscatedName("bh")
    public static boolean field668;
    @ObfuscatedName("bz")
    static boolean field585;
    @ObfuscatedName("bu")
    @ObfuscatedGetter(intValue = -2057800147)
    static int field827;
    @ObfuscatedName("bn")
    @ObfuscatedGetter(intValue = -1305395647)
    static int field587;
    @ObfuscatedName("bb")
    static boolean field588;
    @ObfuscatedName("bx")
    @ObfuscatedGetter(intValue = 1544810619)
    static int field589;
    @ObfuscatedName("bc")
    static boolean field625;
    @ObfuscatedName("bs")
    @ObfuscatedGetter(intValue = 181352847)
    static int field591;
    @ObfuscatedName("be")
    @ObfuscatedGetter(longValue = -2452580139566453107L)
    static long field592;
    @ObfuscatedName("bv")
    @ObfuscatedGetter(intValue = -381181903)
    static int field593;
    @ObfuscatedName("br")
    @ObfuscatedGetter(intValue = -1985172807)
    static int field594;
    @ObfuscatedName("bd")
    @ObfuscatedGetter(intValue = -1157772735)
    static int field595;
    @ObfuscatedName("bw")
    static boolean field847;
    @ObfuscatedName("bf")
    static boolean field597;
    @ObfuscatedName("bt")
    @ObfuscatedGetter(intValue = -785638907)
    static int field598;
    @ObfuscatedName("bm")
    @ObfuscatedGetter(intValue = -940910327)
    static int field599;
    @ObfuscatedName("cy")
    @ObfuscatedGetter(intValue = 487683979)
    static int field600;
    @ObfuscatedName("cd")
    @ObfuscatedGetter(intValue = 348104391)
    static int field579;
    @ObfuscatedName("cb")
    @ObfuscatedGetter(intValue = 304122621)
    static int field602;
    @ObfuscatedName("co")
    @ObfuscatedGetter(intValue = -1345747809)
    static int field818;
    @ObfuscatedName("cq")
    @ObfuscatedGetter(intValue = -1571130755)
    static int field604;
    @ObfuscatedName("cl")
    @ObfuscatedGetter(intValue = -169903469)
    static int field605;
    @ObfuscatedName("ce")
    @ObfuscatedGetter(intValue = 1735835325)
    static int field637;
    @ObfuscatedName("cw")
    @ObfuscatedSignature(signature = "Lbm;")
    static Class77 field607;
    @ObfuscatedName("cf")
    @ObfuscatedSignature(signature = "Lbm;")
    static Class77 field780;
    @ObfuscatedName("cr")
    @ObfuscatedGetter(intValue = 1766129571)
    static int field609;
    @ObfuscatedName("cv")
    @ObfuscatedSignature(signature = "Lee;")
    static Class153 field839;
    @ObfuscatedName("cg")
    @ObfuscatedSignature(signature = "Lfd;")
    static Class157 field611;
    @ObfuscatedName("cs")
    @ObfuscatedGetter(intValue = -1705892515)
    static int js5State;
    @ObfuscatedName("ct")
    @ObfuscatedGetter(intValue = -1149880601)
    static int field768;
    @ObfuscatedName("dn")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field854;
    @ObfuscatedName("dp")
    @ObfuscatedGetter(intValue = 855035607)
    static int field614;
    @ObfuscatedName("db")
    @ObfuscatedGetter(intValue = 906778345)
    static int field615;
    @ObfuscatedName("dq")
    @ObfuscatedGetter(intValue = 350834505)
    static int field616;
    @ObfuscatedName("dx")
    @ObfuscatedGetter(intValue = -1184123167)
    static int field617;
    @ObfuscatedName("du")
    @ObfuscatedGetter(intValue = -1529742153)
    static int field618;
    @ObfuscatedName("da")
    @ObfuscatedSignature(signature = "Let;")
    static Class146 field619;
    @ObfuscatedName("di")
    static byte[] field620;
    @ObfuscatedName("df")
    @ObfuscatedSignature(signature = "[Lbr;")
    static Class72[] field843;
    @ObfuscatedName("dr")
    @ObfuscatedGetter(intValue = -931637927)
    static int field622;
    @ObfuscatedName("dj")
    static int[] field639;
    @ObfuscatedName("ew")
    @ObfuscatedGetter(intValue = -1812959769)
    static int field624;
    @ObfuscatedName("es")
    static int[] field666;
    @ObfuscatedName("ek")
    @ObfuscatedSignature(signature = "Lcf;")
    public static final Class87 field626;
    @ObfuscatedName("eh")
    @ObfuscatedGetter(intValue = -872392001)
    static int field627;
    @ObfuscatedName("ey")
    static boolean field756;
    @ObfuscatedName("ep")
    static boolean field629;
    @ObfuscatedName("ec")
    @ObfuscatedSignature(signature = "Ljb;")
    static Class280 field804;
    @ObfuscatedName("eb")
    static HashMap field631;
    @ObfuscatedName("ez")
    @ObfuscatedGetter(intValue = 2118745709)
    static int field754;
    @ObfuscatedName("en")
    @ObfuscatedGetter(intValue = -1718380447)
    static int field633;
    @ObfuscatedName("ee")
    @ObfuscatedGetter(intValue = -1158743607)
    static int field634;
    @ObfuscatedName("ev")
    @ObfuscatedGetter(intValue = 2017775761)
    static int field635;
    @ObfuscatedName("ef")
    @ObfuscatedGetter(intValue = 1254534349)
    static int field636;
    @ObfuscatedName("fp")
    @ObfuscatedGetter(intValue = -757062227)
    static int field751;
    @ObfuscatedName("fk")
    static boolean field759;
    @ObfuscatedName("fh")
    static int[][][] field645;
    @ObfuscatedName("fw")
    static final int[] field846;
    @ObfuscatedName("fi")
    @ObfuscatedGetter(intValue = -366074461)
    static int field700;
    @ObfuscatedName("fb")
    @ObfuscatedGetter(intValue = -1770894231)
    static int field643;
    @ObfuscatedName("gk")
    @ObfuscatedGetter(intValue = -1167871243)
    static int field584;
    @ObfuscatedName("gg")
    @ObfuscatedGetter(intValue = -1584882163)
    static int field836;
    @ObfuscatedName("gp")
    @ObfuscatedGetter(intValue = 480766297)
    static int field646;
    @ObfuscatedName("ge")
    static boolean field746;
    @ObfuscatedName("gv")
    @ObfuscatedGetter(intValue = -1967538949)
    static int field660;
    @ObfuscatedName("go")
    @ObfuscatedGetter(intValue = -873734229)
    static int field649;
    @ObfuscatedName("gd")
    @ObfuscatedGetter(intValue = -956184717)
    static int field717;
    @ObfuscatedName("gq")
    @ObfuscatedGetter(intValue = 697061695)
    static int field608;
    @ObfuscatedName("gu")
    @ObfuscatedGetter(intValue = -1956032167)
    static int field652;
    @ObfuscatedName("gh")
    @ObfuscatedGetter(intValue = 555568127)
    static int field653;
    @ObfuscatedName("gm")
    @ObfuscatedGetter(intValue = -423690659)
    static int field654;
    @ObfuscatedName("gj")
    @ObfuscatedGetter(intValue = 2077901199)
    static int field655;
    @ObfuscatedName("gl")
    @ObfuscatedGetter(intValue = -2071897465)
    static int field644;
    @ObfuscatedName("gn")
    @ObfuscatedGetter(intValue = -588909329)
    static int field657;
    @ObfuscatedName("gw")
    @ObfuscatedGetter(intValue = -1066346821)
    static int field613;
    @ObfuscatedName("gf")
    @ObfuscatedGetter(intValue = 170615499)
    static int field659;
    @ObfuscatedName("hk")
    @ObfuscatedGetter(intValue = 980219711)
    static int field750;
    @ObfuscatedName("hf")
    @ObfuscatedGetter(intValue = -1328369009)
    static int field661;
    @ObfuscatedName("hu")
    @ObfuscatedGetter(intValue = 1143307061)
    static int field853;
    @ObfuscatedName("hh")
    static boolean field663;
    @ObfuscatedName("hw")
    @ObfuscatedGetter(intValue = -1162289797)
    static int field664;
    @ObfuscatedName("hc")
    static boolean field807;
    @ObfuscatedName("hj")
    @ObfuscatedGetter(intValue = 1345648571)
    static int field738;
    @ObfuscatedName("ho")
    @ObfuscatedGetter(intValue = -351366969)
    static int field667;
    @ObfuscatedName("hm")
    @ObfuscatedGetter(intValue = 1968908975)
    static int field648;
    @ObfuscatedName("hg")
    static int[] field669;
    @ObfuscatedName("hn")
    static int[] field670;
    @ObfuscatedName("he")
    static int[] field671;
    @ObfuscatedName("hx")
    static int[] field672;
    @ObfuscatedName("hz")
    static int[] field673;
    @ObfuscatedName("hq")
    static int[] field674;
    @ObfuscatedName("hv")
    static int[] field675;
    @ObfuscatedName("hy")
    static String[] field721;
    @ObfuscatedName("ha")
    static int[][] field761;
    @ObfuscatedName("hd")
    @ObfuscatedGetter(intValue = -1388927477)
    static int field687;
    @ObfuscatedName("hr")
    @ObfuscatedGetter(intValue = -750974575)
    static int field679;
    @ObfuscatedName("hs")
    @ObfuscatedGetter(intValue = 43380069)
    static int field680;
    @ObfuscatedName("hi")
    @ObfuscatedGetter(intValue = 693082693)
    static int field681;
    @ObfuscatedName("hb")
    @ObfuscatedGetter(intValue = -24885111)
    static int field682;
    @ObfuscatedName("ht")
    @ObfuscatedGetter(intValue = 1433814191)
    static int field803;
    @ObfuscatedName("hl")
    @ObfuscatedGetter(intValue = 1652514069)
    static int field684;
    @ObfuscatedName("ih")
    static boolean field621;
    @ObfuscatedName("ik")
    @ObfuscatedGetter(intValue = -622016843)
    static int field686;
    @ObfuscatedName("im")
    @ObfuscatedGetter(intValue = -956121107)
    static int field582;
    @ObfuscatedName("if")
    @ObfuscatedGetter(intValue = -585352053)
    static int field688;
    @ObfuscatedName("id")
    @ObfuscatedGetter(intValue = 152338269)
    static int field678;
    @ObfuscatedName("iw")
    @ObfuscatedGetter(intValue = 552112291)
    static int field821;
    @ObfuscatedName("il")
    @ObfuscatedGetter(intValue = 1401656763)
    static int field691;
    @ObfuscatedName("ig")
    static boolean field689;
    @ObfuscatedName("ir")
    @ObfuscatedGetter(intValue = -1783112029)
    static int field693;
    @ObfuscatedName("iv")
    @ObfuscatedGetter(intValue = 478044173)
    static int field694;
    @ObfuscatedName("ia")
    static boolean field677;
    @ObfuscatedName("is")
    @ObfuscatedSignature(signature = "[Lbu;")
    static Class60[] field610;
    @ObfuscatedName("it")
    static String field734;
    @ObfuscatedName("ie")
    @ObfuscatedGetter(intValue = -191538519)
    static int field628;
    @ObfuscatedName("io")
    @ObfuscatedGetter(intValue = 886576793)
    static int field698;
    @ObfuscatedName("ib")
    static boolean field699;
    @ObfuscatedName("jl")
    @ObfuscatedGetter(intValue = -387109961)
    static int field658;
    @ObfuscatedName("jo")
    @ObfuscatedGetter(intValue = 668394239)
    static int field701;
    @ObfuscatedName("ji")
    static int[] field702;
    @ObfuscatedName("jp")
    static final int[] field703;
    @ObfuscatedName("jj")
    static String[] field704;
    @ObfuscatedName("jt")
    static boolean[] field709;
    @ObfuscatedName("jd")
    static int[] field706;
    @ObfuscatedName("jq")
    @ObfuscatedGetter(intValue = 1859815185)
    static int field707;
    @ObfuscatedName("jv")
    @ObfuscatedSignature(signature = "[[[Lgn;")
    static Class205[][][] field708;
    @ObfuscatedName("jn")
    @ObfuscatedSignature(signature = "Lgn;")
    static Class205 field714;
    @ObfuscatedName("jc")
    @ObfuscatedSignature(signature = "Lgn;")
    static Class205 field710;
    @ObfuscatedName("js")
    @ObfuscatedSignature(signature = "Lgn;")
    static Class205 field711;
    @ObfuscatedName("jm")
    static int[] field712;
    @ObfuscatedName("jw")
    static int[] field713;
    @ObfuscatedName("jg")
    static int[] field640;
    @ObfuscatedName("jr")
    @ObfuscatedGetter(intValue = 19997195)
    static int field715;
    @ObfuscatedName("jb")
    static boolean field716;
    @ObfuscatedName("kx")
    @ObfuscatedGetter(intValue = -1800746037)
    static int field771;
    @ObfuscatedName("kz")
    static int[] field718;
    @ObfuscatedName("ke")
    static int[] field851;
    @ObfuscatedName("kd")
    static int[] field720;
    @ObfuscatedName("kf")
    static int[] field794;
    @ObfuscatedName("km")
    static String[] field735;
    @ObfuscatedName("kt")
    static String[] field740;
    @ObfuscatedName("kn")
    static boolean[] field590;
    @ObfuscatedName("ky")
    static boolean field725;
    @ObfuscatedName("kv")
    static boolean field726;
    @ObfuscatedName("ka")
    static boolean field727;
    @ObfuscatedName("kj")
    static boolean field728;
    @ObfuscatedName("kk")
    @ObfuscatedGetter(intValue = -1794768613)
    static int field729;
    @ObfuscatedName("ko")
    @ObfuscatedGetter(intValue = -182788053)
    static int field730;
    @ObfuscatedName("kh")
    @ObfuscatedGetter(intValue = 1536477871)
    static int field623;
    @ObfuscatedName("kq")
    @ObfuscatedGetter(intValue = 1797385119)
    static int field732;
    @ObfuscatedName("ks")
    @ObfuscatedGetter(intValue = -676779145)
    static int field733;
    @ObfuscatedName("kp")
    static boolean field785;
    @ObfuscatedName("kg")
    @ObfuscatedGetter(intValue = 553481877)
    static int field736;
    @ObfuscatedName("kw")
    @ObfuscatedGetter(intValue = 123296823)
    static int field737;
    @ObfuscatedName("lj")
    static String field612;
    @ObfuscatedName("lt")
    static String field739;
    @ObfuscatedName("lc")
    @ObfuscatedGetter(intValue = 312598609)
    static int field683;
    @ObfuscatedName("li")
    @ObfuscatedSignature(signature = "Lgx;")
    static Class202 field741;
    @ObfuscatedName("ly")
    @ObfuscatedGetter(intValue = 1361959827)
    static int field742;
    @ObfuscatedName("ll")
    @ObfuscatedGetter(intValue = -523545729)
    static int field743;
    @ObfuscatedName("lo")
    @ObfuscatedSignature(signature = "Lhi;")
    static Class230 field744;
    @ObfuscatedName("ld")
    @ObfuscatedGetter(intValue = 1214589377)
    static int field745;
    @ObfuscatedName("lw")
    @ObfuscatedGetter(intValue = 1445722035)
    static int field782;
    @ObfuscatedName("lm")
    @ObfuscatedGetter(intValue = 1090303845)
    public static int field747;
    @ObfuscatedName("lr")
    @ObfuscatedGetter(intValue = -111588181)
    static int field748;
    @ObfuscatedName("lg")
    static boolean field776;
    @ObfuscatedName("lx")
    @ObfuscatedSignature(signature = "Lhi;")
    static Class230 field784;
    @ObfuscatedName("ln")
    @ObfuscatedSignature(signature = "Lhi;")
    static Class230 field583;
    
    static {
        Client.field580 = true;
        Client.field581 = 1;
        Client.field632 = 0;
        Client.field777 = 0;
        Client.field668 = false;
        Client.field585 = false;
        Client.field827 = 0;
        Client.field587 = -1;
        Client.field588 = false;
        Client.field589 = 0;
        Client.field625 = true;
        Client.field591 = 0;
        Client.field592 = 1L;
        Client.field593 = -1;
        Client.field594 = -1;
        Client.field595 = -1;
        Client.field847 = true;
        Client.field597 = false;
        Client.field598 = 0;
        Client.field599 = 0;
        Client.field600 = 0;
        Client.field579 = 0;
        Client.field602 = 0;
        Client.field818 = 0;
        Client.field604 = 0;
        Client.field605 = 0;
        Client.field637 = 0;
        Client.field607 = Class77.field1074;
        Client.field780 = Class77.field1074;
        Client.field609 = 0;
        Client.js5State = 0;
        Client.field768 = 0;
        Client.field614 = 0;
        Client.field615 = 0;
        Client.field616 = 0;
        Client.field617 = 0;
        Client.field618 = 0;
        Client.field619 = Class146.field1907;
        Client.field620 = null;
        Client.field843 = new Class72[32768];
        Client.field622 = 0;
        Client.field639 = new int[32768];
        Client.field624 = 0;
        Client.field666 = new int[250];
        field626 = new Class87();
        Client.field627 = 0;
        Client.field756 = false;
        Client.field629 = true;
        Client.field804 = new Class280();
        Client.field631 = new HashMap();
        Client.field633 = 0;
        Client.field634 = 1;
        Client.field635 = 0;
        Client.field636 = 1;
        Client.field751 = 0;
        Client.field642 = new Class164[4];
        Client.field759 = false;
        Client.field645 = new int[4][13][13];
        field846 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        Client.field700 = 0;
        Client.field643 = 2301979;
        Client.field584 = 5063219;
        Client.field836 = 3353893;
        Client.field646 = 7759444;
        Client.field746 = false;
        Client.field660 = 0;
        Client.field649 = 128;
        Client.field717 = 0;
        Client.field608 = 0;
        Client.field652 = 0;
        Client.field653 = 0;
        Client.field654 = 0;
        Client.field655 = 0;
        Client.field644 = 50;
        Client.field657 = 0;
        Client.field613 = 0;
        Client.field659 = 0;
        Client.field750 = 12;
        Client.field661 = 6;
        Client.field853 = 0;
        Client.field663 = false;
        Client.field664 = 0;
        Client.field807 = false;
        Client.field738 = 0;
        Client.field667 = 0;
        Client.field648 = 50;
        Client.field669 = new int[Client.field648];
        Client.field670 = new int[Client.field648];
        Client.field671 = new int[Client.field648];
        Client.field672 = new int[Client.field648];
        Client.field673 = new int[Client.field648];
        Client.field674 = new int[Client.field648];
        Client.field675 = new int[Client.field648];
        Client.field721 = new String[Client.field648];
        Client.field761 = new int[104][104];
        Client.field687 = 0;
        Client.field679 = -1;
        Client.field680 = -1;
        Client.field681 = 0;
        Client.field682 = 0;
        Client.field803 = 0;
        Client.field684 = 0;
        Client.field621 = true;
        Client.field686 = 0;
        Client.field582 = 0;
        Client.field688 = 0;
        Client.field678 = 0;
        Client.field821 = 0;
        Client.field691 = 0;
        Client.field689 = false;
        Client.field693 = 0;
        Client.field694 = 0;
        Client.field677 = true;
        Client.field610 = new Class60[2048];
        Client.field628 = -1;
        Client.field698 = 0;
        Client.field699 = true;
        Client.field658 = 0;
        Client.field701 = 0;
        Client.field702 = new int[1000];
        field703 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        Client.field704 = new String[8];
        Client.field709 = new boolean[8];
        Client.field706 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        Client.field707 = -1;
        Client.field708 = new Class205[4][104][104];
        Client.field714 = new Class205();
        Client.field710 = new Class205();
        Client.field711 = new Class205();
        Client.field712 = new int[25];
        Client.field713 = new int[25];
        Client.field640 = new int[25];
        Client.field715 = 0;
        Client.field716 = false;
        Client.field771 = 0;
        Client.field718 = new int[500];
        Client.field851 = new int[500];
        Client.field720 = new int[500];
        Client.field794 = new int[500];
        Client.field735 = new String[500];
        Client.field740 = new String[500];
        Client.field590 = new boolean[500];
        Client.field725 = false;
        Client.field726 = false;
        Client.field727 = false;
        Client.field728 = true;
        Client.field729 = -1;
        Client.field730 = -1;
        Client.field623 = 0;
        Client.field732 = 50;
        Client.field733 = 0;
        Client.field734 = null;
        Client.field785 = false;
        Client.field736 = -1;
        Client.field737 = -1;
        Client.field612 = null;
        Client.field739 = null;
        Client.field683 = -1;
        Client.field741 = new Class202(8);
        Client.field742 = 0;
        Client.field743 = 0;
        Client.field744 = null;
        Client.field745 = 0;
        Client.field782 = 0;
        Client.field747 = 0;
        Client.field748 = -1;
        Client.field776 = false;
        Client.field784 = null;
        Client.field583 = null;
        Client.field752 = null;
        Client.field753 = 0;
        Client.field749 = 0;
        Client.field755 = null;
        Client.field601 = false;
        Client.field757 = -1;
        Client.field758 = -1;
        Client.field772 = false;
        Client.field696 = -1;
        Client.field760 = -1;
        Client.field763 = false;
        Client.field801 = 1;
        Client.field764 = new int[32];
        Client.field765 = 0;
        Client.field766 = new int[32];
        Client.field767 = 0;
        Client.field690 = new int[32];
        Client.field769 = 0;
        Client.field770 = 0;
        Client.field647 = 0;
        Client.field828 = 0;
        Client.field793 = 0;
        Client.field774 = 0;
        Client.field775 = 0;
        Client.field695 = 0;
        Client.field638 = new Class205();
        Client.field778 = new Class205();
        Client.field779 = new Class205();
        Client.field783 = new Class202(512);
        Client.field603 = 0;
        Client.field830 = -2;
        Client.field697 = new boolean[100];
        Client.field788 = new boolean[100];
        Client.field723 = new boolean[100];
        Client.field786 = new int[100];
        Client.field787 = new int[100];
        Client.field641 = new int[100];
        Client.field789 = new int[100];
        Client.field790 = 0;
        Client.field791 = 0L;
        Client.field792 = true;
        Client.field731 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        Client.field630 = 0;
        Client.field795 = 0;
        Client.field796 = "";
        Client.field797 = new long[100];
        Client.field798 = 0;
        Client.field799 = 0;
        Client.field800 = new int[128];
        Client.field773 = new int[128];
        Client.field722 = -1L;
        Client.field651 = -1;
        Client.field724 = 0;
        Client.field805 = new int[1000];
        Client.field806 = new int[1000];
        Client.field816 = new Class318[1000];
        Client.field808 = 0;
        Client.field809 = 0;
        Client.field810 = 0;
        Client.field811 = 255;
        Client.field812 = -1;
        Client.field813 = false;
        Client.field814 = 127;
        Client.field815 = 127;
        Client.field656 = 0;
        Client.field817 = new int[50];
        Client.field676 = new int[50];
        Client.field819 = new int[50];
        Client.field820 = new int[50];
        Client.field719 = new Class91[50];
        Client.field822 = false;
        Client.field823 = new boolean[5];
        Client.field824 = new int[5];
        Client.field825 = new int[5];
        Client.field826 = new int[5];
        Client.field705 = new int[5];
        Client.field802 = 256;
        Client.field829 = 205;
        Client.field848 = 256;
        Client.field831 = 320;
        Client.field832 = 1;
        Client.field833 = 32767;
        Client.field834 = 1;
        Client.field835 = 32767;
        Client.field762 = 0;
        Client.field837 = 0;
        Client.field838 = 0;
        Client.field662 = 0;
        Client.field840 = 0;
        Client.field841 = new Class227();
        Client.field842 = -1;
        Client.field586 = -1;
        Client.field844 = new Class4[8];
        Client.field665 = new Class61();
        Client.field650 = -1;
        Client.field781 = new ArrayList(10);
        Client.field606 = 0;
        field849 = new Class59();
        Client.field850 = new int[50];
        Client.field596 = new int[50];
    }
    
    @ObfuscatedName("y")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2141234055")
    @Override
    protected final void vmethod1144() {
        Client.field791 = Class182.method3547() + 500L;
        this.method1145();
        if (Client.field683 != -1) {
            this.method1151(true);
        }
    }
    
    @ObfuscatedName("ao")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1300111147")
    @Override
    protected final void setUp() {
        Class169.method3446(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Class26.field223 = ((Client.field777 == 0) ? 43594 : (Client.field581 + 40000));
        Class68.field996 = ((Client.field777 == 0) ? 443 : (Client.field581 + 50000));
        Class290.field3636 = Class26.field223;
        Class227.field2575 = Class228.field2582;
        Class227.field2572 = Class228.field2583;
        Class227.field2577 = Class228.field2586;
        Class227.field2578 = Class228.field2585;
        Class28.field249 = new Class135();
        this.method772();
        this.method791();
        Class33.field294 = this.method769();
        Class34.field302 = new Class162(255, Class155.field1969, Class155.field1970, 500000);
        Class10.field61 = Class80.method1859();
        this.method770();
        Class313.method5714(this, Class8.field55);
        if (Client.field777 != 0) {
            Client.field597 = true;
        }
        Class50.method991(Class10.field61.field957);
        Class181.field2332 = new Class67(Class36.field306);
    }
    
    @ObfuscatedName("at")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1052023991")
    @Override
    protected final void vmethod1136() {
        ++Client.field591;
        this.method1139();
        Class84.method1955();
        try {
            if (Class217.field2460 == 1) {
                final int method4288 = Class217.field2459.method4288();
                if (method4288 > 0 && Class217.field2459.method4203()) {
                    int n = method4288 - Class6.field37;
                    if (n < 0) {
                        n = 0;
                    }
                    Class217.field2459.method4236(n);
                }
                else {
                    Class217.field2459.method4202();
                    Class217.field2459.method4200();
                    if (Class138.field1871 != null) {
                        Class217.field2460 = 2;
                    }
                    else {
                        Class217.field2460 = 0;
                    }
                    Class177.field2285 = null;
                    Class80.field1149 = null;
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            Class217.field2459.method4202();
            Class217.field2460 = 0;
            Class177.field2285 = null;
            Class80.field1149 = null;
            Class138.field1871 = null;
        }
        Class54.method1017();
        synchronized (Class39.field337) {
            ++Class39.field353;
            Class39.field350 = Class39.field352;
            Class39.field349 = 0;
            if (Class39.field329 < 0) {
                for (int i = 0; i < 112; ++i) {
                    Class39.field341[i] = false;
                }
                Class39.field329 = Class39.field344;
            }
            else {
                while (Class39.field344 != Class39.field329) {
                    final int n2 = Class39.field343[Class39.field344];
                    Class39.field344 = (Class39.field344 + 1 & 0x7F);
                    if (n2 < 0) {
                        Class39.field341[~n2] = false;
                    }
                    else {
                        if (!Class39.field341[n2] && Class39.field349 < Class39.field338.length - 1) {
                            Class39.field338[++Class39.field349 - 1] = n2;
                        }
                        Class39.field341[n2] = true;
                    }
                }
            }
            if (Class39.field349 > 0) {
                Class39.field353 = 0;
            }
            Class39.field352 = Class39.field351;
        }
        synchronized (Class48.field429) {
            Class48.field419 = Class48.field424;
            Class48.field425 = Class48.field422;
            Class48.field426 = Class48.field423 * -1660309769;
            Class48.field431 = Class48.field421;
            Class48.field432 = Class48.field420;
            Class48.field428 = Class48.field434;
            Class48.field433 = Class48.field430;
            Class48.field421 = 0;
        }
        if (Class33.field294 != null) {
            Client.field695 = Class33.field294.vmethod3278();
        }
        if (Client.field589 == 0) {
            Class29.method478();
            RunException.timer.vmethod3330();
            for (int j = 0; j < 32; ++j) {
                Class47.field394[j] = 0L;
            }
            for (int k = 0; k < 32; ++k) {
                Class47.field404[k] = 0L;
            }
            Class8.field48 = 0;
        }
        else if (Client.field589 == 5) {
            Class186.method3806(this);
            Class29.method478();
            RunException.timer.vmethod3330();
            for (int l = 0; l < 32; ++l) {
                Class47.field394[l] = 0L;
            }
            for (int n3 = 0; n3 < 32; ++n3) {
                Class47.field404[n3] = 0L;
            }
            Class8.field48 = 0;
        }
        else if (Client.field589 == 10 || Client.field589 == 11) {
            Class186.method3806(this);
        }
        else if (Client.field589 == 20) {
            Class186.method3806(this);
            this.method1142();
        }
        else if (Client.field589 == 25) {
            Class15.method148();
        }
        if (Client.field589 == 30) {
            this.method1143();
        }
        else if (Client.field589 == 40 || Client.field589 == 45) {
            this.method1142();
        }
    }
    
    @ObfuscatedName("ai")
    @ObfuscatedSignature(signature = "(ZB)V", garbageValue = "0")
    @Override
    protected final void vmethod1137(final boolean b) {
        if (Class148.method3196() && Client.field813 && Class28.field244 != null) {
            Class28.field244.method2146();
        }
        if ((Client.field589 == 10 || Client.field589 == 20 || Client.field589 == 30) && Client.field791 != 0L && Class182.method3547() > Client.field791) {
            Class50.method991(Client.field792 ? 2 : 1);
        }
        if (b) {
            for (int i = 0; i < 100; ++i) {
                Client.field697[i] = true;
            }
        }
        if (Client.field589 == 0) {
            this.method796(Class78.field1099, Class78.field1100, b);
        }
        else if (Client.field589 == 5) {
            Class273.method5227(Class293.field3660, Class151.field1936, Class63.field933, b);
        }
        else if (Client.field589 == 10 || Client.field589 == 11) {
            Class273.method5227(Class293.field3660, Class151.field1936, Class63.field933, b);
        }
        else if (Client.field589 == 20) {
            Class273.method5227(Class293.field3660, Class151.field1936, Class63.field933, b);
        }
        else if (Client.field589 == 25) {
            if (Client.field751 == 1) {
                if (Client.field633 > Client.field634) {
                    Client.field634 = Client.field633;
                }
                Class83.method1933("Loading - please wait." + "<br>" + " (" + (Client.field634 * 50 - Client.field633 * 50) / Client.field634 + "%" + ")", false);
            }
            else if (Client.field751 == 2) {
                if (Client.field635 > Client.field636) {
                    Client.field636 = Client.field635;
                }
                Class83.method1933("Loading - please wait." + "<br>" + " (" + ((Client.field636 * 50 - Client.field635 * 50) / Client.field636 + 50) + "%" + ")", false);
            }
            else {
                Class83.method1933("Loading - please wait.", false);
            }
        }
        else if (Client.field589 == 30) {
            this.method1146();
        }
        else if (Client.field589 == 40) {
            Class83.method1933("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
        }
        else if (Client.field589 == 45) {
            Class83.method1933("Please wait...", false);
        }
        if (Client.field589 == 30 && Client.field790 == 0 && !b && !Client.field792) {
            for (int j = 0; j < Client.field603; ++j) {
                if (Client.field788[j]) {
                    Class163.field2014.vmethod5810(Client.field786[j], Client.field787[j], Client.field641[j], Client.field789[j]);
                    Client.field788[j] = false;
                }
            }
        }
        else if (Client.field589 > 0) {
            Class163.field2014.vmethod5809(0, 0);
            for (int k = 0; k < Client.field603; ++k) {
                Client.field788[k] = false;
            }
        }
    }
    
    @ObfuscatedName("ac")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2060326728")
    @Override
    protected final void vmethod1187() {
        if (Class22.field185.method1896()) {
            Class22.field185.method1893();
        }
        if (Class26.field220 != null) {
            Class26.field220.field529 = false;
        }
        Class26.field220 = null;
        Client.field626.method1982();
        if (Class39.field337 != null) {
            synchronized (Class39.field337) {
                Class39.field337 = null;
            }
        }
        Class185.method3787();
        Class33.field294 = null;
        if (Class28.field244 != null) {
            Class28.field244.method2147();
        }
        if (Class63.field879 != null) {
            Class63.field879.method2147();
        }
        Class242.method4605();
        synchronized (Class248.field3184) {
            if (Class248.field3179 != 0) {
                Class248.field3179 = 1;
                try {
                    Class248.field3184.wait();
                }
                catch (InterruptedException ex) {}
            }
        }
        if (Class28.field249 != null) {
            Class28.field249.method3106();
            Class28.field249 = null;
        }
        try {
            Class155.field1969.method2493();
            for (int i = 0; i < Class148.field1913; ++i) {
                Class76.field1068[i].method2493();
            }
            Class155.field1970.method2493();
            Class155.field1968.method2493();
        }
        catch (Exception ex2) {}
    }
    
    @ObfuscatedName("az")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1676093665")
    @Override
    protected final void vmethod1132() {
    }
    
    @Override
    public final void init() {
        try {
            if (!this.method774()) {
                return;
            }
            final Class279[] method996 = Class51.method996();
            for (int i = 0; i < method996.length; ++i) {
                final Class279 class279 = method996[i];
                final String parameter = this.getParameter(class279.field3591);
                if (parameter != null) {
                    switch (Integer.parseInt(class279.field3591)) {
                        case 14: {
                            if (parameter.equalsIgnoreCase("true")) {
                                Client.field668 = true;
                                break;
                            }
                            Client.field668 = false;
                            break;
                        }
                        case 11: {
                            Class266.field3346 = Class179.method3517(Integer.parseInt(parameter));
                            break;
                        }
                        case 8: {
                            Client.field827 = Integer.parseInt(parameter);
                            break;
                        }
                        case 15: {
                            Class112.field1455 = (Class244)Class76.method1803(Class191.method3870(), Integer.parseInt(parameter));
                            if (Class112.field1455 == Class244.field3145) {
                                Class36.field306 = Class322.field3880;
                                break;
                            }
                            Class36.field306 = Class322.field3878;
                            break;
                        }
                        case 6: {
                            Client.field629 = (Integer.parseInt(parameter) != 0);
                            break;
                        }
                        case 10: {
                            Class163.field2013 = parameter;
                            break;
                        }
                        case 5: {
                            Class26.field219 = parameter;
                            break;
                        }
                        case 3: {
                            Client.field777 = Integer.parseInt(parameter);
                            break;
                        }
                        case 13: {
                            Client.field581 = Integer.parseInt(parameter);
                            break;
                        }
                        case 2: {
                            if (Client.field587 == -1) {
                                Client.field587 = Integer.parseInt(parameter);
                                break;
                            }
                            break;
                        }
                        case 4: {
                            Client.field632 = Integer.parseInt(parameter);
                            break;
                        }
                        case 16: {
                            Class124.field1709 = Integer.parseInt(parameter);
                            break;
                        }
                        case 7: {
                            if (parameter.equalsIgnoreCase("true")) {}
                            break;
                        }
                    }
                }
            }
            Class177.method3513();
            Class54.field485 = this.getCodeBase().getHost();
            
            final String field3135 = Class266.field3346.field3135;
            final int n = 0;
            try {
                Class177.method3509("oldschool", field3135, n, 17);
            }
            catch (Exception ex) {
                Class5.method65(null, ex);
            }
            Class182.field2334 = this;
            Class152.field1940 = Client.field587;
            this.method778(765, 503, 171);
        }
        catch (RuntimeException ex2) {
        	ex2.printStackTrace();
            throw Class95.method2195(ex2, "client.init(" + ')');
        }
    }
    
    @ObfuscatedName("en")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1481813708")
    void method1139() {
        if (Client.field589 == 1000) {
            return;
        }
        final long method3547 = Class182.method3547();
        int n = (int)(method3547 - Class250.field3203);
        Class250.field3203 = method3547;
        if (n > 200) {
            n = 200;
        }
        Class250.field3197 += n;
        boolean b = false;
        Label_1322: {
            if (Class250.field3207 == 0 && Class250.field3198 == 0 && Class250.field3205 == 0 && Class250.field3211 == 0) {
                b = true;
            }
            else if (Class250.field3200 == null) {
                b = false;
            }
            else {
                try {
                    if (Class250.field3197 > 30000) {
                        throw new IOException();
                    }
                    while (Class250.field3198 < 200 && Class250.field3211 > 0) {
                        final Class246 class246 = (Class246)Class250.field3212.method4018();
                        final Class182 class247 = new Class182(4);
                        class247.method3532(1);
                        class247.method3534((int)class246.field2421);
                        Class250.field3200.vmethod3347(class247.payload, 0, 4);
                        Class250.field3199.method4016(class246, class246.field2421);
                        --Class250.field3211;
                        ++Class250.field3198;
                    }
                    while (Class250.field3207 < 200 && Class250.field3205 > 0) {
                        final Class246 class248 = (Class246)Class250.field3202.method3932();
                        final Class182 class249 = new Class182(4);
                        class249.method3532(0);
                        class249.method3534((int)class248.field2421);
                        Class250.field3200.vmethod3347(class249.payload, 0, 4);
                        class248.method4101();
                        Class250.field3206.method4016(class248, class248.field2421);
                        --Class250.field3205;
                        ++Class250.field3207;
                    }
                    for (int i = 0; i < 100; ++i) {
                        final int vmethod3349 = Class250.field3200.vmethod3349();
                        if (vmethod3349 < 0) {
                            throw new IOException();
                        }
                        if (vmethod3349 == 0) {
                            break;
                        }
                        Class250.field3197 = 0;
                        int n2 = 0;
                        if (Class250.field3208 == null) {
                            n2 = 8;
                        }
                        else if (Class250.field3210 == 0) {
                            n2 = 1;
                        }
                        if (n2 > 0) {
                            int n3 = n2 - Class250.field3209.field2339;
                            if (n3 > vmethod3349) {
                                n3 = vmethod3349;
                            }
                            Class250.field3200.vmethod3351(Class250.field3209.payload, Class250.field3209.field2339, n3);
                            if (Class250.field3213 != 0) {
                                for (int j = 0; j < n3; ++j) {
                                    final byte[] field2338 = Class250.field3209.payload;
                                    final int n4 = j + Class250.field3209.field2339;
                                    field2338[n4] ^= Class250.field3213;
                                }
                            }
                            final Class182 field2339 = Class250.field3209;
                            field2339.field2339 += n3;
                            if (Class250.field3209.field2339 < n2) {
                                break;
                            }
                            if (Class250.field3208 == null) {
                                Class250.field3209.field2339 = 0;
                                final int method3548 = Class250.field3209.method3544();
                                final int method3549 = Class250.field3209.method3550();
                                final int method3550 = Class250.field3209.method3544();
                                final int method3551 = Class250.field3209.method3671();
                                final long n5 = method3549 + (method3548 << 16);
                                Class246 field2340 = (Class246)Class250.field3199.method4020(n5);
                                Class192.field2391 = true;
                                if (field2340 == null) {
                                    field2340 = (Class246)Class250.field3206.method4020(n5);
                                    Class192.field2391 = false;
                                }
                                if (field2340 == null) {
                                    throw new IOException();
                                }
                                final int n6 = (method3550 == 0) ? 5 : 9;
                                Class250.field3208 = field2340;
                                (Class301.field3713 = new Class182(n6 + method3551 + Class250.field3208.field3157)).method3532(method3550);
                                Class301.field3713.method3707(method3551);
                                Class250.field3210 = 8;
                                Class250.field3209.field2339 = 0;
                            }
                            else if (Class250.field3210 == 0) {
                                if (Class250.field3209.payload[0] == -1) {
                                    Class250.field3210 = 1;
                                    Class250.field3209.field2339 = 0;
                                }
                                else {
                                    Class250.field3208 = null;
                                }
                            }
                        }
                        else {
                            final int n7 = Class301.field3713.payload.length - Class250.field3208.field3157;
                            int n8 = 512 - Class250.field3210;
                            if (n8 > n7 - Class301.field3713.field2339) {
                                n8 = n7 - Class301.field3713.field2339;
                            }
                            if (n8 > vmethod3349) {
                                n8 = vmethod3349;
                            }
                            Class250.field3200.vmethod3351(Class301.field3713.payload, Class301.field3713.field2339, n8);
                            if (Class250.field3213 != 0) {
                                for (int k = 0; k < n8; ++k) {
                                    final byte[] field2341 = Class301.field3713.payload;
                                    final int n9 = k + Class301.field3713.field2339;
                                    field2341[n9] ^= Class250.field3213;
                                }
                            }
                            final Class182 field2342 = Class301.field3713;
                            field2342.field2339 += n8;
                            Class250.field3210 += n8;
                            if (n7 == Class301.field3713.field2339) {
                                if (16711935L == Class250.field3208.field2421) {
                                    Class185.field2359 = Class301.field3713;
                                    for (int l = 0; l < 256; ++l) {
                                        final Class249 class250 = Class250.field3201[l];
                                        if (class250 != null) {
                                            Class185.field2359.field2339 = l * 8 + 5;
                                            class250.method4723(Class185.field2359.method3671(), Class185.field2359.method3671());
                                        }
                                    }
                                }
                                else {
                                    Class250.field3196.reset();
                                    Class250.field3196.update(Class301.field3713.payload, 0, n7);
                                    if ((int)Class250.field3196.getValue() != Class250.field3208.field3156) {
                                        try {
                                            Class250.field3200.vmethod3346();
                                        }
                                        catch (Exception ex) {}
                                        ++Class250.field3214;
                                        Class250.field3200 = null;
                                        Class250.field3213 = (byte)(Math.random() * 255.0 + 1.0);
                                        b = false;
                                        break Label_1322;
                                    }
                                    Class250.field3214 = 0;
                                    Class250.field3215 = 0;
                                    Class250.field3208.field3155.method4729((int)(Class250.field3208.field2421 & 0xFFFFL), Class301.field3713.payload, 0xFF0000L == (Class250.field3208.field2421 & 0xFF0000L), Class192.field2391);
                                }
                                Class250.field3208.method4064();
                                if (Class192.field2391) {
                                    --Class250.field3198;
                                }
                                else {
                                    --Class250.field3207;
                                }
                                Class250.field3210 = 0;
                                Class250.field3208 = null;
                                Class301.field3713 = null;
                            }
                            else {
                                if (Class250.field3210 != 512) {
                                    break;
                                }
                                Class250.field3210 = 0;
                            }
                        }
                    }
                    b = true;
                }
                catch (IOException ex2) {
                    try {
                        Class250.field3200.vmethod3346();
                    }
                    catch (Exception ex3) {}
                    ++Class250.field3215;
                    Class250.field3200 = null;
                    b = false;
                }
            }
        }
        if (!b) {
            this.method1140();
        }
    }
    
    @ObfuscatedName("ee")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "118360618")
    void method1140() {
        if (Class250.field3214 >= 4) {
            this.error("js5crc");
            Client.field589 = 1000;
            return;
        }
        if (Class250.field3215 >= 4) {
            if (Client.field589 <= 5) {
                this.error("js5io");
                Client.field589 = 1000;
                return;
            }
            Client.field768 = 3000;
            Class250.field3215 = 3;
        }
        if (--Client.field768 + 1 > 0) {
            return;
        }
        try {
        	//System.out.println(js5State);
            if (Client.js5State == 0) {
                Client.field839 = Class47.field392.method3259(Class54.field485, Class290.field3636);
                ++Client.js5State;
            }
            if (Client.js5State == 1) {
                if (Client.field839.status == 2) {
                    this.method1141(-1);
                    return;
                }
                if (Client.field839.status == 1) {
                    ++Client.js5State;
                }
            }
            if (Client.js5State == 2) {
                if (Client.field629) {
                    Client.field611 = Class47.method911((Socket)Client.field839.value, 40000, 5000);
                }
                else {
                    Client.field611 = new Class161((Socket)Client.field839.value, Class47.field392, 5000);
                }
                final Class182 class182 = new Class182(5);
                class182.method3532(15);
                class182.method3707(171);
                Client.field611.vmethod3347(class182.payload, 0, 5);
                ++Client.js5State;
                Class229.field2589 = Class182.method3547();
            }
            if (Client.js5State == 3) {
                if (Client.field611.vmethod3349() > 0 || (!Client.field629 && Client.field589 <= 5)) {
                    final int vmethod3353 = Client.field611.vmethod3353();
                    if (vmethod3353 != 0) {
                        this.method1141(vmethod3353);
                        return;
                    }
                    ++Client.js5State;
                }
                else if (Class182.method3547() - Class229.field2589 > 30000L) {
                    this.method1141(-2);
                    return;
                }
            }
            if (Client.js5State == 4) {
                Class36.method633(Client.field611, Client.field589 > 20);
                Client.field839 = null;
                Client.field611 = null;
                Client.js5State = 0;
                Client.field614 = 0;
            }
        }
        catch (IOException ex) {
            this.method1141(-3);
        }
    }
    
    @ObfuscatedName("ev")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "656785584")
    void method1141(final int n) {
        Client.field839 = null;
        Client.field611 = null;
        Client.js5State = 0;
        if (Class290.field3636 == Class26.field223) {
            Class290.field3636 = Class68.field996;
        }
        else {
            Class290.field3636 = Class26.field223;
        }
        
        ++Client.field614;
        if (Client.field614 >= 2 && (n == 7 || n == 9)) {
            if (Client.field589 <= 5) {
                this.error("js5connect_full");
                Client.field589 = 1000;
            }
            else {
                Client.field768 = 3000;
            }
        }
        else if (Client.field614 >= 2 && n == 6) {
            this.error("js5connect_outofdate");
            Client.field589 = 1000;
        }
        else if (Client.field614 >= 4) {
            if (Client.field589 <= 5) {
                this.error("js5connect");
                Client.field589 = 1000;
            }
            else {
                Client.field768 = 3000;
            }
        }
    }
    
    @ObfuscatedName("ft")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2122262374")
    final void method1142() {
        Class157 class157 = Client.field626.method1983();
        final Class189 field1219 = Client.field626.field1219;
        try {
            if (Client.field615 == 0) {
                if (class157 != null) {
                    class157.vmethod3346();
                    class157 = null;
                }
                Class225.field2556 = null;
                Client.field756 = false;
                Client.field616 = 0;
                Client.field615 = 1;
            }
            if (Client.field615 == 1) {
                if (Class225.field2556 == null) {
                    Class225.field2556 = Class47.field392.method3259(Class54.field485, Class290.field3636);
                }
                if (Class225.field2556.status == 2) {
                    throw new IOException();
                }
                if (Class225.field2556.status == 1) {
                    if (Client.field629) {
                        class157 = Class47.method911((Socket)Class225.field2556.value, 40000, 5000);
                    }
                    else {
                        class157 = new Class161((Socket)Class225.field2556.value, Class47.field392, 5000);
                    }
                    Client.field626.method1997(class157);
                    Class225.field2556 = null;
                    Client.field615 = 2;
                }
            }
            if (Client.field615 == 2) {
                Client.field626.method1978();
                final Class172 method1536 = Class62.method1536();
                method1536.field2257.method3532(Class170.field2237.field2239);
                Client.field626.method1980(method1536);
                Client.field626.method1979();
                field1219.field2339 = 0;
                Client.field615 = 3;
            }
            if (Client.field615 == 3) {
                if (Class28.field244 != null) {
                    Class28.field244.method2145();
                }
                if (Class63.field879 != null) {
                    Class63.field879.method2145();
                }
                boolean b = true;
                if (Client.field629 && !class157.vmethod3350(1)) {
                    b = false;
                }
                if (b) {
                    final int vmethod3353 = class157.vmethod3353();
                    if (Class28.field244 != null) {
                        Class28.field244.method2145();
                    }
                    if (Class63.field879 != null) {
                        Class63.field879.method2145();
                    }
                    if (vmethod3353 != 0) {
                        Class33.method559(vmethod3353);
                        return;
                    }
                    field1219.field2339 = 0;
                    Client.field615 = 4;
                }
            }
            if (Client.field615 == 4) {
                if (field1219.field2339 < 8) {
                    int vmethod3354 = class157.vmethod3349();
                    if (vmethod3354 > 8 - field1219.field2339) {
                        vmethod3354 = 8 - field1219.field2339;
                    }
                    if (vmethod3354 > 0) {
                        class157.vmethod3351(field1219.payload, field1219.field2339, vmethod3354);
                        final Class189 class158 = field1219;
                        class158.field2339 += vmethod3354;
                    }
                }
                if (field1219.field2339 == 8) {
                    field1219.field2339 = 0;
                    Class221.field2535 = field1219.method3554();
                    Client.field615 = 5;
                }
            }
            if (Client.field615 == 5) {
                Client.field626.field1219.field2339 = 0;
                Client.field626.method1978();
                final Class189 class159 = new Class189(500);
                final int[] array = { (int)(Math.random() * 9.9999999E7), (int)(Math.random() * 9.9999999E7), (int)(Class221.field2535 >> 32), (int)(Class221.field2535 & -1L) };
                class159.field2339 = 0;
                class159.method3532(1);
                class159.method3532(Client.field619.vmethod5815());
                class159.method3707(array[0]);
                class159.method3707(array[1]);
                class159.method3707(array[2]);
                class159.method3707(array[3]);
                switch (Client.field619.field1909) {
                    case 3: {
                        class159.method3707((int) Class10.field61.field963.get(Class3.method35(Class78.field1106)));
                        final Class189 class160 = class159;
                        class160.field2339 += 4;
                        break;
                    }
                    case 0:
                    case 1: {
                        class159.method3534(Class14.field104);
                        final Class189 class161 = class159;
                        class161.field2339 += 5;
                        break;
                    }
                    case 2: {
                        final Class189 class162 = class159;
                        class162.field2339 += 8;
                        break;
                    }
                }
                class159.method3699(Class78.field1086);
                class159.method3571(Class76.field1071, Class76.field1069);
                final Class172 method1537 = Class62.method1536();
                method1537.field2257.field2339 = 0;
                if (Client.field589 == 40) {
                    method1537.field2257.method3532(Class170.field2238.field2239);
                }
                else {
                    method1537.field2257.method3532(Class170.field2235.field2239);
                }
                method1537.field2257.method3755(0);
                final int field1220 = method1537.field2257.field2339;
                method1537.field2257.method3707(171);
                method1537.field2257.method3542(class159.payload, 0, class159.field2339);
                final int field1221 = method1537.field2257.field2339;
                method1537.field2257.method3699(Class78.field1106);
                method1537.field2257.method3532((Client.field792 ? 1 : 0) << 1 | (Client.field585 ? 1 : 0));
                method1537.field2257.method3755(Class82.field1179);
                method1537.field2257.method3755(Class243.field3138);
                final Class189 field1222 = method1537.field2257;
                if (Client.field620 != null) {
                    field1222.method3542(Client.field620, 0, Client.field620.length);
                }
                else {
                    final byte[] array2 = new byte[24];
                    try {
                        Class155.field1968.method2476(0L);
                        Class155.field1968.method2478(array2);
                        int n;
                        for (n = 0; n < 24 && array2[n] == 0; ++n) {}
                        if (n >= 24) {
                            throw new IOException();
                        }
                    }
                    catch (Exception ex) {
                        for (int i = 0; i < 24; ++i) {
                            array2[i] = -1;
                        }
                    }
                    final byte[] array3 = array2;
                    field1222.method3542(array3, 0, array3.length);
                }
                method1537.field2257.method3699(Class163.field2013);
                method1537.field2257.method3707(Class124.field1709);
                final Class182 class163 = new Class182(Class27.field228.method6215());
                Class27.field228.method6217(class163);
                method1537.field2257.method3542(class163.payload, 0, class163.payload.length);
                method1537.field2257.method3532(Client.field587);
                method1537.field2257.method3707(0);
                method1537.field2257.method3707(Class77.field1079.field3175);
                method1537.field2257.method3707(Class37.field326.field3175);
                method1537.field2257.method3707(Class97.field1329.field3175);
                method1537.field2257.method3707(Class224.field2548.field3175);
                method1537.field2257.method3707(Class135.field1852.field3175);
                method1537.field2257.method3707(Class246.field3159.field3175);
                method1537.field2257.method3707(Class80.field1147.field3175);
                method1537.field2257.method3707(Class21.field179.field3175);
                method1537.field2257.method3707(Class175.field2270.field3175);
                method1537.field2257.method3707(Class268.field3419.field3175);
                method1537.field2257.method3707(Class22.field183.field3175);
                method1537.field2257.method3707(Class61.field576.field3175);
                method1537.field2257.method3707(Client.field854.field3175);
                method1537.field2257.method3707(Class50.field461.field3175);
                method1537.field2257.method3707(Class59.field543.field3175);
                method1537.field2257.method3707(Class36.field312.field3175);
                method1537.field2257.method3707(Class24.field207.field3175);
                method1537.field2257.method3569(array, field1221, method1537.field2257.field2339);
                method1537.field2257.method3614(method1537.field2257.field2339 - field1220);
                Client.field626.method1980(method1537);
                Client.field626.method1979();
                Client.field626.field1218 = new Class190(array);
                for (int j = 0; j < 4; ++j) {
                    final int[] array4 = array;
                    final int n2 = j;
                    array4[n2] += 50;
                }
                field1219.method3836(array);
                Client.field615 = 6;
            }
            if (Client.field615 == 6 && class157.vmethod3349() > 0) {
                final int vmethod3355 = class157.vmethod3353();
                if (vmethod3355 == 21 && Client.field589 == 20) {
                    Client.field615 = 7;
                }
                else if (vmethod3355 == 2) {
                    Client.field615 = 9;
                }
                else if (vmethod3355 == 15 && Client.field589 == 40) {
                    Client.field626.field1225 = -1;
                    Client.field615 = 13;
                }
                else if (vmethod3355 == 23 && Client.field617 < 1) {
                    ++Client.field617;
                    Client.field615 = 0;
                }
                else {
                    if (vmethod3355 != 29) {
                        Class33.method559(vmethod3355);
                        return;
                    }
                    Client.field615 = 11;
                }
            }
            if (Client.field615 == 7 && class157.vmethod3349() > 0) {
                Client.field618 = (class157.vmethod3353() + 3) * 60;
                Client.field615 = 8;
            }
            if (Client.field615 == 8) {
                Client.field616 = 0;
                Class2.method22("You have only just left another world.", "Your profile will be transferred in:", Client.field618 / 60 + " seconds.");
                if (--Client.field618 <= 0) {
                    Client.field615 = 0;
                }
                return;
            }
            if (Client.field615 == 9 && class157.vmethod3349() >= 13) {
                final boolean b2 = class157.vmethod3353() == 1;
                class157.vmethod3351(field1219.payload, 0, 4);
                field1219.field2339 = 0;
                if (b2) {
                    final int n3 = field1219.method3820() << 24 | field1219.method3820() << 16 | field1219.method3820() << 8 | field1219.method3820();
                    final int method1538 = Class3.method35(Class78.field1106);
                    if (Class10.field61.field963.size() >= 10 && !Class10.field61.field963.containsKey(method1538)) {
                        final Iterator iterator = Class10.field61.field963.entrySet().iterator();
                        iterator.next();
                        iterator.remove();
                    }
                    Class10.field61.field963.put(method1538, n3);
                }
                if (Class78.field1108) {
                    Class10.field61.field959 = Class78.field1106;
                }
                else {
                    Class10.field61.field959 = null;
                }
                Class54.method1018();
                Client.field747 = class157.vmethod3353();
                Client.field776 = (class157.vmethod3353() == 1);
                Client.field628 = class157.vmethod3353();
                Client.field628 <<= 8;
                Client.field628 += class157.vmethod3353();
                Client.field698 = class157.vmethod3353();
                class157.vmethod3351(field1219.payload, 0, 1);
                field1219.field2339 = 0;
                final Class168[] array5 = { Class168.field2100, Class168.field2050, Class168.field2051, Class168.field2070, Class168.field2053, Class168.field2054, Class168.field2055, Class168.field2122, Class168.field2083, Class168.field2065, Class168.field2059, Class168.field2060, Class168.field2061, Class168.field2062, Class168.field2063, Class168.field2106, Class168.field2107, Class168.field2069, Class168.field2128, Class168.field2105, Class168.field2116, Class168.field2111, Class168.field2071, Class168.field2072, Class168.field2114, Class168.field2074, Class168.field2075, Class168.field2058, Class168.field2077, Class168.field2078, Class168.field2131, Class168.field2080, Class168.field2081, Class168.field2127, Class168.field2079, Class168.field2084, Class168.field2085, Class168.field2086, Class168.field2087, Class168.field2088, Class168.field2089, Class168.field2090, Class168.field2091, Class168.field2092, Class168.field2093, Class168.field2076, Class168.field2095, Class168.field2096, Class168.field2097, Class168.field2098, Class168.field2099, Class168.field2082, Class168.field2101, Class168.field2102, Class168.field2094, Class168.field2104, Class168.field2067, Class168.field2064, Class168.field2119, Class168.field2108, Class168.field2109, Class168.field2049, Class168.field2068, Class168.field2112, Class168.field2113, Class168.field2129, Class168.field2115, Class168.field2073, Class168.field2117, Class168.field2118, Class168.field2124, Class168.field2120, Class168.field2121, Class168.field2103, Class168.field2123, Class168.field2066, Class168.field2125, Class168.field2130, Class168.field2126, Class168.field2057, Class168.field2056, Class168.field2110, Class168.field2052, Class168.field2132 };
                final int method1539 = field1219.method3841();
                if (method1539 < 0 || method1539 >= array5.length) {
                    throw new IOException(method1539 + " " + field1219.field2339);
                }
                Client.field626.field1220 = array5[method1539];
                Client.field626.field1225 = Client.field626.field1220.field2134;
                class157.vmethod3351(field1219.payload, 0, 2);
                field1219.field2339 = 0;
                Client.field626.field1225 = field1219.method3550();
                try {
                    Class41.method702(Class182.field2334, "zap");
                }
                catch (Throwable t) {}
                Client.field615 = 10;
            }
            if (Client.field615 == 10) {
                if (class157.vmethod3349() >= Client.field626.field1225) {
                    field1219.field2339 = 0;
                    class157.vmethod3351(field1219.payload, 0, Client.field626.field1225);
                    Client.field804.method5247();
                    Client.field592 = 1L;
                    Client.field595 = -1;
                    Class26.field220.field522 = 0;
                    Class18.field146 = true;
                    Client.field847 = true;
                    Client.field722 = -1L;
                    Class310.method5697();
                    Client.field626.method1978();
                    Client.field626.field1219.field2339 = 0;
                    Client.field626.field1220 = null;
                    Client.field626.field1215 = null;
                    Client.field626.field1226 = null;
                    Client.field626.field1227 = null;
                    Client.field626.field1225 = 0;
                    Client.field626.field1228 = 0;
                    Client.field598 = 0;
                    Client.field627 = 0;
                    Client.field599 = 0;
                    Client.field771 = 0;
                    Client.field716 = false;
                    Class80.method1866(0);
                    Class172.method3456();
                    Client.field733 = 0;
                    Client.field785 = false;
                    Client.field656 = 0;
                    Client.field717 = 0;
                    Client.field655 = 0;
                    Class21.field175 = null;
                    Client.field810 = 0;
                    Client.field651 = -1;
                    Client.field808 = 0;
                    Client.field809 = 0;
                    Client.field607 = Class77.field1074;
                    Client.field780 = Class77.field1074;
                    Client.field622 = 0;
                    Class111.method2562();
                    for (int k = 0; k < 2048; ++k) {
                        Client.field610[k] = null;
                    }
                    for (int l = 0; l < 32768; ++l) {
                        Client.field843[l] = null;
                    }
                    Client.field707 = -1;
                    Client.field710.method4072();
                    Client.field711.method4072();
                    for (int n4 = 0; n4 < 4; ++n4) {
                        for (int n5 = 0; n5 < 104; ++n5) {
                            for (int n6 = 0; n6 < 104; ++n6) {
                                Client.field708[n4][n5][n6] = null;
                            }
                        }
                    }
                    Client.field714 = new Class205();
                    Class181.field2332.method1628();
                    for (int n7 = 0; n7 < Class254.field3232; ++n7) {
                        if (Class63.method1549(n7) != null) {
                            Class225.field2559[n7] = 0;
                            Class225.field2558[n7] = 0;
                        }
                    }
                    Class22.field185.method1891();
                    Client.field748 = -1;
                    if (Client.field683 != -1) {
                        Class66.method1622(Client.field683);
                    }
                    for (Class55 class164 = (Class55)Client.field741.method4018(); class164 != null; class164 = (Class55)Client.field741.method4019()) {
                        Class20.method261(class164, true);
                    }
                    Client.field683 = -1;
                    Client.field741 = new Class202(8);
                    Client.field744 = null;
                    Client.field771 = 0;
                    Client.field716 = false;
                    Client.field841.method4462(null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int n8 = 0; n8 < 8; ++n8) {
                        Client.field704[n8] = null;
                        Client.field709[n8] = false;
                    }
                    Class53.field474 = new Class202(32);
                    Client.field625 = true;
                    for (int n9 = 0; n9 < 100; ++n9) {
                        Client.field697[n9] = true;
                    }
                    Class65.method1604();
                    Class14.field94 = null;
                    for (int n10 = 0; n10 < 8; ++n10) {
                        Client.field844[n10] = new Class4();
                    }
                    Class19.field154 = null;
                    Class37.method660(field1219);
                    Class27.field224 = -1;
                    Class51.method994(false, field1219);
                    Client.field626.field1220 = null;
                }
                return;
            }
            if (Client.field615 == 11 && class157.vmethod3349() >= 2) {
                field1219.field2339 = 0;
                class157.vmethod3351(field1219.payload, 0, 2);
                field1219.field2339 = 0;
                Class249.field3192 = field1219.method3550();
                Client.field615 = 12;
            }
            if (Client.field615 == 12 && class157.vmethod3349() >= Class249.field3192) {
                field1219.field2339 = 0;
                class157.vmethod3351(field1219.payload, 0, Class249.field3192);
                field1219.field2339 = 0;
                Class2.method22(field1219.method3738(), field1219.method3738(), field1219.method3738());
                Class48.method947(10);
            }
            if (Client.field615 == 13) {
                if (Client.field626.field1225 == -1) {
                    if (class157.vmethod3349() < 2) {
                        return;
                    }
                    class157.vmethod3351(field1219.payload, 0, 2);
                    field1219.field2339 = 0;
                    Client.field626.field1225 = field1219.method3550();
                }
                if (class157.vmethod3349() < Client.field626.field1225) {
                    return;
                }
                class157.vmethod3351(field1219.payload, 0, Client.field626.field1225);
                field1219.field2339 = 0;
                final int field1223 = Client.field626.field1225;
                Client.field804.method5249();
                Class30.method484();
                Class37.method660(field1219);
                if (field1223 != field1219.field2339) {
                    throw new RuntimeException();
                }
            }
            else {
                ++Client.field616;
                if (Client.field616 > 2000) {
                    if (Client.field617 < 1) {
                        if (Class26.field223 == Class290.field3636) {
                            Class290.field3636 = Class68.field996;
                        }
                        else {
                            Class290.field3636 = Class26.field223;
                        }
                        ++Client.field617;
                        Client.field615 = 0;
                        return;
                    }
                    Class33.method559(-3);
                }
            }
        }
        catch (IOException ex2) {
            if (Client.field617 < 1) {
                if (Class290.field3636 == Class26.field223) {
                    Class290.field3636 = Class68.field996;
                }
                else {
                    Class290.field3636 = Class26.field223;
                }
                ++Client.field617;
                Client.field615 = 0;
                return;
            }
            Class33.method559(-2);
        }
    }
    
    @ObfuscatedName("fw")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "51")
    final void method1143() {
        if (Client.field598 > 1) {
            --Client.field598;
        }
        if (Client.field627 > 0) {
            --Client.field627;
        }
        if (Client.field756) {
            Client.field756 = false;
            Class30.method516();
            return;
        }
        if (!Client.field716) {
            Class59.method1077();
        }
        for (int n = 0; n < 100 && this.method1147(Client.field626); ++n) {}
        if (Client.field589 != 30) {
            return;
        }
        while (Class313.field3759.method4048() != null) {
            final Class172 method433 = Class26.method433(Class169.field2145, Client.field626.field1218);
            method433.field2257.method3532(0);
            final int field2339 = method433.field2257.field2339;
            Class123.method2869(method433.field2257);
            method433.field2257.method3545(method433.field2257.field2339 - field2339);
            Client.field626.method1980(method433);
        }
        if (Client.field804.field3597) {
            final Class172 method434 = Class26.method433(Class169.field2201, Client.field626.field1218);
            method434.field2257.method3532(0);
            final int field2340 = method434.field2257.field2339;
            Client.field804.method5245(method434.field2257);
            method434.field2257.method3545(method434.field2257.field2339 - field2340);
            Client.field626.method1980(method434);
            Client.field804.method5248();
        }
        synchronized (Class26.field220.field523) {
            if (Client.field580) {
                if (Class48.field431 != 0 || Class26.field220.field522 >= 40) {
                    final Class172 method435 = Class26.method433(Class169.field2228, Client.field626.field1218);
                    method435.field2257.method3532(0);
                    final int field2341 = method435.field2257.field2339;
                    int n2 = 0;
                    for (int n3 = 0; n3 < Class26.field220.field522 && method435.field2257.field2339 - field2341 < 240; ++n3) {
                        ++n2;
                        int field2342 = Class26.field220.field526[n3];
                        if (field2342 < 0) {
                            field2342 = 0;
                        }
                        else if (field2342 > 502) {
                            field2342 = 502;
                        }
                        int field2343 = Class26.field220.field525[n3];
                        if (field2343 < 0) {
                            field2343 = 0;
                        }
                        else if (field2343 > 764) {
                            field2343 = 764;
                        }
                        int n4 = field2343 + field2342 * 765;
                        if (Class26.field220.field526[n3] == -1 && Class26.field220.field525[n3] == -1) {
                            field2343 = -1;
                            field2342 = -1;
                            n4 = 524287;
                        }
                        if (field2343 == Client.field593 && field2342 == Client.field594) {
                            if (Client.field595 < 2047) {
                                ++Client.field595;
                            }
                        }
                        else {
                            int n5 = field2343 - Client.field593;
                            Client.field593 = field2343;
                            int n6 = field2342 - Client.field594;
                            Client.field594 = field2342;
                            if (Client.field595 < 8 && n5 >= -32 && n5 <= 31 && n6 >= -32 && n6 <= 31) {
                                n5 += 32;
                                n6 += 32;
                                method435.field2257.method3755(n6 + (Client.field595 << 12) + (n5 << 6));
                                Client.field595 = 0;
                            }
                            else if (Client.field595 < 8) {
                                method435.field2257.method3534((Client.field595 << 19) + n4 + 8388608);
                                Client.field595 = 0;
                            }
                            else {
                                method435.field2257.method3707((Client.field595 << 19) + n4 - 1073741824);
                                Client.field595 = 0;
                            }
                        }
                    }
                    method435.field2257.method3545(method435.field2257.field2339 - field2341);
                    Client.field626.method1980(method435);
                    if (n2 >= Class26.field220.field522) {
                        Class26.field220.field522 = 0;
                    }
                    else {
                        final Class57 field2344 = Class26.field220;
                        field2344.field522 -= n2;
                        for (int i = 0; i < Class26.field220.field522; ++i) {
                            Class26.field220.field525[i] = Class26.field220.field525[n2 + i];
                            Class26.field220.field526[i] = Class26.field220.field526[i + n2];
                        }
                    }
                }
            }
            else {
                Class26.field220.field522 = 0;
            }
        }
        if (Class48.field431 == 1 || (!Class253.field3229 && Class48.field431 == 4) || Class48.field431 == 2) {
            long n7 = (Class48.field433 - Client.field592 * -1L) / 50L;
            if (n7 > 4095L) {
                n7 = 4095L;
            }
            Client.field592 = Class48.field433 * -1L;
            int n8 = Class48.field428;
            if (n8 < 0) {
                n8 = 0;
            }
            else if (n8 > Class243.field3138) {
                n8 = Class243.field3138;
            }
            int n9 = Class48.field432;
            if (n9 < 0) {
                n9 = 0;
            }
            else if (n9 > Class82.field1179) {
                n9 = Class82.field1179;
            }
            final int n10 = (int)n7;
            final Class172 method436 = Class26.method433(Class169.field2188, Client.field626.field1218);
            method436.field2257.method3755(((Class48.field431 == 2) ? 1 : 0) + (n10 << 1));
            method436.field2257.method3755(n9);
            method436.field2257.method3755(n8);
            Client.field626.method1980(method436);
        }
        if (Class39.field349 > 0) {
            final Class172 method437 = Class26.method433(Class169.field2218, Client.field626.field1218);
            method437.field2257.method3755(0);
            final int field2345 = method437.field2257.field2339;
            final long method438 = Class182.method3547();
            for (int j = 0; j < Class39.field349; ++j) {
                long n11 = method438 - Client.field722;
                if (n11 > 16777215L) {
                    n11 = 16777215L;
                }
                Client.field722 = method438;
                method437.field2257.method3532(Class39.field338[j]);
                method437.field2257.method3731((int)n11);
            }
            method437.field2257.method3614(method437.field2257.field2339 - field2345);
            Client.field626.method1980(method437);
        }
        if (Client.field664 > 0) {
            --Client.field664;
        }
        if (Class39.field341[96] || Class39.field341[97] || Class39.field341[98] || Class39.field341[99]) {
            Client.field807 = true;
        }
        if (Client.field807 && Client.field664 <= 0) {
            Client.field664 = 20;
            Client.field807 = false;
            final Class172 method439 = Class26.method433(Class169.field2183, Client.field626.field1218);
            method439.field2257.method3582(Client.field649);
            method439.field2257.method3755(Client.field717);
            Client.field626.method1980(method439);
        }
        if (Class18.field146 && !Client.field847) {
            Client.field847 = true;
            final Class172 method440 = Class26.method433(Class169.field2227, Client.field626.field1218);
            method440.field2257.method3532(1);
            Client.field626.method1980(method440);
        }
        if (!Class18.field146 && Client.field847) {
            Client.field847 = false;
            final Class172 method441 = Class26.method433(Class169.field2227, Client.field626.field1218);
            method441.field2257.method3532(0);
            Client.field626.method1980(method441);
        }
        if (Class53.field476 != null) {
            Class53.field476.method6013();
        }
        if (Class54.field489) {
            if (Class14.field94 != null) {
                Class14.field94.method5337();
            }
            for (int k = 0; k < Class81.field1167; ++k) {
                Client.field610[Class81.field1159[k]].method1086();
            }
            Class54.field489 = false;
        }
        Class82.method1894();
        if (Client.field589 != 30) {
            return;
        }
        for (Class62 class62 = (Class62)Client.field714.method4098(); class62 != null; class62 = (Class62)Client.field714.method4079()) {
            if (class62.field860 > 0) {
                final Class62 class63 = class62;
                --class63.field860;
            }
            if (class62.field860 == 0) {
                if (class62.field859 >= 0) {
                    final int field2346 = class62.field859;
                    int field2347 = class62.field866;
                    final Class268 method442 = Class110.method2527(field2346);
                    if (field2347 == 11) {
                        field2347 = 10;
                    }
                    if (field2347 >= 5 && field2347 <= 8) {
                        field2347 = 4;
                    }
                    if (!method442.method5048(field2347)) {
                        continue;
                    }
                }
                Class170.method3449(class62.field861, class62.field856, class62.field857, class62.field858, class62.field859, class62.field865, class62.field866);
                class62.method4064();
            }
            else {
                if (class62.field855 > 0) {
                    final Class62 class64 = class62;
                    --class64.field855;
                }
                if (class62.field855 == 0 && class62.field857 >= 1 && class62.field858 >= 1 && class62.field857 <= 102 && class62.field858 <= 102) {
                    if (class62.field862 >= 0) {
                        final int field2348 = class62.field862;
                        int field2349 = class62.field864;
                        final Class268 method443 = Class110.method2527(field2348);
                        if (field2349 == 11) {
                            field2349 = 10;
                        }
                        if (field2349 >= 5 && field2349 <= 8) {
                            field2349 = 4;
                        }
                        if (!method443.method5048(field2349)) {
                            continue;
                        }
                    }
                    Class170.method3449(class62.field861, class62.field856, class62.field857, class62.field858, class62.field862, class62.field863, class62.field864);
                    class62.field855 = -1;
                    if (class62.field859 == class62.field862 && class62.field859 == -1) {
                        class62.method4064();
                    }
                    else if (class62.field859 == class62.field862 && class62.field863 == class62.field865 && class62.field866 == class62.field864) {
                        class62.method4064();
                    }
                }
            }
        }
        Class268.method5085();
        final Class87 field2350 = Client.field626;
        ++field2350.field1228;
        if (Client.field626.field1228 > 750) {
            Class30.method516();
            return;
        }
        final int field2351 = Class81.field1167;
        final int[] field2352 = Class81.field1159;
        for (int l = 0; l < field2351; ++l) {
            final Class60 class65 = Client.field610[field2352[l]];
            if (class65 != null) {
                Class59.method1080(class65, 1);
            }
        }
        for (int n12 = 0; n12 < Client.field622; ++n12) {
            final Class72 class66 = Client.field843[Client.field639[n12]];
            if (class66 != null) {
                Class59.method1080(class66, class66.field1037.field3497);
            }
        }
        final int[] field2353 = Class81.field1159;
        for (int n13 = 0; n13 < Class81.field1167; ++n13) {
            final Class60 class67 = Client.field610[field2353[n13]];
            if (class67 != null && class67.field887 > 0) {
                final Class60 class68 = class67;
                --class68.field887;
                if (class67.field887 == 0) {
                    class67.field884 = null;
                }
            }
        }
        for (int n14 = 0; n14 < Client.field622; ++n14) {
            final Class72 class69 = Client.field843[Client.field639[n14]];
            if (class69 != null && class69.field887 > 0) {
                final Class72 class70 = class69;
                --class70.field887;
                if (class69.field887 == 0) {
                    class69.field884 = null;
                }
            }
        }
        ++Client.field700;
        if (Client.field684 != 0) {
            Client.field803 += 20;
            if (Client.field803 >= 400) {
                Client.field684 = 0;
            }
        }
        if (Class240.field3096 != null) {
            ++Client.field686;
            if (Client.field686 >= 15) {
                Class60.method1114(Class240.field3096);
                Class240.field3096 = null;
            }
        }
        final Class230 field2354 = Class143.field1897;
        final Class230 field2355 = Class141.field1888;
        Class143.field1897 = null;
        Class141.field1888 = null;
        Client.field755 = null;
        Client.field772 = false;
        Client.field601 = false;
        Client.field799 = 0;
        while (Class1.method8() && Client.field799 < 128) {
            if (Client.field747 >= 2 && Class39.field341[82] && Class163.field2016 == 66) {
                String string = "";
                for (final Object class71 : Class83.field1181) {
                    string = string + ((Class58)class71).field531 + ':' + ((Class58)class71).field533 + '\n';
                }
                Class182.field2334.method771(string);
            }
            else {
                if (Client.field655 == 1 && Class39.field342 > '\0') {
                    continue;
                }
                Client.field773[Client.field799] = Class163.field2016;
                Client.field800[Client.field799] = Class39.field342;
                ++Client.field799;
            }
        }
        if (Class40.method696() && Class39.field341[82] && Class39.field341[81] && Client.field695 != 0) {
            int n15 = Class138.field1876.field567 - Client.field695;
            if (n15 < 0) {
                n15 = 0;
            }
            else if (n15 > 3) {
                n15 = 3;
            }
            if (n15 != Class138.field1876.field567) {
                Class19.method197(Class138.field1876.field922[0] + Class62.field868, Class138.field1876.field872[0] + Client.field754, n15, false);
            }
            Client.field695 = 0;
        }
        if (Client.field683 != -1) {
            final int field2356 = Client.field683;
            final int field2357 = Class82.field1179;
            final int field2358 = Class243.field3138;
            if (Class261.method4931(field2356)) {
                Class12.method102(Class42.field366[field2356], -1, 0, 0, field2357, field2358, 0, 0);
            }
        }
        ++Client.field801;
        while (true) {
            final Class56 class72 = (Class56)Client.field778.method4076();
            if (class72 == null) {
                break;
            }
            final Class230 field2359 = class72.field506;
            if (field2359.field2606 >= 0) {
                final Class230 method444 = Class26.method434(field2359.field2605);
                if (method444 == null || method444.field2736 == null || field2359.field2606 >= method444.field2736.length) {
                    continue;
                }
                if (field2359 != method444.field2736[field2359.field2606]) {
                    continue;
                }
            }
            Class68.method1696(class72);
        }
        while (true) {
            final Class56 class73 = (Class56)Client.field779.method4076();
            if (class73 == null) {
                break;
            }
            final Class230 field2360 = class73.field506;
            if (field2360.field2606 >= 0) {
                final Class230 method445 = Class26.method434(field2360.field2605);
                if (method445 == null || method445.field2736 == null || field2360.field2606 >= method445.field2736.length) {
                    continue;
                }
                if (field2360 != method445.field2736[field2360.field2606]) {
                    continue;
                }
            }
            Class68.method1696(class73);
        }
        while (true) {
            final Class56 class74 = (Class56)Client.field638.method4076();
            if (class74 == null) {
                break;
            }
            final Class230 field2361 = class74.field506;
            if (field2361.field2606 >= 0) {
                final Class230 method446 = Class26.method434(field2361.field2605);
                if (method446 == null || method446.field2736 == null || field2361.field2606 >= method446.field2736.length) {
                    continue;
                }
                if (field2361 != method446.field2736[field2361.field2606]) {
                    continue;
                }
            }
            Class68.method1696(class74);
        }
        this.method1233();
        Class275.method5239();
        if (Client.field583 != null) {
            this.method1448();
        }
        if (Class276.field3559 != null) {
            Class60.method1114(Class276.field3559);
            ++Client.field693;
            if (Class48.field419 == 0) {
                if (Client.field689) {
                    if (Class132.field1819 == Class276.field3559 && Client.field688 != Client.field691) {
                        final Class230 field2362 = Class276.field3559;
                        int n16 = 0;
                        if (Client.field743 == 1 && field2362.field2609 == 206) {
                            n16 = 1;
                        }
                        if (field2362.field2724[Client.field691] <= 0) {
                            n16 = 0;
                        }
                        if (Class140.method3150(Class24.method425(field2362))) {
                            final int field2363 = Client.field688;
                            final int field2364 = Client.field691;
                            field2362.field2724[field2364] = field2362.field2724[field2363];
                            field2362.field2725[field2364] = field2362.field2725[field2363];
                            field2362.field2724[field2363] = -1;
                            field2362.field2725[field2363] = 0;
                        }
                        else if (n16 == 1) {
                            int field2365 = Client.field688;
                            final int field2366 = Client.field691;
                            while (field2366 != field2365) {
                                if (field2365 > field2366) {
                                    field2362.method4507(field2365 - 1, field2365);
                                    --field2365;
                                }
                                else {
                                    if (field2365 >= field2366) {
                                        continue;
                                    }
                                    field2362.method4507(field2365 + 1, field2365);
                                    ++field2365;
                                }
                            }
                        }
                        else {
                            field2362.method4507(Client.field691, Client.field688);
                        }
                        final Class172 method447 = Class26.method433(Class169.field2170, Client.field626.field1218);
                        method447.field2257.method3576(n16);
                        method447.field2257.method3582(Client.field688);
                        method447.field2257.method3687(Class276.field3559.field2691);
                        method447.field2257.method3582(Client.field691);
                        Client.field626.method1980(method447);
                    }
                }
                else if (this.method1149()) {
                    this.method1476(Client.field678, Client.field821);
                }
                else if (Client.field771 > 0) {
                    Class60.method1120(Client.field678, Client.field821);
                }
                Client.field686 = 10;
                Class48.field431 = 0;
                Class276.field3559 = null;
            }
            else if (Client.field693 >= 5 && (Class48.field425 > Client.field678 + 5 || Class48.field425 < Client.field678 - 5 || Class48.field426 * 673804999 > Client.field821 + 5 || Class48.field426 * 673804999 < Client.field821 - 5)) {
                Client.field689 = true;
            }
        }
        if (Class125.method2911()) {
            final int field2367 = Class125.field1772;
            final int field2368 = Class125.field1747;
            final Class172 method448 = Class26.method433(Class169.field2219, Client.field626.field1218);
            method448.field2257.method3532(5);
            method448.field2257.method3755(field2367 + Class62.field868);
            method448.field2257.method3575(Class39.field341[82] ? (Class39.field341[81] ? 2 : 1) : 0);
            method448.field2257.method3582(field2368 + Client.field754);
            Client.field626.method1980(method448);
            Class125.method2972();
            Client.field681 = Class48.field432;
            Client.field682 = Class48.field428;
            Client.field684 = 1;
            Client.field803 = 0;
            Client.field808 = field2367;
            Client.field809 = field2368;
        }
        if (field2354 != Class143.field1897) {
            if (field2354 != null) {
                Class60.method1114(field2354);
            }
            if (Class143.field1897 != null) {
                Class60.method1114(Class143.field1897);
            }
        }
        if (field2355 != Class141.field1888 && Client.field623 == Client.field732) {
            if (field2355 != null) {
                Class60.method1114(field2355);
            }
            if (Class141.field1888 != null) {
                Class60.method1114(Class141.field1888);
            }
        }
        if (Class141.field1888 != null) {
            if (Client.field623 < Client.field732) {
                ++Client.field623;
                if (Client.field732 == Client.field623) {
                    Class60.method1114(Class141.field1888);
                }
            }
        }
        else if (Client.field623 > 0) {
            --Client.field623;
        }
        Class85.method1962();
        if (Client.field822) {
            final int n17 = Class24.field203 * 128 + 64;
            final int n18 = Class150.field1928 * 128 + 64;
            final int n19 = Class27.method460(n17, n18, Class13.field82) - Class224.field2555;
            if (Class109.field1431 < n17) {
                Class109.field1431 = (n17 - Class109.field1431) * Class84.field1197 / 1000 + Class109.field1431 + Class245.field3154;
                if (Class109.field1431 > n17) {
                    Class109.field1431 = n17;
                }
            }
            if (Class109.field1431 > n17) {
                Class109.field1431 -= Class84.field1197 * (Class109.field1431 - n17) / 1000 + Class245.field3154;
                if (Class109.field1431 < n17) {
                    Class109.field1431 = n17;
                }
            }
            if (Class123.field1702 < n19) {
                Class123.field1702 = (n19 - Class123.field1702) * Class84.field1197 / 1000 + Class123.field1702 + Class245.field3154;
                if (Class123.field1702 > n19) {
                    Class123.field1702 = n19;
                }
            }
            if (Class123.field1702 > n19) {
                Class123.field1702 -= Class84.field1197 * (Class123.field1702 - n19) / 1000 + Class245.field3154;
                if (Class123.field1702 < n19) {
                    Class123.field1702 = n19;
                }
            }
            if (Class226.field2563 < n18) {
                Class226.field2563 = (n18 - Class226.field2563) * Class84.field1197 / 1000 + Class226.field2563 + Class245.field3154;
                if (Class226.field2563 > n18) {
                    Class226.field2563 = n18;
                }
            }
            if (Class226.field2563 > n18) {
                Class226.field2563 -= Class84.field1197 * (Class226.field2563 - n18) / 1000 + Class245.field3154;
                if (Class226.field2563 < n18) {
                    Class226.field2563 = n18;
                }
            }
            final int n20 = Class50.field456 * 128 + 64;
            final int n21 = Class237.field3082 * 128 + 64;
            final int n22 = Class27.method460(n20, n21, Class13.field82) - Class11.field68;
            final int n23 = n20 - Class109.field1431;
            final int n24 = n22 - Class123.field1702;
            final int n25 = n21 - Class226.field2563;
            int n26 = (int)(Math.atan2(n24, (int)Math.sqrt(n25 * n25 + n23 * n23)) * 325.949) & 0x7FF;
            final int field2369 = (int)(Math.atan2(n23, n25) * -325.949) & 0x7FF;
            if (n26 < 128) {
                n26 = 128;
            }
            if (n26 > 383) {
                n26 = 383;
            }
            if (Class7.field41 < n26) {
                Class7.field41 = (n26 - Class7.field41) * Class133.field1834 / 1000 + Class7.field41 + Class72.field1033;
                if (Class7.field41 > n26) {
                    Class7.field41 = n26;
                }
            }
            if (Class7.field41 > n26) {
                Class7.field41 -= Class133.field1834 * (Class7.field41 - n26) / 1000 + Class72.field1033;
                if (Class7.field41 < n26) {
                    Class7.field41 = n26;
                }
            }
            int n27 = field2369 - Class85.field1201;
            if (n27 > 1024) {
                n27 -= 2048;
            }
            if (n27 < -1024) {
                n27 += 2048;
            }
            if (n27 > 0) {
                Class85.field1201 = n27 * Class133.field1834 / 1000 + Class85.field1201 + Class72.field1033;
                Class85.field1201 &= 0x7FF;
            }
            if (n27 < 0) {
                Class85.field1201 -= -n27 * Class133.field1834 / 1000 + Class72.field1033;
                Class85.field1201 &= 0x7FF;
            }
            int n28 = field2369 - Class85.field1201;
            if (n28 > 1024) {
                n28 -= 2048;
            }
            if (n28 < -1024) {
                n28 += 2048;
            }
            if ((n28 < 0 && n27 > 0) || (n28 > 0 && n27 < 0)) {
                Class85.field1201 = field2369;
            }
        }
        for (int n29 = 0; n29 < 5; ++n29) {
            final int[] field2370 = Client.field705;
            final int n30 = n29;
            ++field2370[n30];
        }
        Class22.field185.method1902();
        final int method449 = Class37.method652();
        final int field2371 = Class39.field353;
        if (method449 > 15000 && field2371 > 15000) {
            Client.field627 = 250;
            Class80.method1866(14500);
            Client.field626.method1980(Class26.method433(Class169.field2152, Client.field626.field1218));
        }
        Class181.field2332.method1627();
        final Class87 field2372 = Client.field626;
        ++field2372.field1224;
        if (Client.field626.field1224 > 50) {
            Client.field626.method1980(Class26.method433(Class169.field2211, Client.field626.field1218));
        }
        try {
            Client.field626.method1979();
        }
        catch (IOException ex) {
            Class30.method516();
        }
    }
    
    @ObfuscatedName("gp")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-681857594")
    void method1145() {
        final int field1179 = Class82.field1179;
        final int field1180 = Class243.field3138;
        if (super.field396 < field1179) {
            final int field1181 = super.field396;
        }
        if (super.field397 < field1180) {
            final int field1182 = super.field397;
        }
        if (Class10.field61 != null) {
            try {
                Class41.method700(Class182.field2334, "resize", new Object[] { Client.field792 ? 2 : 1 });
            }
            catch (Throwable t) {}
        }
    }
    
    @ObfuscatedName("ge")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "0")
    final void method1146() {
        if (Client.field683 != -1) {
            Class21.method270(Client.field683);
        }
        for (int i = 0; i < Client.field603; ++i) {
            if (Client.field697[i]) {
                Client.field788[i] = true;
            }
            Client.field723[i] = Client.field697[i];
            Client.field697[i] = false;
        }
        Client.field830 = Client.field591;
        Client.field729 = -1;
        Client.field730 = -1;
        Class132.field1819 = null;
        if (Client.field683 != -1) {
            Client.field603 = 0;
            Class35.method630(Client.field683, 0, 0, Class82.field1179, Class243.field3138, 0, 0, -1);
        }
        Class314.method5719();
        if (!Client.field716) {
            if (Client.field729 != -1) {
                Class51.method997(Client.field729, Client.field730);
            }
        }
        else {
            Class83.method1940();
        }
        if (Client.field790 == 3) {
            for (int j = 0; j < Client.field603; ++j) {
                if (Client.field723[j]) {
                    Class314.method5727(Client.field786[j], Client.field787[j], Client.field641[j], Client.field789[j], 16711935, 128);
                }
                else if (Client.field788[j]) {
                    Class314.method5727(Client.field786[j], Client.field787[j], Client.field641[j], Client.field789[j], 16711680, 128);
                }
            }
        }
        final int field82 = Class13.field82;
        final int field83 = Class138.field1876.field931;
        final int field84 = Class138.field1876.field881;
        final int field85 = Client.field700;
        for (Class68 class68 = (Class68)Class68.field985.method4098(); class68 != null; class68 = (Class68)Class68.field985.method4079()) {
            if (class68.field987 != -1 || class68.field986 != null) {
                int n = 0;
                if (field83 > class68.field984) {
                    n += field83 - class68.field984;
                }
                else if (field83 < class68.field988) {
                    n += class68.field988 - field83;
                }
                if (field84 > class68.field992) {
                    n += field84 - class68.field992;
                }
                else if (field84 < class68.field983) {
                    n += class68.field983 - field84;
                }
                if (n - 64 > class68.field991 || Client.field815 == 0 || field82 != class68.field981) {
                    if (class68.field993 != null) {
                        Class36.field310.method2009(class68.field993);
                        class68.field993 = null;
                    }
                    if (class68.field980 != null) {
                        Class36.field310.method2009(class68.field980);
                        class68.field980 = null;
                    }
                }
                else {
                    n -= 64;
                    if (n < 0) {
                        n = 0;
                    }
                    final int n2 = (class68.field991 - n) * Client.field815 / class68.field991;
                    if (class68.field993 == null) {
                        if (class68.field987 >= 0) {
                            final Class91 method2071 = Class91.method2071(Class135.field1852, class68.field987, 0);
                            if (method2071 != null) {
                                final Class103 method2072 = Class103.method2287(method2071.method2069().method2115(Class61.field577), 100, n2);
                                method2072.method2258(-1);
                                Class36.field310.method2032(method2072);
                                class68.field993 = method2072;
                            }
                        }
                    }
                    else {
                        class68.field993.method2267(n2);
                    }
                    if (class68.field980 == null) {
                        if (class68.field986 != null) {
                            final Class68 class69 = class68;
                            if ((class69.field990 -= field85) <= 0) {
                                final Class91 method2073 = Class91.method2071(Class135.field1852, class68.field986[(int)(Math.random() * class68.field986.length)], 0);
                                if (method2073 != null) {
                                    final Class103 method2074 = Class103.method2287(method2073.method2069().method2115(Class61.field577), 100, n2);
                                    method2074.method2258(0);
                                    Class36.field310.method2032(method2074);
                                    class68.field980 = method2074;
                                    class68.field990 = class68.field989 + (int)(Math.random() * (class68.field982 - class68.field989));
                                }
                            }
                        }
                    }
                    else {
                        class68.field980.method2267(n2);
                        if (!class68.field980.method4065()) {
                            class68.field980 = null;
                        }
                    }
                }
            }
        }
        Client.field700 = 0;
    }
    
    @ObfuscatedName("hp")
    @ObfuscatedSignature(signature = "(Lcf;B)Z", garbageValue = "115")
    final boolean method1147(final Class87 class87) {
        final Class157 method1983 = class87.method1983();
        final Class189 field1219 = class87.field1219;
        if (method1983 == null) {
            return false;
        }
        try {
            if (class87.field1220 == null) {
                if (class87.field1222) {
                    if (!method1983.vmethod3350(1)) {
                        return false;
                    }
                    method1983.vmethod3351(class87.field1219.payload, 0, 1);
                    class87.field1228 = 0;
                    class87.field1222 = false;
                }
                field1219.field2339 = 0;
                if (field1219.method3821()) {
                    if (!method1983.vmethod3350(1)) {
                        return false;
                    }
                    method1983.vmethod3351(class87.field1219.payload, 1, 1);
                    class87.field1228 = 0;
                }
                class87.field1222 = true;
                final Class168[] array = { Class168.field2100, Class168.field2050, Class168.field2051, Class168.field2070, Class168.field2053, Class168.field2054, Class168.field2055, Class168.field2122, Class168.field2083, Class168.field2065, Class168.field2059, Class168.field2060, Class168.field2061, Class168.field2062, Class168.field2063, Class168.field2106, Class168.field2107, Class168.field2069, Class168.field2128, Class168.field2105, Class168.field2116, Class168.field2111, Class168.field2071, Class168.field2072, Class168.field2114, Class168.field2074, Class168.field2075, Class168.field2058, Class168.field2077, Class168.field2078, Class168.field2131, Class168.field2080, Class168.field2081, Class168.field2127, Class168.field2079, Class168.field2084, Class168.field2085, Class168.field2086, Class168.field2087, Class168.field2088, Class168.field2089, Class168.field2090, Class168.field2091, Class168.field2092, Class168.field2093, Class168.field2076, Class168.field2095, Class168.field2096, Class168.field2097, Class168.field2098, Class168.field2099, Class168.field2082, Class168.field2101, Class168.field2102, Class168.field2094, Class168.field2104, Class168.field2067, Class168.field2064, Class168.field2119, Class168.field2108, Class168.field2109, Class168.field2049, Class168.field2068, Class168.field2112, Class168.field2113, Class168.field2129, Class168.field2115, Class168.field2073, Class168.field2117, Class168.field2118, Class168.field2124, Class168.field2120, Class168.field2121, Class168.field2103, Class168.field2123, Class168.field2066, Class168.field2125, Class168.field2130, Class168.field2126, Class168.field2057, Class168.field2056, Class168.field2110, Class168.field2052, Class168.field2132 };
                final int method1984 = field1219.method3841();
                if (method1984 < 0 || method1984 >= array.length) {
                    throw new IOException(method1984 + " " + field1219.field2339);
                }
                class87.field1220 = array[method1984];
                class87.field1225 = class87.field1220.field2134;
            }
            if (class87.field1225 == -1) {
                if (!method1983.vmethod3350(1)) {
                    return false;
                }
                class87.method1983().vmethod3351(field1219.payload, 0, 1);
                class87.field1225 = (field1219.payload[0] & 0xFF);
            }
            if (class87.field1225 == -2) {
                if (!method1983.vmethod3350(2)) {
                    return false;
                }
                class87.method1983().vmethod3351(field1219.payload, 0, 2);
                field1219.field2339 = 0;
                class87.field1225 = field1219.method3550();
            }
            if (!method1983.vmethod3350(class87.field1225)) {
                return false;
            }
            field1219.field2339 = 0;
            method1983.vmethod3351(field1219.payload, 0, class87.field1225);
            class87.field1228 = 0;
            Client.field804.method5244();
            class87.field1227 = class87.field1226;
            class87.field1226 = class87.field1215;
            class87.field1215 = class87.field1220;
            if (Class168.field2131 == class87.field1220) {
                final String method1985 = field1219.method3738();
                final long n = field1219.method3550();
                final long n2 = field1219.method3552();
                final Class242 class88 = (Class242)Class76.method1803(Class20.method216(), field1219.method3544());
                final long n3 = (n << 32) + n2;
                boolean b = false;
                for (int i = 0; i < 100; ++i) {
                    if (n3 == Client.field797[i]) {
                        b = true;
                        break;
                    }
                }
                if (Class181.field2332.method1630(new Class291(method1985, Class36.field306))) {
                    b = true;
                }
                if (!b && Client.field694 == 0) {
                    Client.field797[Client.field798] = n3;
                    Client.field798 = (Client.field798 + 1) % 100;
                    String method1987;
                    try {
                        int method1986 = field1219.method3562();
                        if (method1986 > 32767) {
                            method1986 = 32767;
                        }
                        final byte[] array2 = new byte[method1986];
                        final Class189 class89 = field1219;
                        class89.field2339 += Class300.field3712.method3480(field1219.payload, field1219.field2339, array2, 0, method1986);
                        method1987 = Class78.method1831(array2, 0, method1986);
                    }
                    catch (Exception ex2) {
                        method1987 = "Cabbage";
                    }
                    final String method1988 = Class299.method5521(Class51.method998(method1987));
                    int n4;
                    if (class88.field3126) {
                        n4 = 7;
                    }
                    else {
                        n4 = 3;
                    }
                    if (class88.field3128 != -1) {
                        Class143.method3172(n4, "<img=" + class88.field3128 + ">" + method1985, method1988);
                    }
                    else {
                        Class143.method3172(n4, method1985, method1988);
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2103 == class87.field1220) {
                if (field1219.method3555()) {
                    if (Class21.field175 == null) {
                        Class21.field175 = new Class251();
                    }
                }
                else {
                    Class21.field175 = null;
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2084 == class87.field1220) {
                int method1989 = field1219.method3613();
                if (method1989 == 65535) {
                    method1989 = -1;
                }
                final int method1990 = field1219.method3609();
                final int method1991 = field1219.method3770();
                int method1992 = field1219.method3646();
                if (method1992 == 65535) {
                    method1992 = -1;
                }
                for (int j = method1989; j <= method1992; ++j) {
                    final long n5 = (method1990 << 32) + j;
                    final Class204 method1993 = Client.field783.method4020(n5);
                    if (method1993 != null) {
                        method1993.method4064();
                    }
                    Client.field783.method4016(new Class211(method1991), n5);
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2071 == class87.field1220) {
                final int method1994 = field1219.method3671();
                int method1995 = field1219.method3550();
                if (method1994 < -70000) {
                    method1995 += 32768;
                }
                Class230 method1996;
                if (method1994 >= 0) {
                    method1996 = Class26.method434(method1994);
                }
                else {
                    method1996 = null;
                }
                while (field1219.field2339 < class87.field1225) {
                    final int method1997 = field1219.method3562();
                    final int method1998 = field1219.method3550();
                    int n6 = 0;
                    if (method1998 != 0) {
                        n6 = field1219.method3544();
                        if (n6 == 255) {
                            n6 = field1219.method3671();
                        }
                    }
                    if (method1996 != null && method1997 >= 0 && method1997 < method1996.field2724.length) {
                        method1996.field2724[method1997] = method1998;
                        method1996.field2725[method1997] = n6;
                    }
                    Class10.method96(method1995, method1997, method1998 - 1, n6);
                }
                if (method1996 != null) {
                    Class60.method1114(method1996);
                }
                Class295.method5501();
                Client.field766[++Client.field767 - 1 & 0x1F] = (method1995 & 0x7FFF);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2108 == class87.field1220) {
                Class226.field2568 = field1219.method3544();
                Class57.field524 = field1219.method3577();
                while (field1219.field2339 < class87.field1225) {
                    Class29.method479((new Class171[] { Class171.field2249, Class171.field2242, Class171.field2244, Class171.field2243, Class171.field2245, Class171.field2246, Class171.field2241, Class171.field2248, Class171.field2247, Class171.field2250 })[field1219.method3544()]);
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2117 == class87.field1220) {
                Class97.method2213();
                class87.field1220 = null;
                return false;
            }
            if (Class168.field2100 == class87.field1220) {
                final int method1999 = field1219.method3770();
                final int method2000 = field1219.method3613();
                final Class230 method2001 = Class26.method434(method1999);
                if (method2001.field2665 != 2 || method2000 != method2001.field2593) {
                    method2001.field2665 = 2;
                    method2001.field2593 = method2000;
                    Class60.method1114(method2001);
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2085 == class87.field1220) {
                Class51.method994(false, class87.field1219);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2116 == class87.field1220) {
                final int method2002 = field1219.method3609();
                final boolean field1220 = field1219.method3607() == 1;
                final Class230 method2003 = Class26.method434(method2002);
                if (field1220 != method2003.field2625) {
                    method2003.field2625 = field1220;
                    Class60.method1114(method2003);
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2070 == class87.field1220) {
                final String method2004 = field1219.method3738();
                final Object[] field1221 = new Object[method2004.length() + 1];
                for (int k = method2004.length() - 1; k >= 0; --k) {
                    if (method2004.charAt(k) == 's') {
                        field1221[k + 1] = field1219.method3738();
                    }
                    else {
                        field1221[k + 1] = new Integer(field1219.method3671());
                    }
                }
                field1221[0] = new Integer(field1219.method3671());
                final Class56 class90 = new Class56();
                class90.field512 = field1221;
                Class68.method1696(class90);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2110 == class87.field1220) {
                Class51.method994(true, class87.field1219);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2121 == class87.field1220) {
                for (int l = 0; l < Class254.field3232; ++l) {
                    if (Class63.method1549(l) != null) {
                        Class225.field2559[l] = 0;
                        Class225.field2558[l] = 0;
                    }
                }
                Class295.method5501();
                Client.field765 += 32;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2114 == class87.field1220) {
                final String method2005 = field1219.method3738();
                final long method2006 = field1219.method3554();
                final long n7 = field1219.method3550();
                final long n8 = field1219.method3552();
                final Class242 class91 = (Class242)Class76.method1803(Class20.method216(), field1219.method3544());
                final long n9 = n8 + (n7 << 32);
                boolean b2 = false;
                for (int n10 = 0; n10 < 100; ++n10) {
                    if (n9 == Client.field797[n10]) {
                        b2 = true;
                        break;
                    }
                }
                if (class91.field3127 && Class181.field2332.method1630(new Class291(method2005, Class36.field306))) {
                    b2 = true;
                }
                if (!b2 && Client.field694 == 0) {
                    Client.field797[Client.field798] = n9;
                    Client.field798 = (Client.field798 + 1) % 100;
                    String method2008;
                    try {
                        int method2007 = field1219.method3562();
                        if (method2007 > 32767) {
                            method2007 = 32767;
                        }
                        final byte[] array3 = new byte[method2007];
                        final Class189 class92 = field1219;
                        class92.field2339 += Class300.field3712.method3480(field1219.payload, field1219.field2339, array3, 0, method2007);
                        method2008 = Class78.method1831(array3, 0, method2007);
                    }
                    catch (Exception ex3) {
                        method2008 = "Cabbage";
                    }
                    final String method2009 = Class299.method5521(Class51.method998(method2008));
                    if (class91.field3128 != -1) {
                        Class173.method3472(9, "<img=" + class91.field3128 + ">" + method2005, method2009, Class172.method3457(method2006));
                    }
                    else {
                        Class173.method3472(9, method2005, method2009, Class172.method3457(method2006));
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2052 == class87.field1220) {
                Client.field810 = field1219.method3544();
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2111 == class87.field1220) {
                final int method2010 = field1219.method3562();
                final boolean b3 = field1219.method3544() == 1;
                String method2011 = "";
                boolean b4 = false;
                if (b3) {
                    method2011 = field1219.method3738();
                    if (Class181.field2332.method1630(new Class291(method2011, Class36.field306))) {
                        b4 = true;
                    }
                }
                final String method2012 = field1219.method3738();
                if (!b4) {
                    Class143.method3172(method2010, method2011, method2012);
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2126 == class87.field1220) {
                final int method2013 = field1219.method3550();
                final int method2014 = field1219.method3544();
                final int method2015 = field1219.method3550();
                final int n11 = method2013;
                final int n12 = method2014;
                final int n13 = method2015;
                if (Client.field814 != 0 && n12 != 0 && Client.field656 < 50) {
                    Client.field817[Client.field656] = n11;
                    Client.field676[Client.field656] = n12;
                    Client.field819[Client.field656] = n13;
                    Client.field719[Client.field656] = null;
                    Client.field820[Client.field656] = 0;
                    ++Client.field656;
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2097 == class87.field1220) {
                Client.field822 = true;
                Class50.field456 = field1219.method3544();
                Class237.field3082 = field1219.method3544();
                Class11.field68 = field1219.method3550();
                Class72.field1033 = field1219.method3544();
                Class133.field1834 = field1219.method3544();
                if (Class133.field1834 >= 100) {
                    final int n14 = Class50.field456 * 128 + 64;
                    final int n15 = Class237.field3082 * 128 + 64;
                    final int n16 = Class27.method460(n14, n15, Class13.field82) - Class11.field68;
                    final int n17 = n14 - Class109.field1431;
                    final int n18 = n16 - Class123.field1702;
                    final int n19 = n15 - Class226.field2563;
                    Class7.field41 = ((int)(Math.atan2(n18, (int)Math.sqrt(n19 * n19 + n17 * n17)) * 325.949) & 0x7FF);
                    Class85.field1201 = ((int)(Math.atan2(n17, n19) * -325.949) & 0x7FF);
                    if (Class7.field41 < 128) {
                        Class7.field41 = 128;
                    }
                    if (Class7.field41 > 383) {
                        Class7.field41 = 383;
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2066 == class87.field1220) {
                Class29.method479(Class171.field2242);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2067 == class87.field1220) {
                Class216.method4179(field1219, class87.field1225);
                Class97.method2215();
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2061 == class87.field1220) {
                Class29.method479(Class171.field2248);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2056 == class87.field1220) {
                Class57.field524 = field1219.method3765();
                Class226.field2568 = field1219.method3577();
                for (int field1222 = Class57.field524; field1222 < Class57.field524 + 8; ++field1222) {
                    for (int field1223 = Class226.field2568; field1223 < Class226.field2568 + 8; ++field1223) {
                        if (Client.field708[Class13.field82][field1222][field1223] != null) {
                            Client.field708[Class13.field82][field1222][field1223] = null;
                            Class253.method4808(field1222, field1223);
                        }
                    }
                }
                for (Class62 class93 = (Class62)Client.field714.method4098(); class93 != null; class93 = (Class62)Client.field714.method4079()) {
                    if (class93.field857 >= Class57.field524 && class93.field857 < Class57.field524 + 8 && class93.field858 >= Class226.field2568 && class93.field858 < Class226.field2568 + 8 && class93.field861 == Class13.field82) {
                        class93.field860 = 0;
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2049 == class87.field1220) {
                Class29.method479(Class171.field2249);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2118 == class87.field1220) {
                final int method2016 = field1219.method3544();
                final int method2017 = field1219.method3544();
                final int method2018 = field1219.method3544();
                final int method2019 = field1219.method3544();
                Client.field823[method2016] = true;
                Client.field824[method2016] = method2017;
                Client.field825[method2016] = method2018;
                Client.field826[method2016] = method2019;
                Client.field705[method2016] = 0;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2069 == class87.field1220) {
                final int method2020 = field1219.method3765();
                final int method2021 = field1219.method3607();
                String method2022 = field1219.method3738();
                if (method2021 >= 1 && method2021 <= 8) {
                    if (method2022.equalsIgnoreCase("null")) {
                        method2022 = null;
                    }
                    Client.field704[method2021 - 1] = method2022;
                    Client.field709[method2021 - 1] = (method2020 == 0);
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2105 == class87.field1220) {
                Class29.method479(Class171.field2244);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2092 == class87.field1220) {
                Class29.method479(Class171.field2250);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2075 == class87.field1220) {
                Client.field808 = field1219.method3544();
                if (Client.field808 == 255) {
                    Client.field808 = 0;
                }
                Client.field809 = field1219.method3544();
                if (Client.field809 == 255) {
                    Client.field809 = 0;
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2122 == class87.field1220) {
                final int method2023 = field1219.method3671();
                int method2024 = field1219.method3550();
                if (method2023 < -70000) {
                    method2024 += 32768;
                }
                Class230 method2025;
                if (method2023 >= 0) {
                    method2025 = Class26.method434(method2023);
                }
                else {
                    method2025 = null;
                }
                if (method2025 != null) {
                    for (int n20 = 0; n20 < method2025.field2724.length; ++n20) {
                        method2025.field2724[n20] = 0;
                        method2025.field2725[n20] = 0;
                    }
                }
                Class121.method2782(method2024);
                for (int method2026 = field1219.method3550(), n21 = 0; n21 < method2026; ++n21) {
                    int n22 = field1219.method3544();
                    if (n22 == 255) {
                        n22 = field1219.method3609();
                    }
                    final int method2027 = field1219.method3550();
                    if (method2025 != null && n21 < method2025.field2724.length) {
                        method2025.field2724[n21] = method2027;
                        method2025.field2725[n21] = n22;
                    }
                    Class10.method96(method2024, n21, method2027 - 1, n22);
                }
                if (method2025 != null) {
                    Class60.method1114(method2025);
                }
                Class295.method5501();
                Client.field766[++Client.field767 - 1 & 0x1F] = (method2024 & 0x7FFF);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2101 == class87.field1220) {
                final int method2028 = field1219.method3770();
                final int method2029 = field1219.method3550();
                final int method2030 = field1219.method3646();
                final int method2031 = field1219.method3585();
                final Class230 method2032 = Class26.method434(method2028);
                if (method2031 != method2032.field2656 || method2029 != method2032.field2657 || method2030 != method2032.field2704) {
                    method2032.field2656 = method2031;
                    method2032.field2657 = method2029;
                    method2032.field2704 = method2030;
                    Class60.method1114(method2032);
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2090 == class87.field1220) {
                final int method2033 = field1219.method3551();
                final int method2034 = field1219.method3595();
                final int method2035 = field1219.method3533();
                final Class230 method2036 = Class26.method434(method2034);
                if (method2035 != method2036.field2607 || method2033 != method2036.field2615 || method2036.field2610 != 0 || method2036.field2611 != 0) {
                    method2036.field2607 = method2035;
                    method2036.field2615 = method2033;
                    method2036.field2610 = 0;
                    method2036.field2611 = 0;
                    Class60.method1114(method2036);
                    this.method1152(method2036);
                    if (method2036.field2721 == 0) {
                        Class163.method3388(Class42.field366[method2034 >> 16], method2036, false);
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2112 == class87.field1220) {
                final Class189 class94 = field1219;
                class94.field2339 += 28;
                if (field1219.method3756()) {
                    Class175.method3487(field1219, field1219.field2339 - 28);
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2054 == class87.field1220) {
                Client.field598 = field1219.method3585() * 30;
                Client.field775 = Client.field801;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2094 == class87.field1220) {
                int method2037 = field1219.method3613();
                if (method2037 == 65535) {
                    method2037 = -1;
                }
                final int method2038 = field1219.method3671();
                final int method2039 = field1219.method3595();
                final Class230 method2040 = Class26.method434(method2038);
                if (!method2040.field2604) {
                    if (method2037 == -1) {
                        method2040.field2665 = 0;
                        class87.field1220 = null;
                        return true;
                    }
                    final Class269 method2041 = Class111.method2563(method2037);
                    method2040.field2665 = 4;
                    method2040.field2593 = method2037;
                    method2040.field2656 = method2041.field3439;
                    method2040.field2657 = method2041.field3440;
                    method2040.field2704 = method2041.field3438 * 100 / method2039;
                    Class60.method1114(method2040);
                }
                else {
                    method2040.field2649 = method2037;
                    method2040.field2727 = method2039;
                    final Class269 method2042 = Class111.method2563(method2037);
                    method2040.field2656 = method2042.field3439;
                    method2040.field2657 = method2042.field3440;
                    method2040.field2658 = method2042.field3474;
                    method2040.field2592 = method2042.field3442;
                    method2040.field2655 = method2042.field3443;
                    method2040.field2704 = method2042.field3438;
                    if (method2042.field3444 == 1) {
                        method2040.field2664 = 1;
                    }
                    else {
                        method2040.field2664 = 2;
                    }
                    if (method2040.field2660 > 0) {
                        method2040.field2704 = method2040.field2704 * 32 / method2040.field2660;
                    }
                    else if (method2040.field2616 > 0) {
                        method2040.field2704 = method2040.field2704 * 32 / method2040.field2616;
                    }
                    Class60.method1114(method2040);
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2058 == class87.field1220) {
                Class143.field1899 = Class189.method3847(field1219.method3544());
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2104 == class87.field1220) {
                Class132.method3096(field1219.method3544());
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2083 == class87.field1220) {
                Class245.method4619(true, field1219);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2073 == class87.field1220) {
                Client.field822 = true;
                Class24.field203 = field1219.method3544();
                Class150.field1928 = field1219.method3544();
                Class224.field2555 = field1219.method3550();
                Class245.field3154 = field1219.method3544();
                Class84.field1197 = field1219.method3544();
                if (Class84.field1197 >= 100) {
                    Class109.field1431 = Class24.field203 * 128 + 64;
                    Class226.field2563 = Class150.field1928 * 128 + 64;
                    Class123.field1702 = Class27.method460(Class109.field1431, Class226.field2563, Class13.field82) - Class224.field2555;
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2074 == class87.field1220) {
                final int method2043 = field1219.method3671();
                if (method2043 != Client.field853) {
                    Client.field853 = method2043;
                    if (Client.field655 == 1) {
                        Client.field663 = true;
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2109 == class87.field1220) {
                Client.field599 = field1219.method3544();
                if (Client.field599 == 1) {
                    Client.field600 = field1219.method3550();
                }
                if (Client.field599 >= 2 && Client.field599 <= 6) {
                    if (Client.field599 == 2) {
                        Client.field605 = 64;
                        Client.field637 = 64;
                    }
                    if (Client.field599 == 3) {
                        Client.field605 = 0;
                        Client.field637 = 64;
                    }
                    if (Client.field599 == 4) {
                        Client.field605 = 128;
                        Client.field637 = 64;
                    }
                    if (Client.field599 == 5) {
                        Client.field605 = 64;
                        Client.field637 = 0;
                    }
                    if (Client.field599 == 6) {
                        Client.field605 = 64;
                        Client.field637 = 128;
                    }
                    Client.field599 = 2;
                    Client.field602 = field1219.method3550();
                    Client.field818 = field1219.method3550();
                    Client.field604 = field1219.method3544();
                }
                if (Client.field599 == 10) {
                    Client.field579 = field1219.method3550();
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2055 == class87.field1220) {
                Class17.method172(field1219, class87.field1225);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2086 == class87.field1220) {
                final int method2044 = field1219.method3671();
                final String method2045 = field1219.method3738();
                final Class230 method2046 = Class26.method434(method2044);
                if (!method2045.equals(method2046.field2667)) {
                    method2046.field2667 = method2045;
                    Class60.method1114(method2046);
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2099 == class87.field1220) {
                final int method2047 = field1219.method3595();
                final int method2048 = field1219.method3585();
                if (Class225.field2558[method2048] != (Class225.field2559[method2048] = method2047)) {
                    Class225.field2558[method2048] = method2047;
                }
                Class45.method749(method2048);
                Client.field764[++Client.field765 - 1 & 0x1F] = method2048;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2107 == class87.field1220) {
                final int n23 = Client.field683 = field1219.method3550();
                this.method1151(false);
                Class216.method4178(n23);
                Class135.method3114(Client.field683);
                for (int n24 = 0; n24 < 100; ++n24) {
                    Client.field697[n24] = true;
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2060 == class87.field1220) {
                final Class55 class95 = (Class55)Client.field741.method4020(field1219.method3671());
                if (class95 != null) {
                    Class20.method261(class95, true);
                }
                if (Client.field744 != null) {
                    Class60.method1114(Client.field744);
                    Client.field744 = null;
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2106 == class87.field1220) {
                if (Class14.field94 != null) {
                    Class14.field94.method5489(field1219);
                }
                Class1.method13();
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2129 == class87.field1220) {
                final int method2049 = field1219.method3588();
                final Class230 method2050 = Class26.method434(field1219.method3609());
                if (method2049 != method2050.field2595 || method2049 == -1) {
                    method2050.field2595 = method2049;
                    method2050.field2728 = 0;
                    method2050.field2613 = 0;
                    Class60.method1114(method2050);
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2072 == class87.field1220) {
                for (int n25 = 0; n25 < Client.field610.length; ++n25) {
                    if (Client.field610[n25] != null) {
                        Client.field610[n25].field903 = -1;
                    }
                }
                for (int n26 = 0; n26 < Client.field843.length; ++n26) {
                    if (Client.field843[n26] != null) {
                        Client.field843[n26].field903 = -1;
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2123 == class87.field1220) {
                Class181.field2332.method1625();
                Client.field647 = Client.field801;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2059 == class87.field1220) {
                Class295.method5501();
                final int method2051 = field1219.method3770();
                final int method2052 = field1219.method3577();
                final int method2053 = field1219.method3607();
                Client.field640[method2052] = method2051;
                Client.field712[method2052] = method2053;
                Client.field713[method2052] = 1;
                for (int n27 = 0; n27 < 98; ++n27) {
                    if (method2051 >= Class234.field2779[n27]) {
                        Client.field713[method2052] = n27 + 2;
                    }
                }
                Client.field690[++Client.field769 - 1 & 0x1F] = method2052;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2089 == class87.field1220) {
                final int method2054 = field1219.method3671();
                final int method2055 = field1219.method3671();
                final int method2056 = Class37.method661();
                final Class172 method2057 = Class26.method433(Class169.field2176, Client.field626.field1218);
                method2057.field2257.method3574(Class47.field393);
                method2057.field2257.method3673(method2054);
                method2057.field2257.method3673(method2055);
                method2057.field2257.method3574(method2056);
                Client.field626.method1980(method2057);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2102 == class87.field1220) {
                Class295.method5501();
                Client.field782 = field1219.method3551();
                Client.field775 = Client.field801;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2076 == class87.field1220) {
                if (Client.field683 != -1) {
                    final int field1224 = Client.field683;
                    if (Class261.method4931(field1224)) {
                        Class83.method1923(Class42.field366[field1224], 0);
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2120 == class87.field1220) {
                Class181.field2332.method1679(field1219, class87.field1225);
                Client.field647 = Client.field801;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2119 == class87.field1220) {
                Class29.method479(Class171.field2247);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2125 == class87.field1220) {
                Class29.method479(Class171.field2243);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2113 == class87.field1220) {
                if (class87.field1225 == 0) {
                    Class14.field94 = null;
                }
                else {
                    if (Class14.field94 == null) {
                        Class14.field94 = new Class293(Class36.field306, Class182.field2334);
                    }
                    Class14.field94.method5463(field1219);
                }
                Class1.method13();
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2115 == class87.field1220) {
                final String s = Class163.field2013 = field1219.method3738();
                try {
                    final String string = Class182.field2334.getParameter(Class279.field3596.field3591) + "settings=" + s + "; version=1; path=/; domain=" + Class182.field2334.getParameter(Class279.field3581.field3591);
                    String s2;
                    if (s.length() == 0) {
                        s2 = string + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    else {
                        final String string2 = string + "; Expires=";
                        Class192.field2389.setTime(new Date(Class182.method3547() + 94608000000L));
                        final int value = Class192.field2389.get(7);
                        final int value2 = Class192.field2389.get(5);
                        final int value3 = Class192.field2389.get(2);
                        final int value4 = Class192.field2389.get(1);
                        final int value5 = Class192.field2389.get(11);
                        final int value6 = Class192.field2389.get(12);
                        final int value7 = Class192.field2389.get(13);
                        s2 = string2 + (Class192.field2390[value - 1] + ", " + value2 / 10 + value2 % 10 + "-" + Class192.field2392[0][value3] + "-" + value4 + " " + value5 / 10 + value5 % 10 + ":" + value6 / 10 + value6 % 10 + ":" + value7 / 10 + value7 % 10 + " GMT") + "; Max-Age=" + 94608000L;
                    }
                    JSObject.getWindow((Applet)Class182.field2334).eval("document.cookie=\"" + s2 + "\"");
                }
                catch (Throwable t) {}
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2080 == class87.field1220) {
                final int method2058 = field1219.method3544();
                if (field1219.method3544() == 0) {
                    Client.field844[method2058] = new Class4();
                    final Class189 class96 = field1219;
                    class96.field2339 += 18;
                }
                else {
                    final Class189 class97 = field1219;
                    --class97.field2339;
                    Client.field844[method2058] = new Class4(field1219, false);
                }
                Client.field793 = Client.field801;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2050 == class87.field1220) {
                Class29.method479(Class171.field2245);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2095 == class87.field1220) {
                Class295.method5501();
                Client.field745 = field1219.method3544();
                Client.field775 = Client.field801;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2088 == class87.field1220) {
                final Class230 method2059 = Class26.method434(field1219.method3595());
                for (int n28 = 0; n28 < method2059.field2724.length; ++n28) {
                    method2059.field2724[n28] = -1;
                    method2059.field2724[n28] = 0;
                }
                Class60.method1114(method2059);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2068 == class87.field1220) {
                Class226.field2568 = field1219.method3577();
                Class57.field524 = field1219.method3765();
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2078 == class87.field1220) {
                int method2060 = field1219.method3613();
                if (method2060 == 65535) {
                    method2060 = -1;
                }
                if (method2060 == -1 && !Client.field813) {
                    Class9.method88();
                }
                else if (method2060 != -1 && method2060 != Client.field812 && Client.field811 != 0 && !Client.field813) {
                    Class65.method1602(2, Class80.field1147, method2060, 0, Client.field811, false);
                }
                Client.field812 = method2060;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2051 == class87.field1220) {
                final int method2061 = field1219.method3591();
                int method2062 = field1219.method3585();
                if (method2062 == 65535) {
                    method2062 = -1;
                }
                Class50.method965(method2062, method2061);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2082 == class87.field1220) {
                Client.field822 = false;
                for (int n29 = 0; n29 < 5; ++n29) {
                    Client.field823[n29] = false;
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2053 == class87.field1220) {
                final int method2063 = field1219.method3770();
                final int method2064 = field1219.method3646();
                final int field1225 = ((method2064 >> 5 & 0x1F) << 11) + ((method2064 >> 10 & 0x1F) << 19) + ((method2064 & 0x1F) << 3);
                final Class230 method2065 = Class26.method434(method2063);
                if (field1225 != method2065.field2630) {
                    method2065.field2630 = field1225;
                    Class60.method1114(method2065);
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2124 == class87.field1220) {
                final Class230 method2066 = Class26.method434(field1219.method3609());
                method2066.field2665 = 3;
                method2066.field2593 = Class138.field1876.field546.method4483();
                Class60.method1114(method2066);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2127 == class87.field1220) {
                Class245.method4619(false, field1219);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2065 == class87.field1220) {
                Class29.method479(Class171.field2246);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2081 == class87.field1220) {
                Class29.method479(Class171.field2241);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2093 == class87.field1220) {
                Client.field795 = field1219.method3607();
                Client.field630 = field1219.method3607();
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2132 == class87.field1220) {
                if (field1219.method3544() == 1) {
                    Class70.field1013 = Class182.method3547() - field1219.method3554();
                    Class19.field154 = new Class1(field1219, true);
                }
                else {
                    Class19.field154 = null;
                }
                Client.field774 = Client.field801;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2098 == class87.field1220) {
                final byte method2067 = field1219.method3610();
                final int method2068 = field1219.method3585();
                if (Class225.field2558[method2068] != (Class225.field2559[method2068] = method2067)) {
                    Class225.field2558[method2068] = method2067;
                }
                Class45.method749(method2068);
                Client.field764[++Client.field765 - 1 & 0x1F] = method2068;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2077 == class87.field1220) {
                final int method2069 = field1219.method3613();
                Class177.method3507(method2069);
                Client.field766[++Client.field767 - 1 & 0x1F] = (method2069 & 0x7FFF);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2087 == class87.field1220) {
                Class26.method434(field1219.method3595()).field2732 = field1219.method3585() + (field1219.method3550() << 16);
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2062 == class87.field1220) {
                Class181.field2332.field975.method5317(field1219, class87.field1225);
                Class47.method910();
                if (Class14.field94 != null) {
                    Class14.field94.method5468();
                }
                Client.field647 = Client.field801;
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2063 == class87.field1220) {
                final int method2070 = field1219.method3609();
                final int method2071 = field1219.method3770();
                final Class55 class98 = (Class55)Client.field741.method4020(method2070);
                final Class55 class99 = (Class55)Client.field741.method4020(method2071);
                if (class99 != null) {
                    Class20.method261(class99, class98 == null || class98.field501 != class99.field501);
                }
                if (class98 != null) {
                    class98.method4064();
                    Client.field741.method4016(class98, method2071);
                }
                final Class230 method2072 = Class26.method434(method2070);
                if (method2072 != null) {
                    Class60.method1114(method2072);
                }
                final Class230 method2073 = Class26.method434(method2071);
                if (method2073 != null) {
                    Class60.method1114(method2073);
                    Class163.method3388(Class42.field366[method2073.field2691 >>> 16], method2073, true);
                }
                if (Client.field683 != -1) {
                    final int field1226 = Client.field683;
                    if (Class261.method4931(field1226)) {
                        Class83.method1923(Class42.field366[field1226], 1);
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2096 == class87.field1220) {
                final Class65 class100 = new Class65();
                class100.field950 = field1219.method3738();
                class100.field947 = field1219.method3550();
                class100.field948 = field1219.method3671();
                Class48.method947(45);
                method1983.vmethod3346();
                Class61.method1129(class100);
                class87.field1220 = null;
                return false;
            }
            if (Class168.field2057 == class87.field1220) {
                final int method2074 = field1219.method3765();
                final int method2075 = field1219.method3595();
                final int method2076 = field1219.method3613();
                final Class55 class101 = (Class55)Client.field741.method4020(method2075);
                if (class101 != null) {
                    Class20.method261(class101, method2076 != class101.field501);
                }
                final Class55 class102 = new Class55();
                class102.field501 = method2076;
                class102.field494 = method2074;
                Client.field741.method4016(class102, method2075);
                Class216.method4178(method2076);
                final Class230 method2077 = Class26.method434(method2075);
                Class60.method1114(method2077);
                if (Client.field744 != null) {
                    Class60.method1114(Client.field744);
                    Client.field744 = null;
                }
                Class170.method3448();
                Class163.method3388(Class42.field366[method2075 >> 16], method2077, false);
                Class135.method3114(method2076);
                if (Client.field683 != -1) {
                    final int field1227 = Client.field683;
                    if (Class261.method4931(field1227)) {
                        Class83.method1923(Class42.field366[field1227], 1);
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2128 == class87.field1220) {
                final int method2078 = field1219.method3770();
                int method2079 = field1219.method3613();
                final Class230 method2080 = Class26.method434(method2078);
                if (method2080 != null && method2080.field2721 == 0) {
                    if (method2079 > method2080.field2629 - method2080.field2621) {
                        method2079 = method2080.field2629 - method2080.field2621;
                    }
                    if (method2079 < 0) {
                        method2079 = 0;
                    }
                    if (method2079 != method2080.field2663) {
                        method2080.field2663 = method2079;
                        Class60.method1114(method2080);
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2091 == class87.field1220) {
                final String method2081 = field1219.method3738();
                String method2083;
                try {
                    int method2082 = field1219.method3562();
                    if (method2082 > 32767) {
                        method2082 = 32767;
                    }
                    final byte[] array4 = new byte[method2082];
                    final Class189 class103 = field1219;
                    class103.field2339 += Class300.field3712.method3480(field1219.payload, field1219.field2339, array4, 0, method2082);
                    method2083 = Class78.method1831(array4, 0, method2082);
                }
                catch (Exception ex4) {
                    method2083 = "Cabbage";
                }
                Class143.method3172(6, method2081, Class299.method5521(Class51.method998(method2083)));
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2079 == class87.field1220) {
                final int n30 = field1219.field2339 + class87.field1225;
                final int method2084 = field1219.method3550();
                int method2085 = field1219.method3550();
                if (method2084 != Client.field683) {
                    Client.field683 = method2084;
                    this.method1151(false);
                    Class216.method4178(Client.field683);
                    Class135.method3114(Client.field683);
                    for (int n31 = 0; n31 < 100; ++n31) {
                        Client.field697[n31] = true;
                    }
                }
                while (method2085-- > 0) {
                    final int method2086 = field1219.method3671();
                    final int method2087 = field1219.method3550();
                    final int method2088 = field1219.method3544();
                    Class55 class104 = (Class55)Client.field741.method4020(method2086);
                    if (class104 != null && method2087 != class104.field501) {
                        Class20.method261(class104, true);
                        class104 = null;
                    }
                    if (class104 == null) {
                        final Class55 class105 = new Class55();
                        class105.field501 = method2087;
                        class105.field494 = method2088;
                        Client.field741.method4016(class105, method2086);
                        Class216.method4178(method2087);
                        final Class230 method2089 = Class26.method434(method2086);
                        Class60.method1114(method2089);
                        if (Client.field744 != null) {
                            Class60.method1114(Client.field744);
                            Client.field744 = null;
                        }
                        Class170.method3448();
                        Class163.method3388(Class42.field366[method2086 >> 16], method2089, false);
                        Class135.method3114(method2087);
                        if (Client.field683 != -1) {
                            final int field1228 = Client.field683;
                            if (Class261.method4931(field1228)) {
                                Class83.method1923(Class42.field366[field1228], 1);
                            }
                        }
                        class104 = class105;
                    }
                    class104.field496 = true;
                }
                for (Class55 class106 = (Class55)Client.field741.method4018(); class106 != null; class106 = (Class55)Client.field741.method4019()) {
                    if (class106.field496) {
                        class106.field496 = false;
                    }
                    else {
                        Class20.method261(class106, true);
                    }
                }
                Client.field783 = new Class202(512);
                while (field1219.field2339 < n30) {
                    final int method2090 = field1219.method3671();
                    final int method2091 = field1219.method3550();
                    final int method2092 = field1219.method3550();
                    final int method2093 = field1219.method3671();
                    for (int n32 = method2091; n32 <= method2092; ++n32) {
                        Client.field783.method4016(new Class211(method2093), (method2090 << 32) + n32);
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2064 == class87.field1220) {
                for (int n33 = 0; n33 < Class225.field2558.length; ++n33) {
                    if (Class225.field2558[n33] != Class225.field2559[n33]) {
                        Class225.field2558[n33] = Class225.field2559[n33];
                        Class45.method749(n33);
                        Client.field764[++Client.field765 - 1 & 0x1F] = n33;
                    }
                }
                class87.field1220 = null;
                return true;
            }
            if (Class168.field2130 == class87.field1220) {
                final int method2094 = field1219.method3770();
                final int method2095 = field1219.method3550();
                final Class230 method2096 = Class26.method434(method2094);
                if (method2096.field2665 != 1 || method2095 != method2096.field2593) {
                    method2096.field2665 = 1;
                    method2096.field2593 = method2095;
                    Class60.method1114(method2096);
                }
                class87.field1220 = null;
                return true;
            }
            Class5.method65("" + ((class87.field1220 != null) ? class87.field1220.field2133 : -1) + "," + ((class87.field1226 != null) ? class87.field1226.field2133 : -1) + "," + ((class87.field1227 != null) ? class87.field1227.field2133 : -1) + "," + class87.field1225, null);
            Class97.method2213();
        }
        catch (IOException ex5) {
            Class30.method516();
        }
        catch (Exception ex) {
            String s3 = "" + ((class87.field1220 != null) ? class87.field1220.field2133 : -1) + "," + ((class87.field1226 != null) ? class87.field1226.field2133 : -1) + "," + ((class87.field1227 != null) ? class87.field1227.field2133 : -1) + "," + class87.field1225 + "," + (Class138.field1876.field922[0] + Class62.field868) + "," + (Class138.field1876.field872[0] + Client.field754) + ",";
            for (int n34 = 0; n34 < class87.field1225 && n34 < 50; ++n34) {
                s3 = s3 + field1219.payload[n34] + ",";
            }
            Class5.method65(s3, ex);
            Class97.method2213();
        }
        return true;
    }
    
    @ObfuscatedName("hz")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "652063494")
    final void method1233() {
        Class134.method3103();
        if (Class276.field3559 != null) {
            return;
        }
        if (Client.field583 != null) {
            return;
        }
        int field431 = Class48.field431;
        if (Client.field716) {
            if (field431 != 1 && (Class253.field3229 || field431 != 4)) {
                final int field432 = Class48.field425;
                final int n = Class48.field426 * 673804999;
                if (field432 < Class48.field435 - 10 || field432 > Class135.field1856 + Class48.field435 + 10 || n < Class0.field1 - 10 || n > Class151.field1933 + Class0.field1 + 10) {
                    Client.field716 = false;
                    Class48.method948(Class48.field435, Class0.field1, Class135.field1856, Class151.field1933);
                }
            }
            if (field431 == 1 || (!Class253.field3229 && field431 == 4)) {
                final int field433 = Class48.field435;
                final int field434 = Class0.field1;
                final int field435 = Class135.field1856;
                final int field436 = Class48.field432;
                final int field437 = Class48.field428;
                int n2 = -1;
                for (int i = 0; i < Client.field771; ++i) {
                    final int n3 = field434 + (Client.field771 - 1 - i) * 15 + 31;
                    if (field436 > field433 && field436 < field433 + field435 && field437 > n3 - 13 && field437 < n3 + 3) {
                        n2 = i;
                    }
                }
                if (n2 != -1) {
                    Class112.method2564(n2);
                }
                Client.field716 = false;
                Class48.method948(Class48.field435, Class0.field1, Class135.field1856, Class151.field1933);
            }
        }
        else {
            final int n4 = Client.field771 - 1;
            if ((field431 == 1 || (!Class253.field3229 && field431 == 4)) && n4 >= 0) {
                final int n5 = Client.field720[n4];
                if (n5 == 39 || n5 == 40 || n5 == 41 || n5 == 42 || n5 == 43 || n5 == 33 || n5 == 34 || n5 == 35 || n5 == 36 || n5 == 37 || n5 == 38 || n5 == 1005) {
                    final int field438 = Client.field718[n4];
                    final int n6 = Client.field851[n4];
                    final Class230 method434 = Class26.method434(n6);
                    if (Class7.method83(Class24.method425(method434)) || Class140.method3150(Class24.method425(method434))) {
                        if (Class276.field3559 != null && !Client.field689 && Client.field771 > 0 && !this.method1149()) {
                            Class60.method1120(Client.field678, Client.field821);
                        }
                        Client.field689 = false;
                        Client.field693 = 0;
                        if (Class276.field3559 != null) {
                            Class60.method1114(Class276.field3559);
                        }
                        Class276.field3559 = Class26.method434(n6);
                        Client.field688 = field438;
                        Client.field678 = Class48.field432;
                        Client.field821 = Class48.field428;
                        if (n4 >= 0) {
                            Class229.field2588 = new Class75();
                            Class229.field2588.field1066 = Client.field718[n4];
                            Class229.field2588.field1060 = Client.field851[n4];
                            Class229.field2588.field1061 = Client.field720[n4];
                            Class229.field2588.field1062 = Client.field794[n4];
                            Class229.field2588.field1063 = Client.field735[n4];
                        }
                        Class60.method1114(Class276.field3559);
                        return;
                    }
                }
            }
            if ((field431 == 1 || (!Class253.field3229 && field431 == 4)) && this.method1149()) {
                field431 = 2;
            }
            if ((field431 == 1 || (!Class253.field3229 && field431 == 4)) && Client.field771 > 0) {
                Class112.method2564(n4);
            }
            if (field431 == 2 && Client.field771 > 0) {
                this.method1476(Class48.field432, Class48.field428);
            }
        }
    }
    
    @ObfuscatedName("hq")
    @ObfuscatedSignature(signature = "(B)Z", garbageValue = "62")
    final boolean method1149() {
        final int n = Client.field771 - 1;
        return ((Client.field715 == 1 && Client.field771 > 2) || RunException.method713(n)) && !Client.field590[n];
    }
    
    @ObfuscatedName("hv")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "762160951")
    final void method1476(final int n, final int n2) {
        Class184.method3785(n, n2);
        Class28.field248.method2909(Class13.field82, n, n2, false);
        Client.field716 = true;
    }
    
    @ObfuscatedName("ir")
    @ObfuscatedSignature(signature = "(ZI)V", garbageValue = "-1642962644")
    final void method1151(final boolean b) {
        Class84.method1946(Client.field683, Class82.field1179, Class243.field3138, b);
    }
    
    @ObfuscatedName("iv")
    @ObfuscatedSignature(signature = "(Lhi;I)V", garbageValue = "-1711634701")
    void method1152(final Class230 class230) {
        final Class230 class231 = (class230.field2605 == -1) ? null : Class26.method434(class230.field2605);
        int n;
        int n2;
        if (class231 == null) {
            n = Class82.field1179;
            n2 = Class243.field3138;
        }
        else {
            n = class231.field2675;
            n2 = class231.field2621;
        }
        Class64.method1563(class230, n, n2, false);
        Class22.method281(class230, n, n2);
    }
    
    @ObfuscatedName("jk")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-114951756")
    final void method1448() {
        Class60.method1114(Client.field583);
        ++Class6.field39;
        if (!Client.field772 || !Client.field601) {
            if (Class6.field39 > 1) {
                Client.field583 = null;
            }
            return;
        }
        final int field425 = Class48.field425;
        final int n = Class48.field426 * 673804999;
        int field426 = field425 - Client.field753;
        int field427 = n - Client.field749;
        if (field426 < Client.field757) {
            field426 = Client.field757;
        }
        if (field426 + Client.field583.field2675 > Client.field757 + Client.field752.field2675) {
            field426 = Client.field757 + Client.field752.field2675 - Client.field583.field2675;
        }
        if (field427 < Client.field758) {
            field427 = Client.field758;
        }
        if (field427 + Client.field583.field2621 > Client.field758 + Client.field752.field2621) {
            field427 = Client.field758 + Client.field752.field2621 - Client.field583.field2621;
        }
        final int n2 = field426 - Client.field696;
        final int n3 = field427 - Client.field760;
        final int field428 = Client.field583.field2682;
        if (Class6.field39 > Client.field583.field2684 && (n2 > field428 || n2 < -field428 || n3 > field428 || n3 < -field428)) {
            Client.field763 = true;
        }
        final int n4 = field426 - Client.field757 + Client.field752.field2626;
        final int n5 = field427 - Client.field758 + Client.field752.field2663;
        if (Client.field583.field2695 != null && Client.field763) {
            final Class56 class56 = new Class56();
            class56.field506 = Client.field583;
            class56.field511 = n4;
            class56.field508 = n5;
            class56.field512 = Client.field583.field2695;
            Class68.method1696(class56);
        }
        if (Class48.field419 == 0) {
            if (Client.field763) {
                if (Client.field583.field2696 != null) {
                    final Class56 class57 = new Class56();
                    class57.field506 = Client.field583;
                    class57.field511 = n4;
                    class57.field508 = n5;
                    class57.field507 = Client.field755;
                    class57.field512 = Client.field583.field2696;
                    Class68.method1696(class57);
                }
                if (Client.field755 != null) {
                    Class230 class58 = Client.field583;
                    final int method3865 = Class190.method3865(Class24.method425(class58));
                    Class230 class59 = null;
                    Label_0473: {
                        if (method3865 == 0) {
                            class59 = null;
                        }
                        else {
                            for (int i = 0; i < method3865; ++i) {
                                class58 = Class26.method434(class58.field2605);
                                if (class58 == null) {
                                    class59 = null;
                                    break Label_0473;
                                }
                            }
                            class59 = class58;
                        }
                    }
                    if (class59 != null) {
                        final Class172 method3866 = Class26.method433(Class169.field2164, Client.field626.field1218);
                        method3866.field2257.method3583(Client.field583.field2606);
                        method3866.field2257.method3771(Client.field583.field2649);
                        method3866.field2257.method3673(Client.field755.field2691);
                        method3866.field2257.method3582(Client.field755.field2649);
                        method3866.field2257.method3594(Client.field583.field2691);
                        method3866.field2257.method3755(Client.field755.field2606);
                        Client.field626.method1980(method3866);
                    }
                }
            }
            else if (this.method1149()) {
                this.method1476(Client.field696 + Client.field753, Client.field749 + Client.field760);
            }
            else if (Client.field771 > 0) {
                Class60.method1120(Client.field753 + Client.field696, Client.field749 + Client.field760);
            }
            Client.field583 = null;
        }
    }
    
    @ObfuscatedName("jh")
    @ObfuscatedSignature(signature = "(I)Lkm;", garbageValue = "-1900287408")
    @Override
    public Class291 vmethod5420() {
        return (Class138.field1876 != null) ? Class138.field1876.field552 : null;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)J", garbageValue = "-1512027623")
    static long method1535() {
        try {
            final URLConnection openConnection = new URL(Class142.method3161("services", false) + "m=accountappeal/login.ws").openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            final InputStream inputStream = openConnection.getInputStream();
            final Class182 class182 = new Class182(new byte[1000]);
            while (true) {
                final int read = inputStream.read(class182.payload, class182.field2339, 1000 - class182.field2339);
                if (read == -1) {
                    class182.field2339 = 0;
                    return class182.method3554();
                }
                final Class182 class183 = class182;
                class183.field2339 += read;
                if (class182.field2339 >= 1000) {
                    return 0L;
                }
            }
        }
        catch (Exception ex) {
            return 0L;
        }
    }
}
