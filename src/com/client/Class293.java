package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class Class293 extends Class285 {
   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      signature = "Lkj;"
   )
   static Class298 field3660;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   final Class322 field3656;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lke;"
   )
   final Class288 field3652;
   @ObfuscatedName("e")
   public String field3654 = null;
   @ObfuscatedName("p")
   public String field3655 = null;
   @ObfuscatedName("b")
   public byte field3651;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1049775565
   )
   public int field3657;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1251671567
   )
   int field3658 = 1;

   @ObfuscatedSignature(
      signature = "(Llm;Lke;)V"
   )
   public Class293(Class322 var1, Class288 var2) {
      super(100);
      this.field3656 = var1;
      this.field3652 = var2;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Ljx;",
      garbageValue = "2139940378"
   )
   Class282 vmethod5461() {
      return new Class281();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)[Ljx;",
      garbageValue = "828432673"
   )
   Class282[] vmethod5462(int var1) {
      return new Class281[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "191342442"
   )
   final void method5477(String var1) {
      long var5 = 0L;
      int var7 = var1.length();

      for(int var8 = 0; var8 < var7; ++var8) {
         var5 *= 37L;
         char var9 = var1.charAt(var8);
         if (var9 >= 'A' && var9 <= 'Z') {
            var5 += (long)(var9 + 1 - 65);
         } else if (var9 >= 'a' && var9 <= 'z') {
            var5 += (long)(var9 + 1 - 97);
         } else if (var9 >= '0' && var9 <= '9') {
            var5 += (long)(var9 + 27 - 48);
         }

         if (var5 >= 177917621779460413L) {
            break;
         }
      }

      while(var5 % 37L == 0L && 0L != var5) {
         var5 /= 37L;
      }

      String var10 = Class172.method3457(var5);
      if (var10 == null) {
         var10 = "";
      }

      this.field3654 = var10;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1517543240"
   )
   final void method5464(String var1) {
      long var5 = 0L;
      int var7 = var1.length();

      for(int var8 = 0; var8 < var7; ++var8) {
         var5 *= 37L;
         char var9 = var1.charAt(var8);
         if (var9 >= 'A' && var9 <= 'Z') {
            var5 += (long)(var9 + 1 - 65);
         } else if (var9 >= 'a' && var9 <= 'z') {
            var5 += (long)(var9 + 1 - 97);
         } else if (var9 >= '0' && var9 <= '9') {
            var5 += (long)(var9 + 27 - 48);
         }

         if (var5 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var5 % 37L && 0L != var5) {
         var5 /= 37L;
      }

      String var10 = Class172.method3457(var5);
      if (var10 == null) {
         var10 = "";
      }

      this.field3655 = var10;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-107804510"
   )
   public final void method5463(Class182 var1) {
      this.method5464(var1.method3738());
      long var2 = var1.method3554();
      long var5 = var2;
      String var4;
      int var7;
      if (var2 > 0L && var2 < 6582952005840035281L) {
         if (var2 % 37L == 0L) {
            var4 = null;
         } else {
            var7 = 0;

            for(long var8 = var2; 0L != var8; var8 /= 37L) {
               ++var7;
            }

            StringBuilder var10 = new StringBuilder(var7);

            while(var5 != 0L) {
               long var11 = var5;
               var5 /= 37L;
               var10.append(Class303.field3720[(int)(var11 - var5 * 37L)]);
            }

            var4 = var10.reverse().toString();
         }
      } else {
         var4 = null;
      }

      this.method5477(var4);
      this.field3651 = var1.method3681();
      var7 = var1.method3544();
      if (var7 != 255) {
         this.method5326();

         for(int var13 = 0; var13 < var7; ++var13) {
            Class281 var9 = (Class281)this.method5377(new Class291(var1.method3738(), this.field3656));
            int var14 = var1.method3550();
            var9.method5412(var14, ++this.field3658 - 1);
            var9.field3629 = var1.method3681();
            var1.method3738();
            this.method5482(var9);
         }

      }
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "345415230"
   )
   public final void method5489(Class182 var1) {
      Class291 var2 = new Class291(var1.method3738(), this.field3656);
      int var3 = var1.method3550();
      byte var4 = var1.method3681();
      boolean var5 = false;
      if (var4 == -128) {
         var5 = true;
      }

      Class281 var6;
      if (var5) {
         if (this.method5327() == 0) {
            return;
         }

         var6 = (Class281)this.method5331(var2);
         if (var6 != null && var6.method5414() == var3) {
            this.method5334(var6);
         }
      } else {
         var1.method3738();
         var6 = (Class281)this.method5331(var2);
         if (var6 == null) {
            if (this.method5327() > super.field3620) {
               return;
            }

            var6 = (Class281)this.method5377(var2);
         }

         var6.method5412(var3, ++this.field3658 - 1);
         var6.field3629 = var4;
         this.method5482(var6);
      }

   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-54"
   )
   public final void method5467() {
      for(int var1 = 0; var1 < this.method5327(); ++var1) {
         ((Class281)this.method5336(var1)).method5272();
      }

   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "453420624"
   )
   public final void method5468() {
      for(int var1 = 0; var1 < this.method5327(); ++var1) {
         ((Class281)this.method5336(var1)).method5273();
      }

   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      signature = "(Ljz;I)V",
      garbageValue = "-1325604678"
   )
   final void method5482(Class281 var1) {
      if (var1.method5287().equals(this.field3652.vmethod5420())) {
         this.field3657 = var1.field3629;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(CB)Z",
      garbageValue = "-34"
   )
   public static boolean method5496(char var0) {
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 != 0) {
            char[] var1 = Class301.field3714;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }
}
