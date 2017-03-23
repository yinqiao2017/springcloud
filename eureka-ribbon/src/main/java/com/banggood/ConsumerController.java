package com.banggood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/3/20.
 */
@RestController
public class ConsumerController {
    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method= RequestMethod.GET)
    public String add(){
        return computeService.addService();
    }
}
