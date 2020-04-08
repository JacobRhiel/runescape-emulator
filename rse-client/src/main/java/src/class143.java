package src;

public class class143 {

   protected static int field1877;
   static class333 field1878;


   static void method3348(class309 var0, int var1, int var2) {
      class85.method2099(var0.field3709, var1, 632066186);
      class36.method510(var0, var1, -1583850141);
   }

   static void method3350(int var0, int var1, int var2, int var3) {
      if(client.field916 != 0 && var1 != 0 && client.field936 < 50) {
         client.field879[client.field936] = var0;
         client.field920[client.field936] = var1;
         client.field876[client.field936] = var2;
         client.field923[client.field936] = null;
         client.field953[client.field936] = 0;
         ++client.field936;
      }

   }

   static void method3349(int var0, int var1, int var2, boolean var3, int var4, boolean var5, byte var6) {
      if(var0 < var1) {
         int var7 = (var0 + var1) / 2;
         int var8 = var0;
         class80 var9 = class324.field3837[var7];
         class324.field3837[var7] = class324.field3837[var1];
         class324.field3837[var1] = var9;

         for(int var10 = var0; var10 < var1; ++var10) {
            class80 var12 = class324.field3837[var10];
            int var13 = class55.method945(var12, var9, var2, var3, (byte)1);
            int var11;
            if(var13 != 0) {
               if(var3) {
                  var11 = -var13;
               } else {
                  var11 = var13;
               }
            } else if(var4 == -1) {
               var11 = 0;
            } else {
               int var14 = class55.method945(var12, var9, var4, var5, (byte)1);
               if(var5) {
                  var11 = -var14;
               } else {
                  var11 = var14;
               }
            }

            if(var11 <= 0) {
               class80 var15 = class324.field3837[var10];
               class324.field3837[var10] = class324.field3837[var8];
               class324.field3837[var8++] = var15;
            }
         }

         class324.field3837[var1] = class324.field3837[var8];
         class324.field3837[var8] = var9;
         method3349(var0, var8 - 1, var2, var3, var4, var5, (byte)-41);
         method3349(var8 + 1, var1, var2, var3, var4, var5, (byte)-37);
      }

   }
}
