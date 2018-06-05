import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ki")
public class Class309 implements Comparator
{
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -298322265)
    public static int field3740;
    @ObfuscatedName("z")
    final boolean field3741;
    
    public Class309(final boolean field3741) {
        this.field3741 = field3741;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljx;Ljx;I)I", garbageValue = "870668832")
    int method5670(final Class282 class282, final Class282 class283) {
        return this.field3741 ? class282.method5287().method5435(class283.method5287()) : class283.method5287().method5435(class282.method5287());
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method5670((Class282)o, (Class282)o2);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lbo;II)V", garbageValue = "1199859581")
    static void method5674(final Class56 class56, final int n) {
        final Object[] field512 = class56.field512;
        final int field513 = class56.field515;
        Class84 field517;
        if (field513 == 10 || field513 == 11 || field513 == 12 || field513 == 13 || field513 == 14 || field513 == 15 || field513 == 16 || field513 == 17) {
            Class312.field3750 = (Class36)field512[0];
            final Class255 class57 = Class255.field3246[Class312.field3750.field307];
            final int field514 = class56.field515;
            final int field515 = class57.field3238;
            final int field516 = class57.field3240;
            final Class84 method3104 = Class134.method3104(Class17.method170(field515, field514), field514);
            Class84 class58;
            if (method3104 != null) {
                class58 = method3104;
            }
            else {
                final Class84 method3105 = Class134.method3104(field514 + (field516 + 40000 << 8), field514);
                if (method3105 != null) {
                    class58 = method3105;
                }
                else {
                    class58 = null;
                }
            }
            field517 = class58;
        }
        else {
            field517 = Class133.method3099((int)field512[0]);
        }
        if (field517 == null) {
            return;
        }
        Class69.field1003 = 0;
        Class55.field497 = 0;
        int field518 = -1;
        int[] array = field517.field1189;
        int[] array2 = field517.field1196;
        int n2 = -1;
        Class69.field1008 = 0;
        try {
            Class69.field1005 = new int[field517.field1192];
            int n3 = 0;
            Class130.field1800 = new String[field517.field1193];
            int n4 = 0;
            for (int i = 1; i < field512.length; ++i) {
                if (field512[i] instanceof Integer) {
                    int n5 = (int)field512[i];
                    if (n5 == -2147483647) {
                        n5 = class56.field511;
                    }
                    if (n5 == -2147483646) {
                        n5 = class56.field508;
                    }
                    if (n5 == -2147483645) {
                        n5 = ((class56.field506 != null) ? class56.field506.field2691 : -1);
                    }
                    if (n5 == -2147483644) {
                        n5 = class56.field517;
                    }
                    if (n5 == -2147483643) {
                        n5 = ((class56.field506 != null) ? class56.field506.field2606 : -1);
                    }
                    if (n5 == -2147483642) {
                        n5 = ((class56.field507 != null) ? class56.field507.field2691 : -1);
                    }
                    if (n5 == -2147483641) {
                        n5 = ((class56.field507 != null) ? class56.field507.field2606 : -1);
                    }
                    if (n5 == -2147483640) {
                        n5 = class56.field509;
                    }
                    if (n5 == -2147483639) {
                        n5 = class56.field513;
                    }
                    Class69.field1005[n3++] = n5;
                }
                else if (field512[i] instanceof String) {
                    String field519 = (String)field512[i];
                    if (field519.equals("event_opbase")) {
                        field519 = class56.field504;
                    }
                    Class130.field1800[n4++] = field519;
                }
            }
            int n6 = 0;
            Class69.field1009 = class56.field514;
            while (++n6 <= n) {
                n2 = array[++field518];
                if (n2 < 100) {
                    if (n2 == 0) {
                        Class69.field999[++Class69.field1003 - 1] = array2[field518];
                    }
                    else if (n2 == 1) {
                        Class69.field999[++Class69.field1003 - 1] = Class225.field2558[array2[field518]];
                    }
                    else if (n2 == 2) {
                        final int n7 = array2[field518];
                        Class225.field2558[n7] = Class69.field999[--Class69.field1003];
                        Class45.method749(n7);
                    }
                    else if (n2 == 3) {
                        Class69.field1001[++Class55.field497 - 1] = field517.field1191[field518];
                    }
                    else if (n2 == 6) {
                        field518 += array2[field518];
                    }
                    else if (n2 == 7) {
                        Class69.field1003 -= 2;
                        if (Class69.field999[Class69.field1003] == Class69.field999[Class69.field1003 + 1]) {
                            continue;
                        }
                        field518 += array2[field518];
                    }
                    else if (n2 == 8) {
                        Class69.field1003 -= 2;
                        if (Class69.field999[Class69.field1003] != Class69.field999[Class69.field1003 + 1]) {
                            continue;
                        }
                        field518 += array2[field518];
                    }
                    else if (n2 == 9) {
                        Class69.field1003 -= 2;
                        if (Class69.field999[Class69.field1003] >= Class69.field999[Class69.field1003 + 1]) {
                            continue;
                        }
                        field518 += array2[field518];
                    }
                    else if (n2 == 10) {
                        Class69.field1003 -= 2;
                        if (Class69.field999[Class69.field1003] <= Class69.field999[Class69.field1003 + 1]) {
                            continue;
                        }
                        field518 += array2[field518];
                    }
                    else if (n2 == 21) {
                        if (Class69.field1008 == 0) {
                            return;
                        }
                        final Class51 class59 = Class69.field1006[--Class69.field1008];
                        field517 = class59.field466;
                        array = field517.field1189;
                        array2 = field517.field1196;
                        field518 = class59.field463;
                        Class69.field1005 = class59.field462;
                        Class130.field1800 = class59.field465;
                    }
                    else if (n2 == 25) {
                        Class69.field999[++Class69.field1003 - 1] = Class163.method3389(array2[field518]);
                    }
                    else if (n2 == 27) {
                        Class67.method1685(array2[field518], Class69.field999[--Class69.field1003]);
                    }
                    else if (n2 == 31) {
                        Class69.field1003 -= 2;
                        if (Class69.field999[Class69.field1003] > Class69.field999[Class69.field1003 + 1]) {
                            continue;
                        }
                        field518 += array2[field518];
                    }
                    else if (n2 == 32) {
                        Class69.field1003 -= 2;
                        if (Class69.field999[Class69.field1003] < Class69.field999[Class69.field1003 + 1]) {
                            continue;
                        }
                        field518 += array2[field518];
                    }
                    else if (n2 == 33) {
                        Class69.field999[++Class69.field1003 - 1] = Class69.field1005[array2[field518]];
                    }
                    else if (n2 == 34) {
                        Class69.field1005[array2[field518]] = Class69.field999[--Class69.field1003];
                    }
                    else if (n2 == 35) {
                        Class69.field1001[++Class55.field497 - 1] = Class130.field1800[array2[field518]];
                    }
                    else if (n2 == 36) {
                        Class130.field1800[array2[field518]] = Class69.field1001[--Class55.field497];
                    }
                    else if (n2 == 37) {
                        final int n8 = array2[field518];
                        Class55.field497 -= n8;
                        Class69.field1001[++Class55.field497 - 1] = Class251.method4794(Class69.field1001, Class55.field497, n8);
                    }
                    else if (n2 == 38) {
                        --Class69.field1003;
                    }
                    else if (n2 == 39) {
                        --Class55.field497;
                    }
                    else if (n2 == 40) {
                        final Class84 method3106 = Class133.method3099(array2[field518]);
                        final int[] field520 = new int[method3106.field1192];
                        final String[] field521 = new String[method3106.field1193];
                        for (int j = 0; j < method3106.field1188; ++j) {
                            field520[j] = Class69.field999[j + (Class69.field1003 - method3106.field1188)];
                        }
                        for (int k = 0; k < method3106.field1195; ++k) {
                            field521[k] = Class69.field1001[k + (Class55.field497 - method3106.field1195)];
                        }
                        Class69.field1003 -= method3106.field1188;
                        Class55.field497 -= method3106.field1195;
                        final Class51 class60 = new Class51();
                        class60.field466 = field517;
                        class60.field463 = field518;
                        class60.field462 = Class69.field1005;
                        class60.field465 = Class130.field1800;
                        Class69.field1006[++Class69.field1008 - 1] = class60;
                        field517 = method3106;
                        array = field517.field1189;
                        array2 = field517.field1196;
                        field518 = -1;
                        Class69.field1005 = field520;
                        Class130.field1800 = field521;
                    }
                    else if (n2 == 42) {
                        Class69.field999[++Class69.field1003 - 1] = Class22.field185.method1897(array2[field518]);
                    }
                    else if (n2 == 43) {
                        Class22.field185.method1903(array2[field518], Class69.field999[--Class69.field1003]);
                    }
                    else if (n2 == 44) {
                        final int n9 = array2[field518] >> 16;
                        final int n10 = array2[field518] & 0xFFFF;
                        final int n11 = Class69.field999[--Class69.field1003];
                        if (n11 < 0 || n11 > 5000) {
                            throw new RuntimeException();
                        }
                        Class69.field1000[n9] = n11;
                        int n12 = -1;
                        if (n10 == 105) {
                            n12 = 0;
                        }
                        for (int l = 0; l < n11; ++l) {
                            Class69.field1002[n9][l] = n12;
                        }
                    }
                    else if (n2 == 45) {
                        final int n13 = array2[field518];
                        final int n14 = Class69.field999[--Class69.field1003];
                        if (n14 < 0 || n14 >= Class69.field1000[n13]) {
                            throw new RuntimeException();
                        }
                        Class69.field999[++Class69.field1003 - 1] = Class69.field1002[n13][n14];
                    }
                    else if (n2 == 46) {
                        final int n15 = array2[field518];
                        Class69.field1003 -= 2;
                        final int n16 = Class69.field999[Class69.field1003];
                        if (n16 < 0 || n16 >= Class69.field1000[n15]) {
                            throw new RuntimeException();
                        }
                        Class69.field1002[n15][n16] = Class69.field999[Class69.field1003 + 1];
                    }
                    else if (n2 == 47) {
                        String method3107 = Class22.field185.method1890(array2[field518]);
                        if (method3107 == null) {
                            method3107 = "null";
                        }
                        Class69.field1001[++Class55.field497 - 1] = method3107;
                    }
                    else if (n2 == 48) {
                        Class22.field185.method1889(array2[field518], Class69.field1001[--Class55.field497]);
                    }
                    else {
                        if (n2 != 60) {
                            throw new IllegalStateException();
                        }
                        final Class211 class61 = (Class211)field517.field1194[array2[field518]].method3945(Class69.field999[--Class69.field1003]);
                        if (class61 == null) {
                            continue;
                        }
                        field518 += class61.field2438;
                    }
                }
                else {
                    switch (Class191.method3866(n2, field517, field517.field1196[field518] == 1)) {
                        case 0: {
                            return;
                        }
                        case 2: {
                            throw new IllegalStateException();
                        }
                        case 1: {
                            continue;
                        }
                        default: {
                            continue;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        catch (Exception ex) {
            final StringBuilder sb = new StringBuilder(30);
            sb.append("").append(field517.field2421).append(" ");
            for (int n17 = Class69.field1008 - 1; n17 >= 0; --n17) {
                sb.append("").append(Class69.field1006[n17].field466.field2421).append(" ");
            }
            sb.append("").append(n2);
            Class5.method65(sb.toString(), ex);
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "([BI)V", garbageValue = "1705135152")
    static synchronized void method5671(final byte[] array) {
        if (array.length == 100 && Class183.field2344 < 1000) {
            Class183.field2340[++Class183.field2344 - 1] = array;
            return;
        }
        if (array.length == 5000 && Class183.field2346 < 250) {
            Class183.field2343[++Class183.field2346 - 1] = array;
            return;
        }
        if (array.length == 30000 && Class183.field2342 < 50) {
            Class183.field2345[++Class183.field2342 - 1] = array;
            return;
        }
        if (Class183.field2341 != null) {
            for (int i = 0; i < Class183.field2348.length; ++i) {
                if (array.length == Class183.field2348[i] && Class183.field2347[i] < Class183.field2341[i].length) {
                    Class183.field2341[i][Class183.field2347[i]++] = array;
                    return;
                }
            }
        }
    }
}
