package com.banggood.dao.impl;

import com.banggood.dao.GoodsDao;
import com.banggood.entity.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2017/3/23.
 */
@Mapper
public interface GoodsDaoImpl extends GoodsDao{
    @Select("select * from t_goods ")
    public abstract List<Goods> selectAll();


    @Select("select * from t_goods where id = #{id}")
    Goods selectByKey(@Param("id") Long id);

    @Select("select * from t_goods where goodsName = #{name}")
    Goods findBookByName(@Param("name") String name);

    @Insert("insert into t_goods(id, goodsName, stock, price) values(#{id}, #{goodsName},#{stock}, #{price})")
    void insert(@Param("id") Long id, @Param("goodsName") String goodsName, @Param("stock") int stock, @Param("price") Double price);


    @Update("update t_goods set goodsName = #{goodsName}, stock = #{stock}, price = #{price} where id = #{id}")
    void updateByPrimaryKey(@Param("id") Long id, @Param("goodsName") String goodsName, @Param("stock") int stock, @Param("price") Double price);

    @Delete("delete from t_goods where id = #{id}")
    void delete(@Param("id") Long id);

}
