package com.cafuc.controller;


import com.cafuc.service.EquipmentService;

import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/equ")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;
    @RequestMapping("/selectNewEqu")
    public ModelAndView selectNewEqu() {
        //查询最新上架的5个的图书信息
        int pageNum = 1;
        int pageSize = 5;
        PageResult pageResult = equipmentService.selectNewEqu(pageNum, pageSize);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Equipments_new");
        modelAndView.addObject("pageResult", pageResult);
        return modelAndView;
    }
}
