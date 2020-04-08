package src;

public class class238 implements class203 {

   static final class238 field3094 = new class238(2, 1, true, true, false);
   static final class238 field3093 = new class238(0, -1, true, false, true);
   static final class238 field3089 = new class238(3, 2, false, false, true);
   static final class238 field3087 = new class238(1, 0, true, true, true);
   static final class238 field3091 = new class238(5, 10, false, false, true);
   static final class238 field3092 = new class238(4, 3, false, false, true);
   final int field3090;
   public final int field3088;
   public final boolean field3086;
   public final boolean field3095;


   class238(int var1, int var2, boolean var3, boolean var4, boolean var5) {
      this.field3090 = var1;
      this.field3088 = var2;
      this.field3086 = var4;
      this.field3095 = var5;
   }

   public int vmethod6149(byte var1) {
      return this.field3090;
   }

   static int method4209(int var0, class101 var1, boolean var2, int var3) {
      class226 var4;
      if(var0 >= 2000) {
         var0 -= 1000;
         var4 = class208.method3898(class85.field1115[--class85.field1117], (byte)-34);
      } else {
         var4 = var2?class20.field115:class85.field1130;
      }

      if(var0 == 1927) {
         if(class85.field1127 >= 10) {
            throw new RuntimeException();
         } else if(var4.field2682 == null) {
            return 0;
         } else {
            class71 var5 = new class71();
            var5.field612 = var4;
            var5.field602 = var4.field2682;
            var5.field604 = class85.field1127 + 1;
            client.field787.method4952(var5);
            return 1;
         }
      } else {
         return 2;
      }
   }
}
