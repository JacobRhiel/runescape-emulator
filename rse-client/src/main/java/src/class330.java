package src;

public class class330 extends class184 {

   public static int field3862 = 0;
   public static int field3867 = 0;
   public static int[] field3864;
   public static int field3865;
   public static int field3863;
   public static int field3866 = 0;
   public static int field3868 = 0;


   public static void method6047(int[] var0) {
      var0[0] = field3867;
      var0[1] = field3862;
      var0[2] = field3868;
      var0[3] = field3866;
   }

   public static void method6043(int[] var0, int var1, int var2) {
      field3864 = var0;
      field3865 = var1;
      field3863 = var2;
      method6045(0, 0, var1, var2);
   }

   public static void method6059(int var0, int var1, int var2, int var3) {
      if(var0 >= field3867 && var0 < field3868) {
         if(var1 < field3862) {
            var2 -= field3862 - var1;
            var1 = field3862;
         }

         if(var2 + var1 > field3866) {
            var2 = field3866 - var1;
         }

         int var4 = var0 + field3865 * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            field3864[var4 + var5 * field3865] = var3;
         }

      }
   }

   public static void method6052(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < field3867) {
         var2 -= field3867 - var0;
         var0 = field3867;
      }

      if(var1 < field3862) {
         var3 -= field3862 - var1;
         var1 = field3862;
      }

      if(var0 + var2 > field3868) {
         var2 = field3868 - var0;
      }

      if(var3 + var1 > field3866) {
         var3 = field3866 - var1;
      }

      int var5 = field3865 - var2;
      int var6 = var0 + field3865 * var1;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field3864[var6++] = var4;
         }

         var6 += var5;
      }

   }

   public static void method6057(int var0, int var1, int var2, int var3) {
      if(var1 >= field3862 && var1 < field3866) {
         if(var0 < field3867) {
            var2 -= field3867 - var0;
            var0 = field3867;
         }

         if(var0 + var2 > field3868) {
            var2 = field3868 - var0;
         }

         int var4 = var0 + field3865 * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            field3864[var4 + var5] = var3;
         }

      }
   }

   public static void method6045(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > field3865) {
         var2 = field3865;
      }

      if(var3 > field3863) {
         var3 = field3863;
      }

      field3867 = var0;
      field3862 = var1;
      field3868 = var2;
      field3866 = var3;
   }

   public static void method6110(int var0, int var1, int var2, int var3, int var4) {
      if(var4 != 0) {
         if(var4 == 256) {
            method6062(var0, var1, var2, var3);
         } else {
            if(var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = var4 * (var3 & 255);
            int var12 = var1 - var2;
            if(var12 < field3862) {
               var12 = field3862;
            }

            int var13 = var2 + var1 + 1;
            if(var13 > field3866) {
               var13 = field3866;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if(var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 = var18 + var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if(var20 < field3867) {
                  var20 = field3867;
               }

               var21 = var0 + var16;
               if(var21 > field3868) {
                  var21 = field3868;
               }

               var22 = var20 + var14 * field3865;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = var5 * (field3864[var22] >> 16 & 255);
                  var10 = (field3864[var22] >> 8 & 255) * var5;
                  var11 = var5 * (field3864[var22] & 255);
                  var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
                  field3864[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var15 + var17 * var17;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if(var20 < field3867) {
                  var20 = field3867;
               }

               var21 = var0 + var16;
               if(var21 > field3868 - 1) {
                  var21 = field3868 - 1;
               }

               var22 = var20 + var14 * field3865;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = var5 * (field3864[var22] >> 16 & 255);
                  var10 = (field3864[var22] >> 8 & 255) * var5;
                  var11 = var5 * (field3864[var22] & 255);
                  var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
                  field3864[var22++] = var24;
               }

               ++var14;
               var19 = var19 + var17 + var17;
            }

         }
      }
   }

   public static void method6054(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if(var0 + var2 >= 0 && var3 + var1 >= 0) {
         if(var0 < field3865 && var1 < field3863) {
            int var9 = 0;
            int var10 = 0;
            if(var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if(var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if(var0 + var2 > field3865) {
               var2 = field3865 - var0;
            }

            if(var3 + var1 > field3863) {
               var3 = field3863 - var1;
            }

            int var11 = var6.length / var7;
            int var12 = field3865 - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if(var13 == 255 && var14 == 255) {
               var15 = var0 + var9 + (var10 + var1) * field3865;

               for(var16 = var10 + var1; var16 < var3 + var10 + var1; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if(var6[var19 + var18 * var7] != 0) {
                        field3864[var15++] = var5;
                     } else {
                        field3864[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            } else {
               var15 = var0 + var9 + (var10 + var1) * field3865;

               for(var16 = var10 + var1; var16 < var3 + var10 + var1; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if(var6[var19 + var18 * var7] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = field3864[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + (var21 * (var20 & '\uff00') + var22 * (var23 & '\uff00') & 16711680) >> 8;
                     field3864[var15++] = var24;
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   static void method6062(int var0, int var1, int var2, int var3) {
      if(var2 == 0) {
         method6060(var0, var1, var3);
      } else {
         if(var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if(var4 < field3862) {
            var4 = field3862;
         }

         int var5 = var2 + var1 + 1;
         if(var5 > field3866) {
            var5 = field3866;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if(var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 = var10 + var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if(var12 < field3867) {
               var12 = field3867;
            }

            var13 = var0 + var8;
            if(var13 > field3868) {
               var13 = field3868;
            }

            var14 = var12 + var6 * field3865;

            for(var15 = var12; var15 < var13; ++var15) {
               field3864[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var7 + var9 * var9;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if(var12 < field3867) {
               var12 = field3867;
            }

            var13 = var0 + var8;
            if(var13 > field3868 - 1) {
               var13 = field3868 - 1;
            }

            var14 = var12 + var6 * field3865;

            for(var15 = var12; var15 <= var13; ++var15) {
               field3864[var14++] = var3;
            }

            ++var6;
            var11 = var11 + var9 + var9;
         }

      }
   }

   public static void method6044() {
      field3867 = 0;
      field3862 = 0;
      field3868 = field3865;
      field3866 = field3863;
   }

   public static void method6051(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 < field3867) {
         var2 -= field3867 - var0;
         var0 = field3867;
      }

      if(var1 < field3862) {
         var3 -= field3862 - var1;
         var1 = field3862;
      }

      if(var0 + var2 > field3868) {
         var2 = field3868 - var0;
      }

      if(var3 + var1 > field3866) {
         var3 = field3866 - var1;
      }

      var4 = (var5 * (var4 & 16711935) >> 8 & 16711935) + (var5 * (var4 & '\uff00') >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = field3865 - var2;
      int var8 = var0 + field3865 * var1;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field3864[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + (var6 * (var11 & '\uff00') >> 8 & '\uff00');
            field3864[var8++] = var11 + var4;
         }

         var8 += var7;
      }

   }

   public static void method6137(int var0, int var1, int var2, int var3, int var4) {
      method6057(var0, var1, var2, var4);
      method6057(var0, var3 + var1 - 1, var2, var4);
      method6059(var0, var1, var3, var4);
      method6059(var0 + var2 - 1, var1, var3, var4);
   }

   static void method6060(int var0, int var1, int var2) {
      if(var0 >= field3867 && var1 >= field3862 && var0 < field3868 && var1 < field3866) {
         field3864[var0 + field3865 * var1] = var2;
      }
   }

   public static void method6048(int[] var0) {
      field3867 = var0[0];
      field3862 = var0[1];
      field3868 = var0[2];
      field3866 = var0[3];
   }

   public static void method6053(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if(var0 < field3867) {
            var2 -= field3867 - var0;
            var0 = field3867;
         }

         if(var1 < field3862) {
            var6 += (field3862 - var1) * var7;
            var3 -= field3862 - var1;
            var1 = field3862;
         }

         if(var0 + var2 > field3868) {
            var2 = field3868 - var0;
         }

         if(var3 + var1 > field3866) {
            var3 = field3866 - var1;
         }

         int var8 = field3865 - var2;
         int var9 = var0 + field3865 * var1;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = (var12 * (var5 & 16711935) + var11 * (var4 & 16711935) & -16711936) + (var12 * (var5 & '\uff00') + var11 * (var4 & '\uff00') & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               field3864[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   public static void method6101(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + field3865 * var1;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            field3864[var6++] = var2;
         }

         var5 += field3865;
      }

   }

   public static void method6056(int var0, int var1, int var2, int var3, int var4, int var5) {
      method6123(var0, var1, var2, var4, var5);
      method6123(var0, var3 + var1 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method6104(var0, var1 + 1, var3 - 2, var4, var5);
         method6104(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   public static void method6061(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if(var3 == 0) {
         if(var2 >= 0) {
            method6057(var0, var1, var2 + 1, var4);
         } else {
            method6057(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if(var2 == 0) {
         if(var3 >= 0) {
            method6059(var0, var1, var3 + 1, var4);
         } else {
            method6059(var0, var3 + var1, -var3 + 1, var4);
         }

      } else {
         if(var3 + var2 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if(var2 > var3) {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if(var0 < field3867) {
               var1 += var5 * (field3867 - var0);
               var0 = field3867;
            }

            if(var2 >= field3868) {
               var2 = field3868 - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if(var6 >= field3862 && var6 < field3866) {
                  field3864[var0 + var6 * field3865] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += '\u8000';
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if(var1 < field3862) {
               var0 += (field3862 - var1) * var5;
               var1 = field3862;
            }

            if(var3 >= field3866) {
               var3 = field3866 - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if(var6 >= field3867 && var6 < field3868) {
                  field3864[var6 + field3865 * var1] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   public static void method6077(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if(var0 < field3867) {
            var2 -= field3867 - var0;
            var0 = field3867;
         }

         if(var1 < field3862) {
            var8 += (field3862 - var1) * var9;
            var3 -= field3862 - var1;
            var1 = field3862;
         }

         if(var0 + var2 > field3868) {
            var2 = field3868 - var0;
         }

         if(var3 + var1 > field3866) {
            var3 = field3866 - var1;
         }

         int var10 = field3865 - var2;
         int var11 = var0 + field3865 * var1;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var13 * var6 + var14 * var7 & '\uff00') >>> 8;
            if(var15 == 0) {
               var11 += field3865;
               var8 += var9;
            } else {
               int var16 = (var14 * (var5 & 16711935) + var13 * (var4 & 16711935) & -16711936) + (var14 * (var5 & '\uff00') + var13 * (var4 & '\uff00') & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + (var15 * (var16 & '\uff00') >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = field3864[var11];
                  if(var20 == 0) {
                     field3864[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + (var17 * (var20 & '\uff00') >> 8 & '\uff00');
                     field3864[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   public static void method6066(int var0, int var1, int var2, int var3) {
      if(field3867 < var0) {
         field3867 = var0;
      }

      if(field3862 < var1) {
         field3862 = var1;
      }

      if(field3868 > var2) {
         field3868 = var2;
      }

      if(field3866 > var3) {
         field3866 = var3;
      }

   }

   static void method6123(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= field3862 && var1 < field3866) {
         if(var0 < field3867) {
            var2 -= field3867 - var0;
            var0 = field3867;
         }

         if(var0 + var2 > field3868) {
            var2 = field3868 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var12 = var0 + field3865 * var1;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = var5 * (field3864[var12] >> 16 & 255);
            int var10 = (field3864[var12] >> 8 & 255) * var5;
            int var11 = var5 * (field3864[var12] & 255);
            int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
            field3864[var12++] = var14;
         }

      }
   }

   static void method6104(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= field3867 && var0 < field3868) {
         if(var1 < field3862) {
            var2 -= field3862 - var1;
            var1 = field3862;
         }

         if(var2 + var1 > field3866) {
            var2 = field3866 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var12 = var0 + field3865 * var1;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = var5 * (field3864[var12] >> 16 & 255);
            int var10 = (field3864[var12] >> 8 & 255) * var5;
            int var11 = var5 * (field3864[var12] & 255);
            int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
            field3864[var12] = var14;
            var12 += field3865;
         }

      }
   }

   public static void method6049() {
      int var0 = 0;

      int var1;
      for(var1 = field3865 * field3863 - 7; var0 < var1; field3864[var0++] = 0) {
         field3864[var0++] = 0;
         field3864[var0++] = 0;
         field3864[var0++] = 0;
         field3864[var0++] = 0;
         field3864[var0++] = 0;
         field3864[var0++] = 0;
         field3864[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; field3864[var0++] = 0) {
         ;
      }

   }
}
