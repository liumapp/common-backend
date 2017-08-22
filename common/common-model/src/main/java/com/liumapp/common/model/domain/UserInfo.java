package com.liumapp.common.model.domain;

import java.util.Date;

public class UserInfo {
    private Long id;

    private Long userid;

    private Boolean sex;

    private String nationality;

    private Date bornat;

    private String provincecode;

    private String citycode;

    private String areacode;

    private String address;

    private String identitycode;

    private String identityphoto;

    private String handidentityphoto;

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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public Date getBornat() {
        return bornat;
    }

    public void setBornat(Date bornat) {
        this.bornat = bornat;
    }

    public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode == null ? null : provincecode.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIdentitycode() {
        return identitycode;
    }

    public void setIdentitycode(String identitycode) {
        this.identitycode = identitycode == null ? null : identitycode.trim();
    }

    public String getIdentityphoto() {
        return identityphoto;
    }

    public void setIdentityphoto(String identityphoto) {
        this.identityphoto = identityphoto == null ? null : identityphoto.trim();
    }

    public String getHandidentityphoto() {
        return handidentityphoto;
    }

    public void setHandidentityphoto(String handidentityphoto) {
        this.handidentityphoto = handidentityphoto == null ? null : handidentityphoto.trim();
    }
}