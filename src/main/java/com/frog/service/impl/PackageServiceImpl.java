package com.frog.service.impl;

import com.frog.entity.Package;
import com.frog.mapper.PackageMapper;
import com.frog.service.IPackageService;
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
public class PackageServiceImpl extends ServiceImpl<PackageMapper, Package> implements IPackageService {

}
