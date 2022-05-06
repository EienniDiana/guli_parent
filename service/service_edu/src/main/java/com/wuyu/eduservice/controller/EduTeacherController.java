package com.wuyu.eduservice.controller;


import com.wuyu.eduservice.entity.EduTeacher;
import com.wuyu.eduservice.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@Api(tags = "讲师")
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;
    @GetMapping("/findAll")
    public List<EduTeacher> findAllTeacher(){
        List<EduTeacher> list = eduTeacherService.list(null);
        return list;
    }
    @ApiOperation(value = "逻辑删除讲师")
    @DeleteMapping("/{id}")
    public boolean removeTeacher(@ApiParam(name = "id",value = "讲师ID",required = true)@PathVariable String id){
        boolean res = eduTeacherService.removeById(id);
        return res;
    }
}

