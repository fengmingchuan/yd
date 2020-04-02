package cn.yd.yd.dao;

import cn.yd.yd.pojo.Message;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


@Component
public interface videoMapper  {
    public  Message selectByUserId(@Param("id") Long id);
}
