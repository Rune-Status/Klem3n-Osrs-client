import net.runelite.mapping.ObfuscatedSignature;
import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bd")
public class Class73
{
    @ObfuscatedName("u")
    static final BigInteger field1039;
    @ObfuscatedName("q")
    static final BigInteger field1044;
    
    static {
        field1039 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
        field1044 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
    }
    
    @ObfuscatedName("y")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "-373456508")
    static int method1799(final int n, final Class84 class84, final boolean b) {
        if (n == 4200) {
            Class69.field1001[++Class55.field497 - 1] = Class111.method2563(Class69.field999[--Class69.field1003]).field3433;
            return 1;
        }
        if (n == 4201) {
            Class69.field1003 -= 2;
            final int n2 = Class69.field999[Class69.field1003];
            final int n3 = Class69.field999[Class69.field1003 + 1];
            final Class269 method2563 = Class111.method2563(n2);
            if (n3 >= 1 && n3 <= 5 && method2563.field3447[n3 - 1] != null) {
                Class69.field1001[++Class55.field497 - 1] = method2563.field3447[n3 - 1];
            }
            else {
                Class69.field1001[++Class55.field497 - 1] = "";
            }
            return 1;
        }
        if (n == 4202) {
            Class69.field1003 -= 2;
            final int n4 = Class69.field999[Class69.field1003];
            final int n5 = Class69.field999[Class69.field1003 + 1];
            final Class269 method2564 = Class111.method2563(n4);
            if (n5 >= 1 && n5 <= 5 && method2564.field3425[n5 - 1] != null) {
                Class69.field1001[++Class55.field497 - 1] = method2564.field3425[n5 - 1];
            }
            else {
                Class69.field1001[++Class55.field497 - 1] = "";
            }
            return 1;
        }
        if (n == 4203) {
            Class69.field999[++Class69.field1003 - 1] = Class111.method2563(Class69.field999[--Class69.field1003]).field3445;
            return 1;
        }
        if (n == 4204) {
            Class69.field999[++Class69.field1003 - 1] = ((Class111.method2563(Class69.field999[--Class69.field1003]).field3444 == 1) ? 1 : 0);
            return 1;
        }
        if (n == 4205) {
            final int n6 = Class69.field999[--Class69.field1003];
            final Class269 method2565 = Class111.method2563(n6);
            if (method2565.field3465 == -1 && method2565.field3464 >= 0) {
                Class69.field999[++Class69.field1003 - 1] = method2565.field3464;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = n6;
            }
            return 1;
        }
        if (n == 4206) {
            final int n7 = Class69.field999[--Class69.field1003];
            final Class269 method2566 = Class111.method2563(n7);
            if (method2566.field3465 >= 0 && method2566.field3464 >= 0) {
                Class69.field999[++Class69.field1003 - 1] = method2566.field3464;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = n7;
            }
            return 1;
        }
        if (n == 4207) {
            Class69.field999[++Class69.field1003 - 1] = (Class111.method2563(Class69.field999[--Class69.field1003]).field3446 ? 1 : 0);
            return 1;
        }
        if (n == 4208) {
            final int n8 = Class69.field999[--Class69.field1003];
            final Class269 method2567 = Class111.method2563(n8);
            if (method2567.field3477 == -1 && method2567.field3476 >= 0) {
                Class69.field999[++Class69.field1003 - 1] = method2567.field3476;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = n8;
            }
            return 1;
        }
        if (n == 4209) {
            final int n9 = Class69.field999[--Class69.field1003];
            final Class269 method2568 = Class111.method2563(n9);
            if (method2568.field3477 >= 0 && method2568.field3476 >= 0) {
                Class69.field999[++Class69.field1003 - 1] = method2568.field3476;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = n9;
            }
            return 1;
        }
        if (n == 4210) {
            final String s = Class69.field1001[--Class55.field497];
            final int n10 = Class69.field999[--Class69.field1003];
            final String s2 = s;
            final boolean b2 = n10 == 1;
            final String lowerCase = s2.toLowerCase();
            short[] field231 = new short[16];
            int field232 = 0;
            while (true) {
                for (int i = 0; i < Class86.field1212; ++i) {
                    final Class269 method2569 = Class111.method2563(i);
                    if (!b2 || method2569.field3436) {
                        if (method2569.field3465 == -1) {
                            if (method2569.field3433.toLowerCase().indexOf(lowerCase) != -1) {
                                if (field232 >= 250) {
                                    Class126.field1778 = -1;
                                    Class27.field231 = null;
                                    Class69.field999[++Class69.field1003 - 1] = Class126.field1778;
                                    return 1;
                                }
                                if (field232 >= field231.length) {
                                    final short[] array = new short[field231.length * 2];
                                    for (int j = 0; j < field232; ++j) {
                                        array[j] = field231[j];
                                    }
                                    field231 = array;
                                }
                                field231[field232++] = (short)i;
                            }
                        }
                    }
                }
                Class27.field231 = field231;
                Class55.field495 = 0;
                Class126.field1778 = field232;
                final String[] array2 = new String[Class126.field1778];
                for (int k = 0; k < Class126.field1778; ++k) {
                    array2[k] = Class111.method2563(field231[k]).field3433;
                }
                Class133.method3100(array2, Class27.field231);
                continue;
            }
        }
        if (n == 4211) {
            if (Class27.field231 == null || Class55.field495 >= Class126.field1778) {
                Class69.field999[++Class69.field1003 - 1] = -1;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = (Class27.field231[++Class55.field495 - 1] & 0xFFFF);
            }
            return 1;
        }
        if (n == 4212) {
            Class55.field495 = 0;
            return 1;
        }
        return 2;
    }
}
