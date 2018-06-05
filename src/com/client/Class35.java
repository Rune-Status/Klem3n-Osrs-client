package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
public class Class35 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 543504023
   )
   int field303;
   @ObfuscatedName("w")
   byte[][][] field304;

   Class35(int var1) {
      this.field303 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "600681554"
   )
   void method606(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.field303 != 0 && this.field304 != null) {
         var8 = this.method590(var8, var7);
         var7 = this.method591(var7);
         Class314.method5733(var1, var2, var5, var6, var3, var4, this.field304[var7 - 1][var8], this.field303);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "103"
   )
   int method590(int var1, int var2) {
      if (var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1021725892"
   )
   int method591(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1956759512"
   )
   void method592() {
      if (this.field304 == null) {
         this.field304 = new byte[8][4][];
         this.method593();
         this.method625();
         this.method607();
         this.method596();
         this.method612();
         this.method598();
         this.method629();
         this.method595();
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-515491785"
   )
   void method593() {
      byte[] var1 = new byte[this.field303 * this.field303];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[0][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[0][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[0][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[0][3] = var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2050739130"
   )
   void method625() {
      byte[] var1 = new byte[this.field303 * this.field303];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[1][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var2 >= 0 && var2 < var1.length) {
               if (var4 >= var3 << 1) {
                  var1[var2] = -1;
               }

               ++var2;
            } else {
               ++var2;
            }
         }
      }

      this.field304[1][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[1][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[1][3] = var1;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   void method607() {
      byte[] var1 = new byte[this.field303 * this.field303];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[2][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[2][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[2][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[2][3] = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1650929653"
   )
   void method596() {
      byte[] var1 = new byte[this.field303 * this.field303];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[3][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[3][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[3][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[3][3] = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   void method612() {
      byte[] var1 = new byte[this.field303 * this.field303];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[4][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[4][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[4][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var2 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field304[4][3] = var1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1963710771"
   )
   void method598() {
      byte[] var1 = new byte[this.field303 * this.field303];
      boolean var2 = false;
      var1 = new byte[this.field303 * this.field303];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 <= this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[5][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var3 <= this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[5][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 >= this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[5][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var3 >= this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[5][3] = var1;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2053571695"
   )
   void method629() {
      byte[] var1 = new byte[this.field303 * this.field303];
      boolean var2 = false;
      var1 = new byte[this.field303 * this.field303];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 <= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[6][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 <= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[6][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[6][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[6][3] = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "335208223"
   )
   void method595() {
      byte[] var1 = new byte[this.field303 * this.field303];
      boolean var2 = false;
      var1 = new byte[this.field303 * this.field303];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 >= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[7][0] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field303; ++var4) {
            if (var4 >= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[7][1] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = this.field303 - 1; var3 >= 0; --var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[7][2] = var1;
      var1 = new byte[this.field303 * this.field303];
      var5 = 0;

      for(var3 = 0; var3 < this.field303; ++var3) {
         for(var4 = this.field303 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 - this.field303 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field304[7][3] = var1;
   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "(Lba;B)V",
      garbageValue = "-96"
   )
   static final void method609(Class63 var0) {
      var0.field900 = var0.field893;
      if (var0.field909 == 0) {
         var0.field923 = 0;
      } else {
         if (var0.field903 != -1 && var0.field906 == 0) {
            Class273 var1 = Class3.method25(var0.field903);
            if (var0.field930 > 0 && var1.field3551 == 0) {
               ++var0.field923;
               return;
            }

            if (var0.field930 <= 0 && var1.field3535 == 0) {
               ++var0.field923;
               return;
            }
         }

         int var10 = var0.field931;
         int var2 = var0.field881;
         int var3 = var0.field922[var0.field909 - 1] * 128 + var0.field874 * 64;
         int var4 = var0.field872[var0.field909 - 1] * 128 + var0.field874 * 64;
         if (var10 < var3) {
            if (var2 < var4) {
               var0.field926 = 1280;
            } else if (var2 > var4) {
               var0.field926 = 1792;
            } else {
               var0.field926 = 1536;
            }
         } else if (var10 > var3) {
            if (var2 < var4) {
               var0.field926 = 768;
            } else if (var2 > var4) {
               var0.field926 = 256;
            } else {
               var0.field926 = 512;
            }
         } else if (var2 < var4) {
            var0.field926 = 1024;
         } else if (var2 > var4) {
            var0.field926 = 0;
         }

         byte var5 = var0.field928[var0.field909 - 1];
         if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
            int var6 = var0.field926 - var0.field905 & 2047;
            if (var6 > 1024) {
               var6 -= 2048;
            }

            int var7 = var0.field880;
            if (var6 >= -256 && var6 <= 256) {
               var7 = var0.field899;
            } else if (var6 >= 256 && var6 < 768) {
               var7 = var0.field882;
            } else if (var6 >= -768 && var6 <= -256) {
               var7 = var0.field870;
            }

            if (var7 == -1) {
               var7 = var0.field899;
            }

            var0.field900 = var7;
            int var8 = 4;
            boolean var9 = true;
            if (var0 instanceof Class72) {
               var9 = ((Class72)var0).field1037.field3520;
            }

            if (var9) {
               if (var0.field926 != var0.field905 && var0.field897 == -1 && var0.field924 != 0) {
                  var8 = 2;
               }

               if (var0.field909 > 2) {
                  var8 = 6;
               }

               if (var0.field909 > 3) {
                  var8 = 8;
               }

               if (var0.field923 > 0 && var0.field909 > 1) {
                  var8 = 8;
                  --var0.field923;
               }
            } else {
               if (var0.field909 > 1) {
                  var8 = 6;
               }

               if (var0.field909 > 2) {
                  var8 = 8;
               }

               if (var0.field923 > 0 && var0.field909 > 1) {
                  var8 = 8;
                  --var0.field923;
               }
            }

            if (var5 == 2) {
               var8 <<= 1;
            }

            if (var8 >= 8 && var0.field899 == var0.field900 && var0.field883 != -1) {
               var0.field900 = var0.field883;
            }

            if (var10 != var3 || var2 != var4) {
               if (var10 < var3) {
                  var0.field931 += var8;
                  if (var0.field931 > var3) {
                     var0.field931 = var3;
                  }
               } else if (var10 > var3) {
                  var0.field931 -= var8;
                  if (var0.field931 < var3) {
                     var0.field931 = var3;
                  }
               }

               if (var2 < var4) {
                  var0.field881 += var8;
                  if (var0.field881 > var4) {
                     var0.field881 = var4;
                  }
               } else if (var2 > var4) {
                  var0.field881 -= var8;
                  if (var0.field881 < var4) {
                     var0.field881 = var4;
                  }
               }
            }

            if (var3 == var0.field931 && var4 == var0.field881) {
               --var0.field909;
               if (var0.field930 > 0) {
                  --var0.field930;
               }
            }

         } else {
            var0.field931 = var3;
            var0.field881 = var4;
            --var0.field909;
            if (var0.field930 > 0) {
               --var0.field930;
            }

         }
      }
   }

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      signature = "(Lba;IIIIIB)V",
      garbageValue = "13"
   )
   static final void method628(Class63 var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 != null && var0.vmethod1786()) {
         if (var0 instanceof Class72) {
            Class271 var6 = ((Class72)var0).field1037;
            if (var6.field3516 != null) {
               var6 = var6.method5189();
            }

            if (var6 == null) {
               return;
            }
         }

         int var75 = Class81.field1167;
         int[] var7 = Class81.field1159;
         byte var8 = 0;
         Class60 var10;
         if (var1 < var75 && var0.field889 == Client.field591) {
            var10 = (Class60)var0;
            boolean var9;
            if (Client.field658 == 0) {
               var9 = false;
            } else {
               boolean var77;
               if (var10 == Class138.field1876) {
                  var77 = (Client.field658 & 8) != 0;
                  var9 = var77;
               } else {
                  var77 = Class20.method260();
                  if (!var77) {
                     boolean var78 = (Client.field658 & 1) != 0;
                     var77 = var78 && var10.method1083();
                  }

                  var9 = var77 || Class48.method943() && var10.method1104();
               }
            }

            if (var9) {
               Class60 var11 = (Class60)var0;
               if (var1 < var75) {
                  Class58.method1068(var0, var0.field925 + 15);
                  Class299 var12 = (Class299)Client.field631.get(Class295.field3672);
                  byte var13 = 9;
                  var12.method5525(var11.field552.method5447(), var2 + Client.field679, var3 + Client.field680 - var13, 16777215, 0);
                  var8 = 18;
               }
            }
         }

         int var87 = -2;
         int var15;
         int var22;
         int var23;
         if (!var0.field896.method4043()) {
            Class58.method1068(var0, var0.field925 + 15);

            for(Class71 var88 = (Class71)var0.field896.method4048(); var88 != null; var88 = (Class71)var0.field896.method4033()) {
               Class64 var89 = var88.method1773(Client.field591);
               if (var89 == null) {
                  if (var88.method1774()) {
                     var88.method4064();
                  }
               } else {
                  Class261 var91 = var88.field1025;
                  Class318 var76 = var91.method4918();
                  Class318 var14 = var91.method4917();
                  int var16 = 0;
                  if (var76 != null && var14 != null) {
                     if (var91.field3318 * 2 < var14.field3787) {
                        var16 = var91.field3318;
                     }

                     var15 = var14.field3787 - var16 * 2;
                  } else {
                     var15 = var91.field3311;
                  }

                  int var17 = 255;
                  boolean var18 = true;
                  int var19 = Client.field591 - var89.field934;
                  int var20 = var15 * var89.field938 / var91.field3311;
                  int var21;
                  int var92;
                  if (var89.field937 > var19) {
                     var21 = var91.field3308 == 0 ? 0 : var91.field3308 * (var19 / var91.field3308);
                     var22 = var15 * var89.field935 / var91.field3311;
                     var92 = var21 * (var20 - var22) / var89.field937 + var22;
                  } else {
                     var92 = var20;
                     var21 = var91.field3313 + var89.field937 - var19;
                     if (var91.field3312 >= 0) {
                        var17 = (var21 << 8) / (var91.field3313 - var91.field3312);
                     }
                  }

                  if (var89.field938 > 0 && var92 < 1) {
                     var92 = 1;
                  }

                  if (var76 != null && var14 != null) {
                     if (var15 == var92) {
                        var92 += var16 * 2;
                     } else {
                        var92 += var16;
                     }

                     var21 = var76.field3788;
                     var87 += var21;
                     var22 = var2 + Client.field679 - (var15 >> 1);
                     var23 = var3 + Client.field680 - var87;
                     var22 -= var16;
                     if (var17 >= 0 && var17 < 255) {
                        var76.method5857(var22, var23, var17);
                        Class314.method5790(var22, var23, var22 + var92, var23 + var21);
                        var14.method5857(var22, var23, var17);
                     } else {
                        var76.method5851(var22, var23);
                        Class314.method5790(var22, var23, var92 + var22, var21 + var23);
                        var14.method5851(var22, var23);
                     }

                     Class314.method5720(var2, var3, var2 + var4, var3 + var5);
                     var87 += 2;
                  } else {
                     var87 += 5;
                     if (Client.field679 > -1) {
                        var21 = var2 + Client.field679 - (var15 >> 1);
                        var22 = var3 + Client.field680 - var87;
                        Class314.method5763(var21, var22, var92, 5, 65280);
                        Class314.method5763(var21 + var92, var22, var15 - var92, 5, 16711680);
                     }

                     var87 += 2;
                  }
               }
            }
         }

         if (var87 == -2) {
            var87 += 7;
         }

         var87 += var8;
         if (var1 < var75) {
            var10 = (Class60)var0;
            if (var10.field566) {
               return;
            }

            if (var10.field570 != -1 || var10.field548 != -1) {
               Class58.method1068(var0, var0.field925 + 15);
               if (Client.field679 > -1) {
                  if (var10.field570 != -1) {
                     var87 += 25;
                     Class150.field1919[var10.field570].method5851(var2 + Client.field679 - 12, var3 + Client.field680 - var87);
                  }

                  if (var10.field548 != -1) {
                     var87 += 25;
                     Class43.field369[var10.field548].method5851(var2 + Client.field679 - 12, var3 + Client.field680 - var87);
                  }
               }
            }

            if (var1 >= 0 && Client.field599 == 10 && var7[var1] == Client.field579) {
               Class58.method1068(var0, var0.field925 + 15);
               if (Client.field679 > -1) {
                  var87 += Class150.field1926[1].field3788;
                  Class150.field1926[1].method5851(var2 + Client.field679 - 12, var3 + Client.field680 - var87);
               }
            }
         } else {
            Class271 var90 = ((Class72)var0).field1037;
            if (var90.field3516 != null) {
               var90 = var90.method5189();
            }

            if (var90.field3494 >= 0 && var90.field3494 < Class43.field369.length) {
               Class58.method1068(var0, var0.field925 + 15);
               if (Client.field679 > -1) {
                  Class43.field369[var90.field3494].method5851(var2 + Client.field679 - 12, var3 + Client.field680 - 30);
               }
            }

            if (Client.field599 == 1 && Client.field639[var1 - var75] == Client.field600 && Client.field591 % 20 < 10) {
               Class58.method1068(var0, var0.field925 + 15);
               if (Client.field679 > -1) {
                  Class150.field1926[0].method5851(var2 + Client.field679 - 12, var3 + Client.field680 - 28);
               }
            }
         }

         if (var0.field884 != null && (var1 >= var75 || !var0.field886 && (Client.field630 == 4 || !var0.field885 && (Client.field630 == 0 || Client.field630 == 3 || Client.field630 == 1 && ((Class60)var0).method1083())))) {
            Class58.method1068(var0, var0.field925);
            if (Client.field679 > -1 && Client.field667 < Client.field648) {
               Client.field672[Client.field667] = Class293.field3660.method5517(var0.field884) / 2;
               Client.field671[Client.field667] = Class293.field3660.field3695;
               Client.field669[Client.field667] = Client.field679;
               Client.field670[Client.field667] = Client.field680;
               Client.field673[Client.field667] = var0.field888;
               Client.field674[Client.field667] = var0.field927;
               Client.field675[Client.field667] = var0.field887;
               Client.field721[Client.field667] = var0.field884;
               ++Client.field667;
            }
         }

         for(int var79 = 0; var79 < 4; ++var79) {
            int var95 = var0.field895[var79];
            int var96 = var0.field912[var79];
            Class267 var94 = null;
            int var80 = 0;
            if (var96 >= 0) {
               if (var95 <= Client.field591) {
                  continue;
               }

               var94 = Class14.method123(var0.field912[var79]);
               var80 = var94.field3355;
               if (var94 != null && var94.field3366 != null) {
                  var94 = var94.method4995();
                  if (var94 == null) {
                     var0.field895[var79] = -1;
                     continue;
                  }
               }
            } else if (var95 < 0) {
               continue;
            }

            var15 = var0.field894[var79];
            Class267 var81 = null;
            if (var15 >= 0) {
               var81 = Class14.method123(var15);
               if (var81 != null && var81.field3366 != null) {
                  var81 = var81.method4995();
               }
            }

            if (var95 - var80 <= Client.field591) {
               if (var94 == null) {
                  var0.field895[var79] = -1;
               } else {
                  Class58.method1068(var0, var0.field925 / 2);
                  if (Client.field679 > -1) {
                     if (var79 == 1) {
                        Client.field680 -= 20;
                     }

                     if (var79 == 2) {
                        Client.field679 -= 15;
                        Client.field680 -= 10;
                     }

                     if (var79 == 3) {
                        Client.field679 += 15;
                        Client.field680 -= 10;
                     }

                     Class318 var82 = null;
                     Class318 var83 = null;
                     Class318 var84 = null;
                     Class318 var85 = null;
                     var22 = 0;
                     var23 = 0;
                     int var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     Class318 var30 = null;
                     Class318 var31 = null;
                     Class318 var32 = null;
                     Class318 var33 = null;
                     int var34 = 0;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     var82 = var94.method4994();
                     int var43;
                     if (var82 != null) {
                        var22 = var82.field3787;
                        var43 = var82.field3788;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var26 = var82.field3793;
                     }

                     var83 = var94.method5000();
                     if (var83 != null) {
                        var23 = var83.field3787;
                        var43 = var83.field3788;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var27 = var83.field3793;
                     }

                     var84 = var94.method4996();
                     if (var84 != null) {
                        var24 = var84.field3787;
                        var43 = var84.field3788;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var28 = var84.field3793;
                     }

                     var85 = var94.method4997();
                     if (var85 != null) {
                        var25 = var85.field3787;
                        var43 = var85.field3788;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var29 = var85.field3793;
                     }

                     if (var81 != null) {
                        var30 = var81.method4994();
                        if (var30 != null) {
                           var34 = var30.field3787;
                           var43 = var30.field3788;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var38 = var30.field3793;
                        }

                        var31 = var81.method5000();
                        if (var31 != null) {
                           var35 = var31.field3787;
                           var43 = var31.field3788;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var39 = var31.field3793;
                        }

                        var32 = var81.method4996();
                        if (var32 != null) {
                           var36 = var32.field3787;
                           var43 = var32.field3788;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var40 = var32.field3793;
                        }

                        var33 = var81.method4997();
                        if (var33 != null) {
                           var37 = var33.field3787;
                           var43 = var33.field3788;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var41 = var33.field3793;
                        }
                     }

                     Class298 var86 = var94.method4998();
                     if (var86 == null) {
                        var86 = Class151.field1936;
                     }

                     Class298 var44;
                     if (var81 != null) {
                        var44 = var81.method4998();
                        if (var44 == null) {
                           var44 = Class151.field1936;
                        }
                     } else {
                        var44 = Class151.field1936;
                     }

                     String var45 = null;
                     String var46 = null;
                     boolean var47 = false;
                     int var48 = 0;
                     var45 = var94.method5014(var0.field892[var79]);
                     int var93 = var86.method5517(var45);
                     if (var81 != null) {
                        var46 = var81.method5014(var0.field921[var79]);
                        var48 = var44.method5517(var46);
                     }

                     int var49 = 0;
                     int var50 = 0;
                     if (var23 > 0) {
                        if (var84 == null && var85 == null) {
                           var49 = 1;
                        } else {
                           var49 = var93 / var23 + 1;
                        }
                     }

                     if (var81 != null && var35 > 0) {
                        if (var32 == null && var33 == null) {
                           var50 = 1;
                        } else {
                           var50 = var48 / var35 + 1;
                        }
                     }

                     int var51 = 0;
                     int var52 = var51;
                     if (var22 > 0) {
                        var51 += var22;
                     }

                     var51 += 2;
                     int var53 = var51;
                     if (var24 > 0) {
                        var51 += var24;
                     }

                     int var54 = var51;
                     int var55 = var51;
                     int var56;
                     if (var23 > 0) {
                        var56 = var49 * var23;
                        var51 += var56;
                        var55 += (var56 - var93) / 2;
                     } else {
                        var51 += var93;
                     }

                     var56 = var51;
                     if (var25 > 0) {
                        var51 += var25;
                     }

                     int var57 = 0;
                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62;
                     if (var81 != null) {
                        var51 += 2;
                        var57 = var51;
                        if (var34 > 0) {
                           var51 += var34;
                        }

                        var51 += 2;
                        var58 = var51;
                        if (var36 > 0) {
                           var51 += var36;
                        }

                        var59 = var51;
                        var61 = var51;
                        if (var35 > 0) {
                           var62 = var50 * var35;
                           var51 += var62;
                           var61 += (var62 - var48) / 2;
                        } else {
                           var51 += var48;
                        }

                        var60 = var51;
                        if (var37 > 0) {
                           var51 += var37;
                        }
                     }

                     var62 = var0.field895[var79] - Client.field591;
                     int var63 = var94.field3365 - var62 * var94.field3365 / var94.field3355;
                     int var64 = var62 * var94.field3361 / var94.field3355 + -var94.field3361;
                     int var65 = var63 + (var2 + Client.field679 - (var51 >> 1));
                     int var66 = var64 + (var3 + Client.field680 - 12);
                     int var67 = var66;
                     int var68 = var66 + var42;
                     int var69 = var66 + var94.field3347 + 15;
                     int var70 = var69 - var86.field3696;
                     int var71 = var69 + var86.field3697;
                     if (var70 < var66) {
                        var67 = var70;
                     }

                     if (var71 > var68) {
                        var68 = var71;
                     }

                     int var72 = 0;
                     int var73;
                     int var74;
                     if (var81 != null) {
                        var72 = var66 + var81.field3347 + 15;
                        var73 = var72 - var44.field3696;
                        var74 = var72 + var44.field3697;
                        if (var73 < var67) {
                           ;
                        }

                        if (var74 > var68) {
                           ;
                        }
                     }

                     var73 = 255;
                     if (var94.field3354 >= 0) {
                        var73 = (var62 << 8) / (var94.field3355 - var94.field3354);
                     }

                     if (var73 >= 0 && var73 < 255) {
                        if (var82 != null) {
                           var82.method5857(var65 + var52 - var26, var66, var73);
                        }

                        if (var84 != null) {
                           var84.method5857(var65 + var53 - var28, var66, var73);
                        }

                        if (var83 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var83.method5857(var23 * var74 + (var54 + var65 - var27), var66, var73);
                           }
                        }

                        if (var85 != null) {
                           var85.method5857(var56 + var65 - var29, var66, var73);
                        }

                        var86.method5523(var45, var65 + var55, var69, var94.field3364, 0, var73);
                        if (var81 != null) {
                           if (var30 != null) {
                              var30.method5857(var65 + var57 - var38, var66, var73);
                           }

                           if (var32 != null) {
                              var32.method5857(var58 + var65 - var40, var66, var73);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.method5857(var74 * var35 + (var59 + var65 - var39), var66, var73);
                              }
                           }

                           if (var33 != null) {
                              var33.method5857(var65 + var60 - var41, var66, var73);
                           }

                           var44.method5523(var46, var61 + var65, var72, var81.field3364, 0, var73);
                        }
                     } else {
                        if (var82 != null) {
                           var82.method5851(var65 + var52 - var26, var66);
                        }

                        if (var84 != null) {
                           var84.method5851(var65 + var53 - var28, var66);
                        }

                        if (var83 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var83.method5851(var23 * var74 + (var65 + var54 - var27), var66);
                           }
                        }

                        if (var85 != null) {
                           var85.method5851(var65 + var56 - var29, var66);
                        }

                        var86.method5522(var45, var65 + var55, var69, var94.field3364 | -16777216, 0);
                        if (var81 != null) {
                           if (var30 != null) {
                              var30.method5851(var57 + var65 - var38, var66);
                           }

                           if (var32 != null) {
                              var32.method5851(var58 + var65 - var40, var66);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.method5851(var74 * var35 + (var59 + var65 - var39), var66);
                              }
                           }

                           if (var33 != null) {
                              var33.method5851(var60 + var65 - var41, var66);
                           }

                           var44.method5522(var46, var65 + var61, var72, var81.field3364 | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIB)V",
      garbageValue = "46"
   )
   static final void method630(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (Class261.method4931(var0)) {
         Class132.field1814 = null;
         Class28.method467(Class42.field366[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (Class132.field1814 != null) {
            Class28.method467(Class132.field1814, -1412584499, var1, var2, var3, var4, Class297.field3687, Class1.field15, var7);
            Class132.field1814 = null;
         }

      } else {
         if (var7 != -1) {
            Client.field697[var7] = true;
         } else {
            for(int var8 = 0; var8 < 100; ++var8) {
               Client.field697[var8] = true;
            }
         }

      }
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "1"
   )
   static final String method623(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      if (var1.length() > 9) {
         return " " + Class6.method71(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
      } else {
         return var1.length() > 6 ? " " + Class6.method71(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + Class6.method71(16776960) + var1 + "</col>";
      }
   }
}
