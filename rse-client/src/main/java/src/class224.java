package src;

import java.awt.*;
import java.awt.Desktop.Action;
import java.net.URI;

public class class224 {

   public static final short[] field2544 = new short[]{(short)6798, (short)8741, (short)25238, (short)4626, (short)4550};
   public static final short[][] field2547 = new short[][]{{(short)6798, (short)107, (short)10283, (short)16, (short)4797, (short)7744, (short)5799, (short)4634, (short)-31839, (short)22433, (short)2983, (short)-11343, (short)8, (short)5281, (short)10438, (short)3650, (short)-27322, (short)-21845, (short)200, (short)571, (short)908, (short)21830, (short)28946, (short)-15701, (short)-14010}, {(short)8741, (short)12, (short)-1506, (short)-22374, (short)7735, (short)8404, (short)1701, (short)-27106, (short)24094, (short)10153, (short)-8915, (short)4783, (short)1341, (short)16578, (short)-30533, (short)25239, (short)8, (short)5281, (short)10438, (short)3650, (short)-27322, (short)-21845, (short)200, (short)571, (short)908, (short)21830, (short)28946, (short)-15701, (short)-14010}, {(short)25238, (short)8742, (short)12, (short)-1506, (short)-22374, (short)7735, (short)8404, (short)1701, (short)-27106, (short)24094, (short)10153, (short)-8915, (short)4783, (short)1341, (short)16578, (short)-30533, (short)8, (short)5281, (short)10438, (short)3650, (short)-27322, (short)-21845, (short)200, (short)571, (short)908, (short)21830, (short)28946, (short)-15701, (short)-14010}, {(short)4626, (short)11146, (short)6439, (short)12, (short)4758, (short)10270}, {(short)4550, (short)4537, (short)5681, (short)5673, (short)5790, (short)6806, (short)8076, (short)4574, (short)17050, (short)0, (short)127, (short)-31821, (short)-17991}};
   public static final short[] field2546 = new short[]{(short)-10304, (short)9104, (short)-1, (short)-1, (short)-1};
   public static final short[][] field2545 = new short[][]{{(short)6554, (short)115, (short)10304, (short)28, (short)5702, (short)7756, (short)5681, (short)4510, (short)-31835, (short)22437, (short)2859, (short)-11339, (short)16, (short)5157, (short)10446, (short)3658, (short)-27314, (short)-21965, (short)472, (short)580, (short)784, (short)21966, (short)28950, (short)-15697, (short)-14002}, {(short)9104, (short)10275, (short)7595, (short)3610, (short)7975, (short)8526, (short)918, (short)-26734, (short)24466, (short)10145, (short)-6882, (short)5027, (short)1457, (short)16565, (short)-30545, (short)25486, (short)24, (short)5392, (short)10429, (short)3673, (short)-27335, (short)-21957, (short)192, (short)687, (short)412, (short)21821, (short)28835, (short)-15460, (short)-14019}, new short[0], new short[0], new short[0]};
   static class245 field2549;


   static void method4101(String var0, boolean var1, String var2, boolean var3, int var4) {
      if(var1) {
         if(!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var6) {
               ;
            }
         }

         if(class60.field462.startsWith("win") && !var3) {
            class27.method306(var0, 0, -1597282930);
            return;
         }

         if(class60.field462.startsWith("mac")) {
            class68.method1274(var0, 1, var2, (byte)17);
            return;
         }

         class27.method306(var0, 2, -1492524142);
      } else {
         class27.method306(var0, 3, -1457680622);
      }

   }

   static int method4100(int var0, class101 var1, boolean var2, short var3) {
      int var4;
      if(var0 == 3903) {
         var4 = class85.field1115[--class85.field1117];
         class85.field1115[++class85.field1117 - 1] = client.field948[var4].method186(-1922096625);
         return 1;
      } else if(var0 == 3904) {
         var4 = class85.field1115[--class85.field1117];
         class85.field1115[++class85.field1117 - 1] = client.field948[var4].field95;
         return 1;
      } else if(var0 == 3905) {
         var4 = class85.field1115[--class85.field1117];
         class85.field1115[++class85.field1117 - 1] = client.field948[var4].field97;
         return 1;
      } else if(var0 == 3906) {
         var4 = class85.field1115[--class85.field1117];
         class85.field1115[++class85.field1117 - 1] = client.field948[var4].field100;
         return 1;
      } else if(var0 == 3907) {
         var4 = class85.field1115[--class85.field1117];
         class85.field1115[++class85.field1117 - 1] = client.field948[var4].field96;
         return 1;
      } else if(var0 == 3908) {
         var4 = class85.field1115[--class85.field1117];
         class85.field1115[++class85.field1117 - 1] = client.field948[var4].field99;
         return 1;
      } else {
         int var13;
         if(var0 == 3910) {
            var4 = class85.field1115[--class85.field1117];
            var13 = client.field948[var4].method185(1689314705);
            class85.field1115[++class85.field1117 - 1] = var13 == 0?1:0;
            return 1;
         } else if(var0 == 3911) {
            var4 = class85.field1115[--class85.field1117];
            var13 = client.field948[var4].method185(-1782888661);
            class85.field1115[++class85.field1117 - 1] = var13 == 2?1:0;
            return 1;
         } else if(var0 == 3912) {
            var4 = class85.field1115[--class85.field1117];
            var13 = client.field948[var4].method185(-87247671);
            class85.field1115[++class85.field1117 - 1] = var13 == 5?1:0;
            return 1;
         } else if(var0 == 3913) {
            var4 = class85.field1115[--class85.field1117];
            var13 = client.field948[var4].method185(383285578);
            class85.field1115[++class85.field1117 - 1] = var13 == 1?1:0;
            return 1;
         } else {
            boolean var14;
            if(var0 == 3914) {
               var14 = class85.field1115[--class85.field1117] == 1;
               if(class16.field84 != null) {
                  class16.field84.method152(class15.field68, var14, -1613593832);
               }

               return 1;
            } else if(var0 == 3915) {
               var14 = class85.field1115[--class85.field1117] == 1;
               if(class16.field84 != null) {
                  class16.field84.method152(class15.field69, var14, -2147175155);
               }

               return 1;
            } else if(var0 == 3916) {
               class85.field1117 -= 2;
               var14 = class85.field1115[class85.field1117] == 1;
               boolean var5 = class85.field1115[class85.field1117 + 1] == 1;
               if(class16.field84 != null) {
                  client.field949.field678 = var5;
                  class16.field84.method152(client.field949, var14, -1489555679);
               }

               return 1;
            } else if(var0 == 3917) {
               var14 = class85.field1115[--class85.field1117] == 1;
               if(class16.field84 != null) {
                  class16.field84.method152(class15.field66, var14, -1858235989);
               }

               return 1;
            } else if(var0 == 3918) {
               var14 = class85.field1115[--class85.field1117] == 1;
               if(class16.field84 != null) {
                  class16.field84.method152(class15.field72, var14, -1636449214);
               }

               return 1;
            } else if(var0 == 3919) {
               class85.field1115[++class85.field1117 - 1] = class16.field84 == null?0:class16.field84.field67.size();
               return 1;
            } else {
               class16 var12;
               if(var0 == 3920) {
                  var4 = class85.field1115[--class85.field1117];
                  var12 = (class16)class16.field84.field67.get(var4);
                  class85.field1115[++class85.field1117 - 1] = var12.field81;
                  return 1;
               } else if(var0 == 3921) {
                  var4 = class85.field1115[--class85.field1117];
                  var12 = (class16)class16.field84.field67.get(var4);
                  class85.field1118[++class85.field1119 - 1] = var12.method157(1517980095);
                  return 1;
               } else if(var0 == 3922) {
                  var4 = class85.field1115[--class85.field1117];
                  var12 = (class16)class16.field84.field67.get(var4);
                  class85.field1118[++class85.field1119 - 1] = var12.method158((byte)-119);
                  return 1;
               } else if(var0 == 3923) {
                  var4 = class85.field1115[--class85.field1117];
                  var12 = (class16)class16.field84.field67.get(var4);
                  long var6 = class217.method4014(960388993) - class140.field1802 - var12.field76;
                  int var8 = (int)(var6 / 3600000L);
                  int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
                  int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * '\uea60')) / 1000L);
                  String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                  class85.field1118[++class85.field1119 - 1] = var11;
                  return 1;
               } else if(var0 == 3924) {
                  var4 = class85.field1115[--class85.field1117];
                  var12 = (class16)class16.field84.field67.get(var4);
                  class85.field1115[++class85.field1117 - 1] = var12.field85.field100;
                  return 1;
               } else if(var0 == 3925) {
                  var4 = class85.field1115[--class85.field1117];
                  var12 = (class16)class16.field84.field67.get(var4);
                  class85.field1115[++class85.field1117 - 1] = var12.field85.field97;
                  return 1;
               } else if(var0 == 3926) {
                  var4 = class85.field1115[--class85.field1117];
                  var12 = (class16)class16.field84.field67.get(var4);
                  class85.field1115[++class85.field1117 - 1] = var12.field85.field95;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
