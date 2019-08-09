package com.cskaoyan.service.plan;

import com.cskaoyan.bean.COrder;
import com.cskaoyan.bean.COrderExample;
import com.cskaoyan.mapper.COrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class COrderServiceImpl implements COrderService{
    @Autowired
    COrderMapper corderMapper;
    @Override
    public List<COrder> queryOrderByPageAndRows(int page, int rows) {
        COrderExample cOrderExample = new COrderExample();
        cOrderExample.createCriteria().andOrderIdIsNotNull();
        //        cOrderExample.createCriteria().andCustomIdBetween(String.valueOf((page-1)*rows),String.valueOf((rows+page-1)*rows));
        List<COrder> cOrders = corderMapper.selectByExample(cOrderExample);
        return cOrders;
    }
}
