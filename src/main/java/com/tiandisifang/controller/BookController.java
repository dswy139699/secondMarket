package com.tiandisifang.controller;

import java.util.List;

import com.tiandisifang.interceptor.UnCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiandisifang.service.BookService;
import com.tiandisifang.model.Book;

@RestController//表明这是个控制器
public class BookController {
	@Autowired//依赖注入
	BookService bookService;
	//根据类型获取书本信息
	@UnCheck
	@RequestMapping(method = RequestMethod.POST,value = "getBookByTypes")
	public List<Book> getBookByTypes(Integer booktypes){
		//System.out.print(bookService.searchBookByTypes(booktypes));用于查看输出的测试
		return bookService.searchBookByTypes(booktypes);
	}
             //前端请求传一个booktypes就如(Integer booktypes),给到BookService,
	//下架书籍
	@RequestMapping(method = RequestMethod.POST,value = "updatebook")
	public List<Book> upDateBookByStates(String states){
		return bookService.upDateBookByStatesService(states);
	}
	//恢复上架书籍
	@RequestMapping(method = RequestMethod.POST,value = "updatebook2")
	public List<Book> upDateBookByStates2(String states){
		return bookService.upDateBookByStatesService2(states);
	}
	//录入书籍
	@RequestMapping(method = RequestMethod.POST,value = "addbook")
	public List<Book> addBook(String bookname,String bookinformation,Integer bookprice,Integer booktypes){
		return bookService.addBookService(bookname, bookinformation, bookprice, booktypes);
	}
}
