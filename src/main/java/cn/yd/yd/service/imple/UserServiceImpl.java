package cn.yd.yd.service.imple;

import cn.yd.yd.dao.UserDao;
import cn.yd.yd.pojo.User;
import cn.yd.yd.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public List<User> findList() {
        return userDao.findAll();
    }
}
