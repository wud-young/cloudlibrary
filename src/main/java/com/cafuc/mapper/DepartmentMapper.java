package com.cafuc.mapper;

import com.cafuc.domain.Category;
import com.cafuc.domain.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DepartmentMapper {
    @Select("select dName from department_information where did=#{id}")
    Department selectByPrimaryKey(Integer id);
}
