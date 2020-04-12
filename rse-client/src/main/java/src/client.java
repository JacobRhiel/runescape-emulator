package src;

import netscape.javascript.JSObject;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class client extends class62 implements class289 {

   static boolean field749 = true;
   static int field917 = 0;
   static int field849 = 0;
   static int field754 = 0;
   public static int field680 = 1;
   static int field924 = -1;
   static class226 field853 = null;
   static int field693 = 0;
   static int field689 = 0;
   static int field687 = 0;
   public static final class104 field761 = new class104();
   static int field815 = 0;
   static boolean field770 = false;
   static int field883 = 0;
   static int field802 = 0;
   static int field884 = -2;
   static long field893 = 0L;
   public static int field891 = -1;
   static int field709 = 0;
   static int[] field779 = new int[500];
   static int field681 = 0;
   static int field860 = 0;
   static boolean[] field679 = new boolean[100];
   static int field713 = 0;
   static int field711 = 0;
   static boolean[] field809 = new boolean[500];
   static boolean field684 = false;
   static boolean field816 = false;
   static int field682 = 0;
   static class281 field796 = new class281();
   static int field829 = -1;
   static boolean[] field813 = new boolean[100];
   static boolean[] field886 = new boolean[100];
   static String[] field823 = new String[500];
   static class75[] players = new class75[2048];
   static int field798 = 0;
   static boolean field861 = false;
   public static boolean field683 = false;
   static int field685 = -1;
   static boolean field728 = false;
   static int field830 = -1;
   static class97 field717 = new class97();
   static boolean field729 = true;
   static boolean field894 = true;
   static String[] field822 = new String[500];
   static int field865 = 1;
   static int field873 = 0;
   static int field743 = 0;
   static boolean field732 = false;
   static boolean field915 = false;
   static int field712 = 0;
   static boolean field782 = false;
   static int field855 = 0;
   static boolean field701 = true;
   static int field928 = 0;
   static int[] field776 = new int[500];
   static int field859 = -1;
   static int[] field856 = new int[500];
   static long field766 = 1L;
   static int field691 = -1;
   static boolean field785 = true;
   static class327 field750 = new class327(512);
   static int field692 = -1;
   static class226 field854 = null;
   static int field784 = 0;
   static int[] field858 = new int[500];
   static long field875 = -1L;
   static class327 field841 = new class327(8);
   static boolean field694 = true;
   static int[] field733 = new int[100];
   static int field783 = 0;
   static int field741 = 0;
   static boolean field934 = false;
   static boolean field887 = false;
   static int[] field950 = new int[100];
   static int field881 = -1;
   static int field922 = 0;
   static int field793 = 0;
   static class226 field852 = null;
   static int field892 = 0;
   static int field688 = 0;
   static int field889 = 0;
   static int[] field686 = new int[25];
   static int field698 = 0;
   static int field789 = 0;
   static int field899 = 0;
   static int field800 = 0;
   static int[] field736 = new int[100];
   static int field696 = 0;
   static int field818 = 0;
   static int field700 = 0;
   static int[] field752 = new int[25];
   static int[] field939 = new int[100];
   static int field921 = 1;
   static boolean field795 = true;
   static int field734 = 0;
   static int field763 = 0;
   static int field735 = 1;
   static int field702 = 0;
   static int[] field821 = new int[25];
   static int field817 = 0;
   static final class74 field954 = new class74();
   static int field703 = 0;
   static class271 field787 = new class271();
   static int field704 = 0;
   static int field834 = -1;
   static boolean field888 = false;
   static boolean[] field926 = new boolean[5];
   static int field863 = -1;
   static class93 field705 = class93.field1185;
   static int[] field788 = new int[5];
   static final int[] field699 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
   static int field862 = 0;
   static int field786 = 0;
   static int[] field730 = new int[5];
   static class181[] field737 = new class181[4];
   static class93 field706 = class93.field1185;
   static int[] field929 = new int[5];
   static int field707 = 0;
   static int field896 = 0;
   static int[] field930 = new int[5];
   static boolean field828 = true;
   static int[] field866 = new int[32];
   static int field833 = 0;
   static int field772 = 0;
   static int field880 = 0;
   static boolean field835 = false;
   static int[] field955 = new int[50];
   static int[] field956 = new int[50];
   static int field762 = 0;
   static class271 field697 = new class271();
   static boolean field864 = false;
   static class271[][][] field808 = new class271[4][104][104];
   static int field914 = -1;
   static int field847 = 0;
   static int field714 = 0;
   static String field838 = null;
   static String field933 = null;
   static int field848 = 0;
   static String field839 = null;
   static class169 field715 = class169.field2008;
   static int field910 = 0;
   static class88[] field721 = new class88['\u8000'];
   static boolean field716 = false;
   static int field836 = -1;
   static int field911 = 0;
   static int field797 = -1;
   static byte[] field720 = null;
   static int field945 = -1;
   static int field722 = 0;
   static int field764 = 0;
   static int[] field723 = new int['\u8000'];
   static class223 field944 = new class223();
   static int field957;
   static int field851 = 0;
   static int field758 = 127;
   static int field946 = -1;
   static int[] field725 = new int[250];
   static int field878 = 0;
   static class226 field857 = null;
   static int field877 = 0;
   static int field913 = 255;
   static boolean field765 = false;
   static int field936 = 0;
   static int[] field879 = new int[50];
   static int[] field920 = new int[50];
   static int field778 = 0;
   static int field912 = 0;
   static HashMap field731 = new HashMap();
   static int[] field876 = new int[50];
   static int field916 = 127;
   static class110[] field923 = new class110[50];
   static int field909 = 0;
   static boolean field799 = true;
   static int[] field953 = new int[50];
   static ArrayList field951 = new ArrayList(10);
   static int field726 = 0;
   static int field952 = 0;
   static int[] field868 = new int[32];
   static int field807 = -1;
   static int field832 = 50;
   static int field869 = 0;
   static int field871 = 0;
   static boolean field738 = false;
   static int field742 = 2301979;
   static int[][][] field739 = new int[4][13][13];
   static int field844 = 0;
   static class226 field882 = null;
   static int field845 = 0;
   static class271 field810 = new class271();
   static class271 field811 = new class271();
   static int field695 = -1;
   static int field874 = 0;
   static short field931 = 256;
   static short field932 = 205;
   static short field937 = 1;
   static int field824 = 128;
   static class339 field947 = new class338();
   static short field938 = 32767;
   static int field840 = -1;
   static short field748 = 32767;
   static int field943 = 0;
   static short field935 = 1;
   static int field820 = 0;
   static int field747 = 5063219;
   static int field906 = 0;
   static long[] field846 = new long[100];
   static int[][] field777 = new int[104][104];
   static int[] field907 = new int[1000];
   static int field744 = 3353893;
   static long field904 = -1L;
   static int field745 = 7759444;
   static int[] field870 = new int[32];
   static boolean field746 = false;
   static int field792 = 0;
   static int field819 = 0;
   static int[] field867 = new int[1000];
   static int field708 = 0;
   static int field794 = 0;
   static class334[] field885 = new class334[1000];
   static int field751 = 0;
   static int field900 = 0;
   static int field942 = 0;
   static int field740 = 0;
   static int field905 = 0;
   static int field753 = 0;
   static int field940 = 0;
   static int field755 = 50;
   static int field757 = 0;
   static int field724 = 0;
   static int field759 = 0;
   static int field925;
   static int field760 = 12;
   static int field890 = 6;
   static int field901 = 0;
   static int field941 = 0;
   static int field767 = 0;
   static int field768 = 50;
   static int[] field769 = new int[field768];
   static int field903 = 0;
   static int[] field831 = new int[field768];
   static int[] field872 = new int[128];
   static int[] field771 = new int[field768];
   static class271 field727 = new class271();
   static int field898 = 0;
   static int[] field902 = new int[128];
   static int[] field908 = new int[field768];
   static int field801 = 0;
   static class271 field919 = new class271();
   static int[] field773 = new int[field768];
   static int field756;
   static int[] field927 = new int[field768];
   static int[] field775 = new int[field768];
   static boolean field710 = false;
   static String[] field781 = new String[field768];
   static int[] field918 = new int[1000];
   static String[] field804 = new String[8];
   static short field897 = 256;
   static short field850 = 320;
   static int field812 = -1;
   static boolean[] field805 = new boolean[8];
   static int field780 = -1;
   static int field842 = 0;
   static int field843 = -1;
   static int field791 = 0;
   static int[] field806 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
   static int field690 = 0;
   static final int[] field803 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
   static class18[] field948 = new class18[8];
   static int[] field895 = new int[]{16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
   static int field774 = 0;
   static boolean field826 = false;
   static int field837 = -1;
   static boolean field825 = false;
   static String field814 = "";
   static class76 field949 = new class76();
   static boolean field827 = false;
   class9 field719;
   class309 field718;


   void method1443(byte var1) {
      if(field687 != 1000) {
         long var3 = class217.method4014(-1306232269);
         int var5 = (int)(var3 - class246.field3165);
         class246.field3165 = var3;
         if(var5 > 200) {
            var5 = 200;
         }

         class246.field3168 += var5;
         boolean var2;
         if(class246.field3173 == 0 && class246.field3169 == 0 && class246.field3172 == 0 && class246.field3167 == 0) {
            var2 = true;
         } else if(class246.field3180 == null) {
            var2 = false;
         } else {
            try {
               if(class246.field3168 > 30000) {
                  throw new IOException();
               }

               class242 var6;
               class309 var7;
               while(class246.field3169 < 200 && class246.field3167 > 0) {
                  var6 = (class242)class246.field3166.method5995();
                  var7 = new class309(4);
                  var7.readByte(1, 1258821856);
                  var7.method5588((int)var6.field2116, 794369714);
                  class246.field3180.vmethod5878(var7.field3709, 0, 4, -2040746201);
                  class246.field3174.method5997(var6, var6.field2116);
                  --class246.field3167;
                  ++class246.field3169;
               }

               while(class246.field3173 < 200 && class246.field3172 > 0) {
                  var6 = (class242)class246.field3170.method4854();
                  var7 = new class309(4);
                  var7.readByte(0, 1258821856);
                  var7.method5588((int)var6.field2116, 1691206365);
                  class246.field3180.vmethod5878(var7.field3709, 0, 4, 129999597);
                  var6.method3653();
                  class246.field3175.method5997(var6, var6.field2116);
                  --class246.field3172;
                  ++class246.field3173;
               }

               int var18 = 0;

               while(true) {
                  if(var18 < 100) {
                     int var19 = class246.field3180.vmethod5862(195119972);
                     if(var19 < 0) {
                        throw new IOException();
                     }

                     if(var19 != 0) {
                        label243: {
                           class246.field3168 = 0;
                           byte var8 = 0;
                           if(class246.field3181 == null) {
                              var8 = 8;
                           } else if(class246.field3178 == 0) {
                              var8 = 1;
                           }

                           int var9;
                           int var10;
                           int var11;
                           int var13;
                           if(var8 > 0) {
                              var9 = var8 - class246.field3176.field3710;
                              if(var9 > var19) {
                                 var9 = var19;
                              }

                              class246.field3180.vmethod5864(class246.field3176.field3709, class246.field3176.field3710, var9, (byte)39);
                              if(class246.field3163 != 0) {
                                 for(var10 = 0; var10 < var9; ++var10) {
                                    class246.field3176.field3709[class246.field3176.field3710 + var10] ^= class246.field3163;
                                 }
                              }

                              class246.field3176.field3710 += var9;
                              if(class246.field3176.field3710 < var8) {
                                 break label243;
                              }

                              if(class246.field3181 == null) {
                                 class246.field3176.field3710 = 0;
                                 var10 = class246.field3176.readUnsignedByte((byte)118);
                                 var11 = class246.field3176.readShort((byte)109);
                                 int var12 = class246.field3176.readUnsignedByte((byte)117);
                                 var13 = class246.field3176.readInt(297718403);
                                 long var14 = (long)(var11 + (var10 << 16));
                                 class242 var16 = (class242)class246.field3174.method6010(var14);
                                 class76.field677 = true;
                                 if(var16 == null) {
                                    var16 = (class242)class246.field3175.method6010(var14);
                                    class76.field677 = false;
                                 }

                                 if(var16 == null) {
                                    throw new IOException();
                                 }

                                 int var17 = var12 == 0?5:9;
                                 class246.field3181 = var16;
                                 class246.field3177 = new class309(var13 + var17 + class246.field3181.field3120);
                                 class246.field3177.readByte(var12, 1258821856);
                                 class246.field3177.method5689(var13, 747474969);
                                 class246.field3178 = 8;
                                 class246.field3176.field3710 = 0;
                              } else if(class246.field3178 == 0) {
                                 if(class246.field3176.field3709[0] == -1) {
                                    class246.field3178 = 1;
                                    class246.field3176.field3710 = 0;
                                 } else {
                                    class246.field3181 = null;
                                 }
                              }
                           } else {
                              var9 = class246.field3177.field3709.length - class246.field3181.field3120;
                              var10 = 512 - class246.field3178;
                              if(var10 > var9 - class246.field3177.field3710) {
                                 var10 = var9 - class246.field3177.field3710;
                              }

                              if(var10 > var19) {
                                 var10 = var19;
                              }

                              class246.field3180.vmethod5864(class246.field3177.field3709, class246.field3177.field3710, var10, (byte)33);
                              if(class246.field3163 != 0) {
                                 for(var11 = 0; var11 < var10; ++var11) {
                                    class246.field3177.field3709[var11 + class246.field3177.field3710] ^= class246.field3163;
                                 }
                              }

                              class246.field3177.field3710 += var10;
                              class246.field3178 += var10;
                              if(var9 == class246.field3177.field3710) {
                                 if(class246.field3181.field2116 == 16711935L) {
                                    class13.field59 = class246.field3177;

                                    for(var11 = 0; var11 < 256; ++var11) {
                                       class245 var20 = class246.field3164[var11];
                                       if(var20 != null) {
                                          class13.field59.field3710 = var11 * 8 + 5;
                                          var13 = class13.field59.readInt(297718403);
                                          int var21 = class13.field59.readInt(297718403);
                                          var20.method4323(var13, var21, (byte)60);
                                       }
                                    }
                                 } else {
                                    class246.field3179.reset();
                                    class246.field3179.update(class246.field3177.field3709, 0, var9);
                                    var11 = (int)class246.field3179.getValue();
                                    if(var11 != class246.field3181.field3124) {
                                       try {
                                          class246.field3180.vmethod5866((byte)14);
                                       } catch (Exception var24) {
                                          ;
                                       }

                                       ++class246.field3182;
                                       class246.field3180 = null;
                                       class246.field3163 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                                       var2 = false;
                                       break;
                                    }

                                    class246.field3182 = 0;
                                    class246.field3183 = 0;
                                    class246.field3181.field3121.method4320((int)(class246.field3181.field2116 & 65535L), class246.field3177.field3709, (class246.field3181.field2116 & 16711680L) == 16711680L, class76.field677, -1921982231);
                                 }

                                 class246.field3181.method3657();
                                 if(class76.field677) {
                                    --class246.field3169;
                                 } else {
                                    --class246.field3173;
                                 }

                                 class246.field3178 = 0;
                                 class246.field3181 = null;
                                 class246.field3177 = null;
                              } else {
                                 if(class246.field3178 != 512) {
                                    break label243;
                                 }

                                 class246.field3178 = 0;
                              }
                           }

                           ++var18;
                           continue;
                        }
                     }
                  }

                  var2 = true;
                  break;
               }
            } catch (IOException var25) {
               try {
                  class246.field3180.vmethod5866((byte)-52);
               } catch (Exception var23) {
                  ;
               }

               ++class246.field3183;
               class246.field3180 = null;
               var2 = false;
            }
         }

         if(!var2) {
            this.method1406(-1183665566);
         }

      }
   }

   public class292 vmethod5223(int var1) {
      return class311.field3717 != null?class311.field3717.field652:null;
   }

   void method1445(int var1) {
      int var2 = class37.field277;
      int var3 = class221.field2525;
      if(super.field483 < var2) {
         var2 = super.field483;
      }

      if(super.field486 < var3) {
         var3 = super.field486;
      }

      if(class76.field676 != null) {
         try {
            client var4 = class42.field318;
            Object[] var5 = new Object[]{Integer.valueOf(class74.method1327(1980172670))};
            JSObject.getWindow(var4).call("resize", var5);
         } catch (Throwable var6) {
            ;
         }
      }

   }

   protected final void vmethod1404(short var1) {
      if(class160.field1983.method2250(2008113856)) {
         class160.field1983.method2247(316912893);
      }

      if(class207.field2434 != null) {
         class207.field2434.field619 = false;
      }

      class207.field2434 = null;
      field761.method2349(955020520);
      if(class54.field413 != null) {
         class54 var2 = class54.field413;
         synchronized(class54.field413) {
            class54.field413 = null;
         }
      }

      class86.method2107((byte)-22);
      class97.field1262 = null;
      if(class45.field367 != null) {
         class45.field367.method2525(1429321858);
      }

      if(class30.field211 != null) {
         class30.field211.method2525(-1390717833);
      }

      class7.method104(-1823376013);
      Object var10 = class244.field3150;
      synchronized(class244.field3150) {
         if(class244.field3151 != 0) {
            class244.field3151 = 1;

            try {
               class244.field3150.wait();
            } catch (InterruptedException var6) {
               ;
            }
         }
      }

      if(class37.field276 != null) {
         class37.field276.method3395((byte)0);
         class37.field276 = null;
      }

      try {
         class176.field2051.method6618(-859079735);

         for(int var5 = 0; var5 < class70.field595; ++var5) {
            class196.field2345[var5].method6618(-1062058206);
         }

         class176.field2055.method6618(-1372940594);
         class176.field2053.method6618(206969897);
      } catch (Exception var8) {
         ;
      }

   }

   protected final void vmethod1401(int var1) {
      int[] var2 = new int[]{20, 260, 10000};
      int[] var3 = new int[]{1000, 100, 500};
      if(var2 != null && var3 != null) {
         class350.field4067 = var2;
         class311.field3715 = new int[var2.length];
         class311.field3722 = new byte[var2.length][][];

         for(int var6 = 0; var6 < class350.field4067.length; ++var6) {
            class311.field3722[var6] = new byte[var3[var6]][];
         }
      } else {
         class350.field4067 = null;
         class311.field3715 = null;
         class311.field3722 = null;
      }

      class26.field157 = field682 == 0?'\uaa4a':field680 + '\u9c40';
      class21.field120 = field682 == 0?443:field680 + '\uc350';
      class280.field3574 = class26.field157;
      class37.field278 = class224.field2544;
      class138.field1764 = class224.field2547;
      class223.field2539 = class224.field2546;
      class223.field2535 = class224.field2545;
      class37.field276 = new class152();
      this.method1071(-1901343027);
      this.method1059((byte)0);
      class97.field1262 = this.method1019(-2143582784);
      class38.field295 = new class317(255, class176.field2051, class176.field2055, 500000);
      class76.field676 = class48.method813((byte)-96);
      this.method1042((byte)9);
      String var5 = class44.field347;
      class60.field461 = this;
      if(var5 != null) {
         class60.field462 = var5;
      }

      if(field682 != 0) {
         field934 = true;
      }

      class32.method406(class76.field676.field1079, 265635085);
      class95.field1252 = new class83(class27.field164);
   }

   final void method1417(boolean var1, byte var2) {
      int var3 = field924;
      int var4 = class37.field277;
      int var5 = class221.field2525;
      if(class81.method1900(var3, -1204549979)) {
         class70.method1280(class226.field2693[var3], -1, var4, var5, var1, -1930613556);
      }

   }

   void method1649(int var1, int var2) {
      class45.field368 = null;
      class208.field2468 = null;
      field860 = 0;
      if(class26.field157 == class280.field3574) {
         class280.field3574 = class21.field120;
      } else {
         class280.field3574 = class26.field157;
      }

      ++field743;
      if(field743 >= 2 && (var1 == 7 || var1 == 9)) {
         if(field687 <= 5) {
            this.method1120("js5connect_full", -2007240716);
            field687 = 1000;
         } else {
            field709 = 3000;
         }
      } else if(field743 >= 2 && var1 == 6) {
         this.method1120("js5connect_outofdate", -392631475);
         field687 = 1000;
      } else if(field743 >= 4) {
         if(field687 <= 5) {
            this.method1120("js5connect", 745544851);
            field687 = 1000;
         } else {
            field709 = 3000;
         }
      }

   }

   final boolean method1796(int var1) {
      int var2 = class30.method381((byte)13);
      return (field815 == 1 && field693 > 2 || class9.method121(var2, (short)32767)) && !field809[var2];
   }

   protected final void vmethod1399(int var1) {}

   final boolean method1522(class104 var1, int var2) {
      class314 var3 = var1.method2359(1226072225);
      class308 var4 = var1.field1337;
      if(var3 == null) {
         return false;
      } else {
         int var7;
         String var28;
         try {
            int var6;
            if(var1.field1332 == null) {
               if(var1.field1335) {
                  if(!var3.vmethod5861(1, (byte)0)) {
                     return false;
                  }

                  var3.vmethod5864(var1.field1337.field3709, 0, 1, (byte)-50);
                  var1.field1338 = 0;
                  var1.field1335 = false;
               }

               var4.field3710 = 0;
               if(var4.method5497((byte)36)) {
                  if(!var3.vmethod5861(1, (byte)0)) {
                     return false;
                  }

                  var3.vmethod5864(var1.field1337.field3709, 1, 1, (byte)-55);
                  var1.field1338 = 0;
               }

               var1.field1335 = true;
               ServerPacket[] var5 = class54.method938((byte)46);
               var6 = var4.method5494(1803454341);
               if(var6 < 0 || var6 >= var5.length) {
                  throw new IOException(var6 + " " + var4.field3710);
               }

               var1.field1332 = var5[var6];
               var1.field1333 = var1.field1332.field2205;
            }

            if(var1.field1333 == -1) {
               if(!var3.vmethod5861(1, (byte)0)) {
                  return false;
               }

               var1.method2359(-1151027828).vmethod5864(var4.field3709, 0, 1, (byte)50);
               var1.field1333 = var4.field3709[0] & 255;
            }

            if(var1.field1333 == -2) {
               if(!var3.vmethod5861(2, (byte)0)) {
                  return false;
               }

               var1.method2359(-327241777).vmethod5864(var4.field3709, 0, 2, (byte)43);
               var4.field3710 = 0;
               var1.field1333 = var4.readShort((byte)86);
            }

            if(!var3.vmethod5861(var1.field1333, (byte)0)) {
               return false;
            }

            var4.field3710 = 0;
            var3.vmethod5864(var4.field3709, 0, var1.field1333, (byte)106);
            var1.field1338 = 0;
            field796.method5027(-2076802679);
            var1.field1339 = var1.field1329;
            var1.field1329 = var1.field1334;
            var1.field1334 = var1.field1332;
            int var17;
            if(ServerPacket.field2204 == var1.field1332) {
               var17 = var4.method5587(438416270);
               var6 = var4.method5611(-1049580829);
               System.out.println("large varp: " + var17 + ", " + var6);
               class221.field2524[var17] = var6;
               if(class221.field2526[var17] != var6) {
                  class221.field2526[var17] = var6;
               }

               class22.method253(var17, (byte)-116);
               field866[++field772 - 1 & 31] = var17;
               var1.field1332 = null;
               return true;
            }

            int var43;
            if(ServerPacket.field2129 == var1.field1332) {
               var17 = var4.readUnsignedByte((byte)69);
               var6 = var4.readUnsignedByte((byte)60);
               var7 = var4.readUnsignedByte((byte)100);
               var43 = var4.readUnsignedByte((byte)26);
               field926[var17] = true;
               field788[var17] = var6;
               field730[var17] = var7;
               field929[var17] = var43;
               field930[var17] = 0;
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2160 == var1.field1332) {
               class48.updateEntityType(class194.field2325, (byte)49);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2187 == var1.field1332) {
               field888 = true;
               class87.field1145 = var4.readUnsignedByte((byte)22);
               class31.field217 = var4.readUnsignedByte((byte)30);
               class4.field20 = var4.readShort((byte)65);
               class14.field64 = var4.readUnsignedByte((byte)112);
               class242.field3126 = var4.readUnsignedByte((byte)83);
               if(class242.field3126 >= 100) {
                  class31.field220 = class87.field1145 * 128 + 64;
                  class200.field2372 = class31.field217 * 128 + 64;
                  class14.field63 = class277.method5013(class31.field220, class200.field2372, class71.field610, -653274919) - class4.field20;
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2199 == var1.field1332) {
               field862 = var4.readByteN(91963828);
               field896 = var4.readByteN(825166597);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2144 == var1.field1332) {
               class95.field1252.method1949(var4, var1.field1333, 1535812566);
               field873 = field865;
               var1.field1332 = null;
               return true;
            }

            class226 var48;
            if(ServerPacket.field2186 == var1.field1332) {
               var17 = var4.readUnsignedShort((byte)45);
               var6 = var4.readUnsignedShort((byte)80);
               var7 = var4.readMEInt((byte)76);
               var48 = class208.method3898(var7, (byte)-12);
               var48.field2623 = var6 + (var17 << 16);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2145 == var1.field1332) {
               field889 = var4.readUnsignedByte((byte)70);
               if(field889 == 1) {
                  field698 = var4.readShort((byte)45);
               }

               if(field889 >= 2 && field889 <= 6) {
                  if(field889 == 2) {
                     field703 = 64;
                     field704 = 64;
                  }

                  if(field889 == 3) {
                     field703 = 0;
                     field704 = 64;
                  }

                  if(field889 == 4) {
                     field703 = 128;
                     field704 = 64;
                  }

                  if(field889 == 5) {
                     field703 = 64;
                     field704 = 0;
                  }

                  if(field889 == 6) {
                     field703 = 64;
                     field704 = 128;
                  }

                  field889 = 2;
                  field700 = var4.readShort((byte)4);
                  field763 = var4.readShort((byte)96);
                  field702 = var4.readUnsignedByte((byte)35);
               }

               if(field889 == 10) {
                  field800 = var4.readShort((byte)44);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2119 == var1.field1332) {
               var17 = var4.readUnsignedShort((byte)67);
               byte var46 = var4.method5581(12345678);
               System.out.println("small varp: " + var17 + ", " + var46);
               class221.field2524[var17] = var46;
               if(class221.field2526[var17] != var46) {
                  class221.field2526[var17] = var46;
               }

               class22.method253(var17, (byte)-58);
               field866[++field772 - 1 & 31] = var17;
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2125 == var1.field1332) {
               class48.updateEntityType(class194.field2328, (byte)6);
               var1.field1332 = null;
               return true;
            }

            boolean var61;
            if(ServerPacket.field2164 == var1.field1332) {
               var61 = var4.method5682((byte)9);
               if(var61) {
                  if(class31.field222 == null) {
                     class31.field222 = new class247();
                  }
               } else {
                  class31.field222 = null;
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2146 == var1.field1332) {
               var17 = var4.readShort((byte)118);
               field924 = var17;
               this.method1417(false, (byte)0);
               class4.method73(var17, 989659851);
               class29.method349(field924, -1668286639);

               for(var6 = 0; var6 < 100; ++var6) {
                  field679[var6] = true;
               }

               var1.field1332 = null;
               return true;
            }

            class226 var51;
            if(ServerPacket.field2179 == var1.field1332) {
               var17 = var4.readInt(297718403);
               var6 = var4.method5586((byte)127);
               var51 = class208.method3898(var17, (byte)-125);
               if(var51.field2610 != 1 || var6 != var51.field2611) {
                  var51.field2610 = 1;
                  var51.field2611 = var6;
                  class68.method1273(var51, -1605688051);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2121 == var1.field1332) {
               var17 = var4.readUnsignedByte((byte)118);
               class75.method1369(var17, -357843101);
               var1.field1332 = null;
               return false;
            }

            if(ServerPacket.field2197 == var1.field1332) {
               class48.updateEntityType(class194.field2331, (byte)49);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2200 == var1.field1332) {
               class218.method4019(-1871725154);
               var1.field1332 = null;
               return false;
            }

            if(ServerPacket.field2202 == var1.field1332) {
               field917 = var4.readShort((byte)92) * 30;
               field877 = field865;
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2161 == var1.field1332) {
               class48.updateEntityType(class194.field2329, (byte)2);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2195 == var1.field1332) {
               class58.method966((byte)109);
               field848 = var4.method5550(1163650889);
               field877 = field865;
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2183 == var1.field1332) {
               class48.updateEntityType(class194.field2323, (byte)-1);
               var1.field1332 = null;
               return true;
            }

            int var9;
            int var10;
            int var11;
            if(ServerPacket.field2177 == var1.field1332) {
               var17 = var4.readInt(297718403);
               var6 = var4.readShort((byte)47);
               if(var17 < -70000) {
                  var6 += '\u8000';
               }

               if(var17 >= 0) {
                  var51 = class208.method3898(var17, (byte)-19);
               } else {
                  var51 = null;
               }

               if(var51 != null) {
                  for(var43 = 0; var43 < var51.field2671.length; ++var43) {
                     var51.field2671[var43] = 0;
                     var51.field2692[var43] = 0;
                  }
               }

               class76.method1398(var6, -459151232);
               var43 = var4.readShort((byte)68);

               for(var9 = 0; var9 < var43; ++var9) {
                  var10 = var4.method5587(125664341);
                  System.out.println("item id: " + var10);
                  var11 = var4.readByteN(1923226993);
                  if(var11 == 255) {
                     var11 = var4.readMEInt((byte)-7);
                  }

                  if(var51 != null && var9 < var51.field2671.length) {
                     var51.field2671[var9] = var10;
                     var51.field2692[var9] = var11;
                  }

                  class100.method2316(var6, var9, var10 - 1, var11, 479861963);
               }

               if(var51 != null) {
                  class68.method1273(var51, -1281023151);
               }

               class58.method966((byte)84);
               field868[++field869 - 1 & 31] = var6 & 32767;
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2147 == var1.field1332) {
               class95.field1252.method1939((byte)104);
               field873 = field865;
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2185 == var1.field1332) {
               var17 = var4.method5592(123221290);
               var6 = var4.method5716(-1103250346);
               var7 = var4.method5716(-1103250346);
               var48 = class208.method3898(var17, (byte)-1);
               if(var6 != var48.field2576 || var7 != var48.field2594 || var48.field2572 != 0 || var48.field2573 != 0) {
                  var48.field2576 = var6;
                  var48.field2594 = var7;
                  var48.field2572 = 0;
                  var48.field2573 = 0;
                  class68.method1273(var48, -1319872305);
                  this.method1418(var48, -159825150);
                  if(var48.field2569 == 0) {
                     class63.method1161(class226.field2693[var17 >> 16], var48, false, 584998144);
                  }
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2162 == var1.field1332) {
               var61 = var4.readUnsignedByte((byte)39) == 1;
               if(var61) {
                  class140.field1802 = class217.method4014(-1185973609) - var4.method5553((byte)79);
                  class16.field84 = new class15(var4, true);
               } else {
                  class16.field84 = null;
               }

               field726 = field865;
               var1.field1332 = null;
               return true;
            }

            long var13;
            long var20;
            long var22;
            long var24;
            String var38;
            if(ServerPacket.field2193 == var1.field1332) {
               var38 = var4.method5667(-1070798481);
               var20 = var4.method5553((byte)102);
               var22 = (long)var4.readShort((byte)82);
               var24 = (long)var4.method5674((short)3112);
               class238 var44 = (class238)class16.method159(class70.method1278((byte)101), var4.readUnsignedByte((byte)115), -1609956543);
               var13 = var24 + (var22 << 32);
               boolean var45 = false;

               for(int var16 = 0; var16 < 100; ++var16) {
                  if(var13 == field846[var16]) {
                     var45 = true;
                     break;
                  }
               }

               if(var44.field3095 && class95.field1252.method1944(new class292(var38, class27.field164), (byte)-60)) {
                  var45 = true;
               }

               if(!var45 && field794 == 0) {
                  field846[field900] = var13;
                  field900 = (field900 + 1) % 100;
                  String var26 = class305.method5388(class121.method2622(class176.method3563(var4, 677991921), 458877468));
                  if(var44.field3088 != -1) {
                     class103.method2341(9, class1.method21(var44.field3088, 1095307790) + var38, var26, class309.method5764(var20), -570972962);
                  } else {
                     class103.method2341(9, var38, var26, class309.method5764(var20), -1431687847);
                  }
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2176 == var1.field1332) {
               var17 = var4.readUnsignedShort((byte)73);
               var6 = var4.readInt(297718403);
               var7 = var17 >> 10 & 31;
               var43 = var17 >> 5 & 31;
               var9 = var17 & 31;
               var10 = (var43 << 11) + (var7 << 19) + (var9 << 3);
               class226 var52 = class208.method3898(var6, (byte)-101);
               if(var10 != var52.field2592) {
                  var52.field2592 = var10;
                  class68.method1273(var52, 1393807460);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2137 == var1.field1332) {
               var17 = var4.readInt(297718403);
               if(var17 != field762) {
                  field762 = var17;
                  class3.method48((short)14702);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2184 == var1.field1332) {
               field888 = false;

               for(var17 = 0; var17 < 5; ++var17) {
                  field926[var17] = false;
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2143 == var1.field1332) {
               field910 = var4.readUnsignedByte((byte)91);
               if(field910 == 255) {
                  field910 = 0;
               }

               field911 = var4.readUnsignedByte((byte)50);
               if(field911 == 255) {
                  field911 = 0;
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2153 == var1.field1332) {
               var17 = var4.readInt(297718403);
               var6 = var4.readShort((byte)59);
               if(var17 < -70000) {
                  var6 += '\u8000';
               }

               if(var17 >= 0) {
                  var51 = class208.method3898(var17, (byte)-106);
               } else {
                  var51 = null;
               }

               for(; var4.field3710 < var1.field1333; class100.method2316(var6, var43, var9 - 1, var10, -1750369360)) {
                  var43 = var4.method5561(1571351269);
                  var9 = var4.readShort((byte)123);
                  var10 = 0;
                  if(var9 != 0) {
                     var10 = var4.readUnsignedByte((byte)117);
                     if(var10 == 255) {
                        var10 = var4.readInt(297718403);
                     }
                  }

                  if(var51 != null && var43 >= 0 && var43 < var51.field2671.length) {
                     var51.field2671[var43] = var9;
                     var51.field2692[var43] = var10;
                  }
               }

               if(var51 != null) {
                  class68.method1273(var51, -1266497393);
               }

               class58.method966((byte)114);
               field868[++field869 - 1 & 31] = var6 & 32767;
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2133 == var1.field1332) {
               var17 = var4.readInt(297718403);
               var28 = var4.method5667(-788764754);
               var51 = class208.method3898(var17, (byte)-31);
               if(!var28.equals(var51.field2628)) {
                  var51.field2628 = var28;
                  class68.method1273(var51, -2101829947);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2171 == var1.field1332) {
               var17 = var4.method5587(-630878999);
               if(var17 == '\uffff') {
                  var17 = -1;
               }

               class240.method4219(var17, 719259365);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2173 == var1.field1332) {
               var17 = var4.method5674((short)3112);
               var6 = var4.readShort((byte)98);
               if(var6 == '\uffff') {
                  var6 = -1;
               }

               class248.method4415(var6, var17, -738770564);
               var1.field1332 = null;
               return true;
            }

            class226 var29;
            if(ServerPacket.field2168 == var1.field1332) {
               var17 = var4.method5586((byte)115);
               var6 = var4.method5592(-1733643091);
               var7 = var4.method5587(349593222);
               var43 = var4.readShort((byte)122);
               var29 = class208.method3898(var6, (byte)-83);
               if(var43 != var29.field2618 || var17 != var29.field2619 || var7 != var29.field2659) {
                  var29.field2618 = var43;
                  var29.field2619 = var17;
                  var29.field2659 = var7;
                  class68.method1273(var29, -687120849);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2203 == var1.field1332) {
               if(class70.field596 != null) {
                  class70.field596.method5274(var4, -1155305071);
               }

               class24.method263(-1448123046);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2155 == var1.field1332) {
               class58.method966((byte)72);
               var17 = var4.readByteN(2023341235);
               var6 = var4.method5576(823972061);
               var7 = var4.method5592(1328564610);
               field821[var6] = var7;
               field686[var6] = var17;
               field752[var6] = 1;

               for(var43 = 0; var43 < 98; ++var43) {
                  if(var7 >= class230.field2747[var43]) {
                     field752[var6] = var43 + 2;
                  }
               }

               field870[++field792 - 1 & 31] = var6;
               var1.field1332 = null;
               return true;
            }

            class70 var18;
            if(ServerPacket.field2182 == var1.field1332) {
               var17 = var4.readByteN(2008929967);
               var6 = var4.method5586((byte)126);
               var7 = var4.method5611(282352601);
               System.out.println("sub: " + var17 + ", " + var6 + ", " + (var7 >> 16));
               var18 = (class70)field841.method6010((long)var7);
               if(var18 != null) {
                  class41.method653(var18, var6 != var18.field599, -750063376);
               }

               class30.method382(var7, var6, var17, -1715974914);
               var1.field1332 = null;
               return true;
            }

            String var49;
            if(ServerPacket.field2175 == var1.field1332) {
               byte[] var42 = new byte[var1.field1333];
               var4.method5489(var42, 0, var42.length, 330744535);
               class309 var60 = new class309(var42);
               var49 = var60.method5667(-1153425729);
               class101.method2322(var49, true, false, 1365774387);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2150 == var1.field1332) {
               class48.updateEntityType(class194.field2330, (byte)97);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2154 == var1.field1332) {
               if(field924 != -1) {
                  class198.method3714(field924, 0, (byte)1);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2172 == var1.field1332) {
               var4.field3710 += 28;
               if(var4.method5544(-284855787)) {
                  class143.method3348(var4, var4.field3710 - 28, -1883187928);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2152 == var1.field1332) {
               class74.method1328(var4.method5667(-705895301), -1966698976);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2141 == var1.field1332) {
               class48.updateEntityType(class194.field2324, (byte)18);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2198 == var1.field1332) {
               class48.updateEntityType(class194.field2326, (byte)25);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2159 == var1.field1332) {
               class80 var41 = new class80();
               var41.field1051 = var4.method5667(-442215980);
               var41.field1040 = var4.readShort((byte)55);
               var6 = var4.readInt(297718403);
               var41.field1049 = var6;
               class72.method1293(45, -2143630615);
               var3.vmethod5866((byte)-6);
               var3 = null;
               class166.method3511(var41, (short)5308);
               var1.field1332 = null;
               return false;
            }

            if(ServerPacket.field2126 == var1.field1332) {
               var17 = var4.method5716(-1103250346);
               var6 = var4.readMEInt((byte)-18);
               var51 = class208.method3898(var6, (byte)-75);
               if(var17 != var51.field2614 || var17 == -1) {
                  var51.field2614 = var17;
                  var51.field2587 = 0;
                  var51.field2696 = 0;
                  class68.method1273(var51, 1010680630);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2132 == var1.field1332) {
               var17 = var4.readShort((byte)43);
               var6 = var4.readUnsignedByte((byte)72);
               var7 = var4.readShort((byte)10);
               class143.method3350(var17, var6, var7, 1566964636);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2158 == var1.field1332) {
               class340.field3959 = var4.readByteS(-576195763);
               class17.field91 = var4.readByteS(-576195763);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2166 == var1.field1332) {
               field888 = true;
               field925 = var4.readUnsignedByte((byte)78);
               class233.field2759 = var4.readUnsignedByte((byte)40);
               class128.field1549 = var4.readShort((byte)115);
               class293.field3626 = var4.readUnsignedByte((byte)40);
               class98.field1280 = var4.readUnsignedByte((byte)33);
               if(class98.field1280 >= 100) {
                  var17 = field925 * 128 + 64;
                  var6 = class233.field2759 * 128 + 64;
                  var7 = class277.method5013(var17, var6, class71.field610, -1150582527) - class128.field1549;
                  var43 = var17 - class31.field220;
                  var9 = var7 - class14.field63;
                  var10 = var6 - class200.field2372;
                  var11 = (int)Math.sqrt((double)(var43 * var43 + var10 * var10));
                  class74.field638 = (int)(Math.atan2((double)var9, (double)var11) * 325.949D) & 2047;
                  class32.field230 = (int)(Math.atan2((double)var43, (double)var10) * -325.949D) & 2047;
                  if(class74.field638 < 128) {
                     class74.field638 = 128;
                  }

                  if(class74.field638 > 383) {
                     class74.field638 = 383;
                  }
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2139 == var1.field1332) {
               class151.method3393(false, var1.field1337, 1381065773);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2140 == var1.field1332) {
               var17 = var4.method5611(350650888);
               var6 = var4.method5586((byte)108);
               var51 = class208.method3898(var17, (byte)-41);
               if(var51.field2610 != 2 || var6 != var51.field2611) {
                  var51.field2610 = 2;
                  var51.field2611 = var6;
                  class68.method1273(var51, -291921390);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2128 == var1.field1332) {
               for(var17 = 0; var17 < class221.field2526.length; ++var17) {
                  if(class221.field2524[var17] != class221.field2526[var17]) {
                     class221.field2526[var17] = class221.field2524[var17];
                     class22.method253(var17, (byte)-63);
                     field866[++field772 - 1 & 31] = var17;
                  }
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2130 == var1.field1332) {
               class151.method3393(true, var1.field1337, -364037646);
               var1.field1332 = null;
               return true;
            }

            boolean var40;
            if(ServerPacket.field2196 == var1.field1332) {
               var17 = var4.method5611(1460673854);
               var40 = var4.readUnsignedByte((byte)19) == 1;
               var51 = class208.method3898(var17, (byte)-102);
               if(var40 != var51.field2629) {
                  var51.field2629 = var40;
                  class68.method1273(var51, 1191374173);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2142 == var1.field1332) {
               var38 = var4.method5667(-543507989);
               var28 = class305.method5388(class121.method2622(class176.method3563(var4, 677991921), 458877468));
               class141.method3161(6, var38, var28, 172468289);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2194 == var1.field1332) {
               class340.field3959 = var4.readByteS(-576195763);
               class17.field91 = var4.readUnsignedByte((byte)78);

               while(var4.field3710 < var1.field1333) {
                  var17 = var4.readUnsignedByte((byte)107);
                  class194 var59 = class33.method434(-615033295)[var17];
                  class48.updateEntityType(var59, (byte)26);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2131 == var1.field1332) {
               if(var1.field1333 == 0) {
                  class70.field596 = null;
               } else {
                  if(class70.field596 == null) {
                     class70.field596 = new class294(class27.field164, class42.field318);
                  }

                  class70.field596.method5273(var4, 1675969989);
               }

               class24.method263(-778187372);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2148 == var1.field1332) {
               var38 = var4.method5667(-1995023274);
               var20 = (long)var4.readShort((byte)106);
               var22 = (long)var4.method5674((short)3112);
               class238 var30 = (class238)class16.method159(class70.method1278((byte)93), var4.readUnsignedByte((byte)68), -1609956543);
               long var31 = (var20 << 32) + var22;
               boolean var33 = false;

               for(int var14 = 0; var14 < 100; ++var14) {
                  if(field846[var14] == var31) {
                     var33 = true;
                     break;
                  }
               }

               if(class95.field1252.method1944(new class292(var38, class27.field164), (byte)-8)) {
                  var33 = true;
               }

               if(!var33 && field794 == 0) {
                  field846[field900] = var31;
                  field900 = (field900 + 1) % 100;
                  String var34 = class305.method5388(class121.method2622(class176.method3563(var4, 677991921), 458877468));
                  byte var15;
                  if(var30.field3086) {
                     var15 = 7;
                  } else {
                     var15 = 3;
                  }

                  if(var30.field3088 != -1) {
                     class141.method3161(var15, class1.method21(var30.field3088, 627811153) + var38, var34, 1787063793);
                  } else {
                     class141.method3161(var15, var38, var34, -329946407);
                  }
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2189 == var1.field1332) {
               var17 = var4.method5587(-2051250318);
               if(var17 == '\uffff') {
                  var17 = -1;
               }

               var6 = var4.method5592(165363797);
               var7 = var4.readMEInt((byte)11);
               var48 = class208.method3898(var7, (byte)-86);
               class264 var57;
               if(!var48.field2566) {
                  if(var17 == -1) {
                     var48.field2610 = 0;
                     var1.field1332 = null;
                     return true;
                  }

                  var57 = class30.method373(var17, (byte)31);
                  var48.field2610 = 4;
                  var48.field2611 = var17;
                  var48.field2618 = var57.field3411;
                  var48.field2619 = var57.field3429;
                  var48.field2659 = var57.field3410 * 100 / var6;
                  class68.method1273(var48, 1546197461);
               } else {
                  var48.field2704 = var17;
                  var48.field2694 = var6;
                  var57 = class30.method373(var17, (byte)86);
                  var48.field2618 = var57.field3411;
                  var48.field2619 = var57.field3429;
                  var48.field2657 = var57.field3413;
                  var48.field2616 = var57.field3414;
                  var48.field2617 = var57.field3445;
                  var48.field2659 = var57.field3410;
                  if(var57.field3418 == 1) {
                     var48.field2626 = 1;
                  } else {
                     var48.field2626 = 2;
                  }

                  if(var48.field2622 > 0) {
                     var48.field2659 = var48.field2659 * 32 / var48.field2622;
                  } else if(var48.field2579 > 0) {
                     var48.field2659 = var48.field2659 * 32 / var48.field2579;
                  }

                  class68.method1273(var48, -554747271);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2180 == var1.field1332) {
               class18.method212(false, var4, (byte)18);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2165 == var1.field1332) {
               class58.method966((byte)28);
               field847 = var4.readUnsignedByte((byte)68);
               field877 = field865;
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2192 == var1.field1332) {
               var38 = var4.method5667(-2134366945);
               var6 = var4.readByteN(974608622);
               var7 = var4.method5576(-1181300777);
               if(var7 >= 1 && var7 <= 8) {
                  if(var38.equalsIgnoreCase("null")) {
                     var38 = null;
                  }

                  field804[var7 - 1] = var38;
                  field805[var7 - 1] = var6 == 0;
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2163 == var1.field1332) {
               class166.field1996 = class219.method4031(var4.readUnsignedByte((byte)80), 1957450330);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2149 == var1.field1332) {
               class48.updateEntityType(class194.field2332, (byte)68);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2156 == var1.field1332) {
               class48.updateEntityType(class194.field2327, (byte)29);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2127 == var1.field1332) {
               field912 = var4.readUnsignedByte((byte)39);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2191 == var1.field1332) {
               var17 = var4.field3710 + var1.field1333;
               var6 = var4.readShort((byte)38);
               var7 = var4.readShort((byte)31);
               if(var6 != field924) {
                  field924 = var6;
                  this.method1417(false, (byte)0);
                  class4.method73(field924, 1425541497);
                  class29.method349(field924, -1408689953);

                  for(var43 = 0; var43 < 100; ++var43) {
                     field679[var43] = true;
                  }
               }

               class70 var27;
               for(; var7-- > 0; var27.field594 = true) {
                  var43 = var4.readInt(297718403);
                  var9 = var4.readShort((byte)101);
                  var10 = var4.readUnsignedByte((byte)95);
                  var27 = (class70)field841.method6010((long)var43);
                  if(var27 != null && var9 != var27.field599) {
                     class41.method653(var27, true, -961577543);
                     var27 = null;
                  }

                  if(var27 == null) {
                     var27 = class30.method382(var43, var9, var10, -1715974914);
                  }
               }

               for(var18 = (class70)field841.method5995(); var18 != null; var18 = (class70)field841.method6003()) {
                  if(var18.field594) {
                     var18.field594 = false;
                  } else {
                     class41.method653(var18, true, 72550340);
                  }
               }

               field750 = new class327(512);

               while(var4.field3710 < var17) {
                  var43 = var4.readInt(297718403);
                  var9 = var4.readShort((byte)52);
                  var10 = var4.readShort((byte)117);
                  var11 = var4.readInt(297718403);

                  for(int var35 = var9; var35 <= var10; ++var35) {
                     var13 = (long)var35 + ((long)var43 << 32);
                     field750.method5997(new class188(var11), var13);
                  }
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2188 == var1.field1332) {
               var17 = var4.readInt(297718403);
               class70 var58 = (class70)field841.method6010((long)var17);
               if(var58 != null) {
                  class41.method653(var58, true, -1111064476);
               }

               if(field882 != null) {
                  class68.method1273(field882, 1563600186);
                  field882 = null;
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2134 == var1.field1332) {
               class17.field91 = var4.readUnsignedByte((byte)56);
               class340.field3959 = var4.readByteS(-576195763);

               for(var17 = class17.field91; var17 < class17.field91 + 8; ++var17) {
                  for(var6 = class340.field3959; var6 < class340.field3959 + 8; ++var6) {
                     if(field808[class71.field610][var17][var6] != null) {
                        field808[class71.field610][var17][var6] = null;
                        class80.method1884(var17, var6, -1902692001);
                     }
                  }
               }

               for(class77 var39 = (class77)field697.method4931(); var39 != null; var39 = (class77)field697.method4949()) {
                  if(var39.field960 >= class17.field91 && var39.field960 < class17.field91 + 8 && var39.field961 >= class340.field3959 && var39.field961 < class340.field3959 + 8 && var39.field962 == class71.field610) {
                     var39.field969 = 0;
                  }
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2169 == var1.field1332) {
               for(var17 = 0; var17 < class250.field3204; ++var17) {
                  class250 var55 = class228.method4179(var17, (byte)2);
                  if(var55 != null) {
                     class221.field2524[var17] = 0;
                     class221.field2526[var17] = 0;
                  }
               }

               class58.method966((byte)106);
               field772 += 32;
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2136 == var1.field1332) {
               var17 = var4.readUnsignedByte((byte)77);
               class22.method256(var17, (byte)2);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2178 == var1.field1332) {
               var17 = var4.readUnsignedShort((byte)22);
               var6 = var4.method5592(-1442883624);
               var51 = class208.method3898(var6, (byte)-67);
               if(var51 != null && var51.field2569 == 0) {
                  if(var17 > var51.field2597 - var51.field2642) {
                     var17 = var51.field2597 - var51.field2642;
                  }

                  if(var17 < 0) {
                     var17 = 0;
                  }

                  if(var17 != var51.field2589) {
                     var51.field2589 = var17;
                     class68.method1273(var51, -1242133654);
                  }
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2190 == var1.field1332) {
               class17.method169(var4, var1.field1333, (short)-19565);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2118 == var1.field1332) {
               var17 = var4.readUnsignedShort((byte)50);
               class65.method1242(var17, -1106697441);
               field868[++field869 - 1 & 31] = var17 & 32767;
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2120 == var1.field1332) {
               class18.method212(true, var4, (byte)18);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2122 == var1.field1332) {
               var17 = var4.readInt(297718403);
               var6 = var4.readInt(297718403);
               var7 = class183.method3650((byte)42);
               class196 var47 = class146.method3363(ClientPacket.field2218, field761.field1340, -1772580204);
               var47.field2338.method5591(var17, 277386885);
               var47.field2338.method5590(var6, 899177075);
               var47.field2338.method5700(class62.field479, -927080333);
               var47.field2338.method5700(var7, -927080333);
               field761.method2361(var47, 321412140);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2138 == var1.field1332) {
               class95.field1252.field1093.method5112(var4, var1.field1333, 1156120193);
               class301.method5359(78601767);
               field873 = field865;
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2174 == var1.field1332) {
               class4.method72(var4, var1.field1333, -1157404679);
               class94.method2163(-2118716971);
               var1.field1332 = null;
               return true;
            }

            class226 var54;
            if(ServerPacket.field2181 == var1.field1332) {
               var17 = var4.method5592(-2115853528);
               var54 = class208.method3898(var17, (byte)-14);

               for(var7 = 0; var7 < var54.field2671.length; ++var7) {
                  var54.field2671[var7] = -1;
                  var54.field2671[var7] = 0;
               }

               class68.method1273(var54, -1038873590);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2201 == var1.field1332) {
               var17 = var4.readUnsignedShort((byte)51);
               if(var17 == '\uffff') {
                  var17 = -1;
               }

               var6 = var4.method5611(1446601986);
               var7 = var4.readInt(297718403);
               var43 = var4.method5587(-1082350877);
               if(var43 == '\uffff') {
                  var43 = -1;
               }

               for(var9 = var17; var9 <= var43; ++var9) {
                  var24 = (long)var9 + ((long)var6 << 32);
                  class189 var12 = field750.method6010(var24);
                  if(var12 != null) {
                     var12.method3657();
                  }

                  field750.method5997(new class188(var7), var24);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2123 == var1.field1332) {
               var17 = var4.readMEInt((byte)87);
               var54 = class208.method3898(var17, (byte)-17);
               var54.field2610 = 3;
               var54.field2611 = class311.field3717.field646.method4071(1778112126);
               class68.method1273(var54, 1139933960);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2167 == var1.field1332) {
               var38 = var4.method5667(-995334755);
               Object[] var53 = new Object[var38.length() + 1];

               for(var7 = var38.length() - 1; var7 >= 0; --var7) {
                  if(var38.charAt(var7) == 115) {
                     var53[var7 + 1] = var4.method5667(-1905901320);
                  } else {
                     var53[var7 + 1] = new Integer(var4.readInt(297718403));
                  }
               }

               var53[0] = new Integer(var4.readInt(297718403));
               class71 var50 = new class71();
               var50.field602 = var53;
               class76.method1395(var50, -2026359226);
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2157 == var1.field1332) {
               var17 = var4.method5561(909964688);
               var40 = var4.readUnsignedByte((byte)51) == 1;
               var49 = "";
               boolean var8 = false;
               if(var40) {
                  var49 = var4.method5667(-1797687807);
                  if(class95.field1252.method1944(new class292(var49, class27.field164), (byte)-127)) {
                     var8 = true;
                  }
               }

               String var56 = var4.method5667(-1220737089);
               if(!var8) {
                  class141.method3161(var17, var49, var56, -708342867);
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2151 == var1.field1332) {
               for(var17 = 0; var17 < players.length; ++var17) {
                  if(players[var17] != null) {
                     players[var17].field1016 = -1;
                  }
               }

               for(var17 = 0; var17 < field721.length; ++var17) {
                  if(field721[var17] != null) {
                     field721[var17].field1016 = -1;
                  }
               }

               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2170 == var1.field1332) {
               var17 = var4.readUnsignedByte((byte)36);
               if(var4.readUnsignedByte((byte)113) == 0) {
                  field948[var17] = new class18();
                  var4.field3710 += 18;
               } else {
                  --var4.field3710;
                  field948[var17] = new class18(var4, false);
               }

               field774 = field865;
               var1.field1332 = null;
               return true;
            }

            if(ServerPacket.field2124 == var1.field1332) {
               var17 = var4.method5611(1078535567);
               var6 = var4.readInt(297718403);
               class70 var19 = (class70)field841.method6010((long)var6);
               var18 = (class70)field841.method6010((long)var17);
               if(var18 != null) {
                  class41.method653(var18, var19 == null || var19.field599 != var18.field599, -1690173279);
               }

               if(var19 != null) {
                  var19.method3657();
                  field841.method5997(var19, (long)var17);
               }

               var29 = class208.method3898(var6, (byte)-122);
               if(var29 != null) {
                  class68.method1273(var29, -773106910);
               }

               var29 = class208.method3898(var17, (byte)-79);
               if(var29 != null) {
                  class68.method1273(var29, -2108200292);
                  class63.method1161(class226.field2693[var29.field2567 >>> 16], var29, true, 28493551);
               }

               if(field924 != -1) {
                  class198.method3714(field924, 1, (byte)1);
               }

               var1.field1332 = null;
               return true;
            }

            class229.method4189("" + (var1.field1332 != null?var1.field1332.field2135:-1) + "," + (var1.field1329 != null?var1.field1329.field2135:-1) + "," + (var1.field1339 != null?var1.field1339.field2135:-1) + "," + var1.field1333, (Throwable)null, -1131770525);
            class218.method4019(-1871725154);
         } catch (IOException var36) {
            class138.method3079((short)9425);
         } catch (Exception var37) {
            var28 = "" + (var1.field1332 != null?var1.field1332.field2135:-1) + "," + (var1.field1329 != null?var1.field1329.field2135:-1) + "," + (var1.field1339 != null?var1.field1339.field2135:-1) + "," + var1.field1333 + "," + (class311.field3717.field1028[0] + class69.field590 * 731242929) + "," + (class311.field3717.field1029[0] + class89.field1152 * 1825982697) + ",";

            for(var7 = 0; var7 < var1.field1333 && var7 < 50; ++var7) {
               var28 = var28 + var4.field3709[var7] + ",";
            }

            class229.method4189(var28, var37, -1131770525);
            class218.method4019(-1871725154);
         }

         return true;
      }
   }

   void method1406(int var1) {
      if(class246.field3182 >= 4) {
         this.method1120("js5crc", -627407520);
         field687 = 1000;
      } else {
         if(class246.field3183 >= 4) {
            if(field687 <= 5) {
               this.method1120("js5io", -1029759364);
               field687 = 1000;
               return;
            }

            field709 = 3000;
            class246.field3183 = 3;
         }

         if(--field709 + 1 <= 0) {
            try {
               if(field860 == 0) {
                  class45.field368 = class227.field2710.method3550(class101.field1305, class280.field3574, (byte)-11);
                  ++field860;
               }

               if(field860 == 1) {
                  if(class45.field368.field2033 == 2) {
                     this.method1649(-1, -2003740384);
                     return;
                  }

                  if(class45.field368.field2033 == 1) {
                     ++field860;
                  }
               }

               if(field860 == 2) {
                  if(field729) {
                     class208.field2468 = class309.method5767((Socket)class45.field368.field2030, '\u9c40', 5000, (byte)64);
                  } else {
                     class208.field2468 = new class180((Socket)class45.field368.field2030, class227.field2710, 5000);
                  }

                  class309 var2 = new class309(5);
                  var2.readByte(15, 1258821856);
                  var2.method5689(189, 747474969);
                  class208.field2468.vmethod5878(var2.field3709, 0, 5, 1658403464);
                  ++field860;
                  class58.field455 = class217.method4014(-1665945288);
               }

               if(field860 == 3) {
                  if(class208.field2468.vmethod5862(2038720245) <= 0 && (field729 || field687 > 5)) {
                     if(class217.method4014(463742146) - class58.field455 > 30000L) {
                        this.method1649(-2, -1547119546);
                        return;
                     }
                  } else {
                     int var3 = class208.field2468.vmethod5863(1436175029);
                     if(var3 != 0) {
                        this.method1649(var3, -1746373382);
                        return;
                     }

                     ++field860;
                  }
               }

               if(field860 == 4) {
                  class19.method222(class208.field2468, field687 > 20, (byte)1);
                  class45.field368 = null;
                  class208.field2468 = null;
                  field860 = 0;
                  field743 = 0;
               }
            } catch (IOException var4) {
               this.method1649(-3, -1975181609);
            }

         }
      }
   }

   protected final void vmethod1402(byte var1) {
      ++field689;
      this.method1443((byte)0);

      while(true) {
         class271 var3 = class244.field3149;
         class241 var2;
         synchronized(class244.field3149) {
            var2 = (class241)class244.field3148.method4929();
         }

         if(var2 == null) {
            int var6;
            try {
               if(class206.field2406 == 1) {
                  var6 = class206.field2405.method3772(688694968);
                  if(var6 > 0 && class206.field2405.method3882(-799045616)) {
                     var6 -= class93.field1187;
                     if(var6 < 0) {
                        var6 = 0;
                     }

                     class206.field2405.method3793(var6, -1144046220);
                  } else {
                     class206.field2405.method3861(1819276165);
                     class206.field2405.method3782(1029490375);
                     if(class206.field2407 != null) {
                        class206.field2406 = 2;
                     } else {
                        class206.field2406 = 0;
                     }

                     class206.field2410 = null;
                     class153.field1966 = null;
                  }
               }
            } catch (Exception var10) {
               var10.printStackTrace();
               class206.field2405.method3861(1819276165);
               class206.field2406 = 0;
               class206.field2410 = null;
               class153.field1966 = null;
               class206.field2407 = null;
            }

            class103.method2342((byte)48);
            class54 var11 = class54.field413;
            synchronized(class54.field413) {
               ++class54.field437;
               class54.field434 = class54.field436;
               class54.field417 = 0;
               int var7;
               if(class54.field429 < 0) {
                  for(var7 = 0; var7 < 112; ++var7) {
                     class54.field426[var7] = false;
                  }

                  class54.field429 = class54.field439;
               } else {
                  while(class54.field439 != class54.field429) {
                     var7 = class54.field427[class54.field439];
                     class54.field439 = class54.field439 + 1 & 127;
                     if(var7 < 0) {
                        class54.field426[~var7] = false;
                     } else {
                        if(!class54.field426[var7] && class54.field417 < class54.field432.length - 1) {
                           class54.field432[++class54.field417 - 1] = var7;
                        }

                        class54.field426[var7] = true;
                     }
                  }
               }

               if(class54.field417 > 0) {
                  class54.field437 = 0;
               }

               class54.field436 = class54.field433;
            }

            class52.method900(-784307699);
            if(class97.field1262 != null) {
               var6 = class97.field1262.vmethod3573('\uff00');
               field878 = var6;
            }

            if(field687 == 0) {
               class237.method4202(-1434556827);
               class62.field472.vmethod3577(-1351231250);

               for(var6 = 0; var6 < 32; ++var6) {
                  class62.field481[var6] = 0L;
               }

               for(var6 = 0; var6 < 32; ++var6) {
                  class62.field482[var6] = 0L;
               }

               class143.field1877 = 0;
            } else if(field687 == 5) {
               class21.method241(this, 1934352071);
               class237.method4202(-703548361);
               class62.field472.vmethod3577(-475733804);

               for(var6 = 0; var6 < 32; ++var6) {
                  class62.field481[var6] = 0L;
               }

               for(var6 = 0; var6 < 32; ++var6) {
                  class62.field482[var6] = 0L;
               }

               class143.field1877 = 0;
            } else if(field687 != 10 && field687 != 11) {
               if(field687 == 20) {
                  class21.method241(this, 2006346266);
                  this.method1408(931463513);
               } else if(field687 == 25) {
                  class16.method161((byte)-97);
               }
            } else {
               class21.method241(this, 1256161085);
            }

            if(field687 == 30) {
               this.method1409(1428106045);
            } else if(field687 == 40 || field687 == 45) {
               this.method1408(931463513);
            }

            return;
         }

         var2.field3115.method4349(var2.field3114, (int)var2.field2116, var2.field3113, false, 246844871);
      }
   }

   final void method1703(int var1, int var2, int var3) {
      class208.method3901(var1, var2, 1143611655);
      class14.field60.method3199(class71.field610, var1, var2, false);
      field816 = true;
   }

   final void method1802(byte var1) {
      int var2;
      if(field924 != -1) {
         var2 = field924;
         if(class81.method1900(var2, 304486433)) {
            class173.method3539(class226.field2693[var2], -1, 1317800526);
         }
      }

      for(var2 = 0; var2 < field883; ++var2) {
         if(field679[var2]) {
            field886[var2] = true;
         }

         field813[var2] = field679[var2];
         field679[var2] = false;
      }

      field884 = field689;
      field829 = -1;
      field830 = -1;
      class183.field2106 = null;
      if(field924 != -1) {
         field883 = 0;
         class210.method3957(field924, 0, 0, class37.field277, class221.field2525, 0, 0, -1, 2079542989);
      }

      class330.method6044();
      if(field785) {
         if(field784 == 1) {
            class299.field3650[field783 / 100].method6187(field922 - 8, field688 - 8);
         }

         if(field784 == 2) {
            class299.field3650[field783 / 100 + 4].method6187(field922 - 8, field688 - 8);
         }
      }

      int var3;
      int var4;
      if(!field816) {
         if(field829 != -1) {
            var2 = field829;
            var3 = field830;
            if((field693 >= 2 || field833 != 0 || field835) && field828) {
               var4 = class30.method381((byte)112);
               String var5;
               if(field833 == 1 && field693 < 2) {
                  var5 = "Use" + " " + field933 + " " + "->";
               } else if(field835 && field693 < 2) {
                  var5 = field838 + " " + field839 + " " + "->";
               } else {
                  String var6;
                  if(var4 < 0) {
                     var6 = "";
                  } else if(field823[var4].length() > 0) {
                     var6 = field822[var4] + " " + field823[var4];
                  } else {
                     var6 = field822[var4];
                  }

                  var5 = var6;
               }

               if(field693 > 2) {
                  var5 = var5 + class297.method5314(16777215, -949778524) + " " + '/' + " " + (field693 - 2) + " more options";
               }

               class175.field2045.method5407(var5, var2 + 4, var3 + 15, 16777215, 0, field689 / 1000);
            }
         }
      } else {
         var2 = class34.field248;
         var3 = class196.field2343;
         var4 = class49.field383;
         int var14 = class48.field376;
         int var15 = 6116423;
         class330.method6052(var2, var3, var4, var14, var15);
         class330.method6052(var2 + 1, var3 + 1, var4 - 2, 16, 0);
         class330.method6137(var2 + 1, var3 + 18, var4 - 2, var14 - 19, 0);
         class175.field2045.method5389("Choose Option", var2 + 3, var3 + 14, var15, -1);
         int var7 = class63.field517;
         int var8 = class63.field518;

         for(int var9 = 0; var9 < field693; ++var9) {
            int var10 = var3 + (field693 - 1 - var9) * 15 + 31;
            int var11 = 16777215;
            if(var7 > var2 && var7 < var4 + var2 && var8 > var10 - 13 && var8 < var10 + 3) {
               var11 = 16776960;
            }

            class304 var12 = class175.field2045;
            String var13;
            if(var9 < 0) {
               var13 = "";
            } else if(field823[var9].length() > 0) {
               var13 = field822[var9] + " " + field823[var9];
            } else {
               var13 = field822[var9];
            }

            var12.method5389(var13, var2 + 3, var10, var11, 0);
         }

         class49.method848(class34.field248, class196.field2343, class49.field383, class48.field376, -2108955904);
      }

      if(field892 == 3) {
         for(var2 = 0; var2 < field883; ++var2) {
            if(field813[var2]) {
               class330.method6051(field950[var2], field939[var2], field733[var2], field736[var2], 16711935, 128);
            } else if(field886[var2]) {
               class330.method6051(field950[var2], field939[var2], field733[var2], field736[var2], 16711680, 128);
            }
         }
      }

      class73.method1300(class71.field610, class311.field3717.field983, class311.field3717.field973, field741, 2024763142);
      field741 = 0;
   }

   protected final void vmethod1410(byte var1) {
      field893 = class217.method4014(-113329767) + 500L;
      this.method1445(-61779781);
      if(field924 != -1) {
         this.method1417(true, (byte)0);
      }

   }

   protected final void vmethod1403(boolean var1, byte var2) {
      boolean var3;
      label173: {
         try {
            if(class206.field2406 == 2) {
               if(class206.field2410 == null) {
                  class206.field2410 = class212.method3993(class206.field2407, class206.field2408, class206.field2413);
                  if(class206.field2410 == null) {
                     var3 = false;
                     break label173;
                  }
               }

               if(class153.field1966 == null) {
                  class153.field1966 = new class117(class206.field2403, class206.field2404);
               }

               if(class206.field2405.method3773(class206.field2410, class58.field453, class153.field1966, 22050, 33477442)) {
                  class206.field2405.method3853(564851445);
                  class206.field2405.method3793(class219.field2514, 540143794);
                  class206.field2405.method3807(class206.field2410, class19.field106, 1158871386);
                  class206.field2406 = 0;
                  class206.field2410 = null;
                  class153.field1966 = null;
                  class206.field2407 = null;
                  var3 = true;
                  break label173;
               }
            }
         } catch (Exception var7) {
            var7.printStackTrace();
            class206.field2405.method3861(1819276165);
            class206.field2406 = 0;
            class206.field2410 = null;
            class153.field1966 = null;
            class206.field2407 = null;
         }

         var3 = false;
      }

      if(var3 && field915 && class45.field367 != null) {
         class45.field367.method2561((short)255);
      }

      if((field687 == 10 || field687 == 20 || field687 == 30) && 0L != field893 && class217.method4014(409932830) > field893) {
         class32.method406(class74.method1327(1970832153), 265635085);
      }

      int var5;
      if(var1) {
         for(var5 = 0; var5 < 100; ++var5) {
            field679[var5] = true;
         }
      }

      if(field687 == 0) {
         this.method1066(class94.field1198, class94.field1197, var1, -1925389891);
      } else if(field687 == 5) {
         class72.method1289(class175.field2045, class101.field1303, class24.field140, 858011384);
      } else if(field687 != 10 && field687 != 11) {
         if(field687 == 20) {
            class72.method1289(class175.field2045, class101.field1303, class24.field140, -1872364669);
         } else if(field687 == 25) {
            if(field899 == 1) {
               if(field818 > field921) {
                  field921 = field818;
               }

               var5 = (field921 * 50 - field818 * 50) / field921;
               class214.method4004("Loading - please wait." + "<br>" + " (" + var5 + "%" + ")", false, -411552883);
            } else if(field899 == 2) {
               if(field734 > field735) {
                  field735 = field734;
               }

               var5 = (field735 * 50 - field734 * 50) / field735 + 50;
               class214.method4004("Loading - please wait." + "<br>" + " (" + var5 + "%" + ")", false, -1543944179);
            } else {
               class214.method4004("Loading - please wait.", false, -794891254);
            }
         } else if(field687 == 30) {
            this.method1802((byte)38);
         } else if(field687 == 40) {
            class214.method4004("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false, -80189599);
         } else if(field687 == 45) {
            class214.method4004("Please wait...", false, -1660618639);
         }
      } else {
         class72.method1289(class175.field2045, class101.field1303, class24.field140, 684092055);
      }

      if(field687 == 30 && field892 == 0 && !var1 && !field894) {
         for(var5 = 0; var5 < field883; ++var5) {
            if(field886[var5]) {
               class206.field2411.vmethod6145(field950[var5], field939[var5], field733[var5], field736[var5], (short)32475);
               field886[var5] = false;
            }
         }
      } else if(field687 > 0) {
         class206.field2411.vmethod6139(0, 0, 1539531051);

         for(var5 = 0; var5 < field883; ++var5) {
            field886[var5] = false;
         }
      }

   }

   final void method1409(int var1) {
      if(field917 > 1) {
         --field917;
      }

      if(field802 > 0) {
         --field802;
      }

      if(field728) {
         field728 = false;
         class138.method3079((short)-399);
      } else {
         if(!field816) {
            class135.method2946((byte)109);
         }

         int var2;
         for(var2 = 0; var2 < 100 && this.method1522(field761, -124055306); ++var2) {
            ;
         }

         if(field687 == 30) {
            while(true) {
               class106 var3 = (class106)class105.field1341.method4860();
               boolean var32;
               if(var3 == null) {
                  var32 = false;
               } else {
                  var32 = true;
               }

               int var4;
               class196 var33;
               if(!var32) {
                  class196 var16;
                  int var17;
                  if(field796.field3581) {
                     var16 = class146.method3363(ClientPacket.field2270, field761.field1340, -1917964377);
                     var16.field2338.readByte(0, 1258821856);
                     var17 = var16.field2338.field3710;
                     field796.method5024(var16.field2338, 1742077322);
                     var16.field2338.method5656(var16.field2338.field3710 - var17, -1675640684);
                     field761.method2361(var16, 383664358);
                     field796.method5022(-93976035);
                  }

                  Object var38 = class207.field2434.field614;
                  int var5;
                  int var6;
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  int var13;
                  synchronized(class207.field2434.field614) {
                     if(field749) {
                        if(class63.field524 != 0 || class207.field2434.field620 >= 40) {
                           var33 = null;
                           var4 = 0;
                           var5 = 0;
                           var6 = 0;
                           var7 = 0;

                           for(var8 = 0; var8 < class207.field2434.field620 && (var33 == null || var33.field2338.field3710 - var4 < 246); ++var8) {
                              var5 = var8;
                              var9 = class207.field2434.field617[var8];
                              if(var9 < -1) {
                                 var9 = -1;
                              } else if(var9 > '\ufffe') {
                                 var9 = '\ufffe';
                              }

                              var10 = class207.field2434.field621[var8];
                              if(var10 < -1) {
                                 var10 = -1;
                              } else if(var10 > '\ufffe') {
                                 var10 = '\ufffe';
                              }

                              if(var10 != field691 || var9 != field692) {
                                 if(var33 == null) {
                                    var33 = class146.method3363(ClientPacket.field2281, field761.field1340, -1847420462);
                                    var33.field2338.readByte(0, 1258821856);
                                    var4 = var33.field2338.field3710;
                                    var33.field2338.field3710 += 2;
                                    var6 = 0;
                                    var7 = 0;
                                 }

                                 if(field875 != -1L) {
                                    var11 = var10 - field691;
                                    var12 = var9 - field692;
                                    var13 = (int)((class207.field2434.field618[var8] - field875) / 20L);
                                    var6 = (int)((long)var6 + (class207.field2434.field618[var8] - field875) % 20L);
                                 } else {
                                    var11 = var10;
                                    var12 = var9;
                                    var13 = Integer.MAX_VALUE;
                                 }

                                 field691 = var10;
                                 field692 = var9;
                                 if(var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    var33.field2338.readShort((var13 << 12) + var12 + (var11 << 6), (byte)-68);
                                 } else if(var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                                    var11 += 128;
                                    var12 += 128;
                                    var33.field2338.readByte(var13 + 128, 1258821856);
                                    var33.field2338.readShort(var12 + (var11 << 8), (byte)-6);
                                 } else if(var13 < 32) {
                                    var33.field2338.readByte(var13 + 192, 1258821856);
                                    if(var10 != -1 && var9 != -1) {
                                       var33.field2338.method5689(var10 | var9 << 16, 747474969);
                                    } else {
                                       var33.field2338.method5689(Integer.MIN_VALUE, 747474969);
                                    }
                                 } else {
                                    var33.field2338.readShort((var13 & 8191) + '\ue000', (byte)-9);
                                    if(var10 != -1 && var9 != -1) {
                                       var33.field2338.method5689(var10 | var9 << 16, 747474969);
                                    } else {
                                       var33.field2338.method5689(Integer.MIN_VALUE, 747474969);
                                    }
                                 }

                                 ++var7;
                                 field875 = class207.field2434.field618[var8];
                              }
                           }

                           if(var33 != null) {
                              var33.field2338.method5656(var33.field2338.field3710 - var4, -1845370208);
                              var8 = var33.field2338.field3710;
                              var33.field2338.field3710 = var4;
                              var33.field2338.readByte(var6 / var7, 1258821856);
                              var33.field2338.readByte(var6 % var7, 1258821856);
                              var33.field2338.field3710 = var8;
                              field761.method2361(var33, 1210105323);
                           }

                           if(var5 >= class207.field2434.field620) {
                              class207.field2434.field620 = 0;
                           } else {
                              class207.field2434.field620 -= var5;
                              System.arraycopy(class207.field2434.field621, var5, class207.field2434.field621, 0, class207.field2434.field620);
                              System.arraycopy(class207.field2434.field617, var5, class207.field2434.field617, 0, class207.field2434.field620);
                              System.arraycopy(class207.field2434.field618, var5, class207.field2434.field618, 0, class207.field2434.field620);
                           }
                        }
                     } else {
                        class207.field2434.field620 = 0;
                     }
                  }

                  class196 var20;
                  if(class63.field524 == 1 || !class217.field2506 && class63.field524 == 4 || class63.field524 == 2) {
                     long var18 = class63.field527 - field766 * -1L;
                     if(var18 > 32767L) {
                        var18 = 32767L;
                     }

                     field766 = class63.field527 * -1L;
                     var4 = class63.field520;
                     if(var4 < 0) {
                        var4 = 0;
                     } else if(var4 > class221.field2525) {
                        var4 = class221.field2525;
                     }

                     var5 = class63.field525;
                     if(var5 < 0) {
                        var5 = 0;
                     } else if(var5 > class37.field277) {
                        var5 = class37.field277;
                     }

                     var6 = (int)var18;
                     var20 = class146.method3363(ClientPacket.field2209, field761.field1340, -1873437781);
                     var20.field2338.readShort((var6 << 1) + (class63.field524 == 2?1:0), (byte)-9);
                     var20.field2338.readShort(var5, (byte)-19);
                     var20.field2338.readShort(var4, (byte)-85);
                     field761.method2361(var20, 1291590937);
                  }

                  if(class54.field417 > 0) {
                     var16 = class146.method3363(ClientPacket.field2210, field761.field1340, -1988312921);
                     var16.field2338.readShort(0, (byte)-99);
                     var17 = var16.field2338.field3710;
                     long var21 = class217.method4014(922789002);

                     for(var6 = 0; var6 < class54.field417; ++var6) {
                        long var23 = var21 - field904;
                        if(var23 > 16777215L) {
                           var23 = 16777215L;
                        }

                        field904 = var21;
                        var16.field2338.method5589((int)var23, 717013158);
                        var16.field2338.readByte(class54.field432[var6], 1258821856);
                     }

                     var16.field2338.method5726(var16.field2338.field3710 - var17, 733201281);
                     field761.method2361(var16, 1458968607);
                  }

                  if(field764 > 0) {
                     --field764;
                  }

                  if(class54.field426[96] || class54.field426[97] || class54.field426[98] || class54.field426[99]) {
                     field765 = true;
                  }

                  if(field765 && field764 <= 0) {
                     field764 = 20;
                     field765 = false;
                     var16 = class146.method3363(ClientPacket.field2220, field761.field1340, -1878824909);
                     var16.field2338.writeLEShortA(field909, 1323815181);
                     var16.field2338.writeLEShortA(field824, 1196014488);
                     field761.method2361(var16, 1572429090);
                  }

                  if(class62.field502 && !field694) {
                     field694 = true;
                     var16 = class146.method3363(ClientPacket.field2261, field761.field1340, -1789156968);
                     var16.field2338.readByte(1, 1258821856);
                     field761.method2361(var16, 365993172);
                  }

                  if(!class62.field502 && field694) {
                     field694 = false;
                     var16 = class146.method3363(ClientPacket.field2261, field761.field1340, -1784594099);
                     var16.field2338.readByte(0, 1258821856);
                     field761.method2361(var16, 272061695);
                  }

                  if(class21.field121 != null) {
                     class21.field121.method6472(902859893);
                  }

                  if(class281.field3582) {
                     if(class70.field596 != null) {
                        class70.field596.method5126((short)5757);
                     }

                     class38.method537((byte)-59);
                     class281.field3582 = false;
                  }

                  class249.method4419(566997565);
                  if(field687 != 30) {
                     return;
                  }

                  for(class77 var39 = (class77)field697.method4931(); var39 != null; var39 = (class77)field697.method4949()) {
                     if(var39.field969 > 0) {
                        --var39.field969;
                     }

                     if(var39.field969 == 0) {
                        if(var39.field958 < 0 || class178.method3574(var39.field958, var39.field963, (byte)-28)) {
                           class117.method2606(var39.field962, var39.field959, var39.field960, var39.field961, var39.field958, var39.field968, var39.field963, 277907731);
                           var39.method3657();
                        }
                     } else {
                        if(var39.field965 > 0) {
                           --var39.field965;
                        }

                        if(var39.field965 == 0 && var39.field960 >= 1 && var39.field961 >= 1 && var39.field960 <= 102 && var39.field961 <= 102 && (var39.field964 < 0 || class178.method3574(var39.field964, var39.field967, (byte)-74))) {
                           class117.method2606(var39.field962, var39.field959, var39.field960, var39.field961, var39.field964, var39.field966, var39.field967, -325345156);
                           var39.field965 = -1;
                           if(var39.field964 == var39.field958 && var39.field958 == -1) {
                              var39.method3657();
                           } else if(var39.field958 == var39.field964 && var39.field968 == var39.field966 && var39.field967 == var39.field963) {
                              var39.method3657();
                           }
                        }
                     }
                  }

                  class22.method252((short)16256);
                  ++field761.field1338;
                  if(field761.field1338 > 750) {
                     class138.method3079((short)20831);
                     return;
                  }

                  var2 = class98.field1278;
                  int[] var34 = class98.field1271;

                  for(var4 = 0; var4 < var2; ++var4) {
                     class75 var25 = players[var34[var4]];
                     if(var25 != null) {
                        class41.method649(var25, 1, 1452661344);
                     }
                  }

                  for(var2 = 0; var2 < field722; ++var2) {
                     var17 = field723[var2];
                     class88 var26 = field721[var17];
                     if(var26 != null) {
                        class41.method649(var26, var26.field1148.field3470, 1393413824);
                     }
                  }

                  class38.method630(294809885);
                  ++field741;
                  if(field784 != 0) {
                     field783 += 20;
                     if(field783 >= 400) {
                        field784 = 0;
                     }
                  }

                  if(class40.field307 != null) {
                     ++field786;
                     if(field786 >= 15) {
                        class68.method1273(class40.field307, 514293783);
                        class40.field307 = null;
                     }
                  }

                  class226 var40 = class9.field52;
                  class226 var35 = class199.field2368;
                  class9.field52 = null;
                  class199.field2368 = null;
                  field857 = null;
                  field861 = false;
                  field732 = false;
                  field901 = 0;

                  while(class22.method255(1715516488) && field901 < 128) {
                     if(field849 >= 2 && class54.field426[82] && class3.field16 == 66) {
                        String var44 = "";

                        class73 var41;
                        for(Iterator var27 = class100.field1291.iterator(); var27.hasNext(); var44 = var44 + var41.field636 + ':' + var41.field635 + '\n') {
                           var41 = (class73)var27.next();
                        }

                        class42.field318.method1021(var44, -639881287);
                     } else if(field754 != 1 || class222.field2531 <= 0) {
                        field872[field901] = class3.field16;
                        field902[field901] = class222.field2531;
                        ++field901;
                     }
                  }

                  boolean var36 = field849 >= 2;
                  if(var36 && class54.field426[82] && class54.field426[81] && field878 != 0) {
                     var5 = class311.field3717.field666 - field878;
                     if(var5 < 0) {
                        var5 = 0;
                     } else if(var5 > 3) {
                        var5 = 3;
                     }

                     if(var5 != class311.field3717.field666) {
                        class14.method148(class311.field3717.field1028[0] + class69.field590 * 731242929, class311.field3717.field1029[0] + class89.field1152 * 1825982697, var5, false, 1791023210);
                     }

                     field878 = 0;
                  }

                  if(field924 != -1) {
                     class2.method35(field924, 0, 0, class37.field277, class221.field2525, 0, 0, (byte)16);
                  }

                  ++field865;

                  while(true) {
                     class71 var45 = (class71)field727.method4929();
                     class226 var42;
                     class226 var47;
                     if(var45 == null) {
                        while(true) {
                           var45 = (class71)field919.method4929();
                           if(var45 == null) {
                              while(true) {
                                 var45 = (class71)field787.method4929();
                                 if(var45 == null) {
                                    this.method1414((byte)93);
                                    class35.method508(749778877);
                                    if(field853 != null) {
                                       this.method1419((short)22074);
                                    }

                                    if(class236.field3082 != null) {
                                       class68.method1273(class236.field3082, -943171046);
                                       ++field793;
                                       if(class63.field521 == 0) {
                                          if(field887) {
                                             if(class236.field3082 == class183.field2106 && field817 != field791) {
                                                class226 var46 = class236.field3082;
                                                byte var37 = 0;
                                                if(field845 == 1 && var46.field2571 == 206) {
                                                   var37 = 1;
                                                }

                                                if(var46.field2671[field791] <= 0) {
                                                   var37 = 0;
                                                }

                                                if(class173.method3546(class71.method1283(var46, -1130493417), -985572869)) {
                                                   var7 = field817;
                                                   var8 = field791;
                                                   var46.field2671[var8] = var46.field2671[var7];
                                                   var46.field2692[var8] = var46.field2692[var7];
                                                   var46.field2671[var7] = -1;
                                                   var46.field2692[var7] = 0;
                                                } else if(var37 == 1) {
                                                   var7 = field817;
                                                   var8 = field791;

                                                   while(var7 != var8) {
                                                      if(var7 > var8) {
                                                         var46.method4113(var7 - 1, var7, 880946996);
                                                         --var7;
                                                      } else if(var7 < var8) {
                                                         var46.method4113(var7 + 1, var7, 880946996);
                                                         ++var7;
                                                      }
                                                   }
                                                } else {
                                                   var46.method4113(field791, field817, 880946996);
                                                }

                                                var20 = class146.method3363(ClientPacket.field2298, field761.field1340, -1893780109);
                                                var20.field2338.writeLEShortA(field791, -1195317740);
                                                var20.field2338.writeShortA(field817, -2077130267);
                                                var20.field2338.readByte(var37, 1258821856);
                                                var20.field2338.method5591(class236.field3082.field2567, 1411725545);
                                                field761.method2361(var20, 901775494);
                                             }
                                          } else if(this.method1796(1329547181)) {
                                             this.method1703(field789, field696, 1654431956);
                                          } else if(field693 > 0) {
                                             var5 = field789;
                                             var6 = field696;
                                             class91 var43 = class43.field338;
                                             class214.method4005(var43.field1176, var43.field1172, var43.field1173, var43.field1174, var43.field1175, var43.field1175, var5, var6, 2048227519);
                                             class43.field338 = null;
                                          }

                                          field786 = 10;
                                          class63.field524 = 0;
                                          class236.field3082 = null;
                                       } else if(field793 >= 5 && (class63.field517 > field789 + 5 || class63.field517 < field789 - 5 || class63.field518 > field696 + 5 || class63.field518 < field696 - 5)) {
                                          field887 = true;
                                       }
                                    }

                                    if(class142.method3201()) {
                                       var5 = class142.field1845;
                                       var6 = class142.field1846;
                                       var20 = class146.method3363(ClientPacket.field2248, field761.field1340, -1943312243);
                                       var20.field2338.readByte(5, 1258821856);
                                       var20.field2338.readShort(var5 + class69.field590 * 731242929, (byte)-35);
                                       var20.field2338.readByte(class54.field426[82]?(class54.field426[81]?2:1):0, 1258821856);
                                       var20.field2338.readShort(var6 + class89.field1152 * 1825982697, (byte)-71);
                                       field761.method2361(var20, 330276761);
                                       class142.method3333();
                                       field922 = class63.field525;
                                       field688 = class63.field520;
                                       field784 = 1;
                                       field783 = 0;
                                       field910 = var5;
                                       field911 = var6;
                                    }

                                    if(var40 != class9.field52) {
                                       if(var40 != null) {
                                          class68.method1273(var40, -814396634);
                                       }

                                       if(class9.field52 != null) {
                                          class68.method1273(class9.field52, 1219727631);
                                       }
                                    }

                                    if(var35 != class199.field2368 && field871 == field832) {
                                       if(var35 != null) {
                                          class68.method1273(var35, -2118428487);
                                       }

                                       if(class199.field2368 != null) {
                                          class68.method1273(class199.field2368, 793757998);
                                       }
                                    }

                                    if(class199.field2368 != null) {
                                       if(field871 < field832) {
                                          ++field871;
                                          if(field832 == field871) {
                                             class68.method1273(class199.field2368, 170976088);
                                          }
                                       }
                                    } else if(field871 > 0) {
                                       --field871;
                                    }

                                    class135.method2947(-628211228);
                                    if(field888) {
                                       var5 = class87.field1145 * 128 + 64;
                                       var6 = class31.field217 * 128 + 64;
                                       var7 = class277.method5013(var5, var6, class71.field610, -1643132942) - class4.field20;
                                       if(class31.field220 < var5) {
                                          class31.field220 = (var5 - class31.field220) * class242.field3126 / 1000 + class31.field220 + class14.field64;
                                          if(class31.field220 > var5) {
                                             class31.field220 = var5;
                                          }
                                       }

                                       if(class31.field220 > var5) {
                                          class31.field220 -= class242.field3126 * (class31.field220 - var5) / 1000 + class14.field64;
                                          if(class31.field220 < var5) {
                                             class31.field220 = var5;
                                          }
                                       }

                                       if(class14.field63 < var7) {
                                          class14.field63 = (var7 - class14.field63) * class242.field3126 / 1000 + class14.field63 + class14.field64;
                                          if(class14.field63 > var7) {
                                             class14.field63 = var7;
                                          }
                                       }

                                       if(class14.field63 > var7) {
                                          class14.field63 -= class242.field3126 * (class14.field63 - var7) / 1000 + class14.field64;
                                          if(class14.field63 < var7) {
                                             class14.field63 = var7;
                                          }
                                       }

                                       if(class200.field2372 < var6) {
                                          class200.field2372 = (var6 - class200.field2372) * class242.field3126 / 1000 + class200.field2372 + class14.field64;
                                          if(class200.field2372 > var6) {
                                             class200.field2372 = var6;
                                          }
                                       }

                                       if(class200.field2372 > var6) {
                                          class200.field2372 -= class242.field3126 * (class200.field2372 - var6) / 1000 + class14.field64;
                                          if(class200.field2372 < var6) {
                                             class200.field2372 = var6;
                                          }
                                       }

                                       var5 = field925 * 128 + 64;
                                       var6 = class233.field2759 * 128 + 64;
                                       var7 = class277.method5013(var5, var6, class71.field610, 1040962581) - class128.field1549;
                                       var8 = var5 - class31.field220;
                                       var9 = var7 - class14.field63;
                                       var10 = var6 - class200.field2372;
                                       var11 = (int)Math.sqrt((double)(var8 * var8 + var10 * var10));
                                       var12 = (int)(Math.atan2((double)var9, (double)var11) * 325.949D) & 2047;
                                       var13 = (int)(Math.atan2((double)var8, (double)var10) * -325.949D) & 2047;
                                       if(var12 < 128) {
                                          var12 = 128;
                                       }

                                       if(var12 > 383) {
                                          var12 = 383;
                                       }

                                       if(class74.field638 < var12) {
                                          class74.field638 = (var12 - class74.field638) * class98.field1280 / 1000 + class74.field638 + class293.field3626;
                                          if(class74.field638 > var12) {
                                             class74.field638 = var12;
                                          }
                                       }

                                       if(class74.field638 > var12) {
                                          class74.field638 -= class98.field1280 * (class74.field638 - var12) / 1000 + class293.field3626;
                                          if(class74.field638 < var12) {
                                             class74.field638 = var12;
                                          }
                                       }

                                       int var28 = var13 - class32.field230;
                                       if(var28 > 1024) {
                                          var28 -= 2048;
                                       }

                                       if(var28 < -1024) {
                                          var28 += 2048;
                                       }

                                       if(var28 > 0) {
                                          class32.field230 = var28 * class98.field1280 / 1000 + class32.field230 + class293.field3626;
                                          class32.field230 &= 2047;
                                       }

                                       if(var28 < 0) {
                                          class32.field230 -= class293.field3626 + -var28 * class98.field1280 / 1000;
                                          class32.field230 &= 2047;
                                       }

                                       int var15 = var13 - class32.field230;
                                       if(var15 > 1024) {
                                          var15 -= 2048;
                                       }

                                       if(var15 < -1024) {
                                          var15 += 2048;
                                       }

                                       if(var15 < 0 && var28 > 0 || var15 > 0 && var28 < 0) {
                                          class32.field230 = var13;
                                       }
                                    }

                                    for(var5 = 0; var5 < 5; ++var5) {
                                       ++field930[var5];
                                    }

                                    class160.field1983.method2274(973740896);
                                    var5 = ++class63.field511 - 1;
                                    var7 = class54.field437;
                                    class196 var29;
                                    if(var5 > 15000 && var7 > 15000) {
                                       field802 = 250;
                                       ServerPacket.method3666(14500, -1077570862);
                                       var29 = class146.method3363(ClientPacket.field2251, field761.field1340, -1848477738);
                                       field761.method2361(var29, 664971417);
                                    }

                                    class95.field1252.method1941(-1051336580);
                                    ++field761.field1336;
                                    if(field761.field1336 > 50) {
                                       var29 = class146.method3363(ClientPacket.field2295, field761.field1340, -1994029803);
                                       field761.method2361(var29, 1292998911);
                                    }

                                    try {
                                       field761.method2346(-2069512411);
                                    } catch (IOException var30) {
                                       class138.method3079((short)603);
                                    }

                                    return;
                                 }

                                 var47 = var45.field612;
                                 if(var47.field2709 >= 0) {
                                    var42 = class208.method3898(var47.field2586, (byte)-70);
                                    if(var42 == null || var42.field2697 == null || var47.field2709 >= var42.field2697.length || var47 != var42.field2697[var47.field2709]) {
                                       continue;
                                    }
                                 }

                                 class76.method1395(var45, -2052126307);
                              }
                           }

                           var47 = var45.field612;
                           if(var47.field2709 >= 0) {
                              var42 = class208.method3898(var47.field2586, (byte)-71);
                              if(var42 == null || var42.field2697 == null || var47.field2709 >= var42.field2697.length || var47 != var42.field2697[var47.field2709]) {
                                 continue;
                              }
                           }

                           class76.method1395(var45, 1603434797);
                        }
                     }

                     var47 = var45.field612;
                     if(var47.field2709 >= 0) {
                        var42 = class208.method3898(var47.field2586, (byte)-47);
                        if(var42 == null || var42.field2697 == null || var47.field2709 >= var42.field2697.length || var47 != var42.field2697[var47.field2709]) {
                           continue;
                        }
                     }

                     class76.method1395(var45, 295215952);
                  }
               }

               var33 = class146.method3363(ClientPacket.field2304, field761.field1340, -2086718846);
               var33.field2338.readByte(0, 1258821856);
               var4 = var33.field2338.field3710;
               class151.method3392(var33.field2338, -137749117);
               var33.field2338.method5656(var33.field2338.field3710 - var4, -1968281939);
               field761.method2361(var33, 865035169);
            }
         }
      }
   }

   final void method1408(int var1) {
      Object var2 = field761.method2359(1352632931);
      class308 var3 = field761.field1337;

      try {
         if(field711 == 0) {
            if(class63.field532 == null && (field717.method2203((byte)-126) || field712 > 250)) {
               class63.field532 = field717.method2204(876677352);
               field717.method2206((byte)-128);
               field717 = null;
            }

            if(class63.field532 != null) {
               if(var2 != null) {
                  ((class314)var2).vmethod5866((byte)-128);
                  var2 = null;
               }

               class43.field331 = null;
               field728 = false;
               field712 = 0;
               field711 = 1;
            }
         }

         if(field711 == 1) {
            if(class43.field331 == null) {
               class43.field331 = class227.field2710.method3550(class101.field1305, class280.field3574, (byte)-83);
            }

            if(class43.field331.field2033 == 2) {
               throw new IOException();
            }

            if(class43.field331.field2033 == 1) {
               if(field729) {
                  var2 = class309.method5767((Socket)class43.field331.field2030, '\u9c40', 5000, (byte)88);
               } else {
                  var2 = new class180((Socket)class43.field331.field2030, class227.field2710, 5000);
               }

               field761.method2354((class314)var2, (byte)-28);
               class43.field331 = null;
               field711 = 2;
            }
         }

         class196 var5;
         if(field711 == 2) {
            field761.method2345(1731012634);
            var5 = class161.method3482((byte)-124);
            var5.field2347 = null;
            var5.field2337 = 0;
            var5.field2338 = new class308(5000);
            var5.field2338.readByte(class193.field2315.field2316, 1258821856);
            field761.method2361(var5, 2040140402);
            field761.method2346(-2139396316);
            var3.field3710 = 0;
            field711 = 3;
         }

         boolean var14;
         int var15;
         if(field711 == 3) {
            if(class45.field367 != null) {
               class45.field367.method2523(-1215131222);
            }

            if(class30.field211 != null) {
               class30.field211.method2523(-500313510);
            }

            var14 = true;
            if(field729 && !((class314)var2).vmethod5861(1, (byte)0)) {
               var14 = false;
            }

            if(var14) {
               var15 = ((class314)var2).vmethod5863(1436175029);
               if(class45.field367 != null) {
                  class45.field367.method2523(-381840081);
               }

               if(class30.field211 != null) {
                  class30.field211.method2523(1406608898);
               }

               if(var15 != 0) {
                  class223.method4098(var15, -167013262);
                  return;
               }

               var3.field3710 = 0;
               field711 = 4;
            }
         }

         int var37;
         if(field711 == 4) {
            if(var3.field3710 < 8) {
               var37 = ((class314)var2).vmethod5862(-1215433089);
               if(var37 > 8 - var3.field3710) {
                  var37 = 8 - var3.field3710;
               }

               if(var37 > 0) {
                  ((class314)var2).vmethod5864(var3.field3709, var3.field3710, var37, (byte)-64);
                  var3.field3710 += var37;
               }
            }

            if(var3.field3710 == 8) {
               var3.field3710 = 0;
               class103.field1319 = var3.method5553((byte)106);
               field711 = 5;
            }
         }

         int var8;
         int var10;
         int var16;
         if(field711 == 5) {
            field761.field1337.field3710 = 0;
            field761.method2345(-1035988607);
            class308 var4 = new class308(500);
            int[] var28 = new int[]{class63.field532.nextInt(), class63.field532.nextInt(), class63.field532.nextInt(), class63.field532.nextInt()};
            var4.field3710 = 0;
            var4.readByte(1, 1258821856);
            var4.method5689(var28[0], 747474969);
            var4.method5689(var28[1], 747474969);
            var4.method5689(var28[2], 747474969);
            var4.method5689(var28[3], 747474969);
            var4.method5529(class103.field1319);
            if(field687 == 40) {
               var4.method5689(class105.field1345[0], 747474969);
               var4.method5689(class105.field1345[1], 747474969);
               var4.method5689(class105.field1345[2], 747474969);
               var4.method5689(class105.field1345[3], 747474969);
            } else {
               var4.readByte(field715.vmethod6149((byte)62), 1258821856);
               switch(field715.field2014) {
               case 0:
                  LinkedHashMap var7 = class76.field676.field1082;
                  String var9 = class94.field1220;
                  var10 = var9.length();
                  int var11 = 0;

                  for(int var12 = 0; var12 < var10; ++var12) {
                     var11 = (var11 << 5) - var11 + var9.charAt(var12);
                  }

                  var4.method5689(((Integer)var7.get(Integer.valueOf(var11))).intValue(), 747474969);
                  break;
               case 1:
               case 2:
                  var4.method5588(class86.field1141, -849490991);
                  ++var4.field3710;
                  break;
               case 3:
                  var4.field3710 += 4;
               }

               var4.readByte(class322.field3825.vmethod6149((byte)29), 1258821856);
               var4.method5627(class94.field1210, 2047607050);
            }

            var4.method5570(class92.field1181, class92.field1178, -1668495798);
            class105.field1345 = var28;
            class196 var34 = class161.method3482((byte)-46);
            var34.field2347 = null;
            var34.field2337 = 0;
            var34.field2338 = new class308(5000);
            var34.field2338.field3710 = 0;
            if(field687 == 40) {
               var34.field2338.readByte(class193.field2313.field2316, 1258821856);
            } else {
               var34.field2338.readByte(class193.field2317.field2316, 1258821856);
            }

            var34.field2338.readShort(0, (byte)-66);
            var8 = var34.field2338.field3710;
            var34.field2338.method5689(189, 747474969);
            var34.field2338.method5689(1, 747474969);
            var34.field2338.readByte(field685, 1258821856);
            var34.field2338.method5596(var4.field3709, 0, var4.field3710, -1590891251);
            var16 = var34.field2338.field3710;
            var34.field2338.method5627(class94.field1220, 1695463658);
            var34.field2338.readByte((field894?1:0) << 1 | (field684?1:0), 1258821856);
            var34.field2338.readShort(class37.field277, (byte)-57);
            var34.field2338.readShort(class221.field2525, (byte)-36);
            class308 var17 = var34.field2338;
            if(field720 != null) {
               var17.method5596(field720, 0, field720.length, -1590891251);
            } else {
               byte[] var18 = class86.method2106(1774574647);
               var17.method5596(var18, 0, var18.length, -1590891251);
            }

            var34.field2338.method5627(class24.field137, 1772357325);
            var34.field2338.method5689(class255.field3271, 747474969);
            class309 var39 = new class309(class99.field1287.method6360((byte)-86));
            class99.field1287.method6359(var39, 1274635079);
            var34.field2338.method5596(var39.field3709, 0, var39.field3709.length, -1590891251);
            var34.field2338.readByte(field685, 1258821856);
            var34.field2338.method5689(0, 747474969);
            var34.field2338.method5689(class241.field3112.field3141, 747474969);
            var34.field2338.method5689(class215.field2499.field3141, 747474969);
            var34.field2338.method5689(class18.field102.field3141, 747474969);
            var34.field2338.method5689(class36.field270.field3141, 747474969);
            var34.field2338.method5689(class301.field3664.field3141, 747474969);
            var34.field2338.method5689(class27.field162.field3141, 747474969);
            var34.field2338.method5689(class43.field328.field3141, 747474969);
            var34.field2338.method5689(class43.field333.field3141, 747474969);
            var34.field2338.method5689(class228.field2717.field3141, 747474969);
            var34.field2338.method5689(class97.field1263.field3141, 747474969);
            var34.field2338.method5689(class223.field2543.field3141, 747474969);
            var34.field2338.method5689(class38.field293.field3141, 747474969);
            var34.field2338.method5689(class41.field311.field3141, 747474969);
            var34.field2338.method5689(class88.field1151.field3141, 747474969);
            var34.field2338.method5689(class224.field2549.field3141, 747474969);
            var34.field2338.method5689(class20.field113.field3141, 747474969);
            var34.field2338.method5689(0, 747474969);
            var34.field2338.method5689(class91.field1171.field3141, 747474969);
            var34.field2338.method5689(class161.field1987.field3141, 747474969);
            var34.field2338.method5689(class278.field3555.field3141, 747474969);
            var34.field2338.method5689(class25.field144.field3141, 747474969);
            var34.field2338.method5568(var28, var16, var34.field2338.field3710, (byte)37);
            var34.field2338.method5726(var34.field2338.field3710 - var8, 733201281);
            field761.method2361(var34, 1039584610);
            field761.method2346(-2125130165);
            field761.field1340 = new class337(var28);
            int[] var19 = new int[4];

            for(int var13 = 0; var13 < 4; ++var13) {
               var19[var13] = var28[var13] + 50;
            }

            var3.method5525(var19, -1491722671);
            field711 = 6;
         }

         if(field711 == 6 && ((class314)var2).vmethod5862(-629003970) > 0) {
            var37 = ((class314)var2).vmethod5863(1436175029);
            System.out.println("response code: " + var37);
            if(var37 == 21 && field687 == 20) {
               field711 = 12;
            } else if(var37 == 2) {
               field711 = 14;
            } else if(var37 == 15 && field687 == 40) {
               field761.field1333 = -1;
               field711 = 19;
            } else if(var37 == 64) {
               field711 = 10;
            } else if(var37 == 23 && field713 < 1) {
               ++field713;
               field711 = 0;
            } else if(var37 == 29) {
               field711 = 17;
            } else {
               if(var37 != 69) {
                  class223.method4098(var37, -167013262);
                  return;
               }

               field711 = 7;
            }
         }

         if(field711 == 7 && ((class314)var2).vmethod5862(-49167396) >= 2) {
            ((class314)var2).vmethod5864(var3.field3709, 0, 2, (byte)-30);
            var3.field3710 = 0;
            class173.field2026 = var3.readShort((byte)6);
            System.out.println("unknown short: " + class173.field2026);
            field711 = 8;
         }

         if(field711 == 8 && ((class314)var2).vmethod5862(-166470038) >= class173.field2026) {
            var3.field3710 = 0;
            ((class314)var2).vmethod5864(var3.field3709, var3.field3710, class173.field2026, (byte)-60);
            class7[] var26 = new class7[]{class7.field34};
            int a = var3.readUnsignedByte((byte)80);
            class7 var29 = var26[a];

            System.out.println("unknown a: " + var3.readUnsignedByte((byte)80));

            try {
               switch(var29.field30) {
               case 0:
                  class5 var6 = new class5();
                  this.field719 = new class9(var3, var6);
                  field711 = 9;
                  break;
               default:
                  throw new IllegalArgumentException();
               }
            } catch (Exception var24) {
               class223.method4098(22, -167013262);
               return;
            }
         }

         if(field711 == 9 && this.field719.method111(-1753641099)) {
            System.out.println("login state 9");
            this.field718 = this.field719.method113(357894272);
            this.field719.method110(-194627920);
            this.field719 = null;
            if(this.field718 == null) {
               class223.method4098(22, -167013262);
               return;
            }

            field761.method2345(1118398364);
            var5 = class161.method3482((byte)-63);
            var5.field2347 = null;
            var5.field2337 = 0;
            var5.field2338 = new class308(5000);
            var5.field2338.readByte(class193.field2314.field2316, 1258821856);
            var5.field2338.readShort(this.field718.field3710, (byte)-88);
            var5.field2338.method5762(this.field718, -1161644525);
            field761.method2361(var5, 1790943713);
            field761.method2346(-2112353960);
            System.out.println("flushing data");
            this.field718 = null;
            field711 = 6;
         }

         if(field711 == 10 && ((class314)var2).vmethod5862(1559512033) > 0) {
            class52.field407 = ((class314)var2).vmethod5863(1436175029);
            field711 = 11;
         }

         if(field711 == 11 && ((class314)var2).vmethod5862(1701342135) >= class52.field407) {
            ((class314)var2).vmethod5864(var3.field3709, 0, class52.field407, (byte)-23);
            var3.field3710 = 0;
            field711 = 6;
         }

         if(field711 == 12 && ((class314)var2).vmethod5862(-946254981) > 0) {
            field714 = (((class314)var2).vmethod5863(1436175029) + 3) * 60;
            field711 = 13;
         }

         if(field711 == 13) {
            field712 = 0;
            class79.method1852("You have only just left another world.", "Your profile will be transferred in:", field714 / 60 + " seconds.", (byte)41);
            if(--field714 <= 0) {
               field711 = 0;
            }

         } else {
            if(field711 == 14 && ((class314)var2).vmethod5862(-1393560488) >= 1) {
               class15.field71 = ((class314)var2).vmethod5863(1436175029);
               field711 = 15;
            }

            if(field711 == 15 && ((class314)var2).vmethod5862(1795910061) >= class15.field71) {
               var14 = ((class314)var2).vmethod5863(1436175029) == 1;
               ((class314)var2).vmethod5864(var3.field3709, 0, 4, (byte)5);
               var3.field3710 = 0;
               boolean var38 = false;
               if(var14) {
                  var15 = var3.method5511(-1676648466) << 24;
                  var15 |= var3.method5511(-1955884451) << 16;
                  var15 |= var3.method5511(-1744039506) << 8;
                  var15 |= var3.method5511(-1734990953);
                  String var35 = class94.field1220;
                  var8 = var35.length();
                  var16 = 0;

                  for(var10 = 0; var10 < var8; ++var10) {
                     var16 = (var16 << 5) - var16 + var35.charAt(var10);
                  }

                  if(class76.field676.field1082.size() >= 10 && !class76.field676.field1082.containsKey(Integer.valueOf(var16))) {
                     Iterator var36 = class76.field676.field1082.entrySet().iterator();
                     var36.next();
                     var36.remove();
                  }

                  class76.field676.field1082.put(Integer.valueOf(var16), Integer.valueOf(var15));
               }

               if(field716) {
                  class76.field676.field1080 = class94.field1220;
               } else {
                  class76.field676.field1080 = null;
               }

               class35.method509(1681509905);
               field849 = ((class314)var2).vmethod5863(1436175029);
               field710 = ((class314)var2).vmethod5863(1436175029) == 1;
               field797 = ((class314)var2).vmethod5863(1436175029);
               field797 <<= 8;
               field797 += ((class314)var2).vmethod5863(1436175029);
               field798 = ((class314)var2).vmethod5863(1436175029);
               ((class314)var2).vmethod5864(var3.field3709, 0, 1, (byte)-93);
               var3.field3710 = 0;
               ServerPacket[] var30 = class54.method938((byte)34);
               int var21 = var3.method5494(787135806);
               if(var21 < 0 || var21 >= var30.length) {
                  throw new IOException(var21 + " " + var3.field3710);
               }

               field761.field1332 = var30[var21];
               field761.field1333 = field761.field1332.field2205;
               ((class314)var2).vmethod5864(var3.field3709, 0, 2, (byte)-12);
               var3.field3710 = 0;
               field761.field1333 = var3.readShort((byte)13);

               try {
                  class56.method950(class42.field318, "zap", (byte)1);
               } catch (Throwable var23) {
                  ;
               }

               field711 = 16;
            }

            if(field711 == 16) {
               if(((class314)var2).vmethod5862(1035445233) >= field761.field1333) {
                  var3.field3710 = 0;
                  ((class314)var2).vmethod5864(var3.field3709, 0, field761.field1333, (byte)-38);
                  field796.method5021(-529025809);
                  class211.method3983(-1600061666);
                  class290.method5226(var3, (byte)-100);
                  class69.field585 = -1;
                  class151.method3393(false, var3, 1045938723);
                  field761.field1332 = null;
               }

            } else {
               if(field711 == 17 && ((class314)var2).vmethod5862(-150695142) >= 2) {
                  var3.field3710 = 0;
                  ((class314)var2).vmethod5864(var3.field3709, 0, 2, (byte)-58);
                  var3.field3710 = 0;
                  class7.field33 = var3.readShort((byte)40);
                  field711 = 18;
               }

               if(field711 == 18 && ((class314)var2).vmethod5862(411805544) >= class7.field33) {
                  var3.field3710 = 0;
                  ((class314)var2).vmethod5864(var3.field3709, 0, class7.field33, (byte)-99);
                  var3.field3710 = 0;
                  String var27 = var3.method5667(-884608399);
                  String var31 = var3.method5667(-1691341534);
                  String var32 = var3.method5667(-1865782446);
                  class79.method1852(var27, var31, var32, (byte)36);
                  class72.method1293(10, -1914051926);
               }

               if(field711 != 19) {
                  ++field712;
                  if(field712 > 2000) {
                     if(field713 < 1) {
                        if(class280.field3574 == class26.field157) {
                           class280.field3574 = class21.field120;
                        } else {
                           class280.field3574 = class26.field157;
                        }

                        ++field713;
                        field711 = 0;
                     } else {
                        class223.method4098(-3, -167013262);
                     }
                  }
               } else {
                  if(field761.field1333 == -1) {
                     if(((class314)var2).vmethod5862(-1279695546) < 2) {
                        return;
                     }

                     ((class314)var2).vmethod5864(var3.field3709, 0, 2, (byte)1);
                     var3.field3710 = 0;
                     field761.field1333 = var3.readShort((byte)88);
                  }

                  if(((class314)var2).vmethod5862(833767932) >= field761.field1333) {
                     ((class314)var2).vmethod5864(var3.field3709, 0, field761.field1333, (byte)-46);
                     var3.field3710 = 0;
                     var37 = field761.field1333;
                     field796.method5023(1352132310);
                     field761.method2345(-657335163);
                     field761.field1337.field3710 = 0;
                     field761.field1332 = null;
                     field761.field1334 = null;
                     field761.field1329 = null;
                     field761.field1339 = null;
                     field761.field1333 = 0;
                     field761.field1338 = 0;
                     field917 = 0;
                     class214.method4002(1582432822);
                     field912 = 0;
                     field910 = 0;

                     for(var15 = 0; var15 < 2048; ++var15) {
                        players[var15] = null;
                     }

                     class311.field3717 = null;

                     for(var15 = 0; var15 < field721.length; ++var15) {
                        class88 var33 = field721[var15];
                        if(var33 != null) {
                           var33.field999 = -1;
                           var33.field1000 = false;
                        }
                     }

                     class68.field570 = new class327(32);
                     class72.method1293(30, -2042532437);

                     for(var15 = 0; var15 < 100; ++var15) {
                        field679[var15] = true;
                     }

                     var5 = class146.method3363(ClientPacket.field2257, field761.field1340, -2086356242);
                     var5.field2338.readByte(class74.method1327(1847859437), 1258821856);
                     var5.field2338.readShort(class37.field277, (byte)-67);
                     var5.field2338.readShort(class221.field2525, (byte)-37);
                     field761.method2361(var5, 1513223740);
                     class290.method5226(var3, (byte)-81);
                     if(var37 != var3.field3710) {
                        throw new RuntimeException();
                     }
                  }
               }
            }
         }
      } catch (IOException var25) {
         if(field713 < 1) {
            if(class280.field3574 == class26.field157) {
               class280.field3574 = class21.field120;
            } else {
               class280.field3574 = class26.field157;
            }

            ++field713;
            field711 = 0;
         } else {
            class223.method4098(-2, -167013262);
         }
      }
   }

   void method1418(class226 var1, int var2) {
      class226 var3 = var1.field2586 == -1?null:class208.method3898(var1.field2586, (byte)-55);
      int var4;
      int var5;
      if(var3 == null) {
         var4 = class37.field277;
         var5 = class221.field2525;
      } else {
         var4 = var3.field2582;
         var5 = var3.field2642;
      }

      class47.method781(var1, var4, var5, false, (short)11869);
      class26.method291(var1, var4, var5, 255772747);
   }

   final void method1414(byte var1) {
      class69.method1275((byte)4);
      if(class236.field3082 == null) {
         if(field853 == null) {
            int var2 = class63.field524;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int var9;
            int var10;
            int var11;
            if(field816) {
               int var8;
               if(var2 != 1 && (class217.field2506 || var2 != 4)) {
                  var3 = class63.field517;
                  var4 = class63.field518;
                  if(var3 < class34.field248 - 10 || var3 > class49.field383 + class34.field248 + 10 || var4 < class196.field2343 - 10 || var4 > class48.field376 + class196.field2343 + 10) {
                     field816 = false;
                     var5 = class34.field248;
                     var6 = class196.field2343;
                     var7 = class49.field383;
                     var8 = class48.field376;

                     for(var9 = 0; var9 < field883; ++var9) {
                        if(field733[var9] + field950[var9] > var5 && field950[var9] < var7 + var5 && field736[var9] + field939[var9] > var6 && field939[var9] < var8 + var6) {
                           field679[var9] = true;
                        }
                     }
                  }
               }

               if(var2 == 1 || !class217.field2506 && var2 == 4) {
                  var3 = class34.field248;
                  var4 = class196.field2343;
                  var5 = class49.field383;
                  var6 = class63.field525;
                  var7 = class63.field520;
                  var8 = -1;

                  for(var9 = 0; var9 < field693; ++var9) {
                     var10 = var4 + (field693 - 1 - var9) * 15 + 31;
                     if(var6 > var3 && var6 < var5 + var3 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                     }
                  }

                  int var12;
                  if(var8 != -1 && var8 >= 0) {
                     var9 = field776[var8];
                     var10 = field856[var8];
                     var11 = field779[var8];
                     var12 = field858[var8];
                     String var19 = field822[var8];
                     String var14 = field823[var8];
                     class214.method4005(var9, var10, var11, var12, var19, var14, class63.field525, class63.field520, 2035808655);
                  }

                  field816 = false;
                  var9 = class34.field248;
                  var10 = class196.field2343;
                  var11 = class49.field383;
                  var12 = class48.field376;

                  for(int var13 = 0; var13 < field883; ++var13) {
                     if(field733[var13] + field950[var13] > var9 && field950[var13] < var9 + var11 && field736[var13] + field939[var13] > var10 && field939[var13] < var12 + var10) {
                        field679[var13] = true;
                     }
                  }
               }
            } else {
               var3 = class30.method381((byte)104);
               if((var2 == 1 || !class217.field2506 && var2 == 4) && var3 >= 0) {
                  var4 = field779[var3];
                  if(var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) {
                     label299: {
                        var5 = field776[var3];
                        var6 = field856[var3];
                        class226 var15 = class208.method3898(var6, (byte)-13);
                        var9 = class71.method1283(var15, -1219592046);
                        boolean var20 = (var9 >> 28 & 1) != 0;
                        if(!var20) {
                           Object var10000 = null;
                           if(!class173.method3546(class71.method1283(var15, -1914799165), 178370369)) {
                              break label299;
                           }
                        }

                        if(class236.field3082 != null && !field887 && field693 > 0 && !this.method1796(-113814261)) {
                           var10 = field789;
                           var11 = field696;
                           class91 var16 = class43.field338;
                           class214.method4005(var16.field1176, var16.field1172, var16.field1173, var16.field1174, var16.field1175, var16.field1175, var10, var11, 2102652919);
                           class43.field338 = null;
                        }

                        field887 = false;
                        field793 = 0;
                        if(class236.field3082 != null) {
                           class68.method1273(class236.field3082, 1146588110);
                        }

                        class236.field3082 = class208.method3898(var6, (byte)-109);
                        field817 = var5;
                        field789 = class63.field525;
                        field696 = class63.field520;
                        if(var3 >= 0) {
                           class43.field338 = new class91();
                           class43.field338.field1176 = field776[var3];
                           class43.field338.field1172 = field856[var3];
                           class43.field338.field1173 = field779[var3];
                           class43.field338.field1174 = field858[var3];
                           class43.field338.field1175 = field822[var3];
                        }

                        class68.method1273(class236.field3082, -1512035540);
                        return;
                     }
                  }
               }

               if((var2 == 1 || !class217.field2506 && var2 == 4) && this.method1796(968239940)) {
                  var2 = 2;
               }

               if((var2 == 1 || !class217.field2506 && var2 == 4) && field693 > 0 && var3 >= 0) {
                  var4 = field776[var3];
                  var5 = field856[var3];
                  var6 = field779[var3];
                  var7 = field858[var3];
                  String var17 = field822[var3];
                  String var18 = field823[var3];
                  class214.method4005(var4, var5, var6, var7, var17, var18, class63.field525, class63.field520, 1565406540);
               }

               if(var2 == 2 && field693 > 0) {
                  this.method1703(class63.field525, class63.field520, 1195546849);
               }
            }

         }
      }
   }

   final void method1419(short var1) {
      class68.method1273(field853, -828376296);
      ++class173.field2022;
      if(field861 && field732) {
         int var2 = class63.field517;
         int var3 = class63.field518;
         var2 -= field855;
         var3 -= field928;
         if(var2 < field859) {
            var2 = field859;
         }

         if(var2 + field853.field2582 > field859 + field854.field2582) {
            var2 = field859 + field854.field2582 - field853.field2582;
         }

         if(var3 < field881) {
            var3 = field881;
         }

         if(var3 + field853.field2642 > field881 + field854.field2642) {
            var3 = field881 + field854.field2642 - field853.field2642;
         }

         int var4 = var2 - field834;
         int var5 = var3 - field863;
         int var6 = field853.field2649;
         if(class173.field2022 > field853.field2639 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
            field864 = true;
         }

         int var7 = var2 - field859 + field854.field2646;
         int var8 = var3 - field881 + field854.field2589;
         class71 var9;
         if(field853.field2662 != null && field864) {
            var9 = new class71();
            var9.field612 = field853;
            var9.field603 = var7;
            var9.field600 = var8;
            var9.field602 = field853.field2662;
            class76.method1395(var9, -676942186);
         }

         if(class63.field521 == 0) {
            if(field864) {
               if(field853.field2663 != null) {
                  var9 = new class71();
                  var9.field612 = field853;
                  var9.field603 = var7;
                  var9.field600 = var8;
                  var9.field606 = field857;
                  var9.field602 = field853.field2663;
                  class76.method1395(var9, 109322519);
               }

               if(field857 != null && class17.method181(field853, (byte)-16) != null) {
                  class196 var13 = class146.method3363(ClientPacket.field2234, field761.field1340, -2097969358);
                  var13.field2338.method5590(field857.field2567, 962080870);
                  var13.field2338.writeShortA(field857.field2709, -2063919111);
                  var13.field2338.method5591(field853.field2567, -789647878);
                  var13.field2338.method5582(field857.field2704, 70039705);
                  var13.field2338.method5582(field853.field2709, 70039705);
                  var13.field2338.method5582(field853.field2704, 70039705);
                  field761.method2361(var13, 1584068078);
               }
            } else if(this.method1796(815051864)) {
               this.method1703(field834 + field855, field928 + field863, 1455023364);
            } else if(field693 > 0) {
               int var12 = field834 + field855;
               int var10 = field928 + field863;
               class91 var11 = class43.field338;
               class214.method4005(var11.field1176, var11.field1172, var11.field1173, var11.field1174, var11.field1175, var11.field1175, var12, var10, 1911566700);
               class43.field338 = null;
            }

            field853 = null;
         }

      } else {
         if(class173.field2022 > 1) {
            field853 = null;
         }

      }
   }

   public final void init() {
      if(this.method1030(-2067681931)) {
         for(int var1 = 0; var1 <= 19; ++var1) {
            String var2 = this.getParameter(Integer.toString(var1));
            if(var2 != null) {
               switch(var1) {
               case 1:
                  field729 = Integer.parseInt(var2) != 0;
               case 2:
               case 11:
               case 13:
               case 16:
               default:
                  break;
               case 3:
                  if(var2.equalsIgnoreCase("true")) {
                     field683 = true;
                  } else {
                     field683 = false;
                  }
                  break;
               case 4:
                  if(field685 == -1) {
                     field685 = Integer.parseInt(var2);
                  }
                  break;
               case 5:
                  field681 = Integer.parseInt(var2);
                  break;
               case 6:
                  class285.field3597 = class199.method3718(Integer.parseInt(var2), -1926428299);
                  break;
               case 7:
                  class198.field2353 = class233.method4195(Integer.parseInt(var2), (short)18624);
                  break;
               case 8:
                  if(var2.equalsIgnoreCase("true")) {
                     ;
                  }
                  break;
               case 9:
                  class24.field137 = var2;
                  break;
               case 10:
                  class240[] var3 = new class240[]{class240.field3104, class240.field3105, class240.field3111, class240.field3107, class240.field3108, class240.field3106};
                  class341.field3965 = (class240)class16.method159(var3, Integer.parseInt(var2), -1609956543);
                  if(class341.field3965 == class240.field3111) {
                     class27.field164 = class347.field4050;
                  } else {
                     class27.field164 = class347.field4054;
                  }
                  break;
               case 12:
                  field680 = Integer.parseInt(var2);
                  break;
               case 14:
                  class255.field3271 = Integer.parseInt(var2);
                  break;
               case 15:
                  field682 = Integer.parseInt(var2);
                  break;
               case 17:
                  class201.field2390 = var2;
               }
            }
         }

         class142.field1847 = false;
         field684 = false;
         class101.field1305 = this.getCodeBase().getHost();
         String var17 = class198.field2353.field3096;
         byte var18 = 0;

         try {
            class70.field595 = 21;
            class8.field40 = var18;

            try {
               class268.field3527 = System.getProperty("os.name");
            } catch (Exception var34) {
               class268.field3527 = "Unknown";
            }

            class171.field2016 = class268.field3527.toLowerCase();

            try {
               class30.field212 = System.getProperty("user.home");
               if(class30.field212 != null) {
                  class30.field212 = class30.field212 + "/";
               }
            } catch (Exception var33) {
               ;
            }

            try {
               if(class171.field2016.startsWith("win")) {
                  if(class30.field212 == null) {
                     class30.field212 = System.getenv("USERPROFILE");
                  }
               } else if(class30.field212 == null) {
                  class30.field212 = System.getenv("HOME");
               }

               if(class30.field212 != null) {
                  class30.field212 = class30.field212 + "/";
               }
            } catch (Exception var32) {
               ;
            }

            if(class30.field212 == null) {
               class30.field212 = "~/";
            }

            class221.field2522 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class30.field212, "/tmp/", ""};
            class331.field3871 = new String[]{".jagex_cache_" + class8.field40, ".file_store_" + class8.field40};
            int var19 = 0;

            label274:
            while(var19 < 4) {
               String var5 = var19 == 0?"":"" + var19;
               class176.field2048 = new File(class30.field212, "jagex_cl_oldschool_" + var17 + var5 + ".dat");
               String var6 = null;
               String var7 = null;
               boolean var8 = false;
               int var11;
               int var13;
               File var41;
               if(class176.field2048.exists()) {
                  try {
                     class352 var9 = new class352(class176.field2048, "rw", 10000L);

                     class309 var10;
                     for(var10 = new class309((int)var9.method6650((byte)74)); var10.field3710 < var10.field3709.length; var10.field3710 += var11) {
                        var11 = var9.method6658(var10.field3709, var10.field3710, var10.field3709.length - var10.field3710, -316484023);
                        if(var11 == -1) {
                           throw new IOException();
                        }
                     }

                     var10.field3710 = 0;
                     var11 = var10.readUnsignedByte((byte)53);
                     if(var11 < 1 || var11 > 3) {
                        throw new IOException("" + var11);
                     }

                     int var12 = 0;
                     if(var11 > 1) {
                        var12 = var10.readUnsignedByte((byte)29);
                     }

                     if(var11 <= 2) {
                        var6 = var10.method5557(-1416358410);
                        if(var12 == 1) {
                           var7 = var10.method5557(-1416358410);
                        }
                     } else {
                        var6 = var10.method5681(-902492653);
                        if(var12 == 1) {
                           var7 = var10.method5681(-902492653);
                        }
                     }

                     var9.method6648((byte)10);
                  } catch (IOException var36) {
                     var36.printStackTrace();
                  }

                  if(var6 != null) {
                     var41 = new File(var6);
                     if(!var41.exists()) {
                        var6 = null;
                     }
                  }

                  if(var6 != null) {
                     var41 = new File(var6, "test.dat");

                     boolean var44;
                     try {
                        RandomAccessFile var20 = new RandomAccessFile(var41, "rw");
                        var13 = var20.read();
                        var20.seek(0L);
                        var20.write(var13);
                        var20.seek(0L);
                        var20.close();
                        var41.delete();
                        var44 = true;
                     } catch (Exception var31) {
                        var44 = false;
                     }

                     if(!var44) {
                        var6 = null;
                     }
                  }
               }

               if(var6 == null && var19 == 0) {
                  label238:
                  for(int var21 = 0; var21 < class331.field3871.length; ++var21) {
                     for(int var22 = 0; var22 < class221.field2522.length; ++var22) {
                        File var23 = new File(class221.field2522[var22] + class331.field3871[var21] + File.separatorChar + "oldschool" + File.separatorChar);
                        if(var23.exists()) {
                           File var24 = new File(var23, "test.dat");

                           boolean var45;
                           try {
                              RandomAccessFile var14 = new RandomAccessFile(var24, "rw");
                              int var15 = var14.read();
                              var14.seek(0L);
                              var14.write(var15);
                              var14.seek(0L);
                              var14.close();
                              var24.delete();
                              var45 = true;
                           } catch (Exception var30) {
                              var45 = false;
                           }

                           if(var45) {
                              var6 = var23.toString();
                              var8 = true;
                              break label238;
                           }
                        }
                     }
                  }
               }

               if(var6 == null) {
                  var6 = class30.field212 + File.separatorChar + "jagexcache" + var5 + File.separatorChar + "oldschool" + File.separatorChar + var17 + File.separatorChar;
                  var8 = true;
               }

               if(var7 != null) {
                  File var40 = new File(var7);
                  var41 = new File(var6);

                  try {
                     File[] var49 = var40.listFiles();
                     File[] var47 = var49;

                     for(var13 = 0; var13 < var47.length; ++var13) {
                        File var46 = var47[var13];
                        File var25 = new File(var41, var46.getName());
                        boolean var16 = var46.renameTo(var25);
                        if(!var16) {
                           throw new IOException();
                        }
                     }
                  } catch (Exception var35) {
                     var35.printStackTrace();
                  }

                  var8 = true;
               }

               if(var8) {
                  class151.method3394(new File(var6), (File)null, (short)1603);
               }

               File var4 = new File(var6);
               class92.field1180 = var4;
               if(!class92.field1180.exists()) {
                  class92.field1180.mkdirs();
               }

               File[] var39 = class92.field1180.listFiles();
               if(var39 == null) {
                  break;
               }

               File[] var42 = var39;
               int var26 = 0;

               while(true) {
                  if(var26 >= var42.length) {
                     break label274;
                  }

                  File var27 = var42[var26];

                  boolean var48;
                  try {
                     RandomAccessFile var43 = new RandomAccessFile(var27, "rw");
                     var11 = var43.read();
                     var43.seek(0L);
                     var43.write(var11);
                     var43.seek(0L);
                     var43.close();
                     var48 = true;
                  } catch (Exception var29) {
                     var48 = false;
                  }

                  if(!var48) {
                     ++var19;
                     break;
                  }

                  ++var26;
               }
            }

            File var38 = class92.field1180;
            class178.field2057 = var38;
            if(!class178.field2057.exists()) {
               throw new RuntimeException("");
            }

            class178.field2056 = true;
            class218.method4024(1338498163);
            class176.field2051 = new class351(new class352(class137.method3076("main_file_cache.dat2", -880025172), "rw", 1048576000L), 5200, 0);
            class176.field2055 = new class351(new class352(class137.method3076("main_file_cache.idx255", -1700763497), "rw", 1048576L), 6000, 0);
            class196.field2345 = new class351[class70.field595];

            for(int var28 = 0; var28 < class70.field595; ++var28) {
               class196.field2345[var28] = new class351(new class352(class137.method3076("main_file_cache.idx" + var28, -1000039478), "rw", 1048576L), 6000, 0);
            }
         } catch (Exception var37) {
            class229.method4189((String)null, var37, -1131770525);
         }

         class42.field318 = this;
         class350.field4070 = field685;
         this.method1028(765, 503, 189, -1396193082);
      }
   }

   public static void method1494(byte var0) {
      class206.field2405.method3861(1819276165);
      class206.field2406 = 1;
      class206.field2407 = null;
   }

   static void aan() {
      if(class31.field222 != null) {
         field891 = field689 * -75443930;
         class31.field222.method4382(1569288926);

         for(int var0 = 0; var0 < players.length; ++var0) {
            if(players[var0] != null) {
               class31.field222.method4381(class69.field590 * 859536462 + (players[var0].field983 >> 7), (players[var0].field973 * 1064284365 >> 7) + class89.field1152 * 303245122, -1027138584);
            }
         }
      }

   }

   public static boolean aas() {
      return field849 >= 2;
   }

   static String aaa(String var0) {
      class238[] var1 = class70.method1278((byte)70);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class238 var3 = var1[var2];
         if(var3.field3088 != -1 && var0.startsWith(class1.method21(var3.field3088, 2096369762))) {
            var0 = var0.substring(6 + Integer.toString(var3.field3088).length());
            break;
         }
      }

      return var0;
   }

   static void aax() {
      if(class31.field222 != null) {
         field891 = field689 * -2003921705;
         class31.field222.method4382(1569288926);

         for(int var0 = 0; var0 < players.length; ++var0) {
            if(players[var0] != null) {
               class31.field222.method4381((players[var0].field983 >> 7) + class69.field590 * 122687022, (players[var0].field973 * -451521249 >> 7) + class89.field1152 * -474200813, 1204579160);
            }
         }
      }

   }

   static void aad() {
      if(field754 == 1) {
         field770 = true;
      }

   }

   public static boolean aai() {
      return field849 * 1106211330 >= 2;
   }

   public static boolean aat() {
      return field849 >= 2;
   }

   public static boolean aag() {
      return field849 * 978798786 >= 2;
   }

   static void aao(int var0) {
      field754 = var0 * -721998062;
   }

   static void aal() {
      if(field754 == 1) {
         field770 = true;
      }

   }

   static void aae() {
      if(field754 == 1) {
         field770 = true;
      }

   }

   static void aac() {
      if(field754 == 1) {
         field770 = true;
      }

   }

   static void aah() {
      if(class31.field222 != null) {
         field891 = field689;
         class31.field222.method4382(1569288926);

         for(int var0 = 0; var0 < players.length; ++var0) {
            if(players[var0] != null) {
               class31.field222.method4381((players[var0].field983 >> 7) + class69.field590 * 731242929, class89.field1152 * 1825982697 + (players[var0].field973 >> 7), -1816761966);
            }
         }
      }

   }

   static void aap() {
      if(class31.field222 != null) {
         field891 = field689;
         class31.field222.method4382(1569288926);

         for(int var0 = 0; var0 < players.length; ++var0) {
            if(players[var0] != null) {
               class31.field222.method4381((players[var0].field983 >> 7) + class69.field590 * 731242929, class89.field1152 * 1825982697 + (players[var0].field973 >> 7), 1729349417);
            }
         }
      }

   }
}
