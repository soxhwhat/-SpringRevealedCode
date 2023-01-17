package com.soxhwhat.cglib;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * <p>在开始处详细描述该类的作用</p>
 * <p>描述请遵循 javadoc 规范</p>
 *
 * @author Soxhwhat
 * @date 2023/1/17 11:48
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class CglibTest {
    @Test
    public void testCglib() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Requestable.class);
        enhancer.setCallback(new RequestCtrlCallback());

        Requestable proxy = (Requestable) enhancer.create();
        proxy.request();

    }
}
