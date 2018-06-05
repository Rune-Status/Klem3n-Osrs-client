package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
public class Class67 {
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 973416531
   )
   static int field978;
   @ObfuscatedName("fu")
   static int[][] field973;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   final Class322 field974;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lkf;"
   )
   public final Class290 field970;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lje;"
   )
   public final Class284 field975;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1943530059
   )
   int field976 = 0;

   @ObfuscatedSignature(
      signature = "(Llm;)V"
   )
   Class67(Class322 var1) {
      this.field974 = var1;
      this.field970 = new Class290(var1);
      this.field975 = new Class284(var1);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2083457181"
   )
   boolean method1624() {
      return this.field976 == 2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1458971090"
   )
   final void method1625() {
      this.field976 = 1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-2029618051"
   )
   final void method1679(Class182 var1, int var2) {
      this.field970.method5424(var1, var2);
      this.field976 = 2;
      Class53.method1012();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "916911588"
   )
   final void method1627() {
      for(Class294 var1 = (Class294)this.field970.field3639.method4111(); var1 != null; var1 = (Class294)this.field970.field3639.method4114()) {
         if ((long)var1.field3665 < Class182.method3547() / 1000L - 5L) {
            if (var1.field3664 > 0) {
               Class143.method3172(5, "", var1.field3662 + " has logged in.");
            }

            if (var1.field3664 == 0) {
               Class143.method3172(5, "", var1.field3662 + " has logged out.");
            }

            var1.method4121();
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-746063861"
   )
   final void method1628() {
      this.field976 = 0;
      this.field970.method5326();
      this.field975.method5326();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lkm;ZI)Z",
      garbageValue = "-1961233435"
   )
   final boolean method1660(Class291 var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (var1.equals(Class138.field1876.field552)) {
         return true;
      } else {
         return this.field970.method5423(var1, var2);
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "-1614375319"
   )
   final boolean method1630(Class291 var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.field975.method5329(var1);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "25"
   )
   final void method1631(String var1) {
      if (var1 != null) {
         Class291 var2 = new Class291(var1, this.field974);
         if (var2.method5441()) {
            Object var10000;
            String var4;
            if (this.method1632()) {
               var10000 = null;
               var4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
               Class143.method3172(30, "", var4);
            } else if (Class138.field1876.field552.equals(var2)) {
               var10000 = null;
               var4 = "You can't add yourself to your own friend list";
               Class143.method3172(30, "", var4);
            } else if (this.method1660(var2, false)) {
               Class233.method4588(var1);
            } else if (this.method1630(var2)) {
               Class51.method995(var1);
            } else {
               Class172 var3 = Class26.method433(ClientPackets.field2194, Client.field626.field1218);
               var3.field2257.method3532(Class316.method5820(var1));
               var3.field2257.method3699(var1);
               Client.field626.method1980(var3);
            }
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1546113149"
   )
   final boolean method1632() {
      return this.field970.method5328() || this.field970.method5327() >= 200 && Client.field698 != 1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "1"
   )
   final void method1633(String var1) {
      if (var1 != null) {
         Class291 var2 = new Class291(var1, this.field974);
         if (var2.method5441()) {
            if (this.method1634()) {
               Class28.method475();
            } else {
               StringBuilder var10000;
               String var4;
               if (Class138.field1876.field552.equals(var2)) {
                  var10000 = null;
                  var4 = "You can't add yourself to your own ignore list";
                  Class143.method3172(30, "", var4);
               } else if (this.method1630(var2)) {
                  Class21.method271(var1);
               } else if (this.method1660(var2, false)) {
                  var10000 = new StringBuilder();
                  Object var10001 = null;
                  var10000 = var10000.append("Please remove ").append(var1);
                  var10001 = null;
                  var4 = var10000.append(" from your friend list first").toString();
                  Class143.method3172(30, "", var4);
               } else {
                  Class172 var3 = Class26.method433(ClientPackets.field2221, Client.field626.field1218);
                  var3.field2257.method3532(Class316.method5820(var1));
                  var3.field2257.method3699(var1);
                  Client.field626.method1980(var3);
               }
            }
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "128"
   )
   final boolean method1634() {
      return this.field975.method5328() || this.field975.method5327() >= 100 && Client.field698 != 1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-434645488"
   )
   final void method1665(String var1) {
      if (var1 != null) {
         Class291 var2 = new Class291(var1, this.field974);
         if (var2.method5441()) {
            if (this.field970.method5393(var2)) {
               Client.field647 = Client.field801;
               Class172 var3 = Class26.method433(ClientPackets.field2203, Client.field626.field1218);
               var3.field2257.method3532(Class316.method5820(var1));
               var3.field2257.method3699(var1);
               Client.field626.method1980(var3);
            }

            Class53.method1012();
         }
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-636186966"
   )
   final void method1636(String var1) {
      if (var1 != null) {
         Class291 var2 = new Class291(var1, this.field974);
         if (var2.method5441()) {
            if (this.field975.method5393(var2)) {
               Client.field647 = Client.field801;
               Class172 var3 = Class26.method433(ClientPackets.field2157, Client.field626.field1218);
               var3.field2257.method3532(Class316.method5820(var1));
               var3.field2257.method3699(var1);
               Client.field626.method1980(var3);
            }

            Class47.method910();
            if (Class14.field94 != null) {
               Class14.field94.method5468();
            }

         }
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "1644898931"
   )
   final boolean method1637(Class291 var1) {
      Class292 var2 = (Class292)this.field970.method5330(var1);
      return var2 != null && var2.method5415();
   }

   @ObfuscatedName("z")
   public static boolean method1683(long var0) {
      boolean var2 = var0 != 0L;
      if (var2) {
         boolean var3 = (int)(var0 >>> 16 & 1L) == 1;
         var2 = !var3;
      }

      return var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgu;IIS)I",
      garbageValue = "-17706"
   )
   static int method1668(Class197 var0, int var1, int var2) {
      if (var0 == null) {
         return var2;
      } else {
         Class211 var3 = (Class211)var0.method3945((long)var1);
         return var3 == null ? var2 : var3.field2438;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1734020068"
   )
   public static void method1685(int var0, int var1) {
      Class263 var3 = (Class263)Class263.field3321.method3989((long)var0);
      Class263 var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var8 = Class263.field3322.method4625(14, var0);
         var3 = new Class263();
         if (var8 != null) {
            var3.method4941(new Class182(var8));
         }

         Class263.field3321.method3983(var3, (long)var0);
         var2 = var3;
      }

      int var4 = var2.field3320;
      int var5 = var2.field3323;
      int var6 = var2.field3326;
      int var7 = Class225.field2557[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      Class225.clientVarps[var4] = Class225.clientVarps[var4] & ~var7 | var1 << var5 & var7;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Lly;B)V",
      garbageValue = "-7"
   )
   static final void method1682(Class317 var0) {
      short var1 = 256;

      int var2;
      for(var2 = 0; var2 < Class186.field2367.length; ++var2) {
         Class186.field2367[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0D * (double)var1);
         Class186.field2367[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < var1 - 1; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               Class81.field1169[var5] = (Class186.field2367[var5 - 128] + Class186.field2367[var5 + 1] + Class186.field2367[var5 + 128] + Class186.field2367[var5 - 1]) / 4;
            }
         }

         int[] var8 = Class186.field2367;
         Class186.field2367 = Class81.field1169;
         Class81.field1169 = var8;
      }

      if (var0 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var0.field3781; ++var3) {
            for(var4 = 0; var4 < var0.field3780; ++var4) {
               if (var0.field3785[var2++] != 0) {
                  var5 = var4 + var0.field3782 + 16;
                  int var6 = var3 + var0.field3778 + 16;
                  int var7 = var5 + (var6 << 7);
                  Class186.field2367[var7] = 0;
               }
            }
         }
      }

   }

   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1786186478"
   )
   static void method1655() {
      int var0 = Class81.field1167;
      int[] var1 = Class81.field1159;

      for(int var2 = 0; var2 < var0; ++var2) {
         if (var1[var2] != Client.field707 && var1[var2] != Client.field628) {
            Class11.method98(Client.field610[var1[var2]], true);
         }
      }

   }
}
