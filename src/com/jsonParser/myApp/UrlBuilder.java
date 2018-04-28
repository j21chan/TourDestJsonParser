package com.jsonParser.myApp;

import java.io.UnsupportedEncodingException;

/*
 * 매개변수: URL을 만드는데 필요한 코드
 * 메소드명: 요청하는 값에 대한 이름
 * 반환값  : JSON 형식인 String
 * 
 * 순서: UrlBuilder -----> UrlRequest ----> JsonParserTest
 */

public class UrlBuilder {
	
	// TourAPI에서 제공하는 ServiceKey
	private final static String serviceKey = "lXD74EVz%2B%2BsN6Umj%2FTEiUwe6SrhDlt6EJDw3EiP%2FaQ37jdWZzn2jcv0uMBf90xaYQU2taH9P2nEyEAiiS5mQrw%3D%3D";
	
	// TourAPI에서 반환하는 객체 타입 정하기
	private final static String type = "json";
	
	// 모바일 OS 설정
//	private final static String mobileOS = "ETC";
	
	// 앱 이름
//	private final static String mobileApp = "AppTest";
	
	// === 지역 코드 URL ===
	// 지역코드를 요청하는 URL Build 메소드
	public static String areaCodeURLBuild () throws UnsupportedEncodingException {		
		String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaCode" + "?ServiceKey=" + serviceKey +
																							  "&MobileOS=ETC" +
																							  "&MobileApp=AppTest" +
																							  "&_type=" + type;
		return url;
	}
	
	// 시군구 코드를 요청하는 URL Build 메소드
	public static String sigunguCodeURLBuild (String numOfRows, String pageNo, String areaCode) throws UnsupportedEncodingException {		
		String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaCode" + "?ServiceKey=" + serviceKey +
																							  "&numOfRows=" + numOfRows +
																							  "&pageNo=" + pageNo +
																							  "&MobileOS=ETC" +
																							  "&MobileApp=AppTest" +
																							  "&areaCode=" + areaCode +
																							  "&_type=" + type;		
		System.out.println(url);
		return url;
	}
	
	
	// === 서비스 분류 코드 (cat1, cat2, cat3) URL ===
	// 서비스 분류코드 : 대분류 전체 코드를 조회하는 URL Build 메소드
	public static String allCategoryCodeURLBuild () throws UnsupportedEncodingException {		
		String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/categoryCode" + "?ServiceKey=" + serviceKey +
																								  "&MobileOS=ETC" +
																								  "&MobileApp=AppTest" +
																								  "&_type=" + type;		
		System.out.println(url);
		return url;
	}
	
	// 서비스 분류코드 : 관광코드의 타입에 따라서 대분류 코드를 조회하는 URL Build 메소드
	public static String categoryCode1URLBuild (String numOfRows, String pageNo, String contentTypeId) throws UnsupportedEncodingException {		
		String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/categoryCode" + "?ServiceKey=" + serviceKey +
																								  "&numOfRows=" + numOfRows +
																								  "&pageNo=" + pageNo +
																								  "&MobileOS=ETC" +
																								  "&MobileApp=AppTest" +
																								  "&contentTypeId=" + contentTypeId +
																								  "&_type=" + type;		
		System.out.println(url);
		return url;
	}
	
	// 서비스 분류코드 : 관광코드의 타입과 대분류에 따라서 중분류 코드를 조회하는 URL Build 메소드
	public static String categoryCode2URLBuild (String numOfRows, String pageNo, int contentTypeId, String cat1) throws UnsupportedEncodingException {		
		String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/categoryCode" + "?ServiceKey=" + serviceKey +
																								  "&numOfRows=" + numOfRows +
																								  "&pageNo=" + pageNo + 
																								  "&MobileOS=ETC" + 
																								  "&MobileApp=AppTest" +
																								  "&contentTypeId=" + contentTypeId +
																								  "&cat1=" + cat1 +
																								  "&_type=" + type;		
		System.out.println(url);
		return url;
	}
	
	// 서비스 분류코드 : 관광코드의 타입과 대분류, 중분류에 따라서 소분류 코드를 조회하는 URL Build 메소드
	public static String categoryCode3URLBuild (String numOfRows, String pageNo, String contentTypeId, String cat1, String cat2) throws UnsupportedEncodingException {		
		String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/categoryCode" + "?ServiceKey=" + serviceKey +
																								  "&numOfRows=" + numOfRows +
																								  "&pageNo=" + pageNo +
																								  "&MobileOS=ETC" +
																								  "&MobileApp=AppTest" +
																								  "&contentTypeId=" + contentTypeId +
																								  "&cat1=" + cat1 +
																								  "&cat2=" + cat2 +
																								  "&_type=" + type;		
		System.out.println(url);
		return url;
	}
	
	// === 지역 기반 관광정보 조회 URL  ===
	// 지역기반 관광정보 조회 : 지역코드를 기반으로 관광지 정보를 조회하는 URL Build 메소드
	public static String areaBasedListURLBuild (String numOfRows, String pageNo, String arrange, String contentTypeId, String areaCode, String sigunguCode, String cat1, String cat2, String cat3) throws UnsupportedEncodingException {		
		String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList" + "?ServiceKey=" + serviceKey +
																								   "&numOfRows=" + numOfRows + 
																								   "&pageNo=" + pageNo + 
																								   "&arrange=" + arrange +
																								   "&listYN=Y" +
																								   "&MobileOS=ETC" + 
																								   "&MobileApp=AppTest" + 
																								   "&contentTypeId=" + contentTypeId +
																								   "&areaCode=" + areaCode +
																								   "&sigunguCode=" + sigunguCode +
																								   "&cat1=" + cat1 + 
																								   "&cat2=" + cat2 + 
																								   "&cat3=" + cat3 +
																								   "&_type=" + type;		
		System.out.println(url);
		return url;
	}
	
	
	// === 위치 기반 관광정보 조회 URL  ===
	// 위치 기반 관광정보 조회 : 위치 기반으로 관광지 정보를 조회하는 URL Build 메소드
	public static String locationBasedListURLBuild (String numOfRows, String pageNo, String arrange, String contentTypeId, String mapX, String mapY, String radius) throws UnsupportedEncodingException {		
		String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/locationBasedList" + "?ServiceKey=" + serviceKey +
																									   "&numOfRows=" + numOfRows + 
																									   "&pageNo=" + pageNo + 
																									   "&arrange=" + arrange +
																									   "&listYN=Y" +
																									   "&MobileOS=ETC" + 
																									   "&MobileApp=AppTest" + 
																									   "&contentTypeId=" + contentTypeId +
																									   "&mapX=" + mapX +
																									   "&mapY=" + mapY +
																									   "&radius=" + radius +
																									   "&_type=" + type;		
		System.out.println(url);
		return url;
	}
	
	// === 키워드 검색 관광정보 조회 URL  ===
	// 키워드 검색 관광정보 조회 : 위치 기반으로 관광지 정보를 조회하는 URL Build 메소드
	public static String locationBasedListURLBuild (String numOfRows, String pageNo, String arrange, String contentTypeId, String mapX, String mapY, String radius) throws UnsupportedEncodingException {		
		String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/locationBasedList" + "?ServiceKey=" + serviceKey +
																									   "&numOfRows=" + numOfRows + 
																									   "&pageNo=" + pageNo + 
																									   "&arrange=" + arrange +
																									   "&listYN=Y" +
																									   "&MobileOS=ETC" + 
																									   "&MobileApp=AppTest" + 
																									   "&contentTypeId=" + contentTypeId +
																									   "&mapX=" + mapX +
																									   "&mapY=" + mapY +
																									   "&radius=" + radius +
																									   "&_type=" + type;		
		System.out.println(url);
		return url;
	}
}