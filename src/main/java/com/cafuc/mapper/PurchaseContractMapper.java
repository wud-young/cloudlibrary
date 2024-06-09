package com.cafuc.mapper;

import com.cafuc.domain.PurchaseContract;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.*;



@Mapper
public interface PurchaseContractMapper {
    @Select("SELECT * FROM purchase_contract where pid=#{id}")
    @Results(id = "PurchaseMap1",value = {
            @Result(property = "P_id",column = "pid"),
            @Result(property = "P_number",column = "pNumber"),
            @Result(property = "P_Equipment",column = "eid",one = @One(select = "com.cafuc.mapper.EquipmentMapper.selectByPrimaryKey")),
            @Result(property = "P_date",column = "pDate"),
            @Result(property = "P_price", column = "pprice" ),
            @Result(property = "P_sale",column = "psale"),
            @Result(property = "P_Supplier",column = "sid",one = @One(select = "com.cafuc.mapper.SupplierMapper.selectByPrimaryKey")),
            @Result(property = "P_name",column = "pname")
    })
    PurchaseContract selectByPrimaryKey(Integer id);
    @Select("SELECT * FROM purchase_contract")
    @Results(id = "PurchaseMap",value = {
            @Result(property = "P_id",column = "pid"),
            @Result(property = "P_number",column = "pNumber"),
            @Result(property = "P_Equipment",column = "eid",one = @One(select = "com.cafuc.mapper.EquipmentMapper.selectByPrimaryKey")),
            @Result(property = "P_date",column = "pDate"),
            @Result(property = "P_price", column = "pprice" ),
            @Result(property = "P_sale",column = "psale"),
            @Result(property = "P_Supplier",column = "sid",one = @One(select = "com.cafuc.mapper.SupplierMapper.selectByPrimaryKey")),
            @Result(property = "P_name",column = "pname")
    })
    Page<PurchaseContract> selectALL();
}

