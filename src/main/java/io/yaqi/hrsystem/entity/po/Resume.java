package io.yaqi.hrsystem.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * <p>
 * 简历
 * </p>
 *
 * @author chenyaqi
 * @date 2024/09/22
 */
@Data
public class Resume implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 意向岗位id
     */
    @JsonProperty("intended_position_id")
    private Integer intendedPositionId;

    /**
     * 姓名
     */
    @JsonProperty("name")
    private String name;

    /**
     * 性别
     */
    @JsonProperty("gender")
    private String gender;

    /**
     * 电话
     */
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * 电子邮箱
     */
    @JsonProperty("email")
    private String email;

    /**
     * 住址
     */
    @JsonProperty("address")
    private String address;

    /**
     * 毕业院校
     */
    @JsonProperty("graduated_from")
    private String graduatedFrom;

    /**
     * 专业
     */
    @JsonProperty("major")
    private String major;

    /**
     * 投递时间
     */
    @JsonProperty("create_date")
    private Date createDate;

    /**
     * 额外信息
     */
    @JsonProperty("extra_info")
    private String extraInfo;

}