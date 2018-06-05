import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gl")
public final class Class201
{
    @ObfuscatedName("z")
    int field2410;
    @ObfuscatedName("w")
    int field2411;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lgu;")
    Class197 field2412;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lhj;")
    Class215 field2413;
    
    public Class201(final int n, final int n2) {
        this.field2413 = new Class215();
        this.field2410 = n;
        this.field2411 = n;
        int n3;
        for (n3 = 1; n3 + n3 < n && n3 < n2; n3 += n3) {}
        this.field2412 = new Class197(n3);
    }
    
    @ObfuscatedName("z")
    public Object method3997(final long n) {
        final Class212 class212 = (Class212)this.field2412.method3945(n);
        if (class212 == null) {
            return null;
        }
        final Object vmethod4137 = class212.vmethod4137();
        if (vmethod4137 == null) {
            class212.method4064();
            class212.method4101();
            this.field2411 += class212.field2439;
            return null;
        }
        if (class212.vmethod4136()) {
            final Class196 class213 = new Class196(vmethod4137, class212.field2439);
            this.field2412.method3944(class213, class212.field2421);
            this.field2413.method4155(class213);
            class213.field2428 = 0L;
            class212.method4064();
            class212.method4101();
        }
        else {
            this.field2413.method4155(class212);
            class212.field2428 = 0L;
        }
        return vmethod4137;
    }
    
    @ObfuscatedName("w")
    void method3993(final long n) {
        this.method3996((Class212)this.field2412.method3945(n));
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lhh;)V")
    void method3996(final Class212 class212) {
        if (class212 != null) {
            class212.method4064();
            class212.method4101();
            this.field2411 += class212.field2439;
        }
    }
    
    @ObfuscatedName("l")
    public void method4007(final Object o, final long n) {
        this.method3998(o, n, 1);
    }
    
    @ObfuscatedName("u")
    public void method3998(final Object o, final long n, final int n2) {
        if (n2 > this.field2410) {
            throw new IllegalStateException();
        }
        this.method3993(n);
        this.field2411 -= n2;
        while (this.field2411 < 0) {
            this.method3996((Class212)this.field2413.method4156());
        }
        final Class196 class196 = new Class196(o, n2);
        this.field2412.method3944(class196, n);
        this.field2413.method4155(class196);
        class196.field2428 = 0L;
    }
    
    @ObfuscatedName("q")
    public void method3999(final int n) {
        for (Class212 class212 = (Class212)this.field2413.method4177(); class212 != null; class212 = (Class212)this.field2413.method4159()) {
            if (class212.vmethod4136()) {
                if (class212.vmethod4137() == null) {
                    class212.method4064();
                    class212.method4101();
                    this.field2411 += class212.field2439;
                }
            }
            else {
                final Class212 class213 = class212;
                final long field2428 = class213.field2428 + 1L;
                class213.field2428 = field2428;
                if (field2428 > n) {
                    final Class207 class214 = new Class207(class212.vmethod4137(), class212.field2439);
                    this.field2412.method3944(class214, class212.field2421);
                    Class194.method3909(class214, class212);
                    class212.method4064();
                    class212.method4101();
                }
            }
        }
    }
    
    @ObfuscatedName("i")
    public void method4006() {
        this.field2413.method4168();
        this.field2412.method3951();
        this.field2411 = this.field2410;
    }
}
