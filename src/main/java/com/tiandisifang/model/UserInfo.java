package com.tiandisifang.model;

public class UserInfo {
	private int id;
	private String username;
	private String password;
	private int state;
	private String sex;
	private String tel;
	private String personal;
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public UserInfo() {
		super();
		
	}
	
	public UserInfo(int id, String username, String password, int state,String sex,String tel,String personal) {
	    super();
	    this.id = id;
	    this.username = username;
	    this.password = password;
	    this.state = state;
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
	
	
	

}
