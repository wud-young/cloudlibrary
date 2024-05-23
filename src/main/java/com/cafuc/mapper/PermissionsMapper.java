package com.cafuc.mapper;

import com.cafuc.domain.Permissions;
import org.apache.ibatis.annotations.Select;

public interface PermissionsMapper {
    @Select("select * from permissions where aid=#{id}")
    Permissions selectByPrimaryKey(Integer id);
}
