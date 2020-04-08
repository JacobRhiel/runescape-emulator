package src;

public class class321 {

   public int field3816 = -1;
   public int field3824 = -1;
   public int field3814 = -1;
   public int field3815 = -1;
   public int field3817 = -1;
   public int field3818 = -1;
   public int field3819 = -1;
   public int field3820 = -1;
   public int field3821 = -1;
   public int field3822 = -1;
   public int field3823 = -1;


   public void method5935(class243 var1, int var2) {
      byte[] var3 = var1.method4231(class320.field3811.field3809, -197924565);
      class309 var4 = new class309(var3);

      while(true) {
         int var5 = var4.readUnsignedByte((byte)93);
         if(var5 == 0) {
            return;
         }

         switch(var5) {
         case 1:
            var4.method5674((short)3112);
            break;
         case 2:
            this.field3816 = var4.method5564((byte)-73);
            this.field3824 = var4.method5564((byte)-14);
            this.field3814 = var4.method5564((byte)-13);
            this.field3815 = var4.method5564((byte)-65);
            this.field3817 = var4.method5564((byte)-47);
            this.field3818 = var4.method5564((byte)-79);
            this.field3819 = var4.method5564((byte)78);
            this.field3820 = var4.method5564((byte)-78);
            this.field3821 = var4.method5564((byte)-13);
            this.field3822 = var4.method5564((byte)-15);
            this.field3823 = var4.method5564((byte)19);
         }
      }
   }

   static double method5934(double var0, double var2, double var4) {
      double var8 = (var0 - var2) / var4;
      double var6 = Math.exp(-var8 * var8 / 2.0D) / Math.sqrt(6.283185307179586D);
      return var6 / var4;
   }

   public static int method5932(class309 var0, String var1, byte var2) {
      int var3 = var0.field3710;
      byte[] var4 = class44.method715(var1, (byte)-93);
      var0.method5574(var4.length, (byte)-13);
      var0.field3710 += class219.field2513.method4018(var4, 0, var4.length, var0.field3709, var0.field3710, (byte)77);
      return var0.field3710 - var3;
   }
}
