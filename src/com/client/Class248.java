package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class Class248 implements Runnable {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Class205 field3182 = new Class205();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static Class205 field3180 = new Class205();
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -580590333
   )
   public static int field3179 = 0;
   @ObfuscatedName("l")
   public static Object field3184 = new Object();
   @ObfuscatedName("u")
   static Thread field3183;

   public void run() {
      try {
         while(true) {
            Class205 var2 = field3182;
            Class245 var1;
            synchronized(field3182) {
               var1 = (Class245)field3182.method4098();
            }

            Object var14;
            if (var1 != null) {
               if (var1.field3150 == 0) {
                  var1.field3151.method3371((int)var1.field2421, var1.field3149, var1.field3149.length);
                  var2 = field3182;
                  synchronized(field3182) {
                     var1.method4064();
                  }
               } else if (var1.field3150 == 1) {
                  var1.field3149 = var1.field3151.method3372((int)var1.field2421);
                  var2 = field3182;
                  synchronized(field3182) {
                     field3180.method4073(var1);
                  }
               }

               var14 = field3184;
               synchronized(field3184) {
                  if (field3179 <= 1) {
                     field3179 = 0;
                     field3184.notifyAll();
                     return;
                  }

                  field3179 = 600;
               }
            } else {
               Class63.method1539(100L);
               var14 = field3184;
               synchronized(field3184) {
                  if (field3179 <= 1) {
                     field3179 = 0;
                     field3184.notifyAll();
                     return;
                  }

                  --field3179;
               }
            }
         }
      } catch (Exception var13) {
         Class5.method65((String)null, var13);
      }
   }
}
