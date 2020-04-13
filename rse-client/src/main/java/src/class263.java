package src;

public class class263 extends class184 {

   static boolean field3356 = false;
   static class154 field3346 = new class154(4096);
   static class243 field3345;
   static class154 field3352 = new class154(30);
   static class154 field3348 = new class154(30);
   static class243 field3344;
   public static class154 field3347 = new class154(500);
   static class130[] field3376 = new class130[4];
   class325 field3369;
   int field3386 = -1;
   public int field3363 = -1;
   int[] field3389;
   int[] field3353;
   public int[] field3385;
   public String field3354 = "null";
   int field3387 = -1;
   public int field3350 = -1;
   public int field3371 = -1;
   public int field3351;
   public int[] field3392;
   public int field3359 = 1;
   public int field3361 = 2;
   boolean field3374 = false;
   public int field3372 = -1;
   public int field3360 = 1;
   public boolean field3384 = true;
   public int field3388 = 0;
   boolean field3365 = false;
   int field3364 = -1;
   public int field3390 = 0;
   public boolean field3343 = false;
   int field3357 = 0;
   int field3362 = 128;
   int field3349 = 0;
   public String[] field3368 = new String[5];
   public int field3366 = 0;
   public int field3367 = -1;
   boolean field3383 = false;
   public int field3393 = 16;
   int field3377 = 128;
   short[] field3355;
   public boolean field3375 = true;
   short[] field3370;
   short[] field3358;
   int field3378 = 128;
   short[] field3394;
   int field3379 = 0;
   public int field3391 = -1;
   int field3380 = 0;
   int field3381 = 0;
   public boolean field3382 = false;


   public final class263 method4645(short var1) {
      int var2 = -1;
      if(this.field3386 != -1) {
         var2 = class95.method2197(this.field3386, -541616394);
      } else if(this.field3387 != -1) {
         var2 = class221.field2526[this.field3387];
      }

      int var3;
      if(var2 >= 0 && var2 < this.field3385.length - 1) {
         var3 = this.field3385[var2];
      } else {
         var3 = this.field3385[this.field3385.length - 1];
      }

      return var3 != -1?class33.method435(var3, 1650295452):null;
   }

   void method4636(class309 var1, int var2, int var3) {
      int var4;
      int var5;
      if(var2 == 1) {
         var4 = var1.readUnsignedByte((byte)120);
         if(var4 > 0) {
            if(this.field3389 != null && !field3356) {
               var1.field3710 += 3 * var4;
            } else {
               this.field3353 = new int[var4];
               this.field3389 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field3389[var5] = var1.writeShort((byte)26);
                  this.field3353[var5] = var1.readUnsignedByte((byte)110);
               }
            }
         }
      } else if(var2 == 2) {
         this.field3354 = var1.method5667(-839497304);
      } else if(var2 == 5) {
         var4 = var1.readUnsignedByte((byte)102);
         if(var4 > 0) {
            if(this.field3389 != null && !field3356) {
               var1.field3710 += var4 * 2;
            } else {
               this.field3353 = null;
               this.field3389 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field3389[var5] = var1.writeShort((byte)83);
               }
            }
         }
      } else if(var2 == 14) {
         this.field3359 = var1.readUnsignedByte((byte)42);
      } else if(var2 == 15) {
         this.field3360 = var1.readUnsignedByte((byte)52);
      } else if(var2 == 17) {
         this.field3361 = 0;
         this.field3384 = false;
      } else if(var2 == 18) {
         this.field3384 = false;
      } else if(var2 == 19) {
         this.field3363 = var1.readUnsignedByte((byte)86);
      } else if(var2 == 21) {
         this.field3364 = 0;
      } else if(var2 == 22) {
         this.field3365 = true;
      } else if(var2 == 23) {
         this.field3343 = true;
      } else if(var2 == 24) {
         this.field3367 = var1.writeShort((byte)119);
         if(this.field3367 == '\uffff') {
            this.field3367 = -1;
         }
      } else if(var2 == 27) {
         this.field3361 = 1;
      } else if(var2 == 28) {
         this.field3393 = var1.readUnsignedByte((byte)123);
      } else if(var2 == 29) {
         this.field3357 = var1.readByte(155825949);
      } else if(var2 == 39) {
         this.field3349 = var1.readByte(49939394) * 25;
      } else if(var2 >= 30 && var2 < 35) {
         this.field3368[var2 - 30] = var1.method5667(-1481112169);
         if(this.field3368[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3368[var2 - 30] = null;
         }
      } else if(var2 == 40) {
         var4 = var1.readUnsignedByte((byte)105);
         this.field3355 = new short[var4];
         this.field3358 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3355[var5] = (short)var1.writeShort((byte)43);
            this.field3358[var5] = (short)var1.writeShort((byte)15);
         }
      } else if(var2 == 41) {
         var4 = var1.readUnsignedByte((byte)78);
         this.field3370 = new short[var4];
         this.field3394 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3370[var5] = (short)var1.writeShort((byte)101);
            this.field3394[var5] = (short)var1.writeShort((byte)79);
         }
      } else if(var2 == 62) {
         this.field3374 = true;
      } else if(var2 == 64) {
         this.field3375 = false;
      } else if(var2 == 65) {
         this.field3362 = var1.writeShort((byte)111);
      } else if(var2 == 66) {
         this.field3377 = var1.writeShort((byte)68);
      } else if(var2 == 67) {
         this.field3378 = var1.writeShort((byte)111);
      } else if(var2 == 68) {
         this.field3391 = var1.writeShort((byte)86);
      } else if(var2 == 69) {
         var1.readUnsignedByte((byte)88);
      } else if(var2 == 70) {
         this.field3379 = var1.method5550(-707737685);
      } else if(var2 == 71) {
         this.field3380 = var1.method5550(372245151);
      } else if(var2 == 72) {
         this.field3381 = var1.method5550(84164366);
      } else if(var2 == 73) {
         this.field3382 = true;
      } else if(var2 == 74) {
         this.field3383 = true;
      } else if(var2 == 75) {
         this.field3371 = var1.readUnsignedByte((byte)58);
      } else if(var2 != 77 && var2 != 92) {
         if(var2 == 78) {
            this.field3350 = var1.writeShort((byte)84);
            this.field3388 = var1.readUnsignedByte((byte)57);
         } else if(var2 == 79) {
            this.field3390 = var1.writeShort((byte)83);
            this.field3366 = var1.writeShort((byte)24);
            this.field3388 = var1.readUnsignedByte((byte)29);
            var4 = var1.readUnsignedByte((byte)61);
            this.field3392 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3392[var5] = var1.writeShort((byte)18);
            }
         } else if(var2 == 81) {
            this.field3364 = var1.readUnsignedByte((byte)105) * 256;
         } else if(var2 == 82) {
            this.field3372 = var1.writeShort((byte)115);
         } else if(var2 == 249) {
            this.field3369 = class246.method4375(var1, this.field3369, -1200596784);
         }
      } else {
         this.field3386 = var1.writeShort((byte)124);
         if(this.field3386 == '\uffff') {
            this.field3386 = -1;
         }

         this.field3387 = var1.writeShort((byte)52);
         if(this.field3387 == '\uffff') {
            this.field3387 = -1;
         }

         var4 = -1;
         if(var2 == 92) {
            var4 = var1.writeShort((byte)12);
            if(var4 == '\uffff') {
               var4 = -1;
            }
         }

         var5 = var1.readUnsignedByte((byte)17);
         this.field3385 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field3385[var6] = var1.writeShort((byte)67);
            if(this.field3385[var6] == '\uffff') {
               this.field3385[var6] = -1;
            }
         }

         this.field3385[var5 + 1] = var4;
      }

   }

   final class130 method4652(int var1, int var2, int var3) {
      class130 var4 = null;
      boolean var5;
      int var6;
      int var8;
      if(this.field3353 == null) {
         if(var1 != 10) {
            return null;
         }

         if(this.field3389 == null) {
            return null;
         }

         var5 = this.field3374;
         if(var1 == 2 && var2 > 3) {
            var5 = !var5;
         }

         var6 = this.field3389.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            var8 = this.field3389[var7];
            if(var5) {
               var8 += 65536;
            }

            var4 = (class130)field3347.method3418((long)var8);
            if(var4 == null) {
               var4 = class130.method2865(field3345, var8 & '\uffff', 0);
               if(var4 == null) {
                  return null;
               }

               if(var5) {
                  var4.method2881();
               }

               field3347.method3424(var4, (long)var8);
            }

            if(var6 > 1) {
               field3376[var7] = var4;
            }
         }

         if(var6 > 1) {
            var4 = new class130(field3376, var6);
         }
      } else {
         int var10 = -1;

         for(var6 = 0; var6 < this.field3353.length; ++var6) {
            if(this.field3353[var6] == var1) {
               var10 = var6;
               break;
            }
         }

         if(var10 == -1) {
            return null;
         }

         var6 = this.field3389[var10];
         boolean var11 = this.field3374 ^ var2 > 3;
         if(var11) {
            var6 += 65536;
         }

         var4 = (class130)field3347.method3418((long)var6);
         if(var4 == null) {
            var4 = class130.method2865(field3345, var6 & '\uffff', 0);
            if(var4 == null) {
               return null;
            }

            if(var11) {
               var4.method2881();
            }

            field3347.method3424(var4, (long)var6);
         }
      }

      if(this.field3362 == 128 && this.field3377 == 128 && this.field3378 == 128) {
         var5 = false;
      } else {
         var5 = true;
      }

      boolean var12;
      if(this.field3379 == 0 && this.field3380 == 0 && this.field3381 == 0) {
         var12 = false;
      } else {
         var12 = true;
      }

      class130 var9 = new class130(var4, var2 == 0 && !var5 && !var12, this.field3355 == null, this.field3370 == null, true);
      if(var1 == 4 && var2 > 3) {
         var9.method2877(256);
         var9.method2878(45, 0, -45);
      }

      var2 &= 3;
      if(var2 == 1) {
         var9.method2874();
      } else if(var2 == 2) {
         var9.method2875();
      } else if(var2 == 3) {
         var9.method2896();
      }

      if(this.field3355 != null) {
         for(var8 = 0; var8 < this.field3355.length; ++var8) {
            var9.method2879(this.field3355[var8], this.field3358[var8]);
         }
      }

      if(this.field3370 != null) {
         for(var8 = 0; var8 < this.field3370.length; ++var8) {
            var9.method2931(this.field3370[var8], this.field3394[var8]);
         }
      }

      if(var5) {
         var9.method2882(this.field3362, this.field3377, this.field3378);
      }

      if(var12) {
         var9.method2878(this.field3379, this.field3380, this.field3381);
      }

      return var9;
   }

   void method4634(int var1) {
      if(this.field3363 == -1) {
         this.field3363 = 0;
         if(this.field3389 != null && (this.field3353 == null || this.field3353[0] == 10)) {
            this.field3363 = 1;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if(this.field3368[var2] != null) {
               this.field3363 = 1;
            }
         }
      }

      if(this.field3371 == -1) {
         this.field3371 = this.field3361 != 0?1:0;
      }

   }

   void method4635(class309 var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)56);
         if(var3 == 0) {
            return;
         }

         this.method4636(var1, var3, 1616364474);
      }
   }

   public final class136 method4641(int var1, int var2, int[][] var3, int var4, int var5, int var6, class268 var7, int var8, short var9) {
      long var10;
      if(this.field3353 == null) {
         var10 = (long)(var2 + (this.field3351 << 10));
      } else {
         var10 = (long)(var2 + (var1 << 3) + (this.field3351 << 10));
      }

      class136 var12 = (class136)field3352.method3418(var10);
      if(var12 == null) {
         class130 var13 = this.method4652(var1, var2, -1299581949);
         if(var13 == null) {
            return null;
         }

         var12 = var13.method2886(this.field3357 + 64, this.field3349 + 768, -50, -10, -50);
         field3352.method3424(var12, var10);
      }

      if(var7 == null && this.field3364 == -1) {
         return var12;
      } else {
         if(var7 != null) {
            var12 = var7.method4821(var12, var8, var2, -1535419363);
         } else {
            var12 = var12.method2971(true);
         }

         if(this.field3364 >= 0) {
            var12 = var12.method2985(var3, var4, var5, var6, false, this.field3364);
         }

         return var12;
      }
   }

   public final class136 method4639(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      long var8;
      if(this.field3353 == null) {
         var8 = (long)(var2 + (this.field3351 << 10));
      } else {
         var8 = (long)(var2 + (var1 << 3) + (this.field3351 << 10));
      }

      class136 var10 = (class136)field3352.method3418(var8);
      if(var10 == null) {
         class130 var11 = this.method4652(var1, var2, 179271223);
         if(var11 == null) {
            return null;
         }

         var10 = var11.method2886(this.field3357 + 64, this.field3349 + 768, -50, -10, -50);
         field3352.method3424(var10, var8);
      }

      if(this.field3364 >= 0) {
         var10 = var10.method2985(var3, var4, var5, var6, true, this.field3364);
      }

      return var10;
   }

   public final boolean method4637(int var1, int var2) {
      if(this.field3353 != null) {
         for(int var5 = 0; var5 < this.field3353.length; ++var5) {
            if(this.field3353[var5] == var1) {
               return field3345.method4238(this.field3389[var5] & '\uffff', 0, 1429078390);
            }
         }

         return true;
      } else if(this.field3389 == null) {
         return true;
      } else if(var1 != 10) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.field3389.length; ++var4) {
            var3 &= field3345.method4238(this.field3389[var4] & '\uffff', 0, 1496093991);
         }

         return var3;
      }
   }

   public final boolean method4638(byte var1) {
      if(this.field3389 == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field3389.length; ++var3) {
            var2 &= field3345.method4238(this.field3389[var3] & '\uffff', 0, 1528445296);
         }

         return var2;
      }
   }

   public boolean method4646(int var1) {
      if(this.field3385 == null) {
         return this.field3350 != -1 || this.field3392 != null;
      } else {
         for(int var2 = 0; var2 < this.field3385.length; ++var2) {
            if(this.field3385[var2] != -1) {
               class263 var3 = class33.method435(this.field3385[var2], 1650295452);
               if(var3.field3350 != -1 || var3.field3392 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public int method4667(int var1, int var2, byte var3) {
      class325 var5 = this.field3369;
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

   public String method4680(int var1, String var2, int var3) {
      return class9.method122(this.field3369, var1, var2, (short)171);
   }

   public final class144 method4654(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      long var8;
      if(this.field3353 == null) {
         var8 = (long)(var2 + (this.field3351 << 10));
      } else {
         var8 = (long)(var2 + (var1 << 3) + (this.field3351 << 10));
      }

      Object var10 = (class144)field3348.method3418(var8);
      if(var10 == null) {
         class130 var11 = this.method4652(var1, var2, 666598976);
         if(var11 == null) {
            return null;
         }

         if(!this.field3365) {
            var10 = var11.method2886(this.field3357 + 64, this.field3349 + 768, -50, -10, -50);
         } else {
            var11.field1587 = (short)(this.field3357 + 64);
            var11.field1593 = (short)(this.field3349 + 768);
            var11.method2883();
            var10 = var11;
         }

         field3348.method3424((class184)var10, var8);
      }

      if(this.field3365) {
         var10 = ((class130)var10).method2871();
      }

      if(this.field3364 >= 0) {
         if(var10 instanceof class136) {
            var10 = ((class136)var10).method2985(var3, var4, var5, var6, true, this.field3364);
         } else if(var10 instanceof class130) {
            var10 = ((class130)var10).method2872(var3, var4, var5, var6, true, this.field3364);
         }
      }

      return (class144)var10;
   }

   static void method4687(boolean var0, int var1) {
      class94.field1206 = "";
      class94.field1192 = "Enter your username/email & password.";
      class94.field1208 = "";
      class94.field1204 = 2;
      if(var0) {
         class94.field1210 = "";
      }

      if(class94.field1220 == null || class94.field1220.length() <= 0) {
         if(class76.field676.field1080 != null) {
            class94.field1220 = class76.field676.field1080;
            client.field716 = true;
         } else {
            client.field716 = false;
         }
      }

      class301.method5361((byte)79);
   }

   static int method4686(int var0, class101 var1, boolean var2, int var3) {
      int var4;
      int var5;
      if(var0 == 4000) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         class85.field1115[++class85.field1117 - 1] = var4 + var5;
         return 1;
      } else if(var0 == 4001) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         class85.field1115[++class85.field1117 - 1] = var4 - var5;
         return 1;
      } else if(var0 == 4002) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         class85.field1115[++class85.field1117 - 1] = var4 * var5;
         return 1;
      } else if(var0 == 4003) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         class85.field1115[++class85.field1117 - 1] = var4 / var5;
         return 1;
      } else if(var0 == 4004) {
         var4 = class85.field1115[--class85.field1117];
         class85.field1115[++class85.field1117 - 1] = (int)(Math.random() * (double)var4);
         return 1;
      } else if(var0 == 4005) {
         var4 = class85.field1115[--class85.field1117];
         class85.field1115[++class85.field1117 - 1] = (int)(Math.random() * (double)(var4 + 1));
         return 1;
      } else if(var0 == 4006) {
         class85.field1117 -= 5;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         int var6 = class85.field1115[class85.field1117 + 2];
         int var7 = class85.field1115[class85.field1117 + 3];
         int var8 = class85.field1115[class85.field1117 + 4];
         class85.field1115[++class85.field1117 - 1] = var4 + (var5 - var4) * (var8 - var6) / (var7 - var6);
         return 1;
      } else if(var0 == 4007) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         class85.field1115[++class85.field1117 - 1] = var4 + var5 * var4 / 100;
         return 1;
      } else if(var0 == 4008) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         class85.field1115[++class85.field1117 - 1] = var4 | 1 << var5;
         return 1;
      } else if(var0 == 4009) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         class85.field1115[++class85.field1117 - 1] = var4 & -1 - (1 << var5);
         return 1;
      } else if(var0 == 4010) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         class85.field1115[++class85.field1117 - 1] = (var4 & 1 << var5) != 0?1:0;
         return 1;
      } else if(var0 == 4011) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         class85.field1115[++class85.field1117 - 1] = var4 % var5;
         return 1;
      } else if(var0 == 4012) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         if(var4 == 0) {
            class85.field1115[++class85.field1117 - 1] = 0;
         } else {
            class85.field1115[++class85.field1117 - 1] = (int)Math.pow((double)var4, (double)var5);
         }

         return 1;
      } else if(var0 == 4013) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         if(var4 == 0) {
            class85.field1115[++class85.field1117 - 1] = 0;
            return 1;
         } else {
            switch(var5) {
            case 0:
               class85.field1115[++class85.field1117 - 1] = Integer.MAX_VALUE;
               break;
            case 1:
               class85.field1115[++class85.field1117 - 1] = var4;
               break;
            case 2:
               class85.field1115[++class85.field1117 - 1] = (int)Math.sqrt((double)var4);
               break;
            case 3:
               class85.field1115[++class85.field1117 - 1] = (int)Math.cbrt((double)var4);
               break;
            case 4:
               class85.field1115[++class85.field1117 - 1] = (int)Math.sqrt(Math.sqrt((double)var4));
               break;
            default:
               class85.field1115[++class85.field1117 - 1] = (int)Math.pow((double)var4, 1.0D / (double)var5);
            }

            return 1;
         }
      } else if(var0 == 4014) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         class85.field1115[++class85.field1117 - 1] = var4 & var5;
         return 1;
      } else if(var0 == 4015) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         class85.field1115[++class85.field1117 - 1] = var4 | var5;
         return 1;
      } else if(var0 == 4018) {
         class85.field1117 -= 3;
         long var10 = (long)class85.field1115[class85.field1117];
         long var12 = (long)class85.field1115[class85.field1117 + 1];
         long var14 = (long)class85.field1115[class85.field1117 + 2];
         class85.field1115[++class85.field1117 - 1] = (int)(var14 * var10 / var12);
         return 1;
      } else {
         return 2;
      }
   }
}
