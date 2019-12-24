package cn.hups.rbac.entity;

import java.util.ArrayList;
import java.util.List;

public class SmBtnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmBtnExample() {
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

        public Criteria andPkBtnIsNull() {
            addCriterion("pk_btn is null");
            return (Criteria) this;
        }

        public Criteria andPkBtnIsNotNull() {
            addCriterion("pk_btn is not null");
            return (Criteria) this;
        }

        public Criteria andPkBtnEqualTo(Integer value) {
            addCriterion("pk_btn =", value, "pkBtn");
            return (Criteria) this;
        }

        public Criteria andPkBtnNotEqualTo(Integer value) {
            addCriterion("pk_btn <>", value, "pkBtn");
            return (Criteria) this;
        }

        public Criteria andPkBtnGreaterThan(Integer value) {
            addCriterion("pk_btn >", value, "pkBtn");
            return (Criteria) this;
        }

        public Criteria andPkBtnGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_btn >=", value, "pkBtn");
            return (Criteria) this;
        }

        public Criteria andPkBtnLessThan(Integer value) {
            addCriterion("pk_btn <", value, "pkBtn");
            return (Criteria) this;
        }

        public Criteria andPkBtnLessThanOrEqualTo(Integer value) {
            addCriterion("pk_btn <=", value, "pkBtn");
            return (Criteria) this;
        }

        public Criteria andPkBtnIn(List<Integer> values) {
            addCriterion("pk_btn in", values, "pkBtn");
            return (Criteria) this;
        }

        public Criteria andPkBtnNotIn(List<Integer> values) {
            addCriterion("pk_btn not in", values, "pkBtn");
            return (Criteria) this;
        }

        public Criteria andPkBtnBetween(Integer value1, Integer value2) {
            addCriterion("pk_btn between", value1, value2, "pkBtn");
            return (Criteria) this;
        }

        public Criteria andPkBtnNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_btn not between", value1, value2, "pkBtn");
            return (Criteria) this;
        }

        public Criteria andBtnCodeIsNull() {
            addCriterion("btn_code is null");
            return (Criteria) this;
        }

        public Criteria andBtnCodeIsNotNull() {
            addCriterion("btn_code is not null");
            return (Criteria) this;
        }

        public Criteria andBtnCodeEqualTo(String value) {
            addCriterion("btn_code =", value, "btnCode");
            return (Criteria) this;
        }

        public Criteria andBtnCodeNotEqualTo(String value) {
            addCriterion("btn_code <>", value, "btnCode");
            return (Criteria) this;
        }

        public Criteria andBtnCodeGreaterThan(String value) {
            addCriterion("btn_code >", value, "btnCode");
            return (Criteria) this;
        }

        public Criteria andBtnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("btn_code >=", value, "btnCode");
            return (Criteria) this;
        }

        public Criteria andBtnCodeLessThan(String value) {
            addCriterion("btn_code <", value, "btnCode");
            return (Criteria) this;
        }

        public Criteria andBtnCodeLessThanOrEqualTo(String value) {
            addCriterion("btn_code <=", value, "btnCode");
            return (Criteria) this;
        }

        public Criteria andBtnCodeLike(String value) {
            addCriterion("btn_code like", value, "btnCode");
            return (Criteria) this;
        }

        public Criteria andBtnCodeNotLike(String value) {
            addCriterion("btn_code not like", value, "btnCode");
            return (Criteria) this;
        }

        public Criteria andBtnCodeIn(List<String> values) {
            addCriterion("btn_code in", values, "btnCode");
            return (Criteria) this;
        }

        public Criteria andBtnCodeNotIn(List<String> values) {
            addCriterion("btn_code not in", values, "btnCode");
            return (Criteria) this;
        }

        public Criteria andBtnCodeBetween(String value1, String value2) {
            addCriterion("btn_code between", value1, value2, "btnCode");
            return (Criteria) this;
        }

        public Criteria andBtnCodeNotBetween(String value1, String value2) {
            addCriterion("btn_code not between", value1, value2, "btnCode");
            return (Criteria) this;
        }

        public Criteria andBtnNameIsNull() {
            addCriterion("btn_name is null");
            return (Criteria) this;
        }

        public Criteria andBtnNameIsNotNull() {
            addCriterion("btn_name is not null");
            return (Criteria) this;
        }

        public Criteria andBtnNameEqualTo(String value) {
            addCriterion("btn_name =", value, "btnName");
            return (Criteria) this;
        }

        public Criteria andBtnNameNotEqualTo(String value) {
            addCriterion("btn_name <>", value, "btnName");
            return (Criteria) this;
        }

        public Criteria andBtnNameGreaterThan(String value) {
            addCriterion("btn_name >", value, "btnName");
            return (Criteria) this;
        }

        public Criteria andBtnNameGreaterThanOrEqualTo(String value) {
            addCriterion("btn_name >=", value, "btnName");
            return (Criteria) this;
        }

        public Criteria andBtnNameLessThan(String value) {
            addCriterion("btn_name <", value, "btnName");
            return (Criteria) this;
        }

        public Criteria andBtnNameLessThanOrEqualTo(String value) {
            addCriterion("btn_name <=", value, "btnName");
            return (Criteria) this;
        }

        public Criteria andBtnNameLike(String value) {
            addCriterion("btn_name like", value, "btnName");
            return (Criteria) this;
        }

        public Criteria andBtnNameNotLike(String value) {
            addCriterion("btn_name not like", value, "btnName");
            return (Criteria) this;
        }

        public Criteria andBtnNameIn(List<String> values) {
            addCriterion("btn_name in", values, "btnName");
            return (Criteria) this;
        }

        public Criteria andBtnNameNotIn(List<String> values) {
            addCriterion("btn_name not in", values, "btnName");
            return (Criteria) this;
        }

        public Criteria andBtnNameBetween(String value1, String value2) {
            addCriterion("btn_name between", value1, value2, "btnName");
            return (Criteria) this;
        }

        public Criteria andBtnNameNotBetween(String value1, String value2) {
            addCriterion("btn_name not between", value1, value2, "btnName");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("creationtime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("creationtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(String value) {
            addCriterion("creationtime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(String value) {
            addCriterion("creationtime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(String value) {
            addCriterion("creationtime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("creationtime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(String value) {
            addCriterion("creationtime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(String value) {
            addCriterion("creationtime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLike(String value) {
            addCriterion("creationtime like", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotLike(String value) {
            addCriterion("creationtime not like", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<String> values) {
            addCriterion("creationtime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<String> values) {
            addCriterion("creationtime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(String value1, String value2) {
            addCriterion("creationtime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(String value1, String value2) {
            addCriterion("creationtime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andDrIsNull() {
            addCriterion("dr is null");
            return (Criteria) this;
        }

        public Criteria andDrIsNotNull() {
            addCriterion("dr is not null");
            return (Criteria) this;
        }

        public Criteria andDrEqualTo(Integer value) {
            addCriterion("dr =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(Integer value) {
            addCriterion("dr <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(Integer value) {
            addCriterion("dr >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(Integer value) {
            addCriterion("dr <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(Integer value) {
            addCriterion("dr <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<Integer> values) {
            addCriterion("dr in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<Integer> values) {
            addCriterion("dr not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(Integer value1, Integer value2) {
            addCriterion("dr between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(Integer value1, Integer value2) {
            addCriterion("dr not between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(String value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(String value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(String value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(String value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(String value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(String value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLike(String value) {
            addCriterion("ts like", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotLike(String value) {
            addCriterion("ts not like", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<String> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<String> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(String value1, String value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(String value1, String value2) {
            addCriterion("ts not between", value1, value2, "ts");
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