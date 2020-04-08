package src;

import netscape.javascript.JSObject;

import java.util.Date;

public class class74 extends class183 {

   static int field638;


   public boolean vmethod3646(int var1, int var2, int var3, class181 var4, byte var5) {
      return var2 == super.field2104 && var3 == super.field2103;
   }

   public static class179 method1326(int var0) {
      try {
         return new class172();
      } catch (Throwable var2) {
         return new class173();
      }
   }

   static int method1327(int var0) {
      return client.field894?2:1;
   }

   public static void method1321(class243 var0, int var1, int var2, int var3, boolean var4, int var5) {
      class206.field2406 = 1;
      class206.field2407 = var0;
      class206.field2408 = var1;
      class206.field2413 = var2;
      class219.field2514 = var3;
      class19.field106 = var4;
      class93.field1187 = 10000;
   }

   static void method1328(String var0, int var1) {
      class24.field137 = var0;

      try {
         String var2 = class42.field318.getParameter(Integer.toString(18));
         String var3 = class42.field318.getParameter(Integer.toString(13));
         String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
         String var6;
         if(var0.length() == 0) {
            var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            String var5 = var4 + "; Expires=";
            long var7 = class217.method4014(-1372174547) + 94608000000L;
            class216.field2503.setTime(new Date(var7));
            int var9 = class216.field2503.get(7);
            int var10 = class216.field2503.get(5);
            int var11 = class216.field2503.get(2);
            int var12 = class216.field2503.get(1);
            int var13 = class216.field2503.get(11);
            int var14 = class216.field2503.get(12);
            int var15 = class216.field2503.get(13);
            var6 = class216.field2502[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + class216.field2504[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
            var4 = var5 + var6 + "; Max-Age=" + 94608000L;
         }

         client var17 = class42.field318;
         var6 = "document.cookie=\"" + var4 + "\"";
         JSObject.getWindow(var17).eval(var6);
      } catch (Throwable var16) {
         ;
      }

   }
}
