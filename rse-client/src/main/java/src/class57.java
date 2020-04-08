package src;

import java.awt.*;

public final class class57 extends Canvas {

   Component field449;


   class57(Component var1) {
      this.field449 = var1;
   }

   public final void update(Graphics var1) {
      this.field449.update(var1);
   }

   public final void paint(Graphics var1) {
      this.field449.paint(var1);
   }

   public static int method958(int var0, short var1) {
      return var0 >> 17 & 7;
   }

   static final int method957(int var0, int var1, int var2, short var3) {
      int var4 = var0 / var2;
      int var5 = var0 & var2 - 1;
      int var6 = var1 / var2;
      int var7 = var1 & var2 - 1;
      int var8 = class232.method4194(var4, var6, 1236815068);
      int var9 = class232.method4194(var4 + 1, var6, 1191784439);
      int var10 = class232.method4194(var4, var6 + 1, 1404624448);
      int var11 = class232.method4194(var4 + 1, var6 + 1, 1993669506);
      int var12 = class195.method3677(var8, var9, var5, var2, (byte)90);
      int var13 = class195.method3677(var10, var11, var5, var2, (byte)90);
      return class195.method3677(var12, var13, var7, var2, (byte)90);
   }
}
