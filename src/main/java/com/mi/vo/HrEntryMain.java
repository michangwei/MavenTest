package com.mi.vo;

import java.io.Serializable;

public class HrEntryMain implements Serializable {

    private String fdId;
    
    private String fdName;

    public String getFdId() {
        return fdId;
    }

    public void setFdId(String fdId) {
        this.fdId = fdId;
    }

    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }
}