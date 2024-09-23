package io.yaqi.hrsystem.service.impl;

import io.yaqi.hrsystem.entity.po.Admission;
import io.yaqi.hrsystem.dao.AdmissionMapper;
import io.yaqi.hrsystem.service.AdmissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 录取类 服务实现类
 * </p>
 *
 * @author chenyaqi
 * @since 2024/09/23
 */
@Service
public class AdmissionServiceImpl extends ServiceImpl<AdmissionMapper, Admission> implements AdmissionService {

}
