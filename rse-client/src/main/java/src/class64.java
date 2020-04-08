package src;

public final class class64 {

   static int[][][] field549 = new int[4][105][105];
   static byte[][][] field535 = new byte[4][104][104];
   static int field537 = 99;
   static final int[] field544 = new int[]{1, 2, 4, 8};
   static final int[] field542 = new int[]{16, 32, 64, 128};
   static final int[] field541 = new int[]{1, 0, -1, 0};
   static class107 field553;
   static final int[] field547 = new int[]{0, -1, 0, 1};
   static final int[] field546 = new int[]{1, -1, -1, 1};
   static final int[] field552 = new int[]{-1, -1, 1, 1};
   static int field550 = (int)(Math.random() * 17.0D) - 8;
   static int field548 = (int)(Math.random() * 33.0D) - 16;
   static byte[][][] field538;
   static byte[][][] field539;
   static byte[][][] field540;
   static int[][] field545;
   static int[] field554;


   public static int method1217(CharSequence var0, int var1) {
      return class105.method2379(var0, 10, true, (byte)26);
   }

   static boolean method1239(class263 var0, int var1) {
      if(var0.field3385 != null) {
         int[] var2 = var0.field3385;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            int var4 = var2[var3];
            class263 var5 = class33.method435(var4, 1650295452);
            if(var5.field3372 != -1) {
               return true;
            }
         }
      } else if(var0.field3372 != -1) {
         return true;
      }

      return false;
   }

   static final int method1227(class226 var0, int var1, int var2) {
      if(var0.field2650 != null && var1 < var0.field2650.length) {
         try {
            int[] var3 = var0.field2650[var1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;

            while(true) {
               int var7 = var3[var5++];
               int var8 = 0;
               byte var9 = 0;
               if(var7 == 0) {
                  return var4;
               }

               if(var7 == 1) {
                  var8 = client.field686[var3[var5++]];
               }

               if(var7 == 2) {
                  var8 = client.field752[var3[var5++]];
               }

               if(var7 == 3) {
                  var8 = client.field821[var3[var5++]];
               }

               int var10;
               class226 var11;
               int var12;
               int var13;
               if(var7 == 4) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class208.method3898(var10, (byte)-28);
                  var12 = var3[var5++];
                  if(var12 != -1 && (!class30.method373(var12, (byte)-23).field3412 || client.field683)) {
                     for(var13 = 0; var13 < var11.field2671.length; ++var13) {
                        if(var12 + 1 == var11.field2671[var13]) {
                           var8 += var11.field2692[var13];
                        }
                     }
                  }
               }

               if(var7 == 5) {
                  var8 = class221.field2526[var3[var5++]];
               }

               if(var7 == 6) {
                  var8 = class230.field2747[client.field752[var3[var5++]] - 1];
               }

               if(var7 == 7) {
                  var8 = class221.field2526[var3[var5++]] * 100 / '\ub71b';
               }

               if(var7 == 8) {
                  var8 = class311.field3717.field650;
               }

               if(var7 == 9) {
                  for(var10 = 0; var10 < 25; ++var10) {
                     if(class230.field2744[var10]) {
                        var8 += client.field752[var10];
                     }
                  }
               }

               if(var7 == 10) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class208.method3898(var10, (byte)-3);
                  var12 = var3[var5++];
                  if(var12 != -1 && (!class30.method373(var12, (byte)8).field3412 || client.field683)) {
                     for(var13 = 0; var13 < var11.field2671.length; ++var13) {
                        if(var12 + 1 == var11.field2671[var13]) {
                           var8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if(var7 == 11) {
                  var8 = client.field847;
               }

               if(var7 == 12) {
                  var8 = client.field848;
               }

               if(var7 == 13) {
                  var10 = class221.field2526[var3[var5++]];
                  int var14 = var3[var5++];
                  var8 = (var10 & 1 << var14) != 0?1:0;
               }

               if(var7 == 14) {
                  var10 = var3[var5++];
                  var8 = class95.method2197(var10, -1452430964);
               }

               if(var7 == 15) {
                  var9 = 1;
               }

               if(var7 == 16) {
                  var9 = 2;
               }

               if(var7 == 17) {
                  var9 = 3;
               }

               if(var7 == 18) {
                  var8 = (class311.field3717.field983 >> 7) + class69.field590 * 731242929;
               }

               if(var7 == 19) {
                  var8 = (class311.field3717.field973 >> 7) + class89.field1152 * 1825982697;
               }

               if(var7 == 20) {
                  var8 = var3[var5++];
               }

               if(var9 == 0) {
                  if(var6 == 0) {
                     var4 += var8;
                  }

                  if(var6 == 1) {
                     var4 -= var8;
                  }

                  if(var6 == 2 && var8 != 0) {
                     var4 /= var8;
                  }

                  if(var6 == 3) {
                     var4 *= var8;
                  }

                  var6 = 0;
               } else {
                  var6 = var9;
               }
            }
         } catch (Exception var15) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   static final int method1238(byte var0) {
      if(class76.field676.field1077) {
         return class71.field610;
      } else {
         int var1 = class277.method5013(class31.field220, class200.field2372, class71.field610, -185640258);
         return var1 - class14.field63 < 800 && (field535[class71.field610][class31.field220 >> 7][class200.field2372 >> 7] & 4) != 0?class71.field610:3;
      }
   }
}
