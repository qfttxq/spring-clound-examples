package com.example.demo.web;

import com.example.demo.feign.Service1FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/23 0023.
 */
@RestController
public class WelcomeController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private Service1FeignClient service1FeignClient;

    @RequestMapping("welcome")
    public List<String> welcome(@RequestParam(value="name",required = false) String name){
        String ribbonRet =  restTemplate.getForObject("http://service1/hi?name="+name,String.class)+" welcome! ribbon";
        String feignRet = service1FeignClient.hi(name)+" welcome! feign";
        List<String> list = new ArrayList<String>();
        list.add(ribbonRet);
        list.add(feignRet);
        return list;
    }
}
