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
        return goodsList;
    }

    @GetMapping("/{goods_id}")
    public Goods getGoodsById(@PathVariable("goods_id") Long goods_id) {
        Goods goods = goodsService.selectByKey(goods_id);
        log.info(JSON.toJSONString(goods));
        return goods;
    }

    /**
     * 商品添加
     *
     * @param goods
     * @return
     */
    @PostMapping
    public void add(@RequestBody Goods goods) {
            goodsService.insert(goods);
    }

    @DeleteMapping("/{goods_id}")
    public void delGoods(@PathVariable("goods_id") Long goods_id) {
        goodsService.delete(goods_id);
    }

    @PutMapping("/{goods_id}")
    public void updateGoods(@PathVariable("goods_id") Long goods_id, @RequestBody Goods goods) {
            goodsService.updateByPrimaryKey(goods);
    }
}
