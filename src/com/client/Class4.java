package com.client;
import java.net.URL;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class Class4 {
   @ObfuscatedName("z")
   byte field31;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -505500629
   )
   public int field29;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1231470581
   )
   public int field30;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 528031905
   )
   public int field33;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1404264417
   )
   public int field32;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1551136007
   )
   public int field28;

   public Class4() {
   }

   @ObfuscatedSignature(
      signature = "(Lgk;Z)V",
      garbageValue = "0"
   )
   public Class4(Class182 var1, boolean var2) {
      this.field31 = var1.readByte();
      this.field29 = var1.readUnsignedShort();
      this.field30 = var1.method3671();
      this.field33 = var1.method3671();
      this.field32 = var1.method3671();
      this.field28 = var1.method3671();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1516792528"
   )
   public int method38() {
      return this.field31 & 7;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "63"
   )
   public int method39() {
      return (this.field31 & 8) == 8 ? 1 : 0;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-658609218"
   )
   void method44(int var1) {
      this.field31 &= -8;
      this.field31 = (byte)(this.field31 | var1 & 7);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "74851290"
   )
   void method40(int var1) {
      this.field31 &= -9;
      if (var1 == 1) {
         this.field31 = (byte)(this.field31 | 8);
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1218832541"
   )
   static boolean method36() {
      try {
         if (Class49.field439 == null) {
            Class49.field439 = Class28.field249.method3109(new URL(Class26.field219));
         } else if (Class49.field439.method3117()) {
            byte[] var0 = Class49.field439.method3116();
            Class182 var1 = new Class182(var0);
            var1.method3671();
            Class65.field945 = var1.readUnsignedShort();
            Class65.field949 = new Class65[Class65.field945];

            Class65 var3;
            for(int var2 = 0; var2 < Class65.field945; var3.field943 = var2++) {
               var3 = Class65.field949[var2] = new Class65();
               var3.field947 = var1.readUnsignedShort();
               var3.field948 = var1.method3671();
               var3.field950 = var1.method3738();
               var3.field951 = var1.method3738();
               var3.field952 = var1.readUnsignedByte();
               var3.field955 = var1.method3551();
            }

            Class22.method282(Class65.field949, 0, Class65.field949.length - 1, Class65.field946, Class65.field939);
            Class49.field439 = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         Class49.field439 = null;
      }

      return false;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-106852228"
   )
   static final void method56() {
      if (!Class120.field1652) {
         int var0 = Class125.field1759;
         int var1 = Class125.field1737;
         int var2 = Class125.field1740;
         int var3 = Class125.field1771;
         byte var4 = 50;
         short var5 = 3500;
         int var6 = (Class120.field1648 - Class122.field1687) * var4 / Class122.field1678;
         int var7 = (Class120.field1649 - Class122.field1689) * var4 / Class122.field1678;
         int var8 = (Class120.field1648 - Class122.field1687) * var5 / Class122.field1678;
         int var9 = (Class120.field1649 - Class122.field1689) * var5 / Class122.field1678;
         int var10 = Class122.method2807(var7, var4, var1, var0);
         int var11 = Class122.method2790(var7, var4, var1, var0);
         var7 = var10;
         var10 = Class122.method2807(var9, var5, var1, var0);
         int var12 = Class122.method2790(var9, var5, var1, var0);
         var9 = var10;
         var10 = Class122.method2805(var6, var11, var3, var2);
         var11 = Class122.method2806(var6, var11, var3, var2);
         var6 = var10;
         var10 = Class122.method2805(var8, var12, var3, var2);
         var12 = Class122.method2806(var8, var12, var3, var2);
         Class120.field1657 = (var10 + var6) / 2;
         Class120.field1659 = (var9 + var7) / 2;
         Class177.field2283 = (var12 + var11) / 2;
         Class303.field3721 = (var10 - var6) / 2;
         Class120.field1651 = (var9 - var7) / 2;
         Class120.field1654 = (var12 - var11) / 2;
         Class98.field1335 = Math.abs(Class303.field3721);
         Class120.field1655 = Math.abs(Class120.field1651);
         Class312.field3757 = Math.abs(Class120.field1654);
      }
   }
}
