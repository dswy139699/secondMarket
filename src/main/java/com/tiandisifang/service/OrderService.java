package com.tiandisifang.service;

import java.util.List;

import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiandisifang.mapper.OrderMapper;
import com.tiandisifang.model.Order;

@Service
public class OrderService {
	@Autowired//依赖注入
	OrderMapper orderMapper;
	//订单展示
	public List<Order> showOrderByStateService(Integer state){
		return (List<Order>) orderMapper.showOrderByStateMapper(state);
	}
	//订单管理-订单删除
	public List<Order> upDateOrderByBianHaoService(Integer bianhao){
		return (List<Order>) orderMapper.upDateOrderByBianHaoMapper(bianhao);
	}
	//订单管理-订单恢复
	public List<Order> upDateOrderByBianHaoService2(Integer bianhao){
		return (List<Order>) orderMapper.upDateOrderByBianHaoMapper2(bianhao);
	}

}
