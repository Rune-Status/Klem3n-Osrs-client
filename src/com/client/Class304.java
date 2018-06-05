package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class Class304 {
   @ObfuscatedName("z")
   public static char[] field3722 = new char[64];
   @ObfuscatedName("w")
   static char[] field3723;
   @ObfuscatedName("s")
   static int[] field3724;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field3722[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3722[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3722[var0] = (char)(var0 + 48 - 52);
      }

      field3722[62] = '+';
      field3722[63] = '/';
      field3723 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field3723[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3723[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3723[var0] = (char)(var0 + 48 - 52);
      }

      field3723[62] = '*';
      field3723[63] = '-';
      field3724 = new int[128];

      for(var0 = 0; var0 < field3724.length; ++var0) {
         field3724[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field3724[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field3724[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field3724[var0] = var0 - 48 + 52;
      }

      int[] var2 = field3724;
      field3724[43] = 62;
      var2[42] = 62;
      int[] var1 = field3724;
      field3724[47] = 63;
      var1[45] = 63;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;S)Ljava/lang/String;",
      garbageValue = "-7958"
   )
   public static String method5634(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
            if (var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = Class166.method3441(var4);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }

               var6 = var5 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      signature = "([Lhi;IIIZB)V",
      garbageValue = "-81"
   )
   static void method5635(Class230[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < var0.length; ++var5) {
         Class230 var6 = var0[var5];
         if (var6 != null && var6.field2605 == var1) {
            Class64.method1563(var6, var2, var3, var4);
            Class22.method281(var6, var2, var3);
            if (var6.field2626 > var6.field2628 - var6.field2675) {
               var6.field2626 = var6.field2628 - var6.field2675;
            }

            if (var6.field2626 < 0) {
               var6.field2626 = 0;
            }

            if (var6.field2663 > var6.field2629 - var6.field2621) {
               var6.field2663 = var6.field2629 - var6.field2621;
            }

            if (var6.field2663 < 0) {
               var6.field2663 = 0;
            }

            if (var6.field2721 == 0) {
               Class163.method3388(var0, var6, var4);
            }
         }
      }

   }
}
