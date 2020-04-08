package src;

public class class283 implements Comparable {

   class292 field3591;
   class292 field3590;


   public int vmethod5257(class283 var1, int var2) {
      return this.field3590.method5240(var1.field3590, (byte)-121);
   }

   public class292 method5068(int var1) {
      return this.field3590;
   }

   void method5079(class292 var1, class292 var2, short var3) {
      if(var1 == null) {
         throw new NullPointerException();
      } else {
         this.field3590 = var1;
         this.field3591 = var2;
      }
   }

   public String method5083(int var1) {
      return this.field3590 == null?"":this.field3590.method5238(21552539);
   }

   public String method5070(int var1) {
      return this.field3591 == null?"":this.field3591.method5238(-377994642);
   }

   public int compareTo(Object var1) {
      return this.vmethod5257((class283)var1, -1956183743);
   }
}
