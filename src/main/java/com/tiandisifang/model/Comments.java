package com.tiandisifang.model;

public class Comments {
	private int id;
	private String comments;
	private String byforumid;
	private int commentsstate;
	private String commentstime;
	private String commentsuser;




	public String getCommentstime(){
		return commentstime;
	}
	public void  setCommentstime(String commentstime){
		this.commentstime = commentstime;
	}

	public String getCommentsuser(){
		return commentsuser;
	}
	public void  setCommentsuser(String commentsuser){
		this.commentsuser = commentsuser;
	}

	public int getCommentsstate() {
		return commentsstate;
	}
	public void setCommentsstate(int commentsstate) {
		this.commentsstate = commentsstate;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getByforumid() {
		return byforumid;
	}
	public void setByforumid(String byforumid) {
		this.byforumid = byforumid;
	}
	public Comments(int id, int commentsstate,String comments, String byforumid,String commentstime,String commentsuser) {
		super();
		this.id = id;
		this.commentsstate = commentsstate;
		this.comments = comments;
		this.byforumid = byforumid;
	}
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
