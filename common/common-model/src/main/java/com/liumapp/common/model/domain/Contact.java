package com.liumapp.common.model.domain;

import java.util.Date;

public class Contact {
    private Long id;

    private Long userid;

    private Long commonBackendid;

    private Long contactlistid;

    private String realname;

    private String mobile;

    private String username;

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

    public Long getContactlistid() {
        return contactlistid;
    }

    public void setContactlistid(Long contactlistid) {
        this.contactlistid = contactlistid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}