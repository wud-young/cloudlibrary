
package com.cafuc.service;

import com.cafuc.domain.Equipment;
import com.github.pagehelper.Page;
import entity.PageResult;


public interface EquipmentService {
    Page<Equipment> getAllEquipment();
    Equipment getEquipmentById(int id);
    PageResult selectNewEqu(Integer pageNum, Integer pageSize);
}

