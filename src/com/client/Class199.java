package com.client;
import java.util.Iterator;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class Class199 implements Iterator {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   Class203 field2404;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   Class204 field2403;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   Class204 field2402 = null;

   @ObfuscatedSignature(
      signature = "(Lgy;)V"
   )
   Class199(Class203 var1) {
      this.field2404 = var1;
      this.field2403 = this.field2404.field2419.field2422;
      this.field2402 = null;
   }

   public Object next() {
      Class204 var1 = this.field2403;
      if (var1 == this.field2404.field2419) {
         var1 = null;
         this.field2403 = null;
      } else {
         this.field2403 = var1.field2422;
      }

      this.field2402 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field2404.field2419 != this.field2403;
   }

   public void remove() {
      if (this.field2402 == null) {
         throw new IllegalStateException();
      } else {
         this.field2402.method4064();
         this.field2402 = null;
      }
   }
}
