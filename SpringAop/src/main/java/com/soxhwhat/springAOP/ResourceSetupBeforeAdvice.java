package com.soxhwhat.springAOP;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.core.io.Resource;

import java.lang.reflect.Method;

/**
 * <p>Before Advice</p>
 * <p>系统需要在文件系统的指定位置生成一些数据文件，创建之前需要检查这些位置是否存在，不存在则需要创建。</p>
 *
 * <p>为系统相应目标类提供一个Before Advice,对文件系统的指定路径进行统一的检查或者初始化。</p>
 *
 * @author Soxhwhat
 * @date 2023/1/17 17:30
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class ResourceSetupBeforeAdvice implements MethodBeforeAdvice {
    private Resource resource;

    public ResourceSetupBeforeAdvice(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        if (!resource.exists()) {
            resource.getFile().mkdirs();
        }
    }
}
