package src;

public class class328 {

   public int field3853;
   public int field3856;
   public int field3855;
   public int field3857;


   public class328(int var1, int var2, int var3, int var4) {
      this.method6014(var1, var2, 1269806188);
      this.method6015(var3, var4, 838675503);
   }

   public class328(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   void method6017(class328 var1, class328 var2, int var3) {
      var2.field3857 = this.field3857;
      var2.field3855 = this.field3855;
      if(this.field3857 < var1.field3857) {
         var2.field3855 -= var1.field3857 - this.field3857;
         var2.field3857 = var1.field3857;
      }

      if(var2.method6019((byte)0) > var1.method6019((byte)0)) {
         var2.field3855 -= var2.method6019((byte)0) - var1.method6019((byte)0);
      }

      if(var2.field3855 < 0) {
         var2.field3855 = 0;
      }

   }

   public void method6014(int var1, int var2, int var3) {
      this.field3857 = var1;
      this.field3853 = var2;
   }

   void method6018(class328 var1, class328 var2, int var3) {
      var2.field3853 = this.field3853;
      var2.field3856 = this.field3856;
      if(this.field3853 < var1.field3853) {
         var2.field3856 -= var1.field3853 - this.field3853;
         var2.field3853 = var1.field3853;
      }

      if(var2.method6016(180335993) > var1.method6016(-942532999)) {
         var2.field3856 -= var2.method6016(-185682289) - var1.method6016(-1103206184);
      }

      if(var2.field3856 < 0) {
         var2.field3856 = 0;
      }

   }

   public void method6015(int var1, int var2, int var3) {
      this.field3855 = var1;
      this.field3856 = var2;
   }

   int method6016(int var1) {
      return this.field3856 + this.field3853;
   }

   int method6019(byte var1) {
      return this.field3857 + this.field3855;
   }

   public void method6013(class328 var1, class328 var2, byte var3) {
      this.method6017(var1, var2, -1938755982);
      this.method6018(var1, var2, -642069303);
   }

   public String aab() {
      return null;
   }

   public String aau() {
      return null;
   }

   public String aak() {
      return null;
   }

   public String toString() {
      return null;
   }
}
