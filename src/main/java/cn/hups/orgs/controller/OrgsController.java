package cn.hups.orgs.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.orgs.po.BdCorpPo;
import cn.hups.orgs.po.BdDeptdocPo;
import cn.hups.orgs.po.BdPsndocPo;
import cn.hups.orgs.service.IOrgsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 组织架构Controller
 */
@RestController
@RequestMapping("/bdcorp")
public class OrgsController {

    @Resource
    private IOrgsService iOrgsService;

    /**
     * 分页查询公司基本档案
     * @param bdCorpPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllBdCorpAsPage")
    public AjaxJson selectAllBdCorpAsPage(@RequestBody BdCorpPo bdCorpPo) throws GlobalException {
        return iOrgsService.selectAllBdCorpAsPage(bdCorpPo);
    }

    /**
     * 查询所有公司作为参照
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllBdCorpAsRef")
    public AjaxJson selectAllBdCorpAsRef() throws GlobalException {
        return iOrgsService.selectAllBdCorpAsRef();
    }

    /**
     * 插入公司基本档案
     * @param bdCorpPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertBdCorp")
    public AjaxJson insertBdCorp(@RequestBody BdCorpPo bdCorpPo) throws GlobalException {
        return iOrgsService.insertBdCorp(bdCorpPo);
    }

    /**
     * 根据主键集合删除公司档案
     * @param bdCorpPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteBdCorpByPks")
    public AjaxJson deleteBdCorpByPks(@RequestBody BdCorpPo bdCorpPo) throws GlobalException {
        return iOrgsService.deleteBdCorpByPks(bdCorpPo);
    }

    /**
     * 根据主键更新公司档案
     * @param bdCorpPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateBdCorp")
    public AjaxJson updateBdCorp(@RequestBody BdCorpPo bdCorpPo) throws GlobalException {
        return iOrgsService.updateBdCorp(bdCorpPo);
    }

    /**
     * 分页查询部门基本档案
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllBdDeptdocAsPage")
    public AjaxJson selectAllBdDeptdocAsPage(@RequestBody BdDeptdocPo bdDeptdocPo) throws GlobalException {
        return iOrgsService.selectAllBdDeptdocAsPage(bdDeptdocPo);
    }

    /**
     * 根据公司查询所有部门作为参照
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllBdDeptdocAsRef")
    public AjaxJson selectAllBdDeptdocAsRef(@RequestBody BdDeptdocPo bdDeptdocPo) throws GlobalException {
        return iOrgsService.selectAllBdDeptdocAsRef(bdDeptdocPo);
    }

    /**
     * 查询部门级联人员数据结构进行返回
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectDeptCascadePsndoc")
    public AjaxJson selectDeptCascadePsndoc(@RequestBody BdDeptdocPo bdDeptdocPo) throws GlobalException {
        return iOrgsService.selectDeptCascadePsndoc(bdDeptdocPo);
    }

    /**
     * 插入部门基本档案
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertBdDeptdoc")
    public AjaxJson insertBdDeptdoc(@RequestBody BdDeptdocPo bdDeptdocPo) throws GlobalException {
        return iOrgsService.insertBdDeptdoc(bdDeptdocPo);
    }

    /**
     * 根据主键集合删除部门档案
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteBdDeptdocByPks")
    public AjaxJson deleteBdDeptdocByPks(@RequestBody BdDeptdocPo bdDeptdocPo) throws GlobalException {
        return iOrgsService.deleteBdDeptdocByPks(bdDeptdocPo);
    }

    /**
     * 根据主键更新部门档案
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateBdDeptdoc")
    public AjaxJson updateBdDeptdoc(@RequestBody BdDeptdocPo bdDeptdocPo) throws GlobalException {
        return iOrgsService.updateBdDeptdoc(bdDeptdocPo);
    }

    /**
     * 分页查询人员信息基本档案
     * @param bdPsndocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllBdPsndocAsPage")
    public AjaxJson selectAllBdPsndocAsPage(@RequestBody BdPsndocPo bdPsndocPo) throws GlobalException {
        return iOrgsService.selectAllBdPsndocAsPage(bdPsndocPo);
    }

    /**
     * 查询所有人员信息档案作为参照
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllBdPsndocAsRef")
    public AjaxJson selectAllBdPsndocAsRef(@RequestBody(required=false) BdPsndocPo bdPsndocPo) throws GlobalException {
        return iOrgsService.selectAllBdPsndocAsRef(bdPsndocPo);
    }

    /**
     * 插入人员基本档案
     * @param bdPsndocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertBdPsndoc")
    public AjaxJson insertBdPsndoc(@RequestBody BdPsndocPo bdPsndocPo) throws GlobalException {
        return iOrgsService.insertBdPsndoc(bdPsndocPo);
    }

    /**
     * 根据主键集合删除人员信息
     * @param bdPsndocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteBdPsndocByPks")
    public AjaxJson deleteBdPsndocByPks(@RequestBody BdPsndocPo bdPsndocPo) throws GlobalException {
        return iOrgsService.deleteBdPsndocByPks(bdPsndocPo);
    }

    /**
     * 根据主键更新人员信息
     * @param bdPsndocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateBdPsndoc")
    public AjaxJson updateBdPsndoc(@RequestBody BdPsndocPo bdPsndocPo) throws GlobalException {
        return iOrgsService.updateBdPsndoc(bdPsndocPo);
    }
}
