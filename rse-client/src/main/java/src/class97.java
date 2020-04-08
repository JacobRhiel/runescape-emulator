package src;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class97 {

   static class177 field1262;
   static class245 field1263;
   Future field1259;
   ExecutorService field1264 = Executors.newSingleThreadExecutor();


   class97() {
      this.field1259 = this.field1264.submit(new class66());
   }

   boolean method2203(byte var1) {
      return this.field1259.isDone();
   }

   SecureRandom method2204(int var1) {
      try {
         return (SecureRandom)this.field1259.get();
      } catch (Exception var5) {
         SecureRandom var4 = new SecureRandom();
         var4.nextInt();
         return var4;
      }
   }

   void method2206(byte var1) {
      this.field1264.shutdown();
      this.field1264 = null;
   }

   public static int method2212(int var0, int var1, int var2) {
      int var3;
      for(var3 = 1; var1 > 1; var1 >>= 1) {
         if((var1 & 1) != 0) {
            var3 = var0 * var3;
         }

         var0 *= var0;
      }

      if(var1 == 1) {
         return var0 * var3;
      } else {
         return var3;
      }
   }

   public static final class334 method2213(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      if(var1 == -1) {
         var4 = 0;
      } else if(var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var7 = ((long)var3 << 42) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40);
      class334 var9;
      if(!var5) {
         var9 = (class334)class264.field3416.method3418(var7);
         if(var9 != null) {
            return var9;
         }
      }

      class264 var10 = class30.method373(var0, (byte)-21);
      if(var1 > 1 && var10.field3435 != null) {
         int var11 = -1;

         for(int var12 = 0; var12 < 10; ++var12) {
            if(var1 >= var10.field3436[var12] && var10.field3436[var12] != 0) {
               var11 = var10.field3435[var12];
            }
         }

         if(var11 != -1) {
            var10 = class30.method373(var11, (byte)-87);
         }
      }

      class136 var20 = var10.method4696(1, (byte)-96);
      if(var20 == null) {
         return null;
      } else {
         class334 var21 = null;
         if(var10.field3440 != -1) {
            var21 = method2213(var10.field3437, 10, 1, 0, 0, true, -831710129);
            if(var21 == null) {
               return null;
            }
         } else if(var10.field3400 != -1) {
            var21 = method2213(var10.field3447, var1, var2, var3, 0, false, -218097637);
            if(var21 == null) {
               return null;
            }
         } else if(var10.field3450 != -1) {
            var21 = method2213(var10.field3449, var1, 0, 0, 0, false, -676707428);
            if(var21 == null) {
               return null;
            }
         }

         int[] var13 = class330.field3864;
         int var14 = class330.field3865;
         int var15 = class330.field3863;
         int[] var16 = new int[4];
         class330.method6047(var16);
         var9 = new class334(36, 32);
         class330.method6043(var9.field3896, 36, 32);
         class330.method6049();
         class139.method3133();
         class139.method3085(16, 16);
         class139.field1772 = false;
         if(var10.field3450 != -1) {
            var21.method6187(0, 0);
         }

         int var17 = var10.field3410;
         if(var5) {
            var17 = (int)(1.5D * (double)var17);
         } else if(var2 == 2) {
            var17 = (int)((double)var17 * 1.04D);
         }

         int var18 = var17 * class139.field1794[var10.field3411] >> 16;
         int var19 = var17 * class139.field1795[var10.field3411] >> 16;
         var20.method2955();
         var20.method2968(0, var10.field3429, var10.field3413, var10.field3411, var10.field3414, var20.field1883 / 2 + var18 + var10.field3445, var19 + var10.field3445);
         if(var10.field3400 != -1) {
            var21.method6187(0, 0);
         }

         if(var2 >= 1) {
            var9.method6269(1);
         }

         if(var2 >= 2) {
            var9.method6269(16777215);
         }

         if(var3 != 0) {
            var9.method6184(var3);
         }

         class330.method6043(var9.field3896, 36, 32);
         if(var10.field3440 != -1) {
            var21.method6187(0, 0);
         }

         if(var4 == 1 || var4 == 2 && var10.field3418 == 1) {
            class51.field403.method5389(class76.method1385(var1, (byte)120), 0, 9, 16776960, 1);
         }

         if(!var5) {
            class264.field3416.method3424(var9, var7);
         }

         class330.method6043(var13, var14, var15);
         class330.method6048(var16);
         class139.method3133();
         class139.field1772 = true;
         return var9;
      }
   }
}
