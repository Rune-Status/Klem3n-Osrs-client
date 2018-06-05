package com.client;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import com.conf.rs.Configuration;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

import netscape.javascript.JSObject;

public final class Client extends Class47 implements Class288, Configuration{
   @ObfuscatedName("ny")
   @ObfuscatedGetter(
      intValue = -219746745
   )
   static int field603;
   @ObfuscatedName("nl")
   @ObfuscatedGetter(
      intValue = -1154390057
   )
   static int field830;
   @ObfuscatedName("ni")
   @ObfuscatedGetter(
      longValue = -91560525507386839L
   )
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
   @ObfuscatedGetter(
      intValue = -1835075419
   )
   static int field801;
   @ObfuscatedName("nc")
   static boolean field792;
   @ObfuscatedName("mh")
   @ObfuscatedGetter(
      intValue = 953361159
   )
   static int field647;
   @ObfuscatedName("ro")
   @ObfuscatedGetter(
      intValue = -1150401375
   )
   public static int field650;
   @ObfuscatedName("ls")
   static boolean field601;
   @ObfuscatedName("oq")
   static boolean field813;
   @ObfuscatedName("lf")
   @ObfuscatedGetter(
      intValue = -948387719
   )
   static int field753;
   @ObfuscatedName("lk")
   @ObfuscatedGetter(
      intValue = -1681068877
   )
   static int field749;
   @ObfuscatedName("lh")
   @ObfuscatedGetter(
      intValue = 1025348025
   )
   static int field757;
   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   static Class202 field783;
   @ObfuscatedName("lq")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Class230 field752;
   @ObfuscatedName("nv")
   @ObfuscatedGetter(
      intValue = -1675720495
   )
   static int field790;
   @ObfuscatedName("np")
   static int[] field786;
   @ObfuscatedName("nt")
   static int[] field641;
   @ObfuscatedName("la")
   @ObfuscatedGetter(
      intValue = 333708905
   )
   static int field758;
   @ObfuscatedName("nx")
   static int[] field787;
   @ObfuscatedName("ne")
   static int[] field789;
   @ObfuscatedName("rl")
   @ObfuscatedSignature(
      signature = "Lbz;"
   )
   static final Class59 field849;
   @ObfuscatedName("my")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Class205 field638;
   @ObfuscatedName("lu")
   @ObfuscatedGetter(
      intValue = 217795627
   )
   static int field696;
   @ObfuscatedName("le")
   @ObfuscatedGetter(
      intValue = -813390517
   )
   static int field760;
   @ObfuscatedName("py")
   @ObfuscatedGetter(
      intValue = 880343809
   )
   static int field815;
   @ObfuscatedName("ok")
   @ObfuscatedGetter(
      intValue = -1345621773
   )
   static int field812;
   @ObfuscatedName("ru")
   static int[] field850;
   @ObfuscatedName("rg")
   static int[] field596;
   @ObfuscatedName("mi")
   static int[] field766;
   @ObfuscatedName("ml")
   @ObfuscatedGetter(
      intValue = -490868275
   )
   static int field767;
   @ObfuscatedName("lp")
   static boolean field763;
   @ObfuscatedName("na")
   static long[] field797;
   @ObfuscatedName("me")
   @ObfuscatedGetter(
      intValue = -2132588897
   )
   static int field765;
   @ObfuscatedName("ox")
   @ObfuscatedGetter(
      intValue = 699093181
   )
   static int field651;
   @ObfuscatedName("os")
   @ObfuscatedGetter(
      intValue = -1771806997
   )
   static int field810;
   @ObfuscatedName("qw")
   @ObfuscatedGetter(
      intValue = -1805517847
   )
   static int field842;
   @ObfuscatedName("ot")
   @ObfuscatedGetter(
      longValue = -4301137644112550077L
   )
   static long field722;
   @ObfuscatedName("pb")
   static boolean field822;
   @ObfuscatedName("qy")
   @ObfuscatedSignature(
      signature = "Lhd;"
   )
   static Class227 field841;
   @ObfuscatedName("mj")
   @ObfuscatedGetter(
      intValue = -1369280353
   )
   static int field695;
   @ObfuscatedName("pm")
   @ObfuscatedGetter(
      intValue = 2142255299
   )
   static int field656;
   @ObfuscatedName("px")
   static int[] field819;
   @ObfuscatedName("pa")
   @ObfuscatedGetter(
      intValue = -351528433
   )
   static int field814;
   @ObfuscatedName("or")
   @ObfuscatedGetter(
      intValue = -1068898215
   )
   static int field808;
   @ObfuscatedName("qk")
   @ObfuscatedGetter(
      intValue = -2039961607
   )
   static int field586;
   @ObfuscatedName("lb")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Class230 field755;
   @ObfuscatedName("ol")
   @ObfuscatedGetter(
      intValue = 996143867
   )
   static int field809;
   @ObfuscatedName("oh")
   @ObfuscatedGetter(
      intValue = 1357084131
   )
   static int field798;
   @ObfuscatedName("pc")
   static int[] field817;
   @ObfuscatedName("oi")
   @ObfuscatedGetter(
      intValue = -619539199
   )
   static int field811;
   @ObfuscatedName("pd")
   @ObfuscatedSignature(
      signature = "[Lcg;"
   )
   static Class91[] field719;
   @ObfuscatedName("pu")
   static int[] field676;
   @ObfuscatedName("pf")
   static int[] field820;
   @ObfuscatedName("oy")
   @ObfuscatedGetter(
      intValue = -326408871
   )
   static int field724;
   @ObfuscatedName("rd")
   static ArrayList field781;
   @ObfuscatedName("pe")
   static boolean[] field823;
   @ObfuscatedName("rc")
   @ObfuscatedGetter(
      intValue = 1762427
   )
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
   @ObfuscatedSignature(
      signature = "[Lll;"
   )
   static Class318[] field816;
   @ObfuscatedName("od")
   static int[] field805;
   @ObfuscatedName("oc")
   static int[] field806;
   @ObfuscatedName("md")
   @ObfuscatedGetter(
      intValue = -59230609
   )
   static int field775;
   @ObfuscatedName("ob")
   @ObfuscatedGetter(
      intValue = -1015108907
   )
   static int field799;
   @ObfuscatedName("qm")
   @ObfuscatedGetter(
      intValue = -263632309
   )
   static int field762;
   @ObfuscatedName("qu")
   @ObfuscatedGetter(
      intValue = 623349101
   )
   static int field837;
   @ObfuscatedName("qq")
   @ObfuscatedGetter(
      intValue = -1734003973
   )
   static int field838;
   @ObfuscatedName("qb")
   @ObfuscatedGetter(
      intValue = 1052760379
   )
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
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Class205 field778;
   @ObfuscatedName("qh")
   static short field834;
   @ObfuscatedName("qj")
   static short field835;
   @ObfuscatedName("mz")
   @ObfuscatedGetter(
      intValue = -627411345
   )
   static int field770;
   @ObfuscatedName("qt")
   static short field833;
   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Class205 field779;
   @ObfuscatedName("qo")
   static short field848;
   @ObfuscatedName("qz")
   static short field831;
   @ObfuscatedName("qs")
   static short field832;
   @ObfuscatedName("mv")
   @ObfuscatedGetter(
      intValue = 1778572125
   )
   static int field828;
   @ObfuscatedName("qg")
   @ObfuscatedGetter(
      intValue = 119023177
   )
   static int field840;
   @ObfuscatedName("mf")
   static int[] field764;
   @ObfuscatedName("mm")
   static int[] field690;
   @ObfuscatedName("mx")
   @ObfuscatedGetter(
      intValue = -103494083
   )
   static int field769;
   @ObfuscatedName("qp")
   @ObfuscatedSignature(
      signature = "[Lu;"
   )
   static Class4[] field844;
   @ObfuscatedName("mr")
   @ObfuscatedGetter(
      intValue = 1283415023
   )
   static int field793;
   @ObfuscatedName("nq")
   @ObfuscatedGetter(
      intValue = 220873495
   )
   static int field795;
   @ObfuscatedName("nz")
   @ObfuscatedGetter(
      intValue = -352691883
   )
   static int field630;
   @ObfuscatedName("ms")
   @ObfuscatedGetter(
      intValue = -1120678843
   )
   static int field774;
   @ObfuscatedName("nb")
   static String field796;
   @ObfuscatedName("rr")
   @ObfuscatedSignature(
      signature = "Lbg;"
   )
   static Class61 field665;
   @ObfuscatedName("nu")
   static int[] field731;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lfk;"
   )
   static Class164[] field642;
   @ObfuscatedName("ag")
   static boolean field580 = true;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -33369237
   )
   public static int field581 = 1;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -295549115
   )
   static int field632 = 0;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 1999635431
   )
   static int field777 = 0;
   @ObfuscatedName("bh")
   public static boolean field668 = false;
   @ObfuscatedName("bz")
   static boolean field585 = false;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -2057800147
   )
   static int field827 = 0;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -1305395647
   )
   static int field587 = -1;
   @ObfuscatedName("bb")
   static boolean field588 = false;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 1544810619
   )
   static int field589 = 0;
   @ObfuscatedName("bc")
   static boolean field625 = true;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 181352847
   )
   static int field591 = 0;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      longValue = -2452580139566453107L
   )
   static long field592 = 1L;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -381181903
   )
   static int field593 = -1;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -1985172807
   )
   static int field594 = -1;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -1157772735
   )
   static int field595 = -1;
   @ObfuscatedName("bw")
   static boolean field847 = true;
   @ObfuscatedName("bf")
   static boolean field597 = false;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -785638907
   )
   static int field598 = 0;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -940910327
   )
   static int field599 = 0;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = 487683979
   )
   static int field600 = 0;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 348104391
   )
   static int field579 = 0;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = 304122621
   )
   static int field602 = 0;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -1345747809
   )
   static int field818 = 0;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1571130755
   )
   static int field604 = 0;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = -169903469
   )
   static int field605 = 0;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = 1735835325
   )
   static int field637 = 0;
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      signature = "Lbm;"
   )
   static Class77 field607;
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      signature = "Lbm;"
   )
   static Class77 field780;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 1766129571
   )
   static int field609;
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      signature = "Lee;"
   )
   static Class153 field839;
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      signature = "Lfd;"
   )
   static Class157 field611;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -1705892515
   )
   static int field692;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = -1149880601
   )
   static int field768;
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static Class249 field854;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = 855035607
   )
   static int field614;
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      intValue = 906778345
   )
   static int field615;
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = 350834505
   )
   static int field616;
   @ObfuscatedName("dx")
   @ObfuscatedGetter(
      intValue = -1184123167
   )
   static int field617;
   @ObfuscatedName("du")
   @ObfuscatedGetter(
      intValue = -1529742153
   )
   static int field618;
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      signature = "Let;"
   )
   static Class146 field619;
   @ObfuscatedName("di")
   static byte[] field620;
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      signature = "[Lbr;"
   )
   static Class72[] field843;
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      intValue = -931637927
   )
   static int field622;
   @ObfuscatedName("dj")
   static int[] field639;
   @ObfuscatedName("ew")
   @ObfuscatedGetter(
      intValue = -1812959769
   )
   static int field624;
   @ObfuscatedName("es")
   static int[] field666;
   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   public static final NetWriter field626;
   @ObfuscatedName("eh")
   @ObfuscatedGetter(
      intValue = -872392001
   )
   static int field627;
   @ObfuscatedName("ey")
   static boolean field756;
   @ObfuscatedName("ep")
   static boolean field629;
   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      signature = "Ljb;"
   )
   static Class280 field804;
   @ObfuscatedName("eb")
   static HashMap field631;
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      intValue = 2118745709
   )
   static int field754;
   @ObfuscatedName("en")
   @ObfuscatedGetter(
      intValue = -1718380447
   )
   static int field633;
   @ObfuscatedName("ee")
   @ObfuscatedGetter(
      intValue = -1158743607
   )
   static int field634;
   @ObfuscatedName("ev")
   @ObfuscatedGetter(
      intValue = 2017775761
   )
   static int field635;
   @ObfuscatedName("ef")
   @ObfuscatedGetter(
      intValue = 1254534349
   )
   static int field636;
   @ObfuscatedName("fp")
   @ObfuscatedGetter(
      intValue = -757062227
   )
   static int field751;
   @ObfuscatedName("fk")
   static boolean field759;
   @ObfuscatedName("fh")
   static int[][][] field645;
   @ObfuscatedName("fw")
   static final int[] field846;
   @ObfuscatedName("fi")
   @ObfuscatedGetter(
      intValue = -366074461
   )
   static int field700;
   @ObfuscatedName("fb")
   @ObfuscatedGetter(
      intValue = -1770894231
   )
   static int field643;
   @ObfuscatedName("gk")
   @ObfuscatedGetter(
      intValue = -1167871243
   )
   static int field584;
   @ObfuscatedName("gg")
   @ObfuscatedGetter(
      intValue = -1584882163
   )
   static int field836;
   @ObfuscatedName("gp")
   @ObfuscatedGetter(
      intValue = 480766297
   )
   static int field646;
   @ObfuscatedName("ge")
   static boolean field746;
   @ObfuscatedName("gv")
   @ObfuscatedGetter(
      intValue = -1967538949
   )
   static int field660;
   @ObfuscatedName("go")
   @ObfuscatedGetter(
      intValue = -873734229
   )
   static int field649;
   @ObfuscatedName("gd")
   @ObfuscatedGetter(
      intValue = -956184717
   )
   static int field717;
   @ObfuscatedName("gq")
   @ObfuscatedGetter(
      intValue = 697061695
   )
   static int field608;
   @ObfuscatedName("gu")
   @ObfuscatedGetter(
      intValue = -1956032167
   )
   static int field652;
   @ObfuscatedName("gh")
   @ObfuscatedGetter(
      intValue = 555568127
   )
   static int field653;
   @ObfuscatedName("gm")
   @ObfuscatedGetter(
      intValue = -423690659
   )
   static int field654;
   @ObfuscatedName("gj")
   @ObfuscatedGetter(
      intValue = 2077901199
   )
   static int field655;
   @ObfuscatedName("gl")
   @ObfuscatedGetter(
      intValue = -2071897465
   )
   static int field644;
   @ObfuscatedName("gn")
   @ObfuscatedGetter(
      intValue = -588909329
   )
   static int field657;
   @ObfuscatedName("gw")
   @ObfuscatedGetter(
      intValue = -1066346821
   )
   static int field613;
   @ObfuscatedName("gf")
   @ObfuscatedGetter(
      intValue = 170615499
   )
   static int field659;
   @ObfuscatedName("hk")
   @ObfuscatedGetter(
      intValue = 980219711
   )
   static int field750;
   @ObfuscatedName("hf")
   @ObfuscatedGetter(
      intValue = -1328369009
   )
   static int field661;
   @ObfuscatedName("hu")
   @ObfuscatedGetter(
      intValue = 1143307061
   )
   static int field853;
   @ObfuscatedName("hh")
   static boolean field663;
   @ObfuscatedName("hw")
   @ObfuscatedGetter(
      intValue = -1162289797
   )
   static int field664;
   @ObfuscatedName("hc")
   static boolean field807;
   @ObfuscatedName("hj")
   @ObfuscatedGetter(
      intValue = 1345648571
   )
   static int field738;
   @ObfuscatedName("ho")
   @ObfuscatedGetter(
      intValue = -351366969
   )
   static int field667;
   @ObfuscatedName("hm")
   @ObfuscatedGetter(
      intValue = 1968908975
   )
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
   @ObfuscatedGetter(
      intValue = -1388927477
   )
   static int field687;
   @ObfuscatedName("hr")
   @ObfuscatedGetter(
      intValue = -750974575
   )
   static int field679;
   @ObfuscatedName("hs")
   @ObfuscatedGetter(
      intValue = 43380069
   )
   static int field680;
   @ObfuscatedName("hi")
   @ObfuscatedGetter(
      intValue = 693082693
   )
   static int field681;
   @ObfuscatedName("hb")
   @ObfuscatedGetter(
      intValue = -24885111
   )
   static int field682;
   @ObfuscatedName("ht")
   @ObfuscatedGetter(
      intValue = 1433814191
   )
   static int field803;
   @ObfuscatedName("hl")
   @ObfuscatedGetter(
      intValue = 1652514069
   )
   static int field684;
   @ObfuscatedName("ih")
   static boolean field621;
   @ObfuscatedName("ik")
   @ObfuscatedGetter(
      intValue = -622016843
   )
   static int field686;
   @ObfuscatedName("im")
   @ObfuscatedGetter(
      intValue = -956121107
   )
   static int field582;
   @ObfuscatedName("if")
   @ObfuscatedGetter(
      intValue = -585352053
   )
   static int field688;
   @ObfuscatedName("id")
   @ObfuscatedGetter(
      intValue = 152338269
   )
   static int field678;
   @ObfuscatedName("iw")
   @ObfuscatedGetter(
      intValue = 552112291
   )
   static int field821;
   @ObfuscatedName("il")
   @ObfuscatedGetter(
      intValue = 1401656763
   )
   static int field691;
   @ObfuscatedName("ig")
   static boolean field689;
   @ObfuscatedName("ir")
   @ObfuscatedGetter(
      intValue = -1783112029
   )
   static int field693;
   @ObfuscatedName("iv")
   @ObfuscatedGetter(
      intValue = 478044173
   )
   static int field694;
   @ObfuscatedName("ia")
   static boolean field677;
   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "[Lbu;"
   )
   static Class60[] field610;
   @ObfuscatedName("it")
   static String field734;
   @ObfuscatedName("ie")
   @ObfuscatedGetter(
      intValue = -191538519
   )
   static int field628;
   @ObfuscatedName("io")
   @ObfuscatedGetter(
      intValue = 886576793
   )
   static int field698;
   @ObfuscatedName("ib")
   static boolean field699;
   @ObfuscatedName("jl")
   @ObfuscatedGetter(
      intValue = -387109961
   )
   static int field658;
   @ObfuscatedName("jo")
   @ObfuscatedGetter(
      intValue = 668394239
   )
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
   @ObfuscatedGetter(
      intValue = 1859815185
   )
   static int field707;
   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      signature = "[[[Lgn;"
   )
   static Class205[][][] field708;
   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Class205 field714;
   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Class205 field710;
   @ObfuscatedName("js")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Class205 field711;
   @ObfuscatedName("jm")
   static int[] field712;
   @ObfuscatedName("jw")
   static int[] field713;
   @ObfuscatedName("jg")
   static int[] field640;
   @ObfuscatedName("jr")
   @ObfuscatedGetter(
      intValue = 19997195
   )
   static int field715;
   @ObfuscatedName("jb")
   static boolean field716;
   @ObfuscatedName("kx")
   @ObfuscatedGetter(
      intValue = -1800746037
   )
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
   @ObfuscatedGetter(
      intValue = -1794768613
   )
   static int field729;
   @ObfuscatedName("ko")
   @ObfuscatedGetter(
      intValue = -182788053
   )
   static int field730;
   @ObfuscatedName("kh")
   @ObfuscatedGetter(
      intValue = 1536477871
   )
   static int field623;
   @ObfuscatedName("kq")
   @ObfuscatedGetter(
      intValue = 1797385119
   )
   static int field732;
   @ObfuscatedName("ks")
   @ObfuscatedGetter(
      intValue = -676779145
   )
   static int field733;
   @ObfuscatedName("kp")
   static boolean field785;
   @ObfuscatedName("kg")
   @ObfuscatedGetter(
      intValue = 553481877
   )
   static int field736;
   @ObfuscatedName("kw")
   @ObfuscatedGetter(
      intValue = 123296823
   )
   static int field737;
   @ObfuscatedName("lj")
   static String field612;
   @ObfuscatedName("lt")
   static String field739;
   @ObfuscatedName("lc")
   @ObfuscatedGetter(
      intValue = 312598609
   )
   static int field683;
   @ObfuscatedName("li")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   static Class202 field741;
   @ObfuscatedName("ly")
   @ObfuscatedGetter(
      intValue = 1361959827
   )
   static int field742;
   @ObfuscatedName("ll")
   @ObfuscatedGetter(
      intValue = -523545729
   )
   static int field743;
   @ObfuscatedName("lo")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Class230 field744;
   @ObfuscatedName("ld")
   @ObfuscatedGetter(
      intValue = 1214589377
   )
   static int field745;
   @ObfuscatedName("lw")
   @ObfuscatedGetter(
      intValue = 1445722035
   )
   static int field782;
   @ObfuscatedName("lm")
   @ObfuscatedGetter(
      intValue = 1090303845
   )
   public static int field747;
   @ObfuscatedName("lr")
   @ObfuscatedGetter(
      intValue = -111588181
   )
   static int field748;
   @ObfuscatedName("lg")
   static boolean field776;
   @ObfuscatedName("lx")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Class230 field784;
   @ObfuscatedName("ln")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Class230 field583;

   static {
      field607 = Class77.field1074;
      field780 = Class77.field1074;
      field609 = 0;
      field692 = 0;
      field768 = 0;
      field614 = 0;
      field615 = 0;
      field616 = 0;
      field617 = 0;
      field618 = 0;
      field619 = Class146.field1907;
      field620 = null;
      field843 = new Class72['耀'];
      field622 = 0;
      field639 = new int['耀'];
      field624 = 0;
      field666 = new int[250];
      field626 = new NetWriter();
      field627 = 0;
      field756 = false;
      field629 = true;
      field804 = new Class280();
      field631 = new HashMap();
      field633 = 0;
      field634 = 1;
      field635 = 0;
      field636 = 1;
      field751 = 0;
      field642 = new Class164[4];
      field759 = false;
      field645 = new int[4][13][13];
      field846 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field700 = 0;
      field643 = 2301979;
      field584 = 5063219;
      field836 = 3353893;
      field646 = 7759444;
      field746 = false;
      field660 = 0;
      field649 = 128;
      field717 = 0;
      field608 = 0;
      field652 = 0;
      field653 = 0;
      field654 = 0;
      field655 = 0;
      field644 = 50;
      field657 = 0;
      field613 = 0;
      field659 = 0;
      field750 = 12;
      field661 = 6;
      field853 = 0;
      field663 = false;
      field664 = 0;
      field807 = false;
      field738 = 0;
      field667 = 0;
      field648 = 50;
      field669 = new int[field648];
      field670 = new int[field648];
      field671 = new int[field648];
      field672 = new int[field648];
      field673 = new int[field648];
      field674 = new int[field648];
      field675 = new int[field648];
      field721 = new String[field648];
      field761 = new int[104][104];
      field687 = 0;
      field679 = -1;
      field680 = -1;
      field681 = 0;
      field682 = 0;
      field803 = 0;
      field684 = 0;
      field621 = true;
      field686 = 0;
      field582 = 0;
      field688 = 0;
      field678 = 0;
      field821 = 0;
      field691 = 0;
      field689 = false;
      field693 = 0;
      field694 = 0;
      field677 = true;
      field610 = new Class60[2048];
      field628 = -1;
      field698 = 0;
      field699 = true;
      field658 = 0;
      field701 = 0;
      field702 = new int[1000];
      field703 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      field704 = new String[8];
      field709 = new boolean[8];
      field706 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field707 = -1;
      field708 = new Class205[4][104][104];
      field714 = new Class205();
      field710 = new Class205();
      field711 = new Class205();
      field712 = new int[25];
      field713 = new int[25];
      field640 = new int[25];
      field715 = 0;
      field716 = false;
      field771 = 0;
      field718 = new int[500];
      field851 = new int[500];
      field720 = new int[500];
      field794 = new int[500];
      field735 = new String[500];
      field740 = new String[500];
      field590 = new boolean[500];
      field725 = false;
      field726 = false;
      field727 = false;
      field728 = true;
      field729 = -1;
      field730 = -1;
      field623 = 0;
      field732 = 50;
      field733 = 0;
      field734 = null;
      field785 = false;
      field736 = -1;
      field737 = -1;
      field612 = null;
      field739 = null;
      field683 = -1;
      field741 = new Class202(8);
      field742 = 0;
      field743 = 0;
      field744 = null;
      field745 = 0;
      field782 = 0;
      field747 = 0;
      field748 = -1;
      field776 = false;
      field784 = null;
      field583 = null;
      field752 = null;
      field753 = 0;
      field749 = 0;
      field755 = null;
      field601 = false;
      field757 = -1;
      field758 = -1;
      field772 = false;
      field696 = -1;
      field760 = -1;
      field763 = false;
      field801 = 1;
      field764 = new int[32];
      field765 = 0;
      field766 = new int[32];
      field767 = 0;
      field690 = new int[32];
      field769 = 0;
      field770 = 0;
      field647 = 0;
      field828 = 0;
      field793 = 0;
      field774 = 0;
      field775 = 0;
      field695 = 0;
      field638 = new Class205();
      field778 = new Class205();
      field779 = new Class205();
      field783 = new Class202(512);
      field603 = 0;
      field830 = -2;
      field697 = new boolean[100];
      field788 = new boolean[100];
      field723 = new boolean[100];
      field786 = new int[100];
      field787 = new int[100];
      field641 = new int[100];
      field789 = new int[100];
      field790 = 0;
      field791 = 0L;
      field792 = true;
      field731 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      field630 = 0;
      field795 = 0;
      field796 = "";
      field797 = new long[100];
      field798 = 0;
      field799 = 0;
      field800 = new int[128];
      field773 = new int[128];
      field722 = -1L;
      field651 = -1;
      field724 = 0;
      field805 = new int[1000];
      field806 = new int[1000];
      field816 = new Class318[1000];
      field808 = 0;
      field809 = 0;
      field810 = 0;
      field811 = 255;
      field812 = -1;
      field813 = false;
      field814 = 127;
      field815 = 127;
      field656 = 0;
      field817 = new int[50];
      field676 = new int[50];
      field819 = new int[50];
      field820 = new int[50];
      field719 = new Class91[50];
      field822 = false;
      field823 = new boolean[5];
      field824 = new int[5];
      field825 = new int[5];
      field826 = new int[5];
      field705 = new int[5];
      field802 = 256;
      field829 = 205;
      field848 = 256;
      field831 = 320;
      field832 = 1;
      field833 = 32767;
      field834 = 1;
      field835 = 32767;
      field762 = 0;
      field837 = 0;
      field838 = 0;
      field662 = 0;
      field840 = 0;
      field841 = new Class227();
      field842 = -1;
      field586 = -1;
      field844 = new Class4[8];
      field665 = new Class61();
      field650 = -1;
      field781 = new ArrayList(10);
      field606 = 0;
      field849 = new Class59();
      field850 = new int[50];
      field596 = new int[50];
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2141234055"
   )
   protected final void vmethod1144() {
      field791 = Class182.method3547() + 500L;
      this.method1145();
      if (field683 != -1) {
         this.method1151(true);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1300111147"
   )
   protected final void vmethod1505() {
      ClientPackets.method3446(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
      Class26.field223 = field777 == 0 ? 'ꩊ' : field581 + '鱀';
      Class68.field996 = field777 == 0 ? 443 : field581 + '썐';
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
      if (field777 != 0) {
         field597 = true;
      }

      Class50.method991(Class10.field61.field957);
      Class181.field2332 = new Class67(Class36.field306);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1052023991"
   )
   protected final void vmethod1136() {
      ++field591;
      this.method1139();
      Class84.method1955();

      int var1;
      try {
         if (Class217.field2460 == 1) {
            var1 = Class217.field2459.method4288();
            if (var1 > 0 && Class217.field2459.method4203()) {
               var1 -= Class6.field37;
               if (var1 < 0) {
                  var1 = 0;
               }

               Class217.field2459.method4236(var1);
            } else {
               Class217.field2459.method4202();
               Class217.field2459.method4200();
               if (Class138.field1871 != null) {
                  Class217.field2460 = 2;
               } else {
                  Class217.field2460 = 0;
               }

               Class177.field2285 = null;
               Class80.field1149 = null;
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
         Class217.field2459.method4202();
         Class217.field2460 = 0;
         Class177.field2285 = null;
         Class80.field1149 = null;
         Class138.field1871 = null;
      }

      Class54.method1017();
      Class39 var5 = Class39.field337;
      synchronized(Class39.field337) {
         ++Class39.field353;
         Class39.field350 = Class39.field352;
         Class39.field349 = 0;
         int var2;
         if (Class39.field329 >= 0) {
            while(Class39.field344 != Class39.field329) {
               var2 = Class39.field343[Class39.field344];
               Class39.field344 = Class39.field344 + 1 & 127;
               if (var2 < 0) {
                  Class39.field341[~var2] = false;
               } else {
                  if (!Class39.field341[var2] && Class39.field349 < Class39.field338.length - 1) {
                     Class39.field338[++Class39.field349 - 1] = var2;
                  }

                  Class39.field341[var2] = true;
               }
            }
         } else {
            for(var2 = 0; var2 < 112; ++var2) {
               Class39.field341[var2] = false;
            }

            Class39.field329 = Class39.field344;
         }

         if (Class39.field349 > 0) {
            Class39.field353 = 0;
         }

         Class39.field352 = Class39.field351;
      }

      Class48 var9 = Class48.field429;
      synchronized(Class48.field429) {
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
         var1 = Class33.field294.vmethod3278();
         field695 = var1;
      }

      if (field589 == 0) {
         Class29.method478();
         Class43.field368.vmethod3330();

         for(var1 = 0; var1 < 32; ++var1) {
            Class47.field394[var1] = 0L;
         }

         for(var1 = 0; var1 < 32; ++var1) {
            Class47.field404[var1] = 0L;
         }

         Class8.field48 = 0;
      } else if (field589 == 5) {
         Class186.method3806(this);
         Class29.method478();
         Class43.field368.vmethod3330();

         for(var1 = 0; var1 < 32; ++var1) {
            Class47.field394[var1] = 0L;
         }

         for(var1 = 0; var1 < 32; ++var1) {
            Class47.field404[var1] = 0L;
         }

         Class8.field48 = 0;
      } else if (field589 != 10 && field589 != 11) {
         if (field589 == 20) {
            Class186.method3806(this);
            this.method1142();
         } else if (field589 == 25) {
            Class15.method148();
         }
      } else {
         Class186.method3806(this);
      }

      if (field589 == 30) {
         this.method1143();
      } else if (field589 == 40 || field589 == 45) {
         this.method1142();
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "0"
   )
   protected final void vmethod1137(boolean var1) {
      boolean var2 = Class148.method3196();
      if (var2 && field813 && Class28.field244 != null) {
         Class28.field244.method2146();
      }

      int var3;
      if ((field589 == 10 || field589 == 20 || field589 == 30) && field791 != 0L && Class182.method3547() > field791) {
         var3 = field792 ? 2 : 1;
         Class50.method991(var3);
      }

      if (var1) {
         for(var3 = 0; var3 < 100; ++var3) {
            field697[var3] = true;
         }
      }

      if (field589 == 0) {
         this.method796(Class78.field1099, Class78.field1100, var1);
      } else if (field589 == 5) {
         Class273.method5227(Class293.field3660, Class151.field1936, Class63.field933, var1);
      } else if (field589 != 10 && field589 != 11) {
         if (field589 == 20) {
            Class273.method5227(Class293.field3660, Class151.field1936, Class63.field933, var1);
         } else if (field589 == 25) {
            if (field751 == 1) {
               if (field633 > field634) {
                  field634 = field633;
               }

               var3 = (field634 * 50 - field633 * 50) / field634;
               Class83.method1933("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else if (field751 == 2) {
               if (field635 > field636) {
                  field636 = field635;
               }

               var3 = (field636 * 50 - field635 * 50) / field636 + 50;
               Class83.method1933("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else {
               Class83.method1933("Loading - please wait.", false);
            }
         } else if (field589 == 30) {
            this.method1146();
         } else if (field589 == 40) {
            Class83.method1933("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if (field589 == 45) {
            Class83.method1933("Please wait...", false);
         }
      } else {
         Class273.method5227(Class293.field3660, Class151.field1936, Class63.field933, var1);
      }

      if (field589 == 30 && field790 == 0 && !var1 && !field792) {
         for(var3 = 0; var3 < field603; ++var3) {
            if (field788[var3]) {
               Class163.field2014.vmethod5810(field786[var3], field787[var3], field641[var3], field789[var3]);
               field788[var3] = false;
            }
         }
      } else if (field589 > 0) {
         Class163.field2014.vmethod5809(0, 0);

         for(var3 = 0; var3 < field603; ++var3) {
            field788[var3] = false;
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2060326728"
   )
   protected final void vmethod1187() {
      if (Class22.field185.method1896()) {
         Class22.field185.method1893();
      }

      if (Class26.field220 != null) {
         Class26.field220.field529 = false;
      }

      Class26.field220 = null;
      field626.method1982();
      if (Class39.field337 != null) {
         Class39 var1 = Class39.field337;
         synchronized(Class39.field337) {
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
      Object var9 = Class248.field3184;
      synchronized(Class248.field3184) {
         if (Class248.field3179 != 0) {
            Class248.field3179 = 1;

            try {
               Class248.field3184.wait();
            } catch (InterruptedException var5) {
               ;
            }
         }
      }

      if (Class28.field249 != null) {
         Class28.field249.method3106();
         Class28.field249 = null;
      }

      try {
         Class155.field1969.method2493();

         for(int var4 = 0; var4 < Class148.field1913; ++var4) {
            Class76.field1068[var4].method2493();
         }

         Class155.field1970.method2493();
         Class155.field1968.method2493();
      } catch (Exception var7) {
         ;
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1676093665"
   )
   protected final void vmethod1132() {
   }

   public final void init() {
      try {
         if (this.method774()) {
            Class279[] var1 = Class51.method996();

            for(int var2 = 0; var2 < var1.length; ++var2) {
               Class279 var3 = var1[var2];
               String var4 = this.getParameter(var3.field3591);
               if (var4 != null) {
                  switch(Integer.parseInt(var3.field3591)) {
                  case 2:
                     if (field587 == -1) {
                        field587 = Integer.parseInt(var4);
                     }
                     break;
                  case 3:
                     field777 = Integer.parseInt(var4);
                     break;
                  case 4:
                     field632 = Integer.parseInt(var4);
                     break;
                  case 5:
                     Class26.field219 = var4;
                     break;
                  case 6:
                     field629 = Integer.parseInt(var4) != 0;
                     break;
                  case 7:
                     if (var4.equalsIgnoreCase("true")) {
                        ;
                     }
                     break;
                  case 8:
                     field827 = Integer.parseInt(var4);
                  case 9:
                  case 12:
                  default:
                     break;
                  case 10:
                     Class163.field2013 = var4;
                     break;
                  case 11:
                     Class266.field3346 = Class179.method3517(Integer.parseInt(var4));
                     break;
                  case 13:
                     field581 = Integer.parseInt(var4);
                     break;
                  case 14:
                     if (var4.equalsIgnoreCase("true")) {
                        field668 = true;
                     } else {
                        field668 = false;
                     }
                     break;
                  case 15:
                     Class112.field1455 = (Class244)Class76.method1803(Class191.method3870(), Integer.parseInt(var4));
                     if (Class112.field1455 == Class244.field3145) {
                        Class36.field306 = Class322.field3880;
                     } else {
                        Class36.field306 = Class322.field3878;
                     }
                     break;
                  case 16:
                     Class124.field1709 = Integer.parseInt(var4);
                  }
               }
            }

            Class177.method3513();
            Class54.field485 = this.getCodeBase().getHost();
            String var7 = Class266.field3346.field3135;
            byte var8 = 0;

            try {
               Class177.method3509("oldschool", var7, var8, 17);
            } catch (Exception var5) {
               Class5.method65((String)null, var5);
            }

            Class182.field2334 = this;
            Class152.field1940 = field587;
            this.method778(765, 503, 171);
         }
      } catch (RuntimeException var6) {
         throw Class95.method2195(var6, "client.init(" + ')');
      }
   }

   @ObfuscatedName("en")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1481813708"
   )
   void method1139() {
      if (field589 != 1000) {
         long var2 = Class182.method3547();
         int var4 = (int)(var2 - Class250.field3203);
         Class250.field3203 = var2;
         if (var4 > 200) {
            var4 = 200;
         }

         Class250.field3197 += var4;
         boolean var1;
         if (Class250.field3207 == 0 && Class250.field3198 == 0 && Class250.field3205 == 0 && Class250.field3211 == 0) {
            var1 = true;
         } else if (Class250.field3200 == null) {
            var1 = false;
         } else {
            try {
               label245: {
                  if (Class250.field3197 > 30000) {
                     throw new IOException();
                  }

                  Class246 var5;
                  Class182 var6;
                  while(Class250.field3198 < 200 && Class250.field3211 > 0) {
                     var5 = (Class246)Class250.field3212.method4018();
                     var6 = new Class182(4);
                     var6.method3532(1);
                     var6.method3534((int)var5.field2421);
                     Class250.field3200.vmethod3347(var6.payload, 0, 4);
                     Class250.field3199.method4016(var5, var5.field2421);
                     --Class250.field3211;
                     ++Class250.field3198;
                  }

                  while(Class250.field3207 < 200 && Class250.field3205 > 0) {
                     var5 = (Class246)Class250.field3202.method3932();
                     var6 = new Class182(4);
                     var6.method3532(0);
                     var6.method3534((int)var5.field2421);
                     Class250.field3200.vmethod3347(var6.payload, 0, 4);
                     var5.method4101();
                     Class250.field3206.method4016(var5, var5.field2421);
                     --Class250.field3205;
                     ++Class250.field3207;
                  }

                  for(int var17 = 0; var17 < 100; ++var17) {
                     int var18 = Class250.field3200.vmethod3349();
                     if (var18 < 0) {
                        throw new IOException();
                     }

                     if (var18 == 0) {
                        break;
                     }

                     Class250.field3197 = 0;
                     byte var7 = 0;
                     if (Class250.field3208 == null) {
                        var7 = 8;
                     } else if (Class250.field3210 == 0) {
                        var7 = 1;
                     }

                     int var8;
                     int var9;
                     int var10;
                     int var12;
                     if (var7 > 0) {
                        var8 = var7 - Class250.field3209.field2339;
                        if (var8 > var18) {
                           var8 = var18;
                        }

                        Class250.field3200.vmethod3351(Class250.field3209.payload, Class250.field3209.field2339, var8);
                        if (Class250.field3213 != 0) {
                           for(var9 = 0; var9 < var8; ++var9) {
                              Class250.field3209.payload[var9 + Class250.field3209.field2339] ^= Class250.field3213;
                           }
                        }

                        Class250.field3209.field2339 += var8;
                        if (Class250.field3209.field2339 < var7) {
                           break;
                        }

                        if (Class250.field3208 == null) {
                           Class250.field3209.field2339 = 0;
                           var9 = Class250.field3209.readUnsignedByte();
                           var10 = Class250.field3209.readUnsignedShort();
                           int var11 = Class250.field3209.readUnsignedByte();
                           var12 = Class250.field3209.method3671();
                           long var13 = (long)(var10 + (var9 << 16));
                           Class246 var15 = (Class246)Class250.field3199.method4020(var13);
                           Class192.field2391 = true;
                           if (var15 == null) {
                              var15 = (Class246)Class250.field3206.method4020(var13);
                              Class192.field2391 = false;
                           }

                           if (var15 == null) {
                              throw new IOException();
                           }

                           int var16 = var11 == 0 ? 5 : 9;
                           Class250.field3208 = var15;
                           Class301.field3713 = new Class182(var16 + var12 + Class250.field3208.field3157);
                           Class301.field3713.method3532(var11);
                           Class301.field3713.method3707(var12);
                           Class250.field3210 = 8;
                           Class250.field3209.field2339 = 0;
                        } else if (Class250.field3210 == 0) {
                           if (Class250.field3209.payload[0] == -1) {
                              Class250.field3210 = 1;
                              Class250.field3209.field2339 = 0;
                           } else {
                              Class250.field3208 = null;
                           }
                        }
                     } else {
                        var8 = Class301.field3713.payload.length - Class250.field3208.field3157;
                        var9 = 512 - Class250.field3210;
                        if (var9 > var8 - Class301.field3713.field2339) {
                           var9 = var8 - Class301.field3713.field2339;
                        }

                        if (var9 > var18) {
                           var9 = var18;
                        }

                        Class250.field3200.vmethod3351(Class301.field3713.payload, Class301.field3713.field2339, var9);
                        if (Class250.field3213 != 0) {
                           for(var10 = 0; var10 < var9; ++var10) {
                              Class301.field3713.payload[var10 + Class301.field3713.field2339] ^= Class250.field3213;
                           }
                        }

                        Class301.field3713.field2339 += var9;
                        Class250.field3210 += var9;
                        if (var8 == Class301.field3713.field2339) {
                           if (16711935L == Class250.field3208.field2421) {
                              Class185.field2359 = Class301.field3713;

                              for(var10 = 0; var10 < 256; ++var10) {
                                 Class249 var19 = Class250.field3201[var10];
                                 if (var19 != null) {
                                    Class185.field2359.field2339 = var10 * 8 + 5;
                                    var12 = Class185.field2359.method3671();
                                    int var20 = Class185.field2359.method3671();
                                    var19.method4723(var12, var20);
                                 }
                              }
                           } else {
                              Class250.field3196.reset();
                              Class250.field3196.update(Class301.field3713.payload, 0, var8);
                              var10 = (int)Class250.field3196.getValue();
                              if (var10 != Class250.field3208.field3156) {
                                 try {
                                    Class250.field3200.vmethod3346();
                                 } catch (Exception var23) {
                                    ;
                                 }

                                 ++Class250.field3214;
                                 Class250.field3200 = null;
                                 Class250.field3213 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                                 var1 = false;
                                 break label245;
                              }

                              Class250.field3214 = 0;
                              Class250.field3215 = 0;
                              Class250.field3208.field3155.method4729((int)(Class250.field3208.field2421 & 65535L), Class301.field3713.payload, 16711680L == (Class250.field3208.field2421 & 16711680L), Class192.field2391);
                           }

                           Class250.field3208.method4064();
                           if (Class192.field2391) {
                              --Class250.field3198;
                           } else {
                              --Class250.field3207;
                           }

                           Class250.field3210 = 0;
                           Class250.field3208 = null;
                           Class301.field3713 = null;
                        } else {
                           if (Class250.field3210 != 512) {
                              break;
                           }

                           Class250.field3210 = 0;
                        }
                     }
                  }

                  var1 = true;
               }
            } catch (IOException var24) {
               try {
                  Class250.field3200.vmethod3346();
               } catch (Exception var22) {
                  ;
               }

               ++Class250.field3215;
               Class250.field3200 = null;
               var1 = false;
            }
         }

         if (!var1) {
            this.method1140();
         }

      }
   }

   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "118360618"
   )
   void method1140() {
      if (Class250.field3214 >= 4) {
         this.method788("js5crc");
         field589 = 1000;
      } else {
         if (Class250.field3215 >= 4) {
            if (field589 <= 5) {
               this.method788("js5io");
               field589 = 1000;
               return;
            }

            field768 = 3000;
            Class250.field3215 = 3;
         }

         if (--field768 + 1 <= 0) {
            try {
               if (field692 == 0) {
                  field839 = Class47.field392.method3259(Class54.field485, Class290.field3636);
                  ++field692;
               }

               if (field692 == 1) {
                  if (field839.field1946 == 2) {
                     this.method1141(-1);
                     return;
                  }

                  if (field839.field1946 == 1) {
                     ++field692;
                  }
               }

               if (field692 == 2) {
                  if (field629) {
                     field611 = Class47.method911((Socket)field839.field1944, 40000, 5000);
                  } else {
                     field611 = new Class161((Socket)field839.field1944, Class47.field392, 5000);
                  }

                  Class182 var1 = new Class182(5);
                  var1.method3532(15);
                  var1.method3707(171);
                  field611.vmethod3347(var1.payload, 0, 5);
                  ++field692;
                  Class229.field2589 = Class182.method3547();
               }

               if (field692 == 3) {
                  if (field611.vmethod3349() > 0 || !field629 && field589 <= 5) {
                     int var2 = field611.vmethod3353();
                     if (var2 != 0) {
                        this.method1141(var2);
                        return;
                     }

                     ++field692;
                  } else if (Class182.method3547() - Class229.field2589 > 30000L) {
                     this.method1141(-2);
                     return;
                  }
               }

               if (field692 == 4) {
                  Class36.method633(field611, field589 > 20);
                  field839 = null;
                  field611 = null;
                  field692 = 0;
                  field614 = 0;
               }
            } catch (IOException var3) {
               this.method1141(-3);
            }

         }
      }
   }

   @ObfuscatedName("ev")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "656785584"
   )
   void method1141(int var1) {
      field839 = null;
      field611 = null;
      field692 = 0;
      if (Class290.field3636 == Class26.field223) {
         Class290.field3636 = Class68.field996;
      } else {
         Class290.field3636 = Class26.field223;
      }

      ++field614;
      if (field614 >= 2 && (var1 == 7 || var1 == 9)) {
         if (field589 <= 5) {
            this.method788("js5connect_full");
            field589 = 1000;
         } else {
            field768 = 3000;
         }
      } else if (field614 >= 2 && var1 == 6) {
         this.method788("js5connect_outofdate");
         field589 = 1000;
      } else if (field614 >= 4) {
         if (field589 <= 5) {
            this.method788("js5connect");
            field589 = 1000;
         } else {
            field768 = 3000;
         }
      }

   }

   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2122262374"
   )
   final void method1142() {
      Object var1 = field626.method1983();
      Class189 var2 = field626.field1219;

      try {
         if (field615 == 0) {
            if (var1 != null) {
               ((Class157)var1).vmethod3346();
               var1 = null;
            }

            Class225.field2556 = null;
            field756 = false;
            field616 = 0;
            field615 = 1;
         }

         if (field615 == 1) {
            if (Class225.field2556 == null) {
               Class225.field2556 = Class47.field392.method3259(Class54.field485, Class290.field3636);
            }

            if (Class225.field2556.field1946 == 2) {
               throw new IOException();
            }

            if (Class225.field2556.field1946 == 1) {
               if (field629) {
                  var1 = Class47.method911((Socket)Class225.field2556.field1944, 40000, 5000);
               } else {
                  var1 = new Class161((Socket)Class225.field2556.field1944, Class47.field392, 5000);
               }

               field626.method1997((Class157)var1);
               Class225.field2556 = null;
               field615 = 2;
            }
         }

         if (field615 == 2) {
            field626.method1978();
            Class172 var3 = Class62.method1536();
            var3.field2257.method3532(Class170.field2237.field2239);
            field626.method1980(var3);
            field626.method1979();
            var2.field2339 = 0;
            field615 = 3;
         }

         int var4;
         boolean var13;
         if (field615 == 3) {
            if (Class28.field244 != null) {
               Class28.field244.method2145();
            }

            if (Class63.field879 != null) {
               Class63.field879.method2145();
            }

            var13 = true;
            if (field629 && !((Class157)var1).vmethod3350(1)) {
               var13 = false;
            }

            if (var13) {
               var4 = ((Class157)var1).vmethod3353();
               if (Class28.field244 != null) {
                  Class28.field244.method2145();
               }

               if (Class63.field879 != null) {
                  Class63.field879.method2145();
               }

               if (var4 != 0) {
                  Class33.method559(var4);
                  return;
               }

               var2.field2339 = 0;
               field615 = 4;
            }
         }

         int var28;
         if (field615 == 4) {
            if (var2.field2339 < 8) {
               var28 = ((Class157)var1).vmethod3349();
               if (var28 > 8 - var2.field2339) {
                  var28 = 8 - var2.field2339;
               }

               if (var28 > 0) {
                  ((Class157)var1).vmethod3351(var2.payload, var2.field2339, var28);
                  var2.field2339 += var28;
               }
            }

            if (var2.field2339 == 8) {
               var2.field2339 = 0;
               Class221.field2535 = var2.method3554();
               field615 = 5;
            }
         }

         int var7;
         if (field615 == 5) {
            field626.field1219.field2339 = 0;
            field626.method1978();
            Class189 var22 = new Class189(500);
            int[] var14 = new int[]{(int)(Math.random() * 9.9999999E7D), (int)(Math.random() * 9.9999999E7D), (int)(Class221.field2535 >> 32), (int)(Class221.field2535 & -1L)};
            var22.field2339 = 0;
            var22.method3532(1);
            var22.method3532(field619.vmethod5815());
            var22.method3707(var14[0]);
            var22.method3707(var14[1]);
            var22.method3707(var14[2]);
            var22.method3707(var14[3]);
            switch(field619.field1909) {
            case 0:
            case 1:
               var22.method3534(Class14.field104);
               var22.field2339 += 5;
               break;
            case 2:
               var22.field2339 += 8;
               break;
            case 3:
               var22.method3707((Integer)Class10.field61.field963.get(Class3.method35(Class78.field1106)));
               var22.field2339 += 4;
            }

            var22.method3699(Class78.field1086);
            var22.method3571(Class76.field1071, Class76.field1069);
            Class172 var5 = Class62.method1536();
            var5.field2257.field2339 = 0;
            if (field589 == 40) {
               var5.field2257.method3532(Class170.field2238.field2239);
            } else {
               var5.field2257.method3532(Class170.field2235.field2239);
            }

            var5.field2257.method3755(0);
            int var6 = var5.field2257.field2339;
            var5.field2257.method3707(171);
            var5.field2257.method3542(var22.payload, 0, var22.field2339);
            var7 = var5.field2257.field2339;
            var5.field2257.method3699(Class78.field1106);
            var5.field2257.method3532((field792 ? 1 : 0) << 1 | (field585 ? 1 : 0));
            var5.field2257.method3755(Class82.field1179);
            var5.field2257.method3755(Class243.field3138);
            Class189 var8 = var5.field2257;
            if (field620 != null) {
               var8.method3542(field620, 0, field620.length);
            } else {
               byte[] var10 = new byte[24];

               try {
                  Class155.field1968.method2476(0L);
                  Class155.field1968.method2478(var10);

                  int var11;
                  for(var11 = 0; var11 < 24 && var10[var11] == 0; ++var11) {
                     ;
                  }

                  if (var11 >= 24) {
                     throw new IOException();
                  }
               } catch (Exception var20) {
                  for(int var12 = 0; var12 < 24; ++var12) {
                     var10[var12] = -1;
                  }
               }

               var8.method3542(var10, 0, var10.length);
            }

            var5.field2257.method3699(Class163.field2013);
            var5.field2257.method3707(Class124.field1709);
            Class182 var9 = new Class182(Class27.field228.method6215());
            Class27.field228.method6217(var9);
            var5.field2257.method3542(var9.payload, 0, var9.payload.length);
            var5.field2257.method3532(field587);
            var5.field2257.method3707(0);
            var5.field2257.method3707(Class77.field1079.field3175);
            var5.field2257.method3707(Class37.field326.field3175);
            var5.field2257.method3707(Class97.field1329.field3175);
            var5.field2257.method3707(Class224.field2548.field3175);
            var5.field2257.method3707(Class135.field1852.field3175);
            var5.field2257.method3707(Class246.field3159.field3175);
            var5.field2257.method3707(Class80.field1147.field3175);
            var5.field2257.method3707(Class21.field179.field3175);
            var5.field2257.method3707(Class175.field2270.field3175);
            var5.field2257.method3707(Class268.field3419.field3175);
            var5.field2257.method3707(Class22.field183.field3175);
            var5.field2257.method3707(Class61.field576.field3175);
            var5.field2257.method3707(field854.field3175);
            var5.field2257.method3707(Class50.field461.field3175);
            var5.field2257.method3707(Class59.field543.field3175);
            var5.field2257.method3707(Class36.field312.field3175);
            var5.field2257.method3707(Class24.field207.field3175);
            var5.field2257.method3569(var14, var7, var5.field2257.field2339);
            var5.field2257.method3614(var5.field2257.field2339 - var6);
            field626.method1980(var5);
            field626.method1979();
            field626.field1218 = new Class190(var14);

            for(int var16 = 0; var16 < 4; ++var16) {
               var14[var16] += 50;
            }

            var2.method3836(var14);
            field615 = 6;
         }

         if (field615 == 6 && ((Class157)var1).vmethod3349() > 0) {
            var28 = ((Class157)var1).vmethod3353();
            if (var28 == 21 && field589 == 20) {
               field615 = 7;
            } else if (var28 == 2) {
               field615 = 9;
            } else if (var28 == 15 && field589 == 40) {
               field626.packetSize = -1;
               field615 = 13;
            } else if (var28 == 23 && field617 < 1) {
               ++field617;
               field615 = 0;
            } else {
               if (var28 != 29) {
                  Class33.method559(var28);
                  return;
               }

               field615 = 11;
            }
         }

         if (field615 == 7 && ((Class157)var1).vmethod3349() > 0) {
            field618 = (((Class157)var1).vmethod3353() + 3) * 60;
            field615 = 8;
         }

         if (field615 == 8) {
            field616 = 0;
            Class2.method22("You have only just left another world.", "Your profile will be transferred in:", field618 / 60 + " seconds.");
            if (--field618 <= 0) {
               field615 = 0;
            }

         } else {
            int var17;
            if (field615 == 9 && ((Class157)var1).vmethod3349() >= 13) {
               var13 = ((Class157)var1).vmethod3353() == 1;
               ((Class157)var1).vmethod3351(var2.payload, 0, 4);
               var2.field2339 = 0;
               boolean var24 = false;
               if (var13) {
                  var4 = var2.method3820() << 24;
                  var4 |= var2.method3820() << 16;
                  var4 |= var2.method3820() << 8;
                  var4 |= var2.method3820();
                  var17 = Class3.method35(Class78.field1106);
                  if (Class10.field61.field963.size() >= 10 && !Class10.field61.field963.containsKey(var17)) {
                     Iterator var18 = Class10.field61.field963.entrySet().iterator();
                     var18.next();
                     var18.remove();
                  }

                  Class10.field61.field963.put(var17, var4);
               }

               if (Class78.field1108) {
                  Class10.field61.field959 = Class78.field1106;
               } else {
                  Class10.field61.field959 = null;
               }

               Class54.method1018();
               field747 = ((Class157)var1).vmethod3353();
               field776 = ((Class157)var1).vmethod3353() == 1;
               field628 = ((Class157)var1).vmethod3353();
               field628 <<= 8;
               field628 += ((Class157)var1).vmethod3353();
               field698 = ((Class157)var1).vmethod3353();
               ((Class157)var1).vmethod3351(var2.payload, 0, 1);
               var2.field2339 = 0;
               ServerPackets[] var26 = new ServerPackets[]{ServerPackets.field2100, ServerPackets.field2050, ServerPackets.field2051, ServerPackets.cs2ScriptPacket, ServerPackets.field2053, ServerPackets.field2054, ServerPackets.field2055, ServerPackets.field2122, ServerPackets.field2083, ServerPackets.field2065, ServerPackets.field2059, ServerPackets.field2060, ServerPackets.field2061, ServerPackets.field2062, ServerPackets.field2063, ServerPackets.field2106, ServerPackets.field2107, ServerPackets.field2069, ServerPackets.field2128, ServerPackets.field2105, ServerPackets.field2116, ServerPackets.field2111, ServerPackets.field2071, ServerPackets.field2072, ServerPackets.field2114, ServerPackets.field2074, ServerPackets.field2075, ServerPackets.field2058, ServerPackets.field2077, ServerPackets.field2078, ServerPackets.field2131, ServerPackets.field2080, ServerPackets.field2081, ServerPackets.npcUpdating, ServerPackets.field2079, ServerPackets.field2084, ServerPackets.field2085, ServerPackets.field2086, ServerPackets.field2087, ServerPackets.field2088, ServerPackets.field2089, ServerPackets.field2090, ServerPackets.field2091, ServerPackets.field2092, ServerPackets.field2093, ServerPackets.field2076, ServerPackets.field2095, ServerPackets.field2096, ServerPackets.field2097, ServerPackets.smallVarp, ServerPackets.largeVarp, ServerPackets.field2082, ServerPackets.field2101, ServerPackets.field2102, ServerPackets.field2094, ServerPackets.field2104, ServerPackets.playerUpdating, ServerPackets.field2064, ServerPackets.field2119, ServerPackets.field2108, ServerPackets.field2109, ServerPackets.field2049, ServerPackets.field2068, ServerPackets.field2112, ServerPackets.field2113, ServerPackets.field2129, ServerPackets.field2115, ServerPackets.field2073, ServerPackets.field2117, ServerPackets.field2118, ServerPackets.field2124, ServerPackets.field2120, ServerPackets.field2121, ServerPackets.field2103, ServerPackets.field2123, ServerPackets.field2066, ServerPackets.field2125, ServerPackets.field2130, ServerPackets.field2126, ServerPackets.field2057, ServerPackets.field2056, ServerPackets.field2110, ServerPackets.field2052, ServerPackets.field2132};
               var7 = var2.method3841();
               if (var7 < 0 || var7 >= var26.length) {
                  throw new IOException(var7 + " " + var2.field2339);
               }

               field626.recievedPacket = var26[var7];
               field626.packetSize = field626.recievedPacket.packetSize;
               ((Class157)var1).vmethod3351(var2.payload, 0, 2);
               var2.field2339 = 0;
               field626.packetSize = var2.readUnsignedShort();

               try {
                  Class41.method702(Class182.field2334, "zap");
               } catch (Throwable var19) {
                  ;
               }

               field615 = 10;
            }

            if (field615 != 10) {
               if (field615 == 11 && ((Class157)var1).vmethod3349() >= 2) {
                  var2.field2339 = 0;
                  ((Class157)var1).vmethod3351(var2.payload, 0, 2);
                  var2.field2339 = 0;
                  Class249.field3192 = var2.readUnsignedShort();
                  field615 = 12;
               }

               if (field615 == 12 && ((Class157)var1).vmethod3349() >= Class249.field3192) {
                  var2.field2339 = 0;
                  ((Class157)var1).vmethod3351(var2.payload, 0, Class249.field3192);
                  var2.field2339 = 0;
                  String var25 = var2.method3738();
                  String var30 = var2.method3738();
                  String var27 = var2.method3738();
                  Class2.method22(var25, var30, var27);
                  Class48.method947(10);
               }

               if (field615 == 13) {
                  if (field626.packetSize == -1) {
                     if (((Class157)var1).vmethod3349() < 2) {
                        return;
                     }

                     ((Class157)var1).vmethod3351(var2.payload, 0, 2);
                     var2.field2339 = 0;
                     field626.packetSize = var2.readUnsignedShort();
                  }

                  if (((Class157)var1).vmethod3349() >= field626.packetSize) {
                     ((Class157)var1).vmethod3351(var2.payload, 0, field626.packetSize);
                     var2.field2339 = 0;
                     var28 = field626.packetSize;
                     field804.method5249();
                     Class30.method484();
                     Class37.method660(var2);
                     if (var28 != var2.field2339) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field616;
                  if (field616 > 2000) {
                     if (field617 < 1) {
                        if (Class26.field223 == Class290.field3636) {
                           Class290.field3636 = Class68.field996;
                        } else {
                           Class290.field3636 = Class26.field223;
                        }

                        ++field617;
                        field615 = 0;
                     } else {
                        Class33.method559(-3);
                     }
                  }
               }
            } else {
               if (((Class157)var1).vmethod3349() >= field626.packetSize) {
                  var2.field2339 = 0;
                  ((Class157)var1).vmethod3351(var2.payload, 0, field626.packetSize);
                  field804.method5247();
                  field592 = 1L;
                  field595 = -1;
                  Class26.field220.field522 = 0;
                  Class18.field146 = true;
                  field847 = true;
                  field722 = -1L;
                  Class310.method5697();
                  field626.method1978();
                  field626.field1219.field2339 = 0;
                  field626.recievedPacket = null;
                  field626.field1215 = null;
                  field626.field1226 = null;
                  field626.field1227 = null;
                  field626.packetSize = 0;
                  field626.field1228 = 0;
                  field598 = 0;
                  field627 = 0;
                  field599 = 0;
                  field771 = 0;
                  field716 = false;
                  Class80.method1866(0);
                  Class172.method3456();
                  field733 = 0;
                  field785 = false;
                  field656 = 0;
                  field717 = 0;
                  field655 = 0;
                  Class21.field175 = null;
                  field810 = 0;
                  field651 = -1;
                  field808 = 0;
                  field809 = 0;
                  field607 = Class77.field1074;
                  field780 = Class77.field1074;
                  field622 = 0;
                  Class111.method2562();

                  for(var28 = 0; var28 < 2048; ++var28) {
                     field610[var28] = null;
                  }

                  for(var28 = 0; var28 < 32768; ++var28) {
                     field843[var28] = null;
                  }

                  field707 = -1;
                  field710.method4072();
                  field711.method4072();

                  for(var28 = 0; var28 < 4; ++var28) {
                     for(var4 = 0; var4 < 104; ++var4) {
                        for(var17 = 0; var17 < 104; ++var17) {
                           field708[var28][var4][var17] = null;
                        }
                     }
                  }

                  field714 = new Class205();
                  Class181.field2332.method1628();

                  for(var28 = 0; var28 < Class254.field3232; ++var28) {
                     Class254 var29 = Class63.method1549(var28);
                     if (var29 != null) {
                        Class225.field2559[var28] = 0;
                        Class225.clientVarps[var28] = 0;
                     }
                  }

                  Class22.field185.method1891();
                  field748 = -1;
                  if (field683 != -1) {
                     Class66.method1622(field683);
                  }

                  for(Class55 var23 = (Class55)field741.method4018(); var23 != null; var23 = (Class55)field741.method4019()) {
                     Class20.method261(var23, true);
                  }

                  field683 = -1;
                  field741 = new Class202(8);
                  field744 = null;
                  field771 = 0;
                  field716 = false;
                  field841.method4462((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

                  for(var28 = 0; var28 < 8; ++var28) {
                     field704[var28] = null;
                     field709[var28] = false;
                  }

                  Class53.field474 = new Class202(32);
                  field625 = true;

                  for(var28 = 0; var28 < 100; ++var28) {
                     field697[var28] = true;
                  }

                  Class65.method1604();
                  Class14.field94 = null;

                  for(var28 = 0; var28 < 8; ++var28) {
                     field844[var28] = new Class4();
                  }

                  Class19.field154 = null;
                  Class37.method660(var2);
                  Class27.field224 = -1;
                  Class51.method994(false, var2);
                  field626.recievedPacket = null;
               }

            }
         }
      } catch (IOException var21) {
         if (field617 < 1) {
            if (Class290.field3636 == Class26.field223) {
               Class290.field3636 = Class68.field996;
            } else {
               Class290.field3636 = Class26.field223;
            }

            ++field617;
            field615 = 0;
         } else {
            Class33.method559(-2);
         }
      }
   }

   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "51"
   )
   final void method1143() {
      if (field598 > 1) {
         --field598;
      }

      if (field627 > 0) {
         --field627;
      }

      if (field756) {
         field756 = false;
         Class30.method516();
      } else {
         if (!field716) {
            Class59.method1077();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.processPackets(field626); ++var1) {
            ;
         }

         if (field589 == 30) {
            while(true) {
               Class312 var2 = (Class312)Class313.field3759.method4048();
               boolean var29;
               if (var2 == null) {
                  var29 = false;
               } else {
                  var29 = true;
               }

               int var3;
               Class172 var30;
               if (!var29) {
                  Class172 var14;
                  int var15;
                  if (field804.field3597) {
                     var14 = Class26.method433(ClientPackets.field2201, field626.field1218);
                     var14.field2257.method3532(0);
                     var15 = var14.field2257.field2339;
                     field804.method5245(var14.field2257);
                     var14.field2257.method3545(var14.field2257.field2339 - var15);
                     field626.method1980(var14);
                     field804.method5248();
                  }

                  Object var35 = Class26.field220.field523;
                  int var4;
                  int var5;
                  int var6;
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  synchronized(Class26.field220.field523) {
                     if (!field580) {
                        Class26.field220.field522 = 0;
                     } else if (Class48.field431 != 0 || Class26.field220.field522 >= 40) {
                        var30 = Class26.method433(ClientPackets.field2228, field626.field1218);
                        var30.field2257.method3532(0);
                        var3 = var30.field2257.field2339;
                        var4 = 0;

                        for(var5 = 0; var5 < Class26.field220.field522 && var30.field2257.field2339 - var3 < 240; ++var5) {
                           ++var4;
                           var6 = Class26.field220.field526[var5];
                           if (var6 < 0) {
                              var6 = 0;
                           } else if (var6 > 502) {
                              var6 = 502;
                           }

                           var7 = Class26.field220.field525[var5];
                           if (var7 < 0) {
                              var7 = 0;
                           } else if (var7 > 764) {
                              var7 = 764;
                           }

                           var8 = var7 + var6 * 765;
                           if (Class26.field220.field526[var5] == -1 && Class26.field220.field525[var5] == -1) {
                              var7 = -1;
                              var6 = -1;
                              var8 = 524287;
                           }

                           if (var7 == field593 && var6 == field594) {
                              if (field595 < 2047) {
                                 ++field595;
                              }
                           } else {
                              var9 = var7 - field593;
                              field593 = var7;
                              var10 = var6 - field594;
                              field594 = var6;
                              if (field595 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                                 var9 += 32;
                                 var10 += 32;
                                 var30.field2257.method3755(var10 + (field595 << 12) + (var9 << 6));
                                 field595 = 0;
                              } else if (field595 < 8) {
                                 var30.field2257.method3534((field595 << 19) + var8 + 8388608);
                                 field595 = 0;
                              } else {
                                 var30.field2257.method3707((field595 << 19) + var8 + -1073741824);
                                 field595 = 0;
                              }
                           }
                        }

                        var30.field2257.method3545(var30.field2257.field2339 - var3);
                        field626.method1980(var30);
                        if (var4 >= Class26.field220.field522) {
                           Class26.field220.field522 = 0;
                        } else {
                           Class26.field220.field522 -= var4;

                           for(var5 = 0; var5 < Class26.field220.field522; ++var5) {
                              Class26.field220.field525[var5] = Class26.field220.field525[var4 + var5];
                              Class26.field220.field526[var5] = Class26.field220.field526[var5 + var4];
                           }
                        }
                     }
                  }

                  Class172 var18;
                  if (Class48.field431 == 1 || !Class253.field3229 && Class48.field431 == 4 || Class48.field431 == 2) {
                     long var16 = (Class48.field433 - field592 * -1L) / 50L;
                     if (var16 > 4095L) {
                        var16 = 4095L;
                     }

                     field592 = Class48.field433 * -1L;
                     var3 = Class48.field428;
                     if (var3 < 0) {
                        var3 = 0;
                     } else if (var3 > Class243.field3138) {
                        var3 = Class243.field3138;
                     }

                     var4 = Class48.field432;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > Class82.field1179) {
                        var4 = Class82.field1179;
                     }

                     var5 = (int)var16;
                     var18 = Class26.method433(ClientPackets.field2188, field626.field1218);
                     var18.field2257.method3755((Class48.field431 == 2 ? 1 : 0) + (var5 << 1));
                     var18.field2257.method3755(var4);
                     var18.field2257.method3755(var3);
                     field626.method1980(var18);
                  }

                  if (Class39.field349 > 0) {
                     var14 = Class26.method433(ClientPackets.field2218, field626.field1218);
                     var14.field2257.method3755(0);
                     var15 = var14.field2257.field2339;
                     long var19 = Class182.method3547();

                     for(var5 = 0; var5 < Class39.field349; ++var5) {
                        long var21 = var19 - field722;
                        if (var21 > 16777215L) {
                           var21 = 16777215L;
                        }

                        field722 = var19;
                        var14.field2257.method3532(Class39.field338[var5]);
                        var14.field2257.method3731((int)var21);
                     }

                     var14.field2257.method3614(var14.field2257.field2339 - var15);
                     field626.method1980(var14);
                  }

                  if (field664 > 0) {
                     --field664;
                  }

                  if (Class39.field341[96] || Class39.field341[97] || Class39.field341[98] || Class39.field341[99]) {
                     field807 = true;
                  }

                  if (field807 && field664 <= 0) {
                     field664 = 20;
                     field807 = false;
                     var14 = Class26.method433(ClientPackets.field2183, field626.field1218);
                     var14.field2257.method3582(field649);
                     var14.field2257.method3755(field717);
                     field626.method1980(var14);
                  }

                  if (Class18.field146 && !field847) {
                     field847 = true;
                     var14 = Class26.method433(ClientPackets.field2227, field626.field1218);
                     var14.field2257.method3532(1);
                     field626.method1980(var14);
                  }

                  if (!Class18.field146 && field847) {
                     field847 = false;
                     var14 = Class26.method433(ClientPackets.field2227, field626.field1218);
                     var14.field2257.method3532(0);
                     field626.method1980(var14);
                  }

                  if (Class53.field476 != null) {
                     Class53.field476.method6013();
                  }

                  if (Class54.field489) {
                     if (Class14.field94 != null) {
                        Class14.field94.method5337();
                     }

                     for(var1 = 0; var1 < Class81.field1167; ++var1) {
                        Class60 var31 = field610[Class81.field1159[var1]];
                        var31.method1086();
                     }

                     Class54.field489 = false;
                  }

                  Class82.method1894();
                  if (field589 != 30) {
                     return;
                  }

                  for(Class62 var37 = (Class62)field714.method4098(); var37 != null; var37 = (Class62)field714.method4079()) {
                     if (var37.field860 > 0) {
                        --var37.field860;
                     }

                     Class268 var23;
                     boolean var36;
                     if (var37.field860 == 0) {
                        if (var37.field859 >= 0) {
                           var3 = var37.field859;
                           var4 = var37.field866;
                           var23 = Class110.method2527(var3);
                           if (var4 == 11) {
                              var4 = 10;
                           }

                           if (var4 >= 5 && var4 <= 8) {
                              var4 = 4;
                           }

                           var36 = var23.method5048(var4);
                           if (!var36) {
                              continue;
                           }
                        }

                        Class170.method3449(var37.field861, var37.field856, var37.field857, var37.field858, var37.field859, var37.field865, var37.field866);
                        var37.method4064();
                     } else {
                        if (var37.field855 > 0) {
                           --var37.field855;
                        }

                        if (var37.field855 == 0 && var37.field857 >= 1 && var37.field858 >= 1 && var37.field857 <= 102 && var37.field858 <= 102) {
                           if (var37.field862 >= 0) {
                              var3 = var37.field862;
                              var4 = var37.field864;
                              var23 = Class110.method2527(var3);
                              if (var4 == 11) {
                                 var4 = 10;
                              }

                              if (var4 >= 5 && var4 <= 8) {
                                 var4 = 4;
                              }

                              var36 = var23.method5048(var4);
                              if (!var36) {
                                 continue;
                              }
                           }

                           Class170.method3449(var37.field861, var37.field856, var37.field857, var37.field858, var37.field862, var37.field863, var37.field864);
                           var37.field855 = -1;
                           if (var37.field859 == var37.field862 && var37.field859 == -1) {
                              var37.method4064();
                           } else if (var37.field859 == var37.field862 && var37.field863 == var37.field865 && var37.field866 == var37.field864) {
                              var37.method4064();
                           }
                        }
                     }
                  }

                  Class268.method5085();
                  ++field626.field1228;
                  if (field626.field1228 > 750) {
                     Class30.method516();
                     return;
                  }

                  var1 = Class81.field1167;
                  int[] var32 = Class81.field1159;

                  for(var3 = 0; var3 < var1; ++var3) {
                     Class60 var24 = field610[var32[var3]];
                     if (var24 != null) {
                        Class59.method1080(var24, 1);
                     }
                  }

                  for(var1 = 0; var1 < field622; ++var1) {
                     var15 = field639[var1];
                     Class72 var25 = field843[var15];
                     if (var25 != null) {
                        Class59.method1080(var25, var25.field1037.field3497);
                     }
                  }

                  int[] var38 = Class81.field1159;

                  for(var15 = 0; var15 < Class81.field1167; ++var15) {
                     Class60 var46 = field610[var38[var15]];
                     if (var46 != null && var46.field887 > 0) {
                        --var46.field887;
                        if (var46.field887 == 0) {
                           var46.field884 = null;
                        }
                     }
                  }

                  for(var15 = 0; var15 < field622; ++var15) {
                     var3 = field639[var15];
                     Class72 var43 = field843[var3];
                     if (var43 != null && var43.field887 > 0) {
                        --var43.field887;
                        if (var43.field887 == 0) {
                           var43.field884 = null;
                        }
                     }
                  }

                  ++field700;
                  if (field684 != 0) {
                     field803 += 20;
                     if (field803 >= 400) {
                        field684 = 0;
                     }
                  }

                  if (Class240.field3096 != null) {
                     ++field686;
                     if (field686 >= 15) {
                        Class60.method1114(Class240.field3096);
                        Class240.field3096 = null;
                     }
                  }

                  Class230 var39 = Class143.field1897;
                  Class230 var33 = Class141.field1888;
                  Class143.field1897 = null;
                  Class141.field1888 = null;
                  field755 = null;
                  field772 = false;
                  field601 = false;
                  field799 = 0;

                  while(Class1.method8() && field799 < 128) {
                     if (field747 >= 2 && Class39.field341[82] && Class163.field2016 == 66) {
                        String var44 = "";

                        Class58 var40;
                        for(Iterator var41 = Class83.field1181.iterator(); var41.hasNext(); var44 = var44 + var40.field531 + ':' + var40.field533 + '\n') {
                           var40 = (Class58)var41.next();
                        }

                        Class182.field2334.method771(var44);
                     } else if (field655 != 1 || Class39.field342 <= 0) {
                        field773[field799] = Class163.field2016;
                        field800[field799] = Class39.field342;
                        ++field799;
                     }
                  }

                  if (Class40.method696() && Class39.field341[82] && Class39.field341[81] && field695 != 0) {
                     var3 = Class138.field1876.field567 - field695;
                     if (var3 < 0) {
                        var3 = 0;
                     } else if (var3 > 3) {
                        var3 = 3;
                     }

                     if (var3 != Class138.field1876.field567) {
                        Class19.method197(Class138.field1876.field922[0] + Class62.field868, Class138.field1876.field872[0] + field754, var3, false);
                     }

                     field695 = 0;
                  }

                  if (field683 != -1) {
                     var3 = field683;
                     var4 = Class82.field1179;
                     var5 = Class243.field3138;
                     if (Class261.method4931(var3)) {
                        Class12.method102(Class42.field366[var3], -1, 0, 0, var4, var5, 0, 0);
                     }
                  }

                  ++field801;

                  while(true) {
                     Class230 var42;
                     Class230 var47;
                     Class56 var48;
                     do {
                        var48 = (Class56)field778.method4076();
                        if (var48 == null) {
                           while(true) {
                              do {
                                 var48 = (Class56)field779.method4076();
                                 if (var48 == null) {
                                    while(true) {
                                       do {
                                          var48 = (Class56)field638.method4076();
                                          if (var48 == null) {
                                             this.method1233();
                                             Class275.method5239();
                                             if (field583 != null) {
                                                this.method1448();
                                             }

                                             Class172 var45;
                                             if (Class276.field3559 != null) {
                                                Class60.method1114(Class276.field3559);
                                                ++field693;
                                                if (Class48.field419 == 0) {
                                                   if (field689) {
                                                      if (Class132.field1819 == Class276.field3559 && field688 != field691) {
                                                         Class230 var49 = Class276.field3559;
                                                         byte var34 = 0;
                                                         if (field743 == 1 && var49.field2609 == 206) {
                                                            var34 = 1;
                                                         }

                                                         if (var49.field2724[field691] <= 0) {
                                                            var34 = 0;
                                                         }

                                                         if (Class140.method3150(Class24.method425(var49))) {
                                                            var5 = field688;
                                                            var6 = field691;
                                                            var49.field2724[var6] = var49.field2724[var5];
                                                            var49.field2725[var6] = var49.field2725[var5];
                                                            var49.field2724[var5] = -1;
                                                            var49.field2725[var5] = 0;
                                                         } else if (var34 == 1) {
                                                            var5 = field688;
                                                            var6 = field691;

                                                            while(var6 != var5) {
                                                               if (var5 > var6) {
                                                                  var49.method4507(var5 - 1, var5);
                                                                  --var5;
                                                               } else if (var5 < var6) {
                                                                  var49.method4507(var5 + 1, var5);
                                                                  ++var5;
                                                               }
                                                            }
                                                         } else {
                                                            var49.method4507(field691, field688);
                                                         }

                                                         var45 = Class26.method433(ClientPackets.field2170, field626.field1218);
                                                         var45.field2257.method3576(var34);
                                                         var45.field2257.method3582(field688);
                                                         var45.field2257.method3687(Class276.field3559.field2691);
                                                         var45.field2257.method3582(field691);
                                                         field626.method1980(var45);
                                                      }
                                                   } else if (this.method1149()) {
                                                      this.method1476(field678, field821);
                                                   } else if (field771 > 0) {
                                                      Class60.method1120(field678, field821);
                                                   }

                                                   field686 = 10;
                                                   Class48.field431 = 0;
                                                   Class276.field3559 = null;
                                                } else if (field693 >= 5 && (Class48.field425 > field678 + 5 || Class48.field425 < field678 - 5 || Class48.field426 * 673804999 > field821 + 5 || Class48.field426 * 673804999 < field821 - 5)) {
                                                   field689 = true;
                                                }
                                             }

                                             if (Class125.method2911()) {
                                                var3 = Class125.field1772;
                                                var4 = Class125.field1747;
                                                var45 = Class26.method433(ClientPackets.field2219, field626.field1218);
                                                var45.field2257.method3532(5);
                                                var45.field2257.method3755(var3 + Class62.field868);
                                                var45.field2257.method3575(Class39.field341[82] ? (Class39.field341[81] ? 2 : 1) : 0);
                                                var45.field2257.method3582(var4 + field754);
                                                field626.method1980(var45);
                                                Class125.method2972();
                                                field681 = Class48.field432;
                                                field682 = Class48.field428;
                                                field684 = 1;
                                                field803 = 0;
                                                field808 = var3;
                                                field809 = var4;
                                             }

                                             if (var39 != Class143.field1897) {
                                                if (var39 != null) {
                                                   Class60.method1114(var39);
                                                }

                                                if (Class143.field1897 != null) {
                                                   Class60.method1114(Class143.field1897);
                                                }
                                             }

                                             if (var33 != Class141.field1888 && field623 == field732) {
                                                if (var33 != null) {
                                                   Class60.method1114(var33);
                                                }

                                                if (Class141.field1888 != null) {
                                                   Class60.method1114(Class141.field1888);
                                                }
                                             }

                                             if (Class141.field1888 != null) {
                                                if (field623 < field732) {
                                                   ++field623;
                                                   if (field732 == field623) {
                                                      Class60.method1114(Class141.field1888);
                                                   }
                                                }
                                             } else if (field623 > 0) {
                                                --field623;
                                             }

                                             Class85.method1962();
                                             if (field822) {
                                                var3 = Class24.field203 * 128 + 64;
                                                var4 = Class150.field1928 * 128 + 64;
                                                var5 = Class27.method460(var3, var4, Class13.field82) - Class224.field2555;
                                                if (Class109.field1431 < var3) {
                                                   Class109.field1431 = (var3 - Class109.field1431) * Class84.field1197 / 1000 + Class109.field1431 + Class245.field3154;
                                                   if (Class109.field1431 > var3) {
                                                      Class109.field1431 = var3;
                                                   }
                                                }

                                                if (Class109.field1431 > var3) {
                                                   Class109.field1431 -= Class84.field1197 * (Class109.field1431 - var3) / 1000 + Class245.field3154;
                                                   if (Class109.field1431 < var3) {
                                                      Class109.field1431 = var3;
                                                   }
                                                }

                                                if (Class123.field1702 < var5) {
                                                   Class123.field1702 = (var5 - Class123.field1702) * Class84.field1197 / 1000 + Class123.field1702 + Class245.field3154;
                                                   if (Class123.field1702 > var5) {
                                                      Class123.field1702 = var5;
                                                   }
                                                }

                                                if (Class123.field1702 > var5) {
                                                   Class123.field1702 -= Class84.field1197 * (Class123.field1702 - var5) / 1000 + Class245.field3154;
                                                   if (Class123.field1702 < var5) {
                                                      Class123.field1702 = var5;
                                                   }
                                                }

                                                if (Class226.field2563 < var4) {
                                                   Class226.field2563 = (var4 - Class226.field2563) * Class84.field1197 / 1000 + Class226.field2563 + Class245.field3154;
                                                   if (Class226.field2563 > var4) {
                                                      Class226.field2563 = var4;
                                                   }
                                                }

                                                if (Class226.field2563 > var4) {
                                                   Class226.field2563 -= Class84.field1197 * (Class226.field2563 - var4) / 1000 + Class245.field3154;
                                                   if (Class226.field2563 < var4) {
                                                      Class226.field2563 = var4;
                                                   }
                                                }

                                                var3 = Class50.field456 * 128 + 64;
                                                var4 = Class237.field3082 * 128 + 64;
                                                var5 = Class27.method460(var3, var4, Class13.field82) - Class11.field68;
                                                var6 = var3 - Class109.field1431;
                                                var7 = var5 - Class123.field1702;
                                                var8 = var4 - Class226.field2563;
                                                var9 = (int)Math.sqrt((double)(var8 * var8 + var6 * var6));
                                                var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.949D) & 2047;
                                                int var26 = (int)(Math.atan2((double)var6, (double)var8) * -325.949D) & 2047;
                                                if (var10 < 128) {
                                                   var10 = 128;
                                                }

                                                if (var10 > 383) {
                                                   var10 = 383;
                                                }

                                                if (Class7.field41 < var10) {
                                                   Class7.field41 = (var10 - Class7.field41) * Class133.field1834 / 1000 + Class7.field41 + Class72.field1033;
                                                   if (Class7.field41 > var10) {
                                                      Class7.field41 = var10;
                                                   }
                                                }

                                                if (Class7.field41 > var10) {
                                                   Class7.field41 -= Class133.field1834 * (Class7.field41 - var10) / 1000 + Class72.field1033;
                                                   if (Class7.field41 < var10) {
                                                      Class7.field41 = var10;
                                                   }
                                                }

                                                int var12 = var26 - Class85.field1201;
                                                if (var12 > 1024) {
                                                   var12 -= 2048;
                                                }

                                                if (var12 < -1024) {
                                                   var12 += 2048;
                                                }

                                                if (var12 > 0) {
                                                   Class85.field1201 = var12 * Class133.field1834 / 1000 + Class85.field1201 + Class72.field1033;
                                                   Class85.field1201 &= 2047;
                                                }

                                                if (var12 < 0) {
                                                   Class85.field1201 -= -var12 * Class133.field1834 / 1000 + Class72.field1033;
                                                   Class85.field1201 &= 2047;
                                                }

                                                int var13 = var26 - Class85.field1201;
                                                if (var13 > 1024) {
                                                   var13 -= 2048;
                                                }

                                                if (var13 < -1024) {
                                                   var13 += 2048;
                                                }

                                                if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
                                                   Class85.field1201 = var26;
                                                }
                                             }

                                             for(var3 = 0; var3 < 5; ++var3) {
                                                ++field705[var3];
                                             }

                                             Class22.field185.method1902();
                                             var3 = Class37.method652();
                                             var4 = Class39.field353;
                                             if (var3 > 15000 && var4 > 15000) {
                                                field627 = 250;
                                                Class80.method1866(14500);
                                                var18 = Class26.method433(ClientPackets.field2152, field626.field1218);
                                                field626.method1980(var18);
                                             }

                                             Class181.field2332.method1627();
                                             ++field626.field1224;
                                             if (field626.field1224 > 50) {
                                                var18 = Class26.method433(ClientPackets.field2211, field626.field1218);
                                                field626.method1980(var18);
                                             }

                                             try {
                                                field626.method1979();
                                             } catch (IOException var27) {
                                                Class30.method516();
                                             }

                                             return;
                                          }

                                          var47 = var48.field506;
                                          if (var47.field2606 < 0) {
                                             break;
                                          }

                                          var42 = Class26.method434(var47.field2605);
                                       } while(var42 == null || var42.field2736 == null || var47.field2606 >= var42.field2736.length || var47 != var42.field2736[var47.field2606]);

                                       Class68.method1696(var48);
                                    }
                                 }

                                 var47 = var48.field506;
                                 if (var47.field2606 < 0) {
                                    break;
                                 }

                                 var42 = Class26.method434(var47.field2605);
                              } while(var42 == null || var42.field2736 == null || var47.field2606 >= var42.field2736.length || var47 != var42.field2736[var47.field2606]);

                              Class68.method1696(var48);
                           }
                        }

                        var47 = var48.field506;
                        if (var47.field2606 < 0) {
                           break;
                        }

                        var42 = Class26.method434(var47.field2605);
                     } while(var42 == null || var42.field2736 == null || var47.field2606 >= var42.field2736.length || var47 != var42.field2736[var47.field2606]);

                     Class68.method1696(var48);
                  }
               }

               var30 = Class26.method433(ClientPackets.field2145, field626.field1218);
               var30.field2257.method3532(0);
               var3 = var30.field2257.field2339;
               Class123.method2869(var30.field2257);
               var30.field2257.method3545(var30.field2257.field2339 - var3);
               field626.method1980(var30);
            }
         }
      }
   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-681857594"
   )
   void method1145() {
      int var1 = Class82.field1179;
      int var2 = Class243.field3138;
      if (super.field396 < var1) {
         var1 = super.field396;
      }

      if (super.field397 < var2) {
         var2 = super.field397;
      }

      if (Class10.field61 != null) {
         try {
            Client var3 = Class182.field2334;
            int var4 = field792 ? 2 : 1;
            Class41.method700(var3, "resize", new Object[]{var4});
         } catch (Throwable var5) {
            ;
         }
      }

   }

   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   final void method1146() {
      if (field683 != -1) {
         Class21.method270(field683);
      }

      int var1;
      for(var1 = 0; var1 < field603; ++var1) {
         if (field697[var1]) {
            field788[var1] = true;
         }

         field723[var1] = field697[var1];
         field697[var1] = false;
      }

      field830 = field591;
      field729 = -1;
      field730 = -1;
      Class132.field1819 = null;
      if (field683 != -1) {
         field603 = 0;
         Class35.method630(field683, 0, 0, Class82.field1179, Class243.field3138, 0, 0, -1);
      }

      Class314.method5719();
      if (!field716) {
         if (field729 != -1) {
            Class51.method997(field729, field730);
         }
      } else {
         Class83.method1940();
      }

      if (field790 == 3) {
         for(var1 = 0; var1 < field603; ++var1) {
            if (field723[var1]) {
               Class314.method5727(field786[var1], field787[var1], field641[var1], field789[var1], 16711935, 128);
            } else if (field788[var1]) {
               Class314.method5727(field786[var1], field787[var1], field641[var1], field789[var1], 16711680, 128);
            }
         }
      }

      var1 = Class13.field82;
      int var2 = Class138.field1876.field931;
      int var3 = Class138.field1876.field881;
      int var4 = field700;

      for(Class68 var5 = (Class68)Class68.field985.method4098(); var5 != null; var5 = (Class68)Class68.field985.method4079()) {
         if (var5.field987 != -1 || var5.field986 != null) {
            int var6 = 0;
            if (var2 > var5.field984) {
               var6 += var2 - var5.field984;
            } else if (var2 < var5.field988) {
               var6 += var5.field988 - var2;
            }

            if (var3 > var5.field992) {
               var6 += var3 - var5.field992;
            } else if (var3 < var5.field983) {
               var6 += var5.field983 - var3;
            }

            if (var6 - 64 <= var5.field991 && field815 != 0 && var1 == var5.field981) {
               var6 -= 64;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = (var5.field991 - var6) * field815 / var5.field991;
               Object var10000;
               if (var5.field993 == null) {
                  if (var5.field987 >= 0) {
                     var10000 = null;
                     Class91 var8 = Class91.method2071(Class135.field1852, var5.field987, 0);
                     if (var8 != null) {
                        Class93 var9 = var8.method2069().method2115(Class61.field577);
                        Class103 var10 = Class103.method2287(var9, 100, var7);
                        var10.method2258(-1);
                        Class36.field310.method2032(var10);
                        var5.field993 = var10;
                     }
                  }
               } else {
                  var5.field993.method2267(var7);
               }

               if (var5.field980 == null) {
                  if (var5.field986 != null && (var5.field990 -= var4) <= 0) {
                     int var12 = (int)(Math.random() * (double)var5.field986.length);
                     var10000 = null;
                     Class91 var13 = Class91.method2071(Class135.field1852, var5.field986[var12], 0);
                     if (var13 != null) {
                        Class93 var14 = var13.method2069().method2115(Class61.field577);
                        Class103 var11 = Class103.method2287(var14, 100, var7);
                        var11.method2258(0);
                        Class36.field310.method2032(var11);
                        var5.field980 = var11;
                        var5.field990 = var5.field989 + (int)(Math.random() * (double)(var5.field982 - var5.field989));
                     }
                  }
               } else {
                  var5.field980.method2267(var7);
                  if (!var5.field980.method4065()) {
                     var5.field980 = null;
                  }
               }
            } else {
               if (var5.field993 != null) {
                  Class36.field310.method2009(var5.field993);
                  var5.field993 = null;
               }

               if (var5.field980 != null) {
                  Class36.field310.method2009(var5.field980);
                  var5.field980 = null;
               }
            }
         }
      }

      field700 = 0;
   }

   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      signature = "(Lcf;B)Z",
      garbageValue = "115"
   )
   final boolean processPackets(NetWriter var1) {
      Class157 var2 = var1.method1983();
      Class189 var3 = var1.field1219;
      if (var2 == null) {
         return false;
      } else {
         String var5;
         int var6;
         try {
            if (var1.recievedPacket == null) {
               if (var1.field1222) {
                  if (!var2.vmethod3350(1)) {
                     return false;
                  }

                  var2.vmethod3351(var1.field1219.payload, 0, 1);
                  var1.field1228 = 0;
                  var1.field1222 = false;
               }

               var3.field2339 = 0;
               if (var3.method3821()) {
                  if (!var2.vmethod3350(1)) {
                     return false;
                  }

                  var2.vmethod3351(var1.field1219.payload, 1, 1);
                  var1.field1228 = 0;
               }

               var1.field1222 = true;
               ServerPackets[] var4 = getServerPackets();
               var6 = var3.method3841();
               if (var6 < 0 || var6 >= var4.length) {
                  throw new IOException(var6 + " " + var3.field2339);
               }

               var1.recievedPacket = var4[var6];
               var1.packetSize = var1.recievedPacket.packetSize;
            }

            if (var1.packetSize == -1) {
               if (!var2.vmethod3350(1)) {
                  return false;
               }

               var1.method1983().vmethod3351(var3.payload, 0, 1);
               var1.packetSize = var3.payload[0] & 255;
            }

            if (var1.packetSize == -2) {
               if (!var2.vmethod3350(2)) {
                  return false;
               }

               var1.method1983().vmethod3351(var3.payload, 0, 2);
               var3.field2339 = 0;
               var1.packetSize = var3.readUnsignedShort();
            }

            if (!var2.vmethod3350(var1.packetSize)) {
               return false;
            }

            var3.field2339 = 0;
            var2.vmethod3351(var3.payload, 0, var1.packetSize);
            var1.field1228 = 0;
            field804.method5244();
            var1.field1227 = var1.field1226;
            var1.field1226 = var1.field1215;
            var1.field1215 = var1.recievedPacket;
            long var7;
            long var10;
            int var13;
            int var15;
            String var17;
            int var18;
            long var20;
            String var49;
            
            if(DISPLAY_RECIEVED_PACKETS)
            {
            	System.out.println("Recieved packet: " + var1.recievedPacket.packetId);
            }
            
            if (ServerPackets.field2131 == var1.recievedPacket) {
               var49 = var3.method3738();
               var20 = (long)var3.readUnsignedShort();
               var7 = (long)var3.method3552();
               Class242 var58 = (Class242)Class76.method1803(Class20.method216(), var3.readUnsignedByte());
               var10 = (var20 << 32) + var7;
               boolean var60 = false;

               for(var13 = 0; var13 < 100; ++var13) {
                  if (var10 == field797[var13]) {
                     var60 = true;
                     break;
                  }
               }

               if (Class181.field2332.method1630(new Class291(var49, Class36.field306))) {
                  var60 = true;
               }

               if (!var60 && field694 == 0) {
                  field797[field798] = var10;
                  field798 = (field798 + 1) % 100;

                  String var14;
                  try {
                     var15 = var3.readSmart();
                     if (var15 > 32767) {
                        var15 = 32767;
                     }

                     byte[] var62 = new byte[var15];
                     var3.field2339 += Class300.field3712.method3480(var3.payload, var3.field2339, var62, 0, var15);
                     var17 = Class78.method1831(var62, 0, var15);
                     var14 = var17;
                  } catch (Exception var46) {
                     var14 = "Cabbage";
                  }

                  var14 = Class299.method5521(Class51.method998(var14));
                  byte var61;
                  if (var58.field3126) {
                     var61 = 7;
                  } else {
                     var61 = 3;
                  }

                  if (var58.field3128 != -1) {
                     var18 = var58.field3128;
                     var17 = "<img=" + var18 + ">";
                     Class143.method3172(var61, var17 + var49, var14);
                  } else {
                     Class143.method3172(var61, var49, var14);
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            boolean var64;
            if (ServerPackets.field2103 == var1.recievedPacket) {
               var64 = var3.method3555();
               if (var64) {
                  if (Class21.field175 == null) {
                     Class21.field175 = new Class251();
                  }
               } else {
                  Class21.field175 = null;
               }

               var1.recievedPacket = null;
               return true;
            }

            int var8;
            int var25;
            int var26;
            int var27;
            long var28;
            if (ServerPackets.field2084 == var1.recievedPacket) {
               var25 = var3.method3613();
               if (var25 == 65535) {
                  var25 = -1;
               }

               var26 = var3.method3609();
               var6 = var3.method3770();
               var27 = var3.method3646();
               if (var27 == 65535) {
                  var27 = -1;
               }

               for(var8 = var25; var8 <= var27; ++var8) {
                  var28 = ((long)var26 << 32) + (long)var8;
                  Class204 var59 = field783.method4020(var28);
                  if (var59 != null) {
                     var59.method4064();
                  }

                  field783.method4016(new Class211(var6), var28);
               }

               var1.recievedPacket = null;
               return true;
            }

            Class230 var30;
            int var31;
            if (ServerPackets.field2071 == var1.recievedPacket) {
               var25 = var3.method3671();
               var26 = var3.readUnsignedShort();
               if (var25 < -70000) {
                  var26 += 32768;
               }

               if (var25 >= 0) {
                  var30 = Class26.method434(var25);
               } else {
                  var30 = null;
               }

               for(; var3.field2339 < var1.packetSize; Class10.method96(var26, var27, var8 - 1, var31)) {
                  var27 = var3.readSmart();
                  var8 = var3.readUnsignedShort();
                  var31 = 0;
                  if (var8 != 0) {
                     var31 = var3.readUnsignedByte();
                     if (var31 == 255) {
                        var31 = var3.method3671();
                     }
                  }

                  if (var30 != null && var27 >= 0 && var27 < var30.field2724.length) {
                     var30.field2724[var27] = var8;
                     var30.field2725[var27] = var31;
                  }
               }

               if (var30 != null) {
                  Class60.method1114(var30);
               }

               Class295.method5501();
               field766[++field767 - 1 & 31] = var26 & 32767;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2108 == var1.recievedPacket) {
               Class226.field2568 = var3.readUnsignedByte();
               Class57.field524 = var3.method3577();

               while(var3.field2339 < var1.packetSize) {
                  var25 = var3.readUnsignedByte();
                  Class171[] var56 = new Class171[]{Class171.field2249, Class171.field2242, Class171.field2244, Class171.field2243, Class171.field2245, Class171.field2246, Class171.field2241, Class171.field2248, Class171.field2247, Class171.field2250};
                  Class171 var70 = var56[var25];
                  Class29.method479(var70);
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2117 == var1.recievedPacket) {
               Class97.method2213();
               var1.recievedPacket = null;
               return false;
            }

            if (ServerPackets.field2100 == var1.recievedPacket) {
               var25 = var3.method3770();
               var26 = var3.method3613();
               var30 = Class26.method434(var25);
               if (var30.field2665 != 2 || var26 != var30.field2593) {
                  var30.field2665 = 2;
                  var30.field2593 = var26;
                  Class60.method1114(var30);
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2085 == var1.recievedPacket) {
               Class51.method994(false, var1.field1219);
               var1.recievedPacket = null;
               return true;
            }

            boolean var71;
            if (ServerPackets.field2116 == var1.recievedPacket) {
               var25 = var3.method3609();
               var71 = var3.readReverseUnsignedByte() == 1;
               var30 = Class26.method434(var25);
               if (var71 != var30.field2625) {
                  var30.field2625 = var71;
                  Class60.method1114(var30);
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.cs2ScriptPacket == var1.recievedPacket) {
               var49 = var3.method3738();
               Object[] var55 = new Object[var49.length() + 1];

               for(var6 = var49.length() - 1; var6 >= 0; --var6) {
                  if (var49.charAt(var6) == 's') {
                     var55[var6 + 1] = var3.method3738();
                  } else {
                     var55[var6 + 1] = new Integer(var3.method3671());
                  }
               }

				String output = "sendCS2Script("+ var55[0] + ", ";

				for(int i = var55.length-1; i >= 1; i--)
				{
					output += var55[i];

					if(i != 1)
						output+=", ";
				}

				output+=").";
               
				print(output);
				
               var55[0] = new Integer(var3.method3671());
               Class56 var69 = new Class56();
               var69.field512 = var55;
               Class68.method1696(var69);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2110 == var1.recievedPacket) {
               Class51.method994(true, var1.field1219);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2121 == var1.recievedPacket) {
               for(var25 = 0; var25 < Class254.field3232; ++var25) {
                  Class254 var54 = Class63.method1549(var25);
                  if (var54 != null) {
                     Class225.field2559[var25] = 0;
                     Class225.clientVarps[var25] = 0;
                  }
               }

               Class295.method5501();
               field765 += 32;
               var1.recievedPacket = null;
               return true;
            }

            long var32;
            int var35;
            if (ServerPackets.field2114 == var1.recievedPacket) {
               var49 = var3.method3738();
               var20 = var3.method3554();
               var7 = (long)var3.readUnsignedShort();
               var28 = (long)var3.method3552();
               Class242 var11 = (Class242)Class76.method1803(Class20.method216(), var3.readUnsignedByte());
               var32 = var28 + (var7 << 32);
               boolean var68 = false;

               for(var15 = 0; var15 < 100; ++var15) {
                  if (var32 == field797[var15]) {
                     var68 = true;
                     break;
                  }
               }

               if (var11.field3127 && Class181.field2332.method1630(new Class291(var49, Class36.field306))) {
                  var68 = true;
               }

               if (!var68 && field694 == 0) {
                  field797[field798] = var32;
                  field798 = (field798 + 1) % 100;

                  String var16;
                  try {
                     var35 = var3.readSmart();
                     if (var35 > 32767) {
                        var35 = 32767;
                     }

                     byte[] var36 = new byte[var35];
                     var3.field2339 += Class300.field3712.method3480(var3.payload, var3.field2339, var36, 0, var35);
                     String var19 = Class78.method1831(var36, 0, var35);
                     var16 = var19;
                  } catch (Exception var45) {
                     var16 = "Cabbage";
                  }

                  var16 = Class299.method5521(Class51.method998(var16));
                  if (var11.field3128 != -1) {
                     var18 = var11.field3128;
                     var17 = "<img=" + var18 + ">";
                     Class173.method3472(9, var17 + var49, var16, Class172.method3457(var20));
                  } else {
                     Class173.method3472(9, var49, var16, Class172.method3457(var20));
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2052 == var1.recievedPacket) {
               field810 = var3.readUnsignedByte();
               var1.recievedPacket = null;
               return true;
            }

            String var65;
            String var74;
            if (ServerPackets.field2111 == var1.recievedPacket) {
               var25 = var3.readSmart();
               var71 = var3.readUnsignedByte() == 1;
               var65 = "";
               boolean var67 = false;
               if (var71) {
                  var65 = var3.method3738();
                  if (Class181.field2332.method1630(new Class291(var65, Class36.field306))) {
                     var67 = true;
                  }
               }

               var74 = var3.method3738();
               if (!var67) {
                  Class143.method3172(var25, var65, var74);
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2126 == var1.recievedPacket) {
               var25 = var3.readUnsignedShort();
               var26 = var3.readUnsignedByte();
               var6 = var3.readUnsignedShort();
               if (field814 != 0 && var26 != 0 && field656 < 50) {
                  field817[field656] = var25;
                  field676[field656] = var26;
                  field819[field656] = var6;
                  field719[field656] = null;
                  field820[field656] = 0;
                  ++field656;
               }

               var1.recievedPacket = null;
               return true;
            }

            int var38;
            if (ServerPackets.field2097 == var1.recievedPacket) {
               field822 = true;
               Class50.field456 = var3.readUnsignedByte();
               Class237.field3082 = var3.readUnsignedByte();
               Class11.field68 = var3.readUnsignedShort();
               Class72.field1033 = var3.readUnsignedByte();
               Class133.field1834 = var3.readUnsignedByte();
               if (Class133.field1834 >= 100) {
                  var25 = Class50.field456 * 128 + 64;
                  var26 = Class237.field3082 * 128 + 64;
                  var6 = Class27.method460(var25, var26, Class13.field82) - Class11.field68;
                  var27 = var25 - Class109.field1431;
                  var8 = var6 - Class123.field1702;
                  var31 = var26 - Class226.field2563;
                  var38 = (int)Math.sqrt((double)(var31 * var31 + var27 * var27));
                  Class7.field41 = (int)(Math.atan2((double)var8, (double)var38) * 325.949D) & 2047;
                  Class85.field1201 = (int)(Math.atan2((double)var27, (double)var31) * -325.949D) & 2047;
                  if (Class7.field41 < 128) {
                     Class7.field41 = 128;
                  }

                  if (Class7.field41 > 383) {
                     Class7.field41 = 383;
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2066 == var1.recievedPacket) {
               Class29.method479(Class171.field2242);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.playerUpdating == var1.recievedPacket) {
               Class216.method4179(var3, var1.packetSize);
               Class97.method2215();
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2061 == var1.recievedPacket) {
               Class29.method479(Class171.field2248);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2056 == var1.recievedPacket) {
               Class57.field524 = var3.method3765();
               Class226.field2568 = var3.method3577();

               for(var25 = Class57.field524; var25 < Class57.field524 + 8; ++var25) {
                  for(var26 = Class226.field2568; var26 < Class226.field2568 + 8; ++var26) {
                     if (field708[Class13.field82][var25][var26] != null) {
                        field708[Class13.field82][var25][var26] = null;
                        Class253.method4808(var25, var26);
                     }
                  }
               }

               for(Class62 var51 = (Class62)field714.method4098(); var51 != null; var51 = (Class62)field714.method4079()) {
                  if (var51.field857 >= Class57.field524 && var51.field857 < Class57.field524 + 8 && var51.field858 >= Class226.field2568 && var51.field858 < Class226.field2568 + 8 && var51.field861 == Class13.field82) {
                     var51.field860 = 0;
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2049 == var1.recievedPacket) {
               Class29.method479(Class171.field2249);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2118 == var1.recievedPacket) {
               var25 = var3.readUnsignedByte();
               var26 = var3.readUnsignedByte();
               var6 = var3.readUnsignedByte();
               var27 = var3.readUnsignedByte();
               field823[var25] = true;
               field824[var25] = var26;
               field825[var25] = var6;
               field826[var25] = var27;
               field705[var25] = 0;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2069 == var1.recievedPacket) {
               var25 = var3.method3765();
               var26 = var3.readReverseUnsignedByte();
               var65 = var3.method3738();
               if (var26 >= 1 && var26 <= 8) {
                  if (var65.equalsIgnoreCase("null")) {
                     var65 = null;
                  }

                  field704[var26 - 1] = var65;
                  field709[var26 - 1] = var25 == 0;
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2105 == var1.recievedPacket) {
               Class29.method479(Class171.field2244);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2092 == var1.recievedPacket) {
               Class29.method479(Class171.field2250);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2075 == var1.recievedPacket) {
               field808 = var3.readUnsignedByte();
               if (field808 == 255) {
                  field808 = 0;
               }

               field809 = var3.readUnsignedByte();
               if (field809 == 255) {
                  field809 = 0;
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2122 == var1.recievedPacket) {
               var25 = var3.method3671();
               var26 = var3.readUnsignedShort();
               if (var25 < -70000) {
                  var26 += 32768;
               }

               if (var25 >= 0) {
                  var30 = Class26.method434(var25);
               } else {
                  var30 = null;
               }

               if (var30 != null) {
                  for(var27 = 0; var27 < var30.field2724.length; ++var27) {
                     var30.field2724[var27] = 0;
                     var30.field2725[var27] = 0;
                  }
               }

               Class121.method2782(var26);
               var27 = var3.readUnsignedShort();

               for(var8 = 0; var8 < var27; ++var8) {
                  var31 = var3.readUnsignedByte();
                  if (var31 == 255) {
                     var31 = var3.method3609();
                  }

                  var38 = var3.readUnsignedShort();
                  if (var30 != null && var8 < var30.field2724.length) {
                     var30.field2724[var8] = var38;
                     var30.field2725[var8] = var31;
                  }

                  Class10.method96(var26, var8, var38 - 1, var31);
               }

               if (var30 != null) {
                  Class60.method1114(var30);
               }

               Class295.method5501();
               field766[++field767 - 1 & 31] = var26 & 32767;
               var1.recievedPacket = null;
               return true;
            }

            Class230 var73;
            if (ServerPackets.field2101 == var1.recievedPacket) {
               var25 = var3.method3770();
               var26 = var3.readUnsignedShort();
               var6 = var3.method3646();
               var27 = var3.readUShort();
               var73 = Class26.method434(var25);
               if (var27 != var73.field2656 || var26 != var73.field2657 || var6 != var73.field2704) {
                  var73.field2656 = var27;
                  var73.field2657 = var26;
                  var73.field2704 = var6;
                  Class60.method1114(var73);
               }

               var1.recievedPacket = null;
               return true;
            }

            Class230 var77;
            if (ServerPackets.field2090 == var1.recievedPacket) {
               var25 = var3.method3551();
               var26 = var3.readInt();
               var6 = var3.method3533();
               var77 = Class26.method434(var26);
               if (var6 != var77.field2607 || var25 != var77.field2615 || var77.field2610 != 0 || var77.field2611 != 0) {
                  var77.field2607 = var6;
                  var77.field2615 = var25;
                  var77.field2610 = 0;
                  var77.field2611 = 0;
                  Class60.method1114(var77);
                  this.method1152(var77);
                  if (var77.field2721 == 0) {
                     Class163.method3388(Class42.field366[var26 >> 16], var77, false);
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2112 == var1.recievedPacket) {
               var3.field2339 += 28;
               if (var3.method3756()) {
                  Class175.method3487(var3, var3.field2339 - 28);
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2054 == var1.recievedPacket) {
               field598 = var3.readUShort() * 30;
               field775 = field801;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2094 == var1.recievedPacket) {
               var25 = var3.method3613();
               if (var25 == 65535) {
                  var25 = -1;
               }

               var26 = var3.method3671();
               var6 = var3.readInt();
               var77 = Class26.method434(var26);
               Class269 var76;
               if (!var77.field2604) {
                  if (var25 == -1) {
                     var77.field2665 = 0;
                     var1.recievedPacket = null;
                     return true;
                  }

                  var76 = Class111.method2563(var25);
                  var77.field2665 = 4;
                  var77.field2593 = var25;
                  var77.field2656 = var76.field3439;
                  var77.field2657 = var76.field3440;
                  var77.field2704 = var76.field3438 * 100 / var6;
                  Class60.method1114(var77);
               } else {
                  var77.field2649 = var25;
                  var77.field2727 = var6;
                  var76 = Class111.method2563(var25);
                  var77.field2656 = var76.field3439;
                  var77.field2657 = var76.field3440;
                  var77.field2658 = var76.field3474;
                  var77.field2592 = var76.field3442;
                  var77.field2655 = var76.field3443;
                  var77.field2704 = var76.field3438;
                  if (var76.field3444 == 1) {
                     var77.field2664 = 1;
                  } else {
                     var77.field2664 = 2;
                  }

                  if (var77.field2660 > 0) {
                     var77.field2704 = var77.field2704 * 32 / var77.field2660;
                  } else if (var77.field2616 > 0) {
                     var77.field2704 = var77.field2704 * 32 / var77.field2616;
                  }

                  Class60.method1114(var77);
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2058 == var1.recievedPacket) {
               Class143.field1899 = Class189.method3847(var3.readUnsignedByte());
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2104 == var1.recievedPacket) {
               var25 = var3.readUnsignedByte();
               Class132.method3096(var25);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2083 == var1.recievedPacket) {
               Class245.method4619(true, var3);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2073 == var1.recievedPacket) {
               field822 = true;
               Class24.field203 = var3.readUnsignedByte();
               Class150.field1928 = var3.readUnsignedByte();
               Class224.field2555 = var3.readUnsignedShort();
               Class245.field3154 = var3.readUnsignedByte();
               Class84.field1197 = var3.readUnsignedByte();
               if (Class84.field1197 >= 100) {
                  Class109.field1431 = Class24.field203 * 128 + 64;
                  Class226.field2563 = Class150.field1928 * 128 + 64;
                  Class123.field1702 = Class27.method460(Class109.field1431, Class226.field2563, Class13.field82) - Class224.field2555;
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2074 == var1.recievedPacket) {
               var25 = var3.method3671();
               if (var25 != field853) {
                  field853 = var25;
                  if (field655 == 1) {
                     field663 = true;
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2109 == var1.recievedPacket) {
               field599 = var3.readUnsignedByte();
               if (field599 == 1) {
                  field600 = var3.readUnsignedShort();
               }

               if (field599 >= 2 && field599 <= 6) {
                  if (field599 == 2) {
                     field605 = 64;
                     field637 = 64;
                  }

                  if (field599 == 3) {
                     field605 = 0;
                     field637 = 64;
                  }

                  if (field599 == 4) {
                     field605 = 128;
                     field637 = 64;
                  }

                  if (field599 == 5) {
                     field605 = 64;
                     field637 = 0;
                  }

                  if (field599 == 6) {
                     field605 = 64;
                     field637 = 128;
                  }

                  field599 = 2;
                  field602 = var3.readUnsignedShort();
                  field818 = var3.readUnsignedShort();
                  field604 = var3.readUnsignedByte();
               }

               if (field599 == 10) {
                  field579 = var3.readUnsignedShort();
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2055 == var1.recievedPacket) {
               Class17.method172(var3, var1.packetSize);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2086 == var1.recievedPacket) {
               var25 = var3.method3671();
               var5 = var3.method3738();
               var30 = Class26.method434(var25);
               if (!var5.equals(var30.field2667)) {
                  var30.field2667 = var5;
                  Class60.method1114(var30);
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.largeVarp == var1.recievedPacket) {
               var25 = var3.readInt();
               var26 = var3.readUShort();
               
               if(DISPLAY_PACKET_METHODS)
               {
            	   print("setVarp("+var26+", " + var25 + ").");
               }
               
               Class225.field2559[var26] = var25;
               if (Class225.clientVarps[var26] != var25) {
                  Class225.clientVarps[var26] = var25;
               }

               Class45.method749(var26);
               field764[++field765 - 1 & 31] = var26;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2107 == var1.recievedPacket) {
               var25 = var3.readUnsignedShort();
               field683 = var25;
               this.method1151(false);
               Class216.method4178(var25);
               Class135.method3114(field683);

               for(var26 = 0; var26 < 100; ++var26) {
                  field697[var26] = true;
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2060 == var1.recievedPacket) {
               var25 = var3.method3671();
               Class55 var53 = (Class55)field741.method4020((long)var25);
               if (var53 != null) {
                  Class20.method261(var53, true);
               }

               if (field744 != null) {
                  Class60.method1114(field744);
                  field744 = null;
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2106 == var1.recievedPacket) {
               if (Class14.field94 != null) {
                  Class14.field94.method5489(var3);
               }

               Class1.method13();
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2129 == var1.recievedPacket) {
               var25 = var3.method3588();
               var26 = var3.method3609();
               var30 = Class26.method434(var26);
               if (var25 != var30.field2595 || var25 == -1) {
                  var30.field2595 = var25;
                  var30.field2728 = 0;
                  var30.field2613 = 0;
                  Class60.method1114(var30);
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2072 == var1.recievedPacket) {
               for(var25 = 0; var25 < field610.length; ++var25) {
                  if (field610[var25] != null) {
                     field610[var25].field903 = -1;
                  }
               }

               for(var25 = 0; var25 < field843.length; ++var25) {
                  if (field843[var25] != null) {
                     field843[var25].field903 = -1;
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2123 == var1.recievedPacket) {
               Class181.field2332.method1625();
               field647 = field801;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2059 == var1.recievedPacket) {
               Class295.method5501();
               var25 = var3.method3770();
               var26 = var3.method3577();
               var6 = var3.readReverseUnsignedByte();
               field640[var26] = var25;
               field712[var26] = var6;
               field713[var26] = 1;

               for(var27 = 0; var27 < 98; ++var27) {
                  if (var25 >= Class234.field2779[var27]) {
                     field713[var26] = var27 + 2;
                  }
               }

               field690[++field769 - 1 & 31] = var26;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2089 == var1.recievedPacket) {
               var25 = var3.method3671();
               var26 = var3.method3671();
               var6 = Class37.method661();
               Class172 var80 = Class26.method433(ClientPackets.field2176, field626.field1218);
               var80.field2257.method3574(Class47.field393);
               var80.field2257.method3673(var25);
               var80.field2257.method3673(var26);
               var80.field2257.method3574(var6);
               field626.method1980(var80);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2102 == var1.recievedPacket) {
               Class295.method5501();
               field782 = var3.method3551();
               field775 = field801;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2076 == var1.recievedPacket) {
               if (field683 != -1) {
                  var25 = field683;
                  if (Class261.method4931(var25)) {
                     Class83.method1923(Class42.field366[var25], 0);
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2120 == var1.recievedPacket) {
               Class181.field2332.method1679(var3, var1.packetSize);
               field647 = field801;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2119 == var1.recievedPacket) {
               Class29.method479(Class171.field2247);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2125 == var1.recievedPacket) {
               Class29.method479(Class171.field2243);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2113 == var1.recievedPacket) {
               if (var1.packetSize == 0) {
                  Class14.field94 = null;
               } else {
                  if (Class14.field94 == null) {
                     Class14.field94 = new Class293(Class36.field306, Class182.field2334);
                  }

                  Class14.field94.method5463(var3);
               }

               Class1.method13();
               var1.recievedPacket = null;
               return true;
            }

            String var9;
            int var34;
            if (ServerPackets.field2115 == var1.recievedPacket) {
               var49 = var3.method3738();
               Class163.field2013 = var49;

               try {
                  var5 = Class182.field2334.getParameter(Class279.field3596.field3591);
                  var65 = Class182.field2334.getParameter(Class279.field3581.field3591);
                  String var78 = var5 + "settings=" + var49 + "; version=1; path=/; domain=" + var65;
                  if (var49.length() == 0) {
                     var78 = var78 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                  } else {
                     var74 = var78 + "; Expires=";
                     var10 = Class182.method3547() + 94608000000L;
                     Class192.field2389.setTime(new Date(var10));
                     int var12 = Class192.field2389.get(7);
                     var13 = Class192.field2389.get(5);
                     var34 = Class192.field2389.get(2);
                     var15 = Class192.field2389.get(1);
                     int var24 = Class192.field2389.get(11);
                     var35 = Class192.field2389.get(12);
                     var18 = Class192.field2389.get(13);
                     var9 = Class192.field2390[var12 - 1] + ", " + var13 / 10 + var13 % 10 + "-" + Class192.field2392[0][var34] + "-" + var15 + " " + var24 / 10 + var24 % 10 + ":" + var35 / 10 + var35 % 10 + ":" + var18 / 10 + var18 % 10 + " GMT";
                     var78 = var74 + var9 + "; Max-Age=" + 94608000L;
                  }

                  Client var75 = Class182.field2334;
                  var9 = "document.cookie=\"" + var78 + "\"";
                  JSObject.getWindow(var75).eval(var9);
               } catch (Throwable var44) {
                  ;
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2080 == var1.recievedPacket) {
               var25 = var3.readUnsignedByte();
               if (var3.readUnsignedByte() == 0) {
                  field844[var25] = new Class4();
                  var3.field2339 += 18;
               } else {
                  --var3.field2339;
                  field844[var25] = new Class4(var3, false);
               }

               field793 = field801;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2050 == var1.recievedPacket) {
               Class29.method479(Class171.field2245);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2095 == var1.recievedPacket) {
               Class295.method5501();
               field745 = var3.readUnsignedByte();
               field775 = field801;
               var1.recievedPacket = null;
               return true;
            }

            Class230 var52;
            if (ServerPackets.field2088 == var1.recievedPacket) {
               var25 = var3.readInt();
               var52 = Class26.method434(var25);

               for(var6 = 0; var6 < var52.field2724.length; ++var6) {
                  var52.field2724[var6] = -1;
                  var52.field2724[var6] = 0;
               }

               Class60.method1114(var52);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2068 == var1.recievedPacket) {
               Class226.field2568 = var3.method3577();
               Class57.field524 = var3.method3765();
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2078 == var1.recievedPacket) {
               var25 = var3.method3613();
               if (var25 == 65535) {
                  var25 = -1;
               }

               if (var25 == -1 && !field813) {
                  Class9.method88();
               } else if (var25 != -1 && var25 != field812 && field811 != 0 && !field813) {
                  Class65.method1602(2, Class80.field1147, var25, 0, field811, false);
               }

               field812 = var25;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2051 == var1.recievedPacket) {
               var25 = var3.method3591();
               var26 = var3.readUShort();
               if (var26 == 65535) {
                  var26 = -1;
               }

               Class50.method965(var26, var25);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2082 == var1.recievedPacket) {
               field822 = false;

               for(var25 = 0; var25 < 5; ++var25) {
                  field823[var25] = false;
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2053 == var1.recievedPacket) {
               var25 = var3.method3770();
               var26 = var3.method3646();
               var6 = var26 >> 10 & 31;
               var27 = var26 >> 5 & 31;
               var8 = var26 & 31;
               var31 = (var27 << 11) + (var6 << 19) + (var8 << 3);
               Class230 var79 = Class26.method434(var25);
               if (var31 != var79.field2630) {
                  var79.field2630 = var31;
                  Class60.method1114(var79);
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2124 == var1.recievedPacket) {
               var25 = var3.method3609();
               var52 = Class26.method434(var25);
               var52.field2665 = 3;
               var52.field2593 = Class138.field1876.field546.method4483();
               Class60.method1114(var52);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.npcUpdating == var1.recievedPacket) {
               Class245.method4619(false, var3);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2065 == var1.recievedPacket) {
               Class29.method479(Class171.field2246);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2081 == var1.recievedPacket) {
               Class29.method479(Class171.field2241);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2093 == var1.recievedPacket) {
               field795 = var3.readReverseUnsignedByte();
               field630 = var3.readReverseUnsignedByte();
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2132 == var1.recievedPacket) {
               var64 = var3.readUnsignedByte() == 1;
               if (var64) {
                  Class70.field1013 = Class182.method3547() - var3.method3554();
                  Class19.field154 = new Class1(var3, true);
               } else {
                  Class19.field154 = null;
               }

               field774 = field801;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.smallVarp == var1.recievedPacket) {
               byte var63 = var3.readAByte();
               var26 = var3.readUShort();
               
               if(DISPLAY_PACKET_METHODS)
               {
            	   print("setVarp("+var26+", " + var63 + ").");
               }
               
               Class225.field2559[var26] = var63;
               if (Class225.clientVarps[var26] != var63) {
                  Class225.clientVarps[var26] = var63;
               }

               Class45.method749(var26);
               field764[++field765 - 1 & 31] = var26;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2077 == var1.recievedPacket) {
               var25 = var3.method3613();
               Class177.method3507(var25);
               field766[++field767 - 1 & 31] = var25 & 32767;
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2087 == var1.recievedPacket) {
               var25 = var3.readUnsignedShort();
               var26 = var3.readInt();
               var6 = var3.readUShort();
               var77 = Class26.method434(var26);
               var77.field2732 = var6 + (var25 << 16);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2062 == var1.recievedPacket) {
               Class181.field2332.field975.method5317(var3, var1.packetSize);
               Class47.method910();
               if (Class14.field94 != null) {
                  Class14.field94.method5468();
               }

               field647 = field801;
               var1.recievedPacket = null;
               return true;
            }

            Class55 var39;
            if (ServerPackets.field2063 == var1.recievedPacket) {
               var25 = var3.method3609();
               var26 = var3.method3770();
               Class55 var66 = (Class55)field741.method4020((long)var25);
               var39 = (Class55)field741.method4020((long)var26);
               if (var39 != null) {
                  Class20.method261(var39, var66 == null || var66.field501 != var39.field501);
               }

               if (var66 != null) {
                  var66.method4064();
                  field741.method4016(var66, (long)var26);
               }

               var73 = Class26.method434(var25);
               if (var73 != null) {
                  Class60.method1114(var73);
               }

               var73 = Class26.method434(var26);
               if (var73 != null) {
                  Class60.method1114(var73);
                  Class163.method3388(Class42.field366[var73.field2691 >>> 16], var73, true);
               }

               if (field683 != -1) {
                  var31 = field683;
                  if (Class261.method4931(var31)) {
                     Class83.method1923(Class42.field366[var31], 1);
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2096 == var1.recievedPacket) {
               Class65 var50 = new Class65();
               var50.field950 = var3.method3738();
               var50.field947 = var3.readUnsignedShort();
               var26 = var3.method3671();
               var50.field948 = var26;
               Class48.method947(45);
               var2.vmethod3346();
               var2 = null;
               Class61.method1129(var50);
               var1.recievedPacket = null;
               return false;
            }

            if (ServerPackets.field2057 == var1.recievedPacket) {
               var25 = var3.method3765();
               var26 = var3.readInt();
               var6 = var3.method3613();
               var39 = (Class55)field741.method4020((long)var26);
               if (var39 != null) {
                  Class20.method261(var39, var6 != var39.field501);
               }

               Class55 var72 = new Class55();
               var72.field501 = var6;
               var72.field494 = var25;
               field741.method4016(var72, (long)var26);
               Class216.method4178(var6);
               Class230 var57 = Class26.method434(var26);
               Class60.method1114(var57);
               if (field744 != null) {
                  Class60.method1114(field744);
                  field744 = null;
               }

               Class170.method3448();
               Class163.method3388(Class42.field366[var26 >> 16], var57, false);
               Class135.method3114(var6);
               if (field683 != -1) {
                  var38 = field683;
                  if (Class261.method4931(var38)) {
                     Class83.method1923(Class42.field366[var38], 1);
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2128 == var1.recievedPacket) {
               var25 = var3.method3770();
               var26 = var3.method3613();
               var30 = Class26.method434(var25);
               if (var30 != null && var30.field2721 == 0) {
                  if (var26 > var30.field2629 - var30.field2621) {
                     var26 = var30.field2629 - var30.field2621;
                  }

                  if (var26 < 0) {
                     var26 = 0;
                  }

                  if (var26 != var30.field2663) {
                     var30.field2663 = var26;
                     Class60.method1114(var30);
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2091 == var1.recievedPacket) {
               var49 = var3.method3738();

               try {
                  var27 = var3.readSmart();
                  if (var27 > 32767) {
                     var27 = 32767;
                  }

                  byte[] var37 = new byte[var27];
                  var3.field2339 += Class300.field3712.method3480(var3.payload, var3.field2339, var37, 0, var27);
                  var9 = Class78.method1831(var37, 0, var27);
                  var65 = var9;
               } catch (Exception var43) {
                  var65 = "Cabbage";
               }

               var65 = Class299.method5521(Class51.method998(var65));
               Class143.method3172(6, var49, var65);
               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2079 == var1.recievedPacket) {
               var25 = var3.field2339 + var1.packetSize;
               var26 = var3.readUnsignedShort();
               var6 = var3.readUnsignedShort();
               if (var26 != field683) {
                  field683 = var26;
                  this.method1151(false);
                  Class216.method4178(field683);
                  Class135.method3114(field683);

                  for(var27 = 0; var27 < 100; ++var27) {
                     field697[var27] = true;
                  }
               }

               Class55 var40;
               for(; var6-- > 0; var40.field496 = true) {
                  var27 = var3.method3671();
                  var8 = var3.readUnsignedShort();
                  var31 = var3.readUnsignedByte();
                  var40 = (Class55)field741.method4020((long)var27);
                  if (var40 != null && var8 != var40.field501) {
                     Class20.method261(var40, true);
                     var40 = null;
                  }

                  if (var40 == null) {
                     Class55 var41 = new Class55();
                     var41.field501 = var8;
                     var41.field494 = var31;
                     field741.method4016(var41, (long)var27);
                     Class216.method4178(var8);
                     Class230 var23 = Class26.method434(var27);
                     Class60.method1114(var23);
                     if (field744 != null) {
                        Class60.method1114(field744);
                        field744 = null;
                     }

                     Class170.method3448();
                     Class163.method3388(Class42.field366[var27 >> 16], var23, false);
                     Class135.method3114(var8);
                     if (field683 != -1) {
                        var34 = field683;
                        if (Class261.method4931(var34)) {
                           Class83.method1923(Class42.field366[var34], 1);
                        }
                     }

                     var40 = var41;
                  }
               }

               for(var39 = (Class55)field741.method4018(); var39 != null; var39 = (Class55)field741.method4019()) {
                  if (var39.field496) {
                     var39.field496 = false;
                  } else {
                     Class20.method261(var39, true);
                  }
               }

               field783 = new Class202(512);

               while(var3.field2339 < var25) {
                  var27 = var3.method3671();
                  var8 = var3.readUnsignedShort();
                  var31 = var3.readUnsignedShort();
                  var38 = var3.method3671();

                  for(int var42 = var8; var42 <= var31; ++var42) {
                     var32 = ((long)var27 << 32) + (long)var42;
                     field783.method4016(new Class211(var38), var32);
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2064 == var1.recievedPacket) {
               for(var25 = 0; var25 < Class225.clientVarps.length; ++var25) {
                  if (Class225.clientVarps[var25] != Class225.field2559[var25]) {
                     Class225.clientVarps[var25] = Class225.field2559[var25];
                     Class45.method749(var25);
                     field764[++field765 - 1 & 31] = var25;
                  }
               }

               var1.recievedPacket = null;
               return true;
            }

            if (ServerPackets.field2130 == var1.recievedPacket) {
               var25 = var3.method3770();
               var26 = var3.readUnsignedShort();
               var30 = Class26.method434(var25);
               if (var30.field2665 != 1 || var26 != var30.field2593) {
                  var30.field2665 = 1;
                  var30.field2593 = var26;
                  Class60.method1114(var30);
               }

               var1.recievedPacket = null;
               return true;
            }

            Class5.method65("" + (var1.recievedPacket != null ? var1.recievedPacket.packetId : -1) + "," + (var1.field1226 != null ? var1.field1226.packetId : -1) + "," + (var1.field1227 != null ? var1.field1227.packetId : -1) + "," + var1.packetSize, (Throwable)null);
            Class97.method2213();
         } catch (IOException var47) {
            Class30.method516();
         } catch (Exception var48) {
            var5 = "" + (var1.recievedPacket != null ? var1.recievedPacket.packetId : -1) + "," + (var1.field1226 != null ? var1.field1226.packetId : -1) + "," + (var1.field1227 != null ? var1.field1227.packetId : -1) + "," + var1.packetSize + "," + (Class138.field1876.field922[0] + Class62.field868) + "," + (Class138.field1876.field872[0] + field754) + ",";

            for(var6 = 0; var6 < var1.packetSize && var6 < 50; ++var6) {
               var5 = var5 + var3.payload[var6] + ",";
            }

            Class5.method65(var5, var48);
            Class97.method2213();
         }

         return true;
      }
   }

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "652063494"
   )
   final void method1233() {
      Class134.method3103();
      if (Class276.field3559 == null) {
         if (field583 == null) {
            int var1 = Class48.field431;
            int var2;
            int var4;
            int var5;
            int var6;
            if (field716) {
               int var3;
               if (var1 != 1 && (Class253.field3229 || var1 != 4)) {
                  var2 = Class48.field425;
                  var3 = Class48.field426 * 673804999;
                  if (var2 < Class48.field435 - 10 || var2 > Class135.field1856 + Class48.field435 + 10 || var3 < Class0.field1 - 10 || var3 > Class151.field1933 + Class0.field1 + 10) {
                     field716 = false;
                     Class48.method948(Class48.field435, Class0.field1, Class135.field1856, Class151.field1933);
                  }
               }

               if (var1 == 1 || !Class253.field3229 && var1 == 4) {
                  var2 = Class48.field435;
                  var3 = Class0.field1;
                  var4 = Class135.field1856;
                  var5 = Class48.field432;
                  var6 = Class48.field428;
                  int var7 = -1;

                  for(int var8 = 0; var8 < field771; ++var8) {
                     int var9 = var3 + (field771 - 1 - var8) * 15 + 31;
                     if (var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) {
                        var7 = var8;
                     }
                  }

                  if (var7 != -1) {
                     Class112.method2564(var7);
                  }

                  field716 = false;
                  Class48.method948(Class48.field435, Class0.field1, Class135.field1856, Class151.field1933);
               }
            } else {
               var2 = field771 - 1;
               if ((var1 == 1 || !Class253.field3229 && var1 == 4) && var2 >= 0) {
                  var4 = field720[var2];
                  if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) {
                     var5 = field718[var2];
                     var6 = field851[var2];
                     Class230 var10 = Class26.method434(var6);
                     if (Class7.method83(Class24.method425(var10)) || Class140.method3150(Class24.method425(var10))) {
                        if (Class276.field3559 != null && !field689 && field771 > 0 && !this.method1149()) {
                           Class60.method1120(field678, field821);
                        }

                        field689 = false;
                        field693 = 0;
                        if (Class276.field3559 != null) {
                           Class60.method1114(Class276.field3559);
                        }

                        Class276.field3559 = Class26.method434(var6);
                        field688 = var5;
                        field678 = Class48.field432;
                        field821 = Class48.field428;
                        if (var2 >= 0) {
                           Class229.field2588 = new Class75();
                           Class229.field2588.field1066 = field718[var2];
                           Class229.field2588.field1060 = field851[var2];
                           Class229.field2588.field1061 = field720[var2];
                           Class229.field2588.field1062 = field794[var2];
                           Class229.field2588.field1063 = field735[var2];
                        }

                        Class60.method1114(Class276.field3559);
                        return;
                     }
                  }
               }

               if ((var1 == 1 || !Class253.field3229 && var1 == 4) && this.method1149()) {
                  var1 = 2;
               }

               if ((var1 == 1 || !Class253.field3229 && var1 == 4) && field771 > 0) {
                  Class112.method2564(var2);
               }

               if (var1 == 2 && field771 > 0) {
                  this.method1476(Class48.field432, Class48.field428);
               }
            }

         }
      }
   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "62"
   )
   final boolean method1149() {
      int var1 = field771 - 1;
      return (field715 == 1 && field771 > 2 || Class43.method713(var1)) && !field590[var1];
   }

   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "762160951"
   )
   final void method1476(int var1, int var2) {
      Class184.method3785(var1, var2);
      Class28.field248.method2909(Class13.field82, var1, var2, false);
      field716 = true;
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1642962644"
   )
   final void method1151(boolean var1) {
      Class84.method1946(field683, Class82.field1179, Class243.field3138, var1);
   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      signature = "(Lhi;I)V",
      garbageValue = "-1711634701"
   )
   void method1152(Class230 var1) {
      Class230 var2 = var1.field2605 == -1 ? null : Class26.method434(var1.field2605);
      int var3;
      int var4;
      if (var2 == null) {
         var3 = Class82.field1179;
         var4 = Class243.field3138;
      } else {
         var3 = var2.field2675;
         var4 = var2.field2621;
      }

      Class64.method1563(var1, var3, var4, false);
      Class22.method281(var1, var3, var4);
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-114951756"
   )
   final void method1448() {
      Class60.method1114(field583);
      ++Class6.field39;
      if (field772 && field601) {
         int var1 = Class48.field425;
         int var2 = Class48.field426 * 673804999;
         var1 -= field753;
         var2 -= field749;
         if (var1 < field757) {
            var1 = field757;
         }

         if (var1 + field583.field2675 > field757 + field752.field2675) {
            var1 = field757 + field752.field2675 - field583.field2675;
         }

         if (var2 < field758) {
            var2 = field758;
         }

         if (var2 + field583.field2621 > field758 + field752.field2621) {
            var2 = field758 + field752.field2621 - field583.field2621;
         }

         int var3 = var1 - field696;
         int var4 = var2 - field760;
         int var5 = field583.field2682;
         if (Class6.field39 > field583.field2684 && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            field763 = true;
         }

         int var6 = var1 - field757 + field752.field2626;
         int var7 = var2 - field758 + field752.field2663;
         Class56 var8;
         if (field583.field2695 != null && field763) {
            var8 = new Class56();
            var8.field506 = field583;
            var8.field511 = var6;
            var8.field508 = var7;
            var8.field512 = field583.field2695;
            Class68.method1696(var8);
         }

         if (Class48.field419 == 0) {
            if (field763) {
               if (field583.field2696 != null) {
                  var8 = new Class56();
                  var8.field506 = field583;
                  var8.field511 = var6;
                  var8.field508 = var7;
                  var8.field507 = field755;
                  var8.field512 = field583.field2696;
                  Class68.method1696(var8);
               }

               if (field755 != null) {
                  Class230 var9 = field583;
                  int var10 = Class190.method3865(Class24.method425(var9));
                  Class230 var13;
                  if (var10 == 0) {
                     var13 = null;
                  } else {
                     int var11 = 0;

                     while(true) {
                        if (var11 >= var10) {
                           var13 = var9;
                           break;
                        }

                        var9 = Class26.method434(var9.field2605);
                        if (var9 == null) {
                           var13 = null;
                           break;
                        }

                        ++var11;
                     }
                  }

                  if (var13 != null) {
                     Class172 var12 = Class26.method433(ClientPackets.field2164, field626.field1218);
                     var12.field2257.method3583(field583.field2606);
                     var12.field2257.method3771(field583.field2649);
                     var12.field2257.method3673(field755.field2691);
                     var12.field2257.method3582(field755.field2649);
                     var12.field2257.method3594(field583.field2691);
                     var12.field2257.method3755(field755.field2606);
                     field626.method1980(var12);
                  }
               }
            } else if (this.method1149()) {
               this.method1476(field696 + field753, field749 + field760);
            } else if (field771 > 0) {
               Class60.method1120(field753 + field696, field749 + field760);
            }

            field583 = null;
         }

      } else {
         if (Class6.field39 > 1) {
            field583 = null;
         }

      }
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      signature = "(I)Lkm;",
      garbageValue = "-1900287408"
   )
   public Class291 vmethod5420() {
      return Class138.field1876 != null ? Class138.field1876.field552 : null;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "-1512027623"
   )
   static long method1535() {
      try {
         URL var0 = new URL(Class142.method3161("services", false) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         Class182 var4 = new Class182(new byte[1000]);

         do {
            int var5 = var3.read(var4.payload, var4.field2339, 1000 - var4.field2339);
            if (var5 == -1) {
               var4.field2339 = 0;
               long var7 = var4.method3554();
               return var7;
            }

            var4.field2339 += var5;
         } while(var4.field2339 < 1000);

         return 0L;
      } catch (Exception var9) {
         return 0L;
      }
   }
   
   public ServerPackets[] getServerPackets()
   {
	   return new ServerPackets[]{ServerPackets.field2100, ServerPackets.field2050, ServerPackets.field2051, ServerPackets.cs2ScriptPacket, ServerPackets.field2053, ServerPackets.field2054, ServerPackets.field2055, ServerPackets.field2122, ServerPackets.field2083, ServerPackets.field2065, ServerPackets.field2059, ServerPackets.field2060, ServerPackets.field2061, ServerPackets.field2062, ServerPackets.field2063, ServerPackets.field2106, ServerPackets.field2107, ServerPackets.field2069, ServerPackets.field2128, ServerPackets.field2105, ServerPackets.field2116, ServerPackets.field2111, ServerPackets.field2071, ServerPackets.field2072, ServerPackets.field2114, ServerPackets.field2074, ServerPackets.field2075, ServerPackets.field2058, ServerPackets.field2077, ServerPackets.field2078, ServerPackets.field2131, ServerPackets.field2080, ServerPackets.field2081, ServerPackets.npcUpdating, ServerPackets.field2079, ServerPackets.field2084, ServerPackets.field2085, ServerPackets.field2086, ServerPackets.field2087, ServerPackets.field2088, ServerPackets.field2089, ServerPackets.field2090, ServerPackets.field2091, ServerPackets.field2092, ServerPackets.field2093, ServerPackets.field2076, ServerPackets.field2095, ServerPackets.field2096, ServerPackets.field2097, ServerPackets.smallVarp, ServerPackets.largeVarp, ServerPackets.field2082, ServerPackets.field2101, ServerPackets.field2102, ServerPackets.field2094, ServerPackets.field2104, ServerPackets.playerUpdating, ServerPackets.field2064, ServerPackets.field2119, ServerPackets.field2108, ServerPackets.field2109, ServerPackets.field2049, ServerPackets.field2068, ServerPackets.field2112, ServerPackets.field2113, ServerPackets.field2129, ServerPackets.field2115, ServerPackets.field2073, ServerPackets.field2117, ServerPackets.field2118, ServerPackets.field2124, ServerPackets.field2120, ServerPackets.field2121, ServerPackets.field2103, ServerPackets.field2123, ServerPackets.field2066, ServerPackets.field2125, ServerPackets.field2130, ServerPackets.field2126, ServerPackets.field2057, ServerPackets.field2056, ServerPackets.field2110, ServerPackets.field2052, ServerPackets.field2132};
   }
   
   public void print(String s)
   {
	   System.out.println(s);
   }
}
