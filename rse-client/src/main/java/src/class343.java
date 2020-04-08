package src;

import java.util.zip.Inflater;

public class class343 {

   public static class243 field4029;
   Inflater field4031;


   class343(int var1, int var2, int var3) {}

   public class343() {
      this(-1, 1000000, 1000000);
   }

   public void method6590(class309 var1, byte[] var2, int var3) {
      if(var1.field3709[var1.field3710] == 31 && var1.field3709[var1.field3710 + 1] == -117) {
         if(this.field4031 == null) {
            this.field4031 = new Inflater(true);
         }

         try {
            this.field4031.setInput(var1.field3709, var1.field3710 + 10, var1.field3709.length - (var1.field3710 + 8 + 10));
            this.field4031.inflate(var2);
         } catch (Exception var5) {
            this.field4031.reset();
            throw new RuntimeException("");
         }

         this.field4031.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
