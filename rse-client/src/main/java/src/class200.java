package src;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class class200 {

   static final class200 field2370 = new class200();
   static final class200 field2369 = new class200();
   static final class200 field2371 = new class200();
   static int field2372;


   public static final class334 method3731(byte[] var0, int var1) {
      BufferedImage var2 = null;

      try {
         var2 = ImageIO.read(new ByteArrayInputStream(var0));
         int var3 = var2.getWidth();
         int var4 = var2.getHeight();
         int[] var5 = new int[var4 * var3];
         PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3);
         var6.grabPixels();
         return new class334(var5, var3, var4);
      } catch (IOException var8) {
         ;
      } catch (InterruptedException var9) {
         ;
      }

      return new class334(0, 0);
   }
}
