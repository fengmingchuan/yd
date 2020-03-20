package cn.yd.yd.service.imple;

import cn.yd.yd.dao.UserDao;
import cn.yd.yd.pojo.User;
import cn.yd.yd.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {


    @Resource
    private UserDao userDao;


    @Override
    public User selectUsername(String user_name) {
        return userDao.selectUsername(user_name);
    }

    @Override
    public User selectUserNameAndUserPwdLogin(String user_name, String user_pwd) {
        return userDao.selectUserNameAndUserPwdLogin(user_name,user_pwd);
    }

    @Override
    public int insertUserinfo(User user) {
        return userDao.insertUserinfo(user);
    }
}


