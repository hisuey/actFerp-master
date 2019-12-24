package cn.hups.refdoc.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.refdoc.po.BdPsntypePo;
import cn.hups.refdoc.po.BdTradePo;
import cn.hups.refdoc.service.IRefDocService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 档案管理Controller
 */
@RestController
@RequestMapping("/refdoc")
public class RefDocController {

    @Resource
    private IRefDocService iRefDocService;

    /**
     * 分页查询所属行业
     * @param bdTradePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllTradeAsPage")
    public AjaxJson selectAllTradeAsPage(@RequestBody BdTradePo bdTradePo) throws GlobalException {
        return iRefDocService.selectAllTradeAsPage(bdTradePo);
    }

    /**
     * 查询所有所属行业作为参照
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllTradeAsRef")
    public AjaxJson selectAllTradeAsRef() throws GlobalException {
        return iRefDocService.selectAllTradeAsRef();
    }

    /**
     * 插入所属行业
     * @param bdTradePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertTrade")
    public AjaxJson insertTrade(@RequestBody BdTradePo bdTradePo) throws GlobalException {
        return iRefDocService.insertTrade(bdTradePo);
    }

    /**
     * 根据主键集合删除所属行业
     * @param bdTradePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteTradeByPks")
    public AjaxJson deleteTradeByPks(@RequestBody BdTradePo bdTradePo) throws GlobalException {
        return iRefDocService.deleteTradeByPks(bdTradePo);
    }

    /**
     * 更新所属行业
     * @param bdTradePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateTrade")
    public AjaxJson updateTrade(@RequestBody BdTradePo bdTradePo) throws GlobalException {
        return iRefDocService.updateTrade(bdTradePo);
    }

    /**
     * 分页查询人员类别
     * @param bdPsntypePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllPsntypeAsPage")
    public AjaxJson selectAllPsntypeAsPage(@RequestBody BdPsntypePo bdPsntypePo) throws GlobalException {
        return iRefDocService.selectAllPsntypeAsPage(bdPsntypePo);
    }

    /**
     * 查询所有人员类别作为参照
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllPsntypeAsRef")
    public AjaxJson selectAllPsntypeAsRef() throws GlobalException {
        return iRefDocService.selectAllPsntypeAsRef();
    }

    /**
     * 插入人员类别
     * @param bdPsntypePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertPsntype")
    public AjaxJson insertPsntype(@RequestBody BdPsntypePo bdPsntypePo) throws GlobalException {
        return iRefDocService.insertPsntype(bdPsntypePo);
    }

    /**
     * 根据主键集合删除人员类别
     * @param bdPsntypePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deletePsntypeByPks")
    public AjaxJson deletePsntypeByPks(@RequestBody BdPsntypePo bdPsntypePo) throws GlobalException {
        return iRefDocService.deletePsntypeByPks(bdPsntypePo);
    }

    /**
     * 更新人员类别
     * @param bdPsntypePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updatePsntype")
    public AjaxJson updatePsntype(@RequestBody BdPsntypePo bdPsntypePo) throws GlobalException {
        return iRefDocService.updatePsntype(bdPsntypePo);
    }

}
