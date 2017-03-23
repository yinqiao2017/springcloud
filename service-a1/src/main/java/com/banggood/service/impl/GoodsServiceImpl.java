package com.banggood.service.impl;

import com.banggood.entity.Goods;
import com.banggood.mapper.GoodsMapper;
import com.banggood.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/3/23.
 */
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    protected GoodsMapper goodsMapper;

    @Override
    public Goods selectByKey(Long key) {
        return goodsMapper.selectByKey(key);
    }

    @Override
    public List<Goods> selectAll() {
        return goodsMapper.selectAll();
    }

    @Override
    public void insert(Goods goods) {
         goodsMapper.insert(goods);
    }

    @Override
    public void updateByPrimaryKey(Goods goods) {
        goodsMapper.updateByPrimaryKey(goods);
    }

    @Override
    public void delete(Long id) {
        goodsMapper.delete(id);
    }
}
