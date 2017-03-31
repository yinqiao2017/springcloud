package com.banggood.service.impl;

import com.banggood.common.datasource.TargetDataSource;
import com.banggood.dao.GoodsDao;
import com.banggood.entity.Goods;
import com.banggood.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/23.
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    protected GoodsDao goodsDao;

    @Override
    public Goods selectByKey(Long key) {
        return goodsDao.selectByKey(key);
    }

    @Override
    public List<Goods> selectAll() {
        return goodsDao.selectAll();
    }

    @Override
    @TargetDataSource(name = "ds1")
    public void insert(Goods goods) {
        goodsDao.insert(goods.getId(),goods.getGoodsName(),goods.getStock(),goods.getPrice());
    }

    @Override
    @TargetDataSource(name = "ds1")
    public void updateByPrimaryKey(Goods goods) {

        goodsDao.updateByPrimaryKey(goods.getId(),goods.getGoodsName(),goods.getStock(),goods.getPrice());
    }

    @Override
    @TargetDataSource(name = "ds1")
    public void delete(Long id) {
        goodsDao.delete(id);
    }
}
