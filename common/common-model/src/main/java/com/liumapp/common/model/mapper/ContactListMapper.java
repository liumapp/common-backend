package com.liumapp.common.model.mapper;

import com.liumapp.common.model.domain.ContactList;
import com.liumapp.common.model.domain.ContactListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactListMapper {
    long countByExample(ContactListExample example);

    int deleteByExample(ContactListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContactList record);

    int insertSelective(ContactList record);

    List<ContactList> selectByExample(ContactListExample example);

    ContactList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContactList record, @Param("example") ContactListExample example);

    int updateByExample(@Param("record") ContactList record, @Param("example") ContactListExample example);

    int updateByPrimaryKeySelective(ContactList record);

    int updateByPrimaryKey(ContactList record);
}