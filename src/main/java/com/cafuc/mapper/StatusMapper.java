package com.cafuc.mapper;


import com.cafuc.domain.Status;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StatusMapper {
    @Select("select * from equipment_status where esid=#{id}")
    @Results(id = "EquipmentStatusMap",value = {
            @Result(property = "ES_id",column = "esid"),
            @Result(property = "ES_name",column = "esname")
    })
    Status selectByPrimaryKey(Integer id);
}
