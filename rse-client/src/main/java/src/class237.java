package src;

public class class237 {

   static {
      Math.sqrt(8192.0D);
   }

   public static class266 method4201(int var0, int var1) {
      class266 var2 = (class266)class266.field3476.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class266.field3468.method4224(9, var0, (byte)-120);
         var2 = new class266();
         var2.field3464 = var0;
         if(var3 != null) {
            var2.method4762(new class309(var3), (byte)-24);
         }

         var2.method4765((byte)33);
         class266.field3476.method3424(var2, (long)var0);
         return var2;
      }
   }

   static void method4202(int var0) {
      int var1;
      if(client.field707 == 0) {
         class14.field60 = new class142(4, 104, 104, class64.field549);

         for(var1 = 0; var1 < 4; ++var1) {
            client.field737[var1] = new class181(104, 104);
         }

         class317.field3790 = new class334(512, 512);
         class94.field1197 = "Starting game engine...";
         class94.field1198 = 5;
         client.field707 = 20;
      } else if(client.field707 == 20) {
         class94.field1197 = "Prepared visibility map";
         class94.field1198 = 10;
         client.field707 = 30;
      } else if(client.field707 == 30) {
         class241.field3112 = class103.method2339(0, false, true, true, (byte)109);
         class215.field2499 = class103.method2339(1, false, true, true, (byte)-1);
         class18.field102 = class103.method2339(2, true, false, true, (byte)-39);
         class36.field270 = class103.method2339(3, false, true, true, (byte)-100);
         class301.field3664 = class103.method2339(4, false, true, true, (byte)-33);
         class27.field162 = class103.method2339(5, true, true, true, (byte)16);
         class43.field328 = class103.method2339(6, true, true, true, (byte)77);
         class43.field333 = class103.method2339(7, false, true, true, (byte)51);
         class228.field2717 = class103.method2339(8, false, true, true, (byte)-61);
         class97.field1263 = class103.method2339(9, false, true, true, (byte)100);
         class223.field2543 = class103.method2339(10, false, true, true, (byte)-13);
         class38.field293 = class103.method2339(11, false, true, true, (byte)-31);
         class41.field311 = class103.method2339(12, false, true, true, (byte)48);
         class88.field1151 = class103.method2339(13, true, false, true, (byte)-71);
         class224.field2549 = class103.method2339(14, false, true, true, (byte)103);
         class20.field113 = class103.method2339(15, false, true, true, (byte)13);
         class91.field1171 = class103.method2339(17, true, true, true, (byte)87);
         class161.field1987 = class103.method2339(18, false, true, true, (byte)30);
         class278.field3555 = class103.method2339(19, false, true, true, (byte)-27);
         class25.field144 = class103.method2339(20, false, true, true, (byte)33);
         class94.field1197 = "Connecting to update server";
         class94.field1198 = 20;
         client.field707 = 40;
      } else if(client.field707 == 40) {
         byte var32 = 0;
         var1 = var32 + class241.field3112.method4354(1046602653) * 4 / 100;
         var1 += class215.field2499.method4354(-840132972) * 4 / 100;
         var1 += class18.field102.method4354(1920816074) * 2 / 100;
         var1 += class36.field270.method4354(-544519419) * 2 / 100;
         var1 += class301.field3664.method4354(795780249) * 6 / 100;
         var1 += class27.field162.method4354(-643797095) * 4 / 100;
         var1 += class43.field328.method4354(1166350659) * 2 / 100;
         var1 += class43.field333.method4354(-175721038) * 56 / 100;
         var1 += class228.field2717.method4354(-154828076) * 2 / 100;
         var1 += class97.field1263.method4354(-446664524) * 2 / 100;
         var1 += class223.field2543.method4354(-367508529) * 2 / 100;
         var1 += class38.field293.method4354(-449032601) * 2 / 100;
         var1 += class41.field311.method4354(386977844) * 2 / 100;
         var1 += class88.field1151.method4354(958379215) * 2 / 100;
         var1 += class224.field2549.method4354(2060640269) * 2 / 100;
         var1 += class20.field113.method4354(-768205900) * 2 / 100;
         var1 += class278.field3555.method4354(1585906190) / 100;
         var1 += class161.field1987.method4354(1743421873) / 100;
         var1 += class25.field144.method4354(-150813332) / 100;
         var1 += class91.field1171.method4319(1875788056) && class91.field1171.method4229(2004742407)?1:0;
         if(var1 != 100) {
            if(var1 != 0) {
               class94.field1197 = "Checking for updates - " + var1 + "%";
            }

            class94.field1198 = 30;
         } else {
            class151.method3390(class241.field3112, "Animations", (byte)-1);
            class151.method3390(class215.field2499, "Skeletons", (byte)-106);
            class151.method3390(class301.field3664, "Sound FX", (byte)-30);
            class151.method3390(class27.field162, "Maps", (byte)-70);
            class151.method3390(class43.field328, "Music Tracks", (byte)-63);
            class151.method3390(class43.field333, "Models", (byte)-20);
            class151.method3390(class228.field2717, "Sprites", (byte)-99);
            class151.method3390(class38.field293, "Music Jingles", (byte)-5);
            class151.method3390(class224.field2549, "Music Samples", (byte)-41);
            class151.method3390(class20.field113, "Music Patches", (byte)-23);
            class151.method3390(class278.field3555, "World Map", (byte)-71);
            class151.method3390(class161.field1987, "World Map Geography", (byte)-33);
            class151.method3390(class25.field144, "World Map Ground", (byte)-92);
            class7.field35 = new class321();
            class7.field35.method5935(class91.field1171, -1759254165);
            class94.field1197 = "Loaded update list";
            class94.field1198 = 30;
            client.field707 = 45;
         }
      } else {
         class245 var3;
         class245 var4;
         class245 var31;
         if(client.field707 == 45) {
            class50.method867(22050, !client.field684, 2, 826643868);
            class207 var34 = new class207();
            var34.method3779(9, 128, (byte)82);
            class45.field367 = class149.method3387(class227.field2710, 0, 22050, 2138193849);
            class45.field367.method2521(var34, 1722615809);
            var31 = class20.field113;
            var3 = class224.field2549;
            var4 = class301.field3664;
            class58.field453 = var31;
            class206.field2404 = var3;
            class206.field2403 = var4;
            class206.field2405 = var34;
            class30.field211 = class149.method3387(class227.field2710, 1, 2048, 1774823793);
            class64.field553 = new class107();
            class30.field211.method2521(class64.field553, 1722615809);
            class25.field148 = new class121(22050, class114.field1421);
            class94.field1197 = "Prepared sound engine";
            class94.field1198 = 35;
            client.field707 = 50;
            class68.field574 = new class302(class228.field2717, class88.field1151);
         } else if(client.field707 == 50) {
            var1 = class301.method5360(-2101151753).length;
            client.field731 = class68.field574.method5364(class301.method5360(453112748), -1813664222);
            if(client.field731.size() < var1) {
               class94.field1197 = "Loading fonts - " + client.field731.size() * 100 / var1 + "%";
               class94.field1198 = 40;
            } else {
               class101.field1303 = (class304)client.field731.get(class301.field3654);
               class24.field140 = (class304)client.field731.get(class301.field3655);
               class175.field2045 = (class304)client.field731.get(class301.field3666);
               class99.field1287 = client.field947.vmethod6355((byte)1);
               class94.field1197 = "Loaded fonts";
               class94.field1198 = 40;
               client.field707 = 60;
            }
         } else {
            int var27;
            if(client.field707 == 60) {
               var1 = class92.method2142(class223.field2543, class228.field2717, -1982305886);
               var27 = class7.method98(-185431723);
               if(var1 < var27) {
                  class94.field1197 = "Loading title screen - " + var1 * 100 / var27 + "%";
                  class94.field1198 = 50;
               } else {
                  class94.field1197 = "Loaded title screen";
                  class94.field1198 = 50;
                  class72.method1293(5, -1951274332);
                  client.field707 = 70;
               }
            } else if(client.field707 == 70) {
               if(!class18.field102.method4229(1878746970)) {
                  class94.field1197 = "Loading config - " + class18.field102.method4350((byte)110) + "%";
                  class94.field1198 = 60;
               } else {
                  class245 var33 = class18.field102;
                  class267.field3504 = var33;
                  var31 = class18.field102;
                  class254.field3257 = var31;
                  class73.method1319(class18.field102, class43.field333, 1388306890);
                  class26.method290(class18.field102, class43.field333, client.field684, -1100564340);
                  var3 = class18.field102;
                  var4 = class43.field333;
                  class266.field3468 = var3;
                  class266.field3466 = var4;
                  class54.method940(class18.field102, -689678627);
                  class245 var30 = class18.field102;
                  class245 var6 = class43.field333;
                  boolean var7 = client.field683;
                  class304 var8 = class101.field1303;
                  class319.field3802 = var30;
                  class18.field94 = var6;
                  class169.field2010 = var7;
                  class336.field3907 = class319.field3802.method4246(10, (byte)60);
                  class51.field403 = var8;
                  class245 var9 = class18.field102;
                  class245 var10 = class241.field3112;
                  class245 var11 = class215.field2499;
                  class99.field1288 = var9;
                  class343.field4029 = var10;
                  class92.field1177 = var11;
                  class245 var12 = class18.field102;
                  class245 var13 = class43.field333;
                  class253.field3244 = var12;
                  class253.field3236 = var13;
                  class245 var14 = class18.field102;
                  class258.field3291 = var14;
                  class245 var15 = class18.field102;
                  class250.field3208 = var15;
                  class250.field3204 = class250.field3208.method4246(16, (byte)30);
                  class80.method1894(class36.field270, class43.field333, class228.field2717, class88.field1151, (short)-3755);
                  class286.method5155(class18.field102, (short)32619);
                  class63.method1206(class18.field102, -50420172);
                  class98.method2237(class18.field102, 731875079);
                  class245 var16 = class18.field102;
                  class259.field3297 = var16;
                  class160.field1983 = new class99();
                  class245 var17 = class18.field102;
                  class245 var18 = class228.field2717;
                  class245 var19 = class88.field1151;
                  class262.field3324 = var17;
                  class262.field3322 = var18;
                  class296.field3639 = var19;
                  class245 var20 = class18.field102;
                  class245 var21 = class228.field2717;
                  class256.field3273 = var20;
                  class323.field3836 = var21;
                  class245 var22 = class18.field102;
                  class245 var23 = class228.field2717;
                  class251.field3225 = var23;
                  if(var22.method4229(1711024443)) {
                     class277.field3552 = var22.method4246(35, (byte)42);
                     class251.field3219 = new class251[class277.field3552];

                     for(int var24 = 0; var24 < class277.field3552; ++var24) {
                        byte[] var25 = var22.method4224(35, var24, (byte)-30);
                        class251.field3219[var24] = new class251(var24);
                        if(var25 != null) {
                           class251.field3219[var24].method4448(new class309(var25), (byte)-115);
                           class251.field3219[var24].method4442(1026224709);
                        }
                     }
                  }

                  class94.field1197 = "Loaded config";
                  class94.field1198 = 60;
                  client.field707 = 80;
               }
            } else if(client.field707 == 80) {
               var1 = 0;
               if(class103.field1325 == null) {
                  class103.field1325 = class205.method3752(class228.field2717, class7.field35.field3816, 0, 273345835);
               } else {
                  ++var1;
               }

               if(class20.field110 == null) {
                  class20.field110 = class205.method3752(class228.field2717, class7.field35.field3824, 0, 273345835);
               } else {
                  ++var1;
               }

               class333[] var2;
               int var28;
               if(class169.field2009 == null) {
                  var3 = class228.field2717;
                  var28 = class7.field35.field3814;
                  if(!class164.method3502(var3, var28, 0, -1163904871)) {
                     var2 = null;
                  } else {
                     var2 = class230.method4190(1897656979);
                  }

                  class169.field2009 = var2;
               } else {
                  ++var1;
               }

               if(class52.field406 == null) {
                  class52.field406 = class192.method3670(class228.field2717, class7.field35.field3815, 0, (byte)119);
               } else {
                  ++var1;
               }

               if(class106.field1354 == null) {
                  class106.field1354 = class192.method3670(class228.field2717, class7.field35.field3817, 0, (byte)33);
               } else {
                  ++var1;
               }

               if(class4.field26 == null) {
                  class4.field26 = class192.method3670(class228.field2717, class7.field35.field3818, 0, (byte)-76);
               } else {
                  ++var1;
               }

               if(class47.field373 == null) {
                  class47.field373 = class192.method3670(class228.field2717, class7.field35.field3819, 0, (byte)-12);
               } else {
                  ++var1;
               }

               if(class299.field3650 == null) {
                  class299.field3650 = class192.method3670(class228.field2717, class7.field35.field3820, 0, (byte)-74);
               } else {
                  ++var1;
               }

               if(class250.field3205 == null) {
                  class250.field3205 = class192.method3670(class228.field2717, class7.field35.field3821, 0, (byte)93);
               } else {
                  ++var1;
               }

               if(class232.field2751 == null) {
                  var3 = class228.field2717;
                  var28 = class7.field35.field3822;
                  if(!class164.method3502(var3, var28, 0, -2119224666)) {
                     var2 = null;
                  } else {
                     var2 = class230.method4190(1742916663);
                  }

                  class232.field2751 = var2;
               } else {
                  ++var1;
               }

               if(class40.field306 == null) {
                  var3 = class228.field2717;
                  var28 = class7.field35.field3823;
                  if(!class164.method3502(var3, var28, 0, -1437896442)) {
                     var2 = null;
                  } else {
                     var2 = class230.method4190(1461866875);
                  }

                  class40.field306 = var2;
               } else {
                  ++var1;
               }

               if(var1 < 11) {
                  class94.field1197 = "Loading sprites - " + var1 * 100 / 12 + "%";
                  class94.field1198 = 70;
               } else {
                  class305.field3690 = class40.field306;
                  class20.field110.method6180();
                  var27 = (int)(Math.random() * 21.0D) - 10;
                  int var29 = (int)(Math.random() * 21.0D) - 10;
                  var28 = (int)(Math.random() * 21.0D) - 10;
                  int var5 = (int)(Math.random() * 41.0D) - 20;
                  class169.field2009[0].method6158(var5 + var27, var5 + var29, var28 + var5);
                  class94.field1197 = "Loaded sprites";
                  class94.field1198 = 70;
                  client.field707 = 90;
               }
            } else if(client.field707 == 90) {
               if(!class97.field1263.method4229(2129475791)) {
                  class94.field1197 = "Loading textures - " + "0%";
                  class94.field1198 = 90;
               } else {
                  class41.field314 = new class128(class97.field1263, class228.field2717, 20, 0.8D, client.field684?64:128);
                  class139.method3117(class41.field314);
                  class139.method3087(0.8D);
                  client.field707 = 100;
               }
            } else if(client.field707 == 100) {
               var1 = class41.field314.method2838(-1161894618);
               if(var1 < 100) {
                  class94.field1197 = "Loading textures - " + var1 + "%";
                  class94.field1198 = 90;
               } else {
                  class94.field1197 = "Loaded textures";
                  class94.field1198 = 90;
                  client.field707 = 110;
               }
            } else if(client.field707 == 110) {
               class207.field2434 = new class72();
               class227.field2710.method3551(class207.field2434, 10, (byte)-41);
               class94.field1197 = "Loaded input handler";
               class94.field1198 = 92;
               client.field707 = 120;
            } else if(client.field707 == 120) {
               if(!class223.field2543.method4241("huffman", "", -612487532)) {
                  class94.field1197 = "Loading wordpack - " + 0 + "%";
                  class94.field1198 = 94;
               } else {
                  class218 var26 = new class218(class223.field2543.method4223("huffman", "", -1226254785));
                  class219.field2513 = var26;
                  class94.field1197 = "Loaded wordpack";
                  class94.field1198 = 94;
                  client.field707 = 130;
               }
            } else if(client.field707 == 130) {
               if(!class36.field270.method4229(2067802214)) {
                  class94.field1197 = "Loading interfaces - " + class36.field270.method4350((byte)42) * 4 / 5 + "%";
                  class94.field1198 = 96;
               } else if(!class41.field311.method4229(1964061280)) {
                  class94.field1197 = "Loading interfaces - " + (80 + class41.field311.method4350((byte)29) / 6) + "%";
                  class94.field1198 = 96;
               } else if(!class88.field1151.method4229(1645711979)) {
                  class94.field1197 = "Loading interfaces - " + (96 + class88.field1151.method4350((byte)53) / 50) + "%";
                  class94.field1198 = 96;
               } else {
                  class94.field1197 = "Loaded interfaces";
                  class94.field1198 = 98;
                  client.field707 = 140;
               }
            } else if(client.field707 == 140) {
               class94.field1198 = 100;
               if(!class278.field3555.method4245(class44.field339.field344, (short)5353)) {
                  class94.field1197 = "Loading world map - " + class278.field3555.method4261(class44.field339.field344, (byte)-63) / 10 + "%";
               } else {
                  if(class21.field121 == null) {
                     class21.field121 = new class342();
                     class21.field121.method6380(class278.field3555, class161.field1987, class25.field144, class175.field2045, client.field731, class169.field2009, -1632082744);
                  }

                  class94.field1197 = "Loaded world map";
                  client.field707 = 150;
               }
            } else if(client.field707 == 150) {
               class72.method1293(10, -1937567581);
            }
         }
      }
   }
}
