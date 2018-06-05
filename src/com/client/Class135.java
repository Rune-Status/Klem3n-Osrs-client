package com.client;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class Class135 implements Runnable {
   @ObfuscatedName("i")
   static ScheduledExecutorService field1855;
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static Class249 field1852;
   @ObfuscatedName("jf")
   @ObfuscatedGetter(
      intValue = 1445652317
   )
   static int field1856;
   @ObfuscatedName("z")
   final Thread field1854 = new Thread(this);
   @ObfuscatedName("w")
   volatile boolean field1853;
   @ObfuscatedName("s")
   Queue field1858 = new LinkedList();

   public Class135() {
      this.field1854.setPriority(1);
      this.field1854.start();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/net/URL;I)Leh;",
      garbageValue = "790678851"
   )
   public Class136 method3109(URL var1) {
      Class136 var2 = new Class136(var1);
      synchronized(this) {
         this.field1858.add(var2);
         this.notify();
         return var2;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1955026569"
   )
   public void method3106() {
      this.field1853 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1854.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public void run() {
      while(!this.field1853) {
         try {
            Class136 var1;
            synchronized(this) {
               var1 = (Class136)this.field1858.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var13) {
                     ;
                  }
                  continue;
               }
            }

            DataInputStream var2 = null;
            URLConnection var3 = null;

            try {
               var3 = var1.field1867.openConnection();
               var3.setConnectTimeout(5000);
               var3.setReadTimeout(5000);
               var3.setUseCaches(false);
               var3.setRequestProperty("Connection", "close");
               int var7 = var3.getContentLength();
               if (var7 >= 0) {
                  byte[] var5 = new byte[var7];
                  var2 = new DataInputStream(var3.getInputStream());
                  var2.readFully(var5);
                  var1.field1861 = var5;
               }

               var1.field1859 = true;
            } catch (IOException var14) {
               var1.field1859 = true;
            } finally {
               if (var2 != null) {
                  var2.close();
               }

               if (var3 != null && var3 instanceof HttpURLConnection) {
                  ((HttpURLConnection)var3).disconnect();
               }

            }
         } catch (Exception var17) {
            Class5.method65((String)null, var17);
         }
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "892303579"
   )
   static void method3114(int var0) {
      if (var0 != -1) {
         if (Class261.method4931(var0)) {
            Class230[] var1 = Class42.field366[var0];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               Class230 var3 = var1[var2];
               if (var3.field2687 != null) {
                  Class56 var4 = new Class56();
                  var4.field506 = var3;
                  var4.field512 = var3.field2687;
                  Class309.method5674(var4, 5000000);
               }
            }

         }
      }
   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      signature = "(III)Ljava/lang/String;",
      garbageValue = "-509659041"
   )
   static final String method3113(int var0, int var1) {
      int var2 = var1 - var0;
      if (var2 < -9) {
         return Class6.method71(16711680);
      } else if (var2 < -6) {
         return Class6.method71(16723968);
      } else if (var2 < -3) {
         return Class6.method71(16740352);
      } else if (var2 < 0) {
         return Class6.method71(16756736);
      } else if (var2 > 9) {
         return Class6.method71(65280);
      } else if (var2 > 6) {
         return Class6.method71(4259584);
      } else if (var2 > 3) {
         return Class6.method71(8453888);
      } else {
         return var2 > 0 ? Class6.method71(12648192) : Class6.method71(16776960);
      }
   }
}
