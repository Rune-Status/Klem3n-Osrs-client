package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public abstract class Class247 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfv;"
   )
   static Class175 field3172 = new Class175();
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -2137229897
   )
   static int field3176 = 0;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 883985551
   )
   int field3171;
   @ObfuscatedName("s")
   int[] field3161;
   @ObfuscatedName("l")
   int[] field3160;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lgh;"
   )
   Class198 field3163;
   @ObfuscatedName("q")
   int[] field3164;
   @ObfuscatedName("k")
   int[] field3162;
   @ObfuscatedName("i")
   int[] field3166;
   @ObfuscatedName("x")
   int[][] field3167;
   @ObfuscatedName("e")
   int[][] field3168;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "[Lgh;"
   )
   Class198[] field3173;
   @ObfuscatedName("b")
   Object[] field3165;
   @ObfuscatedName("n")
   Object[][] field3169;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 516934159
   )
   public int field3175;
   @ObfuscatedName("m")
   boolean field3174;
   @ObfuscatedName("r")
   boolean field3170;

   Class247(boolean var1, boolean var2) {
      this.field3174 = var1;
      this.field3170 = var2;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([BB)V",
      garbageValue = "65"
   )
   void method4622(byte[] var1) {
      int var3 = var1.length;
      int var2 = Class187.method3812(var1, 0, var3);
      this.field3175 = var2;
      Class182 var4 = new Class182(Class47.method912(var1));
      int var5 = var4.method3544();
      if (var5 >= 5 && var5 <= 7) {
         if (var5 >= 6) {
            var4.method3671();
         }

         int var6 = var4.method3544();
         if (var5 >= 7) {
            this.field3171 = var4.method3611();
         } else {
            this.field3171 = var4.method3550();
         }

         int var7 = 0;
         int var8 = -1;
         this.field3161 = new int[this.field3171];
         int var9;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.field3171; ++var9) {
               this.field3161[var9] = var7 += var4.method3611();
               if (this.field3161[var9] > var8) {
                  var8 = this.field3161[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < this.field3171; ++var9) {
               this.field3161[var9] = var7 += var4.method3550();
               if (this.field3161[var9] > var8) {
                  var8 = this.field3161[var9];
               }
            }
         }

         this.field3164 = new int[var8 + 1];
         this.field3162 = new int[var8 + 1];
         this.field3166 = new int[var8 + 1];
         this.field3167 = new int[var8 + 1][];
         this.field3165 = new Object[var8 + 1];
         this.field3169 = new Object[var8 + 1][];
         if (var6 != 0) {
            this.field3160 = new int[var8 + 1];

            for(var9 = 0; var9 < this.field3171; ++var9) {
               this.field3160[this.field3161[var9]] = var4.method3671();
            }

            this.field3163 = new Class198(this.field3160);
         }

         for(var9 = 0; var9 < this.field3171; ++var9) {
            this.field3164[this.field3161[var9]] = var4.method3671();
         }

         for(var9 = 0; var9 < this.field3171; ++var9) {
            this.field3162[this.field3161[var9]] = var4.method3671();
         }

         for(var9 = 0; var9 < this.field3171; ++var9) {
            this.field3166[this.field3161[var9]] = var4.method3550();
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.field3171; ++var9) {
               var10 = this.field3161[var9];
               var11 = this.field3166[var10];
               var7 = 0;
               var12 = -1;
               this.field3167[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field3167[var10][var13] = var7 += var4.method3611();
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field3169[var10] = new Object[var12 + 1];
            }
         } else {
            for(var9 = 0; var9 < this.field3171; ++var9) {
               var10 = this.field3161[var9];
               var11 = this.field3166[var10];
               var7 = 0;
               var12 = -1;
               this.field3167[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field3167[var10][var13] = var7 += var4.method3550();
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field3169[var10] = new Object[var12 + 1];
            }
         }

         if (var6 != 0) {
            this.field3168 = new int[var8 + 1][];
            this.field3173 = new Class198[var8 + 1];

            for(var9 = 0; var9 < this.field3171; ++var9) {
               var10 = this.field3161[var9];
               var11 = this.field3166[var10];
               this.field3168[var10] = new int[this.field3169[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.field3168[var10][this.field3167[var10][var12]] = var4.method3671();
               }

               this.field3173[var10] = new Class198(this.field3168[var10]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-114"
   )
   void vmethod4721(int var1) {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)[B",
      garbageValue = "1818456524"
   )
   public byte[] method4625(int var1, int var2) {
      return this.method4628(var1, var2, (int[])null);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II[IB)[B",
      garbageValue = "18"
   )
   public byte[] method4628(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.field3169.length && this.field3169[var1] != null && var2 >= 0 && var2 < this.field3169[var1].length) {
         if (this.field3169[var1][var2] == null) {
            boolean var4 = this.method4693(var1, var3);
            if (!var4) {
               this.vmethod4722(var1);
               var4 = this.method4693(var1, var3);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = Class97.method2211(this.field3169[var1][var2], false);
         if (this.field3170) {
            this.field3169[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "1"
   )
   public boolean method4696(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field3169.length && this.field3169[var1] != null && var2 >= 0 && var2 < this.field3169[var1].length) {
         if (this.field3169[var1][var2] != null) {
            return true;
         } else if (this.field3165[var1] != null) {
            return true;
         } else {
            this.vmethod4722(var1);
            return this.field3165[var1] != null;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "107"
   )
   public boolean method4627(int var1) {
      if (this.field3169.length == 1) {
         return this.method4696(0, var1);
      } else if (this.field3169[var1].length == 1) {
         return this.method4696(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "14"
   )
   public boolean method4707(int var1) {
      if (this.field3165[var1] != null) {
         return true;
      } else {
         this.vmethod4722(var1);
         return this.field3165[var1] != null;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "758366307"
   )
   public boolean method4629() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.field3161.length; ++var2) {
         int var3 = this.field3161[var2];
         if (this.field3165[var3] == null) {
            this.vmethod4722(var3);
            if (this.field3165[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "35"
   )
   int vmethod4727(int var1) {
      return this.field3165[var1] != null ? 100 : 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "-265893488"
   )
   public byte[] method4689(int var1) {
      if (this.field3169.length == 1) {
         return this.method4625(0, var1);
      } else if (this.field3169[var1].length == 1) {
         return this.method4625(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(III)[B",
      garbageValue = "-322980430"
   )
   public byte[] method4676(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field3169.length && this.field3169[var1] != null && var2 >= 0 && var2 < this.field3169[var1].length) {
         if (this.field3169[var1][var2] == null) {
            boolean var3 = this.method4693(var1, (int[])null);
            if (!var3) {
               this.vmethod4722(var1);
               var3 = this.method4693(var1, (int[])null);
               if (!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = Class97.method2211(this.field3169[var1][var2], false);
         return var4;
      } else {
         return null;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IS)[B",
      garbageValue = "-10823"
   )
   public byte[] method4626(int var1) {
      if (this.field3169.length == 1) {
         return this.method4676(0, var1);
      } else if (this.field3169[var1].length == 1) {
         return this.method4676(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "10"
   )
   void vmethod4722(int var1) {
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "889237551"
   )
   public int[] method4668(int var1) {
      return this.field3167[var1];
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "180707885"
   )
   public int method4636(int var1) {
      return this.field3169[var1].length;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "252467795"
   )
   public int method4637() {
      return this.field3169.length;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "59"
   )
   public void method4702() {
      for(int var1 = 0; var1 < this.field3165.length; ++var1) {
         this.field3165[var1] = null;
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "38"
   )
   public void method4639(int var1) {
      for(int var2 = 0; var2 < this.field3169[var1].length; ++var2) {
         this.field3169[var1][var2] = null;
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2135464480"
   )
   public void method4640() {
      for(int var1 = 0; var1 < this.field3169.length; ++var1) {
         if (this.field3169[var1] != null) {
            for(int var2 = 0; var2 < this.field3169[var1].length; ++var2) {
               this.field3169[var1][var2] = null;
            }
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I[IB)Z",
      garbageValue = "123"
   )
   boolean method4693(int var1, int[] var2) {
      if (this.field3165[var1] == null) {
         return false;
      } else {
         int var3 = this.field3166[var1];
         int[] var4 = this.field3167[var1];
         Object[] var5 = this.field3169[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var18;
            if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
               var18 = Class97.method2211(this.field3165[var1], true);
               Class182 var8 = new Class182(var18);
               var8.method3570(var2, 5, var8.payload.length);
            } else {
               var18 = Class97.method2211(this.field3165[var1], false);
            }

            byte[] var20 = Class47.method912(var18);
            if (this.field3174) {
               this.field3165[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var3 * var10 * 4;
               Class182 var11 = new Class182(var20);
               int[] var12 = new int[var3];
               var11.field2339 = var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.method3671();
                     var12[var15] += var14;
                  }
               }

               byte[][] var19 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var19[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.field2339 = var9;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.method3671();
                     System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if (!this.field3170) {
                     var5[var4[var15]] = Class159.method3324(var19[var15], false);
                  } else {
                     var5[var4[var15]] = var19[var15];
                  }
               }
            } else if (!this.field3170) {
               var5[var4[0]] = Class159.method3324(var20, false);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "258440210"
   )
   public int method4642(String var1) {
      var1 = var1.toLowerCase();
      return this.field3163.method3967(Class277.method5240(var1));
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)I",
      garbageValue = "-981702486"
   )
   public int method4643(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field3173[var1].method3967(Class277.method5240(var2));
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;B)Z",
      garbageValue = "9"
   )
   public boolean method4644(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field3163.method3967(Class277.method5240(var1));
      if (var3 < 0) {
         return false;
      } else {
         int var4 = this.field3173[var3].method3967(Class277.method5240(var2));
         return var4 >= 0;
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)[B",
      garbageValue = "222409025"
   )
   public byte[] method4684(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field3163.method3967(Class277.method5240(var1));
      int var4 = this.field3173[var3].method3967(Class277.method5240(var2));
      return this.method4625(var3, var4);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "-1256800993"
   )
   public boolean method4646(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field3163.method3967(Class277.method5240(var1));
      int var4 = this.field3173[var3].method3967(Class277.method5240(var2));
      return this.method4696(var3, var4);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Z",
      garbageValue = "-574756361"
   )
   public boolean method4704(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field3163.method3967(Class277.method5240(var1));
      return this.method4707(var2);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1722462563"
   )
   public void method4648(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field3163.method3967(Class277.method5240(var1));
      if (var2 >= 0) {
         this.vmethod4721(var2);
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "17959811"
   )
   public int method4687(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field3163.method3967(Class277.method5240(var1));
      return this.vmethod4727(var2);
   }
}
