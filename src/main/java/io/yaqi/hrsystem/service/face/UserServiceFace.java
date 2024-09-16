package io.yaqi.hrsystem.service.face;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.yaqi.hrsystem.dao.entity.User;
import io.yaqi.hrsystem.dao.mapper.UserMapper;
import io.yaqi.hrsystem.entity.req.UserLoginReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.security.auth.login.LoginException;
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

    public Object addUser(User user) {
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
}
