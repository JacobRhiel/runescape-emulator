package src;

public class class22 {

   static final void method253(int var0, byte var1) {
      class58.method966((byte)36);

      for(class84 var2 = (class84)class84.field1097.method4931(); var2 != null; var2 = (class84)class84.field1097.method4949()) {
         if(var2.field1109 != null) {
            var2.method2007((byte)72);
         }
      }

      int var5 = class228.method4179(var0, (byte)2).field3207;
      if(var5 != 0) {
         int var3 = class221.field2526[var0];
         if(var5 == 1) {
            if(var3 == 1) {
               class139.method3087(0.9D);
               ((class128)class139.field1781).method2839(0.9D);
            }

            if(var3 == 2) {
               class139.method3087(0.8D);
               ((class128)class139.field1781).method2839(0.8D);
            }

            if(var3 == 3) {
               class139.method3087(0.7D);
               ((class128)class139.field1781).method2839(0.7D);
            }

            if(var3 == 4) {
               class139.method3087(0.6D);
               ((class128)class139.field1781).method2839(0.6D);
            }

            class264.field3416.method3413();
         }

         if(var5 == 3) {
            short var4 = 0;
            if(var3 == 0) {
               var4 = 255;
            }

            if(var3 == 1) {
               var4 = 192;
            }

            if(var3 == 2) {
               var4 = 128;
            }

            if(var3 == 3) {
               var4 = 64;
            }

            if(var3 == 4) {
               var4 = 0;
            }

            if(var4 != client.field913) {
               if(client.field913 == 0 && client.field914 != -1) {
                  class74.method1321(class43.field328, client.field914, 0, var4, false, -40744930);
                  client.field915 = false;
               } else if(var4 == 0) {
                  client.method1494((byte)11);
                  client.field915 = false;
               } else {
                  class219.method4036(var4, 1658769285);
               }

               client.field913 = var4;
            }
         }

         if(var5 == 4) {
            if(var3 == 0) {
               client.field916 = 127;
            }

            if(var3 == 1) {
               client.field916 = 96;
            }

            if(var3 == 2) {
               client.field916 = 64;
            }

            if(var3 == 3) {
               client.field916 = 32;
            }

            if(var3 == 4) {
               client.field916 = 0;
            }
         }

         if(var5 == 5) {
            client.field815 = var3;
         }

         if(var5 == 6) {
            client.field844 = var3;
         }

         if(var5 == 9) {
            client.field845 = var3;
         }

         if(var5 == 10) {
            if(var3 == 0) {
               client.field758 = 127;
            }

            if(var3 == 1) {
               client.field758 = 96;
            }

            if(var3 == 2) {
               client.field758 = 64;
            }

            if(var3 == 3) {
               client.field758 = 32;
            }

            if(var3 == 4) {
               client.field758 = 0;
            }
         }

         if(var5 == 17) {
            client.field840 = var3 & '\uffff';
         }

         if(var5 == 18) {
            client.field705 = (class93)class16.method159(class39.method643((byte)-70), var3, -1609956543);
            if(client.field705 == null) {
               client.field705 = class93.field1188;
            }
         }

         if(var5 == 19) {
            if(var3 == -1) {
               client.field807 = -1;
            } else {
               client.field807 = var3 & 2047;
            }
         }

         if(var5 == 22) {
            client.field706 = (class93)class16.method159(class39.method643((byte)19), var3, -1609956543);
            if(client.field706 == null) {
               client.field706 = class93.field1188;
            }
         }

      }
   }

   public static final boolean method255(int var0) {
      class54 var1 = class54.field413;
      synchronized(class54.field413) {
         if(class54.field434 == class54.field436) {
            return false;
         } else {
            class3.field16 = class54.field414[class54.field434];
            class222.field2531 = class54.field424[class54.field434];
            class54.field434 = class54.field434 + 1 & 127;
            return true;
         }
      }
   }

   static void method254(class75 var0, boolean var1, int var2) {
      if(var0 != null && var0.vmethod2118(116176402) && !var0.field651) {
         var0.field663 = false;
         if((client.field684 && class98.field1278 > 50 || class98.field1278 > 200) && var1 && var0.field1024 == var0.field978) {
            var0.field663 = true;
         }

         int var3 = var0.field983 >> 7;
         int var4 = var0.field973 >> 7;
         if(var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
            long var5 = class337.method6337(0, 0, 0, false, var0.field667, 1188653800);
            if(var0.field656 != null && client.field689 >= var0.field653 && client.field689 < var0.field654) {
               var0.field663 = false;
               var0.field645 = class277.method5013(var0.field983, var0.field973, class71.field610, -86084539);
               var0.field977 = client.field689;
               class14.field60.method3175(class71.field610, var0.field983, var0.field973, var0.field645, 60, var0, var0.field995, var5, var0.field659, var0.field660, var0.field661, var0.field664);
            } else {
               if((var0.field983 & 127) == 64 && (var0.field973 & 127) == 64) {
                  if(client.field777[var3][var4] == client.field778) {
                     return;
                  }

                  client.field777[var3][var4] = client.field778;
               }

               var0.field645 = class277.method5013(var0.field983, var0.field973, class71.field610, 1066428934);
               var0.field977 = client.field689;
               class14.field60.method3174(class71.field610, var0.field983, var0.field973, var0.field645, 60, var0, var0.field995, var5, var0.field1001);
            }
         }
      }

   }

   static final void method252(short var0) {
      for(int var1 = 0; var1 < client.field936; ++var1) {
         --client.field876[var1];
         if(client.field876[var1] < -10) {
            --client.field936;

            for(int var2 = var1; var2 < client.field936; ++var2) {
               client.field879[var2] = client.field879[var2 + 1];
               client.field923[var2] = client.field923[var2 + 1];
               client.field920[var2] = client.field920[var2 + 1];
               client.field876[var2] = client.field876[var2 + 1];
               client.field953[var2] = client.field953[var2 + 1];
            }

            --var1;
         } else {
            class110 var10 = client.field923[var1];
            if(var10 == null) {
               Object var10000 = null;
               var10 = class110.method2455(class301.field3664, client.field879[var1], 0);
               if(var10 == null) {
                  continue;
               }

               client.field876[var1] += var10.method2457();
               client.field923[var1] = var10;
            }

            if(client.field876[var1] < 0) {
               int var3;
               if(client.field953[var1] != 0) {
                  int var4 = (client.field953[var1] & 255) * 128;
                  int var5 = client.field953[var1] >> 16 & 255;
                  int var6 = var5 * 128 + 64 - class311.field3717.field983;
                  if(var6 < 0) {
                     var6 = -var6;
                  }

                  int var7 = client.field953[var1] >> 8 & 255;
                  int var8 = var7 * 128 + 64 - class311.field3717.field973;
                  if(var8 < 0) {
                     var8 = -var8;
                  }

                  int var9 = var8 + var6 - 128;
                  if(var9 > var4) {
                     client.field876[var1] = -100;
                     continue;
                  }

                  if(var9 < 0) {
                     var9 = 0;
                  }

                  var3 = (var4 - var9) * client.field758 / var4;
               } else {
                  var3 = client.field916;
               }

               if(var3 > 0) {
                  class112 var11 = var10.method2452().method2494(class25.field148);
                  class122 var12 = class122.method2640(var11, 100, var3);
                  var12.method2675(client.field920[var1] - 1);
                  class64.field553.method2385(var12);
               }

               client.field876[var1] = -100;
            }
         }
      }

      if(client.field915) {
         boolean var13;
         if(class206.field2406 != 0) {
            var13 = true;
         } else {
            var13 = class206.field2405.method3882(-215520520);
         }

         if(!var13) {
            if(client.field913 != 0 && client.field914 != -1) {
               class74.method1321(class43.field328, client.field914, 0, client.field913, false, 2052864970);
            }

            client.field915 = false;
         }
      }

   }

   static void method256(int var0, byte var1) {
      client.field754 = var0;
   }

   static int method258(int var0, class101 var1, boolean var2, int var3) {
      int var4;
      if(var0 == 4200) {
         var4 = class85.field1115[--class85.field1117];
         class85.field1118[++class85.field1119 - 1] = class30.method373(var4, (byte)43).field3397;
         return 1;
      } else {
         int var5;
         class264 var6;
         if(var0 == 4201) {
            class85.field1117 -= 2;
            var4 = class85.field1115[class85.field1117];
            var5 = class85.field1115[class85.field1117 + 1];
            var6 = class30.method373(var4, (byte)-1);
            if(var5 >= 1 && var5 <= 5 && var6.field3419[var5 - 1] != null) {
               class85.field1118[++class85.field1119 - 1] = var6.field3419[var5 - 1];
            } else {
               class85.field1118[++class85.field1119 - 1] = "";
            }

            return 1;
         } else if(var0 == 4202) {
            class85.field1117 -= 2;
            var4 = class85.field1115[class85.field1117];
            var5 = class85.field1115[class85.field1117 + 1];
            var6 = class30.method373(var4, (byte)86);
            if(var5 >= 1 && var5 <= 5 && var6.field3420[var5 - 1] != null) {
               class85.field1118[++class85.field1119 - 1] = var6.field3420[var5 - 1];
            } else {
               class85.field1118[++class85.field1119 - 1] = "";
            }

            return 1;
         } else if(var0 == 4203) {
            var4 = class85.field1115[--class85.field1117];
            class85.field1115[++class85.field1117 - 1] = class30.method373(var4, (byte)106).field3417;
            return 1;
         } else if(var0 == 4204) {
            var4 = class85.field1115[--class85.field1117];
            class85.field1115[++class85.field1117 - 1] = class30.method373(var4, (byte)111).field3418 == 1?1:0;
            return 1;
         } else {
            class264 var7;
            if(var0 == 4205) {
               var4 = class85.field1115[--class85.field1117];
               var7 = class30.method373(var4, (byte)-91);
               if(var7.field3440 == -1 && var7.field3437 >= 0) {
                  class85.field1115[++class85.field1117 - 1] = var7.field3437;
               } else {
                  class85.field1115[++class85.field1117 - 1] = var4;
               }

               return 1;
            } else if(var0 == 4206) {
               var4 = class85.field1115[--class85.field1117];
               var7 = class30.method373(var4, (byte)13);
               if(var7.field3440 >= 0 && var7.field3437 >= 0) {
                  class85.field1115[++class85.field1117 - 1] = var7.field3437;
               } else {
                  class85.field1115[++class85.field1117 - 1] = var4;
               }

               return 1;
            } else if(var0 == 4207) {
               var4 = class85.field1115[--class85.field1117];
               class85.field1115[++class85.field1117 - 1] = class30.method373(var4, (byte)58).field3412?1:0;
               return 1;
            } else if(var0 == 4208) {
               var4 = class85.field1115[--class85.field1117];
               var7 = class30.method373(var4, (byte)-51);
               if(var7.field3450 == -1 && var7.field3449 >= 0) {
                  class85.field1115[++class85.field1117 - 1] = var7.field3449;
               } else {
                  class85.field1115[++class85.field1117 - 1] = var4;
               }

               return 1;
            } else if(var0 == 4209) {
               var4 = class85.field1115[--class85.field1117];
               var7 = class30.method373(var4, (byte)-20);
               if(var7.field3450 >= 0 && var7.field3449 >= 0) {
                  class85.field1115[++class85.field1117 - 1] = var7.field3449;
               } else {
                  class85.field1115[++class85.field1117 - 1] = var4;
               }

               return 1;
            } else if(var0 == 4210) {
               String var8 = class85.field1118[--class85.field1119];
               var5 = class85.field1115[--class85.field1117];
               class69.method1276(var8, var5 == 1, (byte)-93);
               class85.field1115[++class85.field1117 - 1] = class128.field1551;
               return 1;
            } else if(var0 != 4211) {
               if(var0 == 4212) {
                  class43.field335 = 0;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if(class50.field386 != null && class43.field335 < class128.field1551) {
                  class85.field1115[++class85.field1117 - 1] = class50.field386[++class43.field335 - 1] & '\uffff';
               } else {
                  class85.field1115[++class85.field1117 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   static boolean method257(class308 var0, int var1, byte var2) {
      int var3 = var0.method5495(2, (byte)-51);
      int var4;
      int var5;
      int var8;
      int var9;
      int var10;
      int var11;
      if(var3 == 0) {
         if(var0.method5495(1, (byte)71) != 0) {
            method257(var0, var1, (byte)127);
         }

         var4 = var0.method5495(13, (byte)-6);
         var5 = var0.method5495(13, (byte)32);
         boolean var13 = var0.method5495(1, (byte)-39) == 1;
         if(var13) {
            class98.field1279[++class98.field1265 - 1] = var1;
         }

         if(client.players[var1] != null) {
            throw new RuntimeException();
         } else {
            class75 var7 = client.players[var1] = new class75();
            var7.field667 = var1;
            if(class98.field1269[var1] != null) {
               var7.method1330(class98.field1269[var1], -1516590648);
            }

            var7.field979 = class98.field1275[var1];
            var7.field999 = class98.field1276[var1];
            var8 = class98.field1274[var1];
            var9 = var8 >> 28;
            var10 = var8 >> 14 & 255;
            var11 = var8 & 255;
            var7.field1022[0] = class98.field1273[var1];
            var7.field666 = (byte)var9;
            var7.method1379((var10 << 13) + var4 - class69.field590 * 731242929, (var11 << 13) + var5 - class89.field1152 * 1825982697, -2142848744);
            var7.field670 = false;
            return true;
         }
      } else if(var3 == 1) {
         var4 = var0.method5495(2, (byte)54);
         var5 = class98.field1274[var1];
         class98.field1274[var1] = (var5 & 268435455) + (((var5 >> 28) + var4 & 3) << 28);
         return false;
      } else {
         int var6;
         int var12;
         if(var3 == 2) {
            var4 = var0.method5495(5, (byte)-6);
            var5 = var4 >> 3;
            var6 = var4 & 7;
            var12 = class98.field1274[var1];
            var8 = (var12 >> 28) + var5 & 3;
            var9 = var12 >> 14 & 255;
            var10 = var12 & 255;
            if(var6 == 0) {
               --var9;
               --var10;
            }

            if(var6 == 1) {
               --var10;
            }

            if(var6 == 2) {
               ++var9;
               --var10;
            }

            if(var6 == 3) {
               --var9;
            }

            if(var6 == 4) {
               ++var9;
            }

            if(var6 == 5) {
               --var9;
               ++var10;
            }

            if(var6 == 6) {
               ++var10;
            }

            if(var6 == 7) {
               ++var9;
               ++var10;
            }

            class98.field1274[var1] = (var9 << 14) + var10 + (var8 << 28);
            return false;
         } else {
            var4 = var0.method5495(18, (byte)14);
            var5 = var4 >> 16;
            var6 = var4 >> 8 & 255;
            var12 = var4 & 255;
            var8 = class98.field1274[var1];
            var9 = (var8 >> 28) + var5 & 3;
            var10 = var6 + (var8 >> 14) & 255;
            var11 = var8 + var12 & 255;
            class98.field1274[var1] = (var10 << 14) + var11 + (var9 << 28);
            return false;
         }
      }
   }
}
