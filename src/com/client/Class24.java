package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class Class24 {
   @ObfuscatedName("pk")
   @ObfuscatedGetter(
      intValue = -1187037229
   )
   static int field203;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lc;"
   )
   static final Class24 field208 = new Class24(0);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lc;"
   )
   static final Class24 field204 = new Class24(1);
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static Class249 field207;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -636830447
   )
   final int field205;

   Class24(int var1) {
      this.field205 = var1;
   }

   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1818336157"
   )
   static final void method424(boolean var0) {
      for(int var1 = 0; var1 < Client.field622; ++var1) {
         Class72 var2 = Client.field843[Client.field639[var1]];
         if (var2 != null && var2.vmethod1786() && var2.field1037.field3511 == var0 && var2.field1037.method5165()) {
            int var3 = var2.field931 >> 7;
            int var4 = var2.field881 >> 7;
            if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
               if (var2.field874 == 1 && (var2.field931 & 127) == 64 && (var2.field881 & 127) == 64) {
                  if (Client.field761[var3][var4] == Client.field687) {
                     continue;
                  }

                  Client.field761[var3][var4] = Client.field687;
               }

               long var5 = Class76.method1804(0, 0, 1, !var2.field1037.field3504, Client.field639[var1]);
               var2.field889 = Client.field591;
               Class28.field248.method2883(Class13.field82, var2.field931, var2.field881, Class27.method460(var2.field874 * 64 - 64 + var2.field931, var2.field874 * 64 - 64 + var2.field881, Class13.field82), var2.field874 * 64 - 64 + 60, var2, var2.field905, var5, var2.field873);
            }
         }
      }

   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      signature = "(Lhi;B)I",
      garbageValue = "-51"
   )
   static int method425(Class230 var0) {
      Class211 var1 = (Class211)Client.field783.method4020((long)var0.field2606 + ((long)var0.field2691 << 32));
      return var1 != null ? var1.field2438 : var0.field2678;
   }
}
