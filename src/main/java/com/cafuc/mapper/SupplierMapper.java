package com.cafuc.mapper;

import com.cafuc.domain.Department;
import com.cafuc.domain.Supplier;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SupplierMapper {
    @Select("SELECT * FROM supplier_information where sid=#{id}")
    @Results(id = "SupplierMap",value = {
            @Result(property = "S_id",column = "sid"),
            @Result(property = "S_name",column = "sname"),
            @Result(property = "S_address",column = "saddress"),
            @Result(property = "S_tel",column = "stel"),
            @Result(property = "S_Manager", column = "sManager"),

    })
    Supplier SelectByPrimaryKey(Integer id);
}
