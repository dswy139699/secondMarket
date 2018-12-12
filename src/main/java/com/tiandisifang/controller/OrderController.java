package com.tiandisifang.controller;

import java.util.List;

import com.tiandisifang.interceptor.UnCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiandisifang.model.Order;
import com.tiandisifang.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;
	//展示所有订单
	@UnCheck
	@RequestMapping(method = RequestMethod.POST,value = "showOrderByState")
	public List<Order> showOrderByState(Integer state){
		return orderService.showOrderByStateService(state);
	}
	//订单管理-订单删除
	@RequestMapping(method = RequestMethod.POST,value = "updateorder")
	public List<Order> upDateOrderByBianHao(Integer bianhao){
		return orderService.upDateOrderByBianHaoService(bianhao);
	}
	//订单管理-订单恢复
	@RequestMapping(method = RequestMethod.POST,value = "updateorder2")
	public List<Order> upDateOrderByBianHao2(Integer bianhao){
		return orderService.upDateOrderByBianHaoService2(bianhao);
	}

}
