package com.client;
import java.util.zip.Inflater;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class Class175 {
   @ObfuscatedName("k")
   static boolean[] field2271;
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static Class249 field2270;
   @ObfuscatedName("z")
   Inflater field2268;

   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1000000"
   )
   Class175(int var1, int var2, int var3) {
   }

   public Class175() {
      this(-1, 1000000, 1000000);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;[BI)V",
      garbageValue = "641933971"
   )
   public void method3483(Class182 var1, byte[] var2) {
      if (var1.payload[var1.field2339] == 31 && var1.payload[var1.field2339 + 1] == -117) {
         if (this.field2268 == null) {
            this.field2268 = new Inflater(true);
         }

         try {
            this.field2268.setInput(var1.payload, var1.field2339 + 10, var1.payload.length - (var1.field2339 + 8 + 10));
            this.field2268.inflate(var2);
         } catch (Exception var4) {
            this.field2268.reset();
            throw new RuntimeException("");
         }

         this.field2268.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Lii;",
      garbageValue = "-1879492666"
   )
   public static Class257 method3485(int var0) {
      Class257 var1 = (Class257)Class257.field3260.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class257.field3264.method4625(15, var0);
         var1 = new Class257();
         if (var2 != null) {
            var1.method4852(new Class182(var2));
         }

         Class257.field3260.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("je")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-6945047"
   )
   static void method3487(Class182 var0, int var1) {
      byte[] var2 = var0.payload;
      if (Client.field620 == null) {
         Client.field620 = new byte[24];
      }

      Class193.method3873(var2, var1, Client.field620, 0, 24);
      Class146.method3190(var0, var1);
   }
}
