package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public final class Class189 extends Class182 {
   @ObfuscatedName("e")
   static final int[] field2374 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   Class190 field2373;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1018793601
   )
   int field2375;

   public Class189(int var1) {
      super(var1);
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "1024436616"
   )
   public void method3836(int[] var1) {
      this.field2373 = new Class190(var1);
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "(Lgs;B)V",
      garbageValue = "-62"
   )
   public void method3838(Class190 var1) {
      this.field2373 = var1;
   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-123"
   )
   public void method3819(int var1) {
      super.payload[++super.field2339 - 1] = (byte)(var1 + this.field2373.method3850());
   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1803042160"
   )
   public int method3820() {
      return super.payload[++super.field2339 - 1] - this.field2373.method3850() & 255;
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1051001340"
   )
   public boolean method3821() {
      int var1 = super.payload[super.field2339] - this.field2373.method3853() & 255;
      return var1 >= 128;
   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1043804078"
   )
   public int method3841() {
      int var1 = super.payload[++super.field2339 - 1] - this.field2373.method3850() & 255;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.payload[++super.field2339 - 1] - this.field2373.method3850() & 255);
   }

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1583313616"
   )
   public void method3823() {
      this.field2375 = super.field2339 * 8;
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "597450860"
   )
   public int method3817(int var1) {
      int var2 = this.field2375 >> 3;
      int var3 = 8 - (this.field2375 & 7);
      int var4 = 0;

      for(this.field2375 += var1; var1 > var3; var3 = 8) {
         var4 += (super.payload[var2++] & field2374[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += super.payload[var2] & field2374[var3];
      } else {
         var4 += super.payload[var2] >> var3 - var1 & field2374[var1];
      }

      return var4;
   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-535357999"
   )
   public void method3816() {
      super.field2339 = (this.field2375 + 7) / 8;
   }

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "16711935"
   )
   public int method3825(int var1) {
      return var1 * 8 - this.field2375;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IS)Lkb;",
      garbageValue = "255"
   )
   public static Class307 method3847(int var0) {
      Class307[] var1 = new Class307[]{Class307.field3733, Class307.field3732, Class307.field3734};
      Class307[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class307 var4 = var2[var3];
         if (var0 == var4.field3735) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "24564"
   )
   static void method3848() {
      Object var0 = Class248.field3184;
      synchronized(Class248.field3184) {
         if (Class248.field3179 == 0) {
            Class248.field3183 = new Thread(new Class248());
            Class248.field3183.setDaemon(true);
            Class248.field3183.start();
            Class248.field3183.setPriority(5);
         }

         Class248.field3179 = 600;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;Ljava/lang/String;B)I",
      garbageValue = "100"
   )
   public static int method3840(Class182 var0, String var1) {
      int var2 = var0.field2339;
      byte[] var3 = Class244.method4618(var1);
      var0.method3573(var3.length);
      var0.field2339 += Class300.field3712.method3475(var3, 0, var3.length, var0.payload, var0.field2339);
      return var0.field2339 - var2;
   }
}
