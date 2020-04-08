package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class286 {

   final int field3600;
   HashMap field3604;
   class283[] field3599;
   int field3602 = 0;
   Comparator field3601 = null;
   HashMap field3603;


   class286(int var1) {
      this.field3600 = var1;
      this.field3599 = this.vmethod5281(var1, -667029686);
      this.field3604 = new HashMap(var1 / 8);
      this.field3603 = new HashMap(var1 / 8);
   }

   public class283 method5202(class292 var1, int var2) {
      class283 var3 = this.method5119(var1, -678771148);
      return var3 != null?var3:this.method5120(var1, 1317746514);
   }

   final int method5151(class283 var1, int var2) {
      for(int var3 = 0; var3 < this.field3602; ++var3) {
         if(this.field3599[var3] == var1) {
            return var3;
         }
      }

      return -1;
   }

   class283 method5184(class292 var1, class292 var2, byte var3) {
      if(this.method5119(var1, -678771148) != null) {
         throw new IllegalStateException();
      } else {
         class283 var4 = this.vmethod5269(-1332552421);
         var4.method5079(var1, var2, (short)255);
         this.method5176(var4, 1612214268);
         this.method5131(var4, 1080849523);
         return var4;
      }
   }

   final void method5164(class283 var1, byte var2) {
      if(this.field3604.remove(var1.field3590) == null) {
         throw new IllegalStateException();
      } else {
         if(var1.field3591 != null) {
            this.field3603.remove(var1.field3591);
         }

      }
   }

   class283 method5119(class292 var1, int var2) {
      return !var1.method5239(-1005152425)?null:(class283)this.field3604.get(var1);
   }

   public int method5115(byte var1) {
      return this.field3602;
   }

   public boolean method5174(int var1) {
      return this.field3600 == this.field3602;
   }

   public final void method5126(short var1) {
      if(this.field3601 == null) {
         Arrays.sort(this.field3599, 0, this.field3602);
      } else {
         Arrays.sort(this.field3599, 0, this.field3602, this.field3601);
      }

   }

   public boolean method5117(class292 var1, int var2) {
      return !var1.method5239(-1005152425)?false:(this.field3604.containsKey(var1)?true:this.field3603.containsKey(var1));
   }

   class283 method5120(class292 var1, int var2) {
      return !var1.method5239(-1005152425)?null:(class283)this.field3603.get(var1);
   }

   abstract class283 vmethod5269(int var1);

   final void method5132(int var1, byte var2) {
      --this.field3602;
      if(var1 < this.field3602) {
         System.arraycopy(this.field3599, var1 + 1, this.field3599, var1, this.field3602 - var1);
      }

   }

   public void method5161(int var1) {
      this.field3602 = 0;
      Arrays.fill(this.field3599, (Object)null);
      this.field3604.clear();
      this.field3603.clear();
   }

   final void method5195(class283 var1, int var2) {
      int var3 = this.method5151(var1, -1683425809);
      if(var3 != -1) {
         this.method5132(var3, (byte)-23);
         this.method5164(var1, (byte)28);
      }
   }

   public final class283 method5196(int var1, short var2) {
      if(var1 >= 0 && var1 < this.field3602) {
         return this.field3599[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   final void method5131(class283 var1, int var2) {
      this.field3604.put(var1.field3590, var1);
      if(var1.field3591 != null) {
         class283 var3 = (class283)this.field3603.put(var1.field3591, var1);
         if(var3 != null && var3 != var1) {
            var3.field3591 = null;
         }
      }

   }

   abstract class283[] vmethod5281(int var1, int var2);

   public final boolean method5121(class292 var1, int var2) {
      class283 var3 = this.method5119(var1, -678771148);
      if(var3 == null) {
         return false;
      } else {
         this.method5195(var3, 1801318248);
         return true;
      }
   }

   final void method5176(class283 var1, int var2) {
      this.field3599[++this.field3602 - 1] = var1;
   }

   class283 method5123(class292 var1, int var2) {
      return this.method5184(var1, (class292)null, (byte)38);
   }

   final void method5127(class283 var1, class292 var2, class292 var3, int var4) {
      this.method5164(var1, (byte)45);
      var1.method5079(var2, var3, (short)255);
      this.method5131(var1, 1080849523);
   }

   public final void method5135(byte var1) {
      this.field3601 = null;
   }

   public final void method5136(Comparator var1, int var2) {
      if(this.field3601 == null) {
         this.field3601 = var1;
      } else if(this.field3601 instanceof class284) {
         ((class284)this.field3601).method5086(var1, 747268472);
      }

   }

   public static void method5155(class243 var0, short var1) {
      class249.field3199 = var0;
   }

   static int method5201(int var0, class101 var1, boolean var2, byte var3) {
      int var5 = -1;
      class226 var4;
      if(var0 >= 2000) {
         var0 -= 1000;
         var5 = class85.field1115[--class85.field1117];
         var4 = class208.method3898(var5, (byte)-21);
      } else {
         var4 = var2?class20.field115:class85.field1130;
      }

      if(var0 == 1100) {
         class85.field1117 -= 2;
         var4.field2646 = class85.field1115[class85.field1117];
         if(var4.field2646 > var4.field2590 - var4.field2582) {
            var4.field2646 = var4.field2590 - var4.field2582;
         }

         if(var4.field2646 < 0) {
            var4.field2646 = 0;
         }

         var4.field2589 = class85.field1115[class85.field1117 + 1];
         if(var4.field2589 > var4.field2597 - var4.field2642) {
            var4.field2589 = var4.field2597 - var4.field2642;
         }

         if(var4.field2589 < 0) {
            var4.field2589 = 0;
         }

         class68.method1273(var4, 811926916);
         return 1;
      } else if(var0 == 1101) {
         var4.field2592 = class85.field1115[--class85.field1117];
         class68.method1273(var4, -978737413);
         return 1;
      } else if(var0 == 1102) {
         var4.field2685 = class85.field1115[--class85.field1117] == 1;
         class68.method1273(var4, -1521814907);
         return 1;
      } else if(var0 == 1103) {
         var4.field2640 = class85.field1115[--class85.field1117];
         class68.method1273(var4, 110508747);
         return 1;
      } else if(var0 == 1104) {
         var4.field2600 = class85.field1115[--class85.field1117];
         class68.method1273(var4, -1632662707);
         return 1;
      } else if(var0 == 1105) {
         var4.field2602 = class85.field1115[--class85.field1117];
         class68.method1273(var4, -1077973907);
         return 1;
      } else if(var0 == 1106) {
         var4.field2604 = class85.field1115[--class85.field1117];
         class68.method1273(var4, 569104142);
         return 1;
      } else if(var0 == 1107) {
         var4.field2605 = class85.field1115[--class85.field1117] == 1;
         class68.method1273(var4, 1594732132);
         return 1;
      } else if(var0 == 1108) {
         var4.field2610 = 1;
         var4.field2611 = class85.field1115[--class85.field1117];
         class68.method1273(var4, -156235224);
         return 1;
      } else if(var0 == 1109) {
         class85.field1117 -= 6;
         var4.field2616 = class85.field1115[class85.field1117];
         var4.field2617 = class85.field1115[class85.field1117 + 1];
         var4.field2618 = class85.field1115[class85.field1117 + 2];
         var4.field2619 = class85.field1115[class85.field1117 + 3];
         var4.field2657 = class85.field1115[class85.field1117 + 4];
         var4.field2659 = class85.field1115[class85.field1117 + 5];
         class68.method1273(var4, -1645814305);
         return 1;
      } else {
         int var9;
         if(var0 == 1110) {
            var9 = class85.field1115[--class85.field1117];
            if(var9 != var4.field2614) {
               var4.field2614 = var9;
               var4.field2587 = 0;
               var4.field2696 = 0;
               class68.method1273(var4, 50263813);
            }

            return 1;
         } else if(var0 == 1111) {
            var4.field2624 = class85.field1115[--class85.field1117] == 1;
            class68.method1273(var4, -2071262030);
            return 1;
         } else if(var0 == 1112) {
            String var8 = class85.field1118[--class85.field1119];
            if(!var8.equals(var4.field2628)) {
               var4.field2628 = var8;
               class68.method1273(var4, -695253435);
            }

            return 1;
         } else if(var0 == 1113) {
            var4.field2627 = class85.field1115[--class85.field1117];
            class68.method1273(var4, -544148269);
            return 1;
         } else if(var0 == 1114) {
            class85.field1117 -= 3;
            var4.field2631 = class85.field1115[class85.field1117];
            var4.field2645 = class85.field1115[class85.field1117 + 1];
            var4.field2630 = class85.field1115[class85.field1117 + 2];
            class68.method1273(var4, 1130358550);
            return 1;
         } else if(var0 == 1115) {
            var4.field2684 = class85.field1115[--class85.field1117] == 1;
            class68.method1273(var4, -1205056457);
            return 1;
         } else if(var0 == 1116) {
            var4.field2606 = class85.field1115[--class85.field1117];
            class68.method1273(var4, 1067651552);
            return 1;
         } else if(var0 == 1117) {
            var4.field2607 = class85.field1115[--class85.field1117];
            class68.method1273(var4, 1648026014);
            return 1;
         } else if(var0 == 1118) {
            var4.field2608 = class85.field1115[--class85.field1117] == 1;
            class68.method1273(var4, -1016049551);
            return 1;
         } else if(var0 == 1119) {
            var4.field2609 = class85.field1115[--class85.field1117] == 1;
            class68.method1273(var4, -1932931377);
            return 1;
         } else if(var0 == 1120) {
            class85.field1117 -= 2;
            var4.field2590 = class85.field1115[class85.field1117];
            var4.field2597 = class85.field1115[class85.field1117 + 1];
            class68.method1273(var4, 586301230);
            if(var5 != -1 && var4.field2569 == 0) {
               class63.method1161(class226.field2693[var5 >> 16], var4, false, -230007068);
            }

            return 1;
         } else if(var0 == 1121) {
            class58.method968(var4.field2567, var4.field2709, -1252458216);
            client.field882 = var4;
            class68.method1273(var4, -1043728051);
            return 1;
         } else if(var0 == 1122) {
            var4.field2578 = class85.field1115[--class85.field1117];
            class68.method1273(var4, 117436938);
            return 1;
         } else if(var0 == 1123) {
            var4.field2636 = class85.field1115[--class85.field1117];
            class68.method1273(var4, 1398218298);
            return 1;
         } else if(var0 == 1124) {
            var4.field2599 = class85.field1115[--class85.field1117];
            class68.method1273(var4, -1391069450);
            return 1;
         } else if(var0 == 1125) {
            var9 = class85.field1115[--class85.field1117];
            class332 var7 = (class332)class16.method159(class208.method3899(-133902824), var9, -1609956543);
            if(var7 != null) {
               var4.field2651 = var7;
               class68.method1273(var4, 345207759);
            }

            return 1;
         } else {
            boolean var6;
            if(var0 == 1126) {
               var6 = class85.field1115[--class85.field1117] == 1;
               var4.field2601 = var6;
               return 1;
            } else if(var0 == 1127) {
               var6 = class85.field1115[--class85.field1117] == 1;
               var4.field2625 = var6;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
