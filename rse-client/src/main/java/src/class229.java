package src;

import java.io.DataInputStream;
import java.net.URL;

public class class229 implements class203 {

   public static final class229 field2732 = new class229(0, 0);
   static final class229 field2718 = new class229(1, 0);
   public static final class229 field2728 = new class229(2, 0);
   static final class229 field2719 = new class229(10, 2);
   static final class229 field2739 = new class229(11, 2);
   public static final class229 field2742 = new class229(3, 0);
   public static final class229 field2722 = new class229(9, 2);
   public static final class229 field2740 = new class229(22, 3);
   static final class229 field2723 = new class229(4, 1);
   static final class229 field2724 = new class229(5, 1);
   static final class229 field2721 = new class229(6, 1);
   static final class229 field2726 = new class229(7, 1);
   static final class229 field2730 = new class229(8, 1);
   static final class229 field2734 = new class229(12, 2);
   static final class229 field2729 = new class229(13, 2);
   static final class229 field2720 = new class229(14, 2);
   static final class229 field2731 = new class229(15, 2);
   static final class229 field2725 = new class229(16, 2);
   static final class229 field2738 = new class229(17, 2);
   static final class229 field2737 = new class229(18, 2);
   static final class229 field2735 = new class229(19, 2);
   static final class229 field2736 = new class229(20, 2);
   static final class229 field2733 = new class229(21, 2);
   public final int field2741;


   class229(int var1, int var2) {
      this.field2741 = var1;
   }

   public int vmethod6149(byte var1) {
      return this.field2741;
   }

   public static void method4189(String var0, Throwable var1, int var2) {
      try {
         String var3 = "";
         if(var1 != null) {
            var3 = class246.method4369(var1, -753208672);
         }

         if(var0 != null) {
            if(var1 != null) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         System.out.println("Error: " + var3);
         var3 = var3.replace(':', '.');
         var3 = var3.replace('@', '_');
         var3 = var3.replace('&', '_');
         var3 = var3.replace('#', '_');
         if(class350.field4072 == null) {
            return;
         }

         URL var4 = new URL(class350.field4072.getCodeBase(), "clienterror.ws?c=" + class350.field4073 + "&u=" + class350.field4069 + "&v1=" + class175.field2039 + "&v2=" + class175.field2041 + "&ct=" + class350.field4070 + "&e=" + var3);
         DataInputStream var5 = new DataInputStream(var4.openStream());
         var5.read();
         var5.close();
      } catch (Exception var6) {
         ;
      }

   }

   static boolean method4188(long var0) {
      return (int)(var0 >>> 16 & 1L) == 1;
   }

   static final void method4185(class226[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = 0; var9 < var0.length; ++var9) {
         class226 var10 = var0[var9];
         if(var10 != null && var10.field2586 == var1 && (!var10.field2566 || var10.field2569 == 0 || var10.field2670 || class71.method1283(var10, -1943010336) != 0 || var10 == client.field854 || var10.field2571 == 1338)) {
            if(var10.field2566) {
               if(class30.method356(var10, -1425924887)) {
                  continue;
               }
            } else if(var10.field2569 == 0 && var10 != class9.field52 && class30.method356(var10, -1425924887)) {
               continue;
            }

            int var11 = var10.field2580 + var6;
            int var12 = var7 + var10.field2653;
            int var13;
            int var14;
            int var15;
            int var16;
            int var18;
            int var19;
            if(var10.field2569 == 2) {
               var13 = var2;
               var14 = var3;
               var15 = var4;
               var16 = var5;
            } else {
               int var17;
               if(var10.field2569 == 9) {
                  var17 = var11;
                  var18 = var12;
                  var19 = var11 + var10.field2582;
                  int var20 = var12 + var10.field2642;
                  if(var19 < var11) {
                     var17 = var19;
                     var19 = var11;
                  }

                  if(var20 < var12) {
                     var18 = var20;
                     var20 = var12;
                  }

                  ++var19;
                  ++var20;
                  var13 = var17 > var2?var17:var2;
                  var14 = var18 > var3?var18:var3;
                  var15 = var19 < var4?var19:var4;
                  var16 = var20 < var5?var20:var5;
               } else {
                  var17 = var11 + var10.field2582;
                  var18 = var12 + var10.field2642;
                  var13 = var11 > var2?var11:var2;
                  var14 = var12 > var3?var12:var3;
                  var15 = var17 < var4?var17:var4;
                  var16 = var18 < var5?var18:var5;
               }
            }

            if(var10 == client.field853) {
               client.field861 = true;
               client.field834 = var11;
               client.field863 = var12;
            }

            boolean var33 = false;
            if(var10.field2641) {
               switch(client.field842) {
               case 0:
                  var33 = true;
               case 1:
               default:
                  break;
               case 2:
                  if(client.field843 == var10.field2567 >>> 16) {
                     var33 = true;
                  }
                  break;
               case 3:
                  if(var10.field2567 == client.field843) {
                     var33 = true;
                  }
               }
            }

            if(var33 || !var10.field2566 || var13 < var15 && var14 < var16) {
               if(var10.field2566) {
                  class71 var27;
                  if(var10.field2707) {
                     if(class63.field517 >= var13 && class63.field518 >= var14 && class63.field517 < var15 && class63.field518 < var16) {
                        for(var27 = (class71)client.field787.method4931(); var27 != null; var27 = (class71)client.field787.method4949()) {
                           if(var27.field601) {
                              var27.method3657();
                              var27.field612.field2677 = false;
                           }
                        }

                        if(class173.field2022 == 0) {
                           client.field853 = null;
                           client.field854 = null;
                        }

                        if(!client.field816) {
                           class135.method2946((byte)43);
                        }
                     }
                  } else if(var10.field2708 && class63.field517 >= var13 && class63.field518 >= var14 && class63.field517 < var15 && class63.field518 < var16) {
                     for(var27 = (class71)client.field787.method4931(); var27 != null; var27 = (class71)client.field787.method4949()) {
                        if(var27.field601 && var27.field612.field2598 == var27.field602) {
                           var27.method3657();
                        }
                     }
                  }
               }

               var18 = class63.field517;
               var19 = class63.field518;
               if(class63.field524 != 0) {
                  var18 = class63.field525;
                  var19 = class63.field520;
               }

               boolean var34 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
               if(var10.field2571 == 1337) {
                  if(!client.field701 && !client.field816 && var34) {
                     class31.method385(var18, var19, var13, var14, -1807339500);
                  }
               } else if(var10.field2571 == 1338) {
                  class3.method60(var10, var11, var12, 1782995068);
               } else {
                  if(var10.field2571 == 1400) {
                     class21.field121.method6382(class63.field517, class63.field518, var34, var11, var12, var10.field2582, var10.field2642, -1392973406);
                  }

                  if(!client.field816 && var34) {
                     if(var10.field2571 == 1400) {
                        class21.field121.method6426(var11, var12, var10.field2582, var10.field2642, var18, var19, (byte)91);
                     } else {
                        class26.method288(var10, var18 - var11, var19 - var12, -1189563111);
                     }
                  }

                  boolean var22;
                  int var24;
                  if(var33) {
                     for(int var21 = 0; var21 < var10.field2555.length; ++var21) {
                        var22 = false;
                        boolean var23 = false;
                        if(!var22 && var10.field2555[var21] != null) {
                           for(var24 = 0; var24 < var10.field2555[var21].length; ++var24) {
                              boolean var25 = false;
                              if(var10.field2706 != null) {
                                 var25 = class54.field426[var10.field2555[var21][var24]];
                              }

                              if(class100.method2308(var10.field2555[var21][var24], 803924766) || var25) {
                                 var22 = true;
                                 if(var10.field2706 != null && var10.field2706[var21] > client.field689) {
                                    break;
                                 }

                                 byte var26 = var10.field2643[var21][var24];
                                 if(var26 == 0 || ((var26 & 8) == 0 || !class54.field426[86] && !class54.field426[82] && !class54.field426[81]) && ((var26 & 2) == 0 || class54.field426[86]) && ((var26 & 1) == 0 || class54.field426[82]) && ((var26 & 4) == 0 || class54.field426[81])) {
                                    var23 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if(var23) {
                           if(var21 < 10) {
                              class192.method3667(var21 + 1, var10.field2567, var10.field2709, var10.field2704, "", (byte)10);
                           } else if(var21 == 10) {
                              class18.method210((byte)81);
                              class48.method815(var10.field2567, var10.field2709, class31.method388(class71.method1283(var10, -1933929812), -1866970355), var10.field2704, (byte)60);
                              client.field838 = class319.method5931(var10, (byte)19);
                              if(client.field838 == null) {
                                 client.field838 = "null";
                              }

                              client.field839 = var10.field2593 + class297.method5314(16777215, -26721514);
                           }

                           var24 = var10.field2644[var21];
                           if(var10.field2706 == null) {
                              var10.field2706 = new int[var10.field2555.length];
                           }

                           if(var10.field2695 == null) {
                              var10.field2695 = new int[var10.field2555.length];
                           }

                           if(var24 != 0) {
                              if(var10.field2706[var21] == 0) {
                                 var10.field2706[var21] = var24 + client.field689 + var10.field2695[var21];
                              } else {
                                 var10.field2706[var21] = var24 + client.field689;
                              }
                           } else {
                              var10.field2706[var21] = Integer.MAX_VALUE;
                           }
                        }

                        if(!var22 && var10.field2706 != null) {
                           var10.field2706[var21] = 0;
                        }
                     }
                  }

                  if(var10.field2566) {
                     if(class63.field517 >= var13 && class63.field518 >= var14 && class63.field517 < var15 && class63.field518 < var16) {
                        var34 = true;
                     } else {
                        var34 = false;
                     }

                     boolean var35 = false;
                     if((class63.field521 == 1 || !class217.field2506 && class63.field521 == 4) && var34) {
                        var35 = true;
                     }

                     var22 = false;
                     if((class63.field524 == 1 || !class217.field2506 && class63.field524 == 4) && class63.field525 >= var13 && class63.field520 >= var14 && class63.field525 < var15 && class63.field520 < var16) {
                        var22 = true;
                     }

                     if(var22) {
                        class75.method1380(var10, class63.field525 - var11, class63.field520 - var12, (byte)2);
                     }

                     if(var10.field2571 == 1400) {
                        class21.field121.method6383(var18, var19, var34 & var35, var34 & var22, 2122785833);
                     }

                     if(client.field853 != null && var10 != client.field853 && var34 && class19.method218(class71.method1283(var10, -1681630246), -1968739504)) {
                        client.field857 = var10;
                     }

                     if(var10 == client.field854) {
                        client.field732 = true;
                        client.field859 = var11;
                        client.field881 = var12;
                     }

                     if(var10.field2670) {
                        class71 var28;
                        if(var34 && client.field878 != 0 && var10.field2598 != null) {
                           var28 = new class71();
                           var28.field601 = true;
                           var28.field612 = var10;
                           var28.field600 = client.field878;
                           var28.field602 = var10.field2598;
                           client.field787.method4952(var28);
                        }

                        if(client.field853 != null || class236.field3082 != null || client.field816) {
                           var22 = false;
                           var35 = false;
                           var34 = false;
                        }

                        if(!var10.field2581 && var22) {
                           var10.field2581 = true;
                           if(var10.field2655 != null) {
                              var28 = new class71();
                              var28.field601 = true;
                              var28.field612 = var10;
                              var28.field603 = class63.field525 - var11;
                              var28.field600 = class63.field520 - var12;
                              var28.field602 = var10.field2655;
                              client.field787.method4952(var28);
                           }
                        }

                        if(var10.field2581 && var35 && var10.field2656 != null) {
                           var28 = new class71();
                           var28.field601 = true;
                           var28.field612 = var10;
                           var28.field603 = class63.field517 - var11;
                           var28.field600 = class63.field518 - var12;
                           var28.field602 = var10.field2656;
                           client.field787.method4952(var28);
                        }

                        if(var10.field2581 && !var35) {
                           var10.field2581 = false;
                           if(var10.field2577 != null) {
                              var28 = new class71();
                              var28.field601 = true;
                              var28.field612 = var10;
                              var28.field603 = class63.field517 - var11;
                              var28.field600 = class63.field518 - var12;
                              var28.field602 = var10.field2577;
                              client.field919.method4952(var28);
                           }
                        }

                        if(var35 && var10.field2668 != null) {
                           var28 = new class71();
                           var28.field601 = true;
                           var28.field612 = var10;
                           var28.field603 = class63.field517 - var11;
                           var28.field600 = class63.field518 - var12;
                           var28.field602 = var10.field2668;
                           client.field787.method4952(var28);
                        }

                        if(!var10.field2677 && var34) {
                           var10.field2677 = true;
                           if(var10.field2680 != null) {
                              var28 = new class71();
                              var28.field601 = true;
                              var28.field612 = var10;
                              var28.field603 = class63.field517 - var11;
                              var28.field600 = class63.field518 - var12;
                              var28.field602 = var10.field2680;
                              client.field787.method4952(var28);
                           }
                        }

                        if(var10.field2677 && var34 && var10.field2557 != null) {
                           var28 = new class71();
                           var28.field601 = true;
                           var28.field612 = var10;
                           var28.field603 = class63.field517 - var11;
                           var28.field600 = class63.field518 - var12;
                           var28.field602 = var10.field2557;
                           client.field787.method4952(var28);
                        }

                        if(var10.field2677 && !var34) {
                           var10.field2677 = false;
                           if(var10.field2661 != null) {
                              var28 = new class71();
                              var28.field601 = true;
                              var28.field612 = var10;
                              var28.field603 = class63.field517 - var11;
                              var28.field600 = class63.field518 - var12;
                              var28.field602 = var10.field2661;
                              client.field919.method4952(var28);
                           }
                        }

                        if(var10.field2672 != null) {
                           var28 = new class71();
                           var28.field612 = var10;
                           var28.field602 = var10.field2672;
                           client.field727.method4952(var28);
                        }

                        class71 var31;
                        int var36;
                        int var37;
                        if(var10.field2666 != null && client.field772 > var10.field2701) {
                           if(var10.field2667 != null && client.field772 - var10.field2701 <= 32) {
                              label867:
                              for(var36 = var10.field2701; var36 < client.field772; ++var36) {
                                 var24 = client.field866[var36 & 31];

                                 for(var37 = 0; var37 < var10.field2667.length; ++var37) {
                                    if(var24 == var10.field2667[var37]) {
                                       var31 = new class71();
                                       var31.field612 = var10;
                                       var31.field602 = var10.field2666;
                                       client.field787.method4952(var31);
                                       break label867;
                                    }
                                 }
                              }
                           } else {
                              var28 = new class71();
                              var28.field612 = var10;
                              var28.field602 = var10.field2666;
                              client.field787.method4952(var28);
                           }

                           var10.field2701 = client.field772;
                        }

                        if(var10.field2632 != null && client.field869 > var10.field2620) {
                           if(var10.field2669 != null && client.field869 - var10.field2620 <= 32) {
                              label848:
                              for(var36 = var10.field2620; var36 < client.field869; ++var36) {
                                 var24 = client.field868[var36 & 31];

                                 for(var37 = 0; var37 < var10.field2669.length; ++var37) {
                                    if(var24 == var10.field2669[var37]) {
                                       var31 = new class71();
                                       var31.field612 = var10;
                                       var31.field602 = var10.field2632;
                                       client.field787.method4952(var31);
                                       break label848;
                                    }
                                 }
                              }
                           } else {
                              var28 = new class71();
                              var28.field612 = var10;
                              var28.field602 = var10.field2632;
                              client.field787.method4952(var28);
                           }

                           var10.field2620 = client.field869;
                        }

                        if(var10.field2633 != null && client.field792 > var10.field2588) {
                           if(var10.field2568 != null && client.field792 - var10.field2588 <= 32) {
                              label829:
                              for(var36 = var10.field2588; var36 < client.field792; ++var36) {
                                 var24 = client.field870[var36 & 31];

                                 for(var37 = 0; var37 < var10.field2568.length; ++var37) {
                                    if(var24 == var10.field2568[var37]) {
                                       var31 = new class71();
                                       var31.field612 = var10;
                                       var31.field602 = var10.field2633;
                                       client.field787.method4952(var31);
                                       break label829;
                                    }
                                 }
                              }
                           } else {
                              var28 = new class71();
                              var28.field612 = var10;
                              var28.field602 = var10.field2633;
                              client.field787.method4952(var28);
                           }

                           var10.field2588 = client.field792;
                        }

                        if(client.field903 > var10.field2700 && var10.field2675 != null) {
                           var28 = new class71();
                           var28.field612 = var10;
                           var28.field602 = var10.field2675;
                           client.field787.method4952(var28);
                        }

                        if(client.field873 > var10.field2700 && var10.field2591 != null) {
                           var28 = new class71();
                           var28.field612 = var10;
                           var28.field602 = var10.field2591;
                           client.field787.method4952(var28);
                        }

                        if(client.field874 > var10.field2700 && var10.field2678 != null) {
                           var28 = new class71();
                           var28.field612 = var10;
                           var28.field602 = var10.field2678;
                           client.field787.method4952(var28);
                        }

                        if(client.field774 > var10.field2700 && var10.field2553 != null) {
                           var28 = new class71();
                           var28.field612 = var10;
                           var28.field602 = var10.field2553;
                           client.field787.method4952(var28);
                        }

                        if(client.field726 > var10.field2700 && var10.field2691 != null) {
                           var28 = new class71();
                           var28.field612 = var10;
                           var28.field602 = var10.field2691;
                           client.field787.method4952(var28);
                        }

                        if(client.field877 > var10.field2700 && var10.field2679 != null) {
                           var28 = new class71();
                           var28.field612 = var10;
                           var28.field602 = var10.field2679;
                           client.field787.method4952(var28);
                        }

                        var10.field2700 = client.field865;
                        if(var10.field2676 != null) {
                           for(var36 = 0; var36 < client.field901; ++var36) {
                              class71 var32 = new class71();
                              var32.field612 = var10;
                              var32.field609 = client.field872[var36];
                              var32.field608 = client.field902[var36];
                              var32.field602 = var10.field2676;
                              client.field787.method4952(var32);
                           }
                        }
                     }
                  }

                  if(!var10.field2566) {
                     if(client.field853 != null || class236.field3082 != null || client.field816) {
                        continue;
                     }

                     if((var10.field2688 >= 0 || var10.field2705 != 0) && class63.field517 >= var13 && class63.field518 >= var14 && class63.field517 < var15 && class63.field518 < var16) {
                        if(var10.field2688 >= 0) {
                           class9.field52 = var0[var10.field2688];
                        } else {
                           class9.field52 = var10;
                        }
                     }

                     if(var10.field2569 == 8 && class63.field517 >= var13 && class63.field518 >= var14 && class63.field517 < var15 && class63.field518 < var16) {
                        class199.field2368 = var10;
                     }

                     if(var10.field2597 > var10.field2642) {
                        class137.method3078(var10, var11 + var10.field2582, var12, var10.field2642, var10.field2597, class63.field517, class63.field518, -1829231425);
                     }
                  }

                  if(var10.field2569 == 0) {
                     method4185(var0, var10.field2567, var13, var14, var15, var16, var11 - var10.field2646, var12 - var10.field2589, 1119394969);
                     if(var10.field2697 != null) {
                        method4185(var10.field2697, var10.field2567, var13, var14, var15, var16, var11 - var10.field2646, var12 - var10.field2589, 1988903741);
                     }

                     class70 var29 = (class70)client.field841.method6010((long)var10.field2567);
                     if(var29 != null) {
                        if(var29.field593 == 0 && class63.field517 >= var13 && class63.field518 >= var14 && class63.field517 < var15 && class63.field518 < var16 && !client.field816) {
                           for(class71 var30 = (class71)client.field787.method4931(); var30 != null; var30 = (class71)client.field787.method4949()) {
                              if(var30.field601) {
                                 var30.method3657();
                                 var30.field612.field2677 = false;
                              }
                           }

                           if(class173.field2022 == 0) {
                              client.field853 = null;
                              client.field854 = null;
                           }

                           if(!client.field816) {
                              class135.method2946((byte)63);
                           }
                        }

                        class2.method35(var29.field599, var13, var14, var15, var16, var11, var12, (byte)76);
                     }
                  }
               }
            }
         }
      }

   }
}
