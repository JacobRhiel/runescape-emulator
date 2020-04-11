package src;

public class class264 extends class184 {

   static class154 field3395 = new class154(64);
   static class154 field3401 = new class154(50);
   public static class154 field3416 = new class154(200);
   int field3423 = -1;
   int field3431 = -1;
   int field3404;
   int[] field3435;
   int field3424 = -2;
   class325 field3427;
   int field3402 = -1;
   int field3422 = -1;
   int field3441 = -1;
   public String[] field3420 = new String[]{null, null, null, null, "Drop"};
   public String field3397 = "null";
   int field3433 = -1;
   public int field3410 = 2000;
   public int field3403;
   int field3426 = -1;
   int field3434 = -1;
   int[] field3436;
   int field3405 = -1;
   int field3430 = -1;
   public int field3411 = 0;
   int field3439 = 128;
   public int field3429 = 0;
   public int field3414 = 0;
   public int field3418 = 0;
   int field3432 = 128;
   public int field3445 = 0;
   public int field3413 = 0;
   public boolean field3412 = false;
   public int field3417 = 1;
   int field3448 = 128;
   short[] field3406;
   short[] field3438;
   int field3425 = 0;
   public int field3440 = -1;
   public String[] field3419 = new String[]{null, null, "Take", null, null};
   short[] field3407;
   int field3428 = 0;
   short[] field3415;
   public boolean field3446 = false;
   public int field3442 = 0;
   int field3400 = -1;
   public int field3443 = 0;
   public int field3437 = -1;
   public int field3444 = 0;
   public int field3450 = -1;
   int field3447 = -1;
   public int field3449 = -1;


   void method4691(class309 var1, int var2, int var3) {
      if(var2 == 1) {
         this.field3404 = var1.readShort((byte)53);
      } else if(var2 == 2) {
         this.field3397 = var1.method5667(-487845464);
      } else if(var2 == 4) {
         this.field3410 = var1.readShort((byte)127);
      } else if(var2 == 5) {
         this.field3411 = var1.readShort((byte)45);
      } else if(var2 == 6) {
         this.field3429 = var1.readShort((byte)17);
      } else if(var2 == 7) {
         this.field3414 = var1.readShort((byte)13);
         if(this.field3414 > 32767) {
            this.field3414 -= 65536;
         }
      } else if(var2 == 8) {
         this.field3445 = var1.readShort((byte)10);
         if(this.field3445 > 32767) {
            this.field3445 -= 65536;
         }
      } else if(var2 == 11) {
         this.field3418 = 1;
      } else if(var2 == 12) {
         this.field3417 = var1.readInt(297718403);
      } else if(var2 == 16) {
         this.field3412 = true;
      } else if(var2 == 23) {
         this.field3423 = var1.readShort((byte)123);
         this.field3425 = var1.readUnsignedByte((byte)45);
      } else if(var2 == 24) {
         this.field3402 = var1.readShort((byte)35);
      } else if(var2 == 25) {
         this.field3426 = var1.readShort((byte)58);
         this.field3428 = var1.readUnsignedByte((byte)70);
      } else if(var2 == 26) {
         this.field3405 = var1.readShort((byte)21);
      } else if(var2 >= 30 && var2 < 35) {
         this.field3419[var2 - 30] = var1.method5667(-1200201468);
         if(this.field3419[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3419[var2 - 30] = null;
         }
      } else if(var2 >= 35 && var2 < 40) {
         this.field3420[var2 - 35] = var1.method5667(-908709983);
      } else {
         int var4;
         int var5;
         if(var2 == 40) {
            var4 = var1.readUnsignedByte((byte)108);
            this.field3406 = new short[var4];
            this.field3407 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3406[var5] = (short)var1.readShort((byte)67);
               this.field3407[var5] = (short)var1.readShort((byte)105);
            }
         } else if(var2 == 41) {
            var4 = var1.readUnsignedByte((byte)102);
            this.field3438 = new short[var4];
            this.field3415 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3438[var5] = (short)var1.readShort((byte)80);
               this.field3415[var5] = (short)var1.readShort((byte)22);
            }
         } else if(var2 == 42) {
            this.field3424 = var1.readByte(-136814251);
         } else if(var2 == 65) {
            this.field3446 = true;
         } else if(var2 == 78) {
            this.field3441 = var1.readShort((byte)80);
         } else if(var2 == 79) {
            this.field3430 = var1.readShort((byte)92);
         } else if(var2 == 90) {
            this.field3431 = var1.readShort((byte)106);
         } else if(var2 == 91) {
            this.field3433 = var1.readShort((byte)24);
         } else if(var2 == 92) {
            this.field3422 = var1.readShort((byte)29);
         } else if(var2 == 93) {
            this.field3434 = var1.readShort((byte)80);
         } else if(var2 == 95) {
            this.field3413 = var1.readShort((byte)126);
         } else if(var2 == 97) {
            this.field3437 = var1.readShort((byte)13);
         } else if(var2 == 98) {
            this.field3440 = var1.readShort((byte)124);
         } else if(var2 >= 100 && var2 < 110) {
            if(this.field3435 == null) {
               this.field3435 = new int[10];
               this.field3436 = new int[10];
            }

            this.field3435[var2 - 100] = var1.readShort((byte)95);
            this.field3436[var2 - 100] = var1.readShort((byte)86);
         } else if(var2 == 110) {
            this.field3439 = var1.readShort((byte)108);
         } else if(var2 == 111) {
            this.field3432 = var1.readShort((byte)32);
         } else if(var2 == 112) {
            this.field3448 = var1.readShort((byte)21);
         } else if(var2 == 113) {
            this.field3442 = var1.readByte(-1513150906);
         } else if(var2 == 114) {
            this.field3443 = var1.readByte(-1616521308) * 5;
         } else if(var2 == 115) {
            this.field3444 = var1.readUnsignedByte((byte)78);
         } else if(var2 == 139) {
            this.field3447 = var1.readShort((byte)35);
         } else if(var2 == 140) {
            this.field3400 = var1.readShort((byte)55);
         } else if(var2 == 148) {
            this.field3449 = var1.readShort((byte)34);
         } else if(var2 == 149) {
            this.field3450 = var1.readShort((byte)65);
         } else if(var2 == 249) {
            this.field3427 = class246.method4375(var1, this.field3427, -810420491);
         }
      }

   }

   public final class136 method4696(int var1, byte var2) {
      if(this.field3435 != null && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if(var1 >= this.field3436[var4] && this.field3436[var4] != 0) {
               var3 = this.field3435[var4];
            }
         }

         if(var3 != -1) {
            return class30.method373(var3, (byte)-63).method4696(1, (byte)-42);
         }
      }

      class136 var6 = (class136)field3401.method3418((long)this.field3403);
      if(var6 != null) {
         return var6;
      } else {
         class130 var7 = class130.method2865(class18.field94, this.field3404, 0);
         if(var7 == null) {
            return null;
         } else {
            if(this.field3439 != 128 || this.field3432 != 128 || this.field3448 != 128) {
               var7.method2882(this.field3439, this.field3432, this.field3448);
            }

            int var5;
            if(this.field3406 != null) {
               for(var5 = 0; var5 < this.field3406.length; ++var5) {
                  var7.method2879(this.field3406[var5], this.field3407[var5]);
               }
            }

            if(this.field3438 != null) {
               for(var5 = 0; var5 < this.field3438.length; ++var5) {
                  var7.method2931(this.field3438[var5], this.field3415[var5]);
               }
            }

            var6 = var7.method2886(this.field3442 + 64, this.field3443 + 768, -50, -10, -50);
            var6.field1716 = true;
            field3401.method3424(var6, (long)this.field3403);
            return var6;
         }
      }
   }

   public final class130 method4695(int var1, int var2) {
      int var4;
      if(this.field3435 != null && var1 > 1) {
         int var3 = -1;

         for(var4 = 0; var4 < 10; ++var4) {
            if(var1 >= this.field3436[var4] && this.field3436[var4] != 0) {
               var3 = this.field3435[var4];
            }
         }

         if(var3 != -1) {
            return class30.method373(var3, (byte)8).method4695(1, -1152870229);
         }
      }

      class130 var5 = class130.method2865(class18.field94, this.field3404, 0);
      if(var5 == null) {
         return null;
      } else {
         if(this.field3439 != 128 || this.field3432 != 128 || this.field3448 != 128) {
            var5.method2882(this.field3439, this.field3432, this.field3448);
         }

         if(this.field3406 != null) {
            for(var4 = 0; var4 < this.field3406.length; ++var4) {
               var5.method2879(this.field3406[var4], this.field3407[var4]);
            }
         }

         if(this.field3438 != null) {
            for(var4 = 0; var4 < this.field3438.length; ++var4) {
               var5.method2931(this.field3438[var4], this.field3415[var4]);
            }
         }

         return var5;
      }
   }

   void method4742(int var1) {}

   public final boolean method4748(boolean var1, int var2) {
      int var3 = this.field3431;
      int var4 = this.field3422;
      if(var1) {
         var3 = this.field3433;
         var4 = this.field3434;
      }

      if(var3 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if(!class18.field94.method4238(var3, 0, 1320200183)) {
            var5 = false;
         }

         if(var4 != -1 && !class18.field94.method4238(var4, 0, 1639377817)) {
            var5 = false;
         }

         return var5;
      }
   }

   void method4703(class309 var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)122);
         if(var3 == 0) {
            return;
         }

         this.method4691(var1, var3, -1270586282);
      }
   }

   public final class130 method4700(boolean var1, int var2) {
      int var3 = this.field3431;
      int var4 = this.field3422;
      if(var1) {
         var3 = this.field3433;
         var4 = this.field3434;
      }

      if(var3 == -1) {
         return null;
      } else {
         class130 var5 = class130.method2865(class18.field94, var3, 0);
         if(var4 != -1) {
            class130 var6 = class130.method2865(class18.field94, var4, 0);
            class130[] var7 = new class130[]{var5, var6};
            var5 = new class130(var7, 2);
         }

         int var8;
         if(this.field3406 != null) {
            for(var8 = 0; var8 < this.field3406.length; ++var8) {
               var5.method2879(this.field3406[var8], this.field3407[var8]);
            }
         }

         if(this.field3438 != null) {
            for(var8 = 0; var8 < this.field3438.length; ++var8) {
               var5.method2931(this.field3438[var8], this.field3415[var8]);
            }
         }

         return var5;
      }
   }

   public final boolean method4697(boolean var1, int var2) {
      int var3 = this.field3423;
      int var4 = this.field3402;
      int var5 = this.field3441;
      if(var1) {
         var3 = this.field3426;
         var4 = this.field3405;
         var5 = this.field3430;
      }

      if(var3 == -1) {
         return true;
      } else {
         boolean var6 = true;
         if(!class18.field94.method4238(var3, 0, 1381436173)) {
            var6 = false;
         }

         if(var4 != -1 && !class18.field94.method4238(var4, 0, 1982430890)) {
            var6 = false;
         }

         if(var5 != -1 && !class18.field94.method4238(var5, 0, 1649374890)) {
            var6 = false;
         }

         return var6;
      }
   }

   public final class130 method4698(boolean var1, int var2) {
      int var3 = this.field3423;
      int var4 = this.field3402;
      int var5 = this.field3441;
      if(var1) {
         var3 = this.field3426;
         var4 = this.field3405;
         var5 = this.field3430;
      }

      if(var3 == -1) {
         return null;
      } else {
         class130 var6 = class130.method2865(class18.field94, var3, 0);
         if(var4 != -1) {
            class130 var7 = class130.method2865(class18.field94, var4, 0);
            if(var5 != -1) {
               class130 var8 = class130.method2865(class18.field94, var5, 0);
               class130[] var9 = new class130[]{var6, var7, var8};
               var6 = new class130(var9, 3);
            } else {
               class130[] var11 = new class130[]{var6, var7};
               var6 = new class130(var11, 2);
            }
         }

         if(!var1 && this.field3425 != 0) {
            var6.method2878(0, this.field3425, 0);
         }

         if(var1 && this.field3428 != 0) {
            var6.method2878(0, this.field3428, 0);
         }

         int var10;
         if(this.field3406 != null) {
            for(var10 = 0; var10 < this.field3406.length; ++var10) {
               var6.method2879(this.field3406[var10], this.field3407[var10]);
            }
         }

         if(this.field3438 != null) {
            for(var10 = 0; var10 < this.field3438.length; ++var10) {
               var6.method2931(this.field3438[var10], this.field3415[var10]);
            }
         }

         return var6;
      }
   }

   void method4739(class264 var1, class264 var2, byte var3) {
      this.field3404 = var1.field3404;
      this.field3410 = var1.field3410;
      this.field3411 = var1.field3411;
      this.field3429 = var1.field3429;
      this.field3413 = var1.field3413;
      this.field3414 = var1.field3414;
      this.field3445 = var1.field3445;
      this.field3406 = var1.field3406;
      this.field3407 = var1.field3407;
      this.field3438 = var1.field3438;
      this.field3415 = var1.field3415;
      this.field3397 = var2.field3397;
      this.field3412 = var2.field3412;
      this.field3417 = var2.field3417;
      this.field3418 = 1;
   }

   void method4693(class264 var1, class264 var2, int var3) {
      this.field3404 = var1.field3404;
      this.field3410 = var1.field3410;
      this.field3411 = var1.field3411;
      this.field3429 = var1.field3429;
      this.field3413 = var1.field3413;
      this.field3414 = var1.field3414;
      this.field3445 = var1.field3445;
      this.field3406 = var2.field3406;
      this.field3407 = var2.field3407;
      this.field3438 = var2.field3438;
      this.field3415 = var2.field3415;
      this.field3397 = var2.field3397;
      this.field3412 = var2.field3412;
      this.field3418 = var2.field3418;
      this.field3423 = var2.field3423;
      this.field3402 = var2.field3402;
      this.field3441 = var2.field3441;
      this.field3426 = var2.field3426;
      this.field3405 = var2.field3405;
      this.field3430 = var2.field3430;
      this.field3431 = var2.field3431;
      this.field3422 = var2.field3422;
      this.field3433 = var2.field3433;
      this.field3434 = var2.field3434;
      this.field3444 = var2.field3444;
      this.field3419 = var2.field3419;
      this.field3420 = new String[5];
      if(var2.field3420 != null) {
         for(int var4 = 0; var4 < 4; ++var4) {
            this.field3420[var4] = var2.field3420[var4];
         }
      }

      this.field3420[4] = "Discard";
      this.field3417 = 0;
   }

   void method4694(class264 var1, class264 var2, int var3) {
      this.field3404 = var1.field3404;
      this.field3410 = var1.field3410;
      this.field3411 = var1.field3411;
      this.field3429 = var1.field3429;
      this.field3413 = var1.field3413;
      this.field3414 = var1.field3414;
      this.field3445 = var1.field3445;
      this.field3406 = var1.field3406;
      this.field3407 = var1.field3407;
      this.field3438 = var1.field3438;
      this.field3415 = var1.field3415;
      this.field3418 = var1.field3418;
      this.field3397 = var2.field3397;
      this.field3417 = 0;
      this.field3412 = false;
      this.field3446 = false;
   }

   public class264 method4689(int var1, int var2) {
      if(this.field3435 != null && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if(var1 >= this.field3436[var4] && this.field3436[var4] != 0) {
               var3 = this.field3435[var4];
            }
         }

         if(var3 != -1) {
            return class30.method373(var3, (byte)-51);
         }
      }

      return this;
   }

   public String method4702(int var1, String var2, int var3) {
      return class9.method122(this.field3427, var1, var2, (short)171);
   }

   public int method4704(int var1, int var2, int var3) {
      class325 var5 = this.field3427;
      int var4;
      if(var5 == null) {
         var4 = var2;
      } else {
         class188 var6 = (class188)var5.method5968((long)var1);
         if(var6 == null) {
            var4 = var2;
         } else {
            var4 = var6.field2114;
         }
      }

      return var4;
   }

   public int method4717(int var1) {
      return this.field3424 != -1 && this.field3420 != null?(this.field3424 >= 0?(this.field3420[this.field3424] != null?this.field3424:-1):("Drop".equalsIgnoreCase(this.field3420[4])?4:-1)):-1;
   }
}
