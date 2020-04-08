package src;

public class class255 extends class184 {

   public static int field3260;
   static class154 field3262 = new class154(64);
   static class243 field3266;
   static class243 field3268;
   static int field3271;
   int[] field3264;
   int[] field3269 = new int[]{-1, -1, -1, -1, -1};
   public int field3263 = -1;
   short[] field3267;
   public boolean field3270 = false;
   short[] field3259;
   short[] field3265;
   short[] field3261;


   void method4496(class309 var1, int var2, byte var3) {
      if(var2 == 1) {
         this.field3263 = var1.readUnsignedByte((byte)28);
      } else {
         int var4;
         int var5;
         if(var2 == 2) {
            var4 = var1.readUnsignedByte((byte)111);
            this.field3264 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3264[var5] = var1.readShort((byte)76);
            }
         } else if(var2 == 3) {
            this.field3270 = true;
         } else if(var2 == 40) {
            var4 = var1.readUnsignedByte((byte)27);
            this.field3267 = new short[var4];
            this.field3265 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3267[var5] = (short)var1.readShort((byte)91);
               this.field3265[var5] = (short)var1.readShort((byte)37);
            }
         } else if(var2 == 41) {
            var4 = var1.readUnsignedByte((byte)40);
            this.field3259 = new short[var4];
            this.field3261 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3259[var5] = (short)var1.readShort((byte)118);
               this.field3261[var5] = (short)var1.readShort((byte)80);
            }
         } else if(var2 >= 60 && var2 < 70) {
            this.field3269[var2 - 60] = var1.readShort((byte)126);
         }
      }

   }

   public boolean method4499(int var1) {
      boolean var2 = true;

      for(int var3 = 0; var3 < 5; ++var3) {
         if(this.field3269[var3] != -1 && !field3266.method4238(this.field3269[var3], 0, 1895108732)) {
            var2 = false;
         }
      }

      return var2;
   }

   public class130 method4500(int var1) {
      class130[] var2 = new class130[5];
      int var3 = 0;

      for(int var4 = 0; var4 < 5; ++var4) {
         if(this.field3269[var4] != -1) {
            var2[var3++] = class130.method2865(field3266, this.field3269[var4], 0);
         }
      }

      class130 var6 = new class130(var2, var3);
      int var5;
      if(this.field3267 != null) {
         for(var5 = 0; var5 < this.field3267.length; ++var5) {
            var6.method2879(this.field3267[var5], this.field3265[var5]);
         }
      }

      if(this.field3259 != null) {
         for(var5 = 0; var5 < this.field3259.length; ++var5) {
            var6.method2931(this.field3259[var5], this.field3261[var5]);
         }
      }

      return var6;
   }

   public boolean method4497(byte var1) {
      if(this.field3264 == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field3264.length; ++var3) {
            if(!field3266.method4238(this.field3264[var3], 0, 2009402639)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   void method4495(class309 var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)62);
         if(var3 == 0) {
            return;
         }

         this.method4496(var1, var3, (byte)53);
      }
   }

   public class130 method4498(int var1) {
      if(this.field3264 == null) {
         return null;
      } else {
         class130[] var2 = new class130[this.field3264.length];

         for(int var3 = 0; var3 < this.field3264.length; ++var3) {
            var2[var3] = class130.method2865(field3266, this.field3264[var3], 0);
         }

         class130 var5;
         if(var2.length == 1) {
            var5 = var2[0];
         } else {
            var5 = new class130(var2, var2.length);
         }

         int var4;
         if(this.field3267 != null) {
            for(var4 = 0; var4 < this.field3267.length; ++var4) {
               var5.method2879(this.field3267[var4], this.field3265[var4]);
            }
         }

         if(this.field3259 != null) {
            for(var4 = 0; var4 < this.field3259.length; ++var4) {
               var5.method2931(this.field3259[var4], this.field3261[var4]);
            }
         }

         return var5;
      }
   }

   static class226 method4514(class226 var0, byte var1) {
      class226 var2 = class17.method181(var0, (byte)-101);
      if(var2 == null) {
         var2 = var0.field2648;
      }

      return var2;
   }
}
