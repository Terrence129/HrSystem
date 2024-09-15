package io.yaqi.hrsystem.service.face;

import io.yaqi.hrsystem.dao.entity.User;
import io.yaqi.hrsystem.dao.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

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
}
