/*    */ package test;
/*    */ 
/*    */ public class SignalHandling
/*    */ {
/* 20 */   public static boolean debugMode = false;
/* 21 */   public static boolean downGraceful = false;
/* 22 */   public static boolean reConfig = false;
/*    */ 
/*    */   public static synchronized boolean getDebugMode()
/*    */   {
/* 58 */     return debugMode;
/*    */   }
/*    */ 
/*    */   public static synchronized void setDebugMode(boolean b) {
/* 62 */     debugMode = b;
/*    */   }
/*    */ 
/*    */   public static synchronized boolean getDownGraceful() {
/* 66 */     return downGraceful;
/*    */   }
/*    */ 
/*    */   public static synchronized void setDownGraceful(boolean b) {
/* 70 */     downGraceful = b;
/*    */   }
/*    */ 
/*    */   public static synchronized boolean getReConfig() {
/* 74 */     return reConfig;
/*    */   }
/*    */ 
/*    */   public static synchronized void setReConfig(boolean b) {
/* 78 */     reConfig = b;
/*    */   }
/*    */ }

/* Location:           D:\WORK\jad\jars\MassAction_V2.jar
 * Qualified Name:     com.piaclient.util.SignalHandling
 * JD-Core Version:    0.6.0
 */