package com.tiandisifang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tiandisifang.model.Comments;

@Mapper//注解
public interface CommentsMapper {
	//获取论坛下回复信息
	//SELECT * FROM comments WHERE byforumid = '1';
	@Select("SELECT * FROM comments WHERE byforumid = #{byforumid} and commentsstate=1;")
	public List<Comments> searchByForumId(@Param("byforumid") Integer byforumid);
	//添加回复
	@Select("INSERT INTO comments(comments,byforumid,commentsstate,commentstime,commentsuser)VALUE(#{comments},#{byforumid},#{commentsstate},#{commentstime},#{commentsuser})")//INSERT INTO comments(comments,byforumid,commentsstate,commentstime,commentsuser)VALUES('测试回复','1','1','2018-12-06','鲤鱼');
	public List<Comments> addCommentsMapper(@Param("comments") String comments,@Param("byforumid") Integer byforumid,@Param("commentsstate") Integer commentsstate,@Param("commentstime") String commentstime,@Param("commentsuser") String commentsuser);
}
