package com.cskaoyan.service.plan;

import com.cskaoyan.bean.Manufacture;
import com.cskaoyan.bean.ManufactureExample;
import com.cskaoyan.mapper.ManufactureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufactureServiceImpl implements ManufactureService {
    @Autowired
    ManufactureMapper manufactureMapper;
    @Override
    public List<Manufacture> queryOrderByPageAndRows(int page, int rows) {
        ManufactureExample manufactureExample = new ManufactureExample();
        manufactureExample.createCriteria().andOrderIdIsNotNull();
        //        cOrderExample.createCriteria().andCustomIdBetween(String.valueOf((page-1)*rows),String.valueOf((rows+page-1)*rows));
        List<Manufacture> manufactures = manufactureMapper.selectByExample(manufactureExample);
        return manufactures;
    }
}
