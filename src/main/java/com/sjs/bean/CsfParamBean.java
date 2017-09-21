package com.sjs.bean;

import java.util.Map;

public class CsfParamBean {

	private String serviceCode;
	private String jsonParam;
	private Map mapParam;
	private Map sysParam;

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getJsonParam() {
		return jsonParam;
	}

	public void setJsonParam(String jsonParam) {
		this.jsonParam = jsonParam;
	}

	public Map getMapParam() {
		return mapParam;
	}

	public void setMapParam(Map mapParam) {
		this.mapParam = mapParam;
	}

	public Map getSysParam() {
		return sysParam;
	}

	public void setSysParam(Map sysParam) {
		this.sysParam = sysParam;
	}

}
