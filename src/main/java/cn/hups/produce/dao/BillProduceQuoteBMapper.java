package cn.hups.produce.dao;

import cn.hups.produce.entity.BillProduceQuoteB;
import cn.hups.produce.entity.BillProduceQuoteBExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillProduceQuoteBMapper {
    int countByExample(BillProduceQuoteBExample example);

    int deleteByExample(BillProduceQuoteBExample example);

    int deleteByPrimaryKey(Integer pkProduceQuoteB);

    int insert(BillProduceQuoteB record);

    int insertSelective(BillProduceQuoteB record);

    List<BillProduceQuoteB> selectByExample(BillProduceQuoteBExample example);

    BillProduceQuoteB selectByPrimaryKey(Integer pkProduceQuoteB);

    int updateByExampleSelective(@Param("record") BillProduceQuoteB record, @Param("example") BillProduceQuoteBExample example);

    int updateByExample(@Param("record") BillProduceQuoteB record, @Param("example") BillProduceQuoteBExample example);

    int updateByPrimaryKeySelective(BillProduceQuoteB record);

    int updateByPrimaryKey(BillProduceQuoteB record);
}