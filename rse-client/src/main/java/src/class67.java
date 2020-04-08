package src;

public class class67 {

   int field567 = 0;
   final int field565;
   final class245 field566;


   class67(class245 var1, String var2) {
      this.field566 = var1;
      this.field565 = var1.method4235((byte)-101);
   }

   boolean method1253(int var1) {
      this.field567 = 0;

      for(int var2 = 0; var2 < this.field565; ++var2) {
         if(!this.field566.method4329(var2, 1990020351) || this.field566.method4328(var2, (byte)18)) {
            ++this.field567;
         }
      }

      return this.field567 >= this.field565;
   }

   static final void method1256(class226 var0, int var1, int var2, int var3, int var4) {
      class103.method2342((byte)36);
      class220 var5 = var0.method4115(false, (byte)-106);
      if(var5 != null) {
         class330.method6045(var1, var2, var5.field2518 + var1, var2 + var5.field2517);
         if(client.field912 != 2 && client.field912 != 5) {
            int var6 = client.field909 & 2047;
            int var7 = class311.field3717.field983 / 32 + 48;
            int var8 = 464 - class311.field3717.field973 / 32;
            class317.field3790.method6204(var1, var2, var5.field2518, var5.field2517, var7, var8, var6, 256, var5.field2516, var5.field2519);

            int var9;
            int var10;
            int var11;
            for(var9 = 0; var9 < client.field906; ++var9) {
               var10 = client.field907[var9] * 4 + 2 - class311.field3717.field983 / 32;
               var11 = client.field867[var9] * 4 + 2 - class311.field3717.field973 / 32;
               class71.method1288(var1, var2, var10, var11, client.field885[var9], var5, (byte)-20);
            }

            int var12;
            int var13;
            for(var9 = 0; var9 < 104; ++var9) {
               for(var10 = 0; var10 < 104; ++var10) {
                  class271 var16 = client.field808[class71.field610][var9][var10];
                  if(var16 != null) {
                     var12 = var9 * 4 + 2 - class311.field3717.field983 / 32;
                     var13 = var10 * 4 + 2 - class311.field3717.field973 / 32;
                     class71.method1288(var1, var2, var12, var13, class250.field3205[0], var5, (byte)-26);
                  }
               }
            }

            for(var9 = 0; var9 < client.field722; ++var9) {
               class88 var17 = client.field721[client.field723[var9]];
               if(var17 != null && var17.vmethod2118(116176402)) {
                  class266 var19 = var17.field1148;
                  if(var19 != null && var19.field3490 != null) {
                     var19 = var19.method4766(-2051225078);
                  }

                  if(var19 != null && var19.field3481 && var19.field3493) {
                     var12 = var17.field983 / 32 - class311.field3717.field983 / 32;
                     var13 = var17.field973 / 32 - class311.field3717.field973 / 32;
                     class71.method1288(var1, var2, var12, var13, class250.field3205[1], var5, (byte)-125);
                  }
               }
            }

            var9 = class98.field1278;
            int[] var20 = class98.field1271;

            for(var11 = 0; var11 < var9; ++var11) {
               class75 var18 = client.players[var20[var11]];
               if(var18 != null && var18.vmethod2118(116176402) && !var18.field651 && var18 != class311.field3717) {
                  var13 = var18.field983 / 32 - class311.field3717.field983 / 32;
                  int var14 = var18.field973 / 32 - class311.field3717.field973 / 32;
                  boolean var15 = false;
                  if(class311.field3717.field644 != 0 && var18.field644 != 0 && var18.field644 == class311.field3717.field644) {
                     var15 = true;
                  }

                  if(var18.method1351(990067508)) {
                     class71.method1288(var1, var2, var13, var14, class250.field3205[3], var5, (byte)-26);
                  } else if(var15) {
                     class71.method1288(var1, var2, var13, var14, class250.field3205[4], var5, (byte)-109);
                  } else if(var18.method1334(1535464163)) {
                     class71.method1288(var1, var2, var13, var14, class250.field3205[5], var5, (byte)-32);
                  } else {
                     class71.method1288(var1, var2, var13, var14, class250.field3205[2], var5, (byte)-15);
                  }
               }
            }

            if(client.field889 != 0 && client.field689 % 20 < 10) {
               if(client.field889 == 1 && client.field698 >= 0 && client.field698 < client.field721.length) {
                  class88 var21 = client.field721[client.field698];
                  if(var21 != null) {
                     var12 = var21.field983 / 32 - class311.field3717.field983 / 32;
                     var13 = var21.field973 / 32 - class311.field3717.field973 / 32;
                     class1.method20(var1, var2, var12, var13, class47.field373[1], var5, (byte)-12);
                  }
               }

               if(client.field889 == 2) {
                  var11 = client.field700 * 4 - class69.field590 * -1369995580 + 2 - class311.field3717.field983 / 32;
                  var12 = client.field763 * 4 - class89.field1152 * -1286003804 + 2 - class311.field3717.field973 / 32;
                  class1.method20(var1, var2, var11, var12, class47.field373[1], var5, (byte)-2);
               }

               if(client.field889 == 10 && client.field800 >= 0 && client.field800 < client.players.length) {
                  class75 var22 = client.players[client.field800];
                  if(var22 != null) {
                     var12 = var22.field983 / 32 - class311.field3717.field983 / 32;
                     var13 = var22.field973 / 32 - class311.field3717.field973 / 32;
                     class1.method20(var1, var2, var12, var13, class47.field373[1], var5, (byte)111);
                  }
               }
            }

            if(client.field910 != 0) {
               var11 = client.field910 * 4 + 2 - class311.field3717.field983 / 32;
               var12 = client.field911 * 4 + 2 - class311.field3717.field973 / 32;
               class71.method1288(var1, var2, var11, var12, class47.field373[0], var5, (byte)-50);
            }

            if(!class311.field3717.field651) {
               class330.method6052(var5.field2518 / 2 + var1 - 1, var5.field2517 / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            class330.method6101(var1, var2, 0, var5.field2516, var5.field2519);
         }

         client.field886[var3] = true;
      }
   }

   public static void method1254(boolean var0, byte var1) {
      if(var0 != class169.field2010) {
         class257.method4534((byte)1);
         class169.field2010 = var0;
      }

   }

   public static boolean method1258(char var0, int var1) {
      return var0 >= 32 && var0 <= 126?true:(var0 >= 160 && var0 <= 255?true:var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376);
   }
}
