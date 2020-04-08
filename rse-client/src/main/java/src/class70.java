package src;

public class class70 extends class189 {

   static class294 field596;
   public static int field595;
   boolean field594 = false;
   int field599;
   int field593;


   public static class238[] method1278(byte var0) {
      return new class238[]{class238.field3094, class238.field3093, class238.field3089, class238.field3091, class238.field3092, class238.field3087};
   }

   static void method1280(class226[] var0, int var1, int var2, int var3, boolean var4, int var5) {
      for(int var6 = 0; var6 < var0.length; ++var6) {
         class226 var7 = var0[var6];
         if(var7 != null && var7.field2586 == var1) {
            class47.method781(var7, var2, var3, var4, (short)24635);
            class26.method291(var7, var2, var3, 1642243773);
            if(var7.field2646 > var7.field2590 - var7.field2582) {
               var7.field2646 = var7.field2590 - var7.field2582;
            }

            if(var7.field2646 < 0) {
               var7.field2646 = 0;
            }

            if(var7.field2589 > var7.field2597 - var7.field2642) {
               var7.field2589 = var7.field2597 - var7.field2642;
            }

            if(var7.field2589 < 0) {
               var7.field2589 = 0;
            }

            if(var7.field2569 == 0) {
               class63.method1161(var0, var7, var4, -652798399);
            }
         }
      }

   }

   static final void method1279(class75 var0, int var1, int var2, int var3, int var4) {
      if(class311.field3717 != var0) {
         if(client.field693 < 400) {
            String var5;
            int var8;
            if(var0.field671 == 0) {
               String var6 = var0.field649[0] + var0.field652 + var0.field649[1];
               var8 = var0.field650;
               int var9 = class311.field3717.field650;
               int var10 = var9 - var8;
               String var7;
               if(var10 < -9) {
                  var7 = class297.method5314(16711680, -1191731880);
               } else if(var10 < -6) {
                  var7 = class297.method5314(16723968, -1577488333);
               } else if(var10 < -3) {
                  var7 = class297.method5314(16740352, -1579625966);
               } else if(var10 < 0) {
                  var7 = class297.method5314(16756736, 1635579);
               } else if(var10 > 9) {
                  var7 = class297.method5314('\uff00', 1185051856);
               } else if(var10 > 6) {
                  var7 = class297.method5314(4259584, 931573822);
               } else if(var10 > 3) {
                  var7 = class297.method5314(8453888, 608773468);
               } else if(var10 > 0) {
                  var7 = class297.method5314(12648192, -389804572);
               } else {
                  var7 = class297.method5314(16776960, -2068372400);
               }

               var5 = var6 + var7 + " " + " (" + "level-" + var0.field650 + ")" + var0.field649[2];
            } else {
               var5 = var0.field649[0] + var0.field652 + var0.field649[1] + " " + " (" + "skill-" + var0.field671 + ")" + var0.field649[2];
            }

            int var11;
            if(client.field833 == 1) {
               class285.method5111("Use", client.field933 + " " + "->" + " " + class297.method5314(16777215, -835096601) + var5, 14, var1, var2, var3, (byte)21);
            } else if(client.field835) {
               if((class43.field336 & 8) == 8) {
                  class285.method5111(client.field838, client.field839 + " " + "->" + " " + class297.method5314(16777215, 1661891293) + var5, 15, var1, var2, var3, (byte)68);
               }
            } else {
               for(var11 = 7; var11 >= 0; --var11) {
                  if(client.field804[var11] != null) {
                     short var12 = 0;
                     if(client.field804[var11].equalsIgnoreCase("Attack")) {
                        if(class93.field1185 == client.field705) {
                           continue;
                        }

                        if(class93.field1183 == client.field705 || class93.field1188 == client.field705 && var0.field650 > class311.field3717.field650) {
                           var12 = 2000;
                        }

                        if(class311.field3717.field644 != 0 && var0.field644 != 0) {
                           if(var0.field644 == class311.field3717.field644) {
                              var12 = 2000;
                           } else {
                              var12 = 0;
                           }
                        }
                     } else if(client.field805[var11]) {
                        var12 = 2000;
                     }

                     boolean var13 = false;
                     var8 = client.field803[var11] + var12;
                     class285.method5111(client.field804[var11], class297.method5314(16777215, 512973479) + var5, var8, var1, var2, var3, (byte)81);
                  }
               }
            }

            for(var11 = 0; var11 < client.field693; ++var11) {
               if(client.field779[var11] == 23) {
                  client.field823[var11] = class297.method5314(16777215, 1167794085) + var5;
                  break;
               }
            }

         }
      }
   }
}
