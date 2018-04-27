package com.jsonParser.myApp;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlBuilder {
	
	// TourAPI에서 제공하는 ServiceKey
	private final static String serviceKey = "lXD74EVz%2B%2BsN6Umj%2FTEiUwe6SrhDlt6EJDw3EiP%2FaQ37jdWZzn2jcv0uMBf90xaYQU2taH9P2nEyEAiiS5mQrw%3D%3D";
	
	// TourAPI에서 반환하는 객체 타입 정하기
	private final static String type = "json";
	
	// AreaCode를 요청하는 URL Build 메소드
	public static String areaCodeURLBuild () throws UnsupportedEncodingException {		
		String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaCode" + "?ServiceKey=" + serviceKey + "&MobileOS=ETC" + "&MobileApp=AppTest" + "&_type=" + type;
		return url;
	}
	
	// sigunguCode를 요청하는 URL Build 메소드
	public static String sigunguCodeURLBuild (int areaCode) throws UnsupportedEncodingException {		
		String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaCode" + "?ServiceKey=" + serviceKey + "&areaCode="+ areaCode + "&numOfRows=10" + "&pageNo=1" + "&MobileOS=ETC" + "&MobileApp=AppTest" + "&_type=" + type;		
		System.out.println(url);
		return url;
	}
}