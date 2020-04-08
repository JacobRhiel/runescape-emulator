package src;

public class class207 extends class124 {

   static class72 field2434;
   int[] field2432 = new int[16];
   int field2442;
   int field2415 = 256;
   int[] field2423 = new int[16];
   int[] field2420 = new int[16];
   int[] field2416 = new int[16];
   int[] field2421 = new int[16];
   class327 field2426 = new class327(128);
   class208[][] field2441 = new class208[16][128];
   int[] field2428 = new int[16];
   class209 field2436 = new class209();
   class211 field2438 = new class211(this);
   int field2439;
   int[] field2443 = new int[16];
   int[] field2433 = new int[16];
   int[] field2422 = new int[16];
   long field2425;
   int[] field2431 = new int[16];
   int[] field2417 = new int[16];
   int[] field2430 = new int[16];
   int field2419 = 1000000;
   boolean field2418;
   class208[][] field2435 = new class208[16][128];
   int[] field2437 = new int[16];
   long field2440;
   int[] field2424 = new int[16];
   int[] field2429 = new int[16];


   public class207() {
      this.method3791((byte)30);
   }

   void method3780(int var1, int var2, int var3) {
      this.field2420[var1] = var2;
      this.field2422[var1] = var2 & -128;
      this.method3781(var1, var2, 1712067556);
   }

   void method3784(int var1, int var2, int var3, int var4) {
      class208 var5 = this.field2441[var1][var2];
      if(var5 != null) {
         this.field2441[var1][var2] = null;
         if((this.field2428[var1] & 2) != 0) {
            for(class208 var6 = (class208)this.field2438.field2492.method4931(); var6 != null; var6 = (class208)this.field2438.field2492.method4949()) {
               if(var6.field2452 == var5.field2452 && var6.field2459 < 0 && var5 != var6) {
                  var5.field2459 = 0;
                  break;
               }
            }
         } else {
            var5.field2459 = 0;
         }

      }
   }

   void method3788(int var1, int var2) {
      for(class208 var3 = (class208)this.field2438.field2492.method4931(); var3 != null; var3 = (class208)this.field2438.field2492.method4949()) {
         if(var1 < 0 || var3.field2452 == var1) {
            if(var3.field2463 != null) {
               var3.field2463.method2692(class114.field1421 / 100);
               if(var3.field2463.method2658()) {
                  this.field2438.field2493.method2385(var3.field2463);
               }

               var3.method3896(1343600340);
            }

            if(var3.field2459 < 0) {
               this.field2441[var3.field2452][var3.field2464] = null;
            }

            var3.method3657();
         }
      }

   }

   public synchronized void method3861(int var1) {
      this.field2436.method3920();
      this.method3791((byte)86);
   }

   void method3789(int var1, int var2) {
      if(var1 >= 0) {
         this.field2443[var1] = 12800;
         this.field2416[var1] = 8192;
         this.field2417[var1] = 16383;
         this.field2423[var1] = 8192;
         this.field2424[var1] = 0;
         this.field2437[var1] = 8192;
         this.method3792(var1, -529276423);
         this.method3895(var1, (byte)32);
         this.field2428[var1] = 0;
         this.field2429[var1] = 32767;
         this.field2430[var1] = 256;
         this.field2431[var1] = 0;
         this.method3878(var1, 8192, (byte)97);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method3789(var1, -1172399116);
         }

      }
   }

   void method3787(int var1, int var2, int var3, int var4) {
      this.method3784(var1, var2, 64, 2083786373);
      if((this.field2428[var1] & 2) != 0) {
         for(class208 var5 = (class208)this.field2438.field2492.method4935(); var5 != null; var5 = (class208)this.field2438.field2492.method4932()) {
            if(var5.field2452 == var1 && var5.field2459 < 0) {
               this.field2441[var1][var5.field2464] = null;
               this.field2441[var1][var2] = var5;
               int var6 = (var5.field2455 * var5.field2454 >> 12) + var5.field2445;
               var5.field2445 += var2 - var5.field2464 << 8;
               var5.field2454 = var6 - var5.field2445;
               var5.field2455 = 4096;
               var5.field2464 = var2;
               return;
            }
         }
      }

      class210 var10 = (class210)this.field2426.method6010((long)this.field2421[var1]);
      if(var10 != null) {
         class112 var9 = var10.field2483[var2];
         if(var9 != null) {
            class208 var7 = new class208();
            var7.field2452 = var1;
            var7.field2446 = var10;
            var7.field2447 = var9;
            var7.field2460 = var10.field2488[var2];
            var7.field2467 = var10.field2489[var2];
            var7.field2464 = var2;
            var7.field2451 = var3 * var3 * var10.field2487[var2] * var10.field2484 + 1024 >> 11;
            var7.field2465 = var10.field2490[var2] & 255;
            var7.field2445 = (var2 << 8) - (var10.field2485[var2] & 32767);
            var7.field2456 = 0;
            var7.field2457 = 0;
            var7.field2458 = 0;
            var7.field2459 = -1;
            var7.field2448 = 0;
            if(this.field2431[var1] == 0) {
               var7.field2463 = class122.method2671(var9, this.method3843(var7, -1942255996), this.method3797(var7, -389843522), this.method3798(var7, 1525284834));
            } else {
               var7.field2463 = class122.method2671(var9, this.method3843(var7, -1718341786), 0, this.method3798(var7, 1374179656));
               this.method3831(var7, var10.field2485[var2] < 0, -1694957407);
            }

            if(var10.field2485[var2] < 0) {
               var7.field2463.method2675(-1);
            }

            if(var7.field2467 >= 0) {
               class208 var8 = this.field2435[var1][var7.field2467];
               if(var8 != null && var8.field2459 < 0) {
                  this.field2441[var1][var8.field2464] = null;
                  var8.field2459 = 0;
               }

               this.field2435[var1][var7.field2467] = var7;
            }

            this.field2438.field2492.method4952(var7);
            this.field2441[var1][var2] = var7;
         }
      }
   }

   void method3879(int var1, int var2, int var3, int var4) {}

   void method3791(byte var1) {
      this.method3788(-1, 866447032);
      this.method3789(-1, -1172399116);

      int var2;
      for(var2 = 0; var2 < 16; ++var2) {
         this.field2421[var2] = this.field2420[var2];
      }

      for(var2 = 0; var2 < 16; ++var2) {
         this.field2422[var2] = this.field2420[var2] & -128;
      }

   }

   void method3781(int var1, int var2, int var3) {
      if(var2 != this.field2421[var1]) {
         this.field2421[var1] = var2;

         for(int var4 = 0; var4 < 128; ++var4) {
            this.field2435[var1][var4] = null;
         }
      }

   }

   protected synchronized void vmethod3966(int[] var1, int var2, int var3) {
      if(this.field2436.method3905()) {
         int var4 = this.field2436.field2475 * this.field2419 / class114.field1421;

         do {
            long var5 = (long)var4 * (long)var3 + this.field2440;
            if(this.field2425 - var5 >= 0L) {
               this.field2440 = var5;
               break;
            }

            int var7 = (int)(((long)var4 + (this.field2425 - this.field2440) - 1L) / (long)var4);
            this.field2440 += (long)var7 * (long)var4;
            this.field2438.vmethod3966(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method3804((byte)50);
         } while(this.field2436.method3905());
      }

      this.field2438.vmethod3966(var1, var2, var3);
   }

   protected synchronized void vmethod3967(int var1) {
      if(this.field2436.method3905()) {
         int var2 = this.field2436.field2475 * this.field2419 / class114.field1421;

         do {
            long var3 = this.field2440 + (long)var1 * (long)var2;
            if(this.field2425 - var3 >= 0L) {
               this.field2440 = var3;
               break;
            }

            int var5 = (int)((this.field2425 - this.field2440 + (long)var2 - 1L) / (long)var2);
            this.field2440 += (long)var5 * (long)var2;
            this.field2438.vmethod3967(var5);
            var1 -= var5;
            this.method3804((byte)-22);
         } while(this.field2436.method3905());
      }

      this.field2438.vmethod3967(var1);
   }

   void method3796(int var1, int var2, int var3) {}

   void method3778(int var1, int var2, int var3) {
      this.field2423[var1] = var2;
   }

   int method3843(class208 var1, int var2) {
      int var3 = (var1.field2454 * var1.field2455 >> 12) + var1.field2445;
      var3 += (this.field2423[var1.field2452] - 8192) * this.field2430[var1.field2452] >> 12;
      class205 var4 = var1.field2460;
      int var5;
      if(var4.field2401 > 0 && (var4.field2395 > 0 || this.field2424[var1.field2452] > 0)) {
         var5 = var4.field2395 << 2;
         int var6 = var4.field2394 << 1;
         if(var1.field2461 < var6) {
            var5 = var5 * var1.field2461 / var6;
         }

         var5 += this.field2424[var1.field2452] >> 7;
         double var7 = Math.sin(0.01227184630308513D * (double)(var1.field2449 & 511));
         var3 += (int)((double)var5 * var7);
      }

      var5 = (int)((double)(var1.field2447.field1406 * 256) * Math.pow(2.0D, (double)var3 * 3.255208333333333E-4D) / (double)class114.field1421 + 0.5D);
      return var5 < 1?1:var5;
   }

   protected synchronized class124 vmethod3964() {
      return null;
   }

   public synchronized boolean method3773(class212 var1, class243 var2, class117 var3, int var4, int var5) {
      var1.method3986();
      boolean var6 = true;
      int[] var7 = null;
      if(var4 > 0) {
         var7 = new int[]{var4};
      }

      for(class186 var8 = (class186)var1.field2497.method5995(); var8 != null; var8 = (class186)var1.field2497.method6003()) {
         int var9 = (int)var8.field2116;
         class210 var10 = (class210)this.field2426.method6010((long)var9);
         if(var10 == null) {
            var10 = class298.method5316(var2, var9, 16711680);
            if(var10 == null) {
               var6 = false;
               continue;
            }

            this.field2426.method5997(var10, (long)var9);
         }

         if(!var10.method3949(var3, var8.field2111, var7, (byte)50)) {
            var6 = false;
         }
      }

      if(var6) {
         var1.method3987();
      }

      return var6;
   }

   boolean method3805(class208 var1, int var2) {
      if(var1.field2463 == null) {
         if(var1.field2459 >= 0) {
            var1.method3657();
            if(var1.field2467 > 0 && var1 == this.field2435[var1.field2452][var1.field2467]) {
               this.field2435[var1.field2452][var1.field2467] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void method3792(int var1, int var2) {
      if((this.field2428[var1] & 2) != 0) {
         for(class208 var3 = (class208)this.field2438.field2492.method4931(); var3 != null; var3 = (class208)this.field2438.field2492.method4949()) {
            if(var3.field2452 == var1 && this.field2441[var1][var3.field2464] == null && var3.field2459 < 0) {
               var3.field2459 = 0;
            }
         }
      }

   }

   public int method3772(int var1) {
      return this.field2415;
   }

   void method3895(int var1, byte var2) {
      if((this.field2428[var1] & 4) != 0) {
         for(class208 var3 = (class208)this.field2438.field2492.method4931(); var3 != null; var3 = (class208)this.field2438.field2492.method4949()) {
            if(var3.field2452 == var1) {
               var3.field2462 = 0;
            }
         }
      }

   }

   void method3794(int var1, int var2) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if(var3 == 128) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method3784(var4, var5, var6, 686121236);
      } else if(var3 == 144) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if(var6 > 0) {
            this.method3787(var4, var5, var6, -91684183);
         } else {
            this.method3784(var4, var5, 64, 663575267);
         }

      } else if(var3 == 160) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method3879(var4, var5, var6, -97201691);
      } else if(var3 == 176) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if(var5 == 0) {
            this.field2422[var4] = (var6 << 14) + (this.field2422[var4] & -2080769);
         }

         if(var5 == 32) {
            this.field2422[var4] = (var6 << 7) + (this.field2422[var4] & -16257);
         }

         if(var5 == 1) {
            this.field2424[var4] = (var6 << 7) + (this.field2424[var4] & -16257);
         }

         if(var5 == 33) {
            this.field2424[var4] = var6 + (this.field2424[var4] & -128);
         }

         if(var5 == 5) {
            this.field2437[var4] = (var6 << 7) + (this.field2437[var4] & -16257);
         }

         if(var5 == 37) {
            this.field2437[var4] = var6 + (this.field2437[var4] & -128);
         }

         if(var5 == 7) {
            this.field2443[var4] = (var6 << 7) + (this.field2443[var4] & -16257);
         }

         if(var5 == 39) {
            this.field2443[var4] = var6 + (this.field2443[var4] & -128);
         }

         if(var5 == 10) {
            this.field2416[var4] = (var6 << 7) + (this.field2416[var4] & -16257);
         }

         if(var5 == 42) {
            this.field2416[var4] = var6 + (this.field2416[var4] & -128);
         }

         if(var5 == 11) {
            this.field2417[var4] = (var6 << 7) + (this.field2417[var4] & -16257);
         }

         if(var5 == 43) {
            this.field2417[var4] = var6 + (this.field2417[var4] & -128);
         }

         if(var5 == 64) {
            if(var6 >= 64) {
               this.field2428[var4] |= 1;
            } else {
               this.field2428[var4] &= -2;
            }
         }

         if(var5 == 65) {
            if(var6 >= 64) {
               this.field2428[var4] |= 2;
            } else {
               this.method3792(var4, 696626681);
               this.field2428[var4] &= -3;
            }
         }

         if(var5 == 99) {
            this.field2429[var4] = (var6 << 7) + (this.field2429[var4] & 127);
         }

         if(var5 == 98) {
            this.field2429[var4] = (this.field2429[var4] & 16256) + var6;
         }

         if(var5 == 101) {
            this.field2429[var4] = (var6 << 7) + (this.field2429[var4] & 127) + 16384;
         }

         if(var5 == 100) {
            this.field2429[var4] = (this.field2429[var4] & 16256) + var6 + 16384;
         }

         if(var5 == 120) {
            this.method3788(var4, 1421229432);
         }

         if(var5 == 121) {
            this.method3789(var4, -1172399116);
         }

         if(var5 == 123) {
            this.method3819(var4, (byte)-67);
         }

         int var7;
         if(var5 == 6) {
            var7 = this.field2429[var4];
            if(var7 == 16384) {
               this.field2430[var4] = (var6 << 7) + (this.field2430[var4] & -16257);
            }
         }

         if(var5 == 38) {
            var7 = this.field2429[var4];
            if(var7 == 16384) {
               this.field2430[var4] = var6 + (this.field2430[var4] & -128);
            }
         }

         if(var5 == 16) {
            this.field2431[var4] = (var6 << 7) + (this.field2431[var4] & -16257);
         }

         if(var5 == 48) {
            this.field2431[var4] = var6 + (this.field2431[var4] & -128);
         }

         if(var5 == 81) {
            if(var6 >= 64) {
               this.field2428[var4] |= 4;
            } else {
               this.method3895(var4, (byte)32);
               this.field2428[var4] &= -5;
            }
         }

         if(var5 == 17) {
            this.method3878(var4, (var6 << 7) + (this.field2432[var4] & -16257), (byte)84);
         }

         if(var5 == 49) {
            this.method3878(var4, var6 + (this.field2432[var4] & -128), (byte)67);
         }

      } else if(var3 == 192) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method3781(var4, var5 + this.field2422[var4], -219152153);
      } else if(var3 == 208) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method3796(var4, var5, -1237765381);
      } else if(var3 == 224) {
         var4 = var1 & 15;
         var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method3778(var4, var5, 288952234);
      } else {
         var3 = var1 & 255;
         if(var3 == 255) {
            this.method3791((byte)21);
         }
      }
   }

   public synchronized boolean method3882(int var1) {
      return this.field2436.method3905();
   }

   public synchronized void method3853(int var1) {
      for(class210 var2 = (class210)this.field2426.method5995(); var2 != null; var2 = (class210)this.field2426.method6003()) {
         var2.method3950((byte)106);
      }

   }

   public synchronized void method3782(int var1) {
      for(class210 var2 = (class210)this.field2426.method5995(); var2 != null; var2 = (class210)this.field2426.method6003()) {
         var2.method3657();
      }

   }

   boolean method3863(class208 var1, int[] var2, int var3, int var4, byte var5) {
      var1.field2453 = class114.field1421 / 100;
      if(var1.field2459 >= 0 && (var1.field2463 == null || var1.field2463.method2657())) {
         var1.method3896(-392566943);
         var1.method3657();
         if(var1.field2467 > 0 && var1 == this.field2435[var1.field2452][var1.field2467]) {
            this.field2435[var1.field2452][var1.field2467] = null;
         }

         return true;
      } else {
         int var6 = var1.field2455;
         if(var6 > 0) {
            var6 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2437[var1.field2452] * 4.921259842519685E-4D) + 0.5D);
            if(var6 < 0) {
               var6 = 0;
            }

            var1.field2455 = var6;
         }

         var1.field2463.method2655(this.method3843(var1, -1438720370));
         class205 var7 = var1.field2460;
         boolean var8 = false;
         ++var1.field2461;
         var1.field2449 += var7.field2401;
         double var9 = (double)((var1.field2464 - 60 << 8) + (var1.field2455 * var1.field2454 >> 12)) * 5.086263020833333E-6D;
         if(var7.field2396 > 0) {
            if(var7.field2399 > 0) {
               var1.field2456 += (int)(128.0D * Math.pow(2.0D, (double)var7.field2399 * var9) + 0.5D);
            } else {
               var1.field2456 += 128;
            }
         }

         if(var7.field2402 != null) {
            if(var7.field2397 > 0) {
               var1.field2457 += (int)(128.0D * Math.pow(2.0D, (double)var7.field2397 * var9) + 0.5D);
            } else {
               var1.field2457 += 128;
            }

            while(var1.field2458 < var7.field2402.length - 2 && var1.field2457 > (var7.field2402[var1.field2458 + 2] & 255) << 8) {
               var1.field2458 += 2;
            }

            if(var7.field2402.length - 2 == var1.field2458 && var7.field2402[var1.field2458 + 1] == 0) {
               var8 = true;
            }
         }

         if(var1.field2459 >= 0 && var7.field2398 != null && (this.field2428[var1.field2452] & 1) == 0 && (var1.field2467 < 0 || var1 != this.field2435[var1.field2452][var1.field2467])) {
            if(var7.field2400 > 0) {
               var1.field2459 += (int)(128.0D * Math.pow(2.0D, (double)var7.field2400 * var9) + 0.5D);
            } else {
               var1.field2459 += 128;
            }

            while(var1.field2448 < var7.field2398.length - 2 && var1.field2459 > (var7.field2398[var1.field2448 + 2] & 255) << 8) {
               var1.field2448 += 2;
            }

            if(var7.field2398.length - 2 == var1.field2448) {
               var8 = true;
            }
         }

         if(var8) {
            var1.field2463.method2692(var1.field2453);
            if(var2 != null) {
               var1.field2463.vmethod3966(var2, var3, var4);
            } else {
               var1.field2463.vmethod3967(var4);
            }

            if(var1.field2463.method2658()) {
               this.field2438.field2493.method2385(var1.field2463);
            }

            var1.method3896(1446734229);
            if(var1.field2459 >= 0) {
               var1.method3657();
               if(var1.field2467 > 0 && var1 == this.field2435[var1.field2452][var1.field2467]) {
                  this.field2435[var1.field2452][var1.field2467] = null;
               }
            }

            return true;
         } else {
            var1.field2463.method2690(var1.field2453, this.method3797(var1, -2023927212), this.method3798(var1, 1444946212));
            return false;
         }
      }
   }

   public synchronized void method3793(int var1, int var2) {
      this.field2415 = var1;
   }

   protected synchronized class124 vmethod3962() {
      return this.field2438;
   }

   void method3878(int var1, int var2, byte var3) {
      this.field2432[var1] = var2;
      this.field2433[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
   }

   public synchronized void method3807(class212 var1, boolean var2, int var3) {
      this.method3861(1819276165);
      this.field2436.method3915(var1.field2498);
      this.field2418 = var2;
      this.field2440 = 0L;
      int var4 = this.field2436.method3906();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field2436.method3907(var5);
         this.field2436.method3910(var5);
         this.field2436.method3944(var5);
      }

      this.field2442 = this.field2436.method3902();
      this.field2439 = this.field2436.field2476[this.field2442];
      this.field2425 = this.field2436.method3914(this.field2439);
   }

   void method3804(byte var1) {
      int var2 = this.field2442;
      int var3 = this.field2439;

      long var4;
      for(var4 = this.field2425; var3 == this.field2439; var4 = this.field2436.method3914(var3)) {
         while(var3 == this.field2436.field2476[var2]) {
            this.field2436.method3907(var2);
            int var6 = this.field2436.method3911(var2);
            if(var6 == 1) {
               this.field2436.method3909();
               this.field2436.method3944(var2);
               if(this.field2436.method3916()) {
                  if(!this.field2418 || var3 == 0) {
                     this.method3791((byte)-92);
                     this.field2436.method3920();
                     return;
                  }

                  this.field2436.method3917(var4);
               }
               break;
            }

            if((var6 & 128) != 0) {
               this.method3794(var6, 1370441478);
            }

            this.field2436.method3910(var2);
            this.field2436.method3944(var2);
         }

         var2 = this.field2436.method3902();
         var3 = this.field2436.field2476[var2];
      }

      this.field2442 = var2;
      this.field2439 = var3;
      this.field2425 = var4;
   }

   void method3831(class208 var1, boolean var2, int var3) {
      int var4 = var1.field2447.field1404.length;
      int var5;
      if(var2 && var1.field2447.field1407) {
         int var6 = var4 + var4 - var1.field2447.field1405;
         var5 = (int)((long)this.field2431[var1.field2452] * (long)var6 >> 6);
         var4 <<= 8;
         if(var5 >= var4) {
            var5 = var4 + var4 - 1 - var5;
            var1.field2463.method2641(true);
         }
      } else {
         var5 = (int)((long)var4 * (long)this.field2431[var1.field2452] >> 6);
      }

      var1.field2463.method2650(var5);
   }

   protected synchronized int vmethod3963() {
      return 0;
   }

   int method3797(class208 var1, int var2) {
      class205 var3 = var1.field2460;
      int var4 = this.field2443[var1.field2452] * this.field2417[var1.field2452] + 4096 >> 13;
      var4 = var4 * var4 + 16384 >> 15;
      var4 = var4 * var1.field2451 + 16384 >> 15;
      var4 = var4 * this.field2415 + 128 >> 8;
      if(var3.field2396 > 0) {
         var4 = (int)((double)var4 * Math.pow(0.5D, (double)var3.field2396 * (double)var1.field2456 * 1.953125E-5D) + 0.5D);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      if(var3.field2402 != null) {
         var5 = var1.field2457;
         var6 = var3.field2402[var1.field2458 + 1];
         if(var1.field2458 < var3.field2402.length - 2) {
            var7 = (var3.field2402[var1.field2458] & 255) << 8;
            var8 = (var3.field2402[var1.field2458 + 2] & 255) << 8;
            var6 += (var5 - var7) * (var3.field2402[var1.field2458 + 3] - var6) / (var8 - var7);
         }

         var4 = var4 * var6 + 32 >> 6;
      }

      if(var1.field2459 > 0 && var3.field2398 != null) {
         var5 = var1.field2459;
         var6 = var3.field2398[var1.field2448 + 1];
         if(var1.field2448 < var3.field2398.length - 2) {
            var7 = (var3.field2398[var1.field2448] & 255) << 8;
            var8 = (var3.field2398[var1.field2448 + 2] & 255) << 8;
            var6 += (var5 - var7) * (var3.field2398[var1.field2448 + 3] - var6) / (var8 - var7);
         }

         var4 = var6 * var4 + 32 >> 6;
      }

      return var4;
   }

   int method3798(class208 var1, int var2) {
      int var3 = this.field2416[var1.field2452];
      return var3 < 8192?var3 * var1.field2465 + 32 >> 6:16384 - ((128 - var1.field2465) * (16384 - var3) + 32 >> 6);
   }

   void method3819(int var1, byte var2) {
      for(class208 var3 = (class208)this.field2438.field2492.method4931(); var3 != null; var3 = (class208)this.field2438.field2492.method4949()) {
         if((var1 < 0 || var3.field2452 == var1) && var3.field2459 < 0) {
            this.field2441[var3.field2452][var3.field2464] = null;
            var3.field2459 = 0;
         }
      }

   }

   public synchronized void method3779(int var1, int var2, byte var3) {
      this.method3780(var1, var2, 1696015287);
   }
}
