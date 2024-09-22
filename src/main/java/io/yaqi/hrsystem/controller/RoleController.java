package io.yaqi.hrsystem.controller;

import io.yaqi.hrsystem.entity.po.Role;
import io.yaqi.hrsystem.service.face.RoleServiceFace;
import io.yaqi.hrsystem.utils.ResponseResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/20 08:49
 * @Param
 **/

@RestController
@RequestMapping("/role")
@CrossOrigin
@RequiredArgsConstructor
public class RoleController {

    public final RoleServiceFace roleServiceFace;

    @GetMapping("/getRoles")
    public Object getRoles(){
        return ResponseResult.success(roleServiceFace.getRoles());
    }

    @GetMapping("/selectRoleById")
    public Object selectRoleById(@RequestParam Integer id){
        return ResponseResult.success(roleServiceFace.selectRoleById(id));
    }

    @PostMapping("/addRole")
    public Object addRole(@RequestBody Role role){
        return ResponseResult.success(roleServiceFace.addRole(role));
    }

    @PutMapping("/updateRoleById")
    public Object updateRoleById(@RequestBody Role role){
        return ResponseResult.success(roleServiceFace.updateRole(role));
    }

    @DeleteMapping("/deleteRoleById")
    public Object deleteRoleById(@RequestParam Integer id){
        return ResponseResult.success(roleServiceFace.deleteRoleById(id));
    }

}
