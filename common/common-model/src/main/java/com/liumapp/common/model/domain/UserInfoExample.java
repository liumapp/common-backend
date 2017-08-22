package com.liumapp.common.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andBornatIsNull() {
            addCriterion("bornAt is null");
            return (Criteria) this;
        }

        public Criteria andBornatIsNotNull() {
            addCriterion("bornAt is not null");
            return (Criteria) this;
        }

        public Criteria andBornatEqualTo(Date value) {
            addCriterion("bornAt =", value, "bornat");
            return (Criteria) this;
        }

        public Criteria andBornatNotEqualTo(Date value) {
            addCriterion("bornAt <>", value, "bornat");
            return (Criteria) this;
        }

        public Criteria andBornatGreaterThan(Date value) {
            addCriterion("bornAt >", value, "bornat");
            return (Criteria) this;
        }

        public Criteria andBornatGreaterThanOrEqualTo(Date value) {
            addCriterion("bornAt >=", value, "bornat");
            return (Criteria) this;
        }

        public Criteria andBornatLessThan(Date value) {
            addCriterion("bornAt <", value, "bornat");
            return (Criteria) this;
        }

        public Criteria andBornatLessThanOrEqualTo(Date value) {
            addCriterion("bornAt <=", value, "bornat");
            return (Criteria) this;
        }

        public Criteria andBornatIn(List<Date> values) {
            addCriterion("bornAt in", values, "bornat");
            return (Criteria) this;
        }

        public Criteria andBornatNotIn(List<Date> values) {
            addCriterion("bornAt not in", values, "bornat");
            return (Criteria) this;
        }

        public Criteria andBornatBetween(Date value1, Date value2) {
            addCriterion("bornAt between", value1, value2, "bornat");
            return (Criteria) this;
        }

        public Criteria andBornatNotBetween(Date value1, Date value2) {
            addCriterion("bornAt not between", value1, value2, "bornat");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIsNull() {
            addCriterion("provinceCode is null");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIsNotNull() {
            addCriterion("provinceCode is not null");
            return (Criteria) this;
        }

        public Criteria andProvincecodeEqualTo(String value) {
            addCriterion("provinceCode =", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotEqualTo(String value) {
            addCriterion("provinceCode <>", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeGreaterThan(String value) {
            addCriterion("provinceCode >", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeGreaterThanOrEqualTo(String value) {
            addCriterion("provinceCode >=", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLessThan(String value) {
            addCriterion("provinceCode <", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLessThanOrEqualTo(String value) {
            addCriterion("provinceCode <=", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLike(String value) {
            addCriterion("provinceCode like", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotLike(String value) {
            addCriterion("provinceCode not like", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIn(List<String> values) {
            addCriterion("provinceCode in", values, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotIn(List<String> values) {
            addCriterion("provinceCode not in", values, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeBetween(String value1, String value2) {
            addCriterion("provinceCode between", value1, value2, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotBetween(String value1, String value2) {
            addCriterion("provinceCode not between", value1, value2, "provincecode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("cityCode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("cityCode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("cityCode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("cityCode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("cityCode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("cityCode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("cityCode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("cityCode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("cityCode like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("cityCode not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("cityCode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("cityCode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("cityCode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("cityCode not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("areaCode is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("areaCode is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("areaCode =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(String value) {
            addCriterion("areaCode <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(String value) {
            addCriterion("areaCode >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("areaCode >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(String value) {
            addCriterion("areaCode <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(String value) {
            addCriterion("areaCode <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLike(String value) {
            addCriterion("areaCode like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotLike(String value) {
            addCriterion("areaCode not like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<String> values) {
            addCriterion("areaCode in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<String> values) {
            addCriterion("areaCode not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(String value1, String value2) {
            addCriterion("areaCode between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(String value1, String value2) {
            addCriterion("areaCode not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeIsNull() {
            addCriterion("identityCode is null");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeIsNotNull() {
            addCriterion("identityCode is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeEqualTo(String value) {
            addCriterion("identityCode =", value, "identitycode");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeNotEqualTo(String value) {
            addCriterion("identityCode <>", value, "identitycode");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeGreaterThan(String value) {
            addCriterion("identityCode >", value, "identitycode");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("identityCode >=", value, "identitycode");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeLessThan(String value) {
            addCriterion("identityCode <", value, "identitycode");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeLessThanOrEqualTo(String value) {
            addCriterion("identityCode <=", value, "identitycode");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeLike(String value) {
            addCriterion("identityCode like", value, "identitycode");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeNotLike(String value) {
            addCriterion("identityCode not like", value, "identitycode");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeIn(List<String> values) {
            addCriterion("identityCode in", values, "identitycode");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeNotIn(List<String> values) {
            addCriterion("identityCode not in", values, "identitycode");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeBetween(String value1, String value2) {
            addCriterion("identityCode between", value1, value2, "identitycode");
            return (Criteria) this;
        }

        public Criteria andIdentitycodeNotBetween(String value1, String value2) {
            addCriterion("identityCode not between", value1, value2, "identitycode");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoIsNull() {
            addCriterion("identityPhoto is null");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoIsNotNull() {
            addCriterion("identityPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoEqualTo(String value) {
            addCriterion("identityPhoto =", value, "identityphoto");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoNotEqualTo(String value) {
            addCriterion("identityPhoto <>", value, "identityphoto");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoGreaterThan(String value) {
            addCriterion("identityPhoto >", value, "identityphoto");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoGreaterThanOrEqualTo(String value) {
            addCriterion("identityPhoto >=", value, "identityphoto");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoLessThan(String value) {
            addCriterion("identityPhoto <", value, "identityphoto");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoLessThanOrEqualTo(String value) {
            addCriterion("identityPhoto <=", value, "identityphoto");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoLike(String value) {
            addCriterion("identityPhoto like", value, "identityphoto");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoNotLike(String value) {
            addCriterion("identityPhoto not like", value, "identityphoto");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoIn(List<String> values) {
            addCriterion("identityPhoto in", values, "identityphoto");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoNotIn(List<String> values) {
            addCriterion("identityPhoto not in", values, "identityphoto");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoBetween(String value1, String value2) {
            addCriterion("identityPhoto between", value1, value2, "identityphoto");
            return (Criteria) this;
        }

        public Criteria andIdentityphotoNotBetween(String value1, String value2) {
            addCriterion("identityPhoto not between", value1, value2, "identityphoto");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoIsNull() {
            addCriterion("handIdentityPhoto is null");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoIsNotNull() {
            addCriterion("handIdentityPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoEqualTo(String value) {
            addCriterion("handIdentityPhoto =", value, "handidentityphoto");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoNotEqualTo(String value) {
            addCriterion("handIdentityPhoto <>", value, "handidentityphoto");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoGreaterThan(String value) {
            addCriterion("handIdentityPhoto >", value, "handidentityphoto");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoGreaterThanOrEqualTo(String value) {
            addCriterion("handIdentityPhoto >=", value, "handidentityphoto");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoLessThan(String value) {
            addCriterion("handIdentityPhoto <", value, "handidentityphoto");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoLessThanOrEqualTo(String value) {
            addCriterion("handIdentityPhoto <=", value, "handidentityphoto");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoLike(String value) {
            addCriterion("handIdentityPhoto like", value, "handidentityphoto");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoNotLike(String value) {
            addCriterion("handIdentityPhoto not like", value, "handidentityphoto");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoIn(List<String> values) {
            addCriterion("handIdentityPhoto in", values, "handidentityphoto");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoNotIn(List<String> values) {
            addCriterion("handIdentityPhoto not in", values, "handidentityphoto");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoBetween(String value1, String value2) {
            addCriterion("handIdentityPhoto between", value1, value2, "handidentityphoto");
            return (Criteria) this;
        }

        public Criteria andHandidentityphotoNotBetween(String value1, String value2) {
            addCriterion("handIdentityPhoto not between", value1, value2, "handidentityphoto");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}