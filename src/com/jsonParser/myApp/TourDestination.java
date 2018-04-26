package com.jsonParser.myApp;

public class TourDestination {
	private String addr1;
	private String addr2;
	private int areacode;
	private String cat1;
	private String cat2;
	private String cat3;
	private int contentid;
	private int contenttypeid;
	private int createdtime;
	private String firstimage;
	private String firstimage2;
	private double mapx;
	private double mapy;
	private int mlevel;
	private int modifiedtime;
	private int readcount;
	private int sigungucode;
	private String tel;
	private String title;
	private String zipcode;
	
	public TourDestination(String addr1, String addr2, int areacode,
						   String cat1, String cat2, String cat3,
						   int contentid, int contenttypeid, int createdtime,
						   String firstimage, String firstimage2,
						   double mapx, double mapy, int mlevel,
						   int modifiedtime, int readcount, int sigungucode,
						   String tel, String title, String zipcode) {
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.areacode = areacode;
		this.cat1 = cat1;
		this.cat2 = cat2;
		this.cat3 = cat3;
		this.contentid = contentid;
		this.contenttypeid = contenttypeid;
		this.createdtime = createdtime;
		this.firstimage = firstimage;
		this.firstimage2 = firstimage2;
		this.mapx = mapx;
		this.mapy = mapy;
		this.mlevel = mlevel;
		this.modifiedtime = modifiedtime;
		this.readcount = readcount;
		this.sigungucode = sigungucode;
		this.tel = tel;
		this.title = title;
		this.zipcode = zipcode;
	}
}
