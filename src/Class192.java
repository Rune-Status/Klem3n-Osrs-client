import net.runelite.mapping.ObfuscatedSignature;
import java.util.TimeZone;
import java.util.Calendar;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gr")
public class Class192
{
    @ObfuscatedName("z")
    public static final String[][] field2392;
    @ObfuscatedName("w")
    public static final String[] field2390;
    @ObfuscatedName("s")
    public static Calendar field2389;
    @ObfuscatedName("n")
    public static boolean field2391;
    
    static {
        field2392 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };
        field2390 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        Class192.field2389 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-953028921")
    public static void method3871() {
        Class227.field2580.method3984();
    }
}
