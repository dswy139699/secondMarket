package com.tiandisifang.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiandisifang.mapper.UserMapper;
import com.tiandisifang.model.Book;
import com.tiandisifang.model.UserInfo;

@Service
public class UserService {

	private List<UserInfo>users = new ArrayList<>();

	public UserInfo getUserInfo(String token){
		if(token == null){
			return null;
		}
		for(UserInfo u:users){
			if(u.getToken().equals(token)){
				return u;
			}
		}
		return null;
	}
	//登陆验证
	@Autowired 
	UserMapper userMapper;
	public UserInfo login(String username,String password) {
		UserInfo u =userMapper.searchUser(username, password);
		u.setPassword(null);
		String uuid = UUID.randomUUID().toString().replace("-", "");
		System.out.println(uuid);
		u.setToken(uuid);
		users.add(u);
		return u;
	}
	
	//注册
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public String register(String username,String password) {
		//注册验证
		userMapper.searchUser(username,password);//
		UserInfo userinfo = userMapper.registeSearchUser(username);
		if(userinfo == null) {//如果查询的返回值为空，没此用户，则可以注册
			 userMapper.registerUser(username, password);
			 return "success";
		}else {//否则传error
			return "error";
		}
		
		 
	}
	//用户show
	public List<UserInfo> usershow(int state) {
		return userMapper.usershow(state);
	}
	//用户锁定
	public List<UserInfo> upDateUserByUserNameService(String username){
		return userMapper.upDateUserByUserNameMapper(username);
	}
	//用户恢复
	public List<UserInfo> upDateUserByUserNameService2(String username){
		return userMapper.upDateUserByUserNameMapper2(username);
	}

}
