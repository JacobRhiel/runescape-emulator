package src;

import java.util.HashMap;

public class class302 {

   class243 field3669;
   class243 field3668;
   HashMap field3667;


   public class302(class243 var1, class243 var2) {
      this.field3669 = var1;
      this.field3668 = var2;
      this.field3667 = new HashMap();
   }

   public HashMap method5364(class301[] var1, int var2) {
      HashMap var3 = new HashMap();
      class301[] var4 = var1;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class301 var6 = var4[var5];
         if(this.field3667.containsKey(var6)) {
            var3.put(var6, this.field3667.get(var6));
         } else {
            class304 var7 = class39.method647(this.field3669, this.field3668, var6.field3660, "", 672122156);
            if(var7 != null) {
               this.field3667.put(var6, var7);
               var3.put(var6, var7);
            }
         }
      }

      return var3;
   }
}
