package com.tiandisifang.controller;

import java.util.List;

import com.tiandisifang.interceptor.UnCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiandisifang.model.Forum;
import com.tiandisifang.service.ForumService;

//@RestController//控制器
@RestController
public class ForumController {
	@Autowired//依赖注入
	ForumService forumService;
	//帖子展现
	@UnCheck
	@RequestMapping(method = RequestMethod.POST,value = "getForumBystate")
	public List<Forum> getForumBystate(Integer state){
		return forumService.searchForumByState(state);
	}
	//根据帖子楼层屏蔽
	@RequestMapping(method  = RequestMethod.POST,value = "updateforum")
	public List<Forum> updateForumByStates(Integer states){
		//return null;
		return forumService.updateForumService(states);
	}
	//根据帖子楼层解除屏蔽
	@RequestMapping(method = RequestMethod.POST,value = "updateforum2")
	public List<Forum> updateForumByStates2(Integer states){
		return forumService.updateForumService2(states);
	}
	//发帖
	@UnCheck
	@RequestMapping(method = RequestMethod.POST,value = "addforum")
	public List<Forum> addForum(String nickname,String content,String time,Integer state){
		return forumService.addForumService(nickname, content, time, state);
	}
	//暂无

}
