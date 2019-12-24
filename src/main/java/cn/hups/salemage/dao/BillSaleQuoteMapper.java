package cn.hups.salemage.dao;

import cn.hups.salemage.entity.BillSaleQuote;
import cn.hups.salemage.entity.BillSaleQuoteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillSaleQuoteMapper {
    int countByExample(BillSaleQuoteExample example);

    int deleteByExample(BillSaleQuoteExample example);

    int deleteByPrimaryKey(Integer pkSaleQuote);

    int insert(BillSaleQuote record);

    int insertSelective(BillSaleQuote record);

    List<BillSaleQuote> selectByExample(BillSaleQuoteExample example);

    BillSaleQuote selectByPrimaryKey(Integer pkSaleQuote);

    int updateByExampleSelective(@Param("record") BillSaleQuote record, @Param("example") BillSaleQuoteExample example);

    int updateByExample(@Param("record") BillSaleQuote record, @Param("example") BillSaleQuoteExample example);

    int updateByPrimaryKeySelective(BillSaleQuote record);

    int updateByPrimaryKey(BillSaleQuote record);
}