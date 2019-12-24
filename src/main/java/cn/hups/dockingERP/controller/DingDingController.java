package cn.hups.dockingERP.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.RanDomUtils;
import cn.hups.dockingERP.dingding.DingDingUtils;
import cn.hups.dockingERP.po.DingDingDeptPo;
import cn.hups.dockingERP.po.DingDingPsndocPo;
import cn.hups.dockingERP.po.SendMsgParam;
import cn.hups.orgs.entity.BdCorp;
import cn.hups.orgs.po.BdDeptdocPo;
import cn.hups.orgs.po.BdPsndocPo;
import cn.hups.orgs.service.IOrgsService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 对接钉钉组织架构Controller
 */
@RestController
@RequestMapping("/dingerp")
public class DingDingController {

    @Resource
    private IOrgsService iOrgsService;

    /**
     * 拉取钉钉中所有的部门信息
     * @param bdCorp 同步目标公司
     * @return
     */
    @RequestMapping("/pullAllDeptByDingDing")
    public AjaxJson pullAllDeptByDingDing(@RequestBody BdCorp bdCorp) {
        AjaxJson ajaxJson = new AjaxJson();

        List<DingDingDeptPo> deptPoList = DingDingUtils.getAllDeptInDingDing();
        if (deptPoList != null && deptPoList.size() > 0) {
            for (DingDingDeptPo dingDingDeptPo : deptPoList) {
                if (dingDingDeptPo != null && dingDingDeptPo.getId() != 1) { // 根部门不同步
                    // 初始本系统的部门实体并同步插入操作
                    BdDeptdocPo bdDeptdocPo = new BdDeptdocPo();
                    bdDeptdocPo.setDeptname(dingDingDeptPo.getName()); // 部门名称
                    bdDeptdocPo.setDeptcode("DEPT" + RanDomUtils.generateDigitalString(4)); // 部门编码
                    bdDeptdocPo.setPkCorp(bdCorp.getPkCorp()); // 所属公司主键
                    bdDeptdocPo.setCanceled("0"); // 是否封存公司
                    bdDeptdocPo.setCreationtime(DateUtils.getKnowTsStr()); // 创建时间
                    bdDeptdocPo.setTs(DateUtils.getKnowTsStr()); // 时间戳
                    bdDeptdocPo.setErpid(dingDingDeptPo.getId()); // 对应ERP数据主键
                    bdDeptdocPo.setErptype(DingDingUtils.DINGDING_ERPTYPE); // 对应ERP类型
                    iOrgsService.insertBdDeptdoc(bdDeptdocPo);
                }
            }
        }

        return ajaxJson;
    }

    /**
     * 拉取钉钉中所有的人员信息
     * @param bdCorp 同步目标公司
     * @return
     */
    @RequestMapping("/pullAllPsndocByDingDing")
    public AjaxJson pullAllPsndocByDingDing(@RequestBody BdCorp bdCorp) {
        AjaxJson ajaxJson = new AjaxJson();

        if (bdCorp.getPkCorp() != null) {
            // 需要同步人员的部门列表
            List<BdDeptdocPo> allDingDingDept = iOrgsService.selectAllDingDingDeptdoc(bdCorp.getPkCorp());
            // 调用钉钉接口拉去人员信息
            List<DingDingPsndocPo> psndocPoList = DingDingUtils.getAllPsndocInDingDing(allDingDingDept);
            if (psndocPoList != null && psndocPoList.size() > 0) {
                for (DingDingPsndocPo dingDingPsndocPo : psndocPoList) {
                    if (dingDingPsndocPo != null) {
                        BdPsndocPo bdPsndocPo = new BdPsndocPo();
                        bdPsndocPo.setPsnname(dingDingPsndocPo.getName()); // 人员姓名
                        bdPsndocPo.setPsncode("PSN" + RanDomUtils.generateDigitalString(4)); // 人员编码
                        bdPsndocPo.setPkCorp(bdCorp.getPkCorp()); // 所属公司
                        bdPsndocPo.setPkDeptdoc(DingDingUtils.getPkDeptdocByDingDingErp(allDingDingDept, dingDingPsndocPo.getDepartment())); // 所属部门
                        bdPsndocPo.setPkPsntype(null); // 人员类别
                        bdPsndocPo.setSealdate("0"); // 是否封存
                        bdPsndocPo.setDirectleader(null); // 直属领导
                        bdPsndocPo.setCreationtime(DateUtils.getKnowTsStr()); // 创建时间
                        bdPsndocPo.setTs(DateUtils.getKnowTsStr()); // 时间戳
                        bdPsndocPo.setErpid(dingDingPsndocPo.getUserid()); // 对应ERP数据主键
                        bdPsndocPo.setErptype(DingDingUtils.DINGDING_ERPTYPE); // 对应ERP类型
                        iOrgsService.insertBdPsndoc(bdPsndocPo);
                    }
                }
            }
        }

        return ajaxJson;
    }

    /**
     * 通过选择的钉钉推送人推送消息到钉钉中
     * @param sendMsgParam
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/sendDingMsgByPsndoc")
    public AjaxJson sendDingMsgByPsndoc(@RequestBody SendMsgParam sendMsgParam) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        JSONObject jsonObject = DingDingUtils.sengDingDingMsg(sendMsgParam);
        if (jsonObject != null) {
            String errorCode = jsonObject.get("errcode") == null ? "" : jsonObject.get("errcode").toString();
            if (!"0".equals(errorCode)) {
                ajaxJson.setErrorMessage("推送失败！");
            }
        } else {
            ajaxJson.setErrorMessage("推送失败！");
        }

        return ajaxJson;
    }
}
