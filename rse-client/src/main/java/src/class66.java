package src;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

public class class66 implements Callable {

   public Object call() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   static final boolean method1252(class136 var0, int var1, int var2, int var3, int var4) {
      boolean var5 = class137.field1761;
      if(!var5) {
         return false;
      } else {
         class99.method2280(906944643);
         int var6 = var0.field1689 + var1;
         int var7 = var2 + var0.field1715;
         int var8 = var3 + var0.field1709;
         int var9 = var0.field1729;
         int var10 = var0.field1717;
         int var11 = var0.field1719;
         int var12 = class137.field1756 - var6;
         int var13 = class300.field3653 - var7;
         int var14 = class265.field3456 - var8;
         return Math.abs(var12) > var9 + class23.field134?false:(Math.abs(var13) > var10 + class137.field1758?false:(Math.abs(var14) > var11 + class93.field1182?false:(Math.abs(var14 * class179.field2061 - var13 * class16.field75) > var10 * class93.field1182 + var11 * class137.field1758?false:(Math.abs(var12 * class16.field75 - var14 * class137.field1753) > var11 * class23.field134 + var9 * class93.field1182?false:Math.abs(var13 * class137.field1753 - var12 * class179.field2061) <= var9 * class137.field1758 + var10 * class23.field134))));
      }
   }

   static final void method1251(class226[] var0, int var1, byte var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class226 var4 = var0[var3];
         if(var4 != null) {
            if(var4.field2569 == 0) {
               if(var4.field2697 != null) {
                  method1251(var4.field2697, var1, (byte)32);
               }

               class70 var5 = (class70)client.field841.method6010((long)var4.field2567);
               if(var5 != null) {
                  class198.method3714(var5.field599, var1, (byte)1);
               }
            }

            class71 var6;
            if(var1 == 0 && var4.field2699 != null) {
               var6 = new class71();
               var6.field612 = var4;
               var6.field602 = var4.field2699;
               class76.method1395(var6, 290526661);
            }

            if(var1 == 1 && var4.field2681 != null) {
               if(var4.field2709 >= 0) {
                  class226 var7 = class208.method3898(var4.field2567, (byte)-74);
                  if(var7 == null || var7.field2697 == null || var4.field2709 >= var7.field2697.length || var4 != var7.field2697[var4.field2709]) {
                     continue;
                  }
               }

               var6 = new class71();
               var6.field612 = var4;
               var6.field602 = var4.field2681;
               class76.method1395(var6, 1703081572);
            }
         }
      }

   }

   static class101 method1246(byte[] var0, int var1) {
      class101 var2 = new class101();
      class309 var3 = new class309(var0);
      var3.field3710 = var3.field3709.length - 2;
      int var4 = var3.writeShort((byte)101);
      int var5 = var3.field3709.length - 2 - var4 - 12;
      var3.field3710 = var5;
      int var6 = var3.readInt(297718403);
      var2.field1302 = var3.writeShort((byte)103);
      var2.field1301 = var3.writeShort((byte)78);
      var2.field1306 = var3.writeShort((byte)104);
      var2.field1296 = var3.writeShort((byte)69);
      int var7 = var3.readUnsignedByte((byte)26);
      int var8;
      int var9;
      if(var7 > 0) {
         var2.field1304 = var2.method2325(var7, -1946257941);

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var3.writeShort((byte)102);
            class325 var10 = new class325(var9 > 0?class216.method4012(var9, -2094888461):1);
            var2.field1304[var8] = var10;

            while(var9-- > 0) {
               int var11 = var3.readInt(297718403);
               int var12 = var3.readInt(297718403);
               var10.method5963(new class188(var12), (long)var11);
            }
         }
      }

      var3.field3710 = 0;
      var3.method5555((byte)-43);
      var2.field1297 = new int[var6];
      var2.field1300 = new int[var6];
      var2.field1299 = new String[var6];

      for(var8 = 0; var3.field3710 < var5; var2.field1297[var8++] = var9) {
         var9 = var3.writeShort((byte)3);
         if(var9 == 3) {
            var2.field1299[var8] = var3.method5667(-1282132720);
         } else if(var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
            var2.field1300[var8] = var3.readInt(297718403);
         } else {
            var2.field1300[var8] = var3.readUnsignedByte((byte)89);
         }
      }

      return var2;
   }

   static int method1249(int var0, class101 var1, boolean var2, int var3) {
      int var4 = -1;
      class226 var5;
      if(var0 >= 2000) {
         var0 -= 1000;
         var4 = class85.field1115[--class85.field1117];
         var5 = class208.method3898(var4, (byte)-42);
      } else {
         var5 = var2?class20.field115:class85.field1130;
      }

      if(var0 == 1000) {
         class85.field1117 -= 4;
         var5.field2576 = class85.field1115[class85.field1117];
         var5.field2594 = class85.field1115[class85.field1117 + 1];
         var5.field2572 = class85.field1115[class85.field1117 + 2];
         var5.field2573 = class85.field1115[class85.field1117 + 3];
         class68.method1273(var5, 313198761);
         class42.field318.method1418(var5, -159825150);
         if(var4 != -1 && var5.field2569 == 0) {
            class63.method1161(class226.field2693[var4 >> 16], var5, false, 565311287);
         }

         return 1;
      } else if(var0 == 1001) {
         class85.field1117 -= 4;
         var5.field2579 = class85.field1115[class85.field1117];
         var5.field2621 = class85.field1115[class85.field1117 + 1];
         var5.field2703 = class85.field1115[class85.field1117 + 2];
         var5.field2683 = class85.field1115[class85.field1117 + 3];
         class68.method1273(var5, -2019402929);
         class42.field318.method1418(var5, -159825150);
         if(var4 != -1 && var5.field2569 == 0) {
            class63.method1161(class226.field2693[var4 >> 16], var5, false, -267565160);
         }

         return 1;
      } else if(var0 == 1003) {
         boolean var6 = class85.field1115[--class85.field1117] == 1;
         if(var6 != var5.field2629) {
            var5.field2629 = var6;
            class68.method1273(var5, -1274927638);
         }

         return 1;
      } else if(var0 == 1005) {
         var5.field2707 = class85.field1115[--class85.field1117] == 1;
         return 1;
      } else if(var0 == 1006) {
         var5.field2708 = class85.field1115[--class85.field1117] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   public static int method1250(int var0) {
      return class137.field1759;
   }
}
