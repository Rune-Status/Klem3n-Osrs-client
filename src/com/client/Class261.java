package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public class Class261 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field3304;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static Class247 field3314;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3305 = new Class200(64);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3306 = new Class200(64);
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1290574683
   )
   public int field3317;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 293385999
   )
   public int field3310 = 255;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 497866573
   )
   public int field3307 = 255;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1257044637
   )
   public int field3312 = -1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1902915669
   )
   public int field3308 = 1;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1500429693
   )
   public int field3313 = 70;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1619382661
   )
   int field3315 = -1;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1784458549
   )
   int field3316 = -1;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 555187831
   )
   public int field3311 = 30;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -835956497
   )
   public int field3318 = 0;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "2067333055"
   )
   public void method4915(Class182 var1) {
      while(true) {
         int var2 = var1.method3544();
         if (var2 == 0) {
            return;
         }

         this.method4916(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-2130142641"
   )
   void method4916(Class182 var1, int var2) {
      if (var2 == 1) {
         var1.method3550();
      } else if (var2 == 2) {
         this.field3310 = var1.method3544();
      } else if (var2 == 3) {
         this.field3307 = var1.method3544();
      } else if (var2 == 4) {
         this.field3312 = 0;
      } else if (var2 == 5) {
         this.field3313 = var1.method3550();
      } else if (var2 == 6) {
         var1.method3544();
      } else if (var2 == 7) {
         this.field3315 = var1.method3546();
      } else if (var2 == 8) {
         this.field3316 = var1.method3546();
      } else if (var2 == 11) {
         this.field3312 = var1.method3550();
      } else if (var2 == 14) {
         this.field3311 = var1.method3544();
      } else if (var2 == 15) {
         this.field3318 = var1.method3544();
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "-1987129787"
   )
   public Class318 method4917() {
      if (this.field3315 < 0) {
         return null;
      } else {
         Class318 var1 = (Class318)field3306.method3989((long)this.field3315);
         if (var1 != null) {
            return var1;
         } else {
            var1 = Class229.method4499(field3314, this.field3315, 0);
            if (var1 != null) {
               field3306.method3983(var1, (long)this.field3315);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "879523324"
   )
   public Class318 method4918() {
      if (this.field3316 < 0) {
         return null;
      } else {
         Class318 var1 = (Class318)field3306.method3989((long)this.field3316);
         if (var1 != null) {
            return var1;
         } else {
            var1 = Class229.method4499(field3314, this.field3316, 0);
            if (var1 != null) {
               field3306.method3983(var1, (long)this.field3316);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "97"
   )
   public static boolean method4931(int var0) {
      if (Class175.field2271[var0]) {
         return true;
      } else if (!Class230.field2729.method4707(var0)) {
         return false;
      } else {
         int var1 = Class230.field2729.method4636(var0);
         if (var1 == 0) {
            Class175.field2271[var0] = true;
            return true;
         } else {
            if (Class42.field366[var0] == null) {
               Class42.field366[var0] = new Class230[var1];
            }

            for(int var2 = 0; var2 < var1; ++var2) {
               if (Class42.field366[var0][var2] == null) {
                  byte[] var3 = Class230.field2729.method4625(var0, var2);
                  if (var3 != null) {
                     Class42.field366[var0][var2] = new Class230();
                     Class42.field366[var0][var2].field2691 = var2 + (var0 << 16);
                     if (var3[0] == -1) {
                        Class42.field366[var0][var2].method4532(new Class182(var3));
                     } else {
                        Class42.field366[var0][var2].method4549(new Class182(var3));
                     }
                  }
               }
            }

            Class175.field2271[var0] = true;
            return true;
         }
      }
   }
}
