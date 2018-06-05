import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cl")
public class Class83
{
    @ObfuscatedName("z")
    static final Map field1180;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgu;")
    static final Class197 field1181;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lhj;")
    static final Class215 field1184;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 556765175)
    static int field1186;
    
    static {
        field1180 = new HashMap();
        field1181 = new Class197(1024);
        field1184 = new Class215();
        Class83.field1186 = 0;
    }
    
    @ObfuscatedName("gv")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;ZI)V", garbageValue = "1049390668")
    static final void method1933(final String s, final boolean b) {
        if (!Client.field677) {
            return;
        }
        final int n = 4;
        final int n2 = n + 6;
        final int n3 = n + 6;
        final int method5519 = Class63.field933.method5519(s, 250);
        final int n4 = Class63.field933.method5520(s, 250) * 13;
        Class314.method5763(n2 - n, n3 - n, n + method5519 + n, n + n + n4, 0);
        Class314.method5734(n2 - n, n3 - n, n + method5519 + n, n4 + n + n, 16777215);
        Class63.field933.method5526(s, n2, n3, method5519, n4, 16777215, -1, 1, 1, 0);
        Class48.method948(n2 - n, n3 - n, n + method5519 + n, n + n + n4);
        if (b) {
            Class163.field2014.vmethod5809(0, 0);
        }
        else {
            final int n5 = n2;
            final int n6 = n3;
            final int n7 = method5519;
            final int n8 = n4;
            for (int i = 0; i < Client.field603; ++i) {
                if (Client.field641[i] + Client.field786[i] > n5 && Client.field786[i] < n5 + n7 && Client.field789[i] + Client.field787[i] > n6 && Client.field787[i] < n8 + n6) {
                    Client.field788[i] = true;
                }
            }
        }
    }
    
    @ObfuscatedName("he")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1621920950")
    static final void method1940() {
        final int field435 = Class48.field435;
        final int field436 = Class0.field1;
        final int field437 = Class135.field1856;
        final int field438 = Class151.field1933;
        final int n = 6116423;
        Class314.method5763(field435, field436, field437, field438, n);
        Class314.method5763(field435 + 1, field436 + 1, field437 - 2, 16, 0);
        Class314.method5734(field435 + 1, field436 + 18, field437 - 2, field438 - 19, 0);
        Class293.field3660.method5522("Choose Option", field435 + 3, field436 + 14, n, -1);
        final int field439 = Class48.field425;
        final int n2 = Class48.field426 * 673804999;
        for (int i = 0; i < Client.field771; ++i) {
            final int n3 = field436 + (Client.field771 - 1 - i) * 15 + 31;
            int n4 = 16777215;
            if (field439 > field435 && field439 < field437 + field435 && n2 > n3 - 13 && n2 < n3 + 3) {
                n4 = 16776960;
            }
            Class293.field3660.method5522(Class18.method176(i), field435 + 3, n3, n4, 0);
        }
        final int field440 = Class48.field435;
        final int field441 = Class0.field1;
        final int field442 = Class135.field1856;
        final int field443 = Class151.field1933;
        for (int j = 0; j < Client.field603; ++j) {
            if (Client.field641[j] + Client.field786[j] > field440 && Client.field786[j] < field440 + field442 && Client.field789[j] + Client.field787[j] > field441 && Client.field787[j] < field441 + field443) {
                Client.field788[j] = true;
            }
        }
    }
    
    @ObfuscatedName("ib")
    @ObfuscatedSignature(signature = "([Lhi;II)V", garbageValue = "1406653934")
    static final void method1923(final Class230[] array, final int n) {
        for (int i = 0; i < array.length; ++i) {
            final Class230 class230 = array[i];
            if (class230 != null) {
                if (class230.field2721 == 0) {
                    if (class230.field2736 != null) {
                        method1923(class230.field2736, n);
                    }
                    final Class55 class231 = (Class55)Client.field741.method4020(class230.field2691);
                    if (class231 != null) {
                        final int field501 = class231.field501;
                        if (Class261.method4931(field501)) {
                            method1923(Class42.field366[field501], n);
                        }
                    }
                }
                if (n == 0 && class230.field2654 != null) {
                    final Class56 class232 = new Class56();
                    class232.field506 = class230;
                    class232.field512 = class230.field2654;
                    Class68.method1696(class232);
                }
                if (n == 1 && class230.field2714 != null) {
                    if (class230.field2606 >= 0) {
                        final Class230 method434 = Class26.method434(class230.field2691);
                        if (method434 == null || method434.field2736 == null || class230.field2606 >= method434.field2736.length) {
                            continue;
                        }
                        if (class230 != method434.field2736[class230.field2606]) {
                            continue;
                        }
                    }
                    final Class56 class233 = new Class56();
                    class233.field506 = class230;
                    class233.field512 = class230.field2714;
                    Class68.method1696(class233);
                }
            }
        }
    }
}
