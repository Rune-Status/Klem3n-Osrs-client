import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bs")
public final class Class68 extends Class204
{
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgn;")
    static Class205 field985;
    @ObfuscatedName("ds")
    @ObfuscatedGetter(intValue = -884199663)
    static int field996;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 510585237)
    int field984;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1464678261)
    int field989;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1060604171)
    int field981;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -2012590697)
    int field988;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -2028898983)
    int field983;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 2130308981)
    int field992;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 143905457)
    int field991;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 481090733)
    int field987;
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "Lcm;")
    Class103 field993;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = 1298002913)
    int field982;
    @ObfuscatedName("b")
    int[] field986;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = 366883801)
    int field990;
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "Lcm;")
    Class103 field980;
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "Ljj;")
    Class268 field994;
    
    static {
        Class68.field985 = new Class205();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-73")
    void method1688() {
        final int field987 = this.field987;
        final Class268 method5056 = this.field994.method5056();
        if (method5056 != null) {
            this.field987 = method5056.field3413;
            this.field991 = method5056.field3414 * 128;
            this.field989 = method5056.field3380;
            this.field982 = method5056.field3408;
            this.field986 = method5056.field3417;
        }
        else {
            this.field987 = -1;
            this.field991 = 0;
            this.field989 = 0;
            this.field982 = 0;
            this.field986 = null;
        }
        if (field987 != this.field987 && this.field993 != null) {
            Class36.field310.method2009(this.field993);
            this.field993 = null;
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lbo;I)V", garbageValue = "-1000206687")
    public static void method1696(final Class56 class56) {
        Class309.method5674(class56, 500000);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Ljava/lang/CharSequence;IZB)I", garbageValue = "53")
    public static int method1693(final CharSequence charSequence, final int n, final boolean b) {
        if (n < 2 || n > 36) {
            throw new IllegalArgumentException("");
        }
        boolean b2 = false;
        int n2 = 0;
        int n3 = 0;
        final int length = charSequence.length();
        int i = 0;
    Label_0086_Outer:
        while (i < length) {
            int char1 = charSequence.charAt(i);
            while (true) {
                Label_0108: {
                    if (i != 0) {
                        break Label_0108;
                    }
                    if (char1 == 45) {
                        b2 = true;
                    }
                    else if (char1 != 43) {
                        break Label_0108;
                    }
                    ++i;
                    continue Label_0086_Outer;
                }
                if (char1 >= 48 && char1 <= 57) {
                    char1 -= 48;
                }
                else if (char1 >= 65 && char1 <= 90) {
                    char1 -= 55;
                }
                else {
                    if (char1 < 97 || char1 > 122) {
                        throw new NumberFormatException();
                    }
                    char1 -= 87;
                }
                if (char1 >= n) {
                    throw new NumberFormatException();
                }
                if (b2) {
                    char1 = -char1;
                }
                final int n4 = char1 + n3 * n;
                if (n4 / n != n3) {
                    throw new NumberFormatException();
                }
                n3 = n4;
                n2 = 1;
                continue;
            }
        }
        if (n2 == 0) {
            throw new NumberFormatException();
        }
        return n3;
    }
    
    @ObfuscatedName("r")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1978013754")
    public static void method1698() {
        Class230.field2599.method3984();
        Class230.field2600.method3984();
        Class230.field2601.method3984();
        Class230.field2602.method3984();
    }
    
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "(IZII)V", garbageValue = "-1337565581")
    public static final void method1697(final int field1300, final boolean field1301, final int field1302) {
        if (field1300 < 8000 || field1300 > 48000) {
            throw new IllegalArgumentException();
        }
        Class95.field1300 = field1300;
        Class95.field1295 = field1301;
        Class27.field230 = field1302;
    }
}
