import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ca")
public class Class88 extends Class105
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lgn;")
    Class205 field1229;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lgn;")
    Class205 field1230;
    @ObfuscatedName("l")
    int field1231;
    @ObfuscatedName("u")
    int field1232;
    
    public Class88() {
        this.field1229 = new Class205();
        this.field1230 = new Class205();
        this.field1231 = 0;
        this.field1232 = -1;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ldo;)V")
    public final synchronized void method2032(final Class105 class105) {
        this.field1229.method4074(class105);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Ldo;)V")
    public final synchronized void method2009(final Class105 class105) {
        class105.method4064();
    }
    
    @ObfuscatedName("s")
    void method2010() {
        if (this.field1231 > 0) {
            for (Class100 class100 = (Class100)this.field1230.method4098(); class100 != null; class100 = (Class100)this.field1230.method4079()) {
                final Class100 class101 = class100;
                class101.field1338 -= this.field1231;
            }
            this.field1232 -= this.field1231;
            this.field1231 = 0;
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lga;Lcz;)V")
    void method2011(Class204 field2422, final Class100 class100) {
        while (this.field1230.field2425 != field2422 && ((Class100)field2422).field1338 <= class100.field1338) {
            field2422 = field2422.field2422;
        }
        Class205.method4075(class100, field2422);
        this.field1232 = ((Class100)this.field1230.field2425.field2422).field1338;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Lcz;)V")
    void method2008(final Class100 class100) {
        class100.method4064();
        class100.method2231();
        final Class204 field2422 = this.field1230.field2425.field2422;
        if (field2422 == this.field1230.field2425) {
            this.field1232 = -1;
        }
        else {
            this.field1232 = ((Class100)field2422).field1338;
        }
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "()Ldo;")
    @Override
    protected Class105 vmethod4382() {
        return (Class105)this.field1229.method4098();
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "()Ldo;")
    @Override
    protected Class105 vmethod4389() {
        return (Class105)this.field1229.method4079();
    }
    
    @ObfuscatedName("x")
    @Override
    protected int vmethod4395() {
        return 0;
    }
    
    @ObfuscatedName("e")
    public final synchronized void vmethod4385(final int[] array, int n, int n2) {
        while (this.field1232 >= 0) {
            if (n2 + this.field1231 < this.field1232) {
                this.field1231 += n2;
                this.method2042(array, n, n2);
                return;
            }
            final int n3 = this.field1232 - this.field1231;
            this.method2042(array, n, n3);
            n += n3;
            n2 -= n3;
            this.field1231 += n3;
            this.method2010();
            final Class100 class100 = (Class100)this.field1230.method4098();
            synchronized (class100) {
                final int method2232 = class100.method2232();
                if (method2232 < 0) {
                    class100.field1338 = 0;
                    this.method2008(class100);
                }
                else {
                    class100.field1338 = method2232;
                    this.method2011(class100.field2422, class100);
                }
            }
            if (n2 == 0) {
                return;
            }
        }
        this.method2042(array, n, n2);
    }
    
    @ObfuscatedName("p")
    void method2042(final int[] array, final int n, final int n2) {
        for (Class105 class105 = (Class105)this.field1229.method4098(); class105 != null; class105 = (Class105)this.field1229.method4079()) {
            class105.method2439(array, n, n2);
        }
    }
    
    @ObfuscatedName("b")
    public final synchronized void vmethod4386(int n) {
        while (this.field1232 >= 0) {
            if (this.field1231 + n < this.field1232) {
                this.field1231 += n;
                this.method2025(n);
                return;
            }
            final int n2 = this.field1232 - this.field1231;
            this.method2025(n2);
            n -= n2;
            this.field1231 += n2;
            this.method2010();
            final Class100 class100 = (Class100)this.field1230.method4098();
            synchronized (class100) {
                final int method2232 = class100.method2232();
                if (method2232 < 0) {
                    class100.field1338 = 0;
                    this.method2008(class100);
                }
                else {
                    class100.field1338 = method2232;
                    this.method2011(class100.field2422, class100);
                }
            }
            if (n == 0) {
                return;
            }
        }
        this.method2025(n);
    }
    
    @ObfuscatedName("n")
    void method2025(final int n) {
        for (Class105 class105 = (Class105)this.field1229.method4098(); class105 != null; class105 = (Class105)this.field1229.method4079()) {
            class105.vmethod4386(n);
        }
    }
}
