package cn.hups.orgs.po;

import cn.hups.orgs.entity.BdPsndoc;

/**
 * 人员信息拓展PO
 */
public class BdPsndocPo extends BdPsndoc {

    // 所属公司显示名称
    private String pkCorpShow;

    // 所属部门显示名称
    private String pkDeptdocShow;

    // 人员类别显示名称
    private String pkPsntypeName;

    public String getPkCorpShow() {
        return pkCorpShow;
    }

    public void setPkCorpShow(String pkCorpShow) {
        this.pkCorpShow = pkCorpShow;
    }

    public String getPkDeptdocShow() {
        return pkDeptdocShow;
    }

    public void setPkDeptdocShow(String pkDeptdocShow) {
        this.pkDeptdocShow = pkDeptdocShow;
    }

    public String getPkPsntypeName() {
        return pkPsntypeName;
    }

    public void setPkPsntypeName(String pkPsntypeName) {
        this.pkPsntypeName = pkPsntypeName;
    }
}
