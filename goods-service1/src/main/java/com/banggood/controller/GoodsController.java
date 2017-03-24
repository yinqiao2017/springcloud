package com.banggood.controller;

import com.alibaba.fastjson.JSON;
import com.banggood.entity.Goods;
import com.banggood.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
/**
 * Created by sungang on 2016/10/21.
 */

@RestController
@RequestMapping("/goods")
public class GoodsController {

    private final Logger log = LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    private GoodsService goodsService;

    @GetMapping
    public List<Goods> getGoods() {
        List<Goods> goodsList = goodsService.selectAll();
        log.info("查询所以商品："+JSON.toJSONString(goodsList));
        return goodsList;
    }

    @GetMapping("/{goods_id}")
    public Goods getGoodsById(@PathVariable("goods_id") Long goods_id) {
        Goods goods = goodsService.selectByKey(goods_id);
        log.info("以ID查询商品："+JSON.toJSONString(goods));
        return goods;
    }

    @PostMapping
    public void add(@RequestBody Goods goods) {

        log.info("添加商品："+JSON.toJSONString(goods));
        goodsService.insert(goods);
    }

    @DeleteMapping("/{goods_id}")
    public void delGoods(@PathVariable("goods_id") Long goods_id) {
        log.info("根据ID删除商品："+JSON.toJSONString(goodsService.selectByKey(goods_id)));
        goodsService.delete(goods_id);
    }

    @PutMapping("/{goods_id}")
    public void updateGoods(@RequestBody Goods goods) {

        log.info("修改商品："+JSON.toJSONString(goods));
        goodsService.updateByPrimaryKey(goods);
    }
}
