package cn.hups.purchase.dao;

import cn.hups.purchase.entity.BillMateriel;
import cn.hups.purchase.entity.BillMaterielExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillMaterielMapper {
    int countByExample(BillMaterielExample example);

    int deleteByExample(BillMaterielExample example);

    int deleteByPrimaryKey(Integer pkMateriel);

    int insert(BillMateriel record);

    int insertSelective(BillMateriel record);

    List<BillMateriel> selectByExample(BillMaterielExample example);

    BillMateriel selectByPrimaryKey(Integer pkMateriel);

    int updateByExampleSelective(@Param("record") BillMateriel record, @Param("example") BillMaterielExample example);

    int updateByExample(@Param("record") BillMateriel record, @Param("example") BillMaterielExample example);

    int updateByPrimaryKeySelective(BillMateriel record);

    int updateByPrimaryKey(BillMateriel record);
}