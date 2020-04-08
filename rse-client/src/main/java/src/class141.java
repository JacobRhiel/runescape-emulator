package src;

public class class141 extends class189 {

   int field1806;
   int field1807;
   int[] field1809;
   int[][] field1808;


   class141(int var1, byte[] var2) {
      this.field1806 = var1;
      class309 var3 = new class309(var2);
      this.field1807 = var3.readUnsignedByte((byte)86);
      this.field1809 = new int[this.field1807];
      this.field1808 = new int[this.field1807][];

      int var4;
      for(var4 = 0; var4 < this.field1807; ++var4) {
         this.field1809[var4] = var3.readUnsignedByte((byte)44);
      }

      for(var4 = 0; var4 < this.field1807; ++var4) {
         this.field1808[var4] = new int[var3.readUnsignedByte((byte)36)];
      }

      for(var4 = 0; var4 < this.field1807; ++var4) {
         for(int var5 = 0; var5 < this.field1808[var4].length; ++var5) {
            this.field1808[var4][var5] = var3.readUnsignedByte((byte)13);
         }
      }

   }

   static void method3161(int var0, String var1, String var2, int var3) {
      class103.method2341(var0, var1, var2, (String)null, -443301245);
   }

   static final void method3160(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      class77 var10 = null;

      for(class77 var11 = (class77)client.field697.method4931(); var11 != null; var11 = (class77)client.field697.method4949()) {
         if(var0 == var11.field962 && var11.field960 == var1 && var2 == var11.field961 && var3 == var11.field959) {
            var10 = var11;
            break;
         }
      }

      if(var10 == null) {
         var10 = new class77();
         var10.field962 = var0;
         var10.field959 = var3;
         var10.field960 = var1;
         var10.field961 = var2;
         class29.method348(var10, (byte)21);
         client.field697.method4952(var10);
      }

      var10.field964 = var4;
      var10.field967 = var5;
      var10.field966 = var6;
      var10.field965 = var7;
      var10.field969 = var8;
   }
}
