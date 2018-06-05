package com.client;
import java.util.Iterator;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public final class Class197 implements Iterable {
   @ObfuscatedName("z")
   int field2398;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lga;"
   )
   Class204[] field2397;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   Class204 field2400;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   Class204 field2399;
   @ObfuscatedName("u")
   int field2396 = 0;

   public Class197(int var1) {
      this.field2398 = var1;
      this.field2397 = new Class204[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         Class204 var3 = this.field2397[var2] = new Class204();
         var3.field2422 = var3;
         var3.field2423 = var3;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(J)Lga;"
   )
   public Class204 method3945(long var1) {
      Class204 var3 = this.field2397[(int)(var1 & (long)(this.field2398 - 1))];

      for(this.field2400 = var3.field2422; var3 != this.field2400; this.field2400 = this.field2400.field2422) {
         if (this.field2400.field2421 == var1) {
            Class204 var4 = this.field2400;
            this.field2400 = this.field2400.field2422;
            return var4;
         }
      }

      this.field2400 = null;
      return null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lga;J)V"
   )
   public void method3944(Class204 var1, long var2) {
      if (var1.field2423 != null) {
         var1.method4064();
      }

      Class204 var4 = this.field2397[(int)(var2 & (long)(this.field2398 - 1))];
      var1.field2423 = var4.field2423;
      var1.field2422 = var4;
      var1.field2423.field2422 = var1;
      var1.field2422.field2423 = var1;
      var1.field2421 = var2;
   }

   @ObfuscatedName("s")
   public void method3951() {
      for(int var1 = 0; var1 < this.field2398; ++var1) {
         Class204 var2 = this.field2397[var1];

         while(true) {
            Class204 var3 = var2.field2422;
            if (var3 == var2) {
               break;
            }

            var3.method4064();
         }
      }

      this.field2400 = null;
      this.field2399 = null;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Lga;"
   )
   public Class204 method3955() {
      this.field2396 = 0;
      return this.method3947();
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "()Lga;"
   )
   public Class204 method3947() {
      Class204 var1;
      if (this.field2396 > 0 && this.field2397[this.field2396 - 1] != this.field2399) {
         var1 = this.field2399;
         this.field2399 = var1.field2422;
         return var1;
      } else {
         do {
            if (this.field2396 >= this.field2398) {
               return null;
            }

            var1 = this.field2397[this.field2396++].field2422;
         } while(var1 == this.field2397[this.field2396 - 1]);

         this.field2399 = var1.field2422;
         return var1;
      }
   }

   public Iterator iterator() {
      return new Class210(this);
   }
}
