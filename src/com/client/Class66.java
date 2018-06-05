package com.client;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class Class66 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -344414119
   )
   static int field964 = 6;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 1850992515
   )
   static int field966;
   @ObfuscatedName("s")
   boolean field960;
   @ObfuscatedName("l")
   boolean field958;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -514581919
   )
   int field957 = 1;
   @ObfuscatedName("q")
   String field959 = null;
   @ObfuscatedName("k")
   boolean field962 = false;
   @ObfuscatedName("i")
   LinkedHashMap field963 = new LinkedHashMap();

   Class66() {
      this.method1613(true);
   }

   @ObfuscatedSignature(
      signature = "(Lgk;)V"
   )
   Class66(Class182 var1) {
      if (var1 != null && var1.payload != null) {
         int var2 = var1.method3544();
         if (var2 >= 0 && var2 <= field964) {
            if (var1.method3544() == 1) {
               this.field960 = true;
            }

            if (var2 > 1) {
               this.field958 = var1.method3544() == 1;
            }

            if (var2 > 3) {
               this.field957 = var1.method3544();
            }

            if (var2 > 2) {
               int var3 = var1.method3544();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.method3671();
                  int var6 = var1.method3671();
                  this.field963.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.field959 = var1.method3752();
            }

            if (var2 > 5) {
               this.field962 = var1.method3555();
            }
         } else {
            this.method1613(true);
         }
      } else {
         this.method1613(true);
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1739738727"
   )
   void method1613(boolean var1) {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Lgk;",
      garbageValue = "1661970638"
   )
   Class182 method1609() {
      Class182 var1 = new Class182(100);
      var1.method3532(field964);
      var1.method3532(this.field960 ? 1 : 0);
      var1.method3532(this.field958 ? 1 : 0);
      var1.method3532(this.field957);
      var1.method3532(this.field963.size());
      Iterator var2 = this.field963.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.method3707((Integer)var3.getKey());
         var1.method3707((Integer)var3.getValue());
      }

      var1.method3699(this.field959 != null ? this.field959 : "");
      var1.method3766(this.field962);
      return var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-179570605"
   )
   public static void method1622(int var0) {
      if (var0 != -1) {
         if (Class175.field2271[var0]) {
            Class230.field2729.method4639(var0);
            if (Class42.field366[var0] != null) {
               boolean var1 = true;

               for(int var2 = 0; var2 < Class42.field366[var0].length; ++var2) {
                  if (Class42.field366[var0][var2] != null) {
                     if (Class42.field366[var0][var2].field2721 != 2) {
                        Class42.field366[var0][var2] = null;
                     } else {
                        var1 = false;
                     }
                  }
               }

               if (var1) {
                  Class42.field366[var0] = null;
               }

               Class175.field2271[var0] = false;
            }
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1297107509"
   )
   static int method1621(int var0) {
      Class58 var1 = (Class58)Class83.field1181.method3945((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.field2426 == Class83.field1184.field2445 ? -1 : ((Class58)var1.field2426).field540;
      }
   }
}
