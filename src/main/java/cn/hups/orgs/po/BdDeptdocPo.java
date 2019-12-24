package cn.hups.orgs.po;

import cn.hups.orgs.entity.BdDeptdoc;

/**
 * 部门基本档案拓展类
 */
public class BdDeptdocPo extends BdDeptdoc {

    // 所属公司显示名称
    private String pkCorpShow;

    // 人员信息主键
    private Integer pkPsndoc;

    // 人员信息名称
    private String psnname;

    // 人员信息对应Erp主键
    private String psndocErpid;

    public String getPkCorpShow() {
        return pkCorpShow;
    }

    public void setPkCorpShow(String pkCorpShow) {
        this.pkCorpShow = pkCorpShow;
    }

    @Override
    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    @Override
    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    public String getPsnname() {
        return psnname;
    }

    public void setPsnname(String psnname) {
        this.psnname = psnname;
    }

    public String getPsndocErpid() {
        return psndocErpid;
    }

    public void setPsndocErpid(String psndocErpid) {
        this.psndocErpid = psndocErpid;
    }
}
