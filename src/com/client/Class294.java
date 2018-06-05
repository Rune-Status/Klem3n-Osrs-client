package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public class Class294 extends Class209 {
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 796810475
   )
   public int field3665 = (int)(Class182.method3547() / 1000L);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   public Class291 field3662;
   @ObfuscatedName("u")
   public short field3664;

   @ObfuscatedSignature(
      signature = "(Lkm;I)V"
   )
   Class294(Class291 var1, int var2) {
      this.field3662 = var1;
      this.field3664 = (short)var2;
   }
}
