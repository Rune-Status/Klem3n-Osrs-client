package com.client;
import java.text.DecimalFormat;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public class Class78 {
   @ObfuscatedName("z")
   static boolean field1101;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1570895999
   )
   static int field1082 = 0;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static Class317 field1083;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static Class317 field1084;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   static Class317[] field1111;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static Class318 field1092;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static Class318 field1087;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static Class317 field1117;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static Class317 field1089;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 497255191
   )
   static int field1090;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1723235133
   )
   static int field1091;
   @ObfuscatedName("a")
   static int[] field1093;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 176451679
   )
   static int field1088;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1171598757
   )
   static int field1094;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1476562557
   )
   static int field1095;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1033770495
   )
   static int field1096;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1870143355
   )
   static int field1097;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 868889457
   )
   static int field1114;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1434866071
   )
   static int field1099;
   @ObfuscatedName("ac")
   static String field1100;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1062373165
   )
   static int field1081;
   @ObfuscatedName("au")
   static String field1098;
   @ObfuscatedName("av")
   static String field1103;
   @ObfuscatedName("al")
   static String field1112;
   @ObfuscatedName("ae")
   static String field1105;
   @ObfuscatedName("az")
   static String field1106;
   @ObfuscatedName("aq")
   static String field1086;
   @ObfuscatedName("ad")
   static boolean field1108;
   @ObfuscatedName("bp")
   static boolean field1110;
   @ObfuscatedName("bi")
   static boolean field1115;
   @ObfuscatedName("bq")
   static boolean field1104;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -705152905
   )
   static int field1102;
   @ObfuscatedName("bl")
   static boolean field1107;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 381075233
   )
   static int field1116;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      longValue = -8950576353384891287L
   )
   static long field1109;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      longValue = 8067562351581494099L
   )
   static long field1118;

   static {
      field1090 = field1082 + 202;
      field1093 = new int[256];
      field1088 = 0;
      field1094 = 0;
      field1095 = 0;
      field1096 = 0;
      field1097 = 0;
      field1114 = 0;
      field1099 = 10;
      field1100 = "";
      field1081 = 0;
      field1098 = "";
      field1103 = "";
      field1112 = "";
      field1105 = "";
      field1106 = "";
      field1086 = "";
      field1108 = false;
      field1110 = false;
      field1115 = false;
      field1104 = true;
      field1102 = 0;
      field1107 = false;
      field1116 = -1;
      new DecimalFormat("##0.00");
      new Class148();
      field1109 = -1L;
      field1118 = -1L;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "([BIII)Ljava/lang/String;",
      garbageValue = "-1849601215"
   )
   public static String method1831(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = Class301.field3714[var6 - 128];
               if (var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }
}
