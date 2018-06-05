import java.lang.reflect.Method;
import java.lang.reflect.Field;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("t")
public final class Class17
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 595769027)
    int field131;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -354096829)
    int field133;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -907753045)
    int field132;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 529826899)
    int field134;
    @ObfuscatedSignature(signature = "Lak;")
    final /* synthetic */ Class30 this$0;
    
    Class17(final Class30 this$0) {
        this.this$0 = this$0;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "1107039015")
    public static int method170(final int n, final int n2) {
        return (n << 8) + n2;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(CII)C", garbageValue = "2067503426")
    static char method169(final char c, final int n) {
        if (c >= '\u00c0' && c <= '\u00ff') {
            if (c >= '\u00c0' && c <= '\u00c6') {
                return 'A';
            }
            if (c == '\u00c7') {
                return 'C';
            }
            if (c >= '\u00c8' && c <= '\u00cb') {
                return 'E';
            }
            if (c >= '\u00cc' && c <= '\u00cf') {
                return 'I';
            }
            if (c >= '\u00d2' && c <= '\u00d6') {
                return 'O';
            }
            if (c >= '\u00d9' && c <= '\u00dc') {
                return 'U';
            }
            if (c == '\u00dd') {
                return 'Y';
            }
            if (c == '\u00df') {
                return 's';
            }
            if (c >= '\u00e0' && c <= '\u00e6') {
                return 'a';
            }
            if (c == '\u00e7') {
                return 'c';
            }
            if (c >= '\u00e8' && c <= '\u00eb') {
                return 'e';
            }
            if (c >= '\u00ec' && c <= '\u00ef') {
                return 'i';
            }
            if (c >= '\u00f2' && c <= '\u00f6') {
                return 'o';
            }
            if (c >= '\u00f9' && c <= '\u00fc') {
                return 'u';
            }
            if (c == '\u00fd' || c == '\u00ff') {
                return 'y';
            }
        }
        if (c == '\u0152') {
            return 'O';
        }
        if (c == '\u0153') {
            return 'o';
        }
        if (c == '\u0178') {
            return 'Y';
        }
        return c;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgu;ILjava/lang/String;S)Ljava/lang/String;", garbageValue = "255")
    static String method171(final Class197 class197, final int n, final String s) {
        if (class197 == null) {
            return s;
        }
        final Class195 class198 = (Class195)class197.method3945(n);
        if (class198 == null) {
            return s;
        }
        return (String)class198.field2394;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "-2023648608")
    public static void method172(final Class182 class182, final int n) {
        final Class312 class183 = new Class312();
        class183.field3749 = class182.method3544();
        class183.field3758 = class182.method3671();
        class183.field3748 = new int[class183.field3749];
        class183.field3751 = new int[class183.field3749];
        class183.field3752 = new Field[class183.field3749];
        class183.field3753 = new int[class183.field3749];
        class183.field3754 = new Method[class183.field3749];
        class183.field3755 = new byte[class183.field3749][][];
        for (int i = 0; i < class183.field3749; ++i) {
            try {
                final int method3544 = class182.method3544();
                if (method3544 == 0 || method3544 == 1 || method3544 == 2) {
                    final String method3545 = class182.method3738();
                    final String method3546 = class182.method3738();
                    int method3547 = 0;
                    if (method3544 == 1) {
                        method3547 = class182.method3671();
                    }
                    class183.field3748[i] = method3544;
                    class183.field3753[i] = method3547;
                    if (Class110.method2528(method3545).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    class183.field3752[i] = Class110.method2528(method3545).getDeclaredField(method3546);
                }
                else if (method3544 == 3 || method3544 == 4) {
                    final String method3548 = class182.method3738();
                    final String method3549 = class182.method3738();
                    final int method3550 = class182.method3544();
                    final String[] array = new String[method3550];
                    for (int j = 0; j < method3550; ++j) {
                        array[j] = class182.method3738();
                    }
                    final String method3551 = class182.method3738();
                    final byte[][] array2 = new byte[method3550][];
                    if (method3544 == 3) {
                        for (int k = 0; k < method3550; ++k) {
                            final int method3552 = class182.method3671();
                            class182.method3539(array2[k] = new byte[method3552], 0, method3552);
                        }
                    }
                    class183.field3748[i] = method3544;
                    final Class[] array3 = new Class[method3550];
                    for (int l = 0; l < method3550; ++l) {
                        array3[l] = Class110.method2528(array[l]);
                    }
                    final Class method3553 = Class110.method2528(method3551);
                    if (Class110.method2528(method3548).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    final Method[] declaredMethods = Class110.method2528(method3548).getDeclaredMethods();
                    for (int n2 = 0; n2 < declaredMethods.length; ++n2) {
                        final Method method3554 = declaredMethods[n2];
                        if (method3554.getName().equals(method3549)) {
                            final Class<?>[] parameterTypes = method3554.getParameterTypes();
                            if (parameterTypes.length == array3.length) {
                                boolean b = true;
                                for (int n3 = 0; n3 < array3.length; ++n3) {
                                    if (parameterTypes[n3] != array3[n3]) {
                                        b = false;
                                        break;
                                    }
                                }
                                if (b && method3553 == method3554.getReturnType()) {
                                    class183.field3754[i] = method3554;
                                }
                            }
                        }
                    }
                    class183.field3755[i] = array2;
                }
            }
            catch (ClassNotFoundException ex) {
                class183.field3751[i] = -1;
            }
            catch (SecurityException ex2) {
                class183.field3751[i] = -2;
            }
            catch (NullPointerException ex3) {
                class183.field3751[i] = -3;
            }
            catch (Exception ex4) {
                class183.field3751[i] = -4;
            }
            catch (Throwable t) {
                class183.field3751[i] = -5;
            }
        }
        Class313.field3759.method4031(class183);
    }
}
