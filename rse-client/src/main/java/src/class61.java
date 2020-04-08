package src;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public final class class61 extends class331 {

   Image field470;
   Component field471;


   class61(int var1, int var2, Component var3) {
      super.field3870 = var1;
      super.field3869 = var2;
      super.field3872 = new int[var2 * var1 + 1];
      DataBufferInt var4 = new DataBufferInt(super.field3872, super.field3872.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, '\uff00', 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.field3870, super.field3869), var4, (Point)null);
      this.field470 = new BufferedImage(var5, var6, false, new Hashtable());
      this.method1001(var3, 701069303);
      this.method6138(1783812684);
   }

   final void method1009(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         Shape var7 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field470, 0, 0, this.field471);
         var1.setClip(var7);
      } catch (Exception var8) {
         this.field471.repaint();
      }

   }

   final void method1005(Graphics var1, int var2, int var3, int var4) {
      try {
         var1.drawImage(this.field470, var2, var3, this.field471);
      } catch (Exception var6) {
         this.field471.repaint();
      }

   }

   final void method1001(Component var1, int var2) {
      this.field471 = var1;
   }

   public final void vmethod6139(int var1, int var2, int var3) {
      this.method1005(this.field471.getGraphics(), var1, var2, -972433777);
   }

   public final void vmethod6145(int var1, int var2, int var3, int var4, short var5) {
      this.method1009(this.field471.getGraphics(), var1, var2, var3, var4, 297654999);
   }
}
