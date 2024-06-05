package com.cafuc.mapper;

import com.cafuc.domain.Category;
import com.cafuc.domain.Permissions;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CategoryMapper {
    @Select("select ecname from equipment_category where ecid=#{id}")
    Category selectByPrimaryKey(Integer id);
}
