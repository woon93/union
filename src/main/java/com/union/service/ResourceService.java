package com.union.service;

import com.union.dao.InfoMapper;
import com.union.dao.ResourceDtoMapper;
import com.union.model.Info;
import com.union.model.InfoExample;
import com.union.model.ResourceDto;
import com.union.model.ResourceDtoExample;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "resourceService")
public class ResourceService{
    @Autowired
    ResourceDtoMapper resourceMapper;

    public List<ResourceDto> selectAllResource() {
//        //  Mybatis Example Initial
//        ResourceDtoExample resouceExample = new ResourceDtoExample();
//        ResourceDtoExample.Criteria criteria = resouceExample.createCriteria();
//        // 【KEY】
//        criteria.andIdEqualTo(999);
        //  excute Mapper
        List<ResourceDto> resouceList = resourceMapper.selectByExample( new ResourceDtoExample());
        return resouceList;
    }
}
