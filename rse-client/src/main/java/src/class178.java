package src;

import java.io.File;
import java.util.Hashtable;

public class class178 {

   public static boolean field2056 = false;
   static Hashtable field2059 = new Hashtable(16);
   public static File field2057;


   static final void method3575(class124 var0, short var1) {
      var0.field1508 = false;
      if(var0.field1509 != null) {
         var0.field1509.field1541 = 0;
      }

      for(class124 var2 = var0.vmethod3962(); var2 != null; var2 = var0.vmethod3964()) {
         method3575(var2, (short)2290);
      }

   }

   static final boolean method3574(int var0, int var1, byte var2) {
      class263 var3 = class33.method435(var0, 1650295452);
      if(var1 == 11) {
         var1 = 10;
      }

      if(var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var3.method4637(var1, 54022350);
   }
}
