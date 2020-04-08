package src;

public class class253 extends class184 {

   public static class154 field3239 = new class154(30);
   public static class154 field3242 = new class154(64);
   public static class243 field3236;
   public static class243 field3244;
   int field3240;
   public int field3243 = -1;
   int field3241;
   int field3247 = 128;
   int field3249 = 128;
   int field3238 = 0;
   int field3250 = 0;
   int field3251 = 0;
   short[] field3248;
   short[] field3245;
   short[] field3246;
   short[] field3237;


   void method4468(class309 var1, int var2, byte var3) {
      if(var2 == 1) {
         this.field3241 = var1.readShort((byte)103);
      } else if(var2 == 2) {
         this.field3243 = var1.readShort((byte)110);
      } else if(var2 == 4) {
         this.field3247 = var1.readShort((byte)21);
      } else if(var2 == 5) {
         this.field3249 = var1.readShort((byte)116);
      } else if(var2 == 6) {
         this.field3238 = var1.readShort((byte)59);
      } else if(var2 == 7) {
         this.field3250 = var1.readUnsignedByte((byte)90);
      } else if(var2 == 8) {
         this.field3251 = var1.readUnsignedByte((byte)15);
      } else {
         int var4;
         int var5;
         if(var2 == 40) {
            var4 = var1.readUnsignedByte((byte)56);
            this.field3248 = new short[var4];
            this.field3246 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3248[var5] = (short)var1.readShort((byte)4);
               this.field3246[var5] = (short)var1.readShort((byte)67);
            }
         } else if(var2 == 41) {
            var4 = var1.readUnsignedByte((byte)36);
            this.field3245 = new short[var4];
            this.field3237 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3245[var5] = (short)var1.readShort((byte)85);
               this.field3237[var5] = (short)var1.readShort((byte)126);
            }
         }
      }

   }

   public final class136 method4467(int var1, int var2) {
      class136 var3 = (class136)field3239.method3418((long)this.field3240);
      if(var3 == null) {
         class130 var4 = class130.method2865(field3236, this.field3241, 0);
         if(var4 == null) {
            return null;
         }

         int var5;
         if(this.field3248 != null) {
            for(var5 = 0; var5 < this.field3248.length; ++var5) {
               var4.method2879(this.field3248[var5], this.field3246[var5]);
            }
         }

         if(this.field3245 != null) {
            for(var5 = 0; var5 < this.field3245.length; ++var5) {
               var4.method2931(this.field3245[var5], this.field3237[var5]);
            }
         }

         var3 = var4.method2886(this.field3250 + 64, this.field3251 + 850, -30, -50, -30);
         field3239.method3424(var3, (long)this.field3240);
      }

      class136 var6;
      if(this.field3243 != -1 && var1 != -1) {
         var6 = method4478(this.field3243, 1482102407).method4819(var3, var1, (byte)66);
      } else {
         var6 = var3.method3013(true);
      }

      if(this.field3247 != 128 || this.field3249 != 128) {
         var6.method2967(this.field3247, this.field3249, this.field3247);
      }

      if(this.field3238 != 0) {
         if(this.field3238 == 90) {
            var6.method2969();
         }

         if(this.field3238 == 180) {
            var6.method2969();
            var6.method2969();
         }

         if(this.field3238 == 270) {
            var6.method2969();
            var6.method2969();
            var6.method2969();
         }
      }

      return var6;
   }

   void method4470(class309 var1, byte var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)104);
         if(var3 == 0) {
            return;
         }

         this.method4468(var1, var3, (byte)0);
      }
   }

   public static class268 method4478(int var0, int var1) {
      class268 var2 = (class268)class268.field3528.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class99.field1288.method4224(12, var0, (byte)-51);
         var2 = new class268();
         if(var3 != null) {
            var2.method4817(new class309(var3), -1859351730);
         }

         var2.method4847((byte)-18);
         class268.field3528.method3424(var2, (long)var0);
         return var2;
      }
   }
}
