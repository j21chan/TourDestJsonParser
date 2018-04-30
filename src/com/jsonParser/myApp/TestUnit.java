package com.jsonParser.myApp;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class TestUnit {

	public static void main(String[] args) throws IOException, ParseException {
		
		// 지역 코드
//		JsonParserTest.parseAreaCode(UrlRequest.urlRequest(UrlBuilder.areaCodeURLBuild()));
		
		// 시군구 코드
//		JsonParserTest.parseAreaCode(UrlRequest.urlRequest(UrlBuilder.sigunguCodeURLBuild("")));
		
		// 전체 분류 코드
//		JsonParserTest.parseCategoryCode(UrlRequest.urlRequest(UrlBuilder.allCategoryCodeURLBuild()));
		
		// 대분류 코드
//		JsonParserTest.parseCategoryCode(UrlRequest.urlRequest(UrlBuilder.categoryCode1URLBuild(12)));
		
		// 중분류 코드
//		JsonParserTest.parseCategoryCode(UrlRequest.urlRequest(UrlBuilder.categoryCode2URLBuild(12, "A01")));
		
		// 소분류 코드
//		JsonParserTest.parseCategoryCode(UrlRequest.urlRequest(UrlBuilder.categoryCode3URLBuild("", "", "")));
		
		// 지역 기반 리스트 코드
		// (String numOfRows, String pageNo, String arrange, String contentTypeId, String areaCode, String sigunguCode, String cat1, String cat2, String cat3)
//		JsonParserTest.parseAreaBasedList((UrlRequest.urlRequest(UrlBuilder.areaBasedListURLBuild("10", "1", "A", "", "1", "", "", "", ""))));
		
		// 위치 기반 리스트 코드
//		 (String numOfRows, String pageNo, String arrange, String contentTypeId, String mapX, String mapY, String radius)
//		JsonParserTest.parselocationBasedList((UrlRequest.urlRequest(UrlBuilder.locationBasedListURLBuild("10", "1", "A", "", "126.98277381966591", "37.55748885427912", "2000"))));
		
		// 키워드 기반 검색 코드
		// (String numOfRows, String pageNo, String arrange, String contentTypeId, String keyword, String areaCode, String sigunguCode, String cat1, String cat2, String cat3)
//		JsonParserTest.parseAreaBasedList((UrlRequest.urlRequest(UrlBuilder.searchKeywordURLBuild("10", "1", "A", "", "고궁", "", "", "", "", ""))));
		
		// 행사 날짜 검색 코드
		// (String numOfRows, String pageNo, String arrange, String eventStartDate, String eventEndDate, String areaCode, String sigunguCode)
//		JsonParserTest.parseSearchFestival((UrlRequest.urlRequest(UrlBuilder.searchFestivalURLBuild("10", "1", "A", "20180202", "20180430", "", ""))));
		
		// 베니키아, 굿스테이, 한옥 검색 코드
		// (String numOfRows, String pageNo, String arrange, String hanOk, String benikia, String goodStay, String areaCode, String sigunguCode)
//		JsonParserTest.parseSearchStay((UrlRequest.urlRequest(UrlBuilder.searchStayURLBuild("10", "1", "A", "", "", "1", "", ""))));
		
		// 디테일 검색 코드
		//(String contentId, String contentTypeId, String defaultYN, String firstImageYN, String areacodeYN, String catcodeYN, String addrinfoYN, String mapinfoYN, String overviewYN)
//		JsonParserTest.parseDetailCommon((UrlRequest.urlRequest(UrlBuilder.detailCommonURLBuild("126508", "", "", "", "", "", "", "", ""))));
		
		// 소개정보 조회 코드
		// (String contentId, String contentTypeId, String introYN)
//		JsonParserTest.parseDetailIntro((UrlRequest.urlRequest(UrlBuilder.detailIntroURLBuild("2516988", "39", "Y"))));
		
	}
}