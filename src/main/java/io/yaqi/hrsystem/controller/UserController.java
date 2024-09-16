package io.yaqi.hrsystem.controller;

import io.yaqi.hrsystem.dao.entity.User;
import io.yaqi.hrsystem.entity.req.UserLoginReq;
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
    public Object addUser(@RequestBody User user) {
        return ResponseResult.success(userServiceFace.addUser(user));
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
}
