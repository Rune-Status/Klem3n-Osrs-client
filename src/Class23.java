import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("h")
public class Class23
{
    @ObfuscatedName("k")
    @ObfuscatedSignature(signature = "Lgl;")
    static Class201 field188;
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "Lgl;")
    static Class201 field189;
    @ObfuscatedName("t")
    @ObfuscatedSignature(signature = "Lha;")
    static final Class226 field193;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -1247610435)
    int field191;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 1988652209)
    int field192;
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "Lp;")
    Class10 field197;
    @ObfuscatedName("b")
    LinkedList field195;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = 1028613213)
    int field194;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 1441464419)
    int field187;
    @ObfuscatedName("g")
    List field196;
    @ObfuscatedName("m")
    HashMap field199;
    @ObfuscatedName("r")
    final HashMap field198;
    
    static {
        Class23.field188 = new Class201(37748736, 256);
        Class23.field189 = new Class201(256, 256);
        field193 = new Class226();
    }
    
    Class23(final int field191, final int field192, final int n, final HashMap field193) {
        this.field191 = field191;
        this.field192 = field192;
        this.field195 = new LinkedList();
        this.field196 = new LinkedList();
        this.field199 = new HashMap();
        this.field194 = (n | 0xFF000000);
        this.field198 = field193;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(IIIS)V", garbageValue = "-4430")
    void method314(final int n, final int n2, final int n3) {
        final Class318 class318 = (Class318)Class23.field188.method3997(RunException.method716(this.field191, this.field192, this.field187));
        if (class318 == null) {
            return;
        }
        if (n3 == this.field187 * 64) {
            class318.method5849(n, n2);
        }
        else {
            class318.method5872(n, n2, n3, n3);
        }
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Lp;Ljava/util/List;I)V", garbageValue = "-463048404")
    void method400(final Class10 field197, final List list) {
        this.field199.clear();
        this.method294(0, 0, 64, 64, this.field197 = field197);
        this.method289(list);
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(Ljava/util/HashSet;Ljava/util/List;B)V", garbageValue = "89")
    void method287(final HashSet set, final List list) {
        this.field199.clear();
        for (final Object class34 : set) {
            if (((Class16) class34).method149() == this.field191 && ((Class16) class34).method168() == this.field192) {
                this.field195.add(class34);
                this.method294(((Class34) class34).method565() * 8, ((Class34) class34).method563() * 8, 8, 8, (Class34)class34);
            }
        }
        this.method289(list);
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(IIIILr;I)V", garbageValue = "-1457555663")
    void method294(final int n, final int n2, final int n3, final int n4, final Class16 class16) {
        for (int i = n; i < n3 + n; ++i) {
        Label_0097:
            for (int j = n2; j < n2 + n4; ++j) {
                final Class226 class17 = new Class226(0, i, j);
                for (int k = 0; k < class16.field121; ++k) {
                    final Class19[] array = class16.field126[k][i][j];
                    if (array != null && array.length != 0) {
                        final Class19[] array2 = array;
                        for (int l = 0; l < array2.length; ++l) {
                            final Class255 method348 = this.method348(array2[l].field158);
                            if (method348 != null) {
                                final Class226 class18 = new Class226(k, this.field191 * 64 + i, this.field192 * 64 + j);
                                Class226 class19;
                                if (this.field197 != null) {
                                    class19 = new Class226(this.field197.field120 + k, i + this.field197.field127 * 64, j + this.field197.field117 * 64);
                                }
                                else {
                                    final Class34 class20 = (Class34)class16;
                                    class19 = new Class226(k + class20.field120, i + class20.field127 * 64 + class20.method584() * 8, class20.field117 * 64 + j + class20.method564() * 8);
                                }
                                this.field199.put(class17, new Class28(method348.field3238, class19, class18, this.method318(method348)));
                                continue Label_0097;
                            }
                        }
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(Ljava/util/List;B)V", garbageValue = "-10")
    void method289(final List list) {
        for (final Object class13 : list) {
            if (((Class13)class13).field88.field2564 >> 6 == this.field191 && ((Class13)class13).field88.field2565 >> 6 == this.field192) {
                this.field196.add(new Class28(((Class13)class13).field83, ((Class13)class13).field88, ((Class13)class13).field88, this.method306(((Class13)class13).field83)));
            }
        }
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(ILai;[Lh;[Lly;I)V", garbageValue = "2109575831")
    void method290(final int field187, final Class35 class35, final Class23[] array, final Class317[] array2) {
        this.field187 = field187;
        if (this.field197 == null && this.field195.isEmpty()) {
            return;
        }
        if (Class23.field188.method3997(RunException.method716(this.field191, this.field192, field187)) != null) {
            return;
        }
        final Class21 method297 = this.method297(this.field191, this.field192, array);
        final Class318 class36 = new Class318(this.field187 * 64, this.field187 * 64);
        class36.method5850();
        if (this.field197 != null) {
            this.method293(class35, array, array2, method297);
        }
        else {
            this.method373(class35, array2, method297);
        }
        Class172.method3458(class36, this.field191, this.field192, this.field187);
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(IIILjava/util/HashSet;I)V", garbageValue = "1346650712")
    void method382(final int n, final int n2, final int n3, HashSet set) {
        if (set == null) {
            set = new HashSet();
        }
        this.method380(n, n2, set, n3);
        this.method337(n, n2, set, n3);
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(Ljava/util/HashSet;III)V", garbageValue = "476011751")
    void method311(final HashSet set, final int n, final int n2) {
        for (final Object class28 : this.field199.values()) {
            if (set.contains(((Class28)class28).field240)) {
                this.method307(Class255.field3246[((Class28)class28).field240], ((Class28)class28).field235, ((Class28)class28).field245, n, n2);
            }
        }
        this.method309(set, n, n2);
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(Lai;[Lh;[Lly;Lj;I)V", garbageValue = "-488045984")
    void method293(final Class35 class35, final Class23[] array, final Class317[] array2, final Class21 class36) {
        for (int i = 0; i < 64; ++i) {
            for (int j = 0; j < 64; ++j) {
                this.method320(i, j, this.field197, class35, class36);
                this.method296(i, j, this.field197, class35);
            }
        }
        for (int k = 0; k < 64; ++k) {
            for (int l = 0; l < 64; ++l) {
                this.method295(k, l, this.field197, class35, array2);
            }
        }
    }
    
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "(Lai;[Lly;Lj;B)V", garbageValue = "-48")
    void method373(final Class35 class35, final Class317[] array, final Class21 class36) {
        for (final Object class37 : this.field195) {
            for (int i = ((Class34) class37).method565() * 8; i < ((Class34) class37).method565() * 8 + 8; ++i) {
                for (int j = ((Class34) class37).method563() * 8; j < ((Class34) class37).method563() * 8 + 8; ++j) {
                    this.method320(i, j, ((Class34) class37), class35, class36);
                    this.method296(i, j, ((Class34) class37), class35);
                }
            }
        }
        for (final Object class38 : this.field195) {
            for (int k = ((Class34) class38).method565() * 8; k < ((Class34) class38).method565() * 8 + 8; ++k) {
                for (int l = ((Class34) class38).method563() * 8; l < ((Class34) class38).method563() * 8 + 8; ++l) {
                    this.method295(k, l, ((Class34) class38), class35, array);
                }
            }
        }
    }
    
    @ObfuscatedName("m")
    @ObfuscatedSignature(signature = "(IILr;Lai;[Lly;I)V", garbageValue = "1267553766")
    void method295(final int n, final int n2, final Class16 class16, final Class35 class17, final Class317[] array) {
        this.method304(n, n2, class16);
        this.method406(n, n2, class16, array);
    }
    
    @ObfuscatedName("r")
    @ObfuscatedSignature(signature = "(IILr;Lai;Lj;I)V", garbageValue = "126232194")
    void method320(final int n, final int n2, final Class16 class16, final Class35 class17, final Class21 class18) {
        final short n3 = (short)(class16.field125[0][n][n2] - 1);
        final short n4 = (short)(class16.field123[0][n][n2] - 1);
        if (n3 == -1 && n4 == -1) {
            Class314.method5763(this.field187 * n, this.field187 * (63 - n2), this.field187, this.field187, this.field194);
        }
        int method69 = 16711935;
        if (n4 != -1) {
            method69 = Class6.method69(n4, this.field194);
        }
        if (n4 > -1 && class16.field124[0][n][n2] == 0) {
            Class314.method5763(this.field187 * n, this.field187 * (63 - n2), this.field187, this.field187, method69);
            return;
        }
        final int method70 = this.method302(n, n2, class16, class18);
        if (n4 == -1) {
            Class314.method5763(this.field187 * n, this.field187 * (63 - n2), this.field187, this.field187, method70);
            return;
        }
        class17.method606(this.field187 * n, this.field187 * (63 - n2), method70, method69, this.field187, this.field187, class16.field124[0][n][n2], class16.field116[0][n][n2]);
    }
    
    @ObfuscatedName("t")
    @ObfuscatedSignature(signature = "(IILr;Lai;I)V", garbageValue = "1017441024")
    void method296(final int n, final int n2, final Class16 class16, final Class35 class17) {
        for (int i = 1; i < class16.field121; ++i) {
            final short n3 = (short)(class16.field123[i][n][n2] - 1);
            if (n3 > -1) {
                final int method69 = Class6.method69(n3, this.field194);
                if (class16.field124[i][n][n2] == 0) {
                    Class314.method5763(this.field187 * n, this.field187 * (63 - n2), this.field187, this.field187, method69);
                }
                else {
                    class17.method606(this.field187 * n, this.field187 * (63 - n2), 0, method69, this.field187, this.field187, class16.field124[i][n][n2], class16.field116[i][n][n2]);
                }
            }
        }
    }
    
    @ObfuscatedName("o")
    @ObfuscatedSignature(signature = "(II[Lh;I)Lj;", garbageValue = "-1376488982")
    Class21 method297(final int n, final int n2, final Class23[] array) {
        Class21 method298 = (Class21)Class23.field189.method3997(RunException.method716(n, n2, 0));
        if (method298 == null) {
            method298 = this.method298(array);
            Class12.method104(method298, n, n2);
        }
        return method298;
    }
    
    @ObfuscatedName("y")
    @ObfuscatedSignature(signature = "([Lh;B)Lj;", garbageValue = "6")
    Class21 method298(final Class23[] array) {
        final Class32 class32 = new Class32(64, 64);
        if (this.field197 != null) {
            this.method300(0, 0, 64, 64, this.field197, class32);
        }
        else {
            for (final Object class33 : this.field195) {
                this.method300(((Class34)class33).method565() * 8, ((Class34)class33).method563() * 8, 8, 8, ((Class34)class33), class32);
            }
        }
        this.method299(array, class32);
        final Class21 class34 = new Class21();
        class34.method265(class32);
        return class34;
    }
    
    @ObfuscatedName("a")
    @ObfuscatedSignature(signature = "([Lh;Lan;I)V", garbageValue = "1463076234")
    void method299(final Class23[] array, final Class32 class32) {
        final Class240[] method85 = Class9.method85();
        for (int i = 0; i < method85.length; ++i) {
            final Class240 class33 = method85[i];
            if (array[class33.vmethod5815()] != null) {
                int n = 0;
                int n2 = 0;
                int n3 = 64;
                int n4 = 64;
                int n5 = 0;
                int n6 = 0;
                switch (class33.field3104) {
                    case 1: {
                        n5 = 59;
                        n3 = 5;
                        break;
                    }
                    case 7: {
                        n = 59;
                        n3 = 5;
                        break;
                    }
                    case 6: {
                        n6 = 59;
                        n4 = 5;
                        break;
                    }
                    case 2: {
                        n6 = 59;
                        n4 = 5;
                        n = 59;
                        n3 = 5;
                        break;
                    }
                    case 3: {
                        n2 = 59;
                        n4 = 5;
                        break;
                    }
                    case 4: {
                        n5 = 59;
                        n6 = 59;
                        n3 = 5;
                        n4 = 5;
                        break;
                    }
                    case 5: {
                        n2 = 59;
                        n4 = 5;
                        n = 59;
                        n3 = 5;
                        break;
                    }
                    case 0: {
                        n2 = 59;
                        n4 = 5;
                        n5 = 59;
                        n3 = 5;
                        break;
                    }
                }
                this.method301(n5, n6, n, n2, n3, n4, array[class33.vmethod5815()], class32);
            }
        }
    }
    
    @ObfuscatedName("c")
    @ObfuscatedSignature(signature = "(IIIILr;Lan;I)V", garbageValue = "1938287225")
    void method300(final int n, final int n2, final int n3, final int n4, final Class16 class16, final Class32 class17) {
        for (int i = n; i < n3 + n; ++i) {
            for (int j = n2; j < n2 + n4; ++j) {
                final short n5 = (short)(class16.field125[0][i][j] - 1);
                if (n5 != -1) {
                    class17.method541(i, j, 5, Class49.method953(n5));
                }
            }
        }
    }
    
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "(IIIIIILh;Lan;I)V", garbageValue = "2106846136")
    void method301(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Class23 class23, final Class32 class24) {
        for (int i = 0; i < n5; ++i) {
            for (int j = 0; j < n6; ++j) {
                final int method322 = class23.method322(i + n, j + n2);
                if (method322 != -1) {
                    class24.method541(n3 + i, j + n4, 5, Class49.method953(method322));
                }
            }
        }
    }
    
    @ObfuscatedName("af")
    @ObfuscatedSignature(signature = "(IILr;Lj;I)I", garbageValue = "-2041354337")
    int method302(final int n, final int n2, final Class16 class16, final Class21 class17) {
        if (class16.field125[0][n][n2] == 0) {
            return this.field194;
        }
        return class17.method272(n, n2);
    }
    
    @ObfuscatedName("ah")
    @ObfuscatedSignature(signature = "(IILr;[Lly;I)V", garbageValue = "-1488997280")
    void method406(final int n, final int n2, final Class16 class16, final Class317[] array) {
        for (int i = 0; i < class16.field121; ++i) {
            final Class19[] array2 = class16.field126[i][n][n2];
            if (array2 != null && array2.length != 0) {
                final Class19[] array3 = array2;
                for (int j = 0; j < array3.length; ++j) {
                    final Class19 class17 = array3[j];
                    if (Class152.method3247(class17.field155) || class17.field155 == Class233.field2776.field2777) {
                        final Class268 method2527 = Class110.method2527(class17.field158);
                        if (method2527.field3415 != -1) {
                            if (method2527.field3415 == 46 || method2527.field3415 == 52) {
                                array[method2527.field3415].method5825(this.field187 * n, this.field187 * (63 - n2), this.field187 * 2 + 1, this.field187 * 2 + 1);
                            }
                            else {
                                array[method2527.field3415].method5825(this.field187 * n, this.field187 * (63 - n2), this.field187 * 2, this.field187 * 2);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("ab")
    @ObfuscatedSignature(signature = "(IILr;B)V", garbageValue = "-83")
    void method304(final int n, final int n2, final Class16 class16) {
        for (int i = 0; i < class16.field121; ++i) {
            final Class19[] array = class16.field126[i][n][n2];
            if (array != null && array.length != 0) {
                final Class19[] array2 = array;
                for (int j = 0; j < array2.length; ++j) {
                    final Class19 class17 = array2[j];
                    if (Class129.method3073(class17.field155)) {
                        final int n3 = (Class110.method2527(class17.field158).field3388 != 0) ? -3407872 : -3355444;
                        if (class17.field155 == Class233.field2773.field2777) {
                            this.method321(n, n2, class17.field157, n3);
                        }
                        if (class17.field155 == Class233.field2755.field2777) {
                            this.method321(n, n2, class17.field157, -3355444);
                            this.method321(n, n2, class17.field157 + 1, n3);
                        }
                        if (class17.field155 == Class233.field2757.field2777) {
                            if (class17.field157 == 0) {
                                Class314.method5736(this.field187 * n, this.field187 * (63 - n2), 1, n3);
                            }
                            if (class17.field157 == 1) {
                                Class314.method5736(this.field187 * n + this.field187 - 1, this.field187 * (63 - n2), 1, n3);
                            }
                            if (class17.field157 == 2) {
                                Class314.method5736(this.field187 * n + this.field187 - 1, this.field187 * (63 - n2) + this.field187 - 1, 1, n3);
                            }
                            if (class17.field157 == 3) {
                                Class314.method5736(this.field187 * n, this.field187 * (63 - n2) + this.field187 - 1, 1, n3);
                            }
                        }
                        if (class17.field155 == Class233.field2758.field2777) {
                            if (class17.field157 % 2 == 0) {
                                for (int k = 0; k < this.field187; ++k) {
                                    Class314.method5736(k + this.field187 * n, (64 - n2) * this.field187 - 1 - k, 1, n3);
                                }
                            }
                            else {
                                for (int l = 0; l < this.field187; ++l) {
                                    Class314.method5736(l + this.field187 * n, l + this.field187 * (63 - n2), 1, n3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("aw")
    @ObfuscatedSignature(signature = "(IILjava/util/HashSet;IB)V", garbageValue = "-22")
    void method380(final int n, final int n2, final HashSet set, final int n3) {
        final float n4 = n3 / 64.0f;
        final float n5 = n4 / 2.0f;
        
        Set<Map.Entry> entries = field199.entrySet();
        for(Map.Entry entry : entries) {
            final Class226 class226 = (Class226) entry.getKey();
            final int field235 = (int)(class226.field2564 * n4 + n - n5);
            final int field236 = (int)(n2 + n3 - class226.field2565 * n4 - n5);
            final Class28 class227 = (Class28)entry.getValue();
            if (class227 != null) {
                class227.field235 = field235;
                class227.field245 = field236;
                if (set.contains(Class255.field3246[class227.field240].method4821())) {
                    continue;
                }
                this.method308(class227, field235, field236, n4);
            }
        }
    }
    
    @ObfuscatedName("ak")
    @ObfuscatedSignature(signature = "(Ljava/util/HashSet;III)V", garbageValue = "1896087870")
    void method309(final HashSet set, final int n, final int n2) {
        for (final Object class28 : this.field196) {
            final Class255 class29 = Class255.field3246[((Class28)class28).field240];
            if (class29 != null && set.contains(class29.method4821())) {
                this.method307(class29, ((Class28)class28).field235, ((Class28)class28).field245, n, n2);
            }
        }
    }
    
    @ObfuscatedName("as")
    @ObfuscatedSignature(signature = "(Lie;IIIII)V", garbageValue = "112631536")
    void method307(final Class255 class255, final int n, final int n2, final int n3, final int n4) {
        final Class318 method4815 = class255.method4815(false);
        if (method4815 == null) {
            return;
        }
        method4815.method5851(n - method4815.field3787 / 2, n2 - method4815.field3788 / 2);
        if (n3 % n4 < n4 / 2) {
            Class314.method5784(n, n2, 15, 16776960, 128);
            Class314.method5784(n, n2, 7, 16777215, 256);
        }
    }
    
    @ObfuscatedName("an")
    @ObfuscatedSignature(signature = "(Lab;IIFI)V", garbageValue = "-1276060102")
    void method308(final Class28 class28, final int n, final int n2, final float n3) {
        final Class255 class29 = Class255.field3246[class28.field240];
        this.method317(class29, n, n2);
        this.method362(class28, class29, n, n2, n3);
    }
    
    @ObfuscatedName("ao")
    @ObfuscatedSignature(signature = "(Lie;III)V", garbageValue = "-1923264171")
    void method317(final Class255 class255, final int n, final int n2) {
        final Class318 method4815 = class255.method4815(false);
        if (method4815 != null) {
            method4815.method5851(this.method288(method4815, class255.field3252) + n, n2 + this.method284(method4815, class255.field3253));
        }
    }
    
    @ObfuscatedName("at")
    @ObfuscatedSignature(signature = "(Lab;Lie;IIFB)V", garbageValue = "1")
    void method362(final Class28 class28, final Class255 class29, final int n, final int n2, final float n3) {
        if (class28.field246 == null) {
            return;
        }
        if (!class28.field246.field181.method103(n3)) {
            return;
        }
        final Class298 class30 = (Class298) this.field198.get(class28.field246.field181);
        class30.method5526(class28.field246.field186, n - class28.field246.field184 / 2, n2, class28.field246.field184, class28.field246.field182, 0xFF000000 | class29.field3242, 0, 1, 0, class30.field3695 / 2);
    }
    
    @ObfuscatedName("ai")
    @ObfuscatedSignature(signature = "(IILjava/util/HashSet;IB)V", garbageValue = "-39")
    void method337(final int n, final int n2, final HashSet set, final int n3) {
        final float n4 = n3 / 64.0f;
        for (final Object class28 : this.field196) {
            final int n5 = ((Class28)class28).field236.field2564 % 64;
            final int n6 = ((Class28)class28).field236.field2565 % 64;
            ((Class28)class28).field235 = (int)(n + n4 * n5);
            ((Class28)class28).field245 = (int)(n4 * (63 - n6) + n2);
            if (set.contains(((Class28)class28).field240)) {
                continue;
            }
            this.method308(((Class28)class28), ((Class28)class28).field235, ((Class28)class28).field245, n4);
        }
    }
    
    @ObfuscatedName("ac")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "3")
    void method340() {
        if (this.field197 != null) {
            for (int i = 0; i < 64; ++i) {
                for (int j = 0; j < 64; ++j) {
                    this.method313(i, j, this.field197);
                }
            }
        }
        else {
            for (final Object class34 : this.field195) {
                for (int k = ((Class34)class34).method565() * 8; k < ((Class34)class34).method565() * 8 + 8; ++k) {
                    for (int l = ((Class34)class34).method563() * 8; l < ((Class34)class34).method563() * 8 + 8; ++l) {
                        this.method313(k, l, ((Class34)class34));
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("ap")
    @ObfuscatedSignature(signature = "(IILr;I)V", garbageValue = "602031848")
    void method313(final int n, final int n2, final Class16 class16) {
        Class23.field193.method4436(0, n, n2);
        for (int i = 0; i < class16.field121; ++i) {
            final Class19[] array = class16.field126[i][n][n2];
            if (array != null && array.length != 0) {
                final Class19[] array2 = array;
                for (int j = 0; j < array2.length; ++j) {
                    final Class255 method348 = this.method348(array2[j].field158);
                    if (method348 != null) {
                        Class28 class17 = (Class28) this.field199.get(Class23.field193);
                        if (class17 != null) {
                            if (class17.field240 != method348.field3238) {
                                final Class28 class18 = new Class28(method348.field3238, class17.field243, class17.field236, this.method318(method348));
                                this.field199.put(new Class226(Class23.field193), class18);
                                class17 = class18;
                            }
                            final int n3 = class17.field243.field2567 - class17.field236.field2567;
                            class17.field236.field2567 = i;
                            class17.field243.field2567 = n3 + i;
                        }
                        else {
                            final Class226 class19 = new Class226(i, this.field191 * 64 + n, this.field192 * 64 + n2);
                            Class226 class20 = null;
                            if (this.field197 != null) {
                                class20 = new Class226(this.field197.field120 + i, this.field197.field127 * 64 + n, n2 + this.field197.field117 * 64);
                            }
                            else {
                                for (final Object class21 : this.field195) {
                                    if (((Class34)class21).method562(n, n2)) {
                                        class20 = new Class226(i + ((Class34)class21).field120, n + ((Class34)class21).field127 * 64 + ((Class34)class21).method584() * 8, n2 + ((Class34)class21).field117 * 64 + ((Class34)class21).method564() * 8);
                                        break;
                                    }
                                }
                            }
                            if (class20 == null) {
                                continue;
                            }
                            this.field199.put(new Class226(Class23.field193), new Class28(method348.field3238, class20, class19, this.method318(method348)));
                        }
                        return;
                    }
                }
            }
        }
        this.field199.remove(Class23.field193);
    }
    
    @ObfuscatedName("aa")
    @ObfuscatedSignature(signature = "(Lll;Ljd;I)I", garbageValue = "624399097")
    int method288(final Class318 class318, final Class270 class319) {
        switch (class319.field3482) {
            default: {
                return -class318.field3787;
            }
            case 0: {
                return -class318.field3787 / 2;
            }
            case 1: {
                return 0;
            }
        }
    }
    
    @ObfuscatedName("ar")
    @ObfuscatedSignature(signature = "(Lll;Lis;I)I", garbageValue = "105388050")
    int method284(final Class318 class318, final Class252 class319) {
        switch (class319.field3223) {
            default: {
                return -class318.field3788;
            }
            case 1: {
                return -class318.field3788 / 2;
            }
            case 2: {
                return 0;
            }
        }
    }
    
    @ObfuscatedName("au")
    @ObfuscatedSignature(signature = "(II)Lie;", garbageValue = "764273111")
    Class255 method348(final int n) {
        Class268 class268 = Class110.method2527(n);
        if (class268.field3410 != null) {
            class268 = class268.method5056();
            if (class268 == null) {
                return null;
            }
        }
        if (class268.field3397 != -1) {
            return Class255.field3246[class268.field3397];
        }
        return null;
    }
    
    @ObfuscatedName("av")
    @ObfuscatedSignature(signature = "(II)Ld;", garbageValue = "1836375512")
    Class22 method306(final int n) {
        return this.method318(Class255.field3246[n]);
    }
    
    @ObfuscatedName("al")
    @ObfuscatedSignature(signature = "(Lie;I)Ld;", garbageValue = "1728647620")
    Class22 method318(final Class255 class255) {
        if (class255.field3241 == null || this.field198 == null || this.field198.get(Class12.field70) == null) {
            return null;
        }
        final Class12 method101 = Class12.method101(class255.field3243);
        if (method101 == null) {
            return null;
        }
        final Class298 class256 = (Class298) this.field198.get(method101);
        if (class256 == null) {
            return null;
        }
        final String[] array = new String[class256.method5520(class255.field3241, 1000000)];
        class256.method5518(class255.field3241, null, array);
        final int n = array.length * class256.field3695 / 2;
        int n2 = 0;
        final String[] array2 = array;
        for (int i = 0; i < array2.length; ++i) {
            final int method102 = class256.method5517(array2[i]);
            if (method102 > n2) {
                n2 = method102;
            }
        }
        return new Class22(class255.field3241, n2, n, method101);
    }
    
    @ObfuscatedName("ae")
    @ObfuscatedSignature(signature = "(IIIIII)Ljava/util/List;", garbageValue = "-1031458872")
    List method319(final int n, final int n2, final int n3, final int n4, final int n5) {
        final LinkedList<Class28> list = new LinkedList<Class28>();
        if (n4 < n || n5 < n2) {
            return list;
        }
        if (n4 >= n3 + n || n5 >= n3 + n2) {
            return list;
        }
        for (final Object class28 : this.field199.values()) {
            if (((Class28)class28).method464(n4, n5)) {
                list.add(((Class28)class28));
            }
        }
        for (final Object class29 : this.field196) {
            if (((Class28)class29).method464(n4, n5)) {
                list.add(((Class28)class29));
            }
        }
        return list;
    }
    
    @ObfuscatedName("az")
    @ObfuscatedSignature(signature = "(B)Ljava/util/List;", garbageValue = "23")
    List method356() {
        final LinkedList list = new LinkedList();
        list.addAll(this.field196);
        list.addAll(this.field199.values());
        return list;
    }
    
    @ObfuscatedName("aq")
    @ObfuscatedSignature(signature = "(IIIIB)V", garbageValue = "-60")
    void method321(final int n, final int n2, int n3, final int n4) {
        n3 %= 4;
        if (n3 == 0) {
            Class314.method5738(this.field187 * n, this.field187 * (63 - n2), this.field187, n4);
        }
        if (n3 == 1) {
            Class314.method5736(this.field187 * n, this.field187 * (63 - n2), this.field187, n4);
        }
        if (n3 == 2) {
            Class314.method5738(this.field187 * n + this.field187 - 1, this.field187 * (63 - n2), this.field187, n4);
        }
        if (n3 == 3) {
            Class314.method5736(this.field187 * n, this.field187 * (63 - n2) + this.field187 - 1, this.field187, n4);
        }
    }
    
    @ObfuscatedName("ad")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "1433133625")
    int method322(final int n, final int n2) {
        if (this.field197 != null) {
            return this.field197.method153(n, n2);
        }
        if (!this.field195.isEmpty()) {
            for (final Object class34 : this.field195) {
                if (((Class34)class34).method562(n, n2)) {
                    return ((Class34)class34).method153(n, n2);
                }
            }
        }
        return -1;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)[Lli;", garbageValue = "-13")
    public static Class316[] method423() {
        return new Class316[] { Class316.field3771, Class316.field3775, Class316.field3774, Class316.field3772, Class316.field3773 };
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(ILir;Ljava/lang/String;Ljava/lang/String;IZI)V", garbageValue = "-469912607")
    public static void method422(final int n, final Class247 class247, final String s, final String s2, final int n2, final boolean b) {
        final int method4642 = class247.method4642(s);
        Class65.method1602(n, class247, method4642, class247.method4643(method4642, s2), n2, b);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Ljava/lang/CharSequence;II[BII)I", garbageValue = "488772559")
    public static int method421(final CharSequence charSequence, final int n, final int n2, final byte[] array, final int n3) {
        final int n4 = n2 - n;
        for (int i = 0; i < n4; ++i) {
            final char char1 = charSequence.charAt(i + n);
            if ((char1 <= '\0' || char1 >= '\u0080') && (char1 < ' ' || char1 > '\u00ff')) {
                if (char1 == '\u20ac') {
                    array[i + n3] = -128;
                }
                else if (char1 == '\u201a') {
                    array[i + n3] = -126;
                }
                else if (char1 == '\u0192') {
                    array[i + n3] = -125;
                }
                else if (char1 == '\u201e') {
                    array[i + n3] = -124;
                }
                else if (char1 == '\u2026') {
                    array[i + n3] = -123;
                }
                else if (char1 == '\u2020') {
                    array[i + n3] = -122;
                }
                else if (char1 == '\u2021') {
                    array[i + n3] = -121;
                }
                else if (char1 == '\u02c6') {
                    array[i + n3] = -120;
                }
                else if (char1 == '\u2030') {
                    array[i + n3] = -119;
                }
                else if (char1 == '\u0160') {
                    array[i + n3] = -118;
                }
                else if (char1 == '\u2039') {
                    array[i + n3] = -117;
                }
                else if (char1 == '\u0152') {
                    array[i + n3] = -116;
                }
                else if (char1 == '\u017d') {
                    array[i + n3] = -114;
                }
                else if (char1 == '\u2018') {
                    array[i + n3] = -111;
                }
                else if (char1 == '\u2019') {
                    array[i + n3] = -110;
                }
                else if (char1 == '\u201c') {
                    array[i + n3] = -109;
                }
                else if (char1 == '\u201d') {
                    array[i + n3] = -108;
                }
                else if (char1 == '\u2022') {
                    array[i + n3] = -107;
                }
                else if (char1 == '\u2013') {
                    array[i + n3] = -106;
                }
                else if (char1 == '\u2014') {
                    array[i + n3] = -105;
                }
                else if (char1 == '\u02dc') {
                    array[i + n3] = -104;
                }
                else if (char1 == '\u2122') {
                    array[i + n3] = -103;
                }
                else if (char1 == '\u0161') {
                    array[i + n3] = -102;
                }
                else if (char1 == '\u203a') {
                    array[i + n3] = -101;
                }
                else if (char1 == '\u0153') {
                    array[i + n3] = -100;
                }
                else if (char1 == '\u017e') {
                    array[i + n3] = -98;
                }
                else if (char1 == '\u0178') {
                    array[i + n3] = -97;
                }
                else {
                    array[i + n3] = 63;
                }
            }
            else {
                array[i + n3] = (byte)char1;
            }
        }
        return n4;
    }
}
