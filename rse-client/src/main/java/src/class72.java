package src;

public class class72 implements Runnable {

   boolean field619 = true;
   Object field614 = new Object();
   int field620 = 0;
   int[] field621 = new int[500];
   int[] field617 = new int[500];
   long[] field618 = new long[500];


   public void run() {
      for(; this.field619; class169.method3527(50L)) {
         Object var1 = this.field614;
         synchronized(this.field614) {
            if(this.field620 < 500) {
               this.field621[this.field620] = class63.field517;
               this.field617[this.field620] = class63.field518;
               this.field618[this.field620] = class63.field515;
               ++this.field620;
            }
         }
      }

   }

   static void method1293(int var0, int var1) {
      if(var0 != client.field687) {
         if(client.field687 == 0) {
            class42.field318.method1025(-104499552);
         }

         if(var0 == 20 || var0 == 40 || var0 == 45) {
            client.field711 = 0;
            client.field712 = 0;
            client.field713 = 0;
            client.field796.method5020(var0, (byte)-21);
            if(var0 != 20) {
               class86.method2108(false, -1537467605);
            }
         }

         if(var0 != 20 && var0 != 40 && class152.field1960 != null) {
            class152.field1960.vmethod5866((byte)-125);
            class152.field1960 = null;
         }

         if(client.field687 == 25) {
            client.field899 = 0;
            client.field818 = 0;
            client.field921 = 1;
            client.field734 = 0;
            client.field735 = 1;
         }

         if(var0 != 5 && var0 != 10) {
            if(var0 == 20) {
               class299.method5322(class223.field2543, class228.field2717, true, client.field687 == 11?4:0, 824199758);
            } else if(var0 == 11) {
               class299.method5322(class223.field2543, class228.field2717, false, 4, 633697598);
            } else {
               class216.method4011(-1281352540);
            }
         } else {
            class299.method5322(class223.field2543, class228.field2717, true, 0, 53757689);
         }

         client.field687 = var0;
      }
   }

   static void method1289(class304 var0, class304 var1, class304 var2, int var3) {
      class94.field1191 = (class37.field277 - 765) / 2;
      class94.field1215 = class94.field1191 + 202;
      class104.field1331 = class94.field1215 + 180;
      int var7;
      int var9;
      int var10;
      int var12;
      boolean var16;
      int var18;
      byte var24;
      int var25;
      int var48;
      int var50;
      if(class94.field1219) {
         if(class69.field588 == null) {
            class69.field588 = class254.method4483(class228.field2717, "sl_back", "", -1984453529);
         }

         class245 var34;
         int var37;
         class333[] var38;
         if(class16.field79 == null) {
            var34 = class228.field2717;
            var37 = var34.method4240("sl_flags", (short)-10732);
            var7 = var34.method4233(var37, "", 374626728);
            if(!class164.method3502(var34, var37, var7, -1771673957)) {
               var38 = null;
            } else {
               var38 = class230.method4190(1947519745);
            }

            class16.field79 = var38;
         }

         if(class34.field246 == null) {
            var34 = class228.field2717;
            var37 = var34.method4240("sl_arrows", (short)-3251);
            var7 = var34.method4233(var37, "", 1583095488);
            if(!class164.method3502(var34, var37, var7, -817892035)) {
               var38 = null;
            } else {
               var38 = class230.method4190(2023356145);
            }

            class34.field246 = var38;
         }

         if(class348.field4064 == null) {
            var34 = class228.field2717;
            var37 = var34.method4240("sl_stars", (short)6225);
            var7 = var34.method4233(var37, "", 565653053);
            if(!class164.method3502(var34, var37, var7, -1033347660)) {
               var38 = null;
            } else {
               var38 = class230.method4190(1669591407);
            }

            class348.field4064 = var38;
         }

         if(class92.field1179 == null) {
            class92.field1179 = class7.method105(class228.field2717, "leftarrow", "", (byte)1);
         }

         if(class260.field3308 == null) {
            class260.field3308 = class7.method105(class228.field2717, "rightarrow", "", (byte)1);
         }

         class330.method6052(class94.field1191, 23, 765, 480, 0);
         class330.method6053(class94.field1191, 0, 125, 23, 12425273, 9135624);
         class330.method6053(class94.field1191 + 125, 0, 640, 23, 5197647, 2697513);
         var0.method5392("Select a world", class94.field1191 + 62, 15, 0, -1);
         if(class348.field4064 != null) {
            class348.field4064[1].method6173(class94.field1191 + 140, 1);
            var1.method5389("Members only world", class94.field1191 + 152, 10, 16777215, -1);
            class348.field4064[0].method6173(class94.field1191 + 140, 12);
            var1.method5389("Free world", class94.field1191 + 152, 21, 16777215, -1);
         }

         if(class34.field246 != null) {
            var48 = class94.field1191 + 280;
            if(class80.field1047[0] == 0 && class80.field1048[0] == 0) {
               class34.field246[2].method6173(var48, 4);
            } else {
               class34.field246[0].method6173(var48, 4);
            }

            if(class80.field1047[0] == 0 && class80.field1048[0] == 1) {
               class34.field246[3].method6173(var48 + 15, 4);
            } else {
               class34.field246[1].method6173(var48 + 15, 4);
            }

            var0.method5389("World", var48 + 32, 17, 16777215, -1);
            var25 = class94.field1191 + 390;
            if(class80.field1047[0] == 1 && class80.field1048[0] == 0) {
               class34.field246[2].method6173(var25, 4);
            } else {
               class34.field246[0].method6173(var25, 4);
            }

            if(class80.field1047[0] == 1 && class80.field1048[0] == 1) {
               class34.field246[3].method6173(var25 + 15, 4);
            } else {
               class34.field246[1].method6173(var25 + 15, 4);
            }

            var0.method5389("Players", var25 + 32, 17, 16777215, -1);
            var37 = class94.field1191 + 500;
            if(class80.field1047[0] == 2 && class80.field1048[0] == 0) {
               class34.field246[2].method6173(var37, 4);
            } else {
               class34.field246[0].method6173(var37, 4);
            }

            if(class80.field1047[0] == 2 && class80.field1048[0] == 1) {
               class34.field246[3].method6173(var37 + 15, 4);
            } else {
               class34.field246[1].method6173(var37 + 15, 4);
            }

            var0.method5389("Location", var37 + 32, 17, 16777215, -1);
            var7 = class94.field1191 + 610;
            if(class80.field1047[0] == 3 && class80.field1048[0] == 0) {
               class34.field246[2].method6173(var7, 4);
            } else {
               class34.field246[0].method6173(var7, 4);
            }

            if(class80.field1047[0] == 3 && class80.field1048[0] == 1) {
               class34.field246[3].method6173(var7 + 15, 4);
            } else {
               class34.field246[1].method6173(var7 + 15, 4);
            }

            var0.method5389("Type", var7 + 32, 17, 16777215, -1);
         }

         class330.method6052(class94.field1191 + 708, 4, 50, 16, 0);
         var1.method5392("Cancel", class94.field1191 + 708 + 25, 16, 16777215, -1);
         class94.field1199 = -1;
         if(class69.field588 != null) {
            var24 = 88;
            byte var51 = 19;
            var37 = 765 / (var24 + 1) - 1;
            var7 = 480 / (var51 + 1);

            do {
               do {
                  var50 = var7;
                  var9 = var37;
                  if(var7 * (var37 - 1) >= class80.field1044) {
                     --var37;
                  }

                  if(var37 * (var7 - 1) >= class80.field1044) {
                     --var7;
                  }

                  if(var37 * (var7 - 1) >= class80.field1044) {
                     --var7;
                  }
               } while(var7 != var50);
            } while(var37 != var9);

            var50 = (765 - var37 * var24) / (var37 + 1);
            if(var50 > 5) {
               var50 = 5;
            }

            var9 = (480 - var51 * var7) / (var7 + 1);
            if(var9 > 5) {
               var9 = 5;
            }

            var10 = (765 - var37 * var24 - var50 * (var37 - 1)) / 2;
            int var30 = (480 - var7 * var51 - var9 * (var7 - 1)) / 2;
            var12 = (var7 + class80.field1044 - 1) / var7;
            class94.field1222 = var12 - var37;
            if(class92.field1179 != null && class94.field1189 > 0) {
               class92.field1179.method6173(8, class221.field2525 / 2 - class92.field1179.field3885 / 2);
            }

            if(class260.field3308 != null && class94.field1189 < class94.field1222) {
               class260.field3308.method6173(class37.field277 - class260.field3308.field3883 - 8, class221.field2525 / 2 - class260.field3308.field3885 / 2);
            }

            int var43 = var30 + 23;
            int var14 = var10 + class94.field1191;
            int var15 = 0;
            var16 = false;
            int var44 = class94.field1189;

            for(var18 = var44 * var7; var18 < class80.field1044 && var44 - class94.field1189 < var37; ++var18) {
               class80 var31 = class324.field3837[var18];
               boolean var20 = true;
               String var21 = Integer.toString(var31.field1050);
               if(var31.field1050 == -1) {
                  var21 = "OFF";
                  var20 = false;
               } else if(var31.field1050 > 1980) {
                  var21 = "FULL";
                  var20 = false;
               }

               int var23 = 0;
               byte var22;
               if(var31.method1859(-1399101886)) {
                  if(var31.method1886((byte)-87)) {
                     var22 = 7;
                  } else {
                     var22 = 6;
                  }
               } else if(var31.method1858(248561667)) {
                  var23 = 16711680;
                  if(var31.method1886((byte)-40)) {
                     var22 = 5;
                  } else {
                     var22 = 4;
                  }
               } else if(var31.method1865((byte)20)) {
                  if(var31.method1886((byte)70)) {
                     var22 = 9;
                  } else {
                     var22 = 8;
                  }
               } else if(var31.method1856(-1915504932)) {
                  if(var31.method1886((byte)-36)) {
                     var22 = 3;
                  } else {
                     var22 = 2;
                  }
               } else if(var31.method1886((byte)88)) {
                  var22 = 1;
               } else {
                  var22 = 0;
               }

               if(class63.field517 >= var14 && class63.field518 >= var43 && class63.field517 < var24 + var14 && class63.field518 < var51 + var43 && var20) {
                  class94.field1199 = var18;
                  class69.field588[var22].method6249(var14, var43, 128, 16777215);
                  var16 = true;
               } else {
                  class69.field588[var22].method6185(var14, var43);
               }

               if(class16.field79 != null) {
                  class16.field79[(var31.method1886((byte)63)?8:0) + var31.field1053].method6173(var14 + 29, var43);
               }

               var0.method5392(Integer.toString(var31.field1040), var14 + 15, var51 / 2 + var43 + 5, var23, -1);
               var1.method5392(var21, var14 + 60, var51 / 2 + var43 + 5, 268435455, -1);
               var43 = var43 + var9 + var51;
               ++var15;
               if(var15 >= var7) {
                  var43 = var30 + 23;
                  var14 = var14 + var50 + var24;
                  var15 = 0;
                  ++var44;
               }
            }

            if(var16) {
               var18 = var1.method5384(class324.field3837[class94.field1199].field1052) + 6;
               int var45 = var1.field3682 + 8;
               int var46 = class63.field518 + 25;
               if(var46 + var45 > 480) {
                  var46 = class63.field518 - 25 - var45;
               }

               class330.method6052(class63.field517 - var18 / 2, var46, var18, var45, 16777120);
               class330.method6137(class63.field517 - var18 / 2, var46, var18, var45, 0);
               var1.method5392(class324.field3837[class94.field1199].field1052, class63.field517, var46 + var1.field3682 + 4, 0, -1);
            }
         }

         class206.field2411.vmethod6139(0, 0, -232566303);
      } else {
         class94.field1193.method6185(class94.field1191, 0);
         class215.field2501.method6185(class94.field1191 + 382, 0);
         class3.field18.method6173(class94.field1191 + 382 - class3.field18.field3883 / 2, 18);
         if(client.field687 == 0 || client.field687 == 5) {
            var24 = 20;
            var0.method5392("RuneScape is loading - please wait...", class94.field1215 + 180, 245 - var24, 16777215, -1);
            var25 = 253 - var24;
            class330.method6137(class94.field1215 + 180 - 152, var25, 304, 34, 9179409);
            class330.method6137(class94.field1215 + 180 - 151, var25 + 1, 302, 32, 0);
            class330.method6052(class94.field1215 + 180 - 150, var25 + 2, class94.field1198 * 3, 30, 9179409);
            class330.method6052(class94.field1215 + 180 - 150 + class94.field1198 * 3, var25 + 2, 300 - class94.field1198 * 3, 30, 0);
            var0.method5392(class94.field1197, class94.field1215 + 180, 276 - var24, 16777215, -1);
         }

         String var8;
         char[] var11;
         String var26;
         String var28;
         short var47;
         short var49;
         if(client.field687 == 20) {
            class143.field1878.method6173(class94.field1215 + 180 - class143.field1878.field3883 / 2, 271 - class143.field1878.field3885 / 2);
            var47 = 201;
            var0.method5392(class94.field1206, class94.field1215 + 180, var47, 16776960, 0);
            var48 = var47 + 15;
            var0.method5392(class94.field1192, class94.field1215 + 180, var48, 16776960, 0);
            var48 += 15;
            var0.method5392(class94.field1208, class94.field1215 + 180, var48, 16776960, 0);
            var48 += 15;
            var48 += 7;
            if(class94.field1204 != 4) {
               var0.method5389("Login: ", class94.field1215 + 180 - 110, var48, 16777215, 0);
               var49 = 200;

               for(var26 = class294.method5291(1033875086); var0.method5384(var26) > var49; var26 = var26.substring(0, var26.length() - 1)) {
                  ;
               }

               var0.method5389(class305.method5388(var26), class94.field1215 + 180 - 70, var48, 16777215, 0);
               var48 += 15;
               var8 = class94.field1210;
               var10 = var8.length();
               var11 = new char[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var11[var12] = 42;
               }

               var28 = new String(var11);

               for(var28 = var28; var0.method5384(var28) > var49; var28 = var28.substring(1)) {
                  ;
               }

               var0.method5389("Password: " + var28, class94.field1215 + 180 - 108, var48, 16777215, 0);
               var48 += 15;
            }
         }

         if(client.field687 == 10 || client.field687 == 11) {
            class143.field1878.method6173(class94.field1215, 171);
            short var6;
            if(class94.field1204 == 0) {
               var47 = 251;
               var0.method5392("Welcome to RuneScape", class94.field1215 + 180, var47, 16776960, 0);
               var48 = var47 + 30;
               var25 = class94.field1215 + 180 - 80;
               var6 = 291;
               class76.field674.method6173(var25 - 73, var6 - 20);
               var0.method5397("New User", var25 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var25 = class94.field1215 + 180 + 80;
               class76.field674.method6173(var25 - 73, var6 - 20);
               var0.method5397("Existing User", var25 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if(class94.field1204 == 1) {
               var0.method5392(class94.field1203, class94.field1215 + 180, 201, 16776960, 0);
               var47 = 236;
               var0.method5392(class94.field1206, class94.field1215 + 180, var47, 16777215, 0);
               var48 = var47 + 15;
               var0.method5392(class94.field1192, class94.field1215 + 180, var48, 16777215, 0);
               var48 += 15;
               var0.method5392(class94.field1208, class94.field1215 + 180, var48, 16777215, 0);
               var48 += 15;
               var25 = class94.field1215 + 180 - 80;
               var6 = 321;
               class76.field674.method6173(var25 - 73, var6 - 20);
               var0.method5392("Continue", var25, var6 + 5, 16777215, 0);
               var25 = class94.field1215 + 180 + 80;
               class76.field674.method6173(var25 - 73, var6 - 20);
               var0.method5392("Cancel", var25, var6 + 5, 16777215, 0);
            } else {
               class333 var40;
               if(class94.field1204 == 2) {
                  var47 = 201;
                  var0.method5392(class94.field1206, class104.field1331, var47, 16776960, 0);
                  var48 = var47 + 15;
                  var0.method5392(class94.field1192, class104.field1331, var48, 16776960, 0);
                  var48 += 15;
                  var0.method5392(class94.field1208, class104.field1331, var48, 16776960, 0);
                  var48 += 15;
                  var48 += 7;
                  var0.method5389("Login: ", class104.field1331 - 110, var48, 16777215, 0);
                  var49 = 200;

                  for(var26 = class294.method5291(1033875086); var0.method5384(var26) > var49; var26 = var26.substring(1)) {
                     ;
                  }

                  var0.method5389(class305.method5388(var26) + (class94.field1209 == 0 & client.field689 % 40 < 20?class297.method5314(16776960, 930990308) + "|":""), class104.field1331 - 70, var48, 16777215, 0);
                  var48 += 15;
                  var8 = class94.field1210;
                  var10 = var8.length();
                  var11 = new char[var10];

                  for(var12 = 0; var12 < var10; ++var12) {
                     var11[var12] = 42;
                  }

                  var28 = new String(var11);

                  for(var28 = var28; var0.method5384(var28) > var49; var28 = var28.substring(1)) {
                     ;
                  }

                  var0.method5389("Password: " + var28 + (class94.field1209 == 1 & client.field689 % 40 < 20?class297.method5314(16776960, -920838430) + "|":""), class104.field1331 - 108, var48, 16777215, 0);
                  var48 += 15;
                  var47 = 277;
                  var10 = class104.field1331 + -117;
                  boolean var41 = client.field716;
                  boolean var13 = class94.field1207;
                  var40 = var41?(var13?class94.field1195:class94.field1194):(var13?class26.field160:class4.field21);
                  var40.method6173(var10, var47);
                  var10 = var10 + var40.field3883 + 5;
                  var1.method5389("Remember username", var10, var47 + 13, 16776960, 0);
                  var10 = class104.field1331 + 24;
                  var16 = class76.field676.field1075;
                  boolean var17 = class94.field1212;
                  class333 var33 = var16?(var17?class94.field1195:class94.field1194):(var17?class26.field160:class4.field21);
                  var33.method6173(var10, var47);
                  var10 = var10 + var33.field3883 + 5;
                  var1.method5389("Hide username", var10, var47 + 13, 16776960, 0);
                  var48 = var47 + 15;
                  var18 = class104.field1331 - 80;
                  short var19 = 321;
                  class76.field674.method6173(var18 - 73, var19 - 20);
                  var0.method5392("Login", var18, var19 + 5, 16777215, 0);
                  var18 = class104.field1331 + 80;
                  class76.field674.method6173(var18 - 73, var19 - 20);
                  var0.method5392("Cancel", var18, var19 + 5, 16777215, 0);
                  var47 = 357;
                  switch(class94.field1218) {
                  case 2:
                     class73.field633 = "Having trouble logging in?";
                     break;
                  default:
                     class73.field633 = "Can\'t login? Click here.";
                  }

                  class41.field315 = new class328(class104.field1331, var47, var1.method5384(class73.field633), 11);
                  class211.field2495 = new class328(class104.field1331, var47, var1.method5384("Still having trouble logging in?"), 11);
                  var1.method5392(class73.field633, class104.field1331, var47, 16777215, 0);
               } else if(class94.field1204 == 3) {
                  var47 = 201;
                  var0.method5392("Invalid credentials.", class94.field1215 + 180, var47, 16776960, 0);
                  var48 = var47 + 20;
                  var1.method5392("For accounts created after 24th November 2010, please use your", class94.field1215 + 180, var48, 16776960, 0);
                  var48 += 15;
                  var1.method5392("email address to login. Otherwise please login with your username.", class94.field1215 + 180, var48, 16776960, 0);
                  var48 += 15;
                  var25 = class94.field1215 + 180;
                  var6 = 276;
                  class76.field674.method6173(var25 - 73, var6 - 20);
                  var2.method5392("Try again", var25, var6 + 5, 16777215, 0);
                  var25 = class94.field1215 + 180;
                  var6 = 326;
                  class76.field674.method6173(var25 - 73, var6 - 20);
                  var2.method5392("Forgotten password?", var25, var6 + 5, 16777215, 0);
               } else if(class94.field1204 == 4) {
                  var0.method5392("Authenticator", class94.field1215 + 180, 201, 16776960, 0);
                  var47 = 236;
                  var0.method5392(class94.field1206, class94.field1215 + 180, var47, 16777215, 0);
                  var48 = var47 + 15;
                  var0.method5392(class94.field1192, class94.field1215 + 180, var48, 16777215, 0);
                  var48 += 15;
                  var0.method5392(class94.field1208, class94.field1215 + 180, var48, 16777215, 0);
                  var48 += 15;
                  var26 = "PIN: ";
                  var8 = class173.field2025;
                  var10 = var8.length();
                  var11 = new char[var10];

                  for(var12 = 0; var12 < var10; ++var12) {
                     var11[var12] = 42;
                  }

                  var28 = new String(var11);
                  var0.method5389(var26 + var28 + (client.field689 % 40 < 20?class297.method5314(16776960, -1225622031) + "|":""), class94.field1215 + 180 - 108, var48, 16777215, 0);
                  var48 -= 8;
                  var0.method5389("Trust this computer", class94.field1215 + 180 - 9, var48, 16776960, 0);
                  var48 += 15;
                  var0.method5389("for 30 days: ", class94.field1215 + 180 - 9, var48, 16776960, 0);
                  var9 = 180 + class94.field1215 - 9 + var0.method5384("for 30 days: ") + 15;
                  var10 = var48 - var0.field3682;
                  if(class94.field1214) {
                     var40 = class94.field1194;
                  } else {
                     var40 = class4.field21;
                  }

                  var40.method6173(var9, var10);
                  var48 += 15;
                  var12 = class94.field1215 + 180 - 80;
                  short var42 = 321;
                  class76.field674.method6173(var12 - 73, var42 - 20);
                  var0.method5392("Continue", var12, var42 + 5, 16777215, 0);
                  var12 = class94.field1215 + 180 + 80;
                  class76.field674.method6173(var12 - 73, var42 - 20);
                  var0.method5392("Cancel", var12, var42 + 5, 16777215, 0);
                  var1.method5392("<u=ff>Can\'t Log In?</u>", class94.field1215 + 180, var42 + 36, 255, 0);
               } else if(class94.field1204 == 5) {
                  var0.method5392("Forgotten your password?", class94.field1215 + 180, 201, 16776960, 0);
                  var47 = 221;
                  var2.method5392(class94.field1206, class94.field1215 + 180, var47, 16776960, 0);
                  var48 = var47 + 15;
                  var2.method5392(class94.field1192, class94.field1215 + 180, var48, 16776960, 0);
                  var48 += 15;
                  var2.method5392(class94.field1208, class94.field1215 + 180, var48, 16776960, 0);
                  var48 += 15;
                  var48 += 14;
                  var0.method5389("Username/email: ", class94.field1215 + 180 - 145, var48, 16777215, 0);
                  var49 = 174;

                  for(var26 = class294.method5291(1033875086); var0.method5384(var26) > var49; var26 = var26.substring(1)) {
                     ;
                  }

                  var0.method5389(class305.method5388(var26) + (client.field689 % 40 < 20?class297.method5314(16776960, -2019315081) + "|":""), class94.field1215 + 180 - 34, var48, 16777215, 0);
                  var48 += 15;
                  var7 = class94.field1215 + 180 - 80;
                  short var27 = 321;
                  class76.field674.method6173(var7 - 73, var27 - 20);
                  var0.method5392("Recover", var7, var27 + 5, 16777215, 0);
                  var7 = class94.field1215 + 180 + 80;
                  class76.field674.method6173(var7 - 73, var27 - 20);
                  var0.method5392("Back", var7, var27 + 5, 16777215, 0);
                  var27 = 356;
                  var1.method5392("Still having trouble logging in?", class104.field1331, var27, 268435455, 0);
               } else if(class94.field1204 == 6) {
                  var47 = 201;
                  var0.method5392(class94.field1206, class94.field1215 + 180, var47, 16776960, 0);
                  var48 = var47 + 15;
                  var0.method5392(class94.field1192, class94.field1215 + 180, var48, 16776960, 0);
                  var48 += 15;
                  var0.method5392(class94.field1208, class94.field1215 + 180, var48, 16776960, 0);
                  var48 += 15;
                  var25 = class94.field1215 + 180;
                  var6 = 321;
                  class76.field674.method6173(var25 - 73, var6 - 20);
                  var0.method5392("Back", var25, var6 + 5, 16777215, 0);
               } else if(class94.field1204 == 7) {
                  var47 = 216;
                  var0.method5392("Your date of birth isn\'t set.", class94.field1215 + 180, var47, 16776960, 0);
                  var48 = var47 + 15;
                  var2.method5392("Please verify your account status by", class94.field1215 + 180, var48, 16776960, 0);
                  var48 += 15;
                  var2.method5392("setting your date of birth.", class94.field1215 + 180, var48, 16776960, 0);
                  var48 += 15;
                  var25 = class94.field1215 + 180 - 80;
                  var6 = 321;
                  class76.field674.method6173(var25 - 73, var6 - 20);
                  var0.method5392("Set Date of Birth", var25, var6 + 5, 16777215, 0);
                  var25 = class94.field1215 + 180 + 80;
                  class76.field674.method6173(var25 - 73, var6 - 20);
                  var0.method5392("Back", var25, var6 + 5, 16777215, 0);
               } else if(class94.field1204 == 8) {
                  var47 = 216;
                  var0.method5392("Sorry, but your account is not eligible to play.", class94.field1215 + 180, var47, 16776960, 0);
                  var48 = var47 + 15;
                  var2.method5392("For more information, please take a look at", class94.field1215 + 180, var48, 16776960, 0);
                  var48 += 15;
                  var2.method5392("our privacy policy.", class94.field1215 + 180, var48, 16776960, 0);
                  var48 += 15;
                  var25 = class94.field1215 + 180 - 80;
                  var6 = 321;
                  class76.field674.method6173(var25 - 73, var6 - 20);
                  var0.method5392("Privacy Policy", var25, var6 + 5, 16777215, 0);
                  var25 = class94.field1215 + 180 + 80;
                  class76.field674.method6173(var25 - 73, var6 - 20);
                  var0.method5392("Back", var25, var6 + 5, 16777215, 0);
               } else if(class94.field1204 == 12) {
                  var47 = 201;
                  String var5 = "";
                  var26 = "";
                  String var29 = "";
                  switch(class94.field1201) {
                  case 0:
                     var5 = "Your account has been disabled.";
                     var26 = class233.field2811;
                     var29 = "";
                     break;
                  case 1:
                     var5 = "Account locked as we suspect it has been stolen.";
                     var26 = class233.field2914;
                     var29 = "";
                     break;
                  default:
                     class263.method4687(false, 649887816);
                  }

                  var0.method5392(var5, class94.field1215 + 180, var47, 16776960, 0);
                  var48 = var47 + 15;
                  var2.method5392(var26, class94.field1215 + 180, var48, 16776960, 0);
                  var48 += 15;
                  var2.method5392(var29, class94.field1215 + 180, var48, 16776960, 0);
                  var48 += 15;
                  var50 = class94.field1215 + 180;
                  short var39 = 276;
                  class76.field674.method6173(var50 - 73, var39 - 20);
                  var0.method5392("Support Page", var50, var39 + 5, 16777215, 0);
                  var50 = class94.field1215 + 180;
                  var39 = 326;
                  class76.field674.method6173(var50 - 73, var39 - 20);
                  var0.method5392("Back", var50, var39 + 5, 16777215, 0);
               } else if(class94.field1204 == 24) {
                  var47 = 221;
                  var0.method5392(class94.field1206, class94.field1215 + 180, var47, 16777215, 0);
                  var48 = var47 + 15;
                  var0.method5392(class94.field1192, class94.field1215 + 180, var48, 16777215, 0);
                  var48 += 15;
                  var0.method5392(class94.field1208, class94.field1215 + 180, var48, 16777215, 0);
                  var48 += 15;
                  var25 = class94.field1215 + 180;
                  var6 = 301;
                  class76.field674.method6173(var25 - 73, var6 - 20);
                  var0.method5392("Ok", var25, var6 + 5, 16777215, 0);
               }
            }
         }

         if(client.field687 >= 10) {
            int[] var4 = new int[4];
            class330.method6047(var4);
            class330.method6045(class94.field1191, 0, class94.field1191 + 765, class221.field2525);
            class173.field2027.method1918(class94.field1191 - 22, client.field689, (byte)10);
            class173.field2027.method1918(class94.field1191 + 22 + 765 - 128, client.field689, (byte)82);
            class330.method6048(var4);
         }

         class317.field3784[class76.field676.field1078?1:0].method6173(class94.field1191 + 765 - 40, 463);
         if(client.field687 > 5 && class199.field2358 == class285.field3597) {
            if(class68.field572 != null) {
               var48 = class94.field1191 + 5;
               var49 = 463;
               byte var36 = 100;
               byte var35 = 35;
               class68.field572.method6173(var48, var49);
               var0.method5392("World" + " " + client.field680, var36 / 2 + var48, var35 / 2 + var49 - 2, 16777215, 0);
               if(class193.field2318 != null) {
                  var1.method5392("Loading...", var36 / 2 + var48, var35 / 2 + var49 + 12, 16777215, 0);
               } else {
                  var1.method5392("Click to switch", var36 / 2 + var48, var35 / 2 + var49 + 12, 16777215, 0);
               }
            } else {
               class68.field572 = class7.method105(class228.field2717, "sl_button", "", (byte)1);
            }
         }

      }
   }

   static int method1290(int var0, class101 var1, boolean var2, int var3) {
      if(var0 == 6200) {
         class85.field1117 -= 2;
         client.field931 = (short)class278.method5015(class85.field1115[class85.field1117], -2135141314);
         if(client.field931 <= 0) {
            client.field931 = 256;
         }

         client.field932 = (short)class278.method5015(class85.field1115[class85.field1117 + 1], -2138221045);
         if(client.field932 <= 0) {
            client.field932 = 256;
         }

         return 1;
      } else if(var0 == 6201) {
         class85.field1117 -= 2;
         client.field897 = (short)class85.field1115[class85.field1117];
         if(client.field897 <= 0) {
            client.field897 = 256;
         }

         client.field850 = (short)class85.field1115[class85.field1117 + 1];
         if(client.field850 <= 0) {
            client.field850 = 320;
         }

         return 1;
      } else if(var0 == 6202) {
         class85.field1117 -= 4;
         client.field935 = (short)class85.field1115[class85.field1117];
         if(client.field935 <= 0) {
            client.field935 = 1;
         }

         client.field748 = (short)class85.field1115[class85.field1117 + 1];
         if(client.field748 <= 0) {
            client.field748 = 32767;
         } else if(client.field748 < client.field935) {
            client.field748 = client.field935;
         }

         client.field937 = (short)class85.field1115[class85.field1117 + 2];
         if(client.field937 <= 0) {
            client.field937 = 1;
         }

         client.field938 = (short)class85.field1115[class85.field1117 + 3];
         if(client.field938 <= 0) {
            client.field938 = 32767;
         } else if(client.field938 < client.field937) {
            client.field938 = client.field937;
         }

         return 1;
      } else if(var0 == 6203) {
         if(client.field852 != null) {
            class204.method3751(0, 0, client.field852.field2582, client.field852.field2642, false, -2056899944);
            class85.field1115[++class85.field1117 - 1] = client.field820;
            class85.field1115[++class85.field1117 - 1] = client.field942;
         } else {
            class85.field1115[++class85.field1117 - 1] = -1;
            class85.field1115[++class85.field1117 - 1] = -1;
         }

         return 1;
      } else if(var0 == 6204) {
         class85.field1115[++class85.field1117 - 1] = client.field897;
         class85.field1115[++class85.field1117 - 1] = client.field850;
         return 1;
      } else if(var0 == 6205) {
         class85.field1115[++class85.field1117 - 1] = class78.method1846(client.field931, -2086656267);
         class85.field1115[++class85.field1117 - 1] = class78.method1846(client.field932, -2119442874);
         return 1;
      } else if(var0 == 6220) {
         class85.field1115[++class85.field1117 - 1] = 0;
         return 1;
      } else if(var0 == 6221) {
         class85.field1115[++class85.field1117 - 1] = 0;
         return 1;
      } else if(var0 == 6222) {
         class85.field1115[++class85.field1117 - 1] = class37.field277;
         return 1;
      } else if(var0 == 6223) {
         class85.field1115[++class85.field1117 - 1] = class221.field2525;
         return 1;
      } else {
         return 2;
      }
   }
}
