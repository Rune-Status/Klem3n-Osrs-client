import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ay")
public final class Class50
{
    @ObfuscatedName("pt")
    @ObfuscatedGetter(intValue = 1434136439)
    static int field456;
    @ObfuscatedName("z")
    static int[][][] field459;
    @ObfuscatedName("w")
    static byte[][][] field443;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -791731349)
    static int field442;
    @ObfuscatedName("l")
    static byte[][][] field445;
    @ObfuscatedName("q")
    static byte[][][] field446;
    @ObfuscatedName("i")
    static byte[][][] field447;
    @ObfuscatedName("x")
    static int[][] field448;
    @ObfuscatedName("e")
    static int[] field454;
    @ObfuscatedName("o")
    static final int[] field450;
    @ObfuscatedName("y")
    static final int[] field451;
    @ObfuscatedName("a")
    static final int[] field452;
    @ObfuscatedName("j")
    static final int[] field453;
    @ObfuscatedName("d")
    static final int[] field458;
    @ObfuscatedName("h")
    static final int[] field449;
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 129053467)
    static int field457;
    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -1275566919)
    static int field455;
    @ObfuscatedName("dg")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field461;
    
    static {
        Class50.field459 = new int[4][105][105];
        Class50.field443 = new byte[4][104][104];
        Class50.field442 = 99;
        field450 = new int[] { 1, 2, 4, 8 };
        field451 = new int[] { 16, 32, 64, 128 };
        field452 = new int[] { 1, 0, -1, 0 };
        field453 = new int[] { 0, -1, 0, 1 };
        field458 = new int[] { 1, -1, -1, 1 };
        field449 = new int[] { -1, -1, 1, 1 };
        Class50.field457 = (int)(Math.random() * 17.0) - 8;
        Class50.field455 = (int)(Math.random() * 33.0) - 16;
    }
    
    @ObfuscatedName("fq")
    @ObfuscatedSignature(signature = "(IIB)V", garbageValue = "-29")
    static void method965(final int n, final int n2) {
        if (Client.field811 != 0 && n != -1) {
            Class63.method1554(Class61.field576, n, 0, Client.field811, false);
            Client.field813 = true;
        }
    }
    
    @ObfuscatedName("gk")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "-16")
    static void method991(final int n) {
        Client.field791 = 0L;
        if (n >= 2) {
            Client.field792 = true;
        }
        else {
            Client.field792 = false;
        }
        if ((Client.field792 ? 2 : 1) == 1) {
            Class182.field2334.method906(765, 503);
        }
        else {
            Class182.field2334.method906(7680, 2160);
        }
        if (Client.field589 >= 25) {
            final Class172 method433 = Class26.method433(Class169.field2215, Client.field626.field1218);
            method433.field2257.method3532(Client.field792 ? 2 : 1);
            method433.field2257.method3755(Class82.field1179);
            method433.field2257.method3755(Class243.field3138);
            Client.field626.method1980(method433);
        }
    }
    
    @ObfuscatedName("ip")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;Ljava/lang/String;IIIII)V", garbageValue = "-1119730379")
    public static final void method993(final String s, final String s2, final int n, final int n2, final int n3, final int n4) {
        Class243.method4612(s, s2, n, n2, n3, n4, false);
    }
}
