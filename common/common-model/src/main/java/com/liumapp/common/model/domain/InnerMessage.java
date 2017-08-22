package com.liumapp.common.model.domain;

import java.util.Date;

public class InnerMessage {
    private Long id;

    private String message;

    private Byte isall;

    private Date createdat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Byte getIsall() {
        return isall;
    }

    public void setIsall(Byte isall) {
        this.isall = isall;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}