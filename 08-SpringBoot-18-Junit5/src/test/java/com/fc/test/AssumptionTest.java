package com.fc.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("假设")
public class AssumptionTest {
    public String environment = "test";

    @Test
    @DisplayName("测试简单的假设")
    void testSimpleAssume() {
        Assumptions.assumeFalse(environment.equals("test"));

        System.out.println("你真好看");
    }

    @Test
    @DisplayName("假设测试之后")
    void testAssumeThen() {
        Assumptions.assumingThat(environment.equals("test"),
                () -> {
                    System.out.println("当前环境并不是test，而是div");
                });
    }
}
