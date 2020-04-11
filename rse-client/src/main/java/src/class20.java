package src;

import java.util.Comparator;

final class class20 implements Comparator {

   static class334 field110;
   static class245 field113;
   static class226 field115;


   int method233(class16 var1, class16 var2, int var3) {
      return var1.method157(1636604960).compareTo(var2.method157(941575538));
   }

   public int compare(Object var1, Object var2) {
      return this.method233((class16)var1, (class16)var2, -1993640176);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final void method237(int var0, int var1, boolean var2, int var3) {
      if(!var2 || var0 != class69.field585 || class63.field529 != var1) {
         class69.field585 = var0;
         class63.field529 = var1;
         class72.method1293(25, -2116688065);
         class214.method4004("Loading - please wait.", true, -278752223);
         int var4 = class69.field590 * 731242929;
         int var5 = class89.field1152 * 1825982697;
         class69.field590 = (var0 - 6) * 413022856;
         class89.field1152 = (var1 - 6) * 1679325896;
         int var6 = class69.field590 * 731242929 - var4;
         int var7 = class89.field1152 * 1825982697 - var5;
         var4 = class69.field590 * 731242929;
         var5 = class89.field1152 * 1825982697;

         int var8;
         int var10;
         for(var8 = 0; var8 < '\u8000'; ++var8) {
            class88 var9 = client.field721[var8];
            if(var9 != null) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var9.field1028[var10] -= var6;
                  var9.field1029[var10] -= var7;
               }

               var9.field983 -= var6 * 128;
               var9.field973 -= var7 * 128;
            }
         }

         for(var8 = 0; var8 < 2048; ++var8) {
            class75 var22 = client.players[var8];
            if(var22 != null) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var22.field1028[var10] -= var6;
                  var22.field1029[var10] -= var7;
               }

               var22.field983 -= var6 * 128;
               var22.field973 -= var7 * 128;
            }
         }

         byte var21 = 0;
         byte var19 = 104;
         byte var23 = 1;
         if(var6 < 0) {
            var21 = 103;
            var19 = -1;
            var23 = -1;
         }

         byte var11 = 0;
         byte var12 = 104;
         byte var13 = 1;
         if(var7 < 0) {
            var11 = 103;
            var12 = -1;
            var13 = -1;
         }

         int var15;
         for(int var14 = var21; var19 != var14; var14 += var23) {
            for(var15 = var11; var15 != var12; var15 += var13) {
               int var16 = var6 + var14;
               int var17 = var15 + var7;

               for(int var18 = 0; var18 < 4; ++var18) {
                  if(var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                     client.field808[var18][var14][var15] = client.field808[var18][var16][var17];
                  } else {
                     client.field808[var18][var14][var15] = null;
                  }
               }
            }
         }

         for(class77 var20 = (class77)client.field697.method4931(); var20 != null; var20 = (class77)client.field697.method4949()) {
            var20.field960 -= var6;
            var20.field961 -= var7;
            if(var20.field960 < 0 || var20.field961 < 0 || var20.field960 >= 104 || var20.field961 >= 104) {
               var20.method3657();
            }
         }

         if(client.field910 != 0) {
            client.field910 -= var6;
            client.field911 -= var7;
         }

         client.field936 = 0;
         client.field888 = false;
         class31.field220 -= var6 << 7;
         class200.field2372 -= var7 << 7;
         class116.field1454 -= var6 << 7;
         ServerPacket.field2206 -= var7 << 7;
         client.field695 = -1;
         client.field811.method4925();
         client.field810.method4925();

         for(var15 = 0; var15 < 4; ++var15) {
            client.field737[var15].method3618(-1243074486);
         }

      }
   }

   static int method238(int var0, class101 var1, boolean var2, byte var3) {
      if(var0 == 6500) {
         class85.field1115[++class85.field1117 - 1] = class199.method3729(-194195211)?1:0;
         return 1;
      } else {
         class80 var4;
         if(var0 == 6501) {
            var4 = class34.method437(-1617483479);
            if(var4 != null) {
               class85.field1115[++class85.field1117 - 1] = var4.field1040;
               class85.field1115[++class85.field1117 - 1] = var4.field1049;
               class85.field1118[++class85.field1119 - 1] = var4.field1052;
               class85.field1115[++class85.field1117 - 1] = var4.field1053;
               class85.field1115[++class85.field1117 - 1] = var4.field1050;
               class85.field1118[++class85.field1119 - 1] = var4.field1051;
            } else {
               class85.field1115[++class85.field1117 - 1] = -1;
               class85.field1115[++class85.field1117 - 1] = 0;
               class85.field1118[++class85.field1119 - 1] = "";
               class85.field1115[++class85.field1117 - 1] = 0;
               class85.field1115[++class85.field1117 - 1] = 0;
               class85.field1118[++class85.field1119 - 1] = "";
            }

            return 1;
         } else if(var0 == 6502) {
            var4 = class63.method1184(815744206);
            if(var4 != null) {
               class85.field1115[++class85.field1117 - 1] = var4.field1040;
               class85.field1115[++class85.field1117 - 1] = var4.field1049;
               class85.field1118[++class85.field1119 - 1] = var4.field1052;
               class85.field1115[++class85.field1117 - 1] = var4.field1053;
               class85.field1115[++class85.field1117 - 1] = var4.field1050;
               class85.field1118[++class85.field1119 - 1] = var4.field1051;
            } else {
               class85.field1115[++class85.field1117 - 1] = -1;
               class85.field1115[++class85.field1117 - 1] = 0;
               class85.field1118[++class85.field1119 - 1] = "";
               class85.field1115[++class85.field1117 - 1] = 0;
               class85.field1115[++class85.field1117 - 1] = 0;
               class85.field1118[++class85.field1119 - 1] = "";
            }

            return 1;
         } else {
            class80 var5;
            int var6;
            int var8;
            if(var0 == 6506) {
               var8 = class85.field1115[--class85.field1117];
               var5 = null;

               for(var6 = 0; var6 < class80.field1044; ++var6) {
                  if(var8 == class324.field3837[var6].field1040) {
                     var5 = class324.field3837[var6];
                     break;
                  }
               }

               if(var5 != null) {
                  class85.field1115[++class85.field1117 - 1] = var5.field1040;
                  class85.field1115[++class85.field1117 - 1] = var5.field1049;
                  class85.field1118[++class85.field1119 - 1] = var5.field1052;
                  class85.field1115[++class85.field1117 - 1] = var5.field1053;
                  class85.field1115[++class85.field1117 - 1] = var5.field1050;
                  class85.field1118[++class85.field1119 - 1] = var5.field1051;
               } else {
                  class85.field1115[++class85.field1117 - 1] = -1;
                  class85.field1115[++class85.field1117 - 1] = 0;
                  class85.field1118[++class85.field1119 - 1] = "";
                  class85.field1115[++class85.field1117 - 1] = 0;
                  class85.field1115[++class85.field1117 - 1] = 0;
                  class85.field1118[++class85.field1119 - 1] = "";
               }

               return 1;
            } else if(var0 == 6507) {
               class85.field1117 -= 4;
               var8 = class85.field1115[class85.field1117];
               boolean var11 = class85.field1115[class85.field1117 + 1] == 1;
               var6 = class85.field1115[class85.field1117 + 2];
               boolean var7 = class85.field1115[class85.field1117 + 3] == 1;
               class75.method1384(var8, var11, var6, var7, 1788243043);
               return 1;
            } else if(var0 != 6511) {
               if(var0 == 6512) {
                  client.field825 = class85.field1115[--class85.field1117] == 1;
                  return 1;
               } else {
                  int var9;
                  class259 var10;
                  if(var0 == 6513) {
                     class85.field1117 -= 2;
                     var8 = class85.field1115[class85.field1117];
                     var9 = class85.field1115[class85.field1117 + 1];
                     var10 = class285.method5110(var9, (byte)49);
                     if(var10.method4550(861109850)) {
                        class85.field1118[++class85.field1119 - 1] = class237.method4201(var8, 1283502336).method4769(var9, var10.field3299, (byte)-61);
                     } else {
                        class85.field1115[++class85.field1117 - 1] = class237.method4201(var8, 1811916790).method4771(var9, var10.field3298, (short)-11262);
                     }

                     return 1;
                  } else if(var0 == 6514) {
                     class85.field1117 -= 2;
                     var8 = class85.field1115[class85.field1117];
                     var9 = class85.field1115[class85.field1117 + 1];
                     var10 = class285.method5110(var9, (byte)2);
                     if(var10.method4550(237467148)) {
                        class85.field1118[++class85.field1119 - 1] = class33.method435(var8, 1650295452).method4680(var9, var10.field3299, -1816202472);
                     } else {
                        class85.field1115[++class85.field1117 - 1] = class33.method435(var8, 1650295452).method4667(var9, var10.field3298, (byte)-99);
                     }

                     return 1;
                  } else if(var0 == 6515) {
                     class85.field1117 -= 2;
                     var8 = class85.field1115[class85.field1117];
                     var9 = class85.field1115[class85.field1117 + 1];
                     var10 = class285.method5110(var9, (byte)88);
                     if(var10.method4550(712245653)) {
                        class85.field1118[++class85.field1119 - 1] = class30.method373(var8, (byte)14).method4702(var9, var10.field3299, 1527088310);
                     } else {
                        class85.field1115[++class85.field1117 - 1] = class30.method373(var8, (byte)-13).method4704(var9, var10.field3298, 1313437382);
                     }

                     return 1;
                  } else if(var0 == 6516) {
                     class85.field1117 -= 2;
                     var8 = class85.field1115[class85.field1117];
                     var9 = class85.field1115[class85.field1117 + 1];
                     var10 = class285.method5110(var9, (byte)21);
                     if(var10.method4550(-1070204368)) {
                        class85.field1118[++class85.field1119 - 1] = class267.method4801(var8, (byte)6).method4562(var9, var10.field3299, -1577444936);
                     } else {
                        class85.field1115[++class85.field1117 - 1] = class267.method4801(var8, (byte)-11).method4564(var9, var10.field3298, 1605132881);
                     }

                     return 1;
                  } else if(var0 == 6518) {
                     class85.field1115[++class85.field1117 - 1] = client.field782?1:0;
                     return 1;
                  } else if(var0 == 6519) {
                     class85.field1115[++class85.field1117 - 1] = client.field685 & 3;
                     return 1;
                  } else if(var0 == 6520) {
                     return 1;
                  } else if(var0 == 6521) {
                     return 1;
                  } else if(var0 == 6522) {
                     --class85.field1119;
                     --class85.field1117;
                     return 1;
                  } else if(var0 == 6523) {
                     --class85.field1119;
                     --class85.field1117;
                     return 1;
                  } else if(var0 == 6524) {
                     class85.field1115[++class85.field1117 - 1] = -1;
                     return 1;
                  } else if(var0 == 6525) {
                     class85.field1115[++class85.field1117 - 1] = 1;
                     return 1;
                  } else if(var0 == 6526) {
                     class85.field1115[++class85.field1117 - 1] = 1;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var8 = class85.field1115[--class85.field1117];
               if(var8 >= 0 && var8 < class80.field1044) {
                  var5 = class324.field3837[var8];
                  class85.field1115[++class85.field1117 - 1] = var5.field1040;
                  class85.field1115[++class85.field1117 - 1] = var5.field1049;
                  class85.field1118[++class85.field1119 - 1] = var5.field1052;
                  class85.field1115[++class85.field1117 - 1] = var5.field1053;
                  class85.field1115[++class85.field1117 - 1] = var5.field1050;
                  class85.field1118[++class85.field1119 - 1] = var5.field1051;
               } else {
                  class85.field1115[++class85.field1117 - 1] = -1;
                  class85.field1115[++class85.field1117 - 1] = 0;
                  class85.field1118[++class85.field1119 - 1] = "";
                  class85.field1115[++class85.field1117 - 1] = 0;
                  class85.field1115[++class85.field1117 - 1] = 0;
                  class85.field1118[++class85.field1119 - 1] = "";
               }

               return 1;
            }
         }
      }
   }

   static final void method239(class308 var0, int var1, class75 var2, int var3, int var4) {
      byte var5 = -1;
      if((var3 & 512) != 0) {
         var2.field990 = var0.readByte(-649119681);
         var2.field1017 = var0.readByte(-1409270265);
         var2.field972 = var0.method5581(12345678);
         var2.field1018 = var0.method5579(-1132241319);
         var2.field1019 = var0.method5587(913288350) + client.field689;
         var2.field1020 = var0.method5587(-58322318) + client.field689;
         var2.field1021 = var0.readShort((byte)28);
         if(var2.field670) {
            var2.field990 += var2.field665;
            var2.field1017 += var2.field672;
            var2.field972 += var2.field665;
            var2.field1018 += var2.field672;
            var2.field1027 = 0;
         } else {
            var2.field990 += var2.field1028[0];
            var2.field1017 += var2.field1029[0];
            var2.field972 += var2.field1028[0];
            var2.field1018 += var2.field1029[0];
            var2.field1027 = 1;
         }

         var2.field1032 = 0;
      }

      int var6;
      if((var3 & 2048) != 0) {
         var2.field1009 = var0.method5586((byte)102);
         var6 = var0.method5592(-1615826752);
         var2.field1033 = var6 >> 16;
         var2.field1013 = (var6 & '\uffff') + client.field689;
         var2.field1006 = 0;
         var2.field1012 = 0;
         if(var2.field1013 > client.field689) {
            var2.field1006 = -1;
         }

         if(var2.field1009 == '\uffff') {
            var2.field1009 = -1;
         }
      }

      int var7;
      if((var3 & 128) != 0) {
         System.out.println("animation update");
         var6 = var0.readUnsignedShort((byte)70);
         System.out.println("animation: " + var6);
         if(var6 == '\uffff') {
            var6 = -1;
         }

         var7 = var0.readByteN(1190550583);
         System.out.println("animation delay: " + var7);
         class14.method149(var2, var6, var7, (byte)8);
      }

      if((var3 & 2) != 0) {
         System.out.println("player appearance update");
         var6 = var0.readUnsignedByte((byte)106);
         System.out.println("appearance length: " + var6);
         byte[] var14 = new byte[var6];
         class309 buffer = new class309(var14);
         var0.method5595(var14, 0, var6, (byte)69);
         class98.field1269[var1] = buffer;
         var2.method1330(buffer, -1398428480);
      }

      if((var3 & 32) != 0) {
         var2.field1002 = var0.method5667(-2118946105);
         if(var2.field1002.charAt(0) == 126) {
            var2.field1002 = var2.field1002.substring(1);
            class141.method3161(2, var2.field652.method5238(-1494894374), var2.field1002, 386367947);
         } else if(var2 == class311.field3717) {
            class141.method3161(2, var2.field652.method5238(1203275540), var2.field1002, 1975734728);
         }

         var2.field1030 = false;
         var2.field987 = 0;
         var2.field991 = 0;
         var2.field989 = 150;
      }

      if((var3 & 4) != 0) {
         var2.field999 = var0.method5587(-89428685);
         if(var2.field999 == '\uffff') {
            var2.field999 = -1;
         }
      }

      if((var3 & 4096) != 0) {
         class98.field1273[var1] = var0.method5580(-1278925159);
         System.out.println("unknown mask: " + class98.field1273[var1]);
      }

      int var9;
      int var10;
      int var13;
      if((var3 & 1) != 0) {
         var6 = var0.method5586((byte)105);
         class238 var19 = (class238)class16.method159(class70.method1278((byte)61), var0.readByteN(1626574628), -1609956543);
         boolean var15 = var0.readByteN(279752499) == 1;
         var9 = var0.method5576(-499249652);
         var10 = var0.field3710;
         if(var2.field652 != null && var2.field646 != null) {
            boolean var11 = false;
            if(var19.field3095 && class95.field1252.method1944(var2.field652, (byte)-98)) {
               var11 = true;
            }

            if(!var11 && client.field794 == 0 && !var2.field651) {
               class98.field1268.field3710 = 0;
               var0.method5620(class98.field1268.field3709, 0, var9, 1021136506);
               class98.field1268.field3710 = 0;
               String var12 = class305.method5388(class121.method2622(class176.method3563(class98.field1268, 677991921), 458877468));
               var2.field1002 = var12.trim();
               var2.field987 = var6 >> 8;
               var2.field991 = var6 & 255;
               var2.field989 = 150;
               var2.field1030 = var15;
               var2.field988 = var2 != class311.field3717 && var19.field3095 && "" != client.field814 && var12.toLowerCase().indexOf(client.field814) == -1;
               if(var19.field3086) {
                  var13 = var15?91:1;
               } else {
                  var13 = var15?90:2;
               }

               if(var19.field3088 != -1) {
                  class141.method3161(var13, class1.method21(var19.field3088, 652077907) + var2.field652.method5238(1928173820), var12, 970305111);
               } else {
                  class141.method3161(var13, var2.field652.method5238(-1065467149), var12, 54171653);
               }
            }
         }

         var0.field3710 = var10 + var9;
      }

      if((var3 & 256) != 0) {
         System.out.println("action update mask");
         for(var6 = 0; var6 < 3; ++var6) {
            var2.field649[var6] = var0.method5667(-463506160);
            System.out.println(var2.field649[var6]);
         }
      }

      if((var3 & 16) != 0) {
         var6 = var0.readUnsignedByte((byte)121);
         int var16;
         int var18;
         int var20;
         if(var6 > 0) {
            for(var7 = 0; var7 < var6; ++var7) {
               var9 = -1;
               var10 = -1;
               var18 = -1;
               var20 = var0.method5561(595405149);
               if(var20 == 32767) {
                  var20 = var0.method5561(1175018345);
                  var10 = var0.method5561(846244723);
                  var9 = var0.method5561(1261530765);
                  var18 = var0.method5561(1865336155);
               } else if(var20 != 32766) {
                  var10 = var0.method5561(1844951605);
               } else {
                  var20 = -1;
               }

               var16 = var0.method5561(675921125);
               var2.method1845(var20, var10, var9, var18, client.field689, var16, -2078620773);
            }
         }

         var7 = var0.readUnsignedByte((byte)26);
         if(var7 > 0) {
            for(var20 = 0; var20 < var7; ++var20) {
               var9 = var0.method5561(1814212524);
               var10 = var0.method5561(1414623262);
               if(var10 != 32767) {
                  var18 = var0.method5561(1392756891);
                  var16 = var0.readUnsignedByte((byte)74);
                  var13 = var10 > 0?var0.readByteN(1636027142):var16;
                  var2.method1831(var9, client.field689, var10, var18, var16, var13, (byte)-123);
               } else {
                  var2.method1832(var9, -971039498);
               }
            }
         }
      }

      if((var3 & 1024) != 0) {
         var5 = var0.method5580(-1919455303);
      }

      if((var3 & 8) != 0) {
         var2.field1015 = var0.method5586((byte)116);
         System.out.println("unknown mask 2: " + var2.field1015);
         if(var2.field1027 == 0) {
            var2.field979 = var2.field1015;
            var2.field1015 = -1;
         }
      }

      if(var2.field670) {
         if(var5 == 127) {
            var2.method1379(var2.field665, var2.field672, -2118599552);
         } else {
            byte var17;
            if(var5 != -1) {
               var17 = var5;
            } else {
               var17 = class98.field1273[var1];
            }

            var2.method1339(var2.field665, var2.field672, var17, -618087503);
         }
      }

   }
}
