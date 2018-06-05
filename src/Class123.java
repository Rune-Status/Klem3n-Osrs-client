import net.runelite.mapping.ObfuscatedSignature;
import java.lang.reflect.Method;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.InvalidClassException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("di")
public final class Class123
{
    @ObfuscatedName("gt")
    @ObfuscatedGetter(intValue = 1694856473)
    static int field1702;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -1492522689)
    int field1703;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -410849109)
    int field1695;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 492997223)
    int field1696;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -527325733)
    int field1694;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1095002287)
    int field1698;
    @ObfuscatedName("q")
    boolean field1699;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 1751012111)
    int field1700;
    
    Class123(final int field1703, final int field1704, final int field1705, final int field1706, final int field1707, final int field1708, final boolean field1709) {
        this.field1699 = true;
        this.field1703 = field1703;
        this.field1695 = field1704;
        this.field1696 = field1705;
        this.field1694 = field1706;
        this.field1698 = field1707;
        this.field1700 = field1708;
        this.field1699 = field1709;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgi;B)V", garbageValue = "2")
    public static void method2869(final Class189 class189) {
        final Class312 class190 = (Class312)Class313.field3759.method4048();
        if (class190 == null) {
            return;
        }
        final int field2339 = class189.field2339;
        class189.method3707(class190.field3758);
        for (int i = 0; i < class190.field3749; ++i) {
            if (class190.field3751[i] != 0) {
                class189.method3532(class190.field3751[i]);
            }
            else {
                try {
                    final int n = class190.field3748[i];
                    if (n == 0) {
                        final int int1 = class190.field3752[i].getInt(null);
                        class189.method3532(0);
                        class189.method3707(int1);
                    }
                    else if (n == 1) {
                        class190.field3752[i].setInt(null, class190.field3753[i]);
                        class189.method3532(0);
                    }
                    else if (n == 2) {
                        final int modifiers = class190.field3752[i].getModifiers();
                        class189.method3532(0);
                        class189.method3707(modifiers);
                    }
                    if (n == 3) {
                        final Method method = class190.field3754[i];
                        final byte[][] array = class190.field3755[i];
                        final Object[] array2 = new Object[array.length];
                        for (int j = 0; j < array.length; ++j) {
                            array2[j] = new ObjectInputStream(new ByteArrayInputStream(array[j])).readObject();
                        }
                        final Object invoke = method.invoke(null, array2);
                        if (invoke == null) {
                            class189.method3532(0);
                        }
                        else if (invoke instanceof Number) {
                            class189.method3532(1);
                            class189.method3659(((Number)invoke).longValue());
                        }
                        else if (invoke instanceof String) {
                            class189.method3532(2);
                            class189.method3699((String)invoke);
                        }
                        else {
                            class189.method3532(4);
                        }
                    }
                    else if (n == 4) {
                        final int modifiers2 = class190.field3754[i].getModifiers();
                        class189.method3532(0);
                        class189.method3707(modifiers2);
                    }
                }
                catch (ClassNotFoundException ex) {
                    class189.method3532(-10);
                }
                catch (InvalidClassException ex2) {
                    class189.method3532(-11);
                }
                catch (StreamCorruptedException ex3) {
                    class189.method3532(-12);
                }
                catch (OptionalDataException ex4) {
                    class189.method3532(-13);
                }
                catch (IllegalAccessException ex5) {
                    class189.method3532(-14);
                }
                catch (IllegalArgumentException ex6) {
                    class189.method3532(-15);
                }
                catch (InvocationTargetException ex7) {
                    class189.method3532(-16);
                }
                catch (SecurityException ex8) {
                    class189.method3532(-17);
                }
                catch (IOException ex9) {
                    class189.method3532(-18);
                }
                catch (NullPointerException ex10) {
                    class189.method3532(-19);
                }
                catch (Exception ex11) {
                    class189.method3532(-20);
                }
                catch (Throwable t) {
                    class189.method3532(-21);
                }
            }
        }
        class189.method3572(field2339);
        class190.method4064();
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(IIIII)I", garbageValue = "-1588641951")
    static final int method2870(final int n, final int n2, final int n3, final int n4) {
        final int n5 = 65536 - Class122.field1693[n3 * 1024 / n4] >> 1;
        return ((65536 - n5) * n >> 16) + (n5 * n2 >> 16);
    }
}
