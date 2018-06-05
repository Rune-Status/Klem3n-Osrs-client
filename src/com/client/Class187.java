package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class Class187 {
   @ObfuscatedName("ix")
   @ObfuscatedGetter(
      intValue = -83256289
   )
   static int field2372;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "988087011"
   )
   public static int method3812(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ Class182.field2336[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }
}
