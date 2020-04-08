package src;

public class class240 implements class203 {

   public static final class240 field3104 = new class240("runescape", "RuneScape", 0);
   public static final class240 field3105 = new class240("stellardawn", "Stellar Dawn", 1);
   public static final class240 field3108 = new class240("game3", "Game 3", 2);
   public static final class240 field3111 = new class240("oldscape", "RuneScape 2007", 5);
   public static final class240 field3106 = new class240("game4", "Game 4", 3);
   public static final class240 field3107 = new class240("game5", "Game 5", 4);
   final int field3110;
   public final String field3109;


   class240(String var1, String var2, int var3) {
      this.field3109 = var1;
      this.field3110 = var3;
   }

   public int vmethod6149(byte var1) {
      return this.field3110;
   }

   static final void method4213(class226[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      class330.method6045(var2, var3, var4, var5);
      class139.method3133();

      for(int var10 = 0; var10 < var0.length; ++var10) {
         class226 var11 = var0[var10];
         if(var11 != null && (var11.field2586 == var1 || var1 == -1412584499 && var11 == client.field853)) {
            int var12;
            if(var8 == -1) {
               client.field950[client.field883] = var11.field2580 + var6;
               client.field939[client.field883] = var7 + var11.field2653;
               client.field733[client.field883] = var11.field2582;
               client.field736[client.field883] = var11.field2642;
               var12 = ++client.field883 - 1;
            } else {
               var12 = var8;
            }

            var11.field2702 = var12;
            var11.field2603 = client.field689;
            if(!var11.field2566 || !class30.method356(var11, -1425924887)) {
               if(var11.field2571 > 0) {
                  class165.method3507(var11, -1600087023);
               }

               int var13 = var11.field2580 + var6;
               int var14 = var7 + var11.field2653;
               int var15 = var11.field2640;
               int var16;
               int var17;
               if(var11 == client.field853) {
                  if(var1 != -1412584499 && !var11.field2674) {
                     class15.field70 = var0;
                     class34.field245 = var6;
                     class268.field3526 = var7;
                     continue;
                  }

                  if(client.field864 && client.field732) {
                     var16 = class63.field517;
                     var17 = class63.field518;
                     var16 -= client.field855;
                     var17 -= client.field928;
                     if(var16 < client.field859) {
                        var16 = client.field859;
                     }

                     if(var16 + var11.field2582 > client.field859 + client.field854.field2582) {
                        var16 = client.field859 + client.field854.field2582 - var11.field2582;
                     }

                     if(var17 < client.field881) {
                        var17 = client.field881;
                     }

                     if(var17 + var11.field2642 > client.field881 + client.field854.field2642) {
                        var17 = client.field881 + client.field854.field2642 - var11.field2642;
                     }

                     var13 = var16;
                     var14 = var17;
                  }

                  if(!var11.field2674) {
                     var15 = 128;
                  }
               }

               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               if(var11.field2569 == 2) {
                  var16 = var2;
                  var17 = var3;
                  var18 = var4;
                  var19 = var5;
               } else if(var11.field2569 == 9) {
                  var20 = var13;
                  var21 = var14;
                  var22 = var13 + var11.field2582;
                  var23 = var14 + var11.field2642;
                  if(var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  if(var23 < var14) {
                     var21 = var23;
                     var23 = var14;
                  }

                  ++var22;
                  ++var23;
                  var16 = var20 > var2?var20:var2;
                  var17 = var21 > var3?var21:var3;
                  var18 = var22 < var4?var22:var4;
                  var19 = var23 < var5?var23:var5;
               } else {
                  var20 = var13 + var11.field2582;
                  var21 = var14 + var11.field2642;
                  var16 = var13 > var2?var13:var2;
                  var17 = var14 > var3?var14:var3;
                  var18 = var20 < var4?var20:var4;
                  var19 = var21 < var5?var21:var5;
               }

               if(!var11.field2566 || var16 < var18 && var17 < var19) {
                  if(var11.field2571 != 0) {
                     if(var11.field2571 == 1336) {
                        if(client.field934) {
                           var14 += 15;
                           class24.field140.method5391("Fps:" + class62.field479, var13 + var11.field2582, var14, 16776960, -1);
                           var14 += 15;
                           Runtime var42 = Runtime.getRuntime();
                           var21 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L);
                           var22 = 16776960;
                           if(var21 > 327680 && !client.field684) {
                              var22 = 16711680;
                           }

                           class24.field140.method5391("Mem:" + var21 + "k", var13 + var11.field2582, var14, var22, -1);
                           var14 += 15;
                        }
                        continue;
                     }

                     if(var11.field2571 == 1337) {
                        client.field829 = var13;
                        client.field830 = var14;
                        class222.method4061(var13, var14, var11.field2582, var11.field2642, 1911582516);
                        client.field679[var11.field2702] = true;
                        class330.method6045(var2, var3, var4, var5);
                        continue;
                     }

                     if(var11.field2571 == 1338) {
                        class67.method1256(var11, var13, var14, var12, 510029442);
                        class330.method6045(var2, var3, var4, var5);
                        continue;
                     }

                     if(var11.field2571 == 1339) {
                        class314.method5851(var11, var13, var14, var12, (byte)7);
                        class330.method6045(var2, var3, var4, var5);
                        continue;
                     }

                     if(var11.field2571 == 1400) {
                        class21.field121.method6432(var13, var14, var11.field2582, var11.field2642, client.field689, (byte)0);
                     }

                     if(var11.field2571 == 1401) {
                        class21.field121.method6401(var13, var14, var11.field2582, var11.field2642, (byte)-54);
                     }

                     if(var11.field2571 == 1402) {
                        class173.field2027.method1918(var13, client.field689, (byte)53);
                     }
                  }

                  if(var11.field2569 == 0) {
                     if(!var11.field2566 && class30.method356(var11, -1425924887) && var11 != class9.field52) {
                        continue;
                     }

                     if(!var11.field2566) {
                        if(var11.field2589 > var11.field2597 - var11.field2642) {
                           var11.field2589 = var11.field2597 - var11.field2642;
                        }

                        if(var11.field2589 < 0) {
                           var11.field2589 = 0;
                        }
                     }

                     method4213(var0, var11.field2567, var16, var17, var18, var19, var13 - var11.field2646, var14 - var11.field2589, var12, (byte)57);
                     if(var11.field2697 != null) {
                        method4213(var11.field2697, var11.field2567, var16, var17, var18, var19, var13 - var11.field2646, var14 - var11.field2589, var12, (byte)101);
                     }

                     class70 var31 = (class70)client.field841.method6010((long)var11.field2567);
                     if(var31 != null) {
                        class210.method3957(var31.field599, var16, var17, var18, var19, var13, var14, var12, 371876258);
                     }

                     class330.method6045(var2, var3, var4, var5);
                     class139.method3133();
                  }

                  if(client.field894 || client.field813[var12] || client.field892 > 1) {
                     if(var11.field2569 == 0 && !var11.field2566 && var11.field2597 > var11.field2642) {
                        class301.method5354(var13 + var11.field2582, var14, var11.field2589, var11.field2642, var11.field2597, 2092614789);
                     }

                     if(var11.field2569 != 1) {
                        int var24;
                        int var25;
                        int var26;
                        int var27;
                        if(var11.field2569 == 2) {
                           var20 = 0;

                           for(var21 = 0; var21 < var11.field2621; ++var21) {
                              for(var22 = 0; var22 < var11.field2579; ++var22) {
                                 var23 = var22 * (var11.field2634 + 32) + var13;
                                 var24 = var14 + var21 * (var11.field2635 + 32);
                                 if(var20 < 20) {
                                    var23 += var11.field2660[var20];
                                    var24 += var11.field2637[var20];
                                 }

                                 if(var11.field2671[var20] > 0) {
                                    boolean var38 = false;
                                    boolean var39 = false;
                                    var27 = var11.field2671[var20] - 1;
                                    if(var23 + 32 > var2 && var23 < var4 && var24 + 32 > var3 && var24 < var5 || var11 == class236.field3082 && var20 == client.field817) {
                                       class334 var28;
                                       if(client.field833 == 1 && var20 == client.field957 && var11.field2567 == class33.field243) {
                                          var28 = class97.method2213(var27, var11.field2692[var20], 2, 0, 2, false, -2006803252);
                                       } else {
                                          var28 = class97.method2213(var27, var11.field2692[var20], 1, 3153952, 2, false, 209106486);
                                       }

                                       if(var28 != null) {
                                          if(var11 == class236.field3082 && var20 == client.field817) {
                                             var25 = class63.field517 - client.field789;
                                             var26 = class63.field518 - client.field696;
                                             if(var25 < 5 && var25 > -5) {
                                                var25 = 0;
                                             }

                                             if(var26 < 5 && var26 > -5) {
                                                var26 = 0;
                                             }

                                             if(client.field793 < 5) {
                                                var25 = 0;
                                                var26 = 0;
                                             }

                                             var28.method6193(var25 + var23, var24 + var26, 128);
                                             if(var1 != -1) {
                                                class226 var29 = var0[var1 & '\uffff'];
                                                int var30;
                                                if(var26 + var24 < class330.field3862 && var29.field2589 > 0) {
                                                   var30 = (class330.field3862 - var24 - var26) * client.field741 / 3;
                                                   if(var30 > client.field741 * 10) {
                                                      var30 = client.field741 * 10;
                                                   }

                                                   if(var30 > var29.field2589) {
                                                      var30 = var29.field2589;
                                                   }

                                                   var29.field2589 -= var30;
                                                   client.field696 += var30;
                                                   class68.method1273(var29, -1220289530);
                                                }

                                                if(var24 + var26 + 32 > class330.field3866 && var29.field2589 < var29.field2597 - var29.field2642) {
                                                   var30 = (var24 + var26 + 32 - class330.field3866) * client.field741 / 3;
                                                   if(var30 > client.field741 * 10) {
                                                      var30 = client.field741 * 10;
                                                   }

                                                   if(var30 > var29.field2597 - var29.field2642 - var29.field2589) {
                                                      var30 = var29.field2597 - var29.field2642 - var29.field2589;
                                                   }

                                                   var29.field2589 += var30;
                                                   client.field696 -= var30;
                                                   class68.method1273(var29, -2003513262);
                                                }
                                             }
                                          } else if(var11 == class40.field307 && var20 == client.field880) {
                                             var28.method6193(var23, var24, 128);
                                          } else {
                                             var28.method6187(var23, var24);
                                          }
                                       } else {
                                          class68.method1273(var11, 555356882);
                                       }
                                    }
                                 } else if(var11.field2638 != null && var20 < 20) {
                                    class334 var44 = var11.method4116(var20, (byte)14);
                                    if(var44 != null) {
                                       var44.method6187(var23, var24);
                                    } else if(class226.field2565) {
                                       class68.method1273(var11, 774156626);
                                    }
                                 }

                                 ++var20;
                              }
                           }
                        } else if(var11.field2569 == 3) {
                           if(class21.method250(var11, -74932209)) {
                              var20 = var11.field2636;
                              if(var11 == class9.field52 && var11.field2595 != 0) {
                                 var20 = var11.field2595;
                              }
                           } else {
                              var20 = var11.field2592;
                              if(var11 == class9.field52 && var11.field2705 != 0) {
                                 var20 = var11.field2705;
                              }
                           }

                           if(var11.field2685) {
                              switch(var11.field2651.field3873) {
                              case 1:
                                 class330.method6053(var13, var14, var11.field2582, var11.field2642, var11.field2592, var11.field2636);
                                 break;
                              case 2:
                                 class330.method6077(var13, var14, var11.field2582, var11.field2642, var11.field2592, var11.field2636, 255 - (var11.field2640 & 255), 255 - (var11.field2599 & 255));
                                 break;
                              default:
                                 if(var15 == 0) {
                                    class330.method6052(var13, var14, var11.field2582, var11.field2642, var20);
                                 } else {
                                    class330.method6051(var13, var14, var11.field2582, var11.field2642, var20, 256 - (var15 & 255));
                                 }
                              }
                           } else if(var15 == 0) {
                              class330.method6137(var13, var14, var11.field2582, var11.field2642, var20);
                           } else {
                              class330.method6056(var13, var14, var11.field2582, var11.field2642, var20, 256 - (var15 & 255));
                           }
                        } else {
                           class304 var40;
                           if(var11.field2569 == 4) {
                              var40 = var11.method4121((byte)-18);
                              if(var40 == null) {
                                 if(class226.field2565) {
                                    class68.method1273(var11, -115100983);
                                 }
                              } else {
                                 String var46 = var11.field2628;
                                 if(class21.method250(var11, -74932209)) {
                                    var21 = var11.field2636;
                                    if(var11 == class9.field52 && var11.field2595 != 0) {
                                       var21 = var11.field2595;
                                    }

                                    if(var11.field2596.length() > 0) {
                                       var46 = var11.field2596;
                                    }
                                 } else {
                                    var21 = var11.field2592;
                                    if(var11 == class9.field52 && var11.field2705 != 0) {
                                       var21 = var11.field2705;
                                    }
                                 }

                                 if(var11.field2566 && var11.field2704 != -1) {
                                    class264 var47 = class30.method373(var11.field2704, (byte)26);
                                    var46 = var47.field3397;
                                    if(var46 == null) {
                                       var46 = "null";
                                    }

                                    if((var47.field3418 == 1 || var11.field2694 != 1) && var11.field2694 != -1) {
                                       var46 = class297.method5314(16748608, 1982076475) + var46 + "</col>" + " " + 'x' + class165.method3508(var11.field2694, (byte)0);
                                    }
                                 }

                                 if(var11 == client.field882) {
                                    var46 = "Please wait...";
                                    var21 = var11.field2592;
                                 }

                                 if(!var11.field2566) {
                                    var46 = class150.method3389(var46, var11, -748115662);
                                 }

                                 var40.method5397(var46, var13, var14, var11.field2582, var11.field2642, var21, var11.field2684?0:-1, var11.field2631, var11.field2645, var11.field2630);
                              }
                           } else if(var11.field2569 == 5) {
                              class334 var41;
                              if(!var11.field2566) {
                                 var41 = var11.method4114(class21.method250(var11, -74932209), (byte)-39);
                                 if(var41 != null) {
                                    var41.method6187(var13, var14);
                                 } else if(class226.field2565) {
                                    class68.method1273(var11, -915164242);
                                 }
                              } else {
                                 if(var11.field2704 != -1) {
                                    var41 = class97.method2213(var11.field2704, var11.field2694, var11.field2606, var11.field2607, var11.field2626, false, 379997070);
                                 } else {
                                    var41 = var11.method4114(false, (byte)-70);
                                 }

                                 if(var41 == null) {
                                    if(class226.field2565) {
                                       class68.method1273(var11, -1425816979);
                                    }
                                 } else {
                                    var21 = var41.field3893;
                                    var22 = var41.field3890;
                                    if(!var11.field2605) {
                                       var23 = var11.field2582 * 4096 / var21;
                                       if(var11.field2604 != 0) {
                                          var41.method6247(var11.field2582 / 2 + var13, var11.field2642 / 2 + var14, var11.field2604, var23);
                                       } else if(var15 != 0) {
                                          var41.method6195(var13, var14, var11.field2582, var11.field2642, 256 - (var15 & 255));
                                       } else if(var21 == var11.field2582 && var22 == var11.field2642) {
                                          var41.method6187(var13, var14);
                                       } else {
                                          var41.method6189(var13, var14, var11.field2582, var11.field2642);
                                       }
                                    } else {
                                       class330.method6066(var13, var14, var13 + var11.field2582, var14 + var11.field2642);
                                       var23 = (var21 - 1 + var11.field2582) / var21;
                                       var24 = (var22 - 1 + var11.field2642) / var22;

                                       for(var25 = 0; var25 < var23; ++var25) {
                                          for(var26 = 0; var26 < var24; ++var26) {
                                             if(var11.field2604 != 0) {
                                                var41.method6247(var21 / 2 + var13 + var21 * var25, var22 / 2 + var14 + var26 * var22, var11.field2604, 4096);
                                             } else if(var15 != 0) {
                                                var41.method6193(var13 + var25 * var21, var14 + var26 * var22, 256 - (var15 & 255));
                                             } else {
                                                var41.method6187(var13 + var25 * var21, var14 + var22 * var26);
                                             }
                                          }
                                       }

                                       class330.method6045(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              class264 var35;
                              if(var11.field2569 == 6) {
                                 boolean var37 = class21.method250(var11, -74932209);
                                 if(var37) {
                                    var21 = var11.field2615;
                                 } else {
                                    var21 = var11.field2614;
                                 }

                                 class136 var43 = null;
                                 var23 = 0;
                                 if(var11.field2704 != -1) {
                                    var35 = class30.method373(var11.field2704, (byte)-16);
                                    if(var35 != null) {
                                       var35 = var35.method4689(var11.field2694, -2117466306);
                                       var43 = var35.method4696(1, (byte)-60);
                                       if(var43 != null) {
                                          var43.method2955();
                                          var23 = var43.field1883 / 2;
                                       } else {
                                          class68.method1273(var11, -1801013556);
                                       }
                                    }
                                 } else if(var11.field2610 == 5) {
                                    if(var11.field2611 == 0) {
                                       var43 = client.field944.method4069((class268)null, -1, (class268)null, -1, -1571730911);
                                    } else {
                                       var43 = class311.field3717.vmethod3353(480835067);
                                    }
                                 } else if(var21 == -1) {
                                    var43 = var11.method4117((class268)null, -1, var37, class311.field3717.field646, (byte)73);
                                    if(var43 == null && class226.field2565) {
                                       class68.method1273(var11, -2118710454);
                                    }
                                 } else {
                                    class268 var48 = class253.method4478(var21, 1541051487);
                                    var43 = var11.method4117(var48, var11.field2587, var37, class311.field3717.field646, (byte)49);
                                    if(var43 == null && class226.field2565) {
                                       class68.method1273(var11, -11228603);
                                    }
                                 }

                                 class139.method3085(var11.field2582 / 2 + var13, var11.field2642 / 2 + var14);
                                 var24 = class139.field1794[var11.field2618] * var11.field2659 >> 16;
                                 var25 = class139.field1795[var11.field2618] * var11.field2659 >> 16;
                                 if(var43 != null) {
                                    if(!var11.field2566) {
                                       var43.method2968(0, var11.field2619, 0, var11.field2618, 0, var24, var25);
                                    } else {
                                       var43.method2955();
                                       if(var11.field2624) {
                                          var43.method2999(0, var11.field2619, var11.field2657, var11.field2618, var11.field2616, var24 + var23 + var11.field2617, var25 + var11.field2617, var11.field2659);
                                       } else {
                                          var43.method2968(0, var11.field2619, var11.field2657, var11.field2618, var11.field2616, var23 + var24 + var11.field2617, var25 + var11.field2617);
                                       }
                                    }
                                 }

                                 class139.method3150();
                              } else {
                                 if(var11.field2569 == 7) {
                                    var40 = var11.method4121((byte)-105);
                                    if(var40 == null) {
                                       if(class226.field2565) {
                                          class68.method1273(var11, 1491175648);
                                       }
                                       continue;
                                    }

                                    var21 = 0;

                                    for(var22 = 0; var22 < var11.field2621; ++var22) {
                                       for(var23 = 0; var23 < var11.field2579; ++var23) {
                                          if(var11.field2671[var21] > 0) {
                                             var35 = class30.method373(var11.field2671[var21] - 1, (byte)-41);
                                             String var32;
                                             if(var35.field3418 != 1 && var11.field2692[var21] == 1) {
                                                var32 = class297.method5314(16748608, 2063340732) + var35.field3397 + "</col>";
                                             } else {
                                                var32 = class297.method5314(16748608, -2060742522) + var35.field3397 + "</col>" + " " + 'x' + class165.method3508(var11.field2692[var21], (byte)0);
                                             }

                                             var26 = var23 * (var11.field2634 + 115) + var13;
                                             var27 = var22 * (var11.field2635 + 12) + var14;
                                             if(var11.field2631 == 0) {
                                                var40.method5389(var32, var26, var27, var11.field2592, var11.field2684?0:-1);
                                             } else if(var11.field2631 == 1) {
                                                var40.method5392(var32, var11.field2582 / 2 + var26, var27, var11.field2592, var11.field2684?0:-1);
                                             } else {
                                                var40.method5391(var32, var26 + var11.field2582 - 1, var27, var11.field2592, var11.field2684?0:-1);
                                             }
                                          }

                                          ++var21;
                                       }
                                    }
                                 }

                                 if(var11.field2569 == 8 && var11 == class199.field2368 && client.field832 == client.field871) {
                                    var20 = 0;
                                    var21 = 0;
                                    class304 var33 = class24.field140;
                                    String var34 = var11.field2628;

                                    String var45;
                                    for(var34 = class150.method3389(var34, var11, 443903393); var34.length() > 0; var21 = var21 + var33.field3682 + 1) {
                                       var25 = var34.indexOf("<br>");
                                       if(var25 != -1) {
                                          var45 = var34.substring(0, var25);
                                          var34 = var34.substring(var25 + 4);
                                       } else {
                                          var45 = var34;
                                          var34 = "";
                                       }

                                       var26 = var33.method5384(var45);
                                       if(var26 > var20) {
                                          var20 = var26;
                                       }
                                    }

                                    var20 += 6;
                                    var21 += 7;
                                    var25 = var13 + var11.field2582 - 5 - var20;
                                    var26 = var14 + var11.field2642 + 5;
                                    if(var25 < var13 + 5) {
                                       var25 = var13 + 5;
                                    }

                                    if(var25 + var20 > var4) {
                                       var25 = var4 - var20;
                                    }

                                    if(var21 + var26 > var5) {
                                       var26 = var5 - var21;
                                    }

                                    class330.method6052(var25, var26, var20, var21, 16777120);
                                    class330.method6137(var25, var26, var20, var21, 0);
                                    var34 = var11.field2628;
                                    var27 = var26 + var33.field3682 + 2;

                                    for(var34 = class150.method3389(var34, var11, -1781965723); var34.length() > 0; var27 = var27 + var33.field3682 + 1) {
                                       int var36 = var34.indexOf("<br>");
                                       if(var36 != -1) {
                                          var45 = var34.substring(0, var36);
                                          var34 = var34.substring(var36 + 4);
                                       } else {
                                          var45 = var34;
                                          var34 = "";
                                       }

                                       var33.method5389(var45, var25 + 3, var27, 0, -1);
                                    }
                                 }

                                 if(var11.field2569 == 9) {
                                    if(var11.field2601) {
                                       var20 = var13;
                                       var21 = var14 + var11.field2642;
                                       var22 = var13 + var11.field2582;
                                       var23 = var14;
                                    } else {
                                       var20 = var13;
                                       var21 = var14;
                                       var22 = var13 + var11.field2582;
                                       var23 = var14 + var11.field2642;
                                    }

                                    if(var11.field2600 == 1) {
                                       class330.method6061(var20, var21, var22, var23, var11.field2592);
                                    } else {
                                       class60.method997(var20, var21, var22, var23, var11.field2592, var11.field2600, -228702425);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static void method4219(int var0, int var1) {
      if(var0 == -1 && !client.field915) {
         client.method1494((byte)11);
      } else if(var0 != -1 && var0 != client.field914 && client.field913 != 0 && !client.field915) {
         class146.method3364(2, class43.field328, var0, 0, client.field913, false, (byte)-88);
      }

      client.field914 = var0;
   }

   public static String method4218(byte[] var0, byte var1) {
      int var3 = var0.length;
      StringBuilder var4 = new StringBuilder();

      for(int var5 = 0; var5 < var3 + 0; var5 += 3) {
         int var6 = var0[var5] & 255;
         var4.append(class299.field3646[var6 >>> 2]);
         if(var5 < var3 - 1) {
            int var7 = var0[var5 + 1] & 255;
            var4.append(class299.field3646[(var6 & 3) << 4 | var7 >>> 4]);
            if(var5 < var3 - 2) {
               int var8 = var0[var5 + 2] & 255;
               var4.append(class299.field3646[(var7 & 15) << 2 | var8 >>> 6]).append(class299.field3646[var8 & 63]);
            } else {
               var4.append(class299.field3646[(var7 & 15) << 2]).append("=");
            }
         } else {
            var4.append(class299.field3646[(var6 & 3) << 4]).append("==");
         }
      }

      String var2 = var4.toString();
      return var2;
   }
}
