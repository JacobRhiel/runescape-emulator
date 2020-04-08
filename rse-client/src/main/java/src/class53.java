package src;

import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class53 implements class177, MouseWheelListener {

   int field412 = 0;


   void method906(Component var1, int var2) {
      var1.addMouseWheelListener(this);
   }

   void method907(Component var1, int var2) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized int vmethod3573(int var1) {
      int var2 = this.field412;
      this.field412 = 0;
      return var2;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field412 += var1.getWheelRotation();
   }
}
