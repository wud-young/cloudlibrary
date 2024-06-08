package com.cafuc.service;

import com.cafuc.domain.PurchaseContract;
import com.github.pagehelper.Page;
import entity.PageResult;

public interface PCService {
    PurchaseContract SelectByPrimaryKey(Integer id);
    Page<PurchaseContract> SelectALL();
    PageResult selectNewPC(Integer pageNum, Integer pageSize);
}
