package com.cskaoyan.service.LJG.qualify;

import com.cskaoyan.bean.TechnologyPlan;
import com.cskaoyan.bean.TechnologyPlanExample;
import com.cskaoyan.mapper.TechnologyPlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LjgTechnologyPlanServiceImpl implements LjgTechnologyPlanService {
    @Autowired
    TechnologyPlanMapper technologyPlanMapper;
    @Override
    public List<TechnologyPlan> queryAllTechPlan() {
        TechnologyPlanExample technologyPlanExample = new TechnologyPlanExample();
        technologyPlanExample.createCriteria().andTechnologyIdIsNotNull();
        List<TechnologyPlan> technologyPlans = technologyPlanMapper.selectByExample(technologyPlanExample);
        return technologyPlans;
    }
}
