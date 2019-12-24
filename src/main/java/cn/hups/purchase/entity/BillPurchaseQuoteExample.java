package cn.hups.purchase.entity;

import java.util.ArrayList;
import java.util.List;

public class BillPurchaseQuoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillPurchaseQuoteExample() {
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

        public Criteria andContractnoIsNull() {
            addCriterion("contractno is null");
            return (Criteria) this;
        }

        public Criteria andContractnoIsNotNull() {
            addCriterion("contractno is not null");
            return (Criteria) this;
        }

        public Criteria andContractnoEqualTo(String value) {
            addCriterion("contractno =", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotEqualTo(String value) {
            addCriterion("contractno <>", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoGreaterThan(String value) {
            addCriterion("contractno >", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoGreaterThanOrEqualTo(String value) {
            addCriterion("contractno >=", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLessThan(String value) {
            addCriterion("contractno <", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLessThanOrEqualTo(String value) {
            addCriterion("contractno <=", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLike(String value) {
            addCriterion("contractno like", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotLike(String value) {
            addCriterion("contractno not like", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoIn(List<String> values) {
            addCriterion("contractno in", values, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotIn(List<String> values) {
            addCriterion("contractno not in", values, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoBetween(String value1, String value2) {
            addCriterion("contractno between", value1, value2, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotBetween(String value1, String value2) {
            addCriterion("contractno not between", value1, value2, "contractno");
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

        public Criteria andPurchasePriceIsNull() {
            addCriterion("purchase_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNotNull() {
            addCriterion("purchase_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceEqualTo(Double value) {
            addCriterion("purchase_price =", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotEqualTo(Double value) {
            addCriterion("purchase_price <>", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThan(Double value) {
            addCriterion("purchase_price >", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("purchase_price >=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThan(Double value) {
            addCriterion("purchase_price <", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThanOrEqualTo(Double value) {
            addCriterion("purchase_price <=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIn(List<Double> values) {
            addCriterion("purchase_price in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotIn(List<Double> values) {
            addCriterion("purchase_price not in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceBetween(Double value1, Double value2) {
            addCriterion("purchase_price between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotBetween(Double value1, Double value2) {
            addCriterion("purchase_price not between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalIsNull() {
            addCriterion("purchase_total is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalIsNotNull() {
            addCriterion("purchase_total is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalEqualTo(Double value) {
            addCriterion("purchase_total =", value, "purchaseTotal");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalNotEqualTo(Double value) {
            addCriterion("purchase_total <>", value, "purchaseTotal");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalGreaterThan(Double value) {
            addCriterion("purchase_total >", value, "purchaseTotal");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("purchase_total >=", value, "purchaseTotal");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalLessThan(Double value) {
            addCriterion("purchase_total <", value, "purchaseTotal");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalLessThanOrEqualTo(Double value) {
            addCriterion("purchase_total <=", value, "purchaseTotal");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalIn(List<Double> values) {
            addCriterion("purchase_total in", values, "purchaseTotal");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalNotIn(List<Double> values) {
            addCriterion("purchase_total not in", values, "purchaseTotal");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalBetween(Double value1, Double value2) {
            addCriterion("purchase_total between", value1, value2, "purchaseTotal");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalNotBetween(Double value1, Double value2) {
            addCriterion("purchase_total not between", value1, value2, "purchaseTotal");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceIsNull() {
            addCriterion("product_pcb_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceIsNotNull() {
            addCriterion("product_pcb_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceEqualTo(Double value) {
            addCriterion("product_pcb_price =", value, "productPcbPrice");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceNotEqualTo(Double value) {
            addCriterion("product_pcb_price <>", value, "productPcbPrice");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceGreaterThan(Double value) {
            addCriterion("product_pcb_price >", value, "productPcbPrice");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("product_pcb_price >=", value, "productPcbPrice");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceLessThan(Double value) {
            addCriterion("product_pcb_price <", value, "productPcbPrice");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceLessThanOrEqualTo(Double value) {
            addCriterion("product_pcb_price <=", value, "productPcbPrice");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceIn(List<Double> values) {
            addCriterion("product_pcb_price in", values, "productPcbPrice");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceNotIn(List<Double> values) {
            addCriterion("product_pcb_price not in", values, "productPcbPrice");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceBetween(Double value1, Double value2) {
            addCriterion("product_pcb_price between", value1, value2, "productPcbPrice");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceNotBetween(Double value1, Double value2) {
            addCriterion("product_pcb_price not between", value1, value2, "productPcbPrice");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalIsNull() {
            addCriterion("product_pcb_total is null");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalIsNotNull() {
            addCriterion("product_pcb_total is not null");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalEqualTo(Double value) {
            addCriterion("product_pcb_total =", value, "productPcbTotal");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalNotEqualTo(Double value) {
            addCriterion("product_pcb_total <>", value, "productPcbTotal");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalGreaterThan(Double value) {
            addCriterion("product_pcb_total >", value, "productPcbTotal");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("product_pcb_total >=", value, "productPcbTotal");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalLessThan(Double value) {
            addCriterion("product_pcb_total <", value, "productPcbTotal");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalLessThanOrEqualTo(Double value) {
            addCriterion("product_pcb_total <=", value, "productPcbTotal");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalIn(List<Double> values) {
            addCriterion("product_pcb_total in", values, "productPcbTotal");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalNotIn(List<Double> values) {
            addCriterion("product_pcb_total not in", values, "productPcbTotal");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalBetween(Double value1, Double value2) {
            addCriterion("product_pcb_total between", value1, value2, "productPcbTotal");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalNotBetween(Double value1, Double value2) {
            addCriterion("product_pcb_total not between", value1, value2, "productPcbTotal");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateIsNull() {
            addCriterion("quote_end_date is null");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateIsNotNull() {
            addCriterion("quote_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateEqualTo(String value) {
            addCriterion("quote_end_date =", value, "quoteEndDate");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateNotEqualTo(String value) {
            addCriterion("quote_end_date <>", value, "quoteEndDate");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateGreaterThan(String value) {
            addCriterion("quote_end_date >", value, "quoteEndDate");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("quote_end_date >=", value, "quoteEndDate");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateLessThan(String value) {
            addCriterion("quote_end_date <", value, "quoteEndDate");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateLessThanOrEqualTo(String value) {
            addCriterion("quote_end_date <=", value, "quoteEndDate");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateLike(String value) {
            addCriterion("quote_end_date like", value, "quoteEndDate");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateNotLike(String value) {
            addCriterion("quote_end_date not like", value, "quoteEndDate");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateIn(List<String> values) {
            addCriterion("quote_end_date in", values, "quoteEndDate");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateNotIn(List<String> values) {
            addCriterion("quote_end_date not in", values, "quoteEndDate");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateBetween(String value1, String value2) {
            addCriterion("quote_end_date between", value1, value2, "quoteEndDate");
            return (Criteria) this;
        }

        public Criteria andQuoteEndDateNotBetween(String value1, String value2) {
            addCriterion("quote_end_date not between", value1, value2, "quoteEndDate");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileFullnameIsNull() {
            addCriterion("file_fullname is null");
            return (Criteria) this;
        }

        public Criteria andFileFullnameIsNotNull() {
            addCriterion("file_fullname is not null");
            return (Criteria) this;
        }

        public Criteria andFileFullnameEqualTo(String value) {
            addCriterion("file_fullname =", value, "fileFullname");
            return (Criteria) this;
        }

        public Criteria andFileFullnameNotEqualTo(String value) {
            addCriterion("file_fullname <>", value, "fileFullname");
            return (Criteria) this;
        }

        public Criteria andFileFullnameGreaterThan(String value) {
            addCriterion("file_fullname >", value, "fileFullname");
            return (Criteria) this;
        }

        public Criteria andFileFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("file_fullname >=", value, "fileFullname");
            return (Criteria) this;
        }

        public Criteria andFileFullnameLessThan(String value) {
            addCriterion("file_fullname <", value, "fileFullname");
            return (Criteria) this;
        }

        public Criteria andFileFullnameLessThanOrEqualTo(String value) {
            addCriterion("file_fullname <=", value, "fileFullname");
            return (Criteria) this;
        }

        public Criteria andFileFullnameLike(String value) {
            addCriterion("file_fullname like", value, "fileFullname");
            return (Criteria) this;
        }

        public Criteria andFileFullnameNotLike(String value) {
            addCriterion("file_fullname not like", value, "fileFullname");
            return (Criteria) this;
        }

        public Criteria andFileFullnameIn(List<String> values) {
            addCriterion("file_fullname in", values, "fileFullname");
            return (Criteria) this;
        }

        public Criteria andFileFullnameNotIn(List<String> values) {
            addCriterion("file_fullname not in", values, "fileFullname");
            return (Criteria) this;
        }

        public Criteria andFileFullnameBetween(String value1, String value2) {
            addCriterion("file_fullname between", value1, value2, "fileFullname");
            return (Criteria) this;
        }

        public Criteria andFileFullnameNotBetween(String value1, String value2) {
            addCriterion("file_fullname not between", value1, value2, "fileFullname");
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

        public Criteria andPurchasePriceSaleIsNull() {
            addCriterion("purchase_price_sale is null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceSaleIsNotNull() {
            addCriterion("purchase_price_sale is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceSaleEqualTo(Double value) {
            addCriterion("purchase_price_sale =", value, "purchasePriceSale");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceSaleNotEqualTo(Double value) {
            addCriterion("purchase_price_sale <>", value, "purchasePriceSale");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceSaleGreaterThan(Double value) {
            addCriterion("purchase_price_sale >", value, "purchasePriceSale");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceSaleGreaterThanOrEqualTo(Double value) {
            addCriterion("purchase_price_sale >=", value, "purchasePriceSale");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceSaleLessThan(Double value) {
            addCriterion("purchase_price_sale <", value, "purchasePriceSale");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceSaleLessThanOrEqualTo(Double value) {
            addCriterion("purchase_price_sale <=", value, "purchasePriceSale");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceSaleIn(List<Double> values) {
            addCriterion("purchase_price_sale in", values, "purchasePriceSale");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceSaleNotIn(List<Double> values) {
            addCriterion("purchase_price_sale not in", values, "purchasePriceSale");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceSaleBetween(Double value1, Double value2) {
            addCriterion("purchase_price_sale between", value1, value2, "purchasePriceSale");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceSaleNotBetween(Double value1, Double value2) {
            addCriterion("purchase_price_sale not between", value1, value2, "purchasePriceSale");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalSaleIsNull() {
            addCriterion("purchase_total_sale is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalSaleIsNotNull() {
            addCriterion("purchase_total_sale is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalSaleEqualTo(Double value) {
            addCriterion("purchase_total_sale =", value, "purchaseTotalSale");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalSaleNotEqualTo(Double value) {
            addCriterion("purchase_total_sale <>", value, "purchaseTotalSale");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalSaleGreaterThan(Double value) {
            addCriterion("purchase_total_sale >", value, "purchaseTotalSale");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalSaleGreaterThanOrEqualTo(Double value) {
            addCriterion("purchase_total_sale >=", value, "purchaseTotalSale");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalSaleLessThan(Double value) {
            addCriterion("purchase_total_sale <", value, "purchaseTotalSale");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalSaleLessThanOrEqualTo(Double value) {
            addCriterion("purchase_total_sale <=", value, "purchaseTotalSale");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalSaleIn(List<Double> values) {
            addCriterion("purchase_total_sale in", values, "purchaseTotalSale");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalSaleNotIn(List<Double> values) {
            addCriterion("purchase_total_sale not in", values, "purchaseTotalSale");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalSaleBetween(Double value1, Double value2) {
            addCriterion("purchase_total_sale between", value1, value2, "purchaseTotalSale");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalSaleNotBetween(Double value1, Double value2) {
            addCriterion("purchase_total_sale not between", value1, value2, "purchaseTotalSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceSaleIsNull() {
            addCriterion("product_pcb_price_sale is null");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceSaleIsNotNull() {
            addCriterion("product_pcb_price_sale is not null");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceSaleEqualTo(Double value) {
            addCriterion("product_pcb_price_sale =", value, "productPcbPriceSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceSaleNotEqualTo(Double value) {
            addCriterion("product_pcb_price_sale <>", value, "productPcbPriceSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceSaleGreaterThan(Double value) {
            addCriterion("product_pcb_price_sale >", value, "productPcbPriceSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceSaleGreaterThanOrEqualTo(Double value) {
            addCriterion("product_pcb_price_sale >=", value, "productPcbPriceSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceSaleLessThan(Double value) {
            addCriterion("product_pcb_price_sale <", value, "productPcbPriceSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceSaleLessThanOrEqualTo(Double value) {
            addCriterion("product_pcb_price_sale <=", value, "productPcbPriceSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceSaleIn(List<Double> values) {
            addCriterion("product_pcb_price_sale in", values, "productPcbPriceSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceSaleNotIn(List<Double> values) {
            addCriterion("product_pcb_price_sale not in", values, "productPcbPriceSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceSaleBetween(Double value1, Double value2) {
            addCriterion("product_pcb_price_sale between", value1, value2, "productPcbPriceSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbPriceSaleNotBetween(Double value1, Double value2) {
            addCriterion("product_pcb_price_sale not between", value1, value2, "productPcbPriceSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalSaleIsNull() {
            addCriterion("product_pcb_total_sale is null");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalSaleIsNotNull() {
            addCriterion("product_pcb_total_sale is not null");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalSaleEqualTo(Double value) {
            addCriterion("product_pcb_total_sale =", value, "productPcbTotalSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalSaleNotEqualTo(Double value) {
            addCriterion("product_pcb_total_sale <>", value, "productPcbTotalSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalSaleGreaterThan(Double value) {
            addCriterion("product_pcb_total_sale >", value, "productPcbTotalSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalSaleGreaterThanOrEqualTo(Double value) {
            addCriterion("product_pcb_total_sale >=", value, "productPcbTotalSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalSaleLessThan(Double value) {
            addCriterion("product_pcb_total_sale <", value, "productPcbTotalSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalSaleLessThanOrEqualTo(Double value) {
            addCriterion("product_pcb_total_sale <=", value, "productPcbTotalSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalSaleIn(List<Double> values) {
            addCriterion("product_pcb_total_sale in", values, "productPcbTotalSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalSaleNotIn(List<Double> values) {
            addCriterion("product_pcb_total_sale not in", values, "productPcbTotalSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalSaleBetween(Double value1, Double value2) {
            addCriterion("product_pcb_total_sale between", value1, value2, "productPcbTotalSale");
            return (Criteria) this;
        }

        public Criteria andProductPcbTotalSaleNotBetween(Double value1, Double value2) {
            addCriterion("product_pcb_total_sale not between", value1, value2, "productPcbTotalSale");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBIsNull() {
            addCriterion("pk_product_order_b is null");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBIsNotNull() {
            addCriterion("pk_product_order_b is not null");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBEqualTo(Integer value) {
            addCriterion("pk_product_order_b =", value, "pkProductOrderB");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBNotEqualTo(Integer value) {
            addCriterion("pk_product_order_b <>", value, "pkProductOrderB");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBGreaterThan(Integer value) {
            addCriterion("pk_product_order_b >", value, "pkProductOrderB");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_product_order_b >=", value, "pkProductOrderB");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBLessThan(Integer value) {
            addCriterion("pk_product_order_b <", value, "pkProductOrderB");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBLessThanOrEqualTo(Integer value) {
            addCriterion("pk_product_order_b <=", value, "pkProductOrderB");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBIn(List<Integer> values) {
            addCriterion("pk_product_order_b in", values, "pkProductOrderB");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBNotIn(List<Integer> values) {
            addCriterion("pk_product_order_b not in", values, "pkProductOrderB");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBBetween(Integer value1, Integer value2) {
            addCriterion("pk_product_order_b between", value1, value2, "pkProductOrderB");
            return (Criteria) this;
        }

        public Criteria andPkProductOrderBNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_product_order_b not between", value1, value2, "pkProductOrderB");
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