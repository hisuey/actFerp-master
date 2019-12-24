package cn.hups.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class BdInvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdInvoiceExample() {
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

        public Criteria andPkInvoiceIsNull() {
            addCriterion("pk_invoice is null");
            return (Criteria) this;
        }

        public Criteria andPkInvoiceIsNotNull() {
            addCriterion("pk_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andPkInvoiceEqualTo(Integer value) {
            addCriterion("pk_invoice =", value, "pkInvoice");
            return (Criteria) this;
        }

        public Criteria andPkInvoiceNotEqualTo(Integer value) {
            addCriterion("pk_invoice <>", value, "pkInvoice");
            return (Criteria) this;
        }

        public Criteria andPkInvoiceGreaterThan(Integer value) {
            addCriterion("pk_invoice >", value, "pkInvoice");
            return (Criteria) this;
        }

        public Criteria andPkInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_invoice >=", value, "pkInvoice");
            return (Criteria) this;
        }

        public Criteria andPkInvoiceLessThan(Integer value) {
            addCriterion("pk_invoice <", value, "pkInvoice");
            return (Criteria) this;
        }

        public Criteria andPkInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("pk_invoice <=", value, "pkInvoice");
            return (Criteria) this;
        }

        public Criteria andPkInvoiceIn(List<Integer> values) {
            addCriterion("pk_invoice in", values, "pkInvoice");
            return (Criteria) this;
        }

        public Criteria andPkInvoiceNotIn(List<Integer> values) {
            addCriterion("pk_invoice not in", values, "pkInvoice");
            return (Criteria) this;
        }

        public Criteria andPkInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("pk_invoice between", value1, value2, "pkInvoice");
            return (Criteria) this;
        }

        public Criteria andPkInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_invoice not between", value1, value2, "pkInvoice");
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

        public Criteria andCorpnameIsNull() {
            addCriterion("corpname is null");
            return (Criteria) this;
        }

        public Criteria andCorpnameIsNotNull() {
            addCriterion("corpname is not null");
            return (Criteria) this;
        }

        public Criteria andCorpnameEqualTo(String value) {
            addCriterion("corpname =", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameNotEqualTo(String value) {
            addCriterion("corpname <>", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameGreaterThan(String value) {
            addCriterion("corpname >", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameGreaterThanOrEqualTo(String value) {
            addCriterion("corpname >=", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameLessThan(String value) {
            addCriterion("corpname <", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameLessThanOrEqualTo(String value) {
            addCriterion("corpname <=", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameLike(String value) {
            addCriterion("corpname like", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameNotLike(String value) {
            addCriterion("corpname not like", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameIn(List<String> values) {
            addCriterion("corpname in", values, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameNotIn(List<String> values) {
            addCriterion("corpname not in", values, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameBetween(String value1, String value2) {
            addCriterion("corpname between", value1, value2, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameNotBetween(String value1, String value2) {
            addCriterion("corpname not between", value1, value2, "corpname");
            return (Criteria) this;
        }

        public Criteria andDutynumIsNull() {
            addCriterion("dutynum is null");
            return (Criteria) this;
        }

        public Criteria andDutynumIsNotNull() {
            addCriterion("dutynum is not null");
            return (Criteria) this;
        }

        public Criteria andDutynumEqualTo(String value) {
            addCriterion("dutynum =", value, "dutynum");
            return (Criteria) this;
        }

        public Criteria andDutynumNotEqualTo(String value) {
            addCriterion("dutynum <>", value, "dutynum");
            return (Criteria) this;
        }

        public Criteria andDutynumGreaterThan(String value) {
            addCriterion("dutynum >", value, "dutynum");
            return (Criteria) this;
        }

        public Criteria andDutynumGreaterThanOrEqualTo(String value) {
            addCriterion("dutynum >=", value, "dutynum");
            return (Criteria) this;
        }

        public Criteria andDutynumLessThan(String value) {
            addCriterion("dutynum <", value, "dutynum");
            return (Criteria) this;
        }

        public Criteria andDutynumLessThanOrEqualTo(String value) {
            addCriterion("dutynum <=", value, "dutynum");
            return (Criteria) this;
        }

        public Criteria andDutynumLike(String value) {
            addCriterion("dutynum like", value, "dutynum");
            return (Criteria) this;
        }

        public Criteria andDutynumNotLike(String value) {
            addCriterion("dutynum not like", value, "dutynum");
            return (Criteria) this;
        }

        public Criteria andDutynumIn(List<String> values) {
            addCriterion("dutynum in", values, "dutynum");
            return (Criteria) this;
        }

        public Criteria andDutynumNotIn(List<String> values) {
            addCriterion("dutynum not in", values, "dutynum");
            return (Criteria) this;
        }

        public Criteria andDutynumBetween(String value1, String value2) {
            addCriterion("dutynum between", value1, value2, "dutynum");
            return (Criteria) this;
        }

        public Criteria andDutynumNotBetween(String value1, String value2) {
            addCriterion("dutynum not between", value1, value2, "dutynum");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressIsNull() {
            addCriterion("invoice_address is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressIsNotNull() {
            addCriterion("invoice_address is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressEqualTo(String value) {
            addCriterion("invoice_address =", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressNotEqualTo(String value) {
            addCriterion("invoice_address <>", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressGreaterThan(String value) {
            addCriterion("invoice_address >", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_address >=", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressLessThan(String value) {
            addCriterion("invoice_address <", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressLessThanOrEqualTo(String value) {
            addCriterion("invoice_address <=", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressLike(String value) {
            addCriterion("invoice_address like", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressNotLike(String value) {
            addCriterion("invoice_address not like", value, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressIn(List<String> values) {
            addCriterion("invoice_address in", values, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressNotIn(List<String> values) {
            addCriterion("invoice_address not in", values, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressBetween(String value1, String value2) {
            addCriterion("invoice_address between", value1, value2, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddressNotBetween(String value1, String value2) {
            addCriterion("invoice_address not between", value1, value2, "invoiceAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelIsNull() {
            addCriterion("invoice_tel is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelIsNotNull() {
            addCriterion("invoice_tel is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelEqualTo(String value) {
            addCriterion("invoice_tel =", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelNotEqualTo(String value) {
            addCriterion("invoice_tel <>", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelGreaterThan(String value) {
            addCriterion("invoice_tel >", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_tel >=", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelLessThan(String value) {
            addCriterion("invoice_tel <", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelLessThanOrEqualTo(String value) {
            addCriterion("invoice_tel <=", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelLike(String value) {
            addCriterion("invoice_tel like", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelNotLike(String value) {
            addCriterion("invoice_tel not like", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelIn(List<String> values) {
            addCriterion("invoice_tel in", values, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelNotIn(List<String> values) {
            addCriterion("invoice_tel not in", values, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelBetween(String value1, String value2) {
            addCriterion("invoice_tel between", value1, value2, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelNotBetween(String value1, String value2) {
            addCriterion("invoice_tel not between", value1, value2, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankIsNull() {
            addCriterion("invoice_bank is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankIsNotNull() {
            addCriterion("invoice_bank is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankEqualTo(String value) {
            addCriterion("invoice_bank =", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankNotEqualTo(String value) {
            addCriterion("invoice_bank <>", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankGreaterThan(String value) {
            addCriterion("invoice_bank >", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_bank >=", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankLessThan(String value) {
            addCriterion("invoice_bank <", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankLessThanOrEqualTo(String value) {
            addCriterion("invoice_bank <=", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankLike(String value) {
            addCriterion("invoice_bank like", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankNotLike(String value) {
            addCriterion("invoice_bank not like", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankIn(List<String> values) {
            addCriterion("invoice_bank in", values, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankNotIn(List<String> values) {
            addCriterion("invoice_bank not in", values, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankBetween(String value1, String value2) {
            addCriterion("invoice_bank between", value1, value2, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankNotBetween(String value1, String value2) {
            addCriterion("invoice_bank not between", value1, value2, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountIsNull() {
            addCriterion("invoice_account is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountIsNotNull() {
            addCriterion("invoice_account is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountEqualTo(String value) {
            addCriterion("invoice_account =", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountNotEqualTo(String value) {
            addCriterion("invoice_account <>", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountGreaterThan(String value) {
            addCriterion("invoice_account >", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_account >=", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountLessThan(String value) {
            addCriterion("invoice_account <", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountLessThanOrEqualTo(String value) {
            addCriterion("invoice_account <=", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountLike(String value) {
            addCriterion("invoice_account like", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountNotLike(String value) {
            addCriterion("invoice_account not like", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountIn(List<String> values) {
            addCriterion("invoice_account in", values, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountNotIn(List<String> values) {
            addCriterion("invoice_account not in", values, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountBetween(String value1, String value2) {
            addCriterion("invoice_account between", value1, value2, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountNotBetween(String value1, String value2) {
            addCriterion("invoice_account not between", value1, value2, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andAddresseeIsNull() {
            addCriterion("addressee is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeIsNotNull() {
            addCriterion("addressee is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeEqualTo(String value) {
            addCriterion("addressee =", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotEqualTo(String value) {
            addCriterion("addressee <>", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeGreaterThan(String value) {
            addCriterion("addressee >", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeGreaterThanOrEqualTo(String value) {
            addCriterion("addressee >=", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeLessThan(String value) {
            addCriterion("addressee <", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeLessThanOrEqualTo(String value) {
            addCriterion("addressee <=", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeLike(String value) {
            addCriterion("addressee like", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotLike(String value) {
            addCriterion("addressee not like", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeIn(List<String> values) {
            addCriterion("addressee in", values, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotIn(List<String> values) {
            addCriterion("addressee not in", values, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeBetween(String value1, String value2) {
            addCriterion("addressee between", value1, value2, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotBetween(String value1, String value2) {
            addCriterion("addressee not between", value1, value2, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelIsNull() {
            addCriterion("addressee_tel is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelIsNotNull() {
            addCriterion("addressee_tel is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelEqualTo(String value) {
            addCriterion("addressee_tel =", value, "addresseeTel");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelNotEqualTo(String value) {
            addCriterion("addressee_tel <>", value, "addresseeTel");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelGreaterThan(String value) {
            addCriterion("addressee_tel >", value, "addresseeTel");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelGreaterThanOrEqualTo(String value) {
            addCriterion("addressee_tel >=", value, "addresseeTel");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelLessThan(String value) {
            addCriterion("addressee_tel <", value, "addresseeTel");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelLessThanOrEqualTo(String value) {
            addCriterion("addressee_tel <=", value, "addresseeTel");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelLike(String value) {
            addCriterion("addressee_tel like", value, "addresseeTel");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelNotLike(String value) {
            addCriterion("addressee_tel not like", value, "addresseeTel");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelIn(List<String> values) {
            addCriterion("addressee_tel in", values, "addresseeTel");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelNotIn(List<String> values) {
            addCriterion("addressee_tel not in", values, "addresseeTel");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelBetween(String value1, String value2) {
            addCriterion("addressee_tel between", value1, value2, "addresseeTel");
            return (Criteria) this;
        }

        public Criteria andAddresseeTelNotBetween(String value1, String value2) {
            addCriterion("addressee_tel not between", value1, value2, "addresseeTel");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsIsNull() {
            addCriterion("addressee_adrs is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsIsNotNull() {
            addCriterion("addressee_adrs is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsEqualTo(String value) {
            addCriterion("addressee_adrs =", value, "addresseeAdrs");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsNotEqualTo(String value) {
            addCriterion("addressee_adrs <>", value, "addresseeAdrs");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsGreaterThan(String value) {
            addCriterion("addressee_adrs >", value, "addresseeAdrs");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsGreaterThanOrEqualTo(String value) {
            addCriterion("addressee_adrs >=", value, "addresseeAdrs");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsLessThan(String value) {
            addCriterion("addressee_adrs <", value, "addresseeAdrs");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsLessThanOrEqualTo(String value) {
            addCriterion("addressee_adrs <=", value, "addresseeAdrs");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsLike(String value) {
            addCriterion("addressee_adrs like", value, "addresseeAdrs");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsNotLike(String value) {
            addCriterion("addressee_adrs not like", value, "addresseeAdrs");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsIn(List<String> values) {
            addCriterion("addressee_adrs in", values, "addresseeAdrs");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsNotIn(List<String> values) {
            addCriterion("addressee_adrs not in", values, "addresseeAdrs");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsBetween(String value1, String value2) {
            addCriterion("addressee_adrs between", value1, value2, "addresseeAdrs");
            return (Criteria) this;
        }

        public Criteria andAddresseeAdrsNotBetween(String value1, String value2) {
            addCriterion("addressee_adrs not between", value1, value2, "addresseeAdrs");
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