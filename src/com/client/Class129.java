package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
public class Class129 {
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -894344701
   )
   int field1793;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -860995101
   )
   int field1794;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1876022181
   )
   int field1795;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1923991029"
   )
   public static boolean method3073(int var0) {
      return var0 >= Class233.field2773.field2777 && var0 <= Class233.field2757.field2777 || var0 == Class233.field2758.field2777;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;I)V",
      garbageValue = "1157214039"
   )
   public static void method3072(Class247 var0) {
      Class256.field3258 = var0;
   }
}
