package io.yaqi.hrsystem.entity.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.yaqi.hrsystem.entity.po.PositionInfo;
import io.yaqi.hrsystem.entity.po.Resume;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/23 08:42
 * @Param
 **/

@Data
@JsonIgnoreProperties("handler")
public class ResumeResp {

    private Integer id;

    /**
     * 意向岗位id
     */
    @JsonProperty("intended_position")
    private PositionInfoResp intendedPosition;

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
    private LocalDateTime createDate;

    /**
     * 额外信息
     */
    @JsonProperty("extra_info")
    private String extraInfo;
}
