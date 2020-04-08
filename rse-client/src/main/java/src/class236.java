package src;

import java.util.Iterator;

public final class class236 {

   static class226 field3082;


   public static char method4199(byte var0, int var1) {
      int var2 = var0 & 255;
      if(var2 == 0) {
         throw new IllegalArgumentException("" + Integer.toString(var2, 16));
      } else {
         if(var2 >= 128 && var2 < 160) {
            char var3 = class297.field3641[var2 - 128];
            if(var3 == 0) {
               var3 = 63;
            }

            var2 = var3;
         }

         return (char)var2;
      }
   }

   static final void method4200(byte var0) {
      for(int var1 = 0; var1 < class98.field1278; ++var1) {
         class75 var2 = client.players[class98.field1271[var1]];
         var2.method1332(77261851);
      }

      Iterator var3 = class100.field1291.iterator();

      while(var3.hasNext()) {
         class73 var4 = (class73)var3.next();
         var4.method1311(-1417196149);
      }

      if(class70.field596 != null) {
         class70.field596.method5275(1797514283);
      }

   }
}
