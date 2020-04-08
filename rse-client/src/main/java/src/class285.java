package src;

public class class285 extends class286 {

   static class199 field3597;
   final class347 field3596;


   public class285(class347 var1) {
      super(400);
      this.field3596 = var1;
   }

   class283 vmethod5269(int var1) {
      return new class287();
   }

   class283[] vmethod5281(int var1, int var2) {
      return new class287[var1];
   }

   public void method5112(class309 var1, int var2, int var3) {
      while(true) {
         if(var1.field3710 < var2) {
            int var4 = var1.readUnsignedByte((byte)70);
            boolean var5 = (var4 & 1) == 1;
            class292 var6 = new class292(var1.method5667(-1277773251), this.field3596);
            class292 var7 = new class292(var1.method5667(-1026122032), this.field3596);
            var1.method5667(-1229873956);
            if(var6 != null && var6.method5239(-1005152425)) {
               class287 var8 = (class287)this.method5119(var6, -678771148);
               if(var5) {
                  class287 var9 = (class287)this.method5119(var7, -678771148);
                  if(var9 != null && var9 != var8) {
                     if(var8 != null) {
                        this.method5195(var9, -75903094);
                     } else {
                        var8 = var9;
                     }
                  }
               }

               if(var8 != null) {
                  this.method5127(var8, var6, var7, 577990406);
                  continue;
               }

               if(this.method5115((byte)4) < 400) {
                  int var10 = this.method5115((byte)4);
                  var8 = (class287)this.method5184(var6, var7, (byte)50);
                  var8.field3608 = var10;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }

   public static final void method5111(String var0, String var1, int var2, int var3, int var4, int var5, byte var6) {
      class65.method1244(var0, var1, var2, var3, var4, var5, false, -1721324405);
   }

   public static class259 method5110(int var0, byte var1) {
      class259 var2 = (class259)class259.field3295.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class259.field3297.method4224(11, var0, (byte)-92);
         var2 = new class259();
         if(var3 != null) {
            var2.method4557(new class309(var3), 1593854390);
         }

         var2.method4547((byte)65);
         class259.field3295.method3424(var2, (long)var0);
         return var2;
      }
   }

   static int method5106(int var0, class101 var1, boolean var2, int var3) {
      int var4;
      if(var0 == 6600) {
         var4 = class71.field610;
         int var10 = (class311.field3717.field983 >> 7) + class69.field590 * 731242929;
         int var6 = (class311.field3717.field973 >> 7) + class89.field1152 * 1825982697;
         class13.method133(637526899).method6487(var4, var10, var6, true, 1519014469);
         return 1;
      } else {
         class35 var12;
         if(var0 == 6601) {
            var4 = class85.field1115[--class85.field1117];
            String var17 = "";
            var12 = class13.method133(-951009708).method6434(var4, -982696781);
            if(var12 != null) {
               var17 = var12.method450(1379257785);
            }

            class85.field1118[++class85.field1119 - 1] = var17;
            return 1;
         } else if(var0 == 6602) {
            var4 = class85.field1115[--class85.field1117];
            class13.method133(350065660).method6465(var4, -513513568);
            return 1;
         } else if(var0 == 6603) {
            class85.field1115[++class85.field1117 - 1] = class13.method133(-1537482519).method6405(600440321);
            return 1;
         } else if(var0 == 6604) {
            var4 = class85.field1115[--class85.field1117];
            class13.method133(979888618).method6402(var4, 1466740410);
            return 1;
         } else if(var0 == 6605) {
            class85.field1115[++class85.field1117 - 1] = class13.method133(109480244).method6407(-1191452508)?1:0;
            return 1;
         } else {
            class222 var16;
            if(var0 == 6606) {
               var16 = new class222(class85.field1115[--class85.field1117]);
               class13.method133(-967491120).method6437(var16.field2532, var16.field2529, 441252120);
               return 1;
            } else if(var0 == 6607) {
               var16 = new class222(class85.field1115[--class85.field1117]);
               class13.method133(422229514).method6458(var16.field2532, var16.field2529, (byte)103);
               return 1;
            } else if(var0 == 6608) {
               var16 = new class222(class85.field1115[--class85.field1117]);
               class13.method133(150038784).method6410(var16.field2528, var16.field2532, var16.field2529, 991204183);
               return 1;
            } else if(var0 == 6609) {
               var16 = new class222(class85.field1115[--class85.field1117]);
               class13.method133(788416428).method6411(var16.field2528, var16.field2532, var16.field2529, (byte)0);
               return 1;
            } else if(var0 == 6610) {
               class85.field1115[++class85.field1117 - 1] = class13.method133(-2059906105).method6412((byte)-12);
               class85.field1115[++class85.field1117 - 1] = class13.method133(-1650861322).method6408(-1454836009);
               return 1;
            } else {
               class35 var14;
               if(var0 == 6611) {
                  var4 = class85.field1115[--class85.field1117];
                  var14 = class13.method133(-1546174939).method6434(var4, 133385064);
                  if(var14 == null) {
                     class85.field1115[++class85.field1117 - 1] = 0;
                  } else {
                     class85.field1115[++class85.field1117 - 1] = var14.method460(710873415).method4043(-1387222023);
                  }

                  return 1;
               } else if(var0 == 6612) {
                  var4 = class85.field1115[--class85.field1117];
                  var14 = class13.method133(372615156).method6434(var4, -1710478825);
                  if(var14 == null) {
                     class85.field1115[++class85.field1117 - 1] = 0;
                     class85.field1115[++class85.field1117 - 1] = 0;
                  } else {
                     class85.field1115[++class85.field1117 - 1] = (var14.method454(-1380383839) - var14.method453(1003198197) + 1) * 64;
                     class85.field1115[++class85.field1117 - 1] = (var14.method442(851351546) - var14.method439(465541585) + 1) * 64;
                  }

                  return 1;
               } else if(var0 == 6613) {
                  var4 = class85.field1115[--class85.field1117];
                  var14 = class13.method133(1057966564).method6434(var4, 616434110);
                  if(var14 == null) {
                     class85.field1115[++class85.field1117 - 1] = 0;
                     class85.field1115[++class85.field1117 - 1] = 0;
                     class85.field1115[++class85.field1117 - 1] = 0;
                     class85.field1115[++class85.field1117 - 1] = 0;
                  } else {
                     class85.field1115[++class85.field1117 - 1] = var14.method453(1003198197) * 64;
                     class85.field1115[++class85.field1117 - 1] = var14.method439(99912402) * 64;
                     class85.field1115[++class85.field1117 - 1] = var14.method454(529784978) * 64 + 64 - 1;
                     class85.field1115[++class85.field1117 - 1] = var14.method442(-2571215) * 64 + 64 - 1;
                  }

                  return 1;
               } else if(var0 == 6614) {
                  var4 = class85.field1115[--class85.field1117];
                  var14 = class13.method133(328816482).method6434(var4, 268023740);
                  if(var14 == null) {
                     class85.field1115[++class85.field1117 - 1] = -1;
                  } else {
                     class85.field1115[++class85.field1117 - 1] = var14.method452(2036158074);
                  }

                  return 1;
               } else if(var0 == 6615) {
                  var16 = class13.method133(-164683946).method6414((byte)-24);
                  if(var16 == null) {
                     class85.field1115[++class85.field1117 - 1] = -1;
                     class85.field1115[++class85.field1117 - 1] = -1;
                  } else {
                     class85.field1115[++class85.field1117 - 1] = var16.field2532;
                     class85.field1115[++class85.field1117 - 1] = var16.field2529;
                  }

                  return 1;
               } else if(var0 == 6616) {
                  class85.field1115[++class85.field1117 - 1] = class13.method133(696246440).method6393(583895693);
                  return 1;
               } else if(var0 == 6617) {
                  var16 = new class222(class85.field1115[--class85.field1117]);
                  var14 = class13.method133(-1129471448).method6530(683414686);
                  if(var14 == null) {
                     class85.field1115[++class85.field1117 - 1] = -1;
                     class85.field1115[++class85.field1117 - 1] = -1;
                     return 1;
                  } else {
                     int[] var15 = var14.method444(var16.field2528, var16.field2532, var16.field2529, (byte)-58);
                     if(var15 == null) {
                        class85.field1115[++class85.field1117 - 1] = -1;
                        class85.field1115[++class85.field1117 - 1] = -1;
                     } else {
                        class85.field1115[++class85.field1117 - 1] = var15[0];
                        class85.field1115[++class85.field1117 - 1] = var15[1];
                     }

                     return 1;
                  }
               } else {
                  class222 var8;
                  if(var0 == 6618) {
                     var16 = new class222(class85.field1115[--class85.field1117]);
                     var14 = class13.method133(215642464).method6530(1790415712);
                     if(var14 == null) {
                        class85.field1115[++class85.field1117 - 1] = -1;
                        class85.field1115[++class85.field1117 - 1] = -1;
                        return 1;
                     } else {
                        var8 = var14.method456(var16.field2532, var16.field2529, (byte)-127);
                        if(var8 == null) {
                           class85.field1115[++class85.field1117 - 1] = -1;
                        } else {
                           class85.field1115[++class85.field1117 - 1] = var8.method4043(-817744022);
                        }

                        return 1;
                     }
                  } else {
                     class222 var13;
                     if(var0 == 6619) {
                        class85.field1117 -= 2;
                        var4 = class85.field1115[class85.field1117];
                        var13 = new class222(class85.field1115[class85.field1117 + 1]);
                        class3.method57(var4, var13, false, -728814712);
                        return 1;
                     } else if(var0 == 6620) {
                        class85.field1117 -= 2;
                        var4 = class85.field1115[class85.field1117];
                        var13 = new class222(class85.field1115[class85.field1117 + 1]);
                        class3.method57(var4, var13, true, 1829961249);
                        return 1;
                     } else if(var0 == 6621) {
                        class85.field1117 -= 2;
                        var4 = class85.field1115[class85.field1117];
                        var13 = new class222(class85.field1115[class85.field1117 + 1]);
                        var12 = class13.method133(307986569).method6434(var4, 1043587804);
                        if(var12 == null) {
                           class85.field1115[++class85.field1117 - 1] = 0;
                           return 1;
                        } else {
                           class85.field1115[++class85.field1117 - 1] = var12.method468(var13.field2528, var13.field2532, var13.field2529, (byte)-9)?1:0;
                           return 1;
                        }
                     } else if(var0 == 6622) {
                        class85.field1115[++class85.field1117 - 1] = class13.method133(-829698642).method6415((byte)-5);
                        class85.field1115[++class85.field1117 - 1] = class13.method133(-1160044220).method6416(484191109);
                        return 1;
                     } else if(var0 == 6623) {
                        var16 = new class222(class85.field1115[--class85.field1117]);
                        var14 = class13.method133(-1712012197).method6390(var16.field2528, var16.field2532, var16.field2529, 1872957167);
                        if(var14 == null) {
                           class85.field1115[++class85.field1117 - 1] = -1;
                        } else {
                           class85.field1115[++class85.field1117 - 1] = var14.method441((byte)39);
                        }

                        return 1;
                     } else if(var0 == 6624) {
                        class13.method133(99802773).method6417(class85.field1115[--class85.field1117], (byte)-4);
                        return 1;
                     } else if(var0 == 6625) {
                        class13.method133(-1216748628).method6398(-1765651870);
                        return 1;
                     } else if(var0 == 6626) {
                        class13.method133(-615224335).method6582(class85.field1115[--class85.field1117], -544500674);
                        return 1;
                     } else if(var0 == 6627) {
                        class13.method133(-1315786944).method6420(1325127509);
                        return 1;
                     } else {
                        boolean var11;
                        if(var0 == 6628) {
                           var11 = class85.field1115[--class85.field1117] == 1;
                           class13.method133(982002054).method6421(var11, 2030274031);
                           return 1;
                        } else if(var0 == 6629) {
                           var4 = class85.field1115[--class85.field1117];
                           class13.method133(562041959).method6422(var4, -843738086);
                           return 1;
                        } else if(var0 == 6630) {
                           var4 = class85.field1115[--class85.field1117];
                           class13.method133(1129983516).method6423(var4, 2123087925);
                           return 1;
                        } else if(var0 == 6631) {
                           class13.method133(922738304).method6418(2104531068);
                           return 1;
                        } else if(var0 == 6632) {
                           var11 = class85.field1115[--class85.field1117] == 1;
                           class13.method133(-445296247).method6395(var11, 560446249);
                           return 1;
                        } else {
                           boolean var5;
                           if(var0 == 6633) {
                              class85.field1117 -= 2;
                              var4 = class85.field1115[class85.field1117];
                              var5 = class85.field1115[class85.field1117 + 1] == 1;
                              class13.method133(375146445).method6491(var4, var5, -2066473112);
                              return 1;
                           } else if(var0 == 6634) {
                              class85.field1117 -= 2;
                              var4 = class85.field1115[class85.field1117];
                              var5 = class85.field1115[class85.field1117 + 1] == 1;
                              class13.method133(-670430187).method6424(var4, var5, 741156816);
                              return 1;
                           } else if(var0 == 6635) {
                              class85.field1115[++class85.field1117 - 1] = class13.method133(47105176).method6463(149249835)?1:0;
                              return 1;
                           } else if(var0 == 6636) {
                              var4 = class85.field1115[--class85.field1117];
                              class85.field1115[++class85.field1117 - 1] = class13.method133(-1970563861).method6429(var4, 1744055471)?1:0;
                              return 1;
                           } else if(var0 == 6637) {
                              var4 = class85.field1115[--class85.field1117];
                              class85.field1115[++class85.field1117 - 1] = class13.method133(731526310).method6430(var4, (short)-18946)?1:0;
                              return 1;
                           } else if(var0 == 6638) {
                              class85.field1117 -= 2;
                              var4 = class85.field1115[class85.field1117];
                              var13 = new class222(class85.field1115[class85.field1117 + 1]);
                              var8 = class13.method133(472146290).method6433(var4, var13, (byte)32);
                              if(var8 == null) {
                                 class85.field1115[++class85.field1117 - 1] = -1;
                              } else {
                                 class85.field1115[++class85.field1117 - 1] = var8.method4043(-265438217);
                              }

                              return 1;
                           } else {
                              class43 var9;
                              if(var0 == 6639) {
                                 var9 = class13.method133(1046183871).method6435(-295029476);
                                 if(var9 == null) {
                                    class85.field1115[++class85.field1117 - 1] = -1;
                                    class85.field1115[++class85.field1117 - 1] = -1;
                                 } else {
                                    class85.field1115[++class85.field1117 - 1] = var9.vmethod685((byte)69);
                                    class85.field1115[++class85.field1117 - 1] = var9.field326.method4043(-1524721459);
                                 }

                                 return 1;
                              } else if(var0 == 6640) {
                                 var9 = class13.method133(-311929143).method6436(-528069180);
                                 if(var9 == null) {
                                    class85.field1115[++class85.field1117 - 1] = -1;
                                    class85.field1115[++class85.field1117 - 1] = -1;
                                 } else {
                                    class85.field1115[++class85.field1117 - 1] = var9.vmethod685((byte)110);
                                    class85.field1115[++class85.field1117 - 1] = var9.field326.method4043(-1483067967);
                                 }

                                 return 1;
                              } else {
                                 class251 var7;
                                 if(var0 == 6693) {
                                    var4 = class85.field1115[--class85.field1117];
                                    var7 = class25.method279(var4, -2010108812);
                                    if(var7.field3215 == null) {
                                       class85.field1118[++class85.field1119 - 1] = "";
                                    } else {
                                       class85.field1118[++class85.field1119 - 1] = var7.field3215;
                                    }

                                    return 1;
                                 } else if(var0 == 6694) {
                                    var4 = class85.field1115[--class85.field1117];
                                    var7 = class25.method279(var4, -50467814);
                                    class85.field1115[++class85.field1117 - 1] = var7.field3217;
                                    return 1;
                                 } else if(var0 == 6695) {
                                    var4 = class85.field1115[--class85.field1117];
                                    var7 = class25.method279(var4, 1972559064);
                                    if(var7 == null) {
                                       class85.field1115[++class85.field1117 - 1] = -1;
                                    } else {
                                       class85.field1115[++class85.field1117 - 1] = var7.field3213;
                                    }

                                    return 1;
                                 } else if(var0 == 6696) {
                                    var4 = class85.field1115[--class85.field1117];
                                    var7 = class25.method279(var4, -1393130248);
                                    if(var7 == null) {
                                       class85.field1115[++class85.field1117 - 1] = -1;
                                    } else {
                                       class85.field1115[++class85.field1117 - 1] = var7.field3224;
                                    }

                                    return 1;
                                 } else if(var0 == 6697) {
                                    class85.field1115[++class85.field1117 - 1] = class96.field1256.field391;
                                    return 1;
                                 } else if(var0 == 6698) {
                                    class85.field1115[++class85.field1117 - 1] = class96.field1256.field388.method4043(-786399252);
                                    return 1;
                                 } else if(var0 == 6699) {
                                    class85.field1115[++class85.field1117 - 1] = class96.field1256.field385.method4043(-487498941);
                                    return 1;
                                 } else {
                                    return 2;
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
   }
}
