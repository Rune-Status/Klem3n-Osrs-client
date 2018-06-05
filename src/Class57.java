import java.util.Date;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bq")
public class Class57 implements Runnable
{
    @ObfuscatedName("fx")
    @ObfuscatedGetter(intValue = -245212773)
    static int field524;
    @ObfuscatedName("z")
    boolean field529;
    @ObfuscatedName("w")
    Object field523;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 139404487)
    int field522;
    @ObfuscatedName("l")
    int[] field525;
    @ObfuscatedName("u")
    int[] field526;
    
    Class57() {
        this.field529 = true;
        this.field523 = new Object();
        this.field522 = 0;
        this.field525 = new int[500];
        this.field526 = new int[500];
    }
    
    @Override
    public void run() {
        while (this.field529) {
            synchronized (this.field523) {
                if (this.field522 < 500) {
                    this.field525[this.field522] = Class48.field425;
                    this.field526[this.field522] = Class48.field426 * 673804999;
                    ++this.field522;
                }
            }
            Class63.method1539(50L);
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II)Lib;", garbageValue = "-1295663391")
    public static Class258 method1035(final int field3280) {
        final Class258 class258 = (Class258)Class258.field3267.method3989(field3280);
        if (class258 != null) {
            return class258;
        }
        final byte[] method4625 = Class258.field3272.method4625(13, field3280);
        final Class258 class259 = new Class258();
        class259.field3280 = field3280;
        if (method4625 != null) {
            class259.method4864(new Class182(method4625));
        }
        Class258.field3267.method3983(class259, field3280);
        return class259;
    }
    
    @ObfuscatedName("o")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "-332860398")
    static int method1034(final int n, final Class84 class84, final boolean b) {
        if (n == 4100) {
            Class69.field1001[++Class55.field497 - 1] = Class69.field1001[--Class55.field497] + Class69.field999[--Class69.field1003];
            return 1;
        }
        if (n == 4101) {
            Class55.field497 -= 2;
            Class69.field1001[++Class55.field497 - 1] = Class69.field1001[Class55.field497] + Class69.field1001[Class55.field497 + 1];
            return 1;
        }
        if (n == 4102) {
            final String s = Class69.field1001[--Class55.field497];
            final int n2 = Class69.field999[--Class69.field1003];
            final String[] field1001 = Class69.field1001;
            final int n3 = ++Class55.field497 - 1;
            final String s2 = s;
            String string;
            if (n2 < 0) {
                string = Integer.toString(n2);
            }
            else {
                int n4 = n2;
                String string2;
                if (n4 < 0) {
                    string2 = Integer.toString(n4, 10);
                }
                else {
                    int n5 = 2;
                    for (int i = n4 / 10; i != 0; i /= 10, ++n5) {}
                    final char[] array = new char[n5];
                    array[0] = '+';
                    for (int j = n5 - 1; j > 0; --j) {
                        final int n6 = n4;
                        n4 /= 10;
                        final int n7 = n6 - n4 * 10;
                        if (n7 >= 10) {
                            array[j] = (char)(n7 + 87);
                        }
                        else {
                            array[j] = (char)(n7 + 48);
                        }
                    }
                    string2 = new String(array);
                }
                string = string2;
            }
            field1001[n3] = s2 + string;
            return 1;
        }
        if (n == 4103) {
            Class69.field1001[++Class55.field497 - 1] = Class69.field1001[--Class55.field497].toLowerCase();
            return 1;
        }
        if (n == 4104) {
            Class69.field1007.setTime(new Date(86400000L * (Class69.field999[--Class69.field1003] + 11745L)));
            Class69.field1001[++Class55.field497 - 1] = Class69.field1007.get(5) + "-" + Class69.field998[Class69.field1007.get(2)] + "-" + Class69.field1007.get(1);
            return 1;
        }
        if (n == 4105) {
            Class55.field497 -= 2;
            final String s3 = Class69.field1001[Class55.field497];
            final String s4 = Class69.field1001[Class55.field497 + 1];
            if (Class138.field1876.field546 != null && Class138.field1876.field546.field2571) {
                Class69.field1001[++Class55.field497 - 1] = s4;
            }
            else {
                Class69.field1001[++Class55.field497 - 1] = s3;
            }
            return 1;
        }
        if (n == 4106) {
            Class69.field1001[++Class55.field497 - 1] = Integer.toString(Class69.field999[--Class69.field1003]);
            return 1;
        }
        if (n == 4107) {
            Class55.field497 -= 2;
            final int[] field1002 = Class69.field999;
            final int n8 = ++Class69.field1003 - 1;
            final int method3269 = Class155.method3269(Class69.field1001[Class55.field497], Class69.field1001[Class55.field497 + 1], Client.field827);
            int n9;
            if (method3269 > 0) {
                n9 = 1;
            }
            else if (method3269 < 0) {
                n9 = -1;
            }
            else {
                n9 = 0;
            }
            field1002[n8] = n9;
            return 1;
        }
        if (n == 4108) {
            final String s5 = Class69.field1001[--Class55.field497];
            Class69.field1003 -= 2;
            Class69.field999[++Class69.field1003 - 1] = new Class298(Class50.field461.method4625(Class69.field999[Class69.field1003 + 1], 0)).method5520(s5, Class69.field999[Class69.field1003]);
            return 1;
        }
        if (n == 4109) {
            final String s6 = Class69.field1001[--Class55.field497];
            Class69.field1003 -= 2;
            Class69.field999[++Class69.field1003 - 1] = new Class298(Class50.field461.method4625(Class69.field999[Class69.field1003 + 1], 0)).method5519(s6, Class69.field999[Class69.field1003]);
            return 1;
        }
        if (n == 4110) {
            Class55.field497 -= 2;
            final String s7 = Class69.field1001[Class55.field497];
            final String s8 = Class69.field1001[Class55.field497 + 1];
            if (Class69.field999[--Class69.field1003] == 1) {
                Class69.field1001[++Class55.field497 - 1] = s7;
            }
            else {
                Class69.field1001[++Class55.field497 - 1] = s8;
            }
            return 1;
        }
        if (n == 4111) {
            Class69.field1001[++Class55.field497 - 1] = Class299.method5521(Class69.field1001[--Class55.field497]);
            return 1;
        }
        if (n == 4112) {
            Class69.field1001[++Class55.field497 - 1] = Class69.field1001[--Class55.field497] + (char)Class69.field999[--Class69.field1003];
            return 1;
        }
        if (n == 4113) {
            Class69.field999[++Class69.field1003 - 1] = (Class52.method1002((char)Class69.field999[--Class69.field1003]) ? 1 : 0);
            return 1;
        }
        if (n == 4114) {
            Class69.field999[++Class69.field1003 - 1] = (Class161.method3362((char)Class69.field999[--Class69.field1003]) ? 1 : 0);
            return 1;
        }
        if (n == 4115) {
            final int n10 = Class69.field999[--Class69.field1003];
            final int[] field1003 = Class69.field999;
            final int n11 = ++Class69.field1003 - 1;
            final char c = (char)n10;
            field1003[n11] = (((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) ? 1 : 0);
            return 1;
        }
        if (n == 4116) {
            final int n12 = Class69.field999[--Class69.field1003];
            final int[] field1004 = Class69.field999;
            final int n13 = ++Class69.field1003 - 1;
            final char c2 = (char)n12;
            field1004[n13] = ((c2 >= '0' && c2 <= '9') ? 1 : 0);
            return 1;
        }
        if (n == 4117) {
            final String s9 = Class69.field1001[--Class55.field497];
            if (s9 != null) {
                Class69.field999[++Class69.field1003 - 1] = s9.length();
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = 0;
            }
            return 1;
        }
        if (n == 4118) {
            final String s10 = Class69.field1001[--Class55.field497];
            Class69.field1003 -= 2;
            Class69.field1001[++Class55.field497 - 1] = s10.substring(Class69.field999[Class69.field1003], Class69.field999[Class69.field1003 + 1]);
            return 1;
        }
        if (n == 4119) {
            final String s11 = Class69.field1001[--Class55.field497];
            final StringBuilder sb = new StringBuilder(s11.length());
            boolean b2 = false;
            for (int k = 0; k < s11.length(); ++k) {
                final char char1 = s11.charAt(k);
                if (char1 == '<') {
                    b2 = true;
                }
                else if (char1 == '>') {
                    b2 = false;
                }
                else if (!b2) {
                    sb.append(char1);
                }
            }
            Class69.field1001[++Class55.field497 - 1] = sb.toString();
            return 1;
        }
        if (n == 4120) {
            Class69.field999[++Class69.field1003 - 1] = Class69.field1001[--Class55.field497].indexOf(Class69.field999[--Class69.field1003]);
            return 1;
        }
        if (n == 4121) {
            Class55.field497 -= 2;
            Class69.field999[++Class69.field1003 - 1] = Class69.field1001[Class55.field497].indexOf(Class69.field1001[Class55.field497 + 1], Class69.field999[--Class69.field1003]);
            return 1;
        }
        return 2;
    }
    
    @ObfuscatedName("y")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-113")
    public static void method1036() {
        Class269.field3461.method3984();
        Class269.field3428.method3984();
        Class269.field3429.method3984();
    }
}
