package com.banggood;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/3/20.
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public List<Goods> selectAll() {
        return null;
    }
}
