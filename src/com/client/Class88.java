package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
public class Class88 extends Class105 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   Class205 field1229 = new Class205();
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   Class205 field1230 = new Class205();
   @ObfuscatedName("l")
   int field1231 = 0;
   @ObfuscatedName("u")
   int field1232 = -1;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ldo;)V"
   )
   public final synchronized void method2032(Class105 var1) {
      this.field1229.method4074(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ldo;)V"
   )
   public final synchronized void method2009(Class105 var1) {
      var1.method4064();
   }

   @ObfuscatedName("s")
   void method2010() {
      if (this.field1231 > 0) {
         for(Class100 var1 = (Class100)this.field1230.method4098(); var1 != null; var1 = (Class100)this.field1230.method4079()) {
            var1.field1338 -= this.field1231;
         }

         this.field1232 -= this.field1231;
         this.field1231 = 0;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lga;Lcz;)V"
   )
   void method2011(Class204 var1, Class100 var2) {
      while(this.field1230.field2425 != var1 && ((Class100)var1).field1338 <= var2.field1338) {
         var1 = var1.field2422;
      }

      Class205.method4075(var2, var1);
      this.field1232 = ((Class100)this.field1230.field2425.field2422).field1338;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lcz;)V"
   )
   void method2008(Class100 var1) {
      var1.method4064();
      var1.method2231();
      Class204 var2 = this.field1230.field2425.field2422;
      if (var2 == this.field1230.field2425) {
         this.field1232 = -1;
      } else {
         this.field1232 = ((Class100)var2).field1338;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected Class105 vmethod4382() {
      return (Class105)this.field1229.method4098();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected Class105 vmethod4389() {
      return (Class105)this.field1229.method4079();
   }

   @ObfuscatedName("x")
   protected int vmethod4395() {
      return 0;
   }

   @ObfuscatedName("e")
   public final synchronized void vmethod4385(int[] var1, int var2, int var3) {
      do {
         if (this.field1232 < 0) {
            this.method2042(var1, var2, var3);
            return;
         }

         if (var3 + this.field1231 < this.field1232) {
            this.field1231 += var3;
            this.method2042(var1, var2, var3);
            return;
         }

         int var4 = this.field1232 - this.field1231;
         this.method2042(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field1231 += var4;
         this.method2010();
         Class100 var5 = (Class100)this.field1230.method4098();
         synchronized(var5) {
            int var7 = var5.method2232();
            if (var7 < 0) {
               var5.field1338 = 0;
               this.method2008(var5);
            } else {
               var5.field1338 = var7;
               this.method2011(var5.field2422, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("p")
   void method2042(int[] var1, int var2, int var3) {
      for(Class105 var4 = (Class105)this.field1229.method4098(); var4 != null; var4 = (Class105)this.field1229.method4079()) {
         var4.method2439(var1, var2, var3);
      }

   }

   @ObfuscatedName("b")
   public final synchronized void vmethod4386(int var1) {
      do {
         if (this.field1232 < 0) {
            this.method2025(var1);
            return;
         }

         if (this.field1231 + var1 < this.field1232) {
            this.field1231 += var1;
            this.method2025(var1);
            return;
         }

         int var2 = this.field1232 - this.field1231;
         this.method2025(var2);
         var1 -= var2;
         this.field1231 += var2;
         this.method2010();
         Class100 var3 = (Class100)this.field1230.method4098();
         synchronized(var3) {
            int var5 = var3.method2232();
            if (var5 < 0) {
               var3.field1338 = 0;
               this.method2008(var3);
            } else {
               var3.field1338 = var5;
               this.method2011(var3.field2422, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("n")
   void method2025(int var1) {
      for(Class105 var2 = (Class105)this.field1229.method4098(); var2 != null; var2 = (Class105)this.field1229.method4079()) {
         var2.vmethod4386(var1);
      }

   }
}
