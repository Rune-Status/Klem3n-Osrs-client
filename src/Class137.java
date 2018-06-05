import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ey")
public class Class137 implements Comparator
{
    @ObfuscatedName("z")
    final boolean field1870;
    
    public Class137(final boolean field1870) {
        this.field1870 = field1870;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lkz;Lkz;I)I", garbageValue = "2097631968")
    int method3120(final Class287 class287, final Class287 class288) {
        return this.field1870 ? (class287.field3627 - class288.field3627) : (class288.field3627 - class287.field3627);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method3120((Class287)o, (Class287)o2);
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)Lll;", garbageValue = "-1573456149")
    public static Class318 method3127(final Class247 class247, final String s, final String s2) {
        final int method4642 = class247.method4642(s);
        return Class229.method4499(class247, method4642, class247.method4643(method4642, s2));
    }
    
    @ObfuscatedName("ie")
    @ObfuscatedSignature(signature = "(Lhi;II)I", garbageValue = "1207234398")
    static final int method3119(final Class230 class230, final int n) {
        if (class230.field2659 == null || n >= class230.field2659.length) {
            return -2;
        }
        try {
            final int[] array = class230.field2659[n];
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            while (true) {
                final int n5 = array[n3++];
                int n6 = 0;
                int n7 = 0;
                if (n5 == 0) {
                    break;
                }
                if (n5 == 1) {
                    n6 = Client.field712[array[n3++]];
                }
                if (n5 == 2) {
                    n6 = Client.field713[array[n3++]];
                }
                if (n5 == 3) {
                    n6 = Client.field640[array[n3++]];
                }
                if (n5 == 4) {
                    final Class230 method434 = Class26.method434((array[n3++] << 16) + array[n3++]);
                    final int n8 = array[n3++];
                    if (n8 != -1 && (!Class111.method2563(n8).field3446 || Client.field668)) {
                        for (int i = 0; i < method434.field2724.length; ++i) {
                            if (n8 + 1 == method434.field2724[i]) {
                                n6 += method434.field2725[i];
                            }
                        }
                    }
                }
                if (n5 == 5) {
                    n6 = Class225.field2558[array[n3++]];
                }
                if (n5 == 6) {
                    n6 = Class234.field2779[Client.field713[array[n3++]] - 1];
                }
                if (n5 == 7) {
                    n6 = Class225.field2558[array[n3++]] * 100 / 46875;
                }
                if (n5 == 8) {
                    n6 = Class138.field1876.field551;
                }
                if (n5 == 9) {
                    for (int j = 0; j < 25; ++j) {
                        if (Class234.field2780[j]) {
                            n6 += Client.field713[j];
                        }
                    }
                }
                if (n5 == 10) {
                    final Class230 method435 = Class26.method434((array[n3++] << 16) + array[n3++]);
                    final int n9 = array[n3++];
                    if (n9 != -1 && (!Class111.method2563(n9).field3446 || Client.field668)) {
                        for (int k = 0; k < method435.field2724.length; ++k) {
                            if (n9 + 1 == method435.field2724[k]) {
                                n6 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (n5 == 11) {
                    n6 = Client.field745;
                }
                if (n5 == 12) {
                    n6 = Client.field782;
                }
                if (n5 == 13) {
                    n6 = (((Class225.field2558[array[n3++]] & 1 << array[n3++]) != 0x0) ? 1 : 0);
                }
                if (n5 == 14) {
                    n6 = Class163.method3389(array[n3++]);
                }
                if (n5 == 15) {
                    n7 = 1;
                }
                if (n5 == 16) {
                    n7 = 2;
                }
                if (n5 == 17) {
                    n7 = 3;
                }
                if (n5 == 18) {
                    n6 = (Class138.field1876.field931 >> 7) + Class62.field868;
                }
                if (n5 == 19) {
                    n6 = (Class138.field1876.field881 >> 7) + Client.field754;
                }
                if (n5 == 20) {
                    n6 = array[n3++];
                }
                if (n7 == 0) {
                    if (n4 == 0) {
                        n2 += n6;
                    }
                    if (n4 == 1) {
                        n2 -= n6;
                    }
                    if (n4 == 2 && n6 != 0) {
                        n2 /= n6;
                    }
                    if (n4 == 3) {
                        n2 *= n6;
                    }
                    n4 = 0;
                }
                else {
                    n4 = n7;
                }
            }
            return n2;
        }
        catch (Exception ex) {
            return -1;
        }
    }
}
