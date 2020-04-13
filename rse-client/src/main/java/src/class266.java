package src;

public class class266 extends class184 {

   static class154 field3463 = new class154(50);
   static class154 field3476 = new class154(64);
   public static class243 field3466;
   public static class243 field3468;
   class325 field3496;
   int field3460 = -1;
   public int[] field3490;
   public String field3465 = "null";
   int[] field3483;
   int field3492 = -1;
   int[] field3467;
   public int field3464;
   public int field3470 = 1;
   public int field3469 = -1;
   public int field3472 = -1;
   public int field3491 = -1;
   public int field3471 = -1;
   public String[] field3480 = new String[5];
   int field3461 = 128;
   short[] field3479;
   public boolean field3481 = true;
   int field3478 = 128;
   short[] field3484;
   short[] field3477;
   public int field3473 = -1;
   short[] field3495;
   public int field3474 = -1;
   public int field3482 = -1;
   public boolean field3485 = false;
   public int field3475 = -1;
   int field3486 = 0;
   int field3487 = 0;
   public int field3488 = -1;
   public int field3489 = 32;
   public boolean field3493 = true;
   public boolean field3494 = true;
   public boolean field3462 = false;


   public final class266 method4766(int var1) {
      int var2 = -1;
      if(this.field3460 != -1) {
         var2 = class95.method2197(this.field3460, -557813600);
      } else if(this.field3492 != -1) {
         var2 = class221.field2526[this.field3492];
      }

      int var3;
      if(var2 >= 0 && var2 < this.field3490.length - 1) {
         var3 = this.field3490[var2];
      } else {
         var3 = this.field3490[this.field3490.length - 1];
      }

      return var3 != -1?class237.method4201(var3, 1032462264):null;
   }

   void method4763(class309 var1, int var2, int var3) {
      int var4;
      int var5;
      if(var2 == 1) {
         var4 = var1.readUnsignedByte((byte)88);
         this.field3467 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3467[var5] = var1.writeShort((byte)52);
         }
      } else if(var2 == 2) {
         this.field3465 = var1.method5667(-244741907);
      } else if(var2 == 12) {
         this.field3470 = var1.readUnsignedByte((byte)96);
      } else if(var2 == 13) {
         this.field3469 = var1.writeShort((byte)67);
      } else if(var2 == 14) {
         this.field3472 = var1.writeShort((byte)18);
      } else if(var2 == 15) {
         this.field3491 = var1.writeShort((byte)77);
      } else if(var2 == 16) {
         this.field3471 = var1.writeShort((byte)15);
      } else if(var2 == 17) {
         this.field3472 = var1.writeShort((byte)10);
         this.field3473 = var1.writeShort((byte)32);
         this.field3474 = var1.writeShort((byte)88);
         this.field3475 = var1.writeShort((byte)31);
      } else if(var2 >= 30 && var2 < 35) {
         this.field3480[var2 - 30] = var1.method5667(-1591817336);
         if(this.field3480[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3480[var2 - 30] = null;
         }
      } else if(var2 == 40) {
         var4 = var1.readUnsignedByte((byte)23);
         this.field3479 = new short[var4];
         this.field3477 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3479[var5] = (short)var1.writeShort((byte)30);
            this.field3477[var5] = (short)var1.writeShort((byte)117);
         }
      } else if(var2 == 41) {
         var4 = var1.readUnsignedByte((byte)85);
         this.field3484 = new short[var4];
         this.field3495 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3484[var5] = (short)var1.writeShort((byte)109);
            this.field3495[var5] = (short)var1.writeShort((byte)40);
         }
      } else if(var2 == 60) {
         var4 = var1.readUnsignedByte((byte)102);
         this.field3483 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3483[var5] = var1.writeShort((byte)95);
         }
      } else if(var2 == 93) {
         this.field3481 = false;
      } else if(var2 == 95) {
         this.field3482 = var1.writeShort((byte)2);
      } else if(var2 == 97) {
         this.field3461 = var1.writeShort((byte)84);
      } else if(var2 == 98) {
         this.field3478 = var1.writeShort((byte)40);
      } else if(var2 == 99) {
         this.field3485 = true;
      } else if(var2 == 100) {
         this.field3486 = var1.readByte(-1390163968);
      } else if(var2 == 101) {
         this.field3487 = var1.readByte(-2032382086) * 5;
      } else if(var2 == 102) {
         this.field3488 = var1.writeShort((byte)110);
      } else if(var2 == 103) {
         this.field3489 = var1.writeShort((byte)20);
      } else if(var2 != 106 && var2 != 118) {
         if(var2 == 107) {
            this.field3493 = false;
         } else if(var2 == 109) {
            this.field3494 = false;
         } else if(var2 == 111) {
            this.field3462 = true;
         } else if(var2 == 249) {
            this.field3496 = class246.method4375(var1, this.field3496, -2002622706);
         }
      } else {
         this.field3460 = var1.writeShort((byte)66);
         if(this.field3460 == '\uffff') {
            this.field3460 = -1;
         }

         this.field3492 = var1.writeShort((byte)73);
         if(this.field3492 == '\uffff') {
            this.field3492 = -1;
         }

         var4 = -1;
         if(var2 == 118) {
            var4 = var1.writeShort((byte)10);
            if(var4 == '\uffff') {
               var4 = -1;
            }
         }

         var5 = var1.readUnsignedByte((byte)118);
         this.field3490 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field3490[var6] = var1.writeShort((byte)69);
            if(this.field3490[var6] == '\uffff') {
               this.field3490[var6] = -1;
            }
         }

         this.field3490[var5 + 1] = var4;
      }

   }

   public final class130 method4760(byte var1) {
      if(this.field3490 != null) {
         class266 var2 = this.method4766(-2051225078);
         return var2 == null?null:var2.method4760((byte)4);
      } else if(this.field3483 == null) {
         return null;
      } else {
         boolean var6 = false;

         for(int var3 = 0; var3 < this.field3483.length; ++var3) {
            if(!field3466.method4238(this.field3483[var3], 0, 1414084694)) {
               var6 = true;
            }
         }

         if(var6) {
            return null;
         } else {
            class130[] var7 = new class130[this.field3483.length];

            for(int var4 = 0; var4 < this.field3483.length; ++var4) {
               var7[var4] = class130.method2865(field3466, this.field3483[var4], 0);
            }

            class130 var8;
            if(var7.length == 1) {
               var8 = var7[0];
            } else {
               var8 = new class130(var7, var7.length);
            }

            int var5;
            if(this.field3479 != null) {
               for(var5 = 0; var5 < this.field3479.length; ++var5) {
                  var8.method2879(this.field3479[var5], this.field3477[var5]);
               }
            }

            if(this.field3484 != null) {
               for(var5 = 0; var5 < this.field3484.length; ++var5) {
                  var8.method2931(this.field3484[var5], this.field3495[var5]);
               }
            }

            return var8;
         }
      }
   }

   public final class136 method4764(class268 var1, int var2, class268 var3, int var4, int var5) {
      if(this.field3490 != null) {
         class266 var13 = this.method4766(-2051225078);
         return var13 == null?null:var13.method4764(var1, var2, var3, var4, -1096410565);
      } else {
         class136 var6 = (class136)field3463.method3418((long)this.field3464);
         if(var6 == null) {
            boolean var7 = false;

            for(int var8 = 0; var8 < this.field3467.length; ++var8) {
               if(!field3466.method4238(this.field3467[var8], 0, 1838243967)) {
                  var7 = true;
               }
            }

            if(var7) {
               return null;
            }

            class130[] var9 = new class130[this.field3467.length];

            int var10;
            for(var10 = 0; var10 < this.field3467.length; ++var10) {
               var9[var10] = class130.method2865(field3466, this.field3467[var10], 0);
            }

            class130 var12;
            if(var9.length == 1) {
               var12 = var9[0];
            } else {
               var12 = new class130(var9, var9.length);
            }

            if(this.field3479 != null) {
               for(var10 = 0; var10 < this.field3479.length; ++var10) {
                  var12.method2879(this.field3479[var10], this.field3477[var10]);
               }
            }

            if(this.field3484 != null) {
               for(var10 = 0; var10 < this.field3484.length; ++var10) {
                  var12.method2931(this.field3484[var10], this.field3495[var10]);
               }
            }

            var6 = var12.method2886(this.field3486 + 64, this.field3487 + 850, -30, -50, -30);
            field3463.method3424(var6, (long)this.field3464);
         }

         class136 var11;
         if(var1 != null && var3 != null) {
            var11 = var1.method4823(var6, var2, var3, var4, (byte)1);
         } else if(var1 != null) {
            var11 = var1.method4820(var6, var2, 1747843246);
         } else if(var3 != null) {
            var11 = var3.method4820(var6, var4, 1747843246);
         } else {
            var11 = var6.method2971(true);
         }

         if(this.field3461 != 128 || this.field3478 != 128) {
            var11.method2967(this.field3461, this.field3478, this.field3461);
         }

         return var11;
      }
   }

   void method4765(byte var1) {}

   void method4762(class309 var1, byte var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)58);
         if(var3 == 0) {
            return;
         }

         this.method4763(var1, var3, 269088844);
      }
   }

   public boolean method4767(int var1) {
      if(this.field3490 == null) {
         return true;
      } else {
         int var2 = -1;
         if(this.field3460 != -1) {
            var2 = class95.method2197(this.field3460, -1437370955);
         } else if(this.field3492 != -1) {
            var2 = class221.field2526[this.field3492];
         }

         return var2 >= 0 && var2 < this.field3490.length?this.field3490[var2] != -1:this.field3490[this.field3490.length - 1] != -1;
      }
   }

   public String method4769(int var1, String var2, byte var3) {
      return class9.method122(this.field3496, var1, var2, (short)171);
   }

   public int method4771(int var1, int var2, short var3) {
      class325 var5 = this.field3496;
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
}
