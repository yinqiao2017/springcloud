package com.banggood.service;

import com.banggood.entity.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sungang on 2016/10/21.
 */

public interface GoodsService {


    /**
     * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
     *
     * @param key
     * @return
     */
    Goods selectByKey(Long key);

    /**
     * 查询全部结果，select(null)方法能达到同样的效果
     *
     * @return
     */
    List<Goods> selectAll();

    /**
     * 保存一个实体，null的属性也会保存，不会使用数据库默认值
     *
     * @param goods
     * @return
     */
    void  insert(Goods goods);

    /**
     * 根据主键更新实体全部字段，null值会被更新
     *
     * @param goods
     * @return
     */
    void updateByPrimaryKey(Goods goods);

    /**
     * 根据实体属性作为条件进行删除，查询条件使用等号
     *
     * @param id
     * @return
     */
    void delete(Long id);
}
