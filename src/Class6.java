import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("k")
final class Class6 implements Comparator
{
    @ObfuscatedName("mb")
    @ObfuscatedGetter(intValue = -1755726803)
    static int field39;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 2122998471)
    public static int field37;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ls;Ls;I)I", garbageValue = "-1297295614")
    int method66(final Class2 class2, final Class2 class3) {
        return class2.method16().compareTo(class3.method16());
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method66((Class2)o, (Class2)o2);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "-1575797810")
    static int method69(final int n, final int n2) {
        final Class272 method15 = Class1.method15(n);
        if (method15 == null) {
            return n2;
        }
        if (method15.field3528 >= 0) {
            return method15.field3528 | 0xFF000000;
        }
        if (method15.field3526 >= 0) {
            final int vmethod3092 = Class122.field1667.vmethod3092(method15.field3526);
            int n3 = 96;
            int n4;
            if (vmethod3092 == -2) {
                n4 = 12345678;
            }
            else if (vmethod3092 == -1) {
                if (n3 < 0) {
                    n3 = 0;
                }
                else if (n3 > 127) {
                    n3 = 127;
                }
                n4 = 127 - n3;
            }
            else {
                int n5 = n3 * (vmethod3092 & 0x7F) / 128;
                if (n5 < 2) {
                    n5 = 2;
                }
                else if (n5 > 126) {
                    n5 = 126;
                }
                n4 = n5 + (vmethod3092 & 0xFF80);
            }
            return Class122.field1675[n4] | 0xFF000000;
        }
        if (method15.field3533 == 16711935) {
            return n2;
        }
        final int method16 = Class260.method4908(method15.field3525, method15.field3530, method15.field3531);
        int n6 = 96;
        int n7;
        if (method16 == -2) {
            n7 = 12345678;
        }
        else if (method16 == -1) {
            if (n6 < 0) {
                n6 = 0;
            }
            else if (n6 > 127) {
                n6 = 127;
            }
            n7 = 127 - n6;
        }
        else {
            int n8 = n6 * (method16 & 0x7F) / 128;
            if (n8 < 2) {
                n8 = 2;
            }
            else if (n8 > 126) {
                n8 = 126;
            }
            n7 = n8 + (method16 & 0xFF80);
        }
        return Class122.field1675[n7] | 0xFF000000;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IB)Ljava/lang/String;", garbageValue = "2")
    static String method71(final int n) {
        return "<col=" + Integer.toHexString(n) + ">";
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1623615200")
    static void method75() {
        for (Class68 class68 = (Class68)Class68.field985.method4098(); class68 != null; class68 = (Class68)Class68.field985.method4079()) {
            if (class68.field994 != null) {
                class68.method1688();
            }
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Lgi;II)V", garbageValue = "392289778")
    static void method73(final Class189 class189, final int n) {
        final boolean b = class189.method3817(1) == 1;
        if (b) {
            Class81.field1166[++Class81.field1165 - 1] = n;
        }
        final int method3817 = class189.method3817(2);
        final Class60 class190 = Client.field610[n];
        if (method3817 == 0) {
            if (b) {
                class190.field571 = false;
                return;
            }
            if (Client.field628 == n) {
                throw new RuntimeException();
            }
            Class81.field1162[n] = (class190.field567 << 28) + (Class62.field868 + class190.field922[0] >> 13 << 14) + (Client.field754 + class190.field872[0] >> 13);
            if (class190.field920 != -1) {
                Class81.field1163[n] = class190.field920;
            }
            else {
                Class81.field1163[n] = class190.field926;
            }
            Class81.field1164[n] = class190.field897;
            Client.field610[n] = null;
            if (class189.method3817(1) != 0) {
                Class240.method4601(class189, n);
            }
        }
        else {
            if (method3817 == 1) {
                final int method3818 = class189.method3817(3);
                int field572 = class190.field922[0];
                int field573 = class190.field872[0];
                if (method3818 == 0) {
                    --field572;
                    --field573;
                }
                else if (method3818 == 1) {
                    --field573;
                }
                else if (method3818 == 2) {
                    ++field572;
                    --field573;
                }
                else if (method3818 == 3) {
                    --field572;
                }
                else if (method3818 == 4) {
                    ++field572;
                }
                else if (method3818 == 5) {
                    --field572;
                    ++field573;
                }
                else if (method3818 == 6) {
                    ++field573;
                }
                else if (method3818 == 7) {
                    ++field572;
                    ++field573;
                }
                if (Client.field628 == n && (class190.field931 < 1536 || class190.field881 < 1536 || class190.field931 >= 11776 || class190.field881 >= 11776)) {
                    class190.method1103(field572, field573);
                    class190.field571 = false;
                }
                else if (b) {
                    class190.field571 = true;
                    class190.field572 = field572;
                    class190.field573 = field573;
                }
                else {
                    class190.field571 = false;
                    class190.method1106(field572, field573, Class81.field1153[n]);
                }
                return;
            }
            if (method3817 == 2) {
                final int method3819 = class189.method3817(4);
                int field574 = class190.field922[0];
                int field575 = class190.field872[0];
                if (method3819 == 0) {
                    field574 -= 2;
                    field575 -= 2;
                }
                else if (method3819 == 1) {
                    --field574;
                    field575 -= 2;
                }
                else if (method3819 == 2) {
                    field575 -= 2;
                }
                else if (method3819 == 3) {
                    ++field574;
                    field575 -= 2;
                }
                else if (method3819 == 4) {
                    field574 += 2;
                    field575 -= 2;
                }
                else if (method3819 == 5) {
                    field574 -= 2;
                    --field575;
                }
                else if (method3819 == 6) {
                    field574 += 2;
                    --field575;
                }
                else if (method3819 == 7) {
                    field574 -= 2;
                }
                else if (method3819 == 8) {
                    field574 += 2;
                }
                else if (method3819 == 9) {
                    field574 -= 2;
                    ++field575;
                }
                else if (method3819 == 10) {
                    field574 += 2;
                    ++field575;
                }
                else if (method3819 == 11) {
                    field574 -= 2;
                    field575 += 2;
                }
                else if (method3819 == 12) {
                    --field574;
                    field575 += 2;
                }
                else if (method3819 == 13) {
                    field575 += 2;
                }
                else if (method3819 == 14) {
                    ++field574;
                    field575 += 2;
                }
                else if (method3819 == 15) {
                    field574 += 2;
                    field575 += 2;
                }
                if (Client.field628 == n && (class190.field931 < 1536 || class190.field881 < 1536 || class190.field931 >= 11776 || class190.field881 >= 11776)) {
                    class190.method1103(field574, field575);
                    class190.field571 = false;
                }
                else if (b) {
                    class190.field571 = true;
                    class190.field572 = field574;
                    class190.field573 = field575;
                }
                else {
                    class190.field571 = false;
                    class190.method1106(field574, field575, Class81.field1153[n]);
                }
                return;
            }
            if (class189.method3817(1) == 0) {
                final int method3820 = class189.method3817(12);
                final int n2 = method3820 >> 10;
                int n3 = method3820 >> 5 & 0x1F;
                if (n3 > 15) {
                    n3 -= 32;
                }
                int n4 = method3820 & 0x1F;
                if (n4 > 15) {
                    n4 -= 32;
                }
                final int field576 = n3 + class190.field922[0];
                final int field577 = n4 + class190.field872[0];
                if (Client.field628 == n && (class190.field931 < 1536 || class190.field881 < 1536 || class190.field931 >= 11776 || class190.field881 >= 11776)) {
                    class190.method1103(field576, field577);
                    class190.field571 = false;
                }
                else if (b) {
                    class190.field571 = true;
                    class190.field572 = field576;
                    class190.field573 = field577;
                }
                else {
                    class190.field571 = false;
                    class190.method1106(field576, field577, Class81.field1153[n]);
                }
                class190.field567 = (byte)(n2 + class190.field567 & 0x3);
                if (Client.field628 == n) {
                    Class13.field82 = class190.field567;
                }
                return;
            }
            final int method3821 = class189.method3817(30);
            final int n5 = method3821 >> 28;
            final int n6 = method3821 >> 14 & 0x3FFF;
            final int n7 = method3821 & 0x3FFF;
            final int field578 = (n6 + Class62.field868 + class190.field922[0] & 0x3FFF) - Class62.field868;
            final int field579 = (n7 + Client.field754 + class190.field872[0] & 0x3FFF) - Client.field754;
            if (Client.field628 == n && (class190.field931 < 1536 || class190.field881 < 1536 || class190.field931 >= 11776 || class190.field881 >= 11776)) {
                class190.method1103(field578, field579);
                class190.field571 = false;
            }
            else if (b) {
                class190.field571 = true;
                class190.field572 = field578;
                class190.field573 = field579;
            }
            else {
                class190.field571 = false;
                class190.method1106(field578, field579, Class81.field1153[n]);
            }
            class190.field567 = (byte)(n5 + class190.field567 & 0x3);
            if (Client.field628 == n) {
                Class13.field82 = class190.field567;
            }
        }
    }
    
    @ObfuscatedName("c")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "-127094665")
    static int method74(final int n, final Class84 class84, final boolean b) {
        if (n == 5306) {
            Class69.field999[++Class69.field1003 - 1] = (Client.field792 ? 2 : 1);
            return 1;
        }
        if (n == 5307) {
            final int n2 = Class69.field999[--Class69.field1003];
            if (n2 == 1 || n2 == 2) {
                Class50.method991(n2);
            }
            return 1;
        }
        if (n == 5308) {
            Class69.field999[++Class69.field1003 - 1] = Class10.field61.field957;
            return 1;
        }
        if (n == 5309) {
            final int field957 = Class69.field999[--Class69.field1003];
            if (field957 == 1 || field957 == 2) {
                Class10.field61.field957 = field957;
                Class54.method1018();
            }
            return 1;
        }
        return 2;
    }
}
