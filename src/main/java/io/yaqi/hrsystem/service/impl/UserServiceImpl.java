package io.yaqi.hrsystem.service.impl;

import io.yaqi.hrsystem.entity.po.User;
import io.yaqi.hrsystem.dao.UserMapper;
import io.yaqi.hrsystem.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenyaqi
 * @since 2024/09/13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
