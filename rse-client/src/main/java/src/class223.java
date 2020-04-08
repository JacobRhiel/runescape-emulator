package src;

public class class223 {

   static final int[] field2541 = new int[]{8, 11, 4, 6, 9, 7, 10};
   static class154 field2536 = new class154(260);
   public static short[][] field2535;
   public static short[] field2539;
   static class245 field2543;
   public int field2537;
   int[] field2533;
   public boolean field2542;
   long field2534;
   int[] field2540;
   long field2538;


   public void method4080(int[] var1, int[] var2, boolean var3, int var4, int var5) {
      if(var1 == null) {
         var1 = new int[12];

         for(int var6 = 0; var6 < 7; ++var6) {
            for(int var7 = 0; var7 < class255.field3260; ++var7) {
               class255 var8 = class251.method4461(var7, -973838819);
               if(var8 != null && !var8.field3270 && var8.field3263 == (var3?7:0) + var6) {
                  var1[field2541[var6]] = var7 + 256;
                  break;
               }
            }
         }
      }

      this.field2540 = var1;
      this.field2533 = var2;
      this.field2542 = var3;
      this.field2537 = var4;
      this.method4068((byte)110);
   }

   public class136 method4069(class268 var1, int var2, class268 var3, int var4, int var5) {
      if(this.field2537 != -1) {
         return class237.method4201(this.field2537, 442315110).method4764(var1, var2, var3, var4, -1957935091);
      } else {
         long var6 = this.field2534;
         int[] var8 = this.field2540;
         if(var1 != null && (var1.field3510 >= 0 || var1.field3521 >= 0)) {
            var8 = new int[12];

            for(int var16 = 0; var16 < 12; ++var16) {
               var8[var16] = this.field2540[var16];
            }

            if(var1.field3510 >= 0) {
               var6 += (long)(var1.field3510 - this.field2540[5] << 40);
               var8[5] = var1.field3510;
            }

            if(var1.field3521 >= 0) {
               var6 += (long)(var1.field3521 - this.field2540[3] << 48);
               var8[3] = var1.field3521;
            }
         }

         class136 var9 = (class136)field2536.method3418(var6);
         if(var9 == null) {
            boolean var10 = false;

            int var12;
            for(int var11 = 0; var11 < 12; ++var11) {
               var12 = var8[var11];
               if(var12 >= 256 && var12 < 512 && !class251.method4461(var12 - 256, -32366674).method4497((byte)1)) {
                  var10 = true;
               }

               if(var12 >= 512 && !class30.method373(var12 - 512, (byte)48).method4697(this.field2542, 1659080166)) {
                  var10 = true;
               }
            }

            if(var10) {
               if(this.field2538 != -1L) {
                  var9 = (class136)field2536.method3418(this.field2538);
               }

               if(var9 == null) {
                  return null;
               }
            }

            if(var9 == null) {
               class130[] var17 = new class130[12];
               var12 = 0;

               int var14;
               for(int var13 = 0; var13 < 12; ++var13) {
                  var14 = var8[var13];
                  class130 var15;
                  if(var14 >= 256 && var14 < 512) {
                     var15 = class251.method4461(var14 - 256, 1927727100).method4498(-898584179);
                     if(var15 != null) {
                        var17[var12++] = var15;
                     }
                  }

                  if(var14 >= 512) {
                     var15 = class30.method373(var14 - 512, (byte)37).method4698(this.field2542, 475767309);
                     if(var15 != null) {
                        var17[var12++] = var15;
                     }
                  }
               }

               class130 var18 = new class130(var17, var12);

               for(var14 = 0; var14 < 5; ++var14) {
                  if(this.field2533[var14] < class138.field1764[var14].length) {
                     var18.method2879(class37.field278[var14], class138.field1764[var14][this.field2533[var14]]);
                  }

                  if(this.field2533[var14] < field2535[var14].length) {
                     var18.method2879(field2539[var14], field2535[var14][this.field2533[var14]]);
                  }
               }

               var9 = var18.method2886(64, 850, -30, -50, -30);
               field2536.method3424(var9, var6);
               this.field2538 = var6;
            }
         }

         if(var1 == null && var3 == null) {
            return var9;
         } else {
            class136 var19;
            if(var1 != null && var3 != null) {
               var19 = var1.method4823(var9, var2, var3, var4, (byte)1);
            } else if(var1 != null) {
               var19 = var1.method4820(var9, var2, 1747843246);
            } else {
               var19 = var3.method4820(var9, var4, 1747843246);
            }

            return var19;
         }
      }
   }

   void method4068(byte var1) {
      long var2 = this.field2534;
      int var4 = this.field2540[5];
      int var5 = this.field2540[9];
      this.field2540[5] = var5;
      this.field2540[9] = var4;
      this.field2534 = 0L;

      int var6;
      for(var6 = 0; var6 < 12; ++var6) {
         this.field2534 <<= 4;
         if(this.field2540[var6] >= 256) {
            this.field2534 += (long)(this.field2540[var6] - 256);
         }
      }

      if(this.field2540[0] >= 256) {
         this.field2534 += (long)(this.field2540[0] - 256 >> 4);
      }

      if(this.field2540[1] >= 256) {
         this.field2534 += (long)(this.field2540[1] - 256 >> 8);
      }

      for(var6 = 0; var6 < 5; ++var6) {
         this.field2534 <<= 3;
         this.field2534 += (long)this.field2533[var6];
      }

      this.field2534 <<= 1;
      this.field2534 += (long)(this.field2542?1:0);
      this.field2540[5] = var4;
      this.field2540[9] = var5;
      if(var2 != 0L && this.field2534 != var2) {
         field2536.method3411(var2);
      }

   }

   class130 method4070(short var1) {
      if(this.field2537 != -1) {
         return class237.method4201(this.field2537, -1790939997).method4760((byte)4);
      } else {
         boolean var2 = false;

         int var4;
         for(int var3 = 0; var3 < 12; ++var3) {
            var4 = this.field2540[var3];
            if(var4 >= 256 && var4 < 512 && !class251.method4461(var4 - 256, 152138988).method4499(1856166332)) {
               var2 = true;
            }

            if(var4 >= 512 && !class30.method373(var4 - 512, (byte)-29).method4748(this.field2542, -846973377)) {
               var2 = true;
            }
         }

         if(var2) {
            return null;
         } else {
            class130[] var8 = new class130[12];
            var4 = 0;

            int var6;
            for(int var5 = 0; var5 < 12; ++var5) {
               var6 = this.field2540[var5];
               class130 var7;
               if(var6 >= 256 && var6 < 512) {
                  var7 = class251.method4461(var6 - 256, 1720330512).method4500(2142658297);
                  if(var7 != null) {
                     var8[var4++] = var7;
                  }
               }

               if(var6 >= 512) {
                  var7 = class30.method373(var6 - 512, (byte)-29).method4700(this.field2542, 2065185270);
                  if(var7 != null) {
                     var8[var4++] = var7;
                  }
               }
            }

            class130 var9 = new class130(var8, var4);

            for(var6 = 0; var6 < 5; ++var6) {
               if(this.field2533[var6] < class138.field1764[var6].length) {
                  var9.method2879(class37.field278[var6], class138.field1764[var6][this.field2533[var6]]);
               }

               if(this.field2533[var6] < field2535[var6].length) {
                  var9.method2879(field2539[var6], field2535[var6][this.field2533[var6]]);
               }
            }

            return var9;
         }
      }
   }

   public void method4064(int var1, boolean var2, int var3) {
      if(var1 != 1 || !this.field2542) {
         int var4 = this.field2540[field2541[var1]];
         if(var4 != 0) {
            var4 -= 256;

            class255 var5;
            do {
               if(!var2) {
                  --var4;
                  if(var4 < 0) {
                     var4 = class255.field3260 - 1;
                  }
               } else {
                  ++var4;
                  if(var4 >= class255.field3260) {
                     var4 = 0;
                  }
               }

               var5 = class251.method4461(var4, -363918158);
            } while(var5 == null || var5.field3270 || var1 + (this.field2542?7:0) != var5.field3263);

            this.field2540[field2541[var1]] = var4 + 256;
            this.method4068((byte)116);
         }
      }
   }

   public void method4065(int var1, boolean var2, int var3) {
      int var4 = this.field2533[var1];
      boolean var5;
      if(!var2) {
         do {
            --var4;
            if(var4 < 0) {
               var4 = class138.field1764[var1].length - 1;
            }

            if(var1 == 4 && var4 >= 8) {
               var5 = false;
            } else {
               var5 = true;
            }
         } while(!var5);
      } else {
         do {
            ++var4;
            if(var4 >= class138.field1764[var1].length) {
               var4 = 0;
            }

            if(var1 == 4 && var4 >= 8) {
               var5 = false;
            } else {
               var5 = true;
            }
         } while(!var5);
      }

      this.field2533[var1] = var4;
      this.method4068((byte)60);
   }

   public void method4066(boolean var1, int var2) {
      if(this.field2542 != var1) {
         this.method4080((int[])null, this.field2533, var1, -1, 522059742);
      }
   }

   public void method4067(class309 var1, int var2) {
      var1.method5531(this.field2542?1:0, 1258821856);

      int var3;
      for(var3 = 0; var3 < 7; ++var3) {
         int var4 = this.field2540[field2541[var3]];
         if(var4 == 0) {
            var1.method5531(-1, 1258821856);
         } else {
            var1.method5531(var4 - 256, 1258821856);
         }
      }

      for(var3 = 0; var3 < 5; ++var3) {
         var1.method5531(this.field2533[var3], 1258821856);
      }

   }

   public int method4071(int var1) {
      return this.field2537 == -1?(this.field2540[0] << 15) + this.field2540[1] + (this.field2540[11] << 5) + (this.field2540[8] << 10) + (this.field2533[0] << 25) + (this.field2533[4] << 20):305419896 + class237.method4201(this.field2537, -836908255).field3464;
   }

   static void method4098(int var0, int var1) {
      if(var0 == -3) {
         class79.method1852("Connection timed out.", "Please try using a different world.", "", (byte)23);
      } else if(var0 == -2) {
         class79.method1852("Error connecting to server.", "Please try using a different world.", "", (byte)89);
      } else if(var0 == -1) {
         class79.method1852("No response from server.", "Please try using a different world.", "", (byte)11);
      } else if(var0 == 3) {
         class94.field1204 = 3;
         class94.field1218 = 1;
      } else if(var0 == 4) {
         class39.method645(0, -1343024338);
      } else if(var0 == 5) {
         class94.field1218 = 2;
         class79.method1852("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.", (byte)66);
      } else if(var0 != 68 && (client.field782 || var0 != 6)) {
         if(var0 == 7) {
            class79.method1852("This world is full.", "Please use a different world.", "", (byte)38);
         } else if(var0 == 8) {
            class79.method1852("Unable to connect.", "Login server offline.", "", (byte)96);
         } else if(var0 == 9) {
            class79.method1852("Login limit exceeded.", "Too many connections from your address.", "", (byte)69);
         } else if(var0 == 10) {
            class79.method1852("Unable to connect.", "Bad session id.", "", (byte)104);
         } else if(var0 == 11) {
            class79.method1852("We suspect someone knows your password.", "Press \'change your password\' on front page.", "", (byte)32);
         } else if(var0 == 12) {
            class79.method1852("You need a members account to login to this world.", "Please subscribe, or use a different world.", "", (byte)17);
         } else if(var0 == 13) {
            class79.method1852("Could not complete login.", "Please try using a different world.", "", (byte)32);
         } else if(var0 == 14) {
            class79.method1852("The server is being updated.", "Please wait 1 minute and try again.", "", (byte)7);
         } else if(var0 == 16) {
            class79.method1852("Too many login attempts.", "Please wait a few minutes before trying again.", "", (byte)13);
         } else if(var0 == 17) {
            class79.method1852("You are standing in a members-only area.", "To play on this world move to a free area first", "", (byte)103);
         } else if(var0 == 18) {
            class39.method645(1, 666934804);
         } else if(var0 == 19) {
            class79.method1852("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.", (byte)72);
         } else if(var0 == 20) {
            class79.method1852("Invalid loginserver requested.", "Please try using a different world.", "", (byte)74);
         } else if(var0 == 22) {
            class79.method1852("Malformed login packet.", "Please try again.", "", (byte)122);
         } else if(var0 == 23) {
            class79.method1852("No reply from loginserver.", "Please wait 1 minute and try again.", "", (byte)101);
         } else if(var0 == 24) {
            class79.method1852("Error loading your profile.", "Please contact customer support.", "", (byte)26);
         } else if(var0 == 25) {
            class79.method1852("Unexpected loginserver response.", "Please try using a different world.", "", (byte)103);
         } else if(var0 == 26) {
            class79.method1852("This computers address has been blocked", "as it was used to break our rules.", "", (byte)118);
         } else if(var0 == 27) {
            class79.method1852("", "Service unavailable.", "", (byte)97);
         } else if(var0 == 31) {
            class79.method1852("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.", (byte)94);
         } else if(var0 == 32) {
            class79.method1852("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.", (byte)119);
         } else if(var0 == 37) {
            class79.method1852("Your account is currently inaccessible.", "Please try again in a few minutes.", "", (byte)126);
         } else if(var0 == 38) {
            class79.method1852("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!", (byte)100);
         } else if(var0 == 55) {
            class94.field1204 = 8;
         } else {
            if(var0 == 56) {
               class79.method1852("Enter the 6-digit code generated by your", "authenticator app.", "", (byte)19);
               class72.method1293(11, -2063456027);
               return;
            }

            if(var0 == 57) {
               class79.method1852("The code you entered was incorrect.", "Please try again.", "", (byte)50);
               class72.method1293(11, -1910037370);
               return;
            }

            if(var0 == 61) {
               class94.field1204 = 7;
            } else {
               class79.method1852("Unexpected server response", "Please try using a different world.", "", (byte)30);
            }
         }
      } else {
         class79.method1852("RuneScape has been updated!", "Please reload this page.", "", (byte)89);
      }

      class72.method1293(10, -1946473834);
   }

   static void method4099(class71 var0, int var1, int var2) {
      Object[] var3 = var0.field602;
      class101 var4;
      int var18;
      if(class25.method280(var0.field611, -1245361009)) {
         class96.field1256 = (class50)var3[0];
         class251 var5 = class25.method279(class96.field1256.field391, -897330887);
         var4 = class145.method3361(var0.field611, var5.field3212, var5.field3213, -719728055);
      } else {
         var18 = ((Integer)var3[0]).intValue();
         var4 = class36.method511(var18, 1891668899);
      }

      if(var4 != null) {
         class85.field1117 = 0;
         class85.field1119 = 0;
         var18 = -1;
         int[] var6 = var4.field1297;
         int[] var7 = var4.field1300;
         byte var8 = -1;
         class85.field1111 = 0;
         class85.field1125 = false;

         try {
            int var11;
            try {
               class284.field3593 = new int[var4.field1302];
               int var9 = 0;
               class85.field1129 = new String[var4.field1301];
               int var10 = 0;

               int var12;
               String var19;
               for(var11 = 1; var11 < var3.length; ++var11) {
                  if(var3[var11] instanceof Integer) {
                     var12 = ((Integer)var3[var11]).intValue();
                     if(var12 == -2147483647) {
                        var12 = var0.field603;
                     }

                     if(var12 == -2147483646) {
                        var12 = var0.field600;
                     }

                     if(var12 == -2147483645) {
                        var12 = var0.field612 != null?var0.field612.field2567:-1;
                     }

                     if(var12 == -2147483644) {
                        var12 = var0.field605;
                     }

                     if(var12 == -2147483643) {
                        var12 = var0.field612 != null?var0.field612.field2709:-1;
                     }

                     if(var12 == -2147483642) {
                        var12 = var0.field606 != null?var0.field606.field2567:-1;
                     }

                     if(var12 == -2147483641) {
                        var12 = var0.field606 != null?var0.field606.field2709:-1;
                     }

                     if(var12 == -2147483640) {
                        var12 = var0.field609;
                     }

                     if(var12 == -2147483639) {
                        var12 = var0.field608;
                     }

                     class284.field3593[var9++] = var12;
                  } else if(var3[var11] instanceof String) {
                     var19 = (String)var3[var11];
                     if(var19.equals("event_opbase")) {
                        var19 = var0.field607;
                     }

                     class85.field1129[var10++] = var19;
                  }
               }

               var11 = 0;
               class85.field1127 = var0.field604;

               while(true) {
                  ++var11;
                  if(var11 > var1) {
                     throw new RuntimeException();
                  }

                  ++var18;
                  int var30 = var6[var18];
                  int var21;
                  if(var30 < 100) {
                     if(var30 == 0) {
                        class85.field1115[++class85.field1117 - 1] = var7[var18];
                     } else if(var30 == 1) {
                        var12 = var7[var18];
                        class85.field1115[++class85.field1117 - 1] = class221.field2526[var12];
                     } else if(var30 == 2) {
                        var12 = var7[var18];
                        class221.field2526[var12] = class85.field1115[--class85.field1117];
                        class22.method253(var12, (byte)-55);
                     } else if(var30 == 3) {
                        class85.field1118[++class85.field1119 - 1] = var4.field1299[var18];
                     } else if(var30 == 6) {
                        var18 += var7[var18];
                     } else if(var30 == 7) {
                        class85.field1117 -= 2;
                        if(class85.field1115[class85.field1117] != class85.field1115[class85.field1117 + 1]) {
                           var18 += var7[var18];
                        }
                     } else if(var30 == 8) {
                        class85.field1117 -= 2;
                        if(class85.field1115[class85.field1117] == class85.field1115[class85.field1117 + 1]) {
                           var18 += var7[var18];
                        }
                     } else if(var30 == 9) {
                        class85.field1117 -= 2;
                        if(class85.field1115[class85.field1117] < class85.field1115[class85.field1117 + 1]) {
                           var18 += var7[var18];
                        }
                     } else if(var30 == 10) {
                        class85.field1117 -= 2;
                        if(class85.field1115[class85.field1117] > class85.field1115[class85.field1117 + 1]) {
                           var18 += var7[var18];
                        }
                     } else if(var30 == 21) {
                        if(class85.field1111 == 0) {
                           return;
                        }

                        class65 var33 = class85.field1121[--class85.field1111];
                        var4 = var33.field557;
                        var6 = var4.field1297;
                        var7 = var4.field1300;
                        var18 = var33.field558;
                        class284.field3593 = var33.field559;
                        class85.field1129 = var33.field560;
                     } else if(var30 == 25) {
                        var12 = var7[var18];
                        class85.field1115[++class85.field1117 - 1] = class95.method2197(var12, 29577048);
                     } else if(var30 == 27) {
                        var12 = var7[var18];
                        class132.method2938(var12, class85.field1115[--class85.field1117], (byte)-95);
                     } else if(var30 == 31) {
                        class85.field1117 -= 2;
                        if(class85.field1115[class85.field1117] <= class85.field1115[class85.field1117 + 1]) {
                           var18 += var7[var18];
                        }
                     } else if(var30 == 32) {
                        class85.field1117 -= 2;
                        if(class85.field1115[class85.field1117] >= class85.field1115[class85.field1117 + 1]) {
                           var18 += var7[var18];
                        }
                     } else if(var30 == 33) {
                        class85.field1115[++class85.field1117 - 1] = class284.field3593[var7[var18]];
                     } else if(var30 == 34) {
                        class284.field3593[var7[var18]] = class85.field1115[--class85.field1117];
                     } else if(var30 == 35) {
                        class85.field1118[++class85.field1119 - 1] = class85.field1129[var7[var18]];
                     } else if(var30 == 36) {
                        class85.field1129[var7[var18]] = class85.field1118[--class85.field1119];
                     } else if(var30 == 37) {
                        var12 = var7[var18];
                        class85.field1119 -= var12;
                        String var13 = class208.method3900(class85.field1118, class85.field1119, var12, (short)313);
                        class85.field1118[++class85.field1119 - 1] = var13;
                     } else if(var30 == 38) {
                        --class85.field1117;
                     } else if(var30 == 39) {
                        --class85.field1119;
                     } else {
                        int var16;
                        if(var30 == 40) {
                           var12 = var7[var18];
                           class101 var31 = class36.method511(var12, -595477152);
                           int[] var14 = new int[var31.field1302];
                           String[] var15 = new String[var31.field1301];

                           for(var16 = 0; var16 < var31.field1306; ++var16) {
                              var14[var16] = class85.field1115[var16 + (class85.field1117 - var31.field1306)];
                           }

                           for(var16 = 0; var16 < var31.field1296; ++var16) {
                              var15[var16] = class85.field1118[var16 + (class85.field1119 - var31.field1296)];
                           }

                           class85.field1117 -= var31.field1306;
                           class85.field1119 -= var31.field1296;
                           class65 var20 = new class65();
                           var20.field557 = var4;
                           var20.field558 = var18;
                           var20.field559 = class284.field3593;
                           var20.field560 = class85.field1129;
                           class85.field1121[++class85.field1111 - 1] = var20;
                           var4 = var31;
                           var6 = var31.field1297;
                           var7 = var31.field1300;
                           var18 = -1;
                           class284.field3593 = var14;
                           class85.field1129 = var15;
                        } else if(var30 == 42) {
                           class85.field1115[++class85.field1117 - 1] = class160.field1983.method2240(var7[var18], (byte)-101);
                        } else if(var30 == 43) {
                           class160.field1983.method2239(var7[var18], class85.field1115[--class85.field1117], 1118908426);
                        } else if(var30 == 44) {
                           var12 = var7[var18] >> 16;
                           var21 = var7[var18] & '\uffff';
                           int var22 = class85.field1115[--class85.field1117];
                           if(var22 < 0 || var22 > 5000) {
                              throw new RuntimeException();
                           }

                           class85.field1114[var12] = var22;
                           byte var23 = -1;
                           if(var21 == 105) {
                              var23 = 0;
                           }

                           for(var16 = 0; var16 < var22; ++var16) {
                              class85.field1122[var12][var16] = var23;
                           }
                        } else if(var30 == 45) {
                           var12 = var7[var18];
                           var21 = class85.field1115[--class85.field1117];
                           if(var21 < 0 || var21 >= class85.field1114[var12]) {
                              throw new RuntimeException();
                           }

                           class85.field1115[++class85.field1117 - 1] = class85.field1122[var12][var21];
                        } else if(var30 == 46) {
                           var12 = var7[var18];
                           class85.field1117 -= 2;
                           var21 = class85.field1115[class85.field1117];
                           if(var21 < 0 || var21 >= class85.field1114[var12]) {
                              throw new RuntimeException();
                           }

                           class85.field1122[var12][var21] = class85.field1115[class85.field1117 + 1];
                        } else if(var30 == 47) {
                           var19 = class160.field1983.method2244(var7[var18], (byte)61);
                           if(var19 == null) {
                              var19 = "null";
                           }

                           class85.field1118[++class85.field1119 - 1] = var19;
                        } else if(var30 == 48) {
                           class160.field1983.method2266(var7[var18], class85.field1118[--class85.field1119], (short)10505);
                        } else if(var30 == 49) {
                           var19 = class160.field1983.method2264(var7[var18], -1244262565);
                           class85.field1118[++class85.field1119 - 1] = var19;
                        } else if(var30 == 50) {
                           class160.field1983.method2272(var7[var18], class85.field1118[--class85.field1119], 1504120549);
                        } else {
                           if(var30 != 60) {
                              throw new IllegalStateException();
                           }

                           class325 var35 = var4.field1304[var7[var18]];
                           class188 var32 = (class188)var35.method5968((long)class85.field1115[--class85.field1117]);
                           if(var32 != null) {
                              var18 += var32.field2114;
                           }
                        }
                     }
                  } else {
                     boolean var34;
                     if(var4.field1300[var18] == 1) {
                        var34 = true;
                     } else {
                        var34 = false;
                     }

                     var21 = class201.method3739(var30, var4, var34, 1096677335);
                     switch(var21) {
                     case 0:
                        return;
                     case 1:
                     default:
                        break;
                     case 2:
                        throw new IllegalStateException();
                     }
                  }
               }
            } catch (Exception var28) {
               StringBuilder var25 = new StringBuilder(30);
               var25.append("").append(var4.field2116).append(" ");

               for(var11 = class85.field1111 - 1; var11 >= 0; --var11) {
                  var25.append("").append(class85.field1121[var11].field557.field2116).append(" ");
               }

               var25.append("").append(var8);
               class229.method4189(var25.toString(), var28, -1131770525);
            }
         } finally {
            if(class85.field1125) {
               class85.field1126 = true;
               class227.method4160(1891530232);
               class85.field1126 = false;
               class85.field1125 = false;
            }

         }
      }
   }

   static final void method4063(String var0, int var1) {
      if(class70.field596 != null) {
         class196 var2 = class146.method3363(class192.field2217, client.field761.field1340, -1839910713);
         var2.field2338.method5531(class234.method4198(var0, (byte)34), 1258821856);
         var2.field2338.method5627(var0, 1522628500);
         client.field761.method2361(var2, 1558188096);
      }
   }
}
