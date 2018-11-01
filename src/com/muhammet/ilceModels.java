package com.muhammet;

public class ilceModels {

	private int id;
	private int ilid;
	private String ad;
	public ilceModels() {
		
	}
	public ilceModels(int id,int ilid, String ad) {
		this.id = id;
		this.ilid = ilid;
		this.ad = ad;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIlid() {
		return ilid;
	}
	public void setIlid(int ilid) {
		this.ilid = ilid;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	
}
