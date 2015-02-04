/*    */ package test;
/*    */ 
/*    */ import java.math.BigDecimal;
/*    */ 
/*    */ public class InputEntry
/*    */ {
/*    */   int type;
/*    */   BigDecimal fileSeqNo;
/*    */   BigDecimal entrySeqNo;
/*    */ 
/*    */   public int getType()
/*    */   {
/* 25 */     return this.type;
/*    */   }
/*    */ 
/*    */   public void setType(int type)
/*    */   {
/* 30 */     this.type = type;
/*    */   }
/*    */ 
/*    */   public BigDecimal getEntrySeqNo() {
/* 34 */     return this.entrySeqNo;
/*    */   }
/*    */ 
/*    */   public void setEntrySeqNo(BigDecimal entrySeqNo) {
/* 38 */     this.entrySeqNo = entrySeqNo;
/*    */   }
/*    */ 
/*    */   public BigDecimal getFileSeqNo() {
/* 42 */     return this.fileSeqNo;
/*    */   }
/*    */ 
/*    */   public void setFileSeqNo(BigDecimal fileSeqNo) {
/* 46 */     this.fileSeqNo = fileSeqNo;
/*    */   }
/*    */ }

/* Location:           D:\WORK\jad\jars\MassAction_V2.jar
 * Qualified Name:     com.ericsson.cac.massactiontool.datamodels.InputEntry
 * JD-Core Version:    0.6.0
 */