import java.util.Comparator;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;
import java.awt.FontMetrics;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("aw")
public class Class29
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Law;")
    public static final Class29 field252;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Law;")
    public static final Class29 field251;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Law;")
    public static final Class29 field257;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Law;")
    public static final Class29 field262;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Law;")
    public static final Class29 field254;
    @ObfuscatedName("ak")
    static FontMetrics field256;
    @ObfuscatedName("ff")
    static byte[][] field253;
    @ObfuscatedName("ic")
    @ObfuscatedSignature(signature = "Lde;")
    static Class111 field250;
    @ObfuscatedName("q")
    public final String field255;
    
    static {
        field252 = new Class29("details");
        field251 = new Class29("compositemap");
        field257 = new Class29("compositetexture");
        field262 = new Class29("area");
        field254 = new Class29("labels");
    }
    
    Class29(final String field255) {
        this.field255 = field255;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1545308790")
    static void method476() {
        try {
            final File file = new File(Class18.field143, "random.dat");
            Label_0171: {
                if (file.exists()) {
                    Class155.field1968 = new Class109(new Class110(file, "rw", 25L), 24, 0);
                }
                else {
                    for (int i = 0; i < Class8.field52.length; ++i) {
                        for (int j = 0; j < Class155.field1965.length; ++j) {
                            final File file2 = new File(Class155.field1965[j] + Class8.field52[i] + File.separatorChar + "random.dat");
                            if (file2.exists()) {
                                Class155.field1968 = new Class109(new Class110(file2, "rw", 25L), 24, 0);
                                break Label_0171;
                            }
                        }
                    }
                }
            }
            if (Class155.field1968 == null) {
                final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                final int read = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(read);
                randomAccessFile.seek(0L);
                randomAccessFile.close();
                Class155.field1968 = new Class109(new Class110(file, "rw", 25L), 24, 0);
            }
        }
        catch (IOException ex) {}
    }
    
    @ObfuscatedName("t")
    @ObfuscatedSignature(signature = "(ILce;ZB)I", garbageValue = "123")
    static int method477(final int n, final Class84 class84, final boolean b) {
        if (n == 3903) {
            Class69.field999[++Class69.field1003 - 1] = Client.field844[Class69.field999[--Class69.field1003]].method39();
            return 1;
        }
        if (n == 3904) {
            Class69.field999[++Class69.field1003 - 1] = Client.field844[Class69.field999[--Class69.field1003]].field29;
            return 1;
        }
        if (n == 3905) {
            Class69.field999[++Class69.field1003 - 1] = Client.field844[Class69.field999[--Class69.field1003]].field30;
            return 1;
        }
        if (n == 3906) {
            Class69.field999[++Class69.field1003 - 1] = Client.field844[Class69.field999[--Class69.field1003]].field33;
            return 1;
        }
        if (n == 3907) {
            Class69.field999[++Class69.field1003 - 1] = Client.field844[Class69.field999[--Class69.field1003]].field32;
            return 1;
        }
        if (n == 3908) {
            Class69.field999[++Class69.field1003 - 1] = Client.field844[Class69.field999[--Class69.field1003]].field28;
            return 1;
        }
        if (n == 3910) {
            Class69.field999[++Class69.field1003 - 1] = ((Client.field844[Class69.field999[--Class69.field1003]].method38() == 0) ? 1 : 0);
            return 1;
        }
        if (n == 3911) {
            Class69.field999[++Class69.field1003 - 1] = ((Client.field844[Class69.field999[--Class69.field1003]].method38() == 2) ? 1 : 0);
            return 1;
        }
        if (n == 3912) {
            Class69.field999[++Class69.field1003 - 1] = ((Client.field844[Class69.field999[--Class69.field1003]].method38() == 5) ? 1 : 0);
            return 1;
        }
        if (n == 3913) {
            Class69.field999[++Class69.field1003 - 1] = ((Client.field844[Class69.field999[--Class69.field1003]].method38() == 1) ? 1 : 0);
            return 1;
        }
        if (n == 3914) {
            final boolean b2 = Class69.field999[--Class69.field1003] == 1;
            if (Class19.field154 != null) {
                Class19.field154.method9(Class1.field11, b2);
            }
            return 1;
        }
        if (n == 3915) {
            final boolean b3 = Class69.field999[--Class69.field1003] == 1;
            if (Class19.field154 != null) {
                Class19.field154.method9(Class1.field13, b3);
            }
            return 1;
        }
        if (n == 3916) {
            Class69.field1003 -= 2;
            final boolean b4 = Class69.field999[Class69.field1003] == 1;
            final boolean field575 = Class69.field999[Class69.field1003 + 1] == 1;
            if (Class19.field154 != null) {
                Client.field665.field575 = field575;
                Class19.field154.method9(Client.field665, b4);
            }
            return 1;
        }
        if (n == 3917) {
            final boolean b5 = Class69.field999[--Class69.field1003] == 1;
            if (Class19.field154 != null) {
                Class19.field154.method9(Class1.field9, b5);
            }
            return 1;
        }
        if (n == 3918) {
            final boolean b6 = Class69.field999[--Class69.field1003] == 1;
            if (Class19.field154 != null) {
                Class19.field154.method9(Class1.field16, b6);
            }
            return 1;
        }
        if (n == 3919) {
            Class69.field999[++Class69.field1003 - 1] = ((Class19.field154 == null) ? 0 : Class19.field154.field10.size());
            return 1;
        }
        if (n == 3920) {
            Class69.field999[++Class69.field1003 - 1] = ((Class2)Class19.field154.field10.get(Class69.field999[--Class69.field1003])).field19;
            return 1;
        }
        if (n == 3921) {
            Class69.field1001[++Class55.field497 - 1] = ((Class2)Class19.field154.field10.get(Class69.field999[--Class69.field1003])).method16();
            return 1;
        }
        if (n == 3922) {
            Class69.field1001[++Class55.field497 - 1] = ((Class2)Class19.field154.field10.get(Class69.field999[--Class69.field1003])).method18();
            return 1;
        }
        if (n == 3923) {
            final long n2 = Class182.method3547() - Class70.field1013 - ((Class2)Class19.field154.field10.get(Class69.field999[--Class69.field1003])).field20;
            final int n3 = (int)(n2 / 3600000L);
            final int n4 = (int)((n2 - n3 * 3600000) / 60000L);
            final int n5 = (int)((n2 - n3 * 3600000 - n4 * 60000) / 1000L);
            Class69.field1001[++Class55.field497 - 1] = n3 + ":" + n4 / 10 + n4 % 10 + ":" + n5 / 10 + n5 % 10;
            return 1;
        }
        if (n == 3924) {
            Class69.field999[++Class69.field1003 - 1] = ((Class2)Class19.field154.field10.get(Class69.field999[--Class69.field1003])).field17.field33;
            return 1;
        }
        if (n == 3925) {
            Class69.field999[++Class69.field1003 - 1] = ((Class2)Class19.field154.field10.get(Class69.field999[--Class69.field1003])).field17.field30;
            return 1;
        }
        if (n == 3926) {
            Class69.field999[++Class69.field1003 - 1] = ((Class2)Class19.field154.field10.get(Class69.field999[--Class69.field1003])).field17.field29;
            return 1;
        }
        return 2;
    }
    
    @ObfuscatedName("fd")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "120")
    static void method478() {
        if (Client.field609 == 0) {
            Class28.field248 = new Class125(4, 104, 104, Class50.field459);
            for (int i = 0; i < 4; ++i) {
                Client.field642[i] = new Class164(104, 104);
            }
            Class72.field1038 = new Class318(512, 512);
            Class78.field1100 = "Starting game engine...";
            Class78.field1099 = 5;
            Client.field609 = 20;
            return;
        }
        if (Client.field609 == 20) {
            final int[] array = new int[9];
            for (int j = 0; j < 9; ++j) {
                final int n = j * 32 + 15 + 128;
                array[j] = Class122.field1681[n] * (n * 3 + 600) >> 16;
            }
            Class125.method2893(array, 500, 800, 512, 334);
            Class78.field1100 = "Prepared visibility map";
            Class78.field1099 = 10;
            Client.field609 = 30;
            return;
        }
        if (Client.field609 == 30) {
            Class77.field1079 = Class53.method1009(0, false, true, true);
            Class37.field326 = Class53.method1009(1, false, true, true);
            Class97.field1329 = Class53.method1009(2, true, false, true);
            Class224.field2548 = Class53.method1009(3, false, true, true);
            Class135.field1852 = Class53.method1009(4, false, true, true);
            Class246.field3159 = Class53.method1009(5, true, true, true);
            Class80.field1147 = Class53.method1009(6, true, true, true);
            Class21.field179 = Class53.method1009(7, false, true, true);
            Class175.field2270 = Class53.method1009(8, false, true, true);
            Class268.field3419 = Class53.method1009(9, false, true, true);
            Class22.field183 = Class53.method1009(10, false, true, true);
            Class61.field576 = Class53.method1009(11, false, true, true);
            Client.field854 = Class53.method1009(12, false, true, true);
            Class50.field461 = Class53.method1009(13, true, false, true);
            Class59.field543 = Class53.method1009(14, false, true, true);
            Class36.field312 = Class53.method1009(15, false, true, true);
            Class24.field207 = Class53.method1009(16, true, true, true);
            Class78.field1100 = "Connecting to update server";
            Class78.field1099 = 20;
            Client.field609 = 40;
            return;
        }
        if (Client.field609 == 40) {
            final int n2 = 0 + Class77.field1079.method4720() * 4 / 100 + Class37.field326.method4720() * 4 / 100 + Class97.field1329.method4720() * 2 / 100 + Class224.field2548.method4720() * 2 / 100 + Class135.field1852.method4720() * 6 / 100 + Class246.field3159.method4720() * 4 / 100 + Class80.field1147.method4720() * 2 / 100 + Class21.field179.method4720() * 58 / 100 + Class175.field2270.method4720() * 2 / 100 + Class268.field3419.method4720() * 2 / 100 + Class22.field183.method4720() * 2 / 100 + Class61.field576.method4720() * 2 / 100 + Client.field854.method4720() * 2 / 100 + Class50.field461.method4720() * 2 / 100 + Class59.field543.method4720() * 2 / 100 + Class36.field312.method4720() * 2 / 100 + Class24.field207.method4720() * 2 / 100;
            if (n2 != 100) {
                if (n2 != 0) {
                    Class78.field1100 = "Checking for updates - " + n2 + "%";
                }
                Class78.field1099 = 30;
                return;
            }
            Class32.method548(Class77.field1079, "Animations");
            Class32.method548(Class37.field326, "Skeletons");
            Class32.method548(Class135.field1852, "Sound FX");
            Class32.method548(Class246.field3159, "Maps");
            Class32.method548(Class80.field1147, "Music Tracks");
            Class32.method548(Class21.field179, "Models");
            Class32.method548(Class175.field2270, "Sprites");
            Class32.method548(Class61.field576, "Music Jingles");
            Class32.method548(Class59.field543, "Music Samples");
            Class32.method548(Class36.field312, "Music Patches");
            Class32.method548(Class24.field207, "World Map");
            Class78.field1100 = "Loaded update list";
            Class78.field1099 = 30;
            Client.field609 = 45;
        }
        else {
            if (Client.field609 == 45) {
                Class68.method1697(22050, !Client.field585, 2);
                final Class218 field2459 = new Class218();
                field2459.method4257(9, 128);
                (Class28.field244 = Class65.method1582(Class47.field392, 0, 22050)).method2143(field2459);
                final Class249 field2460 = Class36.field312;
                final Class249 field2461 = Class59.field543;
                final Class249 field2462 = Class135.field1852;
                Class177.field2284 = field2460;
                Class217.field2464 = field2461;
                Class217.field2458 = field2462;
                Class217.field2459 = field2459;
                Class63.field879 = Class65.method1582(Class47.field392, 1, 2048);
                Class36.field310 = new Class88();
                Class63.field879.method2143(Class36.field310);
                Class61.field577 = new Class102(22050, Class95.field1300);
                Class78.field1100 = "Prepared sound engine";
                Class78.field1099 = 35;
                Client.field609 = 50;
                Class1.field14 = new Class296(Class175.field2270, Class50.field461);
                return;
            }
            if (Client.field609 == 50) {
                final int length = Class295.method5498().length;
                Client.field631 = Class1.field14.method5504(Class295.method5498());
                if (Client.field631.size() < length) {
                    Class78.field1100 = "Loading fonts - " + Client.field631.size() * 100 / length + "%";
                    Class78.field1099 = 40;
                    return;
                }
                Class151.field1936 = (Class298) Client.field631.get(Class295.field3678);
                Class63.field933 = (Class298) Client.field631.get(Class295.field3672);
                Class293.field3660 = (Class298) Client.field631.get(Class295.field3668);
                Class27.field228 = new Class324(true);
                Class78.field1100 = "Loaded fonts";
                Class78.field1099 = 40;
                Client.field609 = 60;
            }
            else if (Client.field609 == 60) {
                final int method4426 = Class224.method4426(Class22.field183, Class175.field2270);
                final int method4427 = Class11.method99();
                if (method4426 < method4427) {
                    Class78.field1100 = "Loading title screen - " + method4426 * 100 / method4427 + "%";
                    Class78.field1099 = 50;
                    return;
                }
                Class78.field1100 = "Loaded title screen";
                Class78.field1099 = 50;
                Class48.method947(5);
                Client.field609 = 70;
            }
            else if (Client.field609 == 70) {
                if (!Class97.field1329.method4629()) {
                    Class78.field1100 = "Loading config - " + Class97.field1329.method4755() + "%";
                    Class78.field1099 = 60;
                    return;
                }
                Class21.method277(Class97.field1329);
                Class58.method1069(Class97.field1329);
                Class257.method4851(Class97.field1329, Class21.field179);
                final Class249 field2463 = Class97.field1329;
                final Class249 field2464 = Class21.field179;
                final boolean field2465 = Client.field585;
                Class268.field3377 = field2463;
                Class130.field1801 = field2464;
                Class268.field3416 = field2465;
                final Class249 field2466 = Class97.field1329;
                final Class249 field2467 = Class21.field179;
                Class271.field3490 = field2466;
                Class271.field3487 = field2467;
                Class7.field42 = Class97.field1329;
                final Class249 field2468 = Class97.field1329;
                final Class249 field2469 = Class21.field179;
                final boolean field2470 = Client.field668;
                final Class298 field2471 = Class151.field1936;
                Class269.field3424 = field2468;
                Class269.field3454 = field2469;
                Class269.field3426 = field2470;
                Class86.field1212 = Class269.field3424.method4636(10);
                Class269.field3466 = field2471;
                final Class249 field2472 = Class97.field1329;
                final Class249 field2473 = Class77.field1079;
                final Class249 field2474 = Class37.field326;
                Class273.field3538 = field2472;
                Class273.field3536 = field2473;
                Class273.field3537 = field2474;
                final Class249 field2475 = Class97.field1329;
                final Class249 field2476 = Class21.field179;
                Class258.field3272 = field2475;
                Class258.field3279 = field2476;
                Class263.field3322 = Class97.field1329;
                Class0.field2 = Class97.field1329;
                Class254.field3232 = Class0.field2.method4636(16);
                Class11.method100(Class224.field2548, Class21.field179, Class175.field2270, Class50.field461);
                Class160.method3344(Class97.field1329);
                Class266.field3338 = Class97.field1329;
                Class129.method3072(Class97.field1329);
                Class257.field3264 = Class97.field1329;
                Class264.field3327 = Class97.field1329;
                Class22.field185 = new Class82();
                Class250.method4766(Class97.field1329, Class175.field2270, Class50.field461);
                Class144.method3181(Class97.field1329, Class175.field2270);
                final Class249 field2477 = Class97.field1329;
                Class255.field3237 = Class175.field2270;
                if (field2477.method4629()) {
                    Class255.field3236 = field2477.method4636(35);
                    Class255.field3246 = new Class255[Class255.field3236];
                    for (int k = 0; k < Class255.field3236; ++k) {
                        final byte[] method4428 = field2477.method4625(35, k);
                        if (method4428 != null) {
                            (Class255.field3246[k] = new Class255(k)).method4816(new Class182(method4428));
                            Class255.field3246[k].method4828();
                        }
                    }
                }
                Class78.field1100 = "Loaded config";
                Class78.field1099 = 60;
                Client.field609 = 80;
            }
            else if (Client.field609 == 80) {
                int n3 = 0;
                if (Class128.field1791 == null) {
                    Class128.field1791 = Class137.method3127(Class175.field2270, "compass", "");
                }
                else {
                    ++n3;
                }
                if (Class136.field1862 == null) {
                    Class136.field1862 = Class137.method3127(Class175.field2270, "mapedge", "");
                }
                else {
                    ++n3;
                }
                if (Class25.field214 == null) {
                    Class25.field214 = Class13.method113(Class175.field2270, "mapscene", "");
                }
                else {
                    ++n3;
                }
                if (Class150.field1919 == null) {
                    Class150.field1919 = Class21.method279(Class175.field2270, "headicons_pk", "");
                }
                else {
                    ++n3;
                }
                if (RunException.field369 == null) {
                    RunException.field369 = Class21.method279(Class175.field2270, "headicons_prayer", "");
                }
                else {
                    ++n3;
                }
                if (Class150.field1926 == null) {
                    Class150.field1926 = Class21.method279(Class175.field2270, "headicons_hint", "");
                }
                else {
                    ++n3;
                }
                if (Class111.field1446 == null) {
                    Class111.field1446 = Class21.method279(Class175.field2270, "mapmarker", "");
                }
                else {
                    ++n3;
                }
                if (Class161.field1997 == null) {
                    Class161.field1997 = Class21.method279(Class175.field2270, "cross", "");
                }
                else {
                    ++n3;
                }
                if (Class36.field314 == null) {
                    Class36.field314 = Class21.method279(Class175.field2270, "mapdots", "");
                }
                else {
                    ++n3;
                }
                if (Class243.field3139 == null) {
                    Class243.field3139 = Class13.method113(Class175.field2270, "scrollbar", "");
                }
                else {
                    ++n3;
                }
                if (Class322.field3881 == null) {
                    Class322.field3881 = Class13.method113(Class175.field2270, "mod_icons", "");
                }
                else {
                    ++n3;
                }
                if (n3 < 11) {
                    Class78.field1100 = "Loading sprites - " + n3 * 100 / 12 + "%";
                    Class78.field1099 = 70;
                    return;
                }
                Class299.field3698 = Class322.field3881;
                Class136.field1862.method5843();
                final int n4 = (int)(Math.random() * 21.0) - 10;
                final int n5 = (int)(Math.random() * 21.0) - 10;
                final int n6 = (int)(Math.random() * 21.0) - 10;
                final int n7 = (int)(Math.random() * 41.0) - 20;
                Class25.field214[0].method5822(n4 + n7, n5 + n7, n6 + n7);
                Class78.field1100 = "Loaded sprites";
                Class78.field1099 = 70;
                Client.field609 = 90;
            }
            else if (Client.field609 == 90) {
                if (!Class268.field3419.method4629()) {
                    Class78.field1100 = "Loading textures - " + "0%";
                    Class78.field1099 = 90;
                    return;
                }
                Class122.method2789(Class29.field250 = new Class111(Class268.field3419, Class175.field2270, 20, 0.8, Client.field585 ? 64 : 128));
                Class122.method2830(0.8);
                Client.field609 = 100;
            }
            else if (Client.field609 == 100) {
                final int method4429 = Class29.field250.method2530();
                if (method4429 < 100) {
                    Class78.field1100 = "Loading textures - " + method4429 + "%";
                    Class78.field1099 = 90;
                    return;
                }
                Class78.field1100 = "Loaded textures";
                Class78.field1099 = 90;
                Client.field609 = 110;
            }
            else {
                if (Client.field609 == 110) {
                    Class26.field220 = new Class57();
                    Class47.field392.method3249(Class26.field220, 10);
                    Class78.field1100 = "Loaded input handler";
                    Class78.field1099 = 92;
                    Client.field609 = 120;
                    return;
                }
                if (Client.field609 == 120) {
                    if (!Class22.field183.method4646("huffman", "")) {
                        Class78.field1100 = "Loading wordpack - " + 0 + "%";
                        Class78.field1099 = 94;
                        return;
                    }
                    Class181.method3529(new Class174(Class22.field183.method4684("huffman", "")));
                    Class78.field1100 = "Loaded wordpack";
                    Class78.field1099 = 94;
                    Client.field609 = 130;
                }
                else if (Client.field609 == 130) {
                    if (!Class224.field2548.method4629()) {
                        Class78.field1100 = "Loading interfaces - " + Class224.field2548.method4755() * 4 / 5 + "%";
                        Class78.field1099 = 96;
                        return;
                    }
                    if (!Client.field854.method4629()) {
                        Class78.field1100 = "Loading interfaces - " + (80 + Client.field854.method4755() / 6) + "%";
                        Class78.field1099 = 96;
                        return;
                    }
                    if (!Class50.field461.method4629()) {
                        Class78.field1100 = "Loading interfaces - " + (96 + Class50.field461.method4755() / 50) + "%";
                        Class78.field1099 = 96;
                        return;
                    }
                    Class78.field1100 = "Loaded interfaces";
                    Class78.field1099 = 98;
                    Client.field609 = 140;
                }
                else if (Client.field609 == 140) {
                    Class78.field1099 = 100;
                    if (!Class24.field207.method4704(Class29.field252.field255)) {
                        Class78.field1100 = "Loading world map - " + Class24.field207.method4687(Class29.field252.field255) / 10 + "%";
                        return;
                    }
                    if (Class53.field476 == null) {
                        (Class53.field476 = new Class321()).method6000(Class24.field207, Class293.field3660, Client.field631, Class25.field214);
                    }
                    final int method4430 = Class53.field476.method6094();
                    if (method4430 < 100) {
                        Class78.field1100 = "Loading world map - " + (method4430 * 9 / 10 + 10) + "%";
                        return;
                    }
                    Class78.field1100 = "Loaded world map";
                    Client.field609 = 150;
                }
                else if (Client.field609 == 150) {
                    Class48.method947(10);
                }
            }
        }
    }
    
    @ObfuscatedName("hk")
    @ObfuscatedSignature(signature = "(Lfl;S)V", garbageValue = "-22268")
    static final void method479(final Class171 class171) {
        final Class189 field1219 = Client.field626.field1219;
        if (Class171.field2246 == class171) {
            final int method3550 = field1219.method3550();
            final int method3551 = field1219.method3551();
            final byte method3552 = field1219.method3681();
            final byte method3553 = field1219.method3660();
            final int n = field1219.method3544() * 4;
            final int method3554 = field1219.method3765();
            final int method3555 = field1219.method3765();
            final int method3556 = field1219.method3765();
            final int n2 = (method3556 >> 4 & 0x7) + Class57.field524;
            final int n3 = (method3556 & 0x7) + Class226.field2568;
            final int method3557 = field1219.method3613();
            final int n4 = field1219.method3577() * 4;
            final int method3558 = field1219.method3550();
            final byte b = (byte)(method3552 + n2);
            final byte b2 = (byte)(method3553 + n3);
            if (n2 >= 0 && n3 >= 0 && n2 < 104 && n3 < 104 && b >= 0 && b2 >= 0 && b < 104 && b2 < 104 && method3557 != 65535) {
                final int n5 = n2 * 128 + 64;
                final int n6 = n3 * 128 + 64;
                final int n7 = b * 128 + 64;
                final int n8 = b2 * 128 + 64;
                final Class79 class172 = new Class79(method3557, Class13.field82, n5, n6, Class27.method460(n5, n6, Class13.field82) - n4, method3558 + Client.field591, method3550 + Client.field591, method3554, method3555, method3551, n);
                class172.method1849(n7, n8, Class27.method460(n7, n8, Class13.field82) - n, method3558 + Client.field591);
                Client.field710.method4073(class172);
            }
            return;
        }
        if (Class171.field2243 == class171) {
            final int method3559 = field1219.method3607();
            final int n9 = (method3559 >> 4 & 0x7) + Class57.field524;
            final int n10 = (method3559 & 0x7) + Class226.field2568;
            final int method3560 = field1219.method3765();
            final int n11 = method3560 >> 2;
            final int n12 = method3560 & 0x3;
            final int n13 = Client.field846[n11];
            final int method3561 = field1219.method3613();
            if (n9 >= 0 && n10 >= 0 && n9 < 104 && n10 < 104) {
                Class241.method4602(Class13.field82, n9, n10, n13, method3561, n11, n12, 0, -1);
            }
            return;
        }
        if (Class171.field2248 == class171) {
            final int method3562 = field1219.method3646();
            final int method3563 = field1219.method3544();
            int n14 = method3563 >> 2;
            final int n15 = method3563 & 0x3;
            final int n16 = Client.field846[n14];
            final int method3564 = field1219.method3544();
            final int n17 = (method3564 >> 4 & 0x7) + Class57.field524;
            final int n18 = (method3564 & 0x7) + Class226.field2568;
            if (n17 >= 0 && n18 >= 0 && n17 < 103 && n18 < 103) {
                if (n16 == 0) {
                    final Class128 method3565 = Class28.field248.method2894(Class13.field82, n17, n18);
                    if (method3565 != null) {
                        final int method3566 = Class39.method673(method3565.field1786);
                        if (n14 == 2) {
                            method3565.field1787 = new Class85(method3566, 2, n15 + 4, Class13.field82, n17, n18, method3562, false, method3565.field1787);
                            method3565.field1788 = new Class85(method3566, 2, n15 + 1 & 0x3, Class13.field82, n17, n18, method3562, false, method3565.field1788);
                        }
                        else {
                            method3565.field1787 = new Class85(method3566, n14, n15, Class13.field82, n17, n18, method3562, false, method3565.field1787);
                        }
                    }
                }
                if (n16 == 1) {
                    final Class133 method3567 = Class28.field248.method2895(Class13.field82, n17, n18);
                    if (method3567 != null) {
                        final int method3568 = Class39.method673(method3567.field1824);
                        if (n14 == 4 || n14 == 5) {
                            method3567.field1823 = new Class85(method3568, 4, n15, Class13.field82, n17, n18, method3562, false, method3567.field1823);
                        }
                        else if (n14 == 6) {
                            method3567.field1823 = new Class85(method3568, 4, n15 + 4, Class13.field82, n17, n18, method3562, false, method3567.field1823);
                        }
                        else if (n14 == 7) {
                            method3567.field1823 = new Class85(method3568, 4, (n15 + 2 & 0x3) + 4, Class13.field82, n17, n18, method3562, false, method3567.field1823);
                        }
                        else if (n14 == 8) {
                            method3567.field1823 = new Class85(method3568, 4, n15 + 4, Class13.field82, n17, n18, method3562, false, method3567.field1823);
                            method3567.field1831 = new Class85(method3568, 4, (n15 + 2 & 0x3) + 4, Class13.field82, n17, n18, method3562, false, method3567.field1831);
                        }
                    }
                }
                if (n16 == 2) {
                    final Class134 method3569 = Class28.field248.method2896(Class13.field82, n17, n18);
                    if (n14 == 11) {
                        n14 = 10;
                    }
                    if (method3569 != null) {
                        method3569.field1844 = new Class85(Class39.method673(method3569.field1848), n14, n15, Class13.field82, n17, n18, method3562, false, method3569.field1844);
                    }
                }
                if (n16 == 3) {
                    final Class115 method3570 = Class28.field248.method2953(Class13.field82, n17, n18);
                    if (method3570 != null) {
                        method3570.field1524 = new Class85(Class39.method673(method3570.field1526), 22, n15, Class13.field82, n17, n18, method3562, false, method3570.field1524);
                    }
                }
            }
            return;
        }
        if (Class171.field2241 == class171) {
            final int method3571 = field1219.method3550();
            final int method3572 = field1219.method3550();
            final int method3573 = field1219.method3765();
            final int n19 = (method3573 >> 4 & 0x7) + Class57.field524;
            final int n20 = (method3573 & 0x7) + Class226.field2568;
            final int method3574 = field1219.method3544();
            if (n19 >= 0 && n20 >= 0 && n19 < 104 && n20 < 104) {
                final int n21 = n19 * 128 + 64;
                final int n22 = n20 * 128 + 64;
                Client.field711.method4073(new Class70(method3571, Class13.field82, n21, n22, Class27.method460(n21, n22, Class13.field82) - method3574, method3572, Client.field591));
            }
            return;
        }
        if (Class171.field2249 == class171) {
            final int method3575 = field1219.method3765();
            final int n23 = (method3575 >> 4 & 0x7) + Class57.field524;
            final int n24 = (method3575 & 0x7) + Class226.field2568;
            final int method3576 = field1219.method3613();
            final int method3577 = field1219.method3585();
            if (n23 >= 0 && n24 >= 0 && n23 < 104 && n24 < 104) {
                final Class80 class173 = new Class80();
                class173.field1151 = method3576;
                class173.field1148 = method3577;
                if (Client.field708[Class13.field82][n23][n24] == null) {
                    Client.field708[Class13.field82][n23][n24] = new Class205();
                }
                Client.field708[Class13.field82][n23][n24].method4073(class173);
                Class253.method4808(n23, n24);
            }
            return;
        }
        if (Class171.field2247 == class171) {
            final int method3578 = field1219.method3544();
            final int n25 = method3578 >> 2;
            final int n26 = method3578 & 0x3;
            final int n27 = Client.field846[n25];
            final int method3579 = field1219.method3765();
            final int n28 = (method3579 >> 4 & 0x7) + Class57.field524;
            final int n29 = (method3579 & 0x7) + Class226.field2568;
            if (n28 >= 0 && n29 >= 0 && n28 < 104 && n29 < 104) {
                Class241.method4602(Class13.field82, n28, n29, n27, -1, n25, n26, 0, -1);
            }
            return;
        }
        if (Class171.field2242 == class171) {
            final int method3580 = field1219.method3646();
            final int method3581 = field1219.method3577();
            final int n30 = (method3581 >> 4 & 0x7) + Class57.field524;
            final int n31 = (method3581 & 0x7) + Class226.field2568;
            if (n30 >= 0 && n31 >= 0 && n30 < 104 && n31 < 104) {
                final Class205 class174 = Client.field708[Class13.field82][n30][n31];
                if (class174 != null) {
                    for (Class80 class175 = (Class80)class174.method4098(); class175 != null; class175 = (Class80)class174.method4079()) {
                        if ((method3580 & 0x7FFF) == class175.field1151) {
                            class175.method4064();
                            break;
                        }
                    }
                    if (class174.method4098() == null) {
                        Client.field708[Class13.field82][n30][n31] = null;
                    }
                    Class253.method4808(n30, n31);
                }
            }
            return;
        }
        if (Class171.field2245 == class171) {
            final int method3582 = field1219.method3607();
            final int n32 = (method3582 >> 4 & 0x7) + Class57.field524;
            final int n33 = (method3582 & 0x7) + Class226.field2568;
            int method3583 = field1219.method3681();
            final int method3584 = field1219.method3550();
            final int method3585 = field1219.method3607();
            final int n34 = method3585 >> 2;
            final int n35 = method3585 & 0x3;
            final int n36 = Client.field846[n34];
            int method3586 = field1219.method3681();
            final int method3587 = field1219.method3550();
            final int method3588 = field1219.method3585();
            int method3589 = field1219.method3610();
            final int method3590 = field1219.method3613();
            int method3591 = field1219.method3660();
            Class60 field1220;
            if (method3590 == Client.field628) {
                field1220 = Class138.field1876;
            }
            else {
                field1220 = Client.field610[method3590];
            }
            if (field1220 != null) {
                final Class268 method3592 = Class110.method2527(method3584);
                int n37;
                int n38;
                if (n35 == 1 || n35 == 3) {
                    n37 = method3592.field3385;
                    n38 = method3592.field3384;
                }
                else {
                    n37 = method3592.field3384;
                    n38 = method3592.field3385;
                }
                final int n39 = n32 + (n37 >> 1);
                final int n40 = n32 + (n37 + 1 >> 1);
                final int n41 = n33 + (n38 >> 1);
                final int n42 = n33 + (n38 + 1 >> 1);
                final int[][] array = Class50.field459[Class13.field82];
                final int field1221 = array[n40][n42] + array[n39][n41] + array[n40][n41] + array[n39][n42] >> 2;
                final Class119 method3593 = method3592.method5031(n34, n35, array, (n32 << 7) + (n37 << 6), field1221, (n33 << 7) + (n38 << 6));
                if (method3593 != null) {
                    Class241.method4602(Class13.field82, n32, n33, n36, -1, 0, 0, method3587 + 1, method3588 + 1);
                    field1220.field545 = method3587 + Client.field591;
                    field1220.field555 = method3588 + Client.field591;
                    field1220.field563 = method3593;
                    field1220.field556 = n32 * 128 + n37 * 64;
                    field1220.field558 = n33 * 128 + n38 * 64;
                    field1220.field557 = field1221;
                    if (method3589 > method3583) {
                        final int n43 = method3589;
                        method3589 = method3583;
                        method3583 = n43;
                    }
                    if (method3591 > method3586) {
                        final int n44 = method3591;
                        method3591 = method3586;
                        method3586 = n44;
                    }
                    field1220.field559 = method3589 + n32;
                    field1220.field565 = method3583 + n32;
                    field1220.field547 = method3591 + n33;
                    field1220.field553 = n33 + method3586;
                }
            }
        }
        if (Class171.field2250 == class171) {
            final int method3594 = field1219.method3607();
            final int method3595 = field1219.method3544();
            final int n45 = method3595 >> 4 & 0xF;
            final int n46 = method3595 & 0x7;
            final int method3596 = field1219.method3607();
            final int n47 = (method3596 >> 4 & 0x7) + Class57.field524;
            final int n48 = (method3596 & 0x7) + Class226.field2568;
            final int method3597 = field1219.method3646();
            if (n47 >= 0 && n48 >= 0 && n47 < 104 && n48 < 104) {
                final int n49 = n45 + 1;
                if (Class138.field1876.field922[0] >= n47 - n49 && Class138.field1876.field922[0] <= n47 + n49 && Class138.field1876.field872[0] >= n48 - n49 && Class138.field1876.field872[0] <= n49 + n48 && Client.field815 != 0 && n46 > 0 && Client.field656 < 50) {
                    Client.field817[Client.field656] = method3597;
                    Client.field676[Client.field656] = n46;
                    Client.field819[Client.field656] = method3594;
                    Client.field719[Client.field656] = null;
                    Client.field820[Client.field656] = n45 + (n48 << 8) + (n47 << 16);
                    ++Client.field656;
                }
            }
        }
        if (Class171.field2244 == class171) {
            final int method3598 = field1219.method3544();
            final int n50 = (method3598 >> 4 & 0x7) + Class57.field524;
            final int n51 = (method3598 & 0x7) + Class226.field2568;
            final int method3599 = field1219.method3613();
            final int method3600 = field1219.method3613();
            final int method3601 = field1219.method3646();
            if (n50 >= 0 && n51 >= 0 && n50 < 104 && n51 < 104) {
                final Class205 class176 = Client.field708[Class13.field82][n50][n51];
                if (class176 != null) {
                    for (Class80 class177 = (Class80)class176.method4098(); class177 != null; class177 = (Class80)class176.method4079()) {
                        if ((method3600 & 0x7FFF) == class177.field1151 && method3601 == class177.field1148) {
                            class177.field1148 = method3599;
                            break;
                        }
                    }
                    Class253.method4808(n50, n51);
                }
            }
        }
    }
}
