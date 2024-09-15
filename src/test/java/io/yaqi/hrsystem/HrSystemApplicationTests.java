package io.yaqi.hrsystem;

import io.yaqi.hrsystem.controller.Controller;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class HrSystemApplicationTests {

    @Autowired
    private Controller controller;

    @Test
    public void contextLoads() {
        System.out.println(controller.helloWorld());
    }

}
