package com.client;
import java.math.BigInteger;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class Class73 {
   @ObfuscatedName("u")
   static final BigInteger field1039 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   @ObfuscatedName("q")
   static final BigInteger field1044 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-373456508"
   )
   static int method1799(int var0, Class84 var1, boolean var2) {
      int var3;
      if (var0 == 4200) {
         var3 = Class69.field999[--Class69.field1003];
         Class69.field1001[++Class55.field497 - 1] = Class111.method2563(var3).field3433;
         return 1;
      } else {
         int var4;
         Class269 var17;
         if (var0 == 4201) {
            Class69.field1003 -= 2;
            var3 = Class69.field999[Class69.field1003];
            var4 = Class69.field999[Class69.field1003 + 1];
            var17 = Class111.method2563(var3);
            if (var4 >= 1 && var4 <= 5 && var17.field3447[var4 - 1] != null) {
               Class69.field1001[++Class55.field497 - 1] = var17.field3447[var4 - 1];
            } else {
               Class69.field1001[++Class55.field497 - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            Class69.field1003 -= 2;
            var3 = Class69.field999[Class69.field1003];
            var4 = Class69.field999[Class69.field1003 + 1];
            var17 = Class111.method2563(var3);
            if (var4 >= 1 && var4 <= 5 && var17.field3425[var4 - 1] != null) {
               Class69.field1001[++Class55.field497 - 1] = var17.field3425[var4 - 1];
            } else {
               Class69.field1001[++Class55.field497 - 1] = "";
            }

            return 1;
         } else if (var0 == 4203) {
            var3 = Class69.field999[--Class69.field1003];
            Class69.field999[++Class69.field1003 - 1] = Class111.method2563(var3).field3445;
            return 1;
         } else if (var0 == 4204) {
            var3 = Class69.field999[--Class69.field1003];
            Class69.field999[++Class69.field1003 - 1] = Class111.method2563(var3).field3444 == 1 ? 1 : 0;
            return 1;
         } else {
            Class269 var13;
            if (var0 == 4205) {
               var3 = Class69.field999[--Class69.field1003];
               var13 = Class111.method2563(var3);
               if (var13.field3465 == -1 && var13.field3464 >= 0) {
                  Class69.field999[++Class69.field1003 - 1] = var13.field3464;
               } else {
                  Class69.field999[++Class69.field1003 - 1] = var3;
               }

               return 1;
            } else if (var0 == 4206) {
               var3 = Class69.field999[--Class69.field1003];
               var13 = Class111.method2563(var3);
               if (var13.field3465 >= 0 && var13.field3464 >= 0) {
                  Class69.field999[++Class69.field1003 - 1] = var13.field3464;
               } else {
                  Class69.field999[++Class69.field1003 - 1] = var3;
               }

               return 1;
            } else if (var0 == 4207) {
               var3 = Class69.field999[--Class69.field1003];
               Class69.field999[++Class69.field1003 - 1] = Class111.method2563(var3).field3446 ? 1 : 0;
               return 1;
            } else if (var0 == 4208) {
               var3 = Class69.field999[--Class69.field1003];
               var13 = Class111.method2563(var3);
               if (var13.field3477 == -1 && var13.field3476 >= 0) {
                  Class69.field999[++Class69.field1003 - 1] = var13.field3476;
               } else {
                  Class69.field999[++Class69.field1003 - 1] = var3;
               }

               return 1;
            } else if (var0 == 4209) {
               var3 = Class69.field999[--Class69.field1003];
               var13 = Class111.method2563(var3);
               if (var13.field3477 >= 0 && var13.field3476 >= 0) {
                  Class69.field999[++Class69.field1003 - 1] = var13.field3476;
               } else {
                  Class69.field999[++Class69.field1003 - 1] = var3;
               }

               return 1;
            } else if (var0 == 4210) {
               String var14 = Class69.field1001[--Class55.field497];
               var4 = Class69.field999[--Class69.field1003];
               boolean var6 = var4 == 1;
               String var5 = var14.toLowerCase();
               short[] var7 = new short[16];
               int var8 = 0;
               int var9 = 0;

               while(true) {
                  if (var9 >= Class86.field1212) {
                     Class27.field231 = var7;
                     Class55.field495 = 0;
                     Class126.field1778 = var8;
                     String[] var15 = new String[Class126.field1778];

                     for(int var16 = 0; var16 < Class126.field1778; ++var16) {
                        var15[var16] = Class111.method2563(var7[var16]).field3433;
                     }

                     Class133.method3100(var15, Class27.field231);
                     break;
                  }

                  Class269 var10 = Class111.method2563(var9);
                  if ((!var6 || var10.field3436) && var10.field3465 == -1 && var10.field3433.toLowerCase().indexOf(var5) != -1) {
                     if (var8 >= 250) {
                        Class126.field1778 = -1;
                        Class27.field231 = null;
                        break;
                     }

                     if (var8 >= var7.length) {
                        short[] var11 = new short[var7.length * 2];

                        for(int var12 = 0; var12 < var8; ++var12) {
                           var11[var12] = var7[var12];
                        }

                        var7 = var11;
                     }

                     var7[var8++] = (short)var9;
                  }

                  ++var9;
               }

               Class69.field999[++Class69.field1003 - 1] = Class126.field1778;
               return 1;
            } else if (var0 != 4211) {
               if (var0 == 4212) {
                  Class55.field495 = 0;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (Class27.field231 != null && Class55.field495 < Class126.field1778) {
                  Class69.field999[++Class69.field1003 - 1] = Class27.field231[++Class55.field495 - 1] & '\uffff';
               } else {
                  Class69.field999[++Class69.field1003 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }
}
