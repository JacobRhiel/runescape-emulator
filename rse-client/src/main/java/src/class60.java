package src;

import java.applet.Applet;

public class class60 {

   public static Applet field461 = null;
   public static String field462 = "";
   static int field465;


   static final void method997(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 - var0;
      int var8 = var3 - var1;
      int var9 = var7 >= 0?var7:-var7;
      int var10 = var8 >= 0?var8:-var8;
      int var11 = var9;
      if(var9 < var10) {
         var11 = var10;
      }

      if(var11 != 0) {
         int var12 = (var7 << 16) / var11;
         int var13 = (var8 << 16) / var11;
         if(var13 <= var12) {
            var12 = -var12;
         } else {
            var13 = -var13;
         }

         int var14 = var5 * var13 >> 17;
         int var15 = var5 * var13 + 1 >> 17;
         int var16 = var5 * var12 >> 17;
         int var17 = var5 * var12 + 1 >> 17;
         var0 -= class330.field3867;
         var1 -= class330.field3862;
         int var18 = var0 + var14;
         int var19 = var0 - var15;
         int var20 = var0 + var7 - var15;
         int var21 = var0 + var14 + var7;
         int var22 = var16 + var1;
         int var23 = var1 - var17;
         int var24 = var8 + var1 - var17;
         int var25 = var8 + var16 + var1;
         class139.method3096(var18, var19, var20);
         class139.method3093(var22, var23, var24, var18, var19, var20, var4);
         class139.method3096(var18, var20, var21);
         class139.method3093(var22, var24, var25, var18, var20, var21, var4);
      }
   }

   public static class254 method995(int var0, int var1) {
      class254 var2 = (class254)class254.field3258.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class254.field3257.method4224(1, var0, (byte)-104);
         var2 = new class254();
         if(var3 != null) {
            var2.method4491(new class309(var3), var0, 1422019917);
         }

         var2.method4479(1794462402);
         class254.field3258.method3424(var2, (long)var0);
         return var2;
      }
   }

   static final void method999(String var0, byte var1) {
      if(var0.equalsIgnoreCase("toggleroof")) {
         class76.field676.field1077 = !class76.field676.field1077;
         class35.method509(1860758807);
         if(class76.field676.field1077) {
            class141.method3161(99, "", "Roofs are now all hidden", 1226797461);
         } else {
            class141.method3161(99, "", "Roofs will only be removed selectively", 152034670);
         }
      }

      if(var0.equalsIgnoreCase("displayfps")) {
         client.field934 = !client.field934;
      }

      if(var0.equalsIgnoreCase("renderself")) {
         client.field799 = !client.field799;
      }

      if(var0.equalsIgnoreCase("mouseovertext")) {
         client.field828 = !client.field828;
      }

      if(client.field849 >= 2) {
         if(var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if(var0.equalsIgnoreCase("showcoord")) {
            class21.field121.field4013 = !class21.field121.field4013;
         }

         if(var0.equalsIgnoreCase("fpson")) {
            client.field934 = true;
         }

         if(var0.equalsIgnoreCase("fpsoff")) {
            client.field934 = false;
         }

         if(var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if(var0.equalsIgnoreCase("clientdrop")) {
            class138.method3079((short)-13893);
         }
      }

      class196 var2 = class146.method3363(ClientPacket.field2246, client.field761.field1340, -2080002988);
      var2.field2338.readByte(var0.length() + 1, 1258821856);
      var2.field2338.method5627(var0, 2111537711);
      client.field761.method2361(var2, 1331043615);
   }
}
