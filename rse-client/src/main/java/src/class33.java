package src;

public class class33 implements class46 {

   static int field243;
   int field232;
   int field233;
   int field234;
   int field240;
   int field239;
   int field238;
   int field241;
   int field236;
   int field235;
   int field237;


   public boolean vmethod872(int var1, int var2, int var3) {
      return var1 >> 6 >= this.field232 && var1 >> 6 <= this.field234 && var2 >> 6 >= this.field239 && var2 >> 6 <= this.field241;
   }

   public boolean vmethod871(int var1, int var2, int var3, int var4) {
      return var1 >= this.field233 && var1 < this.field233 + this.field240?var2 >> 6 >= this.field238 && var2 >> 6 <= this.field236 && var3 >> 6 >= this.field235 && var3 >> 6 <= this.field237:false;
   }

   public void vmethod870(class35 var1, int var2) {
      if(var1.field258 > this.field232) {
         var1.field258 = this.field232;
      }

      if(var1.field259 < this.field234) {
         var1.field259 = this.field234;
      }

      if(var1.field261 > this.field239) {
         var1.field261 = this.field239;
      }

      if(var1.field253 < this.field241) {
         var1.field253 = this.field241;
      }

   }

   public class222 vmethod890(int var1, int var2, int var3) {
      if(!this.vmethod872(var1, var2, -2098242270)) {
         return null;
      } else {
         int var4 = this.field238 * 64 - this.field232 * 64 + var1;
         int var5 = this.field235 * 64 - this.field239 * 64 + var2;
         return new class222(this.field233, var4, var5);
      }
   }

   public int[] vmethod873(int var1, int var2, int var3, int var4) {
      if(!this.vmethod871(var1, var2, var3, -97109790)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field232 * 64 - this.field238 * 64 + var2, var3 + (this.field239 * 64 - this.field235 * 64)};
         return var5;
      }
   }

   public void vmethod885(class309 var1, int var2) {
      this.field233 = var1.readUnsignedByte((byte)91);
      this.field240 = var1.readUnsignedByte((byte)35);
      this.field238 = var1.readShort((byte)52);
      this.field235 = var1.readShort((byte)25);
      this.field236 = var1.readShort((byte)65);
      this.field237 = var1.readShort((byte)86);
      this.field232 = var1.readShort((byte)18);
      this.field239 = var1.readShort((byte)46);
      this.field234 = var1.readShort((byte)79);
      this.field241 = var1.readShort((byte)91);
      this.method415(-1585844448);
   }

   void method415(int var1) {}

   public static class263 method435(int var0, int var1) {
      class263 var2 = (class263)class263.field3346.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class263.field3344.method4224(6, var0, (byte)-45);
         var2 = new class263();
         var2.field3351 = var0;
         if(var3 != null) {
            var2.method4635(new class309(var3), 680070630);
         }

         var2.method4634(-720129530);
         if(var2.field3383) {
            var2.field3361 = 0;
            var2.field3384 = false;
         }

         class263.field3346.method3424(var2, (long)var0);
         return var2;
      }
   }

   public static class194[] method434(int var0) {
      return new class194[]{class194.field2324, class194.field2325, class194.field2327, class194.field2326, class194.field2332, class194.field2328, class194.field2329, class194.field2330, class194.field2331, class194.field2323};
   }

   static boolean method433(char var0, int var1) {
      return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var0) != -1;
   }
}
