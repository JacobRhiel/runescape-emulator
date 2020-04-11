package src;

public class class16 {

   static class333[] field79;
   static int field75;
   static class15 field84;
   String field86;
   String field78;
   public final long field76;
   public final int field81;
   public final class18 field85;


   class16(class309 var1, byte var2, int var3) {
      this.field78 = var1.method5667(-1116602062);
      this.field86 = var1.method5667(-1505088485);
      this.field81 = var1.readShort((byte)66);
      this.field76 = var1.method5553((byte)15);
      int var4 = var1.method5552(297718403);
      int var5 = var1.method5552(297718403);
      this.field85 = new class18();
      this.field85.method211(2, 587802237);
      this.field85.method187(var2, -582599399);
      this.field85.field97 = var4;
      this.field85.field100 = var5;
      this.field85.field96 = 0;
      this.field85.field99 = 0;
      this.field85.field95 = var3;
   }

   public String method157(int var1) {
      return this.field78;
   }

   public String method158(byte var1) {
      return this.field86;
   }

   static final void method165(String var0, int var1) {
      class141.method3161(30, "", var0, 2071762766);
   }

   public static class203 method159(class203[] var0, int var1, int var2) {
      class203[] var3 = var0;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class203 var5 = var3[var4];
         if(var1 == var5.vmethod6149((byte)56)) {
            return var5;
         }
      }

      return null;
   }

   static final void method161(byte var0) {
      class303.method5370(false, 83308919);
      client.field818 = 0;
      boolean var1 = true;

      int var2;
      for(var2 = 0; var2 < class24.field139.length; ++var2) {
         if(class54.field441[var2] != -1 && class24.field139[var2] == null) {
            class24.field139[var2] = class27.field162.method4224(class54.field441[var2], 0, (byte)-86);
            if(class24.field139[var2] == null) {
               var1 = false;
               ++client.field818;
            }
         }

         if(class35.field267[var2] != -1 && class23.field132[var2] == null) {
            class23.field132[var2] = class27.field162.method4263(class35.field267[var2], 0, class152.field1957[var2], 688237624);
            if(class23.field132[var2] == null) {
               var1 = false;
               ++client.field818;
            }
         }
      }

      if(!var1) {
         client.field899 = 1;
      } else {
         client.field734 = 0;
         var1 = true;

         int var4;
         int var5;
         class309 var9;
         int var10;
         int var11;
         int var12;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         for(var2 = 0; var2 < class24.field139.length; ++var2) {
            byte[] var3 = class23.field132[var2];
            if(var3 != null) {
               var4 = (class260.field3310[var2] >> 8) * 64 - class69.field590 * 731242929;
               var5 = (class260.field3310[var2] & 255) * 64 - class89.field1152 * 1825982697;
               if(client.field738) {
                  var4 = 10;
                  var5 = 10;
               }

               boolean var8 = true;
               var9 = new class309(var3);
               var10 = -1;

               label630:
               while(true) {
                  var11 = var9.method5562(-1839551709);
                  if(var11 == 0) {
                     var1 &= var8;
                     break;
                  }

                  var10 += var11;
                  var12 = 0;
                  boolean var13 = false;

                  while(true) {
                     while(!var13) {
                        var14 = var9.method5561(1283642471);
                        if(var14 == 0) {
                           continue label630;
                        }

                        var12 += var14 - 1;
                        var15 = var12 & 63;
                        var16 = var12 >> 6 & 63;
                        var17 = var9.readUnsignedByte((byte)66) >> 2;
                        var18 = var4 + var16;
                        var19 = var15 + var5;
                        if(var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                           class263 var20 = class33.method435(var10, 1650295452);
                           if(var17 != 22 || !client.field684 || var20.field3363 != 0 || var20.field3361 == 1 || var20.field3382) {
                              if(!var20.method4638((byte)53)) {
                                 ++client.field734;
                                 var8 = false;
                              }

                              var13 = true;
                           }
                        }
                     }

                     var14 = var9.method5561(1707695580);
                     if(var14 == 0) {
                        break;
                     }

                     var9.readUnsignedByte((byte)42);
                  }
               }
            }
         }

         if(!var1) {
            client.field899 = 2;
         } else {
            if(client.field899 != 0) {
               class214.method4004("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true, -1931696157);
            }

            class103.method2342((byte)-7);
            class14.field60.method3194();

            for(var2 = 0; var2 < 4; ++var2) {
               client.field737[var2].method3618(-1624935812);
            }

            int var36;
            for(var2 = 0; var2 < 4; ++var2) {
               for(var36 = 0; var36 < 104; ++var36) {
                  for(var4 = 0; var4 < 104; ++var4) {
                     class64.field535[var2][var36][var4] = 0;
                  }
               }
            }

            class103.method2342((byte)73);
            class161.method3484(1233574382);
            var2 = class24.field139.length;
            class290.method5225(-1231904010);
            class303.method5370(true, 83308919);
            int var6;
            int var21;
            int var22;
            int var41;
            int var52;
            if(!client.field738) {
               byte[] var37;
               for(var36 = 0; var36 < var2; ++var36) {
                  var4 = (class260.field3310[var36] >> 8) * 64 - class69.field590 * 731242929;
                  var5 = (class260.field3310[var36] & 255) * 64 - class89.field1152 * 1825982697;
                  var37 = class24.field139[var36];
                  if(var37 != null) {
                     class103.method2342((byte)33);
                     class24.method275(var37, var4, var5, class69.field585 * 8 - 48, class63.field529 * 8 - 48, client.field737, (byte)-108);
                  }
               }

               for(var36 = 0; var36 < var2; ++var36) {
                  var4 = (class260.field3310[var36] >> 8) * 64 - class69.field590 * 731242929;
                  var5 = (class260.field3310[var36] & 255) * 64 - class89.field1152 * 1825982697;
                  var37 = class24.field139[var36];
                  if(var37 == null && class63.field529 < 800) {
                     class103.method2342((byte)12);
                     class36.method514(var4, var5, 64, 64, -173221436);
                  }
               }

               class303.method5370(true, 83308919);

               for(var36 = 0; var36 < var2; ++var36) {
                  byte[] var42 = class23.field132[var36];
                  if(var42 != null) {
                     var5 = (class260.field3310[var36] >> 8) * 64 - class69.field590 * 731242929;
                     var6 = (class260.field3310[var36] & 255) * 64 - class89.field1152 * 1825982697;
                     class103.method2342((byte)-21);
                     class142 var43 = class14.field60;
                     class181[] var44 = client.field737;
                     var9 = new class309(var42);
                     var10 = -1;

                     while(true) {
                        var11 = var9.method5562(-1657778739);
                        if(var11 == 0) {
                           break;
                        }

                        var10 += var11;
                        var12 = 0;

                        while(true) {
                           var52 = var9.method5561(1429422202);
                           if(var52 == 0) {
                              break;
                           }

                           var12 += var52 - 1;
                           var14 = var12 & 63;
                           var15 = var12 >> 6 & 63;
                           var16 = var12 >> 12;
                           var17 = var9.readUnsignedByte((byte)100);
                           var18 = var17 >> 2;
                           var19 = var17 & 3;
                           var41 = var15 + var5;
                           var21 = var14 + var6;
                           if(var41 > 0 && var21 > 0 && var41 < 103 && var21 < 103) {
                              var22 = var16;
                              if((class64.field535[1][var41][var21] & 2) == 2) {
                                 var22 = var16 - 1;
                              }

                              class181 var48 = null;
                              if(var22 >= 0) {
                                 var48 = var44[var22];
                              }

                              class308.method5527(var16, var41, var21, var10, var19, var18, var43, var48, (short)7907);
                           }
                        }
                     }
                  }
               }
            }

            int var7;
            int var38;
            int var51;
            if(client.field738) {
               int var23;
               int var26;
               int var28;
               int var29;
               int var30;
               class181[] var40;
               class309 var53;
               for(var36 = 0; var36 < 4; ++var36) {
                  class103.method2342((byte)63);

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        boolean var50 = false;
                        var7 = client.field739[var36][var4][var5];
                        if(var7 != -1) {
                           var51 = var7 >> 24 & 3;
                           var38 = var7 >> 1 & 3;
                           var10 = var7 >> 14 & 1023;
                           var11 = var7 >> 3 & 2047;
                           var12 = (var10 / 8 << 8) + var11 / 8;

                           for(var52 = 0; var52 < class260.field3310.length; ++var52) {
                              if(class260.field3310[var52] == var12 && class24.field139[var52] != null) {
                                 byte[] var39 = class24.field139[var52];
                                 var15 = var4 * 8;
                                 var16 = var5 * 8;
                                 var17 = (var10 & 7) * 8;
                                 var18 = (var11 & 7) * 8;
                                 var40 = client.field737;

                                 for(var41 = 0; var41 < 8; ++var41) {
                                    for(var21 = 0; var21 < 8; ++var21) {
                                       if(var15 + var41 > 0 && var15 + var41 < 103 && var21 + var16 > 0 && var16 + var21 < 103) {
                                          var40[var36].field2092[var41 + var15][var21 + var16] &= -16777217;
                                       }
                                    }
                                 }

                                 var53 = new class309(var39);

                                 for(var21 = 0; var21 < 4; ++var21) {
                                    for(var22 = 0; var22 < 64; ++var22) {
                                       for(var23 = 0; var23 < 64; ++var23) {
                                          if(var51 == var21 && var22 >= var17 && var22 < var17 + 8 && var23 >= var18 && var23 < var18 + 8) {
                                             var26 = var15 + class42.method663(var22 & 7, var23 & 7, var38, (byte)-1);
                                             var29 = var22 & 7;
                                             var30 = var23 & 7;
                                             int var31 = var38 & 3;
                                             if(var31 == 0) {
                                                var28 = var30;
                                             } else if(var31 == 1) {
                                                var28 = 7 - var29;
                                             } else if(var31 == 2) {
                                                var28 = 7 - var30;
                                             } else {
                                                var28 = var29;
                                             }

                                             class205.method3753(var53, var36, var26, var28 + var16, 0, 0, var38, (byte)16);
                                          } else {
                                             class205.method3753(var53, 0, -1, -1, 0, 0, 0, (byte)16);
                                          }
                                       }
                                    }
                                 }

                                 var50 = true;
                                 break;
                              }
                           }
                        }

                        if(!var50) {
                           class301.method5358(var36, var4 * 8, var5 * 8, -1439449778);
                        }
                     }
                  }
               }

               for(var36 = 0; var36 < 13; ++var36) {
                  for(var4 = 0; var4 < 13; ++var4) {
                     var5 = client.field739[0][var36][var4];
                     if(var5 == -1) {
                        class36.method514(var36 * 8, var4 * 8, 8, 8, -481605090);
                     }
                  }
               }

               class303.method5370(true, 83308919);

               for(var36 = 0; var36 < 4; ++var36) {
                  class103.method2342((byte)5);

                  for(var4 = 0; var4 < 13; ++var4) {
                     label470:
                     for(var5 = 0; var5 < 13; ++var5) {
                        var6 = client.field739[var36][var4][var5];
                        if(var6 != -1) {
                           var7 = var6 >> 24 & 3;
                           var51 = var6 >> 1 & 3;
                           var38 = var6 >> 14 & 1023;
                           var10 = var6 >> 3 & 2047;
                           var11 = (var38 / 8 << 8) + var10 / 8;

                           for(var12 = 0; var12 < class260.field3310.length; ++var12) {
                              if(class260.field3310[var12] == var11 && class23.field132[var12] != null) {
                                 byte[] var45 = class23.field132[var12];
                                 var14 = var4 * 8;
                                 var15 = var5 * 8;
                                 var16 = (var38 & 7) * 8;
                                 var17 = (var10 & 7) * 8;
                                 class142 var46 = class14.field60;
                                 var40 = client.field737;
                                 var53 = new class309(var45);
                                 var21 = -1;

                                 while(true) {
                                    var22 = var53.method5562(-1697587572);
                                    if(var22 == 0) {
                                       continue label470;
                                    }

                                    var21 += var22;
                                    var23 = 0;

                                    while(true) {
                                       int var47 = var53.method5561(1595729485);
                                       if(var47 == 0) {
                                          break;
                                       }

                                       var23 += var47 - 1;
                                       int var25 = var23 & 63;
                                       var26 = var23 >> 6 & 63;
                                       int var27 = var23 >> 12;
                                       var28 = var53.readUnsignedByte((byte)122);
                                       var29 = var28 >> 2;
                                       var30 = var28 & 3;
                                       if(var7 == var27 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) {
                                          class263 var49 = class33.method435(var21, 1650295452);
                                          int var32 = var14 + class199.method3728(var26 & 7, var25 & 7, var51, var49.field3359, var49.field3360, var30, -583824694);
                                          int var33 = var15 + method166(var26 & 7, var25 & 7, var51, var49.field3359, var49.field3360, var30, (byte)30);
                                          if(var32 > 0 && var33 > 0 && var32 < 103 && var33 < 103) {
                                             int var34 = var36;
                                             if((class64.field535[1][var32][var33] & 2) == 2) {
                                                var34 = var36 - 1;
                                             }

                                             class181 var35 = null;
                                             if(var34 >= 0) {
                                                var35 = var40[var34];
                                             }

                                             class308.method5527(var36, var32, var33, var21, var30 + var51 & 3, var29, var46, var35, (short)7021);
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

            class303.method5370(true, 83308919);
            class103.method2342((byte)62);
            class21.method248(class14.field60, client.field737, -1662285695);
            class303.method5370(true, 83308919);
            var36 = class64.field537;
            if(var36 > class71.field610) {
               var36 = class71.field610;
            }

            if(var36 < class71.field610 - 1) {
               var36 = class71.field610 - 1;
            }

            if(client.field684) {
               class14.field60.method3164(class64.field537);
            } else {
               class14.field60.method3164(0);
            }

            for(var4 = 0; var4 < 104; ++var4) {
               for(var5 = 0; var5 < 104; ++var5) {
                  class80.method1884(var4, var5, -1848249905);
               }
            }

            class103.method2342((byte)36);
            class65.method1241(1005499202);
            class263.field3347.method3413();
            class196 var54;
            if(class42.field318.method1040(-584501921)) {
               var54 = class146.method3363(ClientPacket.field2215, client.field761.field1340, -2036856058);
               var54.field2338.method5689(1057001181, 747474969);
               client.field761.method2361(var54, 1144996409);
            }

            if(!client.field738) {
               var4 = (class69.field585 - 6) / 8;
               var5 = (class69.field585 + 6) / 8;
               var6 = (class63.field529 - 6) / 8;
               var7 = (class63.field529 + 6) / 8;

               for(var51 = var4 - 1; var51 <= var5 + 1; ++var51) {
                  for(var38 = var6 - 1; var38 <= var7 + 1; ++var38) {
                     if(var51 < var4 || var51 > var5 || var38 < var6 || var38 > var7) {
                        class27.field162.method4260("m" + var51 + "_" + var38, 904314096);
                        class27.field162.method4260("l" + var51 + "_" + var38, -789879615);
                     }
                  }
               }
            }

            class72.method1293(30, -2048126435);
            class103.method2342((byte)57);
            class64.field538 = null;
            class348.field4061 = null;
            class64.field539 = null;
            class64.field540 = null;
            class51.field404 = null;
            class117.field1462 = null;
            class64.field545 = null;
            class21.field116 = null;
            class168.field2005 = null;
            class260.field3306 = null;
            class64.field554 = null;
            class83.field1086 = null;
            var54 = class146.method3363(ClientPacket.field2241, client.field761.field1340, -1939541926);
            client.field761.method2361(var54, 298658927);
            class62.field472.vmethod3577(-1195176395);

            for(var5 = 0; var5 < 32; ++var5) {
               class62.field481[var5] = 0L;
            }

            for(var5 = 0; var5 < 32; ++var5) {
               class62.field482[var5] = 0L;
            }

            class143.field1877 = 0;
         }
      }
   }

   public static int method166(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      if((var5 & 1) == 1) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      var2 &= 3;
      return var2 == 0?var1:(var2 == 1?7 - var0 - (var3 - 1):(var2 == 2?7 - var1 - (var4 - 1):var0));
   }

   static final void method156(String var0, int var1) {
      if(!var0.equals("")) {
         class196 var2 = class146.method3363(ClientPacket.field2236, client.field761.field1340, -1910479227);
         var2.field2338.readByte(class234.method4198(var0, (byte)10), 1258821856);
         var2.field2338.method5627(var0, 2073865916);
         client.field761.method2361(var2, 554752370);
      }
   }
}
