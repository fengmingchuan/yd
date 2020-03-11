package cn.yd.yd.service;

import cn.yd.yd.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
      public List<User>  findList();//查询所有用户
}
