package com.tiandisifang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tiandisifang.model.Book;


//书籍搜索
@Mapper
public interface SearchMapper {
	//书籍搜索
	@Select("Select * From book where bookname LIKE #{bookname}")//Select * From book where bookname LIKE '%史%';
	public List<Book> searchBook(@Param("bookname") String bookname) ;//
		
		
		
}
