package cn.hups.worktools.po;

import cn.hups.purchase.po.BillMaterielPo;

import java.util.List;

/**
 * 保存Excel解析的数据到数据库中(参数接收PO)
 */
public class SaveMaterielParamListPo {
    private Integer pkProduct;

    private List<BillMaterielPo> billMaterielPoList;

    public List<BillMaterielPo> getBillMaterielPoList() {
        return billMaterielPoList;
    }

    public void setBillMaterielPoList(List<BillMaterielPo> billMaterielPoList) {
        this.billMaterielPoList = billMaterielPoList;
    }

    public Integer getPkProduct() {
        return pkProduct;
    }

    public void setPkProduct(Integer pkProduct) {
        this.pkProduct = pkProduct;
    }
}
