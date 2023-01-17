package com.soxhwhat.springAOP;



import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;

/**
 * <p>Around Service实现</p>
 * <p>简单的检测系统某些方法的执行性能</p>
 *
 * @author Soxhwhat
 * @date 2023/1/17 19:06
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
@Slf4j
public class PerformanceMethodinterceptor implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        StopWatch watch = new StopWatch();
        try {
            watch.start();
            return invocation.proceed();
        }
        finally {
            watch.stop();
            if (log.isInfoEnabled()) {
                Method method = invocation.getMethod();
                log.info("执行方法[" + method.getName() + "]耗时[" + watch.getTotalTimeMillis() + "]ms");
            }
        }
    }
}
