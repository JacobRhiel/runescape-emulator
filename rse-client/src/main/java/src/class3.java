package src;

public class class3 implements class203 {

   static final class3 field11 = new class3(2, 0, Integer.class, new class1());
   static final class3 field13 = new class3(0, 1, Long.class, new class2());
   static final class3 field7 = new class3(1, 2, String.class, new class4());
   static class333 field18;
   public static int field16;
   final class0 field5;
   public final int field9;
   final int field8;
   final Class field10;


   class3(int var1, int var2, Class var3, class0 var4) {
      this.field8 = var1;
      this.field9 = var2;
      this.field10 = var3;
      this.field5 = var4;
   }

   public int vmethod6149(byte var1) {
      return this.field9;
   }

   public Object method42(class309 var1, byte var2) {
      return this.field5.vmethod74(var1, -1146837249);
   }

   static int method59(int var0, int var1, int var2) {
      long var3 = (long)((var0 << 16) + var1);
      return class246.field3181 != null && var3 == class246.field3181.field2116?class246.field3177.field3710 * 99 / (class246.field3177.field3709.length - class246.field3181.field3120) + 1:0;
   }

   static void method58(class245 var0, int var1, int var2) {
      if(class13.field59 != null) {
         class13.field59.field3710 = var1 * 8 + 5;
         int var3 = class13.field59.method5552(297718403);
         int var4 = class13.field59.method5552(297718403);
         var0.method4323(var3, var4, (byte)95);
      } else {
         class147.method3371((class245)null, 255, 255, 0, (byte)0, true, -626508532);
         class246.field3164[var1] = var0;
      }
   }

   public static class3[] method46(int var0) {
      return new class3[]{field7, field11, field13};
   }

   public static class3 method38(Class var0, int var1) {
      class3[] var2 = method46(1248290062);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class3 var4 = var2[var3];
         if(var4.field10 == var0) {
            return var4;
         }
      }

      return null;
   }

   public static class0 method40(Class var0, int var1) {
      class3 var2 = method38(var0, -2067616868);
      if(var2 == null) {
         throw new IllegalArgumentException();
      } else {
         return var2.field5;
      }
   }

   static void method48(short var0) {
      if(client.field754 == 1) {
         client.field770 = true;
      }

   }

   static final void method60(class226 var0, int var1, int var2, int var3) {
      if(client.field912 == 0 || client.field912 == 3) {
         if(!client.field816 && (class63.field524 == 1 || !class217.field2506 && class63.field524 == 4)) {
            class220 var4 = var0.method4115(true, (byte)-84);
            if(var4 == null) {
               return;
            }

            int var5 = class63.field525 - var1;
            int var6 = class63.field520 - var2;
            if(var4.method4037(var5, var6, -822552656)) {
               var5 -= var4.field2518 / 2;
               var6 -= var4.field2517 / 2;
               int var7 = client.field909 & 2047;
               int var8 = class139.field1794[var7];
               int var9 = class139.field1795[var7];
               int var10 = var8 * var6 + var5 * var9 >> 11;
               int var11 = var9 * var6 - var8 * var5 >> 11;
               int var12 = var10 + class311.field3717.field983 >> 7;
               int var13 = class311.field3717.field973 - var11 >> 7;
               class196 var14 = class146.method3363(ClientPacket.field2207, client.field761.field1340, -2019180702);
               var14.field2338.readByte(18, 1258821856);
               var14.field2338.readShort(var12 + class69.field590 * 731242929, (byte)-31);
               var14.field2338.readByte(class54.field426[82]?(class54.field426[81]?2:1):0, 1258821856);
               var14.field2338.readShort(var13 + class89.field1152 * 1825982697, (byte)-73);
               var14.field2338.readByte(var5, 1258821856);
               var14.field2338.readByte(var6, 1258821856);
               var14.field2338.readShort(client.field909, (byte)-62);
               var14.field2338.readByte(57, 1258821856);
               var14.field2338.readByte(0, 1258821856);
               var14.field2338.readByte(0, 1258821856);
               var14.field2338.readByte(89, 1258821856);
               var14.field2338.readShort(class311.field3717.field983, (byte)-112);
               var14.field2338.readShort(class311.field3717.field973, (byte)-118);
               var14.field2338.readByte(63, 1258821856);
               client.field761.method2361(var14, 803250407);
               client.field910 = var12;
               client.field911 = var13;
            }
         }

      }
   }

   static void method57(int var0, class222 var1, boolean var2, int var3) {
      class35 var4 = class13.method133(-703955092).method6434(var0, -1448809867);
      int var5 = class311.field3717.field666;
      int var6 = (class311.field3717.field983 >> 7) + class69.field590 * 731242929;
      int var7 = (class311.field3717.field973 >> 7) + class89.field1152 * 1825982697;
      class222 var8 = new class222(var5, var6, var7);
      class13.method133(-1202860567).method6551(var4, var8, var1, var2, 698052085);
   }
}
