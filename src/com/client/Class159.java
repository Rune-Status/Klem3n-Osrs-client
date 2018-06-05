package com.client;
import java.io.IOException;
import java.net.Socket;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class Class159 extends Class157 {
   @ObfuscatedName("z")
   Socket field1982;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lej;"
   )
   Class151 field1980;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfc;"
   )
   Class163 field1983;

   Class159(Socket var1, int var2, int var3) throws IOException {
      this.field1982 = var1;
      this.field1982.setSoTimeout(30000);
      this.field1982.setTcpNoDelay(true);
      this.field1982.setReceiveBufferSize(65536);
      this.field1982.setSendBufferSize(65536);
      this.field1980 = new Class151(this.field1982.getInputStream(), var2);
      this.field1983 = new Class163(this.field1982.getOutputStream(), var3);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "1"
   )
   public boolean vmethod3350(int var1) throws IOException {
      return this.field1980.method3219(var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1213474120"
   )
   public int vmethod3349() throws IOException {
      return this.field1980.method3217();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2096783031"
   )
   public int vmethod3353() throws IOException {
      return this.field1980.method3218();
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-2097961075"
   )
   public int vmethod3351(byte[] var1, int var2, int var3) throws IOException {
      return this.field1980.method3224(var1, var2, var3);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-100"
   )
   public void vmethod3347(byte[] var1, int var2, int var3) throws IOException {
      this.field1983.method3383(var1, var2, var3);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1775992211"
   )
   public void vmethod3346() {
      this.field1983.method3384();

      try {
         this.field1982.close();
      } catch (IOException var2) {
         ;
      }

      this.field1980.method3215();
   }

   protected void finalize() {
      this.vmethod3346();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "([BZI)Ljava/lang/Object;",
      garbageValue = "-826976613"
   )
   public static Object method3324(byte[] var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else {
         if (var0.length > 136 && !Class186.field2365) {
            try {
               Class180 var2 = new Class180();
               var2.vmethod3792(var0);
               return var2;
            } catch (Throwable var3) {
               Class186.field2365 = true;
            }
         }

         return var0;
      }
   }
}
