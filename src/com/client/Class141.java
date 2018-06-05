package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class Class141 extends Class283 {
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 325680983
   )
   static int field1885;
   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Class230 field1888;
   @ObfuscatedName("z")
   final boolean field1886;

   public Class141(boolean var1) {
      this.field1886 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "-2110971659"
   )
   int method3153(Class287 var1, Class287 var2) {
      if (var1.field3628 != 0 && var2.field3628 != 0) {
         return this.field1886 ? var1.field3627 - var2.field3627 : var2.field3627 - var1.field3627;
      } else {
         return this.method5308(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3153((Class287)var1, (Class287)var2);
   }
}
