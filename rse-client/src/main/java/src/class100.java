package src;

import java.util.HashMap;
import java.util.Map;

public class class100 {

   static int field1293 = 0;
   static final Map field1292 = new HashMap();
   static final class325 field1291 = new class325(1024);
   static final class275 field1290 = new class275();


   static final void method2315(boolean var0, byte var1) {
      for(int var2 = 0; var2 < client.field722; ++var2) {
         class88 var3 = client.field721[client.field723[var2]];
         if(var3 != null && var3.vmethod2118(116176402) && var3.field1148.field3485 == var0 && var3.field1148.method4767(1945900441)) {
            int var4 = var3.field983 >> 7;
            int var5 = var3.field973 >> 7;
            if(var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
               if(var3.field976 == 1 && (var3.field983 & 127) == 64 && (var3.field973 & 127) == 64) {
                  if(client.field777[var4][var5] == client.field778) {
                     continue;
                  }

                  client.field777[var4][var5] = client.field778;
               }

               long var6 = class337.method6337(0, 0, 1, !var3.field1148.field3493, client.field723[var2], 2064024757);
               var3.field977 = client.field689;
               class14.field60.method3174(class71.field610, var3.field983, var3.field973, class277.method5013(var3.field976 * 64 - 64 + var3.field983, var3.field976 * 64 - 64 + var3.field973, class71.field610, -1692484183), var3.field976 * 64 - 64 + 60, var3, var3.field995, var6, var3.field1001);
            }
         }
      }

   }

   static void method2316(int var0, int var1, int var2, int var3, int var4) {
      class68 var5 = (class68)class68.field570.method6010((long)var0);
      if(var5 == null) {
         var5 = new class68();
         class68.field570.method5997(var5, (long)var0);
      }

      if(var5.field571.length <= var1) {
         int[] var6 = new int[var1 + 1];
         int[] var7 = new int[var1 + 1];

         int var8;
         for(var8 = 0; var8 < var5.field571.length; ++var8) {
            var6[var8] = var5.field571[var8];
            var7[var8] = var5.field576[var8];
         }

         for(var8 = var5.field571.length; var8 < var1; ++var8) {
            var6[var8] = -1;
            var7[var8] = 0;
         }

         var5.field571 = var6;
         var5.field576 = var7;
      }

      var5.field571[var1] = var2;
      var5.field576[var1] = var3;
   }

   static boolean method2308(int var0, int var1) {
      for(int var2 = 0; var2 < client.field901; ++var2) {
         if(client.field872[var2] == var0) {
            return true;
         }
      }

      return false;
   }
}
