import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("dq")
public final class Class114
{
    @ObfuscatedName("m")
    static int[] field1504;
    @ObfuscatedName("r")
    static int[] field1515;
    @ObfuscatedName("t")
    static int[] field1507;
    @ObfuscatedName("o")
    static int[] field1517;
    @ObfuscatedName("y")
    static int[] field1516;
    @ObfuscatedName("a")
    static final int[][] field1519;
    @ObfuscatedName("j")
    static final int[][] field1520;
    @ObfuscatedName("z")
    int[] field1514;
    @ObfuscatedName("w")
    int[] field1513;
    @ObfuscatedName("s")
    int[] field1500;
    @ObfuscatedName("l")
    int[] field1512;
    @ObfuscatedName("u")
    int[] field1503;
    @ObfuscatedName("q")
    int[] field1506;
    @ObfuscatedName("k")
    int[] field1505;
    @ObfuscatedName("i")
    int[] field1501;
    @ObfuscatedName("x")
    int[] field1499;
    @ObfuscatedName("e")
    int[] field1508;
    @ObfuscatedName("p")
    boolean field1518;
    @ObfuscatedName("b")
    int field1510;
    @ObfuscatedName("n")
    int field1511;
    @ObfuscatedName("f")
    int field1509;
    @ObfuscatedName("g")
    int field1502;
    
    static {
        Class114.field1504 = new int[6];
        Class114.field1515 = new int[6];
        Class114.field1507 = new int[6];
        Class114.field1517 = new int[6];
        Class114.field1516 = new int[6];
        field1519 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
        field1520 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };
    }
    
    Class114(final int field1510, final int field1511, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int field1512, final int field1513) {
        this.field1518 = true;
        if (n5 != n4 || n6 != n4 || n7 != n4) {
            this.field1518 = false;
        }
        this.field1510 = field1510;
        this.field1511 = field1511;
        this.field1509 = field1512;
        this.field1502 = field1513;
        final int n16 = 128;
        final int n17 = n16 / 2;
        final int n18 = n16 / 4;
        final int n19 = n16 * 3 / 4;
        final int[] array = Class114.field1519[field1510];
        final int length = array.length;
        this.field1514 = new int[length];
        this.field1513 = new int[length];
        this.field1500 = new int[length];
        final int[] array2 = new int[length];
        final int[] array3 = new int[length];
        final int n20 = n16 * n2;
        final int n21 = n3 * n16;
        for (int i = 0; i < length; ++i) {
            int n22 = array[i];
            if ((n22 & 0x1) == 0x0 && n22 <= 8) {
                n22 = (n22 - field1511 - field1511 - 1 & 0x7) + 1;
            }
            if (n22 > 8 && n22 <= 12) {
                n22 = (n22 - 9 - field1511 & 0x3) + 9;
            }
            if (n22 > 12 && n22 <= 16) {
                n22 = (n22 - 13 - field1511 & 0x3) + 13;
            }
            int n23;
            int n24;
            int n25;
            int n26;
            int n27;
            if (n22 == 1) {
                n23 = n20;
                n24 = n21;
                n25 = n4;
                n26 = n8;
                n27 = n12;
            }
            else if (n22 == 2) {
                n23 = n20 + n17;
                n24 = n21;
                n25 = n5 + n4 >> 1;
                n26 = n9 + n8 >> 1;
                n27 = n13 + n12 >> 1;
            }
            else if (n22 == 3) {
                n23 = n20 + n16;
                n24 = n21;
                n25 = n5;
                n26 = n9;
                n27 = n13;
            }
            else if (n22 == 4) {
                n23 = n20 + n16;
                n24 = n21 + n17;
                n25 = n6 + n5 >> 1;
                n26 = n9 + n10 >> 1;
                n27 = n13 + n14 >> 1;
            }
            else if (n22 == 5) {
                n23 = n20 + n16;
                n24 = n21 + n16;
                n25 = n6;
                n26 = n10;
                n27 = n14;
            }
            else if (n22 == 6) {
                n23 = n20 + n17;
                n24 = n21 + n16;
                n25 = n6 + n7 >> 1;
                n26 = n11 + n10 >> 1;
                n27 = n15 + n14 >> 1;
            }
            else if (n22 == 7) {
                n23 = n20;
                n24 = n21 + n16;
                n25 = n7;
                n26 = n11;
                n27 = n15;
            }
            else if (n22 == 8) {
                n23 = n20;
                n24 = n21 + n17;
                n25 = n7 + n4 >> 1;
                n26 = n11 + n8 >> 1;
                n27 = n15 + n12 >> 1;
            }
            else if (n22 == 9) {
                n23 = n20 + n17;
                n24 = n21 + n18;
                n25 = n5 + n4 >> 1;
                n26 = n9 + n8 >> 1;
                n27 = n13 + n12 >> 1;
            }
            else if (n22 == 10) {
                n23 = n20 + n19;
                n24 = n21 + n17;
                n25 = n6 + n5 >> 1;
                n26 = n9 + n10 >> 1;
                n27 = n13 + n14 >> 1;
            }
            else if (n22 == 11) {
                n23 = n20 + n17;
                n24 = n21 + n19;
                n25 = n6 + n7 >> 1;
                n26 = n11 + n10 >> 1;
                n27 = n15 + n14 >> 1;
            }
            else if (n22 == 12) {
                n23 = n20 + n18;
                n24 = n21 + n17;
                n25 = n7 + n4 >> 1;
                n26 = n11 + n8 >> 1;
                n27 = n15 + n12 >> 1;
            }
            else if (n22 == 13) {
                n23 = n20 + n18;
                n24 = n21 + n18;
                n25 = n4;
                n26 = n8;
                n27 = n12;
            }
            else if (n22 == 14) {
                n23 = n20 + n19;
                n24 = n21 + n18;
                n25 = n5;
                n26 = n9;
                n27 = n13;
            }
            else if (n22 == 15) {
                n23 = n20 + n19;
                n24 = n21 + n19;
                n25 = n6;
                n26 = n10;
                n27 = n14;
            }
            else {
                n23 = n20 + n18;
                n24 = n21 + n19;
                n25 = n7;
                n26 = n11;
                n27 = n15;
            }
            this.field1514[i] = n23;
            this.field1513[i] = n25;
            this.field1500[i] = n24;
            array2[i] = n26;
            array3[i] = n27;
        }
        final int[] array4 = Class114.field1520[field1510];
        final int n28 = array4.length / 4;
        this.field1505 = new int[n28];
        this.field1501 = new int[n28];
        this.field1499 = new int[n28];
        this.field1512 = new int[n28];
        this.field1503 = new int[n28];
        this.field1506 = new int[n28];
        if (n != -1) {
            this.field1508 = new int[n28];
        }
        int n29 = 0;
        for (int j = 0; j < n28; ++j) {
            final int n30 = array4[n29];
            int n31 = array4[n29 + 1];
            int n32 = array4[n29 + 2];
            int n33 = array4[n29 + 3];
            n29 += 4;
            if (n31 < 4) {
                n31 = (n31 - field1511 & 0x3);
            }
            if (n32 < 4) {
                n32 = (n32 - field1511 & 0x3);
            }
            if (n33 < 4) {
                n33 = (n33 - field1511 & 0x3);
            }
            this.field1505[j] = n31;
            this.field1501[j] = n32;
            this.field1499[j] = n33;
            if (n30 == 0) {
                this.field1512[j] = array2[n31];
                this.field1503[j] = array2[n32];
                this.field1506[j] = array2[n33];
                if (this.field1508 != null) {
                    this.field1508[j] = -1;
                }
            }
            else {
                this.field1512[j] = array3[n31];
                this.field1503[j] = array3[n32];
                this.field1506[j] = array3[n33];
                if (this.field1508 != null) {
                    this.field1508[j] = n;
                }
            }
        }
        int n34 = n4;
        int n35;
        if ((n35 = n5) < n34) {
            n34 = n5;
        }
        if (n5 > n35) {
            n35 = n5;
        }
        if (n6 < n34) {
            n34 = n6;
        }
        if (n6 > n35) {
            n35 = n6;
        }
        if (n7 < n34) {
            n34 = n7;
        }
        if (n7 > n35) {
            n35 = n7;
        }
    }
}
