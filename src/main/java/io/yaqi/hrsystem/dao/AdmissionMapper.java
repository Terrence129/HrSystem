package io.yaqi.hrsystem.dao;

import io.yaqi.hrsystem.entity.po.Admission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 录取类 Mapper 接口
 * </p>
 *
 * @author chenyaqi
 * @date 2024/09/23
 */
public interface AdmissionMapper extends BaseMapper<Admission> {

    @Select("SELECT * FROM admission")
    @ResultMap("AdmissionResult")
    List<Object> getAdmissionsWithObjects();

    @Select("SELECT * FROM admission WHERE id = #{id}")
    @ResultMap("AdmissionResult")
    Object selectAdmissionWithObjectsById(Integer id);

}
