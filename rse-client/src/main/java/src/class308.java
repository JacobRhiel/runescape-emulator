package src;

public class class308 extends class309 {

   static final int[] field3707 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   class337 field3706;
   int field3705;


   public class308(int var1) {
      super(var1);
   }

   public boolean method5497(byte var1) {
      int var2 = super.field3709[super.field3710] - this.field3706.method6327(-1112251479) & 255;
      return var2 >= 128;
   }

   public void method5490(class337 var1, int var2) {
      this.field3706 = var1;
   }

   public void method5491(int var1, int var2) {
      super.field3709[++super.field3710 - 1] = (byte)(var1 + this.field3706.method6325(-1944633806));
   }

   public void method5489(byte[] var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < var3; ++var5) {
         var1[var5 + var2] = (byte)(super.field3709[++super.field3710 - 1] - this.field3706.method6325(-1888197199));
      }

   }

   public int method5494(int var1) {
      int var2 = super.field3709[++super.field3710 - 1] - this.field3706.method6325(-2021370116) & 255;
      return var2 < 128?var2:(var2 - 128 << 8) + (super.field3709[++super.field3710 - 1] - this.field3706.method6325(-2146474965) & 255);
   }

   public void method5496(byte var1) {
      this.field3705 = super.field3710 * 8;
   }

   public void method5498(int var1) {
      super.field3710 = (this.field3705 + 7) / 8;
   }

   public int method5495(int var1, byte var2) {
      int var3 = this.field3705 >> 3;
      int var4 = 8 - (this.field3705 & 7);
      int var5 = 0;

      for(this.field3705 += var1; var1 > var4; var4 = 8) {
         var5 += (super.field3709[var3++] & field3707[var4]) << var1 - var4;
         var1 -= var4;
      }

      if(var4 == var1) {
         var5 += super.field3709[var3] & field3707[var4];
      } else {
         var5 += super.field3709[var3] >> var4 - var1 & field3707[var1];
      }

      return var5;
   }

   public int method5511(int var1) {
      return super.field3709[++super.field3710 - 1] - this.field3706.method6325(-1989629227) & 255;
   }

   public int method5488(int var1, byte var2) {
      return var1 * 8 - this.field3705;
   }

   public void method5525(int[] var1, int var2) {
      this.field3706 = new class337(var1);
   }

   static final void method5527(int var0, int var1, int var2, int var3, int var4, int var5, class142 var6, class181 var7, short var8) {
      if(!client.field684 || (class64.field535[0][var1][var2] & 2) != 0 || (class64.field535[var0][var1][var2] & 16) == 0) {
         if(var0 < class64.field537) {
            class64.field537 = var0;
         }

         class263 var9 = class33.method435(var3, 1650295452);
         int var10;
         int var11;
         if(var4 != 1 && var4 != 3) {
            var10 = var9.field3359;
            var11 = var9.field3360;
         } else {
            var10 = var9.field3360;
            var11 = var9.field3359;
         }

         int var12;
         int var13;
         if(var10 + var1 <= 104) {
            var12 = (var10 >> 1) + var1;
            var13 = (var10 + 1 >> 1) + var1;
         } else {
            var12 = var1;
            var13 = var1 + 1;
         }

         int var14;
         int var15;
         if(var11 + var2 <= 104) {
            var14 = (var11 >> 1) + var2;
            var15 = var2 + (var11 + 1 >> 1);
         } else {
            var14 = var2;
            var15 = var2 + 1;
         }

         int[][] var16 = class64.field549[var0];
         int var17 = var16[var13][var15] + var16[var12][var15] + var16[var13][var14] + var16[var12][var14] >> 2;
         int var18 = (var1 << 7) + (var10 << 6);
         int var19 = (var2 << 7) + (var11 << 6);
         long var20 = class337.method6337(var1, var2, 2, var9.field3363 == 0, var3, 1987085511);
         int var22 = var5 + (var4 << 6);
         if(var9.field3371 == 1) {
            var22 += 256;
         }

         int var24;
         int var25;
         if(var9.method4646(1998255719)) {
            class84 var23 = new class84();
            var23.field1096 = var0;
            var23.field1099 = var1 * 128;
            var23.field1098 = var2 * 128;
            var24 = var9.field3359;
            var25 = var9.field3360;
            if(var4 == 1 || var4 == 3) {
               var24 = var9.field3360;
               var25 = var9.field3359;
            }

            var23.field1110 = (var24 + var1) * 128;
            var23.field1100 = (var25 + var2) * 128;
            var23.field1102 = var9.field3350;
            var23.field1106 = var9.field3388 * 128;
            var23.field1104 = var9.field3390;
            var23.field1105 = var9.field3366;
            var23.field1095 = var9.field3392;
            if(var9.field3385 != null) {
               var23.field1109 = var9;
               var23.method2007((byte)29);
            }

            class84.field1097.method4952(var23);
            if(var23.field1095 != null) {
               var23.field1107 = var23.field1104 + (int)(Math.random() * (double)(var23.field1105 - var23.field1104));
            }
         }

         Object var35;
         if(var5 == 22) {
            if(!client.field684 || var9.field3363 != 0 || var9.field3361 == 1 || var9.field3382) {
               if(var9.field3367 == -1 && var9.field3385 == null) {
                  var35 = var9.method4654(22, var4, var16, var18, var17, var19, -1946830797);
               } else {
                  var35 = new class102(var3, 22, var4, var0, var1, var2, var9.field3367, true, (class144)null);
               }

               var6.method3162(var0, var1, var2, var17, (class144)var35, var20, var22);
               if(var9.field3361 == 1 && var7 != null) {
                  var7.method3615(var1, var2, -88147521);
               }

            }
         } else if(var5 != 10 && var5 != 11) {
            if(var5 >= 12) {
               if(var9.field3367 == -1 && var9.field3385 == null) {
                  var35 = var9.method4654(var5, var4, var16, var18, var17, var19, 627533210);
               } else {
                  var35 = new class102(var3, var5, var4, var0, var1, var2, var9.field3367, true, (class144)null);
               }

               var6.method3173(var0, var1, var2, var17, 1, 1, (class144)var35, 0, var20, var22);
               if(var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                  class51.field404[var0][var1][var2] |= 2340;
               }

               if(var9.field3361 != 0 && var7 != null) {
                  var7.method3613(var1, var2, var10, var11, var9.field3384, (byte)2);
               }

            } else if(var5 == 0) {
               if(var9.field3367 == -1 && var9.field3385 == null) {
                  var35 = var9.method4654(0, var4, var16, var18, var17, var19, 835428851);
               } else {
                  var35 = new class102(var3, 0, var4, var0, var1, var2, var9.field3367, true, (class144)null);
               }

               var6.method3269(var0, var1, var2, var17, (class144)var35, (class144)null, class64.field544[var4], 0, var20, var22);
               if(var4 == 0) {
                  if(var9.field3375) {
                     class117.field1462[var0][var1][var2] = 50;
                     class117.field1462[var0][var1][var2 + 1] = 50;
                  }

                  if(var9.field3343) {
                     class51.field404[var0][var1][var2] |= 585;
                  }
               } else if(var4 == 1) {
                  if(var9.field3375) {
                     class117.field1462[var0][var1][var2 + 1] = 50;
                     class117.field1462[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if(var9.field3343) {
                     class51.field404[var0][var1][var2 + 1] |= 1170;
                  }
               } else if(var4 == 2) {
                  if(var9.field3375) {
                     class117.field1462[var0][var1 + 1][var2] = 50;
                     class117.field1462[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if(var9.field3343) {
                     class51.field404[var0][var1 + 1][var2] |= 585;
                  }
               } else if(var4 == 3) {
                  if(var9.field3375) {
                     class117.field1462[var0][var1][var2] = 50;
                     class117.field1462[var0][var1 + 1][var2] = 50;
                  }

                  if(var9.field3343) {
                     class51.field404[var0][var1][var2] |= 1170;
                  }
               }

               if(var9.field3361 != 0 && var7 != null) {
                  var7.method3612(var1, var2, var5, var4, var9.field3384, -1240663333);
               }

               if(var9.field3393 != 16) {
                  var6.method3196(var0, var1, var2, var9.field3393);
               }

            } else if(var5 == 1) {
               if(var9.field3367 == -1 && var9.field3385 == null) {
                  var35 = var9.method4654(1, var4, var16, var18, var17, var19, -886354811);
               } else {
                  var35 = new class102(var3, 1, var4, var0, var1, var2, var9.field3367, true, (class144)null);
               }

               var6.method3269(var0, var1, var2, var17, (class144)var35, (class144)null, class64.field542[var4], 0, var20, var22);
               if(var9.field3375) {
                  if(var4 == 0) {
                     class117.field1462[var0][var1][var2 + 1] = 50;
                  } else if(var4 == 1) {
                     class117.field1462[var0][var1 + 1][var2 + 1] = 50;
                  } else if(var4 == 2) {
                     class117.field1462[var0][var1 + 1][var2] = 50;
                  } else if(var4 == 3) {
                     class117.field1462[var0][var1][var2] = 50;
                  }
               }

               if(var9.field3361 != 0 && var7 != null) {
                  var7.method3612(var1, var2, var5, var4, var9.field3384, -1240663333);
               }

            } else {
               int var29;
               if(var5 == 2) {
                  var29 = var4 + 1 & 3;
                  Object var30;
                  Object var31;
                  if(var9.field3367 == -1 && var9.field3385 == null) {
                     var30 = var9.method4654(2, var4 + 4, var16, var18, var17, var19, 963529990);
                     var31 = var9.method4654(2, var29, var16, var18, var17, var19, -1398848171);
                  } else {
                     var30 = new class102(var3, 2, var4 + 4, var0, var1, var2, var9.field3367, true, (class144)null);
                     var31 = new class102(var3, 2, var29, var0, var1, var2, var9.field3367, true, (class144)null);
                  }

                  var6.method3269(var0, var1, var2, var17, (class144)var30, (class144)var31, class64.field544[var4], class64.field544[var29], var20, var22);
                  if(var9.field3343) {
                     if(var4 == 0) {
                        class51.field404[var0][var1][var2] |= 585;
                        class51.field404[var0][var1][1 + var2] |= 1170;
                     } else if(var4 == 1) {
                        class51.field404[var0][var1][var2 + 1] |= 1170;
                        class51.field404[var0][var1 + 1][var2] |= 585;
                     } else if(var4 == 2) {
                        class51.field404[var0][var1 + 1][var2] |= 585;
                        class51.field404[var0][var1][var2] |= 1170;
                     } else if(var4 == 3) {
                        class51.field404[var0][var1][var2] |= 1170;
                        class51.field404[var0][var1][var2] |= 585;
                     }
                  }

                  if(var9.field3361 != 0 && var7 != null) {
                     var7.method3612(var1, var2, var5, var4, var9.field3384, -1240663333);
                  }

                  if(var9.field3393 != 16) {
                     var6.method3196(var0, var1, var2, var9.field3393);
                  }

               } else if(var5 == 3) {
                  if(var9.field3367 == -1 && var9.field3385 == null) {
                     var35 = var9.method4654(3, var4, var16, var18, var17, var19, -1736886624);
                  } else {
                     var35 = new class102(var3, 3, var4, var0, var1, var2, var9.field3367, true, (class144)null);
                  }

                  var6.method3269(var0, var1, var2, var17, (class144)var35, (class144)null, class64.field542[var4], 0, var20, var22);
                  if(var9.field3375) {
                     if(var4 == 0) {
                        class117.field1462[var0][var1][var2 + 1] = 50;
                     } else if(var4 == 1) {
                        class117.field1462[var0][var1 + 1][var2 + 1] = 50;
                     } else if(var4 == 2) {
                        class117.field1462[var0][var1 + 1][var2] = 50;
                     } else if(var4 == 3) {
                        class117.field1462[var0][var1][var2] = 50;
                     }
                  }

                  if(var9.field3361 != 0 && var7 != null) {
                     var7.method3612(var1, var2, var5, var4, var9.field3384, -1240663333);
                  }

               } else if(var5 == 9) {
                  if(var9.field3367 == -1 && var9.field3385 == null) {
                     var35 = var9.method4654(var5, var4, var16, var18, var17, var19, 1055971867);
                  } else {
                     var35 = new class102(var3, var5, var4, var0, var1, var2, var9.field3367, true, (class144)null);
                  }

                  var6.method3173(var0, var1, var2, var17, 1, 1, (class144)var35, 0, var20, var22);
                  if(var9.field3361 != 0 && var7 != null) {
                     var7.method3613(var1, var2, var10, var11, var9.field3384, (byte)2);
                  }

                  if(var9.field3393 != 16) {
                     var6.method3196(var0, var1, var2, var9.field3393);
                  }

               } else if(var5 == 4) {
                  if(var9.field3367 == -1 && var9.field3385 == null) {
                     var35 = var9.method4654(4, var4, var16, var18, var17, var19, 107372713);
                  } else {
                     var35 = new class102(var3, 4, var4, var0, var1, var2, var9.field3367, true, (class144)null);
                  }

                  var6.method3285(var0, var1, var2, var17, (class144)var35, (class144)null, class64.field544[var4], 0, 0, 0, var20, var22);
               } else {
                  long var32;
                  Object var34;
                  if(var5 == 5) {
                     var29 = 16;
                     var32 = var6.method3189(var0, var1, var2);
                     if(var32 != 0L) {
                        var29 = class33.method435(class31.method387(var32), 1650295452).field3393;
                     }

                     if(var9.field3367 == -1 && var9.field3385 == null) {
                        var34 = var9.method4654(4, var4, var16, var18, var17, var19, -2033514584);
                     } else {
                        var34 = new class102(var3, 4, var4, var0, var1, var2, var9.field3367, true, (class144)null);
                     }

                     var6.method3285(var0, var1, var2, var17, (class144)var34, (class144)null, class64.field544[var4], 0, var29 * class64.field541[var4], var29 * class64.field547[var4], var20, var22);
                  } else if(var5 == 6) {
                     var29 = 8;
                     var32 = var6.method3189(var0, var1, var2);
                     if(0L != var32) {
                        var29 = class33.method435(class31.method387(var32), 1650295452).field3393 / 2;
                     }

                     if(var9.field3367 == -1 && var9.field3385 == null) {
                        var34 = var9.method4654(4, var4 + 4, var16, var18, var17, var19, -55288057);
                     } else {
                        var34 = new class102(var3, 4, var4 + 4, var0, var1, var2, var9.field3367, true, (class144)null);
                     }

                     var6.method3285(var0, var1, var2, var17, (class144)var34, (class144)null, 256, var4, var29 * class64.field546[var4], var29 * class64.field552[var4], var20, var22);
                  } else if(var5 == 7) {
                     var24 = var4 + 2 & 3;
                     if(var9.field3367 == -1 && var9.field3385 == null) {
                        var35 = var9.method4654(4, var24 + 4, var16, var18, var17, var19, -1618065812);
                     } else {
                        var35 = new class102(var3, 4, var24 + 4, var0, var1, var2, var9.field3367, true, (class144)null);
                     }

                     var6.method3285(var0, var1, var2, var17, (class144)var35, (class144)null, 256, var24, 0, 0, var20, var22);
                  } else if(var5 == 8) {
                     var29 = 8;
                     var32 = var6.method3189(var0, var1, var2);
                     if(var32 != 0L) {
                        var29 = class33.method435(class31.method387(var32), 1650295452).field3393 / 2;
                     }

                     int var28 = var4 + 2 & 3;
                     Object var27;
                     if(var9.field3367 == -1 && var9.field3385 == null) {
                        var34 = var9.method4654(4, var4 + 4, var16, var18, var17, var19, -1670419069);
                        var27 = var9.method4654(4, var28 + 4, var16, var18, var17, var19, -1869260594);
                     } else {
                        var34 = new class102(var3, 4, var4 + 4, var0, var1, var2, var9.field3367, true, (class144)null);
                        var27 = new class102(var3, 4, var28 + 4, var0, var1, var2, var9.field3367, true, (class144)null);
                     }

                     var6.method3285(var0, var1, var2, var17, (class144)var34, (class144)var27, 256, var4, var29 * class64.field546[var4], var29 * class64.field552[var4], var20, var22);
                  }
               }
            }
         } else {
            if(var9.field3367 == -1 && var9.field3385 == null) {
               var35 = var9.method4654(10, var4, var16, var18, var17, var19, -557802915);
            } else {
               var35 = new class102(var3, 10, var4, var0, var1, var2, var9.field3367, true, (class144)null);
            }

            if(var35 != null && var6.method3173(var0, var1, var2, var17, var10, var11, (class144)var35, var5 == 11?256:0, var20, var22) && var9.field3375) {
               var24 = 15;
               if(var35 instanceof class136) {
                  var24 = ((class136)var35).method2979() / 4;
                  if(var24 > 30) {
                     var24 = 30;
                  }
               }

               for(var25 = 0; var25 <= var10; ++var25) {
                  for(int var26 = 0; var26 <= var11; ++var26) {
                     if(var24 > class117.field1462[var0][var25 + var1][var26 + var2]) {
                        class117.field1462[var0][var25 + var1][var26 + var2] = (byte)var24;
                     }
                  }
               }
            }

            if(var9.field3361 != 0 && var7 != null) {
               var7.method3613(var1, var2, var10, var11, var9.field3384, (byte)2);
            }

         }
      }
   }
}
