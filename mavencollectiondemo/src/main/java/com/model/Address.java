package com.model;

public class Address {
	private int homeNum;
	private String street;
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getHomeNum() {
		return homeNum;
	}

	public void setHomeNum(int homeNum) {
		this.homeNum = homeNum;
	}

	public Address() {
		super();
	}
	
	public Address(int homeNum,String street,String city) {
		this.homeNum=homeNum;
		this.city=city;
		this.street=street;
	}
}
