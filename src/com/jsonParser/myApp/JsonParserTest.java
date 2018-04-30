package com.jsonParser.myApp;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParserTest {
	
	// AreaCode URL에서 나온 JSON을 파싱해주는 메소드
	public static void parseAreaCode (String stringJSON) throws IOException, ParseException {

        // JSON 객체 출력
        System.out.println("******** Tour API에서 받아온 JSON ********");
        System.out.println(stringJSON + "\n");
            
        // JSON Parser 객체 만들기
        JSONParser parser = new JSONParser();
        
        // TourAPI에서 받은 Json 파일을 obj로 받기
        Object obj = parser.parse(stringJSON);
                
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
        	
        	// 1. 각 JSON 객체의 Key 값이 있는지 검사
        	// 2. 값이 있으면 파싱해서 데이터를 넣음
        	// 3. 데이터 값 출력
        	System.out.println("------------ " + (i + 1) + "번째 인덱스 값 ------------");
        	
        	if(temp.containsKey("code")) {
        		String code = temp.get("code").toString();
            	System.out.println("code : " + code);
        	}
        	
        	if(temp.containsKey("name")) {
        		String name = temp.get("name").toString();
            	System.out.println("name : " + name);
        	}
        	
        	if(temp.containsKey("rnum")) {
        		String rnum = temp.get("rnum").toString();
            	System.out.println("rnum : " + rnum);
        	}
        	
        	System.out.println("");
        }
	}
	
	// Sigungu URL에서 나온 JSON을 파싱해주는 메소드
	public static void parseSigunguCode (String stringJSON) throws IOException, ParseException {
		    
        // JSON 객체 출력
        System.out.println("******** Tour API에서 받아온 JSON ********");
        System.out.println(stringJSON + "\n");
        
        // JSON Parser 객체 만들기
        JSONParser parser = new JSONParser();
        
        // TourAPI에서 받은 Json 파일을 obj로 받기
        Object obj = parser.parse(stringJSON);
                
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
        	
        	// 1. 각 JSON 객체의 Key 값이 있는지 검사
        	// 2. 값이 있으면 파싱해서 데이터를 넣음
        	// 3. 데이터 값 출력
        	System.out.println("------------ " + (i + 1) + "번째 인덱스 값 ------------");
        	
        	if(temp.containsKey("code")) {
        		String code = temp.get("code").toString();
            	System.out.println("code : " + code);
        	}
        	
        	if(temp.containsKey("name")) {
        		String name = temp.get("name").toString();
            	System.out.println("name : " + name);
        	}
        	
        	if(temp.containsKey("rnum")) {
        		String rnum = temp.get("rnum").toString();
            	System.out.println("rnum : " + rnum);
        	}
        	
        	System.out.println("");
        }
	}
	
	
	// 분류코드 URL에서 나온 JSON을 파싱해주는 메소드
	public static void parseCategoryCode (String stringJSON) throws IOException, ParseException {
		    
        // JSON 객체 출력
        System.out.println("******** Tour API에서 받아온 JSON ********");
        System.out.println(stringJSON + "\n");
        
        // JSON Parser 객체 만들기
        JSONParser parser = new JSONParser();
        
        // TourAPI에서 받은 Json 파일을 obj로 받기
        Object obj = parser.parse(stringJSON);
                
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
        	
        	// 1. 각 JSON 객체의 Key 값이 있는지 검사
        	// 2. 값이 있으면 파싱해서 데이터를 넣음
        	// 3. 데이터 값 출력
        	System.out.println("------------ " + (i + 1) + "번째 인덱스 값 ------------");
        	
        	if(temp.containsKey("code")) {
        		String code = temp.get("code").toString();
            	System.out.println("code : " + code);
        	}
        	
        	if(temp.containsKey("name")) {
        		String name = temp.get("name").toString();
            	System.out.println("name : " + name);
        	}
        	
        	if(temp.containsKey("rnum")) {
        		String rnum = temp.get("rnum").toString();
            	System.out.println("rnum : " + rnum);
        	}
        	
        	System.out.println("");
        }
	}
	
	
	// AreaBasedList URL에서 나온 JSON을 파싱해주는 메소드
	public static void parseAreaBasedList (String stringJSON) throws IOException, ParseException {
        // JSON 객체 출력
        System.out.println("******** Tour API에서 받아온 JSON ********");
        System.out.println(stringJSON + "\n");
   
        // JSON Parser 객체 만들기
        JSONParser parser = new JSONParser();
        
        // TourAPI에서 받은 Json 파일을 obj로 받기
        Object obj = parser.parse(stringJSON);
                
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
        	
        	// 1. 각 JSON 객체의 Key 값이 있는지 검사
        	// 2. 값이 있으면 파싱해서 데이터를 넣음
        	// 3. 데이터 값 출력
        	System.out.println("------------ " + (i + 1) + "번째 인덱스 값 ------------");
        	
        	if(temp.containsKey("addr1")) {
        		String addr1 = temp.get("addr1").toString();
            	System.out.println("addr1 : " + addr1);
        	}
        	
        	if(temp.containsKey("addr2")) {
        		String addr2 = temp.get("addr2").toString();
            	System.out.println("addr2 : " + addr2);
        	}
        	
        	if(temp.containsKey("areacode")) {
        		int areacode = Integer.parseInt(temp.get("areacode").toString());
            	System.out.println("areacode : " + areacode);
        	}
        	
        	if(temp.containsKey("cat1")) {
        		String cat1 = temp.get("cat1").toString();
            	System.out.println("cat1 : " + cat1);
        	}
        	
        	if(temp.containsKey("cat2")) {
        		String cat2 = temp.get("cat2").toString();
            	System.out.println("cat2 : " + cat2);
        	}
        	
        	if(temp.containsKey("cat3")) {
        		String cat3 = temp.get("cat3").toString();
            	System.out.println("cat3 : " + cat3);
        	}
        	
        	if(temp.containsKey("contentid")) {
        		int contentid = Integer.parseInt(temp.get("contentid").toString());
            	System.out.println("contentid : " + contentid);
        	}
        	
        	if(temp.containsKey("contenttypeid")) {
        		int contenttypeid = Integer.parseInt(temp.get("contenttypeid").toString());
            	System.out.println("contenttypeid : " + contenttypeid);
        	}
        	
        	if(temp.containsKey("createdtime")) {
        		String createdtime = temp.get("createdtime").toString();
            	System.out.println("createdtime : " + createdtime);
        	}
        	
        	
        	if(temp.containsKey("firstimage")) {
        		String firstimage = temp.get("firstimage").toString();
            	System.out.println("firstimage : " + firstimage);
        	}
        	
        	if(temp.containsKey("firstimage2")) {
        		String firstimage2 = temp.get("firstimage2").toString();
            	System.out.println("firstimage2 : " + firstimage2);
        	}
        	
        	if(temp.containsKey("mapx")) {
        		double mapx = Double.parseDouble(temp.get("mapx").toString());
            	System.out.println("mapx : " + mapx);
        	}
        	
        	if(temp.containsKey("mapy")) {
        		double mapy = Double.parseDouble(temp.get("mapy").toString());
            	System.out.println("mapy : " + mapy);
        	}
        	
        	if(temp.containsKey("mlevel")) {
            	String mlevel = temp.get("mlevel").toString();
            	System.out.println("mlevel : " + mlevel);
        	}
        	
        	if(temp.containsKey("modifiedtime")) {
            	String modifiedtime = temp.get("modifiedtime").toString();
            	System.out.println("modifiedtime : " + modifiedtime);
        	}
        	
        	if(temp.containsKey("readcount")) {
        		int readcount = Integer.parseInt(temp.get("readcount").toString());
            	System.out.println("readcount : " + readcount);
        	}
        	
        	if (temp.containsKey("sigungucode")) {
        		int sigungucode = Integer.parseInt(temp.get("sigungucode").toString());
        		System.out.println("sigungucode : " + sigungucode);
        	}
        	
        	if(temp.containsKey("tel")) {
        		String tel = temp.get("tel").toString();
            	System.out.println("tel : " + tel);
        	}
        	
        	if(temp.containsKey("title")) {
        		String title = temp.get("title").toString();
            	System.out.println("title : " + title);
        	}
        	
        	if(temp.containsKey("zipcode")) {
        		String zipcode = temp.get("zipcode").toString();
            	System.out.println("zipcode : " + zipcode);
        	}

        	System.out.println("");
        }
	}
	
	
	// AreaBasedList URL에서 나온 JSON을 파싱해주는 메소드
	public static void parselocationBasedList (String stringJSON) throws IOException, ParseException {
        // JSON 객체 출력
        System.out.println("******** Tour API에서 받아온 JSON ********");
        System.out.println(stringJSON + "\n");
   
        // JSON Parser 객체 만들기
        JSONParser parser = new JSONParser();
        
        // TourAPI에서 받은 Json 파일을 obj로 받기
        Object obj = parser.parse(stringJSON);
                
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
        	
        	
        	// 1. 각 JSON 객체의 Key 값이 있는지 검사
        	// 2. 값이 있으면 파싱해서 데이터를 넣음
        	// 3. 데이터 값 출력
        	System.out.println("------------ " + (i + 1) + "번째 인덱스 값 ------------");
        	
        	if(temp.containsKey("addr1")) {
        		String addr1 = temp.get("addr1").toString();
            	System.out.println("addr1 : " + addr1);
        	}
        	
        	if(temp.containsKey("addr2")) {
        		String addr2 = temp.get("addr2").toString();
            	System.out.println("addr2 : " + addr2);
        	}
        	
        	if(temp.containsKey("areacode")) {
        		int areacode = Integer.parseInt(temp.get("areacode").toString());
            	System.out.println("areacode : " + areacode);
        	}
        	
        	if(temp.containsKey("cat1")) {
        		String cat1 = temp.get("cat1").toString();
            	System.out.println("cat1 : " + cat1);
        	}
        	
        	if(temp.containsKey("cat2")) {
        		String cat2 = temp.get("cat2").toString();
            	System.out.println("cat2 : " + cat2);
        	}
        	
        	if(temp.containsKey("cat3")) {
        		String cat3 = temp.get("cat3").toString();
            	System.out.println("cat3 : " + cat3);
        	}
        	
        	if(temp.containsKey("contentid")) {
        		int contentid = Integer.parseInt(temp.get("contentid").toString());
            	System.out.println("contentid : " + contentid);
        	}
        	
        	if(temp.containsKey("contenttypeid")) {
        		int contenttypeid = Integer.parseInt(temp.get("contenttypeid").toString());
            	System.out.println("contenttypeid : " + contenttypeid);
        	}
        	
        	if(temp.containsKey("createdtime")) {
        		String createdtime = temp.get("createdtime").toString();
            	System.out.println("createdtime : " + createdtime);
        	}

        	if(temp.containsKey("dist")) {
        		String dist = temp.get("dist").toString();
            	System.out.println("dist : " + dist);
        	}
        	
        	if(temp.containsKey("firstimage")) {
        		String firstimage = temp.get("firstimage").toString();
            	System.out.println("firstimage : " + firstimage);
        	}
        	
        	if(temp.containsKey("firstimage2")) {
        		String firstimage2 = temp.get("firstimage2").toString();
            	System.out.println("firstimage2 : " + firstimage2);
        	}
        	
        	if(temp.containsKey("mapx")) {
        		double mapx = Double.parseDouble(temp.get("mapx").toString());
            	System.out.println("mapx : " + mapx);
        	}
        	
        	if(temp.containsKey("mapy")) {
        		double mapy = Double.parseDouble(temp.get("mapy").toString());
            	System.out.println("mapy : " + mapy);
        	}
        	
        	if(temp.containsKey("mlevel")) {
            	String mlevel = temp.get("mlevel").toString();
            	System.out.println("mlevel : " + mlevel);
        	}
        	
        	if(temp.containsKey("modifiedtime")) {
            	String modifiedtime = temp.get("modifiedtime").toString();
            	System.out.println("modifiedtime : " + modifiedtime);
        	}
        	
        	if(temp.containsKey("readcount")) {
        		int readcount = Integer.parseInt(temp.get("readcount").toString());
            	System.out.println("readcount : " + readcount);
        	}
        	
        	if (temp.containsKey("sigungucode")) {
        		int sigungucode = Integer.parseInt(temp.get("sigungucode").toString());
        		System.out.println("sigungucode : " + sigungucode);
        	}
        	
        	if(temp.containsKey("tel")) {
        		String tel = temp.get("tel").toString();
            	System.out.println("tel : " + tel);
        	}
        	
        	if(temp.containsKey("title")) {
        		String title = temp.get("title").toString();
            	System.out.println("title : " + title);
        	}
        	
        	System.out.println("");
        }
	}
	
	// AreaBasedList URL에서 나온 JSON을 파싱해주는 메소드
	public static void parseSearchFestival (String stringJSON) throws IOException, ParseException {
		// JSON 객체 출력
        System.out.println("******** Tour API에서 받아온 JSON ********");
        System.out.println(stringJSON + "\n");
   
        // JSON Parser 객체 만들기
        JSONParser parser = new JSONParser();
        
        // TourAPI에서 받은 Json 파일을 obj로 받기
        Object obj = parser.parse(stringJSON);
                
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
        	
        	
        	// 1. 각 JSON 객체의 Key 값이 있는지 검사
        	// 2. 값이 있으면 파싱해서 데이터를 넣음
        	// 3. 데이터 값 출력
        	System.out.println("------------ " + (i + 1) + "번째 인덱스 값 ------------");
        	
        	if(temp.containsKey("addr1")) {
        		String addr1 = temp.get("addr1").toString();
            	System.out.println("addr1 : " + addr1);
        	}
        	
        	if(temp.containsKey("addr2")) {
        		String addr2 = temp.get("addr2").toString();
            	System.out.println("addr2 : " + addr2);
        	}
        	
        	if(temp.containsKey("areacode")) {
        		int areacode = Integer.parseInt(temp.get("areacode").toString());
            	System.out.println("areacode : " + areacode);
        	}
        	
        	if(temp.containsKey("cat1")) {
        		String cat1 = temp.get("cat1").toString();
            	System.out.println("cat1 : " + cat1);
        	}
        	
        	if(temp.containsKey("cat2")) {
        		String cat2 = temp.get("cat2").toString();
            	System.out.println("cat2 : " + cat2);
        	}
        	
        	if(temp.containsKey("cat3")) {
        		String cat3 = temp.get("cat3").toString();
            	System.out.println("cat3 : " + cat3);
        	}
        	
        	if(temp.containsKey("contentid")) {
        		int contentid = Integer.parseInt(temp.get("contentid").toString());
            	System.out.println("contentid : " + contentid);
        	}
        	
        	if(temp.containsKey("contenttypeid")) {
        		int contenttypeid = Integer.parseInt(temp.get("contenttypeid").toString());
            	System.out.println("contenttypeid : " + contenttypeid);
        	}
        	
        	if(temp.containsKey("createdtime")) {
        		String createdtime = temp.get("createdtime").toString();
            	System.out.println("createdtime : " + createdtime);
        	}
        	
        	if(temp.containsKey("createdtime")) {
        		String createdtime = temp.get("createdtime").toString();
            	System.out.println("createdtime : " + createdtime);
        	}
        	
        	if(temp.containsKey("eventstartdate")) {
        		String eventstartdate = temp.get("eventstartdate").toString();
            	System.out.println("eventstartdate : " + eventstartdate);
        	}
        	
        	if(temp.containsKey("eventenddate")) {
        		String eventenddate = temp.get("eventenddate").toString();
            	System.out.println("eventenddate : " + eventenddate);
        	}
        	
        	if(temp.containsKey("firstimage")) {
        		String firstimage = temp.get("firstimage").toString();
            	System.out.println("firstimage : " + firstimage);
        	}
        	
        	if(temp.containsKey("firstimage2")) {
        		String firstimage2 = temp.get("firstimage2").toString();
            	System.out.println("firstimage2 : " + firstimage2);
        	}
        	
        	if(temp.containsKey("mapx")) {
        		double mapx = Double.parseDouble(temp.get("mapx").toString());
            	System.out.println("mapx : " + mapx);
        	}
        	
        	if(temp.containsKey("mapy")) {
        		double mapy = Double.parseDouble(temp.get("mapy").toString());
            	System.out.println("mapy : " + mapy);
        	}
        	
        	if(temp.containsKey("mlevel")) {
            	String mlevel = temp.get("mlevel").toString();
            	System.out.println("mlevel : " + mlevel);
        	}
        	
        	if(temp.containsKey("modifiedtime")) {
            	String modifiedtime = temp.get("modifiedtime").toString();
            	System.out.println("modifiedtime : " + modifiedtime);
        	}
        	
        	if(temp.containsKey("readcount")) {
        		int readcount = Integer.parseInt(temp.get("readcount").toString());
            	System.out.println("readcount : " + readcount);
        	}
        	
        	if (temp.containsKey("sigungucode")) {
        		int sigungucode = Integer.parseInt(temp.get("sigungucode").toString());
        		System.out.println("sigungucode : " + sigungucode);
        	}
        	
        	if(temp.containsKey("tel")) {
        		String tel = temp.get("tel").toString();
            	System.out.println("tel : " + tel);
        	}
        	
        	if(temp.containsKey("title")) {
        		String title = temp.get("title").toString();
            	System.out.println("title : " + title);
        	}
        	
        	System.out.println("");
        }
	}
		
	// AreaBasedList URL에서 나온 JSON을 파싱해주는 메소드
	public static void parseSearchStay (String stringJSON) throws IOException, ParseException {
        // JSON 객체 출력
        System.out.println("******** Tour API에서 받아온 JSON ********");
        System.out.println(stringJSON + "\n");
   
        // JSON Parser 객체 만들기
        JSONParser parser = new JSONParser();
        
        // TourAPI에서 받은 Json 파일을 obj로 받기
        Object obj = parser.parse(stringJSON);
                
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
        	
        	
        	// 1. 각 JSON 객체의 Key 값이 있는지 검사
        	// 2. 값이 있으면 파싱해서 데이터를 넣음
        	// 3. 데이터 값 출력
        	System.out.println("------------ " + (i + 1) + "번째 인덱스 값 ------------");
        	
        	if(temp.containsKey("addr1")) {
        		String addr1 = temp.get("addr1").toString();
            	System.out.println("addr1 : " + addr1);
        	}
        	
        	if(temp.containsKey("addr2")) {
        		String addr2 = temp.get("addr2").toString();
            	System.out.println("addr2 : " + addr2);
        	}
        	
        	if(temp.containsKey("areacode")) {
        		int areacode = Integer.parseInt(temp.get("areacode").toString());
            	System.out.println("areacode : " + areacode);
        	}
        	
        	if(temp.containsKey("benikia")) {
        		String benikia = temp.get("benikia").toString();
            	System.out.println("benikia : " + benikia);
        	}
        	
        	if(temp.containsKey("cat1")) {
        		String cat1 = temp.get("cat1").toString();
            	System.out.println("cat1 : " + cat1);
        	}
        	
        	if(temp.containsKey("cat2")) {
        		String cat2 = temp.get("cat2").toString();
            	System.out.println("cat2 : " + cat2);
        	}
        	
        	if(temp.containsKey("cat3")) {
        		String cat3 = temp.get("cat3").toString();
            	System.out.println("cat3 : " + cat3);
        	}
        	
        	if(temp.containsKey("contentid")) {
        		int contentid = Integer.parseInt(temp.get("contentid").toString());
            	System.out.println("contentid : " + contentid);
        	}
        	
        	if(temp.containsKey("contenttypeid")) {
        		int contenttypeid = Integer.parseInt(temp.get("contenttypeid").toString());
            	System.out.println("contenttypeid : " + contenttypeid);
        	}
        	
        	if(temp.containsKey("createdtime")) {
        		String createdtime = temp.get("createdtime").toString();
            	System.out.println("createdtime : " + createdtime);
        	}
        	
        	if(temp.containsKey("createdtime")) {
        		String createdtime = temp.get("createdtime").toString();
            	System.out.println("createdtime : " + createdtime);
        	}
        	
        	if(temp.containsKey("firstimage")) {
        		String firstimage = temp.get("firstimage").toString();
            	System.out.println("firstimage : " + firstimage);
        	}
        	
        	if(temp.containsKey("firstimage2")) {
        		String firstimage2 = temp.get("firstimage2").toString();
            	System.out.println("firstimage2 : " + firstimage2);
        	}
        	
        	if(temp.containsKey("goodstay")) {
        		String goodstay = temp.get("goodstay").toString();
            	System.out.println("goodstay : " + goodstay);
        	}
        	
        	if(temp.containsKey("hanok")) {
        		String hanok = temp.get("hanok").toString();
            	System.out.println("hanok : " + hanok);
        	}
        	
        	if(temp.containsKey("mapx")) {
        		double mapx = Double.parseDouble(temp.get("mapx").toString());
            	System.out.println("mapx : " + mapx);
        	}
        	
        	if(temp.containsKey("mapy")) {
        		double mapy = Double.parseDouble(temp.get("mapy").toString());
            	System.out.println("mapy : " + mapy);
        	}
        	
        	if(temp.containsKey("mlevel")) {
            	String mlevel = temp.get("mlevel").toString();
            	System.out.println("mlevel : " + mlevel);
        	}
        	
        	if(temp.containsKey("modifiedtime")) {
            	String modifiedtime = temp.get("modifiedtime").toString();
            	System.out.println("modifiedtime : " + modifiedtime);
        	}
        	
        	if(temp.containsKey("readcount")) {
        		int readcount = Integer.parseInt(temp.get("readcount").toString());
            	System.out.println("readcount : " + readcount);
        	}
        	
        	if (temp.containsKey("sigungucode")) {
        		int sigungucode = Integer.parseInt(temp.get("sigungucode").toString());
        		System.out.println("sigungucode : " + sigungucode);
        	}
        	
        	if(temp.containsKey("tel")) {
        		String tel = temp.get("tel").toString();
            	System.out.println("tel : " + tel);
        	}
        	
        	if(temp.containsKey("title")) {
        		String title = temp.get("title").toString();
            	System.out.println("title : " + title);
        	}
        	
        	System.out.println("");
        }
	}
		
	// AreaBasedList URL에서 나온 JSON을 파싱해주는 메소드
	public static void parseDetailCommon(String stringJSON) throws IOException, ParseException {
        // JSON 객체 출력
        System.out.println("******** Tour API에서 받아온 JSON ********");
        System.out.println(stringJSON + "\n");
   
        // JSON Parser 객체 만들기
        JSONParser parser = new JSONParser();
        
        // TourAPI에서 받은 Json 파일을 obj로 받기
        Object obj = parser.parse(stringJSON);
                
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
        JSONObject jsonItem = (JSONObject) jsonItems.get("item");
        
        // items json array에 담긴 각 json 오브젝트를 빼오는 작업
        System.out.println("******** JSON Parser를 이용해서 파싱 ********" + "\n");

    	// 1. 각 JSON 객체의 Key 값이 있는지 검사
    	// 2. 값이 있으면 파싱해서 데이터를 넣음
    	// 3. 데이터 값 출력

    	// 기본 응답
    	if(jsonItem.containsKey("contentid")) {
    		String contentid = jsonItem.get("contentid").toString();
        	System.out.println("contentid : " + contentid);
    	}
    	
    	if(jsonItem.containsKey("contenttypeid")) {
    		String contenttypeid = jsonItem.get("contenttypeid").toString();
        	System.out.println("contenttypeid : " + contenttypeid);
    	}
    	
    	// 기본정보조회
     	if(jsonItem.containsKey("createdtime")) {
    		String createdtime = jsonItem.get("createdtime").toString();
        	System.out.println("createdtime : " + createdtime);
    	}
    	
    	if(jsonItem.containsKey("homepage")) {
    		String homepage = jsonItem.get("homepage").toString();
        	System.out.println("homepage : " + homepage);
    	}
    	
    	if(jsonItem.containsKey("modifiedtime")) {
    		String modifiedtime = jsonItem.get("modifiedtime").toString();
        	System.out.println("modifiedtime : " + modifiedtime);
    	}
    	
    	if(jsonItem.containsKey("tel")) {
    		String tel = jsonItem.get("tel").toString();
        	System.out.println("tel : " + tel);
    	}
    	
    	if(jsonItem.containsKey("telname")) {
    		String telname = jsonItem.get("telname").toString();
        	System.out.println("telname : " + telname);
    	}
    	
    	// 대표이미지 조회
    	if(jsonItem.containsKey("firstimage")) {
    		String firstimage = jsonItem.get("firstimage").toString();
        	System.out.println("firstimage : " + firstimage);
    	}
    	
    	// 대표이미지 조회
    	if(jsonItem.containsKey("firstimage2")) {
    		String firstimage2 = jsonItem.get("firstimage2").toString();
        	System.out.println("firstimage2 : " + firstimage2);
    	}
    	
    	// 지역정보조회
    	if(jsonItem.containsKey("areacode")) {
    		String areacode = jsonItem.get("areacode").toString();
        	System.out.println("areacode : " + areacode);
    	}
    	
    	if(jsonItem.containsKey("sigungucode")) {
    		String sigungucode = jsonItem.get("sigungucode").toString();
        	System.out.println("sigungucode : " + sigungucode);
    	}
    	
    	// 분류코드조회
    	if(jsonItem.containsKey("cat1")) {
    		String cat1 = jsonItem.get("cat1").toString();
        	System.out.println("cat1 : " + cat1);
    	}
    	
    	if(jsonItem.containsKey("cat2")) {
    		String cat2 = jsonItem.get("cat2").toString();
        	System.out.println("cat2 : " + cat2);
    	}
    	
    	if(jsonItem.containsKey("cat3")) {
    		String cat3 = jsonItem.get("cat3").toString();
        	System.out.println("cat3 : " + cat3);
    	}
    	
    	// 주소정보조회
    	if(jsonItem.containsKey("addr1")) {
    		String addr1 = jsonItem.get("addr1").toString();
        	System.out.println("addr1 : " + addr1);
    	}
    	
    	if(jsonItem.containsKey("addr2")) {
    		String addr2 = jsonItem.get("addr2").toString();
        	System.out.println("addr2 : " + addr2);
    	}
    	
    	if(jsonItem.containsKey("zipcode")) {
    		String zipcode = jsonItem.get("zipcode").toString();
        	System.out.println("zipcode : " + zipcode);
    	}
    	
    	// 좌표정보조회
    	if(jsonItem.containsKey("mapx")) {
    		String mapx = jsonItem.get("mapx").toString();
        	System.out.println("mapx : " + mapx);
    	}
    	
    	if(jsonItem.containsKey("mapy")) {
    		String mapy = jsonItem.get("mapy").toString();
        	System.out.println("mapy : " + mapy);
    	}
    	
    	if(jsonItem.containsKey("mlevel")) {
    		String mlevel = jsonItem.get("mlevel").toString();
        	System.out.println("mlevel : " + mlevel);
    	}
    	
    	// 개요
    	if(jsonItem.containsKey("overview")) {
    		String overview = jsonItem.get("overview").toString();
        	System.out.println("moverviewlevel : " + overview);
    	}
    	
    	System.out.println("");
	}
	
	// AreaBasedList URL에서 나온 JSON을 파싱해주는 메소드
	public static void parseDetailIntro(String stringJSON) throws IOException, ParseException {
        // JSON 객체 출력
        System.out.println("******** Tour API에서 받아온 JSON ********");
        System.out.println(stringJSON + "\n");
   
        // JSON Parser 객체 만들기
        JSONParser parser = new JSONParser();
        
        // TourAPI에서 받은 Json 파일을 obj로 받기
        Object obj = parser.parse(stringJSON);
                
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
        JSONObject jsonItem = (JSONObject) jsonItems.get("item");
        
        // items json array에 담긴 각 json 오브젝트를 빼오는 작업
        System.out.println("******** JSON Parser를 이용해서 파싱 ********" + "\n");

    	// 1. 각 JSON 객체의 Key 값이 있는지 검사
    	// 2. 값이 있으면 파싱해서 데이터를 넣음
    	// 3. 데이터 값 출력

    	// 기본 응답
    	if(jsonItem.containsKey("contentid")) {
    		String contentid = jsonItem.get("contentid").toString();
        	System.out.println("contentid : " + contentid);
    	}
    	
    	String contenttypeid = null;
    	if(jsonItem.containsKey("contenttypeid")) {
    		contenttypeid = jsonItem.get("contenttypeid").toString();
        	System.out.println("contenttypeid : " + contenttypeid);
    	}
    	
    	
    	// 관광지 (contentTypeId = 12)
     	if(contenttypeid.equals("12")) {
     		
     		if(jsonItem.containsKey("accomcount")) {
        		String accomcount = jsonItem.get("accomcount").toString();
            	System.out.println("accomcount : " + accomcount);
        	}
     		
     		if(jsonItem.containsKey("chkbabycarriage")) {
        		String chkbabycarriage = jsonItem.get("chkbabycarriage").toString();
            	System.out.println("chkbabycarriage : " + chkbabycarriage);
        	}
     		
     		if(jsonItem.containsKey("chkpet")) {
        		String chkpet = jsonItem.get("chkpet").toString();
            	System.out.println("chkpet : " + chkpet);
        	}
     		
     		if(jsonItem.containsKey("expagerange")) {
        		String expagerange = jsonItem.get("expagerange").toString();
            	System.out.println("expagerange : " + expagerange);
        	}
     		
     		if(jsonItem.containsKey("expguide")) {
        		String expguide = jsonItem.get("expguide").toString();
            	System.out.println("expguide : " + expguide);
        	}
     		
     		if(jsonItem.containsKey("heritage1")) {
        		String heritage1 = jsonItem.get("heritage1").toString();
            	System.out.println("heritage1 : " + heritage1);
        	}
     		
     		if(jsonItem.containsKey("heritage2")) {
        		String heritage2 = jsonItem.get("heritage2").toString();
            	System.out.println("heritage2 : " + heritage2);
        	}
     		
     		if(jsonItem.containsKey("heritage3")) {
        		String heritage3 = jsonItem.get("heritage3").toString();
            	System.out.println("heritage3 : " + heritage3);
        	}
     		
     		if(jsonItem.containsKey("infocenter")) {
        		String infocenter = jsonItem.get("infocenter").toString();
            	System.out.println("infocenter : " + infocenter);
        	}
     		
     		if(jsonItem.containsKey("opendate")) {
        		String opendate = jsonItem.get("opendate").toString();
            	System.out.println("opendate : " + opendate);
        	}
     		
     		if(jsonItem.containsKey("parking")) {
        		String parking = jsonItem.get("parking").toString();
            	System.out.println("parking : " + parking);
        	}
     		
     		if(jsonItem.containsKey("restdate")) {
        		String restdate = jsonItem.get("restdate").toString();
            	System.out.println("restdate : " + restdate);
        	}
     		
     		if(jsonItem.containsKey("useseason")) {
        		String useseason = jsonItem.get("useseason").toString();
            	System.out.println("useseason : " + useseason);
        	}
     		
     		if(jsonItem.containsKey("usetime")) {
        		String usetime = jsonItem.get("usetime").toString();
            	System.out.println("usetime : " + usetime);
        	}
     		
     	}
    	
	    // 문화시설 (contentTypeId = 14)
	 	if(contenttypeid.equals("14")) {
	 		
	 		if(jsonItem.containsKey("accomcountculture")) {
	    		String accomcountculture = jsonItem.get("accomcountculture").toString();
	        	System.out.println("accomcountculture : " + accomcountculture);
	    	}
	 		
	 		if(jsonItem.containsKey("chkbabycarriage")) {
	    		String chkbabycarriage = jsonItem.get("chkbabycarriage").toString();
	        	System.out.println("chkbabycarriage : " + chkbabycarriage);
	    	}
	 		
	 		if(jsonItem.containsKey("chkcreditcardculture")) {
	    		String chkcreditcardculture = jsonItem.get("chkcreditcardculture").toString();
	        	System.out.println("chkcreditcardculture : " + chkcreditcardculture);
	    	}
	 		
	 		if(jsonItem.containsKey("chkpetculture")) {
	    		String chkpetculture = jsonItem.get("chkpetculture").toString();
	        	System.out.println("chkpetculture : " + chkpetculture);
	    	}
	 		
	 		if(jsonItem.containsKey("discountinfo")) {
	    		String discountinfo = jsonItem.get("discountinfo").toString();
	        	System.out.println("discountinfo : " + discountinfo);
	    	}
	 		
	 		if(jsonItem.containsKey("infocenterculture")) {
	    		String infocenterculture = jsonItem.get("infocenterculture").toString();
	        	System.out.println("infocenterculture : " + infocenterculture);
	    	}
	 		
	 		if(jsonItem.containsKey("parkingculture")) {
	    		String parkingculture = jsonItem.get("parkingculture").toString();
	        	System.out.println("parkingculture : " + parkingculture);
	    	}
	 		
	 		if(jsonItem.containsKey("parkingfee")) {
	    		String parkingfee = jsonItem.get("parkingfee").toString();
	        	System.out.println("parkingfee : " + parkingfee);
	    	}
	 		
	 		if(jsonItem.containsKey("restdateculture")) {
	    		String restdateculture = jsonItem.get("restdateculture").toString();
	        	System.out.println("restdateculture : " + restdateculture);
	    	}
	 		
	 		if(jsonItem.containsKey("usefee")) {
	    		String usefee = jsonItem.get("usefee").toString();
	        	System.out.println("usefee : " + usefee);
	    	}
	 		
	 		if(jsonItem.containsKey("usetimeculture")) {
	    		String usetimeculture = jsonItem.get("usetimeculture").toString();
	        	System.out.println("parking : " + usetimeculture);
	    	}
	 		
	 		if(jsonItem.containsKey("scale")) {
	    		String scale = jsonItem.get("scale").toString();
	        	System.out.println("scale : " + scale);
	    	}
	 		
	 		if(jsonItem.containsKey("spendtime")) {
	    		String spendtime = jsonItem.get("spendtime").toString();
	        	System.out.println("spendtime : " + spendtime);
	    	}
	 	}
    	
	 	// 행사/공연/축제 (contentTypeId = 15)
	 	if(contenttypeid.equals("15")) {
	 		
	 		if(jsonItem.containsKey("agelimit")) {
	    		String agelimit = jsonItem.get("agelimit").toString();
	        	System.out.println("agelimit : " + agelimit);
	    	}
	 		
	 		if(jsonItem.containsKey("bookingplace")) {
	    		String bookingplace = jsonItem.get("bookingplace").toString();
	        	System.out.println("bookingplace : " + bookingplace);
	    	}
	 		
	 		if(jsonItem.containsKey("discountinfofestival")) {
	    		String discountinfofestival = jsonItem.get("discountinfofestival").toString();
	        	System.out.println("discountinfofestival : " + discountinfofestival);
	    	}
	 		
	 		if(jsonItem.containsKey("eventenddate")) {
	    		String eventenddate = jsonItem.get("eventenddate").toString();
	        	System.out.println("eventenddate : " + eventenddate);
	    	}
	 		
	 		if(jsonItem.containsKey("eventhomepage")) {
	    		String eventhomepage = jsonItem.get("eventhomepage").toString();
	        	System.out.println("eventhomepage : " + eventhomepage);
	    	}
	 		
	 		if(jsonItem.containsKey("eventplace")) {
	    		String eventplace = jsonItem.get("eventplace").toString();
	        	System.out.println("eventplace : " + eventplace);
	    	}
	 		
	 		if(jsonItem.containsKey("eventstartdate")) {
	    		String eventstartdate = jsonItem.get("eventstartdate").toString();
	        	System.out.println("eventstartdate : " + eventstartdate);
	    	}
	 		
	 		if(jsonItem.containsKey("festivalgrade")) {
	    		String festivalgrade = jsonItem.get("festivalgrade").toString();
	        	System.out.println("festivalgrade : " + festivalgrade);
	    	}
	 		
	 		if(jsonItem.containsKey("placeinfo")) {
	    		String placeinfo = jsonItem.get("placeinfo").toString();
	        	System.out.println("placeinfo : " + placeinfo);
	    	}
	 		
	 		if(jsonItem.containsKey("playtime")) {
	    		String playtime = jsonItem.get("playtime").toString();
	        	System.out.println("playtime : " + playtime);
	    	}
	 		
	 		if(jsonItem.containsKey("program")) {
	    		String program = jsonItem.get("program").toString();
	        	System.out.println("program : " + program);
	    	}
	 		
	 		if(jsonItem.containsKey("spendtimefestival")) {
	    		String spendtimefestival = jsonItem.get("spendtimefestival").toString();
	        	System.out.println("spendtimefestival : " + spendtimefestival);
	    	}
	 		
	 		if(jsonItem.containsKey("sponsor1")) {
	    		String sponsor1 = jsonItem.get("sponsor1").toString();
	        	System.out.println("sponsor1 : " + sponsor1);
	    	}
	 		
	 		if(jsonItem.containsKey("sponsor1tel")) {
	    		String sponsor1tel = jsonItem.get("sponsor1tel").toString();
	        	System.out.println("sponsor1tel : " + sponsor1tel);
	    	}
	 		
	 		if(jsonItem.containsKey("sponsor2")) {
	    		String sponsor2 = jsonItem.get("sponsor2").toString();
	        	System.out.println("sponsor2 : " + sponsor2);
	    	}
	 		
	 		if(jsonItem.containsKey("sponsor2tel")) {
	    		String sponsor2tel = jsonItem.get("sponsor2tel").toString();
	        	System.out.println("sponsor2tel : " + sponsor2tel);
	    	}
	 		
	 		if(jsonItem.containsKey("subevent")) {
	    		String subevent = jsonItem.get("subevent").toString();
	        	System.out.println("subevent : " + subevent);
	    	}
	 		
	 		if(jsonItem.containsKey("usetimefestival")) {
	    		String usetimefestival = jsonItem.get("usetimefestival").toString();
	        	System.out.println("usetimefestival : " + usetimefestival);
	    	}
	 	}
	 	
	 	// 여행코스 (contentTypeId = 25)
 	 	if(contenttypeid.equals("25")) {
 	 		
 	 		if(jsonItem.containsKey("distance")) {
 	    		String distance = jsonItem.get("distance").toString();
 	        	System.out.println("distance : " + distance);
 	    	}
 	 		
 	 		if(jsonItem.containsKey("infocentertourcourse")) {
 	    		String infocentertourcourse = jsonItem.get("infocentertourcourse").toString();
 	        	System.out.println("infocentertourcourse : " + infocentertourcourse);
 	    	}
 	 		
 	 		if(jsonItem.containsKey("schedule")) {
 	    		String schedule = jsonItem.get("schedule").toString();
 	        	System.out.println("schedule : " + schedule);
 	    	}
 	 		
 	 		if(jsonItem.containsKey("taketime")) {
 	    		String taketime = jsonItem.get("taketime").toString();
 	        	System.out.println("taketime : " + taketime);
 	    	}
 	 		
 	 		if(jsonItem.containsKey("theme")) {
 	    		String theme = jsonItem.get("theme").toString();
 	        	System.out.println("theme : " + theme);
 	    	}
 	 	}
	    // 레포츠 (contentTypeId = 28)
	 	if(contenttypeid.equals("28")) {
	 		
	 		if(jsonItem.containsKey("accomcountleports")) {
	    		String accomcountleports = jsonItem.get("accomcountleports").toString();
	        	System.out.println("accomcountleports : " + accomcountleports);
	    	}
	 		
	 		if(jsonItem.containsKey("chkbabycarriageleports")) {
	    		String chkbabycarriageleports = jsonItem.get("chkbabycarriageleports").toString();
	        	System.out.println("chkbabycarriageleports : " + chkbabycarriageleports);
	    	}
	 		
	 		if(jsonItem.containsKey("chkcreditcardleports")) {
	    		String chkcreditcardleports = jsonItem.get("chkcreditcardleports").toString();
	        	System.out.println("chkcreditcardleports : " + chkcreditcardleports);
	    	}
	 		
	 		if(jsonItem.containsKey("chkpetleports")) {
	    		String chkpetleports = jsonItem.get("chkpetleports").toString();
	        	System.out.println("chkpetleports : " + chkpetleports);
	    	}
	 		
	 		if(jsonItem.containsKey("expagerangeleports")) {
	    		String expagerangeleports = jsonItem.get("expagerangeleports").toString();
	        	System.out.println("expagerangeleports : " + expagerangeleports);
	    	}
	 		
	 		if(jsonItem.containsKey("infocenterleports")) {
	    		String infocenterleports = jsonItem.get("infocenterleports").toString();
	        	System.out.println("infocenterleports : " + infocenterleports);
	    	}
	 		
	 		if(jsonItem.containsKey("openperiod")) {
	    		String openperiod = jsonItem.get("openperiod").toString();
	        	System.out.println("openperiod : " + openperiod);
	    	}
	 		
	 		if(jsonItem.containsKey("parkingfeeleports")) {
	    		String parkingfeeleports = jsonItem.get("parkingfeeleports").toString();
	        	System.out.println("parkingfeeleports : " + parkingfeeleports);
	    	}
	 		
	 		if(jsonItem.containsKey("parkingleports")) {
	    		String parkingleports = jsonItem.get("parkingleports").toString();
	        	System.out.println("parkingleports : " + parkingleports);
	    	}
	 		
	 		if(jsonItem.containsKey("reservation")) {
	    		String reservation = jsonItem.get("reservation").toString();
	        	System.out.println("usefee : " + reservation);
	    	}
	 		
	 		if(jsonItem.containsKey("restdateleports")) {
	    		String restdateleports = jsonItem.get("restdateleports").toString();
	        	System.out.println("parking : " + restdateleports);
	    	}
	 		
	 		if(jsonItem.containsKey("scaleleports")) {
	    		String scaleleports = jsonItem.get("scaleleports").toString();
	        	System.out.println("scaleleports : " + scaleleports);
	    	}
	 		
	 		if(jsonItem.containsKey("usefeeleports")) {
	    		String usefeeleports = jsonItem.get("usefeeleports").toString();
	        	System.out.println("usefeeleports : " + usefeeleports);
	    	}
	 		
	 		if(jsonItem.containsKey("usetimeleports")) {
	    		String usetimeleports = jsonItem.get("usetimeleports").toString();
	        	System.out.println("usetimeleports : " + usetimeleports);
	    	}
	 	}
	 	
	    // 숙박 (contentTypeId = 32)
	 	if(contenttypeid.equals("32")) {
	 		
	 		if(jsonItem.containsKey("accomcountlodging")) {
	    		String accomcountlodging = jsonItem.get("accomcountlodging").toString();
	        	System.out.println("accomcountlodging : " + accomcountlodging);
	    	}
	 		
	 		if(jsonItem.containsKey("benikia")) {
	    		String benikia = jsonItem.get("benikia").toString();
	        	System.out.println("benikia : " + benikia);
	    	}
	 		
	 		if(jsonItem.containsKey("checkintime")) {
	    		String checkintime = jsonItem.get("checkintime").toString();
	        	System.out.println("checkintime : " + checkintime);
	    	}
	 		
	 		if(jsonItem.containsKey("chkcooking")) {
	    		String chkcooking = jsonItem.get("chkcooking").toString();
	        	System.out.println("chkcooking : " + chkcooking);
	    	}
	 		
	 		if(jsonItem.containsKey("foodplace")) {
	    		String foodplace = jsonItem.get("foodplace").toString();
	        	System.out.println("foodplace : " + foodplace);
	    	}
	 		
	 		if(jsonItem.containsKey("goodstay")) {
	    		String goodstay = jsonItem.get("goodstay").toString();
	        	System.out.println("goodstay : " + goodstay);
	    	}
	 		
	 		if(jsonItem.containsKey("hanok")) {
	    		String hanok = jsonItem.get("hanok").toString();
	        	System.out.println("hanok : " + hanok);
	    	}
	 		
	 		if(jsonItem.containsKey("infocenterlodging")) {
	    		String infocenterlodging = jsonItem.get("infocenterlodging").toString();
	        	System.out.println("infocenterlodging : " + infocenterlodging);
	    	}
	 		
	 		if(jsonItem.containsKey("parkinglodging")) {
	    		String parkinglodging = jsonItem.get("parkinglodging").toString();
	        	System.out.println("parkinglodging" + parkinglodging);
	    	}
	 		
	 		if(jsonItem.containsKey("pickup")) {
	    		String pickup = jsonItem.get("pickup").toString();
	        	System.out.println("pickup : " + pickup);
	    	}
	 		
	 		if(jsonItem.containsKey("roomcount")) {
	    		String roomcount = jsonItem.get("roomcount").toString();
	        	System.out.println("roomcount : " + roomcount);
	    	}
	 		
	 		if(jsonItem.containsKey("reservationlodging")) {
	    		String reservationlodging = jsonItem.get("reservationlodging").toString();
	        	System.out.println("reservationlodging	 : " + reservationlodging);
	    	}
	 		
	 		if(jsonItem.containsKey("reservationurl")) {
	    		String reservationurl = jsonItem.get("reservationurl").toString();
	        	System.out.println("reservationurl : " + reservationurl);
	    	}
	 		
	 		if(jsonItem.containsKey("roomtype")) {
	    		String roomtype = jsonItem.get("roomtype").toString();
	        	System.out.println("roomtype : " + roomtype);
	    	}
	 		
	 		if(jsonItem.containsKey("scalelodging")) {
	    		String scalelodging = jsonItem.get("scalelodging").toString();
	        	System.out.println("scalelodging : " + scalelodging);
	    	}
	 		
	 		if(jsonItem.containsKey("subfacility")) {
	    		String subfacility = jsonItem.get("subfacility").toString();
	        	System.out.println("subfacility : " + subfacility);
	    	}
	 		
	 		if(jsonItem.containsKey("barbecue")) {
	    		String barbecue = jsonItem.get("barbecue").toString();
	        	System.out.println("barbecue : " + barbecue);
	    	}
	 		
	 		if(jsonItem.containsKey("beauty")) {
	    		String beauty = jsonItem.get("beauty").toString();
	        	System.out.println("beauty : " + beauty);
	    	}
	 		
	 		if(jsonItem.containsKey("beverage")) {
	    		String beverage = jsonItem.get("beverage").toString();
	        	System.out.println("beverage : " + beverage);
	    	}
	 		
	 		if(jsonItem.containsKey("bicycle")) {
	    		String bicycle = jsonItem.get("bicycle").toString();
	        	System.out.println("bicycle : " + bicycle);
	    	}
	 		
	 		if(jsonItem.containsKey("campfire")) {
	    		String campfire = jsonItem.get("campfire").toString();
	        	System.out.println("campfire : " + campfire);
	    	}
	 		
	 		if(jsonItem.containsKey("fitness")) {
	    		String fitness = jsonItem.get("fitness").toString();
	        	System.out.println("fitness : " + fitness);
	    	}
	 		
	 		if(jsonItem.containsKey("karaoke")) {
	    		String karaoke = jsonItem.get("karaoke").toString();
	        	System.out.println("karaoke : " + karaoke);
	    	}
	 		
	 		if(jsonItem.containsKey("publicbath")) {
	    		String publicbath = jsonItem.get("publicbath").toString();
	        	System.out.println("publicbath : " + publicbath);
	    	}
	 		
	 		if(jsonItem.containsKey("publicpc")) {
	    		String publicpc = jsonItem.get("publicpc").toString();
	        	System.out.println("publicpc : " + publicpc);
	    	}
	 		
	 		if(jsonItem.containsKey("sauna")) {
	    		String sauna = jsonItem.get("sauna").toString();
	        	System.out.println("sauna : " + sauna);
	    	}
	 		
	 		if(jsonItem.containsKey("seminar")) {
	    		String seminar = jsonItem.get("seminar").toString();
	        	System.out.println("seminar : " + seminar);
	    	}
	 		
	 		if(jsonItem.containsKey("Sports")) {
	    		String Sports = jsonItem.get("Sports").toString();
	        	System.out.println("Sports : " + Sports);
	    	}
	 	}

	    // 쇼핑 (contentTypeId = 38)
	 	if(contenttypeid.equals("38")) {
	 		
	 		if(jsonItem.containsKey("chkbabycarriageshopping")) {
	    		String chkbabycarriageshopping = jsonItem.get("chkbabycarriageshopping").toString();
	        	System.out.println("chkbabycarriageshopping : " + chkbabycarriageshopping);
	    	}
	 		
	 		if(jsonItem.containsKey("chkcreditcardshopping")) {
	    		String chkcreditcardshopping = jsonItem.get("chkcreditcardshopping").toString();
	        	System.out.println("chkcreditcardshopping : " + chkcreditcardshopping);
	    	}
	 		
	 		if(jsonItem.containsKey("chkpetshopping")) {
	    		String chkpetshopping = jsonItem.get("chkpetshopping").toString();
	        	System.out.println("chkpetshopping : " + chkpetshopping);
	    	}
	 		
	 		if(jsonItem.containsKey("culturecenter")) {
	    		String culturecenter = jsonItem.get("culturecenter").toString();
	        	System.out.println("culturecenter : " + culturecenter);
	    	}
	 		
	 		if(jsonItem.containsKey("fairday")) {
	    		String fairday = jsonItem.get("fairday").toString();
	        	System.out.println("fairday : " + fairday);
	    	}
	 		
	 		if(jsonItem.containsKey("infocentershopping")) {
	    		String infocentershopping = jsonItem.get("infocentershopping").toString();
	        	System.out.println("infocentershopping : " + infocentershopping);
	    	}
	 		
	 		if(jsonItem.containsKey("opendateshopping")) {
	    		String opendateshopping = jsonItem.get("opendateshopping").toString();
	        	System.out.println("opendateshopping : " + opendateshopping);
	    	}
	 		
	 		if(jsonItem.containsKey("opentime")) {
	    		String opentime = jsonItem.get("opentime").toString();
	        	System.out.println("opentime : " + opentime);
	    	}
	 		
	 		if(jsonItem.containsKey("parkingshopping")) {
	    		String parkingshopping = jsonItem.get("parkingshopping").toString();
	        	System.out.println("parkingshopping" + parkingshopping);
	    	}
	 		
	 		if(jsonItem.containsKey("restdateshopping")) {
	    		String restdateshopping = jsonItem.get("restdateshopping").toString();
	        	System.out.println("restdateshopping : " + restdateshopping);
	    	}
	 		
	 		if(jsonItem.containsKey("restroom")) {
	    		String restroom = jsonItem.get("restroom").toString();
	        	System.out.println("restroom : " + restroom);
	    	}
	 		
	 		if(jsonItem.containsKey("saleitem")) {
	    		String saleitem = jsonItem.get("saleitem").toString();
	        	System.out.println("saleitem : " + saleitem);
	    	}
	 		
	 		if(jsonItem.containsKey("saleitemcost")) {
	    		String saleitemcost = jsonItem.get("saleitemcost").toString();
	        	System.out.println("saleitemcost : " + saleitemcost);
	    	}
	 		
	 		if(jsonItem.containsKey("scaleshopping")) {
	    		String scaleshopping = jsonItem.get("scaleshopping").toString();
	        	System.out.println("scaleshopping : " + scaleshopping);
	    	}
	 		
	 		if(jsonItem.containsKey("shopguide")) {
	    		String shopguide = jsonItem.get("shopguide").toString();
	        	System.out.println("shopguide : " + shopguide);
	    	}
	 	}
	    // 음식점 (contentTypeId = 39)
	 	if(contenttypeid.equals("39")) {
	 		
	 		if(jsonItem.containsKey("chkcreditcardfood")) {
	    		String chkcreditcardfood = jsonItem.get("chkcreditcardfood").toString();
	        	System.out.println("chkcreditcardfood : " + chkcreditcardfood);
	    	}
	 		
	 		if(jsonItem.containsKey("discountinfofood")) {
	    		String discountinfofood = jsonItem.get("discountinfofood").toString();
	        	System.out.println("discountinfofood : " + discountinfofood);
	    	}
	 		
	 		if(jsonItem.containsKey("firstmenu")) {
	    		String firstmenu = jsonItem.get("firstmenu").toString();
	        	System.out.println("firstmenu : " + firstmenu);
	    	}
	 		
	 		if(jsonItem.containsKey("infocenterfood")) {
	    		String infocenterfood = jsonItem.get("infocenterfood").toString();
	        	System.out.println("infocenterfood : " + infocenterfood);
	    	}
	 		
	 		if(jsonItem.containsKey("kidsfacility")) {
	    		String kidsfacility = jsonItem.get("kidsfacility").toString();
	        	System.out.println("kidsfacility : " + kidsfacility);
	    	}
	 		
	 		if(jsonItem.containsKey("opendatefood")) {
	    		String opendatefood = jsonItem.get("opendatefood").toString();
	        	System.out.println("opendatefood : " + opendatefood);
	    	}
	 		
	 		if(jsonItem.containsKey("opentimefood")) {
	    		String opentimefood = jsonItem.get("opentimefood").toString();
	        	System.out.println("opentimefood : " + opentimefood);
	    	}
	 		
	 		if(jsonItem.containsKey("packing")) {
	    		String packing = jsonItem.get("packing").toString();
	        	System.out.println("packing : " + packing);
	    	}
	 		
	 		if(jsonItem.containsKey("parkingfood")) {
	    		String parkingfood = jsonItem.get("parkingfood").toString();
	        	System.out.println("parkingfood : " + parkingfood);
	    	}
	 		
	 		if(jsonItem.containsKey("reservationfood")) {
	    		String reservationfood = jsonItem.get("reservationfood").toString();
	        	System.out.println("reservationfood : " + reservationfood);
	    	}
	 		
	 		if(jsonItem.containsKey("restdatefood")) {
	    		String restdatefood = jsonItem.get("restdatefood").toString();
	        	System.out.println("restdatefood : " + restdatefood);
	    	}
	 		
	 		if(jsonItem.containsKey("scalefood")) {
	    		String scalefood = jsonItem.get("scalefood").toString();
	        	System.out.println("scalefood : " + scalefood);
	    	}
	 		
	 		if(jsonItem.containsKey("seat")) {
	    		String seat = jsonItem.get("seat").toString();
	        	System.out.println("seat : " + seat);
	    	}
	 		
	 		if(jsonItem.containsKey("smoking")) {
	    		String smoking = jsonItem.get("smoking").toString();
	        	System.out.println("smoking : " + smoking);
	    	}
	 		
	 		if(jsonItem.containsKey("treatmenu")) {
	    		String treatmenu = jsonItem.get("treatmenu").toString();
	        	System.out.println("treatmenu : " + treatmenu);
	    	}
	 	}
    	System.out.println("");
	}
}
