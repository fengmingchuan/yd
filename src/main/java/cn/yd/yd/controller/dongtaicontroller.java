package cn.yd.yd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dongtaicontroller {
    @RequestMapping("/")
    public   String  userList(){
        return  "shouye";
    }
}
