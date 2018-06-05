package com.client;
import java.util.Iterator;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class Class210 implements Iterator {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   Class197 field2437;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   Class204 field2435;
   @ObfuscatedName("s")
   int field2436;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   Class204 field2434 = null;

   @ObfuscatedSignature(
      signature = "(Lgu;)V"
   )
   Class210(Class197 var1) {
      this.field2437 = var1;
      this.method4124();
   }

   @ObfuscatedName("p")
   void method4124() {
      this.field2435 = this.field2437.field2397[0].field2422;
      this.field2436 = 1;
      this.field2434 = null;
   }

   public boolean hasNext() {
      if (this.field2437.field2397[this.field2436 - 1] != this.field2435) {
         return true;
      } else {
         while(this.field2436 < this.field2437.field2398) {
            if (this.field2437.field2397[this.field2436++].field2422 != this.field2437.field2397[this.field2436 - 1]) {
               this.field2435 = this.field2437.field2397[this.field2436 - 1].field2422;
               return true;
            }

            this.field2435 = this.field2437.field2397[this.field2436 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if (this.field2434 == null) {
         throw new IllegalStateException();
      } else {
         this.field2434.method4064();
         this.field2434 = null;
      }
   }

   public Object next() {
      Class204 var1;
      if (this.field2437.field2397[this.field2436 - 1] != this.field2435) {
         var1 = this.field2435;
         this.field2435 = var1.field2422;
         this.field2434 = var1;
         return var1;
      } else {
         do {
            if (this.field2436 >= this.field2437.field2398) {
               return null;
            }

            var1 = this.field2437.field2397[this.field2436++].field2422;
         } while(var1 == this.field2437.field2397[this.field2436 - 1]);

         this.field2435 = var1.field2422;
         this.field2434 = var1;
         return var1;
      }
   }
}
