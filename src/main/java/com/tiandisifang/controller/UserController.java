package com.tiandisifang.controller;

import java.util.HashMap;
import java.util.List;

import com.tiandisifang.interceptor.UnCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiandisifang.model.UserInfo;
import com.tiandisifang.service.UserService;

@RestController//控制器
public class UserController {
	@Autowired//依赖注入
	UserService userService;
	//登陆验证
	@UnCheck
	@RequestMapping(method = RequestMethod.POST,value = "login")
	public HashMap<String, Object> login(String username,String password) {
		HashMap<String, Object>map = new HashMap<String, Object>();
		UserInfo user = userService.login(username, password);

		map.put("data",user);
		map.put("info","success");
		map.put("status","");
		if(user == null) {
			map.put("info","error");
		};
		return map;
	}
	//注册
	@RequestMapping(method = RequestMethod.POST,value = "register")
	public HashMap<String, Object> register(String username,String password) {
		HashMap<String, Object>map = new HashMap<String, Object>();
		String info = userService.register(username, password);
		map.put("info",info);
		return map;
	}
	//用户展示
	@UnCheck
	@RequestMapping(method = RequestMethod.POST,value = "usershowByState")
	public List<UserInfo> getUsershowByState(int state){
		return (List<UserInfo>) userService.usershow(state);
	}
	//用户锁定
	@RequestMapping(method = RequestMethod.POST,value = "updateuser")
	public List<UserInfo> upDateUserByUserName(String username){
		return (List<UserInfo>) userService.upDateUserByUserNameService(username);
	}
	//用户恢复
	@RequestMapping(method = RequestMethod.POST,value = "updateuser2")
	public List<UserInfo> upDateUserByUserName2(String username){
		return (List<UserInfo>) userService.upDateUserByUserNameService2(username);
	}
	

}
