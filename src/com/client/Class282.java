package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
public class Class282 implements Comparable {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   Class291 field3610;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   Class291 field3611;

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)Lkm;",
      garbageValue = "-1680166277"
   )
   public Class291 method5287() {
      return this.field3610;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "109"
   )
   public String method5288() {
      return this.field3610 == null ? "" : this.field3610.method5447();
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-92"
   )
   public String method5289() {
      return this.field3611 == null ? "" : this.field3611.method5447();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Lkm;Lkm;I)V",
      garbageValue = "224434676"
   )
   void method5290(Class291 var1, Class291 var2) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.field3610 = var1;
         this.field3611 = var2;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljx;B)I",
      garbageValue = "97"
   )
   public int vmethod5453(Class282 var1) {
      return this.field3610.method5435(var1.field3610);
   }

   public int compareTo(Object var1) {
      return this.vmethod5453((Class282)var1);
   }
}
