package com.cafuc.service.impl;

import com.cafuc.domain.Equipment;
import com.cafuc.mapper.EquipmentMapper;
import com.cafuc.service.EquipmentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentMapper equipmentMapper;
    @Override
    public PageResult selectNewEqu(Integer pageNum, Integer pageSize) {
        // 设置分页查询的参数，开始分页
        PageHelper.startPage(pageNum, pageSize);
        Page<Equipment> page=equipmentMapper.selectEquAll();
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void DeleteEqubyId(int id) {
        equipmentMapper.DeleteEqubyId(id);
    }

    @Override
    public Page<Equipment> getAllEquipment() {
        return equipmentMapper.selectEquAll();
    }

    @Override
    public Equipment getEquipmentById(int id) {
        return equipmentMapper.selectByPrimaryKey(id);
    }
}
