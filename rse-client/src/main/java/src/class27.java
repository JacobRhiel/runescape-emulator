package src;

public class class27 extends class43 {

   static class347 field164;
   static class245 field162;
   final class37 field163;
   final int field165;
   final int field170;
   final int field169;


   class27(class222 var1, class222 var2, int var3, class37 var4) {
      super(var1, var2);
      this.field169 = var3;
      this.field163 = var4;
      class251 var5 = class25.method279(this.vmethod685((byte)68), -659307619);
      class334 var6 = var5.method4443(false, 1905072260);
      if(var6 != null) {
         this.field170 = var6.field3889;
         this.field165 = var6.field3899;
      } else {
         this.field170 = 0;
         this.field165 = 0;
      }

   }

   class37 vmethod710(int var1) {
      return this.field163;
   }

   public int vmethod685(byte var1) {
      return this.field169;
   }

   int vmethod688(int var1) {
      return this.field170;
   }

   int vmethod693(int var1) {
      return this.field165;
   }

   static boolean method306(String var0, int var1, int var2) {
      return class68.method1274(var0, var1, "openjs", (byte)17);
   }

   static final void method304(int var0) {
      class308 var1 = client.field761.field1337;
      var1.method5496((byte)87);
      int var2 = var1.method5495(8, (byte)14);
      int var3;
      if(var2 < client.field722) {
         for(var3 = var2; var3 < client.field722; ++var3) {
            client.field918[++client.field801 - 1] = client.field723[var3];
         }
      }

      if(var2 > client.field722) {
         throw new RuntimeException("");
      } else {
         client.field722 = 0;

         for(var3 = 0; var3 < var2; ++var3) {
            int var4 = client.field723[var3];
            class88 var5 = client.field721[var4];
            int var6 = var1.method5495(1, (byte)40);
            if(var6 == 0) {
               client.field723[++client.field722 - 1] = var4;
               var5.field1005 = client.field689;
            } else {
               int var7 = var1.method5495(2, (byte)76);
               if(var7 == 0) {
                  client.field723[++client.field722 - 1] = var4;
                  var5.field1005 = client.field689;
                  client.field725[++client.field851 - 1] = var4;
               } else {
                  int var8;
                  int var9;
                  if(var7 == 1) {
                     client.field723[++client.field722 - 1] = var4;
                     var5.field1005 = client.field689;
                     var8 = var1.method5495(3, (byte)-72);
                     var5.method2119(var8, (byte)1, 1357831491);
                     var9 = var1.method5495(1, (byte)62);
                     if(var9 == 1) {
                        client.field725[++client.field851 - 1] = var4;
                     }
                  } else if(var7 == 2) {
                     client.field723[++client.field722 - 1] = var4;
                     var5.field1005 = client.field689;
                     var8 = var1.method5495(3, (byte)-29);
                     var5.method2119(var8, (byte)2, 1646496799);
                     var9 = var1.method5495(3, (byte)49);
                     var5.method2119(var9, (byte)2, 2059281874);
                     int var10 = var1.method5495(1, (byte)-3);
                     if(var10 == 1) {
                        client.field725[++client.field851 - 1] = var4;
                     }
                  } else if(var7 == 3) {
                     client.field918[++client.field801 - 1] = var4;
                  }
               }
            }
         }

      }
   }
}
