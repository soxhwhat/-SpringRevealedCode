package com.soxhwhat.staticProxy;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>在开始处详细描述该类的作用</p>
 * <p>描述请遵循 javadoc 规范</p>
 *
 * @author Soxhwhat
 * @date 2023/1/14 18:16
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */

@Data
public class RequestableProxy implements IRequestable {

    // 注入SubjectImpl对象，用于调用request()方法
    private IRequestable requestable;

    public RequestableProxy(IRequestable requestable) {
        this.requestable = requestable;
    }

    public void request() {
        // 在调用request()方法之前，执行一些功能处理
        System.out.println("before");
        requestable.request();
        // 在调用request()方法之后，执行一些功能处理
        System.out.println("after");
    }
}

