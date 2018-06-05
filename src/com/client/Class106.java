package com.client;
import com.conf.mapping.ObfuscatedName;

@ObfuscatedName("dz")
public class Class106 {
   @ObfuscatedName("z")
   int field1388;
   @ObfuscatedName("w")
   int field1387;
   @ObfuscatedName("s")
   int[] field1389;
   @ObfuscatedName("l")
   int[] field1386;

   Class106() {
      Class92.method2108(16);
      this.field1388 = Class92.method2093() != 0 ? Class92.method2108(4) + 1 : 1;
      if (Class92.method2093() != 0) {
         Class92.method2108(8);
      }

      Class92.method2108(2);
      if (this.field1388 > 1) {
         this.field1387 = Class92.method2108(4);
      }

      this.field1389 = new int[this.field1388];
      this.field1386 = new int[this.field1388];

      for(int var1 = 0; var1 < this.field1388; ++var1) {
         Class92.method2108(8);
         this.field1389[var1] = Class92.method2108(8);
         this.field1386[var1] = Class92.method2108(8);
      }

   }
}
