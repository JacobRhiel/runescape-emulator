package src;

import java.awt.event.*;
import java.security.SecureRandom;

public class class63 implements MouseListener, MouseMotionListener, FocusListener {

   static class63 field510 = new class63();
   static volatile int field512 = 0;
   public static volatile int field511 = 0;
   static volatile int field513 = -1;
   static volatile int field507 = 0;
   public static int field524 = 0;
   static volatile int field528 = -1;
   static SecureRandom field532;
   public static int field517 = 0;
   static volatile int field522 = 0;
   static volatile long field523 = -1L;
   public static int field518 = 0;
   public static int field521 = 0;
   public static long field515 = 0L;
   public static int field525 = 0;
   public static int field520 = 0;
   static volatile long field519 = 0L;
   static volatile int field526 = 0;
   public static long field527 = 0L;
   static int field529;


   public final synchronized void mouseMoved(MouseEvent var1) {
      if(field510 != null) {
         field511 = 0;
         field513 = var1.getX();
         field528 = var1.getY();
         field523 = var1.getWhen();
      }

   }

   final int method1162(MouseEvent var1, int var2) {
      int var3 = var1.getButton();
      return !var1.isAltDown() && var3 != 2?(!var1.isMetaDown() && var3 != 3?1:2):4;
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if(field510 != null) {
         field511 = 0;
         field507 = var1.getX();
         field522 = var1.getY();
         field519 = class217.method4014(-988231020);
         field526 = this.method1162(var1, -1992651704);
         if(field526 != 0) {
            field512 = field526;
         }
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if(field510 != null) {
         field511 = 0;
         field512 = 0;
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if(field510 != null) {
         field511 = 0;
         field513 = -1;
         field528 = -1;
         field523 = var1.getWhen();
      }

   }

   public final void focusGained(FocusEvent var1) {}

   public final synchronized void focusLost(FocusEvent var1) {
      if(field510 != null) {
         field512 = 0;
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public static class253 method1205(int var0, int var1) {
      class253 var2 = (class253)class253.field3242.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class253.field3244.method4224(13, var0, (byte)-47);
         var2 = new class253();
         var2.field3240 = var0;
         if(var3 != null) {
            var2.method4470(new class309(var3), (byte)-55);
         }

         class253.field3242.method3424(var2, (long)var0);
         return var2;
      }
   }

   static void method1161(class226[] var0, class226 var1, boolean var2, int var3) {
      int var4 = var1.field2590 != 0?var1.field2590:var1.field2582;
      int var5 = var1.field2597 != 0?var1.field2597:var1.field2642;
      class70.method1280(var0, var1.field2567, var4, var5, var2, -1930613556);
      if(var1.field2697 != null) {
         class70.method1280(var1.field2697, var1.field2567, var4, var5, var2, -1930613556);
      }

      class70 var6 = (class70)client.field841.method6010((long)var1.field2567);
      if(var6 != null) {
         int var7 = var6.field599;
         if(class81.method1900(var7, 1133005923)) {
            class70.method1280(class226.field2693[var7], -1, var4, var5, var2, -1930613556);
         }
      }

      if(var1.field2571 == 1337) {
         ;
      }

   }

   public static void method1206(class243 var0, int var1) {
      class261.field3319 = var0;
   }

   static final void method1202(int var0, int var1, int var2, int var3, int var4) {
      client.field767 = 0;
      boolean var5 = false;
      int var6 = -1;
      int var7 = -1;
      int var8 = class98.field1278;
      int[] var9 = class98.field1271;

      int var10;
      for(var10 = 0; var10 < var8 + client.field722; ++var10) {
         Object var11;
         if(var10 < var8) {
            var11 = client.players[var9[var10]];
            if(var9[var10] == client.field807) {
               var5 = true;
               var6 = var10;
               continue;
            }

            if(var11 == class311.field3717) {
               var7 = var10;
               continue;
            }
         } else {
            var11 = client.field721[client.field723[var10 - var8]];
         }

         class42.method655((class78)var11, var10, var0, var1, var2, var3, -535954243);
      }

      if(client.field799 && var7 != -1) {
         class42.method655(class311.field3717, var7, var0, var1, var2, var3, -1464461419);
      }

      if(var5) {
         class42.method655(client.players[client.field807], var6, var0, var1, var2, var3, 559484924);
      }

      for(var10 = 0; var10 < client.field767; ++var10) {
         int var20 = client.field769[var10];
         int var12 = client.field831[var10];
         int var13 = client.field908[var10];
         int var14 = client.field771[var10];
         boolean var15 = true;

         while(var15) {
            var15 = false;

            for(int var16 = 0; var16 < var10; ++var16) {
               if(var12 + 2 > client.field831[var16] - client.field771[var16] && var12 - var14 < client.field831[var16] + 2 && var20 - var13 < client.field908[var16] + client.field769[var16] && var13 + var20 > client.field769[var16] - client.field908[var16] && client.field831[var16] - client.field771[var16] < var12) {
                  var12 = client.field831[var16] - client.field771[var16];
                  var15 = true;
               }
            }
         }

         client.field812 = client.field769[var10];
         client.field780 = client.field831[var10] = var12;
         String var21 = client.field781[var10];
         if(client.field844 == 0) {
            int var17 = 16776960;
            if(client.field773[var10] < 6) {
               var17 = client.field895[client.field773[var10]];
            }

            if(client.field773[var10] == 6) {
               var17 = client.field778 % 20 < 10?16711680:16776960;
            }

            if(client.field773[var10] == 7) {
               var17 = client.field778 % 20 < 10?255:'\uffff';
            }

            if(client.field773[var10] == 8) {
               var17 = client.field778 % 20 < 10?'\ub000':8454016;
            }

            int var18;
            if(client.field773[var10] == 9) {
               var18 = 150 - client.field775[var10];
               if(var18 < 50) {
                  var17 = var18 * 1280 + 16711680;
               } else if(var18 < 100) {
                  var17 = 16776960 - (var18 - 50) * 327680;
               } else if(var18 < 150) {
                  var17 = (var18 - 100) * 5 + '\uff00';
               }
            }

            if(client.field773[var10] == 10) {
               var18 = 150 - client.field775[var10];
               if(var18 < 50) {
                  var17 = var18 * 5 + 16711680;
               } else if(var18 < 100) {
                  var17 = 16711935 - (var18 - 50) * 327680;
               } else if(var18 < 150) {
                  var17 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
               }
            }

            if(client.field773[var10] == 11) {
               var18 = 150 - client.field775[var10];
               if(var18 < 50) {
                  var17 = 16777215 - var18 * 327685;
               } else if(var18 < 100) {
                  var17 = (var18 - 50) * 327685 + '\uff00';
               } else if(var18 < 150) {
                  var17 = 16777215 - (var18 - 100) * 327680;
               }
            }

            if(client.field927[var10] == 0) {
               class175.field2045.method5392(var21, var0 + client.field812, client.field780 + var1, var17, 0);
            }

            if(client.field927[var10] == 1) {
               class175.field2045.method5394(var21, var0 + client.field812, client.field780 + var1, var17, 0, client.field778);
            }

            if(client.field927[var10] == 2) {
               class175.field2045.method5395(var21, var0 + client.field812, client.field780 + var1, var17, 0, client.field778);
            }

            if(client.field927[var10] == 3) {
               class175.field2045.method5396(var21, var0 + client.field812, client.field780 + var1, var17, 0, client.field778, 150 - client.field775[var10]);
            }

            if(client.field927[var10] == 4) {
               var18 = (150 - client.field775[var10]) * (class175.field2045.method5384(var21) + 100) / 150;
               class330.method6066(var0 + client.field812 - 50, var1, var0 + client.field812 + 50, var3 + var1);
               class175.field2045.method5389(var21, var0 + client.field812 + 50 - var18, client.field780 + var1, var17, 0);
               class330.method6045(var0, var1, var0 + var2, var3 + var1);
            }

            if(client.field927[var10] == 5) {
               var18 = 150 - client.field775[var10];
               int var19 = 0;
               if(var18 < 25) {
                  var19 = var18 - 25;
               } else if(var18 > 125) {
                  var19 = var18 - 125;
               }

               class330.method6066(var0, client.field780 + var1 - class175.field2045.field3682 - 1, var0 + var2, client.field780 + var1 + 5);
               class175.field2045.method5392(var21, var0 + client.field812, var19 + client.field780 + var1, var17, 0);
               class330.method6045(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class175.field2045.method5392(var21, var0 + client.field812, client.field780 + var1, 16776960, 0);
         }
      }

   }

   static int method1200(class308 var0, int var1) {
      int var2 = var0.method5495(2, (byte)8);
      int var3;
      if(var2 == 0) {
         var3 = 0;
      } else if(var2 == 1) {
         var3 = var0.method5495(5, (byte)-47);
      } else if(var2 == 2) {
         var3 = var0.method5495(8, (byte)-37);
      } else {
         var3 = var0.method5495(11, (byte)-8);
      }

      return var3;
   }

   static final void method1163(class226 var0, int var1, int var2, int var3, int var4) {
      if(var0.field2644 == null) {
         throw new RuntimeException();
      } else {
         var0.field2644[var1] = var2;
         var0.field2695[var1] = var3;
      }
   }

   static class80 method1184(int var0) {
      return class80.field1045 < class80.field1044?class324.field3837[++class80.field1045 - 1]:null;
   }

   public static String method1187(CharSequence var0, int var1) {
      int var2 = var0.length();
      StringBuilder var3 = new StringBuilder(var2);

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if((var5 < 97 || var5 > 122) && (var5 < 65 || var5 > 90) && (var5 < 48 || var5 > 57) && var5 != 46 && var5 != 45 && var5 != 42 && var5 != 95) {
            if(var5 == 32) {
               var3.append('+');
            } else {
               byte var6 = class175.method3559(var5, (byte)76);
               var3.append('%');
               int var7 = var6 >> 4 & 15;
               if(var7 >= 10) {
                  var3.append((char)(var7 + 55));
               } else {
                  var3.append((char)(var7 + 48));
               }

               var7 = var6 & 15;
               if(var7 >= 10) {
                  var3.append((char)(var7 + 55));
               } else {
                  var3.append((char)(var7 + 48));
               }
            }
         } else {
            var3.append(var5);
         }
      }

      return var3.toString();
   }
}
