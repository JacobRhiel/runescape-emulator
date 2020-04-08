package src;

import java.util.Date;
import java.util.LinkedList;

public abstract class class30 {

   public static String field212;
   static class114 field211;
   boolean field210;
   short[][][] field204;
   int field197;
   int field198;
   int field200;
   int field201 = -1;
   class34[][][][] field207;
   boolean field209;
   short[][][] field196;
   int field202 = -1;
   byte[][][] field205;
   byte[][][] field206;
   int field199;
   int field203;
   int field195;


   class30() {
      new LinkedList();
      this.field210 = false;
      this.field209 = false;
   }

   boolean method370(int var1) {
      return this.field210 && this.field209;
   }

   void method360(int var1) {
      this.field204 = null;
      this.field196 = null;
      this.field205 = null;
      this.field206 = null;
      this.field207 = null;
      this.field210 = false;
      this.field209 = false;
   }

   void method355(int var1, int var2, class309 var3, int var4, byte var5) {
      boolean var6 = (var4 & 2) != 0;
      if(var6) {
         this.field196[0][var1][var2] = (short)var3.readUnsignedByte((byte)51);
      }

      this.field204[0][var1][var2] = (short)var3.readUnsignedByte((byte)30);
   }

   void method372(int var1, int var2, class309 var3, int var4, int var5) {
      int var6 = ((var4 & 24) >> 3) + 1;
      boolean var7 = (var4 & 2) != 0;
      boolean var8 = (var4 & 4) != 0;
      this.field204[0][var1][var2] = (short)var3.readUnsignedByte((byte)99);
      int var9;
      int var10;
      int var12;
      if(var7) {
         var9 = var3.readUnsignedByte((byte)59);

         for(var10 = 0; var10 < var9; ++var10) {
            int var11 = var3.readUnsignedByte((byte)67);
            if(var11 != 0) {
               this.field196[var10][var1][var2] = (short)var11;
               var12 = var3.readUnsignedByte((byte)29);
               this.field205[var10][var1][var2] = (byte)(var12 >> 2);
               this.field206[var10][var1][var2] = (byte)(var12 & 3);
            }
         }
      }

      if(var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            var10 = var3.readUnsignedByte((byte)33);
            if(var10 != 0) {
               class34[] var15 = this.field207[var9][var1][var2] = new class34[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  int var13 = var3.method5564((byte)20);
                  int var14 = var3.readUnsignedByte((byte)100);
                  var15[var12] = new class34(var13, var14 >> 2, var14 & 3);
               }
            }
         }
      }

   }

   void method352(class243 var1, int var2) {
      if(!this.method370(-1542306024)) {
         byte[] var3 = var1.method4224(this.field201, this.field202, (byte)-108);
         if(var3 != null) {
            this.vmethod806(new class309(var3), (byte)-78);
            this.field210 = true;
            this.field209 = true;
         }

      }
   }

   int method358(int var1) {
      return this.field197;
   }

   int method359(int var1) {
      return this.field198;
   }

   abstract void vmethod806(class309 var1, byte var2);

   void method354(int var1, int var2, class309 var3, byte var4) {
      int var5 = var3.readUnsignedByte((byte)29);
      if(var5 != 0) {
         if((var5 & 1) != 0) {
            this.method355(var1, var2, var3, var5, (byte)-123);
         } else {
            this.method372(var1, var2, var3, var5, -1501964087);
         }

      }
   }

   static final int method381(byte var0) {
      return client.field693 - 1;
   }

   public static class264 method373(int var0, byte var1) {
      class264 var2 = (class264)class264.field3395.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class319.field3802.method4224(10, var0, (byte)-127);
         var2 = new class264();
         var2.field3403 = var0;
         if(var3 != null) {
            var2.method4703(new class309(var3), -160078979);
         }

         var2.method4742(1255281949);
         if(var2.field3440 != -1) {
            var2.method4739(method373(var2.field3440, (byte)-27), method373(var2.field3437, (byte)-26), (byte)98);
         }

         if(var2.field3400 != -1) {
            var2.method4693(method373(var2.field3400, (byte)-16), method373(var2.field3447, (byte)-36), 2110553543);
         }

         if(var2.field3450 != -1) {
            var2.method4694(method373(var2.field3450, (byte)78), method373(var2.field3449, (byte)9), 231591867);
         }

         if(!class169.field2010 && var2.field3412) {
            var2.field3397 = "Members object";
            var2.field3446 = false;
            var2.field3419 = null;
            var2.field3420 = null;
            var2.field3424 = -1;
            var2.field3444 = 0;
            if(var2.field3427 != null) {
               boolean var4 = false;

               for(class189 var5 = var2.field3427.method5978(); var5 != null; var5 = var2.field3427.method5966()) {
                  class259 var6 = class285.method5110((int)var5.field2116, (byte)44);
                  if(var6.field3300) {
                     var5.method3657();
                  } else {
                     var4 = true;
                  }
               }

               if(!var4) {
                  var2.field3427 = null;
               }
            }
         }

         class264.field3395.method3424(var2, (long)var0);
         return var2;
      }
   }

   static boolean method356(class226 var0, int var1) {
      return var0.field2629;
   }

   static final class70 method382(int var0, int var1, int var2, int var3) {
      class70 var4 = new class70();
      var4.field599 = var1;
      var4.field593 = var2;
      client.field841.method5997(var4, (long)var0);
      class4.method73(var1, 1237048544);
      class226 var5 = class208.method3898(var0, (byte)-110);
      class68.method1273(var5, -1396755924);
      if(client.field882 != null) {
         class68.method1273(client.field882, -834237350);
         client.field882 = null;
      }

      class103.method2340(-1605670984);
      class63.method1161(class226.field2693[var0 >> 16], var5, false, -894659169);
      class29.method349(var1, -1886131870);
      if(client.field924 != -1) {
         class198.method3714(client.field924, 1, (byte)1);
      }

      return var4;
   }

   static int method384(int var0, class101 var1, boolean var2, int var3) {
      String var4;
      int var5;
      if(var0 == 4100) {
         var4 = class85.field1118[--class85.field1119];
         var5 = class85.field1115[--class85.field1117];
         class85.field1118[++class85.field1119 - 1] = var4 + var5;
         return 1;
      } else {
         String var10;
         if(var0 == 4101) {
            class85.field1119 -= 2;
            var4 = class85.field1118[class85.field1119];
            var10 = class85.field1118[class85.field1119 + 1];
            class85.field1118[++class85.field1119 - 1] = var4 + var10;
            return 1;
         } else if(var0 == 4102) {
            var4 = class85.field1118[--class85.field1119];
            var5 = class85.field1115[--class85.field1117];
            class85.field1118[++class85.field1119 - 1] = var4 + class280.method5016(var5, true, -627751714);
            return 1;
         } else if(var0 == 4103) {
            var4 = class85.field1118[--class85.field1119];
            class85.field1118[++class85.field1119 - 1] = var4.toLowerCase();
            return 1;
         } else {
            int var7;
            int var11;
            if(var0 == 4104) {
               var11 = class85.field1115[--class85.field1117];
               long var12 = 86400000L * (11745L + (long)var11);
               class85.field1113.setTime(new Date(var12));
               var7 = class85.field1113.get(5);
               int var17 = class85.field1113.get(2);
               int var9 = class85.field1113.get(1);
               class85.field1118[++class85.field1119 - 1] = var7 + "-" + class85.field1124[var17] + "-" + var9;
               return 1;
            } else if(var0 != 4105) {
               if(var0 == 4106) {
                  var11 = class85.field1115[--class85.field1117];
                  class85.field1118[++class85.field1119 - 1] = Integer.toString(var11);
                  return 1;
               } else if(var0 == 4107) {
                  class85.field1119 -= 2;
                  class85.field1115[++class85.field1117 - 1] = class227.method4176(class218.method4025(class85.field1118[class85.field1119], class85.field1118[class85.field1119 + 1], class285.field3597, 1131255315), -673521466);
                  return 1;
               } else {
                  int var6;
                  byte[] var14;
                  class304 var15;
                  if(var0 == 4108) {
                     var4 = class85.field1118[--class85.field1119];
                     class85.field1117 -= 2;
                     var5 = class85.field1115[class85.field1117];
                     var6 = class85.field1115[class85.field1117 + 1];
                     var14 = class88.field1151.method4224(var6, 0, (byte)-38);
                     var15 = new class304(var14);
                     class85.field1115[++class85.field1117 - 1] = var15.method5454(var4, var5);
                     return 1;
                  } else if(var0 == 4109) {
                     var4 = class85.field1118[--class85.field1119];
                     class85.field1117 -= 2;
                     var5 = class85.field1115[class85.field1117];
                     var6 = class85.field1115[class85.field1117 + 1];
                     var14 = class88.field1151.method4224(var6, 0, (byte)-51);
                     var15 = new class304(var14);
                     class85.field1115[++class85.field1117 - 1] = var15.method5386(var4, var5);
                     return 1;
                  } else if(var0 == 4110) {
                     class85.field1119 -= 2;
                     var4 = class85.field1118[class85.field1119];
                     var10 = class85.field1118[class85.field1119 + 1];
                     if(class85.field1115[--class85.field1117] == 1) {
                        class85.field1118[++class85.field1119 - 1] = var4;
                     } else {
                        class85.field1118[++class85.field1119 - 1] = var10;
                     }

                     return 1;
                  } else if(var0 == 4111) {
                     var4 = class85.field1118[--class85.field1119];
                     class85.field1118[++class85.field1119 - 1] = class305.method5388(var4);
                     return 1;
                  } else if(var0 == 4112) {
                     var4 = class85.field1118[--class85.field1119];
                     var5 = class85.field1115[--class85.field1117];
                     class85.field1118[++class85.field1119 - 1] = var4 + (char)var5;
                     return 1;
                  } else if(var0 == 4113) {
                     var11 = class85.field1115[--class85.field1117];
                     class85.field1115[++class85.field1117 - 1] = class67.method1258((char)var11, 527367819)?1:0;
                     return 1;
                  } else if(var0 == 4114) {
                     var11 = class85.field1115[--class85.field1117];
                     class85.field1115[++class85.field1117 - 1] = class43.method684((char)var11, (byte)0)?1:0;
                     return 1;
                  } else if(var0 == 4115) {
                     var11 = class85.field1115[--class85.field1117];
                     class85.field1115[++class85.field1117 - 1] = class80.method1893((char)var11, (byte)34)?1:0;
                     return 1;
                  } else if(var0 == 4116) {
                     var11 = class85.field1115[--class85.field1117];
                     class85.field1115[++class85.field1117 - 1] = class114.method2580((char)var11, 210668082)?1:0;
                     return 1;
                  } else if(var0 == 4117) {
                     var4 = class85.field1118[--class85.field1119];
                     if(var4 != null) {
                        class85.field1115[++class85.field1117 - 1] = var4.length();
                     } else {
                        class85.field1115[++class85.field1117 - 1] = 0;
                     }

                     return 1;
                  } else if(var0 == 4118) {
                     var4 = class85.field1118[--class85.field1119];
                     class85.field1117 -= 2;
                     var5 = class85.field1115[class85.field1117];
                     var6 = class85.field1115[class85.field1117 + 1];
                     class85.field1118[++class85.field1119 - 1] = var4.substring(var5, var6);
                     return 1;
                  } else if(var0 == 4119) {
                     var4 = class85.field1118[--class85.field1119];
                     StringBuilder var18 = new StringBuilder(var4.length());
                     boolean var16 = false;

                     for(var7 = 0; var7 < var4.length(); ++var7) {
                        char var8 = var4.charAt(var7);
                        if(var8 == 60) {
                           var16 = true;
                        } else if(var8 == 62) {
                           var16 = false;
                        } else if(!var16) {
                           var18.append(var8);
                        }
                     }

                     class85.field1118[++class85.field1119 - 1] = var18.toString();
                     return 1;
                  } else if(var0 == 4120) {
                     var4 = class85.field1118[--class85.field1119];
                     var5 = class85.field1115[--class85.field1117];
                     class85.field1115[++class85.field1117 - 1] = var4.indexOf(var5);
                     return 1;
                  } else if(var0 == 4121) {
                     class85.field1119 -= 2;
                     var4 = class85.field1118[class85.field1119];
                     var10 = class85.field1118[class85.field1119 + 1];
                     var6 = class85.field1115[--class85.field1117];
                     class85.field1115[++class85.field1117 - 1] = var4.indexOf(var10, var6);
                     return 1;
                  } else if(var0 == 4122) {
                     var4 = class85.field1118[--class85.field1119];
                     class85.field1118[++class85.field1119 - 1] = var4.toUpperCase();
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               class85.field1119 -= 2;
               var4 = class85.field1118[class85.field1119];
               var10 = class85.field1118[class85.field1119 + 1];
               if(class311.field3717.field646 != null && class311.field3717.field646.field2542) {
                  class85.field1118[++class85.field1119 - 1] = var10;
               } else {
                  class85.field1118[++class85.field1119 - 1] = var4;
               }

               return 1;
            }
         }
      }
   }

   static int method380(int var0, class101 var1, boolean var2, int var3) {
      int var4;
      if(var0 == 5504) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         int var5 = class85.field1115[class85.field1117 + 1];
         if(!client.field888) {
            client.field824 = var4;
            client.field909 = var5;
         }

         return 1;
      } else if(var0 == 5505) {
         class85.field1115[++class85.field1117 - 1] = client.field824;
         return 1;
      } else if(var0 == 5506) {
         class85.field1115[++class85.field1117 - 1] = client.field909;
         return 1;
      } else if(var0 == 5530) {
         var4 = class85.field1115[--class85.field1117];
         if(var4 < 0) {
            var4 = 0;
         }

         client.field755 = var4;
         return 1;
      } else if(var0 == 5531) {
         class85.field1115[++class85.field1117 - 1] = client.field755;
         return 1;
      } else {
         return 2;
      }
   }
}
