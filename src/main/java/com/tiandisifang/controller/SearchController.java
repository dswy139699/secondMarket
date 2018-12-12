package com.tiandisifang.controller;

import java.util.List;

import com.tiandisifang.interceptor.UnCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiandisifang.model.Book;
import com.tiandisifang.service.SearchService;

@RestController//表明这是个控制器
public class SearchController {
	@Autowired//依赖注入
	SearchService searchService;
	@UnCheck
	@RequestMapping(method = RequestMethod.POST,value = "searchBooksByBookname")
	public List<Book> getBooksByBookname(String bookname){
		//返回模糊查询结果
		return (List<Book>) searchService.searchBooksByBookName(bookname);
	}

}
