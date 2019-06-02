package com.example.wechatdream.controller;

import com.example.wechatdream.domain.Class;
import com.example.wechatdream.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Component
@RestController
public class ClassController {
    @Autowired
    private ClassService classService;

    @RequestMapping(value = "/getAllClasses", method = RequestMethod.POST)
    @ResponseBody
    public ArrayList<Class> getAllClasses(){
        ArrayList<Class> classes = classService.getClassList();
        return classes;
    }
}
