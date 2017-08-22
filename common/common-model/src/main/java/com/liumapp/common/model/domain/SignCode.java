package com.liumapp.common.model.domain;

import java.util.Date;

public class SignCode {
    private Long id;

    private Long userid;

    private String title;

    private String signpic;

    private Byte status;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSignpic() {
        return signpic;
    }

    public void setSignpic(String signpic) {
        this.signpic = signpic == null ? null : signpic.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}