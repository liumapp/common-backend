package com.liumapp.common.model.mapper;

import com.liumapp.common.model.domain.ContractSignCodeExample;
import com.liumapp.common.model.domain.ContractSignCodeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractSignCodeMapper {
    long countByExample(ContractSignCodeExample example);

    int deleteByExample(ContractSignCodeExample example);

    int deleteByPrimaryKey(ContractSignCodeKey key);

    int insert(ContractSignCodeKey record);

    int insertSelective(ContractSignCodeKey record);

    List<ContractSignCodeKey> selectByExample(ContractSignCodeExample example);

    int updateByExampleSelective(@Param("record") ContractSignCodeKey record, @Param("example") ContractSignCodeExample example);

    int updateByExample(@Param("record") ContractSignCodeKey record, @Param("example") ContractSignCodeExample example);
}