package src;

final class class4 implements class0 {

   static byte[][] field24;
   static int field20;
   static class334[] field26;
   static class333 field21;


   void method61(String var1, class309 var2, int var3) {
      var2.method5627(var1, 839009679);
   }

   public Object vmethod74(class309 var1, int var2) {
      return var1.method5667(-1551573571);
   }

   public void vmethod64(Object var1, class309 var2, byte var3) {
      this.method61((String)var1, var2, -1770492713);
   }

   static final void method73(int var0, int var1) {
      if(class81.method1900(var0, -1438738018)) {
         class226[] var2 = class226.field2693[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class226 var4 = var2[var3];
            if(var4 != null) {
               var4.field2587 = 0;
               var4.field2696 = 0;
            }
         }

      }
   }

   static final int method63(int var0, int var1, byte var2) {
      int var3 = var1 * 57 + var0;
      var3 ^= var3 << 13;
      int var4 = var3 * (var3 * var3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }

   static final void method72(class308 var0, int var1, int var2) {
      int var3 = var0.field3710;
      class98.field1265 = 0;
      class40.method648(var0, (byte)30);

      for(int var4 = 0; var4 < class98.field1265; ++var4) {
         int playerIndex = class98.field1279[var4];
         class75 var6 = client.players[playerIndex];
         int mask = var0.readUnsignedByte((byte)44);
         if((mask & 64) != 0) {
            mask += var0.readUnsignedByte((byte)89) << 8;
         }

         System.out.println("update: " + mask + ", " + var0 + ", " + playerIndex + ", " + var6);

         class20.method239(var0, playerIndex, var6, mask, 160137381);
      }

      System.out.println(var0.field3710 + ", " + var3 + ", " + var1);

      if(var0.field3710 - var3 != var1) {
         throw new RuntimeException(var0.field3710 - var3 + " " + var1);
      }
   }
}
