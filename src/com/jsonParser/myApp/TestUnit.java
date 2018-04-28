package com.jsonParser.myApp;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class TestUnit {

	public static void main(String[] args) throws IOException, ParseException {
		
//		// 지역 코드
//		JsonParserTest.parseAreaCode(UrlRequest.urlRequest(UrlBuilder.areaCodeURLBuild()));
//		
		// 시군구 코드
//		JsonParserTest.parseAreaCode(UrlRequest.urlRequest(UrlBuilder.sigunguCodeURLBuild("")));
//		
//		// 전체 분류 코드
//		JsonParserTest.parseCategoryCode(UrlRequest.urlRequest(UrlBuilder.allCategoryCodeURLBuild()));
//		
//		// 대분류 코드
//		JsonParserTest.parseCategoryCode(UrlRequest.urlRequest(UrlBuilder.categoryCode1URLBuild(12)));
//		
//		// 중분류 코드
//		JsonParserTest.parseCategoryCode(UrlRequest.urlRequest(UrlBuilder.categoryCode2URLBuild(12, "A01")));
		
		// 소분류 코드
//		JsonParserTest.parseCategoryCode(UrlRequest.urlRequest(UrlBuilder.categoryCode3URLBuild("", "", "")));
		
		// 지역 기반 리스트 코드
		// (String numOfRows, String pageNo, String arrange, String contentTypeId, String areaCode, String sigunguCode, String cat1, String cat2, String cat3)
//		JsonParserTest.parseAreaBasedList((UrlRequest.urlRequest(UrlBuilder.areaBasedListURLBuild("10", "1", "A", "", "1", "", "", "", ""))));
		
		// 위치 기반 리스트 코드
		// (String numOfRows, String pageNo, String arrange, String contentTypeId, String mapX, String mapY, String radius)
//		JsonParserTest.parselocationBasedList((UrlRequest.urlRequest(UrlBuilder.locationBasedListURLBuild("10", "1", "A", "", "126.98277381966591", "37.55748885427912", "2000"))));
	}
}