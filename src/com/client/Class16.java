package com.client;
import java.util.LinkedList;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public abstract class Class16 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 415051583
   )
   int field127;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1630756967
   )
   int field117;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -168585187
   )
   int field118;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 764226753
   )
   int field119;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1927433157
   )
   int field120;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1180650773
   )
   int field121;
   @ObfuscatedName("k")
   short[][][] field125;
   @ObfuscatedName("i")
   short[][][] field123;
   @ObfuscatedName("x")
   byte[][][] field124;
   @ObfuscatedName("e")
   byte[][][] field116;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "[[[[Ly;"
   )
   Class19[][][][] field126;

   Class16() {
      new LinkedList();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IILgk;I)V",
      garbageValue = "-1870240303"
   )
   void method150(int var1, int var2, Class182 var3) {
      int var4 = var3.readUnsignedByte();
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.method167(var1, var2, var3, var4);
         } else {
            this.method152(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IILgk;IB)V",
      garbageValue = "33"
   )
   void method167(int var1, int var2, Class182 var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if (var5) {
         this.field123[0][var1][var2] = (short)var3.readUnsignedByte();
      }

      this.field125[0][var1][var2] = (short)var3.readUnsignedByte();
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IILgk;II)V",
      garbageValue = "1447711600"
   )
   void method152(int var1, int var2, Class182 var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.field125[0][var1][var2] = (short)var3.readUnsignedByte();
      int var8;
      int var9;
      int var11;
      if (var6) {
         var8 = var3.readUnsignedByte();

         for(var9 = 0; var9 < var8; ++var9) {
            int var10 = var3.readUnsignedByte();
            if (var10 != 0) {
               this.field123[var9][var1][var2] = (short)var10;
               var11 = var3.readUnsignedByte();
               this.field124[var9][var1][var2] = (byte)(var11 >> 2);
               this.field116[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.readUnsignedByte();
            if (var9 != 0) {
               Class19[] var14 = this.field126[var8][var1][var2] = new Class19[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.method3546();
                  int var13 = var3.readUnsignedByte();
                  var14[var11] = new Class19(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "1"
   )
   int method153(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0) {
         return var1 < 64 && var2 < 64 ? this.field125[0][var1][var2] - 1 : -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-231958659"
   )
   int method149() {
      return this.field118;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-29"
   )
   int method168() {
      return this.field119;
   }

   @ObfuscatedName("gh")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-327616642"
   )
   static final void method158(int var0, int var1, int var2, int var3) {
      if (Client.field621) {
         if (Client.field684 == 1) {
            Class161.field1997[Client.field803 / 100].method5851(Client.field681 - 8, Client.field682 - 8);
         }

         if (Client.field684 == 2) {
            Class161.field1997[Client.field803 / 100 + 4].method5851(Client.field681 - 8, Client.field682 - 8);
         }
      }

      Client.field694 = 0;
      int var4 = (Class138.field1876.field931 >> 7) + Class62.field868;
      int var5 = (Class138.field1876.field881 >> 7) + Client.field754;
      if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
         Client.field694 = 1;
      }

      if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
         Client.field694 = 1;
      }

      if (Client.field694 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
         Client.field694 = 0;
      }

   }
}
