package com.union.service;

import com.union.model.Info;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service(value = "infoMstService")
public class InfoMstServiceImpl implements InfoMstService {
    public String getHashCode(@NonNull Info asd) {
        return asd.toString();
    }
}
