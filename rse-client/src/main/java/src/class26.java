package src;

public class class26 {

   public static final class26 field159 = new class26(1, 0, 4);
   public static final class26 field151 = new class26(0, 1, 2);
   static int field157;
   public static final class26 field161 = new class26(2, 2, 0);
   static class333 field160;
   static int field158;
   final int field152;
   final int field153;
   final int field155;


   class26(int var1, int var2, int var3) {
      this.field153 = var1;
      this.field155 = var2;
      this.field152 = var3;
   }

   boolean method289(float var1, byte var2) {
      return var1 >= (float)this.field152;
   }

   static void method291(class226 var0, int var1, int var2, int var3) {
      if(var0.field2572 == 0) {
         var0.field2580 = var0.field2576;
      } else if(var0.field2572 == 1) {
         var0.field2580 = var0.field2576 + (var1 - var0.field2582) / 2;
      } else if(var0.field2572 == 2) {
         var0.field2580 = var1 - var0.field2582 - var0.field2576;
      } else if(var0.field2572 == 3) {
         var0.field2580 = var0.field2576 * var1 >> 14;
      } else if(var0.field2572 == 4) {
         var0.field2580 = (var0.field2576 * var1 >> 14) + (var1 - var0.field2582) / 2;
      } else {
         var0.field2580 = var1 - var0.field2582 - (var0.field2576 * var1 >> 14);
      }

      if(var0.field2573 == 0) {
         var0.field2653 = var0.field2594;
      } else if(var0.field2573 == 1) {
         var0.field2653 = (var2 - var0.field2642) / 2 + var0.field2594;
      } else if(var0.field2573 == 2) {
         var0.field2653 = var2 - var0.field2642 - var0.field2594;
      } else if(var0.field2573 == 3) {
         var0.field2653 = var2 * var0.field2594 >> 14;
      } else if(var0.field2573 == 4) {
         var0.field2653 = (var2 * var0.field2594 >> 14) + (var2 - var0.field2642) / 2;
      } else {
         var0.field2653 = var2 - var0.field2642 - (var2 * var0.field2594 >> 14);
      }

   }

   static class26[] method284(int var0) {
      return new class26[]{field161, field151, field159};
   }

   public static void method290(class243 var0, class243 var1, boolean var2, int var3) {
      class263.field3344 = var0;
      class263.field3345 = var1;
      class263.field3356 = var2;
   }

   static boolean method282(int var0, int var1) {
      return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
   }

   static final void method288(class226 var0, int var1, int var2, int var3) {
      if(var0.field2570 == 1) {
         class285.method5111(var0.field2690, "", 24, 0, 0, var0.field2567, (byte)55);
      }

      String var4;
      if(var0.field2570 == 2 && !client.field835) {
         var4 = class319.method5931(var0, (byte)56);
         if(var4 != null) {
            class285.method5111(var4, class297.method5314('\uff00', -645493497) + var0.field2689, 25, 0, -1, var0.field2567, (byte)99);
         }
      }

      if(var0.field2570 == 3) {
         class285.method5111("Close", "", 26, 0, 0, var0.field2567, (byte)32);
      }

      if(var0.field2570 == 4) {
         class285.method5111(var0.field2690, "", 28, 0, 0, var0.field2567, (byte)35);
      }

      if(var0.field2570 == 5) {
         class285.method5111(var0.field2690, "", 29, 0, 0, var0.field2567, (byte)110);
      }

      if(var0.field2570 == 6 && client.field882 == null) {
         class285.method5111(var0.field2690, "", 30, 0, -1, var0.field2567, (byte)107);
      }

      int var5;
      int var20;
      if(var0.field2569 == 2) {
         var20 = 0;

         for(var5 = 0; var5 < var0.field2642; ++var5) {
            for(int var6 = 0; var6 < var0.field2582; ++var6) {
               int var7 = (var0.field2634 + 32) * var6;
               int var8 = (var0.field2635 + 32) * var5;
               if(var20 < 20) {
                  var7 += var0.field2660[var20];
                  var8 += var0.field2637[var20];
               }

               if(var1 >= var7 && var2 >= var8 && var1 < var7 + 32 && var2 < var8 + 32) {
                  client.field791 = var20;
                  class183.field2106 = var0;
                  if(var0.field2671[var20] > 0) {
                     label321: {
                        class264 var9 = class30.method373(var0.field2671[var20] - 1, (byte)-47);
                        boolean var10;
                        int var11;
                        if(client.field833 == 1) {
                           var11 = class71.method1283(var0, -1254535205);
                           var10 = (var11 >> 30 & 1) != 0;
                           if(var10) {
                              if(var0.field2567 != class33.field243 || var20 != client.field957) {
                                 class285.method5111("Use", client.field933 + " " + "->" + " " + class297.method5314(16748608, -1969570384) + var9.field3397, 31, var9.field3403, var20, var0.field2567, (byte)67);
                              }
                              break label321;
                           }
                        }

                        if(client.field835) {
                           var11 = class71.method1283(var0, -1876350944);
                           var10 = (var11 >> 30 & 1) != 0;
                           if(var10) {
                              if((class43.field336 & 16) == 16) {
                                 class285.method5111(client.field838, client.field839 + " " + "->" + " " + class297.method5314(16748608, 1041664295) + var9.field3397, 32, var9.field3403, var20, var0.field2567, (byte)97);
                              }
                              break label321;
                           }
                        }

                        String[] var21 = var9.field3420;
                        var11 = -1;
                        boolean var12;
                        if(client.field826) {
                           var12 = client.field827 || class54.field426[81];
                           if(var12) {
                              var11 = var9.method4717(782275365);
                           }
                        }

                        int var13 = class71.method1283(var0, -1285382193);
                        var12 = (var13 >> 30 & 1) != 0;
                        if(var12) {
                           for(int var14 = 4; var14 >= 3; --var14) {
                              if(var14 != var11) {
                                 class68.method1272(var0, var9, var20, var14, false, 1190936651);
                              }
                           }
                        }

                        int var15 = class71.method1283(var0, -1605762522);
                        boolean var24 = (var15 >> 31 & 1) != 0;
                        if(var24) {
                           class285.method5111("Use", class297.method5314(16748608, 2110446145) + var9.field3397, 38, var9.field3403, var20, var0.field2567, (byte)74);
                        }

                        int var17 = class71.method1283(var0, -1870874649);
                        boolean var16 = (var17 >> 30 & 1) != 0;
                        int var18;
                        if(var16) {
                           for(var18 = 2; var18 >= 0; --var18) {
                              if(var18 != var11) {
                                 class68.method1272(var0, var9, var20, var18, false, 639074163);
                              }
                           }

                           if(var11 >= 0) {
                              class68.method1272(var0, var9, var20, var11, true, -577495719);
                           }
                        }

                        var21 = var0.field2574;
                        if(var21 != null) {
                           for(var18 = 4; var18 >= 0; --var18) {
                              if(var21[var18] != null) {
                                 byte var19 = 0;
                                 if(var18 == 0) {
                                    var19 = 39;
                                 }

                                 if(var18 == 1) {
                                    var19 = 40;
                                 }

                                 if(var18 == 2) {
                                    var19 = 41;
                                 }

                                 if(var18 == 3) {
                                    var19 = 42;
                                 }

                                 if(var18 == 4) {
                                    var19 = 43;
                                 }

                                 class285.method5111(var21[var18], class297.method5314(16748608, 1139869881) + var9.field3397, var19, var9.field3403, var20, var0.field2567, (byte)103);
                              }
                           }
                        }

                        class285.method5111("Examine", class297.method5314(16748608, -1895422594) + var9.field3397, 1005, var9.field3403, var20, var0.field2567, (byte)75);
                     }
                  }
               }

               ++var20;
            }
         }
      }

      if(var0.field2566) {
         if(client.field835) {
            if(class194.method3676(class71.method1283(var0, -1287061564), (byte)-67) && (class43.field336 & 32) == 32) {
               class285.method5111(client.field838, client.field839 + " " + "->" + " " + var0.field2593, 58, 0, var0.field2709, var0.field2567, (byte)125);
            }
         } else {
            for(var20 = 9; var20 >= 5; --var20) {
               String var22 = class217.method4015(var0, var20, 1493859077);
               if(var22 != null) {
                  class285.method5111(var22, var0.field2593, 1007, var20 + 1, var0.field2709, var0.field2567, (byte)30);
               }
            }

            var4 = class319.method5931(var0, (byte)126);
            if(var4 != null) {
               class285.method5111(var4, var0.field2593, 25, 0, var0.field2709, var0.field2567, (byte)123);
            }

            for(var5 = 4; var5 >= 0; --var5) {
               String var23 = class217.method4015(var0, var5, 1493859077);
               if(var23 != null) {
                  class65.method1244(var23, var0.field2593, 57, var5 + 1, var0.field2709, var0.field2567, var0.field2658, -1778070098);
               }
            }

            if(class81.method1925(class71.method1283(var0, -1437928327), (byte)1)) {
               class285.method5111("Continue", "", 30, 0, var0.field2709, var0.field2567, (byte)39);
            }
         }
      }

   }

   public static int method292(boolean var0, boolean var1, byte var2) {
      byte var3 = 0;
      int var4 = var3 + class246.field3167 + class246.field3169;
      return var4;
   }
}
