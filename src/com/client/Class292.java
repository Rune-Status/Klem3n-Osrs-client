package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class Class292 extends Class287 {
   @ObfuscatedName("z")
   boolean field3648;
   @ObfuscatedName("w")
   boolean field3650;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkt;I)I",
      garbageValue = "1391171788"
   )
   int method5452(Class292 var1) {
      if (super.field3628 == Client.field581 && Client.field581 != var1.field3628) {
         return -1;
      } else if (Client.field581 == var1.field3628 && super.field3628 != Client.field581) {
         return 1;
      } else if (super.field3628 != 0 && var1.field3628 == 0) {
         return -1;
      } else if (var1.field3628 != 0 && super.field3628 == 0) {
         return 1;
      } else if (this.field3648 && !var1.field3648) {
         return -1;
      } else if (!this.field3648 && var1.field3648) {
         return 1;
      } else if (this.field3650 && !var1.field3650) {
         return -1;
      } else if (!this.field3650 && var1.field3650) {
         return 1;
      } else {
         return super.field3628 != 0 ? super.field3627 - var1.field3627 : var1.field3627 - super.field3627;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljx;B)I",
      garbageValue = "97"
   )
   public int vmethod5453(Class282 var1) {
      return this.method5452((Class292)var1);
   }

   public int compareTo(Object var1) {
      return this.method5452((Class292)var1);
   }
}
