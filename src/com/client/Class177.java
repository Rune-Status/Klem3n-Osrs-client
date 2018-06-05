package com.client;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class Class177 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field2284;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1679580901
   )
   static int field2283;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lhq;"
   )
   public static Class223 field2285;

   static {
      new HashMap();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
      garbageValue = "29"
   )
   public static void method3509(String var0, String var1, int var2, int var3) throws IOException {
      Class148.field1913 = var3;
      Class141.field1885 = var2;

      try {
         Class229.field2587 = System.getProperty("os.name");
      } catch (Exception var13) {
         Class229.field2587 = "Unknown";
      }

      Class75.field1065 = Class229.field2587.toLowerCase();

      try {
         Class18.field143 = System.getProperty("user.home");
         if (Class18.field143 != null) {
            Class18.field143 = Class18.field143 + "/";
         }
      } catch (Exception var12) {
         ;
      }

      try {
         if (Class75.field1065.startsWith("win")) {
            if (Class18.field143 == null) {
               Class18.field143 = System.getenv("USERPROFILE");
            }
         } else if (Class18.field143 == null) {
            Class18.field143 = System.getenv("HOME");
         }

         if (Class18.field143 != null) {
            Class18.field143 = Class18.field143 + "/";
         }
      } catch (Exception var11) {
         ;
      }

      if (Class18.field143 == null) {
         Class18.field143 = "~/";
      }

      Class155.field1965 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class18.field143, "/tmp/", ""};
      Class8.field52 = new String[]{".jagex_cache_" + Class141.field1885, ".file_store_" + Class141.field1885};
      int var9 = 0;

      label92:
      while(var9 < 4) {
         Class155.field1966 = Class65.method1583(var0, var1, var9);
         if (!Class155.field1966.exists()) {
            Class155.field1966.mkdirs();
         }

         File[] var5 = Class155.field1966.listFiles();
         if (var5 == null) {
            break;
         }

         File[] var6 = var5;
         int var7 = 0;

         while(true) {
            if (var7 >= var6.length) {
               break label92;
            }

            File var8 = var6[var7];
            if (!Class70.method1766(var8, false)) {
               ++var9;
               break;
            }

            ++var7;
         }
      }

      File var4 = Class155.field1966;
      Class158.field1974 = var4;
      if (!Class158.field1974.exists()) {
         throw new RuntimeException("");
      } else {
         Class158.field1979 = true;
         Class29.method476();
         Class155.field1969 = new Class109(new Class110(Class151.method3238("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
         Class155.field1970 = new Class109(new Class110(Class151.method3238("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
         Class76.field1068 = new Class109[Class148.field1913];

         for(int var10 = 0; var10 < Class148.field1913; ++var10) {
            Class76.field1068[var10] = new Class109(new Class110(Class151.method3238("main_file_cache.idx" + var10), "rw", 1048576L), 6000, 0);
         }

      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgi;I)V",
      garbageValue = "-2137286029"
   )
   static final void method3512(Class189 var0) {
      int var1 = 0;
      var0.method3823();

      int var2;
      int var3;
      int var4;
      for(var2 = 0; var2 < Class81.field1167; ++var2) {
         var3 = Class81.field1159[var2];
         if ((Class81.field1156[var3] & 1) == 0) {
            if (var1 > 0) {
               --var1;
               Class81.field1156[var3] = (byte)(Class81.field1156[var3] | 2);
            } else {
               var4 = var0.method3817(1);
               if (var4 == 0) {
                  var1 = ServerPackets.method3445(var0);
                  Class81.field1156[var3] = (byte)(Class81.field1156[var3] | 2);
               } else {
                  Class6.method73(var0, var3);
               }
            }
         }
      }

      var0.method3816();
      if (var1 != 0) {
         throw new RuntimeException();
      } else {
         var0.method3823();

         for(var2 = 0; var2 < Class81.field1167; ++var2) {
            var3 = Class81.field1159[var2];
            if ((Class81.field1156[var3] & 1) != 0) {
               if (var1 > 0) {
                  --var1;
                  Class81.field1156[var3] = (byte)(Class81.field1156[var3] | 2);
               } else {
                  var4 = var0.method3817(1);
                  if (var4 == 0) {
                     var1 = ServerPackets.method3445(var0);
                     Class81.field1156[var3] = (byte)(Class81.field1156[var3] | 2);
                  } else {
                     Class6.method73(var0, var3);
                  }
               }
            }
         }

         var0.method3816();
         if (var1 != 0) {
            throw new RuntimeException();
         } else {
            var0.method3823();

            for(var2 = 0; var2 < Class81.field1160; ++var2) {
               var3 = Class81.field1161[var2];
               if ((Class81.field1156[var3] & 1) != 0) {
                  if (var1 > 0) {
                     --var1;
                     Class81.field1156[var3] = (byte)(Class81.field1156[var3] | 2);
                  } else {
                     var4 = var0.method3817(1);
                     if (var4 == 0) {
                        var1 = ServerPackets.method3445(var0);
                        Class81.field1156[var3] = (byte)(Class81.field1156[var3] | 2);
                     } else if (Class240.method4601(var0, var3)) {
                        Class81.field1156[var3] = (byte)(Class81.field1156[var3] | 2);
                     }
                  }
               }
            }

            var0.method3816();
            if (var1 != 0) {
               throw new RuntimeException();
            } else {
               var0.method3823();

               for(var2 = 0; var2 < Class81.field1160; ++var2) {
                  var3 = Class81.field1161[var2];
                  if ((Class81.field1156[var3] & 1) == 0) {
                     if (var1 > 0) {
                        --var1;
                        Class81.field1156[var3] = (byte)(Class81.field1156[var3] | 2);
                     } else {
                        var4 = var0.method3817(1);
                        if (var4 == 0) {
                           var1 = ServerPackets.method3445(var0);
                           Class81.field1156[var3] = (byte)(Class81.field1156[var3] | 2);
                        } else if (Class240.method4601(var0, var3)) {
                           Class81.field1156[var3] = (byte)(Class81.field1156[var3] | 2);
                        }
                     }
                  }
               }

               var0.method3816();
               if (var1 != 0) {
                  throw new RuntimeException();
               } else {
                  Class81.field1167 = 0;
                  Class81.field1160 = 0;

                  for(var2 = 1; var2 < 2048; ++var2) {
                     Class81.field1156[var2] = (byte)(Class81.field1156[var2] >> 1);
                     Class60 var5 = Client.field610[var2];
                     if (var5 != null) {
                        Class81.field1159[++Class81.field1167 - 1] = var2;
                     } else {
                        Class81.field1161[++Class81.field1160 - 1] = var2;
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "885632790"
   )
   static final void method3510(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               Class50.field447[0][var5][var4] = 127;
               if (var0 == var5 && var5 > 0) {
                  Class50.field459[0][var5][var4] = Class50.field459[0][var5 - 1][var4];
               }

               if (var5 == var0 + var2 && var5 < 103) {
                  Class50.field459[0][var5][var4] = Class50.field459[0][var5 + 1][var4];
               }

               if (var4 == var1 && var4 > 0) {
                  Class50.field459[0][var5][var4] = Class50.field459[0][var5][var4 - 1];
               }

               if (var3 + var1 == var4 && var4 < 103) {
                  Class50.field459[0][var5][var4] = Class50.field459[0][var5][var4 + 1];
               }
            }
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1945852899"
   )
   static void method3507(int var0) {
      Class53 var1 = (Class53)Class53.field474.method4020((long)var0);
      if (var1 != null) {
         var1.method4064();
      }
   }

   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2097572835"
   )
   static final void method3513() {
      Class125.field1760 = false;
      Client.field585 = false;
   }

   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-280665232"
   )
   static final void method3508(String var0) {
      if (Class14.field94 != null) {
         Class172 var1 = Class26.method433(Class169.field2174, Client.field626.field1218);
         var1.field2257.method3532(Class316.method5820(var0));
         var1.field2257.method3699(var0);
         Client.field626.method1980(var1);
      }
   }
}
