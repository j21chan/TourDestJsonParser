package com.jsonParser.myApp;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class TestUnit {

	public static void main(String[] args) throws IOException, ParseException {
//		JsonParserTest.parseAreaCodeURL(UrlBuilder.areaCodeURLBuild());
		JsonParserTest.parseSigunguCodeURL(UrlBuilder.sigunguCodeURLBuild(2));
	}
}