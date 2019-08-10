package com.cskaoyan.service.LJG.customservice;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.bean.CustomExample;
import com.cskaoyan.mapper.CustomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LjgCustomServiceImpl implements LjgCustomService {
    @Autowired
    CustomMapper customMapper;
    @Override
    public List<Custom> queryAllCustom() {
        CustomExample customExample = new CustomExample();
        customExample.createCriteria().andCustomIdIsNotNull();
        List<Custom> customs = customMapper.selectByExample(customExample);
        return customs;
    }
}
