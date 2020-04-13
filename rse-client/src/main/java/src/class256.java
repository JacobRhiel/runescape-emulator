package src;

public class class256 extends class184 {

   public static class154 field3279 = new class154(64);
   public static class154 field3274 = new class154(64);
   public static class243 field3273;
   int field3280 = -1;
   int field3282 = -1;
   public int field3277 = 255;
   public int field3283 = -1;
   public int field3278 = 255;
   public int field3275 = 70;
   public int field3272 = 1;
   public int field3276;
   public int field3284 = 30;
   public int field3285 = 0;


   void method4522(class309 var1, int var2, int var3) {
      if(var2 == 1) {
         var1.writeShort((byte)126);
      } else if(var2 == 2) {
         this.field3277 = var1.readUnsignedByte((byte)63);
      } else if(var2 == 3) {
         this.field3278 = var1.readUnsignedByte((byte)42);
      } else if(var2 == 4) {
         this.field3283 = 0;
      } else if(var2 == 5) {
         this.field3275 = var1.writeShort((byte)58);
      } else if(var2 == 6) {
         var1.readUnsignedByte((byte)50);
      } else if(var2 == 7) {
         this.field3282 = var1.method5564((byte)118);
      } else if(var2 == 8) {
         this.field3280 = var1.method5564((byte)-71);
      } else if(var2 == 11) {
         this.field3283 = var1.writeShort((byte)83);
      } else if(var2 == 14) {
         this.field3284 = var1.readUnsignedByte((byte)17);
      } else if(var2 == 15) {
         this.field3285 = var1.readUnsignedByte((byte)118);
      }

   }

   public void method4521(class309 var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)85);
         if(var3 == 0) {
            return;
         }

         this.method4522(var1, var3, 1931441853);
      }
   }

   public class334 method4524(int var1) {
      if(this.field3280 < 0) {
         return null;
      } else {
         class334 var2 = (class334)field3274.method3418((long)this.field3280);
         if(var2 != null) {
            return var2;
         } else {
            var2 = class205.method3752(class323.field3836, this.field3280, 0, 273345835);
            if(var2 != null) {
               field3274.method3424(var2, (long)this.field3280);
            }

            return var2;
         }
      }
   }

   public class334 method4523(short var1) {
      if(this.field3282 < 0) {
         return null;
      } else {
         class334 var2 = (class334)field3274.method3418((long)this.field3282);
         if(var2 != null) {
            return var2;
         } else {
            var2 = class205.method3752(class323.field3836, this.field3282, 0, 273345835);
            if(var2 != null) {
               field3274.method3424(var2, (long)this.field3282);
            }

            return var2;
         }
      }
   }

   public static int method4533(CharSequence var0, int var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + class175.method3559(var0.charAt(var4), (byte)72);
      }

      return var3;
   }
}
