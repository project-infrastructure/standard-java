package com.laiyefei.project.infrastructure.standard.java.foundation.pojo.eo;

import com.laiyefei.project.infrastructure.standard.java.foundation.pojo.IPojo;

/**
 * @Author : leaf.fly(?)
 * @Create : 2020-08-29 18:09
 * @Desc : 异常对象接口约束
 * @Version : v1.0.0.20200829
 * @Blog : http://laiyefei.com
 * @Github : http://github.com/laiyefei
 */
public interface IEo extends IPojo {

    /**
     * 是否是异常对象
     *
     * @return
     */
    default boolean isEo() {
        return this instanceof Exception;
    }

    /**
     * 是否运行时异常
     *
     * @return
     */
    default boolean isRuntime() {
        return this instanceof RuntimeException;
    }

    /**
     * 获取异常编码
     *
     * @return
     */
    String getCode();

    /**
     * 获取异常描述
     *
     * @return
     */
    String getDescription();
}
