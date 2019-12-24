package cn.hups.customer.dao;

import cn.hups.customer.entity.BdInvoice;
import cn.hups.customer.entity.BdInvoiceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdInvoiceMapper {
    int countByExample(BdInvoiceExample example);

    int deleteByExample(BdInvoiceExample example);

    int deleteByPrimaryKey(Integer pkInvoice);

    int insert(BdInvoice record);

    int insertSelective(BdInvoice record);

    List<BdInvoice> selectByExample(BdInvoiceExample example);

    BdInvoice selectByPrimaryKey(Integer pkInvoice);

    int updateByExampleSelective(@Param("record") BdInvoice record, @Param("example") BdInvoiceExample example);

    int updateByExample(@Param("record") BdInvoice record, @Param("example") BdInvoiceExample example);

    int updateByPrimaryKeySelective(BdInvoice record);

    int updateByPrimaryKey(BdInvoice record);
}