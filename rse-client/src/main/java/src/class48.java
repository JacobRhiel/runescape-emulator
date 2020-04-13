package src;

import java.io.IOException;

public class class48 extends class30 {

   static int field376;
   int field375;
   int field378;
   int field374;
   int field377;


   int method784(int var1) {
      return this.field374;
   }

   int method789(int var1) {
      return this.field377;
   }

   int method786(byte var1) {
      return this.field375;
   }

   void vmethod806(class309 var1, byte var2) {
      super.field200 = Math.min(super.field200, 4);
      super.field204 = new short[1][64][64];
      super.field196 = new short[super.field200][64][64];
      super.field205 = new byte[super.field200][64][64];
      super.field206 = new byte[super.field200][64][64];
      super.field207 = new class34[super.field200][64][64][];
      int var3 = var1.readUnsignedByte((byte)45);
      if(var3 != class39.field297.field298) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.readUnsignedByte((byte)16);
         int var5 = var1.readUnsignedByte((byte)72);
         int var6 = var1.readUnsignedByte((byte)94);
         int var7 = var1.readUnsignedByte((byte)60);
         if(var4 == super.field197 && var5 == super.field198 && var6 == this.field374 && var7 == this.field377) {
            for(int var8 = 0; var8 < 8; ++var8) {
               for(int var9 = 0; var9 < 8; ++var9) {
                  this.method354(var8 + this.field374 * 8, var9 + this.field377 * 8, var1, (byte)117);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   void method801(class309 var1, byte var2) {
      int var3 = var1.readUnsignedByte((byte)14);
      if(var3 != class40.field303.field310) {
         throw new IllegalStateException("");
      } else {
         super.field199 = var1.readUnsignedByte((byte)27);
         super.field200 = var1.readUnsignedByte((byte)43);
         super.field203 = var1.writeShort((byte)98);
         super.field195 = var1.writeShort((byte)7);
         this.field375 = var1.readUnsignedByte((byte)25);
         this.field378 = var1.readUnsignedByte((byte)54);
         super.field197 = var1.writeShort((byte)41);
         super.field198 = var1.writeShort((byte)48);
         this.field374 = var1.readUnsignedByte((byte)36);
         this.field377 = var1.readUnsignedByte((byte)108);
         super.field201 = var1.method5564((byte)-59);
         super.field202 = var1.method5564((byte)33);
      }
   }

   int method787(int var1) {
      return this.field378;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof class48)) {
         return false;
      } else {
         class48 var2 = (class48)var1;
         return super.field197 == var2.field197 && super.field198 == var2.field198?var2.field374 == this.field374 && var2.field377 == this.field377:false;
      }
   }

   public int hashCode() {
      return super.field197 | super.field198 << 8 | this.field374 << 16 | this.field377 << 24;
   }

   static final void updateEntityType(class194 var0, byte var1) {
      class308 var2 = client.field761.field1337;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var38;
      if(class194.field2327 == var0) {
         var38 = var2.readByteN(1093621994);
         var4 = var38 >> 2;
         var5 = var38 & 3;
         var6 = client.field699[var4];
         var7 = var2.readUnsignedByte((byte)119);
         var8 = (var7 >> 4 & 7) + class17.field91;
         var9 = (var7 & 7) + class340.field3959;
         if(var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
            class141.method3160(class71.field610, var8, var9, var6, -1, var4, var5, 0, -1, 1290971566);
         }

      } else {
         int var10;
         int var12;
         int var13;
         int var14;
         byte var15;
         if(class194.field2324 == var0) {
            byte var3 = var2.method5581(12345678);
            var4 = var2.method5587(-1264815455);
            var5 = var2.writeShort((byte)114);
            var6 = var2.method5587(-1679564732);
            var7 = var2.readByteN(678489344);
            var8 = var7 >> 2;
            var9 = var7 & 3;
            var10 = client.field699[var8];
            byte var11 = var2.readByte(-1089807719);
            var12 = var2.readByteA(1112762416);
            var13 = (var12 >> 4 & 7) + class17.field91;
            var14 = (var12 & 7) + class340.field3959;
            var15 = var2.method5579(-2046276387);
            int var16 = var2.method5587(25523773);
            byte var17 = var2.method5579(-1944074467);
            class75 var18;
            if(var5 == client.field797) {
               var18 = class311.field3717;
            } else {
               var18 = client.players[var5];
            }

            if(var18 != null) {
               class263 var19 = class33.method435(var6, 1650295452);
               int var20;
               int var21;
               if(var9 != 1 && var9 != 3) {
                  var20 = var19.field3359;
                  var21 = var19.field3360;
               } else {
                  var20 = var19.field3360;
                  var21 = var19.field3359;
               }

               int var22 = var13 + (var20 >> 1);
               int var23 = var13 + (var20 + 1 >> 1);
               int var24 = var14 + (var21 >> 1);
               int var25 = var14 + (var21 + 1 >> 1);
               int[][] var26 = class64.field549[class71.field610];
               int var27 = var26[var22][var25] + var26[var22][var24] + var26[var23][var24] + var26[var23][var25] >> 2;
               int var28 = (var13 << 7) + (var20 << 6);
               int var29 = (var14 << 7) + (var21 << 6);
               class136 var30 = var19.method4639(var8, var9, var26, var28, var27, var29, 1778618203);
               if(var30 != null) {
                  class141.method3160(class71.field610, var13, var14, var10, -1, 0, 0, var16 + 1, var4 + 1, -903187990);
                  var18.field653 = var16 + client.field689;
                  var18.field654 = var4 + client.field689;
                  var18.field656 = var30;
                  var18.field662 = var13 * 128 + var20 * 64;
                  var18.field657 = var14 * 128 + var21 * 64;
                  var18.field655 = var27;
                  byte var31;
                  if(var11 > var15) {
                     var31 = var11;
                     var11 = var15;
                     var15 = var31;
                  }

                  if(var3 > var17) {
                     var31 = var3;
                     var3 = var17;
                     var17 = var31;
                  }

                  var18.field659 = var13 + var11;
                  var18.field661 = var15 + var13;
                  var18.field660 = var3 + var14;
                  var18.field664 = var14 + var17;
               }
            }
         }

         class96 var33;
         if(class194.field2331 == var0) {
            var38 = var2.readByteS(-576195763);
            var4 = (var38 >> 4 & 7) + class17.field91;
            var5 = (var38 & 7) + class340.field3959;
            var6 = var2.writeShort((byte)7);
            if(var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
               class271 var32 = client.field808[class71.field610][var4][var5];
               if(var32 != null) {
                  for(var33 = (class96)var32.method4931(); var33 != null; var33 = (class96)var32.method4949()) {
                     if((var6 & 32767) == var33.field1254) {
                        var33.method3657();
                        break;
                     }
                  }

                  if(var32.method4931() == null) {
                     client.field808[class71.field610][var4][var5] = null;
                  }

                  class80.method1884(var4, var5, -682642402);
               }
            }

         } else if(class194.field2329 == var0) {
            var38 = var2.writeShort((byte)14);
            var4 = var2.method5587(543575469);
            var5 = var2.readUnsignedShort((byte)84);
            var6 = var2.readUnsignedByte((byte)38);
            var7 = (var6 >> 4 & 7) + class17.field91;
            var8 = (var6 & 7) + class340.field3959;
            if(var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
               class271 var42 = client.field808[class71.field610][var7][var8];
               if(var42 != null) {
                  for(class96 var35 = (class96)var42.method4931(); var35 != null; var35 = (class96)var42.method4949()) {
                     if((var4 & 32767) == var35.field1254 && var38 == var35.field1257) {
                        var35.field1257 = var5;
                        break;
                     }
                  }

                  class80.method1884(var7, var8, -1050071366);
               }
            }

         } else if(class194.field2330 == var0) {
            var38 = var2.readUnsignedByte((byte)93);
            var4 = (var38 >> 4 & 7) + class17.field91;
            var5 = (var38 & 7) + class340.field3959;
            var6 = var2.method5587(774060419);
            var7 = var2.readByteS(-576195763);
            var8 = var7 >> 2;
            var9 = var7 & 3;
            var10 = client.field699[var8];
            if(var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
               class141.method3160(class71.field610, var4, var5, var10, var6, var8, var9, 0, -1, -859398265);
            }

         } else {
            int var40;
            if(class194.field2325 == var0) {
               var38 = var2.readUnsignedByte((byte)96);
               var4 = var2.readByteS(-576195763);
               var5 = (var4 >> 4 & 7) + class17.field91;
               var6 = (var4 & 7) + class340.field3959;
               var7 = var2.readShortA((byte)117);
               var8 = var2.readByteS(-576195763);
               var9 = var8 >> 4 & 15;
               var10 = var8 & 7;
               if(var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                  var40 = var9 + 1;
                  if(class311.field3717.field1028[0] >= var5 - var40 && class311.field3717.field1028[0] <= var5 + var40 && class311.field3717.field1029[0] >= var6 - var40 && class311.field3717.field1029[0] <= var6 + var40 && client.field758 != 0 && var10 > 0 && client.field936 < 50) {
                     client.field879[client.field936] = var7;
                     client.field920[client.field936] = var10;
                     client.field876[client.field936] = var38;
                     client.field923[client.field936] = null;
                     client.field953[client.field936] = var9 + (var6 << 8) + (var5 << 16);
                     ++client.field936;
                  }
               }
            }

            if(class194.field2323 == var0) {
               var38 = var2.readShortA((byte)113);
               var4 = var2.readUnsignedShort((byte)6);
               var5 = var2.readUnsignedByte((byte)116);
               var6 = (var5 >> 4 & 7) + class17.field91;
               var7 = (var5 & 7) + class340.field3959;
               if(var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                  var33 = new class96();
                  var33.field1254 = var38;
                  var33.field1257 = var4;
                  if(client.field808[class71.field610][var6][var7] == null) {
                     client.field808[class71.field610][var6][var7] = new class271();
                  }

                  client.field808[class71.field610][var6][var7].method4952(var33);
                  class80.method1884(var6, var7, -1264633985);
               }

            } else if(class194.field2332 == var0) {
               var38 = var2.readShortA((byte)119);
               var4 = var2.readByteS(-576195763) * 4;
               var5 = var2.readByteN(2146763860) * 4;
               var6 = var2.readByteN(1816779581);
               byte var39 = var2.method5580(-587494464);
               var8 = var2.method5587(-1790389065);
               var9 = var2.readUnsignedShort((byte)86);
               var10 = var2.readUnsignedByte((byte)32);
               var40 = (var10 >> 4 & 7) + class17.field91;
               var12 = (var10 & 7) + class340.field3959;
               var13 = var2.readUnsignedByte((byte)60);
               var14 = var2.method5550(-732430188);
               var15 = var2.method5580(-742164484);
               var7 = var39 + var40;
               int var41 = var15 + var12;
               if(var40 >= 0 && var12 >= 0 && var40 < 104 && var12 < 104 && var7 >= 0 && var41 >= 0 && var7 < 104 && var41 < 104 && var8 != '\uffff') {
                  var40 = var40 * 128 + 64;
                  var12 = var12 * 128 + 64;
                  var7 = var7 * 128 + 64;
                  var41 = var41 * 128 + 64;
                  class95 var36 = new class95(var8, class71.field610, var40, var12, class277.method5013(var40, var12, class71.field610, 761942427) - var5, var9 + client.field689, var38 + client.field689, var6, var13, var14, var4);
                  var36.method2196(var7, var41, class277.method5013(var7, var41, class71.field610, 353449791) - var4, var9 + client.field689, -251648925);
                  client.field810.method4952(var36);
               }

            } else if(class194.field2326 == var0) {
               var38 = var2.readByteA(-1443404975);
               var4 = var2.writeShort((byte)25);
               var5 = var2.readByteA(1594885473);
               var6 = (var5 >> 4 & 7) + class17.field91;
               var7 = (var5 & 7) + class340.field3959;
               var8 = var2.readShortA((byte)127);
               if(var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                  var6 = var6 * 128 + 64;
                  var7 = var7 * 128 + 64;
                  class86 var34 = new class86(var4, class71.field610, var6, var7, class277.method5013(var6, var7, class71.field610, -1737355700) - var38, var8, client.field689);
                  client.field811.method4952(var34);
               }

            } else if(class194.field2328 == var0) {
               var38 = var2.readByteS(-576195763);
               var4 = (var38 >> 4 & 7) + class17.field91;
               var5 = (var38 & 7) + class340.field3959;
               var6 = var2.readUnsignedByte((byte)58);
               var7 = var6 >> 2;
               var8 = var6 & 3;
               var9 = client.field699[var7];
               var10 = var2.method5587(-1027792253);
               if(var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
                  if(var9 == 0) {
                     class145 var37 = class14.field60.method3185(class71.field610, var4, var5);
                     if(var37 != null) {
                        var12 = class31.method387(var37.field1891);
                        if(var7 == 2) {
                           var37.field1888 = new class102(var12, 2, var8 + 4, class71.field610, var4, var5, var10, false, var37.field1888);
                           var37.field1890 = new class102(var12, 2, var8 + 1 & 3, class71.field610, var4, var5, var10, false, var37.field1890);
                        } else {
                           var37.field1888 = new class102(var12, var7, var8, class71.field610, var4, var5, var10, false, var37.field1888);
                        }
                     }
                  }

                  if(var9 == 1) {
                     class150 var43 = class14.field60.method3238(class71.field610, var4, var5);
                     if(var43 != null) {
                        var12 = class31.method387(var43.field1933);
                        if(var7 != 4 && var7 != 5) {
                           if(var7 == 6) {
                              var43.field1931 = new class102(var12, 4, var8 + 4, class71.field610, var4, var5, var10, false, var43.field1931);
                           } else if(var7 == 7) {
                              var43.field1931 = new class102(var12, 4, (var8 + 2 & 3) + 4, class71.field610, var4, var5, var10, false, var43.field1931);
                           } else if(var7 == 8) {
                              var43.field1931 = new class102(var12, 4, var8 + 4, class71.field610, var4, var5, var10, false, var43.field1931);
                              var43.field1934 = new class102(var12, 4, (var8 + 2 & 3) + 4, class71.field610, var4, var5, var10, false, var43.field1934);
                           }
                        } else {
                           var43.field1931 = new class102(var12, 4, var8, class71.field610, var4, var5, var10, false, var43.field1931);
                        }
                     }
                  }

                  if(var9 == 2) {
                     class151 var44 = class14.field60.method3187(class71.field610, var4, var5);
                     if(var7 == 11) {
                        var7 = 10;
                     }

                     if(var44 != null) {
                        var44.field1944 = new class102(class31.method387(var44.field1956), var7, var8, class71.field610, var4, var5, var10, false, var44.field1944);
                     }
                  }

                  if(var9 == 3) {
                     class132 var45 = class14.field60.method3188(class71.field610, var4, var5);
                     if(var45 != null) {
                        var45.field1630 = new class102(class31.method387(var45.field1631), 22, var8, class71.field610, var4, var5, var10, false, var45.field1630);
                     }
                  }
               }

            }
         }
      }
   }

   static class82 method813(byte var0) {
      class352 var1 = null;
      class82 var2 = new class82();

      try {
         var1 = class54.method919("", class341.field3965.field3109, false, 1960314155);
         byte[] var3 = new byte[(int)var1.method6650((byte)108)];

         int var5;
         for(int var4 = 0; var4 < var3.length; var4 += var5) {
            var5 = var1.method6658(var3, var4, var3.length - var4, -1379584124);
            if(var5 == -1) {
               throw new IOException();
            }
         }

         var2 = new class82(new class309(var3));
      } catch (Exception var7) {
         ;
      }

      try {
         if(var1 != null) {
            var1.method6648((byte)10);
         }
      } catch (Exception var6) {
         ;
      }

      return var2;
   }

   static void method815(int var0, int var1, int var2, int var3, byte var4) {
      class226 var5 = class19.method224(var0, var1, 702758848);
      if(var5 != null && var5.field2664 != null) {
         class71 var6 = new class71();
         var6.field612 = var5;
         var6.field602 = var5.field2664;
         class76.method1395(var6, 276809227);
      }

      client.field837 = var3;
      client.field835 = true;
      class7.field29 = var0;
      client.field836 = var1;
      class43.field336 = var2;
      class68.method1273(var5, 1261653029);
   }

   static int method814(int var0, class101 var1, boolean var2, byte var3) {
      if(var0 == 5630) {
         client.field802 = 250;
         return 1;
      } else {
         return 2;
      }
   }
}
