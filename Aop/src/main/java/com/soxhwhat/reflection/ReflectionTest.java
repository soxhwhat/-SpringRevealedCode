package com.soxhwhat.reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * <p>反射测试</p>
 * <p>描述请遵循 javadoc 规范</p>
 *
 * @author Soxhwhat
 * @date 2023/1/14 22:33
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class ReflectionTest {
    /**
     * 在运行时使用反射分析对象
     * @throws Exception
     */
    @Test
    public void testReflection() throws Exception{
        Employee employee = new Employee("Soxhwhat", 5000, 1999, 4, 10);
        Class<? extends Employee> aClass = employee.getClass();

        // 查看对象域
        Field field = aClass.getDeclaredField("name");
        field.setAccessible(true);
        Object o = field.get(employee);
        System.out.println(o);

        // 调用方法
        Method m1 = aClass.getMethod("getName");
        Method m2 = aClass.getMethod("getSalary");

        String name = (String) m1.invoke(employee);
        double salary = (Double) m2.invoke(employee);

    }

    // 通过反射获取类
    @Test
    public void testClass() throws ClassNotFoundException {

        String s = "TEST";
        Class<? extends String> aClass = s.getClass();
        String name = aClass.getName();

        String className = "java.util.Random";
        Class<?> aClass1 = Class.forName(className);

    }

}
