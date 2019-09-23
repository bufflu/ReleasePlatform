package com.frog.service.impl;

import com.frog.entity.Model;
import com.frog.mapper.ModelMapper;
import com.frog.service.IModelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bufflu
 * @since 2019-09-23
 */
@Service
public class ModelServiceImpl extends ServiceImpl<ModelMapper, Model> implements IModelService {

}
