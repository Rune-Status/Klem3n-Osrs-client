package com.client;
import java.io.EOFException;
import java.io.IOException;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public final class Class162 {
   @ObfuscatedName("z")
   static byte[] field2004 = new byte[520];
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ldy;"
   )
   Class109 field2000 = null;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Ldy;"
   )
   Class109 field2001 = null;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -561550751
   )
   int field2002;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1445683659
   )
   int field1999 = 65000;

   @ObfuscatedSignature(
      signature = "(ILdy;Ldy;I)V"
   )
   public Class162(int var1, Class109 var2, Class109 var3, int var4) {
      this.field2002 = var1;
      this.field2000 = var2;
      this.field2001 = var3;
      this.field1999 = var4;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "1936326418"
   )
   public byte[] method3372(int var1) {
      Class109 var2 = this.field2000;
      synchronized(this.field2000) {
         try {
            Object var10000;
            if (this.field2001.method2486() < (long)(var1 * 6 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            } else {
               this.field2001.method2476((long)(var1 * 6));
               this.field2001.method2479(field2004, 0, 6);
               int var3 = ((field2004[0] & 255) << 16) + (field2004[2] & 255) + ((field2004[1] & 255) << 8);
               int var4 = (field2004[5] & 255) + ((field2004[3] & 255) << 16) + ((field2004[4] & 255) << 8);
               if (var3 < 0 || var3 > this.field1999) {
                  var10000 = null;
                  return (byte[])var10000;
               } else if (var4 <= 0 || (long)var4 > this.field2000.method2486() / 520L) {
                  var10000 = null;
                  return (byte[])var10000;
               } else {
                  byte[] var5 = new byte[var3];
                  int var6 = 0;
                  int var7 = 0;

                  while(var6 < var3) {
                     if (var4 == 0) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     this.field2000.method2476((long)(var4 * 520));
                     int var8 = var3 - var6;
                     if (var8 > 512) {
                        var8 = 512;
                     }

                     this.field2000.method2479(field2004, 0, var8 + 8);
                     int var9 = (field2004[1] & 255) + ((field2004[0] & 255) << 8);
                     int var10 = (field2004[3] & 255) + ((field2004[2] & 255) << 8);
                     int var11 = ((field2004[5] & 255) << 8) + ((field2004[4] & 255) << 16) + (field2004[6] & 255);
                     int var12 = field2004[7] & 255;
                     if (var9 == var1 && var7 == var10 && var12 == this.field2002) {
                        if (var11 >= 0 && (long)var11 <= this.field2000.method2486() / 520L) {
                           for(int var13 = 0; var13 < var8; ++var13) {
                              var5[var6++] = field2004[var13 + 8];
                           }

                           var4 = var11;
                           ++var7;
                           continue;
                        }

                        var10000 = null;
                        return (byte[])var10000;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  byte[] var18 = var5;
                  return var18;
               }
            }
         } catch (IOException var16) {
            return null;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I[BII)Z",
      garbageValue = "-1888723881"
   )
   public boolean method3371(int var1, byte[] var2, int var3) {
      Class109 var4 = this.field2000;
      synchronized(this.field2000) {
         if (var3 >= 0 && var3 <= this.field1999) {
            boolean var5 = this.method3375(var1, var2, var3, true);
            if (!var5) {
               var5 = this.method3375(var1, var2, var3, false);
            }

            return var5;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I[BIZB)Z",
      garbageValue = "20"
   )
   boolean method3375(int var1, byte[] var2, int var3, boolean var4) {
      Class109 var5 = this.field2000;
      synchronized(this.field2000) {
         try {
            int var6;
            boolean var10000;
            if (var4) {
               if (this.field2001.method2486() < (long)(var1 * 6 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.field2001.method2476((long)(var1 * 6));
               this.field2001.method2479(field2004, 0, 6);
               var6 = (field2004[5] & 255) + ((field2004[3] & 255) << 16) + ((field2004[4] & 255) << 8);
               if (var6 <= 0 || (long)var6 > this.field2000.method2486() / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.field2000.method2486() + 519L) / 520L);
               if (var6 == 0) {
                  var6 = 1;
               }
            }

            field2004[0] = (byte)(var3 >> 16);
            field2004[1] = (byte)(var3 >> 8);
            field2004[2] = (byte)var3;
            field2004[3] = (byte)(var6 >> 16);
            field2004[4] = (byte)(var6 >> 8);
            field2004[5] = (byte)var6;
            this.field2001.method2476((long)(var1 * 6));
            this.field2001.method2481(field2004, 0, 6);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if (var7 < var3) {
                  label136: {
                     int var9 = 0;
                     int var14;
                     if (var4) {
                        label155: {
                           this.field2000.method2476((long)(var6 * 520));

                           try {
                              this.field2000.method2479(field2004, 0, 8);
                           } catch (EOFException var16) {
                              break label136;
                           }

                           var14 = (field2004[1] & 255) + ((field2004[0] & 255) << 8);
                           int var11 = (field2004[3] & 255) + ((field2004[2] & 255) << 8);
                           var9 = ((field2004[5] & 255) << 8) + ((field2004[4] & 255) << 16) + (field2004[6] & 255);
                           int var12 = field2004[7] & 255;
                           if (var14 == var1 && var8 == var11 && var12 == this.field2002) {
                              if (var9 >= 0 && (long)var9 <= this.field2000.method2486() / 520L) {
                                 break label155;
                              }

                              var10000 = false;
                              return var10000;
                           }

                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (var9 == 0) {
                        var4 = false;
                        var9 = (int)((this.field2000.method2486() + 519L) / 520L);
                        if (var9 == 0) {
                           ++var9;
                        }

                        if (var9 == var6) {
                           ++var9;
                        }
                     }

                     if (var3 - var7 <= 512) {
                        var9 = 0;
                     }

                     field2004[0] = (byte)(var1 >> 8);
                     field2004[1] = (byte)var1;
                     field2004[2] = (byte)(var8 >> 8);
                     field2004[3] = (byte)var8;
                     field2004[4] = (byte)(var9 >> 16);
                     field2004[5] = (byte)(var9 >> 8);
                     field2004[6] = (byte)var9;
                     field2004[7] = (byte)this.field2002;
                     this.field2000.method2476((long)(var6 * 520));
                     this.field2000.method2481(field2004, 0, 8);
                     var14 = var3 - var7;
                     if (var14 > 512) {
                        var14 = 512;
                     }

                     this.field2000.method2481(var2, var7, var14);
                     var7 += var14;
                     var6 = var9;
                     ++var8;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var17) {
            return false;
         }
      }
   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "2"
   )
   static void method3380() {
      if (Client.field699) {
         Class11.method98(Class138.field1876, false);
      }

   }
}
