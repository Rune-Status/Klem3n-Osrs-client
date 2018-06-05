package com.client;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public final class Class30 {
   @ObfuscatedName("z")
   boolean field272 = false;
   @ObfuscatedName("w")
   boolean field264 = false;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lao;"
   )
   Class33 field265;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   Class318 field266;
   @ObfuscatedName("u")
   HashMap field267;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[[Lh;"
   )
   Class23[][] field268;
   @ObfuscatedName("k")
   HashMap field269 = new HashMap();
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   Class317[] field279;
   @ObfuscatedName("x")
   final HashMap field271;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1298084395
   )
   int field273;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1151941721
   )
   int field278;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -572130391
   )
   int field274;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1931488771
   )
   int field270;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 984068981
   )
   public int field276 = 0;

   @ObfuscatedSignature(
      signature = "([Lly;Ljava/util/HashMap;)V"
   )
   public Class30(Class317[] var1, HashMap var2) {
      this.field279 = var1;
      this.field271 = var2;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;Ljava/lang/String;ZB)V",
      garbageValue = "2"
   )
   public void method490(Class247 var1, String var2, boolean var3) {
      if (!this.field264) {
         this.field272 = false;
         this.field264 = true;
         System.nanoTime();
         int var4 = var1.method4642(Class29.field252.field255);
         int var5 = var1.method4643(var4, var2);
         Class182 var6 = new Class182(var1.method4684(Class29.field252.field255, var2));
         Class182 var7 = new Class182(var1.method4684(Class29.field251.field255, var2));
         Class182 var8 = new Class182(var1.method4684(var2, Class29.field262.field255));
         System.nanoTime();
         System.nanoTime();
         this.field265 = new Class33();

         try {
            this.field265.method550(var6, var8, var7, var5, var3);
         } catch (IllegalStateException var20) {
            return;
         }

         this.field265.method217();
         this.field265.method218();
         this.field265.method219();
         this.field273 = this.field265.method258() * 64;
         this.field278 = this.field265.method247() * 64;
         this.field274 = (this.field265.method214() - this.field265.method258() + 1) * 64;
         this.field270 = (this.field265.method249() - this.field265.method247() + 1) * 64;
         int var17 = this.field265.method214() - this.field265.method258() + 1;
         int var10 = this.field265.method249() - this.field265.method247() + 1;
         System.nanoTime();
         System.nanoTime();
         Class23.field188.method4006();
         Class23.field189.method4006();
         this.field268 = new Class23[var17][var10];
         Iterator var11 = this.field265.field292.iterator();

         while(var11.hasNext()) {
            Class10 var12 = (Class10)var11.next();
            int var13 = var12.field127;
            int var14 = var12.field117;
            int var15 = var13 - this.field265.method258();
            int var16 = var14 - this.field265.method247();
            this.field268[var15][var16] = new Class23(var13, var14, this.field265.method211(), this.field271);
            this.field268[var15][var16].method400(var12, this.field265.field290);
         }

         for(int var18 = 0; var18 < var17; ++var18) {
            for(int var19 = 0; var19 < var10; ++var19) {
               if (this.field268[var18][var19] == null) {
                  this.field268[var18][var19] = new Class23(this.field265.method258() + var18, this.field265.method247() + var19, this.field265.method211(), this.field271);
                  this.field268[var18][var19].method287(this.field265.field291, this.field265.field290);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.method4644(Class29.field257.field255, var2)) {
            byte[] var21 = var1.method4684(Class29.field257.field255, var2);
            this.field266 = Class284.method5324(var21);
         }

         System.nanoTime();
         var1.method4702();
         var1.method4640();
         this.field272 = true;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-109"
   )
   public final void method482() {
      this.field267 = null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIB)V",
      garbageValue = "-102"
   )
   public final void method483(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = Class314.field3766;
      int var10 = Class314.field3761;
      int var11 = Class314.field3762;
      int[] var12 = new int[4];
      Class314.method5722(var12);
      Class17 var13 = this.method518(var1, var2, var3, var4);
      float var14 = this.method492(var7 - var5, var3 - var1);
      int var15 = (int)Math.ceil((double)var14);
      this.field276 = var15;
      if (!this.field269.containsKey(var15)) {
         Class35 var16 = new Class35(var15);
         var16.method592();
         this.field269.put(var15, var16);
      }

      Class23[] var22 = new Class23[8];

      int var17;
      int var18;
      for(var17 = var13.field132; var17 < var13.field132 + var13.field131; ++var17) {
         for(var18 = var13.field134; var18 < var13.field134 + var13.field133; ++var18) {
            this.method485(var17, var18, var22);
            this.field268[var17][var18].method290(var15, (Class35)this.field269.get(var15), var22, this.field279);
         }
      }

      Class314.method5718(var9, var10, var11);
      Class314.method5723(var12);
      var17 = (int)(64.0F * var14);
      var18 = this.field273 + var1;
      int var19 = var2 + this.field278;

      for(int var20 = var13.field132; var20 < var13.field131 + var13.field132; ++var20) {
         for(int var21 = var13.field134; var21 < var13.field133 + var13.field134; ++var21) {
            this.field268[var20][var21].method314(var5 + var17 * (this.field268[var20][var21].field191 * 64 - var18) / 64, var8 - var17 * (this.field268[var20][var21].field192 * 64 - var19 + 64) / 64, var17);
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
      garbageValue = "-1738532416"
   )
   public final void method491(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      Class17 var14 = this.method518(var1, var2, var3, var4);
      float var15 = this.method492(var7 - var5, var3 - var1);
      int var16 = (int)(var15 * 64.0F);
      int var17 = this.field273 + var1;
      int var18 = var2 + this.field278;

      int var19;
      int var20;
      for(var19 = var14.field132; var19 < var14.field132 + var14.field131; ++var19) {
         for(var20 = var14.field134; var20 < var14.field134 + var14.field133; ++var20) {
            if (var13) {
               this.field268[var19][var20].method340();
            }

            this.field268[var19][var20].method382(var5 + var16 * (this.field268[var19][var20].field191 * 64 - var17) / 64, var8 - var16 * (this.field268[var19][var20].field192 * 64 - var18 + 64) / 64, var16, var9);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = var14.field132; var19 < var14.field132 + var14.field131; ++var19) {
            for(var20 = var14.field134; var20 < var14.field133 + var14.field134; ++var20) {
               this.field268[var19][var20].method311(var10, var11, var12);
            }
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II[Lh;I)V",
      garbageValue = "1440038510"
   )
   void method485(int var1, int var2, Class23[] var3) {
      boolean var4 = var1 <= 0;
      boolean var5 = var1 >= this.field268.length - 1;
      boolean var6 = var2 <= 0;
      boolean var7 = var2 >= this.field268[0].length - 1;
      if (var7) {
         var3[Class240.field3101.vmethod5815()] = null;
      } else {
         var3[Class240.field3101.vmethod5815()] = this.field268[var1][var2 + 1];
      }

      var3[Class240.field3107.vmethod5815()] = !var7 && !var5 ? this.field268[var1 + 1][var2 + 1] : null;
      var3[Class240.field3103.vmethod5815()] = !var7 && !var4 ? this.field268[var1 - 1][var2 + 1] : null;
      var3[Class240.field3097.vmethod5815()] = var5 ? null : this.field268[var1 + 1][var2];
      var3[Class240.field3102.vmethod5815()] = var4 ? null : this.field268[var1 - 1][var2];
      var3[Class240.field3100.vmethod5815()] = var6 ? null : this.field268[var1][var2 - 1];
      var3[Class240.field3099.vmethod5815()] = !var6 && !var5 ? this.field268[var1 + 1][var2 - 1] : null;
      var3[Class240.field3098.vmethod5815()] = !var6 && !var4 ? this.field268[var1 - 1][var2 - 1] : null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIIILjava/util/HashSet;III)V",
      garbageValue = "2097379080"
   )
   public void method486(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (this.field266 != null) {
         this.field266.method5853(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field267 == null) {
               this.method505();
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.field267.get(var9);
               } while(var10 == null);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  Class28 var12 = (Class28)var11.next();
                  int var13 = var3 * (var12.field236.field2564 - this.field273) / this.field274;
                  int var14 = var4 - (var12.field236.field2565 - this.field278) * var4 / this.field270;
                  Class314.method5784(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIIII)Ljava/util/List;",
      garbageValue = "-1764374656"
   )
   public List method487(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.field272) {
         return var11;
      } else {
         Class17 var12 = this.method518(var1, var2, var3, var4);
         float var13 = this.method492(var7, var3 - var1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.field273 + var1;
         int var16 = var2 + this.field278;

         for(int var17 = var12.field132; var17 < var12.field132 + var12.field131; ++var17) {
            for(int var18 = var12.field134; var18 < var12.field134 + var12.field133; ++var18) {
               List var19 = this.field268[var17][var18].method319(var5 + var14 * (this.field268[var17][var18].field191 * 64 - var15) / 64, var8 + var6 - var14 * (this.field268[var17][var18].field192 * 64 - var16 + 64) / 64, var14, var9, var10);
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIIS)Lt;",
      garbageValue = "1596"
   )
   Class17 method518(int var1, int var2, int var3, int var4) {
      Class17 var5 = new Class17(this);
      int var6 = this.field273 + var1;
      int var7 = var2 + this.field278;
      int var8 = var3 + this.field273;
      int var9 = var4 + this.field278;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.field131 = var12 - var10 + 1;
      var5.field133 = var13 - var11 + 1;
      var5.field132 = var10 - this.field265.method258();
      var5.field134 = var11 - this.field265.method247();
      if (var5.field132 < 0) {
         var5.field131 += var5.field132;
         var5.field132 = 0;
      }

      if (var5.field132 > this.field268.length - var5.field131) {
         var5.field131 = this.field268.length - var5.field132;
      }

      if (var5.field134 < 0) {
         var5.field133 += var5.field134;
         var5.field134 = 0;
      }

      if (var5.field134 > this.field268[0].length - var5.field133) {
         var5.field133 = this.field268[0].length - var5.field134;
      }

      var5.field131 = Math.min(var5.field131, this.field268.length);
      var5.field133 = Math.min(var5.field133, this.field268[0].length);
      return var5;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2090974664"
   )
   public boolean method513() {
      return this.field272;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Ljava/util/HashMap;",
      garbageValue = "-63"
   )
   public HashMap method489() {
      this.method505();
      return this.field267;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "21"
   )
   void method505() {
      if (this.field267 == null) {
         this.field267 = new HashMap();
      }

      this.field267.clear();

      for(int var1 = 0; var1 < this.field268.length; ++var1) {
         for(int var2 = 0; var2 < this.field268[var1].length; ++var2) {
            List var3 = this.field268[var1][var2].method356();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               Class28 var5 = (Class28)var4.next();
               if (!this.field267.containsKey(var5.field240)) {
                  LinkedList var6 = new LinkedList();
                  var6.add(var5);
                  this.field267.put(var5.field240, var6);
               } else {
                  List var7 = (List)this.field267.get(var5.field240);
                  var7.add(var5);
               }
            }
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(III)F",
      garbageValue = "-168004314"
   )
   float method492(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1780304289"
   )
   static final int method519(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-28"
   )
   static void method484() {
      Client.field626.method1978();
      Client.field626.field1219.field2339 = 0;
      Client.field626.recievedPacket = null;
      Client.field626.field1215 = null;
      Client.field626.field1226 = null;
      Client.field626.field1227 = null;
      Client.field626.packetSize = 0;
      Client.field626.field1228 = 0;
      Client.field598 = 0;
      Client.field771 = 0;
      Client.field716 = false;
      Client.field810 = 0;
      Client.field808 = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         Client.field610[var0] = null;
      }

      Class138.field1876 = null;

      for(var0 = 0; var0 < Client.field843.length; ++var0) {
         Class72 var1 = Client.field843[var0];
         if (var1 != null) {
            var1.field897 = -1;
            var1.field898 = false;
         }
      }

      Class53.field474 = new Class202(32);
      Class48.method947(30);

      for(var0 = 0; var0 < 100; ++var0) {
         Client.field697[var0] = true;
      }

      Class172 var3 = Class26.method433(Class169.field2215, Client.field626.field1218);
      Class189 var4 = var3.field2257;
      int var2 = Client.field792 ? 2 : 1;
      var4.method3532(var2);
      var3.field2257.method3755(Class82.field1179);
      var3.field2257.method3755(Class243.field3138);
      Client.field626.method1980(var3);
   }

   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-248203091"
   )
   static final void method516() {
      if (Client.field627 > 0) {
         Class97.method2213();
      } else {
         Client.field804.method5262();
         Class48.method947(40);
         Class62.field869 = Client.field626.method1983();
         Client.field626.method1984();
      }
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      signature = "(ZLgi;I)V",
      garbageValue = "993240466"
   )
   static final void method500(boolean var0, Class189 var1) {
      while(true) {
         if (var1.method3825(Client.field626.packetSize) >= 27) {
            int var2 = var1.method3817(15);
            if (var2 != 32767) {
               boolean var3 = false;
               if (Client.field843[var2] == null) {
                  Client.field843[var2] = new Class72();
                  var3 = true;
               }

               Class72 var4 = Client.field843[var2];
               Client.field639[++Client.field622 - 1] = var2;
               var4.field914 = Client.field591;
               int var5;
               if (var0) {
                  var5 = var1.method3817(8);
                  if (var5 > 127) {
                     var5 -= 256;
                  }
               } else {
                  var5 = var1.method3817(5);
                  if (var5 > 15) {
                     var5 -= 32;
                  }
               }

               int var6 = Client.field706[var1.method3817(3)];
               if (var3) {
                  var4.field926 = var4.field905 = var6;
               }

               int var7 = var1.method3817(1);
               int var8;
               if (var0) {
                  var8 = var1.method3817(8);
                  if (var8 > 127) {
                     var8 -= 256;
                  }
               } else {
                  var8 = var1.method3817(5);
                  if (var8 > 15) {
                     var8 -= 32;
                  }
               }

               var4.field1037 = Class270.method5157(var1.method3817(14));
               int var9 = var1.method3817(1);
               if (var9 == 1) {
                  Client.field666[++Client.field624 - 1] = var2;
               }

               var4.field874 = var4.field1037.field3497;
               var4.field924 = var4.field1037.field3500;
               if (var4.field924 == 0) {
                  var4.field905 = 0;
               }

               var4.field899 = var4.field1037.field3498;
               var4.field880 = var4.field1037.field3495;
               var4.field870 = var4.field1037.field3502;
               var4.field882 = var4.field1037.field3501;
               var4.field893 = var4.field1037.field3519;
               var4.field877 = var4.field1037.field3496;
               var4.field878 = var4.field1037.field3486;
               var4.method1788(Class138.field1876.field922[0] + var5, Class138.field1876.field872[0] + var8, var7 == 1);
               continue;
            }
         }

         var1.method3816();
         return;
      }
   }
}
