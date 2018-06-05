import java.io.DataInputStream;
import java.net.URL;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("q")
final class Class5 implements Comparator
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ls;Ls;B)I", garbageValue = "43")
    int method58(final Class2 class2, final Class2 class3) {
        return (class2.field17.field30 < class3.field17.field30) ? -1 : ((class3.field17.field30 == class2.field17.field30) ? 0 : 1);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method58((Class2)o, (Class2)o2);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", garbageValue = "53")
    public static void method65(final String s, final Throwable t) {
        if (t != null) {
            t.printStackTrace();
            return;
        }
        try {
            String s2 = "";
            if (t != null) {
                Throwable field1943 = t;
                String s3;
                if (field1943 instanceof Class152) {
                    final Class152 class152 = (Class152)field1943;
                    s3 = class152.field1941 + " | ";
                    field1943 = class152.field1943;
                }
                else {
                    s3 = "";
                }
                final StringWriter stringWriter = new StringWriter();
                final PrintWriter printWriter = new PrintWriter(stringWriter);
                field1943.printStackTrace(printWriter);
                printWriter.close();
                final BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
                final String line = bufferedReader.readLine();
                while (true) {
                    String s4 = bufferedReader.readLine();
                    if (s4 == null) {
                        break;
                    }
                    final int index = s4.indexOf(40);
                    final int index2 = s4.indexOf(41, index + 1);
                    if (index >= 0 && index2 >= 0) {
                        final String substring = s4.substring(index + 1, index2);
                        final int index3 = substring.indexOf(".java:");
                        if (index3 >= 0) {
                            s3 = s3 + (substring.substring(0, index3) + substring.substring(index3 + 5)) + ' ';
                            continue;
                        }
                        s4 = s4.substring(0, index);
                    }
                    final String trim = s4.trim();
                    final String substring2 = trim.substring(trim.lastIndexOf(32) + 1);
                    s3 = s3 + substring2.substring(substring2.lastIndexOf(9) + 1) + ' ';
                }
                s2 = s3 + "| " + line;
            }
            if (s != null) {
                if (t != null) {
                    s2 += " | ";
                }
                s2 += s;
            }
            System.out.println("Error: " + s2);
            final String replace = s2.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
            if (Class152.field1938 == null) {
                return;
            }
            final DataInputStream dataInputStream = new DataInputStream(new URL(Class152.field1938.getCodeBase(), "clienterror.ws?c=" + Class42.field362 + "&u=" + Class152.field1939 + "&v1=" + Signlink.javaVendor + "&v2=" + Signlink.javaVersion + "&ct=" + Class152.field1940 + "&e=" + replace).openStream());
            dataInputStream.read();
            dataInputStream.close();
        }
        catch (Exception ex) {}
    }
    
    @ObfuscatedName("ab")
    @ObfuscatedSignature(signature = "(ILce;ZB)I", garbageValue = "116")
    static int method59(final int n, final Class84 class84, final boolean b) {
        if (n == 6500) {
            Class69.field999[++Class69.field1003 - 1] = (Class4.method36() ? 1 : 0);
            return 1;
        }
        if (n == 6501) {
            Class65.field944 = 0;
            final Class65 method4592 = Class236.method4592();
            if (method4592 != null) {
                Class69.field999[++Class69.field1003 - 1] = method4592.field947;
                Class69.field999[++Class69.field1003 - 1] = method4592.field948;
                Class69.field1001[++Class55.field497 - 1] = method4592.field951;
                Class69.field999[++Class69.field1003 - 1] = method4592.field952;
                Class69.field999[++Class69.field1003 - 1] = method4592.field955;
                Class69.field1001[++Class55.field497 - 1] = method4592.field950;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = -1;
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field1001[++Class55.field497 - 1] = "";
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field1001[++Class55.field497 - 1] = "";
            }
            return 1;
        }
        if (n == 6502) {
            final Class65 method4593 = Class236.method4592();
            if (method4593 != null) {
                Class69.field999[++Class69.field1003 - 1] = method4593.field947;
                Class69.field999[++Class69.field1003 - 1] = method4593.field948;
                Class69.field1001[++Class55.field497 - 1] = method4593.field951;
                Class69.field999[++Class69.field1003 - 1] = method4593.field952;
                Class69.field999[++Class69.field1003 - 1] = method4593.field955;
                Class69.field1001[++Class55.field497 - 1] = method4593.field950;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = -1;
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field1001[++Class55.field497 - 1] = "";
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field1001[++Class55.field497 - 1] = "";
            }
            return 1;
        }
        if (n == 6506) {
            final int n2 = Class69.field999[--Class69.field1003];
            Class65 class85 = null;
            for (int i = 0; i < Class65.field945; ++i) {
                if (n2 == Class65.field949[i].field947) {
                    class85 = Class65.field949[i];
                    break;
                }
            }
            if (class85 != null) {
                Class69.field999[++Class69.field1003 - 1] = class85.field947;
                Class69.field999[++Class69.field1003 - 1] = class85.field948;
                Class69.field1001[++Class55.field497 - 1] = class85.field951;
                Class69.field999[++Class69.field1003 - 1] = class85.field952;
                Class69.field999[++Class69.field1003 - 1] = class85.field955;
                Class69.field1001[++Class55.field497 - 1] = class85.field950;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = -1;
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field1001[++Class55.field497 - 1] = "";
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field1001[++Class55.field497 - 1] = "";
            }
            return 1;
        }
        if (n == 6507) {
            Class69.field1003 -= 4;
            final int n3 = Class69.field999[Class69.field1003];
            final boolean b2 = Class69.field999[Class69.field1003 + 1] == 1;
            final int n4 = Class69.field999[Class69.field1003 + 2];
            final boolean b3 = Class69.field999[Class69.field1003 + 3] == 1;
            if (Class65.field949 != null) {
                Class120.method2781(0, Class65.field949.length - 1, n3, b2, n4, b3);
            }
            return 1;
        }
        if (n == 6511) {
            final int n5 = Class69.field999[--Class69.field1003];
            if (n5 >= 0 && n5 < Class65.field945) {
                final Class65 class86 = Class65.field949[n5];
                Class69.field999[++Class69.field1003 - 1] = class86.field947;
                Class69.field999[++Class69.field1003 - 1] = class86.field948;
                Class69.field1001[++Class55.field497 - 1] = class86.field951;
                Class69.field999[++Class69.field1003 - 1] = class86.field952;
                Class69.field999[++Class69.field1003 - 1] = class86.field955;
                Class69.field1001[++Class55.field497 - 1] = class86.field950;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = -1;
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field1001[++Class55.field497 - 1] = "";
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field1001[++Class55.field497 - 1] = "";
            }
            return 1;
        }
        if (n == 6512) {
            Client.field725 = (Class69.field999[--Class69.field1003] == 1);
            return 1;
        }
        if (n == 6513) {
            Class69.field1003 -= 2;
            final int n6 = Class69.field999[Class69.field1003];
            final int n7 = Class69.field999[Class69.field1003 + 1];
            final Class264 method4594 = Class241.method4603(n7);
            if (method4594.method4951()) {
                Class69.field1001[++Class55.field497 - 1] = Class270.method5157(n6).method5167(n7, method4594.field3333);
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = Class270.method5157(n6).method5166(n7, method4594.field3330);
            }
            return 1;
        }
        if (n == 6514) {
            Class69.field1003 -= 2;
            final int n8 = Class69.field999[Class69.field1003];
            final int n9 = Class69.field999[Class69.field1003 + 1];
            final Class264 method4595 = Class241.method4603(n9);
            if (method4595.method4951()) {
                Class69.field1001[++Class55.field497 - 1] = Class110.method2527(n8).method5036(n9, method4595.field3333);
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = Class110.method2527(n8).method5035(n9, method4595.field3330);
            }
            return 1;
        }
        if (n == 6515) {
            Class69.field1003 -= 2;
            final int n10 = Class69.field999[Class69.field1003];
            final int n11 = Class69.field999[Class69.field1003 + 1];
            final Class264 method4596 = Class241.method4603(n11);
            if (method4596.method4951()) {
                Class69.field1001[++Class55.field497 - 1] = Class111.method2563(n10).method5121(n11, method4596.field3333);
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = Class111.method2563(n10).method5099(n11, method4596.field3330);
            }
            return 1;
        }
        if (n == 6516) {
            Class69.field1003 -= 2;
            final int n12 = Class69.field999[Class69.field1003];
            final int n13 = Class69.field999[Class69.field1003 + 1];
            final Class264 method4597 = Class241.method4603(n13);
            if (method4597.method4951()) {
                final String[] field1001 = Class69.field1001;
                final int n14 = ++Class55.field497 - 1;
                final Class265 class87 = (Class265)Class265.field3334.method3989(n12);
                Class265 class88;
                if (class87 != null) {
                    class88 = class87;
                }
                else {
                    final byte[] method4598 = Class7.field42.method4625(34, n12);
                    final Class265 class89 = new Class265();
                    if (method4598 != null) {
                        class89.method4960(new Class182(method4598));
                    }
                    class89.method4961();
                    Class265.field3334.method3983(class89, n12);
                    class88 = class89;
                }
                field1001[n14] = class88.method4963(n13, method4597.field3333);
            }
            else {
                final int[] field1002 = Class69.field999;
                final int n15 = ++Class69.field1003 - 1;
                final Class265 class90 = (Class265)Class265.field3334.method3989(n12);
                Class265 class91;
                if (class90 != null) {
                    class91 = class90;
                }
                else {
                    final byte[] method4599 = Class7.field42.method4625(34, n12);
                    final Class265 class92 = new Class265();
                    if (method4599 != null) {
                        class92.method4960(new Class182(method4599));
                    }
                    class92.method4961();
                    Class265.field3334.method3983(class92, n12);
                    class91 = class92;
                }
                field1002[n15] = class91.method4962(n13, method4597.field3330);
            }
            return 1;
        }
        if (n == 6518) {
            Class69.field999[++Class69.field1003 - 1] = (Client.field588 ? 1 : 0);
            return 1;
        }
        if (n == 6520) {
            return 1;
        }
        if (n == 6521) {
            return 1;
        }
        if (n == 6522) {
            --Class55.field497;
            --Class69.field1003;
            return 1;
        }
        if (n == 6523) {
            --Class55.field497;
            --Class69.field1003;
            return 1;
        }
        if (n == 6524) {
            Class69.field999[++Class69.field1003 - 1] = -1;
            return 1;
        }
        if (n == 6525) {
            return Class69.field999[++Class69.field1003 - 1] = 1;
        }
        if (n == 6526) {
            return Class69.field999[++Class69.field1003 - 1] = 1;
        }
        return 2;
    }
}
