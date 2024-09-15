package io.yaqi.hrsystem.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyaqi
 * @Description 测试用控制器
 * @Date 2024/9/10 21:52
 * @Param
 **/

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/hello")
    public Object helloWorld() {
        return "hello world";
    }

    @GetMapping("/param1")
    public Object param1(@RequestParam String name) {
        return "param1 " + name;
    }

    @GetMapping("/list")
    public Object list() {
        log.info("list");
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("chenyaqi");
        list.add("3");
        list.add("4");
        return list;
    }
}
