package io.yaqi.hrsystem.controller;

import io.yaqi.hrsystem.entity.po.PositionInfo;
import io.yaqi.hrsystem.entity.req.NewPositionReq;
import io.yaqi.hrsystem.service.face.PositionInfoServiceFace;
import io.yaqi.hrsystem.utils.ResponseResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/22 15:04
 * @Param
 **/

@Slf4j
@RestController
@RequestMapping("/position")
@CrossOrigin
@RequiredArgsConstructor
public class PositionInfoController {

    private final PositionInfoServiceFace positionInfoServiceFace;

    @PostMapping("/addPosition")
    public Object addPosition(@RequestBody NewPositionReq req) {
        return ResponseResult.success(positionInfoServiceFace.addPosition(req));
    }

    @DeleteMapping("/deletePositionById")
    public Object deletePositionById(@RequestParam Integer id) {
        return ResponseResult.success(positionInfoServiceFace.deletePosition(id));
    }

    @PutMapping("/updatePositionById")
    public Object updatePositionById(@RequestBody PositionInfo positionInfo) {
        log.info(positionInfo.toString());
        return ResponseResult.success(positionInfoServiceFace.updatePositionById(positionInfo));
    }

    @GetMapping("/getPositions")
    public Object getPositions() {
        return ResponseResult.success(positionInfoServiceFace.getPositions());
    }

    //多表查询
    @GetMapping("/getPositionsWithObjects")
    public Object getPositionsWithObjects() {
        return ResponseResult.success(positionInfoServiceFace.getPositionsWithObjects());
    }

    @GetMapping("/selectPositionWithObjectsById")
    public Object selectPositionWithObjectsById(@RequestParam Integer id) {
        return ResponseResult.success(positionInfoServiceFace.selectPositionWithObjectsById(id));
    }
}
