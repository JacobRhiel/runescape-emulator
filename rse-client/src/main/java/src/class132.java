package src;

public final class class132 {

   public class144 field1630;
   int field1629;
   public long field1631;
   int field1628;
   int field1627;
   int field1632;


   public static void method2938(int var0, int var1, byte var2) {
      class258 var3 = class220.method4040(var0, (short)14194);
      int var4 = var3.field3293;
      int var5 = var3.field3290;
      int var6 = var3.field3287;
      int var7 = class221.field2523[var6 - var5];
      if(var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      class221.field2526[var4] = class221.field2526[var4] & ~var7 | var1 << var5 & var7;
   }
}
