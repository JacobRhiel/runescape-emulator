package src;

public final class class313 {

   static class312 field3769 = new class312();


   public static int method5831(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      class312 var5 = field3769;
      synchronized(field3769) {
         field3769.field3734 = var2;
         field3769.field3731 = var4;
         field3769.field3733 = var0;
         field3769.field3730 = 0;
         field3769.field3735 = var1;
         field3769.field3740 = 0;
         field3769.field3739 = 0;
         field3769.field3732 = 0;
         field3769.field3724 = 0;
         method5810(field3769);
         var1 -= field3769.field3735;
         field3769.field3734 = null;
         field3769.field3733 = null;
         return var1;
      }
   }

   static void method5810(class312 var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field3741 = 1;
      if(class24.field142 == null) {
         class24.field142 = new int[var0.field3741 * 100000];
      }

      boolean var26 = true;

      while(var26) {
         byte var1 = method5812(var0);
         if(var1 == 23) {
            return;
         }

         var1 = method5812(var0);
         var1 = method5812(var0);
         var1 = method5812(var0);
         var1 = method5812(var0);
         var1 = method5812(var0);
         var1 = method5812(var0);
         var1 = method5812(var0);
         var1 = method5812(var0);
         var1 = method5812(var0);
         var1 = method5822(var0);
         if(var1 != 0) {
            ;
         }

         var0.field3742 = 0;
         var1 = method5812(var0);
         var0.field3742 = var0.field3742 << 8 | var1 & 255;
         var1 = method5812(var0);
         var0.field3742 = var0.field3742 << 8 | var1 & 255;
         var1 = method5812(var0);
         var0.field3742 = var0.field3742 << 8 | var1 & 255;

         int var36;
         for(var36 = 0; var36 < 16; ++var36) {
            var1 = method5822(var0);
            if(var1 == 1) {
               var0.field3747[var36] = true;
            } else {
               var0.field3747[var36] = false;
            }
         }

         for(var36 = 0; var36 < 256; ++var36) {
            var0.field3749[var36] = false;
         }

         int var37;
         for(var36 = 0; var36 < 16; ++var36) {
            if(var0.field3747[var36]) {
               for(var37 = 0; var37 < 16; ++var37) {
                  var1 = method5822(var0);
                  if(var1 == 1) {
                     var0.field3749[var37 + var36 * 16] = true;
                  }
               }
            }
         }

         method5809(var0);
         int var39 = var0.field3748 + 2;
         int var40 = method5814(3, var0);
         int var41 = method5814(15, var0);
         var36 = 0;

         while(var36 < var41) {
            var37 = 0;

            while(true) {
               var1 = method5822(var0);
               if(var1 == 0) {
                  var0.field3746[var36] = (byte)var37;
                  ++var36;
                  break;
               }

               ++var37;
            }
         }

         byte[] var27 = new byte[6];

         byte var29;
         for(var29 = 0; var29 < var40; var27[var29] = var29++) {
            ;
         }

         for(var36 = 0; var36 < var41; ++var36) {
            var29 = var0.field3746[var36];

            byte var28;
            for(var28 = var27[var29]; var29 > 0; --var29) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.field3754[var36] = var28;
         }

         int var38;
         for(var38 = 0; var38 < var40; ++var38) {
            int var50 = method5814(5, var0);
            var36 = 0;

            while(var36 < var39) {
               while(true) {
                  var1 = method5822(var0);
                  if(var1 == 0) {
                     var0.field3755[var38][var36] = (byte)var50;
                     ++var36;
                     break;
                  }

                  var1 = method5822(var0);
                  if(var1 == 0) {
                     ++var50;
                  } else {
                     --var50;
                  }
               }
            }
         }

         for(var38 = 0; var38 < var40; ++var38) {
            byte var2 = 32;
            byte var3 = 0;

            for(var36 = 0; var36 < var39; ++var36) {
               if(var0.field3755[var38][var36] > var3) {
                  var3 = var0.field3755[var38][var36];
               }

               if(var0.field3755[var38][var36] < var2) {
                  var2 = var0.field3755[var38][var36];
               }
            }

            method5817(var0.field3757[var38], var0.field3758[var38], var0.field3759[var38], var0.field3755[var38], var2, var3, var39);
            var0.field3760[var38] = var2;
         }

         int var42 = var0.field3748 + 1;
         int var43 = -1;
         byte var44 = 0;

         for(var36 = 0; var36 <= 255; ++var36) {
            var0.field3745[var36] = 0;
         }

         int var56 = 4095;

         int var35;
         int var55;
         for(var35 = 15; var35 >= 0; --var35) {
            for(var55 = 15; var55 >= 0; --var55) {
               var0.field3752[var56] = (byte)(var55 + var35 * 16);
               --var56;
            }

            var0.field3753[var35] = var56 + 1;
         }

         int var47 = 0;
         byte var54;
         if(var44 == 0) {
            ++var43;
            var44 = 50;
            var54 = var0.field3754[var43];
            var22 = var0.field3760[var54];
            var23 = var0.field3757[var54];
            var25 = var0.field3759[var54];
            var24 = var0.field3758[var54];
         }

         int var45 = var44 - 1;
         int var51 = var22;

         int var52;
         byte var53;
         for(var52 = method5814(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
            ++var51;
            var53 = method5822(var0);
         }

         int var46 = var25[var52 - var24[var51]];

         while(var46 != var42) {
            if(var46 != 0 && var46 != 1) {
               int var33 = var46 - 1;
               int var30;
               if(var33 < 16) {
                  var30 = var0.field3753[0];

                  for(var1 = var0.field3752[var30 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var30 + var33;
                     var0.field3752[var34] = var0.field3752[var34 - 1];
                     var0.field3752[var34 - 1] = var0.field3752[var34 - 2];
                     var0.field3752[var34 - 2] = var0.field3752[var34 - 3];
                     var0.field3752[var34 - 3] = var0.field3752[var34 - 4];
                  }

                  while(var33 > 0) {
                     var0.field3752[var30 + var33] = var0.field3752[var30 + var33 - 1];
                     --var33;
                  }

                  var0.field3752[var30] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  var30 = var0.field3753[var31] + var32;

                  for(var1 = var0.field3752[var30]; var30 > var0.field3753[var31]; --var30) {
                     var0.field3752[var30] = var0.field3752[var30 - 1];
                  }

                  ++var0.field3753[var31];

                  while(var31 > 0) {
                     --var0.field3753[var31];
                     var0.field3752[var0.field3753[var31]] = var0.field3752[var0.field3753[var31 - 1] + 16 - 1];
                     --var31;
                  }

                  --var0.field3753[0];
                  var0.field3752[var0.field3753[0]] = var1;
                  if(var0.field3753[0] == 0) {
                     var56 = 4095;

                     for(var35 = 15; var35 >= 0; --var35) {
                        for(var55 = 15; var55 >= 0; --var55) {
                           var0.field3752[var56] = var0.field3752[var0.field3753[var35] + var55];
                           --var56;
                        }

                        var0.field3753[var35] = var56 + 1;
                     }
                  }
               }

               ++var0.field3745[var0.field3751[var1 & 255] & 255];
               class24.field142[var47] = var0.field3751[var1 & 255] & 255;
               ++var47;
               if(var45 == 0) {
                  ++var43;
                  var45 = 50;
                  var54 = var0.field3754[var43];
                  var22 = var0.field3760[var54];
                  var23 = var0.field3757[var54];
                  var25 = var0.field3759[var54];
                  var24 = var0.field3758[var54];
               }

               --var45;
               var51 = var22;

               for(var52 = method5814(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
                  ++var51;
                  var53 = method5822(var0);
               }

               var46 = var25[var52 - var24[var51]];
            } else {
               int var48 = -1;
               int var49 = 1;

               do {
                  if(var46 == 0) {
                     var48 += var49;
                  } else if(var46 == 1) {
                     var48 += var49 * 2;
                  }

                  var49 *= 2;
                  if(var45 == 0) {
                     ++var43;
                     var45 = 50;
                     var54 = var0.field3754[var43];
                     var22 = var0.field3760[var54];
                     var23 = var0.field3757[var54];
                     var25 = var0.field3759[var54];
                     var24 = var0.field3758[var54];
                  }

                  --var45;
                  var51 = var22;

                  for(var52 = method5814(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
                     ++var51;
                     var53 = method5822(var0);
                  }

                  var46 = var25[var52 - var24[var51]];
               } while(var46 == 0 || var46 == 1);

               ++var48;
               var1 = var0.field3751[var0.field3752[var0.field3753[0]] & 255];

               for(var0.field3745[var1 & 255] += var48; var48 > 0; --var48) {
                  class24.field142[var47] = var1 & 255;
                  ++var47;
               }
            }
         }

         var0.field3738 = 0;
         var0.field3727 = 0;
         var0.field3728[0] = 0;

         for(var36 = 1; var36 <= 256; ++var36) {
            var0.field3728[var36] = var0.field3745[var36 - 1];
         }

         for(var36 = 1; var36 <= 256; ++var36) {
            var0.field3728[var36] += var0.field3728[var36 - 1];
         }

         for(var36 = 0; var36 < var47; ++var36) {
            var1 = (byte)(class24.field142[var36] & 255);
            class24.field142[var0.field3728[var1 & 255]] |= var36 << 8;
            ++var0.field3728[var1 & 255];
         }

         var0.field3743 = class24.field142[var0.field3742] >> 8;
         var0.field3736 = 0;
         var0.field3743 = class24.field142[var0.field3743];
         var0.field3744 = (byte)(var0.field3743 & 255);
         var0.field3743 >>= 8;
         ++var0.field3736;
         var0.field3761 = var47;
         method5811(var0);
         if(var0.field3761 + 1 == var0.field3736 && var0.field3738 == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }

   }

   static byte method5812(class312 var0) {
      return (byte)method5814(8, var0);
   }

   static int method5814(int var0, class312 var1) {
      while(var1.field3740 < var0) {
         var1.field3739 = var1.field3739 << 8 | var1.field3734[var1.field3731] & 255;
         var1.field3740 += 8;
         ++var1.field3731;
         ++var1.field3732;
         if(var1.field3732 == 0) {
            ;
         }
      }

      int var2 = var1.field3739 >> var1.field3740 - var0 & (1 << var0) - 1;
      var1.field3740 -= var0;
      return var2;
   }

   static byte method5822(class312 var0) {
      return (byte)method5814(1, var0);
   }

   static void method5809(class312 var0) {
      var0.field3748 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if(var0.field3749[var1]) {
            var0.field3751[var0.field3748] = (byte)var1;
            ++var0.field3748;
         }
      }

   }

   static void method5817(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if(var8 == var3[var9]) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   static void method5811(class312 var0) {
      byte var2 = var0.field3727;
      int var3 = var0.field3738;
      int var4 = var0.field3736;
      int var5 = var0.field3744;
      int[] var6 = class24.field142;
      int var7 = var0.field3743;
      byte[] var8 = var0.field3733;
      int var9 = var0.field3730;
      int var10 = var0.field3735;
      int var12 = var0.field3761 + 1;

      label61:
      while(true) {
         if(var3 > 0) {
            while(true) {
               if(var10 == 0) {
                  break label61;
               }

               if(var3 == 1) {
                  if(var10 == 0) {
                     var3 = 1;
                     break label61;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         while(var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            ++var4;
            if(var1 != var5) {
               var5 = var1;
               if(var10 == 0) {
                  var3 = 1;
                  break label61;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            } else {
               if(var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  ++var4;
                  if(var4 != var12) {
                     if(var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        ++var4;
                        if(var4 != var12) {
                           if(var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                           }
                        }
                     }
                  }
                  continue label61;
               }

               if(var10 == 0) {
                  var3 = 1;
                  break label61;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field3724;
      var0.field3724 += var10 - var10;
      if(var0.field3724 < var13) {
         ;
      }

      var0.field3727 = var2;
      var0.field3738 = var3;
      var0.field3736 = var4;
      var0.field3744 = var5;
      class24.field142 = var6;
      var0.field3743 = var7;
      var0.field3733 = var8;
      var0.field3730 = var9;
      var0.field3735 = var10;
   }
}
