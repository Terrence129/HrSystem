package io.yaqi.hrsystem.entity.req;

import lombok.Data;

/**
 * @author chenyaqi
 * @Description 用户登录请求体
 * @Date 2024/9/16 11:42
 * @Param
 **/

@Data
public class UserLoginReq {

    private String loginId;
    private String loginPwd;
}
