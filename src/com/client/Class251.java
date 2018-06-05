package com.client;
import java.util.HashMap;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class Class251 {
   @ObfuscatedName("z")
   final HashMap field3220 = new HashMap();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   Class310 field3219 = new Class310(0, 0);
   @ObfuscatedName("s")
   int[] field3218 = new int[2048];
   @ObfuscatedName("l")
   int[] field3216 = new int[2048];
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1551393161
   )
   int field3217 = 0;

   public Class251() {
      Class64.method1560();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1389377337"
   )
   void method4771(int var1) {
      int var2 = var1 * 2 + 1;
      double[] var3 = Class266.method4986(0.0D, (double)((float)var1 / 3.0F), var1);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for(int var8 = 0; var8 < var2; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            int var10 = var6[var9 + var8 * var2] = (int)(256.0D * (var3[var8] * var3[var9] / var4));
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      Class318 var11 = new Class318(var6, var2, var2);
      this.field3220.put(var1, var11);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Lll;",
      garbageValue = "85"
   )
   Class318 method4772(int var1) {
      if (!this.field3220.containsKey(var1)) {
         this.method4771(var1);
      }

      return (Class318)this.field3220.get(var1);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1087608107"
   )
   public final void method4773(int var1, int var2) {
      if (this.field3217 < this.field3218.length) {
         this.field3218[this.field3217] = var1;
         this.field3216[this.field3217] = var2;
         ++this.field3217;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "641561299"
   )
   public final void method4774() {
      this.field3217 = 0;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IILll;FI)V",
      garbageValue = "2066136906"
   )
   public final void method4776(int var1, int var2, Class318 var3, float var4) {
      int var5 = (int)(var4 * 18.0F);
      Class318 var6 = this.method4772(var5);
      int var7 = var5 * 2 + 1;
      Class310 var8 = new Class310(0, 0, var3.field3787, var3.field3788);
      Class310 var9 = new Class310(0, 0);
      this.field3219.method5680(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field3217; ++var10) {
         var11 = this.field3218[var10];
         var12 = this.field3216[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.field3788 - var4 * (float)(var12 - var2)) - var5;
         this.field3219.method5679(var13, var14);
         this.field3219.method5681(var8, var9);
         this.method4790(var6, var3, var9);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.field3791.length; ++var10) {
         if (var3.field3791[var10] == 0) {
            var3.field3791[var10] = -16777216;
         } else {
            var11 = (var3.field3791[var10] + 64 - 1) / 256;
            if (var11 <= 0) {
               var3.field3791[var10] = -16777216;
            } else {
               if (var11 > Class224.field2554.length) {
                  var11 = Class224.field2554.length;
               }

               var12 = Class224.field2554[var11 - 1];
               var3.field3791[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lll;Lll;Lkg;B)V",
      garbageValue = "-68"
   )
   void method4790(Class318 var1, Class318 var2, Class310 var3) {
      if (var3.field3747 != 0 && var3.field3745 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (var3.field3746 == 0) {
            var4 = var1.field3787 - var3.field3747;
         }

         if (var3.field3743 == 0) {
            var5 = var1.field3788 - var3.field3745;
         }

         int var6 = var4 + var5 * var1.field3787;
         int var7 = var3.field3746 + var2.field3787 * var3.field3743;

         for(int var8 = 0; var8 < var3.field3745; ++var8) {
            for(int var9 = 0; var9 < var3.field3747; ++var9) {
               int var10001 = var7++;
               var2.field3791[var10001] += var1.field3791[var6++];
            }

            var6 += var1.field3787 - var3.field3747;
            var7 += var2.field3787 - var3.field3747;
         }

      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
      garbageValue = "-1980014136"
   )
   public static String method4794(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var3 = var0[var1];
         return var3 == null ? "null" : var3.toString();
      } else {
         int var8 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var8; ++var5) {
            CharSequence var6 = var0[var5];
            if (var6 == null) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var8; ++var10) {
            CharSequence var7 = var0[var10];
            if (var7 == null) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }
}
