package src;

public class class261 extends class184 {

   static class154 field3312 = new class154(64);
   static class243 field3319;
   public int field3317 = 0;
   public String field3315 = "null";
   public char field3318;
   public char field3314;
   public int field3316;
   public int[] field3320;
   public String[] field3313;
   public int[] field3311;


   void method4599(class309 var1, int var2, int var3) {
      if(var2 == 1) {
         this.field3318 = (char)var1.readUnsignedByte((byte)49);
      } else if(var2 == 2) {
         this.field3314 = (char)var1.readUnsignedByte((byte)82);
      } else if(var2 == 3) {
         this.field3315 = var1.method5667(-1551373216);
      } else if(var2 == 4) {
         this.field3316 = var1.method5552(297718403);
      } else {
         int var4;
         if(var2 == 5) {
            this.field3317 = var1.readShort((byte)22);
            this.field3320 = new int[this.field3317];
            this.field3313 = new String[this.field3317];

            for(var4 = 0; var4 < this.field3317; ++var4) {
               this.field3320[var4] = var1.method5552(297718403);
               this.field3313[var4] = var1.method5667(-236731419);
            }
         } else if(var2 == 6) {
            this.field3317 = var1.readShort((byte)49);
            this.field3320 = new int[this.field3317];
            this.field3311 = new int[this.field3317];

            for(var4 = 0; var4 < this.field3317; ++var4) {
               this.field3320[var4] = var1.method5552(297718403);
               this.field3311[var4] = var1.method5552(297718403);
            }
         }
      }

   }

   public int method4589(int var1) {
      return this.field3317;
   }

   void method4587(class309 var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)29);
         if(var3 == 0) {
            return;
         }

         this.method4599(var1, var3, -1795608149);
      }
   }

   public static void method4590(int var0, int var1) {
      if(var0 != -1) {
         if(class226.field2583[var0]) {
            class226.field2559.method4237(var0, -1058828801);
            if(class226.field2693[var0] != null) {
               boolean var2 = true;

               for(int var3 = 0; var3 < class226.field2693[var0].length; ++var3) {
                  if(class226.field2693[var0][var3] != null) {
                     if(class226.field2693[var0][var3].field2569 != 2) {
                        class226.field2693[var0][var3] = null;
                     } else {
                        var2 = false;
                     }
                  }
               }

               if(var2) {
                  class226.field2693[var0] = null;
               }

               class226.field2583[var0] = false;
            }
         }
      }
   }
}
