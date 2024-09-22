package io.yaqi.hrsystem.dao;

import io.yaqi.hrsystem.entity.po.PersonalFile;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 人事档案 Mapper 接口
 * </p>
 *
 * @author chenyaqi
 * @date 2024/09/21
 */
public interface PersonalFileMapper extends BaseMapper<PersonalFile> {

    @Select("SELECT * FROM personal_file")
    @ResultMap("FileResult")
    List<Object> getFilesWithObjects();

    @Select("SELECT * FROM personal_file WHERE id = #{id}")
    @ResultMap("FileResult")
    Object selectFileWithObjectsById(Integer id);

}
