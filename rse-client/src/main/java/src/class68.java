package src;

import netscape.javascript.JSObject;

import java.applet.Applet;
import java.net.URL;

public class class68 extends class189 {

   static class327 field570 = new class327(32);
   static class302 field574;
   static class333 field572;
   int[] field571 = new int[]{-1};
   int[] field576 = new int[]{0};


   static void method1273(class226 var0, int var1) {
      if(var0.field2603 == client.field884) {
         client.field679[var0.field2702] = true;
      }

   }

   static boolean method1274(String var0, int var1, String var2, byte var3) {
      if(var1 == 0) {
         try {
            if(!class60.field462.startsWith("win")) {
               throw new Exception();
            } else if(!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var5 = 0; var5 < var0.length(); ++var5) {
                  if(var14.indexOf(var0.charAt(var5)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var9) {
            return false;
         }
      } else if(var1 == 1) {
         try {
            Applet var8 = class60.field461;
            Object[] var6 = new Object[]{(new URL(class60.field461.getCodeBase(), var0)).toString()};
            Object var4 = JSObject.getWindow(var8).call(var2, var6);
            return var4 != null;
         } catch (Throwable var10) {
            return false;
         }
      } else if(var1 == 2) {
         try {
            class60.field461.getAppletContext().showDocument(new URL(class60.field461.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var11) {
            return false;
         }
      } else if(var1 == 3) {
         try {
            class56.method950(class60.field461, "loggedout", (byte)1);
         } catch (Throwable var13) {
            ;
         }

         try {
            class60.field461.getAppletContext().showDocument(new URL(class60.field461.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var12) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void method1272(class226 var0, class264 var1, int var2, int var3, boolean var4, int var5) {
      String[] var6 = var1.field3420;
      byte var7 = -1;
      String var8 = null;
      if(var6 != null && var6[var3] != null) {
         if(var3 == 0) {
            var7 = 33;
         } else if(var3 == 1) {
            var7 = 34;
         } else if(var3 == 2) {
            var7 = 35;
         } else if(var3 == 3) {
            var7 = 36;
         } else {
            var7 = 37;
         }

         var8 = var6[var3];
      } else if(var3 == 4) {
         var7 = 37;
         var8 = "Drop";
      }

      if(var7 != -1 && var8 != null) {
         class65.method1244(var8, class297.method5314(16748608, -1133789720) + var1.field3397, var7, var1.field3403, var2, var0.field2567, var4, -1599726197);
      }

   }
}
