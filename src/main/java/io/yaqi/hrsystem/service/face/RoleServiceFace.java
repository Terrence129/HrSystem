package io.yaqi.hrsystem.service.face;

import io.yaqi.hrsystem.entity.po.Role;
import io.yaqi.hrsystem.dao.RoleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/20 08:52
 * @Param
 **/

@Component
@RequiredArgsConstructor
public class RoleServiceFace {
    
    public final RoleMapper roleMapper;
    
    public Object getRoles(){
        return roleMapper.selectList(null);
    }
    
    public Object selectRoleById(Integer id){
        return roleMapper.selectById(id);
    }
    
    public Object addRole(Role role){
        roleMapper.insert(role);
        return role;
    }
    
    public Object updateRole(Role role){
        roleMapper.updateById(role);
        return roleMapper.selectById(role.getId());
    }
    
    public Object deleteRoleById(Integer id){
        roleMapper.deleteById(id);
        return id + " has been deleted";
    }
}
