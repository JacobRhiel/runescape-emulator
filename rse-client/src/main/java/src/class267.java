package src;

public class class267 extends class184 {

   static class154 field3498 = new class154(64);
   public static class243 field3504;
   public int field3508 = -1;
   public int field3497 = 0;
   public boolean field3501 = true;
   public int field3509 = -1;
   public int field3502;
   public int field3506;
   public int field3503;
   public int field3507;
   public int field3505;
   public int field3500;


   void method4805(class309 var1, int var2, int var3, byte var4) {
      if(var2 == 1) {
         this.field3497 = var1.method5674((short)3112);
      } else if(var2 == 2) {
         this.field3509 = var1.readUnsignedByte((byte)48);
      } else if(var2 == 5) {
         this.field3501 = false;
      } else if(var2 == 7) {
         this.field3508 = var1.method5674((short)3112);
      } else if(var2 == 8) {
         ;
      }

   }

   void method4807(int var1, int var2) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0D;
      double var5 = (double)(var1 >> 8 & 255) / 256.0D;
      double var7 = (double)(var1 & 255) / 256.0D;
      double var9 = var3;
      if(var5 < var3) {
         var9 = var5;
      }

      if(var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if(var5 > var3) {
         var11 = var5;
      }

      if(var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0D;
      double var15 = 0.0D;
      double var17 = (var11 + var9) / 2.0D;
      if(var9 != var11) {
         if(var17 < 0.5D) {
            var15 = (var11 - var9) / (var9 + var11);
         }

         if(var17 >= 0.5D) {
            var15 = (var11 - var9) / (2.0D - var11 - var9);
         }

         if(var3 == var11) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if(var5 == var11) {
            var13 = (var7 - var3) / (var11 - var9) + 2.0D;
         } else if(var11 == var7) {
            var13 = (var3 - var5) / (var11 - var9) + 4.0D;
         }
      }

      var13 /= 6.0D;
      this.field3502 = (int)(var13 * 256.0D);
      this.field3503 = (int)(var15 * 256.0D);
      this.field3505 = (int)(256.0D * var17);
      if(this.field3503 < 0) {
         this.field3503 = 0;
      } else if(this.field3503 > 255) {
         this.field3503 = 255;
      }

      if(this.field3505 < 0) {
         this.field3505 = 0;
      } else if(this.field3505 > 255) {
         this.field3505 = 255;
      }

   }

   void method4798(int var1) {
      if(this.field3508 != -1) {
         this.method4807(this.field3508, -726592820);
         this.field3506 = this.field3502;
         this.field3507 = this.field3503;
         this.field3500 = this.field3505;
      }

      this.method4807(this.field3497, -1065210023);
   }

   void method4799(class309 var1, int var2, int var3) {
      while(true) {
         int var4 = var1.readUnsignedByte((byte)40);
         if(var4 == 0) {
            return;
         }

         this.method4805(var1, var4, var2, (byte)109);
      }
   }

   public static class260 method4801(int var0, byte var1) {
      class260 var2 = (class260)class260.field3303.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class260.field3305.method4224(34, var0, (byte)-121);
         var2 = new class260();
         if(var3 != null) {
            var2.method4563(new class309(var3), (byte)-61);
         }

         var2.method4585(1990105365);
         class260.field3303.method3424(var2, (long)var0);
         return var2;
      }
   }
}
