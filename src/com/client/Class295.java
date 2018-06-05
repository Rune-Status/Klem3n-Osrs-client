package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class Class295 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   public static final Class295 field3678 = new Class295("PLAIN11", "p11_full");
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   public static final Class295 field3672 = new Class295("PLAIN12", "p12_full");
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   public static final Class295 field3668 = new Class295("BOLD12", "b12_full");
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   public static final Class295 field3673 = new Class295("VERDANA11", "verdana_11pt_regular");
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   public static final Class295 field3670 = new Class295("VERDANA13", "verdana_13pt_regular");
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   public static final Class295 field3669 = new Class295("VERDANA15", "verdana_15pt_regular");
   @ObfuscatedName("fa")
   static int[] field3676;
   @ObfuscatedName("k")
   final String field3671;
   @ObfuscatedName("i")
   String field3666;

   Class295(String var1, String var2) {
      this.field3671 = var1;
      this.field3666 = var2;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)[Lkc;",
      garbageValue = "106"
   )
   public static Class295[] method5498() {
      return new Class295[]{field3673, field3668, field3678, field3672, field3670, field3669};
   }

   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      signature = "(Lba;I)V",
      garbageValue = "1542414635"
   )
   static final void method5502(Class63 var0) {
      var0.field873 = false;
      Class273 var1;
      if (var0.field900 != -1) {
         var1 = Class3.method25(var0.field900);
         if (var1 != null && var1.field3540 != null) {
            ++var0.field902;
            if (var0.field908 < var1.field3540.length && var0.field902 > var1.field3541[var0.field908]) {
               var0.field902 = 1;
               ++var0.field908;
               Class173.method3471(var1, var0.field908, var0.field931, var0.field881);
            }

            if (var0.field908 >= var1.field3540.length) {
               var0.field902 = 0;
               var0.field908 = 0;
               Class173.method3471(var1, var0.field908, var0.field931, var0.field881);
            }
         } else {
            var0.field900 = -1;
         }
      }

      if (var0.field891 != -1 && Client.field591 >= var0.field911) {
         if (var0.field876 < 0) {
            var0.field876 = 0;
         }

         int var3 = Class57.method1035(var0.field891).field3271;
         if (var3 != -1) {
            Class273 var2 = Class3.method25(var3);
            if (var2 != null && var2.field3540 != null) {
               ++var0.field910;
               if (var0.field876 < var2.field3540.length && var0.field910 > var2.field3541[var0.field876]) {
                  var0.field910 = 1;
                  ++var0.field876;
                  Class173.method3471(var2, var0.field876, var0.field931, var0.field881);
               }

               if (var0.field876 >= var2.field3540.length && (var0.field876 < 0 || var0.field876 >= var2.field3540.length)) {
                  var0.field891 = -1;
               }
            } else {
               var0.field891 = -1;
            }
         } else {
            var0.field891 = -1;
         }
      }

      if (var0.field903 != -1 && var0.field906 <= 1) {
         var1 = Class3.method25(var0.field903);
         if (var1.field3551 == 1 && var0.field930 > 0 && var0.field917 <= Client.field591 && var0.field918 < Client.field591) {
            var0.field906 = 1;
            return;
         }
      }

      if (var0.field903 != -1 && var0.field906 == 0) {
         var1 = Class3.method25(var0.field903);
         if (var1 != null && var1.field3540 != null) {
            ++var0.field901;
            if (var0.field904 < var1.field3540.length && var0.field901 > var1.field3541[var0.field904]) {
               var0.field901 = 1;
               ++var0.field904;
               Class173.method3471(var1, var0.field904, var0.field931, var0.field881);
            }

            if (var0.field904 >= var1.field3540.length) {
               var0.field904 -= var1.field3544;
               ++var0.field907;
               if (var0.field907 >= var1.field3550) {
                  var0.field903 = -1;
               } else if (var0.field904 >= 0 && var0.field904 < var1.field3540.length) {
                  Class173.method3471(var1, var0.field904, var0.field931, var0.field881);
               } else {
                  var0.field903 = -1;
               }
            }

            var0.field873 = var1.field3546;
         } else {
            var0.field903 = -1;
         }
      }

      if (var0.field906 > 0) {
         --var0.field906;
      }

   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "911738943"
   )
   static void method5501() {
      for(Class55 var0 = (Class55)Client.field741.method4018(); var0 != null; var0 = (Class55)Client.field741.method4019()) {
         int var1 = var0.field501;
         if (Class261.method4931(var1)) {
            boolean var2 = true;
            Class230[] var3 = Class42.field366[var1];

            int var4;
            for(var4 = 0; var4 < var3.length; ++var4) {
               if (var3[var4] != null) {
                  var2 = var3[var4].field2604;
                  break;
               }
            }

            if (!var2) {
               var4 = (int)var0.field2421;
               Class230 var5 = Class26.method434(var4);
               if (var5 != null) {
                  Class60.method1114(var5);
               }
            }
         }
      }

   }
}
