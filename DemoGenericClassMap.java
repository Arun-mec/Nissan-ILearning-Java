package com.nissan.app;

import java.util.HashMap;
import java.util.Map;

public class DemoGenericClassMap {
	
	public static void main(String[] args) {
		
		Map<Integer,String> mapHttpErrors = new HashMap<Integer,String>();
		 
		mapHttpErrors.put(404,"Not found");
		mapHttpErrors.put(405,"Method not allowed");
		mapHttpErrors.put(303,"See other");
		mapHttpErrors.put(500,"Internal server error");
		mapHttpErrors.put(200,"Success");
		
		System.out.println(mapHttpErrors.toString());
	}
}
