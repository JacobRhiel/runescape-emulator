package src;

public class class212 extends class189 {

   class327 field2497;
   byte[] field2498;


   class212(class309 var1) {
      var1.field3710 = var1.field3709.length - 3;
      int var2 = var1.readUnsignedByte((byte)106);
      int var3 = var1.writeShort((byte)7);
      int var4 = var2 * 10 + 14;
      var1.field3710 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;

      int var14;
      int var15;
      while(var13 < var2) {
         var14 = -1;

         while(true) {
            var15 = var1.readUnsignedByte((byte)95);
            if(var15 != var14) {
               ++var4;
            }

            var14 = var15 & 15;
            if(var15 == 7) {
               ++var13;
               break;
            }

            if(var15 == 23) {
               ++var5;
            } else if(var14 == 0) {
               ++var7;
            } else if(var14 == 1) {
               ++var8;
            } else if(var14 == 2) {
               ++var6;
            } else if(var14 == 3) {
               ++var9;
            } else if(var14 == 4) {
               ++var10;
            } else if(var14 == 5) {
               ++var11;
            } else {
               if(var14 != 6) {
                  throw new RuntimeException();
               }

               ++var12;
            }
         }
      }

      var4 += var5 * 5;
      var4 += (var7 + var8 + var6 + var9 + var11) * 2;
      var4 = var4 + var10 + var12;
      var13 = var1.field3710;
      var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(var15 = 0; var15 < var14; ++var15) {
         var1.method5571(-1155800075);
      }

      var4 += var1.field3710 - var13;
      var15 = var1.field3710;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;

      int var29;
      for(var29 = 0; var29 < var6; ++var29) {
         var28 = var28 + var1.readUnsignedByte((byte)72) & 127;
         if(var28 != 0 && var28 != 32) {
            if(var28 == 1) {
               ++var16;
            } else if(var28 == 33) {
               ++var17;
            } else if(var28 == 7) {
               ++var18;
            } else if(var28 == 39) {
               ++var19;
            } else if(var28 == 10) {
               ++var20;
            } else if(var28 == 42) {
               ++var21;
            } else if(var28 == 99) {
               ++var22;
            } else if(var28 == 98) {
               ++var23;
            } else if(var28 == 101) {
               ++var24;
            } else if(var28 == 100) {
               ++var25;
            } else if(var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
               ++var27;
            } else {
               ++var26;
            }
         } else {
            ++var12;
         }
      }

      var29 = 0;
      int var30 = var1.field3710;
      var1.field3710 += var26;
      int var31 = var1.field3710;
      var1.field3710 += var11;
      int var32 = var1.field3710;
      var1.field3710 += var10;
      int var33 = var1.field3710;
      var1.field3710 += var9;
      int var34 = var1.field3710;
      var1.field3710 += var16;
      int var35 = var1.field3710;
      var1.field3710 += var18;
      int var36 = var1.field3710;
      var1.field3710 += var20;
      int var37 = var1.field3710;
      var1.field3710 += var7 + var8 + var11;
      int var38 = var1.field3710;
      var1.field3710 += var7;
      int var39 = var1.field3710;
      var1.field3710 += var27;
      int var40 = var1.field3710;
      var1.field3710 += var8;
      int var41 = var1.field3710;
      var1.field3710 += var17;
      int var42 = var1.field3710;
      var1.field3710 += var19;
      int var43 = var1.field3710;
      var1.field3710 += var21;
      int var44 = var1.field3710;
      var1.field3710 += var12;
      int var45 = var1.field3710;
      var1.field3710 += var9;
      int var46 = var1.field3710;
      var1.field3710 += var22;
      int var47 = var1.field3710;
      var1.field3710 += var23;
      int var48 = var1.field3710;
      var1.field3710 += var24;
      int var49 = var1.field3710;
      var1.field3710 += var25;
      int var50 = var1.field3710;
      var1.field3710 += var5 * 3;
      this.field2498 = new byte[var4];
      class309 var51 = new class309(this.field2498);
      var51.writeInt(1297377380, 747474969);
      var51.writeInt(6, 747474969);
      var51.writeShort(var2 > 1?1:0, (byte)-115);
      var51.writeShort(var2, (byte)-81);
      var51.writeShort(var3, (byte)-93);
      var1.field3710 = var13;
      int var52 = 0;
      int var53 = 0;
      int var54 = 0;
      int var55 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;
      int[] var59 = new int[128];
      var28 = 0;
      int var60 = 0;

      while(var60 < var2) {
         var51.writeInt(1297379947, 747474969);
         var51.field3710 += 4;
         int var61 = var51.field3710;
         int var62 = -1;

         while(true) {
            int var63 = var1.method5571(161953282);
            var51.method5546(var63, -2122558791);
            int var64 = var1.field3709[var29++] & 255;
            boolean var65 = var64 != var62;
            var62 = var64 & 15;
            if(var64 == 7) {
               if(var65) {
                  var51.readByte(255, 1258821856);
               }

               var51.readByte(47, 1258821856);
               var51.readByte(0, 1258821856);
               var51.method5707(var51.field3710 - var61, -788698367);
               ++var60;
               break;
            }

            if(var64 == 23) {
               if(var65) {
                  var51.readByte(255, 1258821856);
               }

               var51.readByte(81, 1258821856);
               var51.readByte(3, 1258821856);
               var51.readByte(var1.field3709[var50++], 1258821856);
               var51.readByte(var1.field3709[var50++], 1258821856);
               var51.readByte(var1.field3709[var50++], 1258821856);
            } else {
               var52 ^= var64 >> 4;
               if(var62 == 0) {
                  if(var65) {
                     var51.readByte(var52 + 144, 1258821856);
                  }

                  var53 += var1.field3709[var37++];
                  var54 += var1.field3709[var38++];
                  var51.readByte(var53 & 127, 1258821856);
                  var51.readByte(var54 & 127, 1258821856);
               } else if(var62 == 1) {
                  if(var65) {
                     var51.readByte(var52 + 128, 1258821856);
                  }

                  var53 += var1.field3709[var37++];
                  var55 += var1.field3709[var40++];
                  var51.readByte(var53 & 127, 1258821856);
                  var51.readByte(var55 & 127, 1258821856);
               } else if(var62 == 2) {
                  if(var65) {
                     var51.readByte(var52 + 176, 1258821856);
                  }

                  var28 = var28 + var1.field3709[var15++] & 127;
                  var51.readByte(var28, 1258821856);
                  byte var66;
                  if(var28 != 0 && var28 != 32) {
                     if(var28 == 1) {
                        var66 = var1.field3709[var34++];
                     } else if(var28 == 33) {
                        var66 = var1.field3709[var41++];
                     } else if(var28 == 7) {
                        var66 = var1.field3709[var35++];
                     } else if(var28 == 39) {
                        var66 = var1.field3709[var42++];
                     } else if(var28 == 10) {
                        var66 = var1.field3709[var36++];
                     } else if(var28 == 42) {
                        var66 = var1.field3709[var43++];
                     } else if(var28 == 99) {
                        var66 = var1.field3709[var46++];
                     } else if(var28 == 98) {
                        var66 = var1.field3709[var47++];
                     } else if(var28 == 101) {
                        var66 = var1.field3709[var48++];
                     } else if(var28 == 100) {
                        var66 = var1.field3709[var49++];
                     } else if(var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                        var66 = var1.field3709[var39++];
                     } else {
                        var66 = var1.field3709[var30++];
                     }
                  } else {
                     var66 = var1.field3709[var44++];
                  }

                  int var67 = var66 + var59[var28];
                  var59[var28] = var67;
                  var51.readByte(var67 & 127, 1258821856);
               } else if(var62 == 3) {
                  if(var65) {
                     var51.readByte(var52 + 224, 1258821856);
                  }

                  var56 += var1.field3709[var45++];
                  var56 += var1.field3709[var33++] << 7;
                  var51.readByte(var56 & 127, 1258821856);
                  var51.readByte(var56 >> 7 & 127, 1258821856);
               } else if(var62 == 4) {
                  if(var65) {
                     var51.readByte(var52 + 208, 1258821856);
                  }

                  var57 += var1.field3709[var32++];
                  var51.readByte(var57 & 127, 1258821856);
               } else if(var62 == 5) {
                  if(var65) {
                     var51.readByte(var52 + 160, 1258821856);
                  }

                  var53 += var1.field3709[var37++];
                  var58 += var1.field3709[var31++];
                  var51.readByte(var53 & 127, 1258821856);
                  var51.readByte(var58 & 127, 1258821856);
               } else {
                  if(var62 != 6) {
                     throw new RuntimeException();
                  }

                  if(var65) {
                     var51.readByte(var52 + 192, 1258821856);
                  }

                  var51.readByte(var1.field3709[var44++], 1258821856);
               }
            }
         }
      }

   }

   void method3986() {
      if(this.field2497 == null) {
         this.field2497 = new class327(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         class209 var4 = new class209(this.field2498);
         int var5 = var4.method3906();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            var4.method3907(var6);
            var4.method3910(var6);
            var4.method3944(var6);
         }

         while(true) {
            var6 = var4.method3902();
            int var7 = var4.field2476[var6];

            while(var7 == var4.field2476[var6]) {
               var4.method3907(var6);
               int var8 = var4.method3911(var6);
               if(var8 == 1) {
                  var4.method3909();
                  var4.method3944(var6);
                  if(var4.method3916()) {
                     return;
                  }
                  break;
               }

               int var9 = var8 & 240;
               int var10;
               int var11;
               int var12;
               if(var9 == 176) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var12 = var8 >> 16 & 127;
                  if(var11 == 0) {
                     var1[var10] = (var12 << 14) + (var1[var10] & -2080769);
                  }

                  if(var11 == 32) {
                     var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                  }
               }

               if(var9 == 192) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var2[var10] = var11 + var1[var10];
               }

               if(var9 == 144) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var12 = var8 >> 16 & 127;
                  if(var12 > 0) {
                     int var13 = var2[var10];
                     class186 var14 = (class186)this.field2497.method6010((long)var13);
                     if(var14 == null) {
                        var14 = new class186(new byte[128]);
                        this.field2497.method5997(var14, (long)var13);
                     }

                     var14.field2111[var11] = 1;
                  }
               }

               var4.method3910(var6);
               var4.method3944(var6);
            }
         }
      }
   }

   void method3987() {
      this.field2497 = null;
   }

   public static class212 method3993(class243 var0, int var1, int var2) {
      byte[] var3 = var0.method4224(var1, var2, (byte)-65);
      return var3 == null?null:new class212(new class309(var3));
   }
}
