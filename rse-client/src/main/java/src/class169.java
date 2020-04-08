package src;

public class class169 implements class203 {

   public static final class169 field2012 = new class169(0, 0);
   public static final class169 field2007 = new class169(1, 1);
   public static final class169 field2008 = new class169(3, 2);
   public static final class169 field2006 = new class169(2, 3);
   public static boolean field2010;
   static class333[] field2009;
   final int field2011;
   public final int field2014;


   class169(int var1, int var2) {
      this.field2014 = var1;
      this.field2011 = var2;
   }

   public int vmethod6149(byte var1) {
      return this.field2011;
   }

   public static final void method3527(long var0) {
      if(var0 > 0L) {
         if(0L == var0 % 10L) {
            long var2 = var0 - 1L;

            try {
               Thread.sleep(var2);
            } catch (InterruptedException var8) {
               ;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var7) {
               ;
            }
         } else {
            try {
               Thread.sleep(var0);
            } catch (InterruptedException var6) {
               ;
            }
         }

      }
   }

   static int method3531(int var0, int var1, int var2) {
      class267 var3 = class161.method3477(var0, -1711395255);
      if(var3 == null) {
         return var1;
      } else if(var3.field3508 >= 0) {
         return var3.field3508 | -16777216;
      } else {
         int var5;
         int var6;
         if(var3.field3509 >= 0) {
            var5 = class139.field1781.vmethod3372(var3.field3509, (short)-29708);
            byte var12 = 96;
            int var4;
            if(var5 == -2) {
               var4 = 12345678;
            } else if(var5 == -1) {
               if(var12 < 0) {
                  var12 = 0;
               } else if(var12 > 127) {
                  var12 = 127;
               }

               var6 = 127 - var12;
               var4 = var6;
            } else {
               var6 = var12 * (var5 & 127) / 128;
               if(var6 < 2) {
                  var6 = 2;
               } else if(var6 > 126) {
                  var6 = 126;
               }

               var4 = var6 + (var5 & '\uff80');
            }

            return class139.field1790[var4] | -16777216;
         } else if(var3.field3497 == 16711935) {
            return var1;
         } else {
            var5 = var3.field3502;
            var6 = var3.field3503;
            int var7 = var3.field3505;
            if(var7 > 179) {
               var6 /= 2;
            }

            if(var7 > 192) {
               var6 /= 2;
            }

            if(var7 > 217) {
               var6 /= 2;
            }

            if(var7 > 243) {
               var6 /= 2;
            }

            int var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10);
            byte var10 = 96;
            int var9;
            if(var8 == -2) {
               var9 = 12345678;
            } else {
               int var13;
               if(var8 == -1) {
                  if(var10 < 0) {
                     var10 = 0;
                  } else if(var10 > 127) {
                     var10 = 127;
                  }

                  var13 = 127 - var10;
                  var9 = var13;
               } else {
                  var13 = var10 * (var8 & 127) / 128;
                  if(var13 < 2) {
                     var13 = 2;
                  } else if(var13 > 126) {
                     var13 = 126;
                  }

                  var9 = var13 + (var8 & '\uff80');
               }
            }

            return class139.field1790[var9] | -16777216;
         }
      }
   }
}
