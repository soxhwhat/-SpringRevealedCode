package com.soxhwhat.springAOP;

/**
 * <p>在开始处详细描述该类的作用</p>
 * <p>描述请遵循 javadoc 规范</p>
 *
 * @author Soxhwhat
 * @date 2023/1/21 0:15
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class MockTask implements ITask {
    @Override
    public void execute() {
        System.out.println("MockTask.execute");
    }
}
