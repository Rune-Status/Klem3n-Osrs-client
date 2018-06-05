package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class Class86 {
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1175004073
   )
   public static int field1212;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lbh;"
   )
   Class58[] field1209 = new Class58[100];
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 177761561
   )
   int field1210;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbh;",
      garbageValue = "55"
   )
   Class58 method1964(int var1, String var2, String var3, String var4) {
      Class58 var5 = this.field1209[99];

      for(int var6 = this.field1210; var6 > 0; --var6) {
         if (var6 != 100) {
            this.field1209[var6] = this.field1209[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new Class58(var1, var2, var4, var3);
      } else {
         var5.method4064();
         var5.method4101();
         var5.method1070(var1, var2, var4, var3);
      }

      this.field1209[0] = var5;
      if (this.field1210 < 100) {
         ++this.field1210;
      }

      return var5;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Lbh;",
      garbageValue = "78"
   )
   Class58 method1965(int var1) {
      return var1 >= 0 && var1 < this.field1210 ? this.field1209[var1] : null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "8454016"
   )
   int method1976() {
      return this.field1210;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)I",
      garbageValue = "-1"
   )
   public static int method1970(int var0, int var1, int var2, int var3, int var4, int var5) {
      if ((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      if (var2 == 0) {
         return var1;
      } else if (var2 == 1) {
         return 7 - var0 - (var3 - 1);
      } else {
         return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
      }
   }
}
