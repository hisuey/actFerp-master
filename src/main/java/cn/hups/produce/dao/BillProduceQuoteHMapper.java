package cn.hups.produce.dao;

import cn.hups.produce.entity.BillProduceQuoteH;
import cn.hups.produce.entity.BillProduceQuoteHExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillProduceQuoteHMapper {
    int countByExample(BillProduceQuoteHExample example);

    int deleteByExample(BillProduceQuoteHExample example);

    int deleteByPrimaryKey(Integer pkProduceQuoteH);

    int insert(BillProduceQuoteH record);

    int insertSelective(BillProduceQuoteH record);

    List<BillProduceQuoteH> selectByExample(BillProduceQuoteHExample example);

    BillProduceQuoteH selectByPrimaryKey(Integer pkProduceQuoteH);

    int updateByExampleSelective(@Param("record") BillProduceQuoteH record, @Param("example") BillProduceQuoteHExample example);

    int updateByExample(@Param("record") BillProduceQuoteH record, @Param("example") BillProduceQuoteHExample example);

    int updateByPrimaryKeySelective(BillProduceQuoteH record);

    int updateByPrimaryKey(BillProduceQuoteH record);
}