package com.soxhwhat.springAOP;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

/**
 * <p>基于接口的代理</p>
 * <p>描述请遵循 javadoc 规范</p>
 *
 * @author Soxhwhat
 * @date 2023/1/21 0:18
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class InterfaceProxyFactoryTest {
    @Test
    public void testInterfaceProxyFactory() {
        MockTask task = new MockTask();
        ProxyFactory weaver = new ProxyFactory(task);
        weaver.setInterfaces(new Class[]{ITask.class});
        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
        advisor.setMappedName("execute");
        advisor.setAdvice(new PerformanceMethodinterceptor());
        weaver.addAdvisor(advisor);
        ITask proxy = (ITask) weaver.getProxy();
        proxy.execute();
    }
}
