package cn.hups.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class BdCustomdocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdCustomdocExample() {
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

        public Criteria andPkCustomdocIsNull() {
            addCriterion("pk_customdoc is null");
            return (Criteria) this;
        }

        public Criteria andPkCustomdocIsNotNull() {
            addCriterion("pk_customdoc is not null");
            return (Criteria) this;
        }

        public Criteria andPkCustomdocEqualTo(Integer value) {
            addCriterion("pk_customdoc =", value, "pkCustomdoc");
            return (Criteria) this;
        }

        public Criteria andPkCustomdocNotEqualTo(Integer value) {
            addCriterion("pk_customdoc <>", value, "pkCustomdoc");
            return (Criteria) this;
        }

        public Criteria andPkCustomdocGreaterThan(Integer value) {
            addCriterion("pk_customdoc >", value, "pkCustomdoc");
            return (Criteria) this;
        }

        public Criteria andPkCustomdocGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_customdoc >=", value, "pkCustomdoc");
            return (Criteria) this;
        }

        public Criteria andPkCustomdocLessThan(Integer value) {
            addCriterion("pk_customdoc <", value, "pkCustomdoc");
            return (Criteria) this;
        }

        public Criteria andPkCustomdocLessThanOrEqualTo(Integer value) {
            addCriterion("pk_customdoc <=", value, "pkCustomdoc");
            return (Criteria) this;
        }

        public Criteria andPkCustomdocIn(List<Integer> values) {
            addCriterion("pk_customdoc in", values, "pkCustomdoc");
            return (Criteria) this;
        }

        public Criteria andPkCustomdocNotIn(List<Integer> values) {
            addCriterion("pk_customdoc not in", values, "pkCustomdoc");
            return (Criteria) this;
        }

        public Criteria andPkCustomdocBetween(Integer value1, Integer value2) {
            addCriterion("pk_customdoc between", value1, value2, "pkCustomdoc");
            return (Criteria) this;
        }

        public Criteria andPkCustomdocNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_customdoc not between", value1, value2, "pkCustomdoc");
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

        public Criteria andCustomnameIsNull() {
            addCriterion("customname is null");
            return (Criteria) this;
        }

        public Criteria andCustomnameIsNotNull() {
            addCriterion("customname is not null");
            return (Criteria) this;
        }

        public Criteria andCustomnameEqualTo(String value) {
            addCriterion("customname =", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotEqualTo(String value) {
            addCriterion("customname <>", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameGreaterThan(String value) {
            addCriterion("customname >", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameGreaterThanOrEqualTo(String value) {
            addCriterion("customname >=", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLessThan(String value) {
            addCriterion("customname <", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLessThanOrEqualTo(String value) {
            addCriterion("customname <=", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLike(String value) {
            addCriterion("customname like", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotLike(String value) {
            addCriterion("customname not like", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameIn(List<String> values) {
            addCriterion("customname in", values, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotIn(List<String> values) {
            addCriterion("customname not in", values, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameBetween(String value1, String value2) {
            addCriterion("customname between", value1, value2, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotBetween(String value1, String value2) {
            addCriterion("customname not between", value1, value2, "customname");
            return (Criteria) this;
        }

        public Criteria andTelnumIsNull() {
            addCriterion("telnum is null");
            return (Criteria) this;
        }

        public Criteria andTelnumIsNotNull() {
            addCriterion("telnum is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumEqualTo(String value) {
            addCriterion("telnum =", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotEqualTo(String value) {
            addCriterion("telnum <>", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumGreaterThan(String value) {
            addCriterion("telnum >", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumGreaterThanOrEqualTo(String value) {
            addCriterion("telnum >=", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLessThan(String value) {
            addCriterion("telnum <", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLessThanOrEqualTo(String value) {
            addCriterion("telnum <=", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLike(String value) {
            addCriterion("telnum like", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotLike(String value) {
            addCriterion("telnum not like", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumIn(List<String> values) {
            addCriterion("telnum in", values, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotIn(List<String> values) {
            addCriterion("telnum not in", values, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumBetween(String value1, String value2) {
            addCriterion("telnum between", value1, value2, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotBetween(String value1, String value2) {
            addCriterion("telnum not between", value1, value2, "telnum");
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

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCustomtypeIsNull() {
            addCriterion("customtype is null");
            return (Criteria) this;
        }

        public Criteria andCustomtypeIsNotNull() {
            addCriterion("customtype is not null");
            return (Criteria) this;
        }

        public Criteria andCustomtypeEqualTo(String value) {
            addCriterion("customtype =", value, "customtype");
            return (Criteria) this;
        }

        public Criteria andCustomtypeNotEqualTo(String value) {
            addCriterion("customtype <>", value, "customtype");
            return (Criteria) this;
        }

        public Criteria andCustomtypeGreaterThan(String value) {
            addCriterion("customtype >", value, "customtype");
            return (Criteria) this;
        }

        public Criteria andCustomtypeGreaterThanOrEqualTo(String value) {
            addCriterion("customtype >=", value, "customtype");
            return (Criteria) this;
        }

        public Criteria andCustomtypeLessThan(String value) {
            addCriterion("customtype <", value, "customtype");
            return (Criteria) this;
        }

        public Criteria andCustomtypeLessThanOrEqualTo(String value) {
            addCriterion("customtype <=", value, "customtype");
            return (Criteria) this;
        }

        public Criteria andCustomtypeLike(String value) {
            addCriterion("customtype like", value, "customtype");
            return (Criteria) this;
        }

        public Criteria andCustomtypeNotLike(String value) {
            addCriterion("customtype not like", value, "customtype");
            return (Criteria) this;
        }

        public Criteria andCustomtypeIn(List<String> values) {
            addCriterion("customtype in", values, "customtype");
            return (Criteria) this;
        }

        public Criteria andCustomtypeNotIn(List<String> values) {
            addCriterion("customtype not in", values, "customtype");
            return (Criteria) this;
        }

        public Criteria andCustomtypeBetween(String value1, String value2) {
            addCriterion("customtype between", value1, value2, "customtype");
            return (Criteria) this;
        }

        public Criteria andCustomtypeNotBetween(String value1, String value2) {
            addCriterion("customtype not between", value1, value2, "customtype");
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