import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("g")
public class Class14 implements Class31
{
    @ObfuscatedName("oa")
    @ObfuscatedSignature(signature = "Lkn;")
    static Class293 field94;
    @ObfuscatedName("bj")
    @ObfuscatedGetter(intValue = 892739819)
    static int field104;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 1521413561)
    int field100;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 1962269323)
    int field90;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1724489905)
    int field91;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -691106019)
    int field102;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 1912646943)
    int field93;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -1042718987)
    int field96;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -476751)
    int field95;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -129967555)
    int field105;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -892770797)
    int field97;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 1390874549)
    int field98;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -495225415)
    int field99;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -1910350211)
    int field89;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = 2005192815)
    int field101;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = -57751229)
    int field103;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(La;B)V", garbageValue = "-105")
    @Override
    public void vmethod635(final Class20 class20) {
        if (class20.field166 > this.field93) {
            class20.field166 = this.field93;
        }
        if (class20.field167 < this.field93) {
            class20.field167 = this.field93;
        }
        if (class20.field168 > this.field96) {
            class20.field168 = this.field96;
        }
        if (class20.field162 < this.field96) {
            class20.field162 = this.field96;
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIII)Z", garbageValue = "2090621319")
    @Override
    public boolean vmethod636(final int n, final int n2, final int n3) {
        return n >= this.field100 && n < this.field90 + this.field100 && n2 >= (this.field91 << 6) + (this.field95 << 3) && n2 <= (this.field91 << 6) + (this.field97 << 3) + 7 && n3 >= (this.field102 << 6) + (this.field105 << 3) && n3 <= (this.field102 << 6) + (this.field98 << 3) + 7;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(III)Z", garbageValue = "-658565537")
    @Override
    public boolean vmethod637(final int n, final int n2) {
        return n >= (this.field93 << 6) + (this.field99 << 3) && n <= (this.field93 << 6) + (this.field101 << 3) + 7 && n2 >= (this.field96 << 6) + (this.field89 << 3) && n2 <= (this.field96 << 6) + (this.field103 << 3) + 7;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(IIIB)[I", garbageValue = "56")
    @Override
    public int[] vmethod638(final int n, final int n2, final int n3) {
        if (!this.vmethod636(n, n2, n3)) {
            return null;
        }
        return new int[] { this.field93 * 64 - this.field91 * 64 + n2 + (this.field99 * 8 - this.field95 * 8), n3 + (this.field96 * 64 - this.field102 * 64) + (this.field89 * 8 - this.field105 * 8) };
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(III)Lha;", garbageValue = "2128900046")
    @Override
    public Class226 vmethod659(final int n, final int n2) {
        if (!this.vmethod637(n, n2)) {
            return null;
        }
        return new Class226(this.field100, this.field91 * 64 - this.field93 * 64 + (this.field95 * 8 - this.field99 * 8) + n, this.field102 * 64 - this.field96 * 64 + n2 + (this.field105 * 8 - this.field89 * 8));
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Lgk;B)V", garbageValue = "-40")
    @Override
    public void vmethod639(final Class182 class182) {
        this.field100 = class182.method3544();
        this.field90 = class182.method3544();
        this.field91 = class182.method3550();
        this.field95 = class182.method3544();
        this.field97 = class182.method3544();
        this.field102 = class182.method3550();
        this.field105 = class182.method3544();
        this.field98 = class182.method3544();
        this.field93 = class182.method3550();
        this.field99 = class182.method3544();
        this.field101 = class182.method3544();
        this.field96 = class182.method3550();
        this.field89 = class182.method3544();
        this.field103 = class182.method3544();
        this.method121();
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "87")
    void method121() {
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IB)Ljp;", garbageValue = "46")
    public static Class267 method123(final int n) {
        final Class267 class267 = (Class267)Class267.field3349.method3989(n);
        if (class267 != null) {
            return class267;
        }
        final byte[] method4625 = Class267.field3367.method4625(32, n);
        final Class267 class268 = new Class267();
        if (method4625 != null) {
            class268.method4990(new Class182(method4625));
        }
        Class267.field3349.method3983(class268, n);
        return class268;
    }
    
    @ObfuscatedName("a")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "-1981801988")
    static int method139(final int n, final Class84 class84, final boolean b) {
        if (n == 5000) {
            Class69.field999[++Class69.field1003 - 1] = Client.field630;
            return 1;
        }
        if (n == 5001) {
            Class69.field1003 -= 3;
            Client.field630 = Class69.field999[Class69.field1003];
            Class143.field1899 = Class189.method3847(Class69.field999[Class69.field1003 + 1]);
            if (Class143.field1899 == null) {
                Class143.field1899 = Class307.field3734;
            }
            Client.field795 = Class69.field999[Class69.field1003 + 2];
            final Class172 method433 = Class26.method433(Class169.field2192, Client.field626.field1218);
            method433.field2257.method3532(Client.field630);
            method433.field2257.method3532(Class143.field1899.field3735);
            method433.field2257.method3532(Client.field795);
            Client.field626.method1980(method433);
            return 1;
        }
        if (n == 5002) {
            final String s = Class69.field1001[--Class55.field497];
            Class69.field1003 -= 2;
            final int n2 = Class69.field999[Class69.field1003];
            final int n3 = Class69.field999[Class69.field1003 + 1];
            final Class172 method434 = Class26.method433(Class169.field2185, Client.field626.field1218);
            method434.field2257.method3532(Class316.method5820(s) + 2);
            method434.field2257.method3699(s);
            method434.field2257.method3532(n2 - 1);
            method434.field2257.method3532(n3);
            Client.field626.method1980(method434);
            return 1;
        }
        if (n == 5003) {
            Class69.field1003 -= 2;
            final Class58 method435 = ((Class86) Class83.field1180.get(Class69.field999[Class69.field1003])).method1965(Class69.field999[Class69.field1003 + 1]);
            if (method435 != null) {
                Class69.field999[++Class69.field1003 - 1] = method435.field540;
                Class69.field999[++Class69.field1003 - 1] = method435.field535;
                Class69.field1001[++Class55.field497 - 1] = ((method435.field531 != null) ? method435.field531 : "");
                Class69.field1001[++Class55.field497 - 1] = ((method435.field537 != null) ? method435.field537 : "");
                Class69.field1001[++Class55.field497 - 1] = ((method435.field533 != null) ? method435.field533 : "");
                Class69.field999[++Class69.field1003 - 1] = (method435.method1040() ? 1 : (method435.method1043() ? 2 : 0));
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = -1;
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field1001[++Class55.field497 - 1] = "";
                Class69.field1001[++Class55.field497 - 1] = "";
                Class69.field1001[++Class55.field497 - 1] = "";
                Class69.field999[++Class69.field1003 - 1] = 0;
            }
            return 1;
        }
        if (n == 5004) {
            final Class58 method436 = Class61.method1130(Class69.field999[--Class69.field1003]);
            if (method436 != null) {
                Class69.field999[++Class69.field1003 - 1] = method436.field532;
                Class69.field999[++Class69.field1003 - 1] = method436.field535;
                Class69.field1001[++Class55.field497 - 1] = ((method436.field531 != null) ? method436.field531 : "");
                Class69.field1001[++Class55.field497 - 1] = ((method436.field537 != null) ? method436.field537 : "");
                Class69.field1001[++Class55.field497 - 1] = ((method436.field533 != null) ? method436.field533 : "");
                Class69.field999[++Class69.field1003 - 1] = (method436.method1040() ? 1 : (method436.method1043() ? 2 : 0));
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = -1;
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field1001[++Class55.field497 - 1] = "";
                Class69.field1001[++Class55.field497 - 1] = "";
                Class69.field1001[++Class55.field497 - 1] = "";
                Class69.field999[++Class69.field1003 - 1] = 0;
            }
            return 1;
        }
        if (n == 5005) {
            if (Class143.field1899 == null) {
                Class69.field999[++Class69.field1003 - 1] = -1;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = Class143.field1899.field3735;
            }
            return 1;
        }
        if (n == 5008) {
            String s2 = Class69.field1001[--Class55.field497];
            final int n4 = Class69.field999[--Class69.field1003];
            final String lowerCase = s2.toLowerCase();
            int n5 = 0;
            if (lowerCase.startsWith("yellow:")) {
                n5 = 0;
                s2 = s2.substring("yellow:".length());
            }
            else if (lowerCase.startsWith("red:")) {
                n5 = 1;
                s2 = s2.substring("red:".length());
            }
            else if (lowerCase.startsWith("green:")) {
                n5 = 2;
                s2 = s2.substring("green:".length());
            }
            else if (lowerCase.startsWith("cyan:")) {
                n5 = 3;
                s2 = s2.substring("cyan:".length());
            }
            else if (lowerCase.startsWith("purple:")) {
                n5 = 4;
                s2 = s2.substring("purple:".length());
            }
            else if (lowerCase.startsWith("white:")) {
                n5 = 5;
                s2 = s2.substring("white:".length());
            }
            else if (lowerCase.startsWith("flash1:")) {
                n5 = 6;
                s2 = s2.substring("flash1:".length());
            }
            else if (lowerCase.startsWith("flash2:")) {
                n5 = 7;
                s2 = s2.substring("flash2:".length());
            }
            else if (lowerCase.startsWith("flash3:")) {
                n5 = 8;
                s2 = s2.substring("flash3:".length());
            }
            else if (lowerCase.startsWith("glow1:")) {
                n5 = 9;
                s2 = s2.substring("glow1:".length());
            }
            else if (lowerCase.startsWith("glow2:")) {
                n5 = 10;
                s2 = s2.substring("glow2:".length());
            }
            else if (lowerCase.startsWith("glow3:")) {
                n5 = 11;
                s2 = s2.substring("glow3:".length());
            }
            else if (Client.field827 != 0) {
                if (lowerCase.startsWith("yellow:")) {
                    n5 = 0;
                    s2 = s2.substring("yellow:".length());
                }
                else if (lowerCase.startsWith("red:")) {
                    n5 = 1;
                    s2 = s2.substring("red:".length());
                }
                else if (lowerCase.startsWith("green:")) {
                    n5 = 2;
                    s2 = s2.substring("green:".length());
                }
                else if (lowerCase.startsWith("cyan:")) {
                    n5 = 3;
                    s2 = s2.substring("cyan:".length());
                }
                else if (lowerCase.startsWith("purple:")) {
                    n5 = 4;
                    s2 = s2.substring("purple:".length());
                }
                else if (lowerCase.startsWith("white:")) {
                    n5 = 5;
                    s2 = s2.substring("white:".length());
                }
                else if (lowerCase.startsWith("flash1:")) {
                    n5 = 6;
                    s2 = s2.substring("flash1:".length());
                }
                else if (lowerCase.startsWith("flash2:")) {
                    n5 = 7;
                    s2 = s2.substring("flash2:".length());
                }
                else if (lowerCase.startsWith("flash3:")) {
                    n5 = 8;
                    s2 = s2.substring("flash3:".length());
                }
                else if (lowerCase.startsWith("glow1:")) {
                    n5 = 9;
                    s2 = s2.substring("glow1:".length());
                }
                else if (lowerCase.startsWith("glow2:")) {
                    n5 = 10;
                    s2 = s2.substring("glow2:".length());
                }
                else if (lowerCase.startsWith("glow3:")) {
                    n5 = 11;
                    s2 = s2.substring("glow3:".length());
                }
            }
            final String lowerCase2 = s2.toLowerCase();
            int n6 = 0;
            if (lowerCase2.startsWith("wave:")) {
                n6 = 1;
                s2 = s2.substring("wave:".length());
            }
            else if (lowerCase2.startsWith("wave2:")) {
                n6 = 2;
                s2 = s2.substring("wave2:".length());
            }
            else if (lowerCase2.startsWith("shake:")) {
                n6 = 3;
                s2 = s2.substring("shake:".length());
            }
            else if (lowerCase2.startsWith("scroll:")) {
                n6 = 4;
                s2 = s2.substring("scroll:".length());
            }
            else if (lowerCase2.startsWith("slide:")) {
                n6 = 5;
                s2 = s2.substring("slide:".length());
            }
            else if (Client.field827 != 0) {
                if (lowerCase2.startsWith("wave:")) {
                    n6 = 1;
                    s2 = s2.substring("wave:".length());
                }
                else if (lowerCase2.startsWith("wave2:")) {
                    n6 = 2;
                    s2 = s2.substring("wave2:".length());
                }
                else if (lowerCase2.startsWith("shake:")) {
                    n6 = 3;
                    s2 = s2.substring("shake:".length());
                }
                else if (lowerCase2.startsWith("scroll:")) {
                    n6 = 4;
                    s2 = s2.substring("scroll:".length());
                }
                else if (lowerCase2.startsWith("slide:")) {
                    n6 = 5;
                    s2 = s2.substring("slide:".length());
                }
            }
            final Class172 method437 = Class26.method433(Class169.field2179, Client.field626.field1218);
            method437.field2257.method3532(0);
            final int field2339 = method437.field2257.field2339;
            method437.field2257.method3532(n4);
            method437.field2257.method3532(n5);
            method437.field2257.method3532(n6);
            Class189.method3840(method437.field2257, s2);
            method437.field2257.method3545(method437.field2257.field2339 - field2339);
            Client.field626.method1980(method437);
            return 1;
        }
        if (n == 5009) {
            Class55.field497 -= 2;
            final String s3 = Class69.field1001[Class55.field497];
            final String s4 = Class69.field1001[Class55.field497 + 1];
            final Class172 method438 = Class26.method433(Class169.field2154, Client.field626.field1218);
            method438.field2257.method3755(0);
            final int field2340 = method438.field2257.field2339;
            method438.field2257.method3699(s3);
            Class189.method3840(method438.field2257, s4);
            method438.field2257.method3614(method438.field2257.field2339 - field2340);
            Client.field626.method1980(method438);
            return 1;
        }
        if (n == 5015) {
            String method439;
            if (Class138.field1876 != null && Class138.field1876.field552 != null) {
                method439 = Class138.field1876.field552.method5447();
            }
            else {
                method439 = "";
            }
            Class69.field1001[++Class55.field497 - 1] = method439;
            return 1;
        }
        if (n == 5016) {
            Class69.field999[++Class69.field1003 - 1] = Client.field795;
            return 1;
        }
        if (n == 5017) {
            final int n7 = Class69.field999[--Class69.field1003];
            final int[] field2341 = Class69.field999;
            final int n8 = ++Class69.field1003 - 1;
            final Class86 class85 = (Class86) Class83.field1180.get(n7);
            int method440;
            if (class85 == null) {
                method440 = 0;
            }
            else {
                method440 = class85.method1976();
            }
            field2341[n8] = method440;
            return 1;
        }
        if (n == 5018) {
            Class69.field999[++Class69.field1003 - 1] = Class66.method1621(Class69.field999[--Class69.field1003]);
            return 1;
        }
        if (n == 5019) {
            final int n9 = Class69.field999[--Class69.field1003];
            final int[] field2342 = Class69.field999;
            final int n10 = ++Class69.field1003 - 1;
            final Class58 class86 = (Class58)Class83.field1181.method3945(n9);
            int field2343;
            if (class86 == null) {
                field2343 = -1;
            }
            else if (class86.field2427 == Class83.field1184.field2445) {
                field2343 = -1;
            }
            else {
                field2343 = ((Class58)class86.field2427).field540;
            }
            field2342[n10] = field2343;
            return 1;
        }
        if (n == 5020) {
            Class56.method1031(Class69.field1001[--Class55.field497]);
            return 1;
        }
        if (n == 5021) {
            Client.field796 = Class69.field1001[--Class55.field497].toLowerCase().trim();
            return 1;
        }
        if (n == 5022) {
            Class69.field1001[++Class55.field497 - 1] = Client.field796;
            return 1;
        }
        return 2;
    }
    
    @ObfuscatedName("gn")
    @ObfuscatedSignature(signature = "(ZB)V", garbageValue = "16")
    static final void method137(final boolean b) {
        Class54.method1017();
        final Class87 field626 = Client.field626;
        ++field626.field1224;
        if (Client.field626.field1224 < 50 && !b) {
            return;
        }
        Client.field626.field1224 = 0;
        if (!Client.field756 && Client.field626.method1983() != null) {
            Client.field626.method1980(Class26.method433(Class169.field2211, Client.field626.field1218));
            try {
                Client.field626.method1979();
            }
            catch (IOException ex) {
                Client.field756 = true;
            }
        }
    }
}
