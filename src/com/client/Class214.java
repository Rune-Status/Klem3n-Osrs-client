package com.client;
import java.util.Iterator;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class Class214 implements Iterator {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lhj;"
   )
   Class215 field2442;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   Class206 field2441;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   Class206 field2443 = null;

   @ObfuscatedSignature(
      signature = "(Lhj;)V"
   )
   Class214(Class215 var1) {
      this.field2442 = var1;
      this.field2441 = this.field2442.field2445.field2426;
      this.field2443 = null;
   }

   public boolean hasNext() {
      return this.field2442.field2445 != this.field2441;
   }

   public Object next() {
      Class206 var1 = this.field2441;
      if (var1 == this.field2442.field2445) {
         var1 = null;
         this.field2441 = null;
      } else {
         this.field2441 = var1.field2426;
      }

      this.field2443 = var1;
      return var1;
   }

   public void remove() {
      if (this.field2443 == null) {
         throw new IllegalStateException();
      } else {
         this.field2443.method4101();
         this.field2443 = null;
      }
   }
}
