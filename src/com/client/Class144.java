package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class Class144 extends Class283 {
   @ObfuscatedName("z")
   final boolean field1902;

   public Class144(boolean var1) {
      this.field1902 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;B)I",
      garbageValue = "66"
   )
   int method3175(Class287 var1, Class287 var2) {
      if (var2.field3629 != var1.field3629) {
         return this.field1902 ? var1.field3629 - var2.field3629 : var2.field3629 - var1.field3629;
      } else {
         return this.method5308(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3175((Class287)var1, (Class287)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;B)V",
      garbageValue = "15"
   )
   public static void method3181(Class247 var0, Class247 var1) {
      Class261.field3304 = var0;
      Class261.field3314 = var1;
   }
}
