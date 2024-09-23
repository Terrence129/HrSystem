package io.yaqi.hrsystem.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.yaqi.hrsystem.entity.po.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.yaqi.hrsystem.entity.resp.UserResp;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chenyaqi
 * @date 2024/09/13
 */
public interface UserMapper extends BaseMapper<User> {

    // 利用多表查询技术实现自定义结果查询
    @Select("SELECT * FROM user")
    @ResultMap("UserResult")
    List<UserResp> getUsersWithObjects();

    @Select("SELECT * FROM user WHERE id = #{id}")
    @ResultMap("UserResult")
    UserResp selectUserWithObjectsById(Integer id);

}
