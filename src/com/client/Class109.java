package com.client;
import java.io.EOFException;
import java.io.IOException;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class Class109 {
   @ObfuscatedName("gb")
   @ObfuscatedGetter(
      intValue = -616699681
   )
   static int field1431;
   @ObfuscatedName("gx")
   @ObfuscatedGetter(
      intValue = -1361811045
   )
   static int field1428;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ldv;"
   )
   Class110 field1425;
   @ObfuscatedName("w")
   byte[] field1418;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -3424543290675881475L
   )
   long field1417 = -1L;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1746214469
   )
   int field1421;
   @ObfuscatedName("u")
   byte[] field1423;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = 3274252712356881353L
   )
   long field1420 = -1L;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 2034614507
   )
   int field1426 = 0;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      longValue = 3254553962279722903L
   )
   long field1424;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = 2659913085887693439L
   )
   long field1422;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = -1520059601555540455L
   )
   long field1429;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      longValue = -4630283547641529923L
   )
   long field1427;

   @ObfuscatedSignature(
      signature = "(Ldv;II)V"
   )
   public Class109(Class110 var1, int var2, int var3) throws IOException {
      this.field1425 = var1;
      this.field1429 = this.field1422 = var1.method2509();
      this.field1418 = new byte[var2];
      this.field1423 = new byte[var3];
      this.field1424 = 0L;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2129971155"
   )
   public void method2493() throws IOException {
      this.method2482();
      this.field1425.method2507();
   }

   @ObfuscatedName("w")
   public void method2476(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field1424 = var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "711180324"
   )
   public long method2486() {
      return this.field1429;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1031181832"
   )
   public void method2478(byte[] var1) throws IOException {
      this.method2479(var1, 0, var1.length);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1873838718"
   )
   public void method2479(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if (-1L != this.field1420 && this.field1424 >= this.field1420 && this.field1424 + (long)var3 <= (long)this.field1426 + this.field1420) {
            System.arraycopy(this.field1423, (int)(this.field1424 - this.field1420), var1, var2, var3);
            this.field1424 += (long)var3;
            return;
         }

         long var4 = this.field1424;
         int var7 = var3;
         int var8;
         if (this.field1424 >= this.field1417 && this.field1424 < (long)this.field1421 + this.field1417) {
            var8 = (int)((long)this.field1421 - (this.field1424 - this.field1417));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field1418, (int)(this.field1424 - this.field1417), var1, var2, var8);
            this.field1424 += (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.field1418.length) {
            this.field1425.method2514(this.field1424);

            for(this.field1427 = this.field1424; var3 > 0; var3 -= var8) {
               var8 = this.field1425.method2510(var1, var2, var3);
               if (var8 == -1) {
                  break;
               }

               this.field1427 += (long)var8;
               this.field1424 += (long)var8;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.method2480();
            var8 = var3;
            if (var3 > this.field1421) {
               var8 = this.field1421;
            }

            System.arraycopy(this.field1418, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.field1424 += (long)var8;
         }

         if (-1L != this.field1420) {
            if (this.field1420 > this.field1424 && var3 > 0) {
               var8 = var2 + (int)(this.field1420 - this.field1424);
               if (var8 > var3 + var2) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field1424;
               }
            }

            long var13 = -1L;
            long var10 = -1L;
            if (this.field1420 >= var4 && this.field1420 < var4 + (long)var7) {
               var13 = this.field1420;
            } else if (var4 >= this.field1420 && var4 < this.field1420 + (long)this.field1426) {
               var13 = var4;
            }

            if ((long)this.field1426 + this.field1420 > var4 && this.field1420 + (long)this.field1426 <= var4 + (long)var7) {
               var10 = this.field1420 + (long)this.field1426;
            } else if ((long)var7 + var4 > this.field1420 && var4 + (long)var7 <= (long)this.field1426 + this.field1420) {
               var10 = (long)var7 + var4;
            }

            if (var13 > -1L && var10 > var13) {
               int var12 = (int)(var10 - var13);
               System.arraycopy(this.field1423, (int)(var13 - this.field1420), var1, (int)(var13 - var4) + var2, var12);
               if (var10 > this.field1424) {
                  var3 = (int)((long)var3 - (var10 - this.field1424));
                  this.field1424 = var10;
               }
            }
         }
      } catch (IOException var16) {
         this.field1427 = -1L;
         throw var16;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1728368269"
   )
   void method2480() throws IOException {
      this.field1421 = 0;
      if (this.field1427 != this.field1424) {
         this.field1425.method2514(this.field1424);
         this.field1427 = this.field1424;
      }

      int var1;
      for(this.field1417 = this.field1424; this.field1421 < this.field1418.length; this.field1421 += var1) {
         var1 = this.field1425.method2510(this.field1418, this.field1421, this.field1418.length - this.field1421);
         if (var1 == -1) {
            break;
         }

         this.field1427 += (long)var1;
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1219631347"
   )
   public void method2481(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.field1424 > this.field1429) {
            this.field1429 = (long)var3 + this.field1424;
         }

         if (-1L != this.field1420 && (this.field1424 < this.field1420 || this.field1424 > this.field1420 + (long)this.field1426)) {
            this.method2482();
         }

         if (-1L != this.field1420 && this.field1424 + (long)var3 > (long)this.field1423.length + this.field1420) {
            int var4 = (int)((long)this.field1423.length - (this.field1424 - this.field1420));
            System.arraycopy(var1, var2, this.field1423, (int)(this.field1424 - this.field1420), var4);
            this.field1424 += (long)var4;
            var2 += var4;
            var3 -= var4;
            this.field1426 = this.field1423.length;
            this.method2482();
         }

         if (var3 <= this.field1423.length) {
            if (var3 > 0) {
               if (this.field1420 == -1L) {
                  this.field1420 = this.field1424;
               }

               System.arraycopy(var1, var2, this.field1423, (int)(this.field1424 - this.field1420), var3);
               this.field1424 += (long)var3;
               if (this.field1424 - this.field1420 > (long)this.field1426) {
                  this.field1426 = (int)(this.field1424 - this.field1420);
               }

            }
         } else {
            if (this.field1427 != this.field1424) {
               this.field1425.method2514(this.field1424);
               this.field1427 = this.field1424;
            }

            this.field1425.method2506(var1, var2, var3);
            this.field1427 += (long)var3;
            if (this.field1427 > this.field1422) {
               this.field1422 = this.field1427;
            }

            long var9 = -1L;
            long var6 = -1L;
            if (this.field1424 >= this.field1417 && this.field1424 < this.field1417 + (long)this.field1421) {
               var9 = this.field1424;
            } else if (this.field1417 >= this.field1424 && this.field1417 < this.field1424 + (long)var3) {
               var9 = this.field1417;
            }

            if ((long)var3 + this.field1424 > this.field1417 && (long)var3 + this.field1424 <= (long)this.field1421 + this.field1417) {
               var6 = (long)var3 + this.field1424;
            } else if ((long)this.field1421 + this.field1417 > this.field1424 && this.field1417 + (long)this.field1421 <= this.field1424 + (long)var3) {
               var6 = (long)this.field1421 + this.field1417;
            }

            if (var9 > -1L && var6 > var9) {
               int var8 = (int)(var6 - var9);
               System.arraycopy(var1, (int)(var9 + (long)var2 - this.field1424), this.field1418, (int)(var9 - this.field1417), var8);
            }

            this.field1424 += (long)var3;
         }
      } catch (IOException var12) {
         this.field1427 = -1L;
         throw var12;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-4"
   )
   void method2482() throws IOException {
      if (-1L != this.field1420) {
         if (this.field1420 != this.field1427) {
            this.field1425.method2514(this.field1420);
            this.field1427 = this.field1420;
         }

         this.field1425.method2506(this.field1423, 0, this.field1426);
         this.field1427 += (long)(this.field1426 * 1776216003) * 2034614507L;
         if (this.field1427 > this.field1422) {
            this.field1422 = this.field1427;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.field1420 >= this.field1417 && this.field1420 < this.field1417 + (long)this.field1421) {
            var1 = this.field1420;
         } else if (this.field1417 >= this.field1420 && this.field1417 < (long)this.field1426 + this.field1420) {
            var1 = this.field1417;
         }

         if ((long)this.field1426 + this.field1420 > this.field1417 && this.field1420 + (long)this.field1426 <= (long)this.field1421 + this.field1417) {
            var3 = (long)this.field1426 + this.field1420;
         } else if ((long)this.field1421 + this.field1417 > this.field1420 && (long)this.field1421 + this.field1417 <= (long)this.field1426 + this.field1420) {
            var3 = (long)this.field1421 + this.field1417;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.field1423, (int)(var1 - this.field1420), this.field1418, (int)(var1 - this.field1417), var5);
         }

         this.field1420 = -1L;
         this.field1426 = 0;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lbb;Lbb;IZIZI)I",
      garbageValue = "623148827"
   )
   static int method2503(Class65 var0, Class65 var1, int var2, boolean var3, int var4, boolean var5) {
      int var6 = Class26.method428(var0, var1, var2, var3);
      if (var6 != 0) {
         return var3 ? -var6 : var6;
      } else if (var4 == -1) {
         return 0;
      } else {
         int var7 = Class26.method428(var0, var1, var4, var5);
         return var5 ? -var7 : var7;
      }
   }

   @ObfuscatedName("q")
   public static int method2484(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }
}
