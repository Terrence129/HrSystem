package io.yaqi.hrsystem.controller;

import io.yaqi.hrsystem.entity.po.Department;
import io.yaqi.hrsystem.service.face.DepartmentServiceFace;
import io.yaqi.hrsystem.utils.ResponseResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenyaqi
 * @Description 部门控制器类
 * @Date 2024/9/19 15:21
 * @Param
 **/

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/department")
@CrossOrigin
public class DepartmentController {

    private final DepartmentServiceFace departmentServiceFace;

    @GetMapping("/getDepartments")
    public Object getDepartments(){
        return ResponseResult.success(departmentServiceFace.getDepartments());
    }

    @GetMapping("/selectDepartmentById")
    public Object selectDepartmentById(@RequestParam Integer id){
        return ResponseResult.success(departmentServiceFace.selectDepartmentById(id));
    }

    @PutMapping("/updateDepartment")
    public Object updateDepartment(@RequestBody Department department){
        return ResponseResult.success(departmentServiceFace.updateDepartment(department));
    }

    @DeleteMapping("/deleteDepartmentById")
    public Object deleteDepartmentById(@RequestParam Integer id){
        return ResponseResult.success(departmentServiceFace.deleteDepartmentById(id));
    }

    @PostMapping("/addDepartment")
    public Object addDepartment(@RequestBody Department department){
        return ResponseResult.success(departmentServiceFace.addDepartment(department));
    }
}
