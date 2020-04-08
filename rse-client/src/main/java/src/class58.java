package src;

import javax.imageio.ImageIO;

public class class58 {

   public static class243 field453;
   static long field455;


   static {
      ImageIO.setUseCache(false);
   }

   static void method966(byte var0) {
      for(class70 var1 = (class70)client.field841.method5995(); var1 != null; var1 = (class70)client.field841.method6003()) {
         int var2 = var1.field599;
         if(class81.method1900(var2, -1099077426)) {
            boolean var3 = true;
            class226[] var4 = class226.field2693[var2];

            int var5;
            for(var5 = 0; var5 < var4.length; ++var5) {
               if(var4[var5] != null) {
                  var3 = var4[var5].field2566;
                  break;
               }
            }

            if(!var3) {
               var5 = (int)var1.field2116;
               class226 var6 = class208.method3898(var5, (byte)-55);
               if(var6 != null) {
                  class68.method1273(var6, 1588099781);
               }
            }
         }
      }

   }

   public static int method963(int var0, int var1, int var2) {
      return (var0 + '\u9c40' << 8) + var1;
   }

   static void method968(int var0, int var1, int var2) {
      class196 var3 = class146.method3363(class192.field2291, client.field761.field1340, -2039559999);
      var3.field2338.method5591(var0, -233666609);
      var3.field2338.method5582(var1, 70039705);
      client.field761.method2361(var3, 590976181);
   }

   public static class261 method967(int var0, byte var1) {
      class261 var2 = (class261)class261.field3312.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class261.field3319.method4224(8, var0, (byte)-68);
         var2 = new class261();
         if(var3 != null) {
            var2.method4587(new class309(var3), 1803562371);
         }

         class261.field3312.method3424(var2, (long)var0);
         return var2;
      }
   }

   static int method965(int var0, byte var1) {
      class73 var2 = (class73)class100.field1291.method5968((long)var0);
      return var2 == null?-1:(var2.field2107 == class100.field1290.field3542?-1:((class73)var2.field2107).field622);
   }
}
