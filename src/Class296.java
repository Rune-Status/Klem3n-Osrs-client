import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("kv")
public class Class296
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    Class247 field3681;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lir;")
    Class247 field3679;
    @ObfuscatedName("s")
    HashMap field3680;
    
    public Class296(final Class247 field3681, final Class247 field3682) {
        this.field3681 = field3681;
        this.field3679 = field3682;
        this.field3680 = new HashMap();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "([Lkc;B)Ljava/util/HashMap;", garbageValue = "-33")
    public HashMap method5504(final Class295[] array) {
        final HashMap<Class295, Class298> hashMap = new HashMap<Class295, Class298>();
        for (int i = 0; i < array.length; ++i) {
            final Class295 class295 = array[i];
            if (this.field3680.containsKey(class295)) {
                hashMap.put(class295, (Class298)this.field3680.get(class295));
            }
            else {
                final Class247 field3681 = this.field3681;
                final Class247 field3682 = this.field3679;
                final int method4642 = field3681.method4642(class295.field3666);
                final Class298 method4643 = Class58.method1058(field3681, field3682, method4642, field3681.method4643(method4642, ""));
                if (method4643 != null) {
                    this.field3680.put(class295, method4643);
                    hashMap.put(class295, method4643);
                }
            }
        }
        return hashMap;
    }
}
