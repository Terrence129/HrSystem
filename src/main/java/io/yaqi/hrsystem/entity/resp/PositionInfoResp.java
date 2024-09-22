package io.yaqi.hrsystem.entity.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.yaqi.hrsystem.entity.po.Department;
import io.yaqi.hrsystem.entity.po.Role;
import lombok.Data;

import java.util.Date;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/22 14:34
 * @Param
 **/

@Data
@JsonIgnoreProperties("handler")
public class PositionInfoResp {

    private Integer id;

    private Department dept;

    private Role role;

    /**
     * 职位类型
     */
    private String type;

    /**
     * 职位编码
     */
    private String code;

    /**
     * 发布时间
     */
    @JsonProperty("create_date")
    private Date createDate;

    /**
     * 职位描述
     */
    private String description;

    /**
     * 招聘要求
     */
    private String requirement;
}
