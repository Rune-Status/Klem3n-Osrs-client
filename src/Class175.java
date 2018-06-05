import java.util.zip.Inflater;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fv")
public class Class175
{
    @ObfuscatedName("k")
    static boolean[] field2271;
    @ObfuscatedName("cm")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field2270;
    @ObfuscatedName("z")
    Inflater field2268;
    
    Class175(final int n, final int n2, final int n3) {
    }
    
    public Class175() {
        this(-1, 1000000, 1000000);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lgk;[BI)V", garbageValue = "641933971")
    public void method3483(final Class182 class182, final byte[] array) {
        if (class182.payload[class182.field2339] != 31 || class182.payload[class182.field2339 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2268 == null) {
            this.field2268 = new Inflater(true);
        }
        try {
            this.field2268.setInput(class182.payload, class182.field2339 + 10, class182.payload.length - (class182.field2339 + 8 + 10));
            this.field2268.inflate(array);
        }
        catch (Exception ex) {
            this.field2268.reset();
            throw new RuntimeException("");
        }
        this.field2268.reset();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II)Lii;", garbageValue = "-1879492666")
    public static Class257 method3485(final int n) {
        final Class257 class257 = (Class257)Class257.field3260.method3989(n);
        if (class257 != null) {
            return class257;
        }
        final byte[] method4625 = Class257.field3264.method4625(15, n);
        final Class257 class258 = new Class257();
        if (method4625 != null) {
            class258.method4852(new Class182(method4625));
        }
        Class257.field3260.method3983(class258, n);
        return class258;
    }
    
    @ObfuscatedName("je")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "-6945047")
    static void method3487(final Class182 class182, final int n) {
        final byte[] field2338 = class182.payload;
        if (Client.field620 == null) {
            Client.field620 = new byte[24];
        }
        Class193.method3873(field2338, n, Client.field620, 0, 24);
        Class146.method3190(class182, n);
    }
}
