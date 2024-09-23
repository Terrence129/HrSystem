package io.yaqi.hrsystem.entity.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/22 19:42
 * @Param
 **/

@Data
public class NewResumeReq {

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
     * 额外信息
     */
    @JsonProperty("extra_info")
    private String extraInfo;
}
