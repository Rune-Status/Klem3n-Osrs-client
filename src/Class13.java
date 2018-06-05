import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("f")
public class Class13
{
    @ObfuscatedName("bn")
    @ObfuscatedSignature(signature = "[Lly;")
    static Class317[] field85;
    @ObfuscatedName("iu")
    @ObfuscatedGetter(intValue = -1440413395)
    static int field82;
    @ObfuscatedName("kb")
    @ObfuscatedGetter(intValue = 1699850059)
    static int field84;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 1337486339)
    int field83;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lha;")
    Class226 field88;
    
    Class13(final int field83, final Class226 field84) {
        this.field83 = field83;
        this.field88 = field84;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)[Lly;", garbageValue = "2135043627")
    public static Class317[] method113(final Class247 class247, final String s, final String s2) {
        final int method4642 = class247.method4642(s);
        return Class21.method278(class247, method4642, class247.method4643(method4642, s2));
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;ILjava/lang/String;S)Z", garbageValue = "-4835")
    static boolean method112(final String s, final int n, final String s2) {
        if (n == 0) {
            try {
                if (!Class45.field379.startsWith("win")) {
                    throw new Exception();
                }
                if (!s.startsWith("http://") && !s.startsWith("https://")) {
                    throw new Exception();
                }
                final String s3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                for (int i = 0; i < s.length(); ++i) {
                    if (s3.indexOf(s.charAt(i)) == -1) {
                        throw new Exception();
                    }
                }
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + s + "\"");
                return true;
            }
            catch (Throwable t) {
                return false;
            }
        }
        if (n == 1) {
            try {
                return Class41.method700(Class45.field378, s2, new Object[] { new URL(Class45.field378.getCodeBase(), s).toString() }) != null;
            }
            catch (Throwable t2) {
                return false;
            }
        }
        if (n == 2) {
            try {
                Class45.field378.getAppletContext().showDocument(new URL(Class45.field378.getCodeBase(), s), "_blank");
                return true;
            }
            catch (Exception ex) {
                return false;
            }
        }
        if (n == 3) {
            try {
                Class41.method702(Class45.field378, "loggedout");
            }
            catch (Throwable t3) {}
            try {
                Class45.field378.getAppletContext().showDocument(new URL(Class45.field378.getCodeBase(), s), "_top");
                return true;
            }
            catch (Exception ex2) {
                return false;
            }
        }
        throw new IllegalArgumentException();
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(ILce;ZS)I", garbageValue = "12509")
    static int method111(final int n, final Class84 class84, final boolean b) {
        final Class230 method434 = Class26.method434(Class69.field999[--Class69.field1003]);
        if (n == 2600) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2626;
            return 1;
        }
        if (n == 2601) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2663;
            return 1;
        }
        if (n == 2602) {
            Class69.field1001[++Class55.field497 - 1] = method434.field2667;
            return 1;
        }
        if (n == 2603) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2628;
            return 1;
        }
        if (n == 2604) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2629;
            return 1;
        }
        if (n == 2605) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2704;
            return 1;
        }
        if (n == 2606) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2656;
            return 1;
        }
        if (n == 2607) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2658;
            return 1;
        }
        if (n == 2608) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2657;
            return 1;
        }
        if (n == 2609) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2636;
            return 1;
        }
        if (n == 2610) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2608;
            return 1;
        }
        if (n == 2611) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2630;
            return 1;
        }
        if (n == 2612) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2631;
            return 1;
        }
        if (n == 2613) {
            Class69.field999[++Class69.field1003 - 1] = method434.field2701.vmethod5815();
            return 1;
        }
        if (n == 2614) {
            Class69.field999[++Class69.field1003 - 1] = (method434.field2726 ? 1 : 0);
            return 1;
        }
        return 2;
    }
}
