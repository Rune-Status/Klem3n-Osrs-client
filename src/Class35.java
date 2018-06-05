import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ai")
public class Class35
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 543504023)
    int field303;
    @ObfuscatedName("w")
    byte[][][] field304;
    
    Class35(final int field303) {
        this.field303 = field303;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IIIIIIIII)V", garbageValue = "600681554")
    void method606(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, int method591, int method592) {
        if (method591 != 0 && this.field303 != 0 && this.field304 != null) {
            method592 = this.method590(method592, method591);
            method591 = this.method591(method591);
            Class314.method5733(n, n2, n5, n6, n3, n4, this.field304[method591 - 1][method592], this.field303);
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIB)I", garbageValue = "103")
    int method590(int n, final int n2) {
        if (n2 == 9) {
            n = (n + 1 & 0x3);
        }
        if (n2 == 10) {
            n = (n + 3 & 0x3);
        }
        if (n2 == 11) {
            n = (n + 3 & 0x3);
        }
        return n;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(II)I", garbageValue = "-1021725892")
    int method591(final int n) {
        if (n == 9 || n == 10) {
            return 1;
        }
        if (n == 11) {
            return 8;
        }
        return n;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1956759512")
    void method592() {
        if (this.field304 != null) {
            return;
        }
        this.field304 = new byte[8][4][];
        this.method593();
        this.method625();
        this.method607();
        this.method596();
        this.method612();
        this.method598();
        this.method629();
        this.method595();
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-515491785")
    void method593() {
        final byte[] array = new byte[this.field303 * this.field303];
        int n = 0;
        for (int i = 0; i < this.field303; ++i) {
            for (int j = 0; j < this.field303; ++j) {
                if (j <= i) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        this.field304[0][0] = array;
        final byte[] array2 = new byte[this.field303 * this.field303];
        int n2 = 0;
        for (int k = this.field303 - 1; k >= 0; --k) {
            for (int l = 0; l < this.field303; ++l) {
                if (l <= k) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        this.field304[0][1] = array2;
        final byte[] array3 = new byte[this.field303 * this.field303];
        int n3 = 0;
        for (int n4 = 0; n4 < this.field303; ++n4) {
            for (int n5 = 0; n5 < this.field303; ++n5) {
                if (n5 >= n4) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        this.field304[0][2] = array3;
        final byte[] array4 = new byte[this.field303 * this.field303];
        int n6 = 0;
        for (int n7 = this.field303 - 1; n7 >= 0; --n7) {
            for (int n8 = 0; n8 < this.field303; ++n8) {
                if (n8 >= n7) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        this.field304[0][3] = array4;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "2050739130")
    void method625() {
        final byte[] array = new byte[this.field303 * this.field303];
        int n = 0;
        for (int i = this.field303 - 1; i >= 0; --i) {
            for (int j = 0; j < this.field303; ++j) {
                if (j <= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        this.field304[1][0] = array;
        final byte[] array2 = new byte[this.field303 * this.field303];
        int n2 = 0;
        for (int k = 0; k < this.field303; ++k) {
            for (int l = 0; l < this.field303; ++l) {
                if (n2 < 0 || n2 >= array2.length) {
                    ++n2;
                }
                else {
                    if (l >= k << 1) {
                        array2[n2] = -1;
                    }
                    ++n2;
                }
            }
        }
        this.field304[1][1] = array2;
        final byte[] array3 = new byte[this.field303 * this.field303];
        int n3 = 0;
        for (int n4 = 0; n4 < this.field303; ++n4) {
            for (int n5 = this.field303 - 1; n5 >= 0; --n5) {
                if (n5 <= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        this.field304[1][2] = array3;
        final byte[] array4 = new byte[this.field303 * this.field303];
        int n6 = 0;
        for (int n7 = this.field303 - 1; n7 >= 0; --n7) {
            for (int n8 = this.field303 - 1; n8 >= 0; --n8) {
                if (n8 >= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        this.field304[1][3] = array4;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "1")
    void method607() {
        final byte[] array = new byte[this.field303 * this.field303];
        int n = 0;
        for (int i = this.field303 - 1; i >= 0; --i) {
            for (int j = this.field303 - 1; j >= 0; --j) {
                if (j <= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        this.field304[2][0] = array;
        final byte[] array2 = new byte[this.field303 * this.field303];
        int n2 = 0;
        for (int k = this.field303 - 1; k >= 0; --k) {
            for (int l = 0; l < this.field303; ++l) {
                if (l >= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        this.field304[2][1] = array2;
        final byte[] array3 = new byte[this.field303 * this.field303];
        int n3 = 0;
        for (int n4 = 0; n4 < this.field303; ++n4) {
            for (int n5 = 0; n5 < this.field303; ++n5) {
                if (n5 <= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        this.field304[2][2] = array3;
        final byte[] array4 = new byte[this.field303 * this.field303];
        int n6 = 0;
        for (int n7 = 0; n7 < this.field303; ++n7) {
            for (int n8 = this.field303 - 1; n8 >= 0; --n8) {
                if (n8 >= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        this.field304[2][3] = array4;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1650929653")
    void method596() {
        final byte[] array = new byte[this.field303 * this.field303];
        int n = 0;
        for (int i = this.field303 - 1; i >= 0; --i) {
            for (int j = 0; j < this.field303; ++j) {
                if (j >= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        this.field304[3][0] = array;
        final byte[] array2 = new byte[this.field303 * this.field303];
        int n2 = 0;
        for (int k = 0; k < this.field303; ++k) {
            for (int l = 0; l < this.field303; ++l) {
                if (l <= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        this.field304[3][1] = array2;
        final byte[] array3 = new byte[this.field303 * this.field303];
        int n3 = 0;
        for (int n4 = 0; n4 < this.field303; ++n4) {
            for (int n5 = this.field303 - 1; n5 >= 0; --n5) {
                if (n5 >= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        this.field304[3][2] = array3;
        final byte[] array4 = new byte[this.field303 * this.field303];
        int n6 = 0;
        for (int n7 = this.field303 - 1; n7 >= 0; --n7) {
            for (int n8 = this.field303 - 1; n8 >= 0; --n8) {
                if (n8 <= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        this.field304[3][3] = array4;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "1")
    void method612() {
        final byte[] array = new byte[this.field303 * this.field303];
        int n = 0;
        for (int i = this.field303 - 1; i >= 0; --i) {
            for (int j = this.field303 - 1; j >= 0; --j) {
                if (j >= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        this.field304[4][0] = array;
        final byte[] array2 = new byte[this.field303 * this.field303];
        int n2 = 0;
        for (int k = this.field303 - 1; k >= 0; --k) {
            for (int l = 0; l < this.field303; ++l) {
                if (l <= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        this.field304[4][1] = array2;
        final byte[] array3 = new byte[this.field303 * this.field303];
        int n3 = 0;
        for (int n4 = 0; n4 < this.field303; ++n4) {
            for (int n5 = 0; n5 < this.field303; ++n5) {
                if (n5 >= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        this.field304[4][2] = array3;
        final byte[] array4 = new byte[this.field303 * this.field303];
        int n6 = 0;
        for (int n7 = 0; n7 < this.field303; ++n7) {
            for (int n8 = this.field303 - 1; n8 >= 0; --n8) {
                if (n8 <= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        this.field304[4][3] = array4;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1963710771")
    void method598() {
        final byte[] array = new byte[this.field303 * this.field303];
        final byte[] array2 = new byte[this.field303 * this.field303];
        int n = 0;
        for (int i = 0; i < this.field303; ++i) {
            for (int j = 0; j < this.field303; ++j) {
                if (j <= this.field303 / 2) {
                    array2[n] = -1;
                }
                ++n;
            }
        }
        this.field304[5][0] = array2;
        final byte[] array3 = new byte[this.field303 * this.field303];
        int n2 = 0;
        for (int k = 0; k < this.field303; ++k) {
            for (int l = 0; l < this.field303; ++l) {
                if (k <= this.field303 / 2) {
                    array3[n2] = -1;
                }
                ++n2;
            }
        }
        this.field304[5][1] = array3;
        final byte[] array4 = new byte[this.field303 * this.field303];
        int n3 = 0;
        for (int n4 = 0; n4 < this.field303; ++n4) {
            for (int n5 = 0; n5 < this.field303; ++n5) {
                if (n5 >= this.field303 / 2) {
                    array4[n3] = -1;
                }
                ++n3;
            }
        }
        this.field304[5][2] = array4;
        final byte[] array5 = new byte[this.field303 * this.field303];
        int n6 = 0;
        for (int n7 = 0; n7 < this.field303; ++n7) {
            for (int n8 = 0; n8 < this.field303; ++n8) {
                if (n7 >= this.field303 / 2) {
                    array5[n6] = -1;
                }
                ++n6;
            }
        }
        this.field304[5][3] = array5;
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2053571695")
    void method629() {
        final byte[] array = new byte[this.field303 * this.field303];
        final byte[] array2 = new byte[this.field303 * this.field303];
        int n = 0;
        for (int i = 0; i < this.field303; ++i) {
            for (int j = 0; j < this.field303; ++j) {
                if (j <= i - this.field303 / 2) {
                    array2[n] = -1;
                }
                ++n;
            }
        }
        this.field304[6][0] = array2;
        final byte[] array3 = new byte[this.field303 * this.field303];
        int n2 = 0;
        for (int k = this.field303 - 1; k >= 0; --k) {
            for (int l = 0; l < this.field303; ++l) {
                if (l <= k - this.field303 / 2) {
                    array3[n2] = -1;
                }
                ++n2;
            }
        }
        this.field304[6][1] = array3;
        final byte[] array4 = new byte[this.field303 * this.field303];
        int n3 = 0;
        for (int n4 = this.field303 - 1; n4 >= 0; --n4) {
            for (int n5 = this.field303 - 1; n5 >= 0; --n5) {
                if (n5 <= n4 - this.field303 / 2) {
                    array4[n3] = -1;
                }
                ++n3;
            }
        }
        this.field304[6][2] = array4;
        final byte[] array5 = new byte[this.field303 * this.field303];
        int n6 = 0;
        for (int n7 = 0; n7 < this.field303; ++n7) {
            for (int n8 = this.field303 - 1; n8 >= 0; --n8) {
                if (n8 <= n7 - this.field303 / 2) {
                    array5[n6] = -1;
                }
                ++n6;
            }
        }
        this.field304[6][3] = array5;
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "335208223")
    void method595() {
        final byte[] array = new byte[this.field303 * this.field303];
        final byte[] array2 = new byte[this.field303 * this.field303];
        int n = 0;
        for (int i = 0; i < this.field303; ++i) {
            for (int j = 0; j < this.field303; ++j) {
                if (j >= i - this.field303 / 2) {
                    array2[n] = -1;
                }
                ++n;
            }
        }
        this.field304[7][0] = array2;
        final byte[] array3 = new byte[this.field303 * this.field303];
        int n2 = 0;
        for (int k = this.field303 - 1; k >= 0; --k) {
            for (int l = 0; l < this.field303; ++l) {
                if (l >= k - this.field303 / 2) {
                    array3[n2] = -1;
                }
                ++n2;
            }
        }
        this.field304[7][1] = array3;
        final byte[] array4 = new byte[this.field303 * this.field303];
        int n3 = 0;
        for (int n4 = this.field303 - 1; n4 >= 0; --n4) {
            for (int n5 = this.field303 - 1; n5 >= 0; --n5) {
                if (n5 >= n4 - this.field303 / 2) {
                    array4[n3] = -1;
                }
                ++n3;
            }
        }
        this.field304[7][2] = array4;
        final byte[] array5 = new byte[this.field303 * this.field303];
        int n6 = 0;
        for (int n7 = 0; n7 < this.field303; ++n7) {
            for (int n8 = this.field303 - 1; n8 >= 0; --n8) {
                if (n8 >= n7 - this.field303 / 2) {
                    array5[n6] = -1;
                }
                ++n6;
            }
        }
        this.field304[7][3] = array5;
    }
    
    @ObfuscatedName("fm")
    @ObfuscatedSignature(signature = "(Lba;B)V", garbageValue = "-96")
    static final void method609(final Class63 class63) {
        class63.field900 = class63.field893;
        if (class63.field909 == 0) {
            class63.field923 = 0;
            return;
        }
        if (class63.field903 != -1 && class63.field906 == 0) {
            final Class273 method25 = Class3.method25(class63.field903);
            if (class63.field930 > 0 && method25.field3551 == 0) {
                ++class63.field923;
                return;
            }
            if (class63.field930 <= 0 && method25.field3535 == 0) {
                ++class63.field923;
                return;
            }
        }
        final int field931 = class63.field931;
        final int field932 = class63.field881;
        final int field933 = class63.field922[class63.field909 - 1] * 128 + class63.field874 * 64;
        final int field934 = class63.field872[class63.field909 - 1] * 128 + class63.field874 * 64;
        if (field931 < field933) {
            if (field932 < field934) {
                class63.field926 = 1280;
            }
            else if (field932 > field934) {
                class63.field926 = 1792;
            }
            else {
                class63.field926 = 1536;
            }
        }
        else if (field931 > field933) {
            if (field932 < field934) {
                class63.field926 = 768;
            }
            else if (field932 > field934) {
                class63.field926 = 256;
            }
            else {
                class63.field926 = 512;
            }
        }
        else if (field932 < field934) {
            class63.field926 = 1024;
        }
        else if (field932 > field934) {
            class63.field926 = 0;
        }
        final byte b = class63.field928[class63.field909 - 1];
        if (field933 - field931 > 256 || field933 - field931 < -256 || field934 - field932 > 256 || field934 - field932 < -256) {
            class63.field931 = field933;
            class63.field881 = field934;
            --class63.field909;
            if (class63.field930 > 0) {
                --class63.field930;
            }
            return;
        }
        int n = class63.field926 - class63.field905 & 0x7FF;
        if (n > 1024) {
            n -= 2048;
        }
        int field935 = class63.field880;
        if (n >= -256 && n <= 256) {
            field935 = class63.field899;
        }
        else if (n >= 256 && n < 768) {
            field935 = class63.field882;
        }
        else if (n >= -768 && n <= -256) {
            field935 = class63.field870;
        }
        if (field935 == -1) {
            field935 = class63.field899;
        }
        class63.field900 = field935;
        int n2 = 4;
        boolean field936 = true;
        if (class63 instanceof Class72) {
            field936 = ((Class72)class63).field1037.field3520;
        }
        if (field936) {
            if (class63.field926 != class63.field905 && class63.field897 == -1 && class63.field924 != 0) {
                n2 = 2;
            }
            if (class63.field909 > 2) {
                n2 = 6;
            }
            if (class63.field909 > 3) {
                n2 = 8;
            }
            if (class63.field923 > 0 && class63.field909 > 1) {
                n2 = 8;
                --class63.field923;
            }
        }
        else {
            if (class63.field909 > 1) {
                n2 = 6;
            }
            if (class63.field909 > 2) {
                n2 = 8;
            }
            if (class63.field923 > 0 && class63.field909 > 1) {
                n2 = 8;
                --class63.field923;
            }
        }
        if (b == 2) {
            n2 <<= 1;
        }
        if (n2 >= 8 && class63.field899 == class63.field900 && class63.field883 != -1) {
            class63.field900 = class63.field883;
        }
        if (field931 != field933 || field932 != field934) {
            if (field931 < field933) {
                class63.field931 += n2;
                if (class63.field931 > field933) {
                    class63.field931 = field933;
                }
            }
            else if (field931 > field933) {
                class63.field931 -= n2;
                if (class63.field931 < field933) {
                    class63.field931 = field933;
                }
            }
            if (field932 < field934) {
                class63.field881 += n2;
                if (class63.field881 > field934) {
                    class63.field881 = field934;
                }
            }
            else if (field932 > field934) {
                class63.field881 -= n2;
                if (class63.field881 < field934) {
                    class63.field881 = field934;
                }
            }
        }
        if (field933 == class63.field931 && field934 == class63.field881) {
            --class63.field909;
            if (class63.field930 > 0) {
                --class63.field930;
            }
        }
    }
    
    @ObfuscatedName("gu")
    @ObfuscatedSignature(signature = "(Lba;IIIIIB)V", garbageValue = "13")
    static final void method628(final Class63 class63, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (class63 == null || !class63.vmethod1786()) {
            return;
        }
        if (class63 instanceof Class72) {
            Class271 class64 = ((Class72)class63).field1037;
            if (class64.field3516 != null) {
                class64 = class64.method5189();
            }
            if (class64 == null) {
                return;
            }
        }
        final int field1167 = Class81.field1167;
        final int[] field1168 = Class81.field1159;
        int n6 = 0;
        if (n < field1167 && class63.field889 == Client.field591) {
            final Class60 class65 = (Class60)class63;
            int n7;
            if (Client.field658 == 0) {
                n7 = 0;
            }
            else if (class65 != Class138.field1876) {
                boolean method260 = Class20.method260();
                if (!method260) {
                    method260 = ((Client.field658 & 0x1) != 0x0 && class65.method1083());
                }
                n7 = ((method260 || (Class48.method943() && class65.method1104())) ? 1 : 0);
            }
            else {
                n7 = (((Client.field658 & 0x8) != 0x0) ? 1 : 0);
            }
            if (n7 != 0) {
                final Class60 class66 = (Class60)class63;
                if (n < field1167) {
                    Class58.method1068(class63, class63.field925 + 15);
                    ((Class299) Client.field631.get(Class295.field3672)).method5525(class66.field552.method5447(), n2 + Client.field679, n3 + Client.field680 - 9, 16777215, 0);
                    n6 = 18;
                }
            }
        }
        int n8 = -2;
        if (!class63.field896.method4043()) {
            Class58.method1068(class63, class63.field925 + 15);
            for (Class71 class67 = (Class71)class63.field896.method4048(); class67 != null; class67 = (Class71)class63.field896.method4033()) {
                final Class64 method261 = class67.method1773(Client.field591);
                if (method261 != null) {
                    final Class261 field1169 = class67.field1025;
                    final Class318 method262 = field1169.method4918();
                    final Class318 method263 = field1169.method4917();
                    int field1170 = 0;
                    int field1171;
                    if (method262 != null && method263 != null) {
                        if (field1169.field3318 * 2 < method263.field3787) {
                            field1170 = field1169.field3318;
                        }
                        field1171 = method263.field3787 - field1170 * 2;
                    }
                    else {
                        field1171 = field1169.field3311;
                    }
                    int n9 = 255;
                    final int n10 = Client.field591 - method261.field934;
                    final int n11 = field1171 * method261.field938 / field1169.field3311;
                    int n14;
                    if (method261.field937 > n10) {
                        final int n12 = (field1169.field3308 == 0) ? 0 : (field1169.field3308 * (n10 / field1169.field3308));
                        final int n13 = field1171 * method261.field935 / field1169.field3311;
                        n14 = n12 * (n11 - n13) / method261.field937 + n13;
                    }
                    else {
                        n14 = n11;
                        final int n15 = field1169.field3313 + method261.field937 - n10;
                        if (field1169.field3312 >= 0) {
                            n9 = (n15 << 8) / (field1169.field3313 - field1169.field3312);
                        }
                    }
                    if (method261.field938 > 0 && n14 < 1) {
                        n14 = 1;
                    }
                    if (method262 != null && method263 != null) {
                        int n16;
                        if (field1171 == n14) {
                            n16 = field1170 * 2 + n14;
                        }
                        else {
                            n16 = n14 + field1170;
                        }
                        final int field1172 = method262.field3788;
                        n8 += field1172;
                        final int n17 = n2 + Client.field679 - (field1171 >> 1);
                        final int n18 = n3 + Client.field680 - n8;
                        final int n19 = n17 - field1170;
                        if (n9 >= 0 && n9 < 255) {
                            method262.method5857(n19, n18, n9);
                            Class314.method5790(n19, n18, n19 + n16, n18 + field1172);
                            method263.method5857(n19, n18, n9);
                        }
                        else {
                            method262.method5851(n19, n18);
                            Class314.method5790(n19, n18, n16 + n19, field1172 + n18);
                            method263.method5851(n19, n18);
                        }
                        Class314.method5720(n2, n3, n2 + n4, n3 + n5);
                        n8 += 2;
                    }
                    else {
                        n8 += 5;
                        if (Client.field679 > -1) {
                            final int n20 = n2 + Client.field679 - (field1171 >> 1);
                            final int n21 = n3 + Client.field680 - n8;
                            Class314.method5763(n20, n21, n14, 5, 65280);
                            Class314.method5763(n20 + n14, n21, field1171 - n14, 5, 16711680);
                        }
                        n8 += 2;
                    }
                }
                else if (class67.method1774()) {
                    class67.method4064();
                }
            }
        }
        if (n8 == -2) {
            n8 += 7;
        }
        int n22 = n8 + n6;
        if (n < field1167) {
            final Class60 class68 = (Class60)class63;
            if (class68.field566) {
                return;
            }
            if (class68.field570 != -1 || class68.field548 != -1) {
                Class58.method1068(class63, class63.field925 + 15);
                if (Client.field679 > -1) {
                    if (class68.field570 != -1) {
                        n22 += 25;
                        Class150.field1919[class68.field570].method5851(n2 + Client.field679 - 12, n3 + Client.field680 - n22);
                    }
                    if (class68.field548 != -1) {
                        n22 += 25;
                        RunException.field369[class68.field548].method5851(n2 + Client.field679 - 12, n3 + Client.field680 - n22);
                    }
                }
            }
            if (n >= 0 && Client.field599 == 10 && field1168[n] == Client.field579) {
                Class58.method1068(class63, class63.field925 + 15);
                if (Client.field679 > -1) {
                    Class150.field1926[1].method5851(n2 + Client.field679 - 12, n3 + Client.field680 - (n22 + Class150.field1926[1].field3788));
                }
            }
        }
        else {
            Class271 class69 = ((Class72)class63).field1037;
            if (class69.field3516 != null) {
                class69 = class69.method5189();
            }
            if (class69.field3494 >= 0 && class69.field3494 < RunException.field369.length) {
                Class58.method1068(class63, class63.field925 + 15);
                if (Client.field679 > -1) {
                    RunException.field369[class69.field3494].method5851(n2 + Client.field679 - 12, n3 + Client.field680 - 30);
                }
            }
            if (Client.field599 == 1 && Client.field639[n - field1167] == Client.field600 && Client.field591 % 20 < 10) {
                Class58.method1068(class63, class63.field925 + 15);
                if (Client.field679 > -1) {
                    Class150.field1926[0].method5851(n2 + Client.field679 - 12, n3 + Client.field680 - 28);
                }
            }
        }
        Label_1303: {
            if (class63.field884 != null) {
                if (n < field1167) {
                    if (class63.field886) {
                        break Label_1303;
                    }
                    if (Client.field630 != 4) {
                        if (class63.field885) {
                            break Label_1303;
                        }
                        if (Client.field630 != 0 && Client.field630 != 3) {
                            if (Client.field630 != 1 || !((Class60)class63).method1083()) {
                                break Label_1303;
                            }
                        }
                    }
                }
                Class58.method1068(class63, class63.field925);
                if (Client.field679 > -1 && Client.field667 < Client.field648) {
                    Client.field672[Client.field667] = Class293.field3660.method5517(class63.field884) / 2;
                    Client.field671[Client.field667] = Class293.field3660.field3695;
                    Client.field669[Client.field667] = Client.field679;
                    Client.field670[Client.field667] = Client.field680;
                    Client.field673[Client.field667] = class63.field888;
                    Client.field674[Client.field667] = class63.field927;
                    Client.field675[Client.field667] = class63.field887;
                    Client.field721[Client.field667] = class63.field884;
                    ++Client.field667;
                }
            }
        }
        int i = 0;
    Label_1377_Outer:
        while (i < 4) {
            final int n23 = class63.field895[i];
            final int n24 = class63.field912[i];
            Class267 class70 = null;
            int field1173 = 0;
            while (true) {
                Label_1383: {
                    if (n24 >= 0) {
                        if (n23 > Client.field591) {
                            class70 = Class14.method123(class63.field912[i]);
                            field1173 = class70.field3355;
                            if (class70 == null || class70.field3366 == null) {
                                break Label_1383;
                            }
                            class70 = class70.method4995();
                            if (class70 != null) {
                                break Label_1383;
                            }
                            class63.field895[i] = -1;
                        }
                    }
                    else if (n23 >= 0) {
                        break Label_1383;
                    }
                    ++i;
                    continue Label_1377_Outer;
                }
                final int n25 = class63.field894[i];
                Class267 class71 = null;
                if (n25 >= 0) {
                    class71 = Class14.method123(n25);
                    if (class71 != null && class71.field3366 != null) {
                        class71 = class71.method4995();
                    }
                }
                if (n23 - field1173 > Client.field591) {
                    continue;
                }
                if (class70 == null) {
                    class63.field895[i] = -1;
                    continue;
                }
                Class58.method1068(class63, class63.field925 / 2);
                if (Client.field679 <= -1) {
                    continue;
                }
                if (i == 1) {
                    Client.field680 -= 20;
                }
                if (i == 2) {
                    Client.field679 -= 15;
                    Client.field680 -= 10;
                }
                if (i == 3) {
                    Client.field679 += 15;
                    Client.field680 -= 10;
                }
                int field1174 = 0;
                int field1175 = 0;
                int field1176 = 0;
                int field1177 = 0;
                int field1178 = 0;
                int field1179 = 0;
                int field1180 = 0;
                int field1181 = 0;
                Class318 method264 = null;
                Class318 method265 = null;
                Class318 method266 = null;
                Class318 method267 = null;
                int field1182 = 0;
                int field1183 = 0;
                int field1184 = 0;
                int field1185 = 0;
                int field1186 = 0;
                int field1187 = 0;
                int field1188 = 0;
                int field1189 = 0;
                int n26 = 0;
                final Class318 method268 = class70.method4994();
                if (method268 != null) {
                    field1174 = method268.field3787;
                    final int field1190 = method268.field3788;
                    if (field1190 > n26) {
                        n26 = field1190;
                    }
                    field1178 = method268.field3793;
                }
                final Class318 method269 = class70.method5000();
                if (method269 != null) {
                    field1175 = method269.field3787;
                    final int field1191 = method269.field3788;
                    if (field1191 > n26) {
                        n26 = field1191;
                    }
                    field1179 = method269.field3793;
                }
                final Class318 method270 = class70.method4996();
                if (method270 != null) {
                    field1176 = method270.field3787;
                    final int field1192 = method270.field3788;
                    if (field1192 > n26) {
                        n26 = field1192;
                    }
                    field1180 = method270.field3793;
                }
                final Class318 method271 = class70.method4997();
                if (method271 != null) {
                    field1177 = method271.field3787;
                    final int field1193 = method271.field3788;
                    if (field1193 > n26) {
                        n26 = field1193;
                    }
                    field1181 = method271.field3793;
                }
                if (class71 != null) {
                    method264 = class71.method4994();
                    if (method264 != null) {
                        field1182 = method264.field3787;
                        final int field1194 = method264.field3788;
                        if (field1194 > n26) {
                            n26 = field1194;
                        }
                        field1186 = method264.field3793;
                    }
                    method265 = class71.method5000();
                    if (method265 != null) {
                        field1183 = method265.field3787;
                        final int field1195 = method265.field3788;
                        if (field1195 > n26) {
                            n26 = field1195;
                        }
                        field1187 = method265.field3793;
                    }
                    method266 = class71.method4996();
                    if (method266 != null) {
                        field1184 = method266.field3787;
                        final int field1196 = method266.field3788;
                        if (field1196 > n26) {
                            n26 = field1196;
                        }
                        field1188 = method266.field3793;
                    }
                    method267 = class71.method4997();
                    if (method267 != null) {
                        field1185 = method267.field3787;
                        final int field1197 = method267.field3788;
                        if (field1197 > n26) {
                            n26 = field1197;
                        }
                        field1189 = method267.field3793;
                    }
                }
                Class298 class72 = class70.method4998();
                if (class72 == null) {
                    class72 = Class151.field1936;
                }
                Class298 class73;
                if (class71 != null) {
                    class73 = class71.method4998();
                    if (class73 == null) {
                        class73 = Class151.field1936;
                    }
                }
                else {
                    class73 = Class151.field1936;
                }
                String method272 = null;
                int method273 = 0;
                final String method274 = class70.method5014(class63.field892[i]);
                final int method275 = class72.method5517(method274);
                if (class71 != null) {
                    method272 = class71.method5014(class63.field921[i]);
                    method273 = class73.method5517(method272);
                }
                int n27 = 0;
                int n28 = 0;
                if (field1175 > 0) {
                    if (method270 == null && method271 == null) {
                        n27 = 1;
                    }
                    else {
                        n27 = method275 / field1175 + 1;
                    }
                }
                if (class71 != null && field1183 > 0) {
                    if (method266 != null || method267 != null) {
                        n28 = method273 / field1183 + 1;
                    }
                    else {
                        n28 = 1;
                    }
                }
                final int n30;
                int n29 = n30 = 0;
                if (field1174 > 0) {
                    n29 += field1174;
                }
                n29 += 2;
                final int n31 = n29;
                if (field1176 > 0) {
                    n29 += field1176;
                }
                final int n32 = n29;
                int n33 = n29;
                int n35;
                if (field1175 > 0) {
                    final int n34 = n27 * field1175;
                    n35 = n29 + n34;
                    n33 += (n34 - method275) / 2;
                }
                else {
                    n35 = n29 + method275;
                }
                final int n36 = n35;
                if (field1177 > 0) {
                    n35 += field1177;
                }
                int n37 = 0;
                int n38 = 0;
                int n39 = 0;
                int n40 = 0;
                int n41 = 0;
                if (class71 != null) {
                    n35 += 2;
                    n37 = n35;
                    if (field1182 > 0) {
                        n35 += field1182;
                    }
                    n35 += 2;
                    n38 = n35;
                    if (field1184 > 0) {
                        n35 += field1184;
                    }
                    n39 = n35;
                    n41 = n35;
                    if (field1183 > 0) {
                        final int n42 = n28 * field1183;
                        n35 += n42;
                        n41 += (n42 - method273) / 2;
                    }
                    else {
                        n35 += method273;
                    }
                    n40 = n35;
                    if (field1185 > 0) {
                        n35 += field1185;
                    }
                }
                final int n43 = class63.field895[i] - Client.field591;
                final int n44 = class70.field3365 - n43 * class70.field3365 / class70.field3355;
                final int n45 = n43 * class70.field3361 / class70.field3355 + -class70.field3361;
                final int n46 = n44 + (n2 + Client.field679 - (n35 >> 1));
                int n48;
                final int n47 = n48 = n45 + (n3 + Client.field680 - 12);
                int n49 = n47 + n26;
                final int n50 = n47 + class70.field3347 + 15;
                final int n51 = n50 - class72.field3696;
                final int n52 = n50 + class72.field3697;
                if (n51 < n48) {
                    n48 = n51;
                }
                if (n52 > n49) {
                    n49 = n52;
                }
                int n53 = 0;
                if (class71 != null) {
                    n53 = n47 + class71.field3347 + 15;
                    final int n54 = n53 - class73.field3696;
                    final int n55 = n53 + class73.field3697;
                    if (n54 < n48) {}
                    if (n55 > n49) {}
                }
                int n56 = 255;
                if (class70.field3354 >= 0) {
                    n56 = (n43 << 8) / (class70.field3355 - class70.field3354);
                }
                if (n56 >= 0 && n56 < 255) {
                    if (method268 != null) {
                        method268.method5857(n46 + n30 - field1178, n47, n56);
                    }
                    if (method270 != null) {
                        method270.method5857(n46 + n31 - field1180, n47, n56);
                    }
                    if (method269 != null) {
                        for (int j = 0; j < n27; ++j) {
                            method269.method5857(field1175 * j + (n32 + n46 - field1179), n47, n56);
                        }
                    }
                    if (method271 != null) {
                        method271.method5857(n36 + n46 - field1181, n47, n56);
                    }
                    class72.method5523(method274, n46 + n33, n50, class70.field3364, 0, n56);
                    if (class71 != null) {
                        if (method264 != null) {
                            method264.method5857(n46 + n37 - field1186, n47, n56);
                        }
                        if (method266 != null) {
                            method266.method5857(n38 + n46 - field1188, n47, n56);
                        }
                        if (method265 != null) {
                            for (int k = 0; k < n28; ++k) {
                                method265.method5857(k * field1183 + (n39 + n46 - field1187), n47, n56);
                            }
                        }
                        if (method267 != null) {
                            method267.method5857(n46 + n40 - field1189, n47, n56);
                        }
                        class73.method5523(method272, n41 + n46, n53, class71.field3364, 0, n56);
                    }
                    continue;
                }
                else {
                    if (method268 != null) {
                        method268.method5851(n46 + n30 - field1178, n47);
                    }
                    if (method270 != null) {
                        method270.method5851(n46 + n31 - field1180, n47);
                    }
                    if (method269 != null) {
                        for (int l = 0; l < n27; ++l) {
                            method269.method5851(field1175 * l + (n46 + n32 - field1179), n47);
                        }
                    }
                    if (method271 != null) {
                        method271.method5851(n46 + n36 - field1181, n47);
                    }
                    class72.method5522(method274, n46 + n33, n50, class70.field3364 | 0xFF000000, 0);
                    if (class71 != null) {
                        if (method264 != null) {
                            method264.method5851(n37 + n46 - field1186, n47);
                        }
                        if (method266 != null) {
                            method266.method5851(n38 + n46 - field1188, n47);
                        }
                        if (method265 != null) {
                            for (int n57 = 0; n57 < n28; ++n57) {
                                method265.method5851(n57 * field1183 + (n39 + n46 - field1187), n47);
                            }
                        }
                        if (method267 != null) {
                            method267.method5851(n40 + n46 - field1189, n47);
                        }
                        class73.method5522(method272, n46 + n41, n53, class71.field3364 | 0xFF000000, 0);
                    }
                    continue;
                }
            }
        }
    }
    
    @ObfuscatedName("id")
    @ObfuscatedSignature(signature = "(IIIIIIIIB)V", garbageValue = "46")
    static final void method630(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (!Class261.method4931(n)) {
            if (n8 != -1) {
                Client.field697[n8] = true;
            }
            else {
                for (int i = 0; i < 100; ++i) {
                    Client.field697[i] = true;
                }
            }
            return;
        }
        Class132.field1814 = null;
        Class28.method467(Class42.field366[n], -1, n2, n3, n4, n5, n6, n7, n8);
        if (Class132.field1814 != null) {
            Class28.method467(Class132.field1814, -1412584499, n2, n3, n4, n5, Class297.field3687, Class1.field15, n8);
            Class132.field1814 = null;
        }
    }
    
    @ObfuscatedName("ig")
    @ObfuscatedSignature(signature = "(IB)Ljava/lang/String;", garbageValue = "1")
    static final String method623(final int n) {
        String s = Integer.toString(n);
        for (int i = s.length() - 3; i > 0; i -= 3) {
            s = s.substring(0, i) + "," + s.substring(i);
        }
        if (s.length() > 9) {
            return " " + Class6.method71(65408) + s.substring(0, s.length() - 8) + "M" + " " + " (" + s + ")" + "</col>";
        }
        if (s.length() > 6) {
            return " " + Class6.method71(16777215) + s.substring(0, s.length() - 4) + "K" + " " + " (" + s + ")" + "</col>";
        }
        return " " + Class6.method71(16776960) + s + "</col>";
    }
}
