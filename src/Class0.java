import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("z")
final class Class0 implements Comparator
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field2;
    @ObfuscatedName("jx")
    @ObfuscatedGetter(intValue = 469420815)
    static int field1;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ls;Ls;I)I", garbageValue = "-1267869339")
    int method1(final Class2 class2, final Class2 class3) {
        return (class2.field19 < class3.field19) ? -1 : ((class3.field19 == class2.field19) ? 0 : 1);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method1((Class2)o, (Class2)o2);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1721619760")
    public static void method7() {
        Class23.field188.method3999(5);
        Class23.field189.method3999(5);
    }
}
