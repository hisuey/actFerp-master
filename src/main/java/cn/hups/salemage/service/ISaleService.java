package cn.hups.salemage.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.flowproccess.po.QuoteFlowParam;
import cn.hups.flowproccess.po.TechnicsFlowParam;
import cn.hups.orderCustomer.po.BillProductOrderHPo;
import cn.hups.salemage.po.BdProductPo;
import cn.hups.salemage.po.BillSaleQuotePo;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * 销售管理服务类
 */
public interface ISaleService {

    /**
     * 分页查询所有产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllProductAsPage(BdProductPo bdProductPo) throws GlobalException;

    /**
     * 根据销售负责人查询所有订单信息作为参照
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllSaleOrderByPkPsndocAsRef(BillProductOrderHPo billProductOrderHPo) throws GlobalException;

    /**
     * 通过订单主键查询订单产品信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllSaleOrderProductAsPage(BillProductOrderHPo billProductOrderHPo) throws GlobalException;

    /**
     * 订单平台中用户查询所有产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectOrderAllProductAsPage(BdProductPo bdProductPo) throws GlobalException;

    /**
     * 下单平台客户申请工艺审核
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    AjaxJson applyProductToTechnics(BdProductPo bdProductPo) throws GlobalException;

    /**
     * 新增产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertProduct(BdProductPo bdProductPo) throws GlobalException;

    /**
     * 根据主键集合删除产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteProductByPks(BdProductPo bdProductPo) throws GlobalException;

    /**
     * 更新产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateProduct(BdProductPo bdProductPo) throws GlobalException;

    /**
     * 更新销售报价任务主键
     * @param userid
     * @param pkProduct
     * @param taskId
     * @return
     * @throws GlobalException
     */
    AjaxJson claimSqleQuote(Integer userid, Integer pkProduct, String taskId) throws GlobalException;

    /**
     * 工艺审核流程-销售送审到工艺部
     * @return
     * @throws GlobalException
     */
    AjaxJson commitTechnics(TechnicsFlowParam technicsFlowParam) throws GlobalException;

    /**
     * 送审产品到采购报价及生产报价-开始报价
     * @param quoteFlowParam
     * @return
     * @throws GlobalException
     */
    AjaxJson commitStartProductQuote(QuoteFlowParam quoteFlowParam) throws GlobalException;

    /**
     * 保存产品中的3个文件到数据库
     * @param file1 BOM文件
     * @param file2 PCB文件
     * @param file3 工艺文件
     * @param productCode 产品编码
     * @return
     * @throws GlobalException
     */
    AjaxJson saveProductFile(MultipartFile file1, MultipartFile file2, MultipartFile file3, String productCode) throws GlobalException;

    /**
     * 分页查询所有销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllSaleQuoteAsPage(BillSaleQuotePo billSaleQuotePo) throws GlobalException;

    /**
     * 增加销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertSaleQuote(BillSaleQuotePo billSaleQuotePo) throws GlobalException;

    /**
     * 根据主键集合删除销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteSaleQuoteByPks(BillSaleQuotePo billSaleQuotePo) throws GlobalException;

    /**
     * 更新销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateSaleQuote(BillSaleQuotePo billSaleQuotePo) throws GlobalException;

    /**
     * 完成销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    AjaxJson overPassSaleQuote(BillSaleQuotePo billSaleQuotePo) throws GlobalException;

    /**
     * 重新开始报价流程
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    AjaxJson requoteProcess(BillSaleQuotePo billSaleQuotePo, Map<String, String> taskTempMap) throws GlobalException;

    /**
     * 更新销售保留流程任务完成人主键
     * @param taskId
     * @return
     * @throws GlobalException
     */
    int updateSaleFlowAssIgnee(String taskId, String assignee) throws GlobalException;

    /**
     * 保存销售物料报价文件
     * @param matterfile
     * @return
     * @throws GlobalException
     */
    AjaxJson saveMatterFile(MultipartFile matterfile, String productCode) throws GlobalException;
}
