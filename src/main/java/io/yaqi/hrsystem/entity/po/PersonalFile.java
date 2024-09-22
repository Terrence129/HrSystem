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
 * 人事档案
 * </p>
 *
 * @author chenyaqi
 * @date 2024/09/22
 */
@Data
@TableName("personal_file")
public class PersonalFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
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

    /**
     * 照片（以图片地址形式储存）已废弃
     */
    private String photo;


}
