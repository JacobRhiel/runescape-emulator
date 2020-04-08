package src;

public class class211 extends class124 {

   static class328 field2495;
   class107 field2493 = new class107();
   class207 field2494;
   class271 field2492 = new class271();


   class211(class207 var1) {
      this.field2494 = var1;
   }

   protected void vmethod3966(int[] var1, int var2, int var3) {
      this.field2493.vmethod3966(var1, var2, var3);

      for(class208 var6 = (class208)this.field2492.method4931(); var6 != null; var6 = (class208)this.field2492.method4949()) {
         if(!this.field2494.method3805(var6, 1715135805)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if(var5 <= var6.field2453) {
                  this.method3971(var6, var1, var4, var5, var4 + var5, (byte)72);
                  var6.field2453 -= var5;
                  break;
               }

               this.method3971(var6, var1, var4, var6.field2453, var4 + var5, (byte)56);
               var4 += var6.field2453;
               var5 -= var6.field2453;
            } while(!this.field2494.method3863(var6, var1, var4, var5, (byte)0));
         }
      }

   }

   protected void vmethod3967(int var1) {
      this.field2493.vmethod3967(var1);

      for(class208 var3 = (class208)this.field2492.method4931(); var3 != null; var3 = (class208)this.field2492.method4949()) {
         if(!this.field2494.method3805(var3, -130954859)) {
            int var2 = var1;

            do {
               if(var2 <= var3.field2453) {
                  this.method3968(var3, var2, 2120254911);
                  var3.field2453 -= var2;
                  break;
               }

               this.method3968(var3, var3.field2453, 2036025263);
               var2 -= var3.field2453;
            } while(!this.field2494.method3863(var3, (int[])null, 0, var2, (byte)0));
         }
      }

   }

   protected class124 vmethod3964() {
      class208 var1;
      do {
         var1 = (class208)this.field2492.method4949();
         if(var1 == null) {
            return null;
         }
      } while(var1.field2463 == null);

      return var1.field2463;
   }

   void method3968(class208 var1, int var2, int var3) {
      if((this.field2494.field2428[var1.field2452] & 4) != 0 && var1.field2459 < 0) {
         int var4 = this.field2494.field2433[var1.field2452] / class114.field1421;
         int var5 = (var4 + 1048575 - var1.field2462) / var4;
         var1.field2462 = var4 * var2 + var1.field2462 & 1048575;
         if(var5 <= var2) {
            if(this.field2494.field2431[var1.field2452] == 0) {
               var1.field2463 = class122.method2671(var1.field2447, var1.field2463.method2656(), var1.field2463.method2648(), var1.field2463.method2649());
            } else {
               var1.field2463 = class122.method2671(var1.field2447, var1.field2463.method2656(), 0, var1.field2463.method2649());
               this.field2494.method3831(var1, var1.field2446.field2485[var1.field2464] < 0, -1752723924);
            }

            if(var1.field2446.field2485[var1.field2464] < 0) {
               var1.field2463.method2675(-1);
            }

            var2 = var1.field2462 / var4;
         }
      }

      var1.field2463.vmethod3967(var2);
   }

   void method3971(class208 var1, int[] var2, int var3, int var4, int var5, byte var6) {
      if((this.field2494.field2428[var1.field2452] & 4) != 0 && var1.field2459 < 0) {
         int var7 = this.field2494.field2433[var1.field2452] / class114.field1421;

         while(true) {
            int var8 = (var7 + 1048575 - var1.field2462) / var7;
            if(var8 > var4) {
               var1.field2462 += var4 * var7;
               break;
            }

            var1.field2463.vmethod3966(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.field2462 += var8 * var7 - 1048576;
            int var9 = class114.field1421 / 100;
            int var10 = 262144 / var7;
            if(var10 < var9) {
               var9 = var10;
            }

            class122 var11 = var1.field2463;
            if(this.field2494.field2431[var1.field2452] == 0) {
               var1.field2463 = class122.method2671(var1.field2447, var11.method2656(), var11.method2648(), var11.method2649());
            } else {
               var1.field2463 = class122.method2671(var1.field2447, var11.method2656(), 0, var11.method2649());
               this.field2494.method3831(var1, var1.field2446.field2485[var1.field2464] < 0, -1342990502);
               var1.field2463.method2652(var9, var11.method2648());
            }

            if(var1.field2446.field2485[var1.field2464] < 0) {
               var1.field2463.method2675(-1);
            }

            var11.method2692(var9);
            var11.vmethod3966(var2, var3, var5 - var3);
            if(var11.method2658()) {
               this.field2493.method2385(var11);
            }
         }
      }

      var1.field2463.vmethod3966(var2, var3, var4);
   }

   protected class124 vmethod3962() {
      class208 var1 = (class208)this.field2492.method4931();
      return (class124)(var1 == null?null:(var1.field2463 != null?var1.field2463:this.vmethod3964()));
   }

   protected int vmethod3963() {
      return 0;
   }

   static void method3983(int var0) {
      client.field766 = 1L;
      class207.field2434.field620 = 0;
      class62.field502 = true;
      client.field694 = true;
      client.field904 = -1L;
      class25.method277(-1853542199);
      client.field761.method2345(-149406559);
      client.field761.field1337.field3710 = 0;
      client.field761.field1332 = null;
      client.field761.field1334 = null;
      client.field761.field1329 = null;
      client.field761.field1339 = null;
      client.field761.field1333 = 0;
      client.field761.field1338 = 0;
      client.field917 = 0;
      client.field802 = 0;
      client.field889 = 0;
      class214.method4002(1652066276);
      class191.method3666(0, -1241742248);
      class85.method2098(1189048729);
      client.field833 = 0;
      client.field835 = false;
      client.field936 = 0;
      client.field909 = 0;
      client.field754 = 0;
      class31.field222 = null;
      client.field912 = 0;
      client.field695 = -1;
      client.field910 = 0;
      client.field911 = 0;
      client.field705 = class93.field1185;
      client.field706 = class93.field1185;
      client.field722 = 0;
      class75.method1383(-389992863);

      int var1;
      for(var1 = 0; var1 < 2048; ++var1) {
         client.players[var1] = null;
      }

      for(var1 = 0; var1 < '\u8000'; ++var1) {
         client.field721[var1] = null;
      }

      client.field807 = -1;
      client.field810.method4925();
      client.field811.method4925();

      for(var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < 104; ++var2) {
            for(int var3 = 0; var3 < 104; ++var3) {
               client.field808[var1][var2][var3] = null;
            }
         }
      }

      client.field697 = new class271();
      class95.field1252.method1996(-589542332);

      for(var1 = 0; var1 < class250.field3204; ++var1) {
         class250 var4 = class228.method4179(var1, (byte)2);
         if(var4 != null) {
            class221.field2524[var1] = 0;
            class221.field2526[var1] = 0;
         }
      }

      class160.field1983.method2245(1883661666);
      client.field840 = -1;
      if(client.field924 != -1) {
         class261.method4590(client.field924, -530273467);
      }

      for(class70 var5 = (class70)client.field841.method5995(); var5 != null; var5 = (class70)client.field841.method6003()) {
         class41.method653(var5, true, 7200706);
      }

      client.field924 = -1;
      client.field841 = new class327(8);
      client.field882 = null;
      class214.method4002(1478095138);
      client.field944.method4080((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1, 522059742);

      for(var1 = 0; var1 < 8; ++var1) {
         client.field804[var1] = null;
         client.field805[var1] = false;
      }

      class68.field570 = new class327(32);
      client.field701 = true;

      for(var1 = 0; var1 < 100; ++var1) {
         client.field679[var1] = true;
      }

      class196 var6 = class146.method3363(class192.field2257, client.field761.field1340, -1841052897);
      var6.field2338.method5531(class74.method1327(2146557474), 1258821856);
      var6.field2338.method5532(class37.field277, (byte)-19);
      var6.field2338.method5532(class221.field2525, (byte)-47);
      client.field761.method2361(var6, 1287850145);
      class70.field596 = null;

      for(var1 = 0; var1 < 8; ++var1) {
         client.field948[var1] = new class18();
      }

      class16.field84 = null;
   }
}
