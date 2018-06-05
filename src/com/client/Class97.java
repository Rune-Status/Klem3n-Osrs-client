package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class Class97 implements Runnable {
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static Class249 field1329;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "[Lcx;"
   )
   volatile Class95[] field1327 = new Class95[2];

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            Class95 var2 = this.field1327[var1];
            if (var2 != null) {
               var2.method2144();
            }
         }
      } catch (Exception var4) {
         Class5.method65((String)null, var4);
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1865447879"
   )
   public static boolean method2214(int var0, int var1) {
      return (var0 >> var1 + 1 & 1) != 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;ZB)[B",
      garbageValue = "0"
   )
   public static byte[] method2211(Object var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var3 = (byte[])((byte[])var0);
         return var1 ? Class59.method1075(var3) : var3;
      } else if (var0 instanceof Class186) {
         Class186 var2 = (Class186)var0;
         return var2.vmethod3789();
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1818249317"
   )
   static final void method2213() {
      Client.field626.method1982();
      Class54.method1020();
      Class28.field248.method2903();

      for(int var0 = 0; var0 < 4; ++var0) {
         Client.field642[var0].method3392();
      }

      System.gc();
      Class26.method427(2);
      Client.field812 = -1;
      Client.field813 = false;

      for(Class68 var1 = (Class68)Class68.field985.method4098(); var1 != null; var1 = (Class68)Class68.field985.method4079()) {
         if (var1.field993 != null) {
            Class36.field310.method2009(var1.field993);
            var1.field993 = null;
         }

         if (var1.field980 != null) {
            Class36.field310.method2009(var1.field980);
            var1.field980 = null;
         }
      }

      Class68.field985.method4072();
      Class48.method947(10);
   }

   @ObfuscatedName("km")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-902888602"
   )
   static void method2215() {
      if (Class21.field175 != null) {
         Client.field650 = Client.field591;
         Class21.field175.method4774();

         for(int var0 = 0; var0 < Client.field610.length; ++var0) {
            if (Client.field610[var0] != null) {
               Class21.field175.method4773((Client.field610[var0].field931 >> 7) + Class62.field868, (Client.field610[var0].field881 >> 7) + Client.field754);
            }
         }
      }

   }
}
