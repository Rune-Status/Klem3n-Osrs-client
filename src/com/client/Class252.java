package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public enum Class252 implements Class188 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field3224(2, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field3222(1, 1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field3221(0, 2);

   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -71275381
   )
   public final int field3223;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -199100421
   )
   final int field3225;

   Class252(int var3, int var4) {
      this.field3223 = var3;
      this.field3225 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int vmethod5815() {
      return this.field3225;
   }
}
