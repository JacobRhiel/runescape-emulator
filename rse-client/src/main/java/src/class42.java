package src;

public class class42 implements class46 {

   static client field318;
   int field324;
   int field322;
   int field319;
   int field323;
   int field320;
   int field321;


   public boolean vmethod872(int var1, int var2, int var3) {
      return var1 >> 6 == this.field322 && var2 >> 6 == this.field323;
   }

   public boolean vmethod871(int var1, int var2, int var3, int var4) {
      return var1 >= this.field324 && var1 < this.field319 + this.field324?var2 >> 6 == this.field320 && var3 >> 6 == this.field321:false;
   }

   public void vmethod870(class35 var1, int var2) {
      if(var1.field258 > this.field322) {
         var1.field258 = this.field322;
      }

      if(var1.field259 < this.field322) {
         var1.field259 = this.field322;
      }

      if(var1.field261 > this.field323) {
         var1.field261 = this.field323;
      }

      if(var1.field253 < this.field323) {
         var1.field253 = this.field323;
      }

   }

   public class222 vmethod890(int var1, int var2, int var3) {
      if(!this.vmethod872(var1, var2, -575313506)) {
         return null;
      } else {
         int var4 = this.field320 * 64 - this.field322 * 64 + var1;
         int var5 = this.field321 * 64 - this.field323 * 64 + var2;
         return new class222(this.field324, var4, var5);
      }
   }

   public int[] vmethod873(int var1, int var2, int var3, int var4) {
      if(!this.vmethod871(var1, var2, var3, 1991639308)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field322 * 64 - this.field320 * 64 + var2, var3 + (this.field323 * 64 - this.field321 * 64)};
         return var5;
      }
   }

   void method662(int var1) {}

   public void vmethod885(class309 var1, int var2) {
      this.field324 = var1.readUnsignedByte((byte)23);
      this.field319 = var1.readUnsignedByte((byte)61);
      this.field320 = var1.writeShort((byte)94);
      this.field321 = var1.writeShort((byte)53);
      this.field322 = var1.writeShort((byte)5);
      this.field323 = var1.writeShort((byte)12);
      this.method662(-1986942295);
   }

   public static int method663(int var0, int var1, int var2, byte var3) {
      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0:7 - var1));
   }

   static final void method655(class78 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var0 != null && var0.vmethod2118(116176402)) {
         if(var0 instanceof class88) {
            class266 var7 = ((class88)var0).field1148;
            if(var7.field3490 != null) {
               var7 = var7.method4766(-2051225078);
            }

            if(var7 == null) {
               return;
            }
         }

         int var76 = class98.field1278;
         int[] var8 = class98.field1271;
         byte var9 = 0;
         class75 var11;
         if(var1 < var76 && var0.field977 == client.field689) {
            var11 = (class75)var0;
            boolean var10;
            if(client.field690 == 0) {
               var10 = false;
            } else {
               boolean var78;
               if(var11 != class311.field3717) {
                  var78 = (client.field690 & 4) != 0;
                  boolean var79 = var78 || class31.method386(767205713) && var11.method1351(-2100361760);
                  if(!var79) {
                     boolean var14 = (client.field690 & 2) != 0;
                     var79 = var14 && var11.method1334(-1607352080);
                  }

                  var10 = var79;
               } else {
                  var78 = (client.field690 & 8) != 0;
                  var10 = var78;
               }
            }

            if(var10) {
               class75 var12 = (class75)var0;
               if(var1 < var76) {
                  class54.method939(var0, var0.field1023 + 15, (byte)3);
                  class305 var13 = (class305)client.field731.get(class301.field3655);
                  byte var93 = 9;
                  var13.method5392(var12.field652.method5238(-1649625325), var2 + client.field812, var3 + client.field780 - var93, 16777215, 0);
                  var9 = 18;
               }
            }
         }

         int var88 = -2;
         int var16;
         int var23;
         int var24;
         if(!var0.field998.method4867()) {
            class54.method939(var0, var0.field1023 + 15, (byte)3);

            for(class87 var89 = (class87)var0.field998.method4860(); var89 != null; var89 = (class87)var0.field998.method4915()) {
               class79 var90 = var89.method2115(client.field689, 1772939720);
               if(var90 != null) {
                  class256 var92 = var89.field1143;
                  class334 var77 = var92.method4524(1861000233);
                  class334 var15 = var92.method4523((short)1701);
                  int var17 = 0;
                  if(var77 != null && var15 != null) {
                     if(var92.field3285 * 2 < var15.field3889) {
                        var17 = var92.field3285;
                     }

                     var16 = var15.field3889 - var17 * 2;
                  } else {
                     var16 = var92.field3284;
                  }

                  int var18 = 255;
                  boolean var19 = true;
                  int var20 = client.field689 - var90.field1035;
                  int var21 = var16 * var90.field1036 / var92.field3284;
                  int var22;
                  int var94;
                  if(var90.field1038 > var20) {
                     var22 = var92.field3272 == 0?0:var92.field3272 * (var20 / var92.field3272);
                     var23 = var16 * var90.field1034 / var92.field3284;
                     var94 = var22 * (var21 - var23) / var90.field1038 + var23;
                  } else {
                     var94 = var21;
                     var22 = var92.field3275 + var90.field1038 - var20;
                     if(var92.field3283 >= 0) {
                        var18 = (var22 << 8) / (var92.field3275 - var92.field3283);
                     }
                  }

                  if(var90.field1036 > 0 && var94 < 1) {
                     var94 = 1;
                  }

                  if(var77 != null && var15 != null) {
                     if(var16 == var94) {
                        var94 += var17 * 2;
                     } else {
                        var94 += var17;
                     }

                     var22 = var77.field3899;
                     var88 += var22;
                     var23 = var2 + client.field812 - (var16 >> 1);
                     var24 = var3 + client.field780 - var88;
                     var23 -= var17;
                     if(var18 >= 0 && var18 < 255) {
                        var77.method6193(var23, var24, var18);
                        class330.method6066(var23, var24, var23 + var94, var24 + var22);
                        var15.method6193(var23, var24, var18);
                     } else {
                        var77.method6187(var23, var24);
                        class330.method6066(var23, var24, var23 + var94, var24 + var22);
                        var15.method6187(var23, var24);
                     }

                     class330.method6045(var2, var3, var2 + var4, var3 + var5);
                     var88 += 2;
                  } else {
                     var88 += 5;
                     if(client.field812 > -1) {
                        var22 = var2 + client.field812 - (var16 >> 1);
                        var23 = var3 + client.field780 - var88;
                        class330.method6052(var22, var23, var94, 5, '\uff00');
                        class330.method6052(var94 + var22, var23, var16 - var94, 5, 16711680);
                     }

                     var88 += 2;
                  }
               } else if(var89.method2112(1327552245)) {
                  var89.method3657();
               }
            }
         }

         if(var88 == -2) {
            var88 += 7;
         }

         var88 += var9;
         if(var1 < var76) {
            var11 = (class75)var0;
            if(var11.field651) {
               return;
            }

            if(var11.skullIcon != -1 || var11.headIcon != -1) {
               class54.method939(var0, var0.field1023 + 15, (byte)3);
               if(client.field812 > -1) {
                  if(var11.skullIcon != -1) {
                     var88 += 25;
                     class52.field406[var11.skullIcon].method6187(var2 + client.field812 - 12, var3 + client.field780 - var88);
                  }

                  if(var11.headIcon != -1) {
                     var88 += 25;
                     class106.field1354[var11.headIcon].method6187(var2 + client.field812 - 12, var3 + client.field780 - var88);
                  }
               }
            }

            if(var1 >= 0 && client.field889 == 10 && var8[var1] == client.field800) {
               class54.method939(var0, var0.field1023 + 15, (byte)3);
               if(client.field812 > -1) {
                  var88 += class4.field26[1].field3899;
                  class4.field26[1].method6187(var2 + client.field812 - 12, var3 + client.field780 - var88);
               }
            }
         } else {
            class266 var91 = ((class88)var0).field1148;
            if(var91.field3490 != null) {
               var91 = var91.method4766(-2051225078);
            }

            if(var91.field3488 >= 0 && var91.field3488 < class106.field1354.length) {
               class54.method939(var0, var0.field1023 + 15, (byte)3);
               if(client.field812 > -1) {
                  class106.field1354[var91.field3488].method6187(var2 + client.field812 - 12, var3 + client.field780 - 30);
               }
            }

            if(client.field889 == 1 && client.field723[var1 - var76] == client.field698 && client.field689 % 20 < 10) {
               class54.method939(var0, var0.field1023 + 15, (byte)3);
               if(client.field812 > -1) {
                  class4.field26[0].method6187(var2 + client.field812 - 12, var3 + client.field780 - 28);
               }
            }
         }

         if(var0.field1002 != null && (var1 >= var76 || !var0.field988 && (client.field896 == 4 || !var0.field1030 && (client.field896 == 0 || client.field896 == 3 || client.field896 == 1 && ((class75)var0).method1351(1933204352))))) {
            class54.method939(var0, var0.field1023, (byte)3);
            if(client.field812 > -1 && client.field767 < client.field768) {
               client.field908[client.field767] = class175.field2045.method5384(var0.field1002) / 2;
               client.field771[client.field767] = class175.field2045.field3682;
               client.field769[client.field767] = client.field812;
               client.field831[client.field767] = client.field780;
               client.field773[client.field767] = var0.field987;
               client.field927[client.field767] = var0.field991;
               client.field775[client.field767] = var0.field989;
               client.field781[client.field767] = var0.field1002;
               ++client.field767;
            }
         }

         for(int var80 = 0; var80 < 4; ++var80) {
            int var97 = var0.field981[var80];
            int var98 = var0.field975[var80];
            class262 var96 = null;
            int var81 = 0;
            if(var98 >= 0) {
               if(var97 <= client.field689) {
                  continue;
               }

               var96 = class19.method213(var0.field975[var80], -1592336859);
               var81 = var96.field3329;
               if(var96 != null && var96.field3340 != null) {
                  var96 = var96.method4604(-1598682842);
                  if(var96 == null) {
                     var0.field981[var80] = -1;
                     continue;
                  }
               }
            } else if(var97 < 0) {
               continue;
            }

            var16 = var0.field996[var80];
            class262 var82 = null;
            if(var16 >= 0) {
               var82 = class19.method213(var16, -1171759884);
               if(var82 != null && var82.field3340 != null) {
                  var82 = var82.method4604(-951570117);
               }
            }

            if(var97 - var81 <= client.field689) {
               if(var96 == null) {
                  var0.field981[var80] = -1;
               } else {
                  class54.method939(var0, var0.field1023 / 2, (byte)3);
                  if(client.field812 > -1) {
                     if(var80 == 1) {
                        client.field780 -= 20;
                     }

                     if(var80 == 2) {
                        client.field812 -= 15;
                        client.field780 -= 10;
                     }

                     if(var80 == 3) {
                        client.field812 += 15;
                        client.field780 -= 10;
                     }

                     class334 var83 = null;
                     class334 var84 = null;
                     class334 var85 = null;
                     class334 var86 = null;
                     var23 = 0;
                     var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     int var30 = 0;
                     class334 var31 = null;
                     class334 var32 = null;
                     class334 var33 = null;
                     class334 var34 = null;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     int var43 = 0;
                     var83 = var96.method4618(1656176054);
                     int var44;
                     if(var83 != null) {
                        var23 = var83.field3889;
                        var44 = var83.field3899;
                        if(var44 > var43) {
                           var43 = var44;
                        }

                        var27 = var83.field3888;
                     }

                     var84 = var96.method4607(-743591767);
                     if(var84 != null) {
                        var24 = var84.field3889;
                        var44 = var84.field3899;
                        if(var44 > var43) {
                           var43 = var44;
                        }

                        var28 = var84.field3888;
                     }

                     var85 = var96.method4608(-1442192880);
                     if(var85 != null) {
                        var25 = var85.field3889;
                        var44 = var85.field3899;
                        if(var44 > var43) {
                           var43 = var44;
                        }

                        var29 = var85.field3888;
                     }

                     var86 = var96.method4609(-2137932181);
                     if(var86 != null) {
                        var26 = var86.field3889;
                        var44 = var86.field3899;
                        if(var44 > var43) {
                           var43 = var44;
                        }

                        var30 = var86.field3888;
                     }

                     if(var82 != null) {
                        var31 = var82.method4618(1211273243);
                        if(var31 != null) {
                           var35 = var31.field3889;
                           var44 = var31.field3899;
                           if(var44 > var43) {
                              var43 = var44;
                           }

                           var39 = var31.field3888;
                        }

                        var32 = var82.method4607(-1097540989);
                        if(var32 != null) {
                           var36 = var32.field3889;
                           var44 = var32.field3899;
                           if(var44 > var43) {
                              var43 = var44;
                           }

                           var40 = var32.field3888;
                        }

                        var33 = var82.method4608(-1391025378);
                        if(var33 != null) {
                           var37 = var33.field3889;
                           var44 = var33.field3899;
                           if(var44 > var43) {
                              var43 = var44;
                           }

                           var41 = var33.field3888;
                        }

                        var34 = var82.method4609(-2137932181);
                        if(var34 != null) {
                           var38 = var34.field3889;
                           var44 = var34.field3899;
                           if(var44 > var43) {
                              var43 = var44;
                           }

                           var42 = var34.field3888;
                        }
                     }

                     class304 var87 = var96.method4612(607832420);
                     if(var87 == null) {
                        var87 = class101.field1303;
                     }

                     class304 var45;
                     if(var82 != null) {
                        var45 = var82.method4612(-654817291);
                        if(var45 == null) {
                           var45 = class101.field1303;
                        }
                     } else {
                        var45 = class101.field1303;
                     }

                     String var46 = null;
                     String var47 = null;
                     boolean var48 = false;
                     int var49 = 0;
                     var46 = var96.method4605(var0.field994[var80], -940233797);
                     int var95 = var87.method5384(var46);
                     if(var82 != null) {
                        var47 = var82.method4605(var0.field997[var80], -940233797);
                        var49 = var45.method5384(var47);
                     }

                     int var50 = 0;
                     int var51 = 0;
                     if(var24 > 0) {
                        if(var85 == null && var86 == null) {
                           var50 = 1;
                        } else {
                           var50 = var95 / var24 + 1;
                        }
                     }

                     if(var82 != null && var36 > 0) {
                        if(var33 == null && var34 == null) {
                           var51 = 1;
                        } else {
                           var51 = var49 / var36 + 1;
                        }
                     }

                     int var52 = 0;
                     int var53 = var52;
                     if(var23 > 0) {
                        var52 += var23;
                     }

                     var52 += 2;
                     int var54 = var52;
                     if(var25 > 0) {
                        var52 += var25;
                     }

                     int var55 = var52;
                     int var56 = var52;
                     int var57;
                     if(var24 > 0) {
                        var57 = var50 * var24;
                        var52 += var57;
                        var56 += (var57 - var95) / 2;
                     } else {
                        var52 += var95;
                     }

                     var57 = var52;
                     if(var26 > 0) {
                        var52 += var26;
                     }

                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62 = 0;
                     int var63;
                     if(var82 != null) {
                        var52 += 2;
                        var58 = var52;
                        if(var35 > 0) {
                           var52 += var35;
                        }

                        var52 += 2;
                        var59 = var52;
                        if(var37 > 0) {
                           var52 += var37;
                        }

                        var60 = var52;
                        var62 = var52;
                        if(var36 > 0) {
                           var63 = var51 * var36;
                           var52 += var63;
                           var62 += (var63 - var49) / 2;
                        } else {
                           var52 += var49;
                        }

                        var61 = var52;
                        if(var38 > 0) {
                           var52 += var38;
                        }
                     }

                     var63 = var0.field981[var80] - client.field689;
                     int var64 = var96.field3338 - var63 * var96.field3338 / var96.field3329;
                     int var65 = var63 * var96.field3341 / var96.field3329 + -var96.field3341;
                     int var66 = var64 + (var2 + client.field812 - (var52 >> 1));
                     int var67 = var65 + (var3 + client.field780 - 12);
                     int var68 = var67;
                     int var69 = var67 + var43;
                     int var70 = var67 + var96.field3339 + 15;
                     int var71 = var70 - var87.field3683;
                     int var72 = var70 + var87.field3684;
                     if(var71 < var67) {
                        var68 = var71;
                     }

                     if(var72 > var69) {
                        var69 = var72;
                     }

                     int var73 = 0;
                     int var74;
                     int var75;
                     if(var82 != null) {
                        var73 = var67 + var82.field3339 + 15;
                        var74 = var73 - var45.field3683;
                        var75 = var73 + var45.field3684;
                        if(var74 < var68) {
                           ;
                        }

                        if(var75 > var69) {
                           ;
                        }
                     }

                     var74 = 255;
                     if(var96.field3334 >= 0) {
                        var74 = (var63 << 8) / (var96.field3329 - var96.field3334);
                     }

                     if(var74 >= 0 && var74 < 255) {
                        if(var83 != null) {
                           var83.method6193(var53 + var66 - var27, var67, var74);
                        }

                        if(var85 != null) {
                           var85.method6193(var66 + var54 - var29, var67, var74);
                        }

                        if(var84 != null) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var84.method6193(var24 * var75 + (var66 + var55 - var28), var67, var74);
                           }
                        }

                        if(var86 != null) {
                           var86.method6193(var66 + var57 - var30, var67, var74);
                        }

                        var87.method5390(var46, var56 + var66, var70, var96.field3328, 0, var74);
                        if(var82 != null) {
                           if(var31 != null) {
                              var31.method6193(var66 + var58 - var39, var67, var74);
                           }

                           if(var33 != null) {
                              var33.method6193(var66 + var59 - var41, var67, var74);
                           }

                           if(var32 != null) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method6193(var75 * var36 + (var66 + var60 - var40), var67, var74);
                              }
                           }

                           if(var34 != null) {
                              var34.method6193(var61 + var66 - var42, var67, var74);
                           }

                           var45.method5390(var47, var62 + var66, var73, var82.field3328, 0, var74);
                        }
                     } else {
                        if(var83 != null) {
                           var83.method6187(var53 + var66 - var27, var67);
                        }

                        if(var85 != null) {
                           var85.method6187(var54 + var66 - var29, var67);
                        }

                        if(var84 != null) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var84.method6187(var75 * var24 + (var66 + var55 - var28), var67);
                           }
                        }

                        if(var86 != null) {
                           var86.method6187(var57 + var66 - var30, var67);
                        }

                        var87.method5389(var46, var56 + var66, var70, var96.field3328 | -16777216, 0);
                        if(var82 != null) {
                           if(var31 != null) {
                              var31.method6187(var66 + var58 - var39, var67);
                           }

                           if(var33 != null) {
                              var33.method6187(var66 + var59 - var41, var67);
                           }

                           if(var32 != null) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method6187(var36 * var75 + (var66 + var60 - var40), var67);
                              }
                           }

                           if(var34 != null) {
                              var34.method6187(var61 + var66 - var42, var67);
                           }

                           var45.method5389(var47, var62 + var66, var73, var82.field3328 | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   static int method683(int var0, class101 var1, boolean var2, byte var3) {
      class226 var4 = var2?class20.field115:class85.field1130;
      if(var0 == 1800) {
         class85.field1115[++class85.field1117 - 1] = class31.method388(class71.method1283(var4, -1296210416), -1866970355);
         return 1;
      } else if(var0 != 1801) {
         if(var0 == 1802) {
            if(var4.field2593 == null) {
               class85.field1118[++class85.field1119 - 1] = "";
            } else {
               class85.field1118[++class85.field1119 - 1] = var4.field2593;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = class85.field1115[--class85.field1117];
         --var5;
         if(var4.field2647 != null && var5 < var4.field2647.length && var4.field2647[var5] != null) {
            class85.field1118[++class85.field1119 - 1] = var4.field2647[var5];
         } else {
            class85.field1118[++class85.field1119 - 1] = "";
         }

         return 1;
      }
   }
}
