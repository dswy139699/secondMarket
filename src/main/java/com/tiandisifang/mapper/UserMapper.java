package com.tiandisifang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tiandisifang.model.Book;
import com.tiandisifang.model.UserInfo;




@Mapper
public interface UserMapper {
	//登陆验证
	@Select("Select * From user_info where username = #{username} and password = #{password}")
	public UserInfo searchUser(@Param("username") String username,@Param("password") String password) ;
	//注册
	@Insert("insert into user_info(username,password)values(#{username},#{password});")
	public void registerUser(@Param("username") String username,@Param("password") String password);
	//注册验证
	@Select("Select * From user_info where username = #{username}")
	public UserInfo registeSearchUser(@Param("username") String username) ;
	//用户show
	@Select("Select * From user_info where state = #{state}")
	public List<UserInfo> usershow(@Param("state") int state) ;
	//用户状态更新
	@Select("UPDATE user_info SET state='2' WHERE username = #{username};")//锁定用户
	public List<UserInfo> upDateUserByUserNameMapper(@Param("username") String username);
	@Select("UPDATE user_info SET state='1' WHERE username = #{username};")//恢复用户
	public List<UserInfo> upDateUserByUserNameMapper2(@Param("username") String username);
	//
	
	
	
	
}
