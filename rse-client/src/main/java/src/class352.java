package src;

import java.io.*;

public final class class352 {

   long field4088;
   RandomAccessFile field4087;
   final long field4086;


   public class352(File var1, String var2, long var3) throws IOException {
      if(var3 == -1L) {
         var3 = Long.MAX_VALUE;
      }

      if(var1.length() > var3) {
         var1.delete();
      }

      this.field4087 = new RandomAccessFile(var1, var2);
      this.field4086 = var3;
      this.field4088 = 0L;
      int var5 = this.field4087.read();
      if(var5 != -1 && !var2.equals("r")) {
         this.field4087.seek(0L);
         this.field4087.write(var5);
      }

      this.field4087.seek(0L);
   }

   public final void method6651(boolean var1, int var2) throws IOException {
      if(this.field4087 != null) {
         if(var1) {
            try {
               this.field4087.getFD().sync();
            } catch (SyncFailedException var4) {
               ;
            }
         }

         this.field4087.close();
         this.field4087 = null;
      }

   }

   public final long method6650(byte var1) throws IOException {
      return this.field4087.length();
   }

   public final void method6648(byte var1) throws IOException {
      this.method6651(false, 2141113619);
   }

   public final int method6658(byte[] var1, int var2, int var3, int var4) throws IOException {
      int var5 = this.field4087.read(var1, var2, var3);
      if(var5 > 0) {
         this.field4088 += (long)var5;
      }

      return var5;
   }

   final void method6647(long var1) throws IOException {
      this.field4087.seek(var1);
      this.field4088 = var1;
   }

   public final void method6653(byte[] var1, int var2, int var3, byte var4) throws IOException {
      if(this.field4088 + (long)var3 > this.field4086) {
         this.field4087.seek(this.field4086);
         this.field4087.write(1);
         throw new EOFException();
      } else {
         this.field4087.write(var1, var2, var3);
         this.field4088 += (long)var3;
      }
   }

   protected void aaw() throws Throwable {
      if(this.field4087 != null) {
         System.out.println("");
         this.method6648((byte)10);
      }

   }

   protected void aaf() throws Throwable {
      if(this.field4087 != null) {
         System.out.println("");
         this.method6648((byte)10);
      }

   }

   protected void finalize() throws Throwable {
      if(this.field4087 != null) {
         System.out.println("");
         this.method6648((byte)10);
      }

   }

   protected void aav() throws Throwable {
      if(this.field4087 != null) {
         System.out.println("");
         this.method6648((byte)10);
      }

   }

   protected void aay() throws Throwable {
      if(this.field4087 != null) {
         System.out.println("");
         this.method6648((byte)10);
      }

   }
}
