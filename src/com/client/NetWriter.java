package com.client;
import java.io.IOException;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public class NetWriter {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfd;"
   )
   Class157 field1214;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   Class203 field1223 = new Class203();
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1758377903
   )
   int field1216 = 0;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   Class182 field1217 = new Class182(5000);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   public Class190 field1218;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgi;"
   )
   Class189 field1219 = new Class189(40000);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lfj;"
   )
   ServerPackets recievedPacket = null;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 321778423
   )
   int packetSize = 0;
   @ObfuscatedName("x")
   boolean field1222 = true;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 590402107
   )
   int field1228 = 0;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -856359331
   )
   int field1224 = 0;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lfj;"
   )
   ServerPackets field1215;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lfj;"
   )
   ServerPackets field1226;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfj;"
   )
   ServerPackets field1227;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "54"
   )
   final void method1978() {
      this.field1223.method4030();
      this.field1216 = 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "86"
   )
   final void method1979() throws IOException {
      if (this.field1214 != null && this.field1216 > 0) {
         this.field1217.field2339 = 0;

         while(true) {
            Class172 var1 = (Class172)this.field1223.method4048();
            if (var1 == null || var1.field2255 > this.field1217.payload.length - this.field1217.field2339) {
               this.field1214.vmethod3347(this.field1217.payload, 0, this.field1217.field2339);
               this.field1224 = 0;
               break;
            }

            this.field1217.method3542(var1.field2257.payload, 0, var1.field2255);
            this.field1216 -= var1.field2255;
            var1.method4064();
            var1.field2257.method3531();
            var1.method3460();
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lfn;B)V",
      garbageValue = "1"
   )
   public final void method1980(Class172 var1) {
      this.field1223.method4031(var1);
      var1.field2255 = var1.field2257.field2339;
      var1.field2257.field2339 = 0;
      this.field1216 += var1.field2255;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lfd;I)V",
      garbageValue = "1571266841"
   )
   void method1997(Class157 var1) {
      this.field1214 = var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "822"
   )
   void method1982() {
      if (this.field1214 != null) {
         this.field1214.vmethod3346();
         this.field1214 = null;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   void method1984() {
      this.field1214 = null;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)Lfd;",
      garbageValue = "-1005622173"
   )
   Class157 method1983() {
      return this.field1214;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;ZII)V",
      garbageValue = "1336777365"
   )
   static void method1994(Class247 var0, Class247 var1, boolean var2, int var3) {
      if (Class78.field1101) {
         if (var3 == 4) {
            Class78.field1081 = 4;
         }

      } else {
         Class78.field1081 = var3;
         Class314.method5724();
         byte[] var4 = var0.method4684("title.jpg", "");
         Class78.field1092 = Class284.method5324(var4);
         Class78.field1087 = Class78.field1092.method5840();
         if ((Client.field632 & 536870912) != 0) {
            Class78.field1117 = Class221.method4374(var1, "logo_deadman_mode", "");
         } else {
            Class78.field1117 = Class221.method4374(var1, "logo", "");
         }

         Class78.field1083 = Class221.method4374(var1, "titlebox", "");
         Class78.field1084 = Class221.method4374(var1, "titlebutton", "");
         Class78.field1111 = Class13.method113(var1, "runes", "");
         Class124.field1708 = Class13.method113(var1, "title_mute", "");
         Class235.field2783 = Class221.method4374(var1, "options_radio_buttons,0", "");
         Class102.field1352 = Class221.method4374(var1, "options_radio_buttons,4", "");
         Class78.field1089 = Class221.method4374(var1, "options_radio_buttons,2", "");
         Class53.field472 = Class221.method4374(var1, "options_radio_buttons,6", "");
         Class67.field978 = Class235.field2783.field3780;
         Class66.field966 = Class235.field2783.field3781;
         Class64.field936 = new int[256];

         int var5;
         for(var5 = 0; var5 < 64; ++var5) {
            Class64.field936[var5] = var5 * 262144;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            Class64.field936[var5 + 64] = var5 * 1024 + 16711680;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            Class64.field936[var5 + 128] = var5 * 4 + 16776960;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            Class64.field936[var5 + 192] = 16777215;
         }

         Class185.field2364 = new int[256];

         for(var5 = 0; var5 < 64; ++var5) {
            Class185.field2364[var5] = var5 * 1024;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            Class185.field2364[var5 + 64] = var5 * 4 + '\uff00';
         }

         for(var5 = 0; var5 < 64; ++var5) {
            Class185.field2364[var5 + 128] = var5 * 262144 + '\uffff';
         }

         for(var5 = 0; var5 < 64; ++var5) {
            Class185.field2364[var5 + 192] = 16777215;
         }

         Class11.field69 = new int[256];

         for(var5 = 0; var5 < 64; ++var5) {
            Class11.field69[var5] = var5 * 4;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            Class11.field69[var5 + 64] = var5 * 262144 + 255;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            Class11.field69[var5 + 128] = var5 * 1024 + 16711935;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            Class11.field69[var5 + 192] = 16777215;
         }

         Class77.field1077 = new int[256];
         Class186.field2367 = new int['耀'];
         Class81.field1169 = new int['耀'];
         Class67.method1682((Class317)null);
         Class40.field357 = new int['耀'];
         Class76.field1073 = new int['耀'];
         if (var2) {
            Class78.field1106 = "";
            Class78.field1086 = "";
         }

         Class14.field104 = 0;
         Class28.field238 = "";
         Class78.field1104 = true;
         Class78.field1107 = false;
         if (!Class10.field61.field958) {
            Class23.method422(2, Class80.field1147, "scape main", "", 255, false);
         } else {
            Class26.method427(2);
         }

         Class222.method4410(false);
         Class78.field1101 = true;
         Class78.field1082 = (Class82.field1179 - 765) / 2;
         Class78.field1090 = Class78.field1082 + 202;
         Class78.field1091 = Class78.field1090 + 180;
         Class78.field1092.method5849(Class78.field1082, 0);
         Class78.field1087.method5849(Class78.field1082 + 382, 0);
         Class78.field1117.method5829(Class78.field1082 + 382 - Class78.field1117.field3780 / 2, 18);
      }
   }

   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-72700836"
   )
   static final void method2005(boolean var0) {
      if (var0) {
         Client.field619 = Class78.field1104 ? Class146.field1910 : Class146.field1905;
      } else {
         Client.field619 = Class10.field61.field963.containsKey(Class3.method35(Class78.field1106)) ? Class146.field1908 : Class146.field1907;
      }

   }
}
