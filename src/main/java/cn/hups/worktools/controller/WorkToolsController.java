package cn.hups.worktools.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.FileUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.purchase.po.BillPurchaseQuotePo;
import cn.hups.purchase.service.IPurchaseService;
import cn.hups.salemage.po.BdProductPo;
import cn.hups.worktools.po.ResolvPurchasePo;
import cn.hups.worktools.po.SaveMaterielParamListPo;
import cn.hups.worktools.utlis.ResolvPurchaseUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * 工作工具Controller
 */

@RestController
@RequestMapping("/workToolsController")
public class WorkToolsController {

    @Resource
    private IPurchaseService iPurchaseService;

    /**
     * 解析采购报价物料文件(BOM)文件
     * @param mfile
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/resolvPurchaseItemFile")
    public AjaxJson resolvPurchaseItemFile(@RequestParam("file") MultipartFile mfile) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        FileUtils fileUtils = new FileUtils();
        File file = fileUtils.multipartToFile(mfile);
        try {
            if (file != null) {
                ResolvPurchaseUtils workToolsUtils = new ResolvPurchaseUtils(file);
                Map<String, List<ResolvPurchasePo>> resolvPurchasePoMap = workToolsUtils.getExcelDataToPo();
                ajaxJson.setObj(resolvPurchasePoMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(e.getMessage());
        } finally {
            if (file != null) {
                file.delete();
            }
        }

        return ajaxJson;
    }

    /**
     * 保存采购报价中物料报价信息(BOM文件解析后)的图片信息
     * @param purfile
     * @param productCode
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/savePurchaseImageFile")
    public AjaxJson savePurchaseImageFile(@RequestParam(value = "file") MultipartFile purfile,
                                          @RequestParam("productCode") String productCode) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        if (purfile != null && StringUtils.isNotEmpty(productCode)) {
            String fileName = purfile.getOriginalFilename();
            if (StringUtils.isNotEmpty(fileName) &&
                    (fileName.endsWith(".jpg") || fileName.endsWith(".png") || fileName.endsWith(".jpeg"))) {
                FileUtils fileUtils = new FileUtils();
                Map<String, Object> resultMap = fileUtils.saveMaterielImageFile(purfile, productCode);
                ajaxJson.setObj(resultMap);
            } else {
                throw new GlobalException("文件格式错误");
            }

        } else {
            throw new GlobalException("参数不正确");
        }

        return ajaxJson;
    }

    /**
     * 查询采购报价中的产品信息集合
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectPurchaseQuoteToWorkToolRef")
    public AjaxJson selectPurchaseQuoteToWorkToolRef(@RequestBody BdProductPo bdProductPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        List<BillPurchaseQuotePo> resultList = iPurchaseService.selectPurchaseQuoteToWorkToolRef(bdProductPo);
        ajaxJson.setObj(resultList);

        return ajaxJson;
    }

    /**
     * 根据产品主键查询该产品的物料信息(BOM)
     * @param pkProduct
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectPurchaseMaterielByPkProduct")
    public AjaxJson selectPurchaseMaterielByPkProduct(@RequestParam("pkProduct") Integer pkProduct) throws GlobalException {
        return iPurchaseService.selectPurchaseMaterielByPkProduct(pkProduct);
    }

    /**
     * 保存采购报价物料信息
     * @param saveMaterielParamListPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/savePurchaseMaterielPo")
    public AjaxJson savePurchaseMaterielPo(@RequestBody SaveMaterielParamListPo saveMaterielParamListPo) throws GlobalException {
        return iPurchaseService.savePurchaseMaterielPo(saveMaterielParamListPo);
    }
}
