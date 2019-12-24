package cn.hups.purchase.entity;

import java.util.ArrayList;
import java.util.List;

public class BillMaterielExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillMaterielExample() {
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

        public Criteria andPkMaterielIsNull() {
            addCriterion("pk_materiel is null");
            return (Criteria) this;
        }

        public Criteria andPkMaterielIsNotNull() {
            addCriterion("pk_materiel is not null");
            return (Criteria) this;
        }

        public Criteria andPkMaterielEqualTo(Integer value) {
            addCriterion("pk_materiel =", value, "pkMateriel");
            return (Criteria) this;
        }

        public Criteria andPkMaterielNotEqualTo(Integer value) {
            addCriterion("pk_materiel <>", value, "pkMateriel");
            return (Criteria) this;
        }

        public Criteria andPkMaterielGreaterThan(Integer value) {
            addCriterion("pk_materiel >", value, "pkMateriel");
            return (Criteria) this;
        }

        public Criteria andPkMaterielGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_materiel >=", value, "pkMateriel");
            return (Criteria) this;
        }

        public Criteria andPkMaterielLessThan(Integer value) {
            addCriterion("pk_materiel <", value, "pkMateriel");
            return (Criteria) this;
        }

        public Criteria andPkMaterielLessThanOrEqualTo(Integer value) {
            addCriterion("pk_materiel <=", value, "pkMateriel");
            return (Criteria) this;
        }

        public Criteria andPkMaterielIn(List<Integer> values) {
            addCriterion("pk_materiel in", values, "pkMateriel");
            return (Criteria) this;
        }

        public Criteria andPkMaterielNotIn(List<Integer> values) {
            addCriterion("pk_materiel not in", values, "pkMateriel");
            return (Criteria) this;
        }

        public Criteria andPkMaterielBetween(Integer value1, Integer value2) {
            addCriterion("pk_materiel between", value1, value2, "pkMateriel");
            return (Criteria) this;
        }

        public Criteria andPkMaterielNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_materiel not between", value1, value2, "pkMateriel");
            return (Criteria) this;
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

        public Criteria andPkPurchaseQuoteIsNull() {
            addCriterion("pk_purchase_quote is null");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseQuoteIsNotNull() {
            addCriterion("pk_purchase_quote is not null");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseQuoteEqualTo(Integer value) {
            addCriterion("pk_purchase_quote =", value, "pkPurchaseQuote");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseQuoteNotEqualTo(Integer value) {
            addCriterion("pk_purchase_quote <>", value, "pkPurchaseQuote");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseQuoteGreaterThan(Integer value) {
            addCriterion("pk_purchase_quote >", value, "pkPurchaseQuote");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseQuoteGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_purchase_quote >=", value, "pkPurchaseQuote");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseQuoteLessThan(Integer value) {
            addCriterion("pk_purchase_quote <", value, "pkPurchaseQuote");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseQuoteLessThanOrEqualTo(Integer value) {
            addCriterion("pk_purchase_quote <=", value, "pkPurchaseQuote");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseQuoteIn(List<Integer> values) {
            addCriterion("pk_purchase_quote in", values, "pkPurchaseQuote");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseQuoteNotIn(List<Integer> values) {
            addCriterion("pk_purchase_quote not in", values, "pkPurchaseQuote");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseQuoteBetween(Integer value1, Integer value2) {
            addCriterion("pk_purchase_quote between", value1, value2, "pkPurchaseQuote");
            return (Criteria) this;
        }

        public Criteria andPkPurchaseQuoteNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_purchase_quote not between", value1, value2, "pkPurchaseQuote");
            return (Criteria) this;
        }

        public Criteria andRowNumIsNull() {
            addCriterion("row_num is null");
            return (Criteria) this;
        }

        public Criteria andRowNumIsNotNull() {
            addCriterion("row_num is not null");
            return (Criteria) this;
        }

        public Criteria andRowNumEqualTo(Integer value) {
            addCriterion("row_num =", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumNotEqualTo(Integer value) {
            addCriterion("row_num <>", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumGreaterThan(Integer value) {
            addCriterion("row_num >", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("row_num >=", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumLessThan(Integer value) {
            addCriterion("row_num <", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumLessThanOrEqualTo(Integer value) {
            addCriterion("row_num <=", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumIn(List<Integer> values) {
            addCriterion("row_num in", values, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumNotIn(List<Integer> values) {
            addCriterion("row_num not in", values, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumBetween(Integer value1, Integer value2) {
            addCriterion("row_num between", value1, value2, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("row_num not between", value1, value2, "rowNum");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(String value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(String value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(String value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(String value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(String value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLike(String value) {
            addCriterion("item_type like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotLike(String value) {
            addCriterion("item_type not like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<String> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<String> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(String value1, String value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(String value1, String value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
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

        public Criteria andPlaceNumberIsNull() {
            addCriterion("place_number is null");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberIsNotNull() {
            addCriterion("place_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberEqualTo(String value) {
            addCriterion("place_number =", value, "placeNumber");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberNotEqualTo(String value) {
            addCriterion("place_number <>", value, "placeNumber");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberGreaterThan(String value) {
            addCriterion("place_number >", value, "placeNumber");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("place_number >=", value, "placeNumber");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberLessThan(String value) {
            addCriterion("place_number <", value, "placeNumber");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberLessThanOrEqualTo(String value) {
            addCriterion("place_number <=", value, "placeNumber");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberLike(String value) {
            addCriterion("place_number like", value, "placeNumber");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberNotLike(String value) {
            addCriterion("place_number not like", value, "placeNumber");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberIn(List<String> values) {
            addCriterion("place_number in", values, "placeNumber");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberNotIn(List<String> values) {
            addCriterion("place_number not in", values, "placeNumber");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberBetween(String value1, String value2) {
            addCriterion("place_number between", value1, value2, "placeNumber");
            return (Criteria) this;
        }

        public Criteria andPlaceNumberNotBetween(String value1, String value2) {
            addCriterion("place_number not between", value1, value2, "placeNumber");
            return (Criteria) this;
        }

        public Criteria andWeldingNumberIsNull() {
            addCriterion("welding_number is null");
            return (Criteria) this;
        }

        public Criteria andWeldingNumberIsNotNull() {
            addCriterion("welding_number is not null");
            return (Criteria) this;
        }

        public Criteria andWeldingNumberEqualTo(Integer value) {
            addCriterion("welding_number =", value, "weldingNumber");
            return (Criteria) this;
        }

        public Criteria andWeldingNumberNotEqualTo(Integer value) {
            addCriterion("welding_number <>", value, "weldingNumber");
            return (Criteria) this;
        }

        public Criteria andWeldingNumberGreaterThan(Integer value) {
            addCriterion("welding_number >", value, "weldingNumber");
            return (Criteria) this;
        }

        public Criteria andWeldingNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("welding_number >=", value, "weldingNumber");
            return (Criteria) this;
        }

        public Criteria andWeldingNumberLessThan(Integer value) {
            addCriterion("welding_number <", value, "weldingNumber");
            return (Criteria) this;
        }

        public Criteria andWeldingNumberLessThanOrEqualTo(Integer value) {
            addCriterion("welding_number <=", value, "weldingNumber");
            return (Criteria) this;
        }

        public Criteria andWeldingNumberIn(List<Integer> values) {
            addCriterion("welding_number in", values, "weldingNumber");
            return (Criteria) this;
        }

        public Criteria andWeldingNumberNotIn(List<Integer> values) {
            addCriterion("welding_number not in", values, "weldingNumber");
            return (Criteria) this;
        }

        public Criteria andWeldingNumberBetween(Integer value1, Integer value2) {
            addCriterion("welding_number between", value1, value2, "weldingNumber");
            return (Criteria) this;
        }

        public Criteria andWeldingNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("welding_number not between", value1, value2, "weldingNumber");
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

        public Criteria andUsegUnitIsNull() {
            addCriterion("useg_unit is null");
            return (Criteria) this;
        }

        public Criteria andUsegUnitIsNotNull() {
            addCriterion("useg_unit is not null");
            return (Criteria) this;
        }

        public Criteria andUsegUnitEqualTo(String value) {
            addCriterion("useg_unit =", value, "usegUnit");
            return (Criteria) this;
        }

        public Criteria andUsegUnitNotEqualTo(String value) {
            addCriterion("useg_unit <>", value, "usegUnit");
            return (Criteria) this;
        }

        public Criteria andUsegUnitGreaterThan(String value) {
            addCriterion("useg_unit >", value, "usegUnit");
            return (Criteria) this;
        }

        public Criteria andUsegUnitGreaterThanOrEqualTo(String value) {
            addCriterion("useg_unit >=", value, "usegUnit");
            return (Criteria) this;
        }

        public Criteria andUsegUnitLessThan(String value) {
            addCriterion("useg_unit <", value, "usegUnit");
            return (Criteria) this;
        }

        public Criteria andUsegUnitLessThanOrEqualTo(String value) {
            addCriterion("useg_unit <=", value, "usegUnit");
            return (Criteria) this;
        }

        public Criteria andUsegUnitLike(String value) {
            addCriterion("useg_unit like", value, "usegUnit");
            return (Criteria) this;
        }

        public Criteria andUsegUnitNotLike(String value) {
            addCriterion("useg_unit not like", value, "usegUnit");
            return (Criteria) this;
        }

        public Criteria andUsegUnitIn(List<String> values) {
            addCriterion("useg_unit in", values, "usegUnit");
            return (Criteria) this;
        }

        public Criteria andUsegUnitNotIn(List<String> values) {
            addCriterion("useg_unit not in", values, "usegUnit");
            return (Criteria) this;
        }

        public Criteria andUsegUnitBetween(String value1, String value2) {
            addCriterion("useg_unit between", value1, value2, "usegUnit");
            return (Criteria) this;
        }

        public Criteria andUsegUnitNotBetween(String value1, String value2) {
            addCriterion("useg_unit not between", value1, value2, "usegUnit");
            return (Criteria) this;
        }

        public Criteria andUsageNumIsNull() {
            addCriterion("usage_num is null");
            return (Criteria) this;
        }

        public Criteria andUsageNumIsNotNull() {
            addCriterion("usage_num is not null");
            return (Criteria) this;
        }

        public Criteria andUsageNumEqualTo(Integer value) {
            addCriterion("usage_num =", value, "usageNum");
            return (Criteria) this;
        }

        public Criteria andUsageNumNotEqualTo(Integer value) {
            addCriterion("usage_num <>", value, "usageNum");
            return (Criteria) this;
        }

        public Criteria andUsageNumGreaterThan(Integer value) {
            addCriterion("usage_num >", value, "usageNum");
            return (Criteria) this;
        }

        public Criteria andUsageNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("usage_num >=", value, "usageNum");
            return (Criteria) this;
        }

        public Criteria andUsageNumLessThan(Integer value) {
            addCriterion("usage_num <", value, "usageNum");
            return (Criteria) this;
        }

        public Criteria andUsageNumLessThanOrEqualTo(Integer value) {
            addCriterion("usage_num <=", value, "usageNum");
            return (Criteria) this;
        }

        public Criteria andUsageNumIn(List<Integer> values) {
            addCriterion("usage_num in", values, "usageNum");
            return (Criteria) this;
        }

        public Criteria andUsageNumNotIn(List<Integer> values) {
            addCriterion("usage_num not in", values, "usageNum");
            return (Criteria) this;
        }

        public Criteria andUsageNumBetween(Integer value1, Integer value2) {
            addCriterion("usage_num between", value1, value2, "usageNum");
            return (Criteria) this;
        }

        public Criteria andUsageNumNotBetween(Integer value1, Integer value2) {
            addCriterion("usage_num not between", value1, value2, "usageNum");
            return (Criteria) this;
        }

        public Criteria andUsageTotalIsNull() {
            addCriterion("usage_total is null");
            return (Criteria) this;
        }

        public Criteria andUsageTotalIsNotNull() {
            addCriterion("usage_total is not null");
            return (Criteria) this;
        }

        public Criteria andUsageTotalEqualTo(Integer value) {
            addCriterion("usage_total =", value, "usageTotal");
            return (Criteria) this;
        }

        public Criteria andUsageTotalNotEqualTo(Integer value) {
            addCriterion("usage_total <>", value, "usageTotal");
            return (Criteria) this;
        }

        public Criteria andUsageTotalGreaterThan(Integer value) {
            addCriterion("usage_total >", value, "usageTotal");
            return (Criteria) this;
        }

        public Criteria andUsageTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("usage_total >=", value, "usageTotal");
            return (Criteria) this;
        }

        public Criteria andUsageTotalLessThan(Integer value) {
            addCriterion("usage_total <", value, "usageTotal");
            return (Criteria) this;
        }

        public Criteria andUsageTotalLessThanOrEqualTo(Integer value) {
            addCriterion("usage_total <=", value, "usageTotal");
            return (Criteria) this;
        }

        public Criteria andUsageTotalIn(List<Integer> values) {
            addCriterion("usage_total in", values, "usageTotal");
            return (Criteria) this;
        }

        public Criteria andUsageTotalNotIn(List<Integer> values) {
            addCriterion("usage_total not in", values, "usageTotal");
            return (Criteria) this;
        }

        public Criteria andUsageTotalBetween(Integer value1, Integer value2) {
            addCriterion("usage_total between", value1, value2, "usageTotal");
            return (Criteria) this;
        }

        public Criteria andUsageTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("usage_total not between", value1, value2, "usageTotal");
            return (Criteria) this;
        }

        public Criteria andBatchingNumberIsNull() {
            addCriterion("batching_number is null");
            return (Criteria) this;
        }

        public Criteria andBatchingNumberIsNotNull() {
            addCriterion("batching_number is not null");
            return (Criteria) this;
        }

        public Criteria andBatchingNumberEqualTo(Integer value) {
            addCriterion("batching_number =", value, "batchingNumber");
            return (Criteria) this;
        }

        public Criteria andBatchingNumberNotEqualTo(Integer value) {
            addCriterion("batching_number <>", value, "batchingNumber");
            return (Criteria) this;
        }

        public Criteria andBatchingNumberGreaterThan(Integer value) {
            addCriterion("batching_number >", value, "batchingNumber");
            return (Criteria) this;
        }

        public Criteria andBatchingNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("batching_number >=", value, "batchingNumber");
            return (Criteria) this;
        }

        public Criteria andBatchingNumberLessThan(Integer value) {
            addCriterion("batching_number <", value, "batchingNumber");
            return (Criteria) this;
        }

        public Criteria andBatchingNumberLessThanOrEqualTo(Integer value) {
            addCriterion("batching_number <=", value, "batchingNumber");
            return (Criteria) this;
        }

        public Criteria andBatchingNumberIn(List<Integer> values) {
            addCriterion("batching_number in", values, "batchingNumber");
            return (Criteria) this;
        }

        public Criteria andBatchingNumberNotIn(List<Integer> values) {
            addCriterion("batching_number not in", values, "batchingNumber");
            return (Criteria) this;
        }

        public Criteria andBatchingNumberBetween(Integer value1, Integer value2) {
            addCriterion("batching_number between", value1, value2, "batchingNumber");
            return (Criteria) this;
        }

        public Criteria andBatchingNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("batching_number not between", value1, value2, "batchingNumber");
            return (Criteria) this;
        }

        public Criteria andPickingNumberIsNull() {
            addCriterion("picking_number is null");
            return (Criteria) this;
        }

        public Criteria andPickingNumberIsNotNull() {
            addCriterion("picking_number is not null");
            return (Criteria) this;
        }

        public Criteria andPickingNumberEqualTo(Integer value) {
            addCriterion("picking_number =", value, "pickingNumber");
            return (Criteria) this;
        }

        public Criteria andPickingNumberNotEqualTo(Integer value) {
            addCriterion("picking_number <>", value, "pickingNumber");
            return (Criteria) this;
        }

        public Criteria andPickingNumberGreaterThan(Integer value) {
            addCriterion("picking_number >", value, "pickingNumber");
            return (Criteria) this;
        }

        public Criteria andPickingNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("picking_number >=", value, "pickingNumber");
            return (Criteria) this;
        }

        public Criteria andPickingNumberLessThan(Integer value) {
            addCriterion("picking_number <", value, "pickingNumber");
            return (Criteria) this;
        }

        public Criteria andPickingNumberLessThanOrEqualTo(Integer value) {
            addCriterion("picking_number <=", value, "pickingNumber");
            return (Criteria) this;
        }

        public Criteria andPickingNumberIn(List<Integer> values) {
            addCriterion("picking_number in", values, "pickingNumber");
            return (Criteria) this;
        }

        public Criteria andPickingNumberNotIn(List<Integer> values) {
            addCriterion("picking_number not in", values, "pickingNumber");
            return (Criteria) this;
        }

        public Criteria andPickingNumberBetween(Integer value1, Integer value2) {
            addCriterion("picking_number between", value1, value2, "pickingNumber");
            return (Criteria) this;
        }

        public Criteria andPickingNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("picking_number not between", value1, value2, "pickingNumber");
            return (Criteria) this;
        }

        public Criteria andBackingNumberIsNull() {
            addCriterion("backing_number is null");
            return (Criteria) this;
        }

        public Criteria andBackingNumberIsNotNull() {
            addCriterion("backing_number is not null");
            return (Criteria) this;
        }

        public Criteria andBackingNumberEqualTo(Integer value) {
            addCriterion("backing_number =", value, "backingNumber");
            return (Criteria) this;
        }

        public Criteria andBackingNumberNotEqualTo(Integer value) {
            addCriterion("backing_number <>", value, "backingNumber");
            return (Criteria) this;
        }

        public Criteria andBackingNumberGreaterThan(Integer value) {
            addCriterion("backing_number >", value, "backingNumber");
            return (Criteria) this;
        }

        public Criteria andBackingNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("backing_number >=", value, "backingNumber");
            return (Criteria) this;
        }

        public Criteria andBackingNumberLessThan(Integer value) {
            addCriterion("backing_number <", value, "backingNumber");
            return (Criteria) this;
        }

        public Criteria andBackingNumberLessThanOrEqualTo(Integer value) {
            addCriterion("backing_number <=", value, "backingNumber");
            return (Criteria) this;
        }

        public Criteria andBackingNumberIn(List<Integer> values) {
            addCriterion("backing_number in", values, "backingNumber");
            return (Criteria) this;
        }

        public Criteria andBackingNumberNotIn(List<Integer> values) {
            addCriterion("backing_number not in", values, "backingNumber");
            return (Criteria) this;
        }

        public Criteria andBackingNumberBetween(Integer value1, Integer value2) {
            addCriterion("backing_number between", value1, value2, "backingNumber");
            return (Criteria) this;
        }

        public Criteria andBackingNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("backing_number not between", value1, value2, "backingNumber");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlIsNull() {
            addCriterion("preview_url is null");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlIsNotNull() {
            addCriterion("preview_url is not null");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlEqualTo(String value) {
            addCriterion("preview_url =", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlNotEqualTo(String value) {
            addCriterion("preview_url <>", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlGreaterThan(String value) {
            addCriterion("preview_url >", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlGreaterThanOrEqualTo(String value) {
            addCriterion("preview_url >=", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlLessThan(String value) {
            addCriterion("preview_url <", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlLessThanOrEqualTo(String value) {
            addCriterion("preview_url <=", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlLike(String value) {
            addCriterion("preview_url like", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlNotLike(String value) {
            addCriterion("preview_url not like", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlIn(List<String> values) {
            addCriterion("preview_url in", values, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlNotIn(List<String> values) {
            addCriterion("preview_url not in", values, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlBetween(String value1, String value2) {
            addCriterion("preview_url between", value1, value2, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlNotBetween(String value1, String value2) {
            addCriterion("preview_url not between", value1, value2, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceIsNull() {
            addCriterion("purchase_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceIsNotNull() {
            addCriterion("purchase_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceEqualTo(Double value) {
            addCriterion("purchase_unit_price =", value, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceNotEqualTo(Double value) {
            addCriterion("purchase_unit_price <>", value, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceGreaterThan(Double value) {
            addCriterion("purchase_unit_price >", value, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("purchase_unit_price >=", value, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceLessThan(Double value) {
            addCriterion("purchase_unit_price <", value, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("purchase_unit_price <=", value, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceIn(List<Double> values) {
            addCriterion("purchase_unit_price in", values, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceNotIn(List<Double> values) {
            addCriterion("purchase_unit_price not in", values, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceBetween(Double value1, Double value2) {
            addCriterion("purchase_unit_price between", value1, value2, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("purchase_unit_price not between", value1, value2, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceIsNull() {
            addCriterion("purchase_total_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceIsNotNull() {
            addCriterion("purchase_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceEqualTo(Double value) {
            addCriterion("purchase_total_price =", value, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceNotEqualTo(Double value) {
            addCriterion("purchase_total_price <>", value, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceGreaterThan(Double value) {
            addCriterion("purchase_total_price >", value, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("purchase_total_price >=", value, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceLessThan(Double value) {
            addCriterion("purchase_total_price <", value, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("purchase_total_price <=", value, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceIn(List<Double> values) {
            addCriterion("purchase_total_price in", values, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceNotIn(List<Double> values) {
            addCriterion("purchase_total_price not in", values, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceBetween(Double value1, Double value2) {
            addCriterion("purchase_total_price between", value1, value2, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("purchase_total_price not between", value1, value2, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleUnitPriceIsNull() {
            addCriterion("sale_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andSaleUnitPriceIsNotNull() {
            addCriterion("sale_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andSaleUnitPriceEqualTo(Double value) {
            addCriterion("sale_unit_price =", value, "saleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSaleUnitPriceNotEqualTo(Double value) {
            addCriterion("sale_unit_price <>", value, "saleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSaleUnitPriceGreaterThan(Double value) {
            addCriterion("sale_unit_price >", value, "saleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSaleUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_unit_price >=", value, "saleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSaleUnitPriceLessThan(Double value) {
            addCriterion("sale_unit_price <", value, "saleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSaleUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("sale_unit_price <=", value, "saleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSaleUnitPriceIn(List<Double> values) {
            addCriterion("sale_unit_price in", values, "saleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSaleUnitPriceNotIn(List<Double> values) {
            addCriterion("sale_unit_price not in", values, "saleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSaleUnitPriceBetween(Double value1, Double value2) {
            addCriterion("sale_unit_price between", value1, value2, "saleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSaleUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("sale_unit_price not between", value1, value2, "saleUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTotalPriceIsNull() {
            addCriterion("sale_total_price is null");
            return (Criteria) this;
        }

        public Criteria andSaleTotalPriceIsNotNull() {
            addCriterion("sale_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTotalPriceEqualTo(Double value) {
            addCriterion("sale_total_price =", value, "saleTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTotalPriceNotEqualTo(Double value) {
            addCriterion("sale_total_price <>", value, "saleTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTotalPriceGreaterThan(Double value) {
            addCriterion("sale_total_price >", value, "saleTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_total_price >=", value, "saleTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTotalPriceLessThan(Double value) {
            addCriterion("sale_total_price <", value, "saleTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("sale_total_price <=", value, "saleTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTotalPriceIn(List<Double> values) {
            addCriterion("sale_total_price in", values, "saleTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTotalPriceNotIn(List<Double> values) {
            addCriterion("sale_total_price not in", values, "saleTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTotalPriceBetween(Double value1, Double value2) {
            addCriterion("sale_total_price between", value1, value2, "saleTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("sale_total_price not between", value1, value2, "saleTotalPrice");
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