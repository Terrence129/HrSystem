package io.yaqi.hrsystem.service.face;

import io.yaqi.hrsystem.entity.po.Department;
import io.yaqi.hrsystem.dao.DepartmentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


/**
 * @author chenyaqi
 * @Description 部门服务类
 * @Date 2024/9/19 15:19
 * @Param
 **/


@RequiredArgsConstructor
@Component
public class DepartmentServiceFace {

    private final DepartmentMapper departmentMapper;

    public Object getDepartments(){
        return departmentMapper.selectList(null);
    }

    public Object selectDepartmentById(Integer id){
        return departmentMapper.selectById(id);
    }

    public Object updateDepartment(Department department){
        departmentMapper.updateById(department);
        return departmentMapper.selectById(department.getId());
    }

    public Object deleteDepartmentById(Integer id){
        departmentMapper.deleteById(id);
        return id + " has been deleted";
    }

    public Object addDepartment(Department department){
        departmentMapper.insert(department);
        return department + " has been added";
    }
}
