package com.cafuc.mapper;

import com.cafuc.domain.Department;
import com.cafuc.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EquipmentMapper {
    @Select("SELECT * FROM equipment ")
    @Results(id = "equipmentMap",value = {
            @Result(property = "E_id",column = "eid"),
            @Result(property = "E_name",column = "ename"),
            @Result(property = "E_Category",column = "ecid",one = @One(select = "com.cafuc.mapper.PermissionsMapper.selectByPrimaryKey")),
            @Result(property = "e_Status",column = "esid",one = @One(select = "com.cafuc.mapper.PermissionsMapper.selectByPrimaryKey")),
            @Result(property = "E_Manager", column = "emid" ,one = @One(select = "com.cafuc.mapper.PermissionsMapper.selectByPrimaryKey")),
            @Result(property = "E_type",column = "etype")
    })
    List<Department> SelectEquAll();
}
