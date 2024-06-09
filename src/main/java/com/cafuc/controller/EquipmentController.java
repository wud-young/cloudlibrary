package com.cafuc.controller;


import com.cafuc.service.EquipmentService;

import com.cafuc.service.PCService;
import com.cafuc.service.UserService;
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
    @Autowired
    private UserService userService;
    @Autowired
    private PCService pcService;
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
    @RequestMapping("/selectNewUser")
    public ModelAndView selectNewUser() {
        //查询最新上架的5个的图书信息
        int pageNum = 1;
        int pageSize = 5;
        PageResult pageResult = userService.selectNewUser(pageNum, pageSize);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("User_new");
        modelAndView.addObject("pageResult", pageResult);
        return modelAndView;
    }
    @RequestMapping("/selectNewPC")
    public ModelAndView selectNewPC() {
        //查询最新上架的5个的图书信息
        int pageNum = 1;
        int pageSize = 5;
        PageResult pageResult = pcService.selectNewPC(pageNum, pageSize);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("PC_new");
        modelAndView.addObject("pageResult", pageResult);
        return modelAndView;
    }
    @RequestMapping("/DeletePCById")
    public String DeletePCById(int id) {
    pcService.DeletePcbyId(id);
    System.out.println("删除成功");
    return "redirect:/equ/selectNewPC";
    }
}
