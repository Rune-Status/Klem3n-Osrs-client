package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
public final class Class72 extends Class63 {
   @ObfuscatedName("op")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static Class318 field1038;
   @ObfuscatedName("pz")
   @ObfuscatedGetter(
      intValue = -856093161
   )
   static int field1033;
   @ObfuscatedName("b")
   static int[] field1035;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ljq;"
   )
   Class271 field1037;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IBB)V",
      garbageValue = "70"
   )
   final void method1794(int var1, byte var2) {
      int var3 = super.field922[0];
      int var4 = super.field872[0];
      if (var1 == 0) {
         --var3;
         ++var4;
      }

      if (var1 == 1) {
         ++var4;
      }

      if (var1 == 2) {
         ++var3;
         ++var4;
      }

      if (var1 == 3) {
         --var3;
      }

      if (var1 == 4) {
         ++var3;
      }

      if (var1 == 5) {
         --var3;
         --var4;
      }

      if (var1 == 6) {
         --var4;
      }

      if (var1 == 7) {
         ++var3;
         --var4;
      }

      if (super.field903 != -1 && Class3.method25(super.field903).field3535 == 1) {
         super.field903 = -1;
      }

      if (super.field909 < 9) {
         ++super.field909;
      }

      for(int var5 = super.field909; var5 > 0; --var5) {
         super.field922[var5] = super.field922[var5 - 1];
         super.field872[var5] = super.field872[var5 - 1];
         super.field928[var5] = super.field928[var5 - 1];
      }

      super.field922[0] = var3;
      super.field872[0] = var4;
      super.field928[0] = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "1896882090"
   )
   final void method1788(int var1, int var2, boolean var3) {
      if (super.field903 != -1 && Class3.method25(super.field903).field3535 == 1) {
         super.field903 = -1;
      }

      if (!var3) {
         int var4 = var1 - super.field922[0];
         int var5 = var2 - super.field872[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if (super.field909 < 9) {
               ++super.field909;
            }

            for(int var6 = super.field909; var6 > 0; --var6) {
               super.field922[var6] = super.field922[var6 - 1];
               super.field872[var6] = super.field872[var6 - 1];
               super.field928[var6] = super.field928[var6 - 1];
            }

            super.field922[0] = var1;
            super.field872[0] = var2;
            super.field928[0] = 1;
            return;
         }
      }

      super.field909 = 0;
      super.field930 = 0;
      super.field923 = 0;
      super.field922[0] = var1;
      super.field872[0] = var2;
      super.field931 = super.field874 * 64 + super.field922[0] * 128;
      super.field881 = super.field874 * 64 + super.field872[0] * 128;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
   )
   protected final Class119 vmethod3067() {
      if (this.field1037 == null) {
         return null;
      } else {
         Class273 var1 = super.field903 != -1 && super.field906 == 0 ? Class3.method25(super.field903) : null;
         Class273 var2 = super.field900 != -1 && (super.field900 != super.field893 || var1 == null) ? Class3.method25(super.field900) : null;
         Class119 var3 = this.field1037.method5162(var1, super.field904, var2, super.field908);
         if (var3 == null) {
            return null;
         } else {
            var3.method2670();
            super.field925 = var3.field1781;
            if (super.field891 != -1 && super.field876 != -1) {
               Class119 var4 = Class57.method1035(super.field891).method4866(super.field876);
               if (var4 != null) {
                  var4.method2718(0, -super.field871, 0);
                  Class119[] var5 = new Class119[]{var3, var4};
                  var3 = new Class119(var5, 2);
               }
            }

            if (this.field1037.field3497 == 1) {
               var3.field1603 = true;
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "5"
   )
   final boolean vmethod1786() {
      return this.field1037 != null;
   }
}
