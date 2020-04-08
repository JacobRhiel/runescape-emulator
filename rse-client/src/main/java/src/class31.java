package src;

public final class class31 {

   public static class247 field222;
   static int field217;
   static int field220;
   // $FF: synthetic field
   final class45 this$0;
   int field218;
   int field215;
   int field219;
   int field223;


   class31(class45 var1) {
      this.this$0 = var1;
   }

   public static int method387(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   public static int method388(int var0, int var1) {
      return var0 >> 11 & 63;
   }

   static final void method385(int var0, int var1, int var2, int var3, int var4) {
      if(client.field833 == 0 && !client.field835) {
         class285.method5111("Walk here", "", 23, 0, var0 - var2, var1 - var3, (byte)114);
      }

      long var5 = -1L;
      long var7 = -1L;

      int var9;
      for(var9 = 0; var9 < class66.method1250(1446972814); ++var9) {
         long var10 = class50.method868(var9, 984846325);
         if(var10 != var7) {
            var7 = var10;
            int var23 = class104.method2362(var9, -816734320);
            int var13 = class29.method347(var9, -1148353199);
            int var14 = class276.method5012(var9, -894385088);
            int var15 = class32.method407(var9, (byte)39);
            if(var14 == 2 && class14.field60.method3193(class71.field610, var23, var13, var10) >= 0) {
               class263 var16 = class33.method435(var15, 1650295452);
               if(var16.field3385 != null) {
                  var16 = var16.method4645((short)128);
               }

               if(var16 == null) {
                  continue;
               }

               if(client.field833 == 1) {
                  class285.method5111("Use", client.field933 + " " + "->" + " " + class297.method5314('\uffff', -806385803) + var16.field3354, 1, var15, var23, var13, (byte)55);
               } else if(client.field835) {
                  if((class43.field336 & 4) == 4) {
                     class285.method5111(client.field838, client.field839 + " " + "->" + " " + class297.method5314('\uffff', 85829125) + var16.field3354, 2, var15, var23, var13, (byte)60);
                  }
               } else {
                  String[] var24 = var16.field3368;
                  if(var24 != null) {
                     for(int var25 = 4; var25 >= 0; --var25) {
                        if(var24[var25] != null) {
                           short var19 = 0;
                           if(var25 == 0) {
                              var19 = 3;
                           }

                           if(var25 == 1) {
                              var19 = 4;
                           }

                           if(var25 == 2) {
                              var19 = 5;
                           }

                           if(var25 == 3) {
                              var19 = 6;
                           }

                           if(var25 == 4) {
                              var19 = 1001;
                           }

                           class285.method5111(var24[var25], class297.method5314('\uffff', 2140598269) + var16.field3354, var19, var15, var23, var13, (byte)42);
                        }
                     }
                  }

                  class285.method5111("Examine", class297.method5314('\uffff', 108531169) + var16.field3354, 1002, var16.field3351, var23, var13, (byte)7);
               }
            }

            int var17;
            class88 var18;
            class75 var20;
            int[] var31;
            int var33;
            if(var14 == 1) {
               class88 var28 = client.field721[var15];
               if(var28 == null) {
                  continue;
               }

               if(var28.field1148.field3470 == 1 && (var28.field983 & 127) == 64 && (var28.field973 & 127) == 64) {
                  for(var17 = 0; var17 < client.field722; ++var17) {
                     var18 = client.field721[client.field723[var17]];
                     if(var18 != null && var18 != var28 && var18.field1148.field3470 == 1 && var18.field983 == var28.field983 && var28.field973 == var18.field973) {
                        class38.method640(var18.field1148, client.field723[var17], var23, var13, -1013791350);
                     }
                  }

                  var17 = class98.field1278;
                  var31 = class98.field1271;

                  for(var33 = 0; var33 < var17; ++var33) {
                     var20 = client.players[var31[var33]];
                     if(var20 != null && var20.field983 == var28.field983 && var28.field973 == var20.field973) {
                        class70.method1279(var20, var31[var33], var23, var13, 1622564198);
                     }
                  }
               }

               class38.method640(var28.field1148, var15, var23, var13, -771039189);
            }

            if(var14 == 0) {
               class75 var29 = client.players[var15];
               if(var29 == null) {
                  continue;
               }

               if((var29.field983 & 127) == 64 && (var29.field973 & 127) == 64) {
                  for(var17 = 0; var17 < client.field722; ++var17) {
                     var18 = client.field721[client.field723[var17]];
                     if(var18 != null && var18.field1148.field3470 == 1 && var18.field983 == var29.field983 && var29.field973 == var18.field973) {
                        class38.method640(var18.field1148, client.field723[var17], var23, var13, -283435223);
                     }
                  }

                  var17 = class98.field1278;
                  var31 = class98.field1271;

                  for(var33 = 0; var33 < var17; ++var33) {
                     var20 = client.players[var31[var33]];
                     if(var20 != null && var29 != var20 && var20.field983 == var29.field983 && var20.field973 == var29.field973) {
                        class70.method1279(var20, var31[var33], var23, var13, 1572599434);
                     }
                  }
               }

               if(var15 != client.field807) {
                  class70.method1279(var29, var15, var23, var13, 970073345);
               } else {
                  var5 = var10;
               }
            }

            if(var14 == 3) {
               class271 var30 = client.field808[class71.field610][var23][var13];
               if(var30 != null) {
                  for(class96 var34 = (class96)var30.method4935(); var34 != null; var34 = (class96)var30.method4932()) {
                     class264 var32 = class30.method373(var34.field1254, (byte)8);
                     if(client.field833 == 1) {
                        class285.method5111("Use", client.field933 + " " + "->" + " " + class297.method5314(16748608, 137100492) + var32.field3397, 16, var34.field1254, var23, var13, (byte)69);
                     } else if(client.field835) {
                        if((class43.field336 & 1) == 1) {
                           class285.method5111(client.field838, client.field839 + " " + "->" + " " + class297.method5314(16748608, -2122682606) + var32.field3397, 17, var34.field1254, var23, var13, (byte)103);
                        }
                     } else {
                        String[] var26 = var32.field3419;

                        for(int var27 = 4; var27 >= 0; --var27) {
                           if(var26 != null && var26[var27] != null) {
                              byte var21 = 0;
                              if(var27 == 0) {
                                 var21 = 18;
                              }

                              if(var27 == 1) {
                                 var21 = 19;
                              }

                              if(var27 == 2) {
                                 var21 = 20;
                              }

                              if(var27 == 3) {
                                 var21 = 21;
                              }

                              if(var27 == 4) {
                                 var21 = 22;
                              }

                              class285.method5111(var26[var27], class297.method5314(16748608, -1763473042) + var32.field3397, var21, var34.field1254, var23, var13, (byte)95);
                           } else if(var27 == 2) {
                              class285.method5111("Take", class297.method5314(16748608, 483680485) + var32.field3397, 20, var34.field1254, var23, var13, (byte)71);
                           }
                        }

                        class285.method5111("Examine", class297.method5314(16748608, 1640598142) + var32.field3397, 1004, var34.field1254, var23, var13, (byte)27);
                     }
                  }
               }
            }
         }
      }

      if(var5 != -1L) {
         var9 = (int)(var5 >>> 0 & 127L);
         int var11 = class161.method3486(var5);
         class75 var12 = client.players[client.field807];
         class70.method1279(var12, client.field807, var9, var11, 713738223);
      }

   }

   static boolean method386(int var0) {
      return (client.field690 & 1) != 0;
   }
}
