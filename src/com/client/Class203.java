package com.client;
import java.util.Iterator;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class Class203 implements Iterable {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   Class204 field2419 = new Class204();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   Class204 field2420;

   public Class203() {
      this.field2419.field2422 = this.field2419;
      this.field2419.field2423 = this.field2419;
   }

   @ObfuscatedName("z")
   public void method4030() {
      while(this.field2419.field2422 != this.field2419) {
         this.field2419.field2422.method4064();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lga;)V"
   )
   public void method4031(Class204 var1) {
      if (var1.field2423 != null) {
         var1.method4064();
      }

      var1.field2423 = this.field2419.field2423;
      var1.field2422 = this.field2419;
      var1.field2423.field2422 = var1;
      var1.field2422.field2423 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lga;)V"
   )
   public void method4038(Class204 var1) {
      if (var1.field2423 != null) {
         var1.method4064();
      }

      var1.field2423 = this.field2419;
      var1.field2422 = this.field2419.field2422;
      var1.field2423.field2422 = var1;
      var1.field2422.field2423 = var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "()Lga;"
   )
   public Class204 method4048() {
      return this.method4034((Class204)null);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lga;)Lga;"
   )
   Class204 method4034(Class204 var1) {
      Class204 var2;
      if (var1 == null) {
         var2 = this.field2419.field2422;
      } else {
         var2 = var1;
      }

      if (var2 == this.field2419) {
         this.field2420 = null;
         return null;
      } else {
         this.field2420 = var2.field2422;
         return var2;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "()Lga;"
   )
   public Class204 method4033() {
      Class204 var1 = this.field2420;
      if (var1 == this.field2419) {
         this.field2420 = null;
         return null;
      } else {
         this.field2420 = var1.field2422;
         return var1;
      }
   }

   @ObfuscatedName("x")
   public boolean method4043() {
      return this.field2419.field2422 == this.field2419;
   }

   public Iterator iterator() {
      return new Class199(this);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lga;Lga;)V"
   )
   public static void method4036(Class204 var0, Class204 var1) {
      if (var0.field2423 != null) {
         var0.method4064();
      }

      var0.field2423 = var1;
      var0.field2422 = var1.field2422;
      var0.field2423.field2422 = var0;
      var0.field2422.field2423 = var0;
   }
}
