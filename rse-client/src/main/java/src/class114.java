package src;

import java.util.concurrent.ScheduledExecutorService;

public class class114 {

   public static int field1421;
   protected static boolean field1437;
   static ScheduledExecutorService field1420;
   static class108 field1425;
   static int field1423;
   class124[] field1434 = new class124[8];
   protected int[] field1426;
   class124 field1427;
   int field1439 = 0;
   boolean field1438 = true;
   int field1442;
   int field1433 = 32;
   class124[] field1440 = new class124[8];
   long field1441 = 0L;
   long field1429 = class217.method4014(-1892971638);
   int field1436 = 0;
   int field1428 = 0;
   int field1435 = 0;
   int field1431;
   long field1424 = 0L;
   int field1432;


   protected void vmethod2534(int var1) throws Exception {}

   protected void vmethod2558(byte var1) {}

   public final synchronized void method2522(byte var1) {
      if(this.field1426 != null) {
         long var2 = class217.method4014(767857859);

         try {
            if(0L != this.field1441) {
               if(var2 < this.field1441) {
                  return;
               }

               this.vmethod2530(this.field1442, -1778803273);
               this.field1441 = 0L;
               this.field1438 = true;
            }

            int var4 = this.vmethod2531(-1722515255);
            if(this.field1428 - var4 > this.field1436) {
               this.field1436 = this.field1428 - var4;
            }

            int var5 = this.field1431 + this.field1432;
            if(var5 + 256 > 16384) {
               var5 = 16128;
            }

            if(var5 + 256 > this.field1442) {
               this.field1442 += 1024;
               if(this.field1442 > 16384) {
                  this.field1442 = 16384;
               }

               this.vmethod2558((byte)-53);
               this.vmethod2530(this.field1442, -1831392073);
               var4 = 0;
               this.field1438 = true;
               if(var5 + 256 > this.field1442) {
                  var5 = this.field1442 - 256;
                  this.field1432 = var5 - this.field1431;
               }
            }

            while(var4 < var5) {
               this.method2527(this.field1426, 256);
               this.vmethod2543();
               var4 += 256;
            }

            if(var2 > this.field1424) {
               if(!this.field1438) {
                  if(this.field1436 == 0 && this.field1435 == 0) {
                     this.vmethod2558((byte)-6);
                     this.field1441 = var2 + 2000L;
                     return;
                  }

                  this.field1432 = Math.min(this.field1435, this.field1436);
                  this.field1435 = this.field1436;
               } else {
                  this.field1438 = false;
               }

               this.field1436 = 0;
               this.field1424 = 2000L + var2;
            }

            this.field1428 = var4;
         } catch (Exception var8) {
            this.vmethod2558((byte)-100);
            this.field1441 = 2000L + var2;
         }

         try {
            if(var2 > 500000L + this.field1429) {
               var2 = this.field1429;
            }

            while(var2 > 5000L + this.field1429) {
               this.method2526(256, -1537467116);
               this.field1429 += (long)(256000 / field1421);
            }
         } catch (Exception var7) {
            this.field1429 = var2;
         }

      }
   }

   protected void vmethod2530(int var1, int var2) throws Exception {}

   protected int vmethod2531(int var1) throws Exception {
      return this.field1442;
   }

   public final synchronized void method2561(short var1) {
      this.field1438 = true;

      try {
         this.vmethod2534(-801705902);
      } catch (Exception var3) {
         this.vmethod2558((byte)-114);
         this.field1441 = class217.method4014(-2039022010) + 2000L;
      }

   }

   final void method2526(int var1, int var2) {
      this.field1439 -= var1;
      if(this.field1439 < 0) {
         this.field1439 = 0;
      }

      if(this.field1427 != null) {
         this.field1427.vmethod3967(var1);
      }

   }

   final void method2557(class124 var1, int var2, int var3) {
      int var4 = var2 >> 5;
      class124 var5 = this.field1434[var4];
      if(var5 == null) {
         this.field1440[var4] = var1;
      } else {
         var5.field1510 = var1;
      }

      this.field1434[var4] = var1;
      var1.field1507 = var2;
   }

   public final synchronized void method2525(int var1) {
      if(class332.field3878 != null) {
         boolean var2 = true;

         for(int var3 = 0; var3 < 2; ++var3) {
            if(this == class332.field3878.field1456[var3]) {
               class332.field3878.field1456[var3] = null;
            }

            if(class332.field3878.field1456[var3] != null) {
               var2 = false;
            }
         }

         if(var2) {
            field1420.shutdownNow();
            field1420 = null;
            class332.field3878 = null;
         }
      }

      this.vmethod2558((byte)-107);
      this.field1426 = null;
   }

   public final void method2523(int var1) {
      this.field1438 = true;
   }

   final void method2527(int[] var1, int var2) {
      int var3 = var2;
      if(field1437) {
         var3 = var2 << 1;
      }

      class310.method5775(var1, 0, var3);
      this.field1439 -= var2;
      if(this.field1427 != null && this.field1439 <= 0) {
         this.field1439 += field1421 >> 4;
         class178.method3575(this.field1427, (short)4477);
         this.method2557(this.field1427, this.field1427.vmethod2806(), 2093201048);
         int var4 = 0;
         int var5 = 255;

         int var6;
         class124 var10;
         label99:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if(var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class124 var11 = this.field1440[var7];

                  while(var11 != null) {
                     class127 var12 = var11.field1509;
                     if(var12 != null && var12.field1541 > var8) {
                        var5 |= 1 << var7;
                        var10 = var11;
                        var11 = var11.field1510;
                     } else {
                        var11.field1508 = true;
                        int var13 = var11.vmethod3963();
                        var4 += var13;
                        if(var12 != null) {
                           var12.field1541 += var13;
                        }

                        if(var4 >= this.field1433) {
                           break label99;
                        }

                        class124 var14 = var11.vmethod3962();
                        if(var14 != null) {
                           for(int var15 = var11.field1507; var14 != null; var14 = var11.vmethod3964()) {
                              this.method2557(var14, var15 * var14.vmethod2806() >> 8, -713824684);
                           }
                        }

                        class124 var18 = var11.field1510;
                        var11.field1510 = null;
                        if(var10 == null) {
                           this.field1440[var7] = var18;
                        } else {
                           var10.field1510 = var18;
                        }

                        if(var18 == null) {
                           this.field1434[var7] = var10;
                        }

                        var11 = var18;
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class124 var16 = this.field1440[var6];
            class124[] var17 = this.field1440;
            this.field1434[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field1510;
               var16.field1510 = null;
            }
         }
      }

      if(this.field1439 < 0) {
         this.field1439 = 0;
      }

      if(this.field1427 != null) {
         this.field1427.vmethod3966(var1, 0, var2);
      }

      this.field1429 = class217.method4014(-1371628071);
   }

   protected void vmethod2543() throws Exception {}

   public final synchronized void method2521(class124 var1, int var2) {
      this.field1427 = var1;
   }

   protected void vmethod2529(int var1) throws Exception {}

   public static boolean method2580(char var0, int var1) {
      return var0 >= 48 && var0 <= 57;
   }
}
