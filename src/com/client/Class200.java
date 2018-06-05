package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public final class Class200 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   Class206 field2409 = new Class206();
   @ObfuscatedName("w")
   int field2406;
   @ObfuscatedName("s")
   int field2407;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   Class202 field2408;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lgo;"
   )
   Class194 field2405 = new Class194();

   public Class200(int var1) {
      this.field2406 = var1;
      this.field2407 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.field2408 = new Class202(var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(J)Lgw;"
   )
   public Class206 method3989(long var1) {
      Class206 var3 = (Class206)this.field2408.method4020(var1);
      if (var3 != null) {
         this.field2405.method3910(var3);
      }

      return var3;
   }

   @ObfuscatedName("w")
   public void method3982(long var1) {
      Class206 var3 = (Class206)this.field2408.method4020(var1);
      if (var3 != null) {
         var3.method4064();
         var3.method4101();
         ++this.field2407;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgw;J)V"
   )
   public void method3983(Class206 var1, long var2) {
      if (this.field2407 == 0) {
         Class206 var4 = this.field2405.method3922();
         var4.method4064();
         var4.method4101();
         if (var4 == this.field2409) {
            var4 = this.field2405.method3922();
            var4.method4064();
            var4.method4101();
         }
      } else {
         --this.field2407;
      }

      this.field2408.method4016(var1, var2);
      this.field2405.method3910(var1);
   }

   @ObfuscatedName("l")
   public void method3984() {
      this.field2405.method3912();
      this.field2408.method4017();
      this.field2409 = new Class206();
      this.field2407 = this.field2406;
   }
}
