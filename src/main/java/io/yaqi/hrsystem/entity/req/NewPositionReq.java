package io.yaqi.hrsystem.entity.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/22 15:15
 * @Param
 **/

@Data
public class NewPositionReq {

    @JsonProperty("dept_id")
    private Integer deptId;

    /**
     * 角色id
     */
    @JsonProperty("role_id")
    private Integer roleId;

    /**
     * 职位类型
     */
    private String type;

    /**
     * 职位编码
     */
    private String code;

    /**
     * 职位描述
     */
    private String description;

    /**
     * 招聘要求
     */
    private String requirement;
}
