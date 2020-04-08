package src;

import java.util.Collection;
import java.util.Iterator;

public class class270 implements Iterable, Collection {

   class189 field3530;
   class189 field3531 = new class189();


   public class270() {
      this.field3531.field2117 = this.field3531;
      this.field3531.field2115 = this.field3531;
   }

   boolean method4859(class189 var1) {
      this.method4858(var1);
      return true;
   }

   class189[] method4864() {
      class189[] var1 = new class189[this.method4903()];
      int var2 = 0;

      for(class189 var3 = this.field3531.field2117; var3 != this.field3531; var3 = var3.field2117) {
         var1[var2++] = var3;
      }

      return var1;
   }

   int method4903() {
      int var1 = 0;

      for(class189 var2 = this.field3531.field2117; var2 != this.field3531; var2 = var2.field2117) {
         ++var1;
      }

      return var1;
   }

   public void method4866() {
      while(this.field3531.field2117 != this.field3531) {
         this.field3531.field2117.method3657();
      }

   }

   class189 method4871(class189 var1) {
      class189 var2;
      if(var1 == null) {
         var2 = this.field3531.field2117;
      } else {
         var2 = var1;
      }

      if(var2 == this.field3531) {
         this.field3530 = null;
         return null;
      } else {
         this.field3530 = var2.field2117;
         return var2;
      }
   }

   public boolean method4867() {
      return this.field3531.field2117 == this.field3531;
   }

   public void method4858(class189 var1) {
      if(var1.field2115 != null) {
         var1.method3657();
      }

      var1.field2115 = this.field3531.field2115;
      var1.field2117 = this.field3531;
      var1.field2115.field2117 = var1;
      var1.field2117.field2115 = var1;
   }

   public class189 method4860() {
      return this.method4871((class189)null);
   }

   public class189 method4915() {
      class189 var1 = this.field3530;
      if(var1 == this.field3531) {
         this.field3530 = null;
         return null;
      } else {
         this.field3530 = var1.field2117;
         return var1;
      }
   }

   public void method4880(class189 var1) {
      if(var1.field2115 != null) {
         var1.method3657();
      }

      var1.field2115 = this.field3531;
      var1.field2117 = this.field3531.field2117;
      var1.field2115.field2117 = var1;
      var1.field2117.field2115 = var1;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public Iterator iterator() {
      return new class274(this);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public int size() {
      return this.method4903();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.method4864();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(class189 var3 = this.field3531.field2117; var3 != this.field3531; var3 = var3.field2117) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.method4866();
   }

   public boolean add(Object var1) {
      return this.method4859((class189)var1);
   }

   public boolean isEmpty() {
      return this.method4867();
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   public static void method4893(class189 var0, class189 var1) {
      if(var0.field2115 != null) {
         var0.method3657();
      }

      var0.field2115 = var1;
      var0.field2117 = var1.field2117;
      var0.field2115.field2117 = var0;
      var0.field2117.field2115 = var0;
   }
}
