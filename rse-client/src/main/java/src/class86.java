package src;

import java.io.IOException;
import java.util.LinkedHashMap;

public final class class86 extends class144 {

   static int field1141;
   int field1138;
   boolean field1142 = false;
   int field1131 = 0;
   int field1139 = 0;
   class268 field1137;
   int field1140;
   int field1133;
   int field1135;
   int field1136;
   int field1132;


   class86(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field1138 = var1;
      this.field1140 = var2;
      this.field1133 = var3;
      this.field1135 = var4;
      this.field1136 = var5;
      this.field1132 = var7 + var6;
      int var8 = class63.method1205(this.field1138, -1128249354).field3243;
      if(var8 != -1) {
         this.field1142 = false;
         this.field1137 = class253.method4478(var8, 1115293976);
      } else {
         this.field1142 = true;
      }

   }

   protected final class136 vmethod3353(int var1) {
      class253 var2 = class63.method1205(this.field1138, -536901365);
      class136 var3;
      if(!this.field1142) {
         var3 = var2.method4467(this.field1139, -1129308014);
      } else {
         var3 = var2.method4467(-1, -1824079470);
      }

      return var3 == null?null:var3;
   }

   final void method2101(int var1, int var2) {
      if(!this.field1142) {
         this.field1131 += var1;

         while(this.field1131 > this.field1137.field3514[this.field1139]) {
            this.field1131 -= this.field1137.field3514[this.field1139];
            ++this.field1139;
            if(this.field1139 >= this.field1137.field3513.length) {
               this.field1142 = true;
               break;
            }
         }

      }
   }

   public static void method2107(byte var0) {
      if(class63.field510 != null) {
         class63 var1 = class63.field510;
         synchronized(class63.field510) {
            class63.field510 = null;
         }
      }

   }

   static final void method2108(boolean var0, int var1) {
      if(var0) {
         client.field715 = class94.field1214?class169.field2007:class169.field2006;
      } else {
         LinkedHashMap var2 = class76.field676.field1082;
         String var4 = class94.field1220;
         int var5 = var4.length();
         int var6 = 0;

         for(int var7 = 0; var7 < var5; ++var7) {
            var6 = (var6 << 5) - var6 + var4.charAt(var7);
         }

         client.field715 = var2.containsKey(Integer.valueOf(var6))?class169.field2012:class169.field2008;
      }

   }

   public static byte[] method2106(int var0) {
      byte[] var1 = new byte[24];

      try {
         class176.field2053.method6612(0L);
         class176.field2053.method6614(var1, 1780472721);

         int var2;
         for(var2 = 0; var2 < 24 && var1[var2] == 0; ++var2) {
            ;
         }

         if(var2 >= 24) {
            throw new IOException();
         }
      } catch (Exception var5) {
         for(int var3 = 0; var3 < 24; ++var3) {
            var1[var3] = -1;
         }
      }

      return var1;
   }
}
