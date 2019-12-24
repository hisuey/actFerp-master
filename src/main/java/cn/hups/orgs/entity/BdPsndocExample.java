package cn.hups.orgs.entity;

import java.util.ArrayList;
import java.util.List;

public class BdPsndocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdPsndocExample() {
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

        public Criteria andPsnnameIsNull() {
            addCriterion("psnname is null");
            return (Criteria) this;
        }

        public Criteria andPsnnameIsNotNull() {
            addCriterion("psnname is not null");
            return (Criteria) this;
        }

        public Criteria andPsnnameEqualTo(String value) {
            addCriterion("psnname =", value, "psnname");
            return (Criteria) this;
        }

        public Criteria andPsnnameNotEqualTo(String value) {
            addCriterion("psnname <>", value, "psnname");
            return (Criteria) this;
        }

        public Criteria andPsnnameGreaterThan(String value) {
            addCriterion("psnname >", value, "psnname");
            return (Criteria) this;
        }

        public Criteria andPsnnameGreaterThanOrEqualTo(String value) {
            addCriterion("psnname >=", value, "psnname");
            return (Criteria) this;
        }

        public Criteria andPsnnameLessThan(String value) {
            addCriterion("psnname <", value, "psnname");
            return (Criteria) this;
        }

        public Criteria andPsnnameLessThanOrEqualTo(String value) {
            addCriterion("psnname <=", value, "psnname");
            return (Criteria) this;
        }

        public Criteria andPsnnameLike(String value) {
            addCriterion("psnname like", value, "psnname");
            return (Criteria) this;
        }

        public Criteria andPsnnameNotLike(String value) {
            addCriterion("psnname not like", value, "psnname");
            return (Criteria) this;
        }

        public Criteria andPsnnameIn(List<String> values) {
            addCriterion("psnname in", values, "psnname");
            return (Criteria) this;
        }

        public Criteria andPsnnameNotIn(List<String> values) {
            addCriterion("psnname not in", values, "psnname");
            return (Criteria) this;
        }

        public Criteria andPsnnameBetween(String value1, String value2) {
            addCriterion("psnname between", value1, value2, "psnname");
            return (Criteria) this;
        }

        public Criteria andPsnnameNotBetween(String value1, String value2) {
            addCriterion("psnname not between", value1, value2, "psnname");
            return (Criteria) this;
        }

        public Criteria andPsncodeIsNull() {
            addCriterion("psncode is null");
            return (Criteria) this;
        }

        public Criteria andPsncodeIsNotNull() {
            addCriterion("psncode is not null");
            return (Criteria) this;
        }

        public Criteria andPsncodeEqualTo(String value) {
            addCriterion("psncode =", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeNotEqualTo(String value) {
            addCriterion("psncode <>", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeGreaterThan(String value) {
            addCriterion("psncode >", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeGreaterThanOrEqualTo(String value) {
            addCriterion("psncode >=", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeLessThan(String value) {
            addCriterion("psncode <", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeLessThanOrEqualTo(String value) {
            addCriterion("psncode <=", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeLike(String value) {
            addCriterion("psncode like", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeNotLike(String value) {
            addCriterion("psncode not like", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeIn(List<String> values) {
            addCriterion("psncode in", values, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeNotIn(List<String> values) {
            addCriterion("psncode not in", values, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeBetween(String value1, String value2) {
            addCriterion("psncode between", value1, value2, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeNotBetween(String value1, String value2) {
            addCriterion("psncode not between", value1, value2, "psncode");
            return (Criteria) this;
        }

        public Criteria andPkCorpIsNull() {
            addCriterion("pk_corp is null");
            return (Criteria) this;
        }

        public Criteria andPkCorpIsNotNull() {
            addCriterion("pk_corp is not null");
            return (Criteria) this;
        }

        public Criteria andPkCorpEqualTo(Integer value) {
            addCriterion("pk_corp =", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpNotEqualTo(Integer value) {
            addCriterion("pk_corp <>", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpGreaterThan(Integer value) {
            addCriterion("pk_corp >", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_corp >=", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpLessThan(Integer value) {
            addCriterion("pk_corp <", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpLessThanOrEqualTo(Integer value) {
            addCriterion("pk_corp <=", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpIn(List<Integer> values) {
            addCriterion("pk_corp in", values, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpNotIn(List<Integer> values) {
            addCriterion("pk_corp not in", values, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpBetween(Integer value1, Integer value2) {
            addCriterion("pk_corp between", value1, value2, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_corp not between", value1, value2, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkDeptdocIsNull() {
            addCriterion("pk_deptdoc is null");
            return (Criteria) this;
        }

        public Criteria andPkDeptdocIsNotNull() {
            addCriterion("pk_deptdoc is not null");
            return (Criteria) this;
        }

        public Criteria andPkDeptdocEqualTo(Integer value) {
            addCriterion("pk_deptdoc =", value, "pkDeptdoc");
            return (Criteria) this;
        }

        public Criteria andPkDeptdocNotEqualTo(Integer value) {
            addCriterion("pk_deptdoc <>", value, "pkDeptdoc");
            return (Criteria) this;
        }

        public Criteria andPkDeptdocGreaterThan(Integer value) {
            addCriterion("pk_deptdoc >", value, "pkDeptdoc");
            return (Criteria) this;
        }

        public Criteria andPkDeptdocGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_deptdoc >=", value, "pkDeptdoc");
            return (Criteria) this;
        }

        public Criteria andPkDeptdocLessThan(Integer value) {
            addCriterion("pk_deptdoc <", value, "pkDeptdoc");
            return (Criteria) this;
        }

        public Criteria andPkDeptdocLessThanOrEqualTo(Integer value) {
            addCriterion("pk_deptdoc <=", value, "pkDeptdoc");
            return (Criteria) this;
        }

        public Criteria andPkDeptdocIn(List<Integer> values) {
            addCriterion("pk_deptdoc in", values, "pkDeptdoc");
            return (Criteria) this;
        }

        public Criteria andPkDeptdocNotIn(List<Integer> values) {
            addCriterion("pk_deptdoc not in", values, "pkDeptdoc");
            return (Criteria) this;
        }

        public Criteria andPkDeptdocBetween(Integer value1, Integer value2) {
            addCriterion("pk_deptdoc between", value1, value2, "pkDeptdoc");
            return (Criteria) this;
        }

        public Criteria andPkDeptdocNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_deptdoc not between", value1, value2, "pkDeptdoc");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeIsNull() {
            addCriterion("pk_psntype is null");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeIsNotNull() {
            addCriterion("pk_psntype is not null");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeEqualTo(String value) {
            addCriterion("pk_psntype =", value, "pkPsntype");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeNotEqualTo(String value) {
            addCriterion("pk_psntype <>", value, "pkPsntype");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeGreaterThan(String value) {
            addCriterion("pk_psntype >", value, "pkPsntype");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeGreaterThanOrEqualTo(String value) {
            addCriterion("pk_psntype >=", value, "pkPsntype");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeLessThan(String value) {
            addCriterion("pk_psntype <", value, "pkPsntype");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeLessThanOrEqualTo(String value) {
            addCriterion("pk_psntype <=", value, "pkPsntype");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeLike(String value) {
            addCriterion("pk_psntype like", value, "pkPsntype");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeNotLike(String value) {
            addCriterion("pk_psntype not like", value, "pkPsntype");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeIn(List<String> values) {
            addCriterion("pk_psntype in", values, "pkPsntype");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeNotIn(List<String> values) {
            addCriterion("pk_psntype not in", values, "pkPsntype");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeBetween(String value1, String value2) {
            addCriterion("pk_psntype between", value1, value2, "pkPsntype");
            return (Criteria) this;
        }

        public Criteria andPkPsntypeNotBetween(String value1, String value2) {
            addCriterion("pk_psntype not between", value1, value2, "pkPsntype");
            return (Criteria) this;
        }

        public Criteria andSealdateIsNull() {
            addCriterion("sealdate is null");
            return (Criteria) this;
        }

        public Criteria andSealdateIsNotNull() {
            addCriterion("sealdate is not null");
            return (Criteria) this;
        }

        public Criteria andSealdateEqualTo(String value) {
            addCriterion("sealdate =", value, "sealdate");
            return (Criteria) this;
        }

        public Criteria andSealdateNotEqualTo(String value) {
            addCriterion("sealdate <>", value, "sealdate");
            return (Criteria) this;
        }

        public Criteria andSealdateGreaterThan(String value) {
            addCriterion("sealdate >", value, "sealdate");
            return (Criteria) this;
        }

        public Criteria andSealdateGreaterThanOrEqualTo(String value) {
            addCriterion("sealdate >=", value, "sealdate");
            return (Criteria) this;
        }

        public Criteria andSealdateLessThan(String value) {
            addCriterion("sealdate <", value, "sealdate");
            return (Criteria) this;
        }

        public Criteria andSealdateLessThanOrEqualTo(String value) {
            addCriterion("sealdate <=", value, "sealdate");
            return (Criteria) this;
        }

        public Criteria andSealdateLike(String value) {
            addCriterion("sealdate like", value, "sealdate");
            return (Criteria) this;
        }

        public Criteria andSealdateNotLike(String value) {
            addCriterion("sealdate not like", value, "sealdate");
            return (Criteria) this;
        }

        public Criteria andSealdateIn(List<String> values) {
            addCriterion("sealdate in", values, "sealdate");
            return (Criteria) this;
        }

        public Criteria andSealdateNotIn(List<String> values) {
            addCriterion("sealdate not in", values, "sealdate");
            return (Criteria) this;
        }

        public Criteria andSealdateBetween(String value1, String value2) {
            addCriterion("sealdate between", value1, value2, "sealdate");
            return (Criteria) this;
        }

        public Criteria andSealdateNotBetween(String value1, String value2) {
            addCriterion("sealdate not between", value1, value2, "sealdate");
            return (Criteria) this;
        }

        public Criteria andDirectleaderIsNull() {
            addCriterion("directleader is null");
            return (Criteria) this;
        }

        public Criteria andDirectleaderIsNotNull() {
            addCriterion("directleader is not null");
            return (Criteria) this;
        }

        public Criteria andDirectleaderEqualTo(Integer value) {
            addCriterion("directleader =", value, "directleader");
            return (Criteria) this;
        }

        public Criteria andDirectleaderNotEqualTo(Integer value) {
            addCriterion("directleader <>", value, "directleader");
            return (Criteria) this;
        }

        public Criteria andDirectleaderGreaterThan(Integer value) {
            addCriterion("directleader >", value, "directleader");
            return (Criteria) this;
        }

        public Criteria andDirectleaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("directleader >=", value, "directleader");
            return (Criteria) this;
        }

        public Criteria andDirectleaderLessThan(Integer value) {
            addCriterion("directleader <", value, "directleader");
            return (Criteria) this;
        }

        public Criteria andDirectleaderLessThanOrEqualTo(Integer value) {
            addCriterion("directleader <=", value, "directleader");
            return (Criteria) this;
        }

        public Criteria andDirectleaderIn(List<Integer> values) {
            addCriterion("directleader in", values, "directleader");
            return (Criteria) this;
        }

        public Criteria andDirectleaderNotIn(List<Integer> values) {
            addCriterion("directleader not in", values, "directleader");
            return (Criteria) this;
        }

        public Criteria andDirectleaderBetween(Integer value1, Integer value2) {
            addCriterion("directleader between", value1, value2, "directleader");
            return (Criteria) this;
        }

        public Criteria andDirectleaderNotBetween(Integer value1, Integer value2) {
            addCriterion("directleader not between", value1, value2, "directleader");
            return (Criteria) this;
        }

        public Criteria andErpidIsNull() {
            addCriterion("erpid is null");
            return (Criteria) this;
        }

        public Criteria andErpidIsNotNull() {
            addCriterion("erpid is not null");
            return (Criteria) this;
        }

        public Criteria andErpidEqualTo(String value) {
            addCriterion("erpid =", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidNotEqualTo(String value) {
            addCriterion("erpid <>", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidGreaterThan(String value) {
            addCriterion("erpid >", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidGreaterThanOrEqualTo(String value) {
            addCriterion("erpid >=", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidLessThan(String value) {
            addCriterion("erpid <", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidLessThanOrEqualTo(String value) {
            addCriterion("erpid <=", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidLike(String value) {
            addCriterion("erpid like", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidNotLike(String value) {
            addCriterion("erpid not like", value, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidIn(List<String> values) {
            addCriterion("erpid in", values, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidNotIn(List<String> values) {
            addCriterion("erpid not in", values, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidBetween(String value1, String value2) {
            addCriterion("erpid between", value1, value2, "erpid");
            return (Criteria) this;
        }

        public Criteria andErpidNotBetween(String value1, String value2) {
            addCriterion("erpid not between", value1, value2, "erpid");
            return (Criteria) this;
        }

        public Criteria andErptypeIsNull() {
            addCriterion("erptype is null");
            return (Criteria) this;
        }

        public Criteria andErptypeIsNotNull() {
            addCriterion("erptype is not null");
            return (Criteria) this;
        }

        public Criteria andErptypeEqualTo(String value) {
            addCriterion("erptype =", value, "erptype");
            return (Criteria) this;
        }

        public Criteria andErptypeNotEqualTo(String value) {
            addCriterion("erptype <>", value, "erptype");
            return (Criteria) this;
        }

        public Criteria andErptypeGreaterThan(String value) {
            addCriterion("erptype >", value, "erptype");
            return (Criteria) this;
        }

        public Criteria andErptypeGreaterThanOrEqualTo(String value) {
            addCriterion("erptype >=", value, "erptype");
            return (Criteria) this;
        }

        public Criteria andErptypeLessThan(String value) {
            addCriterion("erptype <", value, "erptype");
            return (Criteria) this;
        }

        public Criteria andErptypeLessThanOrEqualTo(String value) {
            addCriterion("erptype <=", value, "erptype");
            return (Criteria) this;
        }

        public Criteria andErptypeLike(String value) {
            addCriterion("erptype like", value, "erptype");
            return (Criteria) this;
        }

        public Criteria andErptypeNotLike(String value) {
            addCriterion("erptype not like", value, "erptype");
            return (Criteria) this;
        }

        public Criteria andErptypeIn(List<String> values) {
            addCriterion("erptype in", values, "erptype");
            return (Criteria) this;
        }

        public Criteria andErptypeNotIn(List<String> values) {
            addCriterion("erptype not in", values, "erptype");
            return (Criteria) this;
        }

        public Criteria andErptypeBetween(String value1, String value2) {
            addCriterion("erptype between", value1, value2, "erptype");
            return (Criteria) this;
        }

        public Criteria andErptypeNotBetween(String value1, String value2) {
            addCriterion("erptype not between", value1, value2, "erptype");
            return (Criteria) this;
        }

        public Criteria andDef1IsNull() {
            addCriterion("def1 is null");
            return (Criteria) this;
        }

        public Criteria andDef1IsNotNull() {
            addCriterion("def1 is not null");
            return (Criteria) this;
        }

        public Criteria andDef1EqualTo(String value) {
            addCriterion("def1 =", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotEqualTo(String value) {
            addCriterion("def1 <>", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThan(String value) {
            addCriterion("def1 >", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThanOrEqualTo(String value) {
            addCriterion("def1 >=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThan(String value) {
            addCriterion("def1 <", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThanOrEqualTo(String value) {
            addCriterion("def1 <=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Like(String value) {
            addCriterion("def1 like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotLike(String value) {
            addCriterion("def1 not like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1In(List<String> values) {
            addCriterion("def1 in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotIn(List<String> values) {
            addCriterion("def1 not in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Between(String value1, String value2) {
            addCriterion("def1 between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotBetween(String value1, String value2) {
            addCriterion("def1 not between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef2IsNull() {
            addCriterion("def2 is null");
            return (Criteria) this;
        }

        public Criteria andDef2IsNotNull() {
            addCriterion("def2 is not null");
            return (Criteria) this;
        }

        public Criteria andDef2EqualTo(String value) {
            addCriterion("def2 =", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotEqualTo(String value) {
            addCriterion("def2 <>", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThan(String value) {
            addCriterion("def2 >", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThanOrEqualTo(String value) {
            addCriterion("def2 >=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThan(String value) {
            addCriterion("def2 <", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThanOrEqualTo(String value) {
            addCriterion("def2 <=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Like(String value) {
            addCriterion("def2 like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotLike(String value) {
            addCriterion("def2 not like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2In(List<String> values) {
            addCriterion("def2 in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotIn(List<String> values) {
            addCriterion("def2 not in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Between(String value1, String value2) {
            addCriterion("def2 between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotBetween(String value1, String value2) {
            addCriterion("def2 not between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef3IsNull() {
            addCriterion("def3 is null");
            return (Criteria) this;
        }

        public Criteria andDef3IsNotNull() {
            addCriterion("def3 is not null");
            return (Criteria) this;
        }

        public Criteria andDef3EqualTo(String value) {
            addCriterion("def3 =", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotEqualTo(String value) {
            addCriterion("def3 <>", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThan(String value) {
            addCriterion("def3 >", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThanOrEqualTo(String value) {
            addCriterion("def3 >=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThan(String value) {
            addCriterion("def3 <", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThanOrEqualTo(String value) {
            addCriterion("def3 <=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Like(String value) {
            addCriterion("def3 like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotLike(String value) {
            addCriterion("def3 not like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3In(List<String> values) {
            addCriterion("def3 in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotIn(List<String> values) {
            addCriterion("def3 not in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Between(String value1, String value2) {
            addCriterion("def3 between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotBetween(String value1, String value2) {
            addCriterion("def3 not between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef4IsNull() {
            addCriterion("def4 is null");
            return (Criteria) this;
        }

        public Criteria andDef4IsNotNull() {
            addCriterion("def4 is not null");
            return (Criteria) this;
        }

        public Criteria andDef4EqualTo(String value) {
            addCriterion("def4 =", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotEqualTo(String value) {
            addCriterion("def4 <>", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThan(String value) {
            addCriterion("def4 >", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThanOrEqualTo(String value) {
            addCriterion("def4 >=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThan(String value) {
            addCriterion("def4 <", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThanOrEqualTo(String value) {
            addCriterion("def4 <=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Like(String value) {
            addCriterion("def4 like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotLike(String value) {
            addCriterion("def4 not like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4In(List<String> values) {
            addCriterion("def4 in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotIn(List<String> values) {
            addCriterion("def4 not in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Between(String value1, String value2) {
            addCriterion("def4 between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotBetween(String value1, String value2) {
            addCriterion("def4 not between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef5IsNull() {
            addCriterion("def5 is null");
            return (Criteria) this;
        }

        public Criteria andDef5IsNotNull() {
            addCriterion("def5 is not null");
            return (Criteria) this;
        }

        public Criteria andDef5EqualTo(String value) {
            addCriterion("def5 =", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotEqualTo(String value) {
            addCriterion("def5 <>", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThan(String value) {
            addCriterion("def5 >", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThanOrEqualTo(String value) {
            addCriterion("def5 >=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThan(String value) {
            addCriterion("def5 <", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThanOrEqualTo(String value) {
            addCriterion("def5 <=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Like(String value) {
            addCriterion("def5 like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotLike(String value) {
            addCriterion("def5 not like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5In(List<String> values) {
            addCriterion("def5 in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotIn(List<String> values) {
            addCriterion("def5 not in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Between(String value1, String value2) {
            addCriterion("def5 between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotBetween(String value1, String value2) {
            addCriterion("def5 not between", value1, value2, "def5");
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