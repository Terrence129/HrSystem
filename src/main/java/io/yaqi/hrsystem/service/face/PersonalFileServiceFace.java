package io.yaqi.hrsystem.service.face;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.yaqi.hrsystem.dao.PersonalFileMapper;
import io.yaqi.hrsystem.entity.po.PersonalFile;
import io.yaqi.hrsystem.entity.req.NewPersonalFileReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author chenyaqi
 * @Description 个人档案业务类
 * @Date 2024/9/21 21:19
 * @Param
 **/

@Component
@RequiredArgsConstructor
public class PersonalFileServiceFace {

    private final PersonalFileMapper personalFileMapper;

    public Object getFiles(){
        return personalFileMapper.selectList(null);
    }

    public Object addFile(NewPersonalFileReq req){
        PersonalFile personalFile = new PersonalFile();

        personalFile.setCode("0001");
        personalFile.setName(req.getName());
        personalFile.setGender(req.getGender());
        personalFile.setDeptId(req.getDeptId());
        personalFile.setRoleId(req.getRoleId());
        personalFile.setAuditState("待审核");
        personalFile.setStaffState(req.getStaffState());
        personalFile.setCreateDate(new Date());
        personalFile.setExtraInfo(req.getExtraInfo());
        personalFile.setEmail(req.getEmail());
        personalFile.setPhoneNumber(req.getPhoneNumber());
        personalFile.setAddress(req.getAddress());
        personalFile.setDomicile(req.getDomicile());
        personalFile.setIdNumber(req.getIdNumber());
        personalFile.setGraduateFrom(req.getGraduateFrom());
        personalFile.setMajor(req.getMajor());

        personalFileMapper.insert(personalFile);
        return personalFile;
    }

    public Object updateFileById(PersonalFile personalFile){
        personalFileMapper.updateById(personalFile);
        return personalFileMapper.selectById(personalFile.getId());
    }

    public Object deleteFileById(Integer id){
        personalFileMapper.deleteById(id);
        return id + " has been deleted";
    }

    // 多表查询
    public Object getFilesWithObjects(){
        return personalFileMapper.getFilesWithObjects();
    }

    public Object selectFileWithObjectsById(Integer id){
        return personalFileMapper.selectFileWithObjectsById(id);
    }

    // 多条件模糊查询
    public Object searchFilesByParams(Integer roleId, Integer deptId, String name) {
        QueryWrapper<PersonalFile> queryWrapper = new QueryWrapper<>();
        if(roleId != null){
            queryWrapper.eq("role_id", roleId);
        }
        if(deptId != null){
            queryWrapper.eq("dept_id", deptId);
        }
        if(name != null){
            queryWrapper.like("name", name);
        }
        if (roleId == null && deptId == null && name == null){
            return personalFileMapper.selectList(null);
        }
        List<Object> result = new ArrayList<>();
        for (PersonalFile item: personalFileMapper.selectList(queryWrapper)){
            result.add(personalFileMapper.selectFileWithObjectsById(item.getId()));
        }
        return result;
    }
}
