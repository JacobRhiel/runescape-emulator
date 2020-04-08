package src;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public abstract class class183 {

   static class226 field2106;
   public int field2104;
   public int field2103;
   public int field2102;
   public int field2105;


   public abstract boolean vmethod3646(int var1, int var2, int var3, class181 var4, byte var5);

   protected static int method3650(byte var0) {
      int var1 = 0;
      if(class62.field492 == null || !class62.field492.isValid()) {
         try {
            Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var2.hasNext()) {
               GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
               if(var3.isValid()) {
                  class62.field492 = var3;
                  class62.field499 = -1L;
                  class62.field504 = -1L;
               }
            }
         } catch (Throwable var12) {
            ;
         }
      }

      if(class62.field492 != null) {
         long var10 = class217.method4014(-1011405685);
         long var4 = class62.field492.getCollectionTime();
         if(-1L != class62.field504) {
            long var6 = var4 - class62.field504;
            long var8 = var10 - class62.field499;
            if(var8 != 0L) {
               var1 = (int)(100L * var6 / var8);
            }
         }

         class62.field504 = var4;
         class62.field499 = var10;
      }

      return var1;
   }
}
