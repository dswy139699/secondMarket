package com.tiandisifang.model;

import java.util.List;

public class Forum {
	private int id;
	private String nickname;
	private String content;
	private String time;
	private int state;
	private List<Comments> commentsList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public List<Comments> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<Comments> commentsList) {
		this.commentsList = commentsList;
	}

	public Forum(int id, String nickname, String content, String time, int state) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.content = content;
		this.time = time;
		this.state = state;
	}
	public Forum() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
