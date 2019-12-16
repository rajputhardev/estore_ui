/*package com.poc.estore.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DataSourceIntercetor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String contextPath = request.getServletContext().getContextPath();

		String prefixPublisher = contextPath + "/publisher";
		String prefixAdvertiser = contextPath + "/advertiser";

		String uri = request.getRequestURI();
		System.out.println("URI:"+ uri);
	
		if(uri.startsWith(prefixPublisher)) {
			request.setAttribute("keyDS", "PUBLISHER_DS");
		}
		else if(uri.startsWith(prefixAdvertiser)) {
			request.setAttribute("keyDS", "ADVERTISER_DS");
			}
		return true;
		}
}*/