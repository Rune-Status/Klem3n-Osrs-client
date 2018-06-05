package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
public final class Class60 extends Class63 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   Class291 field552;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhd;"
   )
   Class227 field546;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1998294681
   )
   int field570 = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1980153081
   )
   int field548 = -1;
   @ObfuscatedName("q")
   String[] field550 = new String[3];
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -2003980775
   )
   int field551;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1248875317
   )
   int field564;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 2078576503
   )
   int field562;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1490301437
   )
   int field545;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1922127141
   )
   int field555;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -479135119
   )
   int field556;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -316850739
   )
   int field557;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 265765217
   )
   int field558;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ldc;"
   )
   Class119 field563;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 668730737
   )
   int field559;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 293985015
   )
   int field547;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1873032529
   )
   int field565;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1295532419
   )
   int field553;
   @ObfuscatedName("y")
   boolean field560;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1403765271
   )
   int field568;
   @ObfuscatedName("j")
   boolean field566;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 723692473
   )
   int field567;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2042887495
   )
   int field574;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lkd;"
   )
   Class289 field569;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lkd;"
   )
   Class289 field554;
   @ObfuscatedName("af")
   boolean field571;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -672131463
   )
   int field572;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 329940333
   )
   int field573;

   Class60() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.field550[var1] = "";
      }

      this.field551 = 0;
      this.field564 = 0;
      this.field545 = 0;
      this.field555 = 0;
      this.field560 = false;
      this.field568 = 0;
      this.field566 = false;
      this.field569 = Class289.field3633;
      this.field554 = Class289.field3633;
      this.field571 = false;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "833204307"
   )
   final void method1082(Class182 var1) {
      var1.field2339 = 0;
      int var2 = var1.readUnsignedByte();
      this.field570 = var1.readByte();
      this.field548 = var1.readByte();
      int var3 = -1;
      this.field568 = 0;
      int[] var4 = new int[12];

      int var6;
      int var7;
      for(int var5 = 0; var5 < 12; ++var5) {
         var6 = var1.readUnsignedByte();
         if (var6 == 0) {
            var4[var5] = 0;
         } else {
            var7 = var1.readUnsignedByte();
            var4[var5] = var7 + (var6 << 8);
            if (var5 == 0 && var4[0] == 65535) {
               var3 = var1.readUnsignedShort();
               break;
            }

            if (var4[var5] >= 512) {
               int var8 = Class111.method2563(var4[var5] - 512).field3462;
               if (var8 != 0) {
                  this.field568 = var8;
               }
            }
         }
      }

      int[] var9 = new int[5];

      for(var6 = 0; var6 < 5; ++var6) {
         var7 = var1.readUnsignedByte();
         if (var7 < 0 || var7 >= Class227.field2572[var6].length) {
            var7 = 0;
         }

         var9[var6] = var7;
      }

      super.field893 = var1.readUnsignedShort();
      if (super.field893 == 65535) {
         super.field893 = -1;
      }

      super.field877 = var1.readUnsignedShort();
      if (super.field877 == 65535) {
         super.field877 = -1;
      }

      super.field878 = super.field877;
      super.field899 = var1.readUnsignedShort();
      if (super.field899 == 65535) {
         super.field899 = -1;
      }

      super.field880 = var1.readUnsignedShort();
      if (super.field880 == 65535) {
         super.field880 = -1;
      }

      super.field870 = var1.readUnsignedShort();
      if (super.field870 == 65535) {
         super.field870 = -1;
      }

      super.field882 = var1.readUnsignedShort();
      if (super.field882 == 65535) {
         super.field882 = -1;
      }

      super.field883 = var1.readUnsignedShort();
      if (super.field883 == 65535) {
         super.field883 = -1;
      }

      this.field552 = new Class291(var1.method3738(), Class36.field306);
      this.method1084();
      this.method1086();
      if (this == Class138.field1876) {
         Class152.field1939 = this.field552.method5447();
      }

      this.field551 = var1.readUnsignedByte();
      this.field564 = var1.readUnsignedShort();
      this.field566 = var1.readUnsignedByte() == 1;
      if (Client.field777 == 0 && Client.field747 >= 2) {
         this.field566 = false;
      }

      if (this.field546 == null) {
         this.field546 = new Class227();
      }

      this.field546.method4462(var4, var9, var2 == 1, var3);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-514053088"
   )
   boolean method1083() {
      if (this.field569 == Class289.field3633) {
         this.method1085();
      }

      return this.field569 == Class289.field3631;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-540228134"
   )
   void method1084() {
      this.field569 = Class289.field3633;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-35"
   )
   void method1085() {
      this.field569 = Class181.field2332.method1637(this.field552) ? Class289.field3631 : Class289.field3634;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1597718431"
   )
   boolean method1104() {
      if (this.field554 == Class289.field3633) {
         this.method1087();
      }

      return this.field554 == Class289.field3631;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "480560408"
   )
   void method1086() {
      this.field554 = Class289.field3633;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1372893329"
   )
   void method1087() {
      this.field554 = Class14.field94 != null && Class14.field94.method5329(this.field552) ? Class289.field3631 : Class289.field3634;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-77"
   )
   int method1088() {
      return this.field546 != null && this.field546.field2569 != -1 ? Class270.method5157(this.field546.field2569).field3497 : 1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
   )
   protected final Class119 vmethod3067() {
      if (this.field546 == null) {
         return null;
      } else {
         Class273 var1 = super.field903 != -1 && super.field906 == 0 ? Class3.method25(super.field903) : null;
         Class273 var2 = super.field900 == -1 || this.field560 || super.field900 == super.field893 && var1 != null ? null : Class3.method25(super.field900);
         Class119 var3 = this.field546.method4468(var1, super.field904, var2, super.field908);
         if (var3 == null) {
            return null;
         } else {
            var3.method2670();
            super.field925 = var3.field1781;
            Class119 var4;
            Class119[] var5;
            if (!this.field560 && super.field891 != -1 && super.field876 != -1) {
               var4 = Class57.method1035(super.field891).method4866(super.field876);
               if (var4 != null) {
                  var4.method2718(0, -super.field871, 0);
                  var5 = new Class119[]{var3, var4};
                  var3 = new Class119(var5, 2);
               }
            }

            if (!this.field560 && this.field563 != null) {
               if (Client.field591 >= this.field555) {
                  this.field563 = null;
               }

               if (Client.field591 >= this.field545 && Client.field591 < this.field555) {
                  var4 = this.field563;
                  var4.method2718(this.field556 - super.field931, this.field557 - this.field562, this.field558 - super.field881);
                  if (super.field926 == 512) {
                     var4.method2677();
                     var4.method2677();
                     var4.method2677();
                  } else if (super.field926 == 1024) {
                     var4.method2677();
                     var4.method2677();
                  } else if (super.field926 == 1536) {
                     var4.method2677();
                  }

                  var5 = new Class119[]{var3, var4};
                  var3 = new Class119(var5, 2);
                  if (super.field926 == 512) {
                     var4.method2677();
                  } else if (super.field926 == 1024) {
                     var4.method2677();
                     var4.method2677();
                  } else if (super.field926 == 1536) {
                     var4.method2677();
                     var4.method2677();
                     var4.method2677();
                  }

                  var4.method2718(super.field931 - this.field556, this.field562 - this.field557, super.field881 - this.field558);
               }
            }

            var3.field1603 = true;
            return var3;
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIBI)V",
      garbageValue = "-1440413395"
   )
   final void method1106(int var1, int var2, byte var3) {
      if (super.field903 != -1 && Class3.method25(super.field903).field3535 == 1) {
         super.field903 = -1;
      }

      super.field920 = -1;
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.field922[0] >= 0 && super.field922[0] < 104 && super.field872[0] >= 0 && super.field872[0] < 104) {
            if (var3 == 2) {
               Class62.method1538(this, var1, var2, (byte)2);
            }

            this.method1105(var1, var2, var3);
         } else {
            this.method1103(var1, var2);
         }
      } else {
         this.method1103(var1, var2);
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-2124327900"
   )
   void method1103(int var1, int var2) {
      super.field909 = 0;
      super.field930 = 0;
      super.field923 = 0;
      super.field922[0] = var1;
      super.field872[0] = var2;
      int var3 = this.method1088();
      super.field931 = var3 * 64 + super.field922[0] * 128;
      super.field881 = var3 * 64 + super.field872[0] * 128;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IIBB)V",
      garbageValue = "12"
   )
   final void method1105(int var1, int var2, byte var3) {
      if (super.field909 < 9) {
         ++super.field909;
      }

      for(int var4 = super.field909; var4 > 0; --var4) {
         super.field922[var4] = super.field922[var4 - 1];
         super.field872[var4] = super.field872[var4 - 1];
         super.field928[var4] = super.field928[var4 - 1];
      }

      super.field922[0] = var1;
      super.field872[0] = var2;
      super.field928[0] = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "5"
   )
   final boolean vmethod1786() {
      return this.field546 != null;
   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1852538691"
   )
   static void method1120(int var0, int var1) {
      Class171.method3451(Class229.field2588, var0, var1);
      Class229.field2588 = null;
   }

   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      signature = "(Lhi;I)V",
      garbageValue = "941710605"
   )
   static void method1114(Class230 var0) {
      if (var0.field2627 == Client.field830) {
         Client.field697[var0.field2737] = true;
      }

   }
}
