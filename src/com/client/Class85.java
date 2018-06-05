package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public class Class85 extends Class127 {
   @ObfuscatedName("gc")
   @ObfuscatedGetter(
      intValue = -127094665
   )
   static int field1201;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -718862821
   )
   int field1207;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 715597741
   )
   int field1204;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 811632703
   )
   int field1200;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 263990655
   )
   int field1206;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1730539295
   )
   int field1198;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2035092851
   )
   int field1203;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Ljn;"
   )
   Class273 field1202;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1387682185
   )
   int field1205;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -71136025
   )
   int field1199;

   @ObfuscatedSignature(
      signature = "(IIIIIIIZLdf;)V"
   )
   Class85(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Class127 var9) {
      this.field1207 = var1;
      this.field1204 = var2;
      this.field1200 = var3;
      this.field1206 = var4;
      this.field1198 = var5;
      this.field1203 = var6;
      if (var7 != -1) {
         this.field1202 = Class3.method25(var7);
         this.field1205 = 0;
         this.field1199 = Client.field591 - 1;
         if (this.field1202.field3553 == 0 && var9 != null && var9 instanceof Class85) {
            Class85 var10 = (Class85)var9;
            if (this.field1202 == var10.field1202) {
               this.field1205 = var10.field1205;
               this.field1199 = var10.field1199;
               return;
            }
         }

         if (var8 && this.field1202.field3544 != -1) {
            this.field1205 = (int)(Math.random() * (double)this.field1202.field3540.length);
            this.field1199 -= (int)(Math.random() * (double)this.field1202.field3541[this.field1205]);
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
   )
   protected final Class119 vmethod3067() {
      if (this.field1202 != null) {
         int var1 = Client.field591 - this.field1199;
         if (var1 > 100 && this.field1202.field3544 > 0) {
            var1 = 100;
         }

         label55: {
            do {
               do {
                  if (var1 <= this.field1202.field3541[this.field1205]) {
                     break label55;
                  }

                  var1 -= this.field1202.field3541[this.field1205];
                  ++this.field1205;
               } while(this.field1205 < this.field1202.field3540.length);

               this.field1205 -= this.field1202.field3544;
            } while(this.field1205 >= 0 && this.field1205 < this.field1202.field3540.length);

            this.field1202 = null;
         }

         this.field1199 = Client.field591 - var1;
      }

      Class268 var12 = Class110.method2527(this.field1207);
      if (var12.field3410 != null) {
         var12 = var12.method5056();
      }

      if (var12 == null) {
         return null;
      } else {
         int var2;
         int var3;
         if (this.field1200 != 1 && this.field1200 != 3) {
            var2 = var12.field3384;
            var3 = var12.field3385;
         } else {
            var2 = var12.field3385;
            var3 = var12.field3384;
         }

         int var4 = (var2 >> 1) + this.field1198;
         int var5 = (var2 + 1 >> 1) + this.field1198;
         int var6 = (var3 >> 1) + this.field1203;
         int var7 = (var3 + 1 >> 1) + this.field1203;
         int[][] var8 = Class50.field459[this.field1206];
         int var9 = var8[var5][var7] + var8[var4][var7] + var8[var5][var6] + var8[var4][var6] >> 2;
         int var10 = (this.field1198 << 7) + (var2 << 6);
         int var11 = (this.field1203 << 7) + (var3 << 6);
         return var12.method5032(this.field1204, this.field1200, var8, var10, var9, var11, this.field1202, this.field1205);
      }
   }

   @ObfuscatedName("fy")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   static final void method1962() {
      int var0;
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      if (Client.field655 == 0) {
         var0 = Class138.field1876.field931;
         var1 = Class138.field1876.field881;
         if (Class109.field1428 - var0 < -500 || Class109.field1428 - var0 > 500 || Class2.field23 - var1 < -500 || Class2.field23 - var1 > 500) {
            Class109.field1428 = var0;
            Class2.field23 = var1;
         }

         if (var0 != Class109.field1428) {
            Class109.field1428 += (var0 - Class109.field1428) / 16;
         }

         if (var1 != Class2.field23) {
            Class2.field23 += (var1 - Class2.field23) / 16;
         }

         var2 = Class109.field1428 >> 7;
         var3 = Class2.field23 >> 7;
         var4 = Class27.method460(Class109.field1428, Class2.field23, Class13.field82);
         var5 = 0;
         int var6;
         if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for(var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
               for(int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
                  int var8 = Class13.field82;
                  if (var8 < 3 && (Class50.field443[1][var6][var7] & 2) == 2) {
                     ++var8;
                  }

                  int var9 = var4 - Class50.field459[var8][var6][var7];
                  if (var9 > var5) {
                     var5 = var9;
                  }
               }
            }
         }

         var6 = var5 * 192;
         if (var6 > 98048) {
            var6 = 98048;
         }

         if (var6 < 32768) {
            var6 = 32768;
         }

         if (var6 > Client.field738) {
            Client.field738 += (var6 - Client.field738) / 24;
         } else if (var6 < Client.field738) {
            Client.field738 += (var6 - Client.field738) / 80;
         }

         Class269.field3478 = Class27.method460(Class138.field1876.field931, Class138.field1876.field881, Class13.field82) - Client.field644;
      } else if (Client.field655 == 1) {
         Class181.method3527();
         short var10 = -1;
         if (Class39.field341[33]) {
            var10 = 0;
         } else if (Class39.field341[49]) {
            var10 = 1024;
         }

         if (Class39.field341[48]) {
            if (var10 == 0) {
               var10 = 1792;
            } else if (var10 == 1024) {
               var10 = 1280;
            } else {
               var10 = 1536;
            }
         } else if (Class39.field341[50]) {
            if (var10 == 0) {
               var10 = 256;
            } else if (var10 == 1024) {
               var10 = 768;
            } else {
               var10 = 512;
            }
         }

         byte var11 = 0;
         if (Class39.field341[35]) {
            var11 = -1;
         } else if (Class39.field341[51]) {
            var11 = 1;
         }

         var2 = 0;
         if (var10 >= 0 || var11 != 0) {
            var2 = Class39.field341[81] ? Client.field661 : Client.field750;
            var2 *= 16;
            Client.field613 = var10;
            Client.field659 = var11;
         }

         if (Client.field657 < var2) {
            Client.field657 += var2 / 8;
            if (Client.field657 > var2) {
               Client.field657 = var2;
            }
         } else if (Client.field657 > var2) {
            Client.field657 = Client.field657 * 9 / 10;
         }

         if (Client.field657 > 0) {
            var3 = Client.field657 / 16;
            if (Client.field613 >= 0) {
               var0 = Client.field613 - field1201 & 2047;
               var4 = Class122.field1681[var0];
               var5 = Class122.field1693[var0];
               Class109.field1428 += var4 * var3 / 65536;
               Class2.field23 += var3 * var5 / 65536;
            }

            if (Client.field659 != 0) {
               Class269.field3478 += var3 * Client.field659;
               if (Class269.field3478 > 0) {
                  Class269.field3478 = 0;
               }
            }
         } else {
            Client.field613 = -1;
            Client.field659 = -1;
         }

         if (Class39.field341[13]) {
            Client.field626.method1980(Class26.method433(ClientPackets.field2142, Client.field626.field1218));
            Client.field655 = 0;
         }
      }

      if (Class48.field419 == 4 && Class253.field3229) {
         var0 = Class48.field426 * 673804999 - Client.field654;
         Client.field652 = var0 * 2;
         Client.field654 = var0 != -1 && var0 != 1 ? (Class48.field426 * 673804999 + Client.field654) / 2 : Class48.field426 * 673804999;
         var1 = Client.field653 - Class48.field425;
         Client.field608 = var1 * 2;
         Client.field653 = var1 != -1 && var1 != 1 ? (Class48.field425 + Client.field653) / 2 : Class48.field425;
      } else {
         if (Class39.field341[96]) {
            Client.field608 += (-24 - Client.field608) / 2;
         } else if (Class39.field341[97]) {
            Client.field608 += (24 - Client.field608) / 2;
         } else {
            Client.field608 /= 2;
         }

         if (Class39.field341[98]) {
            Client.field652 += (12 - Client.field652) / 2;
         } else if (Class39.field341[99]) {
            Client.field652 += (-12 - Client.field652) / 2;
         } else {
            Client.field652 /= 2;
         }

         Client.field654 = Class48.field426 * 673804999;
         Client.field653 = Class48.field425;
      }

      Client.field717 = Client.field608 / 2 + Client.field717 & 2047;
      Client.field649 += Client.field652 / 2;
      if (Client.field649 < 128) {
         Client.field649 = 128;
      }

      if (Client.field649 > 383) {
         Client.field649 = 383;
      }

   }
}
