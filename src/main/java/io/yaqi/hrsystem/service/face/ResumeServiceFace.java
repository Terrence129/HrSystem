package io.yaqi.hrsystem.service.face;

import io.yaqi.hrsystem.dao.ResumeMapper;
import io.yaqi.hrsystem.entity.po.Resume;
import io.yaqi.hrsystem.entity.req.NewResumeReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author chenyaqi
 * @Description 简历业务类
 * @Date 2024/9/22 19:39
 * @Param
 **/

@Component
@RequiredArgsConstructor
public class ResumeServiceFace {

    private final ResumeMapper resumeMapper;

    public Object addResume(NewResumeReq req) {
        Resume resume = new Resume();
        resume.setIntendedPositionId(req.getIntendedPositionId());
        resume.setName(req.getName());
        resume.setGender(req.getGender());
        resume.setPhoneNumber(req.getPhoneNumber());
        resume.setEmail(req.getEmail());
        resume.setAddress(req.getAddress());
        resume.setGraduatedFrom(req.getGraduatedFrom());
        resume.setMajor(req.getMajor());
        resume.setCreateDate(new Date());
        resume.setExtraInfo(req.getExtraInfo());
        // 入库
        resumeMapper.insert(resume);
        return resume;
    }

    public Object getResumes(){
        return resumeMapper.selectList(null);
    }

    public Object deleteResume(Integer id) {
        resumeMapper.deleteById(id);
        return id + " has been deleted";
    }

    public Object updateResume(Resume resume) {
        resumeMapper.updateById(resume);
        return resumeMapper.selectById(resume.getId());
    }

    // 多表查询
    public List<Object> getResumesWithObjects(){
        return resumeMapper.getResumesWithObjects();
    }

    public Object selectResumeWithObjectsById(Integer id) {
        return resumeMapper.selectResumeWithObjectsById(id);
    }
}
