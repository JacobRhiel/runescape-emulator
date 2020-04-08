package src;

public abstract class class43 {

   static class174 field331;
   static class91 field338;
   static class245 field328;
   static class245 field333;
   static int field335;
   static int field336;
   public final class222 field327;
   public final class222 field326;
   int field330;
   int field329;


   class43(class222 var1, class222 var2) {
      this.field327 = var1;
      this.field326 = var2;
   }

   boolean method698(int var1, int var2, int var3) {
      if(!this.method689((short)-15316)) {
         return false;
      } else {
         class251 var4 = class25.method279(this.vmethod685((byte)121), 1635967404);
         int var5 = this.vmethod688(650401890);
         int var6 = this.vmethod693(-1828864081);
         switch(var4.field3228.field3454) {
         case 0:
            if(var1 < this.field330 - var5 / 2 || var1 > var5 / 2 + this.field330) {
               return false;
            }
            break;
         case 1:
            if(var1 < this.field330 || var1 >= var5 + this.field330) {
               return false;
            }
            break;
         case 2:
            if(var1 <= this.field330 - var5 || var1 > this.field330) {
               return false;
            }
         }

         switch(var4.field3226.field3194) {
         case 0:
            if(var2 <= this.field329 - var6 || var2 > this.field329) {
               return false;
            }
            break;
         case 1:
            if(var2 < this.field329 - var6 / 2 || var2 > var6 / 2 + this.field329) {
               return false;
            }
            break;
         case 2:
            if(var2 < this.field329 || var2 >= var6 + this.field329) {
               return false;
            }
         }

         return true;
      }
   }

   abstract class37 vmethod710(int var1);

   boolean method689(short var1) {
      return this.vmethod685((byte)125) >= 0;
   }

   public abstract int vmethod685(byte var1);

   boolean method691(int var1, int var2, int var3) {
      class37 var4 = this.vmethod710(2077771117);
      return var4 == null?false:(var1 >= this.field330 - var4.field273 / 2 && var1 <= var4.field273 / 2 + this.field330?var2 >= this.field329 && var2 <= this.field329 + var4.field271:false);
   }

   abstract int vmethod688(int var1);

   abstract int vmethod693(int var1);

   boolean method711(int var1, int var2, int var3) {
      return this.method698(var1, var2, 1127928990)?true:this.method691(var1, var2, -411865092);
   }

   public static boolean method684(char var0, byte var1) {
      return var0 >= 48 && var0 <= 57 || var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }
}
