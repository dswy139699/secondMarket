package com.tiandisifang.service;

import java.util.List;

import com.tiandisifang.model.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiandisifang.mapper.ForumMapper;
import com.tiandisifang.model.Forum;

@Service
public class ForumService {
	//依赖注入
	@Autowired 
	ForumMapper forumMapper;
	@Autowired
	CommentsService commentsService;
	//论坛楼层信息展现
	public List<Forum> searchForumByState(Integer state){
		List<Forum> forumList = forumMapper.searchForumState(state);
		for(int i = 0 ; i < forumList.size() ; i ++ ){
			Forum forum = forumList.get(i);
			int forumId = forum.getId();
			List<Comments> comments = commentsService.searchbyforumid(forumId);
			System.out.println(comments);
			forum.setCommentsList(comments);
		}

		return forumList;
	}
	//违规楼层屏蔽
	public List<Forum> updateForumService(Integer states){
		return forumMapper.updateForumMapper(states);
	}
	//解除屏蔽
	public List<Forum> updateForumService2(Integer states){
		return forumMapper.updateForumMapper2(states);
	}
	//发帖
	public List<Forum> addForumService(String nickname,String content,String time,Integer state){
		return forumMapper.addForumMapper(nickname, content, time, state);
	}
}