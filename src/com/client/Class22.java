package com.client;
import java.io.File;
import java.io.IOException;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class Class22 {
   @ObfuscatedName("mu")
   @ObfuscatedSignature(
      signature = "Lcq;"
   )
   static Class82 field185;
   @ObfuscatedName("do")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static Class249 field183;
   @ObfuscatedName("z")
   String field186;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -595301837
   )
   int field184;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 252294915
   )
   int field182;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Ln;"
   )
   Class12 field181;

   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IILn;)V"
   )
   Class22(String var1, int var2, int var3, Class12 var4) {
      this.field186 = var1;
      this.field184 = var2;
      this.field182 = var3;
      this.field181 = var4;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lic;IIIBZI)V",
      garbageValue = "-1235545078"
   )
   static void method280(Class249 var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var6 = (long)((var1 << 16) + var2);
      Class246 var8 = (Class246)Class250.field3212.method4020(var6);
      if (var8 == null) {
         var8 = (Class246)Class250.field3199.method4020(var6);
         if (var8 == null) {
            var8 = (Class246)Class250.field3204.method4020(var6);
            if (var8 != null) {
               if (var5) {
                  var8.method4101();
                  Class250.field3212.method4016(var8, var6);
                  --Class250.field3205;
                  ++Class250.field3211;
               }

            } else {
               if (!var5) {
                  var8 = (Class246)Class250.field3206.method4020(var6);
                  if (var8 != null) {
                     return;
                  }
               }

               var8 = new Class246();
               var8.field3155 = var0;
               var8.field3156 = var3;
               var8.field3157 = var4;
               if (var5) {
                  Class250.field3212.method4016(var8, var6);
                  ++Class250.field3211;
               } else {
                  Class250.field3202.method3910(var8);
                  Class250.field3204.method4016(var8, var6);
                  ++Class250.field3205;
               }

            }
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([Lbb;II[I[II)V",
      garbageValue = "1515419045"
   )
   static void method282(Class65[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = var2 + 1;
         int var7 = (var2 + var1) / 2;
         Class65 var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var5 < var6) {
            boolean var9 = true;

            int var10;
            int var11;
            int var12;
            do {
               --var6;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var6].field943;
                     var12 = var8.field943;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var6].field955;
                     var12 = var8.field955;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (var3[var10] == 3) {
                     var11 = var0[var6].method1589() ? 1 : 0;
                     var12 = var8.method1589() ? 1 : 0;
                  } else {
                     var11 = var0[var6].field947;
                     var12 = var8.field947;
                  }

                  if (var11 != var12) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            var9 = true;

            do {
               ++var5;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var5].field943;
                     var12 = var8.field943;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var5].field955;
                     var12 = var8.field955;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (var3[var10] == 3) {
                     var11 = var0[var5].method1589() ? 1 : 0;
                     var12 = var8.method1589() ? 1 : 0;
                  } else {
                     var11 = var0[var5].field947;
                     var12 = var8.field947;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            if (var5 < var6) {
               Class65 var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         method282(var0, var1, var6, var3, var4);
         method282(var0, var6 + 1, var2, var3, var4);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;ZI)Ldv;",
      garbageValue = "1914569734"
   )
   public static Class110 method283(String var0, String var1, boolean var2) {
      File var3 = new File(Class155.field1966, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            Class110 var10 = new Class110(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
            ;
         }
      }

      String var4 = "";
      if (Class141.field1885 == 33) {
         var4 = "_rc";
      } else if (Class141.field1885 == 34) {
         var4 = "_wip";
      }

      File var5 = new File(Class18.field143, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      Class110 var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new Class110(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
            ;
         }
      }

      try {
         var6 = new Class110(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      signature = "(Lhi;III)V",
      garbageValue = "-1127848526"
   )
   static void method281(Class230 var0, int var1, int var2) {
      if (var0.field2610 == 0) {
         var0.field2618 = var0.field2607;
      } else if (var0.field2610 == 1) {
         var0.field2618 = var0.field2607 + (var1 - var0.field2675) / 2;
      } else if (var0.field2610 == 2) {
         var0.field2618 = var1 - var0.field2675 - var0.field2607;
      } else if (var0.field2610 == 3) {
         var0.field2618 = var0.field2607 * var1 >> 14;
      } else if (var0.field2610 == 4) {
         var0.field2618 = (var1 - var0.field2675) / 2 + (var0.field2607 * var1 >> 14);
      } else {
         var0.field2618 = var1 - var0.field2675 - (var0.field2607 * var1 >> 14);
      }

      if (var0.field2611 == 0) {
         var0.field2619 = var0.field2615;
      } else if (var0.field2611 == 1) {
         var0.field2619 = (var2 - var0.field2621) / 2 + var0.field2615;
      } else if (var0.field2611 == 2) {
         var0.field2619 = var2 - var0.field2621 - var0.field2615;
      } else if (var0.field2611 == 3) {
         var0.field2619 = var2 * var0.field2615 >> 14;
      } else if (var0.field2611 == 4) {
         var0.field2619 = (var2 - var0.field2621) / 2 + (var2 * var0.field2615 >> 14);
      } else {
         var0.field2619 = var2 - var0.field2621 - (var2 * var0.field2615 >> 14);
      }

   }
}
