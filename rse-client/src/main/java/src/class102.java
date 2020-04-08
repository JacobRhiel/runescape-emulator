package src;

public class class102 extends class144 {

   class268 field1317;
   int field1313;
   int field1316;
   int field1310;
   int field1309;
   int field1312;
   int field1314;
   int field1315;
   int field1311;


   class102(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class144 var9) {
      this.field1313 = var1;
      this.field1310 = var2;
      this.field1309 = var3;
      this.field1312 = var4;
      this.field1315 = var5;
      this.field1311 = var6;
      if(var7 != -1) {
         this.field1317 = class253.method4478(var7, 1754491081);
         this.field1314 = 0;
         this.field1316 = client.field689 - 1;
         if(this.field1317.field3525 == 0 && var9 != null && var9 instanceof class102) {
            class102 var10 = (class102)var9;
            if(this.field1317 == var10.field1317) {
               this.field1314 = var10.field1314;
               this.field1316 = var10.field1316;
               return;
            }
         }

         if(var8 && this.field1317.field3516 != -1) {
            this.field1314 = (int)(Math.random() * (double)this.field1317.field3513.length);
            this.field1316 -= (int)(Math.random() * (double)this.field1317.field3514[this.field1314]);
         }
      }

   }

   protected final class136 vmethod3353(int var1) {
      if(this.field1317 != null) {
         int var2 = client.field689 - this.field1316;
         if(var2 > 100 && this.field1317.field3516 > 0) {
            var2 = 100;
         }

         while(var2 > this.field1317.field3514[this.field1314]) {
            var2 -= this.field1317.field3514[this.field1314];
            ++this.field1314;
            if(this.field1314 >= this.field1317.field3513.length) {
               this.field1314 -= this.field1317.field3516;
               if(this.field1314 < 0 || this.field1314 >= this.field1317.field3513.length) {
                  this.field1317 = null;
                  break;
               }
            }
         }

         this.field1316 = client.field689 - var2;
      }

      class263 var13 = class33.method435(this.field1313, 1650295452);
      if(var13.field3385 != null) {
         var13 = var13.method4645((short)128);
      }

      if(var13 == null) {
         return null;
      } else {
         int var3;
         int var4;
         if(this.field1309 != 1 && this.field1309 != 3) {
            var3 = var13.field3359;
            var4 = var13.field3360;
         } else {
            var3 = var13.field3360;
            var4 = var13.field3359;
         }

         int var5 = (var3 >> 1) + this.field1315;
         int var6 = (var3 + 1 >> 1) + this.field1315;
         int var7 = (var4 >> 1) + this.field1311;
         int var8 = (var4 + 1 >> 1) + this.field1311;
         int[][] var9 = class64.field549[this.field1312];
         int var10 = var9[var5][var8] + var9[var6][var7] + var9[var5][var7] + var9[var6][var8] >> 2;
         int var11 = (this.field1315 << 7) + (var3 << 6);
         int var12 = (this.field1311 << 7) + (var4 << 6);
         return var13.method4641(this.field1310, this.field1309, var9, var11, var10, var12, this.field1317, this.field1314, (short)255);
      }
   }

   static void method2328(int var0, class317 var1, class245 var2, int var3) {
      byte[] var4 = null;
      class271 var5 = class244.field3149;
      synchronized(class244.field3149) {
         class241 var6 = (class241)class244.field3149.method4931();

         while(var6 != null) {
            if(var6.field2116 != (long)var0 || var1 != var6.field3114 || var6.field3117 != 0) {
               var6 = (class241)class244.field3149.method4949();
            } else {
               var4 = var6.field3113;
               break;
            }
         }
      }

      if(var4 != null) {
         var2.method4349(var1, var0, var4, true, -1520393568);
      } else {
         byte[] var9 = var1.method5897(var0, -834446601);
         var2.method4349(var1, var0, var9, true, -2134355963);
      }
   }
}
