package src;

public class class110 {

   int field1367;
   class126[] field1365 = new class126[10];
   int field1366;


   class110(class309 var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.readUnsignedByte((byte)117);
         if(var3 != 0) {
            --var1.field3710;
            this.field1365[var2] = new class126();
            this.field1365[var2].method2831(var1);
         }
      }

      this.field1367 = var1.readShort((byte)69);
      this.field1366 = var1.readShort((byte)92);
   }

   final byte[] method2446() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field1365[var2] != null && this.field1365[var2].field1530 + this.field1365[var2].field1531 > var1) {
            var1 = this.field1365[var2].field1530 + this.field1365[var2].field1531;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var2 = var1 * 22050 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if(this.field1365[var4] != null) {
               int var5 = this.field1365[var4].field1530 * 22050 / 1000;
               int var6 = this.field1365[var4].field1531 * 22050 / 1000;
               int[] var7 = this.field1365[var4].method2830(var5, this.field1365[var4].field1530);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = (var7[var8] >> 8) + var3[var8 + var6];
                  if((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public class112 method2452() {
      byte[] var1 = this.method2446();
      return new class112(22050, var1, this.field1367 * 22050 / 1000, this.field1366 * 22050 / 1000);
   }

   public final int method2457() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field1365[var2] != null && this.field1365[var2].field1531 / 20 < var1) {
            var1 = this.field1365[var2].field1531 / 20;
         }
      }

      if(this.field1367 < this.field1366 && this.field1367 / 20 < var1) {
         var1 = this.field1367 / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.field1365[var2] != null) {
               this.field1365[var2].field1531 -= var1 * 20;
            }
         }

         if(this.field1367 < this.field1366) {
            this.field1367 -= var1 * 20;
            this.field1366 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public static class110 method2455(class243 var0, int var1, int var2) {
      byte[] var3 = var0.method4224(var1, var2, (byte)-10);
      return var3 == null?null:new class110(new class309(var3));
   }
}
