package cn.hups.produce.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.produce.po.BillProduceQuoteBPo;
import cn.hups.produce.po.BillProduceQuoteHPo;
import cn.hups.produce.service.IProduceService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 生产管理Controller
 */
@RestController
@RequestMapping("/produce")
public class ProduceController {

    @Resource
    private IProduceService iProduceService;

    /**
     * 分页查询所有生产报价
     * @param billProduceQuoteHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllProduceQuoteAsPage")
    public AjaxJson selectAllProduceQuoteAsPage(@RequestBody BillProduceQuoteHPo billProduceQuoteHPo) throws GlobalException {
        return iProduceService.selectAllProduceQuoteAsPage(billProduceQuoteHPo);
    }

    /**
     * 增加生产报价
     * @param billProduceQuoteHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertProduceQuote")
    public AjaxJson insertProduceQuote(@RequestBody BillProduceQuoteHPo billProduceQuoteHPo) throws GlobalException {
        return iProduceService.insertProduceQuote(billProduceQuoteHPo);
    }

    /**
     * 根据主键集合删除生产报价
     * @param billProduceQuoteHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteProduceQuoteByPks")
    public AjaxJson deleteProduceQuoteByPks(@RequestBody BillProduceQuoteHPo billProduceQuoteHPo) throws GlobalException {
        return iProduceService.deleteProduceQuoteByPks(billProduceQuoteHPo);
    }

    /**
     * 更新生产报价
     * @param billProduceQuoteHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateProduceQuote")
    public AjaxJson updateProduceQuote(@RequestBody BillProduceQuoteHPo billProduceQuoteHPo) throws GlobalException {
        return iProduceService.updateProduceQuote(billProduceQuoteHPo);
    }

    /**
     * 批量更新报价子表信息
     * @param billProduceQuoteBPoList
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateBatchProduceQuoteB")
    public AjaxJson updateBatchProduceQuoteB(@RequestBody List<BillProduceQuoteBPo> billProduceQuoteBPoList) throws GlobalException {
        return iProduceService.updateBatchProduceQuoteB(billProduceQuoteBPoList);
    }
}
