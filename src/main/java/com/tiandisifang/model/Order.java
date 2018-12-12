package com.tiandisifang.model;

public class Order {
	private int id;
	private String content;
	private String time;
	private int state;
	private String masterby;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMasterby() {
		return masterby;
	}
	public void setMasterby(String masterby) {
		this.masterby = masterby;
	}
	public Order(int id, String content, String time, int state, String masterby) {
		super();
		this.id = id;
		this.content = content;
		this.time = time;
		this.state = state;
		this.masterby = masterby;
	}
	
	
	
	

}
