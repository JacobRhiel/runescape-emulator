package src;

import java.io.EOFException;
import java.io.IOException;

public final class class317 {

   static byte[] field3787 = new byte[520];
   static class334 field3790;
   static class333[] field3784;
   class351 field3789 = null;
   class351 field3786 = null;
   int field3785 = '\ufde8';
   int field3788;


   public class317(int var1, class351 var2, class351 var3, int var4) {
      this.field3788 = var1;
      this.field3789 = var2;
      this.field3786 = var3;
      this.field3785 = var4;
   }

   boolean method5898(int var1, byte[] var2, int var3, boolean var4, int var5) {
      class351 var6 = this.field3789;
      synchronized(this.field3789) {
         try {
            int var7;
            boolean var10000;
            if(var4) {
               if(this.field3786.method6613((byte)86) < (long)(var1 * 6 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.field3786.method6612((long)(var1 * 6));
               this.field3786.method6610(field3787, 0, 6, 611153948);
               var7 = (field3787[5] & 255) + ((field3787[3] & 255) << 16) + ((field3787[4] & 255) << 8);
               if(var7 <= 0 || (long)var7 > this.field3789.method6613((byte)46) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var7 = (int)((this.field3789.method6613((byte)40) + 519L) / 520L);
               if(var7 == 0) {
                  var7 = 1;
               }
            }

            field3787[0] = (byte)(var3 >> 16);
            field3787[1] = (byte)(var3 >> 8);
            field3787[2] = (byte)var3;
            field3787[3] = (byte)(var7 >> 16);
            field3787[4] = (byte)(var7 >> 8);
            field3787[5] = (byte)var7;
            this.field3786.method6612((long)(var1 * 6));
            this.field3786.method6633(field3787, 0, 6, (byte)-1);
            int var8 = 0;
            int var9 = 0;

            while(true) {
               if(var8 < var3) {
                  label159: {
                     int var10 = 0;
                     int var11;
                     if(var4) {
                        this.field3789.method6612(520L * (long)var7);
                        int var12;
                        int var13;
                        if(var1 > '\uffff') {
                           try {
                              this.field3789.method6610(field3787, 0, 10, 1245358688);
                           } catch (EOFException var18) {
                              break label159;
                           }

                           var11 = ((field3787[1] & 255) << 16) + ((field3787[0] & 255) << 24) + (field3787[3] & 255) + ((field3787[2] & 255) << 8);
                           var12 = (field3787[5] & 255) + ((field3787[4] & 255) << 8);
                           var10 = (field3787[8] & 255) + ((field3787[7] & 255) << 8) + ((field3787[6] & 255) << 16);
                           var13 = field3787[9] & 255;
                        } else {
                           try {
                              this.field3789.method6610(field3787, 0, 8, 2048545532);
                           } catch (EOFException var17) {
                              break label159;
                           }

                           var11 = (field3787[1] & 255) + ((field3787[0] & 255) << 8);
                           var12 = (field3787[3] & 255) + ((field3787[2] & 255) << 8);
                           var10 = ((field3787[5] & 255) << 8) + ((field3787[4] & 255) << 16) + (field3787[6] & 255);
                           var13 = field3787[7] & 255;
                        }

                        if(var11 != var1 || var12 != var9 || var13 != this.field3788) {
                           var10000 = false;
                           return var10000;
                        }

                        if(var10 < 0 || (long)var10 > this.field3789.method6613((byte)42) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if(var10 == 0) {
                        var4 = false;
                        var10 = (int)((this.field3789.method6613((byte)41) + 519L) / 520L);
                        if(var10 == 0) {
                           ++var10;
                        }

                        if(var7 == var10) {
                           ++var10;
                        }
                     }

                     if(var1 > '\uffff') {
                        if(var3 - var8 <= 510) {
                           var10 = 0;
                        }

                        field3787[0] = (byte)(var1 >> 24);
                        field3787[1] = (byte)(var1 >> 16);
                        field3787[2] = (byte)(var1 >> 8);
                        field3787[3] = (byte)var1;
                        field3787[4] = (byte)(var9 >> 8);
                        field3787[5] = (byte)var9;
                        field3787[6] = (byte)(var10 >> 16);
                        field3787[7] = (byte)(var10 >> 8);
                        field3787[8] = (byte)var10;
                        field3787[9] = (byte)this.field3788;
                        this.field3789.method6612((long)var7 * 520L);
                        this.field3789.method6633(field3787, 0, 10, (byte)-1);
                        var11 = var3 - var8;
                        if(var11 > 510) {
                           var11 = 510;
                        }

                        this.field3789.method6633(var2, var8, var11, (byte)-1);
                        var8 += var11;
                     } else {
                        if(var3 - var8 <= 512) {
                           var10 = 0;
                        }

                        field3787[0] = (byte)(var1 >> 8);
                        field3787[1] = (byte)var1;
                        field3787[2] = (byte)(var9 >> 8);
                        field3787[3] = (byte)var9;
                        field3787[4] = (byte)(var10 >> 16);
                        field3787[5] = (byte)(var10 >> 8);
                        field3787[6] = (byte)var10;
                        field3787[7] = (byte)this.field3788;
                        this.field3789.method6612((long)var7 * 520L);
                        this.field3789.method6633(field3787, 0, 8, (byte)-1);
                        var11 = var3 - var8;
                        if(var11 > 512) {
                           var11 = 512;
                        }

                        this.field3789.method6633(var2, var8, var11, (byte)-1);
                        var8 += var11;
                     }

                     var7 = var10;
                     ++var9;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var19) {
            return false;
         }
      }
   }

   public boolean method5896(int var1, byte[] var2, int var3, int var4) {
      class351 var5 = this.field3789;
      synchronized(this.field3789) {
         if(var3 >= 0 && var3 <= this.field3785) {
            boolean var6 = this.method5898(var1, var2, var3, true, 2120818840);
            if(!var6) {
               var6 = this.method5898(var1, var2, var3, false, -496861603);
            }

            return var6;
         } else {
            throw new IllegalArgumentException("" + this.field3788 + ',' + var1 + ',' + var3);
         }
      }
   }

   public byte[] method5897(int var1, int var2) {
      class351 var3 = this.field3789;
      synchronized(this.field3789) {
         try {
            Object var10000;
            if(this.field3786.method6613((byte)65) < (long)(var1 * 6 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            } else {
               this.field3786.method6612((long)(var1 * 6));
               this.field3786.method6610(field3787, 0, 6, 1941673100);
               int var4 = ((field3787[0] & 255) << 16) + (field3787[2] & 255) + ((field3787[1] & 255) << 8);
               int var5 = (field3787[5] & 255) + ((field3787[3] & 255) << 16) + ((field3787[4] & 255) << 8);
               if(var4 < 0 || var4 > this.field3785) {
                  var10000 = null;
                  return (byte[])var10000;
               } else if(var5 <= 0 || (long)var5 > this.field3789.method6613((byte)23) / 520L) {
                  var10000 = null;
                  return (byte[])var10000;
               } else {
                  byte[] var6 = new byte[var4];
                  int var7 = 0;
                  int var8 = 0;

                  while(var7 < var4) {
                     if(var5 == 0) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     this.field3789.method6612((long)var5 * 520L);
                     int var9 = var4 - var7;
                     int var10;
                     int var11;
                     int var12;
                     int var13;
                     byte var14;
                     if(var1 > '\uffff') {
                        if(var9 > 510) {
                           var9 = 510;
                        }

                        var14 = 10;
                        this.field3789.method6610(field3787, 0, var14 + var9, 399467169);
                        var10 = ((field3787[1] & 255) << 16) + ((field3787[0] & 255) << 24) + (field3787[3] & 255) + ((field3787[2] & 255) << 8);
                        var11 = (field3787[5] & 255) + ((field3787[4] & 255) << 8);
                        var12 = (field3787[8] & 255) + ((field3787[7] & 255) << 8) + ((field3787[6] & 255) << 16);
                        var13 = field3787[9] & 255;
                     } else {
                        if(var9 > 512) {
                           var9 = 512;
                        }

                        var14 = 8;
                        this.field3789.method6610(field3787, 0, var14 + var9, 735151959);
                        var10 = (field3787[1] & 255) + ((field3787[0] & 255) << 8);
                        var11 = (field3787[3] & 255) + ((field3787[2] & 255) << 8);
                        var12 = ((field3787[5] & 255) << 8) + ((field3787[4] & 255) << 16) + (field3787[6] & 255);
                        var13 = field3787[7] & 255;
                     }

                     if(var10 == var1 && var11 == var8 && var13 == this.field3788) {
                        if(var12 >= 0 && (long)var12 <= this.field3789.method6613((byte)31) / 520L) {
                           int var15 = var9 + var14;

                           for(int var16 = var14; var16 < var15; ++var16) {
                              var6[var7++] = field3787[var16];
                           }

                           var5 = var12;
                           ++var8;
                           continue;
                        }

                        var10000 = null;
                        return (byte[])var10000;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  byte[] var21 = var6;
                  return var21;
               }
            }
         } catch (IOException var19) {
            return null;
         }
      }
   }

   public String toString() {
      return "" + this.field3788;
   }

   public String aak() {
      return "" + this.field3788;
   }

   public String aab() {
      return "" + this.field3788 * 954921636;
   }

   public String aau() {
      return "" + this.field3788;
   }

   static class334 method5899(int var0) {
      class334 var1 = new class334();
      var1.field3893 = class335.field3903;
      var1.field3890 = class335.field3902;
      var1.field3888 = class335.field3901[0];
      var1.field3892 = class260.field3309[0];
      var1.field3889 = class335.field3904[0];
      var1.field3899 = class335.field3905[0];
      int var2 = var1.field3899 * var1.field3889;
      byte[] var3 = class4.field24[0];
      var1.field3896 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var1.field3896[var4] = class320.field3812[var3[var4] & 255];
      }

      class335.field3901 = null;
      class260.field3309 = null;
      class335.field3904 = null;
      class335.field3905 = null;
      class320.field3812 = null;
      class4.field24 = null;
      return var1;
   }
}
