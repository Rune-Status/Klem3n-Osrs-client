import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("kn")
public class Class293 extends Class285
{
    @ObfuscatedName("eg")
    @ObfuscatedSignature(signature = "Lkj;")
    static Class298 field3660;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Llm;")
    final Class322 field3656;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lke;")
    final Class288 field3652;
    @ObfuscatedName("e")
    public String field3654;
    @ObfuscatedName("p")
    public String field3655;
    @ObfuscatedName("b")
    public byte field3651;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = 1049775565)
    public int field3657;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = -1251671567)
    int field3658;
    
    public Class293(final Class322 field3656, final Class288 field3657) {
        super(100);
        this.field3654 = null;
        this.field3655 = null;
        this.field3658 = 1;
        this.field3656 = field3656;
        this.field3652 = field3657;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)Ljx;", garbageValue = "2139940378")
    @Override
    Class282 vmethod5461() {
        return new Class281();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)[Ljx;", garbageValue = "828432673")
    @Override
    Class282[] vmethod5462(final int n) {
        return new Class281[n];
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "191342442")
    final void method5477(final String s) {
        long n = 0L;
        for (int length = s.length(), i = 0; i < length; ++i) {
            n *= 37L;
            final char char1 = s.charAt(i);
            if (char1 >= 'A' && char1 <= 'Z') {
                n += char1 + '\u0001' - 'A';
            }
            else if (char1 >= 'a' && char1 <= 'z') {
                n += char1 + '\u0001' - 'a';
            }
            else if (char1 >= '0' && char1 <= '9') {
                n += char1 + '\u001b' - '0';
            }
            if (n >= 177917621779460413L) {
                break;
            }
        }
        while (n % 37L == 0L && 0L != n) {
            n /= 37L;
        }
        String method3457 = Class172.method3457(n);
        if (method3457 == null) {
            method3457 = "";
        }
        this.field3654 = method3457;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "-1517543240")
    final void method5464(final String s) {
        long n = 0L;
        for (int length = s.length(), i = 0; i < length; ++i) {
            n *= 37L;
            final char char1 = s.charAt(i);
            if (char1 >= 'A' && char1 <= 'Z') {
                n += char1 + '\u0001' - 'A';
            }
            else if (char1 >= 'a' && char1 <= 'z') {
                n += char1 + '\u0001' - 'a';
            }
            else if (char1 >= '0' && char1 <= '9') {
                n += char1 + '\u001b' - '0';
            }
            if (n >= 177917621779460413L) {
                break;
            }
        }
        while (0L == n % 37L && 0L != n) {
            n /= 37L;
        }
        String method3457 = Class172.method3457(n);
        if (method3457 == null) {
            method3457 = "";
        }
        this.field3655 = method3457;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "-107804510")
    public final void method5463(final Class182 class182) {
        this.method5464(class182.method3738());
        long method3554 = class182.method3554();
        String string;
        if (method3554 > 0L && method3554 < 6582952005840035281L) {
            if (method3554 % 37L == 0L) {
                string = null;
            }
            else {
                int n = 0;
                for (long n2 = method3554; 0L != n2; n2 /= 37L) {
                    ++n;
                }
                final StringBuilder sb = new StringBuilder(n);
                while (method3554 != 0L) {
                    final long n3 = method3554;
                    method3554 /= 37L;
                    sb.append(Class303.field3720[(int)(n3 - method3554 * 37L)]);
                }
                string = sb.reverse().toString();
            }
        }
        else {
            string = null;
        }
        this.method5477(string);
        this.field3651 = class182.method3681();
        final int method3555 = class182.method3544();
        if (method3555 == 255) {
            return;
        }
        this.method5326();
        for (int i = 0; i < method3555; ++i) {
            final Class281 class183 = (Class281)this.method5377(new Class291(class182.method3738(), this.field3656));
            class183.method5412(class182.method3550(), ++this.field3658 - 1);
            class183.field3629 = class182.method3681();
            class182.method3738();
            this.method5482(class183);
        }
    }
    
    @ObfuscatedName("cf")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "345415230")
    public final void method5489(final Class182 class182) {
        final Class291 class183 = new Class291(class182.method3738(), this.field3656);
        final int method3550 = class182.method3550();
        final byte method3551 = class182.method3681();
        boolean b = false;
        if (method3551 == -128) {
            b = true;
        }
        if (b) {
            if (this.method5327() == 0) {
                return;
            }
            final Class281 class184 = (Class281)this.method5331(class183);
            if (class184 != null && class184.method5414() == method3550) {
                this.method5334(class184);
            }
        }
        else {
            class182.method3738();
            Class281 class185 = (Class281)this.method5331(class183);
            if (class185 == null) {
                if (this.method5327() > super.field3620) {
                    return;
                }
                class185 = (Class281)this.method5377(class183);
            }
            class185.method5412(method3550, ++this.field3658 - 1);
            class185.field3629 = method3551;
            this.method5482(class185);
        }
    }
    
    @ObfuscatedName("ca")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-54")
    public final void method5467() {
        for (int i = 0; i < this.method5327(); ++i) {
            ((Class281)this.method5336(i)).method5272();
        }
    }
    
    @ObfuscatedName("cr")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "453420624")
    public final void method5468() {
        for (int i = 0; i < this.method5327(); ++i) {
            ((Class281)this.method5336(i)).method5273();
        }
    }
    
    @ObfuscatedName("cv")
    @ObfuscatedSignature(signature = "(Ljz;I)V", garbageValue = "-1325604678")
    final void method5482(final Class281 class281) {
        if (class281.method5287().equals(this.field3652.vmethod5420())) {
            this.field3657 = class281.field3629;
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(CB)Z", garbageValue = "-34")
    public static boolean method5496(final char c) {
        if ((c <= '\0' || c >= '\u0080') && (c < ' ' || c > '\u00ff')) {
            if (c != '\0') {
                final char[] field3714 = Class301.field3714;
                for (int i = 0; i < field3714.length; ++i) {
                    if (c == field3714[i]) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
