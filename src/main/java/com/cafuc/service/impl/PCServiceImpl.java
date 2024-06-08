package com.cafuc.service.impl;

import com.cafuc.domain.Equipment;
import com.cafuc.domain.PurchaseContract;
import com.cafuc.mapper.PurchaseContractMapper;
import com.cafuc.service.PCService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

public class PCServiceImpl implements PCService {
    @Autowired
    PurchaseContractMapper purchaseContractMapper;
    @Override
    public PurchaseContract SelectByPrimaryKey(Integer id) {
        return purchaseContractMapper.SelectByPrimaryKey(id);
    }

    @Override
    public Page<PurchaseContract> SelectALL() {
        return purchaseContractMapper.SelectALL();
    }

    @Override
    public PageResult selectNewPC(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<PurchaseContract> page=purchaseContractMapper.SelectALL();
        return new PageResult(page.getTotal(),page.getResult());
    }
}
