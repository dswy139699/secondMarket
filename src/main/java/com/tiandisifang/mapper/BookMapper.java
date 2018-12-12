package com.tiandisifang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tiandisifang.model.Book;

@Mapper//注解
public interface BookMapper {
	
	//图书信息
	//SELECT * FROM book WHERE booktypes = '1';
	@Select("SELECT * FROM book WHERE booktypes = #{booktypes};")
	public List<Book> searchBookByTypes(@Param("booktypes") Integer booktypes);
	//mybaits把传过来的参数与注解中的SQL语句进行拼接，拼完后访问数据库，从数据库获得结果集封装到list<Book>中,返回给BookService
	@Select("UPDATE book SET booktypes='3' WHERE bookname = #{states};")//下架
	public List<Book> upDateBookByStatesMapper(@Param("states") String states);
	@Select("UPDATE book SET booktypes='1' WHERE bookname = #{states};")//恢复上架
	public List<Book> upDateBookByStatesMapper2(@Param("states") String states);
	//添加书籍
	@Select("INSERT INTO book(bookname,bookinformation,bookprice,booktypes)VALUES(#{bookname},#{bookinformation},#{bookprice},#{booktypes});")//INSERT INTO book (bookname,bookinformation,bookprice,booktypes)VALUES('《骆驼祥子》','一本描述底层社会人物的好书！八成新。','129',1);
	public List<Book> addBookMapper(@Param("bookname") String bookname,@Param("bookinformation") String bookinformation,@Param("bookprice") Integer bookprice,@Param("booktypes") Integer booktypes);
}
