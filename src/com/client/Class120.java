package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class Class120 {
   @ObfuscatedName("z")
   public static boolean field1650 = false;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2004293301
   )
   static int field1648 = 0;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1960982477
   )
   static int field1649 = 0;
   @ObfuscatedName("l")
   static boolean field1652 = false;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1347288675
   )
   static int field1657;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2010243593
   )
   static int field1659;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1154137323
   )
   static int field1651;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -160115827
   )
   static int field1654;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1132219127
   )
   static int field1655;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 127802141
   )
   public static int field1656 = 0;
   @ObfuscatedName("g")
   public static long[] field1647 = new long[1000];

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIZIZB)V",
      garbageValue = "40"
   )
   static void method2781(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         Class65 var8 = Class65.field949[var6];
         Class65.field949[var6] = Class65.field949[var1];
         Class65.field949[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            if (Class109.method2503(Class65.field949[var9], var8, var2, var3, var4, var5) <= 0) {
               Class65 var10 = Class65.field949[var9];
               Class65.field949[var9] = Class65.field949[var7];
               Class65.field949[var7++] = var10;
            }
         }

         Class65.field949[var1] = Class65.field949[var7];
         Class65.field949[var7] = var8;
         method2781(var0, var7 - 1, var2, var3, var4, var5);
         method2781(var7 + 1, var1, var2, var3, var4, var5);
      }

   }
}
