package com.banggood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * Created by Administrator on 2017/3/20.
 */
@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    public List<Goods> selectAll() {
        return computeClient.selectAll();
    }
}
