package src;

import java.io.File;
import java.io.RandomAccessFile;

public class class137 {

   static boolean field1761 = false;
   static int field1754 = 0;
   static int field1752 = 0;
   static boolean field1755 = false;
   static int field1759 = 0;
   static long[] field1757 = new long[1000];
   static int field1756;
   static int field1758;
   static int field1753;


   public static File method3076(String var0, int var1) {
      if(!class178.field2056) {
         throw new RuntimeException("");
      } else {
         File var2 = (File)class178.field2059.get(var0);
         if(var2 != null) {
            return var2;
         } else {
            File var3 = new File(class178.field2057, var0);
            RandomAccessFile var4 = null;

            try {
               File var5 = new File(var3.getParent());
               if(!var5.exists()) {
                  throw new RuntimeException("");
               } else {
                  var4 = new RandomAccessFile(var3, "rw");
                  int var6 = var4.read();
                  var4.seek(0L);
                  var4.write(var6);
                  var4.seek(0L);
                  var4.close();
                  class178.field2059.put(var0, var3);
                  return var3;
               }
            } catch (Exception var9) {
               try {
                  if(var4 != null) {
                     var4.close();
                     var4 = null;
                  }
               } catch (Exception var8) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   static final void method3077(short var0) {
      client.field794 = 0;
      int var1 = (class311.field3717.field983 >> 7) + class69.field590 * 731242929;
      int var2 = (class311.field3717.field973 >> 7) + class89.field1152 * 1825982697;
      if(var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
         client.field794 = 1;
      }

      if(var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
         client.field794 = 1;
      }

      if(client.field794 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
         client.field794 = 0;
      }

   }

   static final void method3078(class226 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(client.field746) {
         client.field819 = 32;
      } else {
         client.field819 = 0;
      }

      client.field746 = false;
      int var8;
      if(class63.field521 == 1 || !class217.field2506 && class63.field521 == 4) {
         if(var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.field2589 -= 4;
            class68.method1273(var0, -517333796);
         } else if(var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.field2589 += 4;
            class68.method1273(var0, -208310014);
         } else if(var5 >= var1 - client.field819 && var5 < client.field819 + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var8 = var3 * (var3 - 32) / var4;
            if(var8 < 8) {
               var8 = 8;
            }

            int var9 = var6 - var2 - 16 - var8 / 2;
            int var10 = var3 - 32 - var8;
            var0.field2589 = var9 * (var4 - var3) / var10;
            class68.method1273(var0, -171493257);
            client.field746 = true;
         }
      }

      if(client.field878 != 0) {
         var8 = var0.field2582;
         if(var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.field2589 += client.field878 * 45;
            class68.method1273(var0, 5076211);
         }
      }

   }
}
