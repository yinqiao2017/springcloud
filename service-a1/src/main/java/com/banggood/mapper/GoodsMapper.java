package com.banggood.mapper;

import com.banggood.entity.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2017/3/23.
 */
@Mapper
public interface GoodsMapper {
    @Select("select * from t_goods ")
    List<Goods> selectAll();

    @Select("select * from t_goods where id = #{id}")
    Goods selectByKey(@Param("id") Long id);

    @Select("select * from t_goods where goodsname = #{name}")
    Goods findBookByName(@Param("name")String name);

    @Insert("insert into t_goods(id, goodsname, stock, price) values(#{id}, #{name},#{stock}, #{price})")
    void insert(@Param("goods") Goods goods);


    @Update("update book set goodsname = #{name}, stock = #{stock}, price = #{price} where id = #{id}")
    void updateByPrimaryKey(@Param("goods") Goods goods);

    @Delete("delete from book where id = #{id}")
    void delete(@Param("id")Long id);

}
