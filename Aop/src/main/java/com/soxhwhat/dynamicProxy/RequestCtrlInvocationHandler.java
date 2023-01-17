package com.soxhwhat.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>动态代理InvocationHandler实现横切逻辑</p>
 * <p>描述请遵循 javadoc 规范</p>
 *
 * @author Soxhwhat
 * @date 2023/1/14 19:25
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class RequestCtrlInvocationHandler implements InvocationHandler {

    private Object target;

    public RequestCtrlInvocationHandler(Object target) {
        this.target = target;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        // target是被代理的对象，method是被代理的方法，args是被代理方法的参数
        Object result = method.invoke(target, args);
        System.out.println("after");
        return result;
    }
}

