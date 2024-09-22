package io.yaqi.hrsystem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.yaqi.hrsystem.entity.po.Department;
import org.apache.ibatis.annotations.Select;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/19 14:54
 * @Param
 **/

public interface DepartmentMapper extends BaseMapper<Department> {

    @Select("SELECT * FROM department WHERE id = #{id}")
    Department getDeptById(Integer id);

}
