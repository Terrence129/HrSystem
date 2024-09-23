package io.yaqi.hrsystem.service.face;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.yaqi.hrsystem.entity.po.User;
import io.yaqi.hrsystem.dao.UserMapper;
import io.yaqi.hrsystem.entity.req.UserLoginReq;
import io.yaqi.hrsystem.entity.req.UserReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/13 08:44
 * @Param
 **/

@Component
@RequiredArgsConstructor
public class UserServiceFace {

    private final UserMapper userMapper;

    public Object addUser(UserReq req) {
        User user = new User();
        user.setLoginId(req.getLoginId());
        user.setLoginPwd(req.getLoginPwd());
        user.setEmail(req.getEmail());
        user.setState(req.getState());
        user.setCode("测试中");
        user.setRoleId(req.getRoleId());
        user.setDeptId(req.getDeptId());
        userMapper.insert(user);
        return user;
    }

    public Object getUsers(){
        return userMapper.selectList(null);
    }

    public Object selectUser(Integer id) {
        return userMapper.selectById(id);
    }

    public Object updateUser(User user) {
        userMapper.updateById(user);
        return userMapper.selectById(user.getId());
    }

    public Object deleteUser(Integer userId) {
        userMapper.deleteById(userId);
        return userId + " has been deleted";
    }

    public Object userLogin(UserLoginReq req) throws LoginException {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User ::getLoginId, req.getLoginId());
        List<User> userList = userMapper.selectList(queryWrapper);
        if(userList.size() != 1){
            throw new LoginException("不存在此账号");
        }
        User user = userList.get(0);
        if (!user.getLoginPwd().equals(req.getLoginPwd())){
            throw new LoginException("密码错误");
        }
        return user;
    }

    // 利用多表查询技术实现自定义结果查询
    public Object getUsersWithObjects(){
        return userMapper.getUsersWithObjects();
    }

    public Object selectUserWithObjectsById(Integer id) {
        return userMapper.selectUserWithObjectsById(id);
    }

    // 多条件模糊查询
    public Object searchUsersByParams(Integer roleId, Integer deptId, String loginIdKeyword) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if(roleId != null){
            queryWrapper.eq("role_id", roleId);
        }
        if(deptId != null){
            queryWrapper.eq("dept_id", deptId);
        }
        if(loginIdKeyword != null){
            queryWrapper.like("login_id", loginIdKeyword);
        }
        if (roleId == null && deptId == null && loginIdKeyword == null){
            return userMapper.selectList(null);
        }
        List<Object> result = new ArrayList<>();
        for (User item: userMapper.selectList(queryWrapper)){
            result.add(userMapper.selectUserWithObjectsById(item.getId()));
        }
        return result;
    }
}
