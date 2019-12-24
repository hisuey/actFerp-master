package cn.hups.rbac.dao;

import cn.hups.rbac.entity.SmUser;
import cn.hups.rbac.entity.SmUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmUserMapper {
    int countByExample(SmUserExample example);

    int deleteByExample(SmUserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(SmUser record);

    int insertSelective(SmUser record);

    List<SmUser> selectByExample(SmUserExample example);

    SmUser selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") SmUser record, @Param("example") SmUserExample example);

    int updateByExample(@Param("record") SmUser record, @Param("example") SmUserExample example);

    int updateByPrimaryKeySelective(SmUser record);

    int updateByPrimaryKey(SmUser record);
}