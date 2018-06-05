package com.client;
import java.io.EOFException;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class Class82 {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1811094485
   )
   public static int field1179;
   @ObfuscatedName("s")
   boolean[] field1175;
   @ObfuscatedName("l")
   boolean[] field1173;
   @ObfuscatedName("u")
   int[] field1174;
   @ObfuscatedName("q")
   String[] field1170;
   @ObfuscatedName("k")
   boolean field1176 = false;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      longValue = 7130902202106963315L
   )
   long field1177;

   Class82() {
      this.field1174 = new int[Class97.field1329.method4636(19)];
      this.field1170 = new String[Class97.field1329.method4636(15)];
      this.field1175 = new boolean[this.field1174.length];

      int var1;
      for(var1 = 0; var1 < this.field1174.length; ++var1) {
         Class256 var2 = Class21.method275(var1);
         this.field1175[var1] = var2.field3256;
      }

      this.field1173 = new boolean[this.field1170.length];

      for(var1 = 0; var1 < this.field1170.length; ++var1) {
         Class257 var3 = Class175.method3485(var1);
         this.field1173[var1] = var3.field3261;
      }

      for(var1 = 0; var1 < this.field1174.length; ++var1) {
         this.field1174[var1] = -1;
      }

      this.method1887();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1213879855"
   )
   void method1903(int var1, int var2) {
      this.field1174[var1] = var2;
      if (this.field1175[var1]) {
         this.field1176 = true;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "82"
   )
   int method1897(int var1) {
      return this.field1174[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "541625191"
   )
   void method1889(int var1, String var2) {
      this.field1170[var1] = var2;
      if (this.field1173[var1]) {
         this.field1176 = true;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-2060094389"
   )
   String method1890(int var1) {
      return this.field1170[var1];
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "60637204"
   )
   void method1891() {
      int var1;
      for(var1 = 0; var1 < this.field1174.length; ++var1) {
         if (!this.field1175[var1]) {
            this.field1174[var1] = -1;
         }
      }

      for(var1 = 0; var1 < this.field1170.length; ++var1) {
         if (!this.field1173[var1]) {
            this.field1170[var1] = null;
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(ZI)Ldv;",
      garbageValue = "-1191303198"
   )
   Class110 method1892(boolean var1) {
      return Class22.method283("2", Class112.field1455.field3144, var1);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "5"
   )
   void method1893() {
      Class110 var1 = this.method1892(true);

      try {
         int var2 = 3;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.field1174.length; ++var4) {
            if (this.field1175[var4] && this.field1174[var4] != -1) {
               var2 += 6;
               ++var3;
            }
         }

         var2 += 2;
         var4 = 0;

         for(int var5 = 0; var5 < this.field1170.length; ++var5) {
            if (this.field1173[var5] && this.field1170[var5] != null) {
               var2 += 2 + Class316.method5820(this.field1170[var5]);
               ++var4;
            }
         }

         Class182 var9 = new Class182(var2);
         var9.method3532(1);
         var9.method3755(var3);

         int var6;
         for(var6 = 0; var6 < this.field1174.length; ++var6) {
            if (this.field1175[var6] && this.field1174[var6] != -1) {
               var9.method3755(var6);
               var9.method3707(this.field1174[var6]);
            }
         }

         var9.method3755(var4);

         for(var6 = 0; var6 < this.field1170.length; ++var6) {
            if (this.field1173[var6] && this.field1170[var6] != null) {
               var9.method3755(var6);
               var9.method3699(this.field1170[var6]);
            }
         }

         var1.method2506(var9.payload, 0, var9.field2339);
      } catch (Exception var17) {
         ;
      } finally {
         try {
            var1.method2507();
         } catch (Exception var16) {
            ;
         }

      }

      this.field1176 = false;
      this.field1177 = Class182.method3547();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-505500629"
   )
   void method1887() {
      Class110 var1 = this.method1892(false);

      label189: {
         try {
            byte[] var2 = new byte[(int)var1.method2509()];

            int var4;
            for(int var3 = 0; var3 < var2.length; var3 += var4) {
               var4 = var1.method2510(var2, var3, var2.length - var3);
               if (var4 == -1) {
                  throw new EOFException();
               }
            }

            Class182 var13 = new Class182(var2);
            if (var13.payload.length - var13.field2339 < 1) {
               return;
            }

            int var14 = var13.method3544();
            if (var14 >= 0 && var14 <= 1) {
               int var15 = var13.method3550();

               int var7;
               int var8;
               int var9;
               for(var7 = 0; var7 < var15; ++var7) {
                  var8 = var13.method3550();
                  var9 = var13.method3671();
                  if (this.field1175[var8]) {
                     this.field1174[var8] = var9;
                  }
               }

               var7 = var13.method3550();
               var8 = 0;

               while(true) {
                  if (var8 >= var7) {
                     break label189;
                  }

                  var9 = var13.method3550();
                  String var10 = var13.method3738();
                  if (this.field1173[var9]) {
                     this.field1170[var9] = var10;
                  }

                  ++var8;
               }
            }
         } catch (Exception var24) {
            break label189;
         } finally {
            try {
               var1.method2507();
            } catch (Exception var23) {
               ;
            }

         }

         return;
      }

      this.field1176 = false;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-196804596"
   )
   void method1902() {
      if (this.field1176 && this.field1177 < Class182.method3547() - 60000L) {
         this.method1893();
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "9220"
   )
   boolean method1896() {
      return this.field1176;
   }

   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "670209353"
   )
   static final void method1894() {
      if (Class13.field82 != Client.field651) {
         Client.field651 = Class13.field82;
         int var0 = Class13.field82;
         int[] var1 = Class72.field1038.field3791;
         int var2 = var1.length;

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            var1[var3] = 0;
         }

         int var4;
         int var5;
         for(var3 = 1; var3 < 103; ++var3) {
            var4 = (103 - var3) * 2048 + 24628;

            for(var5 = 1; var5 < 103; ++var5) {
               if ((Class50.field443[var0][var5][var3] & 24) == 0) {
                  Class28.field248.method2906(var1, var4, 512, var0, var5, var3);
               }

               if (var0 < 3 && (Class50.field443[var0 + 1][var5][var3] & 8) != 0) {
                  Class28.field248.method2906(var1, var4, 512, var0 + 1, var5, var3);
               }

               var4 += 4;
            }
         }

         var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
         var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
         Class72.field1038.method5850();

         int var6;
         for(var5 = 1; var5 < 103; ++var5) {
            for(var6 = 1; var6 < 103; ++var6) {
               if ((Class50.field443[var0][var6][var5] & 24) == 0) {
                  Class224.method4422(var0, var6, var5, var3, var4);
               }

               if (var0 < 3 && (Class50.field443[var0 + 1][var6][var5] & 8) != 0) {
                  Class224.method4422(var0 + 1, var6, var5, var3, var4);
               }
            }
         }

         Client.field724 = 0;

         for(var5 = 0; var5 < 104; ++var5) {
            for(var6 = 0; var6 < 104; ++var6) {
               long var7 = Class28.field248.method2901(Class13.field82, var5, var6);
               if (0L != var7) {
                  int var9 = Class39.method673(var7);
                  int var10 = Class110.method2527(var9).field3397;
                  if (var10 >= 0) {
                     Client.field816[Client.field724] = Class255.field3246[var10].method4815(false);
                     Client.field805[Client.field724] = var5;
                     Client.field806[Client.field724] = var6;
                     ++Client.field724;
                  }
               }
            }
         }

         Class163.field2014.method5808();
      }

   }

   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-3"
   )
   static void method1921(int var0, int var1) {
      Class172 var2 = Class26.method433(Class169.field2158, Client.field626.field1218);
      var2.field2257.method3687(var0);
      var2.field2257.method3583(var1);
      Client.field626.method1980(var2);
   }
}
