package com.ska.sms.model;

import com.ska.sms.util.ConstantField;

public class Response {

	private String SUCCESS = "success";
	private Integer STATUS = ConstantField.STATUS_200;
	private String SUCESS_MSG = "";
	private String ERROR_MSG = "";
	private String ERROR_CODE = "";
	//private String MODAL_MSG = "";
	
	private Object PAYLOAD;
	
	public Response() {}

	

	public Response(String sUCCESS, Integer sTATUS, String sUCESS_MSG, String eRROR_MSG, String eRROR_CODE,
			Object pAYLOAD) {
		super();
		SUCCESS = sUCCESS;
		STATUS = sTATUS;
		SUCESS_MSG = sUCESS_MSG;
		ERROR_MSG = eRROR_MSG;
		ERROR_CODE = eRROR_CODE;
		PAYLOAD = pAYLOAD;
	}



	public String getSUCCESS() {
		return SUCCESS;
	}

	public void setSUCCESS(String sUCCESS) {
		SUCCESS = sUCCESS;
	}

	public Integer getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(Integer sTATUS) {
		STATUS = sTATUS;
	}

	public String getERROR_MSG() {
		return ERROR_MSG;
	}

	public void setERROR_MSG(String eRROR_MSG) {
		ERROR_MSG = eRROR_MSG;
	}

	public String getERROR_CODE() {
		return ERROR_CODE;
	}

	public void setERROR_CODE(String eRROR_CODE) {
		ERROR_CODE = eRROR_CODE;
	}

	public Object getPAYLOAD() {
		return PAYLOAD;
	}

	public void setPAYLOAD(Object pAYLOAD) {
		PAYLOAD = pAYLOAD;
	}
	
	public String getSUCESS_MSG() {
		return SUCESS_MSG;
	}

	public void setSUCESS_MSG(String sUCESS_MSG) {
		SUCESS_MSG = sUCESS_MSG;
	}



	@Override
	public String toString() {
		return "Response [SUCCESS=" + SUCCESS + ", STATUS=" + STATUS + ", SUCESS_MSG=" + SUCESS_MSG + ", ERROR_MSG="
				+ ERROR_MSG + ", ERROR_CODE=" + ERROR_CODE + ", PAYLOAD=" + PAYLOAD + "]";
	}

}
