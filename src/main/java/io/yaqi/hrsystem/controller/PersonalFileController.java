package io.yaqi.hrsystem.controller;

import io.yaqi.hrsystem.entity.po.PersonalFile;
import io.yaqi.hrsystem.entity.req.NewPersonalFileReq;
import io.yaqi.hrsystem.service.face.PersonalFileServiceFace;
import io.yaqi.hrsystem.utils.ResponseResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenyaqi
 * @Description 个人档案控制器类
 * @Date 2024/9/21 21:46
 * @Param
 **/

@Slf4j
@RestController
@RequestMapping("/personalFile")
@RequiredArgsConstructor
@CrossOrigin
public class PersonalFileController {

    private final PersonalFileServiceFace personalFileServiceFace;

    @PostMapping("/addFile")
    public Object addFile(@RequestBody NewPersonalFileReq req) {
        return ResponseResult.success(personalFileServiceFace.addFile(req));
    }

    @DeleteMapping("/deleteFileById")
    public Object deleteFileById(@RequestParam Integer id) {
        return ResponseResult.success(personalFileServiceFace.deleteFileById(id));
    }

    @PutMapping("/updateFileById")
    public Object updateFileById(@RequestBody PersonalFile file) {
        log.info(file.toString());
        return ResponseResult.success(personalFileServiceFace.updateFileById(file));
    }

    @GetMapping("/getFiles")
    public Object getFiles() {
        return ResponseResult.success(personalFileServiceFace.getFiles());
    }

    // 多表查询
    @GetMapping("/getFilesWithObjects")
    public Object getFilesWithObjects() {
        return ResponseResult.success(personalFileServiceFace.getFilesWithObjects());
    }

    @GetMapping("/selectFileWithObjectsById")
    public Object selectFileWithObjectsById(@RequestParam Integer id) {
        return ResponseResult.success(personalFileServiceFace.selectFileWithObjectsById(id));
    }

    // 多条件模糊查询
    @GetMapping("/searchFilesByParams")
    public Object searchFilesByParams(
            @RequestParam(required = false) Integer roleId,
            @RequestParam(required = false) Integer deptId,
            @RequestParam(required = false) String name) {
        log.info(roleId + "==" + deptId + "==" + name);
        if (roleId == null && deptId == null && name == null) {
            return ResponseResult.success(personalFileServiceFace.getFilesWithObjects());
        }
        Object result =  ResponseResult.success(personalFileServiceFace.searchFilesByParams(roleId, deptId, name));
        log.info(result.toString());

        return result;
    }
}
