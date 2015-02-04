/*     */ package test;
/*     */ 

/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import java.util.Hashtable;
/*     */ 
/*     */ public class DBConnection
/*     */ {
/*  27 */   private static Connection conn = null;
/*     */ 
/*  29 */   private static Hashtable<String, String> DBParameters = MassConfig.getDBParameters();
/*     */ 
/*  31 */   private static String userName = (String)DBParameters.get("DatabaseUserName");
/*  32 */   private static String password = (String)DBParameters.get("DatabasePassword");
/*     */ 
/*  36 */   private static String connString = (String)DBParameters.get("ConnectionString");
/*     */ 
/*     */   public synchronized Connection connect()
/*     */   {
/*     */     try
/*     */     {
/*  42 */       Class.forName("oracle.jdbc.driver.OracleDriver");
/*     */ 
/*  47 */       conn = DriverManager.getConnection(connString, userName, password);
/*     */     } catch (Exception e) {
/*  49 */       LogToMem.write_to_log(
/*  50 */         2, 
/*  51 */         "in DBConnection, got an exception: " + 
/*  52 */         e.getMessage() + 
/*  53 */         LogToMem.prepStackTrace(e.getStackTrace()));
/*     */     }
/*  55 */     return conn;
/*     */   }
/*     */ 
/*     */   public synchronized boolean isConnected(Connection conn) {
/*  59 */     boolean connStatus = true;
/*     */     try {
/*  61 */       if ((conn == null) || (conn.isClosed()))
/*  62 */         connStatus = false;
/*     */     }
/*     */     catch (SQLException e) {
/*  65 */       LogToMem.write_to_log(
/*  66 */         2, 
/*  67 */         "in isConnected: " + 
/*  68 */         e.getMessage() + 
/*  69 */         LogToMem.prepStackTrace(e.getStackTrace()));
/*     */     }
/*     */ 
/*  72 */     return connStatus;
/*     */   }
/*     */ 
/*     */   public synchronized void rollback(String method) {
/*     */     try {
/*  77 */       conn.rollback();
/*  78 */       LogToMem.write_to_log(0, "in " + method + 
/*  79 */         "rolling back...");
/*     */     } catch (SQLException e) {
/*  81 */       LogToMem.write_to_log(2, "in " + method + 
/*  82 */         " failed to load Entries..." + e.getMessage() + " " + 
/*  83 */         LogToMem.prepStackTrace(e.getStackTrace()));
/*     */     }
/*     */   }
/*     */ 
/*     */   public synchronized void closeConnection(String prfx) {
/*  88 */     if (conn != null)
/*     */       try {
/*  90 */         conn.close();
/*  91 */         LogToMem.write_to_log(0, prfx + 
/*  92 */           "connection to database has been closed");
/*     */       } catch (SQLException ex) {
/*  94 */         LogToMem.write_to_log(
/*  95 */           2, 
/*  96 */           "in closeConnection, Failed to disconnect from Database " + 
/*  97 */           ex.getMessage() + 
/*  98 */           LogToMem.prepStackTrace(ex.getStackTrace()));
/*     */       }
/*     */   }
/*     */ 
/*     */   public synchronized void closePreparedStmt(PreparedStatement p)
/*     */   {
/*     */     try {
/* 105 */       if (p != null) {
/* 106 */         p.close();
/*     */       }
/* 108 */       p = null;
/*     */     } catch (SQLException e) {
/* 110 */       LogToMem.write_to_log(
/* 111 */         2, 
/* 112 */         "in closePreparedStmt" + e.getMessage() + " " + 
/* 113 */         LogToMem.prepStackTrace(e.getStackTrace()));
/*     */     }
/*     */   }
/*     */ 
/*     */   public synchronized void closeStmt(Statement s) {
/*     */     try {
/* 119 */       if (s != null) {
/* 120 */         s.close();
/*     */       }
/* 122 */       s = null;
/*     */     } catch (SQLException e) {
/* 124 */       LogToMem.write_to_log(
/* 125 */         2, 
/* 126 */         "in closeStmt" + e.getMessage() + " " + 
/* 127 */         LogToMem.prepStackTrace(e.getStackTrace()));
/*     */     }
/*     */   }
/*     */ 
/*     */   public synchronized void closeResultSet(ResultSet s)
/*     */   {
/*     */     try {
/* 134 */       if (s != null) {
/* 135 */         s.close();
/*     */       }
/* 137 */       s = null;
/*     */     } catch (SQLException e) {
/* 139 */       LogToMem.write_to_log(
/* 140 */         2, 
/* 141 */         "in closeResultSet" + e.getMessage() + " " + 
/* 142 */         LogToMem.prepStackTrace(e.getStackTrace()));
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\WORK\jad\jars\MassAction_V2.jar
 * Qualified Name:     com.piaclient.massactiontool.control.DBConnection
 * JD-Core Version:    0.6.0
 */