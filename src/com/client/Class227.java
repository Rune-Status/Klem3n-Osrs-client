package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class Class227 {
   @ObfuscatedName("k")
   public static short[] field2575;
   @ObfuscatedName("i")
   public static short[][] field2572;
   @ObfuscatedName("x")
   public static short[] field2577;
   @ObfuscatedName("e")
   public static short[][] field2578;
   @ObfuscatedName("p")
   static final int[] field2579 = new int[]{8, 11, 4, 6, 9, 7, 10};
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static Class200 field2580 = new Class200(260);
   @ObfuscatedName("z")
   int[] field2570;
   @ObfuscatedName("w")
   int[] field2576;
   @ObfuscatedName("s")
   public boolean field2571;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1734814155
   )
   public int field2569;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      longValue = -1819394091005678963L
   )
   long field2573;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = 7379530444611537843L
   )
   long field2574;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([I[IZII)V",
      garbageValue = "1119812304"
   )
   public void method4462(int[] var1, int[] var2, boolean var3, int var4) {
      if (var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < Class260.field3294; ++var6) {
               Class260 var7 = Class2.method23(var6);
               if (var7 != null && !var7.field3295 && (var3 ? 7 : 0) + var5 == var7.field3293) {
                  var1[field2579[var5]] = var6 + 256;
                  break;
               }
            }
         }
      }

      this.field2570 = var1;
      this.field2576 = var2;
      this.field2571 = var3;
      this.field2569 = var4;
      this.method4467();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "-1617344099"
   )
   public void method4478(int var1, boolean var2) {
      if (var1 != 1 || !this.field2571) {
         int var3 = this.field2570[field2579[var1]];
         if (var3 != 0) {
            var3 -= 256;

            Class260 var4;
            do {
               if (!var2) {
                  --var3;
                  if (var3 < 0) {
                     var3 = Class260.field3294 - 1;
                  }
               } else {
                  ++var3;
                  if (var3 >= Class260.field3294) {
                     var3 = 0;
                  }
               }

               var4 = Class2.method23(var3);
            } while(var4 == null || var4.field3295 || var1 + (this.field2571 ? 7 : 0) != var4.field3293);

            this.field2570[field2579[var1]] = var3 + 256;
            this.method4467();
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IZB)V",
      garbageValue = "43"
   )
   public void method4493(int var1, boolean var2) {
      int var3 = this.field2576[var1];
      boolean var4;
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = field2572[var1].length - 1;
            }

            if (var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if (var3 >= field2572[var1].length) {
               var3 = 0;
            }

            if (var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.field2576[var1] = var3;
      this.method4467();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-75355904"
   )
   public void method4465(boolean var1) {
      if (this.field2571 != var1) {
         this.method4462((int[])null, this.field2576, var1, -1);
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-121"
   )
   public void method4466(Class182 var1) {
      var1.method3532(this.field2571 ? 1 : 0);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.field2570[field2579[var2]];
         if (var3 == 0) {
            var1.method3532(-1);
         } else {
            var1.method3532(var3 - 256);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.method3532(this.field2576[var2]);
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1868947460"
   )
   void method4467() {
      long var1 = this.field2573;
      int var3 = this.field2570[5];
      int var4 = this.field2570[9];
      this.field2570[5] = var4;
      this.field2570[9] = var3;
      this.field2573 = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.field2573 <<= 4;
         if (this.field2570[var5] >= 256) {
            this.field2573 += (long)(this.field2570[var5] - 256);
         }
      }

      if (this.field2570[0] >= 256) {
         this.field2573 += (long)(this.field2570[0] - 256 >> 4);
      }

      if (this.field2570[1] >= 256) {
         this.field2573 += (long)(this.field2570[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.field2573 <<= 3;
         this.field2573 += (long)this.field2576[var5];
      }

      this.field2573 <<= 1;
      this.field2573 += (long)(this.field2571 ? 1 : 0);
      this.field2570[5] = var3;
      this.field2570[9] = var4;
      if (var1 != 0L && this.field2573 != var1) {
         field2580.method3982(var1);
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Ljn;ILjn;II)Ldc;",
      garbageValue = "960437328"
   )
   public Class119 method4468(Class273 var1, int var2, Class273 var3, int var4) {
      if (this.field2569 != -1) {
         return Class270.method5157(this.field2569).method5162(var1, var2, var3, var4);
      } else {
         long var5 = this.field2573;
         int[] var7 = this.field2570;
         if (var1 != null && (var1.field3548 >= 0 || var1.field3549 >= 0)) {
            var7 = new int[12];

            for(int var15 = 0; var15 < 12; ++var15) {
               var7[var15] = this.field2570[var15];
            }

            if (var1.field3548 >= 0) {
               var5 += (long)(var1.field3548 - this.field2570[5] << 40);
               var7[5] = var1.field3548;
            }

            if (var1.field3549 >= 0) {
               var5 += (long)(var1.field3549 - this.field2570[3] << 48);
               var7[3] = var1.field3549;
            }
         }

         Class119 var8 = (Class119)field2580.method3989(var5);
         if (var8 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if (var11 >= 256 && var11 < 512 && !Class2.method23(var11 - 256).method4896()) {
                  var9 = true;
               }

               if (var11 >= 512 && !Class111.method2563(var11 - 512).method5095(this.field2571)) {
                  var9 = true;
               }
            }

            if (var9) {
               if (this.field2574 != -1L) {
                  var8 = (Class119)field2580.method3989(this.field2574);
               }

               if (var8 == null) {
                  return null;
               }
            }

            if (var8 == null) {
               Class113[] var16 = new Class113[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  Class113 var14;
                  if (var13 >= 256 && var13 < 512) {
                     var14 = Class2.method23(var13 - 256).method4897();
                     if (var14 != null) {
                        var16[var11++] = var14;
                     }
                  }

                  if (var13 >= 512) {
                     var14 = Class111.method2563(var13 - 512).method5128(this.field2571);
                     if (var14 != null) {
                        var16[var11++] = var14;
                     }
                  }
               }

               Class113 var18 = new Class113(var16, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if (this.field2576[var13] < field2572[var13].length) {
                     var18.method2581(field2575[var13], field2572[var13][this.field2576[var13]]);
                  }

                  if (this.field2576[var13] < field2578[var13].length) {
                     var18.method2581(field2577[var13], field2578[var13][this.field2576[var13]]);
                  }
               }

               var8 = var18.method2589(64, 850, -30, -50, -30);
               field2580.method3983(var8, var5);
               this.field2574 = var5;
            }
         }

         if (var1 == null && var3 == null) {
            return var8;
         } else {
            Class119 var17;
            if (var1 != null && var3 != null) {
               var17 = var1.method5221(var8, var2, var3, var4);
            } else if (var1 != null) {
               var17 = var1.method5215(var8, var2);
            } else {
               var17 = var3.method5215(var8, var4);
            }

            return var17;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)Ldb;",
      garbageValue = "-299870207"
   )
   Class113 method4469() {
      if (this.field2569 != -1) {
         return Class270.method5157(this.field2569).method5158();
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.field2570[var2];
            if (var3 >= 256 && var3 < 512 && !Class2.method23(var3 - 256).method4905()) {
               var1 = true;
            }

            if (var3 >= 512 && !Class111.method2563(var3 - 512).method5097(this.field2571)) {
               var1 = true;
            }
         }

         if (var1) {
            return null;
         } else {
            Class113[] var7 = new Class113[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.field2570[var4];
               Class113 var6;
               if (var5 >= 256 && var5 < 512) {
                  var6 = Class2.method23(var5 - 256).method4899();
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if (var5 >= 512) {
                  var6 = Class111.method2563(var5 - 512).method5098(this.field2571);
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            Class113 var8 = new Class113(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.field2576[var5] < field2572[var5].length) {
                  var8.method2581(field2575[var5], field2572[var5][this.field2576[var5]]);
               }

               if (this.field2576[var5] < field2578[var5].length) {
                  var8.method2581(field2577[var5], field2578[var5][this.field2576[var5]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-709591289"
   )
   public int method4483() {
      return this.field2569 == -1 ? (this.field2570[0] << 15) + this.field2570[1] + (this.field2570[11] << 5) + (this.field2570[8] << 10) + (this.field2576[0] << 25) + (this.field2576[4] << 20) : 305419896 + Class270.method5157(this.field2569).field3510;
   }
}
