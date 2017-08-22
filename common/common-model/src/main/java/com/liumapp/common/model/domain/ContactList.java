package com.liumapp.common.model.domain;

import java.util.Date;

public class ContactList {
    private Long id;

    private Long userid;

    private Long contactid;

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

    public Long getContactid() {
        return contactid;
    }

    public void setContactid(Long contactid) {
        this.contactid = contactid;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}