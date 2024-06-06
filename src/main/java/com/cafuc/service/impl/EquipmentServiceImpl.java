package com.cafuc.service.impl;

import com.cafuc.domain.Equipment;
import com.cafuc.mapper.EquipmentMapper;
import com.cafuc.service.EquipmentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentMapper equipmentMapper;
    @Override
    public PageResult selectNewEqu(Integer pageNum, Integer pageSize) {
        // 设置分页查询的参数，开始分页
        PageHelper.startPage(pageNum, pageSize);
        Page<Equipment> page=equipmentMapper.SelectEquAll();
        return new PageResult(page.getTotal(),page.getResult());
    }
    @Override
    public Page<Equipment> getAllEquipment() {
        return equipmentMapper.SelectEquAll();
    }

    @Override
    public Equipment getEquipmentById(int id) {
        return equipmentMapper.SelectByPrimaryKey(id);
    }
}
