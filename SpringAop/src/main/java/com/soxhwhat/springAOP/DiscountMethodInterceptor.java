package com.soxhwhat.springAOP;


import lombok.Data;
import net.sf.cglib.proxy.MethodProxy;
import org.aopalliance.intercept.Interceptor;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * <p>商场打折</p>
 * <p>描述请遵循 javadoc 规范</p>
 *
 * @author Soxhwhat
 * @date 2023/1/17 20:04
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
@Data
public class DiscountMethodInterceptor implements MethodInterceptor {

    // 打折比例
    public static final Integer DEAFULT_DISCOUNT_RATIO = 80;

    private Integer discountRatio = DEAFULT_DISCOUNT_RATIO;
    private boolean campaignAvailable;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object returnValue = invocation.proceed();
        if (campaignAvailable) {
            returnValue = (Double) returnValue * discountRatio / 100;
        }
        return returnValue;
    }
}
