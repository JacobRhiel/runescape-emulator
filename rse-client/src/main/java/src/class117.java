package src;

public class class117 {

   static byte[][][] field1462;
   class243 field1460;
   class243 field1458;
   class327 field1463 = new class327(256);
   class327 field1459 = new class327(256);


   public class117(class243 var1, class243 var2) {
      this.field1458 = var1;
      this.field1460 = var2;
   }

   class112 method2596(int var1, int var2, int[] var3, int var4) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5;
      class112 var8 = (class112)this.field1463.method6010(var6);
      if(var8 != null) {
         return var8;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class110 var9 = class110.method2455(this.field1458, var1, var2);
         if(var9 == null) {
            return null;
         } else {
            var8 = var9.method2452();
            this.field1463.method5997(var8, var6);
            if(var3 != null) {
               var3[0] -= var8.field1404.length;
            }

            return var8;
         }
      }
   }

   class112 method2604(int var1, int var2, int[] var3, int var4) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5 ^ 4294967296L;
      class112 var8 = (class112)this.field1463.method6010(var6);
      if(var8 != null) {
         return var8;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class111 var9 = (class111)this.field1459.method6010(var6);
         if(var9 == null) {
            var9 = class111.method2489(this.field1460, var1, var2);
            if(var9 == null) {
               return null;
            }

            this.field1459.method5997(var9, var6);
         }

         var8 = var9.method2467(var3);
         if(var8 == null) {
            return null;
         } else {
            var9.method3657();
            this.field1463.method5997(var8, var6);
            return var8;
         }
      }
   }

   public class112 method2598(int var1, int[] var2, int var3) {
      if(this.field1458.method4235((byte)-52) == 1) {
         return this.method2596(0, var1, var2, -1082666612);
      } else if(this.field1458.method4246(var1, (byte)-6) == 1) {
         return this.method2596(var1, 0, var2, -1082666612);
      } else {
         throw new RuntimeException();
      }
   }

   public class112 method2599(int var1, int[] var2, int var3) {
      if(this.field1460.method4235((byte)-119) == 1) {
         return this.method2604(0, var1, var2, -1027789078);
      } else if(this.field1460.method4246(var1, (byte)9) == 1) {
         return this.method2604(var1, 0, var2, -1325173526);
      } else {
         throw new RuntimeException();
      }
   }

   static final void method2595(class75 var0, int var1, int var2, byte var3, int var4) {
      int var5 = var0.field1028[0];
      int var6 = var0.field1029[0];
      int var7 = var0.method1337((byte)-95);
      if(var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7) {
         if(var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
            int var9 = var0.method1337((byte)-45);
            class183 var10 = class34.method438(var1, var2, (byte)123);
            class181 var11 = client.field737[var0.field666];
            int[] var12 = client.field955;
            int[] var13 = client.field956;

            int var14;
            int var15;
            for(var14 = 0; var14 < 128; ++var14) {
               for(var15 = 0; var15 < 128; ++var15) {
                  class182.field2096[var14][var15] = 0;
                  class182.field2099[var14][var15] = 99999999;
               }
            }

            int var16;
            int var17;
            byte var18;
            byte var19;
            int var20;
            int var21;
            byte var22;
            int var23;
            int[][] var24;
            int var25;
            int var26;
            int var27;
            int var28;
            boolean var34;
            boolean var35;
            int var36;
            int var37;
            int var39;
            if(var9 == 1) {
               var16 = var5;
               var17 = var6;
               var18 = 64;
               var19 = 64;
               var20 = var5 - var18;
               var21 = var6 - var19;
               class182.field2096[var18][var19] = 99;
               class182.field2099[var18][var19] = 0;
               var22 = 0;
               var23 = 0;
               class182.field2094[var22] = var5;
               var39 = var22 + 1;
               class182.field2101[var22] = var6;
               var24 = var11.field2092;

               while(true) {
                  if(var23 == var39) {
                     class222.field2530 = var16;
                     class182.field2097 = var17;
                     var35 = false;
                     break;
                  }

                  var16 = class182.field2094[var23];
                  var17 = class182.field2101[var23];
                  var23 = var23 + 1 & 4095;
                  var36 = var16 - var20;
                  var37 = var17 - var21;
                  var25 = var16 - var11.field2085;
                  var26 = var17 - var11.field2086;
                  if(var10.vmethod3646(1, var16, var17, var11, (byte)-112)) {
                     class222.field2530 = var16;
                     class182.field2097 = var17;
                     var35 = true;
                     break;
                  }

                  var27 = class182.field2099[var36][var37] + 1;
                  if(var36 > 0 && class182.field2096[var36 - 1][var37] == 0 && (var24[var25 - 1][var26] & 19136776) == 0) {
                     class182.field2094[var39] = var16 - 1;
                     class182.field2101[var39] = var17;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 - 1][var37] = 2;
                     class182.field2099[var36 - 1][var37] = var27;
                  }

                  if(var36 < 127 && class182.field2096[var36 + 1][var37] == 0 && (var24[var25 + 1][var26] & 19136896) == 0) {
                     class182.field2094[var39] = var16 + 1;
                     class182.field2101[var39] = var17;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 + 1][var37] = 8;
                     class182.field2099[var36 + 1][var37] = var27;
                  }

                  if(var37 > 0 && class182.field2096[var36][var37 - 1] == 0 && (var24[var25][var26 - 1] & 19136770) == 0) {
                     class182.field2094[var39] = var16;
                     class182.field2101[var39] = var17 - 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36][var37 - 1] = 1;
                     class182.field2099[var36][var37 - 1] = var27;
                  }

                  if(var37 < 127 && class182.field2096[var36][var37 + 1] == 0 && (var24[var25][var26 + 1] & 19136800) == 0) {
                     class182.field2094[var39] = var16;
                     class182.field2101[var39] = var17 + 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36][var37 + 1] = 4;
                     class182.field2099[var36][var37 + 1] = var27;
                  }

                  if(var36 > 0 && var37 > 0 && class182.field2096[var36 - 1][var37 - 1] == 0 && (var24[var25 - 1][var26 - 1] & 19136782) == 0 && (var24[var25 - 1][var26] & 19136776) == 0 && (var24[var25][var26 - 1] & 19136770) == 0) {
                     class182.field2094[var39] = var16 - 1;
                     class182.field2101[var39] = var17 - 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 - 1][var37 - 1] = 3;
                     class182.field2099[var36 - 1][var37 - 1] = var27;
                  }

                  if(var36 < 127 && var37 > 0 && class182.field2096[var36 + 1][var37 - 1] == 0 && (var24[var25 + 1][var26 - 1] & 19136899) == 0 && (var24[var25 + 1][var26] & 19136896) == 0 && (var24[var25][var26 - 1] & 19136770) == 0) {
                     class182.field2094[var39] = var16 + 1;
                     class182.field2101[var39] = var17 - 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 + 1][var37 - 1] = 9;
                     class182.field2099[var36 + 1][var37 - 1] = var27;
                  }

                  if(var36 > 0 && var37 < 127 && class182.field2096[var36 - 1][var37 + 1] == 0 && (var24[var25 - 1][var26 + 1] & 19136824) == 0 && (var24[var25 - 1][var26] & 19136776) == 0 && (var24[var25][var26 + 1] & 19136800) == 0) {
                     class182.field2094[var39] = var16 - 1;
                     class182.field2101[var39] = var17 + 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 - 1][var37 + 1] = 6;
                     class182.field2099[var36 - 1][var37 + 1] = var27;
                  }

                  if(var36 < 127 && var37 < 127 && class182.field2096[var36 + 1][var37 + 1] == 0 && (var24[var25 + 1][var26 + 1] & 19136992) == 0 && (var24[var25 + 1][var26] & 19136896) == 0 && (var24[var25][var26 + 1] & 19136800) == 0) {
                     class182.field2094[var39] = var16 + 1;
                     class182.field2101[var39] = var17 + 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 + 1][var37 + 1] = 12;
                     class182.field2099[var36 + 1][var37 + 1] = var27;
                  }
               }

               var34 = var35;
            } else if(var9 == 2) {
               var16 = var5;
               var17 = var6;
               var18 = 64;
               var19 = 64;
               var20 = var5 - var18;
               var21 = var6 - var19;
               class182.field2096[var18][var19] = 99;
               class182.field2099[var18][var19] = 0;
               var22 = 0;
               var23 = 0;
               class182.field2094[var22] = var5;
               var39 = var22 + 1;
               class182.field2101[var22] = var6;
               var24 = var11.field2092;

               while(true) {
                  if(var23 == var39) {
                     class222.field2530 = var16;
                     class182.field2097 = var17;
                     var35 = false;
                     break;
                  }

                  var16 = class182.field2094[var23];
                  var17 = class182.field2101[var23];
                  var23 = var23 + 1 & 4095;
                  var36 = var16 - var20;
                  var37 = var17 - var21;
                  var25 = var16 - var11.field2085;
                  var26 = var17 - var11.field2086;
                  if(var10.vmethod3646(2, var16, var17, var11, (byte)-48)) {
                     class222.field2530 = var16;
                     class182.field2097 = var17;
                     var35 = true;
                     break;
                  }

                  var27 = class182.field2099[var36][var37] + 1;
                  if(var36 > 0 && class182.field2096[var36 - 1][var37] == 0 && (var24[var25 - 1][var26] & 19136782) == 0 && (var24[var25 - 1][var26 + 1] & 19136824) == 0) {
                     class182.field2094[var39] = var16 - 1;
                     class182.field2101[var39] = var17;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 - 1][var37] = 2;
                     class182.field2099[var36 - 1][var37] = var27;
                  }

                  if(var36 < 126 && class182.field2096[var36 + 1][var37] == 0 && (var24[var25 + 2][var26] & 19136899) == 0 && (var24[var25 + 2][var26 + 1] & 19136992) == 0) {
                     class182.field2094[var39] = var16 + 1;
                     class182.field2101[var39] = var17;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 + 1][var37] = 8;
                     class182.field2099[var36 + 1][var37] = var27;
                  }

                  if(var37 > 0 && class182.field2096[var36][var37 - 1] == 0 && (var24[var25][var26 - 1] & 19136782) == 0 && (var24[var25 + 1][var26 - 1] & 19136899) == 0) {
                     class182.field2094[var39] = var16;
                     class182.field2101[var39] = var17 - 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36][var37 - 1] = 1;
                     class182.field2099[var36][var37 - 1] = var27;
                  }

                  if(var37 < 126 && class182.field2096[var36][var37 + 1] == 0 && (var24[var25][var26 + 2] & 19136824) == 0 && (var24[var25 + 1][var26 + 2] & 19136992) == 0) {
                     class182.field2094[var39] = var16;
                     class182.field2101[var39] = var17 + 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36][var37 + 1] = 4;
                     class182.field2099[var36][var37 + 1] = var27;
                  }

                  if(var36 > 0 && var37 > 0 && class182.field2096[var36 - 1][var37 - 1] == 0 && (var24[var25 - 1][var26] & 19136830) == 0 && (var24[var25 - 1][var26 - 1] & 19136782) == 0 && (var24[var25][var26 - 1] & 19136911) == 0) {
                     class182.field2094[var39] = var16 - 1;
                     class182.field2101[var39] = var17 - 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 - 1][var37 - 1] = 3;
                     class182.field2099[var36 - 1][var37 - 1] = var27;
                  }

                  if(var36 < 126 && var37 > 0 && class182.field2096[var36 + 1][var37 - 1] == 0 && (var24[var25 + 1][var26 - 1] & 19136911) == 0 && (var24[var25 + 2][var26 - 1] & 19136899) == 0 && (var24[var25 + 2][var26] & 19136995) == 0) {
                     class182.field2094[var39] = var16 + 1;
                     class182.field2101[var39] = var17 - 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 + 1][var37 - 1] = 9;
                     class182.field2099[var36 + 1][var37 - 1] = var27;
                  }

                  if(var36 > 0 && var37 < 126 && class182.field2096[var36 - 1][var37 + 1] == 0 && (var24[var25 - 1][var26 + 1] & 19136830) == 0 && (var24[var25 - 1][var26 + 2] & 19136824) == 0 && (var24[var25][var26 + 2] & 19137016) == 0) {
                     class182.field2094[var39] = var16 - 1;
                     class182.field2101[var39] = var17 + 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 - 1][var37 + 1] = 6;
                     class182.field2099[var36 - 1][var37 + 1] = var27;
                  }

                  if(var36 < 126 && var37 < 126 && class182.field2096[var36 + 1][var37 + 1] == 0 && (var24[var25 + 1][var26 + 2] & 19137016) == 0 && (var24[var25 + 2][var26 + 2] & 19136992) == 0 && (var24[var25 + 2][var26 + 1] & 19136995) == 0) {
                     class182.field2094[var39] = var16 + 1;
                     class182.field2101[var39] = var17 + 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 + 1][var37 + 1] = 12;
                     class182.field2099[var36 + 1][var37 + 1] = var27;
                  }
               }

               var34 = var35;
            } else {
               var16 = var5;
               var17 = var6;
               var18 = 64;
               var19 = 64;
               var20 = var5 - var18;
               var21 = var6 - var19;
               class182.field2096[var18][var19] = 99;
               class182.field2099[var18][var19] = 0;
               var22 = 0;
               var23 = 0;
               class182.field2094[var22] = var5;
               var39 = var22 + 1;
               class182.field2101[var22] = var6;
               var24 = var11.field2092;

               label774:
               while(true) {
                  if(var23 == var39) {
                     class222.field2530 = var16;
                     class182.field2097 = var17;
                     var35 = false;
                     break;
                  }

                  var16 = class182.field2094[var23];
                  var17 = class182.field2101[var23];
                  var23 = var23 + 1 & 4095;
                  var36 = var16 - var20;
                  var37 = var17 - var21;
                  var25 = var16 - var11.field2085;
                  var26 = var17 - var11.field2086;
                  if(var10.vmethod3646(var9, var16, var17, var11, (byte)-96)) {
                     class222.field2530 = var16;
                     class182.field2097 = var17;
                     var35 = true;
                     break;
                  }

                  var27 = class182.field2099[var36][var37] + 1;
                  if(var36 > 0 && class182.field2096[var36 - 1][var37] == 0 && (var24[var25 - 1][var26] & 19136782) == 0 && (var24[var25 - 1][var9 + var26 - 1] & 19136824) == 0) {
                     var28 = 1;

                     while(true) {
                        if(var28 >= var9 - 1) {
                           class182.field2094[var39] = var16 - 1;
                           class182.field2101[var39] = var17;
                           var39 = var39 + 1 & 4095;
                           class182.field2096[var36 - 1][var37] = 2;
                           class182.field2099[var36 - 1][var37] = var27;
                           break;
                        }

                        if((var24[var25 - 1][var28 + var26] & 19136830) != 0) {
                           break;
                        }

                        ++var28;
                     }
                  }

                  if(var36 < 128 - var9 && class182.field2096[var36 + 1][var37] == 0 && (var24[var25 + var9][var26] & 19136899) == 0 && (var24[var25 + var9][var26 + var9 - 1] & 19136992) == 0) {
                     var28 = 1;

                     while(true) {
                        if(var28 >= var9 - 1) {
                           class182.field2094[var39] = var16 + 1;
                           class182.field2101[var39] = var17;
                           var39 = var39 + 1 & 4095;
                           class182.field2096[var36 + 1][var37] = 8;
                           class182.field2099[var36 + 1][var37] = var27;
                           break;
                        }

                        if((var24[var25 + var9][var26 + var28] & 19136995) != 0) {
                           break;
                        }

                        ++var28;
                     }
                  }

                  if(var37 > 0 && class182.field2096[var36][var37 - 1] == 0 && (var24[var25][var26 - 1] & 19136782) == 0 && (var24[var9 + var25 - 1][var26 - 1] & 19136899) == 0) {
                     var28 = 1;

                     while(true) {
                        if(var28 >= var9 - 1) {
                           class182.field2094[var39] = var16;
                           class182.field2101[var39] = var17 - 1;
                           var39 = var39 + 1 & 4095;
                           class182.field2096[var36][var37 - 1] = 1;
                           class182.field2099[var36][var37 - 1] = var27;
                           break;
                        }

                        if((var24[var28 + var25][var26 - 1] & 19136911) != 0) {
                           break;
                        }

                        ++var28;
                     }
                  }

                  if(var37 < 128 - var9 && class182.field2096[var36][var37 + 1] == 0 && (var24[var25][var26 + var9] & 19136824) == 0 && (var24[var25 + var9 - 1][var26 + var9] & 19136992) == 0) {
                     var28 = 1;

                     while(true) {
                        if(var28 >= var9 - 1) {
                           class182.field2094[var39] = var16;
                           class182.field2101[var39] = var17 + 1;
                           var39 = var39 + 1 & 4095;
                           class182.field2096[var36][var37 + 1] = 4;
                           class182.field2099[var36][var37 + 1] = var27;
                           break;
                        }

                        if((var24[var25 + var28][var26 + var9] & 19137016) != 0) {
                           break;
                        }

                        ++var28;
                     }
                  }

                  if(var36 > 0 && var37 > 0 && class182.field2096[var36 - 1][var37 - 1] == 0 && (var24[var25 - 1][var26 - 1] & 19136782) == 0) {
                     var28 = 1;

                     while(true) {
                        if(var28 >= var9) {
                           class182.field2094[var39] = var16 - 1;
                           class182.field2101[var39] = var17 - 1;
                           var39 = var39 + 1 & 4095;
                           class182.field2096[var36 - 1][var37 - 1] = 3;
                           class182.field2099[var36 - 1][var37 - 1] = var27;
                           break;
                        }

                        if((var24[var25 - 1][var28 + (var26 - 1)] & 19136830) != 0 || (var24[var28 + (var25 - 1)][var26 - 1] & 19136911) != 0) {
                           break;
                        }

                        ++var28;
                     }
                  }

                  if(var36 < 128 - var9 && var37 > 0 && class182.field2096[var36 + 1][var37 - 1] == 0 && (var24[var25 + var9][var26 - 1] & 19136899) == 0) {
                     var28 = 1;

                     while(true) {
                        if(var28 >= var9) {
                           class182.field2094[var39] = var16 + 1;
                           class182.field2101[var39] = var17 - 1;
                           var39 = var39 + 1 & 4095;
                           class182.field2096[var36 + 1][var37 - 1] = 9;
                           class182.field2099[var36 + 1][var37 - 1] = var27;
                           break;
                        }

                        if((var24[var25 + var9][var28 + (var26 - 1)] & 19136995) != 0 || (var24[var28 + var25][var26 - 1] & 19136911) != 0) {
                           break;
                        }

                        ++var28;
                     }
                  }

                  if(var36 > 0 && var37 < 128 - var9 && class182.field2096[var36 - 1][var37 + 1] == 0 && (var24[var25 - 1][var26 + var9] & 19136824) == 0) {
                     var28 = 1;

                     while(true) {
                        if(var28 >= var9) {
                           class182.field2094[var39] = var16 - 1;
                           class182.field2101[var39] = var17 + 1;
                           var39 = var39 + 1 & 4095;
                           class182.field2096[var36 - 1][var37 + 1] = 6;
                           class182.field2099[var36 - 1][var37 + 1] = var27;
                           break;
                        }

                        if((var24[var25 - 1][var28 + var26] & 19136830) != 0 || (var24[var28 + (var25 - 1)][var9 + var26] & 19137016) != 0) {
                           break;
                        }

                        ++var28;
                     }
                  }

                  if(var36 < 128 - var9 && var37 < 128 - var9 && class182.field2096[var36 + 1][var37 + 1] == 0 && (var24[var25 + var9][var9 + var26] & 19136992) == 0) {
                     for(var28 = 1; var28 < var9; ++var28) {
                        if((var24[var28 + var25][var26 + var9] & 19137016) != 0 || (var24[var25 + var9][var26 + var28] & 19136995) != 0) {
                           continue label774;
                        }
                     }

                     class182.field2094[var39] = var16 + 1;
                     class182.field2101[var39] = var17 + 1;
                     var39 = var39 + 1 & 4095;
                     class182.field2096[var36 + 1][var37 + 1] = 12;
                     class182.field2099[var36 + 1][var37 + 1] = var27;
                  }
               }

               var34 = var35;
            }

            int var8;
            label827: {
               var15 = var5 - 64;
               var16 = var6 - 64;
               var17 = class222.field2530;
               var36 = class182.field2097;
               if(!var34) {
                  var37 = Integer.MAX_VALUE;
                  var20 = Integer.MAX_VALUE;
                  byte var38 = 10;
                  var39 = var10.field2104;
                  var23 = var10.field2103;
                  int var33 = var10.field2102;
                  var25 = var10.field2105;

                  for(var26 = var39 - var38; var26 <= var39 + var38; ++var26) {
                     for(var27 = var23 - var38; var27 <= var23 + var38; ++var27) {
                        var28 = var26 - var15;
                        int var29 = var27 - var16;
                        if(var28 >= 0 && var29 >= 0 && var28 < 128 && var29 < 128 && class182.field2099[var28][var29] < 100) {
                           int var30 = 0;
                           if(var26 < var39) {
                              var30 = var39 - var26;
                           } else if(var26 > var39 + var33 - 1) {
                              var30 = var26 - (var33 + var39 - 1);
                           }

                           int var31 = 0;
                           if(var27 < var23) {
                              var31 = var23 - var27;
                           } else if(var27 > var23 + var25 - 1) {
                              var31 = var27 - (var25 + var23 - 1);
                           }

                           int var32 = var30 * var30 + var31 * var31;
                           if(var32 < var37 || var32 == var37 && class182.field2099[var28][var29] < var20) {
                              var37 = var32;
                              var20 = class182.field2099[var28][var29];
                              var17 = var26;
                              var36 = var27;
                           }
                        }
                     }
                  }

                  if(var37 == Integer.MAX_VALUE) {
                     var8 = -1;
                     break label827;
                  }
               }

               if(var17 == var5 && var6 == var36) {
                  var8 = 0;
               } else {
                  var19 = 0;
                  class182.field2094[var19] = var17;
                  var37 = var19 + 1;
                  class182.field2101[var19] = var36;

                  for(var20 = var21 = class182.field2096[var17 - var15][var36 - var16]; var17 != var5 || var6 != var36; var20 = class182.field2096[var17 - var15][var36 - var16]) {
                     if(var20 != var21) {
                        var21 = var20;
                        class182.field2094[var37] = var17;
                        class182.field2101[var37++] = var36;
                     }

                     if((var20 & 2) != 0) {
                        ++var17;
                     } else if((var20 & 8) != 0) {
                        --var17;
                     }

                     if((var20 & 1) != 0) {
                        ++var36;
                     } else if((var20 & 4) != 0) {
                        --var36;
                     }
                  }

                  var39 = 0;

                  while(var37-- > 0) {
                     var12[var39] = class182.field2094[var37];
                     var13[var39++] = class182.field2101[var37];
                     if(var39 >= var12.length) {
                        break;
                     }
                  }

                  var8 = var39;
               }
            }

            var14 = var8;
            if(var8 >= 1) {
               for(var15 = 0; var15 < var14 - 1; ++var15) {
                  var0.method1341(client.field955[var15], client.field956[var15], var3, -1688251567);
               }

            }
         }
      }
   }

   static final void method2606(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if(client.field684 && var0 != class71.field610) {
            return;
         }

         long var8 = 0L;
         boolean var10 = true;
         boolean var11 = false;
         boolean var12 = false;
         if(var1 == 0) {
            var8 = class14.field60.method3189(var0, var2, var3);
         }

         if(var1 == 1) {
            var8 = class14.field60.method3190(var0, var2, var3);
         }

         if(var1 == 2) {
            var8 = class14.field60.method3191(var0, var2, var3);
         }

         if(var1 == 3) {
            var8 = class14.field60.method3309(var0, var2, var3);
         }

         int var13;
         if(var8 != 0L) {
            var13 = class14.field60.method3193(var0, var2, var3, var8);
            int var40 = class31.method387(var8);
            int var41 = var13 & 31;
            int var42 = var13 >> 6 & 3;
            class263 var14;
            if(var1 == 0) {
               class14.field60.method3180(var0, var2, var3);
               var14 = class33.method435(var40, 1650295452);
               if(var14.field3361 != 0) {
                  client.field737[var0].method3617(var2, var3, var41, var42, var14.field3384, 1473004141);
               }
            }

            if(var1 == 1) {
               class14.field60.method3262(var0, var2, var3);
            }

            if(var1 == 2) {
               class14.field60.method3182(var0, var2, var3);
               var14 = class33.method435(var40, 1650295452);
               if(var2 + var14.field3359 > 103 || var3 + var14.field3359 > 103 || var2 + var14.field3360 > 103 || var3 + var14.field3360 > 103) {
                  return;
               }

               if(var14.field3361 != 0) {
                  client.field737[var0].method3635(var2, var3, var14.field3359, var14.field3360, var42, var14.field3384, 1811467744);
               }
            }

            if(var1 == 3) {
               class14.field60.method3183(var0, var2, var3);
               var14 = class33.method435(var40, 1650295452);
               if(var14.field3361 == 1) {
                  client.field737[var0].method3637(var2, var3, (byte)-25);
               }
            }
         }

         if(var4 >= 0) {
            var13 = var0;
            if(var0 < 3 && (class64.field535[1][var2][var3] & 2) == 2) {
               var13 = var0 + 1;
            }

            class142 var43 = class14.field60;
            class181 var15 = client.field737[var0];
            class263 var16 = class33.method435(var4, 1650295452);
            int var17;
            int var18;
            if(var5 != 1 && var5 != 3) {
               var17 = var16.field3359;
               var18 = var16.field3360;
            } else {
               var17 = var16.field3360;
               var18 = var16.field3359;
            }

            int var19;
            int var20;
            if(var17 + var2 <= 104) {
               var19 = (var17 >> 1) + var2;
               var20 = var2 + (var17 + 1 >> 1);
            } else {
               var19 = var2;
               var20 = var2 + 1;
            }

            int var21;
            int var22;
            if(var3 + var18 <= 104) {
               var21 = var3 + (var18 >> 1);
               var22 = var3 + (var18 + 1 >> 1);
            } else {
               var21 = var3;
               var22 = var3 + 1;
            }

            int[][] var23 = class64.field549[var13];
            int var24 = var23[var20][var22] + var23[var19][var21] + var23[var20][var21] + var23[var19][var22] >> 2;
            int var25 = (var2 << 7) + (var17 << 6);
            int var26 = (var3 << 7) + (var18 << 6);
            long var27 = class337.method6337(var2, var3, 2, var16.field3363 == 0, var4, -462754013);
            int var29 = (var5 << 6) + var6;
            if(var16.field3371 == 1) {
               var29 += 256;
            }

            Object var30;
            if(var6 == 22) {
               if(var16.field3367 == -1 && var16.field3385 == null) {
                  var30 = var16.method4639(22, var5, var23, var25, var24, var26, -1410158985);
               } else {
                  var30 = new class102(var4, 22, var5, var13, var2, var3, var16.field3367, true, (class144)null);
               }

               var43.method3162(var0, var2, var3, var24, (class144)var30, var27, var29);
               if(var16.field3361 == 1) {
                  var15.method3615(var2, var3, -88147521);
               }
            } else if(var6 != 10 && var6 != 11) {
               if(var6 >= 12) {
                  if(var16.field3367 == -1 && var16.field3385 == null) {
                     var30 = var16.method4639(var6, var5, var23, var25, var24, var26, 613497415);
                  } else {
                     var30 = new class102(var4, var6, var5, var13, var2, var3, var16.field3367, true, (class144)null);
                  }

                  var43.method3173(var0, var2, var3, var24, 1, 1, (class144)var30, 0, var27, var29);
                  if(var16.field3361 != 0) {
                     var15.method3613(var2, var3, var17, var18, var16.field3384, (byte)2);
                  }
               } else if(var6 == 0) {
                  if(var16.field3367 == -1 && var16.field3385 == null) {
                     var30 = var16.method4639(0, var5, var23, var25, var24, var26, -1072196818);
                  } else {
                     var30 = new class102(var4, 0, var5, var13, var2, var3, var16.field3367, true, (class144)null);
                  }

                  var43.method3269(var0, var2, var3, var24, (class144)var30, (class144)null, class64.field544[var5], 0, var27, var29);
                  if(var16.field3361 != 0) {
                     var15.method3612(var2, var3, var6, var5, var16.field3384, -1240663333);
                  }
               } else if(var6 == 1) {
                  if(var16.field3367 == -1 && var16.field3385 == null) {
                     var30 = var16.method4639(1, var5, var23, var25, var24, var26, -1511713683);
                  } else {
                     var30 = new class102(var4, 1, var5, var13, var2, var3, var16.field3367, true, (class144)null);
                  }

                  var43.method3269(var0, var2, var3, var24, (class144)var30, (class144)null, class64.field542[var5], 0, var27, var29);
                  if(var16.field3361 != 0) {
                     var15.method3612(var2, var3, var6, var5, var16.field3384, -1240663333);
                  }
               } else {
                  int var36;
                  if(var6 == 2) {
                     var36 = var5 + 1 & 3;
                     Object var31;
                     Object var32;
                     if(var16.field3367 == -1 && var16.field3385 == null) {
                        var31 = var16.method4639(2, var5 + 4, var23, var25, var24, var26, 642670532);
                        var32 = var16.method4639(2, var36, var23, var25, var24, var26, 1256401073);
                     } else {
                        var31 = new class102(var4, 2, var5 + 4, var13, var2, var3, var16.field3367, true, (class144)null);
                        var32 = new class102(var4, 2, var36, var13, var2, var3, var16.field3367, true, (class144)null);
                     }

                     var43.method3269(var0, var2, var3, var24, (class144)var31, (class144)var32, class64.field544[var5], class64.field544[var36], var27, var29);
                     if(var16.field3361 != 0) {
                        var15.method3612(var2, var3, var6, var5, var16.field3384, -1240663333);
                     }
                  } else if(var6 == 3) {
                     if(var16.field3367 == -1 && var16.field3385 == null) {
                        var30 = var16.method4639(3, var5, var23, var25, var24, var26, 700752438);
                     } else {
                        var30 = new class102(var4, 3, var5, var13, var2, var3, var16.field3367, true, (class144)null);
                     }

                     var43.method3269(var0, var2, var3, var24, (class144)var30, (class144)null, class64.field542[var5], 0, var27, var29);
                     if(var16.field3361 != 0) {
                        var15.method3612(var2, var3, var6, var5, var16.field3384, -1240663333);
                     }
                  } else if(var6 == 9) {
                     if(var16.field3367 == -1 && var16.field3385 == null) {
                        var30 = var16.method4639(var6, var5, var23, var25, var24, var26, -741172846);
                     } else {
                        var30 = new class102(var4, var6, var5, var13, var2, var3, var16.field3367, true, (class144)null);
                     }

                     var43.method3173(var0, var2, var3, var24, 1, 1, (class144)var30, 0, var27, var29);
                     if(var16.field3361 != 0) {
                        var15.method3613(var2, var3, var17, var18, var16.field3384, (byte)2);
                     }
                  } else if(var6 == 4) {
                     if(var16.field3367 == -1 && var16.field3385 == null) {
                        var30 = var16.method4639(4, var5, var23, var25, var24, var26, 1294361201);
                     } else {
                        var30 = new class102(var4, 4, var5, var13, var2, var3, var16.field3367, true, (class144)null);
                     }

                     var43.method3285(var0, var2, var3, var24, (class144)var30, (class144)null, class64.field544[var5], 0, 0, 0, var27, var29);
                  } else {
                     Object var33;
                     long var37;
                     if(var6 == 5) {
                        var36 = 16;
                        var37 = var43.method3189(var0, var2, var3);
                        if(var37 != 0L) {
                           var36 = class33.method435(class31.method387(var37), 1650295452).field3393;
                        }

                        if(var16.field3367 == -1 && var16.field3385 == null) {
                           var33 = var16.method4639(4, var5, var23, var25, var24, var26, 724032079);
                        } else {
                           var33 = new class102(var4, 4, var5, var13, var2, var3, var16.field3367, true, (class144)null);
                        }

                        var43.method3285(var0, var2, var3, var24, (class144)var33, (class144)null, class64.field544[var5], 0, var36 * class64.field541[var5], var36 * class64.field547[var5], var27, var29);
                     } else if(var6 == 6) {
                        var36 = 8;
                        var37 = var43.method3189(var0, var2, var3);
                        if(0L != var37) {
                           var36 = class33.method435(class31.method387(var37), 1650295452).field3393 / 2;
                        }

                        if(var16.field3367 == -1 && var16.field3385 == null) {
                           var33 = var16.method4639(4, var5 + 4, var23, var25, var24, var26, 557666699);
                        } else {
                           var33 = new class102(var4, 4, var5 + 4, var13, var2, var3, var16.field3367, true, (class144)null);
                        }

                        var43.method3285(var0, var2, var3, var24, (class144)var33, (class144)null, 256, var5, var36 * class64.field546[var5], var36 * class64.field552[var5], var27, var29);
                     } else if(var6 == 7) {
                        int var39 = var5 + 2 & 3;
                        if(var16.field3367 == -1 && var16.field3385 == null) {
                           var30 = var16.method4639(4, var39 + 4, var23, var25, var24, var26, 1904040437);
                        } else {
                           var30 = new class102(var4, 4, var39 + 4, var13, var2, var3, var16.field3367, true, (class144)null);
                        }

                        var43.method3285(var0, var2, var3, var24, (class144)var30, (class144)null, 256, var39, 0, 0, var27, var29);
                     } else if(var6 == 8) {
                        var36 = 8;
                        var37 = var43.method3189(var0, var2, var3);
                        if(var37 != 0L) {
                           var36 = class33.method435(class31.method387(var37), 1650295452).field3393 / 2;
                        }

                        int var35 = var5 + 2 & 3;
                        Object var34;
                        if(var16.field3367 == -1 && var16.field3385 == null) {
                           var33 = var16.method4639(4, var5 + 4, var23, var25, var24, var26, 1251840847);
                           var34 = var16.method4639(4, var35 + 4, var23, var25, var24, var26, -414068875);
                        } else {
                           var33 = new class102(var4, 4, var5 + 4, var13, var2, var3, var16.field3367, true, (class144)null);
                           var34 = new class102(var4, 4, var35 + 4, var13, var2, var3, var16.field3367, true, (class144)null);
                        }

                        var43.method3285(var0, var2, var3, var24, (class144)var33, (class144)var34, 256, var5, var36 * class64.field546[var5], var36 * class64.field552[var5], var27, var29);
                     }
                  }
               }
            } else {
               if(var16.field3367 == -1 && var16.field3385 == null) {
                  var30 = var16.method4639(10, var5, var23, var25, var24, var26, 1873775908);
               } else {
                  var30 = new class102(var4, 10, var5, var13, var2, var3, var16.field3367, true, (class144)null);
               }

               if(var30 != null) {
                  var43.method3173(var0, var2, var3, var24, var17, var18, (class144)var30, var6 == 11?256:0, var27, var29);
               }

               if(var16.field3361 != 0) {
                  var15.method3613(var2, var3, var17, var18, var16.field3384, (byte)2);
               }
            }
         }
      }

   }
}
