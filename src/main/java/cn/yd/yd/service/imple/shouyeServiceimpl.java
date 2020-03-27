package cn.yd.yd.service.imple;

import cn.yd.yd.dao.shouyeMapper;


import cn.yd.yd.pojo.Module;
import cn.yd.yd.service.shouyeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("shouyeService")
public class shouyeServiceimpl implements shouyeService {
    @Resource
    public shouyeMapper sy;

    @Override
    public List<Module> Modulelists() {
        return sy.Modulelist();
    }
}
