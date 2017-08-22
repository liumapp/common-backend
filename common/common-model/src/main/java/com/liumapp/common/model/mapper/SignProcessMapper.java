package com.liumapp.common.model.mapper;

import com.liumapp.common.model.domain.SignProcess;
import com.liumapp.common.model.domain.SignProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignProcessMapper {
    long countByExample(SignProcessExample example);

    int deleteByExample(SignProcessExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SignProcess record);

    int insertSelective(SignProcess record);

    List<SignProcess> selectByExample(SignProcessExample example);

    SignProcess selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SignProcess record, @Param("example") SignProcessExample example);

    int updateByExample(@Param("record") SignProcess record, @Param("example") SignProcessExample example);

    int updateByPrimaryKeySelective(SignProcess record);

    int updateByPrimaryKey(SignProcess record);
}