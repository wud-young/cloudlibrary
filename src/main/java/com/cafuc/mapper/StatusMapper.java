package com.cafuc.mapper;

import com.cafuc.domain.Category;
import com.cafuc.domain.Status;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StatusMapper {
    @Select("select esName from equipment_status where esid=#{id}")
    Status selectByPrimaryKey(Integer id);
}
