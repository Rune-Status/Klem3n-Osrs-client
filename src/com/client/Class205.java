package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class Class205 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   public Class204 field2425 = new Class204();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   Class204 field2424;

   public Class205() {
      this.field2425.field2422 = this.field2425;
      this.field2425.field2423 = this.field2425;
   }

   @ObfuscatedName("z")
   public void method4072() {
      while(true) {
         Class204 var1 = this.field2425.field2422;
         if (var1 == this.field2425) {
            this.field2424 = null;
            return;
         }

         var1.method4064();
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lga;)V"
   )
   public void method4073(Class204 var1) {
      if (var1.field2423 != null) {
         var1.method4064();
      }

      var1.field2423 = this.field2425.field2423;
      var1.field2422 = this.field2425;
      var1.field2423.field2422 = var1;
      var1.field2422.field2423 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lga;)V"
   )
   public void method4074(Class204 var1) {
      if (var1.field2423 != null) {
         var1.method4064();
      }

      var1.field2423 = this.field2425;
      var1.field2422 = this.field2425.field2422;
      var1.field2423.field2422 = var1;
      var1.field2422.field2423 = var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "()Lga;"
   )
   public Class204 method4076() {
      Class204 var1 = this.field2425.field2422;
      if (var1 == this.field2425) {
         return null;
      } else {
         var1.method4064();
         return var1;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "()Lga;"
   )
   public Class204 method4080() {
      Class204 var1 = this.field2425.field2423;
      if (var1 == this.field2425) {
         return null;
      } else {
         var1.method4064();
         return var1;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "()Lga;"
   )
   public Class204 method4098() {
      Class204 var1 = this.field2425.field2422;
      if (var1 == this.field2425) {
         this.field2424 = null;
         return null;
      } else {
         this.field2424 = var1.field2422;
         return var1;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "()Lga;"
   )
   public Class204 method4083() {
      Class204 var1 = this.field2425.field2423;
      if (var1 == this.field2425) {
         this.field2424 = null;
         return null;
      } else {
         this.field2424 = var1.field2423;
         return var1;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Lga;"
   )
   public Class204 method4079() {
      Class204 var1 = this.field2424;
      if (var1 == this.field2425) {
         this.field2424 = null;
         return null;
      } else {
         this.field2424 = var1.field2422;
         return var1;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Lga;"
   )
   public Class204 method4093() {
      Class204 var1 = this.field2424;
      if (var1 == this.field2425) {
         this.field2424 = null;
         return null;
      } else {
         this.field2424 = var1.field2423;
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lga;Lga;)V"
   )
   public static void method4075(Class204 var0, Class204 var1) {
      if (var0.field2423 != null) {
         var0.method4064();
      }

      var0.field2423 = var1.field2423;
      var0.field2422 = var1;
      var0.field2423.field2422 = var0;
      var0.field2422.field2423 = var0;
   }
}
