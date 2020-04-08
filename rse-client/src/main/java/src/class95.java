package src;

public final class class95 extends class144 {

   public static class83 field1252;
   int field1250;
   boolean field1238 = false;
   int field1229;
   int field1234;
   double field1240;
   double field1242;
   int field1237 = 0;
   int field1243;
   int field1251 = 0;
   int field1248;
   double field1239;
   double field1245;
   int field1236;
   int field1227;
   double field1241;
   double field1249;
   double field1246;
   int field1231;
   int field1235;
   double field1244;
   int field1230;
   int field1228;
   int field1232;
   int field1247;
   class268 field1233;


   class95(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field1250 = var1;
      this.field1227 = var2;
      this.field1229 = var3;
      this.field1243 = var4;
      this.field1231 = var5;
      this.field1235 = var6;
      this.field1234 = var7;
      this.field1230 = var8;
      this.field1236 = var9;
      this.field1228 = var10;
      this.field1232 = var11;
      this.field1238 = false;
      int var12 = class63.method1205(this.field1250, 256464241).field3243;
      if(var12 != -1) {
         this.field1233 = class253.method4478(var12, 1462910480);
      } else {
         this.field1233 = null;
      }

   }

   protected final class136 vmethod3353(int var1) {
      class253 var2 = class63.method1205(this.field1250, 860096285);
      class136 var3 = var2.method4467(this.field1237, -1167676580);
      if(var3 == null) {
         return null;
      } else {
         var3.method2965(this.field1248);
         return var3;
      }
   }

   final void method2194(int var1, int var2) {
      this.field1238 = true;
      this.field1240 += (double)var1 * this.field1242;
      this.field1239 += (double)var1 * this.field1245;
      this.field1241 += (double)var1 * this.field1249 + 0.5D * this.field1246 * (double)var1 * (double)var1;
      this.field1249 += (double)var1 * this.field1246;
      this.field1247 = (int)(Math.atan2(this.field1242, this.field1245) * 325.949D) + 1024 & 2047;
      this.field1248 = (int)(Math.atan2(this.field1249, this.field1244) * 325.949D) & 2047;
      if(this.field1233 != null) {
         this.field1251 += var1;

         while(this.field1251 > this.field1233.field3514[this.field1237]) {
            this.field1251 -= this.field1233.field3514[this.field1237];
            ++this.field1237;
            if(this.field1237 >= this.field1233.field3513.length) {
               this.field1237 -= this.field1233.field3516;
               if(this.field1237 < 0 || this.field1237 >= this.field1233.field3513.length) {
                  this.field1237 = 0;
               }
            }
         }
      }

   }

   final void method2196(int var1, int var2, int var3, int var4, int var5) {
      double var6;
      if(!this.field1238) {
         var6 = (double)(var1 - this.field1229);
         double var8 = (double)(var2 - this.field1243);
         double var10 = Math.sqrt(var6 * var6 + var8 * var8);
         this.field1240 = (double)this.field1229 + var6 * (double)this.field1236 / var10;
         this.field1239 = (double)this.field1236 * var8 / var10 + (double)this.field1243;
         this.field1241 = (double)this.field1231;
      }

      var6 = (double)(this.field1234 + 1 - var4);
      this.field1242 = ((double)var1 - this.field1240) / var6;
      this.field1245 = ((double)var2 - this.field1239) / var6;
      this.field1244 = Math.sqrt(this.field1245 * this.field1245 + this.field1242 * this.field1242);
      if(!this.field1238) {
         this.field1249 = -this.field1244 * Math.tan(0.02454369D * (double)this.field1230);
      }

      this.field1246 = ((double)var3 - this.field1241 - var6 * this.field1249) * 2.0D / (var6 * var6);
   }

   public static int method2197(int var0, int var1) {
      class258 var3 = (class258)class258.field3288.method3418((long)var0);
      class258 var2;
      if(var3 != null) {
         var2 = var3;
      } else {
         byte[] var8 = class258.field3291.method4224(14, var0, (byte)-79);
         var3 = new class258();
         if(var8 != null) {
            var3.method4536(new class309(var8), (byte)113);
         }

         class258.field3288.method3424(var3, (long)var0);
         var2 = var3;
      }

      int var4 = var2.field3293;
      int var5 = var2.field3290;
      int var6 = var2.field3287;
      int var7 = class221.field2523[var6 - var5];
      return class221.field2526[var4] >> var5 & var7;
   }
}
