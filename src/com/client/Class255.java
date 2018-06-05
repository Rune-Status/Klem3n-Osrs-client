package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class Class255 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field3237;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lie;"
   )
   public static Class255[] field3246;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 238787811
   )
   public static int field3236;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static Class200 field3251 = new Class200(256);
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -38826489
   )
   public final int field3238;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1319997115
   )
   public int field3239 = -1;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 437595613
   )
   int field3234 = -1;
   @ObfuscatedName("i")
   public String field3241;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 984232407
   )
   public int field3242;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1009560253
   )
   public int field3243 = 0;
   @ObfuscatedName("b")
   public String[] field3244 = new String[5];
   @ObfuscatedName("n")
   public String field3255;
   @ObfuscatedName("f")
   int[] field3245;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 257365583
   )
   int field3247 = Integer.MAX_VALUE;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -164184983
   )
   int field3235 = Integer.MAX_VALUE;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -571209577
   )
   int field3249 = Integer.MIN_VALUE;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1516283323
   )
   int field3248 = Integer.MIN_VALUE;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Ljd;"
   )
   public Class270 field3252;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   public Class252 field3253;
   @ObfuscatedName("a")
   int[] field3250;
   @ObfuscatedName("j")
   byte[] field3254;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1537771069
   )
   public int field3240;

   public Class255(int var1) {
      this.field3252 = Class270.field3479;
      this.field3253 = Class252.field3222;
      this.field3240 = -1;
      this.field3238 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "248610403"
   )
   public void method4816(Class182 var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method4817(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;IS)V",
      garbageValue = "4032"
   )
   void method4817(Class182 var1, int var2) {
      if (var2 == 1) {
         this.field3239 = var1.method3546();
      } else if (var2 == 2) {
         this.field3234 = var1.method3546();
      } else if (var2 == 3) {
         this.field3241 = var1.method3738();
      } else if (var2 == 4) {
         this.field3242 = var1.method3552();
      } else if (var2 == 5) {
         var1.method3552();
      } else if (var2 == 6) {
         this.field3243 = var1.readUnsignedByte();
      } else {
         int var3;
         if (var2 == 7) {
            var3 = var1.readUnsignedByte();
            if ((var3 & 1) == 0) {
               ;
            }

            if ((var3 & 2) == 2) {
               ;
            }
         } else if (var2 == 8) {
            var1.readUnsignedByte();
         } else if (var2 >= 10 && var2 <= 14) {
            this.field3244[var2 - 10] = var1.method3738();
         } else if (var2 == 15) {
            var3 = var1.readUnsignedByte();
            this.field3245 = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.field3245[var4] = var1.method3551();
            }

            var1.method3671();
            var4 = var1.readUnsignedByte();
            this.field3250 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field3250.length; ++var5) {
               this.field3250[var5] = var1.method3671();
            }

            this.field3254 = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.field3254[var5] = var1.readByte();
            }
         } else if (var2 != 16) {
            if (var2 == 17) {
               this.field3255 = var1.method3738();
            } else if (var2 == 18) {
               var1.method3546();
            } else if (var2 == 19) {
               this.field3240 = var1.readUnsignedShort();
            } else if (var2 == 21) {
               var1.method3671();
            } else if (var2 == 22) {
               var1.method3671();
            } else if (var2 == 23) {
               var1.readUnsignedByte();
               var1.readUnsignedByte();
               var1.readUnsignedByte();
            } else if (var2 == 24) {
               var1.method3551();
               var1.method3551();
            } else if (var2 == 25) {
               var1.method3546();
            } else if (var2 == 28) {
               var1.readUnsignedByte();
            } else if (var2 == 29) {
               Class270[] var6 = new Class270[]{Class270.field3479, Class270.field3484, Class270.field3481};
               this.field3252 = (Class270)Class76.method1803(var6, var1.readUnsignedByte());
            } else if (var2 == 30) {
               Class252[] var7 = new Class252[]{Class252.field3221, Class252.field3222, Class252.field3224};
               this.field3253 = (Class252)Class76.method1803(var7, var1.readUnsignedByte());
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1083458707"
   )
   public void method4828() {
      if (this.field3245 != null) {
         for(int var1 = 0; var1 < this.field3245.length; var1 += 2) {
            if (this.field3245[var1] < this.field3247) {
               this.field3247 = this.field3245[var1];
            } else if (this.field3245[var1] > this.field3249) {
               this.field3249 = this.field3245[var1];
            }

            if (this.field3245[var1 + 1] < this.field3235) {
               this.field3235 = this.field3245[var1 + 1];
            } else if (this.field3245[var1 + 1] > this.field3248) {
               this.field3248 = this.field3245[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ZB)Lll;",
      garbageValue = "-62"
   )
   public Class318 method4815(boolean var1) {
      int var2 = this.field3239;
      return this.method4820(var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)Lll;",
      garbageValue = "-1422561199"
   )
   Class318 method4820(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         Class318 var2 = (Class318)field3251.method3989((long)var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = Class229.method4499(field3237, var1, 0);
            if (var2 != null) {
               field3251.method3983(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-51"
   )
   public int method4821() {
      return this.field3238;
   }
}
