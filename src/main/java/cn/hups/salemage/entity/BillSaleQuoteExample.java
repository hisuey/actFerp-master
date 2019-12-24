package cn.hups.salemage.entity;

import java.util.ArrayList;
import java.util.List;

public class BillSaleQuoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillSaleQuoteExample() {
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

        public Criteria andPkSaleQuoteIsNull() {
            addCriterion("pk_sale_quote is null");
            return (Criteria) this;
        }

        public Criteria andPkSaleQuoteIsNotNull() {
            addCriterion("pk_sale_quote is not null");
            return (Criteria) this;
        }

        public Criteria andPkSaleQuoteEqualTo(Integer value) {
            addCriterion("pk_sale_quote =", value, "pkSaleQuote");
            return (Criteria) this;
        }

        public Criteria andPkSaleQuoteNotEqualTo(Integer value) {
            addCriterion("pk_sale_quote <>", value, "pkSaleQuote");
            return (Criteria) this;
        }

        public Criteria andPkSaleQuoteGreaterThan(Integer value) {
            addCriterion("pk_sale_quote >", value, "pkSaleQuote");
            return (Criteria) this;
        }

        public Criteria andPkSaleQuoteGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_sale_quote >=", value, "pkSaleQuote");
            return (Criteria) this;
        }

        public Criteria andPkSaleQuoteLessThan(Integer value) {
            addCriterion("pk_sale_quote <", value, "pkSaleQuote");
            return (Criteria) this;
        }

        public Criteria andPkSaleQuoteLessThanOrEqualTo(Integer value) {
            addCriterion("pk_sale_quote <=", value, "pkSaleQuote");
            return (Criteria) this;
        }

        public Criteria andPkSaleQuoteIn(List<Integer> values) {
            addCriterion("pk_sale_quote in", values, "pkSaleQuote");
            return (Criteria) this;
        }

        public Criteria andPkSaleQuoteNotIn(List<Integer> values) {
            addCriterion("pk_sale_quote not in", values, "pkSaleQuote");
            return (Criteria) this;
        }

        public Criteria andPkSaleQuoteBetween(Integer value1, Integer value2) {
            addCriterion("pk_sale_quote between", value1, value2, "pkSaleQuote");
            return (Criteria) this;
        }

        public Criteria andPkSaleQuoteNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_sale_quote not between", value1, value2, "pkSaleQuote");
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

        public Criteria andPkProduceQuoteHIsNull() {
            addCriterion("pk_produce_quote_h is null");
            return (Criteria) this;
        }

        public Criteria andPkProduceQuoteHIsNotNull() {
            addCriterion("pk_produce_quote_h is not null");
            return (Criteria) this;
        }

        public Criteria andPkProduceQuoteHEqualTo(Integer value) {
            addCriterion("pk_produce_quote_h =", value, "pkProduceQuoteH");
            return (Criteria) this;
        }

        public Criteria andPkProduceQuoteHNotEqualTo(Integer value) {
            addCriterion("pk_produce_quote_h <>", value, "pkProduceQuoteH");
            return (Criteria) this;
        }

        public Criteria andPkProduceQuoteHGreaterThan(Integer value) {
            addCriterion("pk_produce_quote_h >", value, "pkProduceQuoteH");
            return (Criteria) this;
        }

        public Criteria andPkProduceQuoteHGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_produce_quote_h >=", value, "pkProduceQuoteH");
            return (Criteria) this;
        }

        public Criteria andPkProduceQuoteHLessThan(Integer value) {
            addCriterion("pk_produce_quote_h <", value, "pkProduceQuoteH");
            return (Criteria) this;
        }

        public Criteria andPkProduceQuoteHLessThanOrEqualTo(Integer value) {
            addCriterion("pk_produce_quote_h <=", value, "pkProduceQuoteH");
            return (Criteria) this;
        }

        public Criteria andPkProduceQuoteHIn(List<Integer> values) {
            addCriterion("pk_produce_quote_h in", values, "pkProduceQuoteH");
            return (Criteria) this;
        }

        public Criteria andPkProduceQuoteHNotIn(List<Integer> values) {
            addCriterion("pk_produce_quote_h not in", values, "pkProduceQuoteH");
            return (Criteria) this;
        }

        public Criteria andPkProduceQuoteHBetween(Integer value1, Integer value2) {
            addCriterion("pk_produce_quote_h between", value1, value2, "pkProduceQuoteH");
            return (Criteria) this;
        }

        public Criteria andPkProduceQuoteHNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_produce_quote_h not between", value1, value2, "pkProduceQuoteH");
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

        public Criteria andMatterFilenameIsNull() {
            addCriterion("matter_filename is null");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameIsNotNull() {
            addCriterion("matter_filename is not null");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameEqualTo(String value) {
            addCriterion("matter_filename =", value, "matterFilename");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameNotEqualTo(String value) {
            addCriterion("matter_filename <>", value, "matterFilename");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameGreaterThan(String value) {
            addCriterion("matter_filename >", value, "matterFilename");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("matter_filename >=", value, "matterFilename");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameLessThan(String value) {
            addCriterion("matter_filename <", value, "matterFilename");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameLessThanOrEqualTo(String value) {
            addCriterion("matter_filename <=", value, "matterFilename");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameLike(String value) {
            addCriterion("matter_filename like", value, "matterFilename");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameNotLike(String value) {
            addCriterion("matter_filename not like", value, "matterFilename");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameIn(List<String> values) {
            addCriterion("matter_filename in", values, "matterFilename");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameNotIn(List<String> values) {
            addCriterion("matter_filename not in", values, "matterFilename");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameBetween(String value1, String value2) {
            addCriterion("matter_filename between", value1, value2, "matterFilename");
            return (Criteria) this;
        }

        public Criteria andMatterFilenameNotBetween(String value1, String value2) {
            addCriterion("matter_filename not between", value1, value2, "matterFilename");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameIsNull() {
            addCriterion("matter_file_full_name is null");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameIsNotNull() {
            addCriterion("matter_file_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameEqualTo(String value) {
            addCriterion("matter_file_full_name =", value, "matterFileFullName");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameNotEqualTo(String value) {
            addCriterion("matter_file_full_name <>", value, "matterFileFullName");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameGreaterThan(String value) {
            addCriterion("matter_file_full_name >", value, "matterFileFullName");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("matter_file_full_name >=", value, "matterFileFullName");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameLessThan(String value) {
            addCriterion("matter_file_full_name <", value, "matterFileFullName");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameLessThanOrEqualTo(String value) {
            addCriterion("matter_file_full_name <=", value, "matterFileFullName");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameLike(String value) {
            addCriterion("matter_file_full_name like", value, "matterFileFullName");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameNotLike(String value) {
            addCriterion("matter_file_full_name not like", value, "matterFileFullName");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameIn(List<String> values) {
            addCriterion("matter_file_full_name in", values, "matterFileFullName");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameNotIn(List<String> values) {
            addCriterion("matter_file_full_name not in", values, "matterFileFullName");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameBetween(String value1, String value2) {
            addCriterion("matter_file_full_name between", value1, value2, "matterFileFullName");
            return (Criteria) this;
        }

        public Criteria andMatterFileFullNameNotBetween(String value1, String value2) {
            addCriterion("matter_file_full_name not between", value1, value2, "matterFileFullName");
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