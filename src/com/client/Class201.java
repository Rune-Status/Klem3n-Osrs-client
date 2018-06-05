package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public final class Class201 {
   @ObfuscatedName("z")
   int field2410;
   @ObfuscatedName("w")
   int field2411;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   Class197 field2412;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhj;"
   )
   Class215 field2413 = new Class215();

   public Class201(int var1, int var2) {
      this.field2410 = var1;
      this.field2411 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      this.field2412 = new Class197(var3);
   }

   @ObfuscatedName("z")
   public Object method3997(long var1) {
      Class212 var3 = (Class212)this.field2412.method3945(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod4137();
         if (var4 == null) {
            var3.method4064();
            var3.method4101();
            this.field2411 += var3.field2439;
            return null;
         } else {
            if (var3.vmethod4136()) {
               Class196 var5 = new Class196(var4, var3.field2439);
               this.field2412.method3944(var5, var3.field2421);
               this.field2413.method4155(var5);
               var5.field2428 = 0L;
               var3.method4064();
               var3.method4101();
            } else {
               this.field2413.method4155(var3);
               var3.field2428 = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedName("w")
   void method3993(long var1) {
      Class212 var3 = (Class212)this.field2412.method3945(var1);
      this.method3996(var3);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lhh;)V"
   )
   void method3996(Class212 var1) {
      if (var1 != null) {
         var1.method4064();
         var1.method4101();
         this.field2411 += var1.field2439;
      }

   }

   @ObfuscatedName("l")
   public void method4007(Object var1, long var2) {
      this.method3998(var1, var2, 1);
   }

   @ObfuscatedName("u")
   public void method3998(Object var1, long var2, int var4) {
      if (var4 > this.field2410) {
         throw new IllegalStateException();
      } else {
         this.method3993(var2);
         this.field2411 -= var4;

         while(this.field2411 < 0) {
            Class212 var5 = (Class212)this.field2413.method4156();
            this.method3996(var5);
         }

         Class196 var6 = new Class196(var1, var4);
         this.field2412.method3944(var6, var2);
         this.field2413.method4155(var6);
         var6.field2428 = 0L;
      }
   }

   @ObfuscatedName("q")
   public void method3999(int var1) {
      for(Class212 var2 = (Class212)this.field2413.method4177(); var2 != null; var2 = (Class212)this.field2413.method4159()) {
         if (var2.vmethod4136()) {
            if (var2.vmethod4137() == null) {
               var2.method4064();
               var2.method4101();
               this.field2411 += var2.field2439;
            }
         } else if (++var2.field2428 > (long)var1) {
            Class207 var3 = new Class207(var2.vmethod4137(), var2.field2439);
            this.field2412.method3944(var3, var2.field2421);
            Class194.method3909(var3, var2);
            var2.method4064();
            var2.method4101();
         }
      }

   }

   @ObfuscatedName("i")
   public void method4006() {
      this.field2413.method4168();
      this.field2412.method3951();
      this.field2411 = this.field2410;
   }
}
