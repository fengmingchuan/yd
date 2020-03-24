package cn.yd.yd.service;

import cn.yd.yd.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    //注册时查询用户名是否存在
    User selectUsername(@Param("user_name") String user_name);
    //判断用户名密码是否正确
    User selectUserNameAndUserPwdLogin(@Param("user_name") String user_name,@Param("user_pwd") String user_pwd);
    //注册
    int insertUserinfo(User user);
    //根据用户Id查询用户信息
    User UserInfoById(int user_id);
}
