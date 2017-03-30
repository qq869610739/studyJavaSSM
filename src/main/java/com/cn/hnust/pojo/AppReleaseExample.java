package com.cn.hnust.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppReleaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AppReleaseExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNull() {
            addCriterion("appName is null");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNotNull() {
            addCriterion("appName is not null");
            return (Criteria) this;
        }

        public Criteria andAppnameEqualTo(String value) {
            addCriterion("appName =", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotEqualTo(String value) {
            addCriterion("appName <>", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThan(String value) {
            addCriterion("appName >", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThanOrEqualTo(String value) {
            addCriterion("appName >=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThan(String value) {
            addCriterion("appName <", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThanOrEqualTo(String value) {
            addCriterion("appName <=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLike(String value) {
            addCriterion("appName like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotLike(String value) {
            addCriterion("appName not like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameIn(List<String> values) {
            addCriterion("appName in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotIn(List<String> values) {
            addCriterion("appName not in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameBetween(String value1, String value2) {
            addCriterion("appName between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotBetween(String value1, String value2) {
            addCriterion("appName not between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andSystemIsNull() {
            addCriterion("system is null");
            return (Criteria) this;
        }

        public Criteria andSystemIsNotNull() {
            addCriterion("system is not null");
            return (Criteria) this;
        }

        public Criteria andSystemEqualTo(String value) {
            addCriterion("system =", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotEqualTo(String value) {
            addCriterion("system <>", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThan(String value) {
            addCriterion("system >", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThanOrEqualTo(String value) {
            addCriterion("system >=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThan(String value) {
            addCriterion("system <", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThanOrEqualTo(String value) {
            addCriterion("system <=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLike(String value) {
            addCriterion("system like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotLike(String value) {
            addCriterion("system not like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemIn(List<String> values) {
            addCriterion("system in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotIn(List<String> values) {
            addCriterion("system not in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemBetween(String value1, String value2) {
            addCriterion("system between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotBetween(String value1, String value2) {
            addCriterion("system not between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andAppversionIsNull() {
            addCriterion("appVersion is null");
            return (Criteria) this;
        }

        public Criteria andAppversionIsNotNull() {
            addCriterion("appVersion is not null");
            return (Criteria) this;
        }

        public Criteria andAppversionEqualTo(String value) {
            addCriterion("appVersion =", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionNotEqualTo(String value) {
            addCriterion("appVersion <>", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionGreaterThan(String value) {
            addCriterion("appVersion >", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionGreaterThanOrEqualTo(String value) {
            addCriterion("appVersion >=", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionLessThan(String value) {
            addCriterion("appVersion <", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionLessThanOrEqualTo(String value) {
            addCriterion("appVersion <=", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionLike(String value) {
            addCriterion("appVersion like", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionNotLike(String value) {
            addCriterion("appVersion not like", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionIn(List<String> values) {
            addCriterion("appVersion in", values, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionNotIn(List<String> values) {
            addCriterion("appVersion not in", values, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionBetween(String value1, String value2) {
            addCriterion("appVersion between", value1, value2, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionNotBetween(String value1, String value2) {
            addCriterion("appVersion not between", value1, value2, "appversion");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andReleaseversionIsNull() {
            addCriterion("releaseVersion is null");
            return (Criteria) this;
        }

        public Criteria andReleaseversionIsNotNull() {
            addCriterion("releaseVersion is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseversionEqualTo(String value) {
            addCriterion("releaseVersion =", value, "releaseversion");
            return (Criteria) this;
        }

        public Criteria andReleaseversionNotEqualTo(String value) {
            addCriterion("releaseVersion <>", value, "releaseversion");
            return (Criteria) this;
        }

        public Criteria andReleaseversionGreaterThan(String value) {
            addCriterion("releaseVersion >", value, "releaseversion");
            return (Criteria) this;
        }

        public Criteria andReleaseversionGreaterThanOrEqualTo(String value) {
            addCriterion("releaseVersion >=", value, "releaseversion");
            return (Criteria) this;
        }

        public Criteria andReleaseversionLessThan(String value) {
            addCriterion("releaseVersion <", value, "releaseversion");
            return (Criteria) this;
        }

        public Criteria andReleaseversionLessThanOrEqualTo(String value) {
            addCriterion("releaseVersion <=", value, "releaseversion");
            return (Criteria) this;
        }

        public Criteria andReleaseversionLike(String value) {
            addCriterion("releaseVersion like", value, "releaseversion");
            return (Criteria) this;
        }

        public Criteria andReleaseversionNotLike(String value) {
            addCriterion("releaseVersion not like", value, "releaseversion");
            return (Criteria) this;
        }

        public Criteria andReleaseversionIn(List<String> values) {
            addCriterion("releaseVersion in", values, "releaseversion");
            return (Criteria) this;
        }

        public Criteria andReleaseversionNotIn(List<String> values) {
            addCriterion("releaseVersion not in", values, "releaseversion");
            return (Criteria) this;
        }

        public Criteria andReleaseversionBetween(String value1, String value2) {
            addCriterion("releaseVersion between", value1, value2, "releaseversion");
            return (Criteria) this;
        }

        public Criteria andReleaseversionNotBetween(String value1, String value2) {
            addCriterion("releaseVersion not between", value1, value2, "releaseversion");
            return (Criteria) this;
        }

        public Criteria andVersioncodeIsNull() {
            addCriterion("versionCode is null");
            return (Criteria) this;
        }

        public Criteria andVersioncodeIsNotNull() {
            addCriterion("versionCode is not null");
            return (Criteria) this;
        }

        public Criteria andVersioncodeEqualTo(Integer value) {
            addCriterion("versionCode =", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeNotEqualTo(Integer value) {
            addCriterion("versionCode <>", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeGreaterThan(Integer value) {
            addCriterion("versionCode >", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("versionCode >=", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeLessThan(Integer value) {
            addCriterion("versionCode <", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeLessThanOrEqualTo(Integer value) {
            addCriterion("versionCode <=", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeIn(List<Integer> values) {
            addCriterion("versionCode in", values, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeNotIn(List<Integer> values) {
            addCriterion("versionCode not in", values, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeBetween(Integer value1, Integer value2) {
            addCriterion("versionCode between", value1, value2, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeNotBetween(Integer value1, Integer value2) {
            addCriterion("versionCode not between", value1, value2, "versioncode");
            return (Criteria) this;
        }
    }

    /**
     */
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