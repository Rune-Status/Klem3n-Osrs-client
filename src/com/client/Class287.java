package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class Class287 extends Class282 {
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1986288725
   )
   public int field3628 = -1;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -745943211
   )
   public int field3627;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1388711563
   )
   public int field3629;

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-414916451"
   )
   void method5412(int var1, int var2) {
      this.field3628 = var1;
      this.field3627 = var2;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1524390251"
   )
   public int method5414() {
      return this.field3628;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-34"
   )
   public boolean method5415() {
      return this.field3628 > 0;
   }
}
