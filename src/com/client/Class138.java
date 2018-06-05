package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class Class138 extends Class283 {
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field1871;
   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      signature = "Lbu;"
   )
   static Class60 field1876;
   @ObfuscatedName("z")
   final boolean field1872;

   public Class138(boolean var1) {
      this.field1872 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "-1072609889"
   )
   int method3128(Class287 var1, Class287 var2) {
      if (Client.field581 == var1.field3628 && var2.field3628 == Client.field581) {
         return this.field1872 ? var1.method5287().method5435(var2.method5287()) : var2.method5287().method5435(var1.method5287());
      } else {
         return this.method5308(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3128((Class287)var1, (Class287)var2);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;IB)I",
      garbageValue = "-22"
   )
   public static int method3137(CharSequence var0, int var1) {
      return Class68.method1693(var0, var1, true);
   }
}
