package com.cafuc.service.impl;

import com.cafuc.domain.PurchaseContract;
import com.cafuc.mapper.PurchaseContractMapper;
import com.cafuc.service.PCService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PCServiceImpl implements PCService {
    @Autowired
    PurchaseContractMapper purchaseContractMapper;
    @Override
    public PurchaseContract SelectByPrimaryKey(Integer id) {
        return purchaseContractMapper.selectByPrimaryKey(id);
    }

    @Override
    public Page<PurchaseContract> SelectALL() {
        return purchaseContractMapper.selectALL();
    }

    @Override
    public PageResult selectNewPC(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<PurchaseContract> page=purchaseContractMapper.selectALL();
        return new PageResult(page.getTotal(),page.getResult());
    }
    @Override
    public void DeletePcbyId(Integer id) {
        purchaseContractMapper.DeleteByPrimaryKey(id);
    }
}
