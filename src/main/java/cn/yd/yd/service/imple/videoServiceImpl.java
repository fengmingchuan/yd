package cn.yd.yd.service.imple;

import cn.yd.yd.dao.videoMapper;
import cn.yd.yd.pojo.Message;
import cn.yd.yd.service.videoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class videoServiceImpl implements videoService {
    @Autowired
    public videoMapper vm;


    @Override
    public Message findMessage(long id) {
        Message message = vm.selectByUserId(id);
        return message;
    }
}
