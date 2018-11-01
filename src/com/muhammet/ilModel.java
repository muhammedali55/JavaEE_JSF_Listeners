package com.muhammet;

public class ilModel {

	private int id;
	private String ad;
	
	public ilModel() {
		
	}
	
	public ilModel(int id, String ad) {
		this.id = id;
		this.ad = ad;
	}
	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	
}
