package cn.yd.yd.service.imple;



import cn.yd.yd.dao.uploadMapper;
import cn.yd.yd.pojo.Message;
import cn.yd.yd.service.uploadservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("uploadservice")
public class uploadserviceImpl implements uploadservice {
    @Resource
    uploadMapper um;

    @Override
    public int insertMessage(Message message) {
        if (um==null){
            System.err.println("sdkajfljfla金克拉健康法撒旦JFK");
        }
       return  um.addMessage(message);
    }
}
