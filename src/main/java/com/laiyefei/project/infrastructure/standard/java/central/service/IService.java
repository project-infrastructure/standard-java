package com.laiyefei.project.infrastructure.standard.java.central.service;

import com.laiyefei.project.infrastructure.standard.java.central.ICentral;
import com.laiyefei.project.infrastructure.standard.java.foundation.pojo.dto.IDto;
import com.laiyefei.project.infrastructure.standard.java.foundation.pojo.po.IPo;

/**
 * @Author : leaf.fly(?)
 * @Create : 2020-08-29 18:09
 * @Desc : 核心服务对象接口约束
 * @Version : v1.0.0.20200829
 * @Blog : http://laiyefei.com
 * @Github : http://github.com/laiyefei
 */
public interface IService<DTO extends IDto, PO extends IPo<DTO>> extends ICentral {
}
