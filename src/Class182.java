import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gk")
public class Class182 extends Class204
{
    @ObfuscatedName("s")
    static int[] field2336;
    @ObfuscatedName("u")
    static long[] field2337;
    @ObfuscatedName("ay")
    static Client field2334;
    @ObfuscatedName("z")
    public byte[] payload;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 1093285509)
    public int field2339;
    
    static {
        Class182.field2336 = new int[256];
        for (int i = 0; i < 256; ++i) {
            int n = i;
            for (int j = 0; j < 8; ++j) {
                if ((n & 0x1) == 0x1) {
                    n = (n >>> 1 ^ 0xEDB88320);
                }
                else {
                    n >>>= 1;
                }
            }
            Class182.field2336[i] = n;
        }
        Class182.field2337 = new long[256];
        for (int k = 0; k < 256; ++k) {
            long n2 = k;
            for (int l = 0; l < 8; ++l) {
                if ((n2 & 0x1L) == 0x1L) {
                    n2 = (n2 >>> 1 ^ 0xC96C5795D7870F42L);
                }
                else {
                    n2 >>>= 1;
                }
            }
            Class182.field2337[k] = n2;
        }
    }
    
    public Class182(final int n) {
        this.payload = Class84.method1943(n);
        this.field2339 = 0;
    }
    
    public Class182(final byte[] field2338) {
        this.payload = field2338;
        this.field2339 = 0;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1167762605")
    public void method3531() {
        if (this.payload != null) {
            Class309.method5671(this.payload);
        }
        this.payload = null;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "127253271")
    public void method3532(final int n) {
        this.payload[++this.field2339 - 1] = (byte)n;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-745758686")
    public void method3755(final int n) {
        this.payload[++this.field2339 - 1] = (byte)(n >> 8);
        this.payload[++this.field2339 - 1] = (byte)n;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-1989229937")
    public void method3534(final int n) {
        this.payload[++this.field2339 - 1] = (byte)(n >> 16);
        this.payload[++this.field2339 - 1] = (byte)(n >> 8);
        this.payload[++this.field2339 - 1] = (byte)n;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-1971281074")
    public void method3707(final int n) {
        this.payload[++this.field2339 - 1] = (byte)(n >> 24);
        this.payload[++this.field2339 - 1] = (byte)(n >> 16);
        this.payload[++this.field2339 - 1] = (byte)(n >> 8);
        this.payload[++this.field2339 - 1] = (byte)n;
    }
    
    @ObfuscatedName("i")
    public void method3584(final long n) {
        this.payload[++this.field2339 - 1] = (byte)(n >> 40);
        this.payload[++this.field2339 - 1] = (byte)(n >> 32);
        this.payload[++this.field2339 - 1] = (byte)(n >> 24);
        this.payload[++this.field2339 - 1] = (byte)(n >> 16);
        this.payload[++this.field2339 - 1] = (byte)(n >> 8);
        this.payload[++this.field2339 - 1] = (byte)n;
    }
    
    @ObfuscatedName("x")
    public void method3659(final long n) {
        this.payload[++this.field2339 - 1] = (byte)(n >> 56);
        this.payload[++this.field2339 - 1] = (byte)(n >> 48);
        this.payload[++this.field2339 - 1] = (byte)(n >> 40);
        this.payload[++this.field2339 - 1] = (byte)(n >> 32);
        this.payload[++this.field2339 - 1] = (byte)(n >> 24);
        this.payload[++this.field2339 - 1] = (byte)(n >> 16);
        this.payload[++this.field2339 - 1] = (byte)(n >> 8);
        this.payload[++this.field2339 - 1] = (byte)n;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(ZI)V", garbageValue = "873639132")
    public void method3766(final boolean b) {
        this.method3532(b ? 1 : 0);
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "-1020478938")
    public void method3699(final String s) {
        if (s.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2339 += Class23.method421(s, 0, s.length(), this.payload, this.field2339);
        this.payload[++this.field2339 - 1] = 0;
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "-1348251192")
    public void method3540(final String s) {
        if (s.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        this.payload[++this.field2339 - 1] = 0;
        this.field2339 += Class23.method421(s, 0, s.length(), this.payload, this.field2339);
        this.payload[++this.field2339 - 1] = 0;
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(Ljava/lang/CharSequence;B)V", garbageValue = "103")
    public void method3541(final CharSequence charSequence) {
        final int length = charSequence.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if (char1 <= '\u007f') {
                ++n;
            }
            else if (char1 <= '\u07ff') {
                n += 2;
            }
            else {
                n += 3;
            }
        }
        final int n2 = n;
        this.payload[++this.field2339 - 1] = 0;
        this.method3688(n2);
        final int field2339 = this.field2339;
        final byte[] field2340 = this.payload;
        final int field2341 = this.field2339;
        final int length2 = charSequence.length();
        int n3 = field2341;
        for (int j = 0; j < length2; ++j) {
            final char char2 = charSequence.charAt(j);
            if (char2 <= '\u007f') {
                field2340[n3++] = (byte)char2;
            }
            else if (char2 <= '\u07ff') {
                field2340[n3++] = (byte)('\u00c0' | char2 >> 6);
                field2340[n3++] = (byte)('\u0080' | (char2 & '?'));
            }
            else {
                field2340[n3++] = (byte)('\u00e0' | char2 >> 12);
                field2340[n3++] = (byte)('\u0080' | (char2 >> 6 & '?'));
                field2340[n3++] = (byte)('\u0080' | (char2 & '?'));
            }
        }
        this.field2339 = n3 - field2341 + field2339;
    }
    
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "([BIIB)V", garbageValue = "0")
    public void method3542(final byte[] array, final int n, final int n2) {
        for (int i = n; i < n2 + n; ++i) {
            this.payload[++this.field2339 - 1] = array[i];
        }
    }
    
    @ObfuscatedName("m")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-1356616575")
    public void method3543(final int n) {
        this.payload[this.field2339 - n - 4] = (byte)(n >> 24);
        this.payload[this.field2339 - n - 3] = (byte)(n >> 16);
        this.payload[this.field2339 - n - 2] = (byte)(n >> 8);
        this.payload[this.field2339 - n - 1] = (byte)n;
    }
    
    @ObfuscatedName("r")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-1030510523")
    public void method3614(final int n) {
        this.payload[this.field2339 - n - 2] = (byte)(n >> 8);
        this.payload[this.field2339 - n - 1] = (byte)n;
    }
    
    @ObfuscatedName("t")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "2091286553")
    public void method3545(final int n) {
        this.payload[this.field2339 - n - 1] = (byte)n;
    }
    
    @ObfuscatedName("o")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-1027102667")
    public void method3573(final int n) {
        if (n >= 0 && n < 128) {
            this.method3532(n);
            return;
        }
        if (n >= 0 && n < 32768) {
            this.method3755(n + 32768);
            return;
        }
        throw new IllegalArgumentException();
    }
    
    @ObfuscatedName("y")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "1319087228")
    public void method3688(final int n) {
        if ((n & 0xFFFFFF80) != 0x0) {
            if ((n & 0xFFFFC000) != 0x0) {
                if ((n & 0xFFE00000) != 0x0) {
                    if ((n & 0xF0000000) != 0x0) {
                        this.method3532(n >>> 28 | 0x80);
                    }
                    this.method3532(n >>> 21 | 0x80);
                }
                this.method3532(n >>> 14 | 0x80);
            }
            this.method3532(n >>> 7 | 0x80);
        }
        this.method3532(n & 0x7F);
    }
    
    @ObfuscatedName("a")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-1847684940")
    public int method3544() {
        return this.payload[++this.field2339 - 1] & 0xFF;
    }
    
    @ObfuscatedName("c")
    @ObfuscatedSignature(signature = "(I)B", garbageValue = "1250297886")
    public byte method3681() {
        return this.payload[++this.field2339 - 1];
    }
    
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1084016458")
    public int method3550() {
        this.field2339 += 2;
        return (this.payload[this.field2339 - 1] & 0xFF) + ((this.payload[this.field2339 - 2] & 0xFF) << 8);
    }
    
    @ObfuscatedName("af")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "0")
    public int method3551() {
        this.field2339 += 2;
        int n = (this.payload[this.field2339 - 1] & 0xFF) + ((this.payload[this.field2339 - 2] & 0xFF) << 8);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    @ObfuscatedName("ah")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "3")
    public int method3552() {
        this.field2339 += 3;
        return ((this.payload[this.field2339 - 3] & 0xFF) << 16) + (this.payload[this.field2339 - 1] & 0xFF) + ((this.payload[this.field2339 - 2] & 0xFF) << 8);
    }
    
    @ObfuscatedName("ab")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "300519100")
    public int method3671() {
        this.field2339 += 4;
        return ((this.payload[this.field2339 - 3] & 0xFF) << 16) + (this.payload[this.field2339 - 1] & 0xFF) + ((this.payload[this.field2339 - 2] & 0xFF) << 8) + ((this.payload[this.field2339 - 4] & 0xFF) << 24);
    }
    
    @ObfuscatedName("aw")
    @ObfuscatedSignature(signature = "(I)J", garbageValue = "-79725029")
    public long method3554() {
        return ((this.method3671() & 0xFFFFFFFFL) << 32) + (this.method3671() & 0xFFFFFFFFL);
    }
    
    @ObfuscatedName("ak")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-1667163047")
    public boolean method3555() {
        return (this.method3544() & 0x1) == 0x1;
    }
    
    @ObfuscatedName("as")
    @ObfuscatedSignature(signature = "(B)Ljava/lang/String;", garbageValue = "-38")
    public String method3752() {
        if (this.payload[this.field2339] == 0) {
            ++this.field2339;
            return null;
        }
        return this.method3738();
    }
    
    @ObfuscatedName("an")
    @ObfuscatedSignature(signature = "(I)Ljava/lang/String;", garbageValue = "-1431819169")
    public String method3738() {
        final int field2339 = this.field2339;
        while (this.payload[++this.field2339 - 1] != 0) {}
        final int n = this.field2339 - field2339 - 1;
        if (n == 0) {
            return "";
        }
        return Class78.method1831(this.payload, field2339, n);
    }
    
    @ObfuscatedName("ao")
    @ObfuscatedSignature(signature = "(B)Ljava/lang/String;", garbageValue = "43")
    public String method3558() {
        if (this.payload[++this.field2339 - 1] != 0) {
            throw new IllegalStateException("");
        }
        final int field2339 = this.field2339;
        while (this.payload[++this.field2339 - 1] != 0) {}
        final int n = this.field2339 - field2339 - 1;
        if (n == 0) {
            return "";
        }
        return Class78.method1831(this.payload, field2339, n);
    }
    
    @ObfuscatedName("at")
    @ObfuscatedSignature(signature = "(I)Ljava/lang/String;", garbageValue = "-1097930981")
    public String method3559() {
        if (this.payload[++this.field2339 - 1] != 0) {
            throw new IllegalStateException("");
        }
        final int method3566 = this.method3566();
        if (method3566 + this.field2339 > this.payload.length) {
            throw new IllegalStateException("");
        }
        final byte[] field2338 = this.payload;
        final int field2339 = this.field2339;
        final char[] array = new char[method3566];
        int n = 0;
        int i = field2339;
        final int n2 = method3566 + field2339;
        while (i < n2) {
            final int n3 = field2338[i++] & 0xFF;
            int n4;
            if (n3 < 128) {
                if (n3 == 0) {
                    n4 = 65533;
                }
                else {
                    n4 = n3;
                }
            }
            else if (n3 < 192) {
                n4 = 65533;
            }
            else if (n3 < 224) {
                if (i < n2 && (field2338[i] & 0xC0) == 0x80) {
                    n4 = ((n3 & 0x1F) << 6 | (field2338[i++] & 0x3F));
                    if (n4 < 128) {
                        n4 = 65533;
                    }
                }
                else {
                    n4 = 65533;
                }
            }
            else if (n3 < 240) {
                if (i + 1 < n2 && (field2338[i] & 0xC0) == 0x80 && (field2338[i + 1] & 0xC0) == 0x80) {
                    n4 = ((n3 & 0xF) << 12 | (field2338[i++] & 0x3F) << 6 | (field2338[i++] & 0x3F));
                    if (n4 < 2048) {
                        n4 = 65533;
                    }
                }
                else {
                    n4 = 65533;
                }
            }
            else if (n3 < 248) {
                if (i + 2 < n2 && (field2338[i] & 0xC0) == 0x80 && (field2338[i + 1] & 0xC0) == 0x80 && (field2338[i + 2] & 0xC0) == 0x80) {
                    final int n5 = (n3 & 0x7) << 18 | (field2338[i++] & 0x3F) << 12 | (field2338[i++] & 0x3F) << 6 | (field2338[i++] & 0x3F);
                    if (n5 < 65536 || n5 > 1114111) {
                        n4 = 65533;
                    }
                    else {
                        n4 = 65533;
                    }
                }
                else {
                    n4 = 65533;
                }
            }
            else {
                n4 = 65533;
            }
            array[n++] = (char)n4;
        }
        final String s = new String(array, 0, n);
        this.field2339 += method3566;
        return s;
    }
    
    @ObfuscatedName("ai")
    @ObfuscatedSignature(signature = "([BIIB)V", garbageValue = "35")
    public void method3539(final byte[] array, final int n, final int n2) {
        for (int i = n; i < n2 + n; ++i) {
            array[i] = this.payload[++this.field2339 - 1];
        }
    }
    
    @ObfuscatedName("ac")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-1820753890")
    public int method3561() {
        if ((this.payload[this.field2339] & 0xFF) < 128) {
            return this.method3544() - 64;
        }
        return this.method3550() - 49152;
    }
    
    @ObfuscatedName("ap")
    @ObfuscatedSignature(signature = "(S)I", garbageValue = "-18314")
    public int method3562() {
        if ((this.payload[this.field2339] & 0xFF) < 128) {
            return this.method3544();
        }
        return this.method3550() - 32768;
    }
    
    @ObfuscatedName("aa")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "65")
    public int method3563() {
        int n = 0;
        int i;
        for (i = this.method3562(); i == 32767; i = this.method3562()) {
            n += 32767;
        }
        return n + i;
    }
    
    @ObfuscatedName("ar")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-1860852380")
    public int method3611() {
        if (this.payload[this.field2339] < 0) {
            return this.method3671() & Integer.MAX_VALUE;
        }
        return this.method3550();
    }
    
    @ObfuscatedName("au")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1133683651")
    public int method3546() {
        if (this.payload[this.field2339] < 0) {
            return this.method3671() & Integer.MAX_VALUE;
        }
        final int method3550 = this.method3550();
        if (method3550 == 32767) {
            return -1;
        }
        return method3550;
    }
    
    @ObfuscatedName("av")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-179794498")
    public int method3566() {
        byte b = this.payload[++this.field2339 - 1];
        int n = 0;
        while (b < 0) {
            n = (n | (b & 0x7F)) << 7;
            b = this.payload[++this.field2339 - 1];
        }
        return n | b;
    }
    
    @ObfuscatedName("al")
    @ObfuscatedSignature(signature = "([II)V", garbageValue = "1224350853")
    public void method3567(final int[] array) {
        final int n = this.field2339 / 8;
        this.field2339 = 0;
        for (int i = 0; i < n; ++i) {
            int method3671 = this.method3671();
            int method3672 = this.method3671();
            int n2 = 0;
            final int n3 = -1640531527;
            int n4 = 32;
            while (n4-- > 0) {
                method3671 += (method3672 + (method3672 << 4 ^ method3672 >>> 5) ^ n2 + array[n2 & 0x3]);
                n2 += n3;
                method3672 += (method3671 + (method3671 << 4 ^ method3671 >>> 5) ^ array[n2 >>> 11 & 0x3] + n2);
            }
            this.field2339 -= 8;
            this.method3707(method3671);
            this.method3707(method3672);
        }
    }
    
    @ObfuscatedName("ae")
    @ObfuscatedSignature(signature = "([II)V", garbageValue = "2094043910")
    public void method3553(final int[] array) {
        final int n = this.field2339 / 8;
        this.field2339 = 0;
        for (int i = 0; i < n; ++i) {
            int method3671 = this.method3671();
            int method3672 = this.method3671();
            int n2 = -957401312;
            final int n3 = -1640531527;
            int n4 = 32;
            while (n4-- > 0) {
                method3672 -= (method3671 + (method3671 << 4 ^ method3671 >>> 5) ^ array[n2 >>> 11 & 0x3] + n2);
                n2 -= n3;
                method3671 -= (method3672 + (method3672 << 4 ^ method3672 >>> 5) ^ n2 + array[n2 & 0x3]);
            }
            this.field2339 -= 8;
            this.method3707(method3671);
            this.method3707(method3672);
        }
    }
    
    @ObfuscatedName("az")
    @ObfuscatedSignature(signature = "([IIIB)V", garbageValue = "30")
    public void method3569(final int[] array, final int field2339, final int n) {
        final int field2340 = this.field2339;
        this.field2339 = field2339;
        for (int n2 = (n - field2339) / 8, i = 0; i < n2; ++i) {
            int method3671 = this.method3671();
            int method3672 = this.method3671();
            int n3 = 0;
            final int n4 = -1640531527;
            int n5 = 32;
            while (n5-- > 0) {
                method3671 += (method3672 + (method3672 << 4 ^ method3672 >>> 5) ^ n3 + array[n3 & 0x3]);
                n3 += n4;
                method3672 += (method3671 + (method3671 << 4 ^ method3671 >>> 5) ^ array[n3 >>> 11 & 0x3] + n3);
            }
            this.field2339 -= 8;
            this.method3707(method3671);
            this.method3707(method3672);
        }
        this.field2339 = field2340;
    }
    
    @ObfuscatedName("aq")
    @ObfuscatedSignature(signature = "([IIII)V", garbageValue = "-2112776432")
    public void method3570(final int[] array, final int field2339, final int n) {
        final int field2340 = this.field2339;
        this.field2339 = field2339;
        for (int n2 = (n - field2339) / 8, i = 0; i < n2; ++i) {
            int method3671 = this.method3671();
            int method3672 = this.method3671();
            int n3 = -957401312;
            final int n4 = -1640531527;
            int n5 = 32;
            while (n5-- > 0) {
                method3672 -= (method3671 + (method3671 << 4 ^ method3671 >>> 5) ^ array[n3 >>> 11 & 0x3] + n3);
                n3 -= n4;
                method3671 -= (method3672 + (method3672 << 4 ^ method3672 >>> 5) ^ n3 + array[n3 & 0x3]);
            }
            this.field2339 -= 8;
            this.method3707(method3671);
            this.method3707(method3672);
        }
        this.field2339 = field2340;
    }
    
    @ObfuscatedName("ad")
    @ObfuscatedSignature(signature = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", garbageValue = "-2021764687")
    public void method3571(final BigInteger bigInteger, final BigInteger bigInteger2) {
        final int field2339 = this.field2339;
        this.field2339 = 0;
        final byte[] array = new byte[field2339];
        this.method3539(array, 0, field2339);
        final byte[] byteArray = new BigInteger(array).modPow(bigInteger, bigInteger2).toByteArray();
        this.field2339 = 0;
        this.method3755(byteArray.length);
        this.method3542(byteArray, 0, byteArray.length);
    }
    
    @ObfuscatedName("aj")
    @ObfuscatedSignature(signature = "(IB)I", garbageValue = "1")
    public int method3572(final int n) {
        final int method3812 = Class187.method3812(this.payload, n, this.field2339);
        this.method3707(method3812);
        return method3812;
    }
    
    @ObfuscatedName("ax")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-560337220")
    public boolean method3756() {
        this.field2339 -= 4;
        return this.method3671() == Class187.method3812(this.payload, 0, this.field2339);
    }
    
    @ObfuscatedName("am")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "108964368")
    public void method3574(final int n) {
        this.payload[++this.field2339 - 1] = (byte)(n + 128);
    }
    
    @ObfuscatedName("ay")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "0")
    public void method3575(final int n) {
        this.payload[++this.field2339 - 1] = (byte)(0 - n);
    }
    
    @ObfuscatedName("ag")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-2095651768")
    public void method3576(final int n) {
        this.payload[++this.field2339 - 1] = (byte)(128 - n);
    }
    
    @ObfuscatedName("bk")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-1015540220")
    public int method3577() {
        return this.payload[++this.field2339 - 1] - 128 & 0xFF;
    }
    
    @ObfuscatedName("bp")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-333234069")
    public int method3607() {
        return 0 - this.payload[++this.field2339 - 1] & 0xFF;
    }
    
    @ObfuscatedName("bi")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-667606696")
    public int method3765() {
        return 128 - this.payload[++this.field2339 - 1] & 0xFF;
    }
    
    @ObfuscatedName("bj")
    @ObfuscatedSignature(signature = "(I)B", garbageValue = "-1200890810")
    public byte method3660() {
        return (byte)(this.payload[++this.field2339 - 1] - 128);
    }
    
    @ObfuscatedName("bo")
    @ObfuscatedSignature(signature = "(I)B", garbageValue = "-1272283600")
    public byte method3610() {
        return (byte)(128 - this.payload[++this.field2339 - 1]);
    }
    
    @ObfuscatedName("bq")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "-35")
    public void method3582(final int n) {
        this.payload[++this.field2339 - 1] = (byte)n;
        this.payload[++this.field2339 - 1] = (byte)(n >> 8);
    }
    
    @ObfuscatedName("bh")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "1")
    public void method3583(final int n) {
        this.payload[++this.field2339 - 1] = (byte)(n >> 8);
        this.payload[++this.field2339 - 1] = (byte)(n + 128);
    }
    
    @ObfuscatedName("bz")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "355756817")
    public void method3771(final int n) {
        this.payload[++this.field2339 - 1] = (byte)(n + 128);
        this.payload[++this.field2339 - 1] = (byte)(n >> 8);
    }
    
    @ObfuscatedName("bu")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "-125")
    public int method3585() {
        this.field2339 += 2;
        return ((this.payload[this.field2339 - 1] & 0xFF) << 8) + (this.payload[this.field2339 - 2] & 0xFF);
    }
    
    @ObfuscatedName("bg")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1914369906")
    public int method3613() {
        this.field2339 += 2;
        return (this.payload[this.field2339 - 1] - 128 & 0xFF) + ((this.payload[this.field2339 - 2] & 0xFF) << 8);
    }
    
    @ObfuscatedName("bl")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "104")
    public int method3646() {
        this.field2339 += 2;
        return ((this.payload[this.field2339 - 1] & 0xFF) << 8) + (this.payload[this.field2339 - 2] - 128 & 0xFF);
    }
    
    @ObfuscatedName("ba")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "-37")
    public int method3588() {
        this.field2339 += 2;
        int n = ((this.payload[this.field2339 - 1] & 0xFF) << 8) + (this.payload[this.field2339 - 2] & 0xFF);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    @ObfuscatedName("bn")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-146230491")
    public int method3533() {
        this.field2339 += 2;
        int n = ((this.payload[this.field2339 - 1] & 0xFF) << 8) + (this.payload[this.field2339 - 2] - 128 & 0xFF);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    @ObfuscatedName("bb")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "7272657")
    public void method3731(final int n) {
        this.payload[++this.field2339 - 1] = (byte)(n >> 8);
        this.payload[++this.field2339 - 1] = (byte)(n >> 16);
        this.payload[++this.field2339 - 1] = (byte)n;
    }
    
    @ObfuscatedName("bx")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "2079468396")
    public int method3591() {
        this.field2339 += 3;
        return ((this.payload[this.field2339 - 1] & 0xFF) << 8) + ((this.payload[this.field2339 - 3] & 0xFF) << 16) + (this.payload[this.field2339 - 2] & 0xFF);
    }
    
    @ObfuscatedName("bc")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "18")
    public void method3687(final int n) {
        this.payload[++this.field2339 - 1] = (byte)n;
        this.payload[++this.field2339 - 1] = (byte)(n >> 8);
        this.payload[++this.field2339 - 1] = (byte)(n >> 16);
        this.payload[++this.field2339 - 1] = (byte)(n >> 24);
    }
    
    @ObfuscatedName("bs")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "351806005")
    public void method3673(final int n) {
        this.payload[++this.field2339 - 1] = (byte)(n >> 8);
        this.payload[++this.field2339 - 1] = (byte)n;
        this.payload[++this.field2339 - 1] = (byte)(n >> 24);
        this.payload[++this.field2339 - 1] = (byte)(n >> 16);
    }
    
    @ObfuscatedName("be")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-1686058636")
    public void method3594(final int n) {
        this.payload[++this.field2339 - 1] = (byte)(n >> 16);
        this.payload[++this.field2339 - 1] = (byte)(n >> 24);
        this.payload[++this.field2339 - 1] = (byte)n;
        this.payload[++this.field2339 - 1] = (byte)(n >> 8);
    }
    
    @ObfuscatedName("by")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "2045011915")
    public int method3595() {
        this.field2339 += 4;
        return (this.payload[this.field2339 - 4] & 0xFF) + ((this.payload[this.field2339 - 3] & 0xFF) << 8) + ((this.payload[this.field2339 - 2] & 0xFF) << 16) + ((this.payload[this.field2339 - 1] & 0xFF) << 24);
    }
    
    @ObfuscatedName("bv")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-557412257")
    public int method3770() {
        this.field2339 += 4;
        return ((this.payload[this.field2339 - 2] & 0xFF) << 24) + ((this.payload[this.field2339 - 4] & 0xFF) << 8) + (this.payload[this.field2339 - 3] & 0xFF) + ((this.payload[this.field2339 - 1] & 0xFF) << 16);
    }
    
    @ObfuscatedName("br")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1053759299")
    public int method3609() {
        this.field2339 += 4;
        return ((this.payload[this.field2339 - 1] & 0xFF) << 8) + ((this.payload[this.field2339 - 4] & 0xFF) << 16) + (this.payload[this.field2339 - 2] & 0xFF) + ((this.payload[this.field2339 - 3] & 0xFF) << 24);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)J", garbageValue = "604838575")
    public static synchronized long method3547() {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < Class184.field2351) {
            Class184.field2350 += Class184.field2351 - currentTimeMillis;
        }
        Class184.field2351 = currentTimeMillis;
        return currentTimeMillis + Class184.field2350;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II)Ljy;", garbageValue = "2135304076")
    public static Class266 method3603(final int n) {
        final Class266 class266 = (Class266)Class266.field3342.method3989(n);
        if (class266 != null) {
            return class266;
        }
        final byte[] method4625 = Class266.field3338.method4625(8, n);
        final Class266 class267 = new Class266();
        if (method4625 != null) {
            class267.method4978(new Class182(method4625));
        }
        Class266.field3342.method3983(class267, n);
        return class267;
    }
}
