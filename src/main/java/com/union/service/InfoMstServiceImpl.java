package com.union.service;

import com.github.pagehelper.util.StringUtil;
import com.union.dao.InfoMapper;
import com.union.model.Info;
import com.union.model.InfoExample;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "infoMstService")
public class InfoMstServiceImpl implements InfoMstService {
    @Autowired
    private InfoMapper infoMapper;

    public String getHashCode(@NonNull Info asd) {
        List<Info> infoList= this.selectInfoMst(asd);
        asd = infoList.get(0);
        return asd.toString();
    }

    private List<Info> selectInfoMst(Info info) {
        //  Mybatis Example Initial
        InfoExample infoExample = new InfoExample();
        InfoExample.Criteria criteria = infoExample.createCriteria();
        // 【KEY】
        criteria.andIdEqualTo(999);
        // 【SORT】
        StringBuilder sortKey = new StringBuilder();
        sortKey.append("ID");
        infoExample.setOrderByClause(sortKey.toString());
        //  excute Mapper
        List<Info> infoList = infoMapper.selectByExample(infoExample);
        return infoList;
    }
}
