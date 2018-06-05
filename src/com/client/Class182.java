package com.client;
import java.math.BigInteger;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class Class182 extends Class204 {
   @ObfuscatedName("s")
   static int[] field2336 = new int[256];
   @ObfuscatedName("u")
   static long[] field2337;
   @ObfuscatedName("ay")
   static Client field2334;
   @ObfuscatedName("z")
   public byte[] payload;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1093285509
   )
   public int field2339;

   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if ((var0 & 1) == 1) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field2336[var1] = var0;
      }

      field2337 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field2337[var2] = var4;
      }

   }

   public Class182(int var1) {
      this.payload = Class84.method1943(var1);
      this.field2339 = 0;
   }

   public Class182(byte[] var1) {
      this.payload = var1;
      this.field2339 = 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1167762605"
   )
   public void method3531() {
      if (this.payload != null) {
         Class309.method5671(this.payload);
      }

      this.payload = null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "127253271"
   )
   public void method3532(int var1) {
      this.payload[++this.field2339 - 1] = (byte)var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-745758686"
   )
   public void method3755(int var1) {
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 8);
      this.payload[++this.field2339 - 1] = (byte)var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1989229937"
   )
   public void method3534(int var1) {
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 16);
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 8);
      this.payload[++this.field2339 - 1] = (byte)var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1971281074"
   )
   public void method3707(int var1) {
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 24);
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 16);
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 8);
      this.payload[++this.field2339 - 1] = (byte)var1;
   }

   @ObfuscatedName("i")
   public void method3584(long var1) {
      this.payload[++this.field2339 - 1] = (byte)((int)(var1 >> 40));
      this.payload[++this.field2339 - 1] = (byte)((int)(var1 >> 32));
      this.payload[++this.field2339 - 1] = (byte)((int)(var1 >> 24));
      this.payload[++this.field2339 - 1] = (byte)((int)(var1 >> 16));
      this.payload[++this.field2339 - 1] = (byte)((int)(var1 >> 8));
      this.payload[++this.field2339 - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("x")
   public void method3659(long var1) {
      this.payload[++this.field2339 - 1] = (byte)((int)(var1 >> 56));
      this.payload[++this.field2339 - 1] = (byte)((int)(var1 >> 48));
      this.payload[++this.field2339 - 1] = (byte)((int)(var1 >> 40));
      this.payload[++this.field2339 - 1] = (byte)((int)(var1 >> 32));
      this.payload[++this.field2339 - 1] = (byte)((int)(var1 >> 24));
      this.payload[++this.field2339 - 1] = (byte)((int)(var1 >> 16));
      this.payload[++this.field2339 - 1] = (byte)((int)(var1 >> 8));
      this.payload[++this.field2339 - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "873639132"
   )
   public void method3766(boolean var1) {
      this.method3532(var1 ? 1 : 0);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1020478938"
   )
   public void method3699(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field2339 += Class23.method421(var1, 0, var1.length(), this.payload, this.field2339);
         this.payload[++this.field2339 - 1] = 0;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1348251192"
   )
   public void method3540(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.payload[++this.field2339 - 1] = 0;
         this.field2339 += Class23.method421(var1, 0, var1.length(), this.payload, this.field2339);
         this.payload[++this.field2339 - 1] = 0;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;B)V",
      garbageValue = "103"
   )
   public void method3541(CharSequence var1) {
      int var3 = var1.length();
      int var4 = 0;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 <= 127) {
            ++var4;
         } else if (var6 <= 2047) {
            var4 += 2;
         } else {
            var4 += 3;
         }
      }

      this.payload[++this.field2339 - 1] = 0;
      this.method3688(var4);
      var4 = this.field2339;
      byte[] var12 = this.payload;
      int var7 = this.field2339;
      int var8 = var1.length();
      int var9 = var7;

      for(int var10 = 0; var10 < var8; ++var10) {
         char var11 = var1.charAt(var10);
         if (var11 <= 127) {
            var12[var9++] = (byte)var11;
         } else if (var11 <= 2047) {
            var12[var9++] = (byte)(192 | var11 >> 6);
            var12[var9++] = (byte)(128 | var11 & 63);
         } else {
            var12[var9++] = (byte)(224 | var11 >> 12);
            var12[var9++] = (byte)(128 | var11 >> 6 & 63);
            var12[var9++] = (byte)(128 | var11 & 63);
         }
      }

      var5 = var9 - var7;
      this.field2339 = var5 + var4;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "0"
   )
   public void method3542(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.payload[++this.field2339 - 1] = var1[var4];
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1356616575"
   )
   public void method3543(int var1) {
      this.payload[this.field2339 - var1 - 4] = (byte)(var1 >> 24);
      this.payload[this.field2339 - var1 - 3] = (byte)(var1 >> 16);
      this.payload[this.field2339 - var1 - 2] = (byte)(var1 >> 8);
      this.payload[this.field2339 - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1030510523"
   )
   public void method3614(int var1) {
      this.payload[this.field2339 - var1 - 2] = (byte)(var1 >> 8);
      this.payload[this.field2339 - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "2091286553"
   )
   public void method3545(int var1) {
      this.payload[this.field2339 - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1027102667"
   )
   public void method3573(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.method3532(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.method3755(var1 + '耀');
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1319087228"
   )
   public void method3688(int var1) {
      if ((var1 & -128) != 0) {
         if ((var1 & -16384) != 0) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  this.method3532(var1 >>> 28 | 128);
               }

               this.method3532(var1 >>> 21 | 128);
            }

            this.method3532(var1 >>> 14 | 128);
         }

         this.method3532(var1 >>> 7 | 128);
      }

      this.method3532(var1 & 127);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1847684940"
   )
   public int method3544() {
      return this.payload[++this.field2339 - 1] & 255;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "1250297886"
   )
   public byte method3681() {
      return this.payload[++this.field2339 - 1];
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1084016458"
   )
   public int method3550() {
      this.field2339 += 2;
      return (this.payload[this.field2339 - 1] & 255) + ((this.payload[this.field2339 - 2] & 255) << 8);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "0"
   )
   public int method3551() {
      this.field2339 += 2;
      int var1 = (this.payload[this.field2339 - 1] & 255) + ((this.payload[this.field2339 - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "3"
   )
   public int method3552() {
      this.field2339 += 3;
      return ((this.payload[this.field2339 - 3] & 255) << 16) + (this.payload[this.field2339 - 1] & 255) + ((this.payload[this.field2339 - 2] & 255) << 8);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "300519100"
   )
   public int method3671() {
      this.field2339 += 4;
      return ((this.payload[this.field2339 - 3] & 255) << 16) + (this.payload[this.field2339 - 1] & 255) + ((this.payload[this.field2339 - 2] & 255) << 8) + ((this.payload[this.field2339 - 4] & 255) << 24);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "-79725029"
   )
   public long method3554() {
      long var1 = (long)this.method3671() & 4294967295L;
      long var3 = (long)this.method3671() & 4294967295L;
      return (var1 << 32) + var3;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1667163047"
   )
   public boolean method3555() {
      return (this.method3544() & 1) == 1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-38"
   )
   public String method3752() {
      if (this.payload[this.field2339] == 0) {
         ++this.field2339;
         return null;
      } else {
         return this.method3738();
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1431819169"
   )
   public String method3738() {
      int var1 = this.field2339;

      while(this.payload[++this.field2339 - 1] != 0) {
         ;
      }

      int var2 = this.field2339 - var1 - 1;
      return var2 == 0 ? "" : Class78.method1831(this.payload, var1, var2);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "43"
   )
   public String method3558() {
      byte var1 = this.payload[++this.field2339 - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.field2339;

         while(this.payload[++this.field2339 - 1] != 0) {
            ;
         }

         int var3 = this.field2339 - var2 - 1;
         return var3 == 0 ? "" : Class78.method1831(this.payload, var2, var3);
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1097930981"
   )
   public String method3559() {
      byte var1 = this.payload[++this.field2339 - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.method3566();
         if (var2 + this.field2339 > this.payload.length) {
            throw new IllegalStateException("");
         } else {
            byte[] var4 = this.payload;
            int var5 = this.field2339;
            char[] var6 = new char[var2];
            int var7 = 0;
            int var8 = var5;

            int var11;
            for(int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) {
               int var10 = var4[var8++] & 255;
               if (var10 < 128) {
                  if (var10 == 0) {
                     var11 = 65533;
                  } else {
                     var11 = var10;
                  }
               } else if (var10 < 192) {
                  var11 = 65533;
               } else if (var10 < 224) {
                  if (var8 < var9 && (var4[var8] & 192) == 128) {
                     var11 = (var10 & 31) << 6 | var4[var8++] & 63;
                     if (var11 < 128) {
                        var11 = 65533;
                     }
                  } else {
                     var11 = 65533;
                  }
               } else if (var10 < 240) {
                  if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) {
                     var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if (var11 < 2048) {
                        var11 = 65533;
                     }
                  } else {
                     var11 = 65533;
                  }
               } else if (var10 < 248) {
                  if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) {
                     var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if (var11 >= 65536 && var11 <= 1114111) {
                        var11 = 65533;
                     } else {
                        var11 = 65533;
                     }
                  } else {
                     var11 = 65533;
                  }
               } else {
                  var11 = 65533;
               }
            }

            String var3 = new String(var6, 0, var7);
            this.field2339 += var2;
            return var3;
         }
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "35"
   )
   public void method3539(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.payload[++this.field2339 - 1];
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1820753890"
   )
   public int method3561() {
      int var1 = this.payload[this.field2339] & 255;
      return var1 < 128 ? this.method3544() - 64 : this.method3550() - '쀀';
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "-18314"
   )
   public int method3562() {
      int var1 = this.payload[this.field2339] & 255;
      return var1 < 128 ? this.method3544() : this.method3550() - '耀';
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "65"
   )
   public int method3563() {
      int var1 = 0;

      int var2;
      for(var2 = this.method3562(); var2 == 32767; var2 = this.method3562()) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1860852380"
   )
   public int method3611() {
      return this.payload[this.field2339] < 0 ? this.method3671() & Integer.MAX_VALUE : this.method3550();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1133683651"
   )
   public int method3546() {
      if (this.payload[this.field2339] < 0) {
         return this.method3671() & Integer.MAX_VALUE;
      } else {
         int var1 = this.method3550();
         return var1 == 32767 ? -1 : var1;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-179794498"
   )
   public int method3566() {
      byte var1 = this.payload[++this.field2339 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.payload[++this.field2339 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "1224350853"
   )
   public void method3567(int[] var1) {
      int var2 = this.field2339 / 8;
      this.field2339 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method3671();
         int var5 = this.method3671();
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
            var6 += var7;
         }

         this.field2339 -= 8;
         this.method3707(var4);
         this.method3707(var5);
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "2094043910"
   )
   public void method3553(int[] var1) {
      int var2 = this.field2339 / 8;
      this.field2339 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method3671();
         int var5 = this.method3671();
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.field2339 -= 8;
         this.method3707(var4);
         this.method3707(var5);
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "([IIIB)V",
      garbageValue = "30"
   )
   public void method3569(int[] var1, int var2, int var3) {
      int var4 = this.field2339;
      this.field2339 = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method3671();
         int var8 = this.method3671();
         int var9 = 0;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.field2339 -= 8;
         this.method3707(var7);
         this.method3707(var8);
      }

      this.field2339 = var4;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "([IIII)V",
      garbageValue = "-2112776432"
   )
   public void method3570(int[] var1, int var2, int var3) {
      int var4 = this.field2339;
      this.field2339 = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method3671();
         int var8 = this.method3671();
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.field2339 -= 8;
         this.method3707(var7);
         this.method3707(var8);
      }

      this.field2339 = var4;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
      garbageValue = "-2021764687"
   )
   public void method3571(BigInteger var1, BigInteger var2) {
      int var3 = this.field2339;
      this.field2339 = 0;
      byte[] var4 = new byte[var3];
      this.method3539(var4, 0, var3);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.field2339 = 0;
      this.method3755(var7.length);
      this.method3542(var7, 0, var7.length);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "1"
   )
   public int method3572(int var1) {
      int var2 = Class187.method3812(this.payload, var1, this.field2339);
      this.method3707(var2);
      return var2;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-560337220"
   )
   public boolean method3756() {
      this.field2339 -= 4;
      int var1 = Class187.method3812(this.payload, 0, this.field2339);
      int var2 = this.method3671();
      return var2 == var1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "108964368"
   )
   public void method3574(int var1) {
      this.payload[++this.field2339 - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "0"
   )
   public void method3575(int var1) {
      this.payload[++this.field2339 - 1] = (byte)(0 - var1);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2095651768"
   )
   public void method3576(int var1) {
      this.payload[++this.field2339 - 1] = (byte)(128 - var1);
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1015540220"
   )
   public int method3577() {
      return this.payload[++this.field2339 - 1] - 128 & 255;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-333234069"
   )
   public int method3607() {
      return 0 - this.payload[++this.field2339 - 1] & 255;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-667606696"
   )
   public int method3765() {
      return 128 - this.payload[++this.field2339 - 1] & 255;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "-1200890810"
   )
   public byte method3660() {
      return (byte)(this.payload[++this.field2339 - 1] - 128);
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "-1272283600"
   )
   public byte method3610() {
      return (byte)(128 - this.payload[++this.field2339 - 1]);
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-35"
   )
   public void method3582(int var1) {
      this.payload[++this.field2339 - 1] = (byte)var1;
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "1"
   )
   public void method3583(int var1) {
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 8);
      this.payload[++this.field2339 - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "355756817"
   )
   public void method3771(int var1) {
      this.payload[++this.field2339 - 1] = (byte)(var1 + 128);
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-125"
   )
   public int method3585() {
      this.field2339 += 2;
      return ((this.payload[this.field2339 - 1] & 255) << 8) + (this.payload[this.field2339 - 2] & 255);
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1914369906"
   )
   public int method3613() {
      this.field2339 += 2;
      return (this.payload[this.field2339 - 1] - 128 & 255) + ((this.payload[this.field2339 - 2] & 255) << 8);
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "104"
   )
   public int method3646() {
      this.field2339 += 2;
      return ((this.payload[this.field2339 - 1] & 255) << 8) + (this.payload[this.field2339 - 2] - 128 & 255);
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-37"
   )
   public int method3588() {
      this.field2339 += 2;
      int var1 = ((this.payload[this.field2339 - 1] & 255) << 8) + (this.payload[this.field2339 - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-146230491"
   )
   public int method3533() {
      this.field2339 += 2;
      int var1 = ((this.payload[this.field2339 - 1] & 255) << 8) + (this.payload[this.field2339 - 2] - 128 & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "7272657"
   )
   public void method3731(int var1) {
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 8);
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 16);
      this.payload[++this.field2339 - 1] = (byte)var1;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "2079468396"
   )
   public int method3591() {
      this.field2339 += 3;
      return ((this.payload[this.field2339 - 1] & 255) << 8) + ((this.payload[this.field2339 - 3] & 255) << 16) + (this.payload[this.field2339 - 2] & 255);
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "18"
   )
   public void method3687(int var1) {
      this.payload[++this.field2339 - 1] = (byte)var1;
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 8);
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 16);
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "351806005"
   )
   public void method3673(int var1) {
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 8);
      this.payload[++this.field2339 - 1] = (byte)var1;
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 24);
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1686058636"
   )
   public void method3594(int var1) {
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 16);
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 24);
      this.payload[++this.field2339 - 1] = (byte)var1;
      this.payload[++this.field2339 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "2045011915"
   )
   public int method3595() {
      this.field2339 += 4;
      return (this.payload[this.field2339 - 4] & 255) + ((this.payload[this.field2339 - 3] & 255) << 8) + ((this.payload[this.field2339 - 2] & 255) << 16) + ((this.payload[this.field2339 - 1] & 255) << 24);
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-557412257"
   )
   public int method3770() {
      this.field2339 += 4;
      return ((this.payload[this.field2339 - 2] & 255) << 24) + ((this.payload[this.field2339 - 4] & 255) << 8) + (this.payload[this.field2339 - 3] & 255) + ((this.payload[this.field2339 - 1] & 255) << 16);
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1053759299"
   )
   public int method3609() {
      this.field2339 += 4;
      return ((this.payload[this.field2339 - 1] & 255) << 8) + ((this.payload[this.field2339 - 4] & 255) << 16) + (this.payload[this.field2339 - 2] & 255) + ((this.payload[this.field2339 - 3] & 255) << 24);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "604838575"
   )
   public static synchronized long method3547() {
      long var0 = System.currentTimeMillis();
      if (var0 < Class184.field2351) {
         Class184.field2350 += Class184.field2351 - var0;
      }

      Class184.field2351 = var0;
      return var0 + Class184.field2350;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Ljy;",
      garbageValue = "2135304076"
   )
   public static Class266 method3603(int var0) {
      Class266 var1 = (Class266)Class266.field3342.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class266.field3338.method4625(8, var0);
         var1 = new Class266();
         if (var2 != null) {
            var1.method4978(new Class182(var2));
         }

         Class266.field3342.method3983(var1, (long)var0);
         return var1;
      }
   }
}
