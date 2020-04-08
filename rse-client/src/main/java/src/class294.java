package src;

public class class294 extends class286 {

   final class289 field3629;
   final class347 field3628;
   public String field3632 = null;
   public String field3630 = null;
   int field3634 = 1;
   public int field3631;
   public byte field3627;


   public class294(class347 var1, class289 var2) {
      super(100);
      this.field3628 = var1;
      this.field3629 = var2;
   }

   final void method5272(String var1, int var2) {
      this.field3630 = class55.method948(var1, -989870675);
   }

   class283 vmethod5269(int var1) {
      return new class282();
   }

   final void method5271(String var1, byte var2) {
      this.field3632 = class55.method948(var1, 326128835);
   }

   class283[] vmethod5281(int var1, int var2) {
      return new class282[var1];
   }

   public final void method5275(int var1) {
      for(int var2 = 0; var2 < this.method5115((byte)4); ++var2) {
         ((class282)this.method5196(var2, (short)-18917)).method5042(93359593);
      }

   }

   public final void method5284(int var1) {
      for(int var2 = 0; var2 < this.method5115((byte)4); ++var2) {
         ((class282)this.method5196(var2, (short)-13330)).method5057(-203044757);
      }

   }

   final void method5277(class282 var1, int var2) {
      if(var1.method5068(-1106641864).equals(this.field3629.vmethod5223(-1860083598))) {
         this.field3631 = var1.field3611;
      }

   }

   public final void method5274(class309 var1, int var2) {
      class292 var3 = new class292(var1.method5667(-1167599777), this.field3628);
      int var4 = var1.readShort((byte)77);
      byte var5 = var1.readByte(-192813369);
      boolean var6 = false;
      if(var5 == -128) {
         var6 = true;
      }

      class282 var7;
      if(var6) {
         if(this.method5115((byte)4) == 0) {
            return;
         }

         var7 = (class282)this.method5119(var3, -678771148);
         if(var7 != null && var7.method5214(734760061) == var4) {
            this.method5195(var7, -941355814);
         }
      } else {
         var1.method5667(-555137490);
         var7 = (class282)this.method5119(var3, -678771148);
         if(var7 == null) {
            if(this.method5115((byte)4) > super.field3600) {
               return;
            }

            var7 = (class282)this.method5123(var3, -2093018234);
         }

         var7.method5213(var4, ++this.field3634 - 1, 1769610141);
         var7.field3611 = var5;
         this.method5277(var7, -66701208);
      }

   }

   public final void method5273(class309 var1, int var2) {
      this.method5272(var1.method5667(-1315881436), 2103961051);
      long var3 = var1.method5553((byte)40);
      this.method5271(class151.method3391(var3), (byte)105);
      this.field3627 = var1.readByte(-606598626);
      int var5 = var1.readUnsignedByte((byte)58);
      if(var5 != 255) {
         this.method5161(1068929306);

         for(int var6 = 0; var6 < var5; ++var6) {
            class282 var7 = (class282)this.method5123(new class292(var1.method5667(-287488759), this.field3628), -2072014204);
            int var8 = var1.readShort((byte)97);
            var7.method5213(var8, ++this.field3634 - 1, 1813955816);
            var7.field3611 = var1.readByte(-152380441);
            var1.method5667(-2052410358);
            this.method5277(var7, 519083315);
         }

      }
   }

   static String method5291(int var0) {
      String var1;
      if(class76.field676.field1075) {
         String var3 = class94.field1220;
         int var5 = var3.length();
         char[] var6 = new char[var5];

         for(int var7 = 0; var7 < var5; ++var7) {
            var6[var7] = 42;
         }

         String var4 = new String(var6);
         var1 = var4;
      } else {
         var1 = class94.field1220;
      }

      return var1;
   }
}
