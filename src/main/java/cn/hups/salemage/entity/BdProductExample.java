package cn.hups.salemage.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BdProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdProductExample() {
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

        public Criteria andPkProductIsNull() {
            addCriterion("pk_product is null");
            return (Criteria) this;
        }

        public Criteria andPkProductIsNotNull() {
            addCriterion("pk_product is not null");
            return (Criteria) this;
        }

        public Criteria andPkProductEqualTo(Integer value) {
            addCriterion("pk_product =", value, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductNotEqualTo(Integer value) {
            addCriterion("pk_product <>", value, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductGreaterThan(Integer value) {
            addCriterion("pk_product >", value, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_product >=", value, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductLessThan(Integer value) {
            addCriterion("pk_product <", value, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductLessThanOrEqualTo(Integer value) {
            addCriterion("pk_product <=", value, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductIn(List<Integer> values) {
            addCriterion("pk_product in", values, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductNotIn(List<Integer> values) {
            addCriterion("pk_product not in", values, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductBetween(Integer value1, Integer value2) {
            addCriterion("pk_product between", value1, value2, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_product not between", value1, value2, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andPkPsndocIsNull() {
            addCriterion("pk_psndoc is null");
            return (Criteria) this;
        }

        public Criteria andPkPsndocIsNotNull() {
            addCriterion("pk_psndoc is not null");
            return (Criteria) this;
        }

        public Criteria andPkPsndocEqualTo(Integer value) {
            addCriterion("pk_psndoc =", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocNotEqualTo(Integer value) {
            addCriterion("pk_psndoc <>", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocGreaterThan(Integer value) {
            addCriterion("pk_psndoc >", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_psndoc >=", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocLessThan(Integer value) {
            addCriterion("pk_psndoc <", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocLessThanOrEqualTo(Integer value) {
            addCriterion("pk_psndoc <=", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocIn(List<Integer> values) {
            addCriterion("pk_psndoc in", values, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocNotIn(List<Integer> values) {
            addCriterion("pk_psndoc not in", values, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocBetween(Integer value1, Integer value2) {
            addCriterion("pk_psndoc between", value1, value2, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_psndoc not between", value1, value2, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactsIsNull() {
            addCriterion("purchase_contacts is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactsIsNotNull() {
            addCriterion("purchase_contacts is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactsEqualTo(Integer value) {
            addCriterion("purchase_contacts =", value, "purchaseContacts");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactsNotEqualTo(Integer value) {
            addCriterion("purchase_contacts <>", value, "purchaseContacts");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactsGreaterThan(Integer value) {
            addCriterion("purchase_contacts >", value, "purchaseContacts");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactsGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_contacts >=", value, "purchaseContacts");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactsLessThan(Integer value) {
            addCriterion("purchase_contacts <", value, "purchaseContacts");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactsLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_contacts <=", value, "purchaseContacts");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactsIn(List<Integer> values) {
            addCriterion("purchase_contacts in", values, "purchaseContacts");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactsNotIn(List<Integer> values) {
            addCriterion("purchase_contacts not in", values, "purchaseContacts");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactsBetween(Integer value1, Integer value2) {
            addCriterion("purchase_contacts between", value1, value2, "purchaseContacts");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactsNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_contacts not between", value1, value2, "purchaseContacts");
            return (Criteria) this;
        }

        public Criteria andSkillContactsIsNull() {
            addCriterion("skill_contacts is null");
            return (Criteria) this;
        }

        public Criteria andSkillContactsIsNotNull() {
            addCriterion("skill_contacts is not null");
            return (Criteria) this;
        }

        public Criteria andSkillContactsEqualTo(Integer value) {
            addCriterion("skill_contacts =", value, "skillContacts");
            return (Criteria) this;
        }

        public Criteria andSkillContactsNotEqualTo(Integer value) {
            addCriterion("skill_contacts <>", value, "skillContacts");
            return (Criteria) this;
        }

        public Criteria andSkillContactsGreaterThan(Integer value) {
            addCriterion("skill_contacts >", value, "skillContacts");
            return (Criteria) this;
        }

        public Criteria andSkillContactsGreaterThanOrEqualTo(Integer value) {
            addCriterion("skill_contacts >=", value, "skillContacts");
            return (Criteria) this;
        }

        public Criteria andSkillContactsLessThan(Integer value) {
            addCriterion("skill_contacts <", value, "skillContacts");
            return (Criteria) this;
        }

        public Criteria andSkillContactsLessThanOrEqualTo(Integer value) {
            addCriterion("skill_contacts <=", value, "skillContacts");
            return (Criteria) this;
        }

        public Criteria andSkillContactsIn(List<Integer> values) {
            addCriterion("skill_contacts in", values, "skillContacts");
            return (Criteria) this;
        }

        public Criteria andSkillContactsNotIn(List<Integer> values) {
            addCriterion("skill_contacts not in", values, "skillContacts");
            return (Criteria) this;
        }

        public Criteria andSkillContactsBetween(Integer value1, Integer value2) {
            addCriterion("skill_contacts between", value1, value2, "skillContacts");
            return (Criteria) this;
        }

        public Criteria andSkillContactsNotBetween(Integer value1, Integer value2) {
            addCriterion("skill_contacts not between", value1, value2, "skillContacts");
            return (Criteria) this;
        }

        public Criteria andSmtIsNull() {
            addCriterion("smt is null");
            return (Criteria) this;
        }

        public Criteria andSmtIsNotNull() {
            addCriterion("smt is not null");
            return (Criteria) this;
        }

        public Criteria andSmtEqualTo(Integer value) {
            addCriterion("smt =", value, "smt");
            return (Criteria) this;
        }

        public Criteria andSmtNotEqualTo(Integer value) {
            addCriterion("smt <>", value, "smt");
            return (Criteria) this;
        }

        public Criteria andSmtGreaterThan(Integer value) {
            addCriterion("smt >", value, "smt");
            return (Criteria) this;
        }

        public Criteria andSmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("smt >=", value, "smt");
            return (Criteria) this;
        }

        public Criteria andSmtLessThan(Integer value) {
            addCriterion("smt <", value, "smt");
            return (Criteria) this;
        }

        public Criteria andSmtLessThanOrEqualTo(Integer value) {
            addCriterion("smt <=", value, "smt");
            return (Criteria) this;
        }

        public Criteria andSmtIn(List<Integer> values) {
            addCriterion("smt in", values, "smt");
            return (Criteria) this;
        }

        public Criteria andSmtNotIn(List<Integer> values) {
            addCriterion("smt not in", values, "smt");
            return (Criteria) this;
        }

        public Criteria andSmtBetween(Integer value1, Integer value2) {
            addCriterion("smt between", value1, value2, "smt");
            return (Criteria) this;
        }

        public Criteria andSmtNotBetween(Integer value1, Integer value2) {
            addCriterion("smt not between", value1, value2, "smt");
            return (Criteria) this;
        }

        public Criteria andDipIsNull() {
            addCriterion("dip is null");
            return (Criteria) this;
        }

        public Criteria andDipIsNotNull() {
            addCriterion("dip is not null");
            return (Criteria) this;
        }

        public Criteria andDipEqualTo(Integer value) {
            addCriterion("dip =", value, "dip");
            return (Criteria) this;
        }

        public Criteria andDipNotEqualTo(Integer value) {
            addCriterion("dip <>", value, "dip");
            return (Criteria) this;
        }

        public Criteria andDipGreaterThan(Integer value) {
            addCriterion("dip >", value, "dip");
            return (Criteria) this;
        }

        public Criteria andDipGreaterThanOrEqualTo(Integer value) {
            addCriterion("dip >=", value, "dip");
            return (Criteria) this;
        }

        public Criteria andDipLessThan(Integer value) {
            addCriterion("dip <", value, "dip");
            return (Criteria) this;
        }

        public Criteria andDipLessThanOrEqualTo(Integer value) {
            addCriterion("dip <=", value, "dip");
            return (Criteria) this;
        }

        public Criteria andDipIn(List<Integer> values) {
            addCriterion("dip in", values, "dip");
            return (Criteria) this;
        }

        public Criteria andDipNotIn(List<Integer> values) {
            addCriterion("dip not in", values, "dip");
            return (Criteria) this;
        }

        public Criteria andDipBetween(Integer value1, Integer value2) {
            addCriterion("dip between", value1, value2, "dip");
            return (Criteria) this;
        }

        public Criteria andDipNotBetween(Integer value1, Integer value2) {
            addCriterion("dip not between", value1, value2, "dip");
            return (Criteria) this;
        }

        public Criteria andIsinstalIsNull() {
            addCriterion("isinstal is null");
            return (Criteria) this;
        }

        public Criteria andIsinstalIsNotNull() {
            addCriterion("isinstal is not null");
            return (Criteria) this;
        }

        public Criteria andIsinstalEqualTo(String value) {
            addCriterion("isinstal =", value, "isinstal");
            return (Criteria) this;
        }

        public Criteria andIsinstalNotEqualTo(String value) {
            addCriterion("isinstal <>", value, "isinstal");
            return (Criteria) this;
        }

        public Criteria andIsinstalGreaterThan(String value) {
            addCriterion("isinstal >", value, "isinstal");
            return (Criteria) this;
        }

        public Criteria andIsinstalGreaterThanOrEqualTo(String value) {
            addCriterion("isinstal >=", value, "isinstal");
            return (Criteria) this;
        }

        public Criteria andIsinstalLessThan(String value) {
            addCriterion("isinstal <", value, "isinstal");
            return (Criteria) this;
        }

        public Criteria andIsinstalLessThanOrEqualTo(String value) {
            addCriterion("isinstal <=", value, "isinstal");
            return (Criteria) this;
        }

        public Criteria andIsinstalLike(String value) {
            addCriterion("isinstal like", value, "isinstal");
            return (Criteria) this;
        }

        public Criteria andIsinstalNotLike(String value) {
            addCriterion("isinstal not like", value, "isinstal");
            return (Criteria) this;
        }

        public Criteria andIsinstalIn(List<String> values) {
            addCriterion("isinstal in", values, "isinstal");
            return (Criteria) this;
        }

        public Criteria andIsinstalNotIn(List<String> values) {
            addCriterion("isinstal not in", values, "isinstal");
            return (Criteria) this;
        }

        public Criteria andIsinstalBetween(String value1, String value2) {
            addCriterion("isinstal between", value1, value2, "isinstal");
            return (Criteria) this;
        }

        public Criteria andIsinstalNotBetween(String value1, String value2) {
            addCriterion("isinstal not between", value1, value2, "isinstal");
            return (Criteria) this;
        }

        public Criteria andInstalMinIsNull() {
            addCriterion("instal_min is null");
            return (Criteria) this;
        }

        public Criteria andInstalMinIsNotNull() {
            addCriterion("instal_min is not null");
            return (Criteria) this;
        }

        public Criteria andInstalMinEqualTo(Integer value) {
            addCriterion("instal_min =", value, "instalMin");
            return (Criteria) this;
        }

        public Criteria andInstalMinNotEqualTo(Integer value) {
            addCriterion("instal_min <>", value, "instalMin");
            return (Criteria) this;
        }

        public Criteria andInstalMinGreaterThan(Integer value) {
            addCriterion("instal_min >", value, "instalMin");
            return (Criteria) this;
        }

        public Criteria andInstalMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("instal_min >=", value, "instalMin");
            return (Criteria) this;
        }

        public Criteria andInstalMinLessThan(Integer value) {
            addCriterion("instal_min <", value, "instalMin");
            return (Criteria) this;
        }

        public Criteria andInstalMinLessThanOrEqualTo(Integer value) {
            addCriterion("instal_min <=", value, "instalMin");
            return (Criteria) this;
        }

        public Criteria andInstalMinIn(List<Integer> values) {
            addCriterion("instal_min in", values, "instalMin");
            return (Criteria) this;
        }

        public Criteria andInstalMinNotIn(List<Integer> values) {
            addCriterion("instal_min not in", values, "instalMin");
            return (Criteria) this;
        }

        public Criteria andInstalMinBetween(Integer value1, Integer value2) {
            addCriterion("instal_min between", value1, value2, "instalMin");
            return (Criteria) this;
        }

        public Criteria andInstalMinNotBetween(Integer value1, Integer value2) {
            addCriterion("instal_min not between", value1, value2, "instalMin");
            return (Criteria) this;
        }

        public Criteria andIstestIsNull() {
            addCriterion("istest is null");
            return (Criteria) this;
        }

        public Criteria andIstestIsNotNull() {
            addCriterion("istest is not null");
            return (Criteria) this;
        }

        public Criteria andIstestEqualTo(String value) {
            addCriterion("istest =", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestNotEqualTo(String value) {
            addCriterion("istest <>", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestGreaterThan(String value) {
            addCriterion("istest >", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestGreaterThanOrEqualTo(String value) {
            addCriterion("istest >=", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestLessThan(String value) {
            addCriterion("istest <", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestLessThanOrEqualTo(String value) {
            addCriterion("istest <=", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestLike(String value) {
            addCriterion("istest like", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestNotLike(String value) {
            addCriterion("istest not like", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestIn(List<String> values) {
            addCriterion("istest in", values, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestNotIn(List<String> values) {
            addCriterion("istest not in", values, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestBetween(String value1, String value2) {
            addCriterion("istest between", value1, value2, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestNotBetween(String value1, String value2) {
            addCriterion("istest not between", value1, value2, "istest");
            return (Criteria) this;
        }

        public Criteria andTestMinIsNull() {
            addCriterion("test_min is null");
            return (Criteria) this;
        }

        public Criteria andTestMinIsNotNull() {
            addCriterion("test_min is not null");
            return (Criteria) this;
        }

        public Criteria andTestMinEqualTo(Integer value) {
            addCriterion("test_min =", value, "testMin");
            return (Criteria) this;
        }

        public Criteria andTestMinNotEqualTo(Integer value) {
            addCriterion("test_min <>", value, "testMin");
            return (Criteria) this;
        }

        public Criteria andTestMinGreaterThan(Integer value) {
            addCriterion("test_min >", value, "testMin");
            return (Criteria) this;
        }

        public Criteria andTestMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_min >=", value, "testMin");
            return (Criteria) this;
        }

        public Criteria andTestMinLessThan(Integer value) {
            addCriterion("test_min <", value, "testMin");
            return (Criteria) this;
        }

        public Criteria andTestMinLessThanOrEqualTo(Integer value) {
            addCriterion("test_min <=", value, "testMin");
            return (Criteria) this;
        }

        public Criteria andTestMinIn(List<Integer> values) {
            addCriterion("test_min in", values, "testMin");
            return (Criteria) this;
        }

        public Criteria andTestMinNotIn(List<Integer> values) {
            addCriterion("test_min not in", values, "testMin");
            return (Criteria) this;
        }

        public Criteria andTestMinBetween(Integer value1, Integer value2) {
            addCriterion("test_min between", value1, value2, "testMin");
            return (Criteria) this;
        }

        public Criteria andTestMinNotBetween(Integer value1, Integer value2) {
            addCriterion("test_min not between", value1, value2, "testMin");
            return (Criteria) this;
        }

        public Criteria andIsagingIsNull() {
            addCriterion("isaging is null");
            return (Criteria) this;
        }

        public Criteria andIsagingIsNotNull() {
            addCriterion("isaging is not null");
            return (Criteria) this;
        }

        public Criteria andIsagingEqualTo(String value) {
            addCriterion("isaging =", value, "isaging");
            return (Criteria) this;
        }

        public Criteria andIsagingNotEqualTo(String value) {
            addCriterion("isaging <>", value, "isaging");
            return (Criteria) this;
        }

        public Criteria andIsagingGreaterThan(String value) {
            addCriterion("isaging >", value, "isaging");
            return (Criteria) this;
        }

        public Criteria andIsagingGreaterThanOrEqualTo(String value) {
            addCriterion("isaging >=", value, "isaging");
            return (Criteria) this;
        }

        public Criteria andIsagingLessThan(String value) {
            addCriterion("isaging <", value, "isaging");
            return (Criteria) this;
        }

        public Criteria andIsagingLessThanOrEqualTo(String value) {
            addCriterion("isaging <=", value, "isaging");
            return (Criteria) this;
        }

        public Criteria andIsagingLike(String value) {
            addCriterion("isaging like", value, "isaging");
            return (Criteria) this;
        }

        public Criteria andIsagingNotLike(String value) {
            addCriterion("isaging not like", value, "isaging");
            return (Criteria) this;
        }

        public Criteria andIsagingIn(List<String> values) {
            addCriterion("isaging in", values, "isaging");
            return (Criteria) this;
        }

        public Criteria andIsagingNotIn(List<String> values) {
            addCriterion("isaging not in", values, "isaging");
            return (Criteria) this;
        }

        public Criteria andIsagingBetween(String value1, String value2) {
            addCriterion("isaging between", value1, value2, "isaging");
            return (Criteria) this;
        }

        public Criteria andIsagingNotBetween(String value1, String value2) {
            addCriterion("isaging not between", value1, value2, "isaging");
            return (Criteria) this;
        }

        public Criteria andAgingMinIsNull() {
            addCriterion("aging_min is null");
            return (Criteria) this;
        }

        public Criteria andAgingMinIsNotNull() {
            addCriterion("aging_min is not null");
            return (Criteria) this;
        }

        public Criteria andAgingMinEqualTo(Integer value) {
            addCriterion("aging_min =", value, "agingMin");
            return (Criteria) this;
        }

        public Criteria andAgingMinNotEqualTo(Integer value) {
            addCriterion("aging_min <>", value, "agingMin");
            return (Criteria) this;
        }

        public Criteria andAgingMinGreaterThan(Integer value) {
            addCriterion("aging_min >", value, "agingMin");
            return (Criteria) this;
        }

        public Criteria andAgingMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("aging_min >=", value, "agingMin");
            return (Criteria) this;
        }

        public Criteria andAgingMinLessThan(Integer value) {
            addCriterion("aging_min <", value, "agingMin");
            return (Criteria) this;
        }

        public Criteria andAgingMinLessThanOrEqualTo(Integer value) {
            addCriterion("aging_min <=", value, "agingMin");
            return (Criteria) this;
        }

        public Criteria andAgingMinIn(List<Integer> values) {
            addCriterion("aging_min in", values, "agingMin");
            return (Criteria) this;
        }

        public Criteria andAgingMinNotIn(List<Integer> values) {
            addCriterion("aging_min not in", values, "agingMin");
            return (Criteria) this;
        }

        public Criteria andAgingMinBetween(Integer value1, Integer value2) {
            addCriterion("aging_min between", value1, value2, "agingMin");
            return (Criteria) this;
        }

        public Criteria andAgingMinNotBetween(Integer value1, Integer value2) {
            addCriterion("aging_min not between", value1, value2, "agingMin");
            return (Criteria) this;
        }

        public Criteria andExeStandardIsNull() {
            addCriterion("exe_standard is null");
            return (Criteria) this;
        }

        public Criteria andExeStandardIsNotNull() {
            addCriterion("exe_standard is not null");
            return (Criteria) this;
        }

        public Criteria andExeStandardEqualTo(String value) {
            addCriterion("exe_standard =", value, "exeStandard");
            return (Criteria) this;
        }

        public Criteria andExeStandardNotEqualTo(String value) {
            addCriterion("exe_standard <>", value, "exeStandard");
            return (Criteria) this;
        }

        public Criteria andExeStandardGreaterThan(String value) {
            addCriterion("exe_standard >", value, "exeStandard");
            return (Criteria) this;
        }

        public Criteria andExeStandardGreaterThanOrEqualTo(String value) {
            addCriterion("exe_standard >=", value, "exeStandard");
            return (Criteria) this;
        }

        public Criteria andExeStandardLessThan(String value) {
            addCriterion("exe_standard <", value, "exeStandard");
            return (Criteria) this;
        }

        public Criteria andExeStandardLessThanOrEqualTo(String value) {
            addCriterion("exe_standard <=", value, "exeStandard");
            return (Criteria) this;
        }

        public Criteria andExeStandardLike(String value) {
            addCriterion("exe_standard like", value, "exeStandard");
            return (Criteria) this;
        }

        public Criteria andExeStandardNotLike(String value) {
            addCriterion("exe_standard not like", value, "exeStandard");
            return (Criteria) this;
        }

        public Criteria andExeStandardIn(List<String> values) {
            addCriterion("exe_standard in", values, "exeStandard");
            return (Criteria) this;
        }

        public Criteria andExeStandardNotIn(List<String> values) {
            addCriterion("exe_standard not in", values, "exeStandard");
            return (Criteria) this;
        }

        public Criteria andExeStandardBetween(String value1, String value2) {
            addCriterion("exe_standard between", value1, value2, "exeStandard");
            return (Criteria) this;
        }

        public Criteria andExeStandardNotBetween(String value1, String value2) {
            addCriterion("exe_standard not between", value1, value2, "exeStandard");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceIsNull() {
            addCriterion("steel_mesh_source is null");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceIsNotNull() {
            addCriterion("steel_mesh_source is not null");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceEqualTo(String value) {
            addCriterion("steel_mesh_source =", value, "steelMeshSource");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceNotEqualTo(String value) {
            addCriterion("steel_mesh_source <>", value, "steelMeshSource");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceGreaterThan(String value) {
            addCriterion("steel_mesh_source >", value, "steelMeshSource");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceGreaterThanOrEqualTo(String value) {
            addCriterion("steel_mesh_source >=", value, "steelMeshSource");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceLessThan(String value) {
            addCriterion("steel_mesh_source <", value, "steelMeshSource");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceLessThanOrEqualTo(String value) {
            addCriterion("steel_mesh_source <=", value, "steelMeshSource");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceLike(String value) {
            addCriterion("steel_mesh_source like", value, "steelMeshSource");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceNotLike(String value) {
            addCriterion("steel_mesh_source not like", value, "steelMeshSource");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceIn(List<String> values) {
            addCriterion("steel_mesh_source in", values, "steelMeshSource");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceNotIn(List<String> values) {
            addCriterion("steel_mesh_source not in", values, "steelMeshSource");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceBetween(String value1, String value2) {
            addCriterion("steel_mesh_source between", value1, value2, "steelMeshSource");
            return (Criteria) this;
        }

        public Criteria andSteelMeshSourceNotBetween(String value1, String value2) {
            addCriterion("steel_mesh_source not between", value1, value2, "steelMeshSource");
            return (Criteria) this;
        }

        public Criteria andDefenseIsNull() {
            addCriterion("defense is null");
            return (Criteria) this;
        }

        public Criteria andDefenseIsNotNull() {
            addCriterion("defense is not null");
            return (Criteria) this;
        }

        public Criteria andDefenseEqualTo(String value) {
            addCriterion("defense =", value, "defense");
            return (Criteria) this;
        }

        public Criteria andDefenseNotEqualTo(String value) {
            addCriterion("defense <>", value, "defense");
            return (Criteria) this;
        }

        public Criteria andDefenseGreaterThan(String value) {
            addCriterion("defense >", value, "defense");
            return (Criteria) this;
        }

        public Criteria andDefenseGreaterThanOrEqualTo(String value) {
            addCriterion("defense >=", value, "defense");
            return (Criteria) this;
        }

        public Criteria andDefenseLessThan(String value) {
            addCriterion("defense <", value, "defense");
            return (Criteria) this;
        }

        public Criteria andDefenseLessThanOrEqualTo(String value) {
            addCriterion("defense <=", value, "defense");
            return (Criteria) this;
        }

        public Criteria andDefenseLike(String value) {
            addCriterion("defense like", value, "defense");
            return (Criteria) this;
        }

        public Criteria andDefenseNotLike(String value) {
            addCriterion("defense not like", value, "defense");
            return (Criteria) this;
        }

        public Criteria andDefenseIn(List<String> values) {
            addCriterion("defense in", values, "defense");
            return (Criteria) this;
        }

        public Criteria andDefenseNotIn(List<String> values) {
            addCriterion("defense not in", values, "defense");
            return (Criteria) this;
        }

        public Criteria andDefenseBetween(String value1, String value2) {
            addCriterion("defense between", value1, value2, "defense");
            return (Criteria) this;
        }

        public Criteria andDefenseNotBetween(String value1, String value2) {
            addCriterion("defense not between", value1, value2, "defense");
            return (Criteria) this;
        }

        public Criteria andDefenseAreaIsNull() {
            addCriterion("defense_area is null");
            return (Criteria) this;
        }

        public Criteria andDefenseAreaIsNotNull() {
            addCriterion("defense_area is not null");
            return (Criteria) this;
        }

        public Criteria andDefenseAreaEqualTo(BigDecimal value) {
            addCriterion("defense_area =", value, "defenseArea");
            return (Criteria) this;
        }

        public Criteria andDefenseAreaNotEqualTo(BigDecimal value) {
            addCriterion("defense_area <>", value, "defenseArea");
            return (Criteria) this;
        }

        public Criteria andDefenseAreaGreaterThan(BigDecimal value) {
            addCriterion("defense_area >", value, "defenseArea");
            return (Criteria) this;
        }

        public Criteria andDefenseAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("defense_area >=", value, "defenseArea");
            return (Criteria) this;
        }

        public Criteria andDefenseAreaLessThan(BigDecimal value) {
            addCriterion("defense_area <", value, "defenseArea");
            return (Criteria) this;
        }

        public Criteria andDefenseAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("defense_area <=", value, "defenseArea");
            return (Criteria) this;
        }

        public Criteria andDefenseAreaIn(List<BigDecimal> values) {
            addCriterion("defense_area in", values, "defenseArea");
            return (Criteria) this;
        }

        public Criteria andDefenseAreaNotIn(List<BigDecimal> values) {
            addCriterion("defense_area not in", values, "defenseArea");
            return (Criteria) this;
        }

        public Criteria andDefenseAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("defense_area between", value1, value2, "defenseArea");
            return (Criteria) this;
        }

        public Criteria andDefenseAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("defense_area not between", value1, value2, "defenseArea");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsIsNull() {
            addCriterion("seal_technics is null");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsIsNotNull() {
            addCriterion("seal_technics is not null");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsEqualTo(String value) {
            addCriterion("seal_technics =", value, "sealTechnics");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsNotEqualTo(String value) {
            addCriterion("seal_technics <>", value, "sealTechnics");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsGreaterThan(String value) {
            addCriterion("seal_technics >", value, "sealTechnics");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsGreaterThanOrEqualTo(String value) {
            addCriterion("seal_technics >=", value, "sealTechnics");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsLessThan(String value) {
            addCriterion("seal_technics <", value, "sealTechnics");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsLessThanOrEqualTo(String value) {
            addCriterion("seal_technics <=", value, "sealTechnics");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsLike(String value) {
            addCriterion("seal_technics like", value, "sealTechnics");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsNotLike(String value) {
            addCriterion("seal_technics not like", value, "sealTechnics");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsIn(List<String> values) {
            addCriterion("seal_technics in", values, "sealTechnics");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsNotIn(List<String> values) {
            addCriterion("seal_technics not in", values, "sealTechnics");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsBetween(String value1, String value2) {
            addCriterion("seal_technics between", value1, value2, "sealTechnics");
            return (Criteria) this;
        }

        public Criteria andSealTechnicsNotBetween(String value1, String value2) {
            addCriterion("seal_technics not between", value1, value2, "sealTechnics");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceIsNull() {
            addCriterion("material_source is null");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceIsNotNull() {
            addCriterion("material_source is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceEqualTo(String value) {
            addCriterion("material_source =", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotEqualTo(String value) {
            addCriterion("material_source <>", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceGreaterThan(String value) {
            addCriterion("material_source >", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceGreaterThanOrEqualTo(String value) {
            addCriterion("material_source >=", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceLessThan(String value) {
            addCriterion("material_source <", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceLessThanOrEqualTo(String value) {
            addCriterion("material_source <=", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceLike(String value) {
            addCriterion("material_source like", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotLike(String value) {
            addCriterion("material_source not like", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceIn(List<String> values) {
            addCriterion("material_source in", values, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotIn(List<String> values) {
            addCriterion("material_source not in", values, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceBetween(String value1, String value2) {
            addCriterion("material_source between", value1, value2, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotBetween(String value1, String value2) {
            addCriterion("material_source not between", value1, value2, "materialSource");
            return (Criteria) this;
        }

        public Criteria andIspcbIsNull() {
            addCriterion("ispcb is null");
            return (Criteria) this;
        }

        public Criteria andIspcbIsNotNull() {
            addCriterion("ispcb is not null");
            return (Criteria) this;
        }

        public Criteria andIspcbEqualTo(String value) {
            addCriterion("ispcb =", value, "ispcb");
            return (Criteria) this;
        }

        public Criteria andIspcbNotEqualTo(String value) {
            addCriterion("ispcb <>", value, "ispcb");
            return (Criteria) this;
        }

        public Criteria andIspcbGreaterThan(String value) {
            addCriterion("ispcb >", value, "ispcb");
            return (Criteria) this;
        }

        public Criteria andIspcbGreaterThanOrEqualTo(String value) {
            addCriterion("ispcb >=", value, "ispcb");
            return (Criteria) this;
        }

        public Criteria andIspcbLessThan(String value) {
            addCriterion("ispcb <", value, "ispcb");
            return (Criteria) this;
        }

        public Criteria andIspcbLessThanOrEqualTo(String value) {
            addCriterion("ispcb <=", value, "ispcb");
            return (Criteria) this;
        }

        public Criteria andIspcbLike(String value) {
            addCriterion("ispcb like", value, "ispcb");
            return (Criteria) this;
        }

        public Criteria andIspcbNotLike(String value) {
            addCriterion("ispcb not like", value, "ispcb");
            return (Criteria) this;
        }

        public Criteria andIspcbIn(List<String> values) {
            addCriterion("ispcb in", values, "ispcb");
            return (Criteria) this;
        }

        public Criteria andIspcbNotIn(List<String> values) {
            addCriterion("ispcb not in", values, "ispcb");
            return (Criteria) this;
        }

        public Criteria andIspcbBetween(String value1, String value2) {
            addCriterion("ispcb between", value1, value2, "ispcb");
            return (Criteria) this;
        }

        public Criteria andIspcbNotBetween(String value1, String value2) {
            addCriterion("ispcb not between", value1, value2, "ispcb");
            return (Criteria) this;
        }

        public Criteria andPcbSourceIsNull() {
            addCriterion("pcb_source is null");
            return (Criteria) this;
        }

        public Criteria andPcbSourceIsNotNull() {
            addCriterion("pcb_source is not null");
            return (Criteria) this;
        }

        public Criteria andPcbSourceEqualTo(String value) {
            addCriterion("pcb_source =", value, "pcbSource");
            return (Criteria) this;
        }

        public Criteria andPcbSourceNotEqualTo(String value) {
            addCriterion("pcb_source <>", value, "pcbSource");
            return (Criteria) this;
        }

        public Criteria andPcbSourceGreaterThan(String value) {
            addCriterion("pcb_source >", value, "pcbSource");
            return (Criteria) this;
        }

        public Criteria andPcbSourceGreaterThanOrEqualTo(String value) {
            addCriterion("pcb_source >=", value, "pcbSource");
            return (Criteria) this;
        }

        public Criteria andPcbSourceLessThan(String value) {
            addCriterion("pcb_source <", value, "pcbSource");
            return (Criteria) this;
        }

        public Criteria andPcbSourceLessThanOrEqualTo(String value) {
            addCriterion("pcb_source <=", value, "pcbSource");
            return (Criteria) this;
        }

        public Criteria andPcbSourceLike(String value) {
            addCriterion("pcb_source like", value, "pcbSource");
            return (Criteria) this;
        }

        public Criteria andPcbSourceNotLike(String value) {
            addCriterion("pcb_source not like", value, "pcbSource");
            return (Criteria) this;
        }

        public Criteria andPcbSourceIn(List<String> values) {
            addCriterion("pcb_source in", values, "pcbSource");
            return (Criteria) this;
        }

        public Criteria andPcbSourceNotIn(List<String> values) {
            addCriterion("pcb_source not in", values, "pcbSource");
            return (Criteria) this;
        }

        public Criteria andPcbSourceBetween(String value1, String value2) {
            addCriterion("pcb_source between", value1, value2, "pcbSource");
            return (Criteria) this;
        }

        public Criteria andPcbSourceNotBetween(String value1, String value2) {
            addCriterion("pcb_source not between", value1, value2, "pcbSource");
            return (Criteria) this;
        }

        public Criteria andPcbLongIsNull() {
            addCriterion("pcb_long is null");
            return (Criteria) this;
        }

        public Criteria andPcbLongIsNotNull() {
            addCriterion("pcb_long is not null");
            return (Criteria) this;
        }

        public Criteria andPcbLongEqualTo(Double value) {
            addCriterion("pcb_long =", value, "pcbLong");
            return (Criteria) this;
        }

        public Criteria andPcbLongNotEqualTo(Double value) {
            addCriterion("pcb_long <>", value, "pcbLong");
            return (Criteria) this;
        }

        public Criteria andPcbLongGreaterThan(Double value) {
            addCriterion("pcb_long >", value, "pcbLong");
            return (Criteria) this;
        }

        public Criteria andPcbLongGreaterThanOrEqualTo(Double value) {
            addCriterion("pcb_long >=", value, "pcbLong");
            return (Criteria) this;
        }

        public Criteria andPcbLongLessThan(Double value) {
            addCriterion("pcb_long <", value, "pcbLong");
            return (Criteria) this;
        }

        public Criteria andPcbLongLessThanOrEqualTo(Double value) {
            addCriterion("pcb_long <=", value, "pcbLong");
            return (Criteria) this;
        }

        public Criteria andPcbLongIn(List<Double> values) {
            addCriterion("pcb_long in", values, "pcbLong");
            return (Criteria) this;
        }

        public Criteria andPcbLongNotIn(List<Double> values) {
            addCriterion("pcb_long not in", values, "pcbLong");
            return (Criteria) this;
        }

        public Criteria andPcbLongBetween(Double value1, Double value2) {
            addCriterion("pcb_long between", value1, value2, "pcbLong");
            return (Criteria) this;
        }

        public Criteria andPcbLongNotBetween(Double value1, Double value2) {
            addCriterion("pcb_long not between", value1, value2, "pcbLong");
            return (Criteria) this;
        }

        public Criteria andPcbWideIsNull() {
            addCriterion("pcb_wide is null");
            return (Criteria) this;
        }

        public Criteria andPcbWideIsNotNull() {
            addCriterion("pcb_wide is not null");
            return (Criteria) this;
        }

        public Criteria andPcbWideEqualTo(Double value) {
            addCriterion("pcb_wide =", value, "pcbWide");
            return (Criteria) this;
        }

        public Criteria andPcbWideNotEqualTo(Double value) {
            addCriterion("pcb_wide <>", value, "pcbWide");
            return (Criteria) this;
        }

        public Criteria andPcbWideGreaterThan(Double value) {
            addCriterion("pcb_wide >", value, "pcbWide");
            return (Criteria) this;
        }

        public Criteria andPcbWideGreaterThanOrEqualTo(Double value) {
            addCriterion("pcb_wide >=", value, "pcbWide");
            return (Criteria) this;
        }

        public Criteria andPcbWideLessThan(Double value) {
            addCriterion("pcb_wide <", value, "pcbWide");
            return (Criteria) this;
        }

        public Criteria andPcbWideLessThanOrEqualTo(Double value) {
            addCriterion("pcb_wide <=", value, "pcbWide");
            return (Criteria) this;
        }

        public Criteria andPcbWideIn(List<Double> values) {
            addCriterion("pcb_wide in", values, "pcbWide");
            return (Criteria) this;
        }

        public Criteria andPcbWideNotIn(List<Double> values) {
            addCriterion("pcb_wide not in", values, "pcbWide");
            return (Criteria) this;
        }

        public Criteria andPcbWideBetween(Double value1, Double value2) {
            addCriterion("pcb_wide between", value1, value2, "pcbWide");
            return (Criteria) this;
        }

        public Criteria andPcbWideNotBetween(Double value1, Double value2) {
            addCriterion("pcb_wide not between", value1, value2, "pcbWide");
            return (Criteria) this;
        }

        public Criteria andPcbThickIsNull() {
            addCriterion("pcb_thick is null");
            return (Criteria) this;
        }

        public Criteria andPcbThickIsNotNull() {
            addCriterion("pcb_thick is not null");
            return (Criteria) this;
        }

        public Criteria andPcbThickEqualTo(Integer value) {
            addCriterion("pcb_thick =", value, "pcbThick");
            return (Criteria) this;
        }

        public Criteria andPcbThickNotEqualTo(Integer value) {
            addCriterion("pcb_thick <>", value, "pcbThick");
            return (Criteria) this;
        }

        public Criteria andPcbThickGreaterThan(Integer value) {
            addCriterion("pcb_thick >", value, "pcbThick");
            return (Criteria) this;
        }

        public Criteria andPcbThickGreaterThanOrEqualTo(Integer value) {
            addCriterion("pcb_thick >=", value, "pcbThick");
            return (Criteria) this;
        }

        public Criteria andPcbThickLessThan(Integer value) {
            addCriterion("pcb_thick <", value, "pcbThick");
            return (Criteria) this;
        }

        public Criteria andPcbThickLessThanOrEqualTo(Integer value) {
            addCriterion("pcb_thick <=", value, "pcbThick");
            return (Criteria) this;
        }

        public Criteria andPcbThickIn(List<Integer> values) {
            addCriterion("pcb_thick in", values, "pcbThick");
            return (Criteria) this;
        }

        public Criteria andPcbThickNotIn(List<Integer> values) {
            addCriterion("pcb_thick not in", values, "pcbThick");
            return (Criteria) this;
        }

        public Criteria andPcbThickBetween(Integer value1, Integer value2) {
            addCriterion("pcb_thick between", value1, value2, "pcbThick");
            return (Criteria) this;
        }

        public Criteria andPcbThickNotBetween(Integer value1, Integer value2) {
            addCriterion("pcb_thick not between", value1, value2, "pcbThick");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorIsNull() {
            addCriterion("pcb_resist_color is null");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorIsNotNull() {
            addCriterion("pcb_resist_color is not null");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorEqualTo(String value) {
            addCriterion("pcb_resist_color =", value, "pcbResistColor");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorNotEqualTo(String value) {
            addCriterion("pcb_resist_color <>", value, "pcbResistColor");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorGreaterThan(String value) {
            addCriterion("pcb_resist_color >", value, "pcbResistColor");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorGreaterThanOrEqualTo(String value) {
            addCriterion("pcb_resist_color >=", value, "pcbResistColor");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorLessThan(String value) {
            addCriterion("pcb_resist_color <", value, "pcbResistColor");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorLessThanOrEqualTo(String value) {
            addCriterion("pcb_resist_color <=", value, "pcbResistColor");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorLike(String value) {
            addCriterion("pcb_resist_color like", value, "pcbResistColor");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorNotLike(String value) {
            addCriterion("pcb_resist_color not like", value, "pcbResistColor");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorIn(List<String> values) {
            addCriterion("pcb_resist_color in", values, "pcbResistColor");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorNotIn(List<String> values) {
            addCriterion("pcb_resist_color not in", values, "pcbResistColor");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorBetween(String value1, String value2) {
            addCriterion("pcb_resist_color between", value1, value2, "pcbResistColor");
            return (Criteria) this;
        }

        public Criteria andPcbResistColorNotBetween(String value1, String value2) {
            addCriterion("pcb_resist_color not between", value1, value2, "pcbResistColor");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorIsNull() {
            addCriterion("pcb_char_color is null");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorIsNotNull() {
            addCriterion("pcb_char_color is not null");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorEqualTo(String value) {
            addCriterion("pcb_char_color =", value, "pcbCharColor");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorNotEqualTo(String value) {
            addCriterion("pcb_char_color <>", value, "pcbCharColor");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorGreaterThan(String value) {
            addCriterion("pcb_char_color >", value, "pcbCharColor");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorGreaterThanOrEqualTo(String value) {
            addCriterion("pcb_char_color >=", value, "pcbCharColor");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorLessThan(String value) {
            addCriterion("pcb_char_color <", value, "pcbCharColor");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorLessThanOrEqualTo(String value) {
            addCriterion("pcb_char_color <=", value, "pcbCharColor");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorLike(String value) {
            addCriterion("pcb_char_color like", value, "pcbCharColor");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorNotLike(String value) {
            addCriterion("pcb_char_color not like", value, "pcbCharColor");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorIn(List<String> values) {
            addCriterion("pcb_char_color in", values, "pcbCharColor");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorNotIn(List<String> values) {
            addCriterion("pcb_char_color not in", values, "pcbCharColor");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorBetween(String value1, String value2) {
            addCriterion("pcb_char_color between", value1, value2, "pcbCharColor");
            return (Criteria) this;
        }

        public Criteria andPcbCharColorNotBetween(String value1, String value2) {
            addCriterion("pcb_char_color not between", value1, value2, "pcbCharColor");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverIsNull() {
            addCriterion("pcb_resist_cover is null");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverIsNotNull() {
            addCriterion("pcb_resist_cover is not null");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverEqualTo(String value) {
            addCriterion("pcb_resist_cover =", value, "pcbResistCover");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverNotEqualTo(String value) {
            addCriterion("pcb_resist_cover <>", value, "pcbResistCover");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverGreaterThan(String value) {
            addCriterion("pcb_resist_cover >", value, "pcbResistCover");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverGreaterThanOrEqualTo(String value) {
            addCriterion("pcb_resist_cover >=", value, "pcbResistCover");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverLessThan(String value) {
            addCriterion("pcb_resist_cover <", value, "pcbResistCover");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverLessThanOrEqualTo(String value) {
            addCriterion("pcb_resist_cover <=", value, "pcbResistCover");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverLike(String value) {
            addCriterion("pcb_resist_cover like", value, "pcbResistCover");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverNotLike(String value) {
            addCriterion("pcb_resist_cover not like", value, "pcbResistCover");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverIn(List<String> values) {
            addCriterion("pcb_resist_cover in", values, "pcbResistCover");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverNotIn(List<String> values) {
            addCriterion("pcb_resist_cover not in", values, "pcbResistCover");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverBetween(String value1, String value2) {
            addCriterion("pcb_resist_cover between", value1, value2, "pcbResistCover");
            return (Criteria) this;
        }

        public Criteria andPcbResistCoverNotBetween(String value1, String value2) {
            addCriterion("pcb_resist_cover not between", value1, value2, "pcbResistCover");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyIsNull() {
            addCriterion("pcb_pad_spary is null");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyIsNotNull() {
            addCriterion("pcb_pad_spary is not null");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyEqualTo(String value) {
            addCriterion("pcb_pad_spary =", value, "pcbPadSpary");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyNotEqualTo(String value) {
            addCriterion("pcb_pad_spary <>", value, "pcbPadSpary");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyGreaterThan(String value) {
            addCriterion("pcb_pad_spary >", value, "pcbPadSpary");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyGreaterThanOrEqualTo(String value) {
            addCriterion("pcb_pad_spary >=", value, "pcbPadSpary");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyLessThan(String value) {
            addCriterion("pcb_pad_spary <", value, "pcbPadSpary");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyLessThanOrEqualTo(String value) {
            addCriterion("pcb_pad_spary <=", value, "pcbPadSpary");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyLike(String value) {
            addCriterion("pcb_pad_spary like", value, "pcbPadSpary");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyNotLike(String value) {
            addCriterion("pcb_pad_spary not like", value, "pcbPadSpary");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyIn(List<String> values) {
            addCriterion("pcb_pad_spary in", values, "pcbPadSpary");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyNotIn(List<String> values) {
            addCriterion("pcb_pad_spary not in", values, "pcbPadSpary");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyBetween(String value1, String value2) {
            addCriterion("pcb_pad_spary between", value1, value2, "pcbPadSpary");
            return (Criteria) this;
        }

        public Criteria andPcbPadSparyNotBetween(String value1, String value2) {
            addCriterion("pcb_pad_spary not between", value1, value2, "pcbPadSpary");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickIsNull() {
            addCriterion("pcb_copper_thick is null");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickIsNotNull() {
            addCriterion("pcb_copper_thick is not null");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickEqualTo(String value) {
            addCriterion("pcb_copper_thick =", value, "pcbCopperThick");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickNotEqualTo(String value) {
            addCriterion("pcb_copper_thick <>", value, "pcbCopperThick");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickGreaterThan(String value) {
            addCriterion("pcb_copper_thick >", value, "pcbCopperThick");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickGreaterThanOrEqualTo(String value) {
            addCriterion("pcb_copper_thick >=", value, "pcbCopperThick");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickLessThan(String value) {
            addCriterion("pcb_copper_thick <", value, "pcbCopperThick");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickLessThanOrEqualTo(String value) {
            addCriterion("pcb_copper_thick <=", value, "pcbCopperThick");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickLike(String value) {
            addCriterion("pcb_copper_thick like", value, "pcbCopperThick");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickNotLike(String value) {
            addCriterion("pcb_copper_thick not like", value, "pcbCopperThick");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickIn(List<String> values) {
            addCriterion("pcb_copper_thick in", values, "pcbCopperThick");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickNotIn(List<String> values) {
            addCriterion("pcb_copper_thick not in", values, "pcbCopperThick");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickBetween(String value1, String value2) {
            addCriterion("pcb_copper_thick between", value1, value2, "pcbCopperThick");
            return (Criteria) this;
        }

        public Criteria andPcbCopperThickNotBetween(String value1, String value2) {
            addCriterion("pcb_copper_thick not between", value1, value2, "pcbCopperThick");
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

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Integer value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Integer value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Integer value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Integer value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Integer value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Integer> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Integer> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Integer value1, Integer value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andBomFilenameIsNull() {
            addCriterion("bom_filename is null");
            return (Criteria) this;
        }

        public Criteria andBomFilenameIsNotNull() {
            addCriterion("bom_filename is not null");
            return (Criteria) this;
        }

        public Criteria andBomFilenameEqualTo(String value) {
            addCriterion("bom_filename =", value, "bomFilename");
            return (Criteria) this;
        }

        public Criteria andBomFilenameNotEqualTo(String value) {
            addCriterion("bom_filename <>", value, "bomFilename");
            return (Criteria) this;
        }

        public Criteria andBomFilenameGreaterThan(String value) {
            addCriterion("bom_filename >", value, "bomFilename");
            return (Criteria) this;
        }

        public Criteria andBomFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("bom_filename >=", value, "bomFilename");
            return (Criteria) this;
        }

        public Criteria andBomFilenameLessThan(String value) {
            addCriterion("bom_filename <", value, "bomFilename");
            return (Criteria) this;
        }

        public Criteria andBomFilenameLessThanOrEqualTo(String value) {
            addCriterion("bom_filename <=", value, "bomFilename");
            return (Criteria) this;
        }

        public Criteria andBomFilenameLike(String value) {
            addCriterion("bom_filename like", value, "bomFilename");
            return (Criteria) this;
        }

        public Criteria andBomFilenameNotLike(String value) {
            addCriterion("bom_filename not like", value, "bomFilename");
            return (Criteria) this;
        }

        public Criteria andBomFilenameIn(List<String> values) {
            addCriterion("bom_filename in", values, "bomFilename");
            return (Criteria) this;
        }

        public Criteria andBomFilenameNotIn(List<String> values) {
            addCriterion("bom_filename not in", values, "bomFilename");
            return (Criteria) this;
        }

        public Criteria andBomFilenameBetween(String value1, String value2) {
            addCriterion("bom_filename between", value1, value2, "bomFilename");
            return (Criteria) this;
        }

        public Criteria andBomFilenameNotBetween(String value1, String value2) {
            addCriterion("bom_filename not between", value1, value2, "bomFilename");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameIsNull() {
            addCriterion("bom_filefullname is null");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameIsNotNull() {
            addCriterion("bom_filefullname is not null");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameEqualTo(String value) {
            addCriterion("bom_filefullname =", value, "bomFilefullname");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameNotEqualTo(String value) {
            addCriterion("bom_filefullname <>", value, "bomFilefullname");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameGreaterThan(String value) {
            addCriterion("bom_filefullname >", value, "bomFilefullname");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameGreaterThanOrEqualTo(String value) {
            addCriterion("bom_filefullname >=", value, "bomFilefullname");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameLessThan(String value) {
            addCriterion("bom_filefullname <", value, "bomFilefullname");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameLessThanOrEqualTo(String value) {
            addCriterion("bom_filefullname <=", value, "bomFilefullname");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameLike(String value) {
            addCriterion("bom_filefullname like", value, "bomFilefullname");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameNotLike(String value) {
            addCriterion("bom_filefullname not like", value, "bomFilefullname");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameIn(List<String> values) {
            addCriterion("bom_filefullname in", values, "bomFilefullname");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameNotIn(List<String> values) {
            addCriterion("bom_filefullname not in", values, "bomFilefullname");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameBetween(String value1, String value2) {
            addCriterion("bom_filefullname between", value1, value2, "bomFilefullname");
            return (Criteria) this;
        }

        public Criteria andBomFilefullnameNotBetween(String value1, String value2) {
            addCriterion("bom_filefullname not between", value1, value2, "bomFilefullname");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameIsNull() {
            addCriterion("pcb_filename is null");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameIsNotNull() {
            addCriterion("pcb_filename is not null");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameEqualTo(String value) {
            addCriterion("pcb_filename =", value, "pcbFilename");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameNotEqualTo(String value) {
            addCriterion("pcb_filename <>", value, "pcbFilename");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameGreaterThan(String value) {
            addCriterion("pcb_filename >", value, "pcbFilename");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("pcb_filename >=", value, "pcbFilename");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameLessThan(String value) {
            addCriterion("pcb_filename <", value, "pcbFilename");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameLessThanOrEqualTo(String value) {
            addCriterion("pcb_filename <=", value, "pcbFilename");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameLike(String value) {
            addCriterion("pcb_filename like", value, "pcbFilename");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameNotLike(String value) {
            addCriterion("pcb_filename not like", value, "pcbFilename");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameIn(List<String> values) {
            addCriterion("pcb_filename in", values, "pcbFilename");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameNotIn(List<String> values) {
            addCriterion("pcb_filename not in", values, "pcbFilename");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameBetween(String value1, String value2) {
            addCriterion("pcb_filename between", value1, value2, "pcbFilename");
            return (Criteria) this;
        }

        public Criteria andPcbFilenameNotBetween(String value1, String value2) {
            addCriterion("pcb_filename not between", value1, value2, "pcbFilename");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameIsNull() {
            addCriterion("pcb_filefullname is null");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameIsNotNull() {
            addCriterion("pcb_filefullname is not null");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameEqualTo(String value) {
            addCriterion("pcb_filefullname =", value, "pcbFilefullname");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameNotEqualTo(String value) {
            addCriterion("pcb_filefullname <>", value, "pcbFilefullname");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameGreaterThan(String value) {
            addCriterion("pcb_filefullname >", value, "pcbFilefullname");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameGreaterThanOrEqualTo(String value) {
            addCriterion("pcb_filefullname >=", value, "pcbFilefullname");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameLessThan(String value) {
            addCriterion("pcb_filefullname <", value, "pcbFilefullname");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameLessThanOrEqualTo(String value) {
            addCriterion("pcb_filefullname <=", value, "pcbFilefullname");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameLike(String value) {
            addCriterion("pcb_filefullname like", value, "pcbFilefullname");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameNotLike(String value) {
            addCriterion("pcb_filefullname not like", value, "pcbFilefullname");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameIn(List<String> values) {
            addCriterion("pcb_filefullname in", values, "pcbFilefullname");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameNotIn(List<String> values) {
            addCriterion("pcb_filefullname not in", values, "pcbFilefullname");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameBetween(String value1, String value2) {
            addCriterion("pcb_filefullname between", value1, value2, "pcbFilefullname");
            return (Criteria) this;
        }

        public Criteria andPcbFilefullnameNotBetween(String value1, String value2) {
            addCriterion("pcb_filefullname not between", value1, value2, "pcbFilefullname");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameIsNull() {
            addCriterion("craft_filename is null");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameIsNotNull() {
            addCriterion("craft_filename is not null");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameEqualTo(String value) {
            addCriterion("craft_filename =", value, "craftFilename");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameNotEqualTo(String value) {
            addCriterion("craft_filename <>", value, "craftFilename");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameGreaterThan(String value) {
            addCriterion("craft_filename >", value, "craftFilename");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("craft_filename >=", value, "craftFilename");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameLessThan(String value) {
            addCriterion("craft_filename <", value, "craftFilename");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameLessThanOrEqualTo(String value) {
            addCriterion("craft_filename <=", value, "craftFilename");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameLike(String value) {
            addCriterion("craft_filename like", value, "craftFilename");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameNotLike(String value) {
            addCriterion("craft_filename not like", value, "craftFilename");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameIn(List<String> values) {
            addCriterion("craft_filename in", values, "craftFilename");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameNotIn(List<String> values) {
            addCriterion("craft_filename not in", values, "craftFilename");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameBetween(String value1, String value2) {
            addCriterion("craft_filename between", value1, value2, "craftFilename");
            return (Criteria) this;
        }

        public Criteria andCraftFilenameNotBetween(String value1, String value2) {
            addCriterion("craft_filename not between", value1, value2, "craftFilename");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameIsNull() {
            addCriterion("craft_filefullname is null");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameIsNotNull() {
            addCriterion("craft_filefullname is not null");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameEqualTo(String value) {
            addCriterion("craft_filefullname =", value, "craftFilefullname");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameNotEqualTo(String value) {
            addCriterion("craft_filefullname <>", value, "craftFilefullname");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameGreaterThan(String value) {
            addCriterion("craft_filefullname >", value, "craftFilefullname");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameGreaterThanOrEqualTo(String value) {
            addCriterion("craft_filefullname >=", value, "craftFilefullname");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameLessThan(String value) {
            addCriterion("craft_filefullname <", value, "craftFilefullname");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameLessThanOrEqualTo(String value) {
            addCriterion("craft_filefullname <=", value, "craftFilefullname");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameLike(String value) {
            addCriterion("craft_filefullname like", value, "craftFilefullname");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameNotLike(String value) {
            addCriterion("craft_filefullname not like", value, "craftFilefullname");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameIn(List<String> values) {
            addCriterion("craft_filefullname in", values, "craftFilefullname");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameNotIn(List<String> values) {
            addCriterion("craft_filefullname not in", values, "craftFilefullname");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameBetween(String value1, String value2) {
            addCriterion("craft_filefullname between", value1, value2, "craftFilefullname");
            return (Criteria) this;
        }

        public Criteria andCraftFilefullnameNotBetween(String value1, String value2) {
            addCriterion("craft_filefullname not between", value1, value2, "craftFilefullname");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolIsNull() {
            addCriterion("ismake_tool is null");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolIsNotNull() {
            addCriterion("ismake_tool is not null");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolEqualTo(String value) {
            addCriterion("ismake_tool =", value, "ismakeTool");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolNotEqualTo(String value) {
            addCriterion("ismake_tool <>", value, "ismakeTool");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolGreaterThan(String value) {
            addCriterion("ismake_tool >", value, "ismakeTool");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolGreaterThanOrEqualTo(String value) {
            addCriterion("ismake_tool >=", value, "ismakeTool");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolLessThan(String value) {
            addCriterion("ismake_tool <", value, "ismakeTool");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolLessThanOrEqualTo(String value) {
            addCriterion("ismake_tool <=", value, "ismakeTool");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolLike(String value) {
            addCriterion("ismake_tool like", value, "ismakeTool");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolNotLike(String value) {
            addCriterion("ismake_tool not like", value, "ismakeTool");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolIn(List<String> values) {
            addCriterion("ismake_tool in", values, "ismakeTool");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolNotIn(List<String> values) {
            addCriterion("ismake_tool not in", values, "ismakeTool");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolBetween(String value1, String value2) {
            addCriterion("ismake_tool between", value1, value2, "ismakeTool");
            return (Criteria) this;
        }

        public Criteria andIsmakeToolNotBetween(String value1, String value2) {
            addCriterion("ismake_tool not between", value1, value2, "ismakeTool");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshIsNull() {
            addCriterion("make_steel_mesh is null");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshIsNotNull() {
            addCriterion("make_steel_mesh is not null");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshEqualTo(String value) {
            addCriterion("make_steel_mesh =", value, "makeSteelMesh");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshNotEqualTo(String value) {
            addCriterion("make_steel_mesh <>", value, "makeSteelMesh");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshGreaterThan(String value) {
            addCriterion("make_steel_mesh >", value, "makeSteelMesh");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshGreaterThanOrEqualTo(String value) {
            addCriterion("make_steel_mesh >=", value, "makeSteelMesh");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshLessThan(String value) {
            addCriterion("make_steel_mesh <", value, "makeSteelMesh");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshLessThanOrEqualTo(String value) {
            addCriterion("make_steel_mesh <=", value, "makeSteelMesh");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshLike(String value) {
            addCriterion("make_steel_mesh like", value, "makeSteelMesh");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshNotLike(String value) {
            addCriterion("make_steel_mesh not like", value, "makeSteelMesh");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshIn(List<String> values) {
            addCriterion("make_steel_mesh in", values, "makeSteelMesh");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshNotIn(List<String> values) {
            addCriterion("make_steel_mesh not in", values, "makeSteelMesh");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshBetween(String value1, String value2) {
            addCriterion("make_steel_mesh between", value1, value2, "makeSteelMesh");
            return (Criteria) this;
        }

        public Criteria andMakeSteelMeshNotBetween(String value1, String value2) {
            addCriterion("make_steel_mesh not between", value1, value2, "makeSteelMesh");
            return (Criteria) this;
        }

        public Criteria andMakeDipIsNull() {
            addCriterion("make_dip is null");
            return (Criteria) this;
        }

        public Criteria andMakeDipIsNotNull() {
            addCriterion("make_dip is not null");
            return (Criteria) this;
        }

        public Criteria andMakeDipEqualTo(String value) {
            addCriterion("make_dip =", value, "makeDip");
            return (Criteria) this;
        }

        public Criteria andMakeDipNotEqualTo(String value) {
            addCriterion("make_dip <>", value, "makeDip");
            return (Criteria) this;
        }

        public Criteria andMakeDipGreaterThan(String value) {
            addCriterion("make_dip >", value, "makeDip");
            return (Criteria) this;
        }

        public Criteria andMakeDipGreaterThanOrEqualTo(String value) {
            addCriterion("make_dip >=", value, "makeDip");
            return (Criteria) this;
        }

        public Criteria andMakeDipLessThan(String value) {
            addCriterion("make_dip <", value, "makeDip");
            return (Criteria) this;
        }

        public Criteria andMakeDipLessThanOrEqualTo(String value) {
            addCriterion("make_dip <=", value, "makeDip");
            return (Criteria) this;
        }

        public Criteria andMakeDipLike(String value) {
            addCriterion("make_dip like", value, "makeDip");
            return (Criteria) this;
        }

        public Criteria andMakeDipNotLike(String value) {
            addCriterion("make_dip not like", value, "makeDip");
            return (Criteria) this;
        }

        public Criteria andMakeDipIn(List<String> values) {
            addCriterion("make_dip in", values, "makeDip");
            return (Criteria) this;
        }

        public Criteria andMakeDipNotIn(List<String> values) {
            addCriterion("make_dip not in", values, "makeDip");
            return (Criteria) this;
        }

        public Criteria andMakeDipBetween(String value1, String value2) {
            addCriterion("make_dip between", value1, value2, "makeDip");
            return (Criteria) this;
        }

        public Criteria andMakeDipNotBetween(String value1, String value2) {
            addCriterion("make_dip not between", value1, value2, "makeDip");
            return (Criteria) this;
        }

        public Criteria andMakeTestIsNull() {
            addCriterion("make_test is null");
            return (Criteria) this;
        }

        public Criteria andMakeTestIsNotNull() {
            addCriterion("make_test is not null");
            return (Criteria) this;
        }

        public Criteria andMakeTestEqualTo(String value) {
            addCriterion("make_test =", value, "makeTest");
            return (Criteria) this;
        }

        public Criteria andMakeTestNotEqualTo(String value) {
            addCriterion("make_test <>", value, "makeTest");
            return (Criteria) this;
        }

        public Criteria andMakeTestGreaterThan(String value) {
            addCriterion("make_test >", value, "makeTest");
            return (Criteria) this;
        }

        public Criteria andMakeTestGreaterThanOrEqualTo(String value) {
            addCriterion("make_test >=", value, "makeTest");
            return (Criteria) this;
        }

        public Criteria andMakeTestLessThan(String value) {
            addCriterion("make_test <", value, "makeTest");
            return (Criteria) this;
        }

        public Criteria andMakeTestLessThanOrEqualTo(String value) {
            addCriterion("make_test <=", value, "makeTest");
            return (Criteria) this;
        }

        public Criteria andMakeTestLike(String value) {
            addCriterion("make_test like", value, "makeTest");
            return (Criteria) this;
        }

        public Criteria andMakeTestNotLike(String value) {
            addCriterion("make_test not like", value, "makeTest");
            return (Criteria) this;
        }

        public Criteria andMakeTestIn(List<String> values) {
            addCriterion("make_test in", values, "makeTest");
            return (Criteria) this;
        }

        public Criteria andMakeTestNotIn(List<String> values) {
            addCriterion("make_test not in", values, "makeTest");
            return (Criteria) this;
        }

        public Criteria andMakeTestBetween(String value1, String value2) {
            addCriterion("make_test between", value1, value2, "makeTest");
            return (Criteria) this;
        }

        public Criteria andMakeTestNotBetween(String value1, String value2) {
            addCriterion("make_test not between", value1, value2, "makeTest");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseIsNull() {
            addCriterion("make_defense is null");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseIsNotNull() {
            addCriterion("make_defense is not null");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseEqualTo(String value) {
            addCriterion("make_defense =", value, "makeDefense");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseNotEqualTo(String value) {
            addCriterion("make_defense <>", value, "makeDefense");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseGreaterThan(String value) {
            addCriterion("make_defense >", value, "makeDefense");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseGreaterThanOrEqualTo(String value) {
            addCriterion("make_defense >=", value, "makeDefense");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseLessThan(String value) {
            addCriterion("make_defense <", value, "makeDefense");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseLessThanOrEqualTo(String value) {
            addCriterion("make_defense <=", value, "makeDefense");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseLike(String value) {
            addCriterion("make_defense like", value, "makeDefense");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseNotLike(String value) {
            addCriterion("make_defense not like", value, "makeDefense");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseIn(List<String> values) {
            addCriterion("make_defense in", values, "makeDefense");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseNotIn(List<String> values) {
            addCriterion("make_defense not in", values, "makeDefense");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseBetween(String value1, String value2) {
            addCriterion("make_defense between", value1, value2, "makeDefense");
            return (Criteria) this;
        }

        public Criteria andMakeDefenseNotBetween(String value1, String value2) {
            addCriterion("make_defense not between", value1, value2, "makeDefense");
            return (Criteria) this;
        }

        public Criteria andMakeAgingIsNull() {
            addCriterion("make_aging is null");
            return (Criteria) this;
        }

        public Criteria andMakeAgingIsNotNull() {
            addCriterion("make_aging is not null");
            return (Criteria) this;
        }

        public Criteria andMakeAgingEqualTo(String value) {
            addCriterion("make_aging =", value, "makeAging");
            return (Criteria) this;
        }

        public Criteria andMakeAgingNotEqualTo(String value) {
            addCriterion("make_aging <>", value, "makeAging");
            return (Criteria) this;
        }

        public Criteria andMakeAgingGreaterThan(String value) {
            addCriterion("make_aging >", value, "makeAging");
            return (Criteria) this;
        }

        public Criteria andMakeAgingGreaterThanOrEqualTo(String value) {
            addCriterion("make_aging >=", value, "makeAging");
            return (Criteria) this;
        }

        public Criteria andMakeAgingLessThan(String value) {
            addCriterion("make_aging <", value, "makeAging");
            return (Criteria) this;
        }

        public Criteria andMakeAgingLessThanOrEqualTo(String value) {
            addCriterion("make_aging <=", value, "makeAging");
            return (Criteria) this;
        }

        public Criteria andMakeAgingLike(String value) {
            addCriterion("make_aging like", value, "makeAging");
            return (Criteria) this;
        }

        public Criteria andMakeAgingNotLike(String value) {
            addCriterion("make_aging not like", value, "makeAging");
            return (Criteria) this;
        }

        public Criteria andMakeAgingIn(List<String> values) {
            addCriterion("make_aging in", values, "makeAging");
            return (Criteria) this;
        }

        public Criteria andMakeAgingNotIn(List<String> values) {
            addCriterion("make_aging not in", values, "makeAging");
            return (Criteria) this;
        }

        public Criteria andMakeAgingBetween(String value1, String value2) {
            addCriterion("make_aging between", value1, value2, "makeAging");
            return (Criteria) this;
        }

        public Criteria andMakeAgingNotBetween(String value1, String value2) {
            addCriterion("make_aging not between", value1, value2, "makeAging");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("process_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("process_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdEqualTo(String value) {
            addCriterion("process_instance_id =", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotEqualTo(String value) {
            addCriterion("process_instance_id <>", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThan(String value) {
            addCriterion("process_instance_id >", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_instance_id >=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThan(String value) {
            addCriterion("process_instance_id <", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("process_instance_id <=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLike(String value) {
            addCriterion("process_instance_id like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotLike(String value) {
            addCriterion("process_instance_id not like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIn(List<String> values) {
            addCriterion("process_instance_id in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotIn(List<String> values) {
            addCriterion("process_instance_id not in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdBetween(String value1, String value2) {
            addCriterion("process_instance_id between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotBetween(String value1, String value2) {
            addCriterion("process_instance_id not between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andApproverIsNull() {
            addCriterion("approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(Integer value) {
            addCriterion("approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(Integer value) {
            addCriterion("approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(Integer value) {
            addCriterion("approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(Integer value) {
            addCriterion("approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(Integer value) {
            addCriterion("approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(Integer value) {
            addCriterion("approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<Integer> values) {
            addCriterion("approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<Integer> values) {
            addCriterion("approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(Integer value1, Integer value2) {
            addCriterion("approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(Integer value1, Integer value2) {
            addCriterion("approver not between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIsNull() {
            addCriterion("approvetime is null");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIsNotNull() {
            addCriterion("approvetime is not null");
            return (Criteria) this;
        }

        public Criteria andApprovetimeEqualTo(String value) {
            addCriterion("approvetime =", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotEqualTo(String value) {
            addCriterion("approvetime <>", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeGreaterThan(String value) {
            addCriterion("approvetime >", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeGreaterThanOrEqualTo(String value) {
            addCriterion("approvetime >=", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLessThan(String value) {
            addCriterion("approvetime <", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLessThanOrEqualTo(String value) {
            addCriterion("approvetime <=", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLike(String value) {
            addCriterion("approvetime like", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotLike(String value) {
            addCriterion("approvetime not like", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIn(List<String> values) {
            addCriterion("approvetime in", values, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotIn(List<String> values) {
            addCriterion("approvetime not in", values, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeBetween(String value1, String value2) {
            addCriterion("approvetime between", value1, value2, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotBetween(String value1, String value2) {
            addCriterion("approvetime not between", value1, value2, "approvetime");
            return (Criteria) this;
        }

        public Criteria andBillStateIsNull() {
            addCriterion("bill_state is null");
            return (Criteria) this;
        }

        public Criteria andBillStateIsNotNull() {
            addCriterion("bill_state is not null");
            return (Criteria) this;
        }

        public Criteria andBillStateEqualTo(Integer value) {
            addCriterion("bill_state =", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotEqualTo(Integer value) {
            addCriterion("bill_state <>", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateGreaterThan(Integer value) {
            addCriterion("bill_state >", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_state >=", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateLessThan(Integer value) {
            addCriterion("bill_state <", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateLessThanOrEqualTo(Integer value) {
            addCriterion("bill_state <=", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateIn(List<Integer> values) {
            addCriterion("bill_state in", values, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotIn(List<Integer> values) {
            addCriterion("bill_state not in", values, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateBetween(Integer value1, Integer value2) {
            addCriterion("bill_state between", value1, value2, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_state not between", value1, value2, "billState");
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

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(Integer value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(Integer value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(Integer value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(Integer value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(Integer value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(Integer value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<Integer> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<Integer> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(Integer value1, Integer value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(Integer value1, Integer value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNull() {
            addCriterion("modifiedtime is null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNotNull() {
            addCriterion("modifiedtime is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeEqualTo(String value) {
            addCriterion("modifiedtime =", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotEqualTo(String value) {
            addCriterion("modifiedtime <>", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThan(String value) {
            addCriterion("modifiedtime >", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("modifiedtime >=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThan(String value) {
            addCriterion("modifiedtime <", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThanOrEqualTo(String value) {
            addCriterion("modifiedtime <=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLike(String value) {
            addCriterion("modifiedtime like", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotLike(String value) {
            addCriterion("modifiedtime not like", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIn(List<String> values) {
            addCriterion("modifiedtime in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotIn(List<String> values) {
            addCriterion("modifiedtime not in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeBetween(String value1, String value2) {
            addCriterion("modifiedtime between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotBetween(String value1, String value2) {
            addCriterion("modifiedtime not between", value1, value2, "modifiedtime");
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

        public Criteria andSpecialTechnicsIsNull() {
            addCriterion("special_technics is null");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsIsNotNull() {
            addCriterion("special_technics is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsEqualTo(String value) {
            addCriterion("special_technics =", value, "specialTechnics");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsNotEqualTo(String value) {
            addCriterion("special_technics <>", value, "specialTechnics");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsGreaterThan(String value) {
            addCriterion("special_technics >", value, "specialTechnics");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsGreaterThanOrEqualTo(String value) {
            addCriterion("special_technics >=", value, "specialTechnics");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsLessThan(String value) {
            addCriterion("special_technics <", value, "specialTechnics");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsLessThanOrEqualTo(String value) {
            addCriterion("special_technics <=", value, "specialTechnics");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsLike(String value) {
            addCriterion("special_technics like", value, "specialTechnics");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsNotLike(String value) {
            addCriterion("special_technics not like", value, "specialTechnics");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsIn(List<String> values) {
            addCriterion("special_technics in", values, "specialTechnics");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsNotIn(List<String> values) {
            addCriterion("special_technics not in", values, "specialTechnics");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsBetween(String value1, String value2) {
            addCriterion("special_technics between", value1, value2, "specialTechnics");
            return (Criteria) this;
        }

        public Criteria andSpecialTechnicsNotBetween(String value1, String value2) {
            addCriterion("special_technics not between", value1, value2, "specialTechnics");
            return (Criteria) this;
        }

        public Criteria andTechnicsStateIsNull() {
            addCriterion("technics_state is null");
            return (Criteria) this;
        }

        public Criteria andTechnicsStateIsNotNull() {
            addCriterion("technics_state is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicsStateEqualTo(Integer value) {
            addCriterion("technics_state =", value, "technicsState");
            return (Criteria) this;
        }

        public Criteria andTechnicsStateNotEqualTo(Integer value) {
            addCriterion("technics_state <>", value, "technicsState");
            return (Criteria) this;
        }

        public Criteria andTechnicsStateGreaterThan(Integer value) {
            addCriterion("technics_state >", value, "technicsState");
            return (Criteria) this;
        }

        public Criteria andTechnicsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("technics_state >=", value, "technicsState");
            return (Criteria) this;
        }

        public Criteria andTechnicsStateLessThan(Integer value) {
            addCriterion("technics_state <", value, "technicsState");
            return (Criteria) this;
        }

        public Criteria andTechnicsStateLessThanOrEqualTo(Integer value) {
            addCriterion("technics_state <=", value, "technicsState");
            return (Criteria) this;
        }

        public Criteria andTechnicsStateIn(List<Integer> values) {
            addCriterion("technics_state in", values, "technicsState");
            return (Criteria) this;
        }

        public Criteria andTechnicsStateNotIn(List<Integer> values) {
            addCriterion("technics_state not in", values, "technicsState");
            return (Criteria) this;
        }

        public Criteria andTechnicsStateBetween(Integer value1, Integer value2) {
            addCriterion("technics_state between", value1, value2, "technicsState");
            return (Criteria) this;
        }

        public Criteria andTechnicsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("technics_state not between", value1, value2, "technicsState");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNull() {
            addCriterion("order_count is null");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNotNull() {
            addCriterion("order_count is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCountEqualTo(Integer value) {
            addCriterion("order_count =", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotEqualTo(Integer value) {
            addCriterion("order_count <>", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThan(Integer value) {
            addCriterion("order_count >", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_count >=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThan(Integer value) {
            addCriterion("order_count <", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("order_count <=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIn(List<Integer> values) {
            addCriterion("order_count in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotIn(List<Integer> values) {
            addCriterion("order_count not in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("order_count between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_count not between", value1, value2, "orderCount");
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