package cn.hups.worktools.po;

import cn.hups.purchase.po.BdMaterielDataBasePo;

/**
 * 解析物料价格库Excel参数PO
 */
public class ResolvMaterielDataBasePo extends BdMaterielDataBasePo {

    public static int getExcelIndexWithColumn(String column) {
        int resultIndex = -1;

        if (!"".equals(column) && column != null) {
            switch (column) {
                case "materielDate":
                    resultIndex = 1;
                    break;
                case "materielCode":
                    resultIndex = 2;
                    break;
                case "materialName":
                    resultIndex = 3;
                    break;
                case "materialFullname":
                    resultIndex = 4;
                    break;
                case "potting":
                    resultIndex = 5;
                    break;
                case "norms":
                    resultIndex = 6;
                    break;
                case "memo":
                    resultIndex = 7;
                    break;
                case "brand":
                    resultIndex = 8;
                    break;
                case "pkSupplier":
                    resultIndex = 9;
                    break;
                case "pkAgent":
                    resultIndex = 10;
                    break;
                case "trafficType":
                    resultIndex = 11;
                    break;
                case "purchaseType":
                    resultIndex = 12;
                    break;
                case "inclutax":
                    resultIndex = 13;
                    break;
                case "usageUnit":
                    resultIndex = 14;
                    break;
                case "countNum":
                    resultIndex = 15;
                    break;
                case "unitPrice":
                    resultIndex = 16;
                    break;
                case "amountMoney":
                    resultIndex = 17;
                    break;
                case "incomeTax":
                    resultIndex = 18;
                    break;
                case "taxUnitPrice":
                    resultIndex = 19;
                    break;
                case "priceTaxTotal":
                    resultIndex = 20;
                    break;
                case "batchNum":
                    resultIndex = 21;
                    break;
                case "expireDate":
                    resultIndex = 22;
                    break;
                case "taxRate":
                    resultIndex = 23;
                    break;
                default:
                    break;
            }
        }

        return resultIndex;
    }
}
