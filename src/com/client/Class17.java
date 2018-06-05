package com.client;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public final class Class17 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 595769027
   )
   int field131;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -354096829
   )
   int field133;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -907753045
   )
   int field132;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 529826899
   )
   int field134;
   // $FF: synthetic field
   @ObfuscatedSignature(
      signature = "Lak;"
   )
   final Class30 this$0;

   @ObfuscatedSignature(
      signature = "(Lak;)V"
   )
   Class17(Class30 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1107039015"
   )
   public static int method170(int var0, int var1) {
      return (var0 << 8) + var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(CII)C",
      garbageValue = "2067503426"
   )
   static char method169(char var0, int var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else {
         return var0 == 376 ? 'Y' : var0;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgu;ILjava/lang/String;S)Ljava/lang/String;",
      garbageValue = "255"
   )
   static String method171(Class197 var0, int var1, String var2) {
      if (var0 == null) {
         return var2;
      } else {
         Class195 var3 = (Class195)var0.method3945((long)var1);
         return var3 == null ? var2 : (String)var3.field2394;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-2023648608"
   )
   public static void method172(Class182 var0, int var1) {
      Class312 var2 = new Class312();
      var2.field3749 = var0.readUnsignedByte();
      var2.field3758 = var0.method3671();
      var2.field3748 = new int[var2.field3749];
      var2.field3751 = new int[var2.field3749];
      var2.field3752 = new Field[var2.field3749];
      var2.field3753 = new int[var2.field3749];
      var2.field3754 = new Method[var2.field3749];
      var2.field3755 = new byte[var2.field3749][][];

      for(int var3 = 0; var3 < var2.field3749; ++var3) {
         try {
            int var4 = var0.readUnsignedByte();
            String var5;
            String var6;
            int var7;
            if (var4 != 0 && var4 != 1 && var4 != 2) {
               if (var4 == 3 || var4 == 4) {
                  var5 = var0.method3738();
                  var6 = var0.method3738();
                  var7 = var0.readUnsignedByte();
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.method3738();
                  }

                  String var20 = var0.method3738();
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.method3671();
                        var10[var11] = new byte[var12];
                        var0.method3539(var10[var11], 0, var12);
                     }
                  }

                  var2.field3748[var3] = var4;
                  Class[] var21 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var21[var12] = Class110.method2528(var8[var12]);
                  }

                  Class var22 = Class110.method2528(var20);
                  if (Class110.method2528(var5).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = Class110.method2528(var5).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var17.length == var21.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var21.length; ++var19) {
                              if (var17[var19] != var21[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var22 == var16.getReturnType()) {
                              var2.field3754[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.field3755[var3] = var10;
               }
            } else {
               var5 = var0.method3738();
               var6 = var0.method3738();
               var7 = 0;
               if (var4 == 1) {
                  var7 = var0.method3671();
               }

               var2.field3748[var3] = var4;
               var2.field3753[var3] = var7;
               if (Class110.method2528(var5).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field3752[var3] = Class110.method2528(var5).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var24) {
            var2.field3751[var3] = -1;
         } catch (SecurityException var25) {
            var2.field3751[var3] = -2;
         } catch (NullPointerException var26) {
            var2.field3751[var3] = -3;
         } catch (Exception var27) {
            var2.field3751[var3] = -4;
         } catch (Throwable var28) {
            var2.field3751[var3] = -5;
         }
      }

      Class313.field3759.method4031(var2);
   }
}
