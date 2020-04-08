package src;

import java.util.Iterator;

public final class class325 implements Iterable {

   int field3839;
   int field3843 = 0;
   class189[] field3840;
   class189 field3842;
   class189 field3841;


   public class325(int var1) {
      this.field3839 = var1;
      this.field3840 = new class189[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class189 var3 = this.field3840[var2] = new class189();
         var3.field2117 = var3;
         var3.field2115 = var3;
      }

   }

   public class189 method5968(long var1) {
      class189 var3 = this.field3840[(int)(var1 & (long)(this.field3839 - 1))];

      for(this.field3841 = var3.field2117; var3 != this.field3841; this.field3841 = this.field3841.field2117) {
         if(this.field3841.field2116 == var1) {
            class189 var4 = this.field3841;
            this.field3841 = this.field3841.field2117;
            return var4;
         }
      }

      this.field3841 = null;
      return null;
   }

   public class189 method5966() {
      class189 var1;
      if(this.field3843 > 0 && this.field3840[this.field3843 - 1] != this.field3842) {
         var1 = this.field3842;
         this.field3842 = var1.field2117;
         return var1;
      } else {
         do {
            if(this.field3843 >= this.field3839) {
               return null;
            }

            var1 = this.field3840[this.field3843++].field2117;
         } while(var1 == this.field3840[this.field3843 - 1]);

         this.field3842 = var1.field2117;
         return var1;
      }
   }

   public void method5964() {
      int var1 = 0;

      while(var1 < this.field3839) {
         class189 var2 = this.field3840[var1];

         while(true) {
            class189 var3 = var2.field2117;
            if(var3 == var2) {
               ++var1;
               break;
            }

            var3.method3657();
         }
      }

      this.field3841 = null;
      this.field3842 = null;
   }

   public void method5963(class189 var1, long var2) {
      if(var1.field2115 != null) {
         var1.method3657();
      }

      class189 var4 = this.field3840[(int)(var2 & (long)(this.field3839 - 1))];
      var1.field2115 = var4.field2115;
      var1.field2117 = var4;
      var1.field2115.field2117 = var1;
      var1.field2117.field2115 = var1;
      var1.field2116 = var2;
   }

   public Iterator iterator() {
      return new class326(this);
   }

   public class189 method5978() {
      this.field3843 = 0;
      return this.method5966();
   }
}
