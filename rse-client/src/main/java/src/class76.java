package src;

import java.util.Comparator;

public class class76 implements Comparator {

   static class82 field676;
   static class333 field674;
   public static boolean field677;
   boolean field678;


   int method1391(class16 var1, class16 var2, byte var3) {
      if(var2.field81 == var1.field81) {
         return 0;
      } else {
         if(this.field678) {
            if(client.field680 == var1.field81) {
               return -1;
            }

            if(var2.field81 == client.field680) {
               return 1;
            }
         }

         return var1.field81 < var2.field81?-1:1;
      }
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1391((class16)var1, (class16)var2, (byte)-63);
   }

   public static void method1395(class71 var0, int var1) {
      class223.method4099(var0, 500000, 2013269807);
   }

   static void method1398(int var0, int var1) {
      class68 var2 = (class68)class68.field570.method6010((long)var0);
      if(var2 != null) {
         for(int var3 = 0; var3 < var2.field571.length; ++var3) {
            var2.field571[var3] = -1;
            var2.field576[var3] = 0;
         }

      }
   }

   static void method1396(int var0, int var1, int var2) {
      int[] var3 = new int[9];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         int var5 = var4 * 32 + 15 + 128;
         int var6 = class160.method3468(var5, (byte)120);
         int var7 = class139.field1794[var5];
         var6 = class99.method2281(var6, var1, -938707872);
         var3[var4] = var7 * var6 >> 16;
      }

      class142.method3197(var3, 500, 800, var0 * 334 / var1, 334);
   }

   static final String method1385(int var0, byte var1) {
      return var0 < 100000?"<col=ffff00>" + var0 + "</col>":(var0 < 10000000?"<col=ffffff>" + var0 / 1000 + "K" + "</col>":"<col=00ff80>" + var0 / 1000000 + "M" + "</col>");
   }
}
