import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ap")
public class Class37 implements Class31
{
    @ObfuscatedName("g")
    static int[][][] field325;
    @ObfuscatedName("cj")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field326;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -197733351)
    int field318;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 1775114501)
    int field324;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1227159199)
    int field319;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -61550559)
    int field317;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 121293021)
    int field315;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 1482436255)
    int field320;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 608429445)
    int field321;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 412323183)
    int field322;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 829826955)
    int field316;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1430909947)
    int field323;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(La;B)V", garbageValue = "-105")
    @Override
    public void vmethod635(final Class20 class20) {
        if (class20.field166 > this.field315) {
            class20.field166 = this.field315;
        }
        if (class20.field167 < this.field315) {
            class20.field167 = this.field315;
        }
        if (class20.field168 > this.field320) {
            class20.field168 = this.field320;
        }
        if (class20.field162 < this.field320) {
            class20.field162 = this.field320;
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIII)Z", garbageValue = "2090621319")
    @Override
    public boolean vmethod636(final int n, final int n2, final int n3) {
        return n >= this.field318 && n < this.field318 + this.field324 && n2 >= (this.field319 << 6) + (this.field321 << 3) && n2 <= (this.field319 << 6) + (this.field321 << 3) + 7 && n3 >= (this.field317 << 6) + (this.field322 << 3) && n3 <= (this.field317 << 6) + (this.field322 << 3) + 7;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(III)Z", garbageValue = "-658565537")
    @Override
    public boolean vmethod637(final int n, final int n2) {
        return n >= (this.field315 << 6) + (this.field316 << 3) && n <= (this.field315 << 6) + (this.field316 << 3) + 7 && n2 >= (this.field320 << 6) + (this.field323 << 3) && n2 <= (this.field320 << 6) + (this.field323 << 3) + 7;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(IIIB)[I", garbageValue = "56")
    @Override
    public int[] vmethod638(final int n, final int n2, final int n3) {
        if (!this.vmethod636(n, n2, n3)) {
            return null;
        }
        return new int[] { this.field315 * 64 - this.field319 * 64 + n2 + (this.field316 * 8 - this.field321 * 8), n3 + (this.field320 * 64 - this.field317 * 64) + (this.field323 * 8 - this.field322 * 8) };
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(III)Lha;", garbageValue = "2128900046")
    @Override
    public Class226 vmethod659(final int n, final int n2) {
        if (!this.vmethod637(n, n2)) {
            return null;
        }
        return new Class226(this.field318, this.field319 * 64 - this.field315 * 64 + (this.field321 * 8 - this.field316 * 8) + n, this.field317 * 64 - this.field320 * 64 + n2 + (this.field322 * 8 - this.field323 * 8));
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Lgk;B)V", garbageValue = "-40")
    @Override
    public void vmethod639(final Class182 class182) {
        this.field318 = class182.method3544();
        this.field324 = class182.method3544();
        this.field319 = class182.method3550();
        this.field321 = class182.method3544();
        this.field317 = class182.method3550();
        this.field322 = class182.method3544();
        this.field315 = class182.method3550();
        this.field316 = class182.method3544();
        this.field320 = class182.method3550();
        this.field323 = class182.method3544();
        this.method641();
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-49")
    void method641() {
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lgi;I)V", garbageValue = "-1062831458")
    static final void method660(final Class189 class189) {
        class189.method3823();
        final int field628 = Client.field628;
        final Class60[] field629 = Client.field610;
        final int n = field628;
        final Class60 field630 = new Class60();
        field629[n] = field630;
        Class138.field1876 = field630;
        final Class60 class190 = field630;
        class190.field574 = field628;
        final int method3817 = class189.method3817(30);
        final byte b = (byte)(method3817 >> 28);
        final int n2 = method3817 >> 14 & 0x3FFF;
        final int n3 = method3817 & 0x3FFF;
        class190.field922[0] = n2 - Class62.field868;
        class190.field931 = (class190.field922[0] << 7) + (class190.method1088() << 6);
        class190.field872[0] = n3 - Client.field754;
        class190.field881 = (class190.field872[0] << 7) + (class190.method1088() << 6);
        final Class60 class191 = class190;
        final byte b2 = b;
        class191.field567 = b2;
        Class13.field82 = b2;
        if (Class81.field1157[field628] != null) {
            class190.method1082(Class81.field1157[field628]);
        }
        Class81.field1167 = 0;
        Class81.field1159[++Class81.field1167 - 1] = field628;
        Class81.field1156[field628] = 0;
        Class81.field1160 = 0;
        for (int i = 1; i < 2048; ++i) {
            if (i != field628) {
                final int method3818 = class189.method3817(18);
                Class81.field1162[i] = ((method3818 >> 8 & 0x255) << 14) + (method3818 & 0x255) + (method3818 >> 16 << 28);
                Class81.field1163[i] = 0;
                Class81.field1164[i] = -1;
                Class81.field1161[++Class81.field1160 - 1] = i;
                Class81.field1156[i] = 0;
            }
        }
        class189.method3816();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "681063668")
    public static int method652() {
        return ++Class48.field417 - 1;
    }
    
    @ObfuscatedName("l")
    public static int method662(final long n) {
        return (int)(n >>> 0 & 0x7FL);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-81")
    static void method640() {
        final Iterator iterator = Class83.field1181.iterator();
        while (iterator.hasNext()) {
            ((Class58) iterator.next()).method1048();
        }
    }
    
    @ObfuscatedName("ae")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-1520436203")
    protected static int method661() {
        int n = 0;
        Label_0089: {
            if (Class121.field1660 != null) {
                if (Class121.field1660.isValid()) {
                    break Label_0089;
                }
            }
            try {
                for (final GarbageCollectorMXBean field1660 : ManagementFactory.getGarbageCollectorMXBeans()) {
                    if (field1660.isValid()) {
                        Class121.field1660 = field1660;
                        Class47.field416 = -1L;
                        Class47.field415 = -1L;
                    }
                }
            }
            catch (Throwable t) {}
        }
        if (Class121.field1660 != null) {
            final long method3547 = Class182.method3547();
            final long collectionTime = Class121.field1660.getCollectionTime();
            if (-1L != Class47.field415) {
                final long n2 = collectionTime - Class47.field415;
                final long n3 = method3547 - Class47.field416;
                if (n3 != 0L) {
                    n = (int)(100L * n2 / n3);
                }
            }
            Class47.field415 = collectionTime;
            Class47.field416 = method3547;
        }
        return n;
    }
}
