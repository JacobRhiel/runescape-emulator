package src;

public class class172 extends class179 {

   long field2018 = System.nanoTime();


   public int vmethod3578(int var1, int var2, int var3) {
      long var4 = 1000000L * (long)var2;
      long var6 = this.field2018 - System.nanoTime();
      if(var6 < var4) {
         var6 = var4;
      }

      class169.method3527(var6 / 1000000L);
      long var8 = System.nanoTime();

      int var10;
      for(var10 = 0; var10 < 10 && (var10 < 1 || this.field2018 < var8); this.field2018 += 1000000L * (long)var1) {
         ++var10;
      }

      if(this.field2018 < var8) {
         this.field2018 = var8;
      }

      return var10;
   }

   public void vmethod3577(int var1) {
      this.field2018 = System.nanoTime();
   }
}
