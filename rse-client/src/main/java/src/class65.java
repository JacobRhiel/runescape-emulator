package src;

public class class65 {

   int field558 = -1;
   class101 field557;
   int[] field559;
   String[] field560;


   static final void method1244(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      if(!client.field816) {
         if(client.field693 < 500) {
            client.field822[client.field693] = var0;
            client.field823[client.field693] = var1;
            client.field779[client.field693] = var2;
            client.field858[client.field693] = var3;
            client.field776[client.field693] = var4;
            client.field856[client.field693] = var5;
            client.field809[client.field693] = var6;
            ++client.field693;
         }

      }
   }

   static final void method1243(int var0, int var1, int var2, int var3, int var4, byte var5) {
      long var6 = class14.field60.method3189(var0, var1, var2);
      int var8;
      int var9;
      int var10;
      int var11;
      int var13;
      int var14;
      if(var6 != 0L) {
         var8 = class14.field60.method3193(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = var3;
         if(class121.method2621(var6)) {
            var11 = var4;
         }

         int[] var12 = class317.field3790.field3896;
         var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var14 = class31.method387(var6);
         class263 var15 = class33.method435(var14, 1650295452);
         if(var15.field3391 != -1) {
            class333 var16 = class169.field2009[var15.field3391];
            if(var16 != null) {
               int var17 = (var15.field3359 * 4 - var16.field3883) / 2;
               int var18 = (var15.field3360 * 4 - var16.field3885) / 2;
               var16.method6173(var1 * 4 + var17 + 48, (104 - var2 - var15.field3360) * 4 + var18 + 48);
            }
         } else {
            if(var10 == 0 || var10 == 2) {
               if(var9 == 0) {
                  var12[var13] = var11;
                  var12[var13 + 512] = var11;
                  var12[var13 + 1024] = var11;
                  var12[var13 + 1536] = var11;
               } else if(var9 == 1) {
                  var12[var13] = var11;
                  var12[var13 + 1] = var11;
                  var12[var13 + 2] = var11;
                  var12[var13 + 3] = var11;
               } else if(var9 == 2) {
                  var12[var13 + 3] = var11;
                  var12[var13 + 512 + 3] = var11;
                  var12[var13 + 1024 + 3] = var11;
                  var12[var13 + 1536 + 3] = var11;
               } else if(var9 == 3) {
                  var12[var13 + 1536] = var11;
                  var12[var13 + 1536 + 1] = var11;
                  var12[var13 + 1536 + 2] = var11;
                  var12[var13 + 1536 + 3] = var11;
               }
            }

            if(var10 == 3) {
               if(var9 == 0) {
                  var12[var13] = var11;
               } else if(var9 == 1) {
                  var12[var13 + 3] = var11;
               } else if(var9 == 2) {
                  var12[var13 + 1536 + 3] = var11;
               } else if(var9 == 3) {
                  var12[var13 + 1536] = var11;
               }
            }

            if(var10 == 2) {
               if(var9 == 3) {
                  var12[var13] = var11;
                  var12[var13 + 512] = var11;
                  var12[var13 + 1024] = var11;
                  var12[var13 + 1536] = var11;
               } else if(var9 == 0) {
                  var12[var13] = var11;
                  var12[var13 + 1] = var11;
                  var12[var13 + 2] = var11;
                  var12[var13 + 3] = var11;
               } else if(var9 == 1) {
                  var12[var13 + 3] = var11;
                  var12[var13 + 512 + 3] = var11;
                  var12[var13 + 1024 + 3] = var11;
                  var12[var13 + 1536 + 3] = var11;
               } else if(var9 == 2) {
                  var12[var13 + 1536] = var11;
                  var12[var13 + 1536 + 1] = var11;
                  var12[var13 + 1536 + 2] = var11;
                  var12[var13 + 1536 + 3] = var11;
               }
            }
         }
      }

      var6 = class14.field60.method3191(var0, var1, var2);
      if(var6 != 0L) {
         var8 = class14.field60.method3193(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = class31.method387(var6);
         class263 var25 = class33.method435(var11, 1650295452);
         int var20;
         if(var25.field3391 != -1) {
            class333 var19 = class169.field2009[var25.field3391];
            if(var19 != null) {
               var14 = (var25.field3359 * 4 - var19.field3883) / 2;
               var20 = (var25.field3360 * 4 - var19.field3885) / 2;
               var19.method6173(var14 + var1 * 4 + 48, var20 + (104 - var2 - var25.field3360) * 4 + 48);
            }
         } else if(var10 == 9) {
            var13 = 15658734;
            if(class121.method2621(var6)) {
               var13 = 15597568;
            }

            int[] var24 = class317.field3790.field3896;
            var20 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if(var9 != 0 && var9 != 2) {
               var24[var20] = var13;
               var24[var20 + 1 + 512] = var13;
               var24[var20 + 1024 + 2] = var13;
               var24[var20 + 1536 + 3] = var13;
            } else {
               var24[var20 + 1536] = var13;
               var24[var20 + 1 + 1024] = var13;
               var24[var20 + 512 + 2] = var13;
               var24[var20 + 3] = var13;
            }
         }
      }

      var6 = class14.field60.method3309(var0, var1, var2);
      if(0L != var6) {
         var8 = class31.method387(var6);
         class263 var21 = class33.method435(var8, 1650295452);
         if(var21.field3391 != -1) {
            class333 var22 = class169.field2009[var21.field3391];
            if(var22 != null) {
               var11 = (var21.field3359 * 4 - var22.field3883) / 2;
               int var23 = (var21.field3360 * 4 - var22.field3885) / 2;
               var22.method6173(var11 + var1 * 4 + 48, (104 - var2 - var21.field3360) * 4 + var23 + 48);
            }
         }
      }

   }

   static final void method1241(int var0) {
      for(class77 var1 = (class77)client.field697.method4931(); var1 != null; var1 = (class77)client.field697.method4949()) {
         if(var1.field969 == -1) {
            var1.field965 = 0;
            class29.method348(var1, (byte)80);
         } else {
            var1.method3657();
         }
      }

   }

   static void method1242(int var0, int var1) {
      class68 var2 = (class68)class68.field570.method6010((long)var0);
      if(var2 != null) {
         var2.method3657();
      }
   }
}
