package io.yaqi.hrsystem.entity.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.yaqi.hrsystem.entity.po.Department;
import io.yaqi.hrsystem.entity.po.Role;
import lombok.Data;

import java.util.Date;

/**
 * @author chenyaqi
 * @Description 个人档案返回体
 * @Date 2024/9/21 21:23
 **/
@Data
@JsonIgnoreProperties("handler")
public class PersonalFileResp {

    private Integer id;

    /**
     * 档案编码
     */
    private String code;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 部门信息
     */
    private Department dept;

    /**
     * 角色信息
     */
    private Role role;

    /**
     * 建档日期
     */
    @JsonProperty("create_date")
    private Date createDate;

    /**
     * 审核状态
     */
    @JsonProperty("audit_state")
    private String auditState;

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