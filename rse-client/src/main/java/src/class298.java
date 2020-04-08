package src;

public final class class298 {

   static final char[] field3644 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   static long[] field3643 = new long[12];


   static {
      for(int var0 = 0; var0 < field3643.length; ++var0) {
         field3643[var0] = (long)Math.pow(37.0D, (double)var0);
      }

   }

   static class210 method5316(class243 var0, int var1, int var2) {
      byte[] var3 = var0.method4231(var1, 827257405);
      return var3 == null?null:new class210(var3);
   }
}
