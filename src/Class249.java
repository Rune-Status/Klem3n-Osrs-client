import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ic")
public class Class249 extends Class247
{
    @ObfuscatedName("ab")
    static CRC32 field3189;
    @ObfuscatedName("dl")
    @ObfuscatedGetter(intValue = 194552531)
    static int field3192;
    @ObfuscatedName("d")
    @ObfuscatedSignature(signature = "Lff;")
    Class162 field3195;
    @ObfuscatedName("h")
    @ObfuscatedSignature(signature = "Lff;")
    Class162 field3186;
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -1684100553)
    int field3187;
    @ObfuscatedName("v")
    volatile boolean field3188;
    @ObfuscatedName("af")
    boolean field3191;
    @ObfuscatedName("ah")
    volatile boolean[] field3185;
    @ObfuscatedName("aw")
    @ObfuscatedGetter(intValue = 1809929257)
    int field3190;
    @ObfuscatedName("ak")
    @ObfuscatedGetter(intValue = 439984845)
    int field3193;
    @ObfuscatedName("as")
    @ObfuscatedGetter(intValue = 856504919)
    int field3194;
    
    static {
        Class249.field3189 = new CRC32();
    }
    
    public Class249(final Class162 field3195, final Class162 field3196, final int field3197, final boolean b, final boolean b2, final boolean field3198) {
        super(b, b2);
        this.field3188 = false;
        this.field3191 = false;
        this.field3194 = -1;
        this.field3195 = field3195;
        this.field3186 = field3196;
        this.field3187 = field3197;
        this.field3191 = field3198;
        final int field3199 = this.field3187;
        if (Class185.field2359 != null) {
            Class185.field2359.field2339 = field3199 * 8 + 5;
            this.method4723(Class185.field2359.method3671(), Class185.field2359.method3671());
        }
        else {
            Class22.method280(null, 255, 255, 0, (byte)0, true);
            Class250.field3201[field3199] = this;
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "-114")
    @Override
    void vmethod4721(final int n) {
        Class54.method1021(this.field3187, n);
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(IB)I", garbageValue = "35")
    @Override
    int vmethod4727(final int n) {
        if (super.field3165[n] != null) {
            return 100;
        }
        if (this.field3185[n]) {
            return 100;
        }
        final long n2 = (this.field3187 << 16) + n;
        int n3;
        if (Class250.field3208 == null || n2 != Class250.field3208.field2421) {
            n3 = 0;
        }
        else {
            n3 = Class301.field3713.field2339 * 99 / (Class301.field3713.payload.length - Class250.field3208.field3157) + 1;
        }
        return n3;
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "10")
    @Override
    void vmethod4722(final int n) {
        if (this.field3195 != null && this.field3185 != null && this.field3185[n]) {
            final Class162 field3195 = this.field3195;
            byte[] field3196 = null;
            synchronized (Class248.field3182) {
                for (Class245 class245 = (Class245)Class248.field3182.method4098(); class245 != null; class245 = (Class245)Class248.field3182.method4079()) {
                    if (n == class245.field2421 && field3195 == class245.field3151 && class245.field3150 == 0) {
                        field3196 = class245.field3149;
                        break;
                    }
                }
            }
            if (field3196 != null) {
                this.method4746(field3195, n, field3196, true);
            }
            else {
                this.method4746(field3195, n, field3195.method3372(n), true);
            }
        }
        else {
            Class22.method280(this, this.field3187, n, super.field3164[n], (byte)2, true);
        }
    }
    
    @ObfuscatedName("cn")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "75")
    public int method4720() {
        if (this.field3188) {
            return 100;
        }
        if (super.field3165 != null) {
            return 99;
        }
        final long n = this.field3187 + 16711680;
        int n2;
        if (Class250.field3208 == null || n != Class250.field3208.field2421) {
            n2 = 0;
        }
        else {
            n2 = Class301.field3713.field2339 * 99 / (Class301.field3713.payload.length - Class250.field3208.field3157) + 1;
        }
        int n3 = n2;
        if (n3 >= 100) {
            n3 = 99;
        }
        return n3;
    }
    
    @ObfuscatedName("cp")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "-1996421048")
    public void method4723(final int field3190, final int field3191) {
        this.field3190 = field3190;
        this.field3193 = field3191;
        if (this.field3186 != null) {
            final int field3192 = this.field3187;
            final Class162 field3193 = this.field3186;
            byte[] field3194 = null;
            synchronized (Class248.field3182) {
                for (Class245 class245 = (Class245)Class248.field3182.method4098(); class245 != null; class245 = (Class245)Class248.field3182.method4079()) {
                    if (field3192 == class245.field2421 && field3193 == class245.field3151 && class245.field3150 == 0) {
                        field3194 = class245.field3149;
                        break;
                    }
                }
            }
            if (field3194 != null) {
                this.method4746(field3193, field3192, field3194, true);
            }
            else {
                this.method4746(field3193, field3192, field3193.method3372(field3192), true);
            }
        }
        else {
            Class22.method280(this, 255, this.field3187, this.field3190, (byte)0, true);
        }
    }
    
    @ObfuscatedName("cz")
    @ObfuscatedSignature(signature = "(I[BZZI)V", garbageValue = "-1745310697")
    public void method4729(final int n, final byte[] array, final boolean b, final boolean b2) {
        if (b) {
            if (this.field3188) {
                throw new RuntimeException();
            }
            if (this.field3186 != null) {
                final int field3187 = this.field3187;
                final Class162 field3188 = this.field3186;
                final Class245 class245 = new Class245();
                class245.field3150 = 0;
                class245.field2421 = field3187;
                class245.field3149 = array;
                class245.field3151 = field3188;
                synchronized (Class248.field3182) {
                    Class248.field3182.method4073(class245);
                }
                Class189.method3848();
            }
            this.method4622(array);
            this.method4726();
        }
        else {
            array[array.length - 2] = (byte)(super.field3162[n] >> 8);
            array[array.length - 1] = (byte)super.field3162[n];
            if (this.field3195 != null) {
                final Class162 field3189 = this.field3195;
                final Class245 class246 = new Class245();
                class246.field3150 = 0;
                class246.field2421 = n;
                class246.field3149 = array;
                class246.field3151 = field3189;
                synchronized (Class248.field3182) {
                    Class248.field3182.method4073(class246);
                }
                Class189.method3848();
                this.field3185[n] = true;
            }
            if (b2) {
                super.field3165[n] = Class159.method3324(array, false);
            }
        }
    }
    
    @ObfuscatedName("ck")
    @ObfuscatedSignature(signature = "(Lff;I[BZB)V", garbageValue = "-91")
    void method4746(final Class162 class162, final int n, final byte[] array, final boolean b) {
        if (class162 == this.field3186) {
            if (this.field3188) {
                throw new RuntimeException();
            }
            if (array == null) {
                Class22.method280(this, 255, this.field3187, this.field3190, (byte)0, true);
                return;
            }
            Class249.field3189.reset();
            Class249.field3189.update(array, 0, array.length);
            if ((int)Class249.field3189.getValue() != this.field3190) {
                Class22.method280(this, 255, this.field3187, this.field3190, (byte)0, true);
                return;
            }
            final Class182 class163 = new Class182(Class47.method912(array));
            final int method3544 = class163.method3544();
            if (method3544 != 5 && method3544 != 6) {
                throw new RuntimeException(method3544 + "," + this.field3187 + "," + n);
            }
            int method3545 = 0;
            if (method3544 >= 6) {
                method3545 = class163.method3671();
            }
            if (method3545 != this.field3193) {
                Class22.method280(this, 255, this.field3187, this.field3190, (byte)0, true);
                return;
            }
            this.method4622(array);
            this.method4726();
        }
        else {
            if (!b && n == this.field3194) {
                this.field3188 = true;
            }
            if (array == null || array.length <= 2) {
                this.field3185[n] = false;
                if (this.field3191 || b) {
                    Class22.method280(this, this.field3187, n, super.field3164[n], (byte)2, b);
                }
                return;
            }
            Class249.field3189.reset();
            Class249.field3189.update(array, 0, array.length - 2);
            final int n2 = (int)Class249.field3189.getValue();
            final int n3 = ((array[array.length - 2] & 0xFF) << 8) + (array[array.length - 1] & 0xFF);
            if (n2 != super.field3164[n] || n3 != super.field3162[n]) {
                this.field3185[n] = false;
                if (this.field3191 || b) {
                    Class22.method280(this, this.field3187, n, super.field3164[n], (byte)2, b);
                }
                return;
            }
            this.field3185[n] = true;
            if (b) {
                super.field3165[n] = Class159.method3324(array, false);
            }
        }
    }
    
    @ObfuscatedName("cu")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-160763890")
    void method4726() {
        this.field3185 = new boolean[super.field3165.length];
        for (int i = 0; i < this.field3185.length; ++i) {
            this.field3185[i] = false;
        }
        if (this.field3195 == null) {
            this.field3188 = true;
            return;
        }
        this.field3194 = -1;
        for (int j = 0; j < this.field3185.length; ++j) {
            if (super.field3166[j] > 0) {
                final Class162 field3195 = this.field3195;
                final Class245 class245 = new Class245();
                class245.field3150 = 1;
                class245.field2421 = j;
                class245.field3151 = field3195;
                class245.field3152 = this;
                synchronized (Class248.field3182) {
                    Class248.field3182.method4073(class245);
                }
                Class189.method3848();
                this.field3194 = j;
            }
        }
        if (this.field3194 == -1) {
            this.field3188 = true;
        }
    }
    
    @ObfuscatedName("cm")
    @ObfuscatedSignature(signature = "(II)Z", garbageValue = "270216094")
    public boolean method4725(final int n) {
        return this.field3185[n];
    }
    
    @ObfuscatedName("dh")
    @ObfuscatedSignature(signature = "(II)Z", garbageValue = "1526395619")
    public boolean method4734(final int n) {
        return this.method4668(n) != null;
    }
    
    @ObfuscatedName("do")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1226405037")
    public int method4755() {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < super.field3165.length; ++i) {
            if (super.field3166[i] > 0) {
                n += 100;
                n2 += this.vmethod4727(i);
            }
        }
        if (n == 0) {
            return 100;
        }
        return n2 * 100 / n;
    }
}
