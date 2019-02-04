package com.buongiorno.cat.microservices.tracking.model;

public class TrackingIn {
	private Integer id;
	private String data;
	
	
	public TrackingIn(Integer id, String data) {
		super();
		this.id = id;
		this.data = data;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
