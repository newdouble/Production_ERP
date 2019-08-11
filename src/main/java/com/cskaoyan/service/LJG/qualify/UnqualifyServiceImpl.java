package com.cskaoyan.service.LJG.qualify;


import com.cskaoyan.bean.UnqualifyApply;
import com.cskaoyan.bean.UnqualifyApplyExample;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.UnqualifyApplyMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UnqualifyServiceImpl implements UnqualifyService {

    @Autowired
    UnqualifyApplyMapper unqualifyApplyMapper;


    @Override
    public List<UnqualifyApply> queryAllUnQualify() {

       /* UnqualifyApplyExample unqualifyApplyExample = new UnqualifyApplyExample();
        unqualifyApplyExample.createCriteria().andAssemblyDateIsNotNull();
        List<UnqualifyApply> unqualifyApplies = unqualifyApplyMapper.selectByExample(unqualifyApplyExample);

        return unqualifyApplies;*/
       return unqualifyApplyMapper.queryAllUnQualify();
    }

    @Override
    public PageResult searchUnqualifyApplyById(String id, int page, int rows) {
        PageResult pageResult = new PageResult();
        PageHelper.startPage(page,rows);
        List<UnqualifyApply> unqualifyApplies = unqualifyApplyMapper.searchUnqualifyApplyById(id);
        PageInfo<UnqualifyApply> pageInfo = new PageInfo<>(unqualifyApplies);
        pageResult.setRows(unqualifyApplies);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

    @Override
    public PageResult searchUnqualifyByName(String name, int page, int rows) {
        PageResult pageResult = new PageResult();
        PageHelper.startPage(page,rows);
        List<UnqualifyApply> unqualifyApplies = unqualifyApplyMapper.searchUnqualifyApplyByName(name);
        PageInfo<UnqualifyApply> pageInfo = new PageInfo<>(unqualifyApplies);
        pageResult.setRows(unqualifyApplies);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }


}
