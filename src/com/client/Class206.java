package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class Class206 extends Class204 {
   @ObfuscatedName("cx")
   long field2428;
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   public Class206 field2426;
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   public Class206 field2427;

   @ObfuscatedName("cz")
   public void method4101() {
      if (this.field2427 != null) {
         this.field2427.field2426 = this.field2426;
         this.field2426.field2427 = this.field2427;
         this.field2426 = null;
         this.field2427 = null;
      }
   }
}
