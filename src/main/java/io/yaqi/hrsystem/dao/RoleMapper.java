package io.yaqi.hrsystem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.yaqi.hrsystem.entity.po.Role;
import org.apache.ibatis.annotations.Select;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/19 14:54
 * @Param
 **/

public interface RoleMapper extends BaseMapper<Role> {

    @Select("SELECT * FROM role WHERE id = #{id}")
    Role getRoleById(Integer id);

}
