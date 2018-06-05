import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("v")
public class Class25
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lv;")
    static final Class25 field212;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lv;")
    static final Class25 field209;
    @ObfuscatedName("c")
    static int[] tt;
    @ObfuscatedName("fn")
    @ObfuscatedSignature(signature = "[Lly;")
    static Class317[] field214;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1536539371)
    final int field211;
    
    static {
        field212 = new Class25(0);
        field209 = new Class25(1);
    }
    
    Class25(final int field211) {
        this.field211 = field211;
    }
    
    @ObfuscatedName("jd")
    @ObfuscatedSignature(signature = "(Lhi;I)Z", garbageValue = "2065048163")
    static final boolean method426(final Class230 class230) {
        final int field2609 = class230.field2609;
        if (field2609 == 205) {
            Client.field627 = 250;
            return true;
        }
        if (field2609 >= 300 && field2609 <= 313) {
            Client.field841.method4478((field2609 - 300) / 2, (field2609 & 0x1) == 0x1);
        }
        if (field2609 >= 314 && field2609 <= 323) {
            Client.field841.method4493((field2609 - 314) / 2, (field2609 & 0x1) == 0x1);
        }
        if (field2609 == 324) {
            Client.field841.method4465(false);
        }
        if (field2609 == 325) {
            Client.field841.method4465(true);
        }
        if (field2609 == 326) {
            final Class172 method433 = Class26.method433(Class169.field2173, Client.field626.field1218);
            Client.field841.method4466(method433.field2257);
            Client.field626.method1980(method433);
            return true;
        }
        return false;
    }
}
