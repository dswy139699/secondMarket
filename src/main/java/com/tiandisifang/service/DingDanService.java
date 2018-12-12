package com.tiandisifang.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tiandisifang.model.DingDan;

@Service
public class DingDanService {

	private ArrayList<DingDan> dingdans =  new ArrayList<DingDan>();
	
	public List<DingDan> getAllDingDan(){
		return dingdans;
	}
	public void  dingdancr(){
		System.out.print(dingdans);
		dingdans.add(new DingDan(5,"5"));
		dingdans.add(new DingDan(4,"4"));
		dingdans.add(new DingDan(3,"3"));
		dingdans.add(new DingDan(2,"2"));
		dingdans.add(new DingDan(1,"1"));
	}
	public DingDan getDingDanByid(String id) {
	//	double d[]=new double[10];
		Integer ids = Integer.valueOf(id);
		for(int i = 0;i < dingdans.size();i++) {
			DingDan dd = dingdans.get(i);
			if(dd.getId()== ids) {
				return dd;
			}
		}
		return null;
	}
	
}
