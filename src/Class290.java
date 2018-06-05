import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("kf")
public class Class290 extends Class285
{
    @ObfuscatedName("dw")
    @ObfuscatedGetter(intValue = -2042738183)
    static int field3636;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Llm;")
    final Class322 field3635;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -720372311)
    int field3637;
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "Lhp;")
    public Class208 field3639;
    
    public Class290(final Class322 field3635) {
        super(400);
        this.field3637 = 1;
        this.field3639 = new Class208();
        this.field3635 = field3635;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)Ljx;", garbageValue = "2139940378")
    @Override
    Class282 vmethod5461() {
        return new Class292();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)[Ljx;", garbageValue = "828432673")
    @Override
    Class282[] vmethod5462(final int n) {
        return new Class292[n];
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lkm;ZI)Z", garbageValue = "1240127676")
    public boolean method5423(final Class291 class291, final boolean b) {
        final Class292 class292 = (Class292)this.method5330(class291);
        return class292 != null && (!b || class292.field3628 != 0);
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "1284102001")
    public void method5424(final Class182 class182, final int n) {
        while (class182.field2339 < n) {
            final boolean b = class182.method3544() == 1;
            final Class291 class183 = new Class291(class182.method3738(), this.field3635);
            final Class291 class184 = new Class291(class182.method3738(), this.field3635);
            final int method3550 = class182.method3550();
            final int method3551 = class182.method3544();
            final int method3552 = class182.method3544();
            final boolean field3648 = (method3552 & 0x2) != 0x0;
            final boolean field3649 = (method3552 & 0x1) != 0x0;
            if (method3550 > 0) {
                class182.method3738();
                class182.method3544();
                class182.method3671();
            }
            class182.method3738();
            if (class183 == null || !class183.method5441()) {
                throw new IllegalStateException();
            }
            Class292 class185 = (Class292)this.method5331(class183);
            if (b) {
                final Class292 class186 = (Class292)this.method5331(class184);
                if (class186 != null && class186 != class185) {
                    if (class185 != null) {
                        this.method5334(class186);
                    }
                    else {
                        class185 = class186;
                    }
                }
            }
            if (class185 != null) {
                this.method5338(class185, class183, class184);
                if (method3550 != class185.field3628) {
                    boolean b2 = true;
                    for (Class294 class187 = (Class294)this.field3639.method4111(); class187 != null; class187 = (Class294)this.field3639.method4114()) {
                        if (class187.field3662.equals(class183)) {
                            if (method3550 != 0 && class187.field3664 == 0) {
                                class187.method4121();
                                b2 = false;
                            }
                            else if (method3550 == 0 && class187.field3664 != 0) {
                                class187.method4121();
                                b2 = false;
                            }
                        }
                    }
                    if (b2) {
                        this.field3639.method4112(new Class294(class183, method3550));
                    }
                }
            }
            else {
                if (this.method5327() >= 400) {
                    continue;
                }
                class185 = (Class292)this.method5335(class183, class184);
            }
            if (method3550 != class185.field3628) {
                class185.field3627 = ++this.field3637 - 1;
                if (class185.field3628 == -1 && method3550 == 0) {
                    class185.field3627 = -(class185.field3627 * -1772374531) * -745943211;
                }
                class185.field3628 = method3550;
            }
            class185.field3629 = method3551;
            class185.field3648 = field3648;
            class185.field3650 = field3649;
        }
        this.method5337();
    }
}
