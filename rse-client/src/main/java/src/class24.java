package src;

public class class24 extends class30 {

   static String field137;
   static class304 field140;
   static int[] field142;
   static byte[][] field139;


   void method264(class309 var1, int var2) {
      int var3 = var1.readUnsignedByte((byte)48);
      if(var3 != class40.field302.field310) {
         throw new IllegalStateException("");
      } else {
         super.field199 = var1.readUnsignedByte((byte)35);
         super.field200 = var1.readUnsignedByte((byte)27);
         super.field203 = var1.readShort((byte)117);
         super.field195 = var1.readShort((byte)108);
         super.field197 = var1.readShort((byte)7);
         super.field198 = var1.readShort((byte)55);
         super.field201 = var1.method5564((byte)21);
         super.field202 = var1.method5564((byte)34);
      }
   }

   void vmethod806(class309 var1, byte var2) {
      super.field200 = Math.min(super.field200, 4);
      super.field204 = new short[1][64][64];
      super.field196 = new short[super.field200][64][64];
      super.field205 = new byte[super.field200][64][64];
      super.field206 = new byte[super.field200][64][64];
      super.field207 = new class34[super.field200][64][64][];
      int var3 = var1.readUnsignedByte((byte)47);
      if(var3 != class39.field300.field298) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.readUnsignedByte((byte)69);
         int var5 = var1.readUnsignedByte((byte)16);
         if(var4 == super.field197 && var5 == super.field198) {
            for(int var6 = 0; var6 < 64; ++var6) {
               for(int var7 = 0; var7 < 64; ++var7) {
                  this.method354(var6, var7, var1, (byte)20);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof class24)) {
         return false;
      } else {
         class24 var2 = (class24)var1;
         return super.field197 == var2.field197 && var2.field198 == super.field198;
      }
   }

   public int hashCode() {
      return super.field197 | super.field198 << 8;
   }

   static final void method263(int var0) {
      client.field874 = client.field865;
      class281.field3582 = true;
   }

   static final void method275(byte[] var0, int var1, int var2, int var3, int var4, class181[] var5, byte var6) {
      int var8;
      int var9;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if(var8 + var1 > 0 && var8 + var1 < 103 && var9 + var2 > 0 && var9 + var2 < 103) {
                  var5[var7].field2092[var8 + var1][var9 + var2] &= -16777217;
               }
            }
         }
      }

      class309 var11 = new class309(var0);

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var10 = 0; var10 < 64; ++var10) {
               class205.method3753(var11, var8, var9 + var1, var10 + var2, var3, var4, 0, (byte)16);
            }
         }
      }

   }
}
