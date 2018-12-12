package com.tiandisifang.controller;

import java.lang.reflect.Method;
import java.util.List;

import com.tiandisifang.interceptor.UnCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiandisifang.model.Comments;
import com.tiandisifang.service.CommentsService;

@RestController//控制器
public class CommentsController {
	@Autowired//依赖注入
	CommentsService commentsService;
	//帖子回复展现
	@UnCheck
	@RequestMapping(method = RequestMethod.POST,value = "getbyforumid")
	public List<Comments> getForumCommentsByByforumid(Integer byforumid){
		return commentsService.searchbyforumid(byforumid);
	}
	//添加回复
	@UnCheck
	@RequestMapping(method = RequestMethod.POST,value = "addcomments")
	public List<Comments> addComments(String comments,Integer byforumid,Integer commentsstate,String commentstime,String commentsuser){
		return commentsService.addCommentsService(comments,byforumid,commentsstate,commentstime,commentsuser);

	}

}