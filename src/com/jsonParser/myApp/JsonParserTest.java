package com.jsonParser.myApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParserTest {
	
	// AreaBasedList URL에서 나온 JSON을 파싱해주는 메소드
	public static void parseAreaBasedListURL (String stringURL) throws IOException, ParseException {
		
		// TourAPI로 보낼 URL
        URL url = new URL("http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList?ServiceKey=lXD74EVz%2B%2BsN6Umj%2FTEiUwe6SrhDlt6EJDw3EiP%2FaQ37jdWZzn2jcv0uMBf90xaYQU2taH9P2nEyEAiiS5mQrw%3D%3D&contentTypeId=12&areaCode=1&sigunguCode=&cat1=A02&cat2=A0203&cat3=A02030400&listYN=Y&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&arrange=A&numOfRows=12&pageNo=1&_type=json");

		//URL url = new URL(stringURL);
		
        // HttpURLConnection 연결
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
        // http 연결 설정을 GET 방식으로 하고 json으로 가져옴
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        
        // Response 코드 출력
        System.out.println("Response code: " + conn.getResponseCode() + "\n");
        
        // BufferReader 객체 생성
        BufferedReader rd;
        
        // Response 코드가 200 이상이거나 300 이하일 때
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        
        
        // String Builder 객체 생성
        StringBuilder sb = new StringBuilder();
        String line;
        
        // 데이터를 읽어와서 붙힘
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        
        
        // 사용한 객체들 자원 반납
        rd.close();
        conn.disconnect();
        
        
        // JSON 객체 출력
        System.out.println("******** Tour API에서 받아온 JSON ********");
        System.out.println(sb.toString() + "\n");
        
        // Tour API에서 가져온 JSON 파일 
        String destJson = sb.toString();
                
        // JSON Parser 객체 만들기
        JSONParser parser = new JSONParser();
        
        // TourAPI에서 받은 Json 파일을 obj로 받기
        Object obj = parser.parse(destJson);
                
        // Object에서 JSON으로 Type Casting
        JSONObject jsonObj = (JSONObject) obj;
                
        // Json response value
        JSONObject jsonResponse = (JSONObject) jsonObj.get("response");
                
        // json body value
        JSONObject jsonBody = (JSONObject) jsonResponse.get("body");
        
        // num Of rows
        int numOfRows = Integer.parseInt(jsonBody.get("numOfRows").toString());
        
        // pageNo
        int pageNo = Integer.parseInt(jsonBody.get("pageNo").toString());
        
        System.out.println("관광지 개수 : " + numOfRows + " 개");
        System.out.println("페이지 : " + pageNo + "\n");
        
        // json items value
        JSONObject jsonItems = (JSONObject) jsonBody.get("items");
        
        // jsonArray item value
        JSONArray jsonItemArray = (JSONArray) jsonItems.get("item");
        
        
        // items json array에 담긴 각 json 오브젝트를 빼오는 작업
        System.out.println("******** JSON Parser를 이용해서 파싱 ********" + "\n");
        for (int i = 0; i < jsonItemArray.size(); i++) {
        	
        	// 임시 json 객체
        	JSONObject temp = (JSONObject) jsonItemArray.get(i);
        	
        	// 각 Json 값에 대해서 값이 null이 아니면 값을 String으로 파싱해서 넣고 null이면 null 값을 넣는다.
        	String addr1 = 			temp.get("addr1") != null ? 		temp.get("addr1").toString() : null;
        	String addr2 = 			temp.get("addr2") != null ? 		temp.get("addr2").toString() : null;
        	int areacode = 			temp.get("areacode") != null ? 		Integer.parseInt(temp.get("areacode").toString()) : null;
        	String cat1 = 			temp.get("cat1") != null ? 			temp.get("cat1").toString() : null;
        	String cat2 = 			temp.get("cat2") != null ? 			temp.get("cat2").toString() : null;
        	String cat3 =		    temp.get("cat3") != null ? 			temp.get("cat3").toString() : null;
        	int contentid = 		temp.get("contentid") != null ? 	Integer.parseInt(temp.get("contentid").toString()) : null;
        	int contenttypeid = 	temp.get("contenttypeid") != null ? Integer.parseInt(temp.get("contenttypeid").toString()) : null;
        	String createdtime = 	temp.get("createdtime") != null ? 	temp.get("createdtime").toString() : null;
        	String firstimage = 	temp.get("firstimage") != null ? 	temp.get("firstimage").toString() : null;
        	String firstimage2 = 	temp.get("firstimage2") != null ? 	temp.get("firstimage2").toString() : null;
        	double mapx = 			temp.get("mapx") != null ? 			Double.parseDouble(temp.get("mapx").toString()) : null;
        	double mapy = 			temp.get("mapy") != null ? 			Double.parseDouble(temp.get("mapy").toString()) : null;
        	String mlevel = 		temp.get("mlevle") != null ? 		temp.get("mlevel").toString() : null;
        	String modifiedtime = 	temp.get("modifiedtime") != null ? 	temp.get("modifiedtime").toString() : null;
        	int readcount = 		temp.get("readcount") != null ? 	Integer.parseInt(temp.get("readcount").toString()) : null;
        	int sigungucode = 		temp.get("sigungucode") != null ? 	Integer.parseInt(temp.get("sigungucode").toString()) : null;
        	String tel = 			temp.get("tel") != null ? 			temp.get("tel").toString() : null;
        	String title = 			temp.get("title") != null ? 		temp.get("title").toString() : null;
        	String zipcode = 		temp.get("zipcode") != null ? 		temp.get("zipcode").toString() : null;
        	
        	// 각 값에 대해서 출력을 한다.
        	System.out.println("------------ " + (i + 1) + "번째 인덱스 값 ------------");
        	System.out.println("addr1 : " + addr1);
        	System.out.println("addr2 : " + addr2);
        	System.out.println("areacode : " + areacode);
        	System.out.println("cat1 : " + cat1);
        	System.out.println("cat2 : " + cat2);
        	System.out.println("cat3 : " + cat3);
        	System.out.println("contentid : " + contentid);
        	System.out.println("contenttypeid : " + contenttypeid);
        	System.out.println("createdtime : " + createdtime);
        	System.out.println("firstimage : " + firstimage);
        	System.out.println("firstimage2 : " + firstimage2);
        	System.out.println("mapx : " + mapx);
        	System.out.println("mapy : " + mapy);
        	System.out.println("mlevel : " + mlevel);
        	System.out.println("modifiedtime : " + modifiedtime);
        	System.out.println("readcount : " + readcount);
        	System.out.println("sigungucode : " + sigungucode);
        	System.out.println("tel : " + tel);
        	System.out.println("title : " + title);
        	System.out.println("zipcode : " + zipcode);
        	System.out.println("");
        }
	}
	
	
	// AreaCode URL에서 나온 JSON을 파싱해주는 메소드
	public static void parseAreaCodeURL (String stringURL) throws IOException, ParseException {
		
		// TourAPI로 보낼 URL        
		URL url = new URL(stringURL);
		
        // HttpURLConnection 연결
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
        // http 연결 설정을 GET 방식으로 하고 json으로 가져옴
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        
        // Response 코드 출력
        System.out.println("Response code: " + conn.getResponseCode() + "\n");
        
        // BufferReader 객체 생성
        BufferedReader rd;
        
        // Response 코드가 200 이상이거나 300 이하일 때
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        
        // String Builder 객체 생성
        StringBuilder sb = new StringBuilder();
        String line;
        
        // 데이터를 읽어와서 붙힘
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        
        // 사용한 객체들 자원 반납
        rd.close();
        conn.disconnect();
        
        // JSON 객체 출력
        System.out.println("******** Tour API에서 받아온 JSON ********");
        System.out.println(sb.toString() + "\n");
        
        // Tour API에서 가져온 JSON 파일 
        String destJson = sb.toString();
                
        // JSON Parser 객체 만들기
        JSONParser parser = new JSONParser();
        
        // TourAPI에서 받은 Json 파일을 obj로 받기
        Object obj = parser.parse(destJson);
                
        // Object에서 JSON으로 Type Casting
        JSONObject jsonObj = (JSONObject) obj;
                
        // Json response value
        JSONObject jsonResponse = (JSONObject) jsonObj.get("response");
                
        // json body value
        JSONObject jsonBody = (JSONObject) jsonResponse.get("body");
        
        // num Of rows
        int numOfRows = Integer.parseInt(jsonBody.get("numOfRows").toString());
        
        // pageNo
        int pageNo = Integer.parseInt(jsonBody.get("pageNo").toString());
        System.out.println("******** Response 기본 정보 ********");
        System.out.println("관광지 개수 : " + numOfRows + " 개");
        System.out.println("페이지 : " + pageNo + "\n");
        
        // json items value
        JSONObject jsonItems = (JSONObject) jsonBody.get("items");
        
        // jsonArray item value
        JSONArray jsonItemArray = (JSONArray) jsonItems.get("item");
        
        // items json array에 담긴 각 json 오브젝트를 빼오는 작업
        System.out.println("******** JSON Parser를 이용해서 파싱 ********");
        for (int i = 0; i < jsonItemArray.size(); i++) {
        	
        	// 임시 json 객체
        	JSONObject temp = (JSONObject) jsonItemArray.get(i);
        	
        	// 각 Json 값에 대해서 값이 null이 아니면 값을 String으로 파싱해서 넣고 null이면 null 값을 넣는다.
        	int code = 		temp.get("code") != null ? Integer.parseInt(temp.get("code").toString()) : null;
        	String name = 	temp.get("name") != null ? temp.get("name").toString() : null;
        	int rnum = 		temp.get("rnum") != null ? Integer.parseInt(temp.get("rnum").toString()) : null;
        	
        	// 각 값에 대해서 출력을 한다.
        	System.out.println("------------ " + (i + 1) + "번째 인덱스 값 ------------");
        	System.out.println("code : " + code);
        	System.out.println("name : " + name);
        	System.out.println("rnum : " + rnum);
        	System.out.println("");
        }
	}
	
	
	public static void parseSigunguCodeURL (String stringURL) throws IOException, ParseException {
		
		// TourAPI로 보낼 URL        
		URL url = new URL(stringURL);
		
        // HttpURLConnection 연결
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
        // http 연결 설정을 GET 방식으로 하고 json으로 가져옴
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        
        // Response 코드 출력
        System.out.println("Response code: " + conn.getResponseCode() + "\n");
        
        // BufferReader 객체 생성
        BufferedReader rd;
        
        // Response 코드가 200 이상이거나 300 이하일 때
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        
        // String Builder 객체 생성
        StringBuilder sb = new StringBuilder();
        String line;
        
        // 데이터를 읽어와서 붙힘
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        
        // 사용한 객체들 자원 반납
        rd.close();
        conn.disconnect();
        
        // JSON 객체 출력
        System.out.println("******** Tour API에서 받아온 JSON ********");
        System.out.println(sb.toString() + "\n");
        
        // Tour API에서 가져온 JSON 파일 
        String destJson = sb.toString();
                
        // JSON Parser 객체 만들기
        JSONParser parser = new JSONParser();
        
        // TourAPI에서 받은 Json 파일을 obj로 받기
        Object obj = parser.parse(destJson);
                
        // Object에서 JSON으로 Type Casting
        JSONObject jsonObj = (JSONObject) obj;
                
        // Json response value
        JSONObject jsonResponse = (JSONObject) jsonObj.get("response");
                
        // json body value
        JSONObject jsonBody = (JSONObject) jsonResponse.get("body");
        
        // num Of rows
        int numOfRows = Integer.parseInt(jsonBody.get("numOfRows").toString());
        
        // pageNo
        int pageNo = Integer.parseInt(jsonBody.get("pageNo").toString());
        System.out.println("******** Response 기본 정보 ********");
        System.out.println("관광지 개수 : " + numOfRows + " 개");
        System.out.println("페이지 : " + pageNo + "\n");
        
        // json items value
        JSONObject jsonItems = (JSONObject) jsonBody.get("items");
        
        // jsonArray item value
        JSONArray jsonItemArray = (JSONArray) jsonItems.get("item");
        
        // items json array에 담긴 각 json 오브젝트를 빼오는 작업
        System.out.println("******** JSON Parser를 이용해서 파싱 ********");
        for (int i = 0; i < jsonItemArray.size(); i++) {
        	
        	// 임시 json 객체
        	JSONObject temp = (JSONObject) jsonItemArray.get(i);
        	
        	// 각 Json 값에 대해서 값이 null이 아니면 값을 String으로 파싱해서 넣고 null이면 null 값을 넣는다.
        	int code = 		temp.get("code") != null ? Integer.parseInt(temp.get("code").toString()) : null;
        	String name = 	temp.get("name") != null ? temp.get("name").toString() : null;
        	int rnum = 		temp.get("rnum") != null ? Integer.parseInt(temp.get("rnum").toString()) : null;
        	
        	// 각 값에 대해서 출력을 한다.
        	System.out.println("------------ " + (i + 1) + "번째 인덱스 값 ------------");
        	System.out.println("code : " + code);
        	System.out.println("name : " + name);
        	System.out.println("rnum : " + rnum);
        	System.out.println("");
        }
	}
}
