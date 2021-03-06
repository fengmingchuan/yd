package cn.yd.yd.controller;

import cn.yd.yd.pojo.Message;
import cn.yd.yd.pojo.User;
import cn.yd.yd.service.UserService;
import cn.yd.yd.service.imple.uploadserviceImpl;
import cn.yd.yd.service.uploadservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@Controller
public class UserController {
@Resource
    public uploadservice us;
    @Resource
    private UserService userService;
    @RequestMapping("/index")
    public   String  userList(){
        return  "index";
    }

    @RequestMapping(value = "upload",method = RequestMethod.POST)
    public   String  upload(@RequestParam(value = "file", required = false) MultipartFile multipartFile, HttpServletRequest servletRequest, String message_title) throws IOException {

       String path ="D:/upload/images";
       if (multipartFile.getSize()>0){
           String savepath ="D:/upload/images";
           String  fileName = multipartFile.getOriginalFilename();//获取文件名称
           File file = new File(savepath,fileName);
           if (fileName.endsWith("mp4")|| fileName.endsWith("wmv")){
                multipartFile.transferTo(file);
                Message message = new Message();
                message.setMessage_date(new Date());
                message.setUser_id(1L);
                message.setMessage_title(message_title);
                message.setMessage_text(path+"/"+fileName);
                System.out.println("路径"+path+"/"+fileName);
               int i = us.insertMessage(message);
               if (i>0){
                   return "index";
               }
           } else {
               return  "error";
           }
       }else {
           return  "error";
       }
       return  "index";
    }


    //首页
    @RequestMapping("/firstn")
    public String firstn(){

        return "firstn";
    }
    //进入登录页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    //登录判断
    @RequestMapping("/logins")
    public String login(String user_name,String user_pwd){
        System.out.println("123");
        User user = userService.selectUserNameAndUserPwdLogin(user_name, user_pwd);

        if(user!=null){

            return "/index";
        }
        System.out.println("456");
        return "register";
    }
    //注册页面
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    //注册判断
    @RequestMapping("/regters")
    public String regters(User user){
        User user2=userService.selectUsername(user.getUser_name());
        if(user2!=null){
            return "redirect:register";
        }else{
            int count=userService.insertUserinfo(user);
            if(count>0){
                return "firstn";
            }
        }
        return "login";
    }
    //个人信息
    @RequestMapping("/userinfo/{id}")
    public String userinfo(@PathVariable int id, Model model ) {
        User user =userService.UserInfoById(id);
        model.addAttribute("user", user);

        return "userinfo";
    }




}
