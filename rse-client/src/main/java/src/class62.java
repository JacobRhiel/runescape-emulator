package src;

import java.applet.Applet;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;

public abstract class class62 extends Applet implements Runnable, FocusListener, WindowListener {

   static volatile boolean field478 = true;
   static class62 field501 = null;
   static boolean field489 = false;
   static int field473 = 0;
   static long field474 = 0L;
   static int field477 = 20;
   protected static long[] field482 = new long[32];
   static int field487 = 1;
   protected static long[] field481 = new long[32];
   protected static class179 field472;
   protected static int field479 = 0;
   static int field491 = 500;
   static long field504 = -1L;
   static long field499 = -1L;
   protected static boolean field502;
   static GarbageCollectorMXBean field492;
   Clipboard field494;
   final EventQueue field500;
   boolean field495 = false;
   int field503;
   class53 field498;
   boolean field476 = false;
   int field485 = 0;
   Frame field505;
   Canvas field480;
   int field484 = 0;
   int field490;
   protected int field483;
   volatile boolean field493 = true;
   int field475;
   protected int field486;
   int field488;
   volatile long field497 = 0L;
   volatile boolean field496 = false;


   protected class62() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
         ;
      }

      this.field500 = var1;
      class106.method2383(new class55(), (short)-25430);
   }

   protected final boolean method1030(int var1) {
      String var2 = this.getDocumentBase().getHost().toLowerCase();
      if(!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
         if(!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
            if(var2.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var2.length() > 0 && var2.charAt(var2.length() - 1) >= 48 && var2.charAt(var2.length() - 1) <= 57) {
                  var2 = var2.substring(0, var2.length() - 1);
               }

               if(var2.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.method1120("invalidhost", -1862811389);
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public final synchronized void paint(Graphics var1) {
      if(this == field501 && !field489) {
         this.field493 = true;
         if(class217.method4014(150720946) - this.field497 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= class37.field277 && var2.height >= class221.field2525) {
               this.field496 = true;
            }
         }

      }
   }

   public final void destroy() {
      if(this == field501 && !field489) {
         field474 = class217.method4014(-1885743417);
         class169.method3527(5000L);
         this.method1037(1478721255);
      }
   }

   class328 method1016(byte var1) {
      Container var2 = this.method1050(-875370329);
      int var3 = Math.max(var2.getWidth(), this.field475);
      int var4 = Math.max(var2.getHeight(), this.field488);
      if(this.field505 != null) {
         Insets var5 = this.field505.getInsets();
         var3 -= var5.left + var5.right;
         var4 -= var5.top + var5.bottom;
      }

      return new class328(var3, var4);
   }

   Container method1050(int var1) {
      return (Container)(this.field505 != null?this.field505:this);
   }

   protected void method1120(String var1, int var2) {
      if(!this.field476) {
         this.field476 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
            ;
         }

      }
   }

   final void method1100(byte var1) {
      this.field495 = true;
   }

   final synchronized void method1029(byte var1) {
      Container var2 = this.method1050(-875370329);
      if(this.field480 != null) {
         this.field480.removeFocusListener(this);
         var2.remove(this.field480);
      }

      class37.field277 = Math.max(var2.getWidth(), this.field475);
      class221.field2525 = Math.max(var2.getHeight(), this.field488);
      Insets var3;
      if(this.field505 != null) {
         var3 = this.field505.getInsets();
         class37.field277 -= var3.left + var3.right;
         class221.field2525 -= var3.bottom + var3.top;
      }

      this.field480 = new class57(this);
      var2.setBackground(Color.BLACK);
      var2.setLayout((LayoutManager)null);
      var2.add(this.field480);
      this.field480.setSize(class37.field277, class221.field2525);
      this.field480.setVisible(true);
      this.field480.setBackground(Color.BLACK);
      if(var2 == this.field505) {
         var3 = this.field505.getInsets();
         this.field480.setLocation(this.field485 + var3.left, var3.top + this.field484);
      } else {
         this.field480.setLocation(this.field485, this.field484);
      }

      this.field480.addFocusListener(this);
      this.field480.requestFocus();
      this.field493 = true;
      if(class206.field2411 != null && class37.field277 == class206.field2411.field3870 && class221.field2525 == class206.field2411.field3869) {
         ((class61)class206.field2411).method1001(this.field480, 894605018);
         class206.field2411.vmethod6139(0, 0, 1321130014);
      } else {
         class206.field2411 = new class61(class37.field277, class221.field2525, this.field480);
      }

      this.field496 = false;
      this.field497 = class217.method4014(-1460462479);
   }

   final synchronized void method1037(int var1) {
      if(!field489) {
         field489 = true;

         try {
            this.field480.removeFocusListener(this);
         } catch (Exception var6) {
            ;
         }

         try {
            this.vmethod1404((short)8226);
         } catch (Exception var5) {
            ;
         }

         if(this.field505 != null) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
               ;
            }
         }

         if(class227.field2710 != null) {
            try {
               class227.field2710.method3548((byte)-64);
            } catch (Exception var3) {
               ;
            }
         }

         this.vmethod1399(-277226112);
      }
   }

   protected abstract void vmethod1404(short var1);

   final void method1024(byte var1) {
      Container var2 = this.method1050(-875370329);
      if(var2 != null) {
         class328 var3 = this.method1016((byte)-13);
         this.field483 = Math.max(var3.field3855, this.field475);
         this.field486 = Math.max(var3.field3856, this.field488);
         if(this.field483 <= 0) {
            this.field483 = 1;
         }

         if(this.field486 <= 0) {
            this.field486 = 1;
         }

         class37.field277 = Math.min(this.field483, this.field503);
         class221.field2525 = Math.min(this.field486, this.field490);
         this.field485 = (this.field483 - class37.field277) / 2;
         this.field484 = 0;
         this.field480.setSize(class37.field277, class221.field2525);
         class206.field2411 = new class61(class37.field277, class221.field2525, this.field480);
         if(var2 == this.field505) {
            Insets var4 = this.field505.getInsets();
            this.field480.setLocation(var4.left + this.field485, this.field484 + var4.top);
         } else {
            this.field480.setLocation(this.field485, this.field484);
         }

         this.field493 = true;
         this.vmethod1410((byte)108);
      }
   }

   protected abstract void vmethod1401(int var1);

   protected abstract void vmethod1399(int var1);

   protected final void method1025(int var1) {
      class35.field265 = null;
      class81.field1071 = null;
      class287.field3607 = null;
   }

   protected final void method1028(int var1, int var2, int var3, int var4) {
      try {
         if(field501 != null) {
            ++field473;
            if(field473 >= 3) {
               this.method1120("alreadyloaded", -1471682611);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field501 = this;
         class37.field277 = var1;
         class221.field2525 = var2;
         class350.field4073 = var3;
         class350.field4072 = this;
         if(class227.field2710 == null) {
            class227.field2710 = new class175();
         }

         class227.field2710.method3551(this, 1, (byte)-108);
      } catch (Exception var6) {
         class229.method4189((String)null, var6, -1131770525);
         this.method1120("crash", 486619878);
      }

   }

   protected final void method1066(int var1, String var2, boolean var3, int var4) {
      try {
         Graphics var5 = this.field480.getGraphics();
         if(class81.field1071 == null) {
            class81.field1071 = new Font("Helvetica", 1, 13);
            class287.field3607 = this.field480.getFontMetrics(class81.field1071);
         }

         if(var3) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, class37.field277, class221.field2525);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if(class35.field265 == null) {
               class35.field265 = this.field480.createImage(304, 34);
            }

            Graphics var7 = class35.field265.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var7.setFont(class81.field1071);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - class287.field3607.stringWidth(var2)) / 2, 22);
            var5.drawImage(class35.field265, class37.field277 / 2 - 152, class221.field2525 / 2 - 18, (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = class37.field277 / 2 - 152;
            int var9 = class221.field2525 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, var9 + 1, 301, 31);
            var5.fillRect(var8 + var1 * 3 + 2, var9 + 2, 300 - var1 * 3, 30);
            var5.setFont(class81.field1071);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - class287.field3607.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field480.repaint();
      }

   }

   void method1032(int var1) {
      Container var2 = this.method1050(-875370329);
      long var3 = class217.method4014(-45944015);
      long var5 = field481[class60.field465];
      field481[class60.field465] = var3;
      class60.field465 = class60.field465 + 1 & 31;
      if(0L != var5 && var3 > var5) {
         int var7 = (int)(var3 - var5);
         field479 = ((var7 >> 1) + 32000) / var7;
      }

      if(++field491 - 1 > 50) {
         field491 -= 50;
         this.field493 = true;
         this.field480.setSize(class37.field277, class221.field2525);
         this.field480.setVisible(true);
         if(var2 == this.field505) {
            Insets var8 = this.field505.getInsets();
            this.field480.setLocation(var8.left + this.field485, this.field484 + var8.top);
         } else {
            this.field480.setLocation(this.field485, this.field484);
         }
      }

      if(this.field496) {
         this.method1087((byte)-19);
      }

      this.method1033(317204031);
      this.vmethod1403(this.field493, (byte)1);
      if(this.field493) {
         this.method1026(1120637323);
      }

      this.field493 = false;
   }

   protected abstract void vmethod1402(byte var1);

   void method1031(int var1) {
      long var2 = class217.method4014(-1597441682);
      long var4 = field482[class82.field1083];
      field482[class82.field1083] = var2;
      class82.field1083 = class82.field1083 + 1 & 31;
      if(0L != var4 && var2 > var4) {
         ;
      }

      synchronized(this) {
         field502 = field478;
      }

      this.vmethod1402((byte)-113);
   }

   final void method1018(Object var1, int var2) {
      if(this.field500 != null) {
         for(int var3 = 0; var3 < 50 && this.field500.peekEvent() != null; ++var3) {
            class169.method3527(1L);
         }

         if(var1 != null) {
            this.field500.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   protected final void method1071(int var1) {
      class199.method3724((byte)75);
      Canvas var2 = this.field480;
      var2.setFocusTraversalKeysEnabled(false);
      var2.addKeyListener(class54.field413);
      var2.addFocusListener(class54.field413);
   }

   protected final void method1017(int var1, int var2, int var3) {
      if(this.field503 != var1 || var2 != this.field490) {
         this.method1100((byte)-25);
      }

      this.field503 = var1;
      this.field490 = var2;
   }

   protected final void method1059(byte var1) {
      class17.method179(this.field480, -1200132301);
   }

   protected class177 method1019(int var1) {
      if(this.field498 == null) {
         this.field498 = new class53();
         this.field498.method906(this.field480, 637751715);
      }

      return this.field498;
   }

   protected void method1042(byte var1) {
      this.field494 = this.getToolkit().getSystemClipboard();
   }

   protected abstract void vmethod1410(byte var1);

   final void method1087(byte var1) {
      Canvas var2 = this.field480;
      var2.removeKeyListener(class54.field413);
      var2.removeFocusListener(class54.field413);
      class54.field429 = -1;
      class329.method6041(this.field480, (byte)1);
      if(this.field498 != null) {
         this.field498.method907(this.field480, -1151636604);
      }

      this.method1029((byte)2);
      Canvas var3 = this.field480;
      var3.setFocusTraversalKeysEnabled(false);
      var3.addKeyListener(class54.field413);
      var3.addFocusListener(class54.field413);
      class17.method179(this.field480, -1945685195);
      if(this.field498 != null) {
         this.field498.method906(this.field480, 637751715);
      }

      this.method1100((byte)-102);
   }

   final void method1033(int var1) {
      class328 var2 = this.method1016((byte)-26);
      if(var2.field3855 != this.field483 || this.field486 != var2.field3856 || this.field495) {
         this.method1024((byte)1);
         this.field495 = false;
      }

   }

   protected abstract void vmethod1403(boolean var1, byte var2);

   void method1026(int var1) {
      int var2 = this.field485;
      int var3 = this.field484;
      int var4 = this.field483 - class37.field277 - var2;
      int var5 = this.field486 - class221.field2525 - var3;
      if(var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
         try {
            Container var6 = this.method1050(-875370329);
            int var7 = 0;
            int var8 = 0;
            if(var6 == this.field505) {
               Insets var9 = this.field505.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var11 = var6.getGraphics();
            var11.setColor(Color.black);
            if(var2 > 0) {
               var11.fillRect(var7, var8, var2, this.field486);
            }

            if(var3 > 0) {
               var11.fillRect(var7, var8, this.field483, var3);
            }

            if(var4 > 0) {
               var11.fillRect(var7 + this.field483 - var4, var8, var4, this.field486);
            }

            if(var5 > 0) {
               var11.fillRect(var7, var8 + this.field486 - var5, this.field483, var5);
            }
         } catch (Exception var10) {
            ;
         }
      }

   }

   protected void method1021(String var1, int var2) {
      this.field494.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected final boolean method1040(int var1) {
      return this.field505 != null;
   }

   public void run() {
      try {
         if(class175.field2039 != null) {
            String var1 = class175.field2039.toLowerCase();
            if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class175.field2041;
               if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method1120("wrongjava", 2133222215);
                  return;
               }

               if(var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class114.method2580(var2.charAt(var3), 210668082); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  if(class210.method3959(var4, (byte)119) && class64.method1217(var4, 3344543) < 10) {
                     this.method1120("wrongjava", -499205791);
                     return;
                  }
               }

               field487 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method1029((byte)2);
         this.vmethod1401(-678556074);
         field472 = class74.method1326(1735702864);

         while(0L == field474 || class217.method4014(717184533) < field474) {
            class143.field1877 = field472.vmethod3578(field477, field487, -1723558008);

            for(int var5 = 0; var5 < class143.field1877; ++var5) {
               this.method1031(633792840);
            }

            this.method1032(-1772330803);
            this.method1018(this.field480, 2088668403);
         }
      } catch (Exception var6) {
         class229.method4189((String)null, var6, -1131770525);
         this.method1120("crash", -1621115960);
      }

      this.method1037(1478721255);
   }

   public final void start() {
      if(this == field501 && !field489) {
         field474 = 0L;
      }
   }

   public final void stop() {
      if(this == field501 && !field489) {
         field474 = class217.method4014(-2140507306) + 4000L;
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void focusLost(FocusEvent var1) {
      field478 = false;
   }

   public abstract void init();

   public final void windowOpened(WindowEvent var1) {}

   public final void windowActivated(WindowEvent var1) {}

   public final void windowDeactivated(WindowEvent var1) {}

   public final void windowClosed(WindowEvent var1) {}

   public final void focusGained(FocusEvent var1) {
      field478 = true;
      this.field493 = true;
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeiconified(WindowEvent var1) {}

   public final void windowIconified(WindowEvent var1) {}

   public static final void method1155(int var0) {
      class137.field1761 = false;
      class137.field1759 = 0;
   }
}
