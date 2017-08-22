package com.liumapp.common.model.mapper;

import com.liumapp.common.model.domain.MessageBox;
import com.liumapp.common.model.domain.MessageBoxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageBoxMapper {
    long countByExample(MessageBoxExample example);

    int deleteByExample(MessageBoxExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MessageBox record);

    int insertSelective(MessageBox record);

    List<MessageBox> selectByExample(MessageBoxExample example);

    MessageBox selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MessageBox record, @Param("example") MessageBoxExample example);

    int updateByExample(@Param("record") MessageBox record, @Param("example") MessageBoxExample example);

    int updateByPrimaryKeySelective(MessageBox record);

    int updateByPrimaryKey(MessageBox record);
}