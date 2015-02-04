/*    */ package test;
/*    */ import java.util.Vector;
/*    */ 
/*    */ public class ContractTemplate
/*    */ {
/*    */   NvElementI rpcode;
/*    */   NvElementI co_id;
/*    */   NvElementI sccode;
/*    */   NvElementI plcode;
/*    */   NvElementI services;
/*    */   NvElementI subm_id;
/*    */   public Vector<TemplateServiceParameters> serviceParameters;
/*    */ 
/*    */   public Vector<TemplateServiceParameters> getServiceParameters()
/*    */   {
/* 29 */     return this.serviceParameters;
/*    */   }
/*    */ 
/*    */   public void setServiceParameters(Vector<TemplateServiceParameters> serviceParameters) {
/* 33 */     this.serviceParameters = serviceParameters;
/*    */   }
/*    */ 
/*    */   public NvElementI getCo_id() {
/* 37 */     return this.co_id;
/*    */   }
/*    */ 
/*    */   public void setCo_id(NvElementI co_id) {
/* 41 */     this.co_id = co_id;
/*    */   }
/*    */ 
/*    */   public NvElementI getPlcode() {
/* 45 */     return this.plcode;
/*    */   }
/*    */ 
/*    */   public void setPlcode(NvElementI plcode) {
/* 49 */     this.plcode = plcode;
/*    */   }
/*    */ 
/*    */   public NvElementI getRpcode() {
/* 53 */     return this.rpcode;
/*    */   }
/*    */ 
/*    */   public void setRpcode(NvElementI rpcode) {
/* 57 */     this.rpcode = rpcode;
/*    */   }
/*    */ 
/*    */   public NvElementI getSccode() {
/* 61 */     return this.sccode;
/*    */   }
/*    */ 
/*    */   public void setSccode(NvElementI sccode) {
/* 65 */     this.sccode = sccode;
/*    */   }
/*    */ 
/*    */   public NvElementI getServices()
/*    */   {
/* 70 */     return this.services;
/*    */   }
/*    */ 
/*    */   public void setServices(NvElementI services) {
/* 74 */     this.services = services;
/*    */   }
/*    */ 
/*    */   public NvElementI getSubm_id() {
/* 78 */     return this.subm_id;
/*    */   }
/*    */ 
/*    */   public void setSubm_id(NvElementI subm_id) {
/* 82 */     this.subm_id = subm_id;
/*    */   }
/*    */ }

/* Location:           D:\WORK\jad\jars\MassAction_V2.jar
 * Qualified Name:     com.ericsson.cac.massactiontool.datamodels.ContractTemplate
 * JD-Core Version:    0.6.0
 */