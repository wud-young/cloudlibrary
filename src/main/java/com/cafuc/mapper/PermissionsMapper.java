package com.cafuc.mapper;

import com.cafuc.domain.Permissions;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PermissionsMapper {
    @Select("select * from permissions where aid=#{id}")
    @Results(id = "PermissionsMap",value = {
            @Result(property = "P_id",column = "emid"),
            @Result(property = "EM_name",column = "emname"),
            })
    Permissions selectByPrimaryKey(Integer id);
}

