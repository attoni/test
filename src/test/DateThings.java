/*     */ package test;
/*     */ 
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.GregorianCalendar;
/*     */ 
/*     */ public class DateThings
/*     */ {
/*     */   private static int Shour24;
/*     */   private static int Smin;
/*     */   private static int Ssec;
/*     */   private static int Smsec;
/*     */   private static StringBuffer dateBuffer;
/*     */   private static Calendar myCal;
/*     */ 
/*     */   public static String getDateTime(boolean withchars)
/*     */   {
/*  26 */     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
/*  27 */     if (!withchars) {
/*  28 */       sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
/*     */     }
/*  30 */     return sdf.format(new Date());
/*     */   }
/*     */ 
/*     */   public static String getLogDate() {
/*  34 */     SimpleDateFormat sdf = new SimpleDateFormat("MMdd HH:mm:ss.SSS");
/*  35 */     return sdf.format(new Date());
/*     */   }
/*     */ 
/*     */   public static String addedDates(String addChar, int addDays) {
/*  39 */     SimpleDateFormat dateformatter = new SimpleDateFormat("yyyyMMddHHmmss");
/*  40 */     Calendar date = Calendar.getInstance();
/*  41 */     Calendar cldr = (Calendar)date.clone();
/*  42 */     switch (addChar.charAt(0)) {
/*     */     case 'd':
/*  44 */       cldr.add(6, addDays);
/*  45 */       break;
/*     */     case 'h':
/*  47 */       cldr.add(11, addDays);
/*  48 */       break;
/*     */     case 'e':
/*     */     case 'f':
/*     */     case 'g':
/*     */     }
/*  53 */     return dateformatter.format(cldr.getTime());
/*     */   }
/*     */ 
/*     */   public static String addedDates(String inD, String addChar, int addDays) {
/*  57 */     if (inD.trim().length() < 14) {
/*  58 */       return "";
/*     */     }
/*  60 */     SimpleDateFormat dateformatter = new SimpleDateFormat("yyyyMMddHHmmss");
/*  61 */     Calendar cldr = Calendar.getInstance();
/*  62 */     cldr.clear();
/*  63 */     int iYear = Integer.parseInt(inD.substring(0, 4)); int iMonth = 
/*  64 */       Integer.parseInt(inD.substring(4, 6)); int iDay = Integer.parseInt(inD
/*  65 */       .substring(6, 8)); int iHour = Integer.parseInt(inD
/*  66 */       .substring(8, 10)); int iMin = Integer.parseInt(inD.substring(10, 
/*  67 */       12)); int iSec = Integer.parseInt(inD.substring(12, 14));
/*  68 */     cldr.set(iYear, iMonth - 1, iDay, iHour, iMin, iSec);
/*  69 */     switch (addChar.charAt(0)) {
/*     */     case 'd':
/*  71 */       cldr.add(6, addDays);
/*  72 */       break;
/*     */     }
/*     */ 
/*  77 */     return dateformatter.format(cldr.getTime());
/*     */   }
/*     */ 
/*     */   public static long DiffSecByNow(String inD1) {
/*  81 */     Calendar cldr = Calendar.getInstance();
/*  82 */     Date endDate1 = cldr.getTime();
/*  83 */     cldr.clear();
/*  84 */     int iYear = Integer.parseInt(inD1.substring(0, 4)); int iMonth = 
/*  85 */       Integer.parseInt(inD1.substring(4, 6)); int iDay = Integer.parseInt(inD1
/*  86 */       .substring(6, 8)); int iHour = Integer.parseInt(inD1.substring(8, 
/*  87 */       10)); int iMin = Integer.parseInt(inD1.substring(10, 12)); int iSec = 
/*  88 */       Integer.parseInt(inD1.substring(12, 14));
/*  89 */     cldr.set(iYear, iMonth - 1, iDay, iHour, iMin, iSec);
/*  90 */     Date startDate1 = cldr.getTime();
/*  91 */     long diff = endDate1.getTime() - startDate1.getTime();
/*  92 */     return diff / 1000L;
/*     */   }
/*     */ 
/*     */   public static long DiffSecOfTwo(String inD1, String inD2) {
/*  96 */     Calendar cldr = Calendar.getInstance();
/*  97 */     cldr.clear();
/*  98 */     int iYear = Integer.parseInt(inD1.substring(0, 4)); int iMonth = 
/*  99 */       Integer.parseInt(inD1.substring(4, 6)); int iDay = Integer.parseInt(inD1
/* 100 */       .substring(6, 8)); int iHour = Integer.parseInt(inD1.substring(8, 
/* 101 */       10)); int iMin = Integer.parseInt(inD1.substring(10, 12)); int iSec = 
/* 102 */       Integer.parseInt(inD1.substring(12, 14));
/* 103 */     cldr.set(iYear, iMonth - 1, iDay, iHour, iMin, iSec);
/* 104 */     Date startDate1 = cldr.getTime();
/* 105 */     cldr.clear();
/* 106 */     iYear = Integer.parseInt(inD2.substring(0, 4));
/* 107 */     iMonth = Integer.parseInt(inD2.substring(4, 6));
/* 108 */     iDay = Integer.parseInt(inD2.substring(6, 8));
/* 109 */     iHour = Integer.parseInt(inD2.substring(8, 10));
/* 110 */     iMin = Integer.parseInt(inD2.substring(10, 12));
/* 111 */     iSec = Integer.parseInt(inD2.substring(12, 14));
/* 112 */     cldr.set(iYear, iMonth - 1, iDay, iHour, iMin, iSec);
/* 113 */     Date endDate1 = cldr.getTime();
/* 114 */     return (endDate1.getTime() - startDate1.getTime()) / 1000L;
/*     */   }
/*     */ 
/*     */   public static int getTime() {
/* 118 */     myCal = new GregorianCalendar();
/* 119 */     Shour24 = myCal.get(11);
/* 120 */     Smin = myCal.get(12);
/* 121 */     Ssec = myCal.get(13);
/* 122 */     int inSecondsFromMidnight = Ssec + 60 * Smin + 3600 * Shour24;
/* 123 */     return inSecondsFromMidnight;
/*     */   }
/*     */ 
/*     */   public static int getTime(int msec) {
/* 127 */     int inMSecondsFromMidnight = 0;
/* 128 */     myCal = new GregorianCalendar();
/* 129 */     Shour24 = myCal.get(11);
/* 130 */     Smin = myCal.get(12);
/* 131 */     Ssec = myCal.get(13);
/* 132 */     inMSecondsFromMidnight = Smsec + 1000 * (
/* 133 */       Ssec + 60 * Smin + 3600 * Shour24);
/* 134 */     return inMSecondsFromMidnight;
/*     */   }
/*     */ 
/*     */   public static String getTime(boolean withchars) {
/* 138 */     dateBuffer = new StringBuffer();
/* 139 */     myCal = new GregorianCalendar();
/* 140 */     Shour24 = myCal.get(11);
/* 141 */     Smin = myCal.get(12);
/* 142 */     Ssec = myCal.get(13);
/* 143 */     if (Shour24 < 10)
/* 144 */       dateBuffer.append("0");
/* 145 */     dateBuffer.append(Shour24);
/* 146 */     if (withchars) {
/* 147 */       dateBuffer.append(":");
/*     */     }
/* 149 */     if (Smin < 10)
/* 150 */       dateBuffer.append("0");
/* 151 */     dateBuffer.append(Smin);
/* 152 */     if (withchars) {
/* 153 */       dateBuffer.append(":");
/*     */     }
/* 155 */     if (Ssec < 10)
/* 156 */       dateBuffer.append("0");
/* 157 */     dateBuffer.append(Ssec);
/* 158 */     return dateBuffer.toString();
/*     */   }
/*     */ }

/* Location:           D:\WORK\jad\jars\MassAction_V2.jar
 * Qualified Name:     com.piaclient.util.DateThings
 * JD-Core Version:    0.6.0
 */