package com.tiandisifang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tiandisifang.model.Order;

@Mapper
public interface OrderMapper {
	//订单展示
	@Select("SELECT * FROM order_info WHERE state = #{state}")//SELECT * FROM order_info WHERE state = '1';
	public List<Order> showOrderByStateMapper(@Param("state") Integer state);
	//订单的管理-订单删除
	@Select("UPDATE order_info SET state = '2' WHERE id = #{bianhao};")//UPDATE order_info SET state = '2' WHERE id = '1';
	public List<Order> upDateOrderByBianHaoMapper(@Param("bianhao") Integer bianhao);
	//订单的管理-订单恢复
	@Select("UPDATE order_info SET state = '1' WHERE id = #{bianhao};")//UPDATE order_info SET state = '2' WHERE id = '1';
	public List<Order> upDateOrderByBianHaoMapper2(@Param("bianhao") Integer bianhao);

}
