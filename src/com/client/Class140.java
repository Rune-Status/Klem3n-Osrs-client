package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class Class140 extends Class283 {
   @ObfuscatedName("z")
   final boolean field1883;

   public Class140(boolean var1) {
      this.field1883 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "-359404132"
   )
   int method3147(Class287 var1, Class287 var2) {
      if (Client.field581 == var1.field3628 && var2.field3628 == Client.field581) {
         return this.field1883 ? var1.field3627 - var2.field3627 : var2.field3627 - var1.field3627;
      } else {
         return this.method5308(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3147((Class287)var1, (Class287)var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-1"
   )
   public static boolean method3150(int var0) {
      return (var0 >> 29 & 1) != 0;
   }
}
