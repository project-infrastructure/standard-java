package com.laiyefei.project.infrastructure.standard.java.central.core;

import com.laiyefei.project.infrastructure.standard.java.central.service.IService;
import com.laiyefei.project.infrastructure.standard.java.foundation.pojo.dto.IDto;
import com.laiyefei.project.infrastructure.standard.java.foundation.pojo.po.IPo;

/**
 * @Author : leaf.fly(?)
 * @Create : 2020-08-29 18:09
 * @Desc : 核心对象接口约束
 * @Version : v1.0.0.20200829
 * @Blog : http://laiyefei.com
 * @Github : http://github.com/laiyefei
 */
public interface ICore<DTO extends IDto, PO extends IPo<DTO>> extends IService<DTO, PO> {
}
