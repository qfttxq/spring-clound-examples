package com.example.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/9/23 0023.
 */
@Component
@FeignClient("service1")//要调用的服务名
public interface Service1FeignClient {

    @RequestMapping("hi")//映射路径与被调用方保持一致，包括参数配置全部保持一致
    String hi(@RequestParam(value = "name",required = false) String name);
}
