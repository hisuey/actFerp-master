package cn.hups.purchase.entity;

import java.util.ArrayList;
import java.util.List;

public class BdMaterielDataBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdMaterielDataBaseExample() {
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

        public Criteria andPkDbMaterielIsNull() {
            addCriterion("pk_db_materiel is null");
            return (Criteria) this;
        }

        public Criteria andPkDbMaterielIsNotNull() {
            addCriterion("pk_db_materiel is not null");
            return (Criteria) this;
        }

        public Criteria andPkDbMaterielEqualTo(Integer value) {
            addCriterion("pk_db_materiel =", value, "pkDbMateriel");
            return (Criteria) this;
        }

        public Criteria andPkDbMaterielNotEqualTo(Integer value) {
            addCriterion("pk_db_materiel <>", value, "pkDbMateriel");
            return (Criteria) this;
        }

        public Criteria andPkDbMaterielGreaterThan(Integer value) {
            addCriterion("pk_db_materiel >", value, "pkDbMateriel");
            return (Criteria) this;
        }

        public Criteria andPkDbMaterielGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_db_materiel >=", value, "pkDbMateriel");
            return (Criteria) this;
        }

        public Criteria andPkDbMaterielLessThan(Integer value) {
            addCriterion("pk_db_materiel <", value, "pkDbMateriel");
            return (Criteria) this;
        }

        public Criteria andPkDbMaterielLessThanOrEqualTo(Integer value) {
            addCriterion("pk_db_materiel <=", value, "pkDbMateriel");
            return (Criteria) this;
        }

        public Criteria andPkDbMaterielIn(List<Integer> values) {
            addCriterion("pk_db_materiel in", values, "pkDbMateriel");
            return (Criteria) this;
        }

        public Criteria andPkDbMaterielNotIn(List<Integer> values) {
            addCriterion("pk_db_materiel not in", values, "pkDbMateriel");
            return (Criteria) this;
        }

        public Criteria andPkDbMaterielBetween(Integer value1, Integer value2) {
            addCriterion("pk_db_materiel between", value1, value2, "pkDbMateriel");
            return (Criteria) this;
        }

        public Criteria andPkDbMaterielNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_db_materiel not between", value1, value2, "pkDbMateriel");
            return (Criteria) this;
        }

        public Criteria andMaterielDateIsNull() {
            addCriterion("materiel_date is null");
            return (Criteria) this;
        }

        public Criteria andMaterielDateIsNotNull() {
            addCriterion("materiel_date is not null");
            return (Criteria) this;
        }

        public Criteria andMaterielDateEqualTo(String value) {
            addCriterion("materiel_date =", value, "materielDate");
            return (Criteria) this;
        }

        public Criteria andMaterielDateNotEqualTo(String value) {
            addCriterion("materiel_date <>", value, "materielDate");
            return (Criteria) this;
        }

        public Criteria andMaterielDateGreaterThan(String value) {
            addCriterion("materiel_date >", value, "materielDate");
            return (Criteria) this;
        }

        public Criteria andMaterielDateGreaterThanOrEqualTo(String value) {
            addCriterion("materiel_date >=", value, "materielDate");
            return (Criteria) this;
        }

        public Criteria andMaterielDateLessThan(String value) {
            addCriterion("materiel_date <", value, "materielDate");
            return (Criteria) this;
        }

        public Criteria andMaterielDateLessThanOrEqualTo(String value) {
            addCriterion("materiel_date <=", value, "materielDate");
            return (Criteria) this;
        }

        public Criteria andMaterielDateLike(String value) {
            addCriterion("materiel_date like", value, "materielDate");
            return (Criteria) this;
        }

        public Criteria andMaterielDateNotLike(String value) {
            addCriterion("materiel_date not like", value, "materielDate");
            return (Criteria) this;
        }

        public Criteria andMaterielDateIn(List<String> values) {
            addCriterion("materiel_date in", values, "materielDate");
            return (Criteria) this;
        }

        public Criteria andMaterielDateNotIn(List<String> values) {
            addCriterion("materiel_date not in", values, "materielDate");
            return (Criteria) this;
        }

        public Criteria andMaterielDateBetween(String value1, String value2) {
            addCriterion("materiel_date between", value1, value2, "materielDate");
            return (Criteria) this;
        }

        public Criteria andMaterielDateNotBetween(String value1, String value2) {
            addCriterion("materiel_date not between", value1, value2, "materielDate");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeIsNull() {
            addCriterion("materiel_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeIsNotNull() {
            addCriterion("materiel_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeEqualTo(String value) {
            addCriterion("materiel_code =", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeNotEqualTo(String value) {
            addCriterion("materiel_code <>", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeGreaterThan(String value) {
            addCriterion("materiel_code >", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeGreaterThanOrEqualTo(String value) {
            addCriterion("materiel_code >=", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeLessThan(String value) {
            addCriterion("materiel_code <", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeLessThanOrEqualTo(String value) {
            addCriterion("materiel_code <=", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeLike(String value) {
            addCriterion("materiel_code like", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeNotLike(String value) {
            addCriterion("materiel_code not like", value, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeIn(List<String> values) {
            addCriterion("materiel_code in", values, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeNotIn(List<String> values) {
            addCriterion("materiel_code not in", values, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeBetween(String value1, String value2) {
            addCriterion("materiel_code between", value1, value2, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterielCodeNotBetween(String value1, String value2) {
            addCriterion("materiel_code not between", value1, value2, "materielCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameIsNull() {
            addCriterion("material_fullname is null");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameIsNotNull() {
            addCriterion("material_fullname is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameEqualTo(String value) {
            addCriterion("material_fullname =", value, "materialFullname");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameNotEqualTo(String value) {
            addCriterion("material_fullname <>", value, "materialFullname");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameGreaterThan(String value) {
            addCriterion("material_fullname >", value, "materialFullname");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("material_fullname >=", value, "materialFullname");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameLessThan(String value) {
            addCriterion("material_fullname <", value, "materialFullname");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameLessThanOrEqualTo(String value) {
            addCriterion("material_fullname <=", value, "materialFullname");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameLike(String value) {
            addCriterion("material_fullname like", value, "materialFullname");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameNotLike(String value) {
            addCriterion("material_fullname not like", value, "materialFullname");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameIn(List<String> values) {
            addCriterion("material_fullname in", values, "materialFullname");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameNotIn(List<String> values) {
            addCriterion("material_fullname not in", values, "materialFullname");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameBetween(String value1, String value2) {
            addCriterion("material_fullname between", value1, value2, "materialFullname");
            return (Criteria) this;
        }

        public Criteria andMaterialFullnameNotBetween(String value1, String value2) {
            addCriterion("material_fullname not between", value1, value2, "materialFullname");
            return (Criteria) this;
        }

        public Criteria andPottingIsNull() {
            addCriterion("potting is null");
            return (Criteria) this;
        }

        public Criteria andPottingIsNotNull() {
            addCriterion("potting is not null");
            return (Criteria) this;
        }

        public Criteria andPottingEqualTo(String value) {
            addCriterion("potting =", value, "potting");
            return (Criteria) this;
        }

        public Criteria andPottingNotEqualTo(String value) {
            addCriterion("potting <>", value, "potting");
            return (Criteria) this;
        }

        public Criteria andPottingGreaterThan(String value) {
            addCriterion("potting >", value, "potting");
            return (Criteria) this;
        }

        public Criteria andPottingGreaterThanOrEqualTo(String value) {
            addCriterion("potting >=", value, "potting");
            return (Criteria) this;
        }

        public Criteria andPottingLessThan(String value) {
            addCriterion("potting <", value, "potting");
            return (Criteria) this;
        }

        public Criteria andPottingLessThanOrEqualTo(String value) {
            addCriterion("potting <=", value, "potting");
            return (Criteria) this;
        }

        public Criteria andPottingLike(String value) {
            addCriterion("potting like", value, "potting");
            return (Criteria) this;
        }

        public Criteria andPottingNotLike(String value) {
            addCriterion("potting not like", value, "potting");
            return (Criteria) this;
        }

        public Criteria andPottingIn(List<String> values) {
            addCriterion("potting in", values, "potting");
            return (Criteria) this;
        }

        public Criteria andPottingNotIn(List<String> values) {
            addCriterion("potting not in", values, "potting");
            return (Criteria) this;
        }

        public Criteria andPottingBetween(String value1, String value2) {
            addCriterion("potting between", value1, value2, "potting");
            return (Criteria) this;
        }

        public Criteria andPottingNotBetween(String value1, String value2) {
            addCriterion("potting not between", value1, value2, "potting");
            return (Criteria) this;
        }

        public Criteria andNormsIsNull() {
            addCriterion("norms is null");
            return (Criteria) this;
        }

        public Criteria andNormsIsNotNull() {
            addCriterion("norms is not null");
            return (Criteria) this;
        }

        public Criteria andNormsEqualTo(String value) {
            addCriterion("norms =", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotEqualTo(String value) {
            addCriterion("norms <>", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsGreaterThan(String value) {
            addCriterion("norms >", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsGreaterThanOrEqualTo(String value) {
            addCriterion("norms >=", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsLessThan(String value) {
            addCriterion("norms <", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsLessThanOrEqualTo(String value) {
            addCriterion("norms <=", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsLike(String value) {
            addCriterion("norms like", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotLike(String value) {
            addCriterion("norms not like", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsIn(List<String> values) {
            addCriterion("norms in", values, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotIn(List<String> values) {
            addCriterion("norms not in", values, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsBetween(String value1, String value2) {
            addCriterion("norms between", value1, value2, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotBetween(String value1, String value2) {
            addCriterion("norms not between", value1, value2, "norms");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andPkSupplierIsNull() {
            addCriterion("pk_supplier is null");
            return (Criteria) this;
        }

        public Criteria andPkSupplierIsNotNull() {
            addCriterion("pk_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andPkSupplierEqualTo(String value) {
            addCriterion("pk_supplier =", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotEqualTo(String value) {
            addCriterion("pk_supplier <>", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierGreaterThan(String value) {
            addCriterion("pk_supplier >", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("pk_supplier >=", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierLessThan(String value) {
            addCriterion("pk_supplier <", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierLessThanOrEqualTo(String value) {
            addCriterion("pk_supplier <=", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierLike(String value) {
            addCriterion("pk_supplier like", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotLike(String value) {
            addCriterion("pk_supplier not like", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierIn(List<String> values) {
            addCriterion("pk_supplier in", values, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotIn(List<String> values) {
            addCriterion("pk_supplier not in", values, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierBetween(String value1, String value2) {
            addCriterion("pk_supplier between", value1, value2, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotBetween(String value1, String value2) {
            addCriterion("pk_supplier not between", value1, value2, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkAgentIsNull() {
            addCriterion("pk_agent is null");
            return (Criteria) this;
        }

        public Criteria andPkAgentIsNotNull() {
            addCriterion("pk_agent is not null");
            return (Criteria) this;
        }

        public Criteria andPkAgentEqualTo(String value) {
            addCriterion("pk_agent =", value, "pkAgent");
            return (Criteria) this;
        }

        public Criteria andPkAgentNotEqualTo(String value) {
            addCriterion("pk_agent <>", value, "pkAgent");
            return (Criteria) this;
        }

        public Criteria andPkAgentGreaterThan(String value) {
            addCriterion("pk_agent >", value, "pkAgent");
            return (Criteria) this;
        }

        public Criteria andPkAgentGreaterThanOrEqualTo(String value) {
            addCriterion("pk_agent >=", value, "pkAgent");
            return (Criteria) this;
        }

        public Criteria andPkAgentLessThan(String value) {
            addCriterion("pk_agent <", value, "pkAgent");
            return (Criteria) this;
        }

        public Criteria andPkAgentLessThanOrEqualTo(String value) {
            addCriterion("pk_agent <=", value, "pkAgent");
            return (Criteria) this;
        }

        public Criteria andPkAgentLike(String value) {
            addCriterion("pk_agent like", value, "pkAgent");
            return (Criteria) this;
        }

        public Criteria andPkAgentNotLike(String value) {
            addCriterion("pk_agent not like", value, "pkAgent");
            return (Criteria) this;
        }

        public Criteria andPkAgentIn(List<String> values) {
            addCriterion("pk_agent in", values, "pkAgent");
            return (Criteria) this;
        }

        public Criteria andPkAgentNotIn(List<String> values) {
            addCriterion("pk_agent not in", values, "pkAgent");
            return (Criteria) this;
        }

        public Criteria andPkAgentBetween(String value1, String value2) {
            addCriterion("pk_agent between", value1, value2, "pkAgent");
            return (Criteria) this;
        }

        public Criteria andPkAgentNotBetween(String value1, String value2) {
            addCriterion("pk_agent not between", value1, value2, "pkAgent");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeIsNull() {
            addCriterion("traffic_type is null");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeIsNotNull() {
            addCriterion("traffic_type is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeEqualTo(String value) {
            addCriterion("traffic_type =", value, "trafficType");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeNotEqualTo(String value) {
            addCriterion("traffic_type <>", value, "trafficType");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeGreaterThan(String value) {
            addCriterion("traffic_type >", value, "trafficType");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeGreaterThanOrEqualTo(String value) {
            addCriterion("traffic_type >=", value, "trafficType");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeLessThan(String value) {
            addCriterion("traffic_type <", value, "trafficType");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeLessThanOrEqualTo(String value) {
            addCriterion("traffic_type <=", value, "trafficType");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeLike(String value) {
            addCriterion("traffic_type like", value, "trafficType");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeNotLike(String value) {
            addCriterion("traffic_type not like", value, "trafficType");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeIn(List<String> values) {
            addCriterion("traffic_type in", values, "trafficType");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeNotIn(List<String> values) {
            addCriterion("traffic_type not in", values, "trafficType");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeBetween(String value1, String value2) {
            addCriterion("traffic_type between", value1, value2, "trafficType");
            return (Criteria) this;
        }

        public Criteria andTrafficTypeNotBetween(String value1, String value2) {
            addCriterion("traffic_type not between", value1, value2, "trafficType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNull() {
            addCriterion("purchase_type is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNotNull() {
            addCriterion("purchase_type is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEqualTo(String value) {
            addCriterion("purchase_type =", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotEqualTo(String value) {
            addCriterion("purchase_type <>", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThan(String value) {
            addCriterion("purchase_type >", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_type >=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThan(String value) {
            addCriterion("purchase_type <", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThanOrEqualTo(String value) {
            addCriterion("purchase_type <=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLike(String value) {
            addCriterion("purchase_type like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotLike(String value) {
            addCriterion("purchase_type not like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIn(List<String> values) {
            addCriterion("purchase_type in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotIn(List<String> values) {
            addCriterion("purchase_type not in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeBetween(String value1, String value2) {
            addCriterion("purchase_type between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotBetween(String value1, String value2) {
            addCriterion("purchase_type not between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andInclutaxIsNull() {
            addCriterion("inclutax is null");
            return (Criteria) this;
        }

        public Criteria andInclutaxIsNotNull() {
            addCriterion("inclutax is not null");
            return (Criteria) this;
        }

        public Criteria andInclutaxEqualTo(String value) {
            addCriterion("inclutax =", value, "inclutax");
            return (Criteria) this;
        }

        public Criteria andInclutaxNotEqualTo(String value) {
            addCriterion("inclutax <>", value, "inclutax");
            return (Criteria) this;
        }

        public Criteria andInclutaxGreaterThan(String value) {
            addCriterion("inclutax >", value, "inclutax");
            return (Criteria) this;
        }

        public Criteria andInclutaxGreaterThanOrEqualTo(String value) {
            addCriterion("inclutax >=", value, "inclutax");
            return (Criteria) this;
        }

        public Criteria andInclutaxLessThan(String value) {
            addCriterion("inclutax <", value, "inclutax");
            return (Criteria) this;
        }

        public Criteria andInclutaxLessThanOrEqualTo(String value) {
            addCriterion("inclutax <=", value, "inclutax");
            return (Criteria) this;
        }

        public Criteria andInclutaxLike(String value) {
            addCriterion("inclutax like", value, "inclutax");
            return (Criteria) this;
        }

        public Criteria andInclutaxNotLike(String value) {
            addCriterion("inclutax not like", value, "inclutax");
            return (Criteria) this;
        }

        public Criteria andInclutaxIn(List<String> values) {
            addCriterion("inclutax in", values, "inclutax");
            return (Criteria) this;
        }

        public Criteria andInclutaxNotIn(List<String> values) {
            addCriterion("inclutax not in", values, "inclutax");
            return (Criteria) this;
        }

        public Criteria andInclutaxBetween(String value1, String value2) {
            addCriterion("inclutax between", value1, value2, "inclutax");
            return (Criteria) this;
        }

        public Criteria andInclutaxNotBetween(String value1, String value2) {
            addCriterion("inclutax not between", value1, value2, "inclutax");
            return (Criteria) this;
        }

        public Criteria andUsageUnitIsNull() {
            addCriterion("usage_unit is null");
            return (Criteria) this;
        }

        public Criteria andUsageUnitIsNotNull() {
            addCriterion("usage_unit is not null");
            return (Criteria) this;
        }

        public Criteria andUsageUnitEqualTo(String value) {
            addCriterion("usage_unit =", value, "usageUnit");
            return (Criteria) this;
        }

        public Criteria andUsageUnitNotEqualTo(String value) {
            addCriterion("usage_unit <>", value, "usageUnit");
            return (Criteria) this;
        }

        public Criteria andUsageUnitGreaterThan(String value) {
            addCriterion("usage_unit >", value, "usageUnit");
            return (Criteria) this;
        }

        public Criteria andUsageUnitGreaterThanOrEqualTo(String value) {
            addCriterion("usage_unit >=", value, "usageUnit");
            return (Criteria) this;
        }

        public Criteria andUsageUnitLessThan(String value) {
            addCriterion("usage_unit <", value, "usageUnit");
            return (Criteria) this;
        }

        public Criteria andUsageUnitLessThanOrEqualTo(String value) {
            addCriterion("usage_unit <=", value, "usageUnit");
            return (Criteria) this;
        }

        public Criteria andUsageUnitLike(String value) {
            addCriterion("usage_unit like", value, "usageUnit");
            return (Criteria) this;
        }

        public Criteria andUsageUnitNotLike(String value) {
            addCriterion("usage_unit not like", value, "usageUnit");
            return (Criteria) this;
        }

        public Criteria andUsageUnitIn(List<String> values) {
            addCriterion("usage_unit in", values, "usageUnit");
            return (Criteria) this;
        }

        public Criteria andUsageUnitNotIn(List<String> values) {
            addCriterion("usage_unit not in", values, "usageUnit");
            return (Criteria) this;
        }

        public Criteria andUsageUnitBetween(String value1, String value2) {
            addCriterion("usage_unit between", value1, value2, "usageUnit");
            return (Criteria) this;
        }

        public Criteria andUsageUnitNotBetween(String value1, String value2) {
            addCriterion("usage_unit not between", value1, value2, "usageUnit");
            return (Criteria) this;
        }

        public Criteria andCountNumIsNull() {
            addCriterion("count_num is null");
            return (Criteria) this;
        }

        public Criteria andCountNumIsNotNull() {
            addCriterion("count_num is not null");
            return (Criteria) this;
        }

        public Criteria andCountNumEqualTo(Integer value) {
            addCriterion("count_num =", value, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumNotEqualTo(Integer value) {
            addCriterion("count_num <>", value, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumGreaterThan(Integer value) {
            addCriterion("count_num >", value, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_num >=", value, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumLessThan(Integer value) {
            addCriterion("count_num <", value, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumLessThanOrEqualTo(Integer value) {
            addCriterion("count_num <=", value, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumIn(List<Integer> values) {
            addCriterion("count_num in", values, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumNotIn(List<Integer> values) {
            addCriterion("count_num not in", values, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumBetween(Integer value1, Integer value2) {
            addCriterion("count_num between", value1, value2, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumNotBetween(Integer value1, Integer value2) {
            addCriterion("count_num not between", value1, value2, "countNum");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Double value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Double value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Double value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Double value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Double> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Double> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Double value1, Double value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyIsNull() {
            addCriterion("amount_money is null");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyIsNotNull() {
            addCriterion("amount_money is not null");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyEqualTo(Double value) {
            addCriterion("amount_money =", value, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyNotEqualTo(Double value) {
            addCriterion("amount_money <>", value, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyGreaterThan(Double value) {
            addCriterion("amount_money >", value, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("amount_money >=", value, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyLessThan(Double value) {
            addCriterion("amount_money <", value, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyLessThanOrEqualTo(Double value) {
            addCriterion("amount_money <=", value, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyIn(List<Double> values) {
            addCriterion("amount_money in", values, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyNotIn(List<Double> values) {
            addCriterion("amount_money not in", values, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyBetween(Double value1, Double value2) {
            addCriterion("amount_money between", value1, value2, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyNotBetween(Double value1, Double value2) {
            addCriterion("amount_money not between", value1, value2, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxIsNull() {
            addCriterion("income_tax is null");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxIsNotNull() {
            addCriterion("income_tax is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxEqualTo(Double value) {
            addCriterion("income_tax =", value, "incomeTax");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxNotEqualTo(Double value) {
            addCriterion("income_tax <>", value, "incomeTax");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxGreaterThan(Double value) {
            addCriterion("income_tax >", value, "incomeTax");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxGreaterThanOrEqualTo(Double value) {
            addCriterion("income_tax >=", value, "incomeTax");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxLessThan(Double value) {
            addCriterion("income_tax <", value, "incomeTax");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxLessThanOrEqualTo(Double value) {
            addCriterion("income_tax <=", value, "incomeTax");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxIn(List<Double> values) {
            addCriterion("income_tax in", values, "incomeTax");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxNotIn(List<Double> values) {
            addCriterion("income_tax not in", values, "incomeTax");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxBetween(Double value1, Double value2) {
            addCriterion("income_tax between", value1, value2, "incomeTax");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxNotBetween(Double value1, Double value2) {
            addCriterion("income_tax not between", value1, value2, "incomeTax");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceIsNull() {
            addCriterion("tax_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceIsNotNull() {
            addCriterion("tax_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceEqualTo(Double value) {
            addCriterion("tax_unit_price =", value, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceNotEqualTo(Double value) {
            addCriterion("tax_unit_price <>", value, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceGreaterThan(Double value) {
            addCriterion("tax_unit_price >", value, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("tax_unit_price >=", value, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceLessThan(Double value) {
            addCriterion("tax_unit_price <", value, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("tax_unit_price <=", value, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceIn(List<Double> values) {
            addCriterion("tax_unit_price in", values, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceNotIn(List<Double> values) {
            addCriterion("tax_unit_price not in", values, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceBetween(Double value1, Double value2) {
            addCriterion("tax_unit_price between", value1, value2, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("tax_unit_price not between", value1, value2, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPriceTaxTotalIsNull() {
            addCriterion("price_tax_total is null");
            return (Criteria) this;
        }

        public Criteria andPriceTaxTotalIsNotNull() {
            addCriterion("price_tax_total is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTaxTotalEqualTo(Double value) {
            addCriterion("price_tax_total =", value, "priceTaxTotal");
            return (Criteria) this;
        }

        public Criteria andPriceTaxTotalNotEqualTo(Double value) {
            addCriterion("price_tax_total <>", value, "priceTaxTotal");
            return (Criteria) this;
        }

        public Criteria andPriceTaxTotalGreaterThan(Double value) {
            addCriterion("price_tax_total >", value, "priceTaxTotal");
            return (Criteria) this;
        }

        public Criteria andPriceTaxTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("price_tax_total >=", value, "priceTaxTotal");
            return (Criteria) this;
        }

        public Criteria andPriceTaxTotalLessThan(Double value) {
            addCriterion("price_tax_total <", value, "priceTaxTotal");
            return (Criteria) this;
        }

        public Criteria andPriceTaxTotalLessThanOrEqualTo(Double value) {
            addCriterion("price_tax_total <=", value, "priceTaxTotal");
            return (Criteria) this;
        }

        public Criteria andPriceTaxTotalIn(List<Double> values) {
            addCriterion("price_tax_total in", values, "priceTaxTotal");
            return (Criteria) this;
        }

        public Criteria andPriceTaxTotalNotIn(List<Double> values) {
            addCriterion("price_tax_total not in", values, "priceTaxTotal");
            return (Criteria) this;
        }

        public Criteria andPriceTaxTotalBetween(Double value1, Double value2) {
            addCriterion("price_tax_total between", value1, value2, "priceTaxTotal");
            return (Criteria) this;
        }

        public Criteria andPriceTaxTotalNotBetween(Double value1, Double value2) {
            addCriterion("price_tax_total not between", value1, value2, "priceTaxTotal");
            return (Criteria) this;
        }

        public Criteria andBatchNumIsNull() {
            addCriterion("batch_num is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumIsNotNull() {
            addCriterion("batch_num is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumEqualTo(String value) {
            addCriterion("batch_num =", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotEqualTo(String value) {
            addCriterion("batch_num <>", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumGreaterThan(String value) {
            addCriterion("batch_num >", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumGreaterThanOrEqualTo(String value) {
            addCriterion("batch_num >=", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLessThan(String value) {
            addCriterion("batch_num <", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLessThanOrEqualTo(String value) {
            addCriterion("batch_num <=", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLike(String value) {
            addCriterion("batch_num like", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotLike(String value) {
            addCriterion("batch_num not like", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumIn(List<String> values) {
            addCriterion("batch_num in", values, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotIn(List<String> values) {
            addCriterion("batch_num not in", values, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumBetween(String value1, String value2) {
            addCriterion("batch_num between", value1, value2, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotBetween(String value1, String value2) {
            addCriterion("batch_num not between", value1, value2, "batchNum");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("expire_date is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(String value) {
            addCriterion("expire_date =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(String value) {
            addCriterion("expire_date <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(String value) {
            addCriterion("expire_date >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(String value) {
            addCriterion("expire_date >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(String value) {
            addCriterion("expire_date <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(String value) {
            addCriterion("expire_date <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLike(String value) {
            addCriterion("expire_date like", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotLike(String value) {
            addCriterion("expire_date not like", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<String> values) {
            addCriterion("expire_date in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<String> values) {
            addCriterion("expire_date not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(String value1, String value2) {
            addCriterion("expire_date between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(String value1, String value2) {
            addCriterion("expire_date not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(Double value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(Double value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(Double value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(Double value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(Double value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(Double value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<Double> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<Double> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(Double value1, Double value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(Double value1, Double value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
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