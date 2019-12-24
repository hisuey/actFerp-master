package cn.hups.orderCustomer.entity;

import java.util.ArrayList;
import java.util.List;

public class BillProductOrderHExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillProductOrderHExample() {
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

        public Criteria andPkProductOrderIsNull() {
            addCriterion("pk_product_order is null");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderIsNotNull() {
            addCriterion("pk_product_order is not null");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderEqualTo(Integer value) {
            addCriterion("pk_product_order =", value, "pkProductOrder");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderNotEqualTo(Integer value) {
            addCriterion("pk_product_order <>", value, "pkProductOrder");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderGreaterThan(Integer value) {
            addCriterion("pk_product_order >", value, "pkProductOrder");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_product_order >=", value, "pkProductOrder");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderLessThan(Integer value) {
            addCriterion("pk_product_order <", value, "pkProductOrder");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderLessThanOrEqualTo(Integer value) {
            addCriterion("pk_product_order <=", value, "pkProductOrder");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderIn(List<Integer> values) {
            addCriterion("pk_product_order in", values, "pkProductOrder");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderNotIn(List<Integer> values) {
            addCriterion("pk_product_order not in", values, "pkProductOrder");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBetween(Integer value1, Integer value2) {
            addCriterion("pk_product_order between", value1, value2, "pkProductOrder");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_product_order not between", value1, value2, "pkProductOrder");
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

        public Criteria andContractNoIsNull() {
            addCriterion("contract_no is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("contract_no =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("contract_no <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("contract_no >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("contract_no >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("contract_no <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("contract_no <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("contract_no like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("contract_no not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("contract_no in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("contract_no not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("contract_no between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("contract_no not between", value1, value2, "contractNo");
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

        public Criteria andTaxincludIsNull() {
            addCriterion("taxinclud is null");
            return (Criteria) this;
        }

        public Criteria andTaxincludIsNotNull() {
            addCriterion("taxinclud is not null");
            return (Criteria) this;
        }

        public Criteria andTaxincludEqualTo(String value) {
            addCriterion("taxinclud =", value, "taxinclud");
            return (Criteria) this;
        }

        public Criteria andTaxincludNotEqualTo(String value) {
            addCriterion("taxinclud <>", value, "taxinclud");
            return (Criteria) this;
        }

        public Criteria andTaxincludGreaterThan(String value) {
            addCriterion("taxinclud >", value, "taxinclud");
            return (Criteria) this;
        }

        public Criteria andTaxincludGreaterThanOrEqualTo(String value) {
            addCriterion("taxinclud >=", value, "taxinclud");
            return (Criteria) this;
        }

        public Criteria andTaxincludLessThan(String value) {
            addCriterion("taxinclud <", value, "taxinclud");
            return (Criteria) this;
        }

        public Criteria andTaxincludLessThanOrEqualTo(String value) {
            addCriterion("taxinclud <=", value, "taxinclud");
            return (Criteria) this;
        }

        public Criteria andTaxincludLike(String value) {
            addCriterion("taxinclud like", value, "taxinclud");
            return (Criteria) this;
        }

        public Criteria andTaxincludNotLike(String value) {
            addCriterion("taxinclud not like", value, "taxinclud");
            return (Criteria) this;
        }

        public Criteria andTaxincludIn(List<String> values) {
            addCriterion("taxinclud in", values, "taxinclud");
            return (Criteria) this;
        }

        public Criteria andTaxincludNotIn(List<String> values) {
            addCriterion("taxinclud not in", values, "taxinclud");
            return (Criteria) this;
        }

        public Criteria andTaxincludBetween(String value1, String value2) {
            addCriterion("taxinclud between", value1, value2, "taxinclud");
            return (Criteria) this;
        }

        public Criteria andTaxincludNotBetween(String value1, String value2) {
            addCriterion("taxinclud not between", value1, value2, "taxinclud");
            return (Criteria) this;
        }

        public Criteria andUrgentIsNull() {
            addCriterion("urgent is null");
            return (Criteria) this;
        }

        public Criteria andUrgentIsNotNull() {
            addCriterion("urgent is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentEqualTo(String value) {
            addCriterion("urgent =", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotEqualTo(String value) {
            addCriterion("urgent <>", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentGreaterThan(String value) {
            addCriterion("urgent >", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("urgent >=", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentLessThan(String value) {
            addCriterion("urgent <", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentLessThanOrEqualTo(String value) {
            addCriterion("urgent <=", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentLike(String value) {
            addCriterion("urgent like", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotLike(String value) {
            addCriterion("urgent not like", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentIn(List<String> values) {
            addCriterion("urgent in", values, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotIn(List<String> values) {
            addCriterion("urgent not in", values, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentBetween(String value1, String value2) {
            addCriterion("urgent between", value1, value2, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotBetween(String value1, String value2) {
            addCriterion("urgent not between", value1, value2, "urgent");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNull() {
            addCriterion("transport_type is null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNotNull() {
            addCriterion("transport_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeEqualTo(String value) {
            addCriterion("transport_type =", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotEqualTo(String value) {
            addCriterion("transport_type <>", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThan(String value) {
            addCriterion("transport_type >", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("transport_type >=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThan(String value) {
            addCriterion("transport_type <", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThanOrEqualTo(String value) {
            addCriterion("transport_type <=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLike(String value) {
            addCriterion("transport_type like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotLike(String value) {
            addCriterion("transport_type not like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIn(List<String> values) {
            addCriterion("transport_type in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotIn(List<String> values) {
            addCriterion("transport_type not in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeBetween(String value1, String value2) {
            addCriterion("transport_type between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotBetween(String value1, String value2) {
            addCriterion("transport_type not between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("payment_type like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("payment_type not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
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