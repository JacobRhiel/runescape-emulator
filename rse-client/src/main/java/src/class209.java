package src;

public class class209 {

   static final byte[] field2478 = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
   long field2477;
   int[] field2472;
   class309 field2481 = new class309((byte[])null);
   int field2471;
   int[] field2469;
   int[] field2476;
   int field2475;
   int[] field2474;


   class209(byte[] var1) {
      this.method3915(var1);
   }

   class209() {}

   int method3908(int var1) {
      byte var2 = this.field2481.field3709[this.field2481.field3710];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.field2474[var1] = var5;
         ++this.field2481.field3710;
      } else {
         var5 = this.field2474[var1];
      }

      if(var5 != 240 && var5 != 247) {
         return this.method3913(var1, var5);
      } else {
         int var3 = this.field2481.method5571(-1218127860);
         if(var5 == 247 && var3 > 0) {
            int var4 = this.field2481.field3709[this.field2481.field3710] & 255;
            if(var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.field2481.field3710;
               this.field2474[var1] = var4;
               return this.method3913(var1, var4);
            }
         }

         this.field2481.field3710 += var3;
         return 0;
      }
   }

   void method3920() {
      this.field2481.field3709 = null;
      this.field2469 = null;
      this.field2472 = null;
      this.field2476 = null;
      this.field2474 = null;
   }

   boolean method3905() {
      return this.field2481.field3709 != null;
   }

   void method3915(byte[] var1) {
      this.field2481.field3709 = var1;
      this.field2481.field3710 = 10;
      int var2 = this.field2481.writeShort((byte)34);
      this.field2475 = this.field2481.writeShort((byte)66);
      this.field2471 = 500000;
      this.field2469 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field2481.field3710 += var5) {
         int var4 = this.field2481.readInt(297718403);
         var5 = this.field2481.readInt(297718403);
         if(var4 == 1297379947) {
            this.field2469[var3] = this.field2481.field3710;
            ++var3;
         }
      }

      this.field2477 = 0L;
      this.field2472 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field2472[var3] = this.field2469[var3];
      }

      this.field2476 = new int[var2];
      this.field2474 = new int[var2];
   }

   void method3907(int var1) {
      this.field2481.field3710 = this.field2472[var1];
   }

   int method3902() {
      int var1 = this.field2472.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.field2472[var4] >= 0 && this.field2476[var4] < var3) {
            var2 = var4;
            var3 = this.field2476[var4];
         }
      }

      return var2;
   }

   int method3906() {
      return this.field2472.length;
   }

   int method3911(int var1) {
      int var2 = this.method3908(var1);
      return var2;
   }

   void method3910(int var1) {
      int var2 = this.field2481.method5571(-794392643);
      this.field2476[var1] += var2;
   }

   int method3913(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = this.field2481.readUnsignedByte((byte)26);
         var4 = this.field2481.method5571(-1581016397);
         if(var7 == 47) {
            this.field2481.field3710 += var4;
            return 1;
         } else if(var7 == 81) {
            int var5 = this.field2481.method5674((short)3112);
            var4 -= 3;
            int var6 = this.field2476[var1];
            this.field2477 += (long)var6 * (long)(this.field2471 - var5);
            this.field2471 = var5;
            this.field2481.field3710 += var4;
            return 2;
         } else {
            this.field2481.field3710 += var4;
            return 3;
         }
      } else {
         byte var3 = field2478[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | this.field2481.readUnsignedByte((byte)123) << 8;
         }

         if(var3 >= 2) {
            var4 |= this.field2481.readUnsignedByte((byte)93) << 16;
         }

         return var4;
      }
   }

   void method3909() {
      this.field2481.field3710 = -1;
   }

   void method3944(int var1) {
      this.field2472[var1] = this.field2481.field3710;
   }

   boolean method3916() {
      int var1 = this.field2472.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.field2472[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   long method3914(int var1) {
      return this.field2477 + (long)var1 * (long)this.field2471;
   }

   void method3917(long var1) {
      this.field2477 = var1;
      int var3 = this.field2472.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field2476[var4] = 0;
         this.field2474[var4] = 0;
         this.field2481.field3710 = this.field2469[var4];
         this.method3910(var4);
         this.field2472[var4] = this.field2481.field3710;
      }

   }
}
