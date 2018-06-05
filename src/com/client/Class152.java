package com.client;
import java.applet.Applet;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class Class152 extends RuntimeException {
   @ObfuscatedName("z")
   public static Applet field1938;
   @ObfuscatedName("w")
   public static String field1939;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1026373275
   )
   public static int field1940;
   @ObfuscatedName("u")
   String field1941;
   @ObfuscatedName("q")
   Throwable field1943;

   Class152(Throwable var1, String var2) {
      this.field1941 = var2;
      this.field1943 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-105"
   )
   public static boolean method3247(int var0) {
      return var0 >= Class233.field2759.field2777 && var0 <= Class233.field2764.field2777;
   }
}
