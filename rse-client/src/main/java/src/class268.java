package src;

public class class268 extends class184 {

   static class154 field3512 = new class154(100);
   static class154 field3528 = new class154(64);
   public static String field3527;
   static int field3526;
   public int field3520 = -1;
   public int[] field3513;
   int[] field3517;
   public int field3524 = -1;
   public int field3516 = -1;
   public int[] field3514;
   public boolean field3518 = false;
   public int field3510 = -1;
   public int field3519 = 5;
   public int field3521 = -1;
   int[] field3523;
   public int field3522 = 99;
   public int field3525 = 2;
   public int[] field3515;


   void method4818(class309 var1, int var2, int var3) {
      int var4;
      int var5;
      if(var2 == 1) {
         var4 = var1.readShort((byte)51);
         this.field3514 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3514[var5] = var1.readShort((byte)79);
         }

         this.field3513 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3513[var5] = var1.readShort((byte)28);
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3513[var5] += var1.readShort((byte)27) << 16;
         }
      } else if(var2 == 2) {
         this.field3516 = var1.readShort((byte)62);
      } else if(var2 == 3) {
         var4 = var1.readUnsignedByte((byte)90);
         this.field3517 = new int[var4 + 1];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3517[var5] = var1.readUnsignedByte((byte)111);
         }

         this.field3517[var4] = 9999999;
      } else if(var2 == 4) {
         this.field3518 = true;
      } else if(var2 == 5) {
         this.field3519 = var1.readUnsignedByte((byte)85);
      } else if(var2 == 6) {
         this.field3510 = var1.readShort((byte)68);
      } else if(var2 == 7) {
         this.field3521 = var1.readShort((byte)82);
      } else if(var2 == 8) {
         this.field3522 = var1.readUnsignedByte((byte)25);
      } else if(var2 == 9) {
         this.field3520 = var1.readUnsignedByte((byte)97);
      } else if(var2 == 10) {
         this.field3524 = var1.readUnsignedByte((byte)78);
      } else if(var2 == 11) {
         this.field3525 = var1.readUnsignedByte((byte)17);
      } else if(var2 == 12) {
         var4 = var1.readUnsignedByte((byte)101);
         this.field3523 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3523[var5] = var1.readShort((byte)34);
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3523[var5] += var1.readShort((byte)59) << 16;
         }
      } else if(var2 == 13) {
         var4 = var1.readUnsignedByte((byte)35);
         this.field3515 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3515[var5] = var1.method5674((short)3112);
         }
      }

   }

   public class136 method4820(class136 var1, int var2, int var3) {
      var2 = this.field3513[var2];
      class147 var4 = class15.method154(var2 >> 16, 1184935855);
      var2 &= '\uffff';
      if(var4 == null) {
         return var1.method2971(true);
      } else {
         class136 var5 = var1.method2971(!var4.method3368(var2, 861900150));
         var5.method2959(var4, var2);
         return var5;
      }
   }

   public class136 method4823(class136 var1, int var2, class268 var3, int var4, byte var5) {
      var2 = this.field3513[var2];
      class147 var6 = class15.method154(var2 >> 16, 1600674213);
      var2 &= '\uffff';
      if(var6 == null) {
         return var3.method4820(var1, var4, 1747843246);
      } else {
         var4 = var3.field3513[var4];
         class147 var7 = class15.method154(var4 >> 16, 1782363926);
         var4 &= '\uffff';
         class136 var8;
         if(var7 == null) {
            var8 = var1.method2971(!var6.method3368(var2, 861900150));
            var8.method2959(var6, var2);
            return var8;
         } else {
            var8 = var1.method2971(!var6.method3368(var2, 861900150) & !var7.method3368(var4, 861900150));
            var8.method2960(var6, var2, var7, var4, this.field3517);
            return var8;
         }
      }
   }

   class136 method4821(class136 var1, int var2, int var3, int var4) {
      var2 = this.field3513[var2];
      class147 var5 = class15.method154(var2 >> 16, 1348744293);
      var2 &= '\uffff';
      if(var5 == null) {
         return var1.method2971(true);
      } else {
         class136 var6 = var1.method2971(!var5.method3368(var2, 861900150));
         var3 &= 3;
         if(var3 == 1) {
            var6.method2964();
         } else if(var3 == 2) {
            var6.method2956();
         } else if(var3 == 3) {
            var6.method2969();
         }

         var6.method2959(var5, var2);
         if(var3 == 1) {
            var6.method2969();
         } else if(var3 == 2) {
            var6.method2956();
         } else if(var3 == 3) {
            var6.method2964();
         }

         return var6;
      }
   }

   class136 method4819(class136 var1, int var2, byte var3) {
      var2 = this.field3513[var2];
      class147 var4 = class15.method154(var2 >> 16, 1388242870);
      var2 &= '\uffff';
      if(var4 == null) {
         return var1.method3013(true);
      } else {
         class136 var5 = var1.method3013(!var4.method3368(var2, 861900150));
         var5.method2959(var4, var2);
         return var5;
      }
   }

   public class136 method4848(class136 var1, int var2, byte var3) {
      int var4 = this.field3513[var2];
      class147 var5 = class15.method154(var4 >> 16, 1748397454);
      var4 &= '\uffff';
      if(var5 == null) {
         return var1.method2971(true);
      } else {
         class147 var6 = null;
         int var7 = 0;
         if(this.field3523 != null && var2 < this.field3523.length) {
            var7 = this.field3523[var2];
            var6 = class15.method154(var7 >> 16, 1465849709);
            var7 &= '\uffff';
         }

         class136 var8;
         if(var6 != null && var7 != '\uffff') {
            var8 = var1.method2971(!var5.method3368(var4, 861900150) & !var6.method3368(var7, 861900150));
            var8.method2959(var5, var4);
            var8.method2959(var6, var7);
            return var8;
         } else {
            var8 = var1.method2971(!var5.method3368(var4, 861900150));
            var8.method2959(var5, var4);
            return var8;
         }
      }
   }

   void method4847(byte var1) {
      if(this.field3520 == -1) {
         if(this.field3517 != null) {
            this.field3520 = 2;
         } else {
            this.field3520 = 0;
         }
      }

      if(this.field3524 == -1) {
         if(this.field3517 != null) {
            this.field3524 = 2;
         } else {
            this.field3524 = 0;
         }
      }

   }

   void method4817(class309 var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)121);
         if(var3 == 0) {
            return;
         }

         this.method4818(var1, var3, -951623720);
      }
   }
}
