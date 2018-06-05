import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ci")
public class Class97 implements Runnable
{
    @ObfuscatedName("ci")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field1329;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "[Lcx;")
    volatile Class95[] field1327;
    
    Class97() {
        this.field1327 = new Class95[2];
    }
    
    @Override
    public void run() {
        try {
            for (int i = 0; i < 2; ++i) {
                final Class95 class95 = this.field1327[i];
                if (class95 != null) {
                    class95.method2144();
                }
            }
        }
        catch (Exception ex) {
            Class5.method65(null, ex);
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(III)Z", garbageValue = "1865447879")
    public static boolean method2214(final int n, final int n2) {
        return (n >> n2 + 1 & 0x1) != 0x0;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(Ljava/lang/Object;ZB)[B", garbageValue = "0")
    public static byte[] method2211(final Object o, final boolean b) {
        if (o == null) {
            return null;
        }
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            if (b) {
                return Class59.method1075(array);
            }
            return array;
        }
        else {
            if (o instanceof Class186) {
                return ((Class186)o).vmethod3789();
            }
            throw new IllegalArgumentException();
        }
    }
    
    @ObfuscatedName("ff")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1818249317")
    static final void method2213() {
        Client.field626.method1982();
        Class54.method1020();
        Class28.field248.method2903();
        for (int i = 0; i < 4; ++i) {
            Client.field642[i].method3392();
        }
        System.gc();
        Class26.method427(2);
        Client.field812 = -1;
        Client.field813 = false;
        for (Class68 class68 = (Class68)Class68.field985.method4098(); class68 != null; class68 = (Class68)Class68.field985.method4079()) {
            if (class68.field993 != null) {
                Class36.field310.method2009(class68.field993);
                class68.field993 = null;
            }
            if (class68.field980 != null) {
                Class36.field310.method2009(class68.field980);
                class68.field980 = null;
            }
        }
        Class68.field985.method4072();
        Class48.method947(10);
    }
    
    @ObfuscatedName("km")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-902888602")
    static void method2215() {
        if (Class21.field175 != null) {
            Client.field650 = Client.field591;
            Class21.field175.method4774();
            for (int i = 0; i < Client.field610.length; ++i) {
                if (Client.field610[i] != null) {
                    Class21.field175.method4773((Client.field610[i].field931 >> 7) + Class62.field868, (Client.field610[i].field881 >> 7) + Client.field754);
                }
            }
        }
    }
}
