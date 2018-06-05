import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("r")
public abstract class Class16
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 415051583)
    int field127;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1630756967)
    int field117;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -168585187)
    int field118;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 764226753)
    int field119;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1927433157)
    int field120;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -1180650773)
    int field121;
    @ObfuscatedName("k")
    short[][][] field125;
    @ObfuscatedName("i")
    short[][][] field123;
    @ObfuscatedName("x")
    byte[][][] field124;
    @ObfuscatedName("e")
    byte[][][] field116;
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "[[[[Ly;")
    Class19[][][][] field126;
    
    Class16() {
        new LinkedList();
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IILgk;I)V", garbageValue = "-1870240303")
    void method150(final int n, final int n2, final Class182 class182) {
        final int method3544 = class182.method3544();
        if (method3544 == 0) {
            return;
        }
        if ((method3544 & 0x1) != 0x0) {
            this.method167(n, n2, class182, method3544);
        }
        else {
            this.method152(n, n2, class182, method3544);
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(IILgk;IB)V", garbageValue = "33")
    void method167(final int n, final int n2, final Class182 class182, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            this.field123[0][n][n2] = (short)class182.method3544();
        }
        this.field125[0][n][n2] = (short)class182.method3544();
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(IILgk;II)V", garbageValue = "1447711600")
    void method152(final int n, final int n2, final Class182 class182, final int n3) {
        final int n4 = ((n3 & 0x18) >> 3) + 1;
        final boolean b = (n3 & 0x2) != 0x0;
        final boolean b2 = (n3 & 0x4) != 0x0;
        this.field125[0][n][n2] = (short)class182.method3544();
        if (b) {
            for (int method3544 = class182.method3544(), i = 0; i < method3544; ++i) {
                final int method3545 = class182.method3544();
                if (method3545 != 0) {
                    this.field123[i][n][n2] = (short)method3545;
                    final int method3546 = class182.method3544();
                    this.field124[i][n][n2] = (byte)(method3546 >> 2);
                    this.field116[i][n][n2] = (byte)(method3546 & 0x3);
                }
            }
        }
        if (b2) {
            for (int j = 0; j < n4; ++j) {
                final int method3547 = class182.method3544();
                if (method3547 != 0) {
                    final Class19[][] array = this.field126[j][n];
                    final Class19[] array2 = new Class19[method3547];
                    array[n2] = array2;
                    final Class19[] array3 = array2;
                    for (int k = 0; k < method3547; ++k) {
                        final int method3548 = class182.method3546();
                        final int method3549 = class182.method3544();
                        array3[k] = new Class19(method3548, method3549 >> 2, method3549 & 0x3);
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(IIB)I", garbageValue = "1")
    int method153(final int n, final int n2) {
        if (n < 0 || n2 < 0) {
            return -1;
        }
        if (n >= 64 || n2 >= 64) {
            return -1;
        }
        return this.field125[0][n][n2] - 1;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-231958659")
    int method149() {
        return this.field118;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "-29")
    int method168() {
        return this.field119;
    }
    
    @ObfuscatedName("gh")
    @ObfuscatedSignature(signature = "(IIIII)V", garbageValue = "-327616642")
    static final void method158(final int n, final int n2, final int n3, final int n4) {
        if (Client.field621) {
            if (Client.field684 == 1) {
                Class161.field1997[Client.field803 / 100].method5851(Client.field681 - 8, Client.field682 - 8);
            }
            if (Client.field684 == 2) {
                Class161.field1997[Client.field803 / 100 + 4].method5851(Client.field681 - 8, Client.field682 - 8);
            }
        }
        Client.field694 = 0;
        final int n5 = (Class138.field1876.field931 >> 7) + Class62.field868;
        final int n6 = (Class138.field1876.field881 >> 7) + Client.field754;
        if (n5 >= 3053 && n5 <= 3156 && n6 >= 3056 && n6 <= 3136) {
            Client.field694 = 1;
        }
        if (n5 >= 3072 && n5 <= 3118 && n6 >= 9492 && n6 <= 9535) {
            Client.field694 = 1;
        }
        if (Client.field694 == 1 && n5 >= 3139 && n5 <= 3199 && n6 >= 3008 && n6 <= 3062) {
            Client.field694 = 0;
        }
    }
}
