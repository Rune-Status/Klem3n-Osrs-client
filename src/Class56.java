import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bo")
public class Class56 extends Class204
{
    @ObfuscatedName("z")
    Object[] field512;
    @ObfuscatedName("w")
    boolean field505;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lhi;")
    Class230 field506;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1049191845)
    int field511;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 1598662979)
    int field508;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 879102033)
    int field517;
    @ObfuscatedName("k")
    @ObfuscatedSignature(signature = "Lhi;")
    Class230 field507;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -1181936113)
    int field509;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 1478440877)
    int field513;
    @ObfuscatedName("e")
    String field504;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -1140422785)
    int field514;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = 285302449)
    int field515;
    
    public Class56() {
        this.field515 = 76;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "([Ljava/lang/Object;B)V", garbageValue = "-106")
    public void method1024(final Object[] field512) {
        this.field512 = field512;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-529454320")
    public void method1025(final int field515) {
        this.field515 = field515;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(ZI)V", garbageValue = "1438520718")
    static void method1030(final boolean b) {
        Class78.field1103 = "";
        Class78.field1112 = "Enter your username/email & password.";
        Class78.field1105 = "";
        Class78.field1081 = 2;
        if (b) {
            Class78.field1086 = "";
        }
        if (Class78.field1106 == null || Class78.field1106.length() <= 0) {
            if (Class10.field61.field959 != null) {
                Class78.field1106 = Class10.field61.field959;
                Class78.field1108 = true;
            }
            else {
                Class78.field1108 = false;
            }
        }
        Class34.method586();
    }
    
    @ObfuscatedName("fg")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;B)V", garbageValue = "54")
    static final void method1031(final String s) {
        if (s.equalsIgnoreCase("toggleroof")) {
            Class10.field61.field960 = !Class10.field61.field960;
            Class54.method1018();
            if (Class10.field61.field960) {
                Class143.method3172(99, "", "Roofs are now all hidden");
            }
            else {
                Class143.method3172(99, "", "Roofs will only be removed selectively");
            }
        }
        if (s.equalsIgnoreCase("displayfps")) {
            Client.field597 = !Client.field597;
        }
        if (s.equalsIgnoreCase("renderself")) {
            Client.field699 = !Client.field699;
        }
        if (s.equalsIgnoreCase("mouseovertext")) {
            Client.field728 = !Client.field728;
        }
        if (Client.field747 >= 2) {
            if (s.equalsIgnoreCase("showcoord")) {
                Class53.field476.field3839 = !Class53.field476.field3839;
            }
            if (s.equalsIgnoreCase("fpson")) {
                Client.field597 = true;
            }
            if (s.equalsIgnoreCase("fpsoff")) {
                Client.field597 = false;
            }
            if (s.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (s.equalsIgnoreCase("clientdrop")) {
                Class30.method516();
            }
        }
        final Class172 method433 = Class26.method433(Class169.field2187, Client.field626.field1218);
        method433.field2257.method3532(s.length() + 1);
        method433.field2257.method3699(s);
        Client.field626.method1980(method433);
    }
    
    @ObfuscatedName("io")
    @ObfuscatedSignature(signature = "(Lhi;Ljt;IIZI)V", garbageValue = "-2096518256")
    static final void method1027(final Class230 class230, final Class269 class231, final int n, final int n2, final boolean b) {
        final String[] field3425 = class231.field3425;
        int n3 = -1;
        String s = null;
        if (field3425 != null && field3425[n2] != null) {
            if (n2 == 0) {
                n3 = 33;
            }
            else if (n2 == 1) {
                n3 = 34;
            }
            else if (n2 == 2) {
                n3 = 35;
            }
            else if (n2 == 3) {
                n3 = 36;
            }
            else {
                n3 = 37;
            }
            s = field3425[n2];
        }
        else if (n2 == 4) {
            n3 = 37;
            s = "Drop";
        }
        if (n3 != -1 && s != null) {
            Class243.method4612(s, Class6.method71(16748608) + class231.field3433, n3, class231.field3431, n, class230.field2691, b);
        }
    }
}
