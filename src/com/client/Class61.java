package com.client;
import java.util.Comparator;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public class Class61 implements Comparator {
   @ObfuscatedName("po")
   @ObfuscatedSignature(
      signature = "Lcu;"
   )
   static Class102 field577;
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static Class249 field576;
   @ObfuscatedName("z")
   boolean field575;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ls;Ls;B)I",
      garbageValue = "-86"
   )
   int method1123(Class2 var1, Class2 var2) {
      if (var2.field19 == var1.field19) {
         return 0;
      } else {
         if (this.field575) {
            if (Client.field581 == var1.field19) {
               return -1;
            }

            if (var2.field19 == Client.field581) {
               return 1;
            }
         }

         return var1.field19 < var2.field19 ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1123((Class2)var1, (Class2)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Lbh;",
      garbageValue = "44"
   )
   static Class58 method1130(int var0) {
      return (Class58)Class83.field1181.method3945((long)var0);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lbb;B)V",
      garbageValue = "95"
   )
   static void method1129(Class65 var0) {
      if (var0.method1589() != Client.field668) {
         Client.field668 = var0.method1589();
         boolean var1 = var0.method1589();
         if (var1 != Class269.field3426) {
            Class57.method1036();
            Class269.field3426 = var1;
         }
      }

      Class54.field485 = var0.field950;
      Client.field581 = var0.field947;
      Client.field632 = var0.field948;
      Class26.field223 = Client.field777 == 0 ? 'ꩊ' : var0.field947 + '鱀';
      Class68.field996 = Client.field777 == 0 ? 443 : var0.field947 + '썐';
      Class290.field3636 = Class26.field223;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-173135414"
   )
   static int method1126(int var0, Class84 var1, boolean var2) {
      Class230 var3 = Class26.method434(Class69.field999[--Class69.field1003]);
      if (var0 == 2800) {
         Class69.field999[++Class69.field1003 - 1] = Class154.method3252(Class24.method425(var3));
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
            if (var3.field2679 == null) {
               Class69.field1001[++Class55.field497 - 1] = "";
            } else {
               Class69.field1001[++Class55.field497 - 1] = var3.field2679;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Class69.field999[--Class69.field1003];
         --var4;
         if (var3.field2680 != null && var4 < var3.field2680.length && var3.field2680[var4] != null) {
            Class69.field1001[++Class55.field497 - 1] = var3.field2680[var4];
         } else {
            Class69.field1001[++Class55.field497 - 1] = "";
         }

         return 1;
      }
   }
}
