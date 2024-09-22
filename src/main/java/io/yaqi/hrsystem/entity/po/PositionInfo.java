package io.yaqi.hrsystem.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * <p>
 * 职位信息
 * </p>
 *
 * @author chenyaqi
 * @date 2024/09/22
 */

@Data
@TableName("position_info")
public class PositionInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 部门id
     */
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
