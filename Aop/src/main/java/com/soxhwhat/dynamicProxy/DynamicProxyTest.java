package com.soxhwhat.dynamicProxy;

import com.soxhwhat.staticProxy.IRequestable;
import com.soxhwhat.staticProxy.ISubject;
import com.soxhwhat.staticProxy.RequestableImpl;
import com.soxhwhat.staticProxy.SubjectImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * <p>动态代理测试</p>
 * <p>描述请遵循 javadoc 规范</p>
 *
 * @author Soxhwhat
 * @date 2023/1/14 21:45
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class DynamicProxyTest {
    @Test
    public void test() {
        /**
         * 动态代理可以灵活生成目标对象类型
         */
        IRequestable requestable = (IRequestable) Proxy.newProxyInstance(
                DynamicProxyTest.class.getClassLoader(),
                new Class[]{IRequestable.class},
                new RequestCtrlInvocationHandler(new RequestableImpl()));
        requestable.request();

        ISubject subject = (ISubject) Proxy.newProxyInstance(
                DynamicProxyTest.class.getClassLoader(),
                new Class[]{ISubject.class},
                new RequestCtrlInvocationHandler(new SubjectImpl()));
        subject.request();
    }
}
