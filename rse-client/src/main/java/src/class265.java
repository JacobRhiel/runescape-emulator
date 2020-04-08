package src;

public class class265 implements class203 {

   static final class265 field3458 = new class265(2, 0);
   static final class265 field3452 = new class265(0, 1);
   static final class265 field3453 = new class265(1, 2);
   static int field3456;
   public final int field3454;
   final int field3455;


   class265(int var1, int var2) {
      this.field3454 = var1;
      this.field3455 = var2;
   }

   public int vmethod6149(byte var1) {
      return this.field3455;
   }

   static long method4753(int var0, int var1, int var2, byte var3) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   public static byte[] method4758(byte[] var0, int var1) {
      int var2 = var0.length;
      byte[] var3 = new byte[var2];
      System.arraycopy(var0, 0, var3, 0, var2);
      return var3;
   }
}
