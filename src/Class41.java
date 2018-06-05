import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("av")
public class Class41
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", garbageValue = "-2076101299")
    public static Object method702(final Applet applet, final String s) throws Throwable {
        return JSObject.getWindow(applet).call(s, (Object[])null);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;", garbageValue = "2114895599")
    public static Object method700(final Applet applet, final String s, final Object[] array) throws Throwable {
        return JSObject.getWindow(applet).call(s, array);
    }
}
