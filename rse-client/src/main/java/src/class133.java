package src;

public class class133 extends class189 {

   static int[] field1647;
   int[] field1639;
   int[] field1637;
   boolean field1638;
   boolean field1646 = false;
   int field1643;
   int field1641;
   int field1644;
   int[] field1634;
   int[] field1640;
   int[] field1633;


   class133(class309 var1) {
      this.field1641 = var1.readShort((byte)84);
      this.field1638 = var1.readUnsignedByte((byte)39) == 1;
      int var2 = var1.readUnsignedByte((byte)125);
      if(var2 >= 1 && var2 <= 4) {
         this.field1639 = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field1639[var3] = var1.readShort((byte)36);
         }

         if(var2 > 1) {
            this.field1640 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field1640[var3] = var1.readUnsignedByte((byte)76);
            }
         }

         if(var2 > 1) {
            this.field1633 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field1633[var3] = var1.readUnsignedByte((byte)13);
            }
         }

         this.field1634 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field1634[var3] = var1.readInt(297718403);
         }

         this.field1643 = var1.readUnsignedByte((byte)69);
         this.field1644 = var1.readUnsignedByte((byte)61);
         this.field1637 = null;
      } else {
         throw new RuntimeException();
      }
   }

   void method2941() {
      this.field1637 = null;
   }

   boolean method2940(double var1, int var3, class243 var4) {
      int var5;
      for(var5 = 0; var5 < this.field1639.length; ++var5) {
         if(var4.method4225(this.field1639[var5], (byte)100) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field1637 = new int[var5];

      for(int var6 = 0; var6 < this.field1639.length; ++var6) {
         class333 var7 = class322.method5938(var4, this.field1639[var6], -1469260030);
         var7.method6156();
         byte[] var8 = var7.field3886;
         int[] var9 = var7.field3881;
         int var10 = this.field1634[var6];
         if((var10 & -16777216) == 16777216) {
            ;
         }

         if((var10 & -16777216) == 33554432) {
            ;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if(var14 >> 8 == (var14 & '\uffff')) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = class139.method3089(var9[var11], var1);
         }

         if(var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.field1640[var6 - 1];
         }

         if(var11 == 0) {
            if(var3 == var7.field3883) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.field1637[var12] = var9[var8[var12] & 255];
               }
            } else if(var7.field3883 == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field1637[var12++] = var9[var8[(var13 >> 1 << 6) + (var14 >> 1)] & 255];
                  }
               }
            } else {
               if(var7.field3883 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field1637[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if(var11 == 1) {
            ;
         }

         if(var11 == 2) {
            ;
         }

         if(var11 == 3) {
            ;
         }
      }

      return true;
   }

   void method2942(int var1) {
      if(this.field1637 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if(this.field1643 == 1 || this.field1643 == 3) {
            if(field1647 == null || field1647.length < this.field1637.length) {
               field1647 = new int[this.field1637.length];
            }

            if(this.field1637.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field1637.length;
            var4 = var2 * this.field1644 * var1;
            var5 = var3 - 1;
            if(this.field1643 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field1647[var6] = this.field1637[var7];
            }

            var10 = this.field1637;
            this.field1637 = field1647;
            field1647 = var10;
         }

         if(this.field1643 == 2 || this.field1643 == 4) {
            if(field1647 == null || field1647.length < this.field1637.length) {
               field1647 = new int[this.field1637.length];
            }

            if(this.field1637.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field1637.length;
            var4 = this.field1644 * var1;
            var5 = var2 - 1;
            if(this.field1643 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field1647[var8] = this.field1637[var9];
               }
            }

            var10 = this.field1637;
            this.field1637 = field1647;
            field1647 = var10;
         }

      }
   }
}
