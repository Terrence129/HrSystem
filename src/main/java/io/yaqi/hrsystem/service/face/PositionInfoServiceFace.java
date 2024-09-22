package io.yaqi.hrsystem.service.face;

import io.yaqi.hrsystem.dao.PositionInfoMapper;
import io.yaqi.hrsystem.entity.po.PositionInfo;
import io.yaqi.hrsystem.entity.req.NewPositionReq;
import io.yaqi.hrsystem.entity.resp.PositionInfoResp;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/22 14:32
 * @Param
 **/

@Component
@RequiredArgsConstructor
public class PositionInfoServiceFace {

    private final PositionInfoMapper positionInfoMapper;

    public Object addPosition(NewPositionReq req){
        PositionInfo positionInfo = new PositionInfo();
        positionInfo.setDeptId(req.getDeptId());
        positionInfo.setRoleId(req.getRoleId());
        positionInfo.setType(req.getType());
        positionInfo.setCode(req.getCode());
        positionInfo.setDescription(req.getDescription());
        positionInfo.setRequirement(req.getRequirement());
        positionInfo.setCreateDate(new Date());

        positionInfoMapper.insert(positionInfo);
        return positionInfo;
    }

    public Object deletePosition(Integer id){
        positionInfoMapper.deleteById(id);
        return id + " has been deleted";
    }

    public Object updatePositionById(PositionInfo positionInfo){
        positionInfoMapper.updateById(positionInfo);
        return positionInfoMapper.selectById(positionInfo.getId());
    }

    public Object getPositions(){
        return positionInfoMapper.selectList(null);
    }

    // 多表查询
    public Object getPositionsWithObjects(){
        return positionInfoMapper.getPositionsWithObjects();
    }

    public Object selectPositionWithObjectsById(Integer id){
        return positionInfoMapper.selectPositionWithObjectsById(id);
    }
}
