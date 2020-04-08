package src;

public class class281 {

   static boolean field3582;
   long field3580 = 0L;
   public boolean field3581 = false;
   long field3585 = -1L;
   long field3577 = -1L;
   int field3583 = 0;
   int field3584 = 0;
   long field3579 = 0L;
   long field3576 = 0L;
   int field3578 = 0;
   int field3586 = 0;


   public void method5021(int var1) {
      if(-1L != this.field3577) {
         this.field3579 = class217.method4014(-1630009429) - this.field3577;
         this.field3577 = -1L;
      }

      ++this.field3584;
      this.field3581 = true;
   }

   public void method5026(int var1) {
      if(this.field3585 != -1L) {
         this.field3580 = class217.method4014(981537101) - this.field3585;
         this.field3585 = -1L;
      }

   }

   public void method5020(int var1, byte var2) {
      this.field3577 = class217.method4014(-1380755320);
      this.field3578 = var1;
   }

   public void method5027(int var1) {
      this.field3585 = class217.method4014(-804842093);
   }

   public void method5024(class309 var1, int var2) {
      long var3 = this.field3580;
      var3 /= 10L;
      if(var3 < 0L) {
         var3 = 0L;
      } else if(var3 > 65535L) {
         var3 = 65535L;
      }

      var1.method5532((int)var3, (byte)-61);
      long var5 = this.field3579;
      var5 /= 10L;
      if(var5 < 0L) {
         var5 = 0L;
      } else if(var5 > 65535L) {
         var5 = 65535L;
      }

      var1.method5532((int)var5, (byte)-110);
      long var7 = this.field3576;
      var7 /= 10L;
      if(var7 < 0L) {
         var7 = 0L;
      } else if(var7 > 65535L) {
         var7 = 65535L;
      }

      var1.method5532((int)var7, (byte)-125);
      var1.method5532(this.field3578, (byte)-48);
      var1.method5532(this.field3583, (byte)-121);
      var1.method5532(this.field3584, (byte)-104);
      var1.method5532(this.field3586, (byte)-72);
   }

   public void method5022(int var1) {
      this.field3581 = false;
      this.field3583 = 0;
   }

   public void method5023(int var1) {
      this.method5021(2010228986);
   }
}
