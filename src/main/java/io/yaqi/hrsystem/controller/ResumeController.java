package io.yaqi.hrsystem.controller;

import io.yaqi.hrsystem.entity.po.Resume;
import io.yaqi.hrsystem.entity.req.NewResumeReq;
import io.yaqi.hrsystem.service.face.ResumeServiceFace;
import io.yaqi.hrsystem.utils.ResponseResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/22 19:46
 * @Param
 **/

@RestController
@RequestMapping("/resume")
@CrossOrigin
@RequiredArgsConstructor
public class ResumeController {

    private final ResumeServiceFace resumeServiceFace;

    @PostMapping("/addResume")
    public Object addResume(@RequestBody NewResumeReq req){
        return ResponseResult.success(resumeServiceFace.addResume(req));
    }

    @GetMapping("/getResumes")
    public Object getResumes(){
        return ResponseResult.success(resumeServiceFace.getResumes());
    }

    @DeleteMapping("/deleteResumeById")
    public Object deleteResumeById(@RequestParam Integer id) {
        return ResponseResult.success(resumeServiceFace.deleteResume(id));
    }

    @PutMapping("/updateResumeById")
    public Object updateResumeById(@RequestBody Resume resume) {
        return ResponseResult.success(resumeServiceFace.updateResume(resume));
    }

    // 多表查询，获取所有简历及其关联的对象
    @GetMapping("/getResumesWithObjects")
    public Object getResumesWithObjects() {
        return ResponseResult.success(resumeServiceFace.getResumesWithObjects());
    }

    // 根据ID获取简历及其关联的对象
    @GetMapping("/selectResumeWithObjectsById")
    public Object selectResumeWithObjectsById(@RequestParam Integer id) {
        return ResponseResult.success(resumeServiceFace.selectResumeWithObjectsById(id));
    }
}

