package com.client;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public final class Class123 {
   @ObfuscatedName("gt")
   @ObfuscatedGetter(
      intValue = 1694856473
   )
   static int field1702;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1492522689
   )
   int field1703;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -410849109
   )
   int field1695;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 492997223
   )
   int field1696;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -527325733
   )
   int field1694;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1095002287
   )
   int field1698;
   @ObfuscatedName("q")
   boolean field1699 = true;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1751012111
   )
   int field1700;

   Class123(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.field1703 = var1;
      this.field1695 = var2;
      this.field1696 = var3;
      this.field1694 = var4;
      this.field1698 = var5;
      this.field1700 = var6;
      this.field1699 = var7;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgi;B)V",
      garbageValue = "2"
   )
   public static void method2869(Class189 var0) {
      Class312 var1 = (Class312)Class313.field3759.method4048();
      if (var1 != null) {
         int var2 = var0.field2339;
         var0.method3707(var1.field3758);

         for(int var3 = 0; var3 < var1.field3749; ++var3) {
            if (var1.field3751[var3] != 0) {
               var0.method3532(var1.field3751[var3]);
            } else {
               try {
                  int var4 = var1.field3748[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.field3752[var3];
                     var6 = var5.getInt((Object)null);
                     var0.method3532(0);
                     var0.method3707(var6);
                  } else if (var4 == 1) {
                     var5 = var1.field3752[var3];
                     var5.setInt((Object)null, var1.field3753[var3]);
                     var0.method3532(0);
                  } else if (var4 == 2) {
                     var5 = var1.field3752[var3];
                     var6 = var5.getModifiers();
                     var0.method3532(0);
                     var0.method3707(var6);
                  }

                  Method var25;
                  if (var4 != 3) {
                     if (var4 == 4) {
                        var25 = var1.field3754[var3];
                        var6 = var25.getModifiers();
                        var0.method3532(0);
                        var0.method3707(var6);
                     }
                  } else {
                     var25 = var1.field3754[var3];
                     byte[][] var10 = var1.field3755[var3];
                     Object[] var7 = new Object[var10.length];

                     for(int var8 = 0; var8 < var10.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var11 = var25.invoke((Object)null, var7);
                     if (var11 == null) {
                        var0.method3532(0);
                     } else if (var11 instanceof Number) {
                        var0.method3532(1);
                        var0.method3659(((Number)var11).longValue());
                     } else if (var11 instanceof String) {
                        var0.method3532(2);
                        var0.method3699((String)var11);
                     } else {
                        var0.method3532(4);
                     }
                  }
               } catch (ClassNotFoundException var13) {
                  var0.method3532(-10);
               } catch (InvalidClassException var14) {
                  var0.method3532(-11);
               } catch (StreamCorruptedException var15) {
                  var0.method3532(-12);
               } catch (OptionalDataException var16) {
                  var0.method3532(-13);
               } catch (IllegalAccessException var17) {
                  var0.method3532(-14);
               } catch (IllegalArgumentException var18) {
                  var0.method3532(-15);
               } catch (InvocationTargetException var19) {
                  var0.method3532(-16);
               } catch (SecurityException var20) {
                  var0.method3532(-17);
               } catch (IOException var21) {
                  var0.method3532(-18);
               } catch (NullPointerException var22) {
                  var0.method3532(-19);
               } catch (Exception var23) {
                  var0.method3532(-20);
               } catch (Throwable var24) {
                  var0.method3532(-21);
               }
            }
         }

         var0.method3572(var2);
         var1.method4064();
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIIII)I",
      garbageValue = "-1588641951"
   )
   static final int method2870(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - Class122.field1693[var2 * 1024 / var3] >> 1;
      return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
   }
}
