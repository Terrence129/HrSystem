package io.yaqi.hrsystem.dao;

import io.yaqi.hrsystem.entity.po.Resume;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 简历 Mapper 接口
 * </p>
 *
 * @author chenyaqi
 * @date 2024/09/22
 */
public interface ResumeMapper extends BaseMapper<Resume> {

    @Select("SELECT * FROM resume")
    @ResultMap("ResumeResult")
    List<Object> getResumesWithObjects();

    @Select("SELECT * FROM resume WHERE id = #{id}")
    @ResultMap("ResumeResult")
    Object selectResumeWithObjectsById(Integer id);

}
