import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cf")
public class Class87
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lfd;")
    Class157 field1214;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgy;")
    Class203 field1223;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1758377903)
    int field1216;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lgk;")
    Class182 field1217;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Lgs;")
    public Class190 field1218;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Lgi;")
    Class189 field1219;
    @ObfuscatedName("k")
    @ObfuscatedSignature(signature = "Lfj;")
    Class168 field1220;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 321778423)
    int field1225;
    @ObfuscatedName("x")
    boolean field1222;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 590402107)
    int field1228;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -856359331)
    int field1224;
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "Lfj;")
    Class168 field1215;
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "Lfj;")
    Class168 field1226;
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "Lfj;")
    Class168 field1227;
    
    Class87() {
        this.field1223 = new Class203();
        this.field1216 = 0;
        this.field1217 = new Class182(5000);
        this.field1219 = new Class189(40000);
        this.field1220 = null;
        this.field1225 = 0;
        this.field1222 = true;
        this.field1228 = 0;
        this.field1224 = 0;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "54")
    final void method1978() {
        this.field1223.method4030();
        this.field1216 = 0;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "86")
    final void method1979() throws IOException {
        if (this.field1214 != null && this.field1216 > 0) {
            this.field1217.field2339 = 0;
            while (true) {
                final Class172 class172 = (Class172)this.field1223.method4048();
                if (class172 == null || class172.field2255 > this.field1217.payload.length - this.field1217.field2339) {
                    break;
                }
                this.field1217.method3542(class172.field2257.payload, 0, class172.field2255);
                this.field1216 -= class172.field2255;
                class172.method4064();
                class172.field2257.method3531();
                class172.method3460();
            }
            this.field1214.vmethod3347(this.field1217.payload, 0, this.field1217.field2339);
            this.field1224 = 0;
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lfn;B)V", garbageValue = "1")
    public final void method1980(final Class172 class172) {
        this.field1223.method4031(class172);
        class172.field2255 = class172.field2257.field2339;
        class172.field2257.field2339 = 0;
        this.field1216 += class172.field2255;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lfd;I)V", garbageValue = "1571266841")
    void method1997(final Class157 field1214) {
        this.field1214 = field1214;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(S)V", garbageValue = "822")
    void method1982() {
        if (this.field1214 != null) {
            this.field1214.vmethod3346();
            this.field1214 = null;
        }
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "1")
    void method1984() {
        this.field1214 = null;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)Lfd;", garbageValue = "-1005622173")
    Class157 method1983() {
        return this.field1214;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lir;Lir;ZII)V", garbageValue = "1336777365")
    static void method1994(final Class247 class247, final Class247 class248, final boolean b, final int field1081) {
        if (Class78.field1101) {
            if (field1081 == 4) {
                Class78.field1081 = 4;
            }
            return;
        }
        Class78.field1081 = field1081;
        Class314.method5724();
        Class78.field1092 = Class284.method5324(class247.method4684("title.jpg", ""));
        Class78.field1087 = Class78.field1092.method5840();
        if ((Client.field632 & 0x20000000) != 0x0) {
            Class78.field1117 = Class221.method4374(class248, "logo_deadman_mode", "");
        }
        else {
            Class78.field1117 = Class221.method4374(class248, "logo", "");
        }
        Class78.field1083 = Class221.method4374(class248, "titlebox", "");
        Class78.field1084 = Class221.method4374(class248, "titlebutton", "");
        Class78.field1111 = Class13.method113(class248, "runes", "");
        Class124.field1708 = Class13.method113(class248, "title_mute", "");
        Class235.field2783 = Class221.method4374(class248, "options_radio_buttons,0", "");
        Class102.field1352 = Class221.method4374(class248, "options_radio_buttons,4", "");
        Class78.field1089 = Class221.method4374(class248, "options_radio_buttons,2", "");
        Class53.field472 = Class221.method4374(class248, "options_radio_buttons,6", "");
        Class67.field978 = Class235.field2783.field3780;
        Class66.field966 = Class235.field2783.field3781;
        Class64.field936 = new int[256];
        for (int i = 0; i < 64; ++i) {
            Class64.field936[i] = i * 262144;
        }
        for (int j = 0; j < 64; ++j) {
            Class64.field936[j + 64] = j * 1024 + 16711680;
        }
        for (int k = 0; k < 64; ++k) {
            Class64.field936[k + 128] = k * 4 + 16776960;
        }
        for (int l = 0; l < 64; ++l) {
            Class64.field936[l + 192] = 16777215;
        }
        Class185.field2364 = new int[256];
        for (int n = 0; n < 64; ++n) {
            Class185.field2364[n] = n * 1024;
        }
        for (int n2 = 0; n2 < 64; ++n2) {
            Class185.field2364[n2 + 64] = n2 * 4 + 65280;
        }
        for (int n3 = 0; n3 < 64; ++n3) {
            Class185.field2364[n3 + 128] = n3 * 262144 + 65535;
        }
        for (int n4 = 0; n4 < 64; ++n4) {
            Class185.field2364[n4 + 192] = 16777215;
        }
        Class11.field69 = new int[256];
        for (int n5 = 0; n5 < 64; ++n5) {
            Class11.field69[n5] = n5 * 4;
        }
        for (int n6 = 0; n6 < 64; ++n6) {
            Class11.field69[n6 + 64] = n6 * 262144 + 255;
        }
        for (int n7 = 0; n7 < 64; ++n7) {
            Class11.field69[n7 + 128] = n7 * 1024 + 16711935;
        }
        for (int n8 = 0; n8 < 64; ++n8) {
            Class11.field69[n8 + 192] = 16777215;
        }
        Class77.field1077 = new int[256];
        Class186.field2367 = new int[32768];
        Class81.field1169 = new int[32768];
        Class67.method1682(null);
        Class40.field357 = new int[32768];
        Class76.field1073 = new int[32768];
        if (b) {
            Class78.field1106 = "";
            Class78.field1086 = "";
        }
        Class14.field104 = 0;
        Class28.field238 = "";
        Class78.field1104 = true;
        Class78.field1107 = false;
        if (!Class10.field61.field958) {
            Class23.method422(2, Class80.field1147, "scape main", "", 255, false);
        }
        else {
            Class26.method427(2);
        }
        Class222.method4410(false);
        Class78.field1101 = true;
        Class78.field1082 = (Class82.field1179 - 765) / 2;
        Class78.field1090 = Class78.field1082 + 202;
        Class78.field1091 = Class78.field1090 + 180;
        Class78.field1092.method5849(Class78.field1082, 0);
        Class78.field1087.method5849(Class78.field1082 + 382, 0);
        Class78.field1117.method5829(Class78.field1082 + 382 - Class78.field1117.field3780 / 2, 18);
    }
    
    @ObfuscatedName("fh")
    @ObfuscatedSignature(signature = "(ZI)V", garbageValue = "-72700836")
    static final void method2005(final boolean b) {
        if (b) {
            Client.field619 = (Class78.field1104 ? Class146.field1910 : Class146.field1905);
        }
        else {
            Client.field619 = (Class10.field61.field963.containsKey(Class3.method35(Class78.field1106)) ? Class146.field1908 : Class146.field1907);
        }
    }
}
