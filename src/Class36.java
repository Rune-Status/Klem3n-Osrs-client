import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ac")
public class Class36
{
    @ObfuscatedName("pj")
    @ObfuscatedSignature(signature = "Lca;")
    static Class88 field310;
    @ObfuscatedName("bq")
    @ObfuscatedSignature(signature = "Llm;")
    static Class322 field306;
    @ObfuscatedName("dv")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field312;
    @ObfuscatedName("fz")
    @ObfuscatedSignature(signature = "[Lll;")
    static Class318[] field314;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 975450249)
    public int field307;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lha;")
    public Class226 field311;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lha;")
    public Class226 field308;
    
    public Class36(final int field307, final Class226 field308, final Class226 field309) {
        this.field307 = field307;
        this.field311 = field308;
        this.field308 = field309;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lfd;ZI)V", garbageValue = "-2121353984")
    public static void method633(final Class157 field3200, final boolean b) {
        if (Class250.field3200 != null) {
            try {
                Class250.field3200.vmethod3346();
            }
            catch (Exception ex) {}
            Class250.field3200 = null;
        }
        Class250.field3200 = field3200;
        Class222.method4410(b);
        Class250.field3209.field2339 = 0;
        Class250.field3208 = null;
        Class301.field3713 = null;
        Class250.field3210 = 0;
        while (true) {
            final Class246 class246 = (Class246)Class250.field3199.method4018();
            if (class246 == null) {
                break;
            }
            Class250.field3212.method4016(class246, class246.field2421);
            ++Class250.field3211;
            --Class250.field3198;
        }
        while (true) {
            final Class246 class247 = (Class246)Class250.field3206.method4018();
            if (class247 == null) {
                break;
            }
            Class250.field3202.method3908(class247);
            Class250.field3204.method4016(class247, class247.field2421);
            ++Class250.field3205;
            --Class250.field3207;
        }
        if (Class250.field3213 != 0) {
            try {
                final Class182 class248 = new Class182(4);
                class248.method3532(4);
                class248.method3532(Class250.field3213);
                class248.method3755(0);
                Class250.field3200.vmethod3347(class248.payload, 0, 4);
            }
            catch (IOException ex2) {
                try {
                    Class250.field3200.vmethod3346();
                }
                catch (Exception ex3) {}
                ++Class250.field3215;
                Class250.field3200 = null;
            }
        }
        Class250.field3197 = 0;
        Class250.field3203 = Class182.method3547();
    }
    
    @ObfuscatedName("fn")
    @ObfuscatedSignature(signature = "(Lhi;III)V", garbageValue = "-201841471")
    static final void method632(final Class230 class230, final int n, final int n2) {
        if (Client.field810 != 0 && Client.field810 != 3) {
            return;
        }
        if (Class48.field431 == 1 || (!Class253.field3229 && Class48.field431 == 4)) {
            final Class224 method4517 = class230.method4517(true);
            if (method4517 == null) {
                return;
            }
            final int n3 = Class48.field432 - n;
            final int n4 = Class48.field428 - n2;
            if (method4517.method4423(n3, n4)) {
                final int n5 = n3 - method4517.field2553 / 2;
                final int n6 = n4 - method4517.field2549 / 2;
                final int n7 = Client.field717 & 0x7FF;
                final int n8 = Class122.field1681[n7];
                final int n9 = Class122.field1693[n7];
                final int n10 = n6 * n8 + n5 * n9 >> 11;
                final int n11 = n9 * n6 - n5 * n8 >> 11;
                final int field808 = n10 + Class138.field1876.field931 >> 7;
                final int field809 = Class138.field1876.field881 - n11 >> 7;
                final Class172 method4518 = Class26.method433(Class169.field2135, Client.field626.field1218);
                method4518.field2257.method3532(18);
                method4518.field2257.method3755(field808 + Class62.field868);
                method4518.field2257.method3575(Class39.field341[82] ? (Class39.field341[81] ? 2 : 1) : 0);
                method4518.field2257.method3582(field809 + Client.field754);
                method4518.field2257.method3532(n5);
                method4518.field2257.method3532(n6);
                method4518.field2257.method3755(Client.field717);
                method4518.field2257.method3532(57);
                method4518.field2257.method3532(0);
                method4518.field2257.method3532(0);
                method4518.field2257.method3532(89);
                method4518.field2257.method3755(Class138.field1876.field931);
                method4518.field2257.method3755(Class138.field1876.field881);
                method4518.field2257.method3532(63);
                Client.field626.method1980(method4518);
                Client.field808 = field808;
                Client.field809 = field809;
            }
        }
    }
}
