import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cj")
public class Class96
{
    @ObfuscatedName("z")
    int field1316;
    @ObfuscatedName("w")
    int[] field1323;
    @ObfuscatedName("s")
    int[] field1319;
    @ObfuscatedName("l")
    int field1314;
    @ObfuscatedName("u")
    int field1318;
    @ObfuscatedName("q")
    int field1317;
    @ObfuscatedName("k")
    int field1320;
    @ObfuscatedName("i")
    int field1321;
    @ObfuscatedName("e")
    int field1322;
    @ObfuscatedName("p")
    int field1315;
    @ObfuscatedName("b")
    int field1324;
    
    Class96() {
        this.field1316 = 2;
        this.field1323 = new int[2];
        this.field1319 = new int[2];
        this.field1323[0] = 0;
        this.field1323[1] = 65535;
        this.field1319[0] = 0;
        this.field1319[1] = 65535;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lgk;)V")
    final void method2199(final Class182 class182) {
        this.field1317 = class182.method3544();
        this.field1314 = class182.method3671();
        this.field1318 = class182.method3671();
        this.method2197(class182);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;)V")
    final void method2197(final Class182 class182) {
        this.field1316 = class182.method3544();
        this.field1323 = new int[this.field1316];
        this.field1319 = new int[this.field1316];
        for (int i = 0; i < this.field1316; ++i) {
            this.field1323[i] = class182.method3550();
            this.field1319[i] = class182.method3550();
        }
    }
    
    @ObfuscatedName("s")
    final void method2198() {
        this.field1320 = 0;
        this.field1321 = 0;
        this.field1322 = 0;
        this.field1315 = 0;
        this.field1324 = 0;
    }
    
    @ObfuscatedName("l")
    final int method2206(final int n) {
        if (this.field1324 >= this.field1320) {
            this.field1315 = this.field1319[this.field1321++] << 15;
            if (this.field1321 >= this.field1316) {
                this.field1321 = this.field1316 - 1;
            }
            this.field1320 = (int)(this.field1323[this.field1321] / 65536.0 * n);
            if (this.field1320 > this.field1324) {
                this.field1322 = ((this.field1319[this.field1321] << 15) - this.field1315) / (this.field1320 - this.field1324);
            }
        }
        this.field1315 += this.field1322;
        ++this.field1324;
        return this.field1315 - this.field1322 >> 15;
    }
}
