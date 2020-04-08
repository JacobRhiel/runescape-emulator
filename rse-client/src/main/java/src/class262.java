package src;

public class class262 extends class184 {

   public static class154 field3335 = new class154(20);
   public static class154 field3323 = new class154(64);
   public static class154 field3321 = new class154(64);
   public static class243 field3324;
   public static class243 field3322;
   String field3337 = "";
   int field3336 = -1;
   int field3325 = -1;
   int field3332 = -1;
   int field3333 = -1;
   int field3330 = -1;
   int field3331 = -1;
   int field3342 = -1;
   public int field3327 = -1;
   public int field3328 = 16777215;
   public int field3329 = 70;
   public int[] field3340;
   public int field3338 = 0;
   public int field3334 = -1;
   public int field3341 = 0;
   public int field3339 = 0;


   void method4603(class309 var1, int var2, int var3) {
      if(var2 == 1) {
         this.field3325 = var1.method5564((byte)81);
      } else if(var2 == 2) {
         this.field3328 = var1.method5674((short)3112);
      } else if(var2 == 3) {
         this.field3330 = var1.method5564((byte)-5);
      } else if(var2 == 4) {
         this.field3332 = var1.method5564((byte)17);
      } else if(var2 == 5) {
         this.field3331 = var1.method5564((byte)63);
      } else if(var2 == 6) {
         this.field3333 = var1.method5564((byte)-43);
      } else if(var2 == 7) {
         this.field3338 = var1.method5550(1207424315);
      } else if(var2 == 8) {
         this.field3337 = var1.method5557(-1416358410);
      } else if(var2 == 9) {
         this.field3329 = var1.readShort((byte)52);
      } else if(var2 == 10) {
         this.field3341 = var1.method5550(1282022395);
      } else if(var2 == 11) {
         this.field3334 = 0;
      } else if(var2 == 12) {
         this.field3327 = var1.readUnsignedByte((byte)82);
      } else if(var2 == 13) {
         this.field3339 = var1.method5550(-665217207);
      } else if(var2 == 14) {
         this.field3334 = var1.readShort((byte)99);
      } else if(var2 == 17 || var2 == 18) {
         this.field3336 = var1.readShort((byte)72);
         if(this.field3336 == '\uffff') {
            this.field3336 = -1;
         }

         this.field3342 = var1.readShort((byte)123);
         if(this.field3342 == '\uffff') {
            this.field3342 = -1;
         }

         int var4 = -1;
         if(var2 == 18) {
            var4 = var1.readShort((byte)49);
            if(var4 == '\uffff') {
               var4 = -1;
            }
         }

         int var5 = var1.readUnsignedByte((byte)53);
         this.field3340 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field3340[var6] = var1.readShort((byte)20);
            if(this.field3340[var6] == '\uffff') {
               this.field3340[var6] = -1;
            }
         }

         this.field3340[var5 + 1] = var4;
      }

   }

   void method4602(class309 var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)86);
         if(var3 == 0) {
            return;
         }

         this.method4603(var1, var3, 575571509);
      }
   }

   public final class262 method4604(int var1) {
      int var2 = -1;
      if(this.field3336 != -1) {
         var2 = class95.method2197(this.field3336, -133242679);
      } else if(this.field3342 != -1) {
         var2 = class221.field2526[this.field3342];
      }

      int var3;
      if(var2 >= 0 && var2 < this.field3340.length - 1) {
         var3 = this.field3340[var2];
      } else {
         var3 = this.field3340[this.field3340.length - 1];
      }

      return var3 != -1?class19.method213(var3, 34756034):null;
   }

   public class334 method4618(int var1) {
      if(this.field3330 < 0) {
         return null;
      } else {
         class334 var2 = (class334)field3321.method3418((long)this.field3330);
         if(var2 != null) {
            return var2;
         } else {
            var2 = class205.method3752(field3322, this.field3330, 0, 273345835);
            if(var2 != null) {
               field3321.method3424(var2, (long)this.field3330);
            }

            return var2;
         }
      }
   }

   public class334 method4607(int var1) {
      if(this.field3331 < 0) {
         return null;
      } else {
         class334 var2 = (class334)field3321.method3418((long)this.field3331);
         if(var2 != null) {
            return var2;
         } else {
            var2 = class205.method3752(field3322, this.field3331, 0, 273345835);
            if(var2 != null) {
               field3321.method3424(var2, (long)this.field3331);
            }

            return var2;
         }
      }
   }

   public class334 method4608(int var1) {
      if(this.field3332 < 0) {
         return null;
      } else {
         class334 var2 = (class334)field3321.method3418((long)this.field3332);
         if(var2 != null) {
            return var2;
         } else {
            var2 = class205.method3752(field3322, this.field3332, 0, 273345835);
            if(var2 != null) {
               field3321.method3424(var2, (long)this.field3332);
            }

            return var2;
         }
      }
   }

   public class334 method4609(int var1) {
      if(this.field3333 < 0) {
         return null;
      } else {
         class334 var2 = (class334)field3321.method3418((long)this.field3333);
         if(var2 != null) {
            return var2;
         } else {
            var2 = class205.method3752(field3322, this.field3333, 0, 273345835);
            if(var2 != null) {
               field3321.method3424(var2, (long)this.field3333);
            }

            return var2;
         }
      }
   }

   public class304 method4612(int var1) {
      if(this.field3325 == -1) {
         return null;
      } else {
         class304 var2 = (class304)field3335.method3418((long)this.field3325);
         if(var2 != null) {
            return var2;
         } else {
            class243 var4 = field3322;
            class243 var5 = class296.field3639;
            int var6 = this.field3325;
            class304 var3;
            if(!class164.method3502(var4, var6, 0, -1288828939)) {
               var3 = null;
            } else {
               var3 = class138.method3080(var5.method4224(var6, 0, (byte)-116), -1809526292);
            }

            if(var3 != null) {
               field3335.method3424(var3, (long)this.field3325);
            }

            return var3;
         }
      }
   }

   public String method4605(int var1, int var2) {
      String var3 = this.field3337;

      while(true) {
         int var4 = var3.indexOf("%1");
         if(var4 < 0) {
            return var3;
         }

         var3 = var3.substring(0, var4) + class280.method5016(var1, false, -627751714) + var3.substring(var4 + 2);
      }
   }
}
