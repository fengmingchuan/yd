package cn.yd.yd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class UserController {
    @RequestMapping("/")
    public   String  userList(){
        return  "index";
    }


    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public  String   upload(@RequestParam(value = "file", required = false) MultipartFile multipartFile, HttpServletRequest request, ModelMap map) throws IOException {
           if (multipartFile.getSize()>0){
               System.out.println("wenjiadsffsdgagdsgsgsg");
         String path = "D:/upload/images";
         String fileName= multipartFile.getOriginalFilename();//德赛文件名称
               if (fileName.endsWith("mp4")){
                   File  file = new File(path,fileName);
                  multipartFile.transferTo(file);

               }else {
                   return  "error";
               }
           }else{
               return  "error";
           }
return  "index";
    }

}
