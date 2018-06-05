import net.runelite.mapping.ObfuscatedSignature;
import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("aq")
public class Class45
{
    @ObfuscatedName("z")
    static Applet field378;
    @ObfuscatedName("w")
    static String field379;
    
    static {
        Class45.field378 = null;
        Class45.field379 = "";
    }
    
    @ObfuscatedName("hl")
    @ObfuscatedSignature(signature = "(IIIILjava/lang/String;B)V", garbageValue = "66")
    static void method747(final int field517, final int n, final int n2, final int n3, final String field518) {
        final Class230 method3191 = Class146.method3191(n, n2);
        if (method3191 == null) {
            return;
        }
        if (method3191.field2706 != null) {
            final Class56 class56 = new Class56();
            class56.field506 = method3191;
            class56.field517 = field517;
            class56.field504 = field518;
            class56.field512 = method3191.field2706;
            Class68.method1696(class56);
        }
        boolean method3192 = true;
        if (method3191.field2609 > 0) {
            method3192 = Class25.method426(method3191);
        }
        if (!method3192) {
            return;
        }
        if ((Class24.method425(method3191) >> field517 - 1 + 1 & 0x1) == 0x0) {
            return;
        }
        if (field517 == 1) {
            final Class172 method3193 = Class26.method433(Class169.field2149, Client.field626.field1218);
            method3193.field2257.method3707(n);
            method3193.field2257.method3755(n2);
            method3193.field2257.method3755(n3);
            Client.field626.method1980(method3193);
        }
        if (field517 == 2) {
            final Class172 method3194 = Class26.method433(Class169.field2141, Client.field626.field1218);
            method3194.field2257.method3707(n);
            method3194.field2257.method3755(n2);
            method3194.field2257.method3755(n3);
            Client.field626.method1980(method3194);
        }
        if (field517 == 3) {
            final Class172 method3195 = Class26.method433(Class169.field2155, Client.field626.field1218);
            method3195.field2257.method3707(n);
            method3195.field2257.method3755(n2);
            method3195.field2257.method3755(n3);
            Client.field626.method1980(method3195);
        }
        if (field517 == 4) {
            final Class172 method3196 = Class26.method433(Class169.field2144, Client.field626.field1218);
            method3196.field2257.method3707(n);
            method3196.field2257.method3755(n2);
            method3196.field2257.method3755(n3);
            Client.field626.method1980(method3196);
        }
        if (field517 == 5) {
            final Class172 method3197 = Class26.method433(Class169.field2213, Client.field626.field1218);
            method3197.field2257.method3707(n);
            method3197.field2257.method3755(n2);
            method3197.field2257.method3755(n3);
            Client.field626.method1980(method3197);
        }
        if (field517 == 6) {
            final Class172 method3198 = Class26.method433(Class169.field2231, Client.field626.field1218);
            method3198.field2257.method3707(n);
            method3198.field2257.method3755(n2);
            method3198.field2257.method3755(n3);
            Client.field626.method1980(method3198);
        }
        if (field517 == 7) {
            final Class172 method3199 = Class26.method433(Class169.field2160, Client.field626.field1218);
            method3199.field2257.method3707(n);
            method3199.field2257.method3755(n2);
            method3199.field2257.method3755(n3);
            Client.field626.method1980(method3199);
        }
        if (field517 == 8) {
            final Class172 method3200 = Class26.method433(Class169.field2226, Client.field626.field1218);
            method3200.field2257.method3707(n);
            method3200.field2257.method3755(n2);
            method3200.field2257.method3755(n3);
            Client.field626.method1980(method3200);
        }
        if (field517 == 9) {
            final Class172 method3201 = Class26.method433(Class169.field2138, Client.field626.field1218);
            method3201.field2257.method3707(n);
            method3201.field2257.method3755(n2);
            method3201.field2257.method3755(n3);
            Client.field626.method1980(method3201);
        }
        if (field517 == 10) {
            final Class172 method3202 = Class26.method433(Class169.field2180, Client.field626.field1218);
            method3202.field2257.method3707(n);
            method3202.field2257.method3755(n2);
            method3202.field2257.method3755(n3);
            Client.field626.method1980(method3202);
        }
    }
    
    @ObfuscatedName("jj")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-65961600")
    static final void method749(final int n) {
        Class295.method5501();
        Class6.method75();
        final int field3230 = Class63.method1549(n).field3230;
        if (field3230 == 0) {
            return;
        }
        final int field3231 = Class225.field2558[n];
        if (field3230 == 1) {
            if (field3231 == 1) {
                Class122.method2830(0.9);
                ((Class111)Class122.field1667).method2544(0.9);
            }
            if (field3231 == 2) {
                Class122.method2830(0.8);
                ((Class111)Class122.field1667).method2544(0.8);
            }
            if (field3231 == 3) {
                Class122.method2830(0.7);
                ((Class111)Class122.field1667).method2544(0.7);
            }
            if (field3231 == 4) {
                Class122.method2830(0.6);
                ((Class111)Class122.field1667).method2544(0.6);
            }
            Class269.field3429.method3984();
        }
        if (field3230 == 3) {
            int n2 = 0;
            if (field3231 == 0) {
                n2 = 255;
            }
            if (field3231 == 1) {
                n2 = 192;
            }
            if (field3231 == 2) {
                n2 = 128;
            }
            if (field3231 == 3) {
                n2 = 64;
            }
            if (field3231 == 4) {
                n2 = 0;
            }
            if (n2 != Client.field811) {
                if (Client.field811 == 0 && Client.field812 != -1) {
                    Class63.method1554(Class80.field1147, Client.field812, 0, n2, false);
                    Client.field813 = false;
                }
                else if (n2 == 0) {
                    Class9.method88();
                    Client.field813 = false;
                }
                else if (Class217.field2460 != 0) {
                    Class309.field3740 = n2;
                }
                else {
                    Class217.field2459.method4236(n2);
                }
                Client.field811 = n2;
            }
        }
        if (field3230 == 4) {
            if (field3231 == 0) {
                Client.field814 = 127;
            }
            if (field3231 == 1) {
                Client.field814 = 96;
            }
            if (field3231 == 2) {
                Client.field814 = 64;
            }
            if (field3231 == 3) {
                Client.field814 = 32;
            }
            if (field3231 == 4) {
                Client.field814 = 0;
            }
        }
        if (field3230 == 5) {
            Client.field715 = field3231;
        }
        if (field3230 == 6) {
            Client.field742 = field3231;
        }
        if (field3230 == 9) {
            Client.field743 = field3231;
        }
        if (field3230 == 10) {
            if (field3231 == 0) {
                Client.field815 = 127;
            }
            if (field3231 == 1) {
                Client.field815 = 96;
            }
            if (field3231 == 2) {
                Client.field815 = 64;
            }
            if (field3231 == 3) {
                Client.field815 = 32;
            }
            if (field3231 == 4) {
                Client.field815 = 0;
            }
        }
        if (field3230 == 17) {
            Client.field748 = (field3231 & 0xFFFF);
        }
        if (field3230 == 18) {
            Client.field607 = (Class77)Class76.method1803(new Class77[] { Class77.field1080, Class77.field1074, Class77.field1075, Class77.field1076 }, field3231);
            if (Client.field607 == null) {
                Client.field607 = Class77.field1080;
            }
        }
        if (field3230 == 19) {
            if (field3231 == -1) {
                Client.field707 = -1;
            }
            else {
                Client.field707 = (field3231 & 0x7FF);
            }
        }
        if (field3230 == 22) {
            Client.field780 = (Class77)Class76.method1803(new Class77[] { Class77.field1080, Class77.field1074, Class77.field1075, Class77.field1076 }, field3231);
            if (Client.field780 == null) {
                Client.field780 = Class77.field1080;
            }
        }
    }
}
