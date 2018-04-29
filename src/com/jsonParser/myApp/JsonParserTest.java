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
}
