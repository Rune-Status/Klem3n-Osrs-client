package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public class Class208 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lhk;"
   )
   Class209 field2431 = new Class209();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhk;"
   )
   Class209 field2430;

   public Class208() {
      this.field2431.field2432 = this.field2431;
      this.field2431.field2433 = this.field2431;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lhk;)V"
   )
   public void method4112(Class209 var1) {
      if (var1.field2433 != null) {
         var1.method4121();
      }

      var1.field2433 = this.field2431.field2433;
      var1.field2432 = this.field2431;
      var1.field2433.field2432 = var1;
      var1.field2432.field2433 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "()Lhk;"
   )
   public Class209 method4111() {
      Class209 var1 = this.field2431.field2432;
      if (var1 == this.field2431) {
         this.field2430 = null;
         return null;
      } else {
         this.field2430 = var1.field2432;
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lhk;"
   )
   public Class209 method4114() {
      Class209 var1 = this.field2430;
      if (var1 == this.field2431) {
         this.field2430 = null;
         return null;
      } else {
         this.field2430 = var1.field2432;
         return var1;
      }
   }
}
