package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class Class271 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field3490;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field3487;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3488 = new Class200(64);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3489 = new Class200(50);
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 791272887
   )
   public int field3510;
   @ObfuscatedName("q")
   public String field3491 = "null";
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -254804359
   )
   public int field3497 = 1;
   @ObfuscatedName("i")
   int[] field3493;
   @ObfuscatedName("x")
   int[] field3515;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1114292373
   )
   public int field3519 = -1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1340441257
   )
   public int field3496 = -1;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1278546655
   )
   public int field3486 = -1;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -549599927
   )
   public int field3498 = -1;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1839913521
   )
   public int field3495 = -1;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -420302217
   )
   public int field3502 = -1;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 116081011
   )
   public int field3501 = -1;
   @ObfuscatedName("r")
   short[] field3492;
   @ObfuscatedName("t")
   short[] field3503;
   @ObfuscatedName("o")
   short[] field3514;
   @ObfuscatedName("y")
   short[] field3505;
   @ObfuscatedName("a")
   public String[] field3506 = new String[5];
   @ObfuscatedName("j")
   public boolean field3507 = true;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -152867383
   )
   public int field3508 = -1;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1933108527
   )
   int field3509 = 128;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 680879601
   )
   int field3521 = 128;
   @ObfuscatedName("v")
   public boolean field3511 = false;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1940547865
   )
   int field3512 = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1896315157
   )
   int field3513 = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -543090749
   )
   public int field3494 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1117793583
   )
   public int field3500 = 32;
   @ObfuscatedName("ak")
   public int[] field3516;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1305673173
   )
   int field3499 = -1;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -332297953
   )
   int field3518 = -1;
   @ObfuscatedName("ao")
   public boolean field3504 = true;
   @ObfuscatedName("at")
   public boolean field3520 = true;
   @ObfuscatedName("ai")
   public boolean field3517 = false;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   Class197 field3522;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "392"
   )
   void method5159() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-1539738926"
   )
   void method5186(Class182 var1) {
      while(true) {
         int var2 = var1.method3544();
         if (var2 == 0) {
            return;
         }

         this.method5160(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-1656965495"
   )
   void method5160(Class182 var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.method3544();
         this.field3493 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3493[var4] = var1.method3550();
         }
      } else if (var2 == 2) {
         this.field3491 = var1.method3738();
      } else if (var2 == 12) {
         this.field3497 = var1.method3544();
      } else if (var2 == 13) {
         this.field3519 = var1.method3550();
      } else if (var2 == 14) {
         this.field3498 = var1.method3550();
      } else if (var2 == 15) {
         this.field3496 = var1.method3550();
      } else if (var2 == 16) {
         this.field3486 = var1.method3550();
      } else if (var2 == 17) {
         this.field3498 = var1.method3550();
         this.field3495 = var1.method3550();
         this.field3502 = var1.method3550();
         this.field3501 = var1.method3550();
      } else if (var2 >= 30 && var2 < 35) {
         this.field3506[var2 - 30] = var1.method3738();
         if (this.field3506[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3506[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.method3544();
         this.field3492 = new short[var3];
         this.field3503 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3492[var4] = (short)var1.method3550();
            this.field3503[var4] = (short)var1.method3550();
         }
      } else if (var2 == 41) {
         var3 = var1.method3544();
         this.field3514 = new short[var3];
         this.field3505 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3514[var4] = (short)var1.method3550();
            this.field3505[var4] = (short)var1.method3550();
         }
      } else if (var2 == 60) {
         var3 = var1.method3544();
         this.field3515 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3515[var4] = var1.method3550();
         }
      } else if (var2 == 93) {
         this.field3507 = false;
      } else if (var2 == 95) {
         this.field3508 = var1.method3550();
      } else if (var2 == 97) {
         this.field3509 = var1.method3550();
      } else if (var2 == 98) {
         this.field3521 = var1.method3550();
      } else if (var2 == 99) {
         this.field3511 = true;
      } else if (var2 == 100) {
         this.field3512 = var1.method3681();
      } else if (var2 == 101) {
         this.field3513 = var1.method3681() * 5;
      } else if (var2 == 102) {
         this.field3494 = var1.method3550();
      } else if (var2 == 103) {
         this.field3500 = var1.method3550();
      } else if (var2 != 106 && var2 != 118) {
         if (var2 == 107) {
            this.field3504 = false;
         } else if (var2 == 109) {
            this.field3520 = false;
         } else if (var2 == 111) {
            this.field3517 = true;
         } else if (var2 == 249) {
            this.field3522 = Class39.method691(var1, this.field3522);
         }
      } else {
         this.field3499 = var1.method3550();
         if (this.field3499 == 65535) {
            this.field3499 = -1;
         }

         this.field3518 = var1.method3550();
         if (this.field3518 == 65535) {
            this.field3518 = -1;
         }

         var3 = -1;
         if (var2 == 118) {
            var3 = var1.method3550();
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.method3544();
         this.field3516 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.field3516[var5] = var1.method3550();
            if (this.field3516[var5] == 65535) {
               this.field3516[var5] = -1;
            }
         }

         this.field3516[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ljn;ILjn;II)Ldc;",
      garbageValue = "-639258306"
   )
   public final Class119 method5162(Class273 var1, int var2, Class273 var3, int var4) {
      if (this.field3516 != null) {
         Class271 var12 = this.method5189();
         return var12 == null ? null : var12.method5162(var1, var2, var3, var4);
      } else {
         Class119 var5 = (Class119)field3489.method3989((long)this.field3510);
         if (var5 == null) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.field3493.length; ++var7) {
               if (!field3487.method4696(this.field3493[var7], 0)) {
                  var6 = true;
               }
            }

            if (var6) {
               return null;
            }

            Class113[] var8 = new Class113[this.field3493.length];

            int var9;
            for(var9 = 0; var9 < this.field3493.length; ++var9) {
               var8[var9] = Class113.method2568(field3487, this.field3493[var9], 0);
            }

            Class113 var11;
            if (var8.length == 1) {
               var11 = var8[0];
            } else {
               var11 = new Class113(var8, var8.length);
            }

            if (this.field3492 != null) {
               for(var9 = 0; var9 < this.field3492.length; ++var9) {
                  var11.method2581(this.field3492[var9], this.field3503[var9]);
               }
            }

            if (this.field3514 != null) {
               for(var9 = 0; var9 < this.field3514.length; ++var9) {
                  var11.method2582(this.field3514[var9], this.field3505[var9]);
               }
            }

            var5 = var11.method2589(this.field3512 + 64, this.field3513 + 850, -30, -50, -30);
            field3489.method3983(var5, (long)this.field3510);
         }

         Class119 var10;
         if (var1 != null && var3 != null) {
            var10 = var1.method5221(var5, var2, var3, var4);
         } else if (var1 != null) {
            var10 = var1.method5215(var5, var2);
         } else if (var3 != null) {
            var10 = var3.method5215(var5, var4);
         } else {
            var10 = var5.method2666(true);
         }

         if (this.field3509 != 128 || this.field3521 != 128) {
            var10.method2681(this.field3509, this.field3521, this.field3509);
         }

         return var10;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)Ldb;",
      garbageValue = "-30"
   )
   public final Class113 method5158() {
      if (this.field3516 != null) {
         Class271 var1 = this.method5189();
         return var1 == null ? null : var1.method5158();
      } else if (this.field3515 == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var2 = 0; var2 < this.field3515.length; ++var2) {
            if (!field3487.method4696(this.field3515[var2], 0)) {
               var5 = true;
            }
         }

         if (var5) {
            return null;
         } else {
            Class113[] var6 = new Class113[this.field3515.length];

            for(int var3 = 0; var3 < this.field3515.length; ++var3) {
               var6[var3] = Class113.method2568(field3487, this.field3515[var3], 0);
            }

            Class113 var7;
            if (var6.length == 1) {
               var7 = var6[0];
            } else {
               var7 = new Class113(var6, var6.length);
            }

            int var4;
            if (this.field3492 != null) {
               for(var4 = 0; var4 < this.field3492.length; ++var4) {
                  var7.method2581(this.field3492[var4], this.field3503[var4]);
               }
            }

            if (this.field3514 != null) {
               for(var4 = 0; var4 < this.field3514.length; ++var4) {
                  var7.method2582(this.field3514[var4], this.field3505[var4]);
               }
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)Ljq;",
      garbageValue = "-1834963481"
   )
   public final Class271 method5189() {
      int var1 = -1;
      if (this.field3499 != -1) {
         var1 = Class163.method3389(this.field3499);
      } else if (this.field3518 != -1) {
         var1 = Class225.field2558[this.field3518];
      }

      int var2;
      if (var1 >= 0 && var1 < this.field3516.length - 1) {
         var2 = this.field3516[var1];
      } else {
         var2 = this.field3516[this.field3516.length - 1];
      }

      return var2 != -1 ? Class270.method5157(var2) : null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "981349968"
   )
   public boolean method5165() {
      if (this.field3516 == null) {
         return true;
      } else {
         int var1 = -1;
         if (this.field3499 != -1) {
            var1 = Class163.method3389(this.field3499);
         } else if (this.field3518 != -1) {
            var1 = Class225.field2558[this.field3518];
         }

         if (var1 >= 0 && var1 < this.field3516.length) {
            return this.field3516[var1] != -1;
         } else {
            return this.field3516[this.field3516.length - 1] != -1;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "33823014"
   )
   public int method5166(int var1, int var2) {
      return Class67.method1668(this.field3522, var1, var2);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "37"
   )
   public String method5167(int var1, String var2) {
      return Class17.method171(this.field3522, var1, var2);
   }
}
