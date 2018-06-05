package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class Class142 extends Class283 {
   @ObfuscatedName("z")
   final boolean field1890;

   public Class142(boolean var1) {
      this.field1890 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "-879071974"
   )
   int method3164(Class287 var1, Class287 var2) {
      if (var1.field3628 != 0) {
         if (var2.field3628 == 0) {
            return this.field1890 ? -1 : 1;
         }
      } else if (var2.field3628 != 0) {
         return this.field1890 ? 1 : -1;
      }

      return this.method5308(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3164((Class287)var1, (Class287)var2);
   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZB)Ljava/lang/String;",
      garbageValue = "20"
   )
   static String method3161(String var0, boolean var1) {
      String var2 = var1 ? "https://" : "http://";
      if (Client.field777 == 1) {
         var0 = var0 + "-wtrc";
      } else if (Client.field777 == 2) {
         var0 = var0 + "-wtqa";
      } else if (Client.field777 == 3) {
         var0 = var0 + "-wtwip";
      } else if (Client.field777 == 5) {
         var0 = var0 + "-wti";
      } else if (Client.field777 == 4) {
         var0 = "local";
      }

      String var3 = "";
      if (Class163.field2013 != null) {
         var3 = "/p=" + Class163.field2013;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + Client.field827 + "/a=" + Class124.field1709 + var3 + "/";
   }
}
