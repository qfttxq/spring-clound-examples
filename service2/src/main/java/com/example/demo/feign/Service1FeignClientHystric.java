package com.example.demo.feign;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/23 0023.
 */
@Component
public class Service1FeignClientHystric implements Service1FeignClient  {

    public String hi(String name){
        return "hi,"+name+" feign error!";
    }
}
