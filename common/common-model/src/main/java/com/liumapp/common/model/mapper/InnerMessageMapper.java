package com.liumapp.common.model.mapper;

import com.liumapp.common.model.domain.InnerMessage;
import com.liumapp.common.model.domain.InnerMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnerMessageMapper {
    long countByExample(InnerMessageExample example);

    int deleteByExample(InnerMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InnerMessage record);

    int insertSelective(InnerMessage record);

    List<InnerMessage> selectByExample(InnerMessageExample example);

    InnerMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InnerMessage record, @Param("example") InnerMessageExample example);

    int updateByExample(@Param("record") InnerMessage record, @Param("example") InnerMessageExample example);

    int updateByPrimaryKeySelective(InnerMessage record);

    int updateByPrimaryKey(InnerMessage record);
}