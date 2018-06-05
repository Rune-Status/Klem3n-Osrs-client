package com.client;
import java.io.IOException;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class Class14 implements Class31 {
   @ObfuscatedName("oa")
   @ObfuscatedSignature(
      signature = "Lkn;"
   )
   static Class293 field94;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 892739819
   )
   static int field104;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1521413561
   )
   int field100;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1962269323
   )
   int field90;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1724489905
   )
   int field91;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -691106019
   )
   int field102;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1912646943
   )
   int field93;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1042718987
   )
   int field96;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -476751
   )
   int field95;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -129967555
   )
   int field105;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -892770797
   )
   int field97;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1390874549
   )
   int field98;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -495225415
   )
   int field99;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1910350211
   )
   int field89;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 2005192815
   )
   int field101;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -57751229
   )
   int field103;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(La;B)V",
      garbageValue = "-105"
   )
   public void vmethod635(Class20 var1) {
      if (var1.field166 > this.field93) {
         var1.field166 = this.field93;
      }

      if (var1.field167 < this.field93) {
         var1.field167 = this.field93;
      }

      if (var1.field168 > this.field96) {
         var1.field168 = this.field96;
      }

      if (var1.field162 < this.field96) {
         var1.field162 = this.field96;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "2090621319"
   )
   public boolean vmethod636(int var1, int var2, int var3) {
      if (var1 >= this.field100 && var1 < this.field90 + this.field100) {
         return var2 >= (this.field91 << 6) + (this.field95 << 3) && var2 <= (this.field91 << 6) + (this.field97 << 3) + 7 && var3 >= (this.field102 << 6) + (this.field105 << 3) && var3 <= (this.field102 << 6) + (this.field98 << 3) + 7;
      } else {
         return false;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-658565537"
   )
   public boolean vmethod637(int var1, int var2) {
      return var1 >= (this.field93 << 6) + (this.field99 << 3) && var1 <= (this.field93 << 6) + (this.field101 << 3) + 7 && var2 >= (this.field96 << 6) + (this.field89 << 3) && var2 <= (this.field96 << 6) + (this.field103 << 3) + 7;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "56"
   )
   public int[] vmethod638(int var1, int var2, int var3) {
      if (!this.vmethod636(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field93 * 64 - this.field91 * 64 + var2 + (this.field99 * 8 - this.field95 * 8), var3 + (this.field96 * 64 - this.field102 * 64) + (this.field89 * 8 - this.field105 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(III)Lha;",
      garbageValue = "2128900046"
   )
   public Class226 vmethod659(int var1, int var2) {
      if (!this.vmethod637(var1, var2)) {
         return null;
      } else {
         int var3 = this.field91 * 64 - this.field93 * 64 + (this.field95 * 8 - this.field99 * 8) + var1;
         int var4 = this.field102 * 64 - this.field96 * 64 + var2 + (this.field105 * 8 - this.field89 * 8);
         return new Class226(this.field100, var3, var4);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-40"
   )
   public void vmethod639(Class182 var1) {
      this.field100 = var1.method3544();
      this.field90 = var1.method3544();
      this.field91 = var1.method3550();
      this.field95 = var1.method3544();
      this.field97 = var1.method3544();
      this.field102 = var1.method3550();
      this.field105 = var1.method3544();
      this.field98 = var1.method3544();
      this.field93 = var1.method3550();
      this.field99 = var1.method3544();
      this.field101 = var1.method3544();
      this.field96 = var1.method3550();
      this.field89 = var1.method3544();
      this.field103 = var1.method3544();
      this.method121();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "87"
   )
   void method121() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Ljp;",
      garbageValue = "46"
   )
   public static Class267 method123(int var0) {
      Class267 var1 = (Class267)Class267.field3349.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class267.field3367.method4625(32, var0);
         var1 = new Class267();
         if (var2 != null) {
            var1.method4990(new Class182(var2));
         }

         Class267.field3349.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-1981801988"
   )
   static int method139(int var0, Class84 var1, boolean var2) {
      if (var0 == 5000) {
         Class69.field999[++Class69.field1003 - 1] = Client.field630;
         return 1;
      } else if (var0 == 5001) {
         Class69.field1003 -= 3;
         Client.field630 = Class69.field999[Class69.field1003];
         Class143.field1899 = Class189.method3847(Class69.field999[Class69.field1003 + 1]);
         if (Class143.field1899 == null) {
            Class143.field1899 = Class307.field3734;
         }

         Client.field795 = Class69.field999[Class69.field1003 + 2];
         Class172 var22 = Class26.method433(Class169.field2192, Client.field626.field1218);
         var22.field2257.method3532(Client.field630);
         var22.field2257.method3532(Class143.field1899.field3735);
         var22.field2257.method3532(Client.field795);
         Client.field626.method1980(var22);
         return 1;
      } else {
         String var3;
         int var4;
         int var5;
         if (var0 == 5002) {
            var3 = Class69.field1001[--Class55.field497];
            Class69.field1003 -= 2;
            var4 = Class69.field999[Class69.field1003];
            var5 = Class69.field999[Class69.field1003 + 1];
            Class172 var15 = Class26.method433(Class169.field2185, Client.field626.field1218);
            var15.field2257.method3532(Class316.method5820(var3) + 2);
            var15.field2257.method3699(var3);
            var15.field2257.method3532(var4 - 1);
            var15.field2257.method3532(var5);
            Client.field626.method1980(var15);
            return 1;
         } else {
            int var10;
            if (var0 == 5003) {
               Class69.field1003 -= 2;
               var10 = Class69.field999[Class69.field1003];
               var4 = Class69.field999[Class69.field1003 + 1];
               Class86 var6 = (Class86)Class83.field1180.get(var10);
               Class58 var17 = var6.method1965(var4);
               if (var17 != null) {
                  Class69.field999[++Class69.field1003 - 1] = var17.field540;
                  Class69.field999[++Class69.field1003 - 1] = var17.field535;
                  Class69.field1001[++Class55.field497 - 1] = var17.field531 != null ? var17.field531 : "";
                  Class69.field1001[++Class55.field497 - 1] = var17.field537 != null ? var17.field537 : "";
                  Class69.field1001[++Class55.field497 - 1] = var17.field533 != null ? var17.field533 : "";
                  Class69.field999[++Class69.field1003 - 1] = var17.method1040() ? 1 : (var17.method1043() ? 2 : 0);
               } else {
                  Class69.field999[++Class69.field1003 - 1] = -1;
                  Class69.field999[++Class69.field1003 - 1] = 0;
                  Class69.field1001[++Class55.field497 - 1] = "";
                  Class69.field1001[++Class55.field497 - 1] = "";
                  Class69.field1001[++Class55.field497 - 1] = "";
                  Class69.field999[++Class69.field1003 - 1] = 0;
               }

               return 1;
            } else if (var0 == 5004) {
               var10 = Class69.field999[--Class69.field1003];
               Class58 var19 = Class61.method1130(var10);
               if (var19 != null) {
                  Class69.field999[++Class69.field1003 - 1] = var19.field532;
                  Class69.field999[++Class69.field1003 - 1] = var19.field535;
                  Class69.field1001[++Class55.field497 - 1] = var19.field531 != null ? var19.field531 : "";
                  Class69.field1001[++Class55.field497 - 1] = var19.field537 != null ? var19.field537 : "";
                  Class69.field1001[++Class55.field497 - 1] = var19.field533 != null ? var19.field533 : "";
                  Class69.field999[++Class69.field1003 - 1] = var19.method1040() ? 1 : (var19.method1043() ? 2 : 0);
               } else {
                  Class69.field999[++Class69.field1003 - 1] = -1;
                  Class69.field999[++Class69.field1003 - 1] = 0;
                  Class69.field1001[++Class55.field497 - 1] = "";
                  Class69.field1001[++Class55.field497 - 1] = "";
                  Class69.field1001[++Class55.field497 - 1] = "";
                  Class69.field999[++Class69.field1003 - 1] = 0;
               }

               return 1;
            } else if (var0 == 5005) {
               if (Class143.field1899 == null) {
                  Class69.field999[++Class69.field1003 - 1] = -1;
               } else {
                  Class69.field999[++Class69.field1003 - 1] = Class143.field1899.field3735;
               }

               return 1;
            } else if (var0 == 5008) {
               var3 = Class69.field1001[--Class55.field497];
               var4 = Class69.field999[--Class69.field1003];
               String var16 = var3.toLowerCase();
               byte var21 = 0;
               if (var16.startsWith("yellow:")) {
                  var21 = 0;
                  var3 = var3.substring("yellow:".length());
               } else if (var16.startsWith("red:")) {
                  var21 = 1;
                  var3 = var3.substring("red:".length());
               } else if (var16.startsWith("green:")) {
                  var21 = 2;
                  var3 = var3.substring("green:".length());
               } else if (var16.startsWith("cyan:")) {
                  var21 = 3;
                  var3 = var3.substring("cyan:".length());
               } else if (var16.startsWith("purple:")) {
                  var21 = 4;
                  var3 = var3.substring("purple:".length());
               } else if (var16.startsWith("white:")) {
                  var21 = 5;
                  var3 = var3.substring("white:".length());
               } else if (var16.startsWith("flash1:")) {
                  var21 = 6;
                  var3 = var3.substring("flash1:".length());
               } else if (var16.startsWith("flash2:")) {
                  var21 = 7;
                  var3 = var3.substring("flash2:".length());
               } else if (var16.startsWith("flash3:")) {
                  var21 = 8;
                  var3 = var3.substring("flash3:".length());
               } else if (var16.startsWith("glow1:")) {
                  var21 = 9;
                  var3 = var3.substring("glow1:".length());
               } else if (var16.startsWith("glow2:")) {
                  var21 = 10;
                  var3 = var3.substring("glow2:".length());
               } else if (var16.startsWith("glow3:")) {
                  var21 = 11;
                  var3 = var3.substring("glow3:".length());
               } else if (Client.field827 != 0) {
                  if (var16.startsWith("yellow:")) {
                     var21 = 0;
                     var3 = var3.substring("yellow:".length());
                  } else if (var16.startsWith("red:")) {
                     var21 = 1;
                     var3 = var3.substring("red:".length());
                  } else if (var16.startsWith("green:")) {
                     var21 = 2;
                     var3 = var3.substring("green:".length());
                  } else if (var16.startsWith("cyan:")) {
                     var21 = 3;
                     var3 = var3.substring("cyan:".length());
                  } else if (var16.startsWith("purple:")) {
                     var21 = 4;
                     var3 = var3.substring("purple:".length());
                  } else if (var16.startsWith("white:")) {
                     var21 = 5;
                     var3 = var3.substring("white:".length());
                  } else if (var16.startsWith("flash1:")) {
                     var21 = 6;
                     var3 = var3.substring("flash1:".length());
                  } else if (var16.startsWith("flash2:")) {
                     var21 = 7;
                     var3 = var3.substring("flash2:".length());
                  } else if (var16.startsWith("flash3:")) {
                     var21 = 8;
                     var3 = var3.substring("flash3:".length());
                  } else if (var16.startsWith("glow1:")) {
                     var21 = 9;
                     var3 = var3.substring("glow1:".length());
                  } else if (var16.startsWith("glow2:")) {
                     var21 = 10;
                     var3 = var3.substring("glow2:".length());
                  } else if (var16.startsWith("glow3:")) {
                     var21 = 11;
                     var3 = var3.substring("glow3:".length());
                  }
               }

               var16 = var3.toLowerCase();
               byte var7 = 0;
               if (var16.startsWith("wave:")) {
                  var7 = 1;
                  var3 = var3.substring("wave:".length());
               } else if (var16.startsWith("wave2:")) {
                  var7 = 2;
                  var3 = var3.substring("wave2:".length());
               } else if (var16.startsWith("shake:")) {
                  var7 = 3;
                  var3 = var3.substring("shake:".length());
               } else if (var16.startsWith("scroll:")) {
                  var7 = 4;
                  var3 = var3.substring("scroll:".length());
               } else if (var16.startsWith("slide:")) {
                  var7 = 5;
                  var3 = var3.substring("slide:".length());
               } else if (Client.field827 != 0) {
                  if (var16.startsWith("wave:")) {
                     var7 = 1;
                     var3 = var3.substring("wave:".length());
                  } else if (var16.startsWith("wave2:")) {
                     var7 = 2;
                     var3 = var3.substring("wave2:".length());
                  } else if (var16.startsWith("shake:")) {
                     var7 = 3;
                     var3 = var3.substring("shake:".length());
                  } else if (var16.startsWith("scroll:")) {
                     var7 = 4;
                     var3 = var3.substring("scroll:".length());
                  } else if (var16.startsWith("slide:")) {
                     var7 = 5;
                     var3 = var3.substring("slide:".length());
                  }
               }

               Class172 var8 = Class26.method433(Class169.field2179, Client.field626.field1218);
               var8.field2257.method3532(0);
               int var9 = var8.field2257.field2339;
               var8.field2257.method3532(var4);
               var8.field2257.method3532(var21);
               var8.field2257.method3532(var7);
               Class189.method3840(var8.field2257, var3);
               var8.field2257.method3545(var8.field2257.field2339 - var9);
               Client.field626.method1980(var8);
               return 1;
            } else {
               int var13;
               if (var0 == 5009) {
                  Class55.field497 -= 2;
                  var3 = Class69.field1001[Class55.field497];
                  String var18 = Class69.field1001[Class55.field497 + 1];
                  Class172 var11 = Class26.method433(Class169.field2154, Client.field626.field1218);
                  var11.field2257.method3755(0);
                  var13 = var11.field2257.field2339;
                  var11.field2257.method3699(var3);
                  Class189.method3840(var11.field2257, var18);
                  var11.field2257.method3614(var11.field2257.field2339 - var13);
                  Client.field626.method1980(var11);
                  return 1;
               } else if (var0 != 5015) {
                  if (var0 == 5016) {
                     Class69.field999[++Class69.field1003 - 1] = Client.field795;
                     return 1;
                  } else {
                     int[] var12;
                     if (var0 == 5017) {
                        var10 = Class69.field999[--Class69.field1003];
                        var12 = Class69.field999;
                        var5 = ++Class69.field1003 - 1;
                        Class86 var20 = (Class86)Class83.field1180.get(var10);
                        if (var20 == null) {
                           var13 = 0;
                        } else {
                           var13 = var20.method1976();
                        }

                        var12[var5] = var13;
                        return 1;
                     } else if (var0 == 5018) {
                        var10 = Class69.field999[--Class69.field1003];
                        Class69.field999[++Class69.field1003 - 1] = Class66.method1621(var10);
                        return 1;
                     } else if (var0 == 5019) {
                        var10 = Class69.field999[--Class69.field1003];
                        var12 = Class69.field999;
                        var5 = ++Class69.field1003 - 1;
                        Class58 var14 = (Class58)Class83.field1181.method3945((long)var10);
                        if (var14 == null) {
                           var13 = -1;
                        } else if (var14.field2427 == Class83.field1184.field2445) {
                           var13 = -1;
                        } else {
                           var13 = ((Class58)var14.field2427).field540;
                        }

                        var12[var5] = var13;
                        return 1;
                     } else if (var0 == 5020) {
                        var3 = Class69.field1001[--Class55.field497];
                        Class56.method1031(var3);
                        return 1;
                     } else if (var0 == 5021) {
                        Client.field796 = Class69.field1001[--Class55.field497].toLowerCase().trim();
                        return 1;
                     } else if (var0 == 5022) {
                        Class69.field1001[++Class55.field497 - 1] = Client.field796;
                        return 1;
                     } else {
                        return 2;
                     }
                  }
               } else {
                  if (Class138.field1876 != null && Class138.field1876.field552 != null) {
                     var3 = Class138.field1876.field552.method5447();
                  } else {
                     var3 = "";
                  }

                  Class69.field1001[++Class55.field497 - 1] = var3;
                  return 1;
               }
            }
         }
      }
   }

   @ObfuscatedName("gn")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "16"
   )
   static final void method137(boolean var0) {
      Class54.method1017();
      ++Client.field626.field1224;
      if (Client.field626.field1224 >= 50 || var0) {
         Client.field626.field1224 = 0;
         if (!Client.field756 && Client.field626.method1983() != null) {
            Class172 var1 = Class26.method433(Class169.field2211, Client.field626.field1218);
            Client.field626.method1980(var1);

            try {
               Client.field626.method1979();
            } catch (IOException var3) {
               Client.field756 = true;
            }
         }

      }
   }
}
