package com.banggood;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2017/3/22.
 */
@Mapper
public interface BookMapper {

    @Select("select * from book ")
    List<Book> findAll();

    @Select("select * from book where id = #{id}")
    Book findBookById(@Param("id") Integer id);

    @Select("select * from book where name = #{name}")
    Book findBookByName(@Param("name")String name);

    @Insert("insert into book(id, name, price) values(#{id}, #{name}, #{price})")
    void saveBook(@Param("book") Book book);


    @Update("update book set name = #{name}, price = #{price} where id = #{id}")
    void updateBook(@Param("book") Integer id, String name, Integer price);

    @Delete("delete from book where id = #{id}")
    void deleteBook(@Param("id")Integer id);


}
