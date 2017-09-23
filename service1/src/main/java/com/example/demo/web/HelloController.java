package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/9/23 0023.
 */
@RestController
public class HelloController {

    @RequestMapping("hi")
    public String hi(@RequestParam(value="name",required = false) String name, HttpServletRequest request){
        int port = request.getServerPort();
        return "hi,"+name+" "+port;
    }
}
