package com.wuyu.eduservice.controller;


import com.wuyu.eduservice.entity.EduTeacher;
import com.wuyu.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author 
 * @since 2022-05-06
 */
@RestController
@RequestMapping("/eduservice/edu-teacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;
    @GetMapping("/findAll")
    public List<EduTeacher> findAllTeacher(){
        List<EduTeacher> list = eduTeacherService.list(null);
        return list;
    }
    @DeleteMapping("/{id}")
    public boolean removeTeacher(@PathVariable String id){
        boolean res = eduTeacherService.removeById(id);
        return res;
    }
}

