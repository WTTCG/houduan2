package com.fc.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test")
@ConfigurationProperties("student")
@Data
@Component
public class Grandpa implements Student{
    private String name;
    private Integer age;
}
