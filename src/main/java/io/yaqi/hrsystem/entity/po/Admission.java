package io.yaqi.hrsystem.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * <p>
 * 录取类
 * </p>
 *
 * @author chenyaqi
 * @date 2024/09/23
 */
@Data
public class Admission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 简历id
     */
    @JsonProperty("resume_id")
    private Integer resumeId;

    /**
     * 录取状态（录取/退回）
     */
    private String state;

    /**
     * 评论；备注
     */
    private String comment;

    /**
     * 处理时间
     */
    @JsonProperty("create_date")
    private Date createDate;


}
