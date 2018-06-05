package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public class Class75 {
   @ObfuscatedName("a")
   public static String field1065;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -952252275
   )
   int field1061;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -229344617
   )
   int field1066;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1272979127
   )
   int field1060;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1365690249
   )
   int field1062;
   @ObfuscatedName("u")
   String field1063;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "51"
   )
   public static int method1802(int var0, int var1, int var2) {
      var2 &= 3;
      if (var2 == 0) {
         return var1;
      } else if (var2 == 1) {
         return 7 - var0;
      } else {
         return var2 == 2 ? 7 - var1 : var0;
      }
   }
}
