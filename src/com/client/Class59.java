package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class Class59 extends Class166 {
   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static Class249 field543;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIILfk;B)Z",
      garbageValue = "27"
   )
   protected boolean vmethod3440(int var1, int var2, int var3, Class164 var4) {
      return var2 == super.field2043 && var3 == super.field2048;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "249825908"
   )
   static String method1076() {
      return Class10.field61.field962 ? Class265.method4976(Class78.field1106) : Class78.field1106;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "46558014"
   )
   static void method1079() {
      if (Class78.field1101) {
         Class78.field1083 = null;
         Class78.field1084 = null;
         Class78.field1111 = null;
         Class78.field1092 = null;
         Class78.field1087 = null;
         Class78.field1117 = null;
         Class124.field1708 = null;
         Class235.field2783 = null;
         Class78.field1089 = null;
         Class166.field2047 = null;
         Class13.field85 = null;
         Class126.field1779 = null;
         Class28.field237 = null;
         Class232.field2752 = null;
         Class64.field936 = null;
         Class185.field2364 = null;
         Class11.field69 = null;
         Class77.field1077 = null;
         Class186.field2367 = null;
         Class81.field1169 = null;
         Class40.field357 = null;
         Class76.field1073 = null;
         Class26.method427(2);
         Class222.method4410(true);
         Class78.field1101 = false;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "([BB)[B",
      garbageValue = "16"
   )
   static byte[] method1075(byte[] var0) {
      int var1 = var0.length;
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-12265"
   )
   static void method1078() {
      if (Class4.method36()) {
         Class78.field1107 = true;
      }

   }

   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      signature = "(Lba;II)V",
      garbageValue = "1397155000"
   )
   static final void method1080(Class63 var0, int var1) {
      if (var0.field917 > Client.field591) {
         int var2 = var0.field917 - Client.field591;
         int var3 = var0.field913 * 128 + var0.field874 * 64;
         int var4 = var0.field915 * 128 + var0.field874 * 64;
         var0.field931 += (var3 - var0.field931) / var2;
         var0.field881 += (var4 - var0.field881) / var2;
         var0.field923 = 0;
         var0.field926 = var0.field919;
      } else if (var0.field918 >= Client.field591) {
         Class80.method1865(var0);
      } else {
         Class35.method609(var0);
      }

      if (var0.field931 < 128 || var0.field881 < 128 || var0.field931 >= 13184 || var0.field881 >= 13184) {
         var0.field903 = -1;
         var0.field891 = -1;
         var0.field917 = 0;
         var0.field918 = 0;
         var0.field931 = var0.field922[0] * 128 + var0.field874 * 64;
         var0.field881 = var0.field872[0] * 128 + var0.field874 * 64;
         var0.method1540();
      }

      if (Class138.field1876 == var0 && (var0.field931 < 1536 || var0.field881 < 1536 || var0.field931 >= 11776 || var0.field881 >= 11776)) {
         var0.field903 = -1;
         var0.field891 = -1;
         var0.field917 = 0;
         var0.field918 = 0;
         var0.field931 = var0.field922[0] * 128 + var0.field874 * 64;
         var0.field881 = var0.field872[0] * 128 + var0.field874 * 64;
         var0.method1540();
      }

      Class3.method26(var0);
      Class295.method5502(var0);
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "52245424"
   )
   static void method1077() {
      Client.field771 = 0;
      Client.field716 = false;
      Client.field735[0] = "Cancel";
      Client.field740[0] = "";
      Client.field720[0] = 1006;
      Client.field590[0] = false;
      Client.field771 = 1;
   }
}
