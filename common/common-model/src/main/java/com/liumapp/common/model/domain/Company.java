package com.liumapp.common.model.domain;

import java.util.Date;

public class Company {
    private Long id;

    private Long userid;

    private String name;

    private String code;

    private String provincecode;

    private String citycode;

    private String areacode;

    private String address;

    private String licensephoto;

    private String checkphoto;

    private String checktemplate;

    private Date createdat;

    private Date updatedat;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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

    public String getLicensephoto() {
        return licensephoto;
    }

    public void setLicensephoto(String licensephoto) {
        this.licensephoto = licensephoto == null ? null : licensephoto.trim();
    }

    public String getCheckphoto() {
        return checkphoto;
    }

    public void setCheckphoto(String checkphoto) {
        this.checkphoto = checkphoto == null ? null : checkphoto.trim();
    }

    public String getChecktemplate() {
        return checktemplate;
    }

    public void setChecktemplate(String checktemplate) {
        this.checktemplate = checktemplate == null ? null : checktemplate.trim();
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }
}