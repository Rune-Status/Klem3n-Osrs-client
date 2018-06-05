import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("en")
public class Class152 extends RuntimeException
{
    @ObfuscatedName("z")
    public static Applet field1938;
    @ObfuscatedName("w")
    public static String field1939;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1026373275)
    public static int field1940;
    @ObfuscatedName("u")
    String field1941;
    @ObfuscatedName("q")
    Throwable field1943;
    
    Class152(final Throwable field1943, final String field1944) {
        this.field1941 = field1944;
        this.field1943 = field1943;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IB)Z", garbageValue = "-105")
    public static boolean method3247(final int n) {
        return n >= Class233.field2759.field2777 && n <= Class233.field2764.field2777;
    }
}
