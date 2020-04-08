package src;

public class class55 implements class108 {

   public class114 vmethod2428(int var1) {
      return new class59();
   }

   public static String method948(CharSequence var0, int var1) {
      String var2 = class309.method5764(class246.method4376(var0, 706335608));
      if(var2 == null) {
         var2 = "";
      }

      return var2;
   }

   static final void method946(String var0, int var1) {
      class16.method165(var0 + " is already on your friend list", 62688093);
   }

   static int method945(class80 var0, class80 var1, int var2, boolean var3, byte var4) {
      if(var2 == 1) {
         int var5 = var0.field1050;
         int var6 = var1.field1050;
         if(!var3) {
            if(var5 == -1) {
               var5 = 2001;
            }

            if(var6 == -1) {
               var6 = 2001;
            }
         }

         return var5 - var6;
      } else {
         return var2 == 2?var0.field1053 - var1.field1053:(var2 == 3?(var0.field1052.equals("-")?(var1.field1052.equals("-")?0:(var3?-1:1)):(var1.field1052.equals("-")?(var3?1:-1):var0.field1052.compareTo(var1.field1052))):(var2 == 4?(var0.method1857((byte)53)?(var1.method1857((byte)-93)?0:1):(var1.method1857((byte)-122)?-1:0)):(var2 == 5?(var0.method1855(-1374980076)?(var1.method1855(-1374980076)?0:1):(var1.method1855(-1374980076)?-1:0)):(var2 == 6?(var0.method1856(-2127358305)?(var1.method1856(-261659707)?0:1):(var1.method1856(931649713)?-1:0)):(var2 == 7?(var0.method1886((byte)63)?(var1.method1886((byte)70)?0:1):(var1.method1886((byte)-22)?-1:0)):var0.field1040 - var1.field1040)))));
      }
   }

   static final int method947(int var0, int var1, int var2, int var3) {
      if(var2 > 179) {
         var1 /= 2;
      }

      if(var2 > 192) {
         var1 /= 2;
      }

      if(var2 > 217) {
         var1 /= 2;
      }

      if(var2 > 243) {
         var1 /= 2;
      }

      int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var4;
   }
}
