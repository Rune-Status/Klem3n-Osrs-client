package com.client;
import java.util.Iterator;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class Class215 implements Iterable {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   public Class206 field2445 = new Class206();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   Class206 field2444;

   public Class215() {
      this.field2445.field2426 = this.field2445;
      this.field2445.field2427 = this.field2445;
   }

   @ObfuscatedName("z")
   public void method4168() {
      while(this.field2445.field2426 != this.field2445) {
         this.field2445.field2426.method4101();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgw;)V"
   )
   public void method4155(Class206 var1) {
      if (var1.field2427 != null) {
         var1.method4101();
      }

      var1.field2427 = this.field2445.field2427;
      var1.field2426 = this.field2445;
      var1.field2427.field2426 = var1;
      var1.field2426.field2427 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   Class206 method4156() {
      Class206 var1 = this.field2445.field2426;
      if (var1 == this.field2445) {
         return null;
      } else {
         var1.method4101();
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   Class206 method4177() {
      return this.method4160((Class206)null);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lgw;)Lgw;"
   )
   Class206 method4160(Class206 var1) {
      Class206 var2;
      if (var1 == null) {
         var2 = this.field2445.field2426;
      } else {
         var2 = var1;
      }

      if (var2 == this.field2445) {
         this.field2444 = null;
         return null;
      } else {
         this.field2444 = var2.field2426;
         return var2;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   Class206 method4159() {
      Class206 var1 = this.field2444;
      if (var1 == this.field2445) {
         this.field2444 = null;
         return null;
      } else {
         this.field2444 = var1.field2426;
         return var1;
      }
   }

   public Iterator iterator() {
      return new Class214(this);
   }
}
