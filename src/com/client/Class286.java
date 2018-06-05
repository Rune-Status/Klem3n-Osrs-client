package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class Class286 extends Class282 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 399210531
   )
   int field3624;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkx;I)I",
      garbageValue = "2142390446"
   )
   int method5406(Class286 var1) {
      return this.field3624 - var1.field3624;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljx;B)I",
      garbageValue = "97"
   )
   public int vmethod5453(Class282 var1) {
      return this.method5406((Class286)var1);
   }

   public int compareTo(Object var1) {
      return this.method5406((Class286)var1);
   }
}
