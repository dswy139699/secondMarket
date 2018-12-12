package com.tiandisifang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiandisifang.mapper.SearchMapper;
import com.tiandisifang.model.Book;



@Service
public class SearchService {
	//依赖注入
	@Autowired 
	SearchMapper searchMapper;
	//取出书本数据
		public List<Book> searchBooksByBookName(String bookname){//(int booktypes前端（controller层由前端拿来的）传来
			return (List<Book>) searchMapper.searchBook("%"+bookname+"%");//%abc%
		}

}
