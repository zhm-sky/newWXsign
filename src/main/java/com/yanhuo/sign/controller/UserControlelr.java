package com.yanhuo.sign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 烟火（yanhuo@maihaoche.com）
 * @version V1.0
 * @Description: TODO
 * @date 2018/4/14 下午1:15
 */
@Controller
public class UserControlelr {



    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }


    @RequestMapping(value = "/sign",method = RequestMethod.GET)
    public String sign(){
        return "teacherSign";
    }
}
