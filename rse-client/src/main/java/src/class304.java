package src;

public final class class304 extends class305 {

   public class304(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class304(byte[] var1) {
      super(var1);
   }

   final void vmethod5439(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var3 * class330.field3865 + var2;
      int var8 = class330.field3865 - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var3 < class330.field3862) {
         var11 = class330.field3862 - var3;
         var5 -= var11;
         var3 = class330.field3862;
         var10 += var11 * var4;
         var7 += var11 * class330.field3865;
      }

      if(var3 + var5 > class330.field3866) {
         var5 -= var3 + var5 - class330.field3866;
      }

      if(var2 < class330.field3867) {
         var11 = class330.field3867 - var2;
         var4 -= var11;
         var2 = class330.field3867;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var2 + var4 > class330.field3868) {
         var11 = var2 + var4 - class330.field3868;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var4 > 0 && var5 > 0) {
         class305.method5406(class330.field3864, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   final void vmethod5477(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3 * class330.field3865 + var2;
      int var9 = class330.field3865 - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if(var3 < class330.field3862) {
         var12 = class330.field3862 - var3;
         var5 -= var12;
         var3 = class330.field3862;
         var11 += var12 * var4;
         var8 += var12 * class330.field3865;
      }

      if(var3 + var5 > class330.field3866) {
         var5 -= var3 + var5 - class330.field3866;
      }

      if(var2 < class330.field3867) {
         var12 = class330.field3867 - var2;
         var4 -= var12;
         var2 = class330.field3867;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if(var2 + var4 > class330.field3868) {
         var12 = var2 + var4 - class330.field3868;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if(var4 > 0 && var5 > 0) {
         class305.method5408(class330.field3864, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
