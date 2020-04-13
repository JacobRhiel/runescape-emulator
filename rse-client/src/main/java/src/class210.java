package src;

public class class210 extends class189 {

   int[] field2486 = new int[128];
   class112[] field2483 = new class112[128];
   short[] field2485 = new short[128];
   byte[] field2487 = new byte[128];
   byte[] field2490 = new byte[128];
   class205[] field2488 = new class205[128];
   byte[] field2489 = new byte[128];
   int field2484;


   class210(byte[] var1) {
      class309 var2 = new class309(var1);

      int var3;
      for(var3 = 0; var2.field3709[var3 + var2.field3710] != 0; ++var3) {
         ;
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.readByte(-336553498);
      }

      ++var2.field3710;
      ++var3;
      var5 = var2.field3710;
      var2.field3710 += var3;

      int var6;
      for(var6 = 0; var2.field3709[var6 + var2.field3710] != 0; ++var6) {
         ;
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var2.readByte(-1241178683);
      }

      ++var2.field3710;
      ++var6;
      var8 = var2.field3710;
      var2.field3710 += var6;

      int var9;
      for(var9 = 0; var2.field3709[var9 + var2.field3710] != 0; ++var9) {
         ;
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.readByte(-292024481);
      }

      ++var2.field3710;
      ++var9;
      byte[] var38 = new byte[var9];
      int var12;
      int var14;
      if(var9 > 1) {
         var38[1] = 1;
         int var13 = 1;
         var12 = 2;

         for(var14 = 2; var14 < var9; ++var14) {
            int var15 = var2.readUnsignedByte((byte)56);
            if(var15 == 0) {
               var13 = var12++;
            } else {
               if(var15 <= var13) {
                  --var15;
               }

               var13 = var15;
            }

            var38[var14] = (byte)var13;
         }
      } else {
         var12 = var9;
      }

      class205[] var39 = new class205[var12];

      class205 var40;
      for(var14 = 0; var14 < var39.length; ++var14) {
         var40 = var39[var14] = new class205();
         int var16 = var2.readUnsignedByte((byte)120);
         if(var16 > 0) {
            var40.field2402 = new byte[var16 * 2];
         }

         var16 = var2.readUnsignedByte((byte)123);
         if(var16 > 0) {
            var40.field2398 = new byte[var16 * 2 + 2];
            var40.field2398[1] = 64;
         }
      }

      var14 = var2.readUnsignedByte((byte)118);
      byte[] var47 = var14 > 0?new byte[var14 * 2]:null;
      var14 = var2.readUnsignedByte((byte)91);
      byte[] var41 = var14 > 0?new byte[var14 * 2]:null;

      int var17;
      for(var17 = 0; var2.field3709[var17 + var2.field3710] != 0; ++var17) {
         ;
      }

      byte[] var18 = new byte[var17];

      int var19;
      for(var19 = 0; var19 < var17; ++var19) {
         var18[var19] = var2.readByte(-1186894466);
      }

      ++var2.field3710;
      ++var17;
      var19 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.readUnsignedByte((byte)123);
         this.field2485[var20] = (short)var19;
      }

      var19 = 0;

      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.readUnsignedByte((byte)25);
         this.field2485[var20] = (short)(this.field2485[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for(var23 = 0; var23 < 128; ++var23) {
         if(var20 == 0) {
            if(var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            var22 = var2.method5571(343925877);
         }

         this.field2485[var23] = (short)(this.field2485[var23] + ((var22 - 1 & 2) << 14));
         this.field2486[var23] = var22;
         --var20;
      }

      var20 = 0;
      var21 = 0;
      var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if(this.field2486[var24] != 0) {
            if(var20 == 0) {
               if(var21 < var4.length) {
                  var20 = var4[var21++];
               } else {
                  var20 = -1;
               }

               var23 = var2.field3709[var5++] - 1;
            }

            this.field2489[var24] = (byte)var23;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var24 = 0;

      for(int var25 = 0; var25 < 128; ++var25) {
         if(this.field2486[var25] != 0) {
            if(var20 == 0) {
               if(var21 < var7.length) {
                  var20 = var7[var21++];
               } else {
                  var20 = -1;
               }

               var24 = var2.field3709[var8++] + 16 << 2;
            }

            this.field2490[var25] = (byte)var24;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      class205 var42 = null;

      int var26;
      for(var26 = 0; var26 < 128; ++var26) {
         if(this.field2486[var26] != 0) {
            if(var20 == 0) {
               var42 = var39[var38[var21]];
               if(var21 < var10.length) {
                  var20 = var10[var21++];
               } else {
                  var20 = -1;
               }
            }

            this.field2488[var26] = var42;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var26 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if(var20 == 0) {
            if(var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            if(this.field2486[var27] > 0) {
               var26 = var2.readUnsignedByte((byte)113) + 1;
            }
         }

         this.field2487[var27] = (byte)var26;
         --var20;
      }

      this.field2484 = var2.readUnsignedByte((byte)50) + 1;

      class205 var28;
      int var29;
      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var39[var27];
         if(var28.field2402 != null) {
            for(var29 = 1; var29 < var28.field2402.length; var29 += 2) {
               var28.field2402[var29] = var2.readByte(-699059510);
            }
         }

         if(var28.field2398 != null) {
            for(var29 = 3; var29 < var28.field2398.length - 2; var29 += 2) {
               var28.field2398[var29] = var2.readByte(-547644719);
            }
         }
      }

      if(var47 != null) {
         for(var27 = 1; var27 < var47.length; var27 += 2) {
            var47[var27] = var2.readByte(-1497174530);
         }
      }

      if(var41 != null) {
         for(var27 = 1; var27 < var41.length; var27 += 2) {
            var41[var27] = var2.readByte(-1297742098);
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var39[var27];
         if(var28.field2398 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field2398.length; var29 += 2) {
               var19 = var19 + 1 + var2.readUnsignedByte((byte)46);
               var28.field2398[var29] = (byte)var19;
            }
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var39[var27];
         if(var28.field2402 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field2402.length; var29 += 2) {
               var19 = 1 + var19 + var2.readUnsignedByte((byte)116);
               var28.field2402[var29] = (byte)var19;
            }
         }
      }

      byte var30;
      int var32;
      int var33;
      int var34;
      int var35;
      int var36;
      int var44;
      byte var46;
      if(var47 != null) {
         var19 = var2.readUnsignedByte((byte)66);
         var47[0] = (byte)var19;

         for(var27 = 2; var27 < var47.length; var27 += 2) {
            var19 = 1 + var19 + var2.readUnsignedByte((byte)85);
            var47[var27] = (byte)var19;
         }

         var46 = var47[0];
         byte var43 = var47[1];

         for(var29 = 0; var29 < var46; ++var29) {
            this.field2487[var29] = (byte)(var43 * this.field2487[var29] + 32 >> 6);
         }

         for(var29 = 2; var29 < var47.length; var29 += 2) {
            var30 = var47[var29];
            byte var31 = var47[var29 + 1];
            var32 = var43 * (var30 - var46) + (var30 - var46) / 2;

            for(var33 = var46; var33 < var30; ++var33) {
               var35 = var30 - var46;
               var36 = var32 >>> 31;
               var34 = (var36 + var32) / var35 - var36;
               this.field2487[var33] = (byte)(var34 * this.field2487[var33] + 32 >> 6);
               var32 += var31 - var43;
            }

            var46 = var30;
            var43 = var31;
         }

         for(var44 = var46; var44 < 128; ++var44) {
            this.field2487[var44] = (byte)(var43 * this.field2487[var44] + 32 >> 6);
         }

         var40 = null;
      }

      if(var41 != null) {
         var19 = var2.readUnsignedByte((byte)45);
         var41[0] = (byte)var19;

         for(var27 = 2; var27 < var41.length; var27 += 2) {
            var19 = 1 + var19 + var2.readUnsignedByte((byte)102);
            var41[var27] = (byte)var19;
         }

         var46 = var41[0];
         int var49 = var41[1] << 1;

         for(var29 = 0; var29 < var46; ++var29) {
            var44 = var49 + (this.field2490[var29] & 255);
            if(var44 < 0) {
               var44 = 0;
            }

            if(var44 > 128) {
               var44 = 128;
            }

            this.field2490[var29] = (byte)var44;
         }

         int var45;
         for(var29 = 2; var29 < var41.length; var29 += 2) {
            var30 = var41[var29];
            var45 = var41[var29 + 1] << 1;
            var32 = var49 * (var30 - var46) + (var30 - var46) / 2;

            for(var33 = var46; var33 < var30; ++var33) {
               var35 = var30 - var46;
               var36 = var32 >>> 31;
               var34 = (var36 + var32) / var35 - var36;
               int var37 = var34 + (this.field2490[var33] & 255);
               if(var37 < 0) {
                  var37 = 0;
               }

               if(var37 > 128) {
                  var37 = 128;
               }

               this.field2490[var33] = (byte)var37;
               var32 += var45 - var49;
            }

            var46 = var30;
            var49 = var45;
         }

         for(var44 = var46; var44 < 128; ++var44) {
            var45 = var49 + (this.field2490[var44] & 255);
            if(var45 < 0) {
               var45 = 0;
            }

            if(var45 > 128) {
               var45 = 128;
            }

            this.field2490[var44] = (byte)var45;
         }

         Object var48 = null;
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var39[var27].field2396 = var2.readUnsignedByte((byte)117);
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var39[var27];
         if(var28.field2402 != null) {
            var28.field2397 = var2.readUnsignedByte((byte)70);
         }

         if(var28.field2398 != null) {
            var28.field2400 = var2.readUnsignedByte((byte)96);
         }

         if(var28.field2396 > 0) {
            var28.field2399 = var2.readUnsignedByte((byte)126);
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var39[var27].field2401 = var2.readUnsignedByte((byte)97);
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var39[var27];
         if(var28.field2401 > 0) {
            var28.field2395 = var2.readUnsignedByte((byte)36);
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var39[var27];
         if(var28.field2395 > 0) {
            var28.field2394 = var2.readUnsignedByte((byte)27);
         }
      }

   }

   void method3950(byte var1) {
      this.field2486 = null;
   }

   boolean method3949(class117 var1, byte[] var2, int[] var3, byte var4) {
      boolean var5 = true;
      int var6 = 0;
      class112 var7 = null;

      for(int var8 = 0; var8 < 128; ++var8) {
         if(var2 == null || var2[var8] != 0) {
            int var9 = this.field2486[var8];
            if(var9 != 0) {
               if(var6 != var9) {
                  var6 = var9--;
                  if((var9 & 1) == 0) {
                     var7 = var1.method2598(var9 >> 2, var3, -1326319727);
                  } else {
                     var7 = var1.method2599(var9 >> 2, var3, 211592248);
                  }

                  if(var7 == null) {
                     var5 = false;
                  }
               }

               if(var7 != null) {
                  this.field2483[var8] = var7;
                  this.field2486[var8] = 0;
               }
            }
         }
      }

      return var5;
   }

   static void method3960(byte[] var0, byte var1) {
      class309 var2 = new class309(var0);
      var2.field3710 = var0.length - 2;
      class335.field3900 = var2.writeShort((byte)59);
      class335.field3901 = new int[class335.field3900];
      class260.field3309 = new int[class335.field3900];
      class335.field3904 = new int[class335.field3900];
      class335.field3905 = new int[class335.field3900];
      class4.field24 = new byte[class335.field3900][];
      var2.field3710 = var0.length - 7 - class335.field3900 * 8;
      class335.field3903 = var2.writeShort((byte)30);
      class335.field3902 = var2.writeShort((byte)121);
      int var3 = (var2.readUnsignedByte((byte)95) & 255) + 1;

      int var4;
      for(var4 = 0; var4 < class335.field3900; ++var4) {
         class335.field3901[var4] = var2.writeShort((byte)82);
      }

      for(var4 = 0; var4 < class335.field3900; ++var4) {
         class260.field3309[var4] = var2.writeShort((byte)27);
      }

      for(var4 = 0; var4 < class335.field3900; ++var4) {
         class335.field3904[var4] = var2.writeShort((byte)34);
      }

      for(var4 = 0; var4 < class335.field3900; ++var4) {
         class335.field3905[var4] = var2.writeShort((byte)89);
      }

      var2.field3710 = var0.length - 7 - class335.field3900 * 8 - (var3 - 1) * 3;
      class320.field3812 = new int[var3];

      for(var4 = 1; var4 < var3; ++var4) {
         class320.field3812[var4] = var2.method5674((short)3112);
         if(class320.field3812[var4] == 0) {
            class320.field3812[var4] = 1;
         }
      }

      var2.field3710 = 0;

      for(var4 = 0; var4 < class335.field3900; ++var4) {
         int var5 = class335.field3904[var4];
         int var6 = class335.field3905[var4];
         int var7 = var5 * var6;
         byte[] var8 = new byte[var7];
         class4.field24[var4] = var8;
         int var9 = var2.readUnsignedByte((byte)26);
         int var10;
         if(var9 == 0) {
            for(var10 = 0; var10 < var7; ++var10) {
               var8[var10] = var2.readByte(55286217);
            }
         } else if(var9 == 1) {
            for(var10 = 0; var10 < var5; ++var10) {
               for(int var11 = 0; var11 < var6; ++var11) {
                  var8[var10 + var11 * var5] = var2.readByte(-1191166752);
               }
            }
         }
      }

   }

   static final void method3957(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(class81.method1900(var0, 402073109)) {
         class15.field70 = null;
         class240.method4213(class226.field2693[var0], -1, var1, var2, var3, var4, var5, var6, var7, (byte)19);
         if(class15.field70 != null) {
            class240.method4213(class15.field70, -1412584499, var1, var2, var3, var4, class34.field245, class268.field3526, var7, (byte)8);
            class15.field70 = null;
         }

      } else {
         if(var7 != -1) {
            client.field679[var7] = true;
         } else {
            for(int var9 = 0; var9 < 100; ++var9) {
               client.field679[var9] = true;
            }
         }

      }
   }

   public static boolean method3959(CharSequence var0, byte var1) {
      boolean var3 = false;
      boolean var4 = false;
      int var5 = 0;
      int var6 = var0.length();
      int var7 = 0;

      boolean var2;
      while(true) {
         if(var7 >= var6) {
            var2 = var4;
            break;
         }

         label82: {
            char var8 = var0.charAt(var7);
            if(var7 == 0) {
               if(var8 == 45) {
                  var3 = true;
                  break label82;
               }

               if(var8 == 43) {
                  break label82;
               }
            }

            int var10;
            if(var8 >= 48 && var8 <= 57) {
               var10 = var8 - 48;
            } else if(var8 >= 65 && var8 <= 90) {
               var10 = var8 - 55;
            } else {
               if(var8 < 97 || var8 > 122) {
                  var2 = false;
                  break;
               }

               var10 = var8 - 87;
            }

            if(var10 >= 10) {
               var2 = false;
               break;
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var5 * 10 + var10;
            if(var5 != var9 / 10) {
               var2 = false;
               break;
            }

            var5 = var9;
            var4 = true;
         }

         ++var7;
      }

      return var2;
   }

   public static void method3958(int var0) {
      class258.field3288.method3413();
   }
}
