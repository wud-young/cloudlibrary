package com.cafuc.mapper;

import com.cafuc.domain.Category;
import com.cafuc.domain.Permissions;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CategoryMapper {
    @Select("select * from equipment_category where ecid=#{id}")
    @Results(id = "CategoryMap",value = {
            @Result(property = "EC_id",column = "ecid"),
            @Result(property = "EC_name",column = "ecname"),
            @Result(property = "EC_remark", column = "ecremark" )
    })
    Category selectByPrimaryKey(Integer id);
}
