package cn.hups.salemage.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;
import java.math.BigDecimal;

public class BdProduct extends PagePoJo implements Serializable {
    private Integer pkProduct;

    private String name;

    private String code;

    private String model;

    private Integer pkPsndoc;

    private Integer purchaseContacts;

    private Integer skillContacts;

    private Integer smt;

    private Integer dip;

    private String isinstal;

    private Integer instalMin;

    private String istest;

    private Integer testMin;

    private String isaging;

    private Integer agingMin;

    private String exeStandard;

    private String steelMeshSource;

    private String defense;

    private BigDecimal defenseArea;

    private String sealTechnics;

    private String materialSource;

    private String ispcb;

    private String pcbSource;

    private Double pcbLong;

    private Double pcbWide;

    private Integer pcbThick;

    private String pcbResistColor;

    private String pcbCharColor;

    private String pcbResistCover;

    private String pcbPadSpary;

    private String pcbCopperThick;

    private Integer pkCustomer;

    private Integer orderNumber;

    private String bomFilename;

    private String bomFilefullname;

    private String pcbFilename;

    private String pcbFilefullname;

    private String craftFilename;

    private String craftFilefullname;

    private String ismakeTool;

    private String makeSteelMesh;

    private String makeDip;

    private String makeTest;

    private String makeDefense;

    private String makeAging;

    private String taskId;

    private String processInstanceId;

    private Integer approver;

    private String approvetime;

    private Integer billState;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiedtime;

    private Integer dr;

    private String ts;

    private String specialTechnics;

    private Integer technicsState;

    private Integer orderCount;

    private static final long serialVersionUID = 1L;

    public BdProduct(Integer pkProduct, String name, String code, String model, Integer pkPsndoc, Integer purchaseContacts, Integer skillContacts, Integer smt, Integer dip, String isinstal, Integer instalMin, String istest, Integer testMin, String isaging, Integer agingMin, String exeStandard, String steelMeshSource, String defense, BigDecimal defenseArea, String sealTechnics, String materialSource, String ispcb, String pcbSource, Double pcbLong, Double pcbWide, Integer pcbThick, String pcbResistColor, String pcbCharColor, String pcbResistCover, String pcbPadSpary, String pcbCopperThick, Integer pkCustomer, Integer orderNumber, String bomFilename, String bomFilefullname, String pcbFilename, String pcbFilefullname, String craftFilename, String craftFilefullname, String ismakeTool, String makeSteelMesh, String makeDip, String makeTest, String makeDefense, String makeAging, String taskId, String processInstanceId, Integer approver, String approvetime, Integer billState, Integer creator, String creationtime, Integer modifier, String modifiedtime, Integer dr, String ts, String specialTechnics, Integer technicsState, Integer orderCount) {
        this.pkProduct = pkProduct;
        this.name = name;
        this.code = code;
        this.model = model;
        this.pkPsndoc = pkPsndoc;
        this.purchaseContacts = purchaseContacts;
        this.skillContacts = skillContacts;
        this.smt = smt;
        this.dip = dip;
        this.isinstal = isinstal;
        this.instalMin = instalMin;
        this.istest = istest;
        this.testMin = testMin;
        this.isaging = isaging;
        this.agingMin = agingMin;
        this.exeStandard = exeStandard;
        this.steelMeshSource = steelMeshSource;
        this.defense = defense;
        this.defenseArea = defenseArea;
        this.sealTechnics = sealTechnics;
        this.materialSource = materialSource;
        this.ispcb = ispcb;
        this.pcbSource = pcbSource;
        this.pcbLong = pcbLong;
        this.pcbWide = pcbWide;
        this.pcbThick = pcbThick;
        this.pcbResistColor = pcbResistColor;
        this.pcbCharColor = pcbCharColor;
        this.pcbResistCover = pcbResistCover;
        this.pcbPadSpary = pcbPadSpary;
        this.pcbCopperThick = pcbCopperThick;
        this.pkCustomer = pkCustomer;
        this.orderNumber = orderNumber;
        this.bomFilename = bomFilename;
        this.bomFilefullname = bomFilefullname;
        this.pcbFilename = pcbFilename;
        this.pcbFilefullname = pcbFilefullname;
        this.craftFilename = craftFilename;
        this.craftFilefullname = craftFilefullname;
        this.ismakeTool = ismakeTool;
        this.makeSteelMesh = makeSteelMesh;
        this.makeDip = makeDip;
        this.makeTest = makeTest;
        this.makeDefense = makeDefense;
        this.makeAging = makeAging;
        this.taskId = taskId;
        this.processInstanceId = processInstanceId;
        this.approver = approver;
        this.approvetime = approvetime;
        this.billState = billState;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiedtime = modifiedtime;
        this.dr = dr;
        this.ts = ts;
        this.specialTechnics = specialTechnics;
        this.technicsState = technicsState;
        this.orderCount = orderCount;
    }

    public BdProduct() {
        super();
    }

    public Integer getPkProduct() {
        return pkProduct;
    }

    public void setPkProduct(Integer pkProduct) {
        this.pkProduct = pkProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    public Integer getPurchaseContacts() {
        return purchaseContacts;
    }

    public void setPurchaseContacts(Integer purchaseContacts) {
        this.purchaseContacts = purchaseContacts;
    }

    public Integer getSkillContacts() {
        return skillContacts;
    }

    public void setSkillContacts(Integer skillContacts) {
        this.skillContacts = skillContacts;
    }

    public Integer getSmt() {
        return smt;
    }

    public void setSmt(Integer smt) {
        this.smt = smt;
    }

    public Integer getDip() {
        return dip;
    }

    public void setDip(Integer dip) {
        this.dip = dip;
    }

    public String getIsinstal() {
        return isinstal;
    }

    public void setIsinstal(String isinstal) {
        this.isinstal = isinstal == null ? null : isinstal.trim();
    }

    public Integer getInstalMin() {
        return instalMin;
    }

    public void setInstalMin(Integer instalMin) {
        this.instalMin = instalMin;
    }

    public String getIstest() {
        return istest;
    }

    public void setIstest(String istest) {
        this.istest = istest == null ? null : istest.trim();
    }

    public Integer getTestMin() {
        return testMin;
    }

    public void setTestMin(Integer testMin) {
        this.testMin = testMin;
    }

    public String getIsaging() {
        return isaging;
    }

    public void setIsaging(String isaging) {
        this.isaging = isaging == null ? null : isaging.trim();
    }

    public Integer getAgingMin() {
        return agingMin;
    }

    public void setAgingMin(Integer agingMin) {
        this.agingMin = agingMin;
    }

    public String getExeStandard() {
        return exeStandard;
    }

    public void setExeStandard(String exeStandard) {
        this.exeStandard = exeStandard == null ? null : exeStandard.trim();
    }

    public String getSteelMeshSource() {
        return steelMeshSource;
    }

    public void setSteelMeshSource(String steelMeshSource) {
        this.steelMeshSource = steelMeshSource == null ? null : steelMeshSource.trim();
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense == null ? null : defense.trim();
    }

    public BigDecimal getDefenseArea() {
        return defenseArea;
    }

    public void setDefenseArea(BigDecimal defenseArea) {
        this.defenseArea = defenseArea;
    }

    public String getSealTechnics() {
        return sealTechnics;
    }

    public void setSealTechnics(String sealTechnics) {
        this.sealTechnics = sealTechnics == null ? null : sealTechnics.trim();
    }

    public String getMaterialSource() {
        return materialSource;
    }

    public void setMaterialSource(String materialSource) {
        this.materialSource = materialSource == null ? null : materialSource.trim();
    }

    public String getIspcb() {
        return ispcb;
    }

    public void setIspcb(String ispcb) {
        this.ispcb = ispcb == null ? null : ispcb.trim();
    }

    public String getPcbSource() {
        return pcbSource;
    }

    public void setPcbSource(String pcbSource) {
        this.pcbSource = pcbSource == null ? null : pcbSource.trim();
    }

    public Double getPcbLong() {
        return pcbLong;
    }

    public void setPcbLong(Double pcbLong) {
        this.pcbLong = pcbLong;
    }

    public Double getPcbWide() {
        return pcbWide;
    }

    public void setPcbWide(Double pcbWide) {
        this.pcbWide = pcbWide;
    }

    public Integer getPcbThick() {
        return pcbThick;
    }

    public void setPcbThick(Integer pcbThick) {
        this.pcbThick = pcbThick;
    }

    public String getPcbResistColor() {
        return pcbResistColor;
    }

    public void setPcbResistColor(String pcbResistColor) {
        this.pcbResistColor = pcbResistColor == null ? null : pcbResistColor.trim();
    }

    public String getPcbCharColor() {
        return pcbCharColor;
    }

    public void setPcbCharColor(String pcbCharColor) {
        this.pcbCharColor = pcbCharColor == null ? null : pcbCharColor.trim();
    }

    public String getPcbResistCover() {
        return pcbResistCover;
    }

    public void setPcbResistCover(String pcbResistCover) {
        this.pcbResistCover = pcbResistCover == null ? null : pcbResistCover.trim();
    }

    public String getPcbPadSpary() {
        return pcbPadSpary;
    }

    public void setPcbPadSpary(String pcbPadSpary) {
        this.pcbPadSpary = pcbPadSpary == null ? null : pcbPadSpary.trim();
    }

    public String getPcbCopperThick() {
        return pcbCopperThick;
    }

    public void setPcbCopperThick(String pcbCopperThick) {
        this.pcbCopperThick = pcbCopperThick == null ? null : pcbCopperThick.trim();
    }

    public Integer getPkCustomer() {
        return pkCustomer;
    }

    public void setPkCustomer(Integer pkCustomer) {
        this.pkCustomer = pkCustomer;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getBomFilename() {
        return bomFilename;
    }

    public void setBomFilename(String bomFilename) {
        this.bomFilename = bomFilename == null ? null : bomFilename.trim();
    }

    public String getBomFilefullname() {
        return bomFilefullname;
    }

    public void setBomFilefullname(String bomFilefullname) {
        this.bomFilefullname = bomFilefullname == null ? null : bomFilefullname.trim();
    }

    public String getPcbFilename() {
        return pcbFilename;
    }

    public void setPcbFilename(String pcbFilename) {
        this.pcbFilename = pcbFilename == null ? null : pcbFilename.trim();
    }

    public String getPcbFilefullname() {
        return pcbFilefullname;
    }

    public void setPcbFilefullname(String pcbFilefullname) {
        this.pcbFilefullname = pcbFilefullname == null ? null : pcbFilefullname.trim();
    }

    public String getCraftFilename() {
        return craftFilename;
    }

    public void setCraftFilename(String craftFilename) {
        this.craftFilename = craftFilename == null ? null : craftFilename.trim();
    }

    public String getCraftFilefullname() {
        return craftFilefullname;
    }

    public void setCraftFilefullname(String craftFilefullname) {
        this.craftFilefullname = craftFilefullname == null ? null : craftFilefullname.trim();
    }

    public String getIsmakeTool() {
        return ismakeTool;
    }

    public void setIsmakeTool(String ismakeTool) {
        this.ismakeTool = ismakeTool == null ? null : ismakeTool.trim();
    }

    public String getMakeSteelMesh() {
        return makeSteelMesh;
    }

    public void setMakeSteelMesh(String makeSteelMesh) {
        this.makeSteelMesh = makeSteelMesh == null ? null : makeSteelMesh.trim();
    }

    public String getMakeDip() {
        return makeDip;
    }

    public void setMakeDip(String makeDip) {
        this.makeDip = makeDip == null ? null : makeDip.trim();
    }

    public String getMakeTest() {
        return makeTest;
    }

    public void setMakeTest(String makeTest) {
        this.makeTest = makeTest == null ? null : makeTest.trim();
    }

    public String getMakeDefense() {
        return makeDefense;
    }

    public void setMakeDefense(String makeDefense) {
        this.makeDefense = makeDefense == null ? null : makeDefense.trim();
    }

    public String getMakeAging() {
        return makeAging;
    }

    public void setMakeAging(String makeAging) {
        this.makeAging = makeAging == null ? null : makeAging.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId == null ? null : processInstanceId.trim();
    }

    public Integer getApprover() {
        return approver;
    }

    public void setApprover(Integer approver) {
        this.approver = approver;
    }

    public String getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(String approvetime) {
        this.approvetime = approvetime == null ? null : approvetime.trim();
    }

    public Integer getBillState() {
        return billState;
    }

    public void setBillState(Integer billState) {
        this.billState = billState;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime == null ? null : modifiedtime.trim();
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public String getSpecialTechnics() {
        return specialTechnics;
    }

    public void setSpecialTechnics(String specialTechnics) {
        this.specialTechnics = specialTechnics == null ? null : specialTechnics.trim();
    }

    public Integer getTechnicsState() {
        return technicsState;
    }

    public void setTechnicsState(Integer technicsState) {
        this.technicsState = technicsState;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }
}