package com.client;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public final class Class110 {
   @ObfuscatedName("z")
   RandomAccessFile field1435;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = 274542586179813579L
   )
   long field1433;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -2383434283230612419L
   )
   long field1432;

   public Class110(File var1, String var2, long var3) throws IOException {
      if (-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() >= var3) {
         var1.delete();
      }

      this.field1435 = new RandomAccessFile(var1, var2);
      this.field1433 = var3;
      this.field1432 = 0L;
      int var5 = this.field1435.read();
      if (var5 != -1 && !var2.equals("r")) {
         this.field1435.seek(0L);
         this.field1435.write(var5);
      }

      this.field1435.seek(0L);
   }

   @ObfuscatedName("z")
   final void method2514(long var1) throws IOException {
      this.field1435.seek(var1);
      this.field1432 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "2068014538"
   )
   public final void method2506(byte[] var1, int var2, int var3) throws IOException {
      if ((long)var3 + this.field1432 > this.field1433) {
         this.field1435.seek(1L + this.field1433);
         this.field1435.write(1);
         throw new EOFException();
      } else {
         this.field1435.write(var1, var2, var3);
         this.field1432 += (long)var3;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "746943081"
   )
   public final void method2507() throws IOException {
      this.method2508(false);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "122"
   )
   public final void method2508(boolean var1) throws IOException {
      if (this.field1435 != null) {
         if (var1) {
            try {
               this.field1435.getFD().sync();
            } catch (SyncFailedException var3) {
               ;
            }
         }

         this.field1435.close();
         this.field1435 = null;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "-1046460358"
   )
   public final long method2509() throws IOException {
      return this.field1435.length();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-210430337"
   )
   public final int method2510(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.field1435.read(var1, var2, var3);
      if (var4 > 0) {
         this.field1432 += (long)var4;
      }

      return var4;
   }

   protected void finalize() throws Throwable {
      if (this.field1435 != null) {
         System.out.println("");
         this.method2507();
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IB)Ljj;",
      garbageValue = "0"
   )
   public static Class268 method2527(int var0) {
      Class268 var1 = (Class268)Class268.field3371.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class268.field3377.method4625(6, var0);
         var1 = new Class268();
         var1.field3376 = var0;
         if (var2 != null) {
            var1.method5026(new Class182(var2));
         }

         var1.method5025();
         if (var1.field3398) {
            var1.field3386 = 0;
            var1.field3404 = false;
         }

         Class268.field3371.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/Class;",
      garbageValue = "471719686"
   )
   static Class method2528(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Class.forName(var0);
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1058679148"
   )
   static final int method2511(int var0, int var1) {
      int var2 = var0 + var1 * 57;
      var2 ^= var2 << 13;
      int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }
}
