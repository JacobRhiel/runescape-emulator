package src;

public abstract class class214 {

   public abstract void vmethod4006(byte[] var1, byte var2);

   abstract byte[] vmethod4008(int var1);

   static void method4002(int var0) {
      client.field693 = 0;
      client.field816 = false;
   }

   static final void method4005(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7, int var8) {
      if(var2 >= 2000) {
         var2 -= 2000;
      }

      class196 var9;
      if(var2 == 1) {
         client.field922 = var6;
         client.field688 = var7;
         client.field784 = 2;
         client.field783 = 0;
         client.field910 = var0;
         client.field911 = var1;
         var9 = class146.method3363(ClientPacket.field2240, client.field761.field1340, -1864596991);
         var9.field2338.writeShortA(client.field957, -1912951471);
         var9.field2338.method5591(class33.field243, 1399362845);
         var9.field2338.writeULEShort(class89.field1152 * 1825982697 + var1, 70039705);
         var9.field2338.writeULEShort(var0 + class69.field590 * 731242929, 70039705);
         var9.field2338.writeULEShort(var3, 70039705);
         var9.field2338.writeULEShort(class146.field1899, 70039705);
         var9.field2338.method5700(class54.field426[82]?1:0, -927080333);
         client.field761.method2361(var9, 1843883968);
      } else if(var2 == 2) {
         client.field922 = var6;
         client.field688 = var7;
         client.field784 = 2;
         client.field783 = 0;
         client.field910 = var0;
         client.field911 = var1;
         var9 = class146.method3363(ClientPacket.field2252, client.field761.field1340, -2012690498);
         var9.field2338.writeShort(client.field836, (byte)-22);
         var9.field2338.writeInt(class7.field29, 747474969);
         var9.field2338.writeShortA(var3, -979883098);
         var9.field2338.writeULEShort(class89.field1152 * 1825982697 + var1, 70039705);
         var9.field2338.method5575(class54.field426[82]?1:0, (byte)16);
         var9.field2338.writeULEShort(var0 + class69.field590 * 731242929, 70039705);
         client.field761.method2361(var9, 828201461);
      } else if(var2 == 3) {
         client.field922 = var6;
         client.field688 = var7;
         client.field784 = 2;
         client.field783 = 0;
         client.field910 = var0;
         client.field911 = var1;
         var9 = class146.method3363(ClientPacket.field2221, client.field761.field1340, -1905185610);
         var9.field2338.method5575(class54.field426[82]?1:0, (byte)16);
         var9.field2338.writeLEShortA(var0 + class69.field590 * 731242929, 300462429);
         var9.field2338.writeULEShort(var3, 70039705);
         var9.field2338.writeULEShort(var1 + class89.field1152 * 1825982697, 70039705);
         client.field761.method2361(var9, 923602484);
      } else if(var2 == 4) {
         client.field922 = var6;
         client.field688 = var7;
         client.field784 = 2;
         client.field783 = 0;
         client.field910 = var0;
         client.field911 = var1;
         var9 = class146.method3363(ClientPacket.field2243, client.field761.field1340, -1973502695);
         var9.field2338.writeShort(var3, (byte)-54);
         var9.field2338.writeLEShortA(var0 + class69.field590 * 731242929, 262403225);
         var9.field2338.writeLEShortA(class89.field1152 * 1825982697 + var1, 1342932825);
         var9.field2338.method5697(class54.field426[82]?1:0, (byte)64);
         client.field761.method2361(var9, 1166824906);
      } else if(var2 == 5) {
         client.field922 = var6;
         client.field688 = var7;
         client.field784 = 2;
         client.field783 = 0;
         client.field910 = var0;
         client.field911 = var1;
         var9 = class146.method3363(ClientPacket.field2296, client.field761.field1340, -2040633888);
         var9.field2338.writeShortA(var0 + class69.field590 * 731242929, -1255169545);
         var9.field2338.writeLEShortA(var1 + class89.field1152 * 1825982697, 1313961216);
         var9.field2338.method5700(class54.field426[82]?1:0, -927080333);
         var9.field2338.writeShortA(var3, -1369656115);
         client.field761.method2361(var9, 1458239651);
      } else if(var2 == 6) {
         client.field922 = var6;
         client.field688 = var7;
         client.field784 = 2;
         client.field783 = 0;
         client.field910 = var0;
         client.field911 = var1;
         var9 = class146.method3363(ClientPacket.field2288, client.field761.field1340, -2119943572);
         var9.field2338.writeShortA(var3, -733677869);
         var9.field2338.readByte(class54.field426[82]?1:0, 1258821856);
         var9.field2338.writeShort(var0 + class69.field590 * 731242929, (byte)-27);
         var9.field2338.writeULEShort(var1 + class89.field1152 * 1825982697, 70039705);
         client.field761.method2361(var9, 520082495);
      } else {
         class196 var10;
         class88 var14;
         if(var2 == 7) {
            var14 = client.field721[var3];
            if(var14 != null) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var10 = class146.method3363(ClientPacket.field2237, client.field761.field1340, -1848526907);
               var10.field2338.writeShort(client.field957, (byte)-67);
               var10.field2338.writeShort(class146.field1899, (byte)-126);
               var10.field2338.writeInt(class33.field243, 747474969);
               var10.field2338.method5700(class54.field426[82]?1:0, -927080333);
               var10.field2338.writeULEShort(var3, 70039705);
               client.field761.method2361(var10, 1236114026);
            }
         } else if(var2 == 8) {
            var14 = client.field721[var3];
            if(var14 != null) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var10 = class146.method3363(ClientPacket.field2271, client.field761.field1340, -1877714487);
               var10.field2338.method5575(class54.field426[82]?1:0, (byte)16);
               var10.field2338.writeInt(class7.field29, 747474969);
               var10.field2338.writeShort(client.field836, (byte)-85);
               var10.field2338.writeShort(var3, (byte)-38);
               client.field761.method2361(var10, 1515183949);
            }
         } else if(var2 == 9) {
            var14 = client.field721[var3];
            if(var14 != null) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var10 = class146.method3363(ClientPacket.field2263, client.field761.field1340, -1955329866);
               var10.field2338.writeULEShort(var3, 70039705);
               var10.field2338.method5697(class54.field426[82]?1:0, (byte)78);
               client.field761.method2361(var10, 330138770);
            }
         } else if(var2 == 10) {
            var14 = client.field721[var3];
            if(var14 != null) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var10 = class146.method3363(ClientPacket.field2211, client.field761.field1340, -1997663151);
               var10.field2338.writeShort(var3, (byte)-93);
               var10.field2338.method5697(class54.field426[82]?1:0, (byte)-66);
               client.field761.method2361(var10, 287618246);
            }
         } else if(var2 == 11) {
            var14 = client.field721[var3];
            if(var14 != null) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var10 = class146.method3363(ClientPacket.field2277, client.field761.field1340, -2110992892);
               var10.field2338.writeShortA(var3, -1737468624);
               var10.field2338.method5697(class54.field426[82]?1:0, (byte)-34);
               client.field761.method2361(var10, 481641381);
            }
         } else if(var2 == 12) {
            var14 = client.field721[var3];
            if(var14 != null) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var10 = class146.method3363(ClientPacket.field2219, client.field761.field1340, -2004922584);
               var10.field2338.method5575(class54.field426[82]?1:0, (byte)16);
               var10.field2338.writeULEShort(var3, 70039705);
               client.field761.method2361(var10, 1838927284);
            }
         } else if(var2 == 13) {
            var14 = client.field721[var3];
            if(var14 != null) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var10 = class146.method3363(ClientPacket.field2303, client.field761.field1340, -1832637729);
               var10.field2338.readByte(class54.field426[82]?1:0, 1258821856);
               var10.field2338.writeShort(var3, (byte)-62);
               client.field761.method2361(var10, 581494031);
            }
         } else {
            class75 var16;
            if(var2 == 14) {
               var16 = client.players[var3];
               if(var16 != null) {
                  client.field922 = var6;
                  client.field688 = var7;
                  client.field784 = 2;
                  client.field783 = 0;
                  client.field910 = var0;
                  client.field911 = var1;
                  var10 = class146.method3363(ClientPacket.field2225, client.field761.field1340, -1964427323);
                  var10.field2338.writeShortA(class146.field1899, -502592808);
                  var10.field2338.writeShortA(var3, -1311151125);
                  var10.field2338.method5700(class54.field426[82]?1:0, -927080333);
                  var10.field2338.writeLEShortA(client.field957, 1935856408);
                  var10.field2338.writeInt(class33.field243, 747474969);
                  client.field761.method2361(var10, 449936171);
               }
            } else if(var2 == 15) {
               var16 = client.players[var3];
               if(var16 != null) {
                  client.field922 = var6;
                  client.field688 = var7;
                  client.field784 = 2;
                  client.field783 = 0;
                  client.field910 = var0;
                  client.field911 = var1;
                  var10 = class146.method3363(ClientPacket.field2300, client.field761.field1340, -1917009782);
                  var10.field2338.writeShort(var3, (byte)-87);
                  var10.field2338.writeLEInt(class7.field29, -591906963);
                  var10.field2338.readByte(class54.field426[82]?1:0, 1258821856);
                  var10.field2338.writeShortA(client.field836, -1299861319);
                  client.field761.method2361(var10, 1217337068);
               }
            } else if(var2 == 16) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var9 = class146.method3363(ClientPacket.field2302, client.field761.field1340, -2025818889);
               var9.field2338.writeShortA(class146.field1899, -1533718253);
               var9.field2338.writeLEShortA(var3, 1519429750);
               var9.field2338.method5697(class54.field426[82]?1:0, (byte)51);
               var9.field2338.method5591(class33.field243, 1186318843);
               var9.field2338.writeLEShortA(var0 + class69.field590 * 731242929, -72535625);
               var9.field2338.writeLEShortA(client.field957, -557957316);
               var9.field2338.writeULEShort(var1 + class89.field1152 * 1825982697, 70039705);
               client.field761.method2361(var9, 1421955551);
            } else if(var2 == 17) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var9 = class146.method3363(ClientPacket.field2233, client.field761.field1340, -1875491851);
               var9.field2338.method5697(class54.field426[82]?1:0, (byte)-43);
               var9.field2338.writeULEShort(var3, 70039705);
               var9.field2338.writeLEShortA(client.field836, -1063739477);
               var9.field2338.writeShort(var1 + class89.field1152 * 1825982697, (byte)-63);
               var9.field2338.writeLEInt(class7.field29, 1262115055);
               var9.field2338.writeLEShortA(var0 + class69.field590 * 731242929, -366731667);
               client.field761.method2361(var9, 989390776);
            } else if(var2 == 18) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var9 = class146.method3363(ClientPacket.field2287, client.field761.field1340, -2049751087);
               var9.field2338.writeLEShortA(var3, -1228921778);
               var9.field2338.writeLEShortA(var0 + class69.field590 * 731242929, 605165);
               var9.field2338.writeULEShort(var1 + class89.field1152 * 1825982697, 70039705);
               var9.field2338.method5697(class54.field426[82]?1:0, (byte)43);
               client.field761.method2361(var9, 1983631295);
            } else if(var2 == 19) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var9 = class146.method3363(ClientPacket.field2286, client.field761.field1340, -2005428887);
               var9.field2338.writeShort(class89.field1152 * 1825982697 + var1, (byte)-125);
               var9.field2338.writeShortA(var0 + class69.field590 * 731242929, -551480953);
               var9.field2338.method5700(class54.field426[82]?1:0, -927080333);
               var9.field2338.writeShort(var3, (byte)-1);
               client.field761.method2361(var9, 1849813620);
            } else if(var2 == 20) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var9 = class146.method3363(ClientPacket.field2275, client.field761.field1340, -2145851935);
               var9.field2338.readByte(class54.field426[82]?1:0, 1258821856);
               var9.field2338.writeULEShort(var0 + class69.field590 * 731242929, 70039705);
               var9.field2338.writeShortA(var1 + class89.field1152 * 1825982697, -1081695930);
               var9.field2338.writeLEShortA(var3, -1284104682);
               client.field761.method2361(var9, 682083392);
            } else if(var2 == 21) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var9 = class146.method3363(ClientPacket.field2227, client.field761.field1340, -1841414654);
               var9.field2338.readByte(class54.field426[82]?1:0, 1258821856);
               var9.field2338.writeULEShort(var3, 70039705);
               var9.field2338.writeULEShort(var0 + class69.field590 * 731242929, 70039705);
               var9.field2338.writeShortA(var1 + class89.field1152 * 1825982697, -1656781085);
               client.field761.method2361(var9, 1893866076);
            } else if(var2 == 22) {
               client.field922 = var6;
               client.field688 = var7;
               client.field784 = 2;
               client.field783 = 0;
               client.field910 = var0;
               client.field911 = var1;
               var9 = class146.method3363(ClientPacket.field2235, client.field761.field1340, -2044408870);
               var9.field2338.writeShort(var3, (byte)-115);
               var9.field2338.writeShortA(var1 + class89.field1152 * 1825982697, -1628669805);
               var9.field2338.method5700(class54.field426[82]?1:0, -927080333);
               var9.field2338.writeShortA(var0 + class69.field590 * 731242929, -944952200);
               client.field761.method2361(var9, 276461356);
            } else if(var2 == 23) {
               if(client.field816) {
                  class14.field60.method3325();
               } else {
                  class14.field60.method3199(class71.field610, var0, var1, true);
               }
            } else {
               class196 var11;
               class226 var17;
               if(var2 == 24) {
                  var17 = class208.method3898(var1, (byte)-20);
                  boolean var12 = true;
                  if(var17.field2571 > 0) {
                     var12 = class29.method344(var17, (byte)47);
                  }

                  if(var12) {
                     var11 = class146.method3363(ClientPacket.field2231, client.field761.field1340, -1785545964);
                     var11.field2338.writeInt(var1, 747474969);
                     client.field761.method2361(var11, 229187104);
                  }
               } else {
                  if(var2 == 25) {
                     var17 = class19.method224(var1, var0, 166208311);
                     if(var17 != null) {
                        class18.method210((byte)4);
                        class48.method815(var1, var0, class31.method388(class71.method1283(var17, -1500770780), -1866970355), var17.field2704, (byte)85);
                        client.field833 = 0;
                        client.field838 = class319.method5931(var17, (byte)70);
                        if(client.field838 == null) {
                           client.field838 = "null";
                        }

                        if(var17.field2566) {
                           client.field839 = var17.field2593 + class297.method5314(16777215, 343302127);
                        } else {
                           client.field839 = class297.method5314('\uff00', 2109880800) + var17.field2689 + class297.method5314(16777215, 119323962);
                        }
                     }

                     return;
                  }

                  if(var2 == 26) {
                     class227.method4160(1891530232);
                  } else {
                     int var13;
                     class226 var15;
                     if(var2 == 28) {
                        var9 = class146.method3363(ClientPacket.field2231, client.field761.field1340, -2131407145);
                        var9.field2338.writeInt(var1, 747474969);
                        client.field761.method2361(var9, 1834307895);
                        var15 = class208.method3898(var1, (byte)-82);
                        if(var15.field2650 != null && var15.field2650[0][0] == 5) {
                           var13 = var15.field2650[0][1];
                           class221.field2526[var13] = 1 - class221.field2526[var13];
                           class22.method253(var13, (byte)-121);
                        }
                     } else if(var2 == 29) {
                        var9 = class146.method3363(ClientPacket.field2231, client.field761.field1340, -1796697436);
                        var9.field2338.writeInt(var1, 747474969);
                        client.field761.method2361(var9, 1445062341);
                        var15 = class208.method3898(var1, (byte)-50);
                        if(var15.field2650 != null && var15.field2650[0][0] == 5) {
                           var13 = var15.field2650[0][1];
                           if(class221.field2526[var13] != var15.field2687[0]) {
                              class221.field2526[var13] = var15.field2687[0];
                              class22.method253(var13, (byte)-109);
                           }
                        }
                     } else if(var2 == 30) {
                        if(client.field882 == null) {
                           class58.method968(var1, var0, 70910120);
                           client.field882 = class19.method224(var1, var0, 1208475609);
                           class68.method1273(client.field882, -1593218804);
                        }
                     } else if(var2 == 31) {
                        var9 = class146.method3363(ClientPacket.field2305, client.field761.field1340, -1904989180);
                        var9.field2338.method5591(var1, 2139418747);
                        var9.field2338.writeLEShortA(client.field957, 1725259723);
                        var9.field2338.method5617(class33.field243, -598231963);
                        var9.field2338.writeShortA(var0, -1751715490);
                        var9.field2338.writeShort(var3, (byte)-74);
                        var9.field2338.writeShortA(class146.field1899, -2019608122);
                        client.field761.method2361(var9, 1021326584);
                        client.field786 = 0;
                        class40.field307 = class208.method3898(var1, (byte)-124);
                        client.field880 = var0;
                     } else if(var2 == 32) {
                        var9 = class146.method3363(ClientPacket.field2228, client.field761.field1340, -1896955808);
                        var9.field2338.writeULEShort(client.field836, 70039705);
                        var9.field2338.method5617(class7.field29, -598231963);
                        var9.field2338.writeShortA(var3, -451398633);
                        var9.field2338.writeShortA(var0, -445661238);
                        var9.field2338.method5617(var1, -598231963);
                        client.field761.method2361(var9, 491433042);
                        client.field786 = 0;
                        class40.field307 = class208.method3898(var1, (byte)-120);
                        client.field880 = var0;
                     } else if(var2 == 33) {
                        var9 = class146.method3363(ClientPacket.field2292, client.field761.field1340, -1926377307);
                        var9.field2338.writeULEShort(var3, 70039705);
                        var9.field2338.writeLEInt(var1, 2088149978);
                        var9.field2338.writeShort(var0, (byte)-70);
                        client.field761.method2361(var9, 798676804);
                        client.field786 = 0;
                        class40.field307 = class208.method3898(var1, (byte)-74);
                        client.field880 = var0;
                     } else if(var2 == 34) {
                        var9 = class146.method3363(ClientPacket.field2265, client.field761.field1340, -2041543717);
                        var9.field2338.writeInt(var1, 747474969);
                        var9.field2338.writeShortA(var3, -2135906359);
                        var9.field2338.writeLEShortA(var0, 2024544747);
                        client.field761.method2361(var9, 1988246370);
                        client.field786 = 0;
                        class40.field307 = class208.method3898(var1, (byte)-33);
                        client.field880 = var0;
                     } else if(var2 == 35) {
                        var9 = class146.method3363(ClientPacket.field2268, client.field761.field1340, -2075002456);
                        var9.field2338.writeInt(var1, 747474969);
                        var9.field2338.writeULEShort(var3, 70039705);
                        var9.field2338.writeShort(var0, (byte)-103);
                        client.field761.method2361(var9, 2039428951);
                        client.field786 = 0;
                        class40.field307 = class208.method3898(var1, (byte)-124);
                        client.field880 = var0;
                     } else if(var2 == 36) {
                        var9 = class146.method3363(ClientPacket.field2208, client.field761.field1340, -1858342233);
                        var9.field2338.writeULEShort(var0, 70039705);
                        var9.field2338.writeLEInt(var1, -61192519);
                        var9.field2338.writeULEShort(var3, 70039705);
                        client.field761.method2361(var9, 279450225);
                        client.field786 = 0;
                        class40.field307 = class208.method3898(var1, (byte)-124);
                        client.field880 = var0;
                     } else if(var2 == 37) {
                        var9 = class146.method3363(ClientPacket.field2244, client.field761.field1340, -1883167729);
                        var9.field2338.writeLEShortA(var0, 1104378785);
                        var9.field2338.method5617(var1, -598231963);
                        var9.field2338.writeShortA(var3, -1581533869);
                        client.field761.method2361(var9, 1257908277);
                        client.field786 = 0;
                        class40.field307 = class208.method3898(var1, (byte)-117);
                        client.field880 = var0;
                     } else {
                        if(var2 == 38) {
                           class18.method210((byte)-21);
                           var17 = class208.method3898(var1, (byte)-12);
                           client.field833 = 1;
                           client.field957 = var0;
                           class33.field243 = var1;
                           class146.field1899 = var3;
                           class68.method1273(var17, 1094341109);
                           client.field933 = class297.method5314(16748608, -464302087) + class30.method373(var3, (byte)-78).field3397 + class297.method5314(16777215, 2077939293);
                           if(client.field933 == null) {
                              client.field933 = "null";
                           }

                           return;
                        }

                        if(var2 == 39) {
                           var9 = class146.method3363(ClientPacket.field2258, client.field761.field1340, -1829249239);
                           var9.field2338.writeShort(var3, (byte)-47);
                           var9.field2338.writeULEShort(var0, 70039705);
                           var9.field2338.writeLEInt(var1, 1526205942);
                           client.field761.method2361(var9, 2078887909);
                           client.field786 = 0;
                           class40.field307 = class208.method3898(var1, (byte)-84);
                           client.field880 = var0;
                        } else if(var2 == 40) {
                           var9 = class146.method3363(ClientPacket.field2276, client.field761.field1340, -1845507563);
                           var9.field2338.method5591(var1, 710120460);
                           var9.field2338.writeLEShortA(var3, -332610591);
                           var9.field2338.writeShort(var0, (byte)-109);
                           client.field761.method2361(var9, 1670183087);
                           client.field786 = 0;
                           class40.field307 = class208.method3898(var1, (byte)-58);
                           client.field880 = var0;
                        } else if(var2 == 41) {
                           var9 = class146.method3363(ClientPacket.field2285, client.field761.field1340, -2002954774);
                           var9.field2338.writeULEShort(var0, 70039705);
                           var9.field2338.method5617(var1, -598231963);
                           var9.field2338.writeShort(var3, (byte)-96);
                           client.field761.method2361(var9, 1663970762);
                           client.field786 = 0;
                           class40.field307 = class208.method3898(var1, (byte)-71);
                           client.field880 = var0;
                        } else if(var2 == 42) {
                           var9 = class146.method3363(ClientPacket.field2299, client.field761.field1340, -1976414088);
                           var9.field2338.writeInt(var1, 747474969);
                           var9.field2338.writeShortA(var0, -1767621069);
                           var9.field2338.writeShortA(var3, -1633798030);
                           client.field761.method2361(var9, 669036749);
                           client.field786 = 0;
                           class40.field307 = class208.method3898(var1, (byte)-76);
                           client.field880 = var0;
                        } else if(var2 == 43) {
                           var9 = class146.method3363(ClientPacket.field2238, client.field761.field1340, -1821207286);
                           var9.field2338.writeLEShortA(var0, 2113682100);
                           var9.field2338.writeLEInt(var1, 42936919);
                           var9.field2338.writeLEShortA(var3, -1246275952);
                           client.field761.method2361(var9, 974087048);
                           client.field786 = 0;
                           class40.field307 = class208.method3898(var1, (byte)-47);
                           client.field880 = var0;
                        } else if(var2 == 44) {
                           var16 = client.players[var3];
                           if(var16 != null) {
                              client.field922 = var6;
                              client.field688 = var7;
                              client.field784 = 2;
                              client.field783 = 0;
                              client.field910 = var0;
                              client.field911 = var1;
                              var10 = class146.method3363(ClientPacket.field2267, client.field761.field1340, -1787147016);
                              var10.field2338.readByte(class54.field426[82]?1:0, 1258821856);
                              var10.field2338.writeLEShortA(var3, 1191215666);
                              client.field761.method2361(var10, 1759022211);
                           }
                        } else if(var2 == 45) {
                           var16 = client.players[var3];
                           if(var16 != null) {
                              client.field922 = var6;
                              client.field688 = var7;
                              client.field784 = 2;
                              client.field783 = 0;
                              client.field910 = var0;
                              client.field911 = var1;
                              var10 = class146.method3363(ClientPacket.field2232, client.field761.field1340, -1790480630);
                              var10.field2338.writeShortA(var3, -597763106);
                              var10.field2338.method5700(class54.field426[82]?1:0, -927080333);
                              client.field761.method2361(var10, 969632683);
                           }
                        } else if(var2 == 46) {
                           var16 = client.players[var3];
                           if(var16 != null) {
                              client.field922 = var6;
                              client.field688 = var7;
                              client.field784 = 2;
                              client.field783 = 0;
                              client.field910 = var0;
                              client.field911 = var1;
                              var10 = class146.method3363(ClientPacket.field2266, client.field761.field1340, -1921628869);
                              var10.field2338.method5700(class54.field426[82]?1:0, -927080333);
                              var10.field2338.writeShort(var3, (byte)-121);
                              client.field761.method2361(var10, 976749204);
                           }
                        } else if(var2 == 47) {
                           var16 = client.players[var3];
                           if(var16 != null) {
                              client.field922 = var6;
                              client.field688 = var7;
                              client.field784 = 2;
                              client.field783 = 0;
                              client.field910 = var0;
                              client.field911 = var1;
                              var10 = class146.method3363(ClientPacket.field2282, client.field761.field1340, -2059127006);
                              var10.field2338.writeShort(var3, (byte)-24);
                              var10.field2338.method5575(class54.field426[82]?1:0, (byte)16);
                              client.field761.method2361(var10, 1336303595);
                           }
                        } else if(var2 == 48) {
                           var16 = client.players[var3];
                           if(var16 != null) {
                              client.field922 = var6;
                              client.field688 = var7;
                              client.field784 = 2;
                              client.field783 = 0;
                              client.field910 = var0;
                              client.field911 = var1;
                              var10 = class146.method3363(ClientPacket.field2254, client.field761.field1340, -1921805920);
                              var10.field2338.method5700(class54.field426[82]?1:0, -927080333);
                              var10.field2338.writeShort(var3, (byte)-25);
                              client.field761.method2361(var10, 1070090016);
                           }
                        } else if(var2 == 49) {
                           var16 = client.players[var3];
                           if(var16 != null) {
                              client.field922 = var6;
                              client.field688 = var7;
                              client.field784 = 2;
                              client.field783 = 0;
                              client.field910 = var0;
                              client.field911 = var1;
                              var10 = class146.method3363(ClientPacket.field2250, client.field761.field1340, -1800131771);
                              var10.field2338.method5697(class54.field426[82]?1:0, (byte)18);
                              var10.field2338.writeLEShortA(var3, 1962953213);
                              client.field761.method2361(var10, 1291239714);
                           }
                        } else if(var2 == 50) {
                           var16 = client.players[var3];
                           if(var16 != null) {
                              client.field922 = var6;
                              client.field688 = var7;
                              client.field784 = 2;
                              client.field783 = 0;
                              client.field910 = var0;
                              client.field911 = var1;
                              var10 = class146.method3363(ClientPacket.field2301, client.field761.field1340, -2128264373);
                              var10.field2338.readByte(class54.field426[82]?1:0, 1258821856);
                              var10.field2338.writeShort(var3, (byte)-44);
                              client.field761.method2361(var10, 1519559408);
                           }
                        } else if(var2 == 51) {
                           var16 = client.players[var3];
                           if(var16 != null) {
                              client.field922 = var6;
                              client.field688 = var7;
                              client.field784 = 2;
                              client.field783 = 0;
                              client.field910 = var0;
                              client.field911 = var1;
                              var10 = class146.method3363(ClientPacket.field2247, client.field761.field1340, -1868751270);
                              var10.field2338.readByte(class54.field426[82]?1:0, 1258821856);
                              var10.field2338.writeShort(var3, (byte)-53);
                              client.field761.method2361(var10, 735562515);
                           }
                        } else {
                           label662: {
                              if(var2 != 57) {
                                 if(var2 == 58) {
                                    var17 = class19.method224(var1, var0, -179142596);
                                    if(var17 != null) {
                                       var10 = class146.method3363(ClientPacket.field2272, client.field761.field1340, -1989713567);
                                       var10.field2338.writeShortA(client.field837, -388375403);
                                       var10.field2338.writeShortA(client.field836, -741954449);
                                       var10.field2338.writeLEShortA(var0, 374315516);
                                       var10.field2338.writeULEShort(var17.field2704, 70039705);
                                       var10.field2338.writeInt(class7.field29, 747474969);
                                       var10.field2338.method5617(var1, -598231963);
                                       client.field761.method2361(var10, 1302769819);
                                    }
                                    break label662;
                                 }

                                 if(var2 == 1001) {
                                    client.field922 = var6;
                                    client.field688 = var7;
                                    client.field784 = 2;
                                    client.field783 = 0;
                                    client.field910 = var0;
                                    client.field911 = var1;
                                    var9 = class146.method3363(ClientPacket.field2274, client.field761.field1340, -1961830516);
                                    var9.field2338.writeLEShortA(var3, 289883298);
                                    var9.field2338.writeULEShort(var0 + class69.field590 * 731242929, 70039705);
                                    var9.field2338.readByte(class54.field426[82]?1:0, 1258821856);
                                    var9.field2338.writeShort(class89.field1152 * 1825982697 + var1, (byte)-115);
                                    client.field761.method2361(var9, 1835528274);
                                    break label662;
                                 }

                                 if(var2 == 1002) {
                                    client.field922 = var6;
                                    client.field688 = var7;
                                    client.field784 = 2;
                                    client.field783 = 0;
                                    var9 = class146.method3363(ClientPacket.field2284, client.field761.field1340, -2135115061);
                                    var9.field2338.writeShortA(var3, -537308625);
                                    client.field761.method2361(var9, 1762166199);
                                    break label662;
                                 }

                                 if(var2 == 1003) {
                                    client.field922 = var6;
                                    client.field688 = var7;
                                    client.field784 = 2;
                                    client.field783 = 0;
                                    var14 = client.field721[var3];
                                    if(var14 != null) {
                                       class266 var18 = var14.field1148;
                                       if(var18.field3490 != null) {
                                          var18 = var18.method4766(-2051225078);
                                       }

                                       if(var18 != null) {
                                          var11 = class146.method3363(ClientPacket.field2242, client.field761.field1340, -1792295427);
                                          var11.field2338.writeLEShortA(var18.field3464, -933553088);
                                          client.field761.method2361(var11, 1593233163);
                                       }
                                    }
                                    break label662;
                                 }

                                 if(var2 == 1004) {
                                    client.field922 = var6;
                                    client.field688 = var7;
                                    client.field784 = 2;
                                    client.field783 = 0;
                                    var9 = class146.method3363(ClientPacket.field2294, client.field761.field1340, -2067878225);
                                    var9.field2338.writeShortA(var3, -1321746884);
                                    client.field761.method2361(var9, 512209534);
                                    break label662;
                                 }

                                 if(var2 == 1005) {
                                    var17 = class208.method3898(var1, (byte)-126);
                                    if(var17 != null && var17.field2692[var0] >= 100000) {
                                       class141.method3161(27, "", var17.field2692[var0] + " x " + class30.method373(var3, (byte)-18).field3397, -801302607);
                                    } else {
                                       var10 = class146.method3363(ClientPacket.field2294, client.field761.field1340, -1796657334);
                                       var10.field2338.writeShortA(var3, -1976088302);
                                       client.field761.method2361(var10, 2117788310);
                                    }

                                    client.field786 = 0;
                                    class40.field307 = class208.method3898(var1, (byte)-89);
                                    client.field880 = var0;
                                    break label662;
                                 }

                                 if(var2 != 1007) {
                                    if(var2 == 1009 || var2 == 1011 || var2 == 1008 || var2 == 1010 || var2 == 1012) {
                                       class21.field121.method6468(var2, var3, new class222(var0), new class222(var1), (byte)35);
                                    }
                                    break label662;
                                 }
                              }

                              var17 = class19.method224(var1, var0, 518053797);
                              if(var17 != null) {
                                 ClientPacket.method3667(var3, var1, var0, var17.field2704, var5, (byte)10);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if(client.field833 != 0) {
         client.field833 = 0;
         class68.method1273(class208.method3898(class33.field243, (byte)-85), 979735580);
      }

      if(client.field835) {
         class18.method210((byte)31);
      }

      if(class40.field307 != null && client.field786 == 0) {
         class68.method1273(class40.field307, 491013105);
      }

   }

   static final void method4004(String var0, boolean var1, int var2) {
      if(client.field795) {
         byte var3 = 4;
         int var4 = var3 + 6;
         int var5 = var3 + 6;
         int var6 = class24.field140.method5386(var0, 250);
         int var7 = class24.field140.method5454(var0, 250) * 13;
         class330.method6052(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var3 + var7, 0);
         class330.method6137(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, 16777215);
         class24.field140.method5397(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
         int var8 = var4 - var3;
         int var9 = var5 - var3;
         int var10 = var3 + var6 + var3;
         int var11 = var3 + var7 + var3;

         for(int var12 = 0; var12 < client.field883; ++var12) {
            if(client.field733[var12] + client.field950[var12] > var8 && client.field950[var12] < var10 + var8 && client.field736[var12] + client.field939[var12] > var9 && client.field939[var12] < var11 + var9) {
               client.field679[var12] = true;
            }
         }

         if(var1) {
            class206.field2411.vmethod6139(0, 0, 627404570);
         } else {
            class49.method848(var4, var5, var6, var7, -14450436);
         }

      }
   }
}
