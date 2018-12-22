package com.union.controller.Test;

import com.union.model.Info;
import com.union.service.InfoMstService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class Test02 {
    @Autowired
    private InfoMstService infoMstService;

    @RequestMapping(value = {"/test02"})
    public String test01(@NonNull Info test){
        String testStr = infoMstService.getHashCode(test);

        return testStr;
    }



}
