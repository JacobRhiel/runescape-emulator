package src;

import java.awt.*;

public class class81 {

   static Font field1071;
   int field1055 = 0;
   int[] field1074;
   int[] field1062;
   int[] field1057;
   int[] field1069;
   int[] field1059 = new int[256];
   int field1063 = 0;
   int[] field1065;
   int field1073 = 0;
   int field1060 = 0;
   int field1066 = 0;
   int[] field1064;
   int[] field1070;
   int field1072 = 0;
   class333[] field1067;
   int[] field1068;


   class81(class333[] var1) {
      this.field1067 = var1;
      this.method1921(-542018665);
   }

   void method1921(int var1) {
      this.field1062 = new int[256];

      int var2;
      for(var2 = 0; var2 < 64; ++var2) {
         this.field1062[var2] = var2 * 262144;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1062[var2 + 64] = var2 * 1024 + 16711680;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1062[var2 + 128] = var2 * 4 + 16776960;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1062[var2 + 192] = 16777215;
      }

      this.field1065 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1065[var2] = var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1065[var2 + 64] = var2 * 4 + '\uff00';
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1065[var2 + 128] = var2 * 262144 + '\uffff';
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1065[var2 + 192] = 16777215;
      }

      this.field1064 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1064[var2] = var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1064[var2 + 64] = var2 * 262144 + 255;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1064[var2 + 128] = var2 * 1024 + 16711935;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field1064[var2 + 192] = 16777215;
      }

      this.field1074 = new int[256];
      this.field1055 = 0;
      this.field1069 = new int['\u8000'];
      this.field1070 = new int['\u8000'];
      this.method1903((class333)null, -61779781);
      this.field1057 = new int['\u8000'];
      this.field1068 = new int['\u8000'];
   }

   final void method1901(int var1, int[] var2, int var3) {
      int var4 = this.field1074.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         if(var1 > 768) {
            this.field1074[var5] = this.method1926(this.field1062[var5], var2[var5], 1024 - var1, 743870455);
         } else if(var1 > 256) {
            this.field1074[var5] = var2[var5];
         } else {
            this.field1074[var5] = this.method1926(var2[var5], this.field1062[var5], 256 - var1, 743870455);
         }
      }

   }

   final void method1902(int var1, int var2) {
      int var3 = 0;

      for(int var4 = 1; var4 < 255; ++var4) {
         int var5 = (256 - var4) * this.field1059[var4] / 256;
         int var6 = var5 + var1;
         int var7 = 0;
         int var8 = 128;
         if(var6 < 0) {
            var7 = -var6;
            var6 = 0;
         }

         if(var6 + 128 >= class206.field2411.field3870) {
            var8 = class206.field2411.field3870 - var6;
         }

         int var9 = var6 + (var4 + 8) * class206.field2411.field3870;
         var3 += var7;

         for(int var10 = var7; var10 < var8; ++var10) {
            int var11 = this.field1057[var3++];
            int var12 = var9 % class330.field3865;
            if(var11 != 0 && var12 >= class330.field3867 && var12 < class330.field3868) {
               int var13 = var11;
               int var14 = 256 - var11;
               var11 = this.field1074[var11];
               int var15 = class206.field2411.field3872[var9];
               class206.field2411.field3872[var9++] = -16777216 | ((var11 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + (var14 * (var15 & '\uff00') + var13 * (var11 & '\uff00') & 16711680) >> 8;
            } else {
               ++var9;
            }
         }

         var3 += 128 - var8;
      }

   }

   final int method1926(int var1, int var2, int var3, int var4) {
      int var5 = 256 - var3;
      return (var3 * (var2 & '\uff00') + var5 * (var1 & '\uff00') & 16711680) + (var5 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
   }

   final void method1898(int var1, int var2) {
      this.field1055 += 128 * var1;
      int var3;
      if(this.field1055 > this.field1069.length) {
         this.field1055 -= this.field1069.length;
         var3 = (int)(Math.random() * 12.0D);
         this.method1903(this.field1067[var3], -61779781);
      }

      var3 = 0;
      int var4 = var1 * 128;
      int var5 = (256 - var1) * 128;

      int var7;
      for(int var6 = 0; var6 < var5; ++var6) {
         var7 = this.field1057[var3 + var4] - this.field1069[var3 + this.field1055 & this.field1069.length - 1] * var1 / 6;
         if(var7 < 0) {
            var7 = 0;
         }

         this.field1057[var3++] = var7;
      }

      byte var16 = 10;
      var7 = 128 - var16;

      int var8;
      int var11;
      for(var8 = 256 - var1; var8 < 256; ++var8) {
         int var9 = var8 * 128;

         for(int var10 = 0; var10 < 128; ++var10) {
            var11 = (int)(Math.random() * 100.0D);
            if(var11 < 50 && var10 > var16 && var10 < var7) {
               this.field1057[var9 + var10] = 255;
            } else {
               this.field1057[var9 + var10] = 0;
            }
         }
      }

      if(this.field1063 > 0) {
         this.field1063 -= var1 * 4;
      }

      if(this.field1066 > 0) {
         this.field1066 -= var1 * 4;
      }

      if(this.field1063 == 0 && this.field1066 == 0) {
         var8 = (int)(Math.random() * (double)(2000 / var1));
         if(var8 == 0) {
            this.field1063 = 1024;
         }

         if(var8 == 1) {
            this.field1066 = 1024;
         }
      }

      for(var8 = 0; var8 < 256 - var1; ++var8) {
         this.field1059[var8] = this.field1059[var8 + var1];
      }

      for(var8 = 256 - var1; var8 < 256; ++var8) {
         this.field1059[var8] = (int)(Math.sin((double)this.field1060 / 14.0D) * 16.0D + Math.sin((double)this.field1060 / 15.0D) * 14.0D + Math.sin((double)this.field1060 / 16.0D) * 12.0D);
         ++this.field1060;
      }

      this.field1072 += var1;
      var8 = ((client.field689 & 1) + var1) / 2;
      if(var8 > 0) {
         short var17 = 128;
         byte var18 = 2;
         var11 = 128 - var18 - var18;

         int var12;
         int var13;
         int var14;
         for(var12 = 0; var12 < this.field1072 * 100; ++var12) {
            var13 = (int)(Math.random() * (double)var11) + var18;
            var14 = (int)(Math.random() * (double)var17) + var17;
            this.field1057[var13 + (var14 << 7)] = 192;
         }

         this.field1072 = 0;

         int var15;
         for(var12 = 0; var12 < 256; ++var12) {
            var13 = 0;
            var14 = var12 * 128;

            for(var15 = -var8; var15 < 128; ++var15) {
               if(var15 + var8 < 128) {
                  var13 += this.field1057[var8 + var14 + var15];
               }

               if(var15 - (var8 + 1) >= 0) {
                  var13 -= this.field1057[var14 + var15 - (var8 + 1)];
               }

               if(var15 >= 0) {
                  this.field1068[var15 + var14] = var13 / (var8 * 2 + 1);
               }
            }
         }

         for(var12 = 0; var12 < 128; ++var12) {
            var13 = 0;

            for(var14 = -var8; var14 < 256; ++var14) {
               var15 = var14 * 128;
               if(var14 + var8 < 256) {
                  var13 += this.field1068[var15 + var12 + var8 * 128];
               }

               if(var14 - (var8 + 1) >= 0) {
                  var13 -= this.field1068[var12 + var15 - (var8 + 1) * 128];
               }

               if(var14 >= 0) {
                  this.field1057[var15 + var12] = var13 / (var8 * 2 + 1);
               }
            }
         }
      }

   }

   final void method1905(int var1, int var2) {
      int var3 = this.field1074.length;
      if(this.field1063 > 0) {
         this.method1901(this.field1063, this.field1065, 1854456839);
      } else if(this.field1066 > 0) {
         this.method1901(this.field1066, this.field1064, 1786403761);
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            this.field1074[var4] = this.field1062[var4];
         }
      }

      this.method1902(var1, -1017589056);
   }

   final void method1903(class333 var1, int var2) {
      int var3;
      for(var3 = 0; var3 < this.field1069.length; ++var3) {
         this.field1069[var3] = 0;
      }

      int var4;
      for(var3 = 0; var3 < 5000; ++var3) {
         var4 = (int)(Math.random() * 128.0D * 256.0D);
         this.field1069[var4] = (int)(Math.random() * 256.0D);
      }

      int var5;
      int var6;
      for(var3 = 0; var3 < 20; ++var3) {
         for(var4 = 1; var4 < 255; ++var4) {
            for(var5 = 1; var5 < 127; ++var5) {
               var6 = var5 + (var4 << 7);
               this.field1070[var6] = (this.field1069[var6 + 128] + this.field1069[var6 - 128] + this.field1069[var6 + 1] + this.field1069[var6 - 1]) / 4;
            }
         }

         int[] var9 = this.field1069;
         this.field1069 = this.field1070;
         this.field1070 = var9;
      }

      if(var1 != null) {
         var3 = 0;

         for(var4 = 0; var4 < var1.field3885; ++var4) {
            for(var5 = 0; var5 < var1.field3883; ++var5) {
               if(var1.field3886[var3++] != 0) {
                  var6 = var5 + var1.field3884 + 16;
                  int var7 = var4 + var1.field3880 + 16;
                  int var8 = var6 + (var7 << 7);
                  this.field1069[var8] = 0;
               }
            }
         }
      }

   }

   void method1918(int var1, int var2, byte var3) {
      if(this.field1057 == null) {
         this.method1921(-542018665);
      }

      if(this.field1073 == 0) {
         this.field1073 = var2;
      }

      int var4 = var2 - this.field1073;
      if(var4 >= 256) {
         var4 = 0;
      }

      this.field1073 = var2;
      if(var4 > 0) {
         this.method1898(var4, 2136809713);
      }

      this.method1905(var1, -803188196);
   }

   void method1895(int var1) {
      this.field1062 = null;
      this.field1065 = null;
      this.field1064 = null;
      this.field1074 = null;
      this.field1069 = null;
      this.field1070 = null;
      this.field1057 = null;
      this.field1068 = null;
      this.field1055 = 0;
      this.field1072 = 0;
   }

   public static boolean method1900(int var0, int var1) {
      if(class226.field2583[var0]) {
         return true;
      } else if(!class226.field2559.method4250(var0, (byte)-121)) {
         return false;
      } else {
         int var2 = class226.field2559.method4246(var0, (byte)26);
         if(var2 == 0) {
            class226.field2583[var0] = true;
            return true;
         } else {
            if(class226.field2693[var0] == null) {
               class226.field2693[var0] = new class226[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if(class226.field2693[var0][var3] == null) {
                  byte[] var4 = class226.field2559.method4224(var0, var3, (byte)-57);
                  if(var4 != null) {
                     class226.field2693[var0][var3] = new class226();
                     class226.field2693[var0][var3].field2567 = var3 + (var0 << 16);
                     if(var4[0] == -1) {
                        class226.field2693[var0][var3].method4153(new class309(var4), 1292756714);
                     } else {
                        class226.field2693[var0][var3].method4109(new class309(var4), (byte)-113);
                     }
                  }
               }
            }

            class226.field2583[var0] = true;
            return true;
         }
      }
   }

   static void method1924(int var0, int var1) {
      for(class188 var2 = (class188)client.field750.method5995(); var2 != null; var2 = (class188)client.field750.method6003()) {
         if((var2.field2116 >> 48 & 65535L) == (long)var0) {
            var2.method3657();
         }
      }

   }

   public static boolean method1925(int var0, byte var1) {
      return (var0 & 1) != 0;
   }
}
