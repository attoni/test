/*     */ package test;
/*     */ 

/*     */ import java.math.BigDecimal;
/*     */ import java.util.Hashtable;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Properties;
/*     */ 
/*     */ public class GlobalsForThreads
/*     */ {
/*  27 */   public static boolean isKill1 = false;
/*  28 */   public static boolean isKill2 = false;
/*     */ 
/*  30 */   public static int threadPoolSize = 1;
/*  31 */   public static int chkThrdTime = 600;
/*     */   public static long occ_rateplan;
/*     */   public static long sccode;
/*     */   public static long subm_id;
/*     */   public static long plcode;
/*     */   public static long npcode;
/*     */   public static long profile_id;
/*     */   public static long sncode_of_msisdn;
/*  41 */   public static Hashtable<Integer, LinkedList<InputEntry>> entries = new Hashtable();
/*     */   public static Thread[] subThreads;
/*     */   public static String[] threadsTimeStamp;
/*     */   public static DBConnection dbLoader;
/*  45 */   public static Properties lOrbProps = new Properties();
/*     */ 
/*  47 */   public static Hashtable<String, ContractTemplate> contractTemplates = new Hashtable();
/*  48 */   public static Hashtable<BigDecimal, NvElementI> rateplanCoreServ = new Hashtable();
/*  49 */   public static Hashtable<Long, NvElementI> coreServicesParams = new Hashtable();
/*     */ 
/*  51 */   public static boolean isConnectedDBRetryProcessing = true;
/*  52 */   public static boolean isConnectedDBFolderHandler = true;
/*  53 */   public static boolean isConnectedDBProcessingRun = true;
/*  54 */   public static boolean isConnectedDBProcessor = true;
/*  55 */   public static boolean isConnectedSOIProcessor = true;
/*     */ 
/*     */   public static synchronized Properties getLOrbProps() {
/*  58 */     return lOrbProps;
/*     */   }
/*     */ 
/*     */   public static synchronized int getChkThrdTime() {
/*  62 */     return chkThrdTime;
/*     */   }
/*     */ 
/*     */   public static synchronized void setChkThrdTime(int i) {
/*  66 */     chkThrdTime = i;
/*     */   }
/*     */ 
/*     */   public static synchronized int getThreadPoolSize() {
/*  70 */     return threadPoolSize;
/*     */   }
/*     */ 
/*     */   public static synchronized void setThreadPoolSize(int i) {
/*  74 */     threadPoolSize = i;
/*     */   }
/*     */ 
/*     */   public static synchronized boolean getKiller2() {
/*  78 */     return isKill2;
/*     */   }
/*     */ 
/*     */   public static synchronized void setKiller2(boolean blean) {
/*  82 */     isKill2 = blean;
/*     */   }
/*     */ 
/*     */   public static synchronized boolean getKiller1() {
/*  86 */     return isKill1;
/*     */   }
/*     */ 
/*     */   public static synchronized void setKiller1(boolean blean) {
/*  90 */     isKill1 = blean;
/*     */   }
/*     */ 
/*     */   public static synchronized void setFingerPrint(String fpX, int p_id) {
/*  94 */     threadsTimeStamp[p_id] = fpX;
/*     */   }
/*     */ 
/*     */   public static synchronized String getFingerPrint(int p_id) {
/*  98 */     return threadsTimeStamp[p_id];
/*     */   }
/*     */ 
/*     */   public static synchronized boolean isConnectedDBRetryProcessing() {
/* 102 */     return isConnectedDBRetryProcessing;
/*     */   }
/*     */ 
/*     */   public static synchronized void setConnectedDBRetryProcessing(boolean isConnectedDBRetryProcessing)
/*     */   {
/* 107 */     isConnectedDBRetryProcessing = isConnectedDBRetryProcessing;
/*     */   }
/*     */ 
/*     */   public static synchronized boolean isConnectedDBFolderHandler() {
/* 111 */     return isConnectedDBFolderHandler;
/*     */   }
/*     */ 
/*     */   public static synchronized void setConnectedDBFolderHandler(boolean isConnectedDBFolderHandler)
/*     */   {
/* 116 */     isConnectedDBFolderHandler = isConnectedDBFolderHandler;
/*     */   }
/*     */ 
/*     */   public static synchronized boolean isConnectedDBProcessingRun() {
/* 120 */     return isConnectedDBProcessingRun;
/*     */   }
/*     */ 
/*     */   public static synchronized void setConnectedDBProcessingRun(boolean isConnectedDBProcessingRun)
/*     */   {
/* 125 */     isConnectedDBProcessingRun = isConnectedDBProcessingRun;
/*     */   }
/*     */ 
/*     */   public static synchronized boolean isConnectedDBProcessor() {
/* 129 */     return isConnectedDBProcessor;
/*     */   }
/*     */ 
/*     */   public static synchronized void setConnectedDBProcessor(boolean isConnectedDBProcessor)
/*     */   {
/* 134 */     isConnectedDBProcessor = isConnectedDBProcessor;
/*     */   }
/*     */ 
/*     */   public static synchronized boolean isConnectedSOIProcessor() {
/* 138 */     return isConnectedSOIProcessor;
/*     */   }
/*     */ 
/*     */   public static synchronized void setConnectedSOIProcessor(boolean isConnectedSOIProcessor)
/*     */   {
/* 143 */     isConnectedSOIProcessor = isConnectedSOIProcessor;
/*     */   }
/*     */ }

/* Location:           D:\WORK\jad\jars\MassAction_V2.jar
 * Qualified Name:     com.piaclient.massactiontool.prop.GlobalsForThreads
 * JD-Core Version:    0.6.0
 */