package src;

import java.io.IOException;
import java.util.Comparator;

final class class19 implements Comparator {

   public static boolean field106;


   int method219(class16 var1, class16 var2, byte var3) {
      return var1.field85.field97 < var2.field85.field97?-1:(var2.field85.field97 == var1.field85.field97?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method219((class16)var1, (class16)var2, (byte)-48);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static int method225(byte[] var0, int var1, int var2) {
      int var4 = -1;

      for(int var5 = 0; var5 < var1; ++var5) {
         var4 = var4 >>> 8 ^ class309.field3714[(var4 ^ var0[var5]) & 255];
      }

      var4 = ~var4;
      return var4;
   }

   public static class262 method213(int var0, int var1) {
      class262 var2 = (class262)class262.field3323.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class262.field3324.method4224(32, var0, (byte)-31);
         var2 = new class262();
         if(var3 != null) {
            var2.method4602(new class309(var3), 1621555289);
         }

         class262.field3323.method3424(var2, (long)var0);
         return var2;
      }
   }

   public static void method222(class314 var0, boolean var1, byte var2) {
      if(class246.field3180 != null) {
         try {
            class246.field3180.vmethod5866((byte)-20);
         } catch (Exception var9) {
            ;
         }

         class246.field3180 = null;
      }

      class246.field3180 = var0;
      class309 var3;
      if(class246.field3180 != null) {
         try {
            var3 = new class309(4);
            var3.method5531(var1?2:3, 1258821856);
            var3.method5588(0, 1875521178);
            class246.field3180.vmethod5878(var3.field3709, 0, 4, -1587174832);
         } catch (IOException var8) {
            try {
               class246.field3180.vmethod5866((byte)-116);
            } catch (Exception var7) {
               ;
            }

            ++class246.field3183;
            class246.field3180 = null;
         }
      }

      class246.field3176.field3710 = 0;
      class246.field3181 = null;
      class246.field3177 = null;
      class246.field3178 = 0;

      while(true) {
         class242 var10 = (class242)class246.field3174.method5995();
         if(var10 == null) {
            while(true) {
               var10 = (class242)class246.field3175.method5995();
               if(var10 == null) {
                  if(class246.field3163 != 0) {
                     try {
                        var3 = new class309(4);
                        var3.method5531(4, 1258821856);
                        var3.method5531(class246.field3163, 1258821856);
                        var3.method5532(0, (byte)-21);
                        class246.field3180.vmethod5878(var3.field3709, 0, 4, 2040635438);
                     } catch (IOException var6) {
                        try {
                           class246.field3180.vmethod5866((byte)-122);
                        } catch (Exception var5) {
                           ;
                        }

                        ++class246.field3183;
                        class246.field3180 = null;
                     }
                  }

                  class246.field3168 = 0;
                  class246.field3165 = class217.method4014(-1809438324);
                  return;
               }

               class246.field3170.method4851(var10);
               class246.field3171.method5997(var10, var10.field2116);
               ++class246.field3172;
               --class246.field3173;
            }
         }

         class246.field3166.method5997(var10, var10.field2116);
         ++class246.field3167;
         --class246.field3169;
      }
   }

   public static class226 method224(int var0, int var1, int var2) {
      class226 var3 = class208.method3898(var0, (byte)-55);
      return var1 == -1?var3:(var3 != null && var3.field2697 != null && var1 < var3.field2697.length?var3.field2697[var1]:null);
   }

   public static boolean method218(int var0, int var1) {
      return (var0 >> 20 & 1) != 0;
   }
}
