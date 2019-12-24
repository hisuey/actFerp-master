package cn.hups.salemage.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.DowuLoadFileNamePo;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.StringUtils;
import cn.hups.orderCustomer.po.BillProductOrderHPo;
import cn.hups.salemage.po.BdProductPo;
import cn.hups.salemage.po.BillSaleQuotePo;
import cn.hups.salemage.service.ISaleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * 销售管理Controller
 */
@RestController
@RequestMapping("/sale")
public class SaleController {

    @Resource
    private ISaleService iSaleService;

    /**
     * 分页查询所有产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllProductAsPage")
    public AjaxJson selectAllProductAsPage(@RequestBody BdProductPo bdProductPo) throws GlobalException {
        return iSaleService.selectAllProductAsPage(bdProductPo);
    }

    /**
     * 根据销售负责人查询所有订单信息作为参照
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllSaleOrderByPkPsndocAsRef")
    public AjaxJson selectAllSaleOrderByPkPsndocAsRef(@RequestBody BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        return iSaleService.selectAllSaleOrderByPkPsndocAsRef(billProductOrderHPo);
    }

    /**
     * 通过订单主键查询订单产品信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllSaleOrderProductAsPage")
    public AjaxJson selectAllSaleOrderProductAsPage(@RequestBody BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        return iSaleService.selectAllSaleOrderProductAsPage(billProductOrderHPo);
    }

    /**
     * 新增产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertProduct")
    public AjaxJson insertProduct(@RequestBody BdProductPo bdProductPo) throws GlobalException {
        return iSaleService.insertProduct(bdProductPo);
    }

    /**
     * 根据主键集合删除产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteProductByPks")
    public AjaxJson deleteProductByPks(@RequestBody BdProductPo bdProductPo) throws GlobalException {
        return iSaleService.deleteProductByPks(bdProductPo);
    }

    /**
     * 更新产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateProduct")
    public AjaxJson updateProduct(@RequestBody BdProductPo bdProductPo) throws GlobalException {
        return iSaleService.updateProduct(bdProductPo);
    }

    /**
     * 保存产品中的3个文件到数据库
     * @param bomfile BOM文件
     * @param pcbfile PCB文件
     * @param gongyifile 工艺文件
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/saveProductFile")
    public AjaxJson saveProductFile(@RequestParam(required = false, value = "bomfile") MultipartFile bomfile,
                                    @RequestParam(required = false, value = "pcbfile") MultipartFile pcbfile,
                                    @RequestParam(required = false, value = "gongyifile") MultipartFile gongyifile,
                                    @RequestParam(required = true, value = "productCode") String productCode) throws GlobalException {
        return iSaleService.saveProductFile(bomfile, pcbfile, gongyifile, productCode);
    }

    /**
     * 根据全路径名称下载服务器文件
     * @throws GlobalException
     */
    @RequestMapping("/downloadProductFile")
    public void downloadProductFile(@RequestBody DowuLoadFileNamePo dowuLoadFileNamePo,
                                    HttpServletRequest request,
                                    HttpServletResponse response) throws GlobalException {
        try {
            if (dowuLoadFileNamePo != null &&
                    StringUtils.isNotEmpty(dowuLoadFileNamePo.getFileFullName()) &&
                    StringUtils.isNotEmpty(dowuLoadFileNamePo.getFileName())) {
                String fileFullName = dowuLoadFileNamePo.getFileFullName();

                // 下载文件
                request.setCharacterEncoding("UTF-8");
                response.setContentType("application/octet-stream;");
                response.setHeader("Content-Disposition", "attachment;");

                InputStream bis = new FileInputStream(fileFullName);
                OutputStream bos = response.getOutputStream();
                byte[] buff = new byte[1024];
                int len = 0;
                while ((len = bis.read(buff)) > 0) {
                    bos.write(buff, 0, len);
                }
                bis.close();
                bos.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 分页查询所有销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllSaleQuoteAsPage")
    public AjaxJson selectAllSaleQuoteAsPage(@RequestBody BillSaleQuotePo billSaleQuotePo) throws GlobalException {
        return iSaleService.selectAllSaleQuoteAsPage(billSaleQuotePo);
    }

    /**
     * 增加销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertSaleQuote")
    public AjaxJson insertSaleQuote(@RequestBody BillSaleQuotePo billSaleQuotePo) throws GlobalException {
        return iSaleService.insertSaleQuote(billSaleQuotePo);
    }

    /**
     * 根据主键集合删除销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteSaleQuoteByPks")
    public AjaxJson deleteSaleQuoteByPks(@RequestBody BillSaleQuotePo billSaleQuotePo) throws GlobalException {
        return iSaleService.deleteSaleQuoteByPks(billSaleQuotePo);
    }

    /**
     * 更新销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateSaleQuote")
    public AjaxJson updateSaleQuote(@RequestBody BillSaleQuotePo billSaleQuotePo) throws GlobalException {
        return iSaleService.updateSaleQuote(billSaleQuotePo);
    }

    /**
     * 保存销售物料报价文件
     * @param matterfile
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/saveMatterFile")
    public AjaxJson saveMatterFile(@RequestParam(required = false, value = "matterfile") MultipartFile matterfile,
                                   @RequestParam("productCode") String productCode) throws GlobalException {
        return iSaleService.saveMatterFile(matterfile, productCode);
    }
}
