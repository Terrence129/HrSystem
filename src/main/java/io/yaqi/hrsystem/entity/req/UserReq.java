package io.yaqi.hrsystem.entity.req;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class UserReq implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String loginId;

    private String loginPwd;

    private String email;

    private String state;

    private String code;

    private Integer roleId;

    private Integer deptId;
}
