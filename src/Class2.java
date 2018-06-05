import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("s")
public class Class2
{
    @ObfuscatedName("ga")
    @ObfuscatedGetter(intValue = -313553599)
    static int field23;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -939579551)
    public final int field19;
    @ObfuscatedName("w")
    @ObfuscatedGetter(longValue = 3949284830848608531L)
    public final long field20;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lu;")
    public final Class4 field17;
    @ObfuscatedName("l")
    String field18;
    @ObfuscatedName("u")
    String field21;
    
    Class2(final Class182 class182, final byte b, final int field29) {
        this.field18 = class182.method3738();
        this.field21 = class182.method3738();
        this.field19 = class182.method3550();
        this.field20 = class182.method3554();
        final int method3671 = class182.method3671();
        final int method3672 = class182.method3671();
        (this.field17 = new Class4()).method44(2);
        this.field17.method40(b);
        this.field17.field30 = method3671;
        this.field17.field33 = method3672;
        this.field17.field32 = 0;
        this.field17.field28 = 0;
        this.field17.field29 = field29;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)Ljava/lang/String;", garbageValue = "1845946507")
    public String method16() {
        return this.field18;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)Ljava/lang/String;", garbageValue = "-1459489481")
    public String method18() {
        return this.field21;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)Ljk;", garbageValue = "-241404147")
    public static Class260 method23(final int n) {
        final Class260 class260 = (Class260)Class260.field3291.method3989(n);
        if (class260 != null) {
            return class260;
        }
        final byte[] method4625 = Class260.field3292.method4625(3, n);
        final Class260 class261 = new Class260();
        if (method4625 != null) {
            class261.method4894(new Class182(method4625));
        }
        Class260.field3291.method3983(class261, n);
        return class261;
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V", garbageValue = "127")
    static void method22(final String field1103, final String field1104, final String field1105) {
        Class78.field1103 = field1103;
        Class78.field1112 = field1104;
        Class78.field1105 = field1105;
    }
}
