package src;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

public final class class54 implements KeyListener, FocusListener {

   public static class54 field413 = new class54();
   public static int field429 = 0;
   static int[] field438 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   public static boolean[] field426 = new boolean[112];
   public static int[] field427 = new int[128];
   public static int field439 = 0;
   public static int field433 = 0;
   static char[] field424 = new char[128];
   public static int field434 = 0;
   static int[] field414 = new int[128];
   public static int[] field432 = new int[128];
   public static int field417 = 0;
   public static volatile int field437 = 0;
   public static int field436 = 0;
   static int[] field441;


   public final synchronized void keyReleased(KeyEvent var1) {
      if(field413 != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < field438.length) {
            var2 = field438[var2] & -129;
         } else {
            var2 = -1;
         }

         if(field429 >= 0 && var2 >= 0) {
            field427[field429] = ~var2;
            field429 = field429 + 1 & 127;
            if(field439 == field429) {
               field429 = -1;
            }
         }
      }

      var1.consume();
   }

   public final void focusGained(FocusEvent var1) {}

   public final synchronized void keyPressed(KeyEvent var1) {
      if(field413 != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < field438.length) {
            var2 = field438[var2];
            if((var2 & 128) != 0) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if(field429 >= 0 && var2 >= 0) {
            field427[field429] = var2;
            field429 = field429 + 1 & 127;
            if(field429 == field439) {
               field429 = -1;
            }
         }

         int var3;
         if(var2 >= 0) {
            var3 = field433 + 1 & 127;
            if(var3 != field434) {
               field414[field433] = var2;
               field424[field433] = 0;
               field433 = var3;
            }
         }

         var3 = var1.getModifiers();
         if((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
            var1.consume();
         }
      }

   }

   public final void keyTyped(KeyEvent var1) {
      if(field413 != null) {
         char var2 = var1.getKeyChar();
         if(var2 != 0 && var2 != '\uffff') {
            boolean var3;
            if((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
               label56: {
                  if(var2 != 0) {
                     char[] var7 = class297.field3641;

                     for(int var5 = 0; var5 < var7.length; ++var5) {
                        char var6 = var7[var5];
                        if(var6 == var2) {
                           var3 = true;
                           break label56;
                        }
                     }
                  }

                  var3 = false;
               }
            } else {
               var3 = true;
            }

            if(var3) {
               int var4 = field433 + 1 & 127;
               if(var4 != field434) {
                  field414[field433] = -1;
                  field424[field433] = var2;
                  field433 = var4;
               }
            }
         }
      }

      var1.consume();
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if(field413 != null) {
         field429 = -1;
      }

   }

   public static class352 method919(String var0, String var1, boolean var2, int var3) {
      File var4 = new File(class92.field1180, "preferences" + var0 + ".dat");
      if(var4.exists()) {
         try {
            class352 var11 = new class352(var4, "rw", 10000L);
            return var11;
         } catch (IOException var10) {
            ;
         }
      }

      String var5 = "";
      if(class8.field40 == 33) {
         var5 = "_rc";
      } else if(class8.field40 == 34) {
         var5 = "_wip";
      }

      File var6 = new File(class30.field212, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      class352 var7;
      if(!var2 && var6.exists()) {
         try {
            var7 = new class352(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
            ;
         }
      }

      try {
         var7 = new class352(var4, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }

   public static class191[] method938(byte var0) {
      return new class191[]{class191.field2131, class191.field2119, class191.field2149, class191.field2121, class191.field2122, class191.field2123, class191.field2124, class191.field2169, class191.field2126, class191.field2127, class191.field2197, class191.field2186, class191.field2128, class191.field2132, class191.field2125, class191.field2133, class191.field2134, class191.field2139, class191.field2204, class191.field2137, class191.field2172, class191.field2163, class191.field2140, class191.field2118, class191.field2142, class191.field2143, class191.field2144, class191.field2145, class191.field2151, class191.field2147, class191.field2148, class191.field2136, class191.field2150, class191.field2141, class191.field2129, class191.field2153, class191.field2154, class191.field2155, class191.field2159, class191.field2157, class191.field2158, class191.field2178, class191.field2160, class191.field2161, class191.field2192, class191.field2168, class191.field2164, class191.field2165, class191.field2166, class191.field2167, class191.field2203, class191.field2162, class191.field2170, class191.field2171, class191.field2138, class191.field2173, class191.field2179, class191.field2175, class191.field2176, class191.field2194, class191.field2146, class191.field2152, class191.field2180, class191.field2181, class191.field2182, class191.field2183, class191.field2184, class191.field2120, class191.field2185, class191.field2187, class191.field2188, class191.field2177, class191.field2190, class191.field2191, class191.field2189, class191.field2193, class191.field2130, class191.field2195, class191.field2196, class191.field2174, class191.field2198, class191.field2199, class191.field2200, class191.field2201, class191.field2202, class191.field2156};
   }

   public static void method940(class243 var0, int var1) {
      class260.field3305 = var0;
   }

   static final void method939(class78 var0, int var1, byte var2) {
      class28.method308(var0.field983, var0.field973, var1, -1795572864);
   }
}
