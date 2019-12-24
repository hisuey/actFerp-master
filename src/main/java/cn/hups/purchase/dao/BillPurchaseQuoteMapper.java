package cn.hups.purchase.dao;

import cn.hups.purchase.entity.BillPurchaseQuote;
import cn.hups.purchase.entity.BillPurchaseQuoteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillPurchaseQuoteMapper {
    int countByExample(BillPurchaseQuoteExample example);

    int deleteByExample(BillPurchaseQuoteExample example);

    int deleteByPrimaryKey(Integer pkPurchaseQuote);

    int insert(BillPurchaseQuote record);

    int insertSelective(BillPurchaseQuote record);

    List<BillPurchaseQuote> selectByExample(BillPurchaseQuoteExample example);

    BillPurchaseQuote selectByPrimaryKey(Integer pkPurchaseQuote);

    int updateByExampleSelective(@Param("record") BillPurchaseQuote record, @Param("example") BillPurchaseQuoteExample example);

    int updateByExample(@Param("record") BillPurchaseQuote record, @Param("example") BillPurchaseQuoteExample example);

    int updateByPrimaryKeySelective(BillPurchaseQuote record);

    int updateByPrimaryKey(BillPurchaseQuote record);
}