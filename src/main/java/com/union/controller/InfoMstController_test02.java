package com.union.controller;

import com.union.model.Info;
import com.union.service.InfoMstService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//@Controller
@RestController
public class InfoMstController_test02 {
    @Autowired
    private InfoMstService infoMstService;

    @RequestMapping(value = {"/test02"})
    public String test01(@NonNull Info test){
        String testStr = infoMstService.getHashCode(test);

        return testStr;
    }



}
