package cn.hups.refdoc.dao;

import cn.hups.refdoc.entity.BdPsntype;
import cn.hups.refdoc.entity.BdPsntypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdPsntypeMapper {
    int countByExample(BdPsntypeExample example);

    int deleteByExample(BdPsntypeExample example);

    int deleteByPrimaryKey(Integer pkPsntype);

    int insert(BdPsntype record);

    int insertSelective(BdPsntype record);

    List<BdPsntype> selectByExample(BdPsntypeExample example);

    BdPsntype selectByPrimaryKey(Integer pkPsntype);

    int updateByExampleSelective(@Param("record") BdPsntype record, @Param("example") BdPsntypeExample example);

    int updateByExample(@Param("record") BdPsntype record, @Param("example") BdPsntypeExample example);

    int updateByPrimaryKeySelective(BdPsntype record);

    int updateByPrimaryKey(BdPsntype record);
}