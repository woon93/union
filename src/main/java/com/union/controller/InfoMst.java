package com.union.controller;

import com.union.model.Info;
import lombok.NonNull;

public class InfoMst {
    public String hashCode(@NonNull Info asd) {
        return asd.toString();
    }
}
