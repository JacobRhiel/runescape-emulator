package src;

public abstract class class78 extends class144 {

   int field1027 = 0;
   int field1016 = -1;
   int[] field1028 = new int[10];
   int[] field981 = new int[4];
   boolean field1001 = false;
   int field1015 = -1;
   int field1032 = 0;
   int[] field1029 = new int[10];
   byte field992 = 0;
   int field1031 = 0;
   int field1008 = 0;
   class270 field998 = new class270();
   int field1024 = -1;
   int field976 = 1;
   int[] field994 = new int[4];
   int field978 = -1;
   int field1014 = 0;
   int field1010 = -1;
   int field974 = 0;
   int field980 = -1;
   byte[] field1022 = new byte[10];
   int field993 = -1;
   int field982 = -1;
   int field983;
   int[] field975 = new int[4];
   int field1003 = -1;
   int field984 = -1;
   int[] field996 = new int[4];
   int field985 = -1;
   int field1023 = 200;
   int field973;
   int[] field997 = new int[4];
   String field1002 = null;
   int field1009 = -1;
   boolean field988 = false;
   int field1006 = 0;
   int field989 = 100;
   int field987 = 0;
   int field991 = 0;
   int field1033;
   int field999 = -1;
   boolean field1000 = false;
   int field979;
   int field1004 = 0;
   int field1007 = 0;
   int field1011 = 0;
   int field1012 = 0;
   int field1005 = 0;
   int field1025 = 0;
   int field1026 = 32;
   int field977;
   int field1019;
   int field1020;
   int field990;
   int field995;
   int field1017;
   int field972;
   int field1018;
   int field1021;
   int field1013;
   boolean field1030;


   boolean vmethod2118(int var1) {
      return false;
   }

   final void method1828(int var1) {
      this.field1027 = 0;
      this.field1032 = 0;
   }

   final void method1832(int var1, int var2) {
      class256 var4 = (class256)class256.field3279.method3418((long)var1);
      class256 var3;
      if(var4 != null) {
         var3 = var4;
      } else {
         byte[] var5 = class256.field3273.method4224(33, var1, (byte)-57);
         var4 = new class256();
         if(var5 != null) {
            var4.method4521(new class309(var5), -1815085637);
         }

         class256.field3279.method3424(var4, (long)var1);
         var3 = var4;
      }

      var4 = var3;

      for(class87 var6 = (class87)this.field998.method4860(); var6 != null; var6 = (class87)this.field998.method4915()) {
         if(var4 == var6.field1143) {
            var6.method3657();
            return;
         }
      }

   }

   final void method1845(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      boolean var8 = true;
      boolean var9 = true;

      int var10;
      for(var10 = 0; var10 < 4; ++var10) {
         if(this.field981[var10] > var5) {
            var8 = false;
         } else {
            var9 = false;
         }
      }

      var10 = -1;
      int var11 = -1;
      int var12 = 0;
      if(var1 >= 0) {
         class262 var13 = class19.method213(var1, -600154853);
         var11 = var13.field3327;
         var12 = var13.field3329;
      }

      int var15;
      if(var9) {
         if(var11 == -1) {
            return;
         }

         var10 = 0;
         var15 = 0;
         if(var11 == 0) {
            var15 = this.field981[0];
         } else if(var11 == 1) {
            var15 = this.field994[0];
         }

         for(int var14 = 1; var14 < 4; ++var14) {
            if(var11 == 0) {
               if(this.field981[var14] < var15) {
                  var10 = var14;
                  var15 = this.field981[var14];
               }
            } else if(var11 == 1 && this.field994[var14] < var15) {
               var10 = var14;
               var15 = this.field994[var14];
            }
         }

         if(var11 == 1 && var15 >= var2) {
            return;
         }
      } else {
         if(var8) {
            this.field992 = 0;
         }

         for(var15 = 0; var15 < 4; ++var15) {
            byte var16 = this.field992;
            this.field992 = (byte)((this.field992 + 1) % 4);
            if(this.field981[var16] <= var5) {
               var10 = var16;
               break;
            }
         }
      }

      if(var10 >= 0) {
         this.field975[var10] = var1;
         this.field994[var10] = var2;
         this.field996[var10] = var3;
         this.field997[var10] = var4;
         this.field981[var10] = var5 + var12 + var6;
      }
   }

   final void method1831(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      class256 var9 = (class256)class256.field3279.method3418((long)var1);
      class256 var8;
      if(var9 != null) {
         var8 = var9;
      } else {
         byte[] var10 = class256.field3273.method4224(33, var1, (byte)-90);
         var9 = new class256();
         if(var10 != null) {
            var9.method4521(new class309(var10), -1815085637);
         }

         class256.field3279.method3424(var9, (long)var1);
         var8 = var9;
      }

      var9 = var8;
      class87 var15 = null;
      class87 var11 = null;
      int var12 = var8.field3278;
      int var13 = 0;

      class87 var14;
      for(var14 = (class87)this.field998.method4860(); var14 != null; var14 = (class87)this.field998.method4915()) {
         ++var13;
         if(var14.field1143.field3276 == var9.field3276) {
            var14.method2111(var2 + var4, var5, var6, var3, (byte)86);
            return;
         }

         if(var14.field1143.field3277 <= var9.field3277) {
            var15 = var14;
         }

         if(var14.field1143.field3278 > var12) {
            var11 = var14;
            var12 = var14.field1143.field3278;
         }
      }

      if(var11 != null || var13 < 4) {
         var14 = new class87(var9);
         if(var15 == null) {
            this.field998.method4880(var14);
         } else {
            class270.method4893(var14, var15);
         }

         var14.method2111(var2 + var4, var5, var6, var3, (byte)80);
         if(var13 >= 4) {
            var11.method3657();
         }

      }
   }

   static int method1846(int var0, int var1) {
      return (int)((Math.log((double)var0) / class85.field1128 - 7.0D) * 256.0D);
   }
}
