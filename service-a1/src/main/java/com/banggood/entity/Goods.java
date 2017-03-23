package com.banggood.entity;


/**
 * 商品实体
 * Created by sungang on 2016/10/21.
 */

public class Goods {


    private Long id;

    private String goodsName;

    private int stock;

    private Double price;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
