package cn.hups.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class BdTakeoverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdTakeoverExample() {
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

        public Criteria andPkTakeoverIsNull() {
            addCriterion("pk_takeover is null");
            return (Criteria) this;
        }

        public Criteria andPkTakeoverIsNotNull() {
            addCriterion("pk_takeover is not null");
            return (Criteria) this;
        }

        public Criteria andPkTakeoverEqualTo(Integer value) {
            addCriterion("pk_takeover =", value, "pkTakeover");
            return (Criteria) this;
        }

        public Criteria andPkTakeoverNotEqualTo(Integer value) {
            addCriterion("pk_takeover <>", value, "pkTakeover");
            return (Criteria) this;
        }

        public Criteria andPkTakeoverGreaterThan(Integer value) {
            addCriterion("pk_takeover >", value, "pkTakeover");
            return (Criteria) this;
        }

        public Criteria andPkTakeoverGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_takeover >=", value, "pkTakeover");
            return (Criteria) this;
        }

        public Criteria andPkTakeoverLessThan(Integer value) {
            addCriterion("pk_takeover <", value, "pkTakeover");
            return (Criteria) this;
        }

        public Criteria andPkTakeoverLessThanOrEqualTo(Integer value) {
            addCriterion("pk_takeover <=", value, "pkTakeover");
            return (Criteria) this;
        }

        public Criteria andPkTakeoverIn(List<Integer> values) {
            addCriterion("pk_takeover in", values, "pkTakeover");
            return (Criteria) this;
        }

        public Criteria andPkTakeoverNotIn(List<Integer> values) {
            addCriterion("pk_takeover not in", values, "pkTakeover");
            return (Criteria) this;
        }

        public Criteria andPkTakeoverBetween(Integer value1, Integer value2) {
            addCriterion("pk_takeover between", value1, value2, "pkTakeover");
            return (Criteria) this;
        }

        public Criteria andPkTakeoverNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_takeover not between", value1, value2, "pkTakeover");
            return (Criteria) this;
        }

        public Criteria andPkCustomerIsNull() {
            addCriterion("pk_customer is null");
            return (Criteria) this;
        }

        public Criteria andPkCustomerIsNotNull() {
            addCriterion("pk_customer is not null");
            return (Criteria) this;
        }

        public Criteria andPkCustomerEqualTo(Integer value) {
            addCriterion("pk_customer =", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerNotEqualTo(Integer value) {
            addCriterion("pk_customer <>", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerGreaterThan(Integer value) {
            addCriterion("pk_customer >", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_customer >=", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerLessThan(Integer value) {
            addCriterion("pk_customer <", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerLessThanOrEqualTo(Integer value) {
            addCriterion("pk_customer <=", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerIn(List<Integer> values) {
            addCriterion("pk_customer in", values, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerNotIn(List<Integer> values) {
            addCriterion("pk_customer not in", values, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerBetween(Integer value1, Integer value2) {
            addCriterion("pk_customer between", value1, value2, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_customer not between", value1, value2, "pkCustomer");
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

        public Criteria andTakeoverPsnIsNull() {
            addCriterion("takeover_psn is null");
            return (Criteria) this;
        }

        public Criteria andTakeoverPsnIsNotNull() {
            addCriterion("takeover_psn is not null");
            return (Criteria) this;
        }

        public Criteria andTakeoverPsnEqualTo(Integer value) {
            addCriterion("takeover_psn =", value, "takeoverPsn");
            return (Criteria) this;
        }

        public Criteria andTakeoverPsnNotEqualTo(Integer value) {
            addCriterion("takeover_psn <>", value, "takeoverPsn");
            return (Criteria) this;
        }

        public Criteria andTakeoverPsnGreaterThan(Integer value) {
            addCriterion("takeover_psn >", value, "takeoverPsn");
            return (Criteria) this;
        }

        public Criteria andTakeoverPsnGreaterThanOrEqualTo(Integer value) {
            addCriterion("takeover_psn >=", value, "takeoverPsn");
            return (Criteria) this;
        }

        public Criteria andTakeoverPsnLessThan(Integer value) {
            addCriterion("takeover_psn <", value, "takeoverPsn");
            return (Criteria) this;
        }

        public Criteria andTakeoverPsnLessThanOrEqualTo(Integer value) {
            addCriterion("takeover_psn <=", value, "takeoverPsn");
            return (Criteria) this;
        }

        public Criteria andTakeoverPsnIn(List<Integer> values) {
            addCriterion("takeover_psn in", values, "takeoverPsn");
            return (Criteria) this;
        }

        public Criteria andTakeoverPsnNotIn(List<Integer> values) {
            addCriterion("takeover_psn not in", values, "takeoverPsn");
            return (Criteria) this;
        }

        public Criteria andTakeoverPsnBetween(Integer value1, Integer value2) {
            addCriterion("takeover_psn between", value1, value2, "takeoverPsn");
            return (Criteria) this;
        }

        public Criteria andTakeoverPsnNotBetween(Integer value1, Integer value2) {
            addCriterion("takeover_psn not between", value1, value2, "takeoverPsn");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelIsNull() {
            addCriterion("takeover_tel is null");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelIsNotNull() {
            addCriterion("takeover_tel is not null");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelEqualTo(String value) {
            addCriterion("takeover_tel =", value, "takeoverTel");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelNotEqualTo(String value) {
            addCriterion("takeover_tel <>", value, "takeoverTel");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelGreaterThan(String value) {
            addCriterion("takeover_tel >", value, "takeoverTel");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelGreaterThanOrEqualTo(String value) {
            addCriterion("takeover_tel >=", value, "takeoverTel");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelLessThan(String value) {
            addCriterion("takeover_tel <", value, "takeoverTel");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelLessThanOrEqualTo(String value) {
            addCriterion("takeover_tel <=", value, "takeoverTel");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelLike(String value) {
            addCriterion("takeover_tel like", value, "takeoverTel");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelNotLike(String value) {
            addCriterion("takeover_tel not like", value, "takeoverTel");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelIn(List<String> values) {
            addCriterion("takeover_tel in", values, "takeoverTel");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelNotIn(List<String> values) {
            addCriterion("takeover_tel not in", values, "takeoverTel");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelBetween(String value1, String value2) {
            addCriterion("takeover_tel between", value1, value2, "takeoverTel");
            return (Criteria) this;
        }

        public Criteria andTakeoverTelNotBetween(String value1, String value2) {
            addCriterion("takeover_tel not between", value1, value2, "takeoverTel");
            return (Criteria) this;
        }

        public Criteria andDefaultisIsNull() {
            addCriterion("defaultis is null");
            return (Criteria) this;
        }

        public Criteria andDefaultisIsNotNull() {
            addCriterion("defaultis is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultisEqualTo(String value) {
            addCriterion("defaultis =", value, "defaultis");
            return (Criteria) this;
        }

        public Criteria andDefaultisNotEqualTo(String value) {
            addCriterion("defaultis <>", value, "defaultis");
            return (Criteria) this;
        }

        public Criteria andDefaultisGreaterThan(String value) {
            addCriterion("defaultis >", value, "defaultis");
            return (Criteria) this;
        }

        public Criteria andDefaultisGreaterThanOrEqualTo(String value) {
            addCriterion("defaultis >=", value, "defaultis");
            return (Criteria) this;
        }

        public Criteria andDefaultisLessThan(String value) {
            addCriterion("defaultis <", value, "defaultis");
            return (Criteria) this;
        }

        public Criteria andDefaultisLessThanOrEqualTo(String value) {
            addCriterion("defaultis <=", value, "defaultis");
            return (Criteria) this;
        }

        public Criteria andDefaultisLike(String value) {
            addCriterion("defaultis like", value, "defaultis");
            return (Criteria) this;
        }

        public Criteria andDefaultisNotLike(String value) {
            addCriterion("defaultis not like", value, "defaultis");
            return (Criteria) this;
        }

        public Criteria andDefaultisIn(List<String> values) {
            addCriterion("defaultis in", values, "defaultis");
            return (Criteria) this;
        }

        public Criteria andDefaultisNotIn(List<String> values) {
            addCriterion("defaultis not in", values, "defaultis");
            return (Criteria) this;
        }

        public Criteria andDefaultisBetween(String value1, String value2) {
            addCriterion("defaultis between", value1, value2, "defaultis");
            return (Criteria) this;
        }

        public Criteria andDefaultisNotBetween(String value1, String value2) {
            addCriterion("defaultis not between", value1, value2, "defaultis");
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