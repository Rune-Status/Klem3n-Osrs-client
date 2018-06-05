import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bg")
public class Class61 implements Comparator
{
    @ObfuscatedName("po")
    @ObfuscatedSignature(signature = "Lcu;")
    static Class102 field577;
    @ObfuscatedName("dz")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field576;
    @ObfuscatedName("z")
    boolean field575;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ls;Ls;B)I", garbageValue = "-86")
    int method1123(final Class2 class2, final Class2 class3) {
        if (class3.field19 == class2.field19) {
            return 0;
        }
        if (this.field575) {
            if (Client.field581 == class2.field19) {
                return -1;
            }
            if (class3.field19 == Client.field581) {
                return 1;
            }
        }
        return (class2.field19 < class3.field19) ? -1 : 1;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method1123((Class2)o, (Class2)o2);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IB)Lbh;", garbageValue = "44")
    static Class58 method1130(final int n) {
        return (Class58)Class83.field1181.method3945(n);
    }
    
    @ObfuscatedName("m")
    @ObfuscatedSignature(signature = "(Lbb;B)V", garbageValue = "95")
    static void method1129(final Class65 class65) {
        if (class65.method1589() != Client.field668) {
            Client.field668 = class65.method1589();
            final boolean method1589 = class65.method1589();
            if (method1589 != Class269.field3426) {
                Class57.method1036();
                Class269.field3426 = method1589;
            }
        }
        Class54.field485 = class65.field950;
        Client.field581 = class65.field947;
        Client.field632 = class65.field948;
        Class26.field223 = ((Client.field777 == 0) ? 43594 : (class65.field947 + 40000));
        Class68.field996 = ((Client.field777 == 0) ? 443 : (class65.field947 + 50000));
        Class290.field3636 = Class26.field223;
    }
    
    @ObfuscatedName("m")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "-173135414")
    static int method1126(final int n, final Class84 class84, final boolean b) {
        final Class230 method434 = Class26.method434(Class69.field999[--Class69.field1003]);
        if (n == 2800) {
            Class69.field999[++Class69.field1003 - 1] = Signlink.method3252(Class24.method425(method434));
            return 1;
        }
        if (n == 2801) {
            int n2 = Class69.field999[--Class69.field1003];
            --n2;
            if (method434.field2680 == null || n2 >= method434.field2680.length || method434.field2680[n2] == null) {
                Class69.field1001[++Class55.field497 - 1] = "";
            }
            else {
                Class69.field1001[++Class55.field497 - 1] = method434.field2680[n2];
            }
            return 1;
        }
        if (n == 2802) {
            if (method434.field2679 == null) {
                Class69.field1001[++Class55.field497 - 1] = "";
            }
            else {
                Class69.field1001[++Class55.field497 - 1] = method434.field2679;
            }
            return 1;
        }
        return 2;
    }
}
