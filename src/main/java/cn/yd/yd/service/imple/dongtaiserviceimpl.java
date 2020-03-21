package cn.yd.yd.service.imple;

import cn.yd.yd.dao.DongtaiMapper;

import cn.yd.yd.pojo.Message;
import cn.yd.yd.service.Dongtaiservice;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service("Dongtaiservice")
public class dongtaiserviceimpl implements Dongtaiservice {
    @Resource
    public DongtaiMapper dt;

    @Override
    public List<Message> dongtailist() {
        return dt.dtlist();
    }
}
