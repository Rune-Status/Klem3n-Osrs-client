package com.client;
import java.util.Comparator;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
final class Class3 implements Comparator {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ls;Ls;I)I",
      garbageValue = "2100734637"
   )
   int method24(Class2 var1, Class2 var2) {
      return var1.field17.field33 < var2.field17.field33 ? -1 : (var2.field17.field33 == var1.field17.field33 ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method24((Class2)var1, (Class2)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Ljn;",
      garbageValue = "1221940475"
   )
   public static Class273 method25(int var0) {
      Class273 var1 = (Class273)Class273.field3552.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class273.field3538.method4625(12, var0);
         var1 = new Class273();
         if (var2 != null) {
            var1.method5212(new Class182(var2));
         }

         var1.method5220();
         Class273.field3552.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-32"
   )
   public static int method32(int var0) {
      return Class37.method662(Class120.field1647[var0]);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "1737027052"
   )
   public static int method35(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + var0.charAt(var3);
      }

      return var2;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1924220675"
   )
   public static void method34() {
      Class268.field3371.method3984();
      Class268.field3391.method3984();
      Class268.field3370.method3984();
      Class268.field3374.method3984();
   }

   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      signature = "(Lba;I)V",
      garbageValue = "-1623829882"
   )
   static final void method26(Class63 var0) {
      if (var0.field924 != 0) {
         if (var0.field897 != -1) {
            Object var1 = null;
            if (var0.field897 < 32768) {
               var1 = Client.field843[var0.field897];
            } else if (var0.field897 >= 32768) {
               var1 = Client.field610[var0.field897 - '耀'];
            }

            if (var1 != null) {
               int var2 = var0.field931 - ((Class63)var1).field931;
               int var3 = var0.field881 - ((Class63)var1).field881;
               if (var2 != 0 || var3 != 0) {
                  var0.field926 = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
               }
            } else if (var0.field898) {
               var0.field897 = -1;
               var0.field898 = false;
            }
         }

         if (var0.field920 != -1 && (var0.field909 == 0 || var0.field923 > 0)) {
            var0.field926 = var0.field920;
            var0.field920 = -1;
         }

         int var4 = var0.field926 - var0.field905 & 2047;
         if (var4 == 0 && var0.field898) {
            var0.field897 = -1;
            var0.field898 = false;
         }

         if (var4 != 0) {
            ++var0.field875;
            boolean var6;
            if (var4 > 1024) {
               var0.field905 -= var0.field924;
               var6 = true;
               if (var4 < var0.field924 || var4 > 2048 - var0.field924) {
                  var0.field905 = var0.field926;
                  var6 = false;
               }

               if (var0.field893 == var0.field900 && (var0.field875 > 25 || var6)) {
                  if (var0.field877 != -1) {
                     var0.field900 = var0.field877;
                  } else {
                     var0.field900 = var0.field899;
                  }
               }
            } else {
               var0.field905 += var0.field924;
               var6 = true;
               if (var4 < var0.field924 || var4 > 2048 - var0.field924) {
                  var0.field905 = var0.field926;
                  var6 = false;
               }

               if (var0.field893 == var0.field900 && (var0.field875 > 25 || var6)) {
                  if (var0.field878 != -1) {
                     var0.field900 = var0.field878;
                  } else {
                     var0.field900 = var0.field899;
                  }
               }
            }

            var0.field905 &= 2047;
         } else {
            var0.field875 = 0;
         }

      }
   }
}
