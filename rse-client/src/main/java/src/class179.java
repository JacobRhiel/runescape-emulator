package src;

public abstract class class179 {

   static int field2061;


   public abstract int vmethod3578(int var1, int var2, int var3);

   public abstract void vmethod3577(int var1);

   public static int method3576(int var0, byte var1) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   static final void method3585(byte var0) {
      client.field873 = client.field865;
   }
}
