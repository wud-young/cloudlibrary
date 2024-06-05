package com.cafuc.mapper;

import com.cafuc.domain.Department;
import com.cafuc.domain.Manager;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ManagerMapper {
    @Select("SELECT * FROM equipment_manager_information WHERE emid =#{id}")
    @Results(id = "ManagerMap",value = {
            @Result(property = "EM_id",column = "emid"),
            @Result(property = "EM_name",column = "emname"),
            @Result(property = "EM_tel",column = "emtel"),
            @Result(property = "EM_sex",column = "emsex"),
            @Result(property = "EM_age", column = "emage" ),
            @Result(property = "EM_Department",column = "did",one = @One(select = "com.cafuc.mapper.DepartmentMapper.selectByPrimaryKey"))
    })
    Manager SelectManagerAll();
}
