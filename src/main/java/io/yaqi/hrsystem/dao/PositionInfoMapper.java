package io.yaqi.hrsystem.dao;

import io.yaqi.hrsystem.entity.po.PositionInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 职位信息 Mapper 接口
 * </p>
 *
 * @author chenyaqi
 * @date 2024/09/22
 */
public interface PositionInfoMapper extends BaseMapper<PositionInfo> {

    @Select("SELECT * FROM position_info")
    @ResultMap("PositionResult")
    List<Object> getPositionsWithObjects();

    @Select("SELECT * FROM position_info WHERE id = #{id}")
    @ResultMap("PositionResult")
    Object selectPositionWithObjectsById(Integer id);

}
