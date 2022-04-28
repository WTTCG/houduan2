package com.fc.test;

import com.fc.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = applicationContext.getBean("student", Student.class);

        System.out.println(student);

        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
