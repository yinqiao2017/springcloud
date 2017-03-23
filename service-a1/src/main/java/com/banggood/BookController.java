package com.banggood;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/20.
 */
@RestController
public class BookController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private BookMapper bookMapper;

    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/findall" , method = RequestMethod.GET)
    @ResponseBody
    public List<Book> findAll(){
        List<Book> listBook = bookMapper.findAll();
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        //logger.info("/find,host:"+serviceInstance.getHost()+";service_id:"+serviceInstance.getServiceId()+";result:"+"书号："+book.getId()+";书名："+book.getName()+";价格："+book.getPrice());
        return listBook;
    }

    @RequestMapping(value = "/find" , method = RequestMethod.GET)
    @ResponseBody
    public Book find(@RequestParam String name){
        Book book = bookMapper.findBookByName(name);
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("/find,host:"+serviceInstance.getHost()+";service_id:"+serviceInstance.getServiceId()+";result:"+"书号："+book.getId()+";书名："+book.getName()+";价格："+book.getPrice());
        return book;
    }

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    @ResponseBody
    public Book save(@RequestParam Book book){
        bookMapper.saveBook(book);
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("/find,host:"+serviceInstance.getHost()+";service_id:"+serviceInstance.getServiceId()+";result:"+"书号："+book.getId()+";书名："+book.getName()+";价格："+book.getPrice());
        return book;
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    @ResponseBody
    public Book update(@RequestParam Integer id, @RequestParam String name,  @RequestParam Integer price){
        bookMapper.updateBook(id, name, price);
        Book book =bookMapper.findBookById(id);
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("/find,host:"+serviceInstance.getHost()+";service_id:"+serviceInstance.getServiceId()+";result:"+"书号："+book.getId()+";书名："+book.getName()+";价格："+book.getPrice());
        return book;
    }

    @RequestMapping(value = "/delete" , method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@RequestParam Integer id){
        Book book =bookMapper.findBookById(id);
        bookMapper.deleteBook(id);
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("/find,host:"+serviceInstance.getHost()+";service_id:"+serviceInstance.getServiceId()+";result:"+"书号："+book.getId()+";书名："+book.getName()+";价格："+book.getPrice());
    }
}
