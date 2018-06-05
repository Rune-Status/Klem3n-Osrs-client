import java.net.URL;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("u")
public class Class4
{
    @ObfuscatedName("z")
    byte field31;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -505500629)
    public int field29;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1231470581)
    public int field30;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 528031905)
    public int field33;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1404264417)
    public int field32;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -1551136007)
    public int field28;
    
    public Class4() {
    }
    
    public Class4(final Class182 class182, final boolean b) {
        this.field31 = class182.method3681();
        this.field29 = class182.method3550();
        this.field30 = class182.method3671();
        this.field33 = class182.method3671();
        this.field32 = class182.method3671();
        this.field28 = class182.method3671();
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-1516792528")
    public int method38() {
        return this.field31 & 0x7;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "63")
    public int method39() {
        return ((this.field31 & 0x8) == 0x8) ? 1 : 0;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-658609218")
    void method44(final int n) {
        this.field31 &= 0xFFFFFFF8;
        this.field31 |= (byte)(n & 0x7);
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "74851290")
    void method40(final int n) {
        this.field31 &= 0xFFFFFFF7;
        if (n == 1) {
            this.field31 |= 0x8;
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "1218832541")
    static boolean method36() {
        try {
            if (Class49.field439 == null) {
                Class49.field439 = Class28.field249.method3109(new URL(Class26.field219));
            }
            else if (Class49.field439.method3117()) {
                final Class182 class182 = new Class182(Class49.field439.method3116());
                class182.method3671();
                Class65.field945 = class182.method3550();
                Class65.field949 = new Class65[Class65.field945];
                for (int i = 0; i < Class65.field945; ++i) {
                    final Class65[] field949 = Class65.field949;
                    final int n = i;
                    final Class65 class183 = new Class65();
                    field949[n] = class183;
                    final Class65 class184 = class183;
                    class184.field947 = class182.method3550();
                    class184.field948 = class182.method3671();
                    class184.field950 = class182.method3738();
                    class184.field951 = class182.method3738();
                    class184.field952 = class182.method3544();
                    class184.field955 = class182.method3551();
                    class184.field943 = i;
                }
                Class22.method282(Class65.field949, 0, Class65.field949.length - 1, Class65.field946, Class65.field939);
                Class49.field439 = null;
                return true;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            Class49.field439 = null;
        }
        return false;
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-106852228")
    static final void method56() {
        if (Class120.field1652) {
            return;
        }
        final int field1759 = Class125.field1759;
        final int field1760 = Class125.field1737;
        final int field1761 = Class125.field1740;
        final int field1762 = Class125.field1771;
        final int n = 50;
        final int n2 = 3500;
        final int n3 = (Class120.field1648 - Class122.field1687) * n / Class122.field1678;
        final int n4 = (Class120.field1649 - Class122.field1689) * n / Class122.field1678;
        final int n5 = (Class120.field1648 - Class122.field1687) * n2 / Class122.field1678;
        final int n6 = (Class120.field1649 - Class122.field1689) * n2 / Class122.field1678;
        final int method2807 = Class122.method2807(n4, n, field1760, field1759);
        final int method2808 = Class122.method2790(n4, n, field1760, field1759);
        final int n7 = method2807;
        final int method2809 = Class122.method2807(n6, n2, field1760, field1759);
        final int method2810 = Class122.method2790(n6, n2, field1760, field1759);
        final int n8 = method2809;
        final int method2811 = Class122.method2805(n3, method2808, field1762, field1761);
        final int method2812 = Class122.method2806(n3, method2808, field1762, field1761);
        final int n9 = method2811;
        final int method2813 = Class122.method2805(n5, method2810, field1762, field1761);
        final int method2814 = Class122.method2806(n5, method2810, field1762, field1761);
        final int n10 = method2813;
        Class120.field1657 = (n10 + n9) / 2;
        Class120.field1659 = (n8 + n7) / 2;
        Class177.field2283 = (method2814 + method2812) / 2;
        Class303.field3721 = (n10 - n9) / 2;
        Class120.field1651 = (n8 - n7) / 2;
        Class120.field1654 = (method2814 - method2812) / 2;
        Class98.field1335 = Math.abs(Class303.field3721);
        Class120.field1655 = Math.abs(Class120.field1651);
        Class312.field3757 = Math.abs(Class120.field1654);
    }
}
