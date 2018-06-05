import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ae")
public class RunException
{
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "Lfu;")
    protected static Class160 timer;
    @ObfuscatedName("fy")
    @ObfuscatedSignature(signature = "[Lll;")
    static Class318[] field369;
    
    static {
        ImageIO.setUseCache(false);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IIII)J", garbageValue = "-1030997020")
    static long method716(final int n, final int n2, final int n3) {
        return n3 << 16 | n << 8 | n2;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1093362390")
    public static void method715() {
        Class272.field3524.method3984();
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)Lfu;", garbageValue = "1681202713")
    public static Class160 method712() {
        try {
            return new Class149();
        }
        catch (Throwable t) {
            return new Class150();
        }
    }
    
    @ObfuscatedName("gb")
    @ObfuscatedSignature(signature = "(IIIIZI)V", garbageValue = "2123332164")
    static final void method714(int field762, int field763, int field764, int field765, final boolean b) {
        if (field764 < 1) {
            field764 = 1;
        }
        if (field765 < 1) {
            field765 = 1;
        }
        int n = field765 - 334;
        if (n < 0) {
            n = 0;
        }
        else if (n > 100) {
            n = 100;
        }
        int n2 = (Client.field829 - Client.field802) * n / 100 + Client.field802;
        final int n3 = field765 * n2 * 512 / (field764 * 334);
        if (n3 < Client.field834) {
            final short field766 = Client.field834;
            n2 = field766 * field764 * 334 / (field765 * 512);
            if (n2 > Client.field833) {
                n2 = Client.field833;
                final int n4 = (field764 - field765 * n2 * 512 / (field766 * 334)) / 2;
                if (b) {
                    Class314.method5719();
                    Class314.method5763(field762, field763, n4, field765, -16777216);
                    Class314.method5763(field762 + field764 - n4, field763, n4, field765, -16777216);
                }
                field762 += n4;
                field764 -= n4 * 2;
            }
        }
        else if (n3 > Client.field835) {
            final short field767 = Client.field835;
            n2 = field767 * field764 * 334 / (field765 * 512);
            if (n2 < Client.field832) {
                n2 = Client.field832;
                final int n5 = (field765 - field767 * field764 * 334 / (n2 * 512)) / 2;
                if (b) {
                    Class314.method5719();
                    Class314.method5763(field762, field763, field764, n5, -16777216);
                    Class314.method5763(field762, field765 + field763 - n5, field764, n5, -16777216);
                }
                field763 += n5;
                field765 -= n5 * 2;
            }
        }
        Client.field840 = field765 * n2 * ((Client.field831 - Client.field848) * n / 100 + Client.field848) / 85504 << 1;
        if (field764 != Client.field838 || field765 != Client.field662) {
            final int[] array = new int[9];
            for (int i = 0; i < 9; ++i) {
                final int n6 = i * 32 + 15 + 128;
                array[i] = (n6 * 3 + 600) * Class122.field1681[n6] >> 16;
            }
            Class125.method2893(array, 500, 800, field764, field765);
        }
        Client.field762 = field762;
        Client.field837 = field763;
        Client.field838 = field764;
        Client.field662 = field765;
    }
    
    @ObfuscatedName("ha")
    @ObfuscatedSignature(signature = "(IB)Z", garbageValue = "0")
    static final boolean method713(final int n) {
        if (n < 0) {
            return false;
        }
        int n2 = Client.field720[n];
        if (n2 >= 2000) {
            n2 -= 2000;
        }
        return n2 == 1007;
    }
}
