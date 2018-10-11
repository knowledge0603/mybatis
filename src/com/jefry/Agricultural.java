package com.jefry;

public class Agricultural {
	public String getXM_MC() {
		return XM_MC;
	}
	public void setXM_MC(String xM_MC) {
		XM_MC = xM_MC;
	}
	public String getXZQ_DM() {
		return XZQ_DM;
	}
	public void setXZQ_DM(String xZQ_DM) {
		XZQ_DM = xZQ_DM;
	}
	public String getGD_GUID() {
		return GD_GUID;
	}
	public void setGD_GUID(String gD_GUID) {
		GD_GUID = gD_GUID;
	}
	public String getZD_GUID() {
		return ZD_GUID;
	}
	public void setZD_GUID(String zD_GUID) {
		ZD_GUID = zD_GUID;
	}
	public String getTD_JB() {
		return TD_JB;
	}
	public void setTD_JB(String tD_JB) {
		TD_JB = tD_JB;
	}
	public String getBH() {
		return BH;
	}
	public void setBH(String bH) {
		BH = bH;
	}
	public String getGD_ZMJ() {
		return GD_ZMJ;
	}
	public void setGD_ZMJ(String gD_ZMJ) {
		GD_ZMJ = gD_ZMJ;
	}
	public String getXM_ZT() {
		return XM_ZT;
	}
	public void setXM_ZT(String xM_ZT) {
		XM_ZT = xM_ZT;
	}
	public String getPZ_RQ() {
		return PZ_RQ;
	}
	public void setPZ_RQ(String pZ_RQ) {
		PZ_RQ = pZ_RQ;
	}
	public String getTD_ZL() {
		return TD_ZL;
	}
	public void setTD_ZL(String tD_ZL) {
		TD_ZL = tD_ZL;
	}
	//项目名称
	private String 	XM_MC;
	//行政区
	private String 	XZQ_DM;
	//供地标识
	private String 	GD_GUID;
	//宗地标识
	private String 	ZD_GUID;
	//土地级别
	private String 	TD_JB;
	//合同编号
	private String 	BH;
	//总面积
	private String 	GD_ZMJ; 
	//状态
	private String 	XM_ZT;
	//批准日期
	private String 	PZ_RQ; 
	//土地坐落
	private String 	TD_ZL; 
	private String 	ROWNUM;
	public String getPZ_WH() {
		return PZ_WH;
	}
	public void setPZ_WH(String pZ_WH) {
		PZ_WH = pZ_WH;
	}
	public String getGY_MJ() {
		return GY_MJ;
	}
	public void setGY_MJ(String gY_MJ) {
		GY_MJ = gY_MJ;
	}
	//批准文号-->
	private String 	PZ_WH;
	//供应面积-->
	private String 	GY_MJ;

	public String getROWNUM() {
		return ROWNUM;
	}
	public void setROWNUM(String rOWNUM) {
		ROWNUM = rOWNUM;
	}
	//批准机关PZ_JG
	private String 	PZ_JG;
	public String getPZ_JG() {
		return PZ_JG;
	}
	public void setPZ_JG(String pZ_JG) {
		PZ_JG = pZ_JG;
	}
	//供应方式
	private String 	GY_FS;
	public String getGY_FS() {
		return GY_FS;
	}
	public void setGY_FS(String gY_FS) {
		GY_FS = gY_FS;
	}
	//宗地编号
	private String 	ZD_BH;
	public String getZD_BH() {
		return ZD_BH;
	}
	public void setZD_BH(String zD_BH) {
		ZD_BH = zD_BH;
	}
	private Allocatingland allocatingland;
	public Allocatingland getAllocatingland() {
		return allocatingland;
	}
	public void setAllocatingland(Allocatingland allocatingland) {
		this.allocatingland = allocatingland;
	}
	
}
