package cn.yd.yd.controller;

import cn.yd.yd.pojo.Message;
import cn.yd.yd.service.Dongtaiservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class dongtaicontroller {
    @Resource
    public Dongtaiservice dt;
    /*动态页面*/
    @RequestMapping("dongtai")
    public String dtlist(Model model){
        List<Message> list=dt.dongtailist();

        model.addAttribute("list",list);

        System.err.println("jdskafj卡就卡了进口发动机撒赖咖啡碱斯科拉积分官方的数据库连接即可");
        return "dongtai";
    }
}
