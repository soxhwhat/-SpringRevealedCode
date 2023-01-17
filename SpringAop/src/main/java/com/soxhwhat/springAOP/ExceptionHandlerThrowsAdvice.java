package com.soxhwhat.springAOP;

import lombok.Data;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import java.lang.reflect.Method;

/**
 * <p>ThrowsAdvice</p>
 * <p>ThrowsAdvice可以用于监控系统中的运行时异常，一旦捕捉到异常，需要以某种方式系统监控人员</p>
 *
 * @author Soxhwhat
 * @date 2023/1/17 17:39
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
@Data
public class ExceptionHandlerThrowsAdvice implements ThrowsAdvice {
    private JavaMailSender mailSender;

    private String[] recipients;

    public void afterThrowing(Method m, Object[] args, Object target, RuntimeException ex) {
        final String exceptionMessage = ex.getMessage();
        getMailSender().send(message -> {
            new MimeMessageHelper(message, true).setTo(recipients);
//            message.setSubject("系统异常");
        });
    }

}

