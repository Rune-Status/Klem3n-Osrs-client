package com.client;
import java.io.IOException;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public final class Class80 extends Class127 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lcn;"
   )
   public static Class98 field1149;
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static Class249 field1147;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 540016053
   )
   int field1151;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 119742129
   )
   int field1148;

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
   )
   protected final Class119 vmethod3067() {
      return Class111.method2563(this.field1151).method5093(this.field1148);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(S)Lbx;",
      garbageValue = "-27003"
   )
   static Class66 method1859() {
      Class110 var0 = null;
      Class66 var1 = new Class66();

      try {
         var0 = Class22.method283("", Class112.field1455.field3144, false);
         byte[] var2 = new byte[(int)var0.method2509()];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.method2510(var2, var3, var2.length - var3);
            if (var4 == -1) {
               throw new IOException();
            }
         }

         var1 = new Class66(new Class182(var2));
      } catch (Exception var6) {
         ;
      }

      try {
         if (var0 != null) {
            var0.method2507();
         }
      } catch (Exception var5) {
         ;
      }

      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1165618806"
   )
   public static void method1866(int var0) {
      Class48.field417 = var0;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "916064134"
   )
   public static int method1864(int var0) {
      return Class39.method673(Class120.field1647[var0]);
   }

   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      signature = "(Lba;B)V",
      garbageValue = "-41"
   )
   static final void method1865(Class63 var0) {
      if (var0.field918 == Client.field591 || var0.field903 == -1 || var0.field906 != 0 || var0.field901 + 1 > Class3.method25(var0.field903).field3541[var0.field904]) {
         int var1 = var0.field918 - var0.field917;
         int var2 = Client.field591 - var0.field917;
         int var3 = var0.field913 * 128 + var0.field874 * 64;
         int var4 = var0.field915 * 128 + var0.field874 * 64;
         int var5 = var0.field916 * 128 + var0.field874 * 64;
         int var6 = var0.field929 * 128 + var0.field874 * 64;
         var0.field931 = (var2 * var5 + var3 * (var1 - var2)) / var1;
         var0.field881 = (var2 * var6 + var4 * (var1 - var2)) / var1;
      }

      var0.field923 = 0;
      var0.field926 = var0.field919;
      var0.field905 = var0.field926;
   }
}
