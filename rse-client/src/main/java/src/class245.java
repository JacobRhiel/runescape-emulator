package src;

import java.util.zip.CRC32;

public class class245 extends class243 {

   static CRC32 field3158 = new CRC32();
   class317 field3153;
   int field3159;
   class317 field3162;
   volatile boolean field3154 = false;
   volatile boolean[] field3157;
   int field3155;
   int field3160;
   int field3161 = -1;
   boolean field3156 = false;


   public class245(class317 var1, class317 var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.field3162 = var1;
      this.field3153 = var2;
      this.field3155 = var3;
      this.field3156 = var6;
      class3.method58(this, this.field3155, -1889898476);
   }

   void vmethod4322(int var1, byte var2) {
      if(this.field3162 != null && this.field3157 != null && this.field3157[var1]) {
         class102.method2328(var1, this.field3162, this, -389102765);
      } else {
         class147.method3371(this, this.field3155, var1, super.field3129[var1], (byte)2, true, -626508532);
      }

   }

   public boolean method4329(int var1, int var2) {
      return this.method4234(var1, -1325919604) != null;
   }

   int vmethod4346(int var1, byte var2) {
      return super.field3138[var1] != null?100:(this.field3157[var1]?100:class3.method59(this.field3155, var1, -61779781));
   }

   void method4327(int var1) {
      this.field3157 = new boolean[super.field3138.length];

      int var2;
      for(var2 = 0; var2 < this.field3157.length; ++var2) {
         this.field3157[var2] = false;
      }

      if(this.field3162 == null) {
         this.field3154 = true;
      } else {
         this.field3161 = -1;

         for(var2 = 0; var2 < this.field3157.length; ++var2) {
            if(super.field3134[var2] > 0) {
               class228.method4180(var2, this.field3162, this, -70206811);
               this.field3161 = var2;
            }
         }

         if(this.field3161 == -1) {
            this.field3154 = true;
         }

      }
   }

   void vmethod4321(int var1, byte var2) {
      int var3 = this.field3155;
      long var4 = (long)((var3 << 16) + var1);
      class242 var6 = (class242)class246.field3171.method6010(var4);
      if(var6 != null) {
         class246.field3170.method4851(var6);
      }

   }

   public boolean method4328(int var1, byte var2) {
      return this.field3157[var1];
   }

   public void method4349(class317 var1, int var2, byte[] var3, boolean var4, int var5) {
      int var6;
      if(var1 == this.field3153) {
         if(this.field3154) {
            throw new RuntimeException();
         }

         if(var3 == null) {
            class147.method3371(this, 255, this.field3155, this.field3159, (byte)0, true, -626508532);
            return;
         }

         field3158.reset();
         field3158.update(var3, 0, var3.length);
         var6 = (int)field3158.getValue();
         if(var6 != this.field3159) {
            class147.method3371(this, 255, this.field3155, this.field3159, (byte)0, true, -626508532);
            return;
         }

         class309 var12 = new class309(class217.method4013(var3, -1231201215));
         int var13 = var12.readUnsignedByte((byte)98);
         if(var13 != 5 && var13 != 6) {
            throw new RuntimeException(var13 + "," + this.field3155 + "," + var2);
         }

         int var9 = 0;
         if(var13 >= 6) {
            var9 = var12.readInt(297718403);
         }

         if(var9 != this.field3160) {
            class147.method3371(this, 255, this.field3155, this.field3159, (byte)0, true, -626508532);
            return;
         }

         this.method4222(var3, '\u8000');
         this.method4327(-539943157);
      } else {
         if(!var4 && var2 == this.field3161) {
            this.field3154 = true;
         }

         if(var3 == null || var3.length <= 2) {
            this.field3157[var2] = false;
            if(this.field3156 || var4) {
               class147.method3371(this, this.field3155, var2, super.field3129[var2], (byte)2, var4, -626508532);
            }

            return;
         }

         field3158.reset();
         field3158.update(var3, 0, var3.length - 2);
         var6 = (int)field3158.getValue();
         int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if(var6 != super.field3129[var2] || var7 != super.field3133[var2]) {
            this.field3157[var2] = false;
            if(this.field3156 || var4) {
               class147.method3371(this, this.field3155, var2, super.field3129[var2], (byte)2, var4, -626508532);
            }

            return;
         }

         this.field3157[var2] = true;
         if(var4) {
            Object[] var8 = super.field3138;
            Object var10;
            if(var3 == null) {
               var10 = null;
            } else if(var3.length > 136) {
               class215 var11 = new class215();
               var11.vmethod4006(var3, (byte)0);
               var10 = var11;
            } else {
               var10 = var3;
            }

            var8[var2] = var10;
         }
      }

   }

   public void method4323(int var1, int var2, byte var3) {
      this.field3159 = var1;
      this.field3160 = var2;
      if(this.field3153 != null) {
         class102.method2328(this.field3155, this.field3153, this, -389102765);
      } else {
         class147.method3371(this, 255, this.field3155, this.field3159, (byte)0, true, -626508532);
      }

   }

   public int method4354(int var1) {
      if(this.field3154) {
         return 100;
      } else if(super.field3138 != null) {
         return 99;
      } else {
         int var2 = class3.method59(255, this.field3155, -61779781);
         if(var2 >= 100) {
            var2 = 99;
         }

         return var2;
      }
   }

   public void method4320(int var1, byte[] var2, boolean var3, boolean var4, int var5) {
      if(var3) {
         if(this.field3154) {
            throw new RuntimeException();
         }

         if(this.field3153 != null) {
            int var6 = this.field3155;
            class317 var7 = this.field3153;
            class241 var8 = new class241();
            var8.field3117 = 0;
            var8.field2116 = (long)var6;
            var8.field3113 = var2;
            var8.field3114 = var7;
            class271 var9 = class244.field3149;
            synchronized(class244.field3149) {
               class244.field3149.method4952(var8);
            }

            Object var17 = class244.field3150;
            synchronized(class244.field3150) {
               if(class244.field3151 == 0) {
                  class197.field2349 = new Thread(new class244());
                  class197.field2349.setDaemon(true);
                  class197.field2349.start();
                  class197.field2349.setPriority(5);
               }

               class244.field3151 = 600;
            }
         }

         this.method4222(var2, '\u8000');
         this.method4327(-425761296);
      } else {
         var2[var2.length - 2] = (byte)(super.field3133[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field3133[var1];
         if(this.field3162 != null) {
            class150.method3388(var1, var2, this.field3162, (short)4729);
            this.field3157[var1] = true;
         }

         if(var4) {
            Object[] var12 = super.field3138;
            Object var16;
            if(var2 == null) {
               var16 = null;
            } else if(var2.length > 136) {
               class215 var18 = new class215();
               var18.vmethod4006(var2, (byte)0);
               var16 = var18;
            } else {
               var16 = var2;
            }

            var12[var1] = var16;
         }
      }

   }

   public int method4350(byte var1) {
      int var2 = 0;
      int var3 = 0;

      int var4;
      for(var4 = 0; var4 < super.field3138.length; ++var4) {
         if(super.field3134[var4] > 0) {
            var2 += 100;
            var3 += this.vmethod4346(var4, (byte)9);
         }
      }

      if(var2 == 0) {
         return 100;
      } else {
         var4 = var3 * 100 / var2;
         return var4;
      }
   }

   public boolean method4319(int var1) {
      return this.field3154;
   }
}
