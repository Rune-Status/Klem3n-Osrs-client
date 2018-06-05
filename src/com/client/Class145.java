package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class Class145 extends Class283 {
   @ObfuscatedName("z")
   final boolean field1903;

   public Class145(boolean var1) {
      this.field1903 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "2025986991"
   )
   int method3182(Class287 var1, Class287 var2) {
      if (var1.field3628 != 0 && var2.field3628 != 0) {
         return this.field1903 ? var1.method5287().method5435(var2.method5287()) : var2.method5287().method5435(var1.method5287());
      } else {
         return this.method5308(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3182((Class287)var1, (Class287)var2);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "763302428"
   )
   public static boolean method3188(int var0) {
      return (var0 >> 30 & 1) != 0;
   }
}
