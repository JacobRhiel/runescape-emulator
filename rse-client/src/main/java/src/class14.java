package src;

import java.util.Comparator;

final class class14 implements Comparator {

   static class142 field60;
   static int field64;
   static int field63;


   int method135(class16 var1, class16 var2, int var3) {
      return var1.field81 < var2.field81?-1:(var2.field81 == var1.field81?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method135((class16)var1, (class16)var2, 590840268);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static void method148(int var0, int var1, int var2, boolean var3, int var4) {
      class196 var5 = class146.method3363(ClientPacket.field2224, client.field761.field1340, -1798251034);
      var5.field2338.method5700(var2, -927080333);
      var5.field2338.method5689(var3?client.field762:0, 747474969);
      var5.field2338.method5582(var0, 70039705);
      var5.field2338.writeIntME(var1, 455919170);
      client.field761.method2361(var5, 591808699);
   }

   static int method137(int var0, class101 var1, boolean var2, int var3) {
      class226 var4 = var2?class20.field115:class85.field1130;
      if(var0 == 1600) {
         class85.field1115[++class85.field1117 - 1] = var4.field2646;
         return 1;
      } else if(var0 == 1601) {
         class85.field1115[++class85.field1117 - 1] = var4.field2589;
         return 1;
      } else if(var0 == 1602) {
         class85.field1118[++class85.field1119 - 1] = var4.field2628;
         return 1;
      } else if(var0 == 1603) {
         class85.field1115[++class85.field1117 - 1] = var4.field2590;
         return 1;
      } else if(var0 == 1604) {
         class85.field1115[++class85.field1117 - 1] = var4.field2597;
         return 1;
      } else if(var0 == 1605) {
         class85.field1115[++class85.field1117 - 1] = var4.field2659;
         return 1;
      } else if(var0 == 1606) {
         class85.field1115[++class85.field1117 - 1] = var4.field2618;
         return 1;
      } else if(var0 == 1607) {
         class85.field1115[++class85.field1117 - 1] = var4.field2657;
         return 1;
      } else if(var0 == 1608) {
         class85.field1115[++class85.field1117 - 1] = var4.field2619;
         return 1;
      } else if(var0 == 1609) {
         class85.field1115[++class85.field1117 - 1] = var4.field2640;
         return 1;
      } else if(var0 == 1610) {
         class85.field1115[++class85.field1117 - 1] = var4.field2599;
         return 1;
      } else if(var0 == 1611) {
         class85.field1115[++class85.field1117 - 1] = var4.field2592;
         return 1;
      } else if(var0 == 1612) {
         class85.field1115[++class85.field1117 - 1] = var4.field2636;
         return 1;
      } else if(var0 == 1613) {
         class85.field1115[++class85.field1117 - 1] = var4.field2651.vmethod6149((byte)103);
         return 1;
      } else if(var0 == 1614) {
         class85.field1115[++class85.field1117 - 1] = var4.field2625?1:0;
         return 1;
      } else {
         return 2;
      }
   }

   static void method149(class75 var0, int var1, int var2, byte var3) {
      if(var0.field1016 == var1 && var1 != -1) {
         int var4 = class253.method4478(var1, 1619645362).field3525;
         if(var4 == 1) {
            var0.field1014 = 0;
            var0.field1007 = 0;
            var0.field1008 = var2;
            var0.field1011 = 0;
         }

         if(var4 == 2) {
            var0.field1011 = 0;
         }
      } else if(var1 == -1 || var0.field1016 == -1 || class253.method4478(var1, 1446300256).field3519 >= class253.method4478(var0.field1016, 1744003962).field3519) {
         var0.field1016 = var1;
         var0.field1014 = 0;
         var0.field1007 = 0;
         var0.field1008 = var2;
         var0.field1011 = 0;
         var0.field1032 = var0.field1027;
      }

   }

   static int method147(int var0) {
      if(client.field951 != null && client.field952 < client.field951.size()) {
         int var1 = 0;

         for(int var2 = 0; var2 <= client.field952; ++var2) {
            var1 += ((class67)client.field951.get(var2)).field567;
         }

         return var1 * 10000 / client.field898;
      } else {
         return 10000;
      }
   }
}
