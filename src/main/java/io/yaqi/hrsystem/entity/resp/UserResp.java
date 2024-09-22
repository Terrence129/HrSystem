package io.yaqi.hrsystem.entity.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.yaqi.hrsystem.entity.po.Department;
import io.yaqi.hrsystem.entity.po.Role;
import lombok.Data;

import java.io.Serializable;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/20 15:17
 * @Param
 **/

@Data
@JsonIgnoreProperties("handler")
public class UserResp implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String loginId;

    private String loginPwd;

    private String email;

    private String state;

    private Role role;

    private Department dept;
}
