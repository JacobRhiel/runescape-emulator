package src;

public class class51 implements class46 {

   public static class304 field403;
   static int[][][] field404;
   int field398;
   int field400;
   int field396;
   int field393;
   int field402;
   int field394;
   int field395;
   int field401;
   int field397;
   int field399;


   public boolean vmethod872(int var1, int var2, int var3) {
      return var1 >= (this.field396 << 6) + (this.field400 << 3) && var1 <= (this.field396 << 6) + (this.field400 << 3) + 7 && var2 >= (this.field401 << 6) + (this.field395 << 3) && var2 <= (this.field401 << 6) + (this.field395 << 3) + 7;
   }

   public boolean vmethod871(int var1, int var2, int var3, int var4) {
      return var1 >= this.field398 && var1 < this.field398 + this.field393?var2 >= (this.field394 << 6) + (this.field402 << 3) && var2 <= (this.field394 << 6) + (this.field402 << 3) + 7 && var3 >= (this.field397 << 6) + (this.field399 << 3) && var3 <= (this.field397 << 6) + (this.field399 << 3) + 7:false;
   }

   public void vmethod870(class35 var1, int var2) {
      if(var1.field258 > this.field396) {
         var1.field258 = this.field396;
      }

      if(var1.field259 < this.field396) {
         var1.field259 = this.field396;
      }

      if(var1.field261 > this.field401) {
         var1.field261 = this.field401;
      }

      if(var1.field253 < this.field401) {
         var1.field253 = this.field401;
      }

   }

   public class222 vmethod890(int var1, int var2, int var3) {
      if(!this.vmethod872(var1, var2, -1022160636)) {
         return null;
      } else {
         int var4 = this.field394 * 64 - this.field396 * 64 + (this.field402 * 8 - this.field400 * 8) + var1;
         int var5 = this.field397 * 64 - this.field401 * 64 + var2 + (this.field399 * 8 - this.field395 * 8);
         return new class222(this.field398, var4, var5);
      }
   }

   public int[] vmethod873(int var1, int var2, int var3, int var4) {
      if(!this.vmethod871(var1, var2, var3, 932904831)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field396 * 64 - this.field394 * 64 + var2 + (this.field400 * 8 - this.field402 * 8), var3 + (this.field401 * 64 - this.field397 * 64) + (this.field395 * 8 - this.field399 * 8)};
         return var5;
      }
   }

   public void vmethod885(class309 var1, int var2) {
      this.field398 = var1.readUnsignedByte((byte)93);
      this.field393 = var1.readUnsignedByte((byte)95);
      this.field394 = var1.writeShort((byte)27);
      this.field402 = var1.readUnsignedByte((byte)43);
      this.field397 = var1.writeShort((byte)29);
      this.field399 = var1.readUnsignedByte((byte)73);
      this.field396 = var1.writeShort((byte)18);
      this.field400 = var1.readUnsignedByte((byte)69);
      this.field401 = var1.writeShort((byte)12);
      this.field395 = var1.readUnsignedByte((byte)73);
      this.method876(211103794);
   }

   void method876(int var1) {}

   public static synchronized void method899(byte[] var0, int var1) {
      if(var0.length == 100 && class311.field3718 < 1000) {
         class311.field3723[++class311.field3718 - 1] = var0;
      } else if(var0.length == 5000 && class311.field3716 < 250) {
         class311.field3719[++class311.field3716 - 1] = var0;
      } else if(var0.length == 30000 && class311.field3720 < 50) {
         class311.field3721[++class311.field3720 - 1] = var0;
      } else {
         if(class311.field3722 != null) {
            for(int var2 = 0; var2 < class350.field4067.length; ++var2) {
               if(var0.length == class350.field4067[var2] && class311.field3715[var2] < class311.field3722[var2].length) {
                  class311.field3722[var2][class311.field3715[var2]++] = var0;
                  return;
               }
            }
         }

      }
   }

   static class193[] method895(int var0) {
      return new class193[]{class193.field2315, class193.field2313, class193.field2317, class193.field2319, class193.field2314, class193.field2311};
   }

   static boolean method880(byte var0) {
      return client.field827;
   }
}
