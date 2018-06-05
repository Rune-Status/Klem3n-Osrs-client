package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public final class Class194 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   Class206 field2393 = new Class206();

   public Class194() {
      this.field2393.field2426 = this.field2393;
      this.field2393.field2427 = this.field2393;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgw;)V"
   )
   public void method3910(Class206 var1) {
      if (var1.field2427 != null) {
         var1.method4101();
      }

      var1.field2427 = this.field2393.field2427;
      var1.field2426 = this.field2393;
      var1.field2427.field2426 = var1;
      var1.field2426.field2427 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgw;)V"
   )
   public void method3908(Class206 var1) {
      if (var1.field2427 != null) {
         var1.method4101();
      }

      var1.field2427 = this.field2393;
      var1.field2426 = this.field2393.field2426;
      var1.field2427.field2426 = var1;
      var1.field2426.field2427 = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   Class206 method3922() {
      Class206 var1 = this.field2393.field2426;
      if (var1 == this.field2393) {
         return null;
      } else {
         var1.method4101();
         return var1;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "()Lgw;"
   )
   public Class206 method3932() {
      Class206 var1 = this.field2393.field2426;
      return var1 == this.field2393 ? null : var1;
   }

   @ObfuscatedName("q")
   void method3912() {
      while(true) {
         Class206 var1 = this.field2393.field2426;
         if (var1 == this.field2393) {
            return;
         }

         var1.method4101();
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgw;Lgw;)V"
   )
   static void method3909(Class206 var0, Class206 var1) {
      if (var0.field2427 != null) {
         var0.method4101();
      }

      var0.field2427 = var1;
      var0.field2426 = var1.field2426;
      var0.field2427.field2426 = var0;
      var0.field2426.field2427 = var0;
   }
}
