package com.liumapp.common.model.mapper;

import com.liumapp.common.model.domain.SignCode;
import com.liumapp.common.model.domain.SignCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignCodeMapper {
    long countByExample(SignCodeExample example);

    int deleteByExample(SignCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SignCode record);

    int insertSelective(SignCode record);

    List<SignCode> selectByExample(SignCodeExample example);

    SignCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SignCode record, @Param("example") SignCodeExample example);

    int updateByExample(@Param("record") SignCode record, @Param("example") SignCodeExample example);

    int updateByPrimaryKeySelective(SignCode record);

    int updateByPrimaryKey(SignCode record);
}