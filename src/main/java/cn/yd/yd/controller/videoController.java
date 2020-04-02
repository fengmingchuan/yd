package cn.yd.yd.controller;

import cn.yd.yd.pojo.Message;
import cn.yd.yd.service.videoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/video")
public class videoController {
    @Autowired
    private videoService cs;

    @GetMapping("/info")
    public  String info(Long id, Model model){

        Message message = cs.findMessage(1l);
        model.addAttribute("sum",message);
        System.out.println("look"+message.getMessage_look());
        return "firstn";
    }
}
