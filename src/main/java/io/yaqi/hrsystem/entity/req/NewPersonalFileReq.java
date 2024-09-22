package io.yaqi.hrsystem.entity.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author chenyaqi
 * @Description 人事档案请求类
 * @Date 2024/9/21 22:31
 **/

@Data
public class NewPersonalFileReq {

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

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
     * 员工状态
     */
    @JsonProperty("staff_state")
    private String staffState;

    /**
     * 额外信息
     */
    @JsonProperty("extra_info")
    private String extraInfo;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * 住址
     */
    private String address;

    /**
     * 户口所在地
     */
    private String domicile;

    /**
     * 身份证号码
     */
    @JsonProperty("id_number")
    private String idNumber;

    /**
     * 毕业院校
     */
    @JsonProperty("graduate_from")
    private String graduateFrom;

    /**
     * 专业
     */
    private String major;

}