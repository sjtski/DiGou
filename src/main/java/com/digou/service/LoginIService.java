package com.digou.service;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

public interface LoginIService {
	
	public Map<String, Object> loginCheck(HttpServletResponse response, String userName, String password);
}