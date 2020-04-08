package src;

public class class291 extends class286 {

   public class272 field3615 = new class272();
   int field3618 = 1;
   final class347 field3617;


   public class291(class347 var1) {
      super(400);
      this.field3617 = var1;
   }

   public void method5231(class309 var1, int var2, byte var3) {
      while(true) {
         if(var1.field3710 < var2) {
            boolean var4 = var1.readUnsignedByte((byte)125) == 1;
            class292 var5 = new class292(var1.method5667(-1886250135), this.field3617);
            class292 var6 = new class292(var1.method5667(-283030505), this.field3617);
            int var7 = var1.readShort((byte)56);
            int var8 = var1.readUnsignedByte((byte)66);
            int var9 = var1.readUnsignedByte((byte)61);
            boolean var10 = (var9 & 2) != 0;
            boolean var11 = (var9 & 1) != 0;
            if(var7 > 0) {
               var1.method5667(-2117271640);
               var1.readUnsignedByte((byte)76);
               var1.method5552(297718403);
            }

            var1.method5667(-588780588);
            if(var5 != null && var5.method5239(-1005152425)) {
               class293 var12 = (class293)this.method5119(var5, -678771148);
               if(var4) {
                  class293 var13 = (class293)this.method5119(var6, -678771148);
                  if(var13 != null && var12 != var13) {
                     if(var12 != null) {
                        this.method5195(var13, 1142152566);
                     } else {
                        var12 = var13;
                     }
                  }
               }

               if(var12 != null) {
                  this.method5127(var12, var5, var6, -1339228717);
                  if(var7 != var12.field3610) {
                     boolean var15 = true;

                     for(class295 var14 = (class295)this.field3615.method4965(); var14 != null; var14 = (class295)this.field3615.method4961()) {
                        if(var14.field3638.equals(var5)) {
                           if(var7 != 0 && var14.field3637 == 0) {
                              var14.method3654();
                              var15 = false;
                           } else if(var7 == 0 && var14.field3637 != 0) {
                              var14.method3654();
                              var15 = false;
                           }
                        }
                     }

                     if(var15) {
                        this.field3615.method4960(new class295(var5, var7));
                     }
                  }
               } else {
                  if(this.method5115((byte)4) >= 400) {
                     continue;
                  }

                  var12 = (class293)this.method5184(var5, var6, (byte)1);
               }

               if(var7 != var12.field3610) {
                  var12.field3609 = ++this.field3618 - 1;
                  if(var12.field3610 == -1 && var7 == 0) {
                     var12.field3609 = -(var12.field3609 * -1563374063) * 1414783729;
                  }

                  var12.field3610 = var7;
               }

               var12.field3611 = var8;
               var12.field3625 = var10;
               var12.field3623 = var11;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method5126((short)2238);
         return;
      }
   }

   class283 vmethod5269(int var1) {
      return new class293();
   }

   public boolean method5236(class292 var1, boolean var2, int var3) {
      class293 var4 = (class293)this.method5202(var1, 2044020824);
      return var4 == null?false:!var2 || var4.field3610 != 0;
   }

   class283[] vmethod5281(int var1, int var2) {
      return new class293[var1];
   }
}
