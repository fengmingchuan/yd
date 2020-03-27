package cn.yd.yd.controller;

import cn.yd.yd.pojo.Module;
import cn.yd.yd.service.shouyeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class shouyeController {
    @Resource
    public shouyeService sy;

    @RequestMapping("shouye")
    public String  userList(Model model){
        List<Module> sylist=sy.Modulelists();
        model.addAttribute("sylist",sylist);
        return  "shouye";
    }


}
