package com.client;
import java.awt.Font;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class Class154 implements Runnable {
   @ObfuscatedName("z")
   public static String field1960;
   @ObfuscatedName("w")
   public static String field1954;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static Class247 field1956;
   @ObfuscatedName("aw")
   static Font field1961;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lee;"
   )
   Class153 field1955 = null;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lee;"
   )
   Class153 field1953 = null;
   @ObfuscatedName("u")
   Thread field1957;
   @ObfuscatedName("q")
   boolean field1958 = false;

   public Class154() {
      field1960 = "Unknown";
      field1954 = "1.6";

      try {
         field1960 = System.getProperty("java.vendor");
         field1954 = System.getProperty("java.version");
      } catch (Exception var2) {
         ;
      }

      this.field1958 = false;
      this.field1957 = new Thread(this);
      this.field1957.setPriority(10);
      this.field1957.setDaemon(true);
      this.field1957.start();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "417031791"
   )
   public final void method3256() {
      synchronized(this) {
         this.field1958 = true;
         this.notifyAll();
      }

      try {
         this.field1957.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIILjava/lang/Object;I)Lee;",
      garbageValue = "755580471"
   )
   final Class153 method3251(int var1, int var2, int var3, Object var4) {
      Class153 var5 = new Class153();
      var5.field1949 = var1;
      var5.field1950 = var2;
      var5.field1951 = var4;
      synchronized(this) {
         if (this.field1953 != null) {
            this.field1953.field1947 = var5;
            this.field1953 = var5;
         } else {
            this.field1953 = this.field1955 = var5;
         }

         this.notify();
         return var5;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;II)Lee;",
      garbageValue = "-334479783"
   )
   public final Class153 method3259(String var1, int var2) {
      return this.method3251(1, var2, 0, var1);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Runnable;II)Lee;",
      garbageValue = "1672602296"
   )
   public final Class153 method3249(Runnable var1, int var2) {
      return this.method3251(2, var2, 0, var1);
   }

   public final void run() {
      while(true) {
         Class153 var1;
         synchronized(this) {
            while(true) {
               if (this.field1958) {
                  return;
               }

               if (this.field1955 != null) {
                  var1 = this.field1955;
                  this.field1955 = this.field1955.field1947;
                  if (this.field1955 == null) {
                     this.field1953 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var8) {
                  ;
               }
            }
         }

         try {
            int var5 = var1.field1949;
            if (var5 == 1) {
               var1.field1944 = new Socket(InetAddress.getByName((String)var1.field1951), var1.field1950);
            } else if (var5 == 2) {
               Thread var3 = new Thread((Runnable)var1.field1951);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field1950);
               var1.field1944 = var3;
            } else if (var5 == 4) {
               var1.field1944 = new DataInputStream(((URL)var1.field1951).openStream());
            }

            var1.field1946 = 1;
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            var1.field1946 = 2;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-80"
   )
   public static int method3252(int var0) {
      return var0 >> 11 & 63;
   }
}
