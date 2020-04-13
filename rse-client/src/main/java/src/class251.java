package src;

public class class251 extends class184 {

   static class154 field3211 = new class154(256);
   public static class251[] field3219;
   public static class243 field3225;
   public int field3224 = -1;
   int[] field3220;
   public String field3215;
   public final int field3212;
   public class265 field3228;
   int field3214 = -1;
   public int field3216;
   int field3221 = Integer.MAX_VALUE;
   public class248 field3226;
   public int field3217 = 0;
   public String[] field3209 = new String[5];
   int field3223 = Integer.MIN_VALUE;
   int field3222 = Integer.MAX_VALUE;
   public String field3227;
   int field3210 = Integer.MIN_VALUE;
   public int field3213;
   int[] field3229;
   byte[] field3218;


   public class251(int var1) {
      this.field3228 = class265.field3452;
      this.field3226 = class248.field3192;
      this.field3213 = -1;
      this.field3212 = var1;
   }

   public class334 method4443(boolean var1, int var2) {
      int var3 = this.field3224;
      return this.method4444(var3, 122291326);
   }

   class334 method4444(int var1, int var2) {
      if(var1 < 0) {
         return null;
      } else {
         class334 var3 = (class334)field3211.method3418((long)var1);
         if(var3 != null) {
            return var3;
         } else {
            var3 = class205.method3752(field3225, var1, 0, 273345835);
            if(var3 != null) {
               field3211.method3424(var3, (long)var1);
            }

            return var3;
         }
      }
   }

   void method4441(class309 var1, int var2, int var3) {
      if(var2 == 1) {
         this.field3224 = var1.method5564((byte)-39);
      } else if(var2 == 2) {
         this.field3214 = var1.method5564((byte)-44);
      } else if(var2 == 3) {
         this.field3215 = var1.method5667(-1845639112);
      } else if(var2 == 4) {
         this.field3216 = var1.method5674((short)3112);
      } else if(var2 == 5) {
         var1.method5674((short)3112);
      } else if(var2 == 6) {
         this.field3217 = var1.readUnsignedByte((byte)62);
      } else {
         int var4;
         if(var2 == 7) {
            var4 = var1.readUnsignedByte((byte)42);
            if((var4 & 1) == 0) {
               ;
            }

            if((var4 & 2) == 2) {
               ;
            }
         } else if(var2 == 8) {
            var1.readUnsignedByte((byte)41);
         } else if(var2 >= 10 && var2 <= 14) {
            this.field3209[var2 - 10] = var1.method5667(-522717623);
         } else if(var2 == 15) {
            var4 = var1.readUnsignedByte((byte)109);
            this.field3220 = new int[var4 * 2];

            int var5;
            for(var5 = 0; var5 < var4 * 2; ++var5) {
               this.field3220[var5] = var1.method5550(-43398669);
            }

            var1.readInt(297718403);
            var5 = var1.readUnsignedByte((byte)42);
            this.field3229 = new int[var5];

            int var6;
            for(var6 = 0; var6 < this.field3229.length; ++var6) {
               this.field3229[var6] = var1.readInt(297718403);
            }

            this.field3218 = new byte[var4];

            for(var6 = 0; var6 < var4; ++var6) {
               this.field3218[var6] = var1.readByte(-557765371);
            }
         } else if(var2 != 16) {
            if(var2 == 17) {
               this.field3227 = var1.method5667(-1704291059);
            } else if(var2 == 18) {
               var1.method5564((byte)-9);
            } else if(var2 == 19) {
               this.field3213 = var1.writeShort((byte)108);
            } else if(var2 == 21) {
               var1.readInt(297718403);
            } else if(var2 == 22) {
               var1.readInt(297718403);
            } else if(var2 == 23) {
               var1.readUnsignedByte((byte)21);
               var1.readUnsignedByte((byte)44);
               var1.readUnsignedByte((byte)16);
            } else if(var2 == 24) {
               var1.method5550(174068677);
               var1.method5550(-602119314);
            } else if(var2 == 25) {
               var1.method5564((byte)37);
            } else if(var2 == 28) {
               var1.readUnsignedByte((byte)126);
            } else if(var2 == 29) {
               this.field3228 = (class265)class16.method159(class242.method4220(534124687), var1.readUnsignedByte((byte)89), -1609956543);
            } else if(var2 == 30) {
               this.field3226 = (class248)class16.method159(class222.method4060((byte)112), var1.readUnsignedByte((byte)83), -1609956543);
            }
         }
      }

   }

   public int method4458(int var1) {
      return this.field3212;
   }

   public void method4448(class309 var1, byte var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)105);
         if(var3 == 0) {
            return;
         }

         this.method4441(var1, var3, 2055926497);
      }
   }

   public void method4442(int var1) {
      if(this.field3220 != null) {
         for(int var2 = 0; var2 < this.field3220.length; var2 += 2) {
            if(this.field3220[var2] < this.field3221) {
               this.field3221 = this.field3220[var2];
            } else if(this.field3220[var2] > this.field3223) {
               this.field3223 = this.field3220[var2];
            }

            if(this.field3220[var2 + 1] < this.field3222) {
               this.field3222 = this.field3220[var2 + 1];
            } else if(this.field3220[var2 + 1] > this.field3210) {
               this.field3210 = this.field3220[var2 + 1];
            }
         }
      }

   }

   public static class255 method4461(int var0, int var1) {
      class255 var2 = (class255)class255.field3262.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class255.field3268.method4224(3, var0, (byte)-27);
         var2 = new class255();
         if(var3 != null) {
            var2.method4495(new class309(var3), 1401612766);
         }

         class255.field3262.method3424(var2, (long)var0);
         return var2;
      }
   }
}
