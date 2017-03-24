package com.banggood.dao;

import com.banggood.entity.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2017/3/23.
 */import org.springframework.boot.builder.SpringApplicationBuilder;


public interface GoodsDao {
    List<Goods> selectAll();

    Goods selectByKey(@Param("id") Long id);

    Goods findBookByName(@Param("name") String name);

    void insert(@Param("id") Long id, @Param("goodsName") String goodsName, @Param("stock") int stock, @Param("price") Double price);


    void updateByPrimaryKey(@Param("id") Long id, @Param("goodsName") String goodsName, @Param("stock") int stock, @Param("price") Double price);

    void delete(@Param("id") Long id);

}
