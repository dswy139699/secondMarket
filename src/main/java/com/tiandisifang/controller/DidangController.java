package com.tiandisifang.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiandisifang.model.DingDan;
import com.tiandisifang.service.DingDanService;

@RestController//表明这是个控制器


@CrossOrigin("http://127.0.0.1:8020")
public class DidangController {//http://localhost:8080/hi
	
	@Autowired//依赖注入
	private DingDanService dingdanService;
	
	@RequestMapping(method = RequestMethod.POST,value = "dingdans")
	
	public List<DingDan> dingdans1() {
		dingdanService.dingdancr();
		return null ;
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value = "dingdans")
	
	public List<DingDan> dingdans2() {
		return  dingdanService.getAllDingDan();
	}
	///////////////////////////////////////////////////////////////
	@RequestMapping(method = RequestMethod.GET,value = "{id}")
	public DingDan dingdans3(@PathVariable String id) {
		return  dingdanService.getDingDanByid(id);
	}
}
