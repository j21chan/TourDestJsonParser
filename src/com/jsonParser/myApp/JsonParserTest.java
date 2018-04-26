package com.jsonParser.myApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParserTest {
	public static void main (String[] args) throws IOException, ParseException {
		// TourAPI로 보낼 URL
        URL url = new URL("http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList?ServiceKey=lXD74EVz%2B%2BsN6Umj%2FTEiUwe6SrhDlt6EJDw3EiP%2FaQ37jdWZzn2jcv0uMBf90xaYQU2taH9P2nEyEAiiS5mQrw%3D%3D&contentTypeId=12&areaCode=1&sigunguCode=&cat1=A02&cat2=A0203&cat3=A02030400&listYN=Y&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&arrange=A&numOfRows=12&pageNo=1&_type=json");
        
        // HttpURLConnection 연결
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
        // http 연결 설정을 GET 방식으로 하고 json으로 가져옴
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        
        // Response 코드 출력
        System.out.println("Response code: " + conn.getResponseCode());
        
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
//        System.out.println(sb.toString());
        
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
                
        // json items value
        JSONObject jsonItems = (JSONObject) jsonBody.get("items");
        
        // jsonArray item value
        JSONArray jsonItemArray = (JSONArray) jsonItems.get("item");
        
        
        // items json array에 담긴 각 json 오브젝트를 빼오는 작업
        for (int i = 0; i < jsonItemArray.size(); i++) {
        	
        	// 임시 json 객체
        	JSONObject temp = (JSONObject) jsonItemArray.get(i);
        	
        	
        	String addr1 = (temp.get("addr1")).toString();
        	String addr2 = temp.get("addr2").toString();
        	int areacode = Integer.parseInt(temp.get("areacode").toString());
        	String cat1 = temp.get("cat1").toString();
        	String cat2 = temp.get("cat2").toString();
        	String cat3 = temp.get("cat3").toString();
        	String contentid = temp.get("contentid").toString();
        	String contenttypeid = temp.get("contenttypeid").toString();
        	String createdtime = temp.get("createdtime").toString();
        	String firstimage = temp.get("firstimage") != null ? temp.get("firstimage").toString() : null;
        	String firstimage2 = temp.get("firstimage2") != null ? temp.get("firstimage2").toString() : null;
        	String mapx = temp.get("mapx").toString();
        	String mapy = temp.get("mapy").toString();
        	String mlevel = temp.get("mlevle") != null ? temp.get("mlevel").toString() : null;
        	String modifiedtime = temp.get("modifiedtime").toString();
        	String readcount = temp.get("readcount").toString();
        	String sigungucode = temp.get("sigungucode").toString();
        	String tel = temp.get("tel") != null ? temp.get("tel").toString() : null;
        	String title = temp.get("title").toString();
        	String zipcode = temp.get("zipcode").toString();
        	
        	System.out.println("---- " + (i + 1) + "번째 인덱스 값 ----");
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
        
//        System.out.println("name :: " +name);
//        long id = (Long) jsonObj.get("id");
//        System.out.println("id :: " + id);
//        
//        // Array
//        JSONArray phoneNum = (JSONArray) jsonObj.get("phoneNumbers");
//        Iterator<String> iterator = phoneNum.iterator();
//        
//        while (iterator.hasNext()) {
//        	System.out.println("phoneNumbers :: " + iterator.next());
//        }
//        
//        //Object
//        JSONArray array = (JSONArray) jsonObj.get("address");
//        for(int i=0; i<array.size(); i++){
//        	JSONObject result = (JSONObject) array.get(i);
//        	System.out.println("result :: " +result.get("zipcode"));
//        }
	}
}
