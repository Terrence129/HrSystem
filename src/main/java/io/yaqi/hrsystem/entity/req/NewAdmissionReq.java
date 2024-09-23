package io.yaqi.hrsystem.entity.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/23 14:58
 * @Param
 **/

@Data
public class NewAdmissionReq {

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

}
