package com.soxhwhat.springAOP;

import lombok.Data;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * <p>AfterReturningAdvice</p>
 * <p>为了便于运营人员验证系统状态，批处理程序在正常完成之后回往数据库的指定表中插入运行状态信息。我们可以通过验证这些状态判断批处理任务是否成功执行。</p>
 *
 * @author Soxhwhat
 * @date 2023/1/17 18:46
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
@Data
public class TaskExecutionAfterReturningAdvice implements AfterReturningAdvice {
    private JdbcTemplate jdbcTemplate;

    public TaskExecutionAfterReturningAdvice(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        jdbcTemplate.update("insert into batch_status values(?)", new Object[]{new Date()});
    }


}

