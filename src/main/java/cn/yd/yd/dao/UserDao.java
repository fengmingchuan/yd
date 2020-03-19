package cn.yd.yd.dao;

import cn.yd.yd.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<User,Long> {



}
