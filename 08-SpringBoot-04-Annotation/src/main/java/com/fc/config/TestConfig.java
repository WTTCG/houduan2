package com.fc.config;

import com.fc.entity.Car;
import com.fc.entity.Person;
import com.fc.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

//此注解表示当前类是一个配置类
@Configuration(proxyBeanMethods = false)
public class TestConfig {
    @Bean({"car1","car2","car3"})
    public Car getCar(){
        return new Car("保时捷","粉色 ");
    }

    //参数会自动从容器中获取
    @Bean
    public Person getPerson(Car car){
        return new Person("甲赛",getCar());
    }

    //将User类的对象注入到容器中
    @Bean
    //@Scope("prototype")
    public User getUser(){
        return new User();
    }

    public TestConfig(){
        System.out.println("构造方法");
    }

    public String test(){
        System.out.println("易烊千玺");
        return "一口一个易烊千玺";
    }

    //被@PostConstruct声明的方法会在服务器加载时直接执行
    //构造方法以及@Autowired之后执行，并且会在Servlet的init方法之前举行
    //只要是JavaWeb都能够使用这个注解
    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }
}
