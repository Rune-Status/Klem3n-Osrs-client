package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
public class Class91 {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Ldn;"
   )
   Class107[] field1241 = new Class107[10];
   @ObfuscatedName("s")
   int field1239;
   @ObfuscatedName("l")
   int field1240;

   @ObfuscatedSignature(
      signature = "(Lgk;)V"
   )
   Class91(Class182 var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.method3544();
         if (var3 != 0) {
            --var1.field2339;
            this.field1241[var2] = new Class107();
            this.field1241[var2].method2466(var1);
         }
      }

      this.field1239 = var1.method3550();
      this.field1240 = var1.method3550();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "()Lct;"
   )
   public Class93 method2069() {
      byte[] var1 = this.method2068();
      return new Class93(22050, var1, this.field1239 * 22050 / 1000, this.field1240 * 22050 / 1000);
   }

   @ObfuscatedName("s")
   public final int method2070() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field1241[var2] != null && this.field1241[var2].field1405 / 20 < var1) {
            var1 = this.field1241[var2].field1405 / 20;
         }
      }

      if (this.field1239 < this.field1240 && this.field1239 / 20 < var1) {
         var1 = this.field1239 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.field1241[var2] != null) {
               this.field1241[var2].field1405 -= var1 * 20;
            }
         }

         if (this.field1239 < this.field1240) {
            this.field1239 -= var1 * 20;
            this.field1240 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ObfuscatedName("l")
   final byte[] method2068() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field1241[var2] != null && this.field1241[var2].field1404 + this.field1241[var2].field1405 > var1) {
            var1 = this.field1241[var2].field1404 + this.field1241[var2].field1405;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = var1 * 22050 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.field1241[var4] != null) {
               int var5 = this.field1241[var4].field1404 * 22050 / 1000;
               int var6 = this.field1241[var4].field1405 * 22050 / 1000;
               int[] var7 = this.field1241[var4].method2464(var5, this.field1241[var4].field1404);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = (var7[var8] >> 8) + var3[var8 + var6];
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;II)Lcg;"
   )
   public static Class91 method2071(Class247 var0, int var1, int var2) {
      byte[] var3 = var0.method4625(var1, var2);
      return var3 == null ? null : new Class91(new Class182(var3));
   }
}
