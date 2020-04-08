package src;

public class class254 extends class184 {

   public static class154 field3258 = new class154(64);
   public static class243 field3257;
   int field3254 = 0;
   public int field3256;
   public int field3252;
   public int field3253;
   public int field3255;


   void method4482(int var1, int var2) {
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
      if(var11 != var9) {
         if(var17 < 0.5D) {
            var15 = (var11 - var9) / (var11 + var9);
         }

         if(var17 >= 0.5D) {
            var15 = (var11 - var9) / (2.0D - var11 - var9);
         }

         if(var3 == var11) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if(var11 == var5) {
            var13 = (var7 - var3) / (var11 - var9) + 2.0D;
         } else if(var11 == var7) {
            var13 = 4.0D + (var3 - var5) / (var11 - var9);
         }
      }

      var13 /= 6.0D;
      this.field3256 = (int)(256.0D * var15);
      this.field3252 = (int)(var17 * 256.0D);
      if(this.field3256 < 0) {
         this.field3256 = 0;
      } else if(this.field3256 > 255) {
         this.field3256 = 255;
      }

      if(this.field3252 < 0) {
         this.field3252 = 0;
      } else if(this.field3252 > 255) {
         this.field3252 = 255;
      }

      if(var17 > 0.5D) {
         this.field3253 = (int)((1.0D - var17) * var15 * 512.0D);
      } else {
         this.field3253 = (int)(512.0D * var17 * var15);
      }

      if(this.field3253 < 1) {
         this.field3253 = 1;
      }

      this.field3255 = (int)(var13 * (double)this.field3253);
   }

   void method4481(class309 var1, int var2, int var3, int var4) {
      if(var2 == 1) {
         this.field3254 = var1.method5674((short)3112);
      }

   }

   void method4479(int var1) {
      this.method4482(this.field3254, 2124532512);
   }

   void method4491(class309 var1, int var2, int var3) {
      while(true) {
         int var4 = var1.readUnsignedByte((byte)99);
         if(var4 == 0) {
            return;
         }

         this.method4481(var1, var4, var2, -1237610564);
      }
   }

   public static class334[] method4483(class243 var0, String var1, String var2, int var3) {
      int var4 = var0.method4240(var1, (short)-21319);
      int var5 = var0.method4233(var4, var2, 1342461508);
      return class192.method3670(var0, var4, var5, (byte)25);
   }
}
