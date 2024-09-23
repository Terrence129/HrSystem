package io.yaqi.hrsystem.controller;

import io.yaqi.hrsystem.entity.po.Admission;
import io.yaqi.hrsystem.entity.req.NewAdmissionReq;
import io.yaqi.hrsystem.service.face.AdmissionServiceFace;
import io.yaqi.hrsystem.utils.ResponseResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admission")
@CrossOrigin
@RequiredArgsConstructor
public class AdmissionController {

    private final AdmissionServiceFace admissionServiceFace;

    @PostMapping("/add")
    public ResponseResult<Object> addAdmission(@RequestBody NewAdmissionReq req) {
        Object result = admissionServiceFace.addAdmission(req);
        return ResponseResult.success(result);
    }

    @DeleteMapping("/deleteAdmissionById")
    public ResponseResult<Object> deleteAdmissionById(@RequestParam Integer id) {
        Object result = admissionServiceFace.deleteAdmissionById(id);
        return ResponseResult.success(result);
    }

    @PutMapping("/updateAdmissionById")
    public ResponseResult<Object> updateAdmissionById(@RequestBody Admission admission) {
        Object result = admissionServiceFace.updateAdmissionById(admission);
        return ResponseResult.success(result);
    }

    @GetMapping("/getAll")
    public ResponseResult<Object> getAdmissions() {
        Object result = admissionServiceFace.getAdmissions();
        return ResponseResult.success(result);
    }

    @GetMapping("/getAdmissionsWithObjects")
    public ResponseResult<Object> getAdmissionsWithObjects() {
        Object result = admissionServiceFace.getAdmissionsWithObjects();
        return ResponseResult.success(result);
    }

    @GetMapping("/selectAdmissionWithObjectsById")
    public ResponseResult<Object> selectAdmissionWithObjectsById(@RequestParam Integer id) {
        Object result = admissionServiceFace.selectAdmissionWithObjectsById(id);
        return ResponseResult.success(result);
    }
}