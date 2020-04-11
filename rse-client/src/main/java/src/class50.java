package src;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class class50 {

   static short[] field386;
   public int field391;
   public class222 field388;
   public class222 field385;


   public class50(int var1, class222 var2, class222 var3) {
      this.field391 = var1;
      this.field388 = var2;
      this.field385 = var3;
   }

   public static final void method867(int var0, boolean var1, int var2, int var3) {
      if(var0 >= 8000 && var0 <= '\ubb80') {
         class114.field1421 = var0;
         class114.field1437 = var1;
         class114.field1423 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   static void method864(byte var0) {
      class94.field1220 = class94.field1220.trim();
      if(class94.field1220.length() == 0) {
         class79.method1852("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.", (byte)78);
      } else {
         long var2;
         try {
            URL var4 = new URL(class41.method654("services", false, -107011280) + "m=accountappeal/login.ws");
            URLConnection var5 = var4.openConnection();
            var5.setRequestProperty("connection", "close");
            var5.setDoInput(true);
            var5.setDoOutput(true);
            var5.setConnectTimeout(5000);
            OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
            var6.write("data1=req");
            var6.flush();
            InputStream var7 = var5.getInputStream();
            class309 var8 = new class309(new byte[1000]);

            while(true) {
               int var9 = var7.read(var8.field3709, var8.field3710, 1000 - var8.field3710);
               if(var9 == -1) {
                  var8.field3710 = 0;
                  long var23 = var8.method5553((byte)116);
                  var2 = var23;
                  break;
               }

               var8.field3710 += var9;
               if(var8.field3710 >= 1000) {
                  var2 = 0L;
                  break;
               }
            }
         } catch (Exception var33) {
            var2 = 0L;
         }

         byte var1;
         if(0L == var2) {
            var1 = 5;
         } else {
            String var34 = class94.field1220;
            Random var35 = new Random();
            class309 var27 = new class309(128);
            class309 var10 = new class309(128);
            int[] var11 = new int[]{var35.nextInt(), var35.nextInt(), (int)(var2 >> 32), (int)var2};
            var27.readByte(10, 1258821856);

            int var12;
            for(var12 = 0; var12 < 4; ++var12) {
               var27.method5689(var35.nextInt(), 747474969);
            }

            var27.method5689(var11[0], 747474969);
            var27.method5689(var11[1], 747474969);
            var27.method5529(var2);
            var27.method5529(0L);

            for(var12 = 0; var12 < 4; ++var12) {
               var27.method5689(var35.nextInt(), 747474969);
            }

            var27.method5570(class89.field1158, class89.field1155, -1664689414);
            var10.readByte(10, 1258821856);

            for(var12 = 0; var12 < 3; ++var12) {
               var10.method5689(var35.nextInt(), 747474969);
            }

            var10.method5529(var35.nextLong());
            var10.method5535(var35.nextLong());
            if(client.field720 != null) {
               var10.method5596(client.field720, 0, client.field720.length, -1590891251);
            } else {
               byte[] var28 = class86.method2106(2048544727);
               var10.method5596(var28, 0, var28.length, -1590891251);
            }

            var10.method5529(var35.nextLong());
            var10.method5570(class89.field1158, class89.field1155, -1753308599);
            var12 = class234.method4198(var34, (byte)64);
            if(var12 % 8 != 0) {
               var12 += 8 - var12 % 8;
            }

            class309 var13 = new class309(var12);
            var13.method5627(var34, 1115767959);
            var13.field3710 = var12;
            var13.method5536(var11, (short)280);
            class309 var14 = new class309(var13.field3710 + var27.field3710 + var10.field3710 + 5);
            var14.readByte(2, 1258821856);
            var14.readByte(var27.field3710, 1258821856);
            var14.method5596(var27.field3709, 0, var27.field3710, -1590891251);
            var14.readByte(var10.field3710, 1258821856);
            var14.method5596(var10.field3709, 0, var10.field3710, -1590891251);
            var14.readShort(var13.field3710, (byte)-3);
            var14.method5596(var13.field3709, 0, var13.field3710, -1590891251);
            String var15 = class240.method4218(var14.field3709, (byte)-100);

            byte var29;
            try {
               URL var16 = new URL(class41.method654("services", false, -734848037) + "m=accountappeal/login.ws");
               URLConnection var17 = var16.openConnection();
               var17.setDoInput(true);
               var17.setDoOutput(true);
               var17.setConnectTimeout(5000);
               OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
               var18.write("data2=" + class63.method1187(var15, 2112458178) + "&dest=" + class63.method1187("passwordchoice.ws", 2112458178));
               var18.flush();
               InputStream var19 = var17.getInputStream();
               var14 = new class309(new byte[1000]);

               while(true) {
                  int var20 = var19.read(var14.field3709, var14.field3710, 1000 - var14.field3710);
                  if(var20 == -1) {
                     var18.close();
                     var19.close();
                     String var30 = new String(var14.field3709);
                     if(var30.startsWith("OFFLINE")) {
                        var29 = 4;
                     } else if(var30.startsWith("WRONG")) {
                        var29 = 7;
                     } else if(var30.startsWith("RELOAD")) {
                        var29 = 3;
                     } else if(var30.startsWith("Not permitted for social network accounts.")) {
                        var29 = 6;
                     } else {
                        var14.method5698(var11, 613143765);

                        while(var14.field3710 > 0 && var14.field3709[var14.field3710 - 1] == 0) {
                           --var14.field3710;
                        }

                        var30 = new String(var14.field3709, 0, var14.field3710);
                        boolean var21;
                        if(var30 == null) {
                           var21 = false;
                        } else {
                           label110: {
                              try {
                                 new URL(var30);
                              } catch (MalformedURLException var31) {
                                 var21 = false;
                                 break label110;
                              }

                              var21 = true;
                           }
                        }

                        if(var21) {
                           class101.method2322(var30, true, false, -1375550961);
                           var29 = 2;
                        } else {
                           var29 = 5;
                        }
                     }
                     break;
                  }

                  var14.field3710 += var20;
                  if(var14.field3710 >= 1000) {
                     var29 = 5;
                     break;
                  }
               }
            } catch (Throwable var32) {
               var32.printStackTrace();
               var29 = 5;
            }

            var1 = var29;
         }

         switch(var1) {
         case 2:
            class79.method1852(class233.field3026, class233.field2898, class233.field2807, (byte)40);
            class94.field1204 = 6;
            break;
         case 3:
            class79.method1852("", "Error connecting to server.", "", (byte)106);
            break;
         case 4:
            class79.method1852("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.", (byte)118);
            break;
         case 5:
            class79.method1852("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.", (byte)54);
            break;
         case 6:
            class79.method1852("", "Error connecting to server.", "", (byte)33);
            break;
         case 7:
            class79.method1852("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.", (byte)60);
         }

      }
   }

   static int method866(int var0, class101 var1, boolean var2, int var3) {
      class226 var4;
      if(var0 >= 2000) {
         var0 -= 1000;
         var4 = class208.method3898(class85.field1115[--class85.field1117], (byte)-26);
      } else {
         var4 = var2?class20.field115:class85.field1130;
      }

      String var5 = class85.field1118[--class85.field1119];
      int[] var6 = null;
      if(var5.length() > 0 && var5.charAt(var5.length() - 1) == 89) {
         int var7 = class85.field1115[--class85.field1117];
         if(var7 > 0) {
            for(var6 = new int[var7]; var7-- > 0; var6[var7] = class85.field1115[--class85.field1117]) {
               ;
            }
         }

         var5 = var5.substring(0, var5.length() - 1);
      }

      Object[] var9 = new Object[var5.length() + 1];

      int var8;
      for(var8 = var9.length - 1; var8 >= 1; --var8) {
         if(var5.charAt(var8 - 1) == 115) {
            var9[var8] = class85.field1118[--class85.field1119];
         } else {
            var9[var8] = new Integer(class85.field1115[--class85.field1117]);
         }
      }

      var8 = class85.field1115[--class85.field1117];
      if(var8 != -1) {
         var9[0] = new Integer(var8);
      } else {
         var9 = null;
      }

      if(var0 == 1400) {
         var4.field2655 = var9;
      } else if(var0 == 1401) {
         var4.field2668 = var9;
      } else if(var0 == 1402) {
         var4.field2577 = var9;
      } else if(var0 == 1403) {
         var4.field2680 = var9;
      } else if(var0 == 1404) {
         var4.field2661 = var9;
      } else if(var0 == 1405) {
         var4.field2662 = var9;
      } else if(var0 == 1406) {
         var4.field2665 = var9;
      } else if(var0 == 1407) {
         var4.field2666 = var9;
         var4.field2667 = var6;
      } else if(var0 == 1408) {
         var4.field2672 = var9;
      } else if(var0 == 1409) {
         var4.field2673 = var9;
      } else if(var0 == 1410) {
         var4.field2663 = var9;
      } else if(var0 == 1411) {
         var4.field2656 = var9;
      } else if(var0 == 1412) {
         var4.field2557 = var9;
      } else if(var0 == 1414) {
         var4.field2632 = var9;
         var4.field2669 = var6;
      } else if(var0 == 1415) {
         var4.field2633 = var9;
         var4.field2568 = var6;
      } else if(var0 == 1416) {
         var4.field2664 = var9;
      } else if(var0 == 1417) {
         var4.field2598 = var9;
      } else if(var0 == 1418) {
         var4.field2675 = var9;
      } else if(var0 == 1419) {
         var4.field2676 = var9;
      } else if(var0 == 1420) {
         var4.field2591 = var9;
      } else if(var0 == 1421) {
         var4.field2678 = var9;
      } else if(var0 == 1422) {
         var4.field2679 = var9;
      } else if(var0 == 1423) {
         var4.field2699 = var9;
      } else if(var0 == 1424) {
         var4.field2681 = var9;
      } else if(var0 == 1425) {
         var4.field2553 = var9;
      } else if(var0 == 1426) {
         var4.field2691 = var9;
      } else {
         if(var0 != 1427) {
            return 2;
         }

         var4.field2682 = var9;
      }

      var4.field2670 = true;
      return 1;
   }

   public static long method868(int var0, int var1) {
      return class137.field1757[var0];
   }

   static int method865(int var0, class101 var1, boolean var2, int var3) {
      if(var0 == 5306) {
         class85.field1115[++class85.field1117 - 1] = class74.method1327(2055204320);
         return 1;
      } else {
         int var4;
         if(var0 == 5307) {
            var4 = class85.field1115[--class85.field1117];
            if(var4 == 1 || var4 == 2) {
               class32.method406(var4, 265635085);
            }

            return 1;
         } else if(var0 == 5308) {
            class85.field1115[++class85.field1117 - 1] = class76.field676.field1079;
            return 1;
         } else if(var0 != 5309) {
            if(var0 == 5310) {
               --class85.field1117;
               return 1;
            } else {
               return 2;
            }
         } else {
            var4 = class85.field1115[--class85.field1117];
            if(var4 == 1 || var4 == 2) {
               class76.field676.field1079 = var4;
               class35.method509(1917303570);
            }

            return 1;
         }
      }
   }
}
