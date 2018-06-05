import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("in")
public class Class251
{
    @ObfuscatedName("z")
    final HashMap field3220;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lkg;")
    Class310 field3219;
    @ObfuscatedName("s")
    int[] field3218;
    @ObfuscatedName("l")
    int[] field3216;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1551393161)
    int field3217;
    
    public Class251() {
        this.field3220 = new HashMap();
        this.field3219 = new Class310(0, 0);
        this.field3218 = new int[2048];
        this.field3216 = new int[2048];
        this.field3217 = 0;
        Class64.method1560();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "1389377337")
    void method4771(final int n) {
        final int n2 = n * 2 + 1;
        final double[] method4986 = Class266.method4986(0.0, n / 3.0f, n);
        final double n3 = method4986[n] * method4986[n];
        final int[] array = new int[n2 * n2];
        int n4 = 0;
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n2; ++j) {
                final int[] array2 = array;
                final int n5 = j + i * n2;
                final int n6 = (int)(256.0 * (method4986[i] * method4986[j] / n3));
                array2[n5] = n6;
                final int n7 = n6;
                if (n4 == 0 && n7 > 0) {
                    n4 = 1;
                }
            }
        }
        this.field3220.put(n, new Class318(array, n2, n2));
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IB)Lll;", garbageValue = "85")
    Class318 method4772(final int n) {
        if (!this.field3220.containsKey(n)) {
            this.method4771(n);
        }
        return (Class318) this.field3220.get(n);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "-1087608107")
    public final void method4773(final int n, final int n2) {
        if (this.field3217 >= this.field3218.length) {
            return;
        }
        this.field3218[this.field3217] = n;
        this.field3216[this.field3217] = n2;
        ++this.field3217;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "641561299")
    public final void method4774() {
        this.field3217 = 0;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(IILll;FI)V", garbageValue = "2066136906")
    public final void method4776(final int n, final int n2, final Class318 class318, final float n3) {
        final int n4 = (int)(n3 * 18.0f);
        final Class318 method4772 = this.method4772(n4);
        final int n5 = n4 * 2 + 1;
        final Class310 class319 = new Class310(0, 0, class318.field3787, class318.field3788);
        final Class310 class320 = new Class310(0, 0);
        this.field3219.method5680(n5, n5);
        System.nanoTime();
        for (int i = 0; i < this.field3217; ++i) {
            this.field3219.method5679((int)((this.field3218[i] - n) * n3) - n4, (int)(class318.field3788 - n3 * (this.field3216[i] - n2)) - n4);
            this.field3219.method5681(class319, class320);
            this.method4790(method4772, class318, class320);
        }
        System.nanoTime();
        System.nanoTime();
        for (int j = 0; j < class318.field3791.length; ++j) {
            if (class318.field3791[j] == 0) {
                class318.field3791[j] = -16777216;
            }
            else {
                int length = (class318.field3791[j] + 64 - 1) / 256;
                if (length <= 0) {
                    class318.field3791[j] = -16777216;
                }
                else {
                    if (length > Class224.field2554.length) {
                        length = Class224.field2554.length;
                    }
                    class318.field3791[j] = (0xFF000000 | Class224.field2554[length - 1]);
                }
            }
        }
        System.nanoTime();
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(Lll;Lll;Lkg;B)V", garbageValue = "-68")
    void method4790(final Class318 class318, final Class318 class319, final Class310 class320) {
        if (class320.field3747 == 0 || class320.field3745 == 0) {
            return;
        }
        int n = 0;
        int n2 = 0;
        if (class320.field3746 == 0) {
            n = class318.field3787 - class320.field3747;
        }
        if (class320.field3743 == 0) {
            n2 = class318.field3788 - class320.field3745;
        }
        int n3 = n + n2 * class318.field3787;
        int n4 = class320.field3746 + class319.field3787 * class320.field3743;
        for (int i = 0; i < class320.field3745; ++i) {
            for (int j = 0; j < class320.field3747; ++j) {
                final int[] field3791 = class319.field3791;
                final int n5 = n4++;
                field3791[n5] += class318.field3791[n3++];
            }
            n3 += class318.field3787 - class320.field3747;
            n4 += class319.field3787 - class320.field3747;
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "([Ljava/lang/CharSequence;III)Ljava/lang/String;", garbageValue = "-1980014136")
    public static String method4794(final CharSequence[] array, final int n, final int n2) {
        if (n2 == 0) {
            return "";
        }
        if (n2 != 1) {
            final int n3 = n2 + n;
            int n4 = 0;
            for (int i = n; i < n3; ++i) {
                final CharSequence charSequence = array[i];
                if (charSequence == null) {
                    n4 += 4;
                }
                else {
                    n4 += charSequence.length();
                }
            }
            final StringBuilder sb = new StringBuilder(n4);
            for (int j = n; j < n3; ++j) {
                final CharSequence charSequence2 = array[j];
                if (charSequence2 == null) {
                    sb.append("null");
                }
                else {
                    sb.append(charSequence2);
                }
            }
            return sb.toString();
        }
        final CharSequence charSequence3 = array[n];
        if (charSequence3 == null) {
            return "null";
        }
        return charSequence3.toString();
    }
}
