package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class Class117 {
   @ObfuscatedName("z")
   static int[] field1551 = new int[500];
   @ObfuscatedName("w")
   static int[] field1543 = new int[500];
   @ObfuscatedName("s")
   static int[] field1544 = new int[500];
   @ObfuscatedName("l")
   static int[] field1545 = new int[500];
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Ldt;"
   )
   Class124 field1546 = null;
   @ObfuscatedName("q")
   int field1547 = -1;
   @ObfuscatedName("k")
   int[] field1548;
   @ObfuscatedName("i")
   int[] field1549;
   @ObfuscatedName("x")
   int[] field1542;
   @ObfuscatedName("e")
   int[] field1550;
   @ObfuscatedName("p")
   boolean field1552 = false;

   @ObfuscatedSignature(
      signature = "([BLdt;)V"
   )
   Class117(byte[] var1, Class124 var2) {
      this.field1546 = var2;
      Class182 var3 = new Class182(var1);
      Class182 var4 = new Class182(var1);
      var3.field2339 = 2;
      int var5 = var3.method3544();
      int var6 = -1;
      int var7 = 0;
      var4.field2339 = var5 + var3.field2339;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.method3544();
         if (var9 > 0) {
            if (this.field1546.field1706[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.field1546.field1706[var10] == 0) {
                     field1551[var7] = var10;
                     field1543[var7] = 0;
                     field1544[var7] = 0;
                     field1545[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field1551[var7] = var8;
            short var11 = 0;
            if (this.field1546.field1706[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               field1543[var7] = var4.method3561();
            } else {
               field1543[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               field1544[var7] = var4.method3561();
            } else {
               field1544[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               field1545[var7] = var4.method3561();
            } else {
               field1545[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.field1546.field1706[var8] == 5) {
               this.field1552 = true;
            }
         }
      }

      if (var1.length != var4.field2339) {
         throw new RuntimeException();
      } else {
         this.field1547 = var7;
         this.field1548 = new int[var7];
         this.field1549 = new int[var7];
         this.field1542 = new int[var7];
         this.field1550 = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.field1548[var8] = field1551[var8];
            this.field1549[var8] = field1543[var8];
            this.field1542[var8] = field1544[var8];
            this.field1550[var8] = field1545[var8];
         }

      }
   }
}
