package src;

public class class111 extends class189 {

   static boolean field1386 = false;
   static byte[] field1375;
   static int field1376;
   static int field1371;
   static class109[] field1394;
   static int field1379;
   static int[] field1385;
   static int field1378;
   static float[] field1391;
   static boolean[] field1399;
   static float[] field1392;
   static float[] field1395;
   static float[] field1393;
   static float[] field1396;
   static float[] field1377;
   static float[] field1397;
   static class125[] field1383;
   static int[] field1398;
   static int[] field1369;
   static class113[] field1374;
   static class120[] field1382;
   byte[][] field1381;
   byte[] field1400;
   int field1388;
   int field1402;
   int field1370;
   float[] field1380;
   int field1373;
   int field1401;
   int field1372;
   int field1390;
   boolean field1387;
   boolean field1384;
   int field1389;


   class111(byte[] var1) {
      this.method2463(var1);
   }

   void method2463(byte[] var1) {
      class309 var2 = new class309(var1);
      this.field1370 = var2.readInt(297718403);
      this.field1373 = var2.readInt(297718403);
      this.field1372 = var2.readInt(297718403);
      this.field1390 = var2.readInt(297718403);
      if(this.field1390 < 0) {
         this.field1390 = ~this.field1390;
         this.field1387 = true;
      }

      int var3 = var2.readInt(297718403);
      this.field1381 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte((byte)33);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method5620(var7, 0, var5, -1853588825);
         this.field1381[var4] = var7;
      }

   }

   class112 method2467(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.field1400 == null) {
            this.field1388 = 0;
            this.field1380 = new float[field1379];
            this.field1400 = new byte[this.field1373];
            this.field1401 = 0;
            this.field1402 = 0;
         }

         for(; this.field1402 < this.field1381.length; ++this.field1402) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method2480(this.field1402);
            if(var2 != null) {
               int var3 = this.field1401;
               int var4 = var2.length;
               if(var4 > this.field1373 - var3) {
                  var4 = this.field1373 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field1400[var3++] = (byte)(var6 - 128);
               }

               if(var1 != null) {
                  var1[0] -= var3 - this.field1401;
               }

               this.field1401 = var3;
            }
         }

         this.field1380 = null;
         byte[] var7 = this.field1400;
         this.field1400 = null;
         return new class112(this.field1370, var7, this.field1372, this.field1390, this.field1387);
      }
   }

   float[] method2480(int var1) {
      method2461(this.field1381[var1], 0);
      method2486();
      int var2 = method2462(class196.method3689(field1385.length - 1, -1384794944));
      boolean var3 = field1399[var2];
      int var4 = var3?field1379:field1378;
      boolean var5 = false;
      boolean var6 = false;
      if(var3) {
         var5 = method2486() != 0;
         var6 = method2486() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if(var3 && !var5) {
         var8 = (var4 >> 2) - (field1378 >> 2);
         var9 = (field1378 >> 2) + (var4 >> 2);
         var10 = field1378 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if(var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field1378 >> 2);
         var12 = (field1378 >> 2) + (var4 - (var4 >> 2));
         var13 = field1378 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class125 var14 = field1383[field1385[var2]];
      int var16 = var14.field1512;
      int var17 = var14.field1511[var16];
      boolean var15 = !field1374[var17].method2502();
      boolean var45 = var15;

      for(var17 = 0; var17 < var14.field1513; ++var17) {
         class120 var18 = field1382[var14.field1514[var17]];
         float[] var19 = field1391;
         var18.method2620(var19, var4 >> 1, var45);
      }

      int var40;
      if(!var15) {
         var17 = var14.field1512;
         var40 = var14.field1511[var17];
         field1374[var40].method2503(field1391, var4 >> 1);
      }

      int var42;
      if(var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            field1391[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var40 = var4 >> 2;
         var42 = var4 >> 3;
         float[] var43 = field1391;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var43[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var43[var21] = -var43[var4 - var21 - 1];
         }

         float[] var44 = var3?field1395:field1392;
         float[] var22 = var3?field1396:field1393;
         float[] var23 = var3?field1397:field1377;
         int[] var24 = var3?field1369:field1398;

         int var25;
         float var26;
         float var27;
         float var28;
         float var29;
         for(var25 = 0; var25 < var40; ++var25) {
            var26 = var43[var25 * 4] - var43[var4 - var25 * 4 - 1];
            var27 = var43[var25 * 4 + 2] - var43[var4 - var25 * 4 - 3];
            var28 = var44[var25 * 2];
            var29 = var44[var25 * 2 + 1];
            var43[var4 - var25 * 4 - 1] = var26 * var28 - var27 * var29;
            var43[var4 - var25 * 4 - 3] = var26 * var29 + var27 * var28;
         }

         float var30;
         float var31;
         for(var25 = 0; var25 < var42; ++var25) {
            var26 = var43[var17 + var25 * 4 + 3];
            var27 = var43[var17 + var25 * 4 + 1];
            var28 = var43[var25 * 4 + 3];
            var29 = var43[var25 * 4 + 1];
            var43[var17 + var25 * 4 + 3] = var26 + var28;
            var43[var17 + var25 * 4 + 1] = var27 + var29;
            var30 = var44[var17 - 4 - var25 * 4];
            var31 = var44[var17 - 3 - var25 * 4];
            var43[var25 * 4 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
            var43[var25 * 4 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
         }

         var25 = class196.method3689(var4 - 1, -26564607);

         int var47;
         int var48;
         int var49;
         int var50;
         for(var47 = 0; var47 < var25 - 3; ++var47) {
            var48 = var4 >> var47 + 2;
            var49 = 8 << var47;

            for(var50 = 0; var50 < 2 << var47; ++var50) {
               int var51 = var4 - var48 * var50 * 2;
               int var52 = var4 - var48 * (var50 * 2 + 1);

               for(int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                  int var33 = var32 * 4;
                  float var34 = var43[var51 - 1 - var33];
                  float var35 = var43[var51 - 3 - var33];
                  float var36 = var43[var52 - 1 - var33];
                  float var37 = var43[var52 - 3 - var33];
                  var43[var51 - 1 - var33] = var34 + var36;
                  var43[var51 - 3 - var33] = var35 + var37;
                  float var38 = var44[var32 * var49];
                  float var39 = var44[var32 * var49 + 1];
                  var43[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var43[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
               }
            }
         }

         for(var47 = 1; var47 < var42 - 1; ++var47) {
            var48 = var24[var47];
            if(var47 < var48) {
               var49 = var47 * 8;
               var50 = var48 * 8;
               var30 = var43[var49 + 1];
               var43[var49 + 1] = var43[var50 + 1];
               var43[var50 + 1] = var30;
               var30 = var43[var49 + 3];
               var43[var49 + 3] = var43[var50 + 3];
               var43[var50 + 3] = var30;
               var30 = var43[var49 + 5];
               var43[var49 + 5] = var43[var50 + 5];
               var43[var50 + 5] = var30;
               var30 = var43[var49 + 7];
               var43[var49 + 7] = var43[var50 + 7];
               var43[var50 + 7] = var30;
            }
         }

         for(var47 = 0; var47 < var17; ++var47) {
            var43[var47] = var43[var47 * 2 + 1];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var43[var4 - 1 - var47 * 2] = var43[var47 * 4];
            var43[var4 - 2 - var47 * 2] = var43[var47 * 4 + 1];
            var43[var4 - var40 - 1 - var47 * 2] = var43[var47 * 4 + 2];
            var43[var4 - var40 - 2 - var47 * 2] = var43[var47 * 4 + 3];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var27 = var23[var47 * 2];
            var28 = var23[var47 * 2 + 1];
            var29 = var43[var17 + var47 * 2];
            var30 = var43[var17 + var47 * 2 + 1];
            var31 = var43[var4 - 2 - var47 * 2];
            float var53 = var43[var4 - 1 - var47 * 2];
            float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
            var43[var17 + var47 * 2] = (var29 + var31 + var54) * 0.5F;
            var43[var4 - 2 - var47 * 2] = (var29 + var31 - var54) * 0.5F;
            var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
            var43[var17 + var47 * 2 + 1] = (var30 - var53 + var54) * 0.5F;
            var43[var4 - 1 - var47 * 2] = (-var30 + var53 + var54) * 0.5F;
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var47] = var43[var17 + var47 * 2] * var22[var47 * 2] + var43[var17 + var47 * 2 + 1] * var22[var47 * 2 + 1];
            var43[var17 - 1 - var47] = var43[var17 + var47 * 2] * var22[var47 * 2 + 1] - var43[var17 + var47 * 2 + 1] * var22[var47 * 2];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var47 + (var4 - var40)] = -var43[var47];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var47] = var43[var40 + var47];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var40 + var47] = -var43[var40 - var47 - 1];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var17 + var47] = var43[var4 - var47 - 1];
         }

         for(var47 = var8; var47 < var9; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            field1391[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field1391[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }
      }

      float[] var41 = null;
      if(this.field1388 > 0) {
         var40 = var4 + this.field1388 >> 2;
         var41 = new float[var40];
         int var20;
         if(!this.field1384) {
            for(var42 = 0; var42 < this.field1389; ++var42) {
               var20 = var42 + (this.field1388 >> 1);
               var41[var42] += this.field1380[var20];
            }
         }

         if(!var15) {
            for(var42 = var8; var42 < var4 >> 1; ++var42) {
               var20 = var41.length - (var4 >> 1) + var42;
               var41[var20] += field1391[var42];
            }
         }
      }

      float[] var46 = this.field1380;
      this.field1380 = field1391;
      field1391 = var46;
      this.field1388 = var4;
      this.field1389 = var12 - (var4 >> 1);
      this.field1384 = var15;
      return var41;
   }

   static int method2486() {
      int var0 = field1375[field1376] >> field1371 & 1;
      ++field1371;
      field1376 += field1371 >> 3;
      field1371 &= 7;
      return var0;
   }

   static int method2462(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - field1371; var0 -= var3) {
         var3 = 8 - field1371;
         int var4 = (1 << var3) - 1;
         var1 += (field1375[field1376] >> field1371 & var4) << var2;
         field1371 = 0;
         ++field1376;
         var2 += var3;
      }

      if(var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (field1375[field1376] >> field1371 & var3) << var2;
         field1371 += var0;
      }

      return var1;
   }

   static void method2461(byte[] var0, int var1) {
      field1375 = var0;
      field1376 = var1;
      field1371 = 0;
   }

   static boolean method2460(class243 var0) {
      if(!field1386) {
         byte[] var1 = var0.method4224(0, 0, (byte)-78);
         if(var1 == null) {
            return false;
         }

         method2464(var1);
         field1386 = true;
      }

      return true;
   }

   static class111 method2489(class243 var0, int var1, int var2) {
      if(!method2460(var0)) {
         var0.method4238(var1, var2, 1385975476);
         return null;
      } else {
         byte[] var3 = var0.method4224(var1, var2, (byte)-119);
         return var3 == null?null:new class111(var3);
      }
   }

   static void method2464(byte[] var0) {
      method2461(var0, 0);
      field1378 = 1 << method2462(4);
      field1379 = 1 << method2462(4);
      field1391 = new float[field1379];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0?field1379:field1378;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[var7 * 2] = (float)Math.cos((double)(var7 * 4) * 3.141592653589793D / (double)var2);
            var6[var7 * 2 + 1] = -((float)Math.sin((double)(var7 * 4) * 3.141592653589793D / (double)var2));
         }

         float[] var12 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var12[var8 * 2] = (float)Math.cos((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
            var12[var8 * 2 + 1] = (float)Math.sin((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
         }

         float[] var13 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var13[var9 * 2] = (float)Math.cos((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2);
            var13[var9 * 2 + 1] = -((float)Math.sin((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var14 = new int[var5];
         int var10 = class196.method3689(var5 - 1, -619738050);

         for(int var11 = 0; var11 < var5; ++var11) {
            var14[var11] = class250.method4429(var11, var10, (byte)42);
         }

         if(var1 != 0) {
            field1395 = var6;
            field1396 = var12;
            field1397 = var13;
            field1369 = var14;
         } else {
            field1392 = var6;
            field1393 = var12;
            field1377 = var13;
            field1398 = var14;
         }
      }

      var1 = method2462(8) + 1;
      field1394 = new class109[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         field1394[var2] = new class109();
      }

      var2 = method2462(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method2462(16);
      }

      var2 = method2462(6) + 1;
      field1374 = new class113[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field1374[var3] = new class113();
      }

      var3 = method2462(6) + 1;
      field1382 = new class120[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field1382[var4] = new class120();
      }

      var4 = method2462(6) + 1;
      field1383 = new class125[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field1383[var5] = new class125();
      }

      var5 = method2462(6) + 1;
      field1399 = new boolean[var5];
      field1385 = new int[var5];

      for(int var15 = 0; var15 < var5; ++var15) {
         field1399[var15] = method2486() != 0;
         method2462(16);
         method2462(16);
         field1385[var15] = method2462(8);
      }

   }

   static float method2468(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if(var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }
}
