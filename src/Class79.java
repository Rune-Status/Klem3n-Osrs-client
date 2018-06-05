import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cd")
public final class Class79 extends Class127
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -1556168027)
    int field1120;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -137784953)
    int field1121;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1001488191)
    int field1122;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1246023211)
    int field1130;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 615566251)
    int field1124;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 392987725)
    int field1123;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -904504589)
    int field1126;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -620277071)
    int field1127;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -1070958121)
    int field1128;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 490522177)
    int field1132;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -1202003677)
    int field1135;
    @ObfuscatedName("b")
    boolean field1133;
    @ObfuscatedName("n")
    double field1144;
    @ObfuscatedName("f")
    double field1125;
    @ObfuscatedName("g")
    double field1137;
    @ObfuscatedName("m")
    double field1131;
    @ObfuscatedName("r")
    double field1136;
    @ObfuscatedName("t")
    double field1129;
    @ObfuscatedName("o")
    double field1138;
    @ObfuscatedName("y")
    double field1139;
    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 82611727)
    int field1140;
    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = 760033287)
    int field1141;
    @ObfuscatedName("d")
    @ObfuscatedSignature(signature = "Ljn;")
    Class273 field1142;
    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = 1358664531)
    int field1143;
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -931624513)
    int field1134;
    
    Class79(final int field1120, final int field1121, final int field1122, final int field1123, final int field1124, final int field1125, final int field1126, final int field1127, final int field1128, final int field1129, final int field1130) {
        this.field1133 = false;
        this.field1143 = 0;
        this.field1134 = 0;
        this.field1120 = field1120;
        this.field1121 = field1121;
        this.field1122 = field1122;
        this.field1130 = field1123;
        this.field1124 = field1124;
        this.field1126 = field1125;
        this.field1127 = field1126;
        this.field1128 = field1127;
        this.field1132 = field1128;
        this.field1135 = field1129;
        this.field1123 = field1130;
        this.field1133 = false;
        final int field1131 = Class57.method1035(this.field1120).field3271;
        if (field1131 != -1) {
            this.field1142 = Class3.method25(field1131);
        }
        else {
            this.field1142 = null;
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IIIII)V", garbageValue = "-432568951")
    final void method1849(final int n, final int n2, final int n3, final int n4) {
        if (!this.field1133) {
            final double n5 = n - this.field1122;
            final double n6 = n2 - this.field1130;
            final double sqrt = Math.sqrt(n6 * n6 + n5 * n5);
            this.field1144 = this.field1122 + this.field1132 * n5 / sqrt;
            this.field1125 = this.field1132 * n6 / sqrt + this.field1130;
            this.field1137 = this.field1124;
        }
        final double n7 = this.field1127 + 1 - n4;
        this.field1131 = (n - this.field1144) / n7;
        this.field1136 = (n2 - this.field1125) / n7;
        this.field1129 = Math.sqrt(this.field1131 * this.field1131 + this.field1136 * this.field1136);
        if (!this.field1133) {
            this.field1138 = -this.field1129 * Math.tan(0.02454369 * this.field1128);
        }
        this.field1139 = (n3 - this.field1137 - n7 * this.field1138) * 2.0 / (n7 * n7);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-1768751642")
    final void method1850(final int n) {
        this.field1133 = true;
        this.field1144 += this.field1131 * n;
        this.field1125 += this.field1136 * n;
        this.field1137 += n * (0.5 * this.field1139 * n) + n * this.field1138;
        this.field1138 += this.field1139 * n;
        this.field1140 = ((int)(Math.atan2(this.field1131, this.field1136) * 325.949) + 1024 & 0x7FF);
        this.field1141 = ((int)(Math.atan2(this.field1138, this.field1129) * 325.949) & 0x7FF);
        if (this.field1142 != null) {
            this.field1134 += n;
            while (this.field1134 > this.field1142.field3541[this.field1143]) {
                this.field1134 -= this.field1142.field3541[this.field1143];
                ++this.field1143;
                if (this.field1143 >= this.field1142.field3540.length) {
                    this.field1143 -= this.field1142.field3544;
                    if (this.field1143 >= 0 && this.field1143 < this.field1142.field3540.length) {
                        continue;
                    }
                    this.field1143 = 0;
                }
            }
        }
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)Ldc;", garbageValue = "2119202332")
    @Override
    protected final Class119 vmethod3067() {
        final Class119 method4866 = Class57.method1035(this.field1120).method4866(this.field1143);
        if (method4866 == null) {
            return null;
        }
        method4866.method2680(this.field1141);
        return method4866;
    }
}
