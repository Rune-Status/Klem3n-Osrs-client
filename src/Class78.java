import java.text.DecimalFormat;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cy")
public class Class78
{
    @ObfuscatedName("z")
    static boolean field1101;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 1570895999)
    static int field1082;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lly;")
    static Class317 field1083;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lly;")
    static Class317 field1084;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "[Lly;")
    static Class317[] field1111;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Lll;")
    static Class318 field1092;
    @ObfuscatedName("k")
    @ObfuscatedSignature(signature = "Lll;")
    static Class318 field1087;
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "Lly;")
    static Class317 field1117;
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "Lly;")
    static Class317 field1089;
    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = 497255191)
    static int field1090;
    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 1723235133)
    static int field1091;
    @ObfuscatedName("a")
    static int[] field1093;
    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 176451679)
    static int field1088;
    @ObfuscatedName("af")
    @ObfuscatedGetter(intValue = 1171598757)
    static int field1094;
    @ObfuscatedName("as")
    @ObfuscatedGetter(intValue = 1476562557)
    static int field1095;
    @ObfuscatedName("an")
    @ObfuscatedGetter(intValue = 1033770495)
    static int field1096;
    @ObfuscatedName("ao")
    @ObfuscatedGetter(intValue = -1870143355)
    static int field1097;
    @ObfuscatedName("at")
    @ObfuscatedGetter(intValue = 868889457)
    static int field1114;
    @ObfuscatedName("ai")
    @ObfuscatedGetter(intValue = 1434866071)
    static int field1099;
    @ObfuscatedName("ac")
    static String field1100;
    @ObfuscatedName("ar")
    @ObfuscatedGetter(intValue = -1062373165)
    static int field1081;
    @ObfuscatedName("au")
    static String field1098;
    @ObfuscatedName("av")
    static String field1103;
    @ObfuscatedName("al")
    static String field1112;
    @ObfuscatedName("ae")
    static String field1105;
    @ObfuscatedName("az")
    static String field1106;
    @ObfuscatedName("aq")
    static String field1086;
    @ObfuscatedName("ad")
    static boolean field1108;
    @ObfuscatedName("bp")
    static boolean field1110;
    @ObfuscatedName("bi")
    static boolean field1115;
    @ObfuscatedName("bq")
    static boolean field1104;
    @ObfuscatedName("bh")
    @ObfuscatedGetter(intValue = -705152905)
    static int field1102;
    @ObfuscatedName("bl")
    static boolean field1107;
    @ObfuscatedName("bs")
    @ObfuscatedGetter(intValue = 381075233)
    static int field1116;
    @ObfuscatedName("be")
    @ObfuscatedGetter(longValue = -8950576353384891287L)
    static long field1109;
    @ObfuscatedName("by")
    @ObfuscatedGetter(longValue = 8067562351581494099L)
    static long field1118;
    
    static {
        Class78.field1082 = 0;
        Class78.field1090 = Class78.field1082 + 202;
        Class78.field1093 = new int[256];
        Class78.field1088 = 0;
        Class78.field1094 = 0;
        Class78.field1095 = 0;
        Class78.field1096 = 0;
        Class78.field1097 = 0;
        Class78.field1114 = 0;
        Class78.field1099 = 10;
        Class78.field1100 = "";
        Class78.field1081 = 0;
        Class78.field1098 = "";
        Class78.field1103 = "";
        Class78.field1112 = "";
        Class78.field1105 = "";
        Class78.field1106 = "";
        Class78.field1086 = "";
        Class78.field1108 = false;
        Class78.field1110 = false;
        Class78.field1115 = false;
        Class78.field1104 = true;
        Class78.field1102 = 0;
        Class78.field1107 = false;
        Class78.field1116 = -1;
        new DecimalFormat("##0.00");
        new Class148();
        Class78.field1109 = -1L;
        Class78.field1118 = -1L;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "([BIII)Ljava/lang/String;", garbageValue = "-1849601215")
    public static String method1831(final byte[] array, final int n, final int n2) {
        final char[] array2 = new char[n2];
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            int n4 = array[i + n] & 0xFF;
            if (n4 != 0) {
                if (n4 >= 128 && n4 < 160) {
                    int n5 = Class301.field3714[n4 - 128];
                    if (n5 == 0) {
                        n5 = 63;
                    }
                    n4 = n5;
                }
                array2[n3++] = (char)n4;
            }
        }
        return new String(array2, 0, n3);
    }
}
