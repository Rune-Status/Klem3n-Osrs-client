package com.client;
import java.util.zip.CRC32;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class Class249 extends Class247 {
   @ObfuscatedName("ab")
   static CRC32 field3189 = new CRC32();
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = 194552531
   )
   static int field3192;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   Class162 field3195;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   Class162 field3186;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1684100553
   )
   int field3187;
   @ObfuscatedName("v")
   volatile boolean field3188 = false;
   @ObfuscatedName("af")
   boolean field3191 = false;
   @ObfuscatedName("ah")
   volatile boolean[] field3185;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1809929257
   )
   int field3190;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 439984845
   )
   int field3193;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 856504919
   )
   int field3194 = -1;

   @ObfuscatedSignature(
      signature = "(Lff;Lff;IZZZ)V"
   )
   public Class249(Class162 var1, Class162 var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.field3195 = var1;
      this.field3186 = var2;
      this.field3187 = var3;
      this.field3191 = var6;
      int var8 = this.field3187;
      if (Class185.field2359 != null) {
         Class185.field2359.field2339 = var8 * 8 + 5;
         int var9 = Class185.field2359.method3671();
         int var10 = Class185.field2359.method3671();
         this.method4723(var9, var10);
      } else {
         Class22.method280((Class249)null, 255, 255, 0, (byte)0, true);
         Class250.field3201[var8] = this;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-114"
   )
   void vmethod4721(int var1) {
      Class54.method1021(this.field3187, var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "35"
   )
   int vmethod4727(int var1) {
      if (super.field3165[var1] != null) {
         return 100;
      } else if (this.field3185[var1]) {
         return 100;
      } else {
         int var3 = this.field3187;
         long var4 = (long)((var3 << 16) + var1);
         int var2;
         if (Class250.field3208 != null && var4 == Class250.field3208.field2421) {
            var2 = Class301.field3713.field2339 * 99 / (Class301.field3713.payload.length - Class250.field3208.field3157) + 1;
         } else {
            var2 = 0;
         }

         return var2;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "10"
   )
   void vmethod4722(int var1) {
      if (this.field3195 != null && this.field3185 != null && this.field3185[var1]) {
         Class162 var2 = this.field3195;
         byte[] var4 = null;
         Class205 var5 = Class248.field3182;
         synchronized(Class248.field3182) {
            for(Class245 var6 = (Class245)Class248.field3182.method4098(); var6 != null; var6 = (Class245)Class248.field3182.method4079()) {
               if ((long)var1 == var6.field2421 && var2 == var6.field3151 && var6.field3150 == 0) {
                  var4 = var6.field3149;
                  break;
               }
            }
         }

         if (var4 != null) {
            this.method4746(var2, var1, var4, true);
         } else {
            byte[] var9 = var2.method3372(var1);
            this.method4746(var2, var1, var9, true);
         }
      } else {
         Class22.method280(this, this.field3187, var1, super.field3164[var1], (byte)2, true);
      }

   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "75"
   )
   public int method4720() {
      if (this.field3188) {
         return 100;
      } else if (super.field3165 != null) {
         return 99;
      } else {
         int var2 = this.field3187;
         long var3 = (long)(var2 + 16711680);
         int var1;
         if (Class250.field3208 != null && var3 == Class250.field3208.field2421) {
            var1 = Class301.field3713.field2339 * 99 / (Class301.field3713.payload.length - Class250.field3208.field3157) + 1;
         } else {
            var1 = 0;
         }

         int var5 = var1;
         if (var1 >= 100) {
            var5 = 99;
         }

         return var5;
      }
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1996421048"
   )
   public void method4723(int var1, int var2) {
      this.field3190 = var1;
      this.field3193 = var2;
      if (this.field3186 != null) {
         int var3 = this.field3187;
         Class162 var4 = this.field3186;
         byte[] var6 = null;
         Class205 var7 = Class248.field3182;
         synchronized(Class248.field3182) {
            for(Class245 var8 = (Class245)Class248.field3182.method4098(); var8 != null; var8 = (Class245)Class248.field3182.method4079()) {
               if ((long)var3 == var8.field2421 && var4 == var8.field3151 && var8.field3150 == 0) {
                  var6 = var8.field3149;
                  break;
               }
            }
         }

         if (var6 != null) {
            this.method4746(var4, var3, var6, true);
         } else {
            byte[] var11 = var4.method3372(var3);
            this.method4746(var4, var3, var11, true);
         }
      } else {
         Class22.method280(this, 255, this.field3187, this.field3190, (byte)0, true);
      }

   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      signature = "(I[BZZI)V",
      garbageValue = "-1745310697"
   )
   public void method4729(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field3188) {
            throw new RuntimeException();
         }

         if (this.field3186 != null) {
            int var5 = this.field3187;
            Class162 var6 = this.field3186;
            Class245 var7 = new Class245();
            var7.field3150 = 0;
            var7.field2421 = (long)var5;
            var7.field3149 = var2;
            var7.field3151 = var6;
            Class205 var8 = Class248.field3182;
            synchronized(Class248.field3182) {
               Class248.field3182.method4073(var7);
            }

            Class189.method3848();
         }

         this.method4622(var2);
         this.method4726();
      } else {
         var2[var2.length - 2] = (byte)(super.field3162[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field3162[var1];
         if (this.field3195 != null) {
            Class162 var11 = this.field3195;
            Class245 var14 = new Class245();
            var14.field3150 = 0;
            var14.field2421 = (long)var1;
            var14.field3149 = var2;
            var14.field3151 = var11;
            Class205 var15 = Class248.field3182;
            synchronized(Class248.field3182) {
               Class248.field3182.method4073(var14);
            }

            Class189.method3848();
            this.field3185[var1] = true;
         }

         if (var4) {
            super.field3165[var1] = Class159.method3324(var2, false);
         }
      }

   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      signature = "(Lff;I[BZB)V",
      garbageValue = "-91"
   )
   void method4746(Class162 var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (var1 == this.field3186) {
         if (this.field3188) {
            throw new RuntimeException();
         } else if (var3 == null) {
            Class22.method280(this, 255, this.field3187, this.field3190, (byte)0, true);
         } else {
            field3189.reset();
            field3189.update(var3, 0, var3.length);
            var5 = (int)field3189.getValue();
            if (var5 != this.field3190) {
               Class22.method280(this, 255, this.field3187, this.field3190, (byte)0, true);
            } else {
               Class182 var9 = new Class182(Class47.method912(var3));
               int var7 = var9.readUnsignedByte();
               if (var7 != 5 && var7 != 6) {
                  throw new RuntimeException(var7 + "," + this.field3187 + "," + var2);
               } else {
                  int var8 = 0;
                  if (var7 >= 6) {
                     var8 = var9.method3671();
                  }

                  if (var8 != this.field3193) {
                     Class22.method280(this, 255, this.field3187, this.field3190, (byte)0, true);
                  } else {
                     this.method4622(var3);
                     this.method4726();
                  }
               }
            }
         }
      } else {
         if (!var4 && var2 == this.field3194) {
            this.field3188 = true;
         }

         if (var3 != null && var3.length > 2) {
            field3189.reset();
            field3189.update(var3, 0, var3.length - 2);
            var5 = (int)field3189.getValue();
            int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            if (var5 == super.field3164[var2] && var6 == super.field3162[var2]) {
               this.field3185[var2] = true;
               if (var4) {
                  super.field3165[var2] = Class159.method3324(var3, false);
               }

            } else {
               this.field3185[var2] = false;
               if (this.field3191 || var4) {
                  Class22.method280(this, this.field3187, var2, super.field3164[var2], (byte)2, var4);
               }

            }
         } else {
            this.field3185[var2] = false;
            if (this.field3191 || var4) {
               Class22.method280(this, this.field3187, var2, super.field3164[var2], (byte)2, var4);
            }

         }
      }
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-160763890"
   )
   void method4726() {
      this.field3185 = new boolean[super.field3165.length];

      int var1;
      for(var1 = 0; var1 < this.field3185.length; ++var1) {
         this.field3185[var1] = false;
      }

      if (this.field3195 == null) {
         this.field3188 = true;
      } else {
         this.field3194 = -1;

         for(var1 = 0; var1 < this.field3185.length; ++var1) {
            if (super.field3166[var1] > 0) {
               Class162 var2 = this.field3195;
               Class245 var4 = new Class245();
               var4.field3150 = 1;
               var4.field2421 = (long)var1;
               var4.field3151 = var2;
               var4.field3152 = this;
               Class205 var5 = Class248.field3182;
               synchronized(Class248.field3182) {
                  Class248.field3182.method4073(var4);
               }

               Class189.method3848();
               this.field3194 = var1;
            }
         }

         if (this.field3194 == -1) {
            this.field3188 = true;
         }

      }
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "270216094"
   )
   public boolean method4725(int var1) {
      return this.field3185[var1];
   }

   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1526395619"
   )
   public boolean method4734(int var1) {
      return this.method4668(var1) != null;
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1226405037"
   )
   public int method4755() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < super.field3165.length; ++var3) {
         if (super.field3166[var3] > 0) {
            var1 += 100;
            var2 += this.vmethod4727(var3);
         }
      }

      if (var1 == 0) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }
}
