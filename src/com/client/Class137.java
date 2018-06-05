package com.client;
import java.util.Comparator;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class Class137 implements Comparator {
   @ObfuscatedName("z")
   final boolean field1870;

   public Class137(boolean var1) {
      this.field1870 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "2097631968"
   )
   int method3120(Class287 var1, Class287 var2) {
      return this.field1870 ? var1.field3627 - var2.field3627 : var2.field3627 - var1.field3627;
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method3120((Class287)var1, (Class287)var2);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)Lll;",
      garbageValue = "-1573456149"
   )
   public static Class318 method3127(Class247 var0, String var1, String var2) {
      int var3 = var0.method4642(var1);
      int var4 = var0.method4643(var3, var2);
      return Class229.method4499(var0, var3, var4);
   }

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      signature = "(Lhi;II)I",
      garbageValue = "1207234398"
   )
   static final int method3119(Class230 var0, int var1) {
      if (var0.field2659 != null && var1 < var0.field2659.length) {
         try {
            int[] var2 = var0.field2659[var1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;

            while(true) {
               int var6 = var2[var4++];
               int var7 = 0;
               byte var8 = 0;
               if (var6 == 0) {
                  return var3;
               }

               if (var6 == 1) {
                  var7 = Client.field712[var2[var4++]];
               }

               if (var6 == 2) {
                  var7 = Client.field713[var2[var4++]];
               }

               if (var6 == 3) {
                  var7 = Client.field640[var2[var4++]];
               }

               int var9;
               Class230 var10;
               int var11;
               int var12;
               if (var6 == 4) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = Class26.method434(var9);
                  var11 = var2[var4++];
                  if (var11 != -1 && (!Class111.method2563(var11).field3446 || Client.field668)) {
                     for(var12 = 0; var12 < var10.field2724.length; ++var12) {
                        if (var11 + 1 == var10.field2724[var12]) {
                           var7 += var10.field2725[var12];
                        }
                     }
                  }
               }

               if (var6 == 5) {
                  var7 = Class225.field2558[var2[var4++]];
               }

               if (var6 == 6) {
                  var7 = Class234.field2779[Client.field713[var2[var4++]] - 1];
               }

               if (var6 == 7) {
                  var7 = Class225.field2558[var2[var4++]] * 100 / '뜛';
               }

               if (var6 == 8) {
                  var7 = Class138.field1876.field551;
               }

               if (var6 == 9) {
                  for(var9 = 0; var9 < 25; ++var9) {
                     if (Class234.field2780[var9]) {
                        var7 += Client.field713[var9];
                     }
                  }
               }

               if (var6 == 10) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = Class26.method434(var9);
                  var11 = var2[var4++];
                  if (var11 != -1 && (!Class111.method2563(var11).field3446 || Client.field668)) {
                     for(var12 = 0; var12 < var10.field2724.length; ++var12) {
                        if (var11 + 1 == var10.field2724[var12]) {
                           var7 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var6 == 11) {
                  var7 = Client.field745;
               }

               if (var6 == 12) {
                  var7 = Client.field782;
               }

               if (var6 == 13) {
                  var9 = Class225.field2558[var2[var4++]];
                  int var13 = var2[var4++];
                  var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
               }

               if (var6 == 14) {
                  var9 = var2[var4++];
                  var7 = Class163.method3389(var9);
               }

               if (var6 == 15) {
                  var8 = 1;
               }

               if (var6 == 16) {
                  var8 = 2;
               }

               if (var6 == 17) {
                  var8 = 3;
               }

               if (var6 == 18) {
                  var7 = (Class138.field1876.field931 >> 7) + Class62.field868;
               }

               if (var6 == 19) {
                  var7 = (Class138.field1876.field881 >> 7) + Client.field754;
               }

               if (var6 == 20) {
                  var7 = var2[var4++];
               }

               if (var8 == 0) {
                  if (var5 == 0) {
                     var3 += var7;
                  }

                  if (var5 == 1) {
                     var3 -= var7;
                  }

                  if (var5 == 2 && var7 != 0) {
                     var3 /= var7;
                  }

                  if (var5 == 3) {
                     var3 *= var7;
                  }

                  var5 = 0;
               } else {
                  var5 = var8;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }
}
