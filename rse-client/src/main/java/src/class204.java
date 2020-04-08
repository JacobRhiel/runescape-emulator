package src;

import java.util.HashMap;

public class class204 {

   static {
      new HashMap();
   }

   static final void method3751(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      if(var2 < 1) {
         var2 = 1;
      }

      if(var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      int var7;
      if(var6 < 0) {
         var7 = client.field931;
      } else if(var6 >= 100) {
         var7 = client.field932;
      } else {
         var7 = (client.field932 - client.field931) * var6 / 100 + client.field931;
      }

      int var8 = var3 * var7 * 512 / (var2 * 334);
      int var9;
      int var10;
      short var11;
      if(var8 < client.field937) {
         var11 = client.field937;
         var7 = var11 * var2 * 334 / (var3 * 512);
         if(var7 > client.field748) {
            var7 = client.field748;
            var9 = var3 * var7 * 512 / (var11 * 334);
            var10 = (var2 - var9) / 2;
            if(var4) {
               class330.method6044();
               class330.method6052(var0, var1, var10, var3, -16777216);
               class330.method6052(var0 + var2 - var10, var1, var10, var3, -16777216);
            }

            var0 += var10;
            var2 -= var10 * 2;
         }
      } else if(var8 > client.field938) {
         var11 = client.field938;
         var7 = var11 * var2 * 334 / (var3 * 512);
         if(var7 < client.field935) {
            var7 = client.field935;
            var9 = var11 * var2 * 334 / (var7 * 512);
            var10 = (var3 - var9) / 2;
            if(var4) {
               class330.method6044();
               class330.method6052(var0, var1, var2, var10, -16777216);
               class330.method6052(var0, var3 + var1 - var10, var2, var10, -16777216);
            }

            var1 += var10;
            var3 -= var10 * 2;
         }
      }

      client.field943 = var3 * var7 / 334;
      if(var2 != client.field820 || var3 != client.field942) {
         class76.method1396(var2, var3, -90506590);
      }

      client.field905 = var0;
      client.field940 = var1;
      client.field820 = var2;
      client.field942 = var3;
   }
}
