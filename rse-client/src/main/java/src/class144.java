package src;

public abstract class class144 extends class184 {

   public int field1883 = 1000;


   protected class136 vmethod3353(int var1) {
      return null;
   }

   void vmethod3351(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      class136 var11 = this.vmethod3353(-2064792762);
      if(var11 != null) {
         this.field1883 = var11.field1883;
         var11.vmethod3351(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   public static boolean method3360(int var0, int var1) {
      return var0 >= class229.field2719.field2741 && var0 <= class229.field2739.field2741;
   }

   public static int method3358(byte[] var0, int var1, CharSequence var2, int var3) {
      int var4 = var2.length();
      int var5 = var1;

      for(int var6 = 0; var6 < var4; ++var6) {
         char var7 = var2.charAt(var6);
         if(var7 <= 127) {
            var0[var5++] = (byte)var7;
         } else if(var7 <= 2047) {
            var0[var5++] = (byte)(192 | var7 >> 6);
            var0[var5++] = (byte)(128 | var7 & 63);
         } else {
            var0[var5++] = (byte)(224 | var7 >> 12);
            var0[var5++] = (byte)(128 | var7 >> 6 & 63);
            var0[var5++] = (byte)(128 | var7 & 63);
         }
      }

      return var5 - var1;
   }
}
