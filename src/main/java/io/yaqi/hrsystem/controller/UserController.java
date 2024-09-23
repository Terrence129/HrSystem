package io.yaqi.hrsystem.controller;

import io.yaqi.hrsystem.entity.po.User;
import io.yaqi.hrsystem.entity.req.UserLoginReq;
import io.yaqi.hrsystem.entity.req.UserReq;
import io.yaqi.hrsystem.service.face.UserServiceFace;
import io.yaqi.hrsystem.utils.ResponseResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;

/**
 * @author chenyaqi
 * @Description User控制器
 * @Date 2024/9/13 08:42
 * @Param
 **/

@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserServiceFace userServiceFace;

    @PostMapping("/addUser")
    public Object addUser(@RequestBody UserReq req) {
        return ResponseResult.success(userServiceFace.addUser(req));
    }

    @GetMapping("/getUsers")
    public Object getUsers() {
        return ResponseResult.success(userServiceFace.getUsers());
    }

    @GetMapping("/selectUser")
    public Object selectUser(@RequestParam Integer id) {
        return ResponseResult.success(userServiceFace.selectUser(id));
    }

    @PutMapping("updateUser")
    public Object updateUser(@RequestBody User user) {
        log.info(user.toString());
        return ResponseResult.success(userServiceFace.updateUser(user));
    }

    @DeleteMapping("/deleteUser")
    public Object deleteUser(@RequestParam Integer id) {
        return ResponseResult.success(userServiceFace.deleteUser(id));
    }

    @PostMapping("/login")
    public Object userLogin(@RequestBody UserLoginReq req) throws LoginException {
        return ResponseResult.success(userServiceFace.userLogin(req), "登录成功", 200);
    }

    // 多表查询
    @GetMapping("/getUsersWithObjects")
    public Object getUsersWithObjects() {
        return ResponseResult.success(userServiceFace.getUsersWithObjects());
    }

    @GetMapping("/selectUserWithObjectsById")
    public Object selectUserWithObjectsById(@RequestParam Integer id) {
        return ResponseResult.success(userServiceFace.selectUserWithObjectsById(id));
    }

    // 多条件模糊查询
    @GetMapping("/searchUsersByParams")
    public Object searchUsersByParams(
            @RequestParam(required = false) Integer roleId,
            @RequestParam(required = false) Integer deptId,
            @RequestParam(required = false) String loginIdKeyword) {
        if (roleId == null && deptId == null && loginIdKeyword == null) {
            return ResponseResult.success(userServiceFace.getUsersWithObjects());
        }
        Object result =  ResponseResult.success(userServiceFace.searchUsersByParams(roleId, deptId, loginIdKeyword));
        System.out.println(231312321);

        return result;
    }
}
