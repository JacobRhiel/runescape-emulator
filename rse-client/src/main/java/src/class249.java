package src;

public class class249 extends class184 {

   static class154 field3198 = new class154(64);
   static class243 field3199;
   public int field3197 = 0;


   void method4418(class309 var1, int var2, int var3) {
      if(var2 == 2) {
         this.field3197 = var1.readShort((byte)6);
      }

   }

   void method4417(class309 var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)61);
         if(var3 == 0) {
            return;
         }

         this.method4418(var1, var3, -72548916);
      }
   }

   static final void method4419(int var0) {
      if(class71.field610 != client.field695) {
         client.field695 = class71.field610;
         int var1 = class71.field610;
         int[] var2 = class317.field3790.field3896;
         int var3 = var2.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            var2[var4] = 0;
         }

         int var5;
         int var6;
         for(var4 = 1; var4 < 103; ++var4) {
            var5 = (103 - var4) * 2048 + 24628;

            for(var6 = 1; var6 < 103; ++var6) {
               if((class64.field535[var1][var6][var4] & 24) == 0) {
                  class14.field60.method3345(var2, var5, 512, var1, var6, var4);
               }

               if(var1 < 3 && (class64.field535[var1 + 1][var6][var4] & 8) != 0) {
                  class14.field60.method3345(var2, var5, 512, var1 + 1, var6, var4);
               }

               var5 += 4;
            }
         }

         var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
         var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
         class317.field3790.method6179();

         int var7;
         for(var6 = 1; var6 < 103; ++var6) {
            for(var7 = 1; var7 < 103; ++var7) {
               if((class64.field535[var1][var7][var6] & 24) == 0) {
                  class65.method1243(var1, var7, var6, var4, var5, (byte)-113);
               }

               if(var1 < 3 && (class64.field535[var1 + 1][var7][var6] & 8) != 0) {
                  class65.method1243(var1 + 1, var7, var6, var4, var5, (byte)-16);
               }
            }
         }

         client.field906 = 0;

         for(var6 = 0; var6 < 104; ++var6) {
            for(var7 = 0; var7 < 104; ++var7) {
               long var8 = class14.field60.method3309(class71.field610, var6, var7);
               if(0L != var8) {
                  int var10 = class31.method387(var8);
                  int var11 = class33.method435(var10, 1650295452).field3372;
                  if(var11 >= 0) {
                     client.field885[client.field906] = class25.method279(var11, 823502327).method4443(false, 2050095285);
                     client.field907[client.field906] = var6;
                     client.field867[client.field906] = var7;
                     ++client.field906;
                  }
               }
            }
         }

         class206.field2411.method6138(937412832);
      }

   }
}
