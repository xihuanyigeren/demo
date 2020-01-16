package com.rudy.demo.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *
 * @author PC-LUXIN
 * @date 2020/1/16 13:46
 * @see
 * @since 1.0
 */
@Slf4j
@RestController
//@RequestMapping("/test")
public class DemoApi {

    @GetMapping("/test")
    public String test() {
        log.info("进入测试方法");
        return "hello world";
    }
    @GetMapping("/")
    public String index() {
        log.info("index..........");
        return "欢迎进入主页";
    }
}
