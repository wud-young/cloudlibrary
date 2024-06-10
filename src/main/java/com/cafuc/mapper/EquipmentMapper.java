
package com.cafuc.mapper;

import com.cafuc.domain.Equipment;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EquipmentMapper {
    @Select("SELECT * FROM equipment ")
    @Results(id = "equipmentMap",value = {
            @Result(property = "E_id",column = "eid"),
            @Result(property = "E_name",column = "ename"),
            @Result(property = "E_Category",column = "ecid",one = @One(select = "com.cafuc.mapper.CategoryMapper.selectByPrimaryKey")),
            @Result(property = "e_Status",column = "esid",one = @One(select = "com.cafuc.mapper.StatusMapper.selectByPrimaryKey")),
            @Result(property = "E_Manager", column = "emid" ,one = @One(select = "com.cafuc.mapper.ManagerMapper.selectByPrimaryKey")),
            @Result(property = "E_type",column = "etype")
    })
    Page<Equipment> selectEquAll();
    @Select("SELECT * FROM equipment where eid=#{id}")
    @Results(id = "equipmentMap1",value = {
            @Result(property = "E_id",column = "eid"),
            @Result(property = "E_name",column = "ename"),
            @Result(property = "E_Category",column = "ecid",one = @One(select = "com.cafuc.mapper.CategoryMapper.selectByPrimaryKey")),
            @Result(property = "e_Status",column = "esid",one = @One(select = "com.cafuc.mapper.StatusMapper.selectByPrimaryKey")),
            @Result(property = "E_Manager", column = "emid" ,one = @One(select = "com.cafuc.mapper.ManagerMapper.selectByPrimaryKey")),
            @Result(property = "E_type",column = "etype")
    })
    Equipment selectByPrimaryKey(Integer id);
//    @Insert("insert into equipment(eid,ename)")

}

