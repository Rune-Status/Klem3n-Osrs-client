import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("iv")
public class Class248 implements Runnable
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lgn;")
    static Class205 field3182;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgn;")
    static Class205 field3180;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -580590333)
    public static int field3179;
    @ObfuscatedName("l")
    public static Object field3184;
    @ObfuscatedName("u")
    static Thread field3183;
    
    static {
        Class248.field3182 = new Class205();
        Class248.field3180 = new Class205();
        Class248.field3179 = 0;
        Class248.field3184 = new Object();
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                final Class245 class245;
                synchronized (Class248.field3182) {
                    class245 = (Class245)Class248.field3182.method4098();
                }
                if (class245 != null) {
                    if (class245.field3150 == 0) {
                        class245.field3151.method3371((int)class245.field2421, class245.field3149, class245.field3149.length);
                        synchronized (Class248.field3182) {
                            class245.method4064();
                        }
                    }
                    else if (class245.field3150 == 1) {
                        class245.field3149 = class245.field3151.method3372((int)class245.field2421);
                        synchronized (Class248.field3182) {
                            Class248.field3180.method4073(class245);
                        }
                    }
                    synchronized (Class248.field3184) {
                        if (Class248.field3179 <= 1) {
                            Class248.field3179 = 0;
                            Class248.field3184.notifyAll();
                            return;
                        }
                        Class248.field3179 = 600;
                    }
                }
                else {
                    Class63.method1539(100L);
                    synchronized (Class248.field3184) {
                        if (Class248.field3179 <= 1) {
                            Class248.field3179 = 0;
                            Class248.field3184.notifyAll();
                            return;
                        }
                        --Class248.field3179;
                    }
                }
            }
        }
        catch (Exception ex) {
            Class5.method65(null, ex);
        }
    }
}
