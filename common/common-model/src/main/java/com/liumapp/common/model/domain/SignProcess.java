package com.liumapp.common.model.domain;

import java.util.Date;

public class SignProcess {
    private Long id;

    private Long userid;

    private Long commonBackendid;

    private String signplatform;

    private Date createdat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getCommonBackendid() {
        return commonBackendid;
    }

    public void setCommonBackendid(Long commonBackendid) {
        this.commonBackendid = commonBackendid;
    }

    public String getSignplatform() {
        return signplatform;
    }

    public void setSignplatform(String signplatform) {
        this.signplatform = signplatform == null ? null : signplatform.trim();
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}