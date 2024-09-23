package io.yaqi.hrsystem.service.face;

import io.yaqi.hrsystem.dao.AdmissionMapper;
import io.yaqi.hrsystem.entity.po.Admission;
import io.yaqi.hrsystem.entity.req.NewAdmissionReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/23 15:03
 * @Param
 **/

@Component
@RequiredArgsConstructor
public class AdmissionServiceFace {

    private final AdmissionMapper admissionMapper;

    public Object addAdmission(NewAdmissionReq req) {
        Admission admission = new Admission();
        admission.setResumeId(req.getResumeId());
        admission.setState(req.getState());
        admission.setComment(req.getComment());
        admission.setCreateDate(new Date());
        
        admissionMapper.insert(admission);
        return admission;
    }

    public Object deleteAdmissionById(Integer id) {
        admissionMapper.deleteById(id);
        return id + " has been deleted";
    }

    public Object updateAdmissionById(Admission admission) {
        admissionMapper.updateById(admission);
        return admissionMapper.selectById(admission.getId());
    }

    public Object getAdmissions(){
        return admissionMapper.selectList(null);
    }

    // 多表查询
    public Object getAdmissionsWithObjects(){
        return admissionMapper.getAdmissionsWithObjects();
    }

    public Object selectAdmissionWithObjectsById(Integer id) {
        return admissionMapper.selectAdmissionWithObjectsById(id);
    }
}
