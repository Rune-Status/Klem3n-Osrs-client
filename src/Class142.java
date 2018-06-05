import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("eu")
public class Class142 extends Class283
{
    @ObfuscatedName("z")
    final boolean field1890;
    
    public Class142(final boolean field1890) {
        this.field1890 = field1890;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lkz;Lkz;I)I", garbageValue = "-879071974")
    int method3164(final Class287 class287, final Class287 class288) {
        if (class287.field3628 != 0) {
            if (class288.field3628 == 0) {
                return this.field1890 ? -1 : 1;
            }
        }
        else if (class288.field3628 != 0) {
            return this.field1890 ? 1 : -1;
        }
        return this.method5308(class287, class288);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method3164((Class287)o, (Class287)o2);
    }
    
    @ObfuscatedName("jf")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;ZB)Ljava/lang/String;", garbageValue = "20")
    static String method3161(String s, final boolean b) {
        final String s2 = b ? "https://" : "http://";
        if (Client.field777 == 1) {
            s += "-wtrc";
        }
        else if (Client.field777 == 2) {
            s += "-wtqa";
        }
        else if (Client.field777 == 3) {
            s += "-wtwip";
        }
        else if (Client.field777 == 5) {
            s += "-wti";
        }
        else if (Client.field777 == 4) {
            s = "local";
        }
        String string = "";
        if (Class163.field2013 != null) {
            string = "/p=" + Class163.field2013;
        }
        return s2 + s + "." + "runescape.com" + "/l=" + Client.field827 + "/a=" + Class124.field1709 + string + "/";
    }
}
