package src;

public class class120 {

   int field1472 = class111.method2462(8);
   int field1467 = class111.method2462(24);
   int field1471 = class111.method2462(16);
   int field1468 = class111.method2462(24);
   int field1469 = class111.method2462(24) + 1;
   int[] field1473;
   int field1470 = class111.method2462(6) + 1;


   class120() {
      int[] var1 = new int[this.field1470];

      int var2;
      for(var2 = 0; var2 < this.field1470; ++var2) {
         int var3 = 0;
         int var4 = class111.method2462(3);
         boolean var5 = class111.method2486() != 0;
         if(var5) {
            var3 = class111.method2462(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.field1473 = new int[this.field1470 * 8];

      for(var2 = 0; var2 < this.field1470 * 8; ++var2) {
         this.field1473[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0?class111.method2462(8):-1;
      }

   }

   void method2620(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if(!var3) {
         var4 = class111.field1394[this.field1472].field1363;
         int var5 = this.field1467 - this.field1468;
         int var6 = var5 / this.field1469;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if(var8 == 0) {
                  var10 = class111.field1394[this.field1472].method2438();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if(var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.field1470;
                     }

                     var10 /= this.field1470;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.field1473[var8 + var11 * 8];
                  if(var12 >= 0) {
                     int var13 = var9 * this.field1469 + this.field1468;
                     class109 var14 = class111.field1394[var12];
                     int var15;
                     if(this.field1471 == 0) {
                        var15 = this.field1469 / var14.field1363;

                        for(int var16 = 0; var16 < var15; ++var16) {
                           float[] var17 = var14.method2441();

                           for(int var18 = 0; var18 < var14.field1363; ++var18) {
                              var1[var13 + var16 + var18 * var15] += var17[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.field1469) {
                           float[] var19 = var14.method2441();

                           for(int var20 = 0; var20 < var14.field1363; ++var20) {
                              var1[var13 + var15] += var19[var20];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if(var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }
}
