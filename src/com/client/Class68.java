package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
public final class Class68 extends Class204 {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Class205 field985 = new Class205();
   @ObfuscatedName("ds")
   @ObfuscatedGetter(
      intValue = -884199663
   )
   static int field996;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 510585237
   )
   int field984;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1464678261
   )
   int field989;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1060604171
   )
   int field981;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -2012590697
   )
   int field988;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2028898983
   )
   int field983;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 2130308981
   )
   int field992;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 143905457
   )
   int field991;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 481090733
   )
   int field987;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lcm;"
   )
   Class103 field993;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1298002913
   )
   int field982;
   @ObfuscatedName("b")
   int[] field986;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 366883801
   )
   int field990;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lcm;"
   )
   Class103 field980;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ljj;"
   )
   Class268 field994;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-73"
   )
   void method1688() {
      int var1 = this.field987;
      Class268 var2 = this.field994.method5056();
      if (var2 != null) {
         this.field987 = var2.field3413;
         this.field991 = var2.field3414 * 128;
         this.field989 = var2.field3380;
         this.field982 = var2.field3408;
         this.field986 = var2.field3417;
      } else {
         this.field987 = -1;
         this.field991 = 0;
         this.field989 = 0;
         this.field982 = 0;
         this.field986 = null;
      }

      if (var1 != this.field987 && this.field993 != null) {
         Class36.field310.method2009(this.field993);
         this.field993 = null;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lbo;I)V",
      garbageValue = "-1000206687"
   )
   public static void method1696(Class56 var0) {
      Class309.method5674(var0, 500000);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;IZB)I",
      garbageValue = "53"
   )
   public static int method1693(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == '-') {
                  var3 = true;
                  continue;
               }

               if (var8 == '+') {
                  continue;
               }
            }

            int var10;
            if (var8 >= '0' && var8 <= '9') {
               var10 = var8 - 48;
            } else if (var8 >= 'A' && var8 <= 'Z') {
               var10 = var8 - 55;
            } else {
               if (var8 < 'a' || var8 > 'z') {
                  throw new NumberFormatException();
               }

               var10 = var8 - 87;
            }

            if (var10 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1978013754"
   )
   public static void method1698() {
      Class230.field2599.method3984();
      Class230.field2600.method3984();
      Class230.field2601.method3984();
      Class230.field2602.method3984();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IZII)V",
      garbageValue = "-1337565581"
   )
   public static final void method1697(int var0, boolean var1, int var2) {
      if (var0 >= 8000 && var0 <= 48000) {
         Class95.field1300 = var0;
         Class95.field1295 = var1;
         Class27.field230 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
