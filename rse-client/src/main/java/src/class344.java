package src;

public class class344 {

   static int[] field4034;
   int[] field4032;


   public class344(int[] var1) {
      int var2;
      for(var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
         ;
      }

      this.field4032 = new int[var2 + var2];

      int var3;
      for(var3 = 0; var3 < var2 + var2; ++var3) {
         this.field4032[var3] = -1;
      }

      int var4;
      for(var3 = 0; var3 < var1.length; this.field4032[var4 + var4 + 1] = var3++) {
         for(var4 = var1[var3] & var2 - 1; this.field4032[var4 + var4 + 1] != -1; var4 = var4 + 1 & var2 - 1) {
            ;
         }

         this.field4032[var4 + var4] = var1[var3];
      }

   }

   public int method6594(int var1, int var2) {
      int var3 = (this.field4032.length >> 1) - 1;
      int var4 = var1 & var3;

      while(true) {
         int var5 = this.field4032[var4 + var4 + 1];
         if(var5 == -1) {
            return -1;
         }

         if(this.field4032[var4 + var4] == var1) {
            return var5;
         }

         var4 = var4 + 1 & var3;
      }
   }
}
