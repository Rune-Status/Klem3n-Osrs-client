import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fb")
public final class Class181
{
    @ObfuscatedName("qf")
    @ObfuscatedSignature(signature = "Lbc;")
    public static Class67 field2332;
    @ObfuscatedName("z")
    final int field2333 = 4096;
    @ObfuscatedName("w")
    final int field2320 = 16;
    @ObfuscatedName("s")
    final int field2327 = 258;
    @ObfuscatedName("l")
    final int field2300 = 6;
    @ObfuscatedName("u")
    final int field2298 = 50;
    @ObfuscatedName("q")
    final int field2299 = 18002;
    @ObfuscatedName("k")
    byte[] strm;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -189685229)
    int next_in;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 1713666481)
    int total_out_lo32;
    @ObfuscatedName("e")
    byte[] field2305;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = 218244667)
    int field2313;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -1013289063)
    int field2310;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = 2020780463)
    int field2295;
    @ObfuscatedName("f")
    byte field2307;
    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 1896627185)
    int field2308;
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = -1154279369)
    int total_in_hi32;
    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -195550973)
    int total_in_lo32;
    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = 823456491)
    int blockSize100k;
    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -1804401527)
    int field2534;
    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = -1057581785)
    int field2304;
    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 1763458429)
    int field2314;
    @ObfuscatedName("j")
    int[] field2315;
    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = -1198980805)
    int field2325;
    @ObfuscatedName("h")
    int[] field2317;
    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -1095083449)
    int field2318;
    @ObfuscatedName("af")
    boolean[] field2319;
    @ObfuscatedName("ah")
    boolean[] field2296;
    @ObfuscatedName("ab")
    byte[] field2321;
    @ObfuscatedName("aw")
    byte[] field2322;
    @ObfuscatedName("ak")
    int[] field2323;
    @ObfuscatedName("as")
    byte[] field2324;
    @ObfuscatedName("an")
    byte[] field2328;
    @ObfuscatedName("ao")
    byte[][] field2303;
    @ObfuscatedName("at")
    int[][] field2301;
    @ObfuscatedName("ai")
    int[][] field2297;
    @ObfuscatedName("ac")
    int[][] field2329;
    @ObfuscatedName("ap")
    int[] field2330;
    @ObfuscatedName("aa")
    @ObfuscatedGetter(intValue = -784898283)
    int field2331;
    
    Class181() {
        this.next_in = 0;
        this.field2313 = 0;
        this.field2315 = new int[256];
        this.field2317 = new int[257];
        this.field2319 = new boolean[256];
        this.field2296 = new boolean[16];
        this.field2321 = new byte[256];
        this.field2322 = new byte[4096];
        this.field2323 = new int[16];
        this.field2324 = new byte[18002];
        this.field2328 = new byte[18002];
        this.field2303 = new byte[6][258];
        this.field2301 = new int[6][258];
        this.field2297 = new int[6][258];
        this.field2329 = new int[6][258];
        this.field2330 = new int[6];
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lfy;S)V", garbageValue = "-23215")
    public static void method3529(final Class174 field3712) {
        Class300.field3712 = field3712;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IIILjj;II)V", garbageValue = "-596460194")
    static void method3528(final int field981, final int n, final int n2, final Class268 field982, final int n3) {
        final Class68 class68 = new Class68();
        class68.field981 = field981;
        class68.field988 = n * 128;
        class68.field983 = n2 * 128;
        int n4 = field982.field3384;
        int n5 = field982.field3385;
        if (n3 == 1 || n3 == 3) {
            n4 = field982.field3385;
            n5 = field982.field3384;
        }
        class68.field984 = (n4 + n) * 128;
        class68.field992 = (n5 + n2) * 128;
        class68.field987 = field982.field3413;
        class68.field991 = field982.field3414 * 128;
        class68.field989 = field982.field3380;
        class68.field982 = field982.field3408;
        class68.field986 = field982.field3417;
        if (field982.field3410 != null) {
            class68.field994 = field982;
            class68.method1688();
        }
        Class68.field985.method4073(class68);
        if (class68.field986 != null) {
            class68.field990 = class68.field989 + (int)(Math.random() * (class68.field982 - class68.field989));
        }
    }
    
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "-852209287")
    static int method3526(final int n, final Class84 class84, final boolean b) {
        if (n == 5504) {
            Class69.field1003 -= 2;
            final int field649 = Class69.field999[Class69.field1003];
            final int field650 = Class69.field999[Class69.field1003 + 1];
            if (!Client.field822) {
                Client.field649 = field649;
                Client.field717 = field650;
            }
            return 1;
        }
        if (n == 5505) {
            Class69.field999[++Class69.field1003 - 1] = Client.field649;
            return 1;
        }
        if (n == 5506) {
            Class69.field999[++Class69.field1003 - 1] = Client.field717;
            return 1;
        }
        if (n == 5530) {
            int field651 = Class69.field999[--Class69.field1003];
            if (field651 < 0) {
                field651 = 0;
            }
            Client.field644 = field651;
            return 1;
        }
        if (n == 5531) {
            Class69.field999[++Class69.field1003 - 1] = Client.field644;
            return 1;
        }
        return 2;
    }
    
    @ObfuscatedName("kd")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "799584462")
    static void method3527() {
        if (Client.field663 && Class138.field1876 != null) {
            final int n = Class138.field1876.field922[0];
            final int n2 = Class138.field1876.field872[0];
            if (n < 0 || n2 < 0 || n >= 104 || n2 >= 104) {
                return;
            }
            Class109.field1428 = Class138.field1876.field931;
            final int field3478 = Class27.method460(Class138.field1876.field931, Class138.field1876.field881, Class13.field82) - Client.field644;
            if (field3478 < Class269.field3478) {
                Class269.field3478 = field3478;
            }
            Class2.field23 = Class138.field1876.field881;
            Client.field663 = false;
        }
    }
}
