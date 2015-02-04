/*     */ package test;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public class LogToMem
/*     */ {
/*     */   public static final int Debug = 0;
/*     */   public static final int Information = 1;
/*     */   public static final int Exception = 2;
/*     */   public static final int Warning = 3;
/*     */   public static final int Fatal = 4;
/*  24 */   public static ArrayList<String> memLog = null;
/*     */ 
/*  26 */   private static String logLinePrefix = "Dunning:";
/*  27 */   private static String logFileName = null;
/*  28 */   private static int logFileSize = 0;
/*  29 */   private static int listArrayLimit = 500;
/*  30 */   private static boolean threadStopper = false;
/*     */ 
/*     */   public LogToMem(String file, String lPrep, int lSize) {
/*  33 */     logFileSize = lSize;
/*  34 */     logFileName = file;
/*  35 */     threadStopper = false;
/*  36 */     logLinePrefix = lPrep;
/*     */   }
/*     */ 
/*     */   public static synchronized void write_to_log(int wrtMode, String message) {
/*  40 */     String wrtChar = "";
/*  41 */     switch (wrtMode) {
/*     */     case 0:
/*  43 */       wrtChar = ":D: ";
/*  44 */       break;
/*     */     case 2:
/*  46 */       wrtChar = ":E: ";
/*  47 */       break;
/*     */     case 1:
/*  49 */       wrtChar = ":I: ";
/*  50 */       break;
/*     */     case 4:
/*  52 */       wrtChar = ":F: ";
/*  53 */       break;
/*     */     case 3:
/*  55 */       wrtChar = ":W: ";
/*     */     }
/*     */ 
/*  58 */     addToList(logLinePrefix + DateThings.getLogDate() + wrtChar + message + 
/*  59 */       "\n");
/*     */   }
/*     */ 
/*     */   public static synchronized void addToList(String msg) {
/*  63 */     memLog.add(msg);
/*     */   }
/*     */ 
/*     */   public static synchronized String getFromList() {
/*  67 */     if (memLog.isEmpty()) {
/*  68 */       return "";
/*     */     }
/*  70 */     String dummy1 = (String)memLog.get(0);
/*  71 */     memLog.remove(0);
/*  72 */     return dummy1;
/*     */   }
/*     */ 
/*     */   public static synchronized int getMemLogSize() {
/*  76 */     return memLog.size();
/*     */   }
/*     */ 
/*     */   public static synchronized void setThreadStopper(boolean b) {
/*  80 */     threadStopper = b;
/*     */   }
/*     */ 
/*     */   public static synchronized boolean getThreadStopper() {
/*  84 */     return threadStopper;
/*     */   }
/*     */ 
/*     */   public static synchronized int getListArrayLimit() {
/*  88 */     return listArrayLimit;
/*     */   }
/*     */ 
/*     */   public static synchronized void setListArrayLimit(int i) {
/*  92 */     listArrayLimit = i;
/*     */   }
/*     */ 
/*     */   public static synchronized int getLogFileSize() {
/*  96 */     return logFileSize;
/*     */   }
/*     */ 
/*     */   public static synchronized void setLogFileSize(int i) {
/* 100 */     logFileSize = i;
/*     */   }
/*     */ 
/*     */   public static synchronized String getLogFileName() {
/* 104 */     return logFileName;
/*     */   }
/*     */ 
/*     */   public static synchronized void setLogFileName(String s) {
/* 108 */     logFileName = s;
/*     */   }
/*     */ 
/*     */   public static synchronized void setLogLinePrefix(String s) {
/* 112 */     logLinePrefix = s;
/*     */   }
/*     */ 
/*     */   public static String prepStackTrace(StackTraceElement[] stre) {
/* 116 */     String rStr = "";
/* 117 */     for (int k = 0; k < stre.length; k++)
/* 118 */       rStr = rStr + "\n" + stre[k].toString() + ";";
/* 119 */     return rStr;
/*     */   }
/*     */ }

/* Location:           D:\WORK\jad\jars\MassAction_V2.jar
 * Qualified Name:     com.piaclient.util.LogToMem
 * JD-Core Version:    0.6.0
 */