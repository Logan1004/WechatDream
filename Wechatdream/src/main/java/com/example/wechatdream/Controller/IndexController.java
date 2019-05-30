package com.example.wechatdream.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@EnableAutoConfiguration
public class IndexController {
    @RequestMapping(value = "/Index" , method = RequestMethod.GET)
    @ResponseBody
    public HashMap Hello(@RequestParam("name")String name){
        HashMap hashMap = new HashMap();
        hashMap.put("Hello",name);
        return hashMap;
    }

}
