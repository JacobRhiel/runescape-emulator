package src;

public class class109 {

   float[][] field1360;
   int field1359;
   int[] field1364;
   int[] field1361;
   int field1363;
   int[] field1362;


   class109() {
      class111.method2462(24);
      this.field1363 = class111.method2462(16);
      this.field1359 = class111.method2462(24);
      this.field1361 = new int[this.field1359];
      boolean var1 = class111.method2486() != 0;
      int var2;
      int var3;
      int var5;
      if(var1) {
         var2 = 0;

         for(var3 = class111.method2462(5) + 1; var2 < this.field1359; ++var3) {
            int var4 = class111.method2462(class196.method3689(this.field1359 - var2, -391197880));

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1361[var2++] = var3;
            }
         }
      } else {
         boolean var14 = class111.method2486() != 0;

         for(var3 = 0; var3 < this.field1359; ++var3) {
            if(var14 && class111.method2486() == 0) {
               this.field1361[var3] = 0;
            } else {
               this.field1361[var3] = class111.method2462(5) + 1;
            }
         }
      }

      this.method2431();
      var2 = class111.method2462(4);
      if(var2 > 0) {
         float var15 = class111.method2468(class111.method2462(32));
         float var16 = class111.method2468(class111.method2462(32));
         var5 = class111.method2462(4) + 1;
         boolean var6 = class111.method2486() != 0;
         int var7;
         if(var2 == 1) {
            var7 = method2440(this.field1359, this.field1363);
         } else {
            var7 = this.field1359 * this.field1363;
         }

         this.field1362 = new int[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            this.field1362[var8] = class111.method2462(var5);
         }

         this.field1360 = new float[this.field1359][this.field1363];
         float var9;
         int var10;
         int var11;
         if(var2 == 1) {
            for(var8 = 0; var8 < this.field1359; ++var8) {
               var9 = 0.0F;
               var10 = 1;

               for(var11 = 0; var11 < this.field1363; ++var11) {
                  int var12 = var8 / var10 % var7;
                  float var13 = (float)this.field1362[var12] * var16 + var15 + var9;
                  this.field1360[var8][var11] = var13;
                  if(var6) {
                     var9 = var13;
                  }

                  var10 *= var7;
               }
            }
         } else {
            for(var8 = 0; var8 < this.field1359; ++var8) {
               var9 = 0.0F;
               var10 = var8 * this.field1363;

               for(var11 = 0; var11 < this.field1363; ++var11) {
                  float var17 = (float)this.field1362[var10] * var16 + var15 + var9;
                  this.field1360[var8][var11] = var17;
                  if(var6) {
                     var9 = var17;
                  }

                  ++var10;
               }
            }
         }
      }

   }

   int method2438() {
      int var1;
      for(var1 = 0; this.field1364[var1] >= 0; var1 = class111.method2486() != 0?this.field1364[var1]:var1 + 1) {
         ;
      }

      return ~this.field1364[var1];
   }

   float[] method2441() {
      return this.field1360[this.method2438()];
   }

   void method2431() {
      int[] var1 = new int[this.field1359];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.field1359; ++var3) {
         var4 = this.field1361[var3];
         if(var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var12;
            if((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var12 = var2[var8];
                  if(var12 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if((var12 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var12 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var12 = var2[var8];
               if(var12 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.field1364 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.field1359; ++var3) {
         var4 = this.field1361[var3];
         if(var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if((var5 & var8) != 0) {
                  if(this.field1364[var6] == 0) {
                     this.field1364[var6] = var11;
                  }

                  var6 = this.field1364[var6];
               } else {
                  ++var6;
               }

               if(var6 >= this.field1364.length) {
                  int[] var9 = new int[this.field1364.length * 2];

                  for(var10 = 0; var10 < this.field1364.length; ++var10) {
                     var9[var10] = this.field1364[var10];
                  }

                  this.field1364 = var9;
               }

               var8 >>>= 1;
            }

            this.field1364[var6] = ~var3;
            if(var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   static int method2440(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; class97.method2212(var2, var1, 1233974315) > var0; --var2) {
         ;
      }

      return var2;
   }
}
