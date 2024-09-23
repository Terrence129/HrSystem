package io.yaqi.hrsystem.entity.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.yaqi.hrsystem.entity.po.Resume;
import lombok.Data;

import java.util.Date;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/23 15:00
 * @Param
 **/

@Data
@JsonIgnoreProperties("handler")
public class AdmissionResp {

    private Integer id;

    /**
     * 简历类
     */

    private ResumeResp resume;

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
