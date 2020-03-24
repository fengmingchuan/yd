package cn.yd.yd.dao;

import cn.yd.yd.pojo.Message;

import java.util.List;
public interface DongtaiMapper {
    /*查询所有用户的动态*/
    List<Message> dtlist();
}
