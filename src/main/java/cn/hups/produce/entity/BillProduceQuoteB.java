package cn.hups.produce.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BillProduceQuoteB extends PagePoJo implements Serializable {
    private Integer pkProduceQuoteB;

    private Integer pkProduceQuoteH;

    private String ismodel;

    private String type;

    private Double param;

    private Double unitPriceOut;

    private Double unitTotalPriceOut;

    private Double unitTotalOut;

    private String memo;

    private Integer dr;

    private String ts;

    private Double unitPriceSale;

    private Double unitTotalPriceSale;

    private Double unitTotalSale;

    private static final long serialVersionUID = 1L;

    public BillProduceQuoteB(Integer pkProduceQuoteB, Integer pkProduceQuoteH, String ismodel, String type, Double param, Double unitPriceOut, Double unitTotalPriceOut, Double unitTotalOut, String memo, Integer dr, String ts, Double unitPriceSale, Double unitTotalPriceSale, Double unitTotalSale) {
        this.pkProduceQuoteB = pkProduceQuoteB;
        this.pkProduceQuoteH = pkProduceQuoteH;
        this.ismodel = ismodel;
        this.type = type;
        this.param = param;
        this.unitPriceOut = unitPriceOut;
        this.unitTotalPriceOut = unitTotalPriceOut;
        this.unitTotalOut = unitTotalOut;
        this.memo = memo;
        this.dr = dr;
        this.ts = ts;
        this.unitPriceSale = unitPriceSale;
        this.unitTotalPriceSale = unitTotalPriceSale;
        this.unitTotalSale = unitTotalSale;
    }

    public BillProduceQuoteB() {
        super();
    }

    public Integer getPkProduceQuoteB() {
        return pkProduceQuoteB;
    }

    public void setPkProduceQuoteB(Integer pkProduceQuoteB) {
        this.pkProduceQuoteB = pkProduceQuoteB;
    }

    public Integer getPkProduceQuoteH() {
        return pkProduceQuoteH;
    }

    public void setPkProduceQuoteH(Integer pkProduceQuoteH) {
        this.pkProduceQuoteH = pkProduceQuoteH;
    }

    public String getIsmodel() {
        return ismodel;
    }

    public void setIsmodel(String ismodel) {
        this.ismodel = ismodel == null ? null : ismodel.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getParam() {
        return param;
    }

    public void setParam(Double param) {
        this.param = param;
    }

    public Double getUnitPriceOut() {
        return unitPriceOut;
    }

    public void setUnitPriceOut(Double unitPriceOut) {
        this.unitPriceOut = unitPriceOut;
    }

    public Double getUnitTotalPriceOut() {
        return unitTotalPriceOut;
    }

    public void setUnitTotalPriceOut(Double unitTotalPriceOut) {
        this.unitTotalPriceOut = unitTotalPriceOut;
    }

    public Double getUnitTotalOut() {
        return unitTotalOut;
    }

    public void setUnitTotalOut(Double unitTotalOut) {
        this.unitTotalOut = unitTotalOut;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public Double getUnitPriceSale() {
        return unitPriceSale;
    }

    public void setUnitPriceSale(Double unitPriceSale) {
        this.unitPriceSale = unitPriceSale;
    }

    public Double getUnitTotalPriceSale() {
        return unitTotalPriceSale;
    }

    public void setUnitTotalPriceSale(Double unitTotalPriceSale) {
        this.unitTotalPriceSale = unitTotalPriceSale;
    }

    public Double getUnitTotalSale() {
        return unitTotalSale;
    }

    public void setUnitTotalSale(Double unitTotalSale) {
        this.unitTotalSale = unitTotalSale;
    }
}