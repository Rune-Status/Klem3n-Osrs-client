package com.client;
import java.util.Random;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class Class324 extends Class204 {
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -438996515
   )
   int field3911;
   @ObfuscatedName("k")
   boolean field3892;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -778326201
   )
   int field3895;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1703178915
   )
   int field3896;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 2041961125
   )
   int field3897;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1684217887
   )
   int field3898;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 546169143
   )
   int field3900;
   @ObfuscatedName("ac")
   boolean field3891;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1784732867
   )
   int field3901;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 170995375
   )
   int field3902;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -397278319
   )
   int field3906;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 7624373
   )
   int field3904;
   @ObfuscatedName("ae")
   String field3905;
   @ObfuscatedName("az")
   String field3914;
   @ObfuscatedName("aq")
   String field3907;
   @ObfuscatedName("ad")
   String field3908;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -2092428531
   )
   int field3909;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1126186449
   )
   int field3910;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1538474183
   )
   int field3889;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 351520139
   )
   int field3912;
   @ObfuscatedName("ag")
   String field3913;
   @ObfuscatedName("bk")
   String field3894;
   @ObfuscatedName("bp")
   int[] field3915 = new int[3];
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1130492829
   )
   int field3916;

   @ObfuscatedSignature(
      signature = "(Z)V",
      garbageValue = "1"
   )
   public Class324(boolean var1) {
      if (Class75.field1065.startsWith("win")) {
         this.field3911 = 1;
      } else if (Class75.field1065.startsWith("mac")) {
         this.field3911 = 2;
      } else if (Class75.field1065.startsWith("linux")) {
         this.field3911 = 3;
      } else {
         this.field3911 = 4;
      }

      String var2;
      try {
         var2 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var13) {
         var2 = "";
      }

      String var3;
      try {
         var3 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var12) {
         var3 = "";
      }

      String var4 = "Unknown";
      String var5 = "1.1";

      try {
         var4 = System.getProperty("java.vendor");
         var5 = System.getProperty("java.version");
      } catch (Exception var11) {
         ;
      }

      if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
         this.field3892 = false;
      } else {
         this.field3892 = true;
      }

      if (this.field3911 == 1) {
         if (var3.indexOf("4.0") != -1) {
            this.field3895 = 1;
         } else if (var3.indexOf("4.1") != -1) {
            this.field3895 = 2;
         } else if (var3.indexOf("4.9") != -1) {
            this.field3895 = 3;
         } else if (var3.indexOf("5.0") != -1) {
            this.field3895 = 4;
         } else if (var3.indexOf("5.1") != -1) {
            this.field3895 = 5;
         } else if (var3.indexOf("5.2") != -1) {
            this.field3895 = 8;
         } else if (var3.indexOf("6.0") != -1) {
            this.field3895 = 6;
         } else if (var3.indexOf("6.1") != -1) {
            this.field3895 = 7;
         } else if (var3.indexOf("6.2") != -1) {
            this.field3895 = 9;
         } else if (var3.indexOf("6.3") != -1) {
            this.field3895 = 10;
         } else if (var3.indexOf("10.0") != -1) {
            this.field3895 = 11;
         }
      } else if (this.field3911 == 2) {
         if (var3.indexOf("10.4") != -1) {
            this.field3895 = 20;
         } else if (var3.indexOf("10.5") != -1) {
            this.field3895 = 21;
         } else if (var3.indexOf("10.6") != -1) {
            this.field3895 = 22;
         } else if (var3.indexOf("10.7") != -1) {
            this.field3895 = 23;
         } else if (var3.indexOf("10.8") != -1) {
            this.field3895 = 24;
         } else if (var3.indexOf("10.9") != -1) {
            this.field3895 = 25;
         } else if (var3.indexOf("10.10") != -1) {
            this.field3895 = 26;
         } else if (var3.indexOf("10.11") != -1) {
            this.field3895 = 27;
         }
      }

      if (var4.toLowerCase().indexOf("sun") != -1) {
         this.field3896 = 1;
      } else if (var4.toLowerCase().indexOf("microsoft") != -1) {
         this.field3896 = 2;
      } else if (var4.toLowerCase().indexOf("apple") != -1) {
         this.field3896 = 3;
      } else if (var4.toLowerCase().indexOf("oracle") != -1) {
         this.field3896 = 5;
      } else {
         this.field3896 = 4;
      }

      int var9 = 2;
      int var7 = 0;

      char var8;
      try {
         while(var9 < var5.length()) {
            var8 = var5.charAt(var9);
            if (var8 < '0' || var8 > '9') {
               break;
            }

            var7 = var7 * 10 + (var8 - 48);
            ++var9;
         }
      } catch (Exception var16) {
         ;
      }

      this.field3897 = var7;
      var9 = var5.indexOf(46, 2) + 1;
      var7 = 0;

      try {
         while(var9 < var5.length()) {
            var8 = var5.charAt(var9);
            if (var8 < '0' || var8 > '9') {
               break;
            }

            var7 = var7 * 10 + (var8 - 48);
            ++var9;
         }
      } catch (Exception var15) {
         ;
      }

      this.field3898 = var7;
      var9 = var5.indexOf(95, 4) + 1;
      var7 = 0;

      try {
         while(var9 < var5.length()) {
            var8 = var5.charAt(var9);
            if (var8 < '0' || var8 > '9') {
               break;
            }

            var7 = var7 * 10 + (var8 - 48);
            ++var9;
         }
      } catch (Exception var14) {
         ;
      }

      this.field3900 = var7;
      this.field3891 = false;
      Runtime.getRuntime();
      this.field3901 = (int)((long)((new Random()).nextInt(31457280) + 230686720) / 1048576L) + 1;
      if (this.field3897 > 3) {
         this.field3902 = Runtime.getRuntime().availableProcessors();
      } else {
         this.field3902 = 0;
      }

      this.field3906 = 0;
      if (this.field3905 == null) {
         this.field3905 = "";
      }

      if (this.field3914 == null) {
         this.field3914 = "";
      }

      if (this.field3907 == null) {
         this.field3907 = "";
      }

      if (this.field3908 == null) {
         this.field3908 = "";
      }

      if (this.field3913 == null) {
         this.field3913 = "";
      }

      if (this.field3894 == null) {
         this.field3894 = "";
      }

      this.method6211();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-5446469"
   )
   void method6211() {
      if (this.field3905.length() > 40) {
         this.field3905 = this.field3905.substring(0, 40);
      }

      if (this.field3914.length() > 40) {
         this.field3914 = this.field3914.substring(0, 40);
      }

      if (this.field3907.length() > 10) {
         this.field3907 = this.field3907.substring(0, 10);
      }

      if (this.field3908.length() > 10) {
         this.field3908 = this.field3908.substring(0, 10);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;S)V",
      garbageValue = "8212"
   )
   public void method6217(Class182 var1) {
      var1.method3532(6);
      var1.method3532(this.field3911);
      var1.method3532(this.field3892 ? 1 : 0);
      var1.method3532(this.field3895);
      var1.method3532(this.field3896);
      var1.method3532(this.field3897);
      var1.method3532(this.field3898);
      var1.method3532(this.field3900);
      var1.method3532(this.field3891 ? 1 : 0);
      var1.method3755(this.field3901);
      var1.method3532(this.field3902);
      var1.method3534(this.field3906);
      var1.method3755(this.field3904);
      var1.method3540(this.field3905);
      var1.method3540(this.field3914);
      var1.method3540(this.field3907);
      var1.method3540(this.field3908);
      var1.method3532(this.field3910);
      var1.method3755(this.field3909);
      var1.method3540(this.field3913);
      var1.method3540(this.field3894);
      var1.method3532(this.field3889);
      var1.method3532(this.field3912);

      for(int var2 = 0; var2 < this.field3915.length; ++var2) {
         var1.method3707(this.field3915[var2]);
      }

      var1.method3707(this.field3916);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-782378364"
   )
   public int method6215() {
      byte var1 = 38;
      String var4 = this.field3905;
      int var3 = var4.length() + 2;
      int var20 = var3 + var1;
      String var7 = this.field3914;
      int var6 = var7.length() + 2;
      var20 += var6;
      String var10 = this.field3907;
      int var9 = var10.length() + 2;
      var20 += var9;
      String var13 = this.field3908;
      int var12 = var13.length() + 2;
      var20 += var12;
      String var16 = this.field3913;
      int var15 = var16.length() + 2;
      var20 += var15;
      String var19 = this.field3894;
      int var18 = var19.length() + 2;
      var20 += var18;
      return var20;
   }
}
