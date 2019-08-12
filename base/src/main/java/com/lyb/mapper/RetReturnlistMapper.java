package com.lyb.mapper;

import com.lyb.entity.RetReturnlist;
import com.lyb.entity.RetReturnlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RetReturnlistMapper {
    long countByExample(RetReturnlistExample example);

    int deleteByExample(RetReturnlistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RetReturnlist record);

    int insertSelective(RetReturnlist record);

    List<RetReturnlist> selectByExample(RetReturnlistExample example);

    RetReturnlist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RetReturnlist record, @Param("example") RetReturnlistExample example);

    int updateByExample(@Param("record") RetReturnlist record, @Param("example") RetReturnlistExample example);

    int updateByPrimaryKeySelective(RetReturnlist record);

    int updateByPrimaryKey(RetReturnlist record);
}