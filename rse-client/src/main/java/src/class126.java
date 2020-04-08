package src;

import java.util.Random;

public class class126 {

   static int[] field1532 = new int['\u8000'];
   static int[] field1540;
   static int[] field1534;
   static int[] field1536;
   static int[] field1537;
   static int[] field1515;
   static int[] field1516;
   static int[] field1518;
   class115 field1519;
   int[] field1523 = new int[]{0, 0, 0, 0, 0};
   int field1530 = 500;
   int field1531 = 0;
   class115 field1538;
   int[] field1524 = new int[]{0, 0, 0, 0, 0};
   class115 field1517;
   class115 field1529;
   class115 field1520;
   int[] field1525 = new int[]{0, 0, 0, 0, 0};
   class115 field1539;
   int field1533 = 0;
   int field1527 = 100;
   class115 field1521;
   class115 field1526;
   class123 field1528;
   class115 field1522;


   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < '\u8000'; ++var1) {
         field1532[var1] = (var0.nextInt() & 2) - 1;
      }

      field1534 = new int['\u8000'];

      for(var1 = 0; var1 < '\u8000'; ++var1) {
         field1534[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field1540 = new int[220500];
      field1536 = new int[5];
      field1537 = new int[5];
      field1515 = new int[5];
      field1516 = new int[5];
      field1518 = new int[5];
   }

   final void method2831(class309 var1) {
      this.field1519 = new class115();
      this.field1519.method2581(var1);
      this.field1538 = new class115();
      this.field1538.method2581(var1);
      int var2 = var1.readUnsignedByte((byte)97);
      if(var2 != 0) {
         --var1.field3710;
         this.field1517 = new class115();
         this.field1517.method2581(var1);
         this.field1520 = new class115();
         this.field1520.method2581(var1);
      }

      var2 = var1.readUnsignedByte((byte)119);
      if(var2 != 0) {
         --var1.field3710;
         this.field1529 = new class115();
         this.field1529.method2581(var1);
         this.field1539 = new class115();
         this.field1539.method2581(var1);
      }

      var2 = var1.readUnsignedByte((byte)81);
      if(var2 != 0) {
         --var1.field3710;
         this.field1521 = new class115();
         this.field1521.method2581(var1);
         this.field1526 = new class115();
         this.field1526.method2581(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method5561(1039852402);
         if(var4 == 0) {
            break;
         }

         this.field1523[var3] = var4;
         this.field1524[var3] = var1.method5628(1517353363);
         this.field1525[var3] = var1.method5561(1284694119);
      }

      this.field1533 = var1.method5561(811325361);
      this.field1527 = var1.method5561(1249655879);
      this.field1530 = var1.readShort((byte)53);
      this.field1531 = var1.readShort((byte)42);
      this.field1528 = new class123();
      this.field1522 = new class115();
      this.field1528.method2799(var1, this.field1522);
   }

   final int[] method2830(int var1, int var2) {
      class310.method5775(field1540, 0, var1);
      if(var2 < 10) {
         return field1540;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field1519.method2584();
         this.field1538.method2584();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.field1517 != null) {
            this.field1517.method2584();
            this.field1520.method2584();
            var5 = (int)((double)(this.field1517.field1447 - this.field1517.field1450) * 32.768D / var3);
            var6 = (int)((double)this.field1517.field1450 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.field1529 != null) {
            this.field1529.method2584();
            this.field1539.method2584();
            var8 = (int)((double)(this.field1529.field1447 - this.field1529.field1450) * 32.768D / var3);
            var9 = (int)((double)this.field1529.field1450 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.field1523[var11] != 0) {
               field1536[var11] = 0;
               field1537[var11] = (int)((double)this.field1525[var11] * var3);
               field1515[var11] = (this.field1523[var11] << 14) / 100;
               field1516[var11] = (int)((double)(this.field1519.field1447 - this.field1519.field1450) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field1524[var11]) / var3);
               field1518[var11] = (int)((double)this.field1519.field1450 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field1519.method2585(var1);
            var13 = this.field1538.method2585(var1);
            if(this.field1517 != null) {
               var14 = this.field1517.method2585(var1);
               var15 = this.field1520.method2585(var1);
               var12 += this.method2834(var7, var15, this.field1517.field1449) >> 1;
               var7 = var7 + var6 + (var14 * var5 >> 16);
            }

            if(this.field1529 != null) {
               var14 = this.field1529.method2585(var1);
               var15 = this.field1539.method2585(var1);
               var13 = var13 * ((this.method2834(var10, var15, this.field1529.field1449) >> 1) + '\u8000') >> 15;
               var10 = var10 + var9 + (var14 * var8 >> 16);
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.field1523[var14] != 0) {
                  var15 = field1537[var14] + var11;
                  if(var15 < var1) {
                     field1540[var15] += this.method2834(field1536[var14], var13 * field1515[var14] >> 15, this.field1519.field1449);
                     field1536[var14] += (var12 * field1516[var14] >> 16) + field1518[var14];
                  }
               }
            }
         }

         int var16;
         if(this.field1521 != null) {
            this.field1521.method2584();
            this.field1526.method2584();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field1521.method2585(var1);
               var16 = this.field1526.method2585(var1);
               if(var20) {
                  var12 = (var15 * (this.field1521.field1447 - this.field1521.field1450) >> 8) + this.field1521.field1450;
               } else {
                  var12 = (var16 * (this.field1521.field1447 - this.field1521.field1450) >> 8) + this.field1521.field1450;
               }

               var11 += 256;
               if(var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if(var20) {
                  field1540[var14] = 0;
               }
            }
         }

         if(this.field1533 > 0 && this.field1527 > 0) {
            var11 = (int)((double)this.field1533 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field1540[var12] += field1540[var12 - var11] * this.field1527 / 100;
            }
         }

         if(this.field1528.field1498[0] > 0 || this.field1528.field1498[1] > 0) {
            this.field1522.method2584();
            var11 = this.field1522.method2585(var1 + 1);
            var12 = this.field1528.method2790(0, (float)var11 / 65536.0F);
            var13 = this.field1528.method2790(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field1540[var14 + var12] * (long)class123.field1503 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field1540[var14 + var12 - 1 - var17] * (long)class123.field1499[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field1540[var14 - 1 - var17] * (long)class123.field1499[1][var17] >> 16);
                  }

                  field1540[var14] = var16;
                  var11 = this.field1522.method2585(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field1540[var14 + var12] * (long)class123.field1503 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field1540[var14 + var12 - 1 - var18] * (long)class123.field1499[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field1540[var14 - 1 - var18] * (long)class123.field1499[1][var18] >> 16);
                     }

                     field1540[var14] = var17;
                     var11 = this.field1522.method2585(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field1540[var14 + var12 - 1 - var18] * (long)class123.field1499[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field1540[var14 - 1 - var18] * (long)class123.field1499[1][var18] >> 16);
                        }

                        field1540[var14] = var17;
                        this.field1522.method2585(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field1528.method2790(0, (float)var11 / 65536.0F);
                  var13 = this.field1528.method2790(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(field1540[var11] < -32768) {
               field1540[var11] = -32768;
            }

            if(field1540[var11] > 32767) {
               field1540[var11] = 32767;
            }
         }

         return field1540;
      }
   }

   final int method2834(int var1, int var2, int var3) {
      return var3 == 1?((var1 & 32767) < 16384?var2:-var2):(var3 == 2?field1534[var1 & 32767] * var2 >> 14:(var3 == 3?(var2 * (var1 & 32767) >> 14) - var2:(var3 == 4?var2 * field1532[var1 / 2607 & 32767]:0)));
   }
}
