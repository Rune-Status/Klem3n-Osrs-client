package com.client;
import java.util.Comparator;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
final class Class6 implements Comparator {
   @ObfuscatedName("mb")
   @ObfuscatedGetter(
      intValue = -1755726803
   )
   static int field39;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2122998471
   )
   public static int field37;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ls;Ls;I)I",
      garbageValue = "-1297295614"
   )
   int method66(Class2 var1, Class2 var2) {
      return var1.method16().compareTo(var2.method16());
   }

   public int compare(Object var1, Object var2) {
      return this.method66((Class2)var1, (Class2)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1575797810"
   )
   static int method69(int var0, int var1) {
      Class272 var2 = Class1.method15(var0);
      if (var2 == null) {
         return var1;
      } else if (var2.field3528 >= 0) {
         return var2.field3528 | -16777216;
      } else {
         int var3;
         int var4;
         byte var5;
         int var7;
         if (var2.field3526 >= 0) {
            var4 = Class122.field1667.vmethod3092(var2.field3526);
            var5 = 96;
            if (var4 == -2) {
               var3 = 12345678;
            } else if (var4 == -1) {
               if (var5 < 0) {
                  var5 = 0;
               } else if (var5 > 127) {
                  var5 = 127;
               }

               var7 = 127 - var5;
               var3 = var7;
            } else {
               var7 = var5 * (var4 & 127) / 128;
               if (var7 < 2) {
                  var7 = 2;
               } else if (var7 > 126) {
                  var7 = 126;
               }

               var3 = var7 + (var4 & 'ﾀ');
            }

            return Class122.field1675[var3] | -16777216;
         } else if (var2.field3533 == 16711935) {
            return var1;
         } else {
            var3 = Class260.method4908(var2.field3525, var2.field3530, var2.field3531);
            var5 = 96;
            if (var3 == -2) {
               var4 = 12345678;
            } else if (var3 == -1) {
               if (var5 < 0) {
                  var5 = 0;
               } else if (var5 > 127) {
                  var5 = 127;
               }

               var7 = 127 - var5;
               var4 = var7;
            } else {
               var7 = var5 * (var3 & 127) / 128;
               if (var7 < 2) {
                  var7 = 2;
               } else if (var7 > 126) {
                  var7 = 126;
               }

               var4 = var7 + (var3 & 'ﾀ');
            }

            return Class122.field1675[var4] | -16777216;
         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "2"
   )
   static String method71(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1623615200"
   )
   static void method75() {
      for(Class68 var0 = (Class68)Class68.field985.method4098(); var0 != null; var0 = (Class68)Class68.field985.method4079()) {
         if (var0.field994 != null) {
            var0.method1688();
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lgi;II)V",
      garbageValue = "392289778"
   )
   static void method73(Class189 var0, int var1) {
      boolean var2 = var0.method3817(1) == 1;
      if (var2) {
         Class81.field1166[++Class81.field1165 - 1] = var1;
      }

      int var3 = var0.method3817(2);
      Class60 var4 = Client.field610[var1];
      if (var3 == 0) {
         if (var2) {
            var4.field571 = false;
         } else if (Client.field628 == var1) {
            throw new RuntimeException();
         } else {
            Class81.field1162[var1] = (var4.field567 << 28) + (Class62.field868 + var4.field922[0] >> 13 << 14) + (Client.field754 + var4.field872[0] >> 13);
            if (var4.field920 != -1) {
               Class81.field1163[var1] = var4.field920;
            } else {
               Class81.field1163[var1] = var4.field926;
            }

            Class81.field1164[var1] = var4.field897;
            Client.field610[var1] = null;
            if (var0.method3817(1) != 0) {
               Class240.method4601(var0, var1);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if (var3 == 1) {
            var5 = var0.method3817(3);
            var6 = var4.field922[0];
            var7 = var4.field872[0];
            if (var5 == 0) {
               --var6;
               --var7;
            } else if (var5 == 1) {
               --var7;
            } else if (var5 == 2) {
               ++var6;
               --var7;
            } else if (var5 == 3) {
               --var6;
            } else if (var5 == 4) {
               ++var6;
            } else if (var5 == 5) {
               --var6;
               ++var7;
            } else if (var5 == 6) {
               ++var7;
            } else if (var5 == 7) {
               ++var6;
               ++var7;
            }

            if (Client.field628 == var1 && (var4.field931 < 1536 || var4.field881 < 1536 || var4.field931 >= 11776 || var4.field881 >= 11776)) {
               var4.method1103(var6, var7);
               var4.field571 = false;
            } else if (var2) {
               var4.field571 = true;
               var4.field572 = var6;
               var4.field573 = var7;
            } else {
               var4.field571 = false;
               var4.method1106(var6, var7, Class81.field1153[var1]);
            }

         } else if (var3 == 2) {
            var5 = var0.method3817(4);
            var6 = var4.field922[0];
            var7 = var4.field872[0];
            if (var5 == 0) {
               var6 -= 2;
               var7 -= 2;
            } else if (var5 == 1) {
               --var6;
               var7 -= 2;
            } else if (var5 == 2) {
               var7 -= 2;
            } else if (var5 == 3) {
               ++var6;
               var7 -= 2;
            } else if (var5 == 4) {
               var6 += 2;
               var7 -= 2;
            } else if (var5 == 5) {
               var6 -= 2;
               --var7;
            } else if (var5 == 6) {
               var6 += 2;
               --var7;
            } else if (var5 == 7) {
               var6 -= 2;
            } else if (var5 == 8) {
               var6 += 2;
            } else if (var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if (var5 == 10) {
               var6 += 2;
               ++var7;
            } else if (var5 == 11) {
               var6 -= 2;
               var7 += 2;
            } else if (var5 == 12) {
               --var6;
               var7 += 2;
            } else if (var5 == 13) {
               var7 += 2;
            } else if (var5 == 14) {
               ++var6;
               var7 += 2;
            } else if (var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if (Client.field628 == var1 && (var4.field931 < 1536 || var4.field881 < 1536 || var4.field931 >= 11776 || var4.field881 >= 11776)) {
               var4.method1103(var6, var7);
               var4.field571 = false;
            } else if (var2) {
               var4.field571 = true;
               var4.field572 = var6;
               var4.field573 = var7;
            } else {
               var4.field571 = false;
               var4.method1106(var6, var7, Class81.field1153[var1]);
            }

         } else {
            var5 = var0.method3817(1);
            int var8;
            int var9;
            int var10;
            int var11;
            if (var5 == 0) {
               var6 = var0.method3817(12);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if (var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var8 + var4.field922[0];
               var11 = var9 + var4.field872[0];
               if (Client.field628 == var1 && (var4.field931 < 1536 || var4.field881 < 1536 || var4.field931 >= 11776 || var4.field881 >= 11776)) {
                  var4.method1103(var10, var11);
                  var4.field571 = false;
               } else if (var2) {
                  var4.field571 = true;
                  var4.field572 = var10;
                  var4.field573 = var11;
               } else {
                  var4.field571 = false;
                  var4.method1106(var10, var11, Class81.field1153[var1]);
               }

               var4.field567 = (byte)(var7 + var4.field567 & 3);
               if (Client.field628 == var1) {
                  Class13.field82 = var4.field567;
               }

            } else {
               var6 = var0.method3817(30);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 16383;
               var10 = (var8 + Class62.field868 + var4.field922[0] & 16383) - Class62.field868;
               var11 = (var9 + Client.field754 + var4.field872[0] & 16383) - Client.field754;
               if (Client.field628 == var1 && (var4.field931 < 1536 || var4.field881 < 1536 || var4.field931 >= 11776 || var4.field881 >= 11776)) {
                  var4.method1103(var10, var11);
                  var4.field571 = false;
               } else if (var2) {
                  var4.field571 = true;
                  var4.field572 = var10;
                  var4.field573 = var11;
               } else {
                  var4.field571 = false;
                  var4.method1106(var10, var11, Class81.field1153[var1]);
               }

               var4.field567 = (byte)(var7 + var4.field567 & 3);
               if (Client.field628 == var1) {
                  Class13.field82 = var4.field567;
               }

            }
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-127094665"
   )
   static int method74(int var0, Class84 var1, boolean var2) {
      if (var0 == 5306) {
         int[] var3 = Class69.field999;
         int var4 = ++Class69.field1003 - 1;
         int var5 = Client.field792 ? 2 : 1;
         var3[var4] = var5;
         return 1;
      } else {
         int var6;
         if (var0 == 5307) {
            var6 = Class69.field999[--Class69.field1003];
            if (var6 == 1 || var6 == 2) {
               Class50.method991(var6);
            }

            return 1;
         } else if (var0 == 5308) {
            Class69.field999[++Class69.field1003 - 1] = Class10.field61.field957;
            return 1;
         } else if (var0 != 5309) {
            return 2;
         } else {
            var6 = Class69.field999[--Class69.field1003];
            if (var6 == 1 || var6 == 2) {
               Class10.field61.field957 = var6;
               Class54.method1018();
            }

            return 1;
         }
      }
   }
}
