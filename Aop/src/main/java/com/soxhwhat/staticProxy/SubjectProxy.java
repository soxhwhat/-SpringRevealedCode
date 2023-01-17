package com.soxhwhat.staticProxy;

/**
 * <p>在开始处详细描述该类的作用</p>
 * <p>描述请遵循 javadoc 规范</p>
 *
 * @author Soxhwhat
 * @date 2023/1/14 19:23
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class SubjectProxy implements ISubject {

    // 注入SubjectImpl对象，用于调用request()方法
    private ISubject subject;

    public SubjectProxy(ISubject subject) {
        this.subject = subject;
    }

    public void request() {
        // 在调用request()方法之前，执行一些功能处理
        System.out.println("before");
        subject.request();
        // 在调用request()方法之后，执行一些功能处理
        System.out.println("after");
    }
}

