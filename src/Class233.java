import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hl")
public enum Class233 implements Class188
{
    field2773("runelite", 0, 0, 0), 
    field2775("runelite", 1, 1, 0), 
    field2755("runelite", 2, 2, 0), 
    field2757("runelite", 3, 3, 0), 
    field2758("runelite", 4, 9, 2), 
    field2754("runelite", 5, 4, 1), 
    field2770("runelite", 6, 5, 1), 
    field2761("runelite", 7, 6, 1), 
    field2762("runelite", 8, 7, 1), 
    field2763("runelite", 9, 8, 1), 
    field2760("runelite", 10, 12, 2), 
    field2765("runelite", 11, 13, 2), 
    field2766("runelite", 12, 14, 2), 
    field2767("runelite", 13, 15, 2), 
    field2768("runelite", 14, 16, 2), 
    field2769("runelite", 15, 17, 2), 
    field2774("runelite", 16, 18, 2), 
    field2771("runelite", 17, 19, 2), 
    field2772("runelite", 18, 20, 2), 
    field2756("runelite", 19, 21, 2), 
    field2759("runelite", 20, 10, 2), 
    field2764("runelite", 21, 11, 2), 
    field2776("runelite", 22, 22, 3);
    
    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = -89106173)
    public final int field2777;
    
    Class233(final String s, final int n, final int field2777, final int n2) {
        this.field2777 = field2777;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "59")
    @Override
    public int vmethod5815() {
        return this.field2777;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(Lir;II)Lly;", garbageValue = "-1839830741")
    public static Class317 method4589(final Class247 class247, final int n) {
        final byte[] method4689 = class247.method4689(n);
        int n2;
        if (method4689 == null) {
            n2 = 0;
        }
        else {
            Class268.method5084(method4689);
            n2 = 1;
        }
        if (n2 == 0) {
            return null;
        }
        return Class305.method5658();
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;B)V", garbageValue = "-31")
    static final void method4588(final String s) {
        Class143.method3172(30, "", s + " is already on your friend list");
    }
}
