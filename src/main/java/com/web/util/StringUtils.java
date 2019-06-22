package com.web.util;

public class StringUtils {
	
	public static String appender(String a ,String b) {
		return new StringBuffer().append(a).append(b).toString();
	}
	
	public static void errorCode(String val) throws Exception{
		System.out.println(val.length());
		
	}
	
	public static void main(String [] args) {
		String a = "Vikas";
		String b  = "Menon";
		String result = StringUtils.appender(a, b);
		try {
			StringUtils.errorCode(null);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
