package com.client;
import java.applet.Applet;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class Class313 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   public static Class203 field3759 = new Class203();

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
      garbageValue = "-36"
   )
   public static void method5714(Applet var0, String var1) {
      Class45.field378 = var0;
      if (var1 != null) {
         Class45.field379 = var1;
      }

   }
}
