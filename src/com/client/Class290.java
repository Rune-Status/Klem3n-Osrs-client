package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class Class290 extends Class285 {
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = -2042738183
   )
   static int field3636;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   final Class322 field3635;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -720372311
   )
   int field3637 = 1;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lhp;"
   )
   public Class208 field3639 = new Class208();

   @ObfuscatedSignature(
      signature = "(Llm;)V"
   )
   public Class290(Class322 var1) {
      super(400);
      this.field3635 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Ljx;",
      garbageValue = "2139940378"
   )
   Class282 vmethod5461() {
      return new Class292();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)[Ljx;",
      garbageValue = "828432673"
   )
   Class282[] vmethod5462(int var1) {
      return new Class292[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lkm;ZI)Z",
      garbageValue = "1240127676"
   )
   public boolean method5423(Class291 var1, boolean var2) {
      Class292 var3 = (Class292)this.method5330(var1);
      if (var3 == null) {
         return false;
      } else {
         return !var2 || var3.field3628 != 0;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "1284102001"
   )
   public void method5424(Class182 var1, int var2) {
      while(true) {
         if (var1.field2339 < var2) {
            boolean var3 = var1.method3544() == 1;
            Class291 var4 = new Class291(var1.method3738(), this.field3635);
            Class291 var5 = new Class291(var1.method3738(), this.field3635);
            int var6 = var1.method3550();
            int var7 = var1.method3544();
            int var8 = var1.method3544();
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = (var8 & 1) != 0;
            if (var6 > 0) {
               var1.method3738();
               var1.method3544();
               var1.method3671();
            }

            var1.method3738();
            if (var4 != null && var4.method5441()) {
               Class292 var11 = (Class292)this.method5331(var4);
               if (var3) {
                  Class292 var12 = (Class292)this.method5331(var5);
                  if (var12 != null && var12 != var11) {
                     if (var11 != null) {
                        this.method5334(var12);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.method5338(var11, var4, var5);
                  if (var6 != var11.field3628) {
                     boolean var14 = true;

                     for(Class294 var13 = (Class294)this.field3639.method4111(); var13 != null; var13 = (Class294)this.field3639.method4114()) {
                        if (var13.field3662.equals(var4)) {
                           if (var6 != 0 && var13.field3664 == 0) {
                              var13.method4121();
                              var14 = false;
                           } else if (var6 == 0 && var13.field3664 != 0) {
                              var13.method4121();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.field3639.method4112(new Class294(var4, var6));
                     }
                  }
               } else {
                  if (this.method5327() >= 400) {
                     continue;
                  }

                  var11 = (Class292)this.method5335(var4, var5);
               }

               if (var6 != var11.field3628) {
                  var11.field3627 = ++this.field3637 - 1;
                  if (var11.field3628 == -1 && var6 == 0) {
                     var11.field3627 = -(var11.field3627 * -1772374531) * -745943211;
                  }

                  var11.field3628 = var6;
               }

               var11.field3629 = var7;
               var11.field3648 = var9;
               var11.field3650 = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method5337();
         return;
      }
   }
}
