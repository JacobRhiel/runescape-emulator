package src;

public class class128 implements class148 {

   static int field1549;
   static int field1551;
   int field1547 = 128;
   double field1546 = 1.0D;
   class133[] field1545;
   class271 field1543 = new class271();
   int field1552 = 0;
   int field1544;
   class243 field1548;


   public class128(class243 var1, class243 var2, int var3, double var4, int var6) {
      this.field1548 = var2;
      this.field1544 = var3;
      this.field1552 = this.field1544;
      this.field1546 = var4;
      this.field1547 = var6;
      int[] var7 = var1.method4234(0, 1090009385);
      int var8 = var7.length;
      this.field1545 = new class133[var1.method4246(0, (byte)16)];

      for(int var9 = 0; var9 < var8; ++var9) {
         class309 var10 = new class309(var1.method4224(0, var7[var9], (byte)-71));
         this.field1545[var7[var9]] = new class133(var10);
      }

   }

   public void method2844(int var1) {
      for(int var2 = 0; var2 < this.field1545.length; ++var2) {
         if(this.field1545[var2] != null) {
            this.field1545[var2].method2941();
         }
      }

      this.field1543 = new class271();
      this.field1552 = this.field1544;
   }

   public int vmethod3372(int var1, short var2) {
      return this.field1545[var1] != null?this.field1545[var1].field1641:0;
   }

   public void method2839(double var1) {
      this.field1546 = var1;
      this.method2844(1865024943);
   }

   public int[] vmethod3376(int var1, int var2) {
      class133 var3 = this.field1545[var1];
      if(var3 != null) {
         if(var3.field1637 != null) {
            this.field1543.method4927(var3);
            var3.field1646 = true;
            return var3.field1637;
         }

         boolean var4 = var3.method2940(this.field1546, this.field1547, this.field1548);
         if(var4) {
            if(this.field1552 == 0) {
               class133 var5 = (class133)this.field1543.method4930();
               var5.method2941();
            } else {
               --this.field1552;
            }

            this.field1543.method4927(var3);
            var3.field1646 = true;
            return var3.field1637;
         }
      }

      return null;
   }

   public boolean vmethod3380(int var1, int var2) {
      return this.field1547 == 64;
   }

   public boolean vmethod3374(int var1, int var2) {
      return this.field1545[var1].field1638;
   }

   public int method2838(int var1) {
      int var2 = 0;
      int var3 = 0;
      class133[] var4 = this.field1545;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class133 var6 = var4[var5];
         if(var6 != null && var6.field1639 != null) {
            var2 += var6.field1639.length;
            int[] var7 = var6.field1639;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               int var9 = var7[var8];
               if(this.field1548.method4227(var9, -700946668)) {
                  ++var3;
               }
            }
         }
      }

      if(var2 == 0) {
         return 0;
      } else {
         return var3 * 100 / var2;
      }
   }

   public void method2845(int var1, int var2) {
      for(int var3 = 0; var3 < this.field1545.length; ++var3) {
         class133 var4 = this.field1545[var3];
         if(var4 != null && var4.field1643 != 0 && var4.field1646) {
            var4.method2942(var1);
            var4.field1646 = false;
         }
      }

   }
}
