package cn.hups.purchase.dao;

import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;

/**
 * 采购报价物料信息拓展Mapper
 */
public interface BillMaterielMapperExpand {

    /**
     * 根据产品主键删除物料信息数据
     * @param pkProduct
     * @return
     * @throws SQLException
     */
    int deletePurchaseMaterielByPkProduct(@Param("pkProduct") Integer pkProduct) throws SQLException;
}
