package cn.yd.yd.controller;

import cn.yd.yd.pojo.Message;
import cn.yd.yd.service.imple.uploadserviceImpl;
import org.springframework.stereotype.Controller;
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
    public uploadserviceImpl us;

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
}
