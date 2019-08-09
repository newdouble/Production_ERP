package com.cskaoyan.service.qualify;


import com.cskaoyan.bean.UnqualifyApply;
import com.cskaoyan.bean.UnqualifyApplyExample;
import com.cskaoyan.mapper.UnqualifyApplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UnqualifyServiceImpl implements UnqualifyService {

    @Autowired
    UnqualifyApplyMapper unqualifyApplyMapper;


    @Override
    public List<UnqualifyApply> queryAllUnQualify() {

        UnqualifyApplyExample unqualifyApplyExample = new UnqualifyApplyExample();
        unqualifyApplyExample.createCriteria().andAssemblyDateIsNotNull();
        List<UnqualifyApply> unqualifyApplies = unqualifyApplyMapper.selectByExample(unqualifyApplyExample);

        return unqualifyApplies;
    }


}
