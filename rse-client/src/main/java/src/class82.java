package src;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class class82 {

   static int field1085 = 6;
   static int field1083;
   int field1079 = 1;
   String field1080 = null;
   boolean field1077;
   boolean field1075 = false;
   LinkedHashMap field1082 = new LinkedHashMap();
   boolean field1078;


   class82() {
      this.method1928(true, -1802002327);
   }

   class82(class309 var1) {
      if(var1 != null && var1.field3709 != null) {
         int var2 = var1.readUnsignedByte((byte)24);
         if(var2 >= 0 && var2 <= field1085) {
            if(var1.readUnsignedByte((byte)47) == 1) {
               this.field1077 = true;
            }

            if(var2 > 1) {
               this.field1078 = var1.readUnsignedByte((byte)104) == 1;
            }

            if(var2 > 3) {
               this.field1079 = var1.readUnsignedByte((byte)31);
            }

            if(var2 > 2) {
               int var3 = var1.readUnsignedByte((byte)52);

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.method5552(297718403);
                  int var6 = var1.method5552(297718403);
                  this.field1082.put(Integer.valueOf(var5), Integer.valueOf(var6));
               }
            }

            if(var2 > 4) {
               this.field1080 = var1.method5555((byte)44);
            }

            if(var2 > 5) {
               this.field1075 = var1.method5682((byte)25);
            }
         } else {
            this.method1928(true, -540655029);
         }
      } else {
         this.method1928(true, -1054701410);
      }

   }

   void method1928(boolean var1, int var2) {}

   class309 method1929(int var1) {
      class309 var2 = new class309(100);
      var2.readByte(field1085, 1258821856);
      var2.readByte(this.field1077?1:0, 1258821856);
      var2.readByte(this.field1078?1:0, 1258821856);
      var2.readByte(this.field1079, 1258821856);
      var2.readByte(this.field1082.size(), 1258821856);
      Iterator var3 = this.field1082.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var2.method5689(((Integer)var4.getKey()).intValue(), 747474969);
         var2.method5689(((Integer)var4.getValue()).intValue(), 747474969);
      }

      var2.method5627(this.field1080 != null?this.field1080:"", 1374369899);
      var2.method5690(this.field1075, -1864827002);
      return var2;
   }

   static final void method1936(String var0, byte var1) {
      class16.method165("Please remove " + var0 + " from your ignore list first", 62688093);
   }
}
