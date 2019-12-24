package cn.hups.purchase.dao;

import cn.hups.purchase.entity.BdMaterielDataBase;
import cn.hups.purchase.entity.BdMaterielDataBaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdMaterielDataBaseMapper {
    int countByExample(BdMaterielDataBaseExample example);

    int deleteByExample(BdMaterielDataBaseExample example);

    int deleteByPrimaryKey(Integer pkDbMateriel);

    int insert(BdMaterielDataBase record);

    int insertSelective(BdMaterielDataBase record);

    List<BdMaterielDataBase> selectByExample(BdMaterielDataBaseExample example);

    BdMaterielDataBase selectByPrimaryKey(Integer pkDbMateriel);

    int updateByExampleSelective(@Param("record") BdMaterielDataBase record, @Param("example") BdMaterielDataBaseExample example);

    int updateByExample(@Param("record") BdMaterielDataBase record, @Param("example") BdMaterielDataBaseExample example);

    int updateByPrimaryKeySelective(BdMaterielDataBase record);

    int updateByPrimaryKey(BdMaterielDataBase record);
}