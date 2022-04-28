package com.fc.test;

import com.fc.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanNameTest {
    @Test
    public void testId(){
        //获取容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = applicationContext.getBean(Student.class);

        System.out.println(student);
    }
}
