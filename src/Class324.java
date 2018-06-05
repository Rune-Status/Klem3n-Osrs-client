import net.runelite.mapping.ObfuscatedSignature;
import java.util.Random;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("lg")
public class Class324 extends Class204
{
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -438996515)
    int field3911;
    @ObfuscatedName("k")
    boolean field3892;
    @ObfuscatedName("af")
    @ObfuscatedGetter(intValue = -778326201)
    int field3895;
    @ObfuscatedName("an")
    @ObfuscatedGetter(intValue = -1703178915)
    int field3896;
    @ObfuscatedName("ao")
    @ObfuscatedGetter(intValue = 2041961125)
    int field3897;
    @ObfuscatedName("at")
    @ObfuscatedGetter(intValue = -1684217887)
    int field3898;
    @ObfuscatedName("ai")
    @ObfuscatedGetter(intValue = 546169143)
    int field3900;
    @ObfuscatedName("ac")
    boolean field3891;
    @ObfuscatedName("ap")
    @ObfuscatedGetter(intValue = 1784732867)
    int field3901;
    @ObfuscatedName("ar")
    @ObfuscatedGetter(intValue = 170995375)
    int field3902;
    @ObfuscatedName("av")
    @ObfuscatedGetter(intValue = -397278319)
    int field3906;
    @ObfuscatedName("al")
    @ObfuscatedGetter(intValue = 7624373)
    int field3904;
    @ObfuscatedName("ae")
    String field3905;
    @ObfuscatedName("az")
    String field3914;
    @ObfuscatedName("aq")
    String field3907;
    @ObfuscatedName("ad")
    String field3908;
    @ObfuscatedName("aj")
    @ObfuscatedGetter(intValue = -2092428531)
    int field3909;
    @ObfuscatedName("ax")
    @ObfuscatedGetter(intValue = 1126186449)
    int field3910;
    @ObfuscatedName("am")
    @ObfuscatedGetter(intValue = 1538474183)
    int field3889;
    @ObfuscatedName("ay")
    @ObfuscatedGetter(intValue = 351520139)
    int field3912;
    @ObfuscatedName("ag")
    String field3913;
    @ObfuscatedName("bk")
    String field3894;
    @ObfuscatedName("bp")
    int[] field3915;
    @ObfuscatedName("bi")
    @ObfuscatedGetter(intValue = -1130492829)
    int field3916;
    
    public Class324(final boolean b) {
        this.field3915 = new int[3];
        if (Class75.field1065.startsWith("win")) {
            this.field3911 = 1;
        }
        else if (Class75.field1065.startsWith("mac")) {
            this.field3911 = 2;
        }
        else if (Class75.field1065.startsWith("linux")) {
            this.field3911 = 3;
        }
        else {
            this.field3911 = 4;
        }
        String lowerCase;
        try {
            lowerCase = System.getProperty("os.arch").toLowerCase();
        }
        catch (Exception ex) {
            lowerCase = "";
        }
        String lowerCase2;
        try {
            lowerCase2 = System.getProperty("os.version").toLowerCase();
        }
        catch (Exception ex2) {
            lowerCase2 = "";
        }
        String property = "Unknown";
        String property2 = "1.1";
        try {
            property = System.getProperty("java.vendor");
            property2 = System.getProperty("java.version");
        }
        catch (Exception ex3) {}
        if (lowerCase.startsWith("amd64") || lowerCase.startsWith("x86_64")) {
            this.field3892 = true;
        }
        else {
            this.field3892 = false;
        }
        if (this.field3911 == 1) {
            if (lowerCase2.indexOf("4.0") != -1) {
                this.field3895 = 1;
            }
            else if (lowerCase2.indexOf("4.1") != -1) {
                this.field3895 = 2;
            }
            else if (lowerCase2.indexOf("4.9") != -1) {
                this.field3895 = 3;
            }
            else if (lowerCase2.indexOf("5.0") != -1) {
                this.field3895 = 4;
            }
            else if (lowerCase2.indexOf("5.1") != -1) {
                this.field3895 = 5;
            }
            else if (lowerCase2.indexOf("5.2") != -1) {
                this.field3895 = 8;
            }
            else if (lowerCase2.indexOf("6.0") != -1) {
                this.field3895 = 6;
            }
            else if (lowerCase2.indexOf("6.1") != -1) {
                this.field3895 = 7;
            }
            else if (lowerCase2.indexOf("6.2") != -1) {
                this.field3895 = 9;
            }
            else if (lowerCase2.indexOf("6.3") != -1) {
                this.field3895 = 10;
            }
            else if (lowerCase2.indexOf("10.0") != -1) {
                this.field3895 = 11;
            }
        }
        else if (this.field3911 == 2) {
            if (lowerCase2.indexOf("10.4") != -1) {
                this.field3895 = 20;
            }
            else if (lowerCase2.indexOf("10.5") != -1) {
                this.field3895 = 21;
            }
            else if (lowerCase2.indexOf("10.6") != -1) {
                this.field3895 = 22;
            }
            else if (lowerCase2.indexOf("10.7") != -1) {
                this.field3895 = 23;
            }
            else if (lowerCase2.indexOf("10.8") != -1) {
                this.field3895 = 24;
            }
            else if (lowerCase2.indexOf("10.9") != -1) {
                this.field3895 = 25;
            }
            else if (lowerCase2.indexOf("10.10") != -1) {
                this.field3895 = 26;
            }
            else if (lowerCase2.indexOf("10.11") != -1) {
                this.field3895 = 27;
            }
        }
        if (property.toLowerCase().indexOf("sun") != -1) {
            this.field3896 = 1;
        }
        else if (property.toLowerCase().indexOf("microsoft") != -1) {
            this.field3896 = 2;
        }
        else if (property.toLowerCase().indexOf("apple") != -1) {
            this.field3896 = 3;
        }
        else if (property.toLowerCase().indexOf("oracle") != -1) {
            this.field3896 = 5;
        }
        else {
            this.field3896 = 4;
        }
        int i = 2;
        int field3897 = 0;
        try {
            while (i < property2.length()) {
                final char char1 = property2.charAt(i);
                if (char1 < '0' || char1 > '9') {
                    break;
                }
                field3897 = field3897 * 10 + (char1 - '0');
                ++i;
            }
        }
        catch (Exception ex4) {}
        this.field3897 = field3897;
        int j = property2.indexOf(46, 2) + 1;
        int field3898 = 0;
        try {
            while (j < property2.length()) {
                final char char2 = property2.charAt(j);
                if (char2 < '0' || char2 > '9') {
                    break;
                }
                field3898 = field3898 * 10 + (char2 - '0');
                ++j;
            }
        }
        catch (Exception ex5) {}
        this.field3898 = field3898;
        int k = property2.indexOf(95, 4) + 1;
        int field3899 = 0;
        try {
            while (k < property2.length()) {
                final char char3 = property2.charAt(k);
                if (char3 < '0' || char3 > '9') {
                    break;
                }
                field3899 = field3899 * 10 + (char3 - '0');
                ++k;
            }
        }
        catch (Exception ex6) {}
        this.field3900 = field3899;
        this.field3891 = false;
        Runtime.getRuntime();
        this.field3901 = (int)((new Random().nextInt(31457280) + 230686720) / 1048576L) + 1;
        if (this.field3897 > 3) {
            this.field3902 = Runtime.getRuntime().availableProcessors();
        }
        else {
            this.field3902 = 0;
        }
        this.field3906 = 0;
        if (this.field3905 == null) {
            this.field3905 = "";
        }
        if (this.field3914 == null) {
            this.field3914 = "";
        }
        if (this.field3907 == null) {
            this.field3907 = "";
        }
        if (this.field3908 == null) {
            this.field3908 = "";
        }
        if (this.field3913 == null) {
            this.field3913 = "";
        }
        if (this.field3894 == null) {
            this.field3894 = "";
        }
        this.method6211();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-5446469")
    void method6211() {
        if (this.field3905.length() > 40) {
            this.field3905 = this.field3905.substring(0, 40);
        }
        if (this.field3914.length() > 40) {
            this.field3914 = this.field3914.substring(0, 40);
        }
        if (this.field3907.length() > 10) {
            this.field3907 = this.field3907.substring(0, 10);
        }
        if (this.field3908.length() > 10) {
            this.field3908 = this.field3908.substring(0, 10);
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;S)V", garbageValue = "8212")
    public void method6217(final Class182 class182) {
        class182.method3532(6);
        class182.method3532(this.field3911);
        class182.method3532(this.field3892 ? 1 : 0);
        class182.method3532(this.field3895);
        class182.method3532(this.field3896);
        class182.method3532(this.field3897);
        class182.method3532(this.field3898);
        class182.method3532(this.field3900);
        class182.method3532(this.field3891 ? 1 : 0);
        class182.method3755(this.field3901);
        class182.method3532(this.field3902);
        class182.method3534(this.field3906);
        class182.method3755(this.field3904);
        class182.method3540(this.field3905);
        class182.method3540(this.field3914);
        class182.method3540(this.field3907);
        class182.method3540(this.field3908);
        class182.method3532(this.field3910);
        class182.method3755(this.field3909);
        class182.method3540(this.field3913);
        class182.method3540(this.field3894);
        class182.method3532(this.field3889);
        class182.method3532(this.field3912);
        for (int i = 0; i < this.field3915.length; ++i) {
            class182.method3707(this.field3915[i]);
        }
        class182.method3707(this.field3916);
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-782378364")
    public int method6215() {
        return this.field3894.length() + 2 + (this.field3908.length() + 2 + (this.field3907.length() + 2 + (this.field3914.length() + 2 + (this.field3905.length() + 2 + 38))) + (this.field3913.length() + 2));
    }
}
