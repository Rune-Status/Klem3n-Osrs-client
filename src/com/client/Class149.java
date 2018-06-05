package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class Class149 extends Class160 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = 8091709939901434705L
   )
   long field1918 = System.nanoTime();

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2021286604"
   )
   public void vmethod3330() {
      this.field1918 = System.nanoTime();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "2142370282"
   )
   public int vmethod3331(int var1, int var2) {
      long var3 = 1000000L * (long)var2;
      long var5 = this.field1918 - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      Class63.method1539(var5 / 1000000L);
      long var7 = System.nanoTime();

      int var9;
      for(var9 = 0; var9 < 10 && (var9 < 1 || this.field1918 < var7); this.field1918 += 1000000L * (long)var1) {
         ++var9;
      }

      if (this.field1918 < var7) {
         this.field1918 = var7;
      }

      return var9;
   }
}
