package com.cskaoyan.service.plan;

import com.cskaoyan.bean.COrder;
import com.cskaoyan.bean.Custom;
import com.cskaoyan.bean.CustomExample;
import com.cskaoyan.mapper.CustomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomServiceImpl implements CustomService {
    @Autowired
    CustomMapper customMapper;
    @Override
    public List<Custom> queryOrderByPageAndRows(int page, int rows) {
        CustomExample customExample = new CustomExample();
        customExample.createCriteria().andCustomIdIsNotNull();
        //        cOrderExample.createCriteria().andCustomIdBetween(String.valueOf((page-1)*rows),String.valueOf((rows+page-1)*rows));
        List<Custom> customs = customMapper.selectByExample(customExample);
        return customs;
    }
}
