package src;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class47 extends class35 {

   static class334[] field373;
   List field371;
   HashSet field372;
   HashSet field370;


   void method774(class309 var1, boolean var2, int var3) {
      this.field371 = new LinkedList();
      int var4 = var1.readShort((byte)123);

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var1.method5564((byte)-27);
         class222 var7 = new class222(var1.readInt(297718403));
         boolean var8 = var1.readUnsignedByte((byte)33) == 1;
         if(var2 || !var8) {
            this.field371.add(new class27((class222)null, var7, var6, (class37)null));
         }
      }

   }

   void method775(class309 var1, class309 var2, int var3, boolean var4, int var5) {
      this.method471(var1, var3, (byte)64);
      int var6 = var2.readShort((byte)91);
      this.field372 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class24 var8 = new class24();

         try {
            var8.method264(var2, -1716650970);
         } catch (IllegalStateException var13) {
            continue;
         }

         this.field372.add(var8);
      }

      var7 = var2.readShort((byte)45);
      this.field370 = new HashSet(var7);

      for(int var11 = 0; var11 < var7; ++var11) {
         class48 var9 = new class48();

         try {
            var9.method801(var2, (byte)1);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field370.add(var9);
      }

      this.method774(var2, var4, 1078269638);
   }

   static void method781(class226 var0, int var1, int var2, boolean var3, short var4) {
      int var5 = var0.field2582;
      int var6 = var0.field2642;
      if(var0.field2703 == 0) {
         var0.field2582 = var0.field2579;
      } else if(var0.field2703 == 1) {
         var0.field2582 = var1 - var0.field2579;
      } else if(var0.field2703 == 2) {
         var0.field2582 = var0.field2579 * var1 >> 14;
      }

      if(var0.field2683 == 0) {
         var0.field2642 = var0.field2621;
      } else if(var0.field2683 == 1) {
         var0.field2642 = var2 - var0.field2621;
      } else if(var0.field2683 == 2) {
         var0.field2642 = var2 * var0.field2621 >> 14;
      }

      if(var0.field2703 == 4) {
         var0.field2582 = var0.field2584 * var0.field2642 / var0.field2585;
      }

      if(var0.field2683 == 4) {
         var0.field2642 = var0.field2585 * var0.field2582 / var0.field2584;
      }

      if(var0.field2571 == 1337) {
         client.field852 = var0;
      }

      if(var3 && var0.field2682 != null && (var5 != var0.field2582 || var6 != var0.field2642)) {
         class71 var7 = new class71();
         var7.field612 = var0;
         var7.field602 = var0.field2682;
         client.field787.method4952(var7);
      }

   }
}
