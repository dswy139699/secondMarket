package com.tiandisifang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiandisifang.mapper.CommentsMapper;
import com.tiandisifang.model.Comments;

@Service
public class CommentsService {
	//依赖注入
	@Autowired 
	CommentsMapper commentsMapper;
	//获取回复
	public List<Comments> searchbyforumid(Integer byforumid){
		return commentsMapper.searchByForumId(byforumid);
	}
	//添加回复
	public List<Comments> addCommentsService(String comments,Integer byforumid,Integer commentsstate,String commentstime,String commentsuser){
		return commentsMapper.addCommentsMapper(comments,byforumid,commentsstate,commentstime,commentsuser);
	}

}
