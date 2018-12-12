package com.tiandisifang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiandisifang.mapper.BookMapper;
import com.tiandisifang.model.Book;

@Service
public class BookService {
	//依赖注入
	@Autowired 
	BookMapper bookMapper;
	//取出书本数据
	public List<Book> searchBookByTypes(Integer booktypes){//(int booktypes前端（controller层由前端拿来的）传来
		return bookMapper.searchBookByTypes(booktypes);
	}
	//书籍的删除
	public List<Book> upDateBookByStatesService(String states){
		return bookMapper.upDateBookByStatesMapper(states);
	}
	//书籍恢复
	public List<Book> upDateBookByStatesService2(String states){
		return bookMapper.upDateBookByStatesMapper2(states);
	}
	//录入书籍
	public List<Book> addBookService(String bookname,String bookinformation,Integer bookprice,Integer booktypes){
		return bookMapper.addBookMapper(bookname, bookinformation, bookprice, booktypes);
	}

}
