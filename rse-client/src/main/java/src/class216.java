package src;

import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

public class class216 {

   public static final String[][] field2504 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
   public static final String[] field2502 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   public static Calendar field2503;


   static {
      Calendar.getInstance();
      field2503 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }

   public static int method4012(int var0, int var1) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   static void method4011(int var0) {
      if(class94.field1205) {
         class143.field1878 = null;
         class76.field674 = null;
         class94.field1190 = null;
         class94.field1193 = null;
         class215.field2501 = null;
         class3.field18 = null;
         class317.field3784 = null;
         class4.field21 = null;
         class94.field1194 = null;
         class69.field588 = null;
         class16.field79 = null;
         class34.field246 = null;
         class348.field4064 = null;
         class68.field572 = null;
         class173.field2027.method1895(41185107);
         class206.field2406 = 1;
         class206.field2407 = null;
         class206.field2408 = -1;
         class206.field2413 = -1;
         class219.field2514 = 0;
         class19.field106 = false;
         class93.field1187 = 2;
         if(class246.field3180 != null) {
            try {
               class309 var1 = new class309(4);
               var1.method5531(2, 1258821856);
               var1.method5588(0, -991512151);
               class246.field3180.vmethod5878(var1.field3709, 0, 4, 567335408);
            } catch (IOException var4) {
               try {
                  class246.field3180.vmethod5866((byte)-98);
               } catch (Exception var3) {
                  ;
               }

               ++class246.field3183;
               class246.field3180 = null;
            }
         }

         class94.field1205 = false;
      }
   }
}
