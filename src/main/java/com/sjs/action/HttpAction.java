package com.sjs.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.sjs.utils.JsonUtils;

import redis.clients.jedis.JedisCluster;

public class HttpAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private JedisCluster cluster;
	
	public String index() {
		try {
			super.getRequest().setAttribute("initMsg", "hello JSP");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	

	public String execute() {
		String result = "";
		try {
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", "alice");
			map.put("age", "21");
			result = super.getResponseBody(JsonUtils.mapToJson(map));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String set() {
		String result = "";
		try {
			Map<String, String> map = new HashMap<String, String>();
			map.put("method", "set");
			cluster.set("name", "bigbin");
			result = super.getResponseBody(JsonUtils.mapToJson(map));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String get() {
		String result = "";
		try {
			Map<String, String> map = new HashMap<String, String>();
			map.put("method", "get");
			map.put("name", cluster.get("name"));
			result = super.getResponseBody(JsonUtils.mapToJson(map));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
