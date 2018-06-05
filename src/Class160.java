import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fu")
public abstract class Class160
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "2021286604")
    public abstract void vmethod3330();
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "2142370282")
    public abstract int vmethod3331(final int p0, final int p1);
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;B)V", garbageValue = "-42")
    public static void method3344(final Class247 field3226) {
        Class253.field3226 = field3226;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(IIII)V", garbageValue = "1518279696")
    static final void method3338(final int n, final int n2, final int n3) {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                Class50.field459[n][i + n2][j + n3] = 0;
            }
        }
        if (n2 > 0) {
            for (int k = 1; k < 8; ++k) {
                Class50.field459[n][n2][k + n3] = Class50.field459[n][n2 - 1][k + n3];
            }
        }
        if (n3 > 0) {
            for (int l = 1; l < 8; ++l) {
                Class50.field459[n][l + n2][n3] = Class50.field459[n][l + n2][n3 - 1];
            }
        }
        if (n2 > 0 && Class50.field459[n][n2 - 1][n3] != 0) {
            Class50.field459[n][n2][n3] = Class50.field459[n][n2 - 1][n3];
        }
        else if (n3 > 0 && Class50.field459[n][n2][n3 - 1] != 0) {
            Class50.field459[n][n2][n3] = Class50.field459[n][n2][n3 - 1];
        }
        else if (n2 > 0 && n3 > 0 && Class50.field459[n][n2 - 1][n3 - 1] != 0) {
            Class50.field459[n][n2][n3] = Class50.field459[n][n2 - 1][n3 - 1];
        }
    }
    
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "-39289384")
    static int method3341(final int n, final Class84 class84, final boolean b) {
        if (n == 2700) {
            Class69.field999[++Class69.field1003 - 1] = Class26.method434(Class69.field999[--Class69.field1003]).field2649;
            return 1;
        }
        if (n == 2701) {
            final Class230 method434 = Class26.method434(Class69.field999[--Class69.field1003]);
            if (method434.field2649 != -1) {
                Class69.field999[++Class69.field1003 - 1] = method434.field2727;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = 0;
            }
            return 1;
        }
        if (n == 2702) {
            if (Client.field741.method4020(Class69.field999[--Class69.field1003]) != null) {
                Class69.field999[++Class69.field1003 - 1] = 1;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = 0;
            }
            return 1;
        }
        if (n == 2706) {
            Class69.field999[++Class69.field1003 - 1] = Client.field683;
            return 1;
        }
        return 2;
    }
    
    @ObfuscatedName("hu")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1653590324")
    static final void method3342() {
        for (Class62 class62 = (Class62)Client.field714.method4098(); class62 != null; class62 = (Class62)Client.field714.method4079()) {
            if (class62.field860 == -1) {
                class62.field855 = 0;
                Class74.method1800(class62);
            }
            else {
                class62.method4064();
            }
        }
    }
}
