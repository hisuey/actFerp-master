package cn.hups.worktools.utlis;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.StringUtils;
import cn.hups.purchase.po.BdMaterielDataBasePo;
import cn.hups.worktools.po.ResolvMaterielDataBasePo;
import cn.hups.worktools.po.ResolvPurchasePo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工作工具(逻辑工具类)
 */
public class ResolvPurchaseUtils {

    // 转换目标文件
    private File file = null;

    // 转换文件流
    private FileInputStream fileInputStream = null;

    // 文件名称
    private String fileName = "";

    public ResolvPurchaseUtils(File file) {
        super();
        if (file != null) {
            this.file = file;
            try {
                this.fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            this.fileName = file.getName();
        }
    }

    /**
     * 解析Excel中的数据封装为List<ResolvPurchasePo>
     * 采购导入物料清单
     * @return
     * @throws GlobalException
     */
    public Map<String, List<ResolvPurchasePo>> getExcelDataToPo() throws GlobalException {
        Map<String, List<ResolvPurchasePo>> resultMap = new HashMap<>();
        List<ResolvPurchasePo> SMTPoList = new ArrayList<>();
        List<ResolvPurchasePo> DIPPoList = new ArrayList<>();

        Workbook workbook = getWorkbook();
        // 获取第一页Sheet(默认数据存储位置)
        Sheet sheet = workbook.getSheetAt(0);

        int maxSheetRow = sheet.getLastRowNum();
        for (int i = 0;i<maxSheetRow;i++) {
            Row row = sheet.getRow(i);
            Cell itemTypeCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("itemType"));
            String itemTypeValue = initCellValue(itemTypeCell);

            if (ResolvPurchasePo.checkItemType(itemTypeValue)) {
                ResolvPurchasePo resolvPurchasePo = new ResolvPurchasePo();
                // 序号
                Cell rowNumCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("rowNum"));
                Integer rowNumValue = initIntegerCellValue(initCellValue(rowNumCell));
                resolvPurchasePo.setRowNum(rowNumValue);
                // 物料类型 itemType
                resolvPurchasePo.setItemType(itemTypeValue);
                // 型号 model
                Cell modelCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("model"));
                resolvPurchasePo.setModel(initCellValue(modelCell));
                // 物料名称 materialName
                Cell materialNameCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("materialName"));
                resolvPurchasePo.setMaterialName(initCellValue(materialNameCell));
                // 存货全名 materialFullname
                Cell materialFullnameCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("materialFullname"));
                resolvPurchasePo.setMaterialName(initCellValue(materialFullnameCell));
                // 存货型号 potting
                Cell pottingCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("potting"));
                resolvPurchasePo.setPotting(initCellValue(pottingCell));
                // 存货规格 norms
                Cell normsCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("norms"));
                resolvPurchasePo.setNorms(initCellValue(normsCell));
                // 位号 placeNumber
                Cell placeNumberCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("placeNumber"));
                resolvPurchasePo.setPlaceNumber(initCellValue(placeNumberCell));
                // 焊点数 weldingNumber
                Cell weldingNumberCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("weldingNumber"));
                Integer weldingNumberValue = initIntegerCellValue(initCellValue(weldingNumberCell));
                resolvPurchasePo.setWeldingNumber(weldingNumberValue);
                // 备注 memo
                Cell memoCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("memo"));
                resolvPurchasePo.setMemo(initCellValue(memoCell));
                // 品牌 brand
                Cell brandCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("brand"));
                resolvPurchasePo.setBrand(initCellValue(brandCell));
                // 单位 usegUnit
                Cell usegUnitCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("brand"));
                resolvPurchasePo.setBrand(initCellValue(usegUnitCell));
                // 用量 usageNum
                Cell usageCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("usageNum"));
                Integer usageValue = initIntegerCellValue(initCellValue(weldingNumberCell));
                resolvPurchasePo.setUsageNum(usageValue);
                // 总用量 usageTotal
                Cell usageTotalCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("usageTotal"));
                Integer usageTotalValue = initIntegerCellValue(initCellValue(usageTotalCell));
                resolvPurchasePo.setUsageTotal(usageTotalValue);
                // 配料数量 batchingNumber
                Cell batchingNumberCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("batchingNumber"));
                Integer batchingNumberValue = initIntegerCellValue(initCellValue(batchingNumberCell));
                resolvPurchasePo.setBatchingNumber(batchingNumberValue);
                // 领料数量 pickingNumber
                Cell pickingNumberCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("pickingNumber"));
                Integer pickingNumberValue = initIntegerCellValue(initCellValue(pickingNumberCell));
                resolvPurchasePo.setPickingNumber(pickingNumberValue);
                // 退料数量 backingNumber
                Cell backingNumberCell = row.getCell(ResolvPurchasePo.getExcelIndexWithColumn("backingNumber"));
                Integer backingNumberValue = initIntegerCellValue(initCellValue(backingNumberCell));
                resolvPurchasePo.setBackingNumber(backingNumberValue);

                if ("SMT".equals(itemTypeValue.toUpperCase())) {
                    SMTPoList.add(resolvPurchasePo);
                }
                if ("DIP".equals(itemTypeValue.toUpperCase())) {
                    DIPPoList.add(resolvPurchasePo);
                }
            }
        }

        resultMap.put("SMT", SMTPoList);
        resultMap.put("DIP", DIPPoList);
        return resultMap;
    }

    /**
     * 解析物料价格库Excel文件中的数据转换为List集合
     * @return
     * @throws GlobalException
     */
    public List<BdMaterielDataBasePo> getMaterielDataBasePoListByExcel() throws GlobalException {
        List<BdMaterielDataBasePo> resultList = new ArrayList<>();

        Workbook workbook = getWorkbook();
        // 获取第一页Sheet(默认数据存储位置)
        Sheet sheet = workbook.getSheetAt(0);

        int maxSheetRow = sheet.getLastRowNum();
        for (int i = 1;i<maxSheetRow;i++) {
            Row row = sheet.getRow(i);
            if (row != null) {
                BdMaterielDataBasePo bdMaterielDataBasePo = new BdMaterielDataBasePo();
                // 物料日期 materielDate
                Cell materielDateCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("materielDate"));
                String materielDateValue = initCellValue(materielDateCell);
                bdMaterielDataBasePo.setMaterielDate(materielDateValue);
                // 存货编号 materielCode
                Cell materielCodeCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("materielCode"));
                String materielCodeValue = initCellValue(materielCodeCell);
                bdMaterielDataBasePo.setMaterielCode(materielCodeValue);
                // 物料名称 materialName
                Cell materialNameCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("materialName"));
                String materialNameValue = initCellValue(materialNameCell);
                bdMaterielDataBasePo.setMaterialName(materialNameValue);
                // 存货全名 materialFullname
                Cell materialFullnameCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("materialFullname"));
                String materialFullnameValue = initCellValue(materialFullnameCell);
                bdMaterielDataBasePo.setMaterialFullname(materialFullnameValue);
                // 存货型号 potting
                Cell pottingCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("potting"));
                String pottingValue = initCellValue(pottingCell);
                bdMaterielDataBasePo.setPotting(pottingValue);
                // 存货规格 norms
                Cell normsCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("norms"));
                String normsValue = initCellValue(normsCell);
                bdMaterielDataBasePo.setNorms(normsValue);
                // 存货备注 memo
                Cell memoCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("memo"));
                String memoValue = initCellValue(memoCell);
                bdMaterielDataBasePo.setMemo(memoValue);
                // 品牌全名 brand
                Cell brandCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("brand"));
                String brandValue = initCellValue(brandCell);
                bdMaterielDataBasePo.setBrand(brandValue);
                // 单位全名(供应商) pkSupplier
                Cell pkSupplierCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("pkSupplierCell"));
                String pkSupplierCellValue = initCellValue(pkSupplierCell);
                bdMaterielDataBasePo.setPkSupplier(pkSupplierCellValue);
                // 经办人全名 pkAgent
                Cell pkAgentCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("pkAgent"));
                String pkAgentValue = initCellValue(pkAgentCell);
                bdMaterielDataBasePo.setPkAgent(pkAgentValue);
                // 运输方式 trafficType
                Cell trafficTypeCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("trafficType"));
                String trafficTypeValue = initCellValue(trafficTypeCell);
                bdMaterielDataBasePo.setTrafficType(trafficTypeValue);
                // 采购类别 purchaseType
                Cell purchaseTypeCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("purchaseType"));
                String purchaseTypeValue = initCellValue(purchaseTypeCell);
                bdMaterielDataBasePo.setPurchaseType(purchaseTypeValue);
                // 是否含税 inclutax
                Cell inclutaxCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("inclutax"));
                String inclutaxValue = initCellValue(inclutaxCell);
                bdMaterielDataBasePo.setInclutax(inclutaxValue);
                // 单位 usageUnit
                Cell usageUnitCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("usageUnit"));
                String usageUnitValue = initCellValue(usageUnitCell);
                bdMaterielDataBasePo.setUsageUnit(usageUnitValue);
                // 数量 countNum
                Cell countNumCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("countNum"));
                Integer countNumValue = initIntegerCellValue(initCellValue(countNumCell));
                bdMaterielDataBasePo.setCountNum(countNumValue);
                // 单价 unitPrice
                Cell unitPriceCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("unitPrice"));
                Double unitPriceValue = initDoubleCellValue(initCellValue(unitPriceCell));
                bdMaterielDataBasePo.setUnitPrice(unitPriceValue);
                // 金额 amountMoney
                Cell amountMoneyCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("amountMoney"));
                Double amountMoneyValue = initDoubleCellValue(initCellValue(amountMoneyCell));
                bdMaterielDataBasePo.setAmountMoney(amountMoneyValue);
                // 进项税额 incomeTax
                Cell incomeTaxCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("incomeTax"));
                Double incomeTaxValue = initDoubleCellValue(initCellValue(incomeTaxCell));
                bdMaterielDataBasePo.setIncomeTax(incomeTaxValue);
                // 含税单价 taxUnitPrice
                Cell taxUnitPriceCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("taxUnitPrice"));
                Double taxUnitPriceValue = initDoubleCellValue(initCellValue(taxUnitPriceCell));
                bdMaterielDataBasePo.setTaxUnitPrice(taxUnitPriceValue);
                // 价税合计 priceTaxTotal
                Cell priceTaxTotalCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("priceTaxTotal"));
                Double priceTaxTotalValue = initDoubleCellValue(initCellValue(priceTaxTotalCell));
                bdMaterielDataBasePo.setPriceTaxTotal(priceTaxTotalValue);
                // 批号 batchNum
                Cell batchNumCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("batchNum"));
                String batchNumValue = initCellValue(batchNumCell);
                bdMaterielDataBasePo.setBatchNum(batchNumValue);
                // 到期日期 expireDate
                Cell expireDateCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("expireDate"));
                String expireDateValue = initCellValue(expireDateCell);
                bdMaterielDataBasePo.setExpireDate(expireDateValue);
                // 税率 taxRate
                Cell taxRateCell = row.getCell(ResolvMaterielDataBasePo.getExcelIndexWithColumn("taxRate"));
                Double taxRateValue = initDoubleCellValue(initCellValue(taxRateCell));
                bdMaterielDataBasePo.setTaxRate(taxRateValue);

                resultList.add(bdMaterielDataBasePo);
            }
        }

        return resultList;
    }

    /**
     * 根据Cell获取它的值
     * @param cell
     * @return
     */
    private String initCellValue(Cell cell) {
        String value = "";

        if (cell != null) {
            switch (cell.getCellType()) {
                case 1:  // 字符串类型
                    value = cell.getStringCellValue();
                    break;
                case 0:  // 数值类型
                    value = cell.getNumericCellValue() + "";
                    break;
                case 4:  // 布尔类型
                    break;
                case 3:  // 空白类型
                    break;
                case 2:  // 公式类型
                    break;
                default:
                    break;
            }
        }

        return value;
    }

    /**
     * 初始化Integer类型的变量
     * @param value
     * @return
     */
    private Integer initIntegerCellValue(String value) {
        Integer resultValue = 0;

        if (StringUtils.isNotEmpty(value)) {
            try {
                value = value.replaceAll(",", "");
                Double doubleCanVal = Double.parseDouble(value);
                if (doubleCanVal != null) {
                    resultValue = doubleCanVal.intValue();
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return resultValue;
    }

    /**
     * 初始化Double类型的变量
     * @param value
     * @return
     */
    private Double initDoubleCellValue(String value) {
        Double resultValue = 0.00;

        if (StringUtils.isNotEmpty(value)) {
            try {
                value = value.replaceAll(",", "");
                resultValue = Double.parseDouble(value);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return resultValue;
    }

    /**
     * 获取workBook
     * @return
     */
    private Workbook getWorkbook() throws GlobalException {
        if (checkParamsValite()) {
            try {
                if (this.fileName.endsWith(".xlsx")) {
                    return new XSSFWorkbook(this.fileInputStream);
                } else if (this.fileName.endsWith(".xls")) {
                    return new HSSFWorkbook(this.fileInputStream);
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new GlobalException("文件格式异常！");
            }
        }
        throw new GlobalException("获取WorkBook失败！");
    }

    /**
     * 检查工具类中的基本参数
     * @return
     */
    private boolean checkParamsValite() {
        if (StringUtils.isNotEmpty(this.fileName)
                && this.file != null
                && this.fileInputStream != null) {
            return true;
        }
        return false;
    }
}
