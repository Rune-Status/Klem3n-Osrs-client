package com.client;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class Class1 {
   @ObfuscatedName("mt")
   @ObfuscatedGetter(
      intValue = -1202584647
   )
   static int field15;
   @ObfuscatedName("w")
   public static Comparator field9 = new Class7();
   @ObfuscatedName("s")
   public static Comparator field13;
   @ObfuscatedName("l")
   public static Comparator field11;
   @ObfuscatedName("u")
   public static Comparator field16;
   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      signature = "Lkv;"
   )
   static Class296 field14;
   @ObfuscatedName("z")
   public final List field10;

   static {
      new Class0();
      field13 = new Class5();
      field11 = new Class6();
      field16 = new Class3();
   }

   @ObfuscatedSignature(
      signature = "(Lgk;Z)V",
      garbageValue = "1"
   )
   public Class1(Class182 var1, boolean var2) {
      int var3 = var1.method3550();
      boolean var4 = var1.method3544() == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.method3550();
      this.field10 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field10.add(new Class2(var1, var5, var3));
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;ZB)V",
      garbageValue = "48"
   )
   public void method9(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.field10, var1);
      } else {
         Collections.sort(this.field10, Collections.reverseOrder(var1));
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "319934987"
   )
   public static final boolean method8() {
      Class39 var0 = Class39.field337;
      synchronized(Class39.field337) {
         if (Class39.field352 == Class39.field350) {
            return false;
         } else {
            Class163.field2016 = Class39.field348[Class39.field350];
            Class39.field342 = Class39.field346[Class39.field350];
            Class39.field350 = Class39.field350 + 1 & 127;
            return true;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Ljv;",
      garbageValue = "1"
   )
   public static Class272 method15(int var0) {
      Class272 var1 = (Class272)Class272.field3524.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class272.field3529.method4625(4, var0);
         var1 = new Class272();
         if (var2 != null) {
            var1.method5194(new Class182(var2), var0);
         }

         var1.method5195();
         Class272.field3524.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("il")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lhi;I)Ljava/lang/String;",
      garbageValue = "1244240994"
   )
   static String method11(String var0, Class230 var1) {
      if (var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if (var3 == -1) {
                  break;
               }

               String var4 = var0.substring(0, var3);
               int var6 = Class137.method3119(var1, var2 - 1);
               String var5;
               if (var6 < 999999999) {
                  var5 = Integer.toString(var6);
               } else {
                  var5 = "*";
               }

               var0 = var4 + var5 + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1214880142"
   )
   static final void method13() {
      Client.field828 = Client.field801;
      Class54.field489 = true;
   }
}
