package src;

public class class189 {

   public class189 field2115;
   public class189 field2117;
   public long field2116;


   public void method3657() {
      if(this.field2115 != null) {
         this.field2115.field2117 = this.field2117;
         this.field2117.field2115 = this.field2115;
         this.field2117 = null;
         this.field2115 = null;
      }
   }

   public boolean method3658() {
      return this.field2115 != null;
   }
}
