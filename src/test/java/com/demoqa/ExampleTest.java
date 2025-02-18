package com.demoqa;

import org.junit.jupiter.api.*;

public class ExampleTest {
    @BeforeAll
    static void configure() {
        System.out.println("beforaall");
    }
    @AfterAll
    static void tearDown(){
        System.out.println("after all");
    }
    @BeforeEach
    void beforeTest(){
        System.out.println("befor each");
    }
    @AfterEach
    void afterTest(){
        System.out.println("After test");
    }

    @Test
    void firstTest(){
        Assertions.assertTrue(3>2);
    }

}
