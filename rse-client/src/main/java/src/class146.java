package src;

public class class146 {

   static int field1899;
   int field1898;
   int field1895;
   int field1896;


   public static class196 method3363(ClientPacket var0, class337 var1, int var2) {
      class196 var3 = class161.method3482((byte)-87);
      var3.field2347 = var0;
      var3.field2337 = var0.field2309;
      if(var3.field2337 == -1) {
         var3.field2338 = new class308(260);
      } else if(var3.field2337 == -2) {
         var3.field2338 = new class308(10000);
      } else if(var3.field2337 <= 18) {
         var3.field2338 = new class308(20);
      } else if(var3.field2337 <= 98) {
         var3.field2338 = new class308(100);
      } else {
         var3.field2338 = new class308(260);
      }

      var3.field2338.method5490(var1, 452312441);
      var3.field2338.method5491(var3.field2347.field2308, -407468573);
      var3.field2339 = 0;
      return var3;
   }

   public static boolean method3365(int var0) {
      return client.field849 >= 2;
   }

   public static void method3364(int var0, class243 var1, int var2, int var3, int var4, boolean var5, byte var6) {
      class206.field2406 = 1;
      class206.field2407 = var1;
      class206.field2408 = var2;
      class206.field2413 = var3;
      class219.field2514 = var4;
      class19.field106 = var5;
      class93.field1187 = var0;
   }

   static char method3366(char var0, class199 var1, byte var2) {
      if(var0 >= 192 && var0 <= 255) {
         if(var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if(var0 == 199) {
            return 'C';
         }

         if(var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if(var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if(var0 == 209 && var1 != class199.field2362) {
            return 'N';
         }

         if(var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if(var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if(var0 == 221) {
            return 'Y';
         }

         if(var0 == 223) {
            return 's';
         }

         if(var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if(var0 == 231) {
            return 'c';
         }

         if(var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if(var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if(var0 == 241 && var1 != class199.field2362) {
            return 'n';
         }

         if(var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if(var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if(var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      return var0 == 338?'O':(var0 == 339?'o':(var0 == 376?'Y':var0));
   }
}
