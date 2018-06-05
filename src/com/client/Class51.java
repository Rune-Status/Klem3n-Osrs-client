package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class Class51 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lce;"
   )
   Class84 field466;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1485415085
   )
   int field463 = -1;
   @ObfuscatedName("s")
   int[] field462;
   @ObfuscatedName("l")
   String[] field465;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(S)[Ljr;",
      garbageValue = "128"
   )
   public static Class279[] method996() {
      return new Class279[]{Class279.field3596, Class279.field3580, Class279.field3582, Class279.field3585, Class279.field3593, Class279.field3587, Class279.field3583, Class279.field3595, Class279.field3592, Class279.field3588, Class279.field3586, Class279.field3590, Class279.field3594, Class279.field3589, Class279.field3581, Class279.field3584};
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "1"
   )
   public static String method998(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = Class291.method5450(var5);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 != '.' && var5 != '?' && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-827181248"
   )
   static final void method995(String var0) {
      StringBuilder var10000 = new StringBuilder();
      Object var10001 = null;
      var10000 = var10000.append("Please remove ").append(var0);
      var10001 = null;
      String var1 = var10000.append(" from your ignore list first").toString();
      Class143.method3172(30, "", var1);
   }

   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      signature = "(ZLgi;I)V",
      garbageValue = "1560742456"
   )
   static final void method994(boolean var0, Class189 var1) {
      Client.field759 = var0;
      int var2;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      if (!Client.field759) {
         var2 = var1.method3613();
         var3 = var1.method3646();
         int var4 = var1.readUnsignedShort();
         Class67.field973 = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               Class67.field973[var5][var6] = var1.method3671();
            }
         }

         Class143.field1900 = new int[var4];
         Class295.field3676 = new int[var4];
         Class9.field56 = new int[var4];
         Class171.field2252 = new byte[var4][];
         Class29.field253 = new byte[var4][];
         boolean var16 = false;
         if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
            var16 = true;
         }

         if (var2 / 8 == 48 && var3 / 8 == 148) {
            var16 = true;
         }

         var4 = 0;

         for(var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
            for(var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) {
               var8 = var7 + (var6 << 8);
               if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
                  Class143.field1900[var4] = var8;
                  Class295.field3676[var4] = Class246.field3159.method4642("m" + var6 + "_" + var7);
                  Class9.field56[var4] = Class246.field3159.method4642("l" + var6 + "_" + var7);
                  ++var4;
               }
            }
         }

         Class62.method1537(var2, var3, true);
      } else {
         var2 = var1.readUShort();
         var3 = var1.readUShort();
         boolean var15 = var1.readUnsignedByte() == 1;
         var5 = var1.readUnsignedShort();
         var1.method3823();

         int var9;
         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = var1.method3817(1);
                  if (var9 == 1) {
                     Client.field645[var6][var7][var8] = var1.method3817(26);
                  } else {
                     Client.field645[var6][var7][var8] = -1;
                  }
               }
            }
         }

         var1.method3816();
         Class67.field973 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               Class67.field973[var6][var7] = var1.method3671();
            }
         }

         Class143.field1900 = new int[var5];
         Class295.field3676 = new int[var5];
         Class9.field56 = new int[var5];
         Class171.field2252 = new byte[var5][];
         Class29.field253 = new byte[var5][];
         var5 = 0;

         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = Client.field645[var6][var7][var8];
                  if (var9 != -1) {
                     int var10 = var9 >> 14 & 1023;
                     int var11 = var9 >> 3 & 2047;
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     int var13;
                     for(var13 = 0; var13 < var5; ++var13) {
                        if (Class143.field1900[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if (var12 != -1) {
                        Class143.field1900[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        Class295.field3676[var5] = Class246.field3159.method4642("m" + var13 + "_" + var14);
                        Class9.field56[var5] = Class246.field3159.method4642("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         Class62.method1537(var2, var3, !var15);
      }

   }

   @ObfuscatedName("hn")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1470602086"
   )
   static final void method997(int var0, int var1) {
      if (Client.field771 >= 2 || Client.field733 != 0 || Client.field785) {
         if (Client.field728) {
            int var2 = Client.field771 - 1;
            String var4;
            if (Client.field733 == 1 && Client.field771 < 2) {
               var4 = "Use" + " " + Client.field734 + " " + "->";
            } else if (Client.field785 && Client.field771 < 2) {
               var4 = Client.field612 + " " + Client.field739 + " " + "->";
            } else {
               var4 = Class18.method176(var2);
            }

            if (Client.field771 > 2) {
               var4 = var4 + Class6.method71(16777215) + " " + '/' + " " + (Client.field771 - 2) + " more options";
            }

            Class293.field3660.method5530(var4, var0 + 4, var1 + 15, 16777215, 0, Client.field591 / 1000);
         }
      }
   }
}
