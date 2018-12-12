package com.tiandisifang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tiandisifang.model.Book;
import com.tiandisifang.model.Forum;

@Mapper//注解
public interface ForumMapper {
	//获取论坛信息
	//SELECT * FROM forum WHERE state = '1';
	@Select("SELECT * FROM forum WHERE state = #{state};")
	public List<Forum> searchForumState(@Param("state") Integer state);
//	@Select("SELECT * FORM form WHERE state = #{state};")
//	public List<Foorm> guanliform()
	//更新论坛数据库:屏蔽楼层
	@Select("UPDATE forum SET state='2' WHERE id = #{states};")//UPDATE forum SET state='2' WHERE id = 1;
	public List<Forum> updateForumMapper(@Param("states") Integer states);
	//更新2:恢复楼层
	@Select("UPDATE forum SET state='1' WHERE id = #{states};")//UPDATE forum SET state='2' WHERE id = 1;
	public List<Forum> updateForumMapper2(@Param("states") Integer states);
	//发表帖子（楼层）
	@Select("INSERT INTO forum(nickname,content,time,state)VALUES(#{nickname},#{content},#{time},#{state})")//INSERT INTO forum(nickname,content,time,state)VALUES('鲤鱼','《琅琊榜》最爱！','2018/12/05',1);
	public List<Forum> addForumMapper(@Param("nickname") String nickname,@Param("content") String content,@Param("time") String time,@Param("state") Integer state);
}
