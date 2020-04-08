package src;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Comparator;

final class class21 implements Comparator {

   static int field120;
   static class342 field121;
   static int[] field116;


   int method240(class16 var1, class16 var2, int var3) {
      return var1.field76 < var2.field76?-1:(var2.field76 == var1.field76?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method240((class16)var1, (class16)var2, -720251669);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final boolean method250(class226 var0, int var1) {
      if(var0.field2686 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.field2686.length; ++var2) {
            int var3 = class64.method1227(var0, var2, 2058882289);
            int var4 = var0.field2687[var2];
            if(var0.field2686[var2] == 2) {
               if(var3 >= var4) {
                  return false;
               }
            } else if(var0.field2686[var2] == 3) {
               if(var3 <= var4) {
                  return false;
               }
            } else if(var0.field2686[var2] == 4) {
               if(var4 == var3) {
                  return false;
               }
            } else if(var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }

   static void method241(class62 var0, int var1) {
      int var5;
      if(class94.field1219) {
         while(true) {
            if(!class22.method255(32517854)) {
               if(class63.field524 != 1 && (class217.field2506 || class63.field524 != 4)) {
                  break;
               }

               int var2 = class94.field1191 + 280;
               if(class63.field525 >= var2 && class63.field525 <= var2 + 14 && class63.field520 >= 4 && class63.field520 <= 18) {
                  class29.method346(0, 0, 1841927686);
                  break;
               }

               if(class63.field525 >= var2 + 15 && class63.field525 <= var2 + 80 && class63.field520 >= 4 && class63.field520 <= 18) {
                  class29.method346(0, 1, 326329089);
                  break;
               }

               int var3 = class94.field1191 + 390;
               if(class63.field525 >= var3 && class63.field525 <= var3 + 14 && class63.field520 >= 4 && class63.field520 <= 18) {
                  class29.method346(1, 0, -455565974);
                  break;
               }

               if(class63.field525 >= var3 + 15 && class63.field525 <= var3 + 80 && class63.field520 >= 4 && class63.field520 <= 18) {
                  class29.method346(1, 1, -1208953575);
                  break;
               }

               int var33 = class94.field1191 + 500;
               if(class63.field525 >= var33 && class63.field525 <= var33 + 14 && class63.field520 >= 4 && class63.field520 <= 18) {
                  class29.method346(2, 0, -788165906);
                  break;
               }

               if(class63.field525 >= var33 + 15 && class63.field525 <= var33 + 80 && class63.field520 >= 4 && class63.field520 <= 18) {
                  class29.method346(2, 1, -586685507);
                  break;
               }

               var5 = class94.field1191 + 610;
               if(class63.field525 >= var5 && class63.field525 <= var5 + 14 && class63.field520 >= 4 && class63.field520 <= 18) {
                  class29.method346(3, 0, -78331578);
                  break;
               }

               if(class63.field525 >= var5 + 15 && class63.field525 <= var5 + 80 && class63.field520 >= 4 && class63.field520 <= 18) {
                  class29.method346(3, 1, 1976073076);
                  break;
               }

               if(class63.field525 >= class94.field1191 + 708 && class63.field520 >= 4 && class63.field525 <= class94.field1191 + 708 + 50 && class63.field520 <= 20) {
                  class94.field1219 = false;
                  class94.field1193.method6185(class94.field1191, 0);
                  class215.field2501.method6185(class94.field1191 + 382, 0);
                  class3.field18.method6173(class94.field1191 + 382 - class3.field18.field3883 / 2, 18);
                  break;
               }

               if(class94.field1199 != -1) {
                  class80 var6 = class324.field3837[class94.field1199];
                  class166.method3511(var6, (short)5308);
                  class94.field1219 = false;
                  class94.field1193.method6185(class94.field1191, 0);
                  class215.field2501.method6185(class94.field1191 + 382, 0);
                  class3.field18.method6173(class94.field1191 + 382 - class3.field18.field3883 / 2, 18);
               } else {
                  if(class94.field1189 > 0 && class92.field1179 != null && class63.field525 >= 0 && class63.field525 <= class92.field1179.field3883 && class63.field520 >= class221.field2525 / 2 - 50 && class63.field520 <= class221.field2525 / 2 + 50) {
                     --class94.field1189;
                  }

                  if(class94.field1189 < class94.field1222 && class260.field3308 != null && class63.field525 >= class37.field277 - class260.field3308.field3883 - 5 && class63.field525 <= class37.field277 && class63.field520 >= class221.field2525 / 2 - 50 && class63.field520 <= class221.field2525 / 2 + 50) {
                     ++class94.field1189;
                  }
               }
               break;
            }

            if(class3.field16 == 13) {
               class87.method2110(-1544257049);
               break;
            }

            if(class3.field16 == 96) {
               if(class94.field1189 > 0 && class92.field1179 != null) {
                  --class94.field1189;
               }
            } else if(class3.field16 == 97 && class94.field1189 < class94.field1222 && class260.field3308 != null) {
               ++class94.field1189;
            }
         }

      } else {
         if((class63.field524 == 1 || !class217.field2506 && class63.field524 == 4) && class63.field525 >= class94.field1191 + 765 - 50 && class63.field520 >= 453) {
            class76.field676.field1078 = !class76.field676.field1078;
            class35.method509(2135191334);
            if(!class76.field676.field1078) {
               class105.method2380(class43.field328, "scape main", "", 255, false, 895690551);
            } else {
               client.method1494((byte)11);
            }
         }

         if(client.field687 != 5) {
            if(class94.field1223 == -1L) {
               class94.field1223 = class217.method4014(377822013) + 1000L;
            }

            long var22 = class217.method4014(-1230868625);
            boolean var4;
            if(client.field951 != null && client.field952 < client.field951.size()) {
               while(true) {
                  if(client.field952 >= client.field951.size()) {
                     var4 = true;
                     break;
                  }

                  class67 var24 = (class67)client.field951.get(client.field952);
                  if(!var24.method1253(92028555)) {
                     var4 = false;
                     break;
                  }

                  ++client.field952;
               }
            } else {
               var4 = true;
            }

            if(var4 && -1L == class94.field1224) {
               class94.field1224 = var22;
               if(class94.field1224 > class94.field1223) {
                  class94.field1223 = class94.field1224;
               }
            }

            if(client.field687 == 10 || client.field687 == 11) {
               if(class285.field3597 == class199.field2358) {
                  if(class63.field524 == 1 || !class217.field2506 && class63.field524 == 4) {
                     var5 = class94.field1191 + 5;
                     short var25 = 463;
                     byte var7 = 100;
                     byte var8 = 35;
                     if(class63.field525 >= var5 && class63.field525 <= var7 + var5 && class63.field520 >= var25 && class63.field520 <= var8 + var25) {
                        if(class199.method3729(-1084912738)) {
                           class94.field1219 = true;
                           class94.field1189 = 0;
                           class94.field1222 = 0;
                        }

                        return;
                     }
                  }

                  if(class193.field2318 != null && class199.method3729(-205138474)) {
                     class94.field1219 = true;
                     class94.field1189 = 0;
                     class94.field1222 = 0;
                  }
               }

               var5 = class63.field524;
               int var47 = class63.field525;
               int var34 = class63.field520;
               if(var5 == 0) {
                  var47 = class63.field517;
                  var34 = class63.field518;
               }

               if(!class217.field2506 && var5 == 4) {
                  var5 = 1;
               }

               int var9;
               short var10;
               if(class94.field1204 == 0) {
                  boolean var35 = false;

                  while(class22.method255(-1203245091)) {
                     if(class3.field16 == 84) {
                        var35 = true;
                     }
                  }

                  var9 = class104.field1331 - 80;
                  var10 = 291;
                  if(var5 == 1 && var47 >= var9 - 75 && var47 <= var9 + 75 && var34 >= var10 - 20 && var34 <= var10 + 20) {
                     class101.method2322(class41.method654("secure", true, 961112618) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, 1255823265);
                  }

                  var9 = class104.field1331 + 80;
                  if(var5 == 1 && var47 >= var9 - 75 && var47 <= var9 + 75 && var34 >= var10 - 20 && var34 <= var10 + 20 || var35) {
                     if((client.field681 & 33554432) != 0) {
                        class94.field1203 = "";
                        class94.field1206 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        class94.field1192 = "Your normal account will not be affected.";
                        class94.field1208 = "";
                        class94.field1204 = 1;
                        class301.method5361((byte)27);
                     } else if((client.field681 & 4) != 0) {
                        if((client.field681 & 1024) != 0) {
                           class94.field1206 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           class94.field1192 = "Players can attack each other almost everywhere";
                           class94.field1208 = "and the Protect Item prayer won\'t work.";
                        } else {
                           class94.field1206 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           class94.field1192 = "Players can attack each other";
                           class94.field1208 = "almost everywhere.";
                        }

                        class94.field1203 = "Warning!";
                        class94.field1204 = 1;
                        class301.method5361((byte)104);
                     } else if((client.field681 & 1024) != 0) {
                        class94.field1206 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        class94.field1192 = "The Protect Item prayer will";
                        class94.field1208 = "not work on this world.";
                        class94.field1203 = "Warning!";
                        class94.field1204 = 1;
                        class301.method5361((byte)9);
                     } else {
                        class263.method4687(false, 649887816);
                     }
                  }
               } else {
                  int var36;
                  short var38;
                  if(class94.field1204 == 1) {
                     while(class22.method255(94164142)) {
                        if(class3.field16 == 84) {
                           class263.method4687(false, 649887816);
                        } else if(class3.field16 == 13) {
                           class94.field1204 = 0;
                        }
                     }

                     var36 = class104.field1331 - 80;
                     var38 = 321;
                     if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                        class263.method4687(false, 649887816);
                     }

                     var36 = class104.field1331 + 80;
                     if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                        class94.field1204 = 0;
                     }
                  } else {
                     boolean var11;
                     short var37;
                     int var41;
                     if(class94.field1204 == 2) {
                        var37 = 201;
                        var36 = var37 + 52;
                        if(var5 == 1 && var34 >= var36 - 12 && var34 < var36 + 2) {
                           class94.field1209 = 0;
                        }

                        var36 += 15;
                        if(var5 == 1 && var34 >= var36 - 12 && var34 < var36 + 2) {
                           class94.field1209 = 1;
                        }

                        var36 += 15;
                        var37 = 361;
                        if(class41.field315 != null) {
                           var9 = class41.field315.field3855 / 2;
                           if(var5 == 1 && var47 >= class41.field315.field3857 - var9 && var47 <= var9 + class41.field315.field3857 && var34 >= var37 - 15 && var34 < var37) {
                              switch(class94.field1218) {
                              case 1:
                                 class79.method1852("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.", (byte)87);
                                 class94.field1204 = 5;
                                 return;
                              case 2:
                                 class101.method2322("https://support.runescape.com/hc/en-gb", true, false, 1070480696);
                              }
                           }
                        }

                        var9 = class104.field1331 - 80;
                        var10 = 321;
                        if(var5 == 1 && var47 >= var9 - 75 && var47 <= var9 + 75 && var34 >= var10 - 20 && var34 <= var10 + 20) {
                           class94.field1220 = class94.field1220.trim();
                           if(class94.field1220.length() == 0) {
                              class79.method1852("", "Please enter your username/email address.", "", (byte)91);
                              return;
                           }

                           if(class94.field1210.length() == 0) {
                              class79.method1852("", "Please enter your password.", "", (byte)99);
                              return;
                           }

                           class79.method1852("", "Connecting to server...", "", (byte)127);
                           class86.method2108(false, 1004007010);
                           class72.method1293(20, -1934155697);
                           return;
                        }

                        var9 = class94.field1215 + 180 + 80;
                        if(var5 == 1 && var47 >= var9 - 75 && var47 <= var9 + 75 && var34 >= var10 - 20 && var34 <= var10 + 20) {
                           class94.field1204 = 0;
                           class94.field1220 = "";
                           class94.field1210 = "";
                           class86.field1141 = 0;
                           class173.field2025 = "";
                           class94.field1214 = true;
                        }

                        var9 = class104.field1331 + -117;
                        var10 = 277;
                        class94.field1207 = var47 >= var9 && var47 < var9 + class26.field158 && var34 >= var10 && var34 < var10 + class219.field2515;
                        if(var5 == 1 && class94.field1207) {
                           client.field716 = !client.field716;
                           if(!client.field716 && class76.field676.field1080 != null) {
                              class76.field676.field1080 = null;
                              class35.method509(1890027018);
                           }
                        }

                        var9 = class104.field1331 + 24;
                        var10 = 277;
                        class94.field1212 = var47 >= var9 && var47 < var9 + class26.field158 && var34 >= var10 && var34 < var10 + class219.field2515;
                        if(var5 == 1 && class94.field1212) {
                           class76.field676.field1075 = !class76.field676.field1075;
                           if(!class76.field676.field1075) {
                              class94.field1220 = "";
                              class76.field676.field1080 = null;
                              class301.method5361((byte)-78);
                           }

                           class35.method509(2020930222);
                        }

                        while(class22.method255(-1630590603)) {
                           if(class3.field16 == 13) {
                              class94.field1204 = 0;
                              class94.field1220 = "";
                              class94.field1210 = "";
                              class86.field1141 = 0;
                              class173.field2025 = "";
                              class94.field1214 = true;
                           } else if(class94.field1209 == 0) {
                              char var40 = class222.field2531;

                              for(var41 = 0; var41 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length() && var40 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var41); ++var41) {
                                 ;
                              }

                              if(class3.field16 == 85 && class94.field1220.length() > 0) {
                                 class94.field1220 = class94.field1220.substring(0, class94.field1220.length() - 1);
                              }

                              if(class3.field16 == 84 || class3.field16 == 80) {
                                 class94.field1209 = 1;
                              }

                              char var45 = class222.field2531;
                              boolean var43 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var45) != -1;
                              if(var43 && class94.field1220.length() < 320) {
                                 class94.field1220 = class94.field1220 + class222.field2531;
                              }
                           } else if(class94.field1209 == 1) {
                              if(class3.field16 == 85 && class94.field1210.length() > 0) {
                                 class94.field1210 = class94.field1210.substring(0, class94.field1210.length() - 1);
                              } else if(class3.field16 == 84 || class3.field16 == 80) {
                                 class94.field1209 = 0;
                                 if(class3.field16 == 84) {
                                    class94.field1220 = class94.field1220.trim();
                                    if(class94.field1220.length() == 0) {
                                       class79.method1852("", "Please enter your username/email address.", "", (byte)68);
                                       return;
                                    }

                                    if(class94.field1210.length() == 0) {
                                       class79.method1852("", "Please enter your password.", "", (byte)67);
                                       return;
                                    }

                                    class79.method1852("", "Connecting to server...", "", (byte)81);
                                    class86.method2108(false, -1546339117);
                                    class72.method1293(20, -2094209547);
                                    return;
                                 }
                              }

                              if((class54.field426[82] || class54.field426[87]) && class3.field16 == 67) {
                                 Clipboard var26 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                 Transferable var27 = var26.getContents(class42.field318);
                                 int var44 = 20 - class94.field1210.length();
                                 if(var44 > 0) {
                                    try {
                                       String var14 = (String)var27.getTransferData(DataFlavor.stringFlavor);
                                       int var46 = Math.min(var44, var14.length());
                                       int var16 = 0;

                                       while(true) {
                                          if(var16 < var46) {
                                             char var18 = var14.charAt(var16);
                                             boolean var17;
                                             if((var18 < 32 || var18 >= 127) && (var18 <= 127 || var18 >= 160) && (var18 <= 160 || var18 > 255)) {
                                                label1345: {
                                                   if(var18 != 0) {
                                                      char[] var19 = class297.field3641;

                                                      for(int var20 = 0; var20 < var19.length; ++var20) {
                                                         char var21 = var19[var20];
                                                         if(var21 == var18) {
                                                            var17 = true;
                                                            break label1345;
                                                         }
                                                      }
                                                   }

                                                   var17 = false;
                                                }
                                             } else {
                                                var17 = true;
                                             }

                                             if(var17 && class33.method433(var14.charAt(var16), '\uff00')) {
                                                ++var16;
                                                continue;
                                             }

                                             class94.field1204 = 3;
                                             return;
                                          }

                                          class94.field1210 = class94.field1210 + var14.substring(0, var46);
                                          break;
                                       }
                                    } catch (UnsupportedFlavorException var31) {
                                       ;
                                    } catch (IOException var32) {
                                       ;
                                    }
                                 }
                              } else {
                                 char var12 = class222.field2531;
                                 if((var12 < 32 || var12 >= 127) && (var12 <= 127 || var12 >= 160) && (var12 <= 160 || var12 > 255)) {
                                    label1348: {
                                       if(var12 != 0) {
                                          char[] var28 = class297.field3641;

                                          for(int var29 = 0; var29 < var28.length; ++var29) {
                                             char var15 = var28[var29];
                                             if(var12 == var15) {
                                                var11 = true;
                                                break label1348;
                                             }
                                          }
                                       }

                                       var11 = false;
                                    }
                                 } else {
                                    var11 = true;
                                 }

                                 if(var11) {
                                    char var48 = class222.field2531;
                                    boolean var13 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var48) != -1;
                                    if(var13 && class94.field1210.length() < 20) {
                                       class94.field1210 = class94.field1210 + class222.field2531;
                                    }
                                 }
                              }
                           }
                        }
                     } else if(class94.field1204 == 3) {
                        var36 = class94.field1215 + 180;
                        var38 = 276;
                        if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                           class263.method4687(false, 649887816);
                        }

                        var36 = class94.field1215 + 180;
                        var38 = 326;
                        if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                           class79.method1852("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.", (byte)3);
                           class94.field1204 = 5;
                           return;
                        }
                     } else {
                        int var42;
                        if(class94.field1204 == 4) {
                           var36 = class94.field1215 + 180 - 80;
                           var38 = 321;
                           if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                              class173.field2025.trim();
                              if(class173.field2025.length() != 6) {
                                 class79.method1852("", "Please enter a 6-digit PIN.", "", (byte)66);
                                 return;
                              }

                              class86.field1141 = Integer.parseInt(class173.field2025);
                              class173.field2025 = "";
                              class86.method2108(true, -1161278506);
                              class79.method1852("", "Connecting to server...", "", (byte)125);
                              class72.method1293(20, -1901296428);
                              return;
                           }

                           if(var5 == 1 && var47 >= class94.field1215 + 180 - 9 && var47 <= class94.field1215 + 180 + 130 && var34 >= 263 && var34 <= 296) {
                              class94.field1214 = !class94.field1214;
                           }

                           if(var5 == 1 && var47 >= class94.field1215 + 180 - 34 && var47 <= class94.field1215 + 34 + 180 && var34 >= 351 && var34 <= 363) {
                              class101.method2322(class41.method654("secure", true, 1893201262) + "m=totp-authenticator/disableTOTPRequest", true, false, -525024784);
                           }

                           var36 = class94.field1215 + 180 + 80;
                           if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                              class94.field1204 = 0;
                              class94.field1220 = "";
                              class94.field1210 = "";
                              class86.field1141 = 0;
                              class173.field2025 = "";
                           }

                           while(class22.method255(-1388482570)) {
                              boolean var39 = false;

                              for(var42 = 0; var42 < "1234567890".length(); ++var42) {
                                 if(class222.field2531 == "1234567890".charAt(var42)) {
                                    var39 = true;
                                    break;
                                 }
                              }

                              if(class3.field16 == 13) {
                                 class94.field1204 = 0;
                                 class94.field1220 = "";
                                 class94.field1210 = "";
                                 class86.field1141 = 0;
                                 class173.field2025 = "";
                              } else {
                                 if(class3.field16 == 85 && class173.field2025.length() > 0) {
                                    class173.field2025 = class173.field2025.substring(0, class173.field2025.length() - 1);
                                 }

                                 if(class3.field16 == 84) {
                                    class173.field2025.trim();
                                    if(class173.field2025.length() != 6) {
                                       class79.method1852("", "Please enter a 6-digit PIN.", "", (byte)98);
                                       return;
                                    }

                                    class86.field1141 = Integer.parseInt(class173.field2025);
                                    class173.field2025 = "";
                                    class86.method2108(true, 1704779623);
                                    class79.method1852("", "Connecting to server...", "", (byte)16);
                                    class72.method1293(20, -2089095921);
                                    return;
                                 }

                                 if(var39 && class173.field2025.length() < 6) {
                                    class173.field2025 = class173.field2025 + class222.field2531;
                                 }
                              }
                           }
                        } else if(class94.field1204 == 5) {
                           var36 = class94.field1215 + 180 - 80;
                           var38 = 321;
                           if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                              class50.method864((byte)-5);
                              return;
                           }

                           var36 = class94.field1215 + 180 + 80;
                           if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                              class263.method4687(true, 649887816);
                           }

                           var10 = 361;
                           if(class211.field2495 != null) {
                              var42 = class211.field2495.field3855 / 2;
                              if(var5 == 1 && var47 >= class211.field2495.field3857 - var42 && var47 <= var42 + class211.field2495.field3857 && var34 >= var10 - 15 && var34 < var10) {
                                 class101.method2322(class41.method654("secure", true, 1575329476) + "m=weblogin/g=oldscape/cant_log_in", true, false, -567006089);
                              }
                           }

                           while(class22.method255(586687883)) {
                              var11 = false;

                              for(var41 = 0; var41 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var41) {
                                 if(class222.field2531 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var41)) {
                                    var11 = true;
                                    break;
                                 }
                              }

                              if(class3.field16 == 13) {
                                 class263.method4687(true, 649887816);
                              } else {
                                 if(class3.field16 == 85 && class94.field1220.length() > 0) {
                                    class94.field1220 = class94.field1220.substring(0, class94.field1220.length() - 1);
                                 }

                                 if(class3.field16 == 84) {
                                    class50.method864((byte)-125);
                                    return;
                                 }

                                 if(var11 && class94.field1220.length() < 320) {
                                    class94.field1220 = class94.field1220 + class222.field2531;
                                 }
                              }
                           }
                        } else if(class94.field1204 == 6) {
                           while(class22.method255(1286214453)) {
                              if(class3.field16 == 84 || class3.field16 == 13) {
                                 class263.method4687(true, 649887816);
                              }
                           }

                           var37 = 321;
                           if(var5 == 1 && var34 >= var37 - 20 && var34 <= var37 + 20) {
                              class263.method4687(true, 649887816);
                           }
                        } else if(class94.field1204 == 7) {
                           var36 = class94.field1215 + 180 - 80;
                           var38 = 321;
                           if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                              class101.method2322(class41.method654("secure", true, 760995480) + "m=dob/set_dob.ws", true, false, 755372952);
                              class79.method1852("", "Page has opened in a new window.", "(Please check your popup blocker.)", (byte)84);
                              class94.field1204 = 6;
                              return;
                           }

                           var36 = class94.field1215 + 180 + 80;
                           if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                              class263.method4687(true, 649887816);
                           }
                        } else if(class94.field1204 == 8) {
                           var36 = class94.field1215 + 180 - 80;
                           var38 = 321;
                           if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                              class101.method2322("https://www.jagex.com/terms/privacy", true, false, -873009811);
                              class79.method1852("", "Page has opened in a new window.", "(Please check your popup blocker.)", (byte)51);
                              class94.field1204 = 6;
                              return;
                           }

                           var36 = class94.field1215 + 180 + 80;
                           if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                              class263.method4687(true, 649887816);
                           }
                        } else if(class94.field1204 == 12) {
                           String var30 = "";
                           switch(class94.field1201) {
                           case 0:
                              var30 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                              break;
                           case 1:
                              var30 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                              break;
                           default:
                              class263.method4687(false, 649887816);
                           }

                           var9 = class94.field1215 + 180;
                           var10 = 276;
                           if(var5 == 1 && var47 >= var9 - 75 && var47 <= var9 + 75 && var34 >= var10 - 20 && var34 <= var10 + 20) {
                              class101.method2322(var30, true, false, -71307846);
                              class79.method1852("", "Page has opened in a new window.", "(Please check your popup blocker.)", (byte)26);
                              class94.field1204 = 6;
                              return;
                           }

                           var9 = class94.field1215 + 180;
                           var10 = 326;
                           if(var5 == 1 && var47 >= var9 - 75 && var47 <= var9 + 75 && var34 >= var10 - 20 && var34 <= var10 + 20) {
                              class263.method4687(false, 649887816);
                           }
                        } else if(class94.field1204 == 24) {
                           var36 = class94.field1215 + 180;
                           var38 = 301;
                           if(var5 == 1 && var47 >= var36 - 75 && var47 <= var36 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                              class263.method4687(false, 649887816);
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   static final void method249(int var0) {
      for(class86 var1 = (class86)client.field811.method4931(); var1 != null; var1 = (class86)client.field811.method4949()) {
         if(var1.field1140 == class71.field610 && !var1.field1142) {
            if(client.field689 >= var1.field1132) {
               var1.method2101(client.field741, -937691597);
               if(var1.field1142) {
                  var1.method3657();
               } else {
                  class14.field60.method3174(var1.field1140, var1.field1133, var1.field1135, var1.field1136, 60, var1, 0, -1L, false);
               }
            }
         } else {
            var1.method3657();
         }
      }

   }

   static final void method248(class142 var0, class181[] var1, int var2) {
      int var3;
      int var4;
      int var5;
      int var6;
      for(var3 = 0; var3 < 4; ++var3) {
         for(var4 = 0; var4 < 104; ++var4) {
            for(var5 = 0; var5 < 104; ++var5) {
               if((class64.field535[var3][var4][var5] & 1) == 1) {
                  var6 = var3;
                  if((class64.field535[1][var4][var5] & 2) == 2) {
                     var6 = var3 - 1;
                  }

                  if(var6 >= 0) {
                     var1[var6].method3614(var4, var5, 1257789406);
                  }
               }
            }
         }
      }

      class64.field550 += (int)(Math.random() * 5.0D) - 2;
      if(class64.field550 < -8) {
         class64.field550 = -8;
      }

      if(class64.field550 > 8) {
         class64.field550 = 8;
      }

      class64.field548 += (int)(Math.random() * 5.0D) - 2;
      if(class64.field548 < -16) {
         class64.field548 = -16;
      }

      if(class64.field548 > 16) {
         class64.field548 = 16;
      }

      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      int var19;
      for(var3 = 0; var3 < 4; ++var3) {
         byte[][] var43 = class117.field1462[var3];
         var10 = (int)Math.sqrt(5100.0D);
         var11 = var10 * 768 >> 8;

         int var20;
         int var21;
         for(var12 = 1; var12 < 103; ++var12) {
            for(var13 = 1; var13 < 103; ++var13) {
               var14 = class64.field549[var3][var13 + 1][var12] - class64.field549[var3][var13 - 1][var12];
               var15 = class64.field549[var3][var13][var12 + 1] - class64.field549[var3][var13][var12 - 1];
               var16 = (int)Math.sqrt((double)(var14 * var14 + var15 * var15 + 65536));
               var17 = (var14 << 8) / var16;
               var18 = 65536 / var16;
               var19 = (var15 << 8) / var16;
               var20 = (var17 * -50 + var19 * -50 + var18 * -10) / var11 + 96;
               var21 = (var43[var13 - 1][var12] >> 2) + (var43[var13][var12 - 1] >> 2) + (var43[var13 + 1][var12] >> 3) + (var43[var13][var12 + 1] >> 3) + (var43[var13][var12] >> 1);
               class64.field545[var13][var12] = var20 - var21;
            }
         }

         for(var12 = 0; var12 < 104; ++var12) {
            field116[var12] = 0;
            class168.field2005[var12] = 0;
            class260.field3306[var12] = 0;
            class64.field554[var12] = 0;
            class83.field1086[var12] = 0;
         }

         for(var12 = -5; var12 < 109; ++var12) {
            for(var13 = 0; var13 < 104; ++var13) {
               var14 = var12 + 5;
               if(var14 >= 0 && var14 < 104) {
                  var15 = class64.field538[var3][var14][var13] & 255;
                  if(var15 > 0) {
                     class254 var44 = class60.method995(var15 - 1, -696554810);
                     field116[var13] += var44.field3255;
                     class168.field2005[var13] += var44.field3256;
                     class260.field3306[var13] += var44.field3252;
                     class64.field554[var13] += var44.field3253;
                     ++class83.field1086[var13];
                  }
               }

               var15 = var12 - 5;
               if(var15 >= 0 && var15 < 104) {
                  var16 = class64.field538[var3][var15][var13] & 255;
                  if(var16 > 0) {
                     class254 var45 = class60.method995(var16 - 1, 1422721124);
                     field116[var13] -= var45.field3255;
                     class168.field2005[var13] -= var45.field3256;
                     class260.field3306[var13] -= var45.field3252;
                     class64.field554[var13] -= var45.field3253;
                     --class83.field1086[var13];
                  }
               }
            }

            if(var12 >= 1 && var12 < 103) {
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;
               var17 = 0;

               for(var18 = -5; var18 < 109; ++var18) {
                  var19 = var18 + 5;
                  if(var19 >= 0 && var19 < 104) {
                     var13 += field116[var19];
                     var14 += class168.field2005[var19];
                     var15 += class260.field3306[var19];
                     var16 += class64.field554[var19];
                     var17 += class83.field1086[var19];
                  }

                  var20 = var18 - 5;
                  if(var20 >= 0 && var20 < 104) {
                     var13 -= field116[var20];
                     var14 -= class168.field2005[var20];
                     var15 -= class260.field3306[var20];
                     var16 -= class64.field554[var20];
                     var17 -= class83.field1086[var20];
                  }

                  if(var18 >= 1 && var18 < 103 && (!client.field684 || (class64.field535[0][var12][var18] & 2) != 0 || (class64.field535[var3][var12][var18] & 16) == 0)) {
                     if(var3 < class64.field537) {
                        class64.field537 = var3;
                     }

                     var21 = class64.field538[var3][var12][var18] & 255;
                     int var22 = class348.field4061[var3][var12][var18] & 255;
                     if(var21 > 0 || var22 > 0) {
                        int var23 = class64.field549[var3][var12][var18];
                        int var24 = class64.field549[var3][var12 + 1][var18];
                        int var25 = class64.field549[var3][var12 + 1][var18 + 1];
                        int var26 = class64.field549[var3][var12][var18 + 1];
                        int var27 = class64.field545[var12][var18];
                        int var28 = class64.field545[var12 + 1][var18];
                        int var29 = class64.field545[var12 + 1][var18 + 1];
                        int var30 = class64.field545[var12][var18 + 1];
                        int var31 = -1;
                        int var32 = -1;
                        int var33;
                        int var34;
                        if(var21 > 0) {
                           var33 = var13 * 256 / var16;
                           var34 = var14 / var17;
                           int var35 = var15 / var17;
                           var31 = class55.method947(var33, var34, var35, 137174344);
                           var33 = var33 + class64.field550 & 255;
                           var35 += class64.field548;
                           if(var35 < 0) {
                              var35 = 0;
                           } else if(var35 > 255) {
                              var35 = 255;
                           }

                           var32 = class55.method947(var33, var34, var35, -1026784534);
                        }

                        if(var3 > 0) {
                           boolean var48 = true;
                           if(var21 == 0 && class64.field539[var3][var12][var18] != 0) {
                              var48 = false;
                           }

                           if(var22 > 0 && !class161.method3477(var22 - 1, -1711395255).field3501) {
                              var48 = false;
                           }

                           if(var48 && var23 == var24 && var25 == var23 && var23 == var26) {
                              class51.field404[var3][var12][var18] |= 2340;
                           }
                        }

                        var33 = 0;
                        if(var32 != -1) {
                           var33 = class139.field1790[class233.method4196(var32, 96, -1791203071)];
                        }

                        if(var22 == 0) {
                           var0.method3168(var3, var12, var18, 0, 0, -1, var23, var24, var25, var26, class233.method4196(var31, var27, -2099124176), class233.method4196(var31, var28, -882423749), class233.method4196(var31, var29, -1854158759), class233.method4196(var31, var30, -753345257), 0, 0, 0, 0, var33, 0);
                        } else {
                           var34 = class64.field539[var3][var12][var18] + 1;
                           byte var49 = class64.field540[var3][var12][var18];
                           class267 var36 = class161.method3477(var22 - 1, -1711395255);
                           int var37 = var36.field3509;
                           int var38;
                           int var39;
                           int var40;
                           int var41;
                           if(var37 >= 0) {
                              var39 = class139.field1781.vmethod3372(var37, (short)-26354);
                              var38 = -1;
                           } else if(var36.field3497 == 16711935) {
                              var38 = -2;
                              var37 = -1;
                              var39 = -2;
                           } else {
                              var38 = class55.method947(var36.field3502, var36.field3503, var36.field3505, 1386701856);
                              var40 = var36.field3502 + class64.field550 & 255;
                              var41 = var36.field3505 + class64.field548;
                              if(var41 < 0) {
                                 var41 = 0;
                              } else if(var41 > 255) {
                                 var41 = 255;
                              }

                              var39 = class55.method947(var40, var36.field3503, var41, 66679915);
                           }

                           var40 = 0;
                           if(var39 != -2) {
                              var40 = class139.field1790[class297.method5305(var39, 96, -2032356267)];
                           }

                           if(var36.field3508 != -1) {
                              var41 = var36.field3506 + class64.field550 & 255;
                              int var42 = var36.field3500 + class64.field548;
                              if(var42 < 0) {
                                 var42 = 0;
                              } else if(var42 > 255) {
                                 var42 = 255;
                              }

                              var39 = class55.method947(var41, var36.field3507, var42, 1641509061);
                              var40 = class139.field1790[class297.method5305(var39, 96, -2032356267)];
                           }

                           var0.method3168(var3, var12, var18, var34, var49, var37, var23, var24, var25, var26, class233.method4196(var31, var27, -502573732), class233.method4196(var31, var28, -1123807730), class233.method4196(var31, var29, -981452742), class233.method4196(var31, var30, -1185522294), class297.method5305(var38, var27, -2032356267), class297.method5305(var38, var28, -2032356267), class297.method5305(var38, var29, -2032356267), class297.method5305(var38, var30, -2032356267), var33, var40);
                        }
                     }
                  }
               }
            }
         }

         for(var12 = 1; var12 < 103; ++var12) {
            for(var13 = 1; var13 < 103; ++var13) {
               if((class64.field535[var3][var13][var12] & 8) != 0) {
                  var18 = 0;
               } else if(var3 > 0 && (class64.field535[1][var13][var12] & 2) != 0) {
                  var18 = var3 - 1;
               } else {
                  var18 = var3;
               }

               var0.method3167(var3, var13, var12, var18);
            }
         }

         class64.field538[var3] = null;
         class348.field4061[var3] = null;
         class64.field539[var3] = null;
         class64.field540[var3] = null;
         class117.field1462[var3] = null;
      }

      var0.method3248(-50, -10, -50);

      for(var3 = 0; var3 < 104; ++var3) {
         for(var4 = 0; var4 < 104; ++var4) {
            if((class64.field535[1][var3][var4] & 2) == 2) {
               var0.method3165(var3, var4);
            }
         }
      }

      var3 = 1;
      var4 = 2;
      var5 = 4;

      for(var6 = 0; var6 < 4; ++var6) {
         if(var6 > 0) {
            var3 <<= 3;
            var4 <<= 3;
            var5 <<= 3;
         }

         for(int var7 = 0; var7 <= var6; ++var7) {
            for(int var8 = 0; var8 <= 104; ++var8) {
               for(int var9 = 0; var9 <= 104; ++var9) {
                  short var47;
                  if((class51.field404[var7][var9][var8] & var3) != 0) {
                     var10 = var8;
                     var11 = var8;
                     var12 = var7;

                     for(var13 = var7; var10 > 0 && (class51.field404[var7][var9][var10 - 1] & var3) != 0; --var10) {
                        ;
                     }

                     while(var11 < 104 && (class51.field404[var7][var9][var11 + 1] & var3) != 0) {
                        ++var11;
                     }

                     label444:
                     while(var12 > 0) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if((class51.field404[var12 - 1][var9][var14] & var3) == 0) {
                              break label444;
                           }
                        }

                        --var12;
                     }

                     label455:
                     while(var13 < var6) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if((class51.field404[var13 + 1][var9][var14] & var3) == 0) {
                              break label455;
                           }
                        }

                        ++var13;
                     }

                     var14 = (var11 - var10 + 1) * (var13 + 1 - var12);
                     if(var14 >= 8) {
                        var47 = 240;
                        var16 = class64.field549[var13][var9][var10] - var47;
                        var17 = class64.field549[var12][var9][var10];
                        class142.method3263(var6, 1, var9 * 128, var9 * 128, var10 * 128, var11 * 128 + 128, var16, var17);

                        for(var18 = var12; var18 <= var13; ++var18) {
                           for(var19 = var10; var19 <= var11; ++var19) {
                              class51.field404[var18][var9][var19] &= ~var3;
                           }
                        }
                     }
                  }

                  if((class51.field404[var7][var9][var8] & var4) != 0) {
                     var10 = var9;
                     var11 = var9;
                     var12 = var7;

                     for(var13 = var7; var10 > 0 && (class51.field404[var7][var10 - 1][var8] & var4) != 0; --var10) {
                        ;
                     }

                     while(var11 < 104 && (class51.field404[var7][var11 + 1][var8] & var4) != 0) {
                        ++var11;
                     }

                     label493:
                     while(var12 > 0) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if((class51.field404[var12 - 1][var14][var8] & var4) == 0) {
                              break label493;
                           }
                        }

                        --var12;
                     }

                     label504:
                     while(var13 < var6) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if((class51.field404[var13 + 1][var14][var8] & var4) == 0) {
                              break label504;
                           }
                        }

                        ++var13;
                     }

                     var14 = (var13 + 1 - var12) * (var11 - var10 + 1);
                     if(var14 >= 8) {
                        var47 = 240;
                        var16 = class64.field549[var13][var10][var8] - var47;
                        var17 = class64.field549[var12][var10][var8];
                        class142.method3263(var6, 2, var10 * 128, var11 * 128 + 128, var8 * 128, var8 * 128, var16, var17);

                        for(var18 = var12; var18 <= var13; ++var18) {
                           for(var19 = var10; var19 <= var11; ++var19) {
                              class51.field404[var18][var19][var8] &= ~var4;
                           }
                        }
                     }
                  }

                  if((class51.field404[var7][var9][var8] & var5) != 0) {
                     var10 = var9;
                     var11 = var9;
                     var12 = var8;

                     for(var13 = var8; var12 > 0 && (class51.field404[var7][var9][var12 - 1] & var5) != 0; --var12) {
                        ;
                     }

                     while(var13 < 104 && (class51.field404[var7][var9][var13 + 1] & var5) != 0) {
                        ++var13;
                     }

                     label543:
                     while(var10 > 0) {
                        for(var14 = var12; var14 <= var13; ++var14) {
                           if((class51.field404[var7][var10 - 1][var14] & var5) == 0) {
                              break label543;
                           }
                        }

                        --var10;
                     }

                     label554:
                     while(var11 < 104) {
                        for(var14 = var12; var14 <= var13; ++var14) {
                           if((class51.field404[var7][var11 + 1][var14] & var5) == 0) {
                              break label554;
                           }
                        }

                        ++var11;
                     }

                     if((var13 - var12 + 1) * (var11 - var10 + 1) >= 4) {
                        var14 = class64.field549[var7][var10][var12];
                        class142.method3263(var6, 4, var10 * 128, var11 * 128 + 128, var12 * 128, var13 * 128 + 128, var14, var14);

                        for(var15 = var10; var15 <= var11; ++var15) {
                           for(var16 = var12; var16 <= var13; ++var16) {
                              class51.field404[var7][var15][var16] &= ~var5;
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
