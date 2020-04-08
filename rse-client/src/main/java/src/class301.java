package src;

import java.util.Iterator;

public class class301 {

   public static final class301 field3657 = new class301("verdana_11pt_regular");
   public static final class301 field3654 = new class301("p11_full");
   public static final class301 field3658 = new class301("verdana_13pt_regular");
   public static final class301 field3663 = new class301("verdana_15pt_regular");
   public static final class301 field3655 = new class301("p12_full");
   public static final class301 field3666 = new class301("b12_full");
   static class245 field3664;
   String field3660;


   class301(String var1) {
      this.field3660 = var1;
   }

   static final void method5359(int var0) {
      Iterator var1 = class100.field1291.iterator();

      while(var1.hasNext()) {
         class73 var2 = (class73)var1.next();
         var2.method1299((byte)14);
      }

      if(class70.field596 != null) {
         class70.field596.method5284(1089464789);
      }

   }

   public static class301[] method5360(int var0) {
      return new class301[]{field3666, field3658, field3657, field3654, field3655, field3663};
   }

   static final void method5354(int var0, int var1, int var2, int var3, int var4, int var5) {
      class232.field2751[0].method6173(var0, var1);
      class232.field2751[1].method6173(var0, var3 + var1 - 16);
      class330.method6052(var0, var1 + 16, 16, var3 - 32, client.field742);
      int var6 = var3 * (var3 - 32) / var4;
      if(var6 < 8) {
         var6 = 8;
      }

      int var7 = (var3 - 32 - var6) * var2 / (var4 - var3);
      class330.method6052(var0, var7 + var1 + 16, 16, var6, client.field747);
      class330.method6059(var0, var7 + var1 + 16, var6, client.field745);
      class330.method6059(var0 + 1, var7 + var1 + 16, var6, client.field745);
      class330.method6057(var0, var7 + var1 + 16, 16, client.field745);
      class330.method6057(var0, var7 + var1 + 17, 16, client.field745);
      class330.method6059(var0 + 15, var7 + var1 + 16, var6, client.field744);
      class330.method6059(var0 + 14, var7 + var1 + 17, var6 - 1, client.field744);
      class330.method6057(var0, var7 + var6 + var1 + 15, 16, client.field744);
      class330.method6057(var0 + 1, var6 + var7 + var1 + 14, 15, client.field744);
   }

   static void method5361(byte var0) {
      if(client.field716 && class94.field1220 != null && class94.field1220.length() > 0) {
         class94.field1209 = 1;
      } else {
         class94.field1209 = 0;
      }

   }

   static final void method5358(int var0, int var1, int var2, int var3) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            class64.field549[var0][var4 + var1][var5 + var2] = 0;
         }
      }

      if(var1 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            class64.field549[var0][var1][var4 + var2] = class64.field549[var0][var1 - 1][var4 + var2];
         }
      }

      if(var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            class64.field549[var0][var4 + var1][var2] = class64.field549[var0][var4 + var1][var2 - 1];
         }
      }

      if(var1 > 0 && class64.field549[var0][var1 - 1][var2] != 0) {
         class64.field549[var0][var1][var2] = class64.field549[var0][var1 - 1][var2];
      } else if(var2 > 0 && class64.field549[var0][var1][var2 - 1] != 0) {
         class64.field549[var0][var1][var2] = class64.field549[var0][var1][var2 - 1];
      } else if(var1 > 0 && var2 > 0 && class64.field549[var0][var1 - 1][var2 - 1] != 0) {
         class64.field549[var0][var1][var2] = class64.field549[var0][var1 - 1][var2 - 1];
      }

   }

   static final void method5356(class226 var0, int var1, byte[] var2, byte[] var3, int var4) {
      if(var0.field2555 == null) {
         if(var2 == null) {
            return;
         }

         var0.field2555 = new byte[11][];
         var0.field2643 = new byte[11][];
         var0.field2644 = new int[11];
         var0.field2695 = new int[11];
      }

      var0.field2555[var1] = var2;
      if(var2 != null) {
         var0.field2641 = true;
      } else {
         var0.field2641 = false;

         for(int var5 = 0; var5 < var0.field2555.length; ++var5) {
            if(var0.field2555[var5] != null) {
               var0.field2641 = true;
               break;
            }
         }
      }

      var0.field2643[var1] = var3;
   }
}
