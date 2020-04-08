package src;

public class class121 {

   int[][] field1475;
   int field1478;
   int field1476;


   public class121(int var1, int var2) {
      if(var2 != var1) {
         int var3 = class201.method3742(var1, var2, (byte)-122);
         var1 /= var3;
         var2 /= var3;
         this.field1476 = var1;
         this.field1478 = var2;
         this.field1475 = new int[var1][14];

         for(int var4 = 0; var4 < var1; ++var4) {
            int[] var5 = this.field1475[var4];
            double var6 = 6.0D + (double)var4 / (double)var1;
            int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
            if(var8 < 0) {
               var8 = 0;
            }

            int var9 = (int)Math.ceil(var6 + 7.0D);
            if(var9 > 14) {
               var9 = 14;
            }

            for(double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
               double var12 = 3.141592653589793D * ((double)var8 - var6);
               double var14 = var10;
               if(var12 < -1.0E-4D || var12 > 1.0E-4D) {
                  var14 = var10 * (Math.sin(var12) / var12);
               }

               var14 *= 0.54D + 0.46D * Math.cos(((double)var8 - var6) * 0.2243994752564138D);
               var5[var8] = (int)Math.floor(65536.0D * var14 + 0.5D);
            }
         }

      }
   }

   byte[] method2628(byte[] var1, int var2) {
      if(this.field1475 != null) {
         int var3 = (int)((long)this.field1478 * (long)var1.length / (long)this.field1476) + 14;
         int[] var4 = new int[var3];
         int var5 = 0;
         int var6 = 0;

         int var7;
         for(var7 = 0; var7 < var1.length; ++var7) {
            byte var8 = var1[var7];
            int[] var9 = this.field1475[var6];

            int var10;
            for(var10 = 0; var10 < 14; ++var10) {
               var4[var5 + var10] += var9[var10] * var8;
            }

            var6 += this.field1478;
            var10 = var6 / this.field1476;
            var5 += var10;
            var6 -= var10 * this.field1476;
         }

         var1 = new byte[var3];

         for(var7 = 0; var7 < var3; ++var7) {
            int var11 = var4[var7] + '\u8000' >> 16;
            if(var11 < -128) {
               var1[var7] = -128;
            } else if(var11 > 127) {
               var1[var7] = 127;
            } else {
               var1[var7] = (byte)var11;
            }
         }
      }

      return var1;
   }

   int method2623(int var1, byte var2) {
      if(this.field1475 != null) {
         var1 = (int)((long)this.field1478 * (long)var1 / (long)this.field1476);
      }

      return var1;
   }

   int method2634(int var1, int var2) {
      if(this.field1475 != null) {
         var1 = (int)((long)var1 * (long)this.field1478 / (long)this.field1476) + 6;
      }

      return var1;
   }

   public static boolean method2621(long var0) {
      return var0 != 0L && !class229.method4188(var0);
   }

   public static String method2622(String var0, int var1) {
      int var2 = var0.length();
      char[] var3 = new char[var2];
      byte var4 = 2;

      for(int var5 = 0; var5 < var2; ++var5) {
         char var6 = var0.charAt(var5);
         if(var4 == 0) {
            var6 = Character.toLowerCase(var6);
         } else if(var4 == 2 || Character.isUpperCase(var6)) {
            var6 = class260.method4565(var6, (short)255);
         }

         if(Character.isLetter(var6)) {
            var4 = 0;
         } else if(var6 != 46 && var6 != 63 && var6 != 33) {
            if(Character.isSpaceChar(var6)) {
               if(var4 != 2) {
                  var4 = 1;
               }
            } else {
               var4 = 1;
            }
         } else {
            var4 = 2;
         }

         var3[var5] = var6;
      }

      return new String(var3);
   }

   static int method2635(int var0, class101 var1, boolean var2, int var3) {
      boolean var4 = true;
      class226 var5;
      if(var0 >= 2000) {
         var0 -= 1000;
         var5 = class208.method3898(class85.field1115[--class85.field1117], (byte)-22);
         var4 = false;
      } else {
         var5 = var2?class20.field115:class85.field1130;
      }

      int var12;
      if(var0 == 1300) {
         var12 = class85.field1115[--class85.field1117] - 1;
         if(var12 >= 0 && var12 <= 9) {
            var5.method4145(var12, class85.field1118[--class85.field1119], -207986115);
            return 1;
         } else {
            --class85.field1119;
            return 1;
         }
      } else {
         int var7;
         if(var0 == 1301) {
            class85.field1117 -= 2;
            var12 = class85.field1115[class85.field1117];
            var7 = class85.field1115[class85.field1117 + 1];
            var5.field2648 = class19.method224(var12, var7, 621920099);
            return 1;
         } else if(var0 == 1302) {
            var5.field2674 = class85.field1115[--class85.field1117] == 1;
            return 1;
         } else if(var0 == 1303) {
            var5.field2649 = class85.field1115[--class85.field1117];
            return 1;
         } else if(var0 == 1304) {
            var5.field2639 = class85.field1115[--class85.field1117];
            return 1;
         } else if(var0 == 1305) {
            var5.field2593 = class85.field1118[--class85.field1119];
            return 1;
         } else if(var0 == 1306) {
            var5.field2652 = class85.field1118[--class85.field1119];
            return 1;
         } else if(var0 == 1307) {
            var5.field2647 = null;
            return 1;
         } else if(var0 == 1308) {
            var5.field2658 = class85.field1115[--class85.field1117] == 1;
            return 1;
         } else if(var0 == 1309) {
            --class85.field1117;
            return 1;
         } else {
            int var8;
            byte[] var10;
            if(var0 != 1350) {
               byte var6;
               if(var0 == 1351) {
                  class85.field1117 -= 2;
                  var6 = 10;
                  var10 = new byte[]{(byte)class85.field1115[class85.field1117]};
                  byte[] var11 = new byte[]{(byte)class85.field1115[class85.field1117 + 1]};
                  class301.method5356(var5, var6, var10, var11, -481571835);
                  return 1;
               } else if(var0 == 1352) {
                  class85.field1117 -= 3;
                  var12 = class85.field1115[class85.field1117] - 1;
                  var7 = class85.field1115[class85.field1117 + 1];
                  var8 = class85.field1115[class85.field1117 + 2];
                  if(var12 >= 0 && var12 <= 9) {
                     class63.method1163(var5, var12, var7, var8, -951911792);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if(var0 == 1353) {
                  var6 = 10;
                  var7 = class85.field1115[--class85.field1117];
                  var8 = class85.field1115[--class85.field1117];
                  class63.method1163(var5, var6, var7, var8, -951911792);
                  return 1;
               } else if(var0 == 1354) {
                  --class85.field1117;
                  var12 = class85.field1115[class85.field1117] - 1;
                  if(var12 >= 0 && var12 <= 9) {
                     class195.method3679(var5, var12, (short)10820);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if(var0 == 1355) {
                  var6 = 10;
                  class195.method3679(var5, var6, (short)-23676);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var9 = null;
               var10 = null;
               if(var4) {
                  class85.field1117 -= 10;

                  for(var8 = 0; var8 < 10 && class85.field1115[var8 + class85.field1117] >= 0; var8 += 2) {
                     ;
                  }

                  if(var8 > 0) {
                     var9 = new byte[var8 / 2];
                     var10 = new byte[var8 / 2];

                     for(var8 -= 2; var8 >= 0; var8 -= 2) {
                        var9[var8 / 2] = (byte)class85.field1115[var8 + class85.field1117];
                        var10[var8 / 2] = (byte)class85.field1115[var8 + class85.field1117 + 1];
                     }
                  }
               } else {
                  class85.field1117 -= 2;
                  var9 = new byte[]{(byte)class85.field1115[class85.field1117]};
                  var10 = new byte[]{(byte)class85.field1115[class85.field1117 + 1]};
               }

               var8 = class85.field1115[--class85.field1117] - 1;
               if(var8 >= 0 && var8 <= 9) {
                  class301.method5356(var5, var8, var9, var10, -481571835);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }
}
