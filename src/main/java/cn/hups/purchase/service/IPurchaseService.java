package cn.hups.purchase.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.purchase.entity.BillPurchaseQuote;
import cn.hups.purchase.po.BdMaterielDataBasePo;
import cn.hups.purchase.po.BillPurchaseQuotePo;
import cn.hups.salemage.po.BdProductPo;
import cn.hups.worktools.po.SaveMaterielParamListPo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 采购管理Service
 */
public interface IPurchaseService {

    /**
     * 分页查询所有采购报价
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectPurchaseQuoteAsPage(BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException;

    /**
     * 根据自定义条件查询数据集合
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    List<BillPurchaseQuote> selectPurchaseQuoteByExample(BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException;

    /**
     * 查询采购报价中的产品信息作为参照进行返回，单独给工作工具进行使用
     * @return
     * @throws GlobalException
     */
    List<BillPurchaseQuotePo> selectPurchaseQuoteToWorkToolRef(BdProductPo bdProductPo) throws GlobalException;

    /**
     * 新增采购保价
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertPurchaseQuote(BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException;

    /**
     * 根据主键集合删除采购保价
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    AjaxJson deletePurchaseQuoteByPks(BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException;

    /**
     * 更新采购报价
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    AjaxJson updatePurchaseQuote(BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException;

    /**
     * 保存采购报价文件
     * @param purfile
     * @return
     * @throws GlobalException
     */
    AjaxJson savePurchaseFile(MultipartFile purfile, String productCode) throws GlobalException;

    /**
     * 认领采购报价任务
     * @param userid
     * @param pkProduct
     * @param taskId
     * @return
     * @throws GlobalException
     */
    AjaxJson claimPurchaseQuote(Integer userid, Integer pkProduct, String taskId, Integer billState) throws GlobalException;

    /**
     * 完成采购报价
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    AjaxJson overPassPurchaseQuote(BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException;

    /**
     * 根据产品主键查询该产品的物料信息(BOM)
     * @param pkProduct
     * @return
     * @throws GlobalException
     */
    AjaxJson selectPurchaseMaterielByPkProduct(Integer pkProduct) throws GlobalException;

    /**
     * 保存采购报价物料信息
     * @param saveMaterielParamListPo
     * @return
     * @throws GlobalException
     */
    AjaxJson savePurchaseMaterielPo(SaveMaterielParamListPo saveMaterielParamListPo) throws GlobalException;

    /**
     * 导入物料数据库Excel文件进行解析文件数据并存储
     * @param mfile
     * @return
     * @throws GlobalException
     */
    AjaxJson resolvMaterielDataBaseExcelData(MultipartFile mfile) throws GlobalException;

    /**
     * 通过分页的方式查询物料数据库中的数据
     * @param bdMaterielDataBasePo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllBdMaterielDataBaseAsPage(BdMaterielDataBasePo bdMaterielDataBasePo) throws GlobalException;

    /**
     * 新增插入物料信息数据库数据
     * @param bdMaterielDataBasePo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertMaterielDataBase(BdMaterielDataBasePo bdMaterielDataBasePo) throws GlobalException;

    /**
     * 根据主键集合删除物料数据库中的数据
     * @param bdMaterielDataBasePo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteBdMaterielDataBaseByPks(BdMaterielDataBasePo bdMaterielDataBasePo) throws GlobalException;

    /**
     * 更新物料数据库信息
     * @param bdMaterielDataBasePo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateMaterielDataBase(BdMaterielDataBasePo bdMaterielDataBasePo) throws GlobalException;
}
